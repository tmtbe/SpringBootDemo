package com.android.http;
import com.alibaba.fastjson.JSONObject;
import com.android.model.*;
import retrofit2.Call;
import retrofit2.Retrofit;
import java.util.List;
import retrofit2.mock.MockRetrofit;

public class HuidrHttpManager{
    private final HuidrService mHuidrService;
    private final MockHuidrService mMockHuidrService;
    public HuidrHttpManager(Retrofit retrofit, MockRetrofit mockRetrofit) {
        mHuidrService = retrofit.create(HuidrService.class);
        mMockHuidrService = new MockHuidrService(mockRetrofit.create(HuidrService.class));
    }
    /**
    * 获取ReportImages
    *
    * @param reportId 报告id
    * @param type 报告类型，0.患者上传 1.检查报告 2.检验报告
    * @param visitingId 就诊id
    * @return
    */
    public Call<HttpResult<ReportPeople>> getNewReportImages(String reportId,String type,String visitingId) {
        JSONObject jsonParams = HttpManager.getInstance().getBaseParam();;
        jsonParams.put("reportId", reportId);
        jsonParams.put("type", type);
        jsonParams.put("visitingId", visitingId);
        if (mMockHuidrService.hasMock("getNewReportImages")) {
            return mMockHuidrService.getNewReportImages(jsonParams);
        }
        return mHuidrService.getNewReportImages(jsonParams);
    }

    public void mockGetNewReportImagesResponse(HttpResult<ReportPeople> response) {
        mMockHuidrService.setGetNewReportImagesResponse(response);
    }
    public void mockGetNewReportImagesResponse(String response) {
        mMockHuidrService.setGetNewReportImagesResponse(response);
    }
}