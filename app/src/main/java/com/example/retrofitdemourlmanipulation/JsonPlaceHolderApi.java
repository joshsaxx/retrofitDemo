package com.example.retrofitdemourlmanipulation;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface JsonPlaceHolderApi {
    /**@GET("posts")
    Call<List<Post>> getPosts();*/

    /**@GET("posts")
    Call<List<Post>> getPosts(@Query("userId") int userId);*/


    @GET("posts")
    Call<List<Post>> getPosts(
            @Query("userId") int userId,
            @Query("_sort") String sort,
            @Query("_order") String order
    );

    /**@GET("posts/{id}/comments")
    Call<List<Comment>> getComments(@Path("id") int postId);*/

    @GET("comments?postId=2")
    Call<List<Comment>> getComments();

    //@POST("posts")
    //Call<Post> createPost(@Body Post post);

    @FormUrlEncoded
    @POST("posts")
    Call<Post> createPost(
            @Field("userID") int userID,
            @Field("title") String title,
            @Field("body") String text
    );

    @PUT("posts/{id}")
    Call<Post> putPost(@Path("id") int id, @Body Post post);

    @PATCH("posts/{id}")
    Call<Post> patchPost(@Path("id") int id, @Body Post post);

    @DELETE("posts/{id}")
    Call<Void> deletePost(@Path("id") int id);
}
