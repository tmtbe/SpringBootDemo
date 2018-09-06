package com.example.consul.aop;

import com.example.consul.aop.annotation.TestAnnotation;
import com.example.consul.utils.PlaceholderUtils;
import org.apache.ibatis.javassist.*;
import org.apache.ibatis.javassist.bytecode.CodeAttribute;
import org.apache.ibatis.javassist.bytecode.LocalVariableAttribute;
import org.apache.ibatis.javassist.bytecode.MethodInfo;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Aspect
@Component
public class TestAspect {
    @Pointcut("@annotation(com.example.consul.aop.annotation.TestAnnotation)")
    public void test(){}

    @Around(value = "test()&&@annotation(annotation)")
    public Object arround(ProceedingJoinPoint proceedingJoinPoint,TestAnnotation annotation) throws ClassNotFoundException, NotFoundException {
        System.out.println("方法环绕start.....");
        String classType = proceedingJoinPoint.getTarget().getClass().getName();
        Class<?> clazz = Class.forName(classType);
        String clazzName = clazz.getName();
        String methodName = proceedingJoinPoint.getSignature().getName(); //获取方法名称
        Object[] args = proceedingJoinPoint.getArgs();//参数
        Map nameAndArgs = getFieldsName(this.getClass(), clazzName, methodName, args);//获取被切参数名称及参数值
        System.out.println(PlaceholderUtils.resolvePlaceholders(annotation.key(),nameAndArgs));
        try {
            Object o =  proceedingJoinPoint.proceed();
            System.out.println("方法环绕proceed，结果是 :" + o);
            return o;
        } catch (Throwable e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 通过反射机制 获取被切参数名以及参数值
     *
     * @param cls
     * @param clazzName
     * @param methodName
     * @param args
     * @return
     * @throws NotFoundException
     */
    private Map getFieldsName(Class cls, String clazzName, String methodName, Object[] args) throws NotFoundException {
        Map map = new HashMap();
        ClassPool pool = ClassPool.getDefault();
        ClassClassPath classPath = new ClassClassPath(cls);
        pool.insertClassPath(classPath);
        CtClass cc = pool.get(clazzName);
        CtMethod cm = cc.getDeclaredMethod(methodName);
        MethodInfo methodInfo = cm.getMethodInfo();
        CodeAttribute codeAttribute = methodInfo.getCodeAttribute();
        LocalVariableAttribute attr = (LocalVariableAttribute) codeAttribute.getAttribute(LocalVariableAttribute.tag);
        int pos = Modifier.isStatic(cm.getModifiers()) ? 0 : 1;
        for (int i = 0; i < cm.getParameterTypes().length; i++) {
            map.put(attr.variableName(i + pos), args[i]);//paramNames即参数名
        }
        return map;
    }
}
