package com.yj.zhihu.common.retrofit

import com.yj.zhihu.data.NewsDetail
import com.yj.zhihu.data.NewsExtra
import com.yj.zhihu.data.NewsResult
import com.yj.zhihu.data.ThemeResult
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * @author yuanjian 17/10/31.
 */
interface YjService {

    @GET("api/4/themes")
    fun getTheme(): Observable<ThemeResult>

    @GET("api/4/news/latest")
    fun getLatestNews(): Observable<NewsResult>

    @GET("api/4/news/before/{date}")
    fun getHistoryNews(@Path("date") date: String): Observable<NewsResult>

    @GET("api/4/news/{id}")
    fun getNewsDetail(@Path("id") id: Long): Observable<NewsDetail>

    @GET("api/4/story-extra/{id}")
    fun getNewsExtra(@Path("id") id: Long): Observable<NewsExtra>

}