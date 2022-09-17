package com.example.bancodedadosroom.service;

import com.example.bancodedadosroom.model.Department;
import com.example.bancodedadosroom.model.DepartamentDTO;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface DepartamentService {

    @GET("/departments")
    Call<List<Department>> getAllDepartaments();

    @POST("/departments")
    Call<Department> createDepartment(@Body DepartamentDTO dto);

    @GET("/departments/{department_id}")
    Call<Department> getDepartmentByID(@Path("department_id") Long id);

    @PUT("/departments/{department_id}")
    Call<Department> alterar(
            @Path("department_id") Long id,
            @Body DepartamentDTO dto
    );

}
