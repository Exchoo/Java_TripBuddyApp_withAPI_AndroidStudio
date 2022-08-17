package com.example.project;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RecyclerInterface {

    String JSONURL = "https://mocki.io";

    @GET("/v1/92f62cb4-3ad7-416d-a3f2-ebf9caf36bda")
    Call<String> getString();
}
