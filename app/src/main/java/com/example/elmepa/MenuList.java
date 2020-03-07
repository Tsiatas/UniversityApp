package com.example.elmepa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_list);
    }

    public void TodayMenuList(View view) {
        Intent intent = new Intent(this,TodayMenuList.class);
        startActivity(intent);
    }

    public void TomorrowMenuList(View view) {
        Intent intent = new Intent(this,TomorrowMenuList.class);
        startActivity(intent);
    }
}
