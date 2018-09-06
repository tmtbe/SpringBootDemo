package com.android;

import com.android.http.HttpGetBaseParams;
import com.android.http.HttpManager;
import com.android.model.HttpResult;
import com.android.model.ReportPeople;
import retrofit2.Call;
import retrofit2.Response;

public class Main {
    public static void main(String[] args) throws Exception {
        HttpManager.setGetBaseParams(new HttpGetBaseParams() {
            @Override
            public String getHuidrKey() {
                return "abc";
            }

            @Override
            public String getSeq() {
                return null;
            }

            @Override
            public String getSid() {
                return null;
            }
        });
        HttpManager.getInstance().getHuidrHttpManager().mockGetNewReportImagesResponse("{\n" +
                "    \"clientType\": 0,\n" +
                "    \"currPage\": 0,\n" +
                "    \"desc\": \"string\",\n" +
                "    \"huidrKey\": \"string\",\n" +
                "    \"pageSize\": 0,\n" +
                "    \"retValue\": {\n" +
                "        \"admitNo\": \"string\",\n" +
                "        \"age\": 0,\n" +
                "        \"applicantDate\": \"string\",\n" +
                "        \"bed\": \"string\",\n" +
                "        \"collectDate\": \"string\",\n" +
                "        \"examineDate\": \"string\",\n" +
                "        \"examinerName\": \"string\",\n" +
                "        \"listLabReportDetail\": [\n" +
                "            {\n" +
                "                \"id\": 0,\n" +
                "                \"index\": 0,\n" +
                "                \"labId\": \"string\",\n" +
                "                \"labIndesResult\": \"string\",\n" +
                "                \"labIndexCode\": 0,\n" +
                "                \"labIndexName\": \"string\",\n" +
                "                \"labIndexNo\": 0,\n" +
                "                \"referenceRange\": \"string\",\n" +
                "                \"tableKey\": \"string\",\n" +
                "                \"unit\": \"string\",\n" +
                "                \"unusualPrompt\": \"string\",\n" +
                "                \"unusualPromptStr\": \"string\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"patientInfoId\": \"string\",\n" +
                "        \"patientName\": \"string\",\n" +
                "        \"remarks\": \"string\",\n" +
                "        \"reportDate\": \"string\",\n" +
                "        \"sex\": \"string\",\n" +
                "        \"specimenExplain\": \"string\",\n" +
                "        \"specimenType\": \"string\",\n" +
                "        \"tableKey\": \"string\",\n" +
                "        \"verifierName\": \"string\",\n" +
                "        \"visitingId\": \"string\",\n" +
                "        \"wardName\": \"string\"\n" +
                "    },\n" +
                "    \"seq\": 0,\n" +
                "    \"serverTime\": \"string\",\n" +
                "    \"sid\": \"string\",\n" +
                "    \"status\": 0,\n" +
                "    \"token\": \"string\"\n" +
                "}");
        Call<HttpResult<ReportPeople>> newReportImages =  HttpManager.getInstance().getHuidrHttpManager().getNewReportImages("1", "2", "3");
        Response<HttpResult<ReportPeople>> execute = newReportImages.execute();
        System.out.print(execute.body());
    }
}
