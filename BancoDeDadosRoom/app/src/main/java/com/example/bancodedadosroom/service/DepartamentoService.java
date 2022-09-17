package com.example.bancodedadosroom.service;

import com.example.bancodedadosroom.model.DepartamentoRes;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DepartamentoService {

    @GET("/departments")
    Call<List<DepartamentoRes>> getAll();
}
