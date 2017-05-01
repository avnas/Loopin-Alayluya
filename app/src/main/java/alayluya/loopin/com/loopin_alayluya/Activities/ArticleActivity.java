package alayluya.loopin.com.loopin_alayluya.Activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.gson.Gson;
import com.marshalchen.ultimaterecyclerview.UltimateRecyclerView;

import java.util.ArrayList;

import alayluya.loopin.com.loopin_alayluya.Adapter.ArticleAdapter;
import alayluya.loopin.com.loopin_alayluya.Pojo.ArticleReturn;
import alayluya.loopin.com.loopin_alayluya.R;
import alayluya.loopin.com.loopin_alayluya.RetrofitHelper.RestClient;
import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by ranja_000 on 4/30/2017.
 */

public class ArticleActivity extends AppCompatActivity {

    ArticleAdapter articleAdapter;

    @BindView(R.id.activity_article_recyclerView)
    UltimateRecyclerView recyclerView;

    @BindView(R.id.activity_article_toolbar)
    Toolbar toolbar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);
        ButterKnife.bind(this);


        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        RestClient.getClient().LoopinArticle(1, 2)
           .enqueue(new Callback<ArticleReturn>() {
               @Override
               public void onResponse(Call<ArticleReturn> call, Response<ArticleReturn> response) {
                   Log.d("responselogin", new Gson().toJson(response.body()));


                   if(response.body()!=null&&response.body().getIsSuccess()){
                       Toast.makeText(ArticleActivity.this, "Success", Toast.LENGTH_SHORT).show();

                       ArrayList<ArticleReturn.Result.Category> categoryList= new ArrayList<ArticleReturn.Result.Category>();
                       for (ArticleReturn.Result result: response.body().getResult()) {
                           categoryList.add(result.getCategory());
                       }
                      articleAdapter = new ArticleAdapter(ArticleActivity.this, categoryList);
                   }
                   else {Toast.makeText(ArticleActivity.this, response.raw().message(), Toast.LENGTH_SHORT).show();}
               }

               @Override
               public void onFailure(Call<ArticleReturn> call, Throwable t) {
                   Toast.makeText(ArticleActivity.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();

               }
           });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem)
    {
        switch (menuItem.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }
}