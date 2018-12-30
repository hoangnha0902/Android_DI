package com.nhahv.mvvmarchitecturedagger.network

import com.nhahv.mvvmarchitecturedagger.data.model.Post
import io.reactivex.Observable
import retrofit2.http.GET

interface PostAPI {
    /**
     * Get the list of the pots from the API
     */
    @GET("/posts")
    fun getPosts(): Observable<List<Post>>
}