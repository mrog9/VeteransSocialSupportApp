package com.example.veteranssocialsupportapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MyGroupsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_groups_page);
    }

    public void openHomepageFromMyGroups(View view){
        Intent intent= new Intent(this, HomePage.class);
        startActivity(intent);
    }
}