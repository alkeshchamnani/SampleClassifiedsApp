package com.alkesh.sampleclassifiedsapp.common.models.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class AdvertisementModel {

    @SerializedName("created_at")
    @Expose
    private String date;

    @SerializedName("price")
    @Expose
    private String price;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("uid")
    @Expose
    private String uid;

    @SerializedName("image_ids")
    @Expose
    private ArrayList<String> imageIds;

    @SerializedName("image_urls")
    @Expose
    private ArrayList<String> imageUrls;

    @SerializedName("image_urls_thumbnails")
    @Expose
    private ArrayList<String> imageUrlsThumbnails;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public ArrayList<String> getImageIds() {
        return imageIds;
    }

    public void setImageIds(ArrayList<String> imageIds) {
        this.imageIds = imageIds;
    }

    public ArrayList<String> getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(ArrayList<String> imageUrls) {
        this.imageUrls = imageUrls;
    }

    public ArrayList<String> getImageUrlsThumbnails() {
        return imageUrlsThumbnails;
    }

    public void setImageUrlsThumbnails(ArrayList<String> imageUrlsThumbnails) {
        this.imageUrlsThumbnails = imageUrlsThumbnails;
    }
}