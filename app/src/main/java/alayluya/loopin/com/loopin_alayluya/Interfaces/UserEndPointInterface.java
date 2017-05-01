package alayluya.loopin.com.loopin_alayluya.Interfaces;

import alayluya.loopin.com.loopin_alayluya.Pojo.ArticleReturn;
import alayluya.loopin.com.loopin_alayluya.Pojo.LoginReturn;
import alayluya.loopin.com.loopin_alayluya.Pojo.SignUpRequest;
import alayluya.loopin.com.loopin_alayluya.Pojo.SignUpReturn;
import alayluya.loopin.com.loopin_alayluya.Pojo.UserProfileReturn;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by ranja_000 on 4/5/2017.
 */

public interface UserEndPointInterface {

    @POST("api/accounts/signup")
    Call<SignUpReturn> LoopinSignUp (@Body SignUpRequest signUpRequest);

    @POST("/Token")
    Call<LoginReturn> LoopinLogin(@Body String body);

    @GET("api/accounts/tokenaccount")
    Call<UserProfileReturn> LoopinRequestProfile(@Header("authorization") String authorization);

    @FormUrlEncoded
    @POST("api/articles/categorieswitharticles/1")
    Call<ArticleReturn> LoopinArticle(@Field("Page") int Page,
                                      @Field("Size") int Size/*,
                                      @Header("languageId") int languageId*/);

}
