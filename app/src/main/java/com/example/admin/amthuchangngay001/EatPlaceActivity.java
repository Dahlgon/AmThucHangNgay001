package com.example.admin.amthuchangngay001;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

public class EatPlaceActivity extends AppCompatActivity {

    private Toolbar toolbarEP;
    private LinearLayout normal;
    private LinearLayout office;
    private LinearLayout fastfood;
    private LinearLayout party;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eat_place);
        initViews();
        initActions();


    }

    private void initViews() {
        toolbarEP = findViewById(R.id.toolbarEP);
        setSupportActionBar(toolbarEP);

        getSupportActionBar().setTitle(R.string.eate_place);

        normal = findViewById(R.id.normalEP);
        office = findViewById(R.id.officeEP);
        fastfood = findViewById(R.id.fastfoodEP);
        party = findViewById(R.id.partyEP);
        toolbarEP.setTitleTextColor(Color.WHITE);
        toolbarEP.setTitle(getString(R.string.menu_create));
        toolbarEP.setNavigationIcon(R.drawable.undo);
    }

    private void initActions() {
        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EatPlaceActivity.this, NormalActivity.class));
            }
        });
        office.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EatPlaceActivity.this, OfficeActivity.class));
            }
        });
        fastfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EatPlaceActivity.this, FastFoodActivity.class));
            }
        });
        party.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EatPlaceActivity.this, PartyActivity.class));
            }
        });
    }
}
