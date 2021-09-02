package com.uog.fyp.e.learning.service;

import com.uog.fyp.e.learning.model.Retrophoto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {
    @GET("/photos")
    Call<List<Retrophoto>> getAllPhotos();
}
