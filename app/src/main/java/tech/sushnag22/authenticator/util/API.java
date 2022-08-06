package tech.sushnag22.authenticator.util;


import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import tech.sushnag22.authenticator.model.User;

public interface API {

    @POST("register")
    Call<ResponseBody> createUser (
            @Body User user
    );

    @POST("login")
    Call<ResponseBody> checkUser (
            @Body User user
    );

}