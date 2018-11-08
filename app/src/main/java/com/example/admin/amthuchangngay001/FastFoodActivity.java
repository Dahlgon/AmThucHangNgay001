package com.example.admin.amthuchangngay001;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;

import java.util.Objects;

public class FastFoodActivity extends AppCompatActivity {

    private android.support.v7.widget.Toolbar toolbarFF;
    private FloatingActionButton fabAddFastFood;
    private RecyclerView lvListFF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fast_food);

        initViewsFst();
        initActionFst();
    }

    private void initViewsFst() {
        toolbarFF = findViewById(R.id.toolbarFF);
        lvListFF = findViewById(R.id.lvListFF);
        fabAddFastFood = findViewById(R.id.fabAddFastFood);
        setSupportActionBar(toolbarFF);
        Objects.requireNonNull(getSupportActionBar()).setDisplayShowTitleEnabled(false);
        toolbarFF.setTitleTextColor(Color.WHITE);
        toolbarFF.setTitle(getString(R.string.normal));
        toolbarFF.setNavigationIcon(R.drawable.undo);

    }

    private void initActionFst() {
        fabAddFastFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialogAddFastFood();
            }
        });
        toolbarFF.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        lvListFF.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                if (dy > 0 && fabAddFastFood.getVisibility() == View.VISIBLE) {
                    fabAddFastFood.hide();
                } else if (dy < 0 && fabAddFastFood.getVisibility() != View.VISIBLE) {
                    fabAddFastFood.show();
                }
            }
        });


    }

    private void showDialogAddFastFood() {

        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        @SuppressLint("InflateParams") View dialogView = Objects.requireNonNull(inflater).inflate(R.layout.dialog_add_fast_foodl, null);
        builder.setView(dialogView);
        final Dialog dialog = builder.show();
    }
}
