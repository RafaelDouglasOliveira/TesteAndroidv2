package com.br.projetotestesantanter.api

import com.br.projetotestesantanter.api.model.StatementListResponse
import com.br.projetotestesantanter.refactor.loginScreen.LoginModel
import retrofit2.Call
import retrofit2.http.*


interface Endpoint {

    @FormUrlEncoded
    @POST("login")
    fun login(@Field("user") user: String, @Field("password") password : String ) : Call<LoginModel.LoginResponse>


    @GET("statements/{idUser}")
    fun getStatements(@Path("idUser") idUser : Int) : Call<StatementListResponse>
}