package com.example.soptfirstprojectjy.network

import com.example.soptfirstprojectjy.data.RequestLogin
import com.example.soptfirstprojectjy.data.ResponseLogin
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface RequestInterface{
    @POST("/user/signin")
    fun requestLogin(@Body body: RequestLogin) : Call<ResponseLogin>
}