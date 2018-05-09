package com.wizeline.recyclerview.data.entities;

import com.google.gson.annotations.SerializedName;

public class Post {
    @SerializedName("userId")
    Integer userId;
    @SerializedName("id")
    Integer id;
    @SerializedName("title")
    String title;
    @SerializedName("body")
    String body;
}
