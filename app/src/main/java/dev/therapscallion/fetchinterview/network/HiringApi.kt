package dev.therapscallion.fetchinterview.network

import retrofit2.Response
import retrofit2.http.GET

interface HiringApi {

    @GET("/hiring.json")
    suspend fun getHiring(): Response<List<ApiItem>>

    companion object {
        data class ApiItem(
            val id: Int?,
            val listId: Int?,
            val name: String?
        )
    }

}