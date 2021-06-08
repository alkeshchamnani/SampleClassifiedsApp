package com.alkesh.sampleclassifiedsapp.common.models.response;

import com.alkesh.sampleclassifiedsapp.common.models.dto.AdvertisementModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class GetAdvertisementApiResponse {

    @Expose
    @SerializedName("results")
    private ArrayList<AdvertisementModel> result;

    public ArrayList<AdvertisementModel> getResult() {
        return result;
    }

    public void setResult(ArrayList<AdvertisementModel> result) {
        this.result = result;
    }
}