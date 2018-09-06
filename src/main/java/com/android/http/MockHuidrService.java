package com.android.http;

import com.alibaba.fastjson.JSONObject;
import com.android.model.*;
import retrofit2.Call;
import retrofit2.http.*;
import retrofit2.mock.BehaviorDelegate;
import java.util.List;
import java.util.HashMap;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class MockHuidrService implements HuidrService {
    private final BehaviorDelegate<HuidrService> delegate;
    private HashMap<String,Object> hashMap;
    private Gson gson;
    MockHuidrService(BehaviorDelegate<HuidrService> delegate){
        this.delegate = delegate;
        this.hashMap = new HashMap<>();
        this.gson = new Gson();
    }
    public Boolean hasMock(String url){
        return hashMap.containsKey(url);
    }
    @Override
    public Call<HttpResult<ReportPeople>> getNewReportImages(JSONObject jsonParams) {
        return delegate.returningResponse(hashMap.get("getNewReportImages")).getNewReportImages(jsonParams);
    }
    public void setGetNewReportImagesResponse(HttpResult<ReportPeople> response){
        hashMap.put("getNewReportImages",response);
    }
    public void setGetNewReportImagesResponse(String response){
        Type type = new TypeToken<HttpResult<ReportPeople>>(){}.getType();
        HttpResult<ReportPeople> responseObject = gson.fromJson(response,type);
        hashMap.put("getNewReportImages",responseObject);
    }
}