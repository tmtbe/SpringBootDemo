//代码生成工具生成，请勿直接修改
package com.android.http;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import com.alibaba.fastjson.JSONObject;
import retrofit2.mock.MockRetrofit;
import retrofit2.mock.NetworkBehavior;
import java.util.concurrent.TimeUnit;

public class HttpManager {
    private static HttpManager instance;
    private static HttpGetBaseParams getBaseParams;
    private HuidrHttpManager mHuidrHttpManager;
    public static void setGetBaseParams(HttpGetBaseParams getBaseParams){
        HttpManager.getBaseParams = getBaseParams;
    }

    public static HttpManager getInstance() {
        if (HttpManager.instance == null) {
            HttpManager.instance = new HttpManager(HttpManager.getBaseParams);
        }
        return HttpManager.instance;
    }
    public HttpManager(HttpGetBaseParams getBaseParamsImpl) {
        String baseUrl = "http://localhost:8080/";
        Retrofit retrofit = new Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        //.addCallAdapterFactory(RxJavaCallAdapterFactory.create())
        .baseUrl(baseUrl)
        .build();
        NetworkBehavior behavior = NetworkBehavior.create();
        behavior.setDelay(500, TimeUnit.MILLISECONDS);
        MockRetrofit mockRetrofit = new MockRetrofit.Builder(retrofit)
        .networkBehavior(behavior)
        .build();
        mHuidrHttpManager = new HuidrHttpManager(retrofit,mockRetrofit);
    }
    public HuidrHttpManager getHuidrHttpManager() {
        return mHuidrHttpManager;
    }
    public JSONObject getBaseParam() {
        JSONObject jsonParams = new JSONObject();
        jsonParams.put("huidrKey", getBaseParams.getHuidrKey());
        jsonParams.put("seq", getBaseParams.getSeq());
        jsonParams.put("sid", getBaseParams.getSid());
        return jsonParams;
    }
}