package com.example.consul.controllerImpl;

import com.example.consul.controller.IHuidr;
import com.example.consul.model.HttpResult;
import com.example.consul.model.ReportPeople;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.consul.controller.params.HuidrGetNewReportImagesParams;
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class Huidr implements IHuidr {
    @Override
    public HttpResult<ReportPeople> getNewReportImages(@RequestBody HuidrGetNewReportImagesParams mHuidrGetNewReportImagesParams) {
        System.out.print(mHuidrGetNewReportImagesParams);
        HttpResult<ReportPeople> httpResult = new HttpResult<>();
        httpResult.setDesc("Ceshi");
        httpResult.setRetValue(new ReportPeople());
        return httpResult;
    }
}
