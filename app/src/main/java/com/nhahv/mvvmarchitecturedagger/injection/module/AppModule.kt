package com.nhahv.mvvmarchitecturedagger.injection.module

import com.nhahv.mvvmarchitecturedagger.network.PostAPI
import dagger.Module
import dagger.Provides
import dagger.Reusable
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

@Module
object AppModule {

    const val BASE_URL: String = "https://jsonplaceholder.typicode.com"
    @Provides
    @Reusable
    @JvmStatic
    internal fun providePostAPI(retrofit: Retrofit) = retrofit.create(PostAPI::class.java)

    @Provides
    @Reusable
    @JvmStatic
    internal fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
            .build()
    }

}