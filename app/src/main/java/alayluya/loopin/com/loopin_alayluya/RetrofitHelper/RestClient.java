package alayluya.loopin.com.loopin_alayluya.RetrofitHelper;

import android.util.Log;

import com.google.gson.Gson;

import java.util.concurrent.TimeUnit;

import alayluya.loopin.com.loopin_alayluya.Constants.Constant;
import alayluya.loopin.com.loopin_alayluya.Interfaces.UserEndPointInterface;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by ranja_000 on 4/3/2017.
 */

public class RestClient {
    private static UserEndPointInterface mInterface;

    public static UserEndPointInterface getClient() {
        if (mInterface == null) {
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();

            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

            OkHttpClient okHttpClient = new OkHttpClient.Builder()
            .addInterceptor(
                chain -> {
                    Request original = chain.request();

                    // Request customization: add request headers
                    Request.Builder requestBuilder = original.newBuilder()
                            .method(original.method(), original.body());

                    Request request = requestBuilder.build();

                    Log.e("Retrofit@Response", new Gson().toJson(request.body()));

                    return chain.proceed(request);
                    })
                .readTimeout(90, TimeUnit.SECONDS)
                .connectTimeout(90, TimeUnit.SECONDS)
                .build();

            Retrofit retroClient = new Retrofit.Builder()
                    .baseUrl(Constant.BASE_URL)
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            mInterface = retroClient.create(UserEndPointInterface.class);

        }

        return mInterface;
    }
}