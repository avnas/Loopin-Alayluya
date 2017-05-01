package alayluya.loopin.com.loopin_alayluya.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;

import alayluya.loopin.com.loopin_alayluya.Helper.GlobalState;
import alayluya.loopin.com.loopin_alayluya.Pojo.LoginReturn;
import alayluya.loopin.com.loopin_alayluya.Pojo.UserProfileReturn;
import alayluya.loopin.com.loopin_alayluya.R;
import alayluya.loopin.com.loopin_alayluya.R2;
import alayluya.loopin.com.loopin_alayluya.RetrofitHelper.RestClient;
import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @BindView(R2.id.content_main_profile_name)
    TextView tvFullName;

    com.mikhaellopez.circularimageview.CircularImageView circularProfileImage, circularNavHeaderImage;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        circularProfileImage = (com.mikhaellopez.circularimageview.CircularImageView)findViewById(R.id.content_main_profile_picture);
        circularNavHeaderImage= (com.mikhaellopez.circularimageview.CircularImageView)findViewById(R.id.nav_header_main_image);

        ButterKnife.bind(this);

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        View headerView = navigationView.getHeaderView(0);
        final TextView navUsername = (TextView) headerView.findViewById(R.id.nav_header_main_text);


        GlobalState state = GlobalState.singleton;
        LoginReturn loginReturn = new Gson().fromJson(state.getPREFS_Logged_USER_INFO(), LoginReturn.class);

        String lang = state.getCheckSelectedLanguage();
        

        RestClient.getClient().LoopinRequestProfile(loginReturn.getTokenType()+" "+loginReturn.getAccessToken())
                .enqueue(new Callback<UserProfileReturn>() {
                    @Override
                    public void onResponse(Call<UserProfileReturn> call, Response<UserProfileReturn> response) {

                        //Log.d("profile return", new Gson().toJson(response.body()));
                       if (response.body().getIsSuccess()){
                            Toast.makeText(MainActivity.this, "Welcome", Toast.LENGTH_SHORT).show();
                           String full_name = response.body().getResult().getFirstName()+" "+ response.body().getResult().getLastName();
                           navUsername.setText(full_name);
                           tvFullName.setText(full_name);

                           if(response.body().getResult().getCoverImage()!=null) {
                               Glide.with(MainActivity.this).load(response.body().getResult().getCoverImage()).into(circularProfileImage);
                               Glide.with(MainActivity.this).load(response.body().getResult().getCoverImage()).into(circularNavHeaderImage);
                           }
                           else{}

                        }
                        else {
                            Toast.makeText(MainActivity.this, response.raw().message(), Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<UserProfileReturn> call, Throwable t) {

                        Toast.makeText(MainActivity.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                    }
                });


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        //this lets us to use the colorful icons
        navigationView.setItemIconTintList(null);
        /////////////////////////////////////////


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    /////////language option to keep here///////////////
   /* @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_wall) {

        } else if (id == R.id.nav_chat) {

        } else if (id == R.id.nav_notifications) {

        } else if (id == R.id.nav_advanced_search) {

        } else if (id == R.id.nav_friends_groups) {

        } else if (id == R.id.nav_nearby) {

        }else if (id == R.id.nav_forum) {

        }else if (id == R.id.nav_popular) {

        }else if (id == R.id.nav_favourites_bookmarks) {

        }else if (id == R.id.nav_articles) {
            startActivity(new Intent(MainActivity.this, ArticleActivity.class));

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
