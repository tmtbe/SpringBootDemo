package com.android.http;

import com.alibaba.fastjson.JSONObject;
import com.android.model.*;
import retrofit2.Call;
import retrofit2.http.*;
import java.util.List;
public interface HuidrService {
    /**
     * 获取ReportImages
     *
     * @param jsonParams
     * @return
     */
    @POST("huidrRESTful/getNewReportImages")
    Call<HttpResult<ReportPeople>> getNewReportImages(@Body JSONObject jsonParams);
}