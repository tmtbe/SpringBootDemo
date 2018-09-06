//代码生成工具生成，请勿直接修改
package com.example.consul.controller;
import com.example.consul.model.*;
import io.swagger.annotations.*;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.example.consul.controller.params.*;
import java.util.List;
@Api("用户信息")
@RequestMapping("huidrRESTful")
public interface IHuidr {
    /**
    * 获取ReportImages
    */
    @ApiOperation(value = "获取ReportImages", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiResponse(code = 200, message = "success", response = HttpResult.class)
    @PostMapping("getNewReportImages")

    HttpResult<ReportPeople> getNewReportImages(HuidrGetNewReportImagesParams mHuidrGetNewReportImagesParams);
}