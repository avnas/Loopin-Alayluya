package alayluya.loopin.com.loopin_alayluya.Interfaces;

import alayluya.loopin.com.loopin_alayluya.Pojo.LoginReturn;
import alayluya.loopin.com.loopin_alayluya.Pojo.SignUpRequest;
import alayluya.loopin.com.loopin_alayluya.Pojo.SignUpReturn;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by ranja_000 on 4/5/2017.
 */

public interface UserEndPointInterface {

    @POST("api/accounts/signup")
    Call<SignUpReturn> LoopinSignUp (@Body SignUpRequest signUpRequest);

    @POST("/Token")
    Call<LoginReturn> LoopinLogin(@Body String body);

}
