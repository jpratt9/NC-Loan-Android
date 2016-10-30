package me.floatr.util;

import android.content.IntentFilter;

import me.floatr.models.Auth;
import me.floatr.models.Loan;
import me.floatr.models.LoanOffer;
import me.floatr.models.Payment;
import me.floatr.models.User;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Created by pedrod on 10/30/16.
 */

public interface FloatrApiInterface {

    // Request method and URL specified in the annotation
    // Callback for the parsed response is the last parameter

    @GET("users")
    Call<User> getUser();

    @PUT("users/{id}")
    Call<User> updateUser(@Path("id") String groupId);

    @GET("users/{id}")
    Call<User> getUser(@Path("id") String groupId);

    @POST("loans")
    Call<Loan> createLoan();

    @PUT("loans/{id}")
    Call<Loan> updateLoan(@Path("id") String groupId);

    @GET("loans/{id}")
    Call<Loan> getLoan(@Path("id") String groupId);

    @GET("loan-offer")
    Call<LoanOffer> getLoanOffer();

    @POST("loan-offer")
    Call<LoanOffer> createLoadOffer();

    @PUT("loan-offer/{id}")
    Call<LoanOffer> updateLoadOffer(@Path("id") String groupId);

    @GET("loan-offer/{id}")
    Call<LoanOffer> getLoadOffer(@Path("id") String groupId);

    @DELETE("loan-offer/{id}")
    Call<LoanOffer> deleteLoadOffer(@Path("id") String groupId);

    @POST("payments")
    Call<Payment> createPayment();

    @GET("payments/{id}")
    Call<Payment> getPayment(@Path("id") String groupId);

    @POST("auth/register")
    Call<Auth> createRegister();

    @POST("auth/login")
    Call<Auth> createLogin();


//    @GET("group/{id}/users")
//        Call<List<User>> groupList(@Path("id") int groupId, @Query("sort") String sort);
//
//        @POST("users/new")
//        Call<User> createUser(@Body User user);

}
