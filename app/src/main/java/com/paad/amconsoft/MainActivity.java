package com.paad.amconsoft;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.bumptech.glide.Glide;
import com.google.android.material.navigation.NavigationView;
import com.paad.amconsoft.userlist.UserFragment;


public class  MainActivity extends AppCompatActivity implements TransferBetweenFragments  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final UserFragment userFragment = UserFragment.newInstance();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.main_container, userFragment).commit();

    }

    @Override
    public void goFromUserToPost(int userID) {

        UserFragment userFragment = UserFragment.newInstance();
        getSupportFragmentManager().beginTransaction().addToBackStack("user fragment")
                .replace(R.id.main_container, userFragment).commit();

    }


}
