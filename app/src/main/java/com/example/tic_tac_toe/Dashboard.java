package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }
    public void multi_game(View view){
        Intent intent = new Intent(Dashboard.this,Multi_Game.class);
        startActivity(intent);
    }
    public void comingSoon(View view){
        Toast.makeText(this, "Coming Soon....", Toast.LENGTH_SHORT).show();
    }
}