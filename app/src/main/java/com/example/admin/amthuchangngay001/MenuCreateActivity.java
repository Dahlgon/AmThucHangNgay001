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
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class MenuCreateActivity extends AppCompatActivity {

        private Toolbar toolbarMC;
        private RecyclerView lvListMC;
        private FloatingActionButton fabAddMC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_create);

        initViews();
        initAction();


    }



    private void initViews() {
        toolbarMC = findViewById(R.id.toolbarMC);
        lvListMC = findViewById(R.id.lvListMenu);
        fabAddMC = findViewById(R.id.fabAddMenu);
        setSupportActionBar(toolbarMC);
        Objects.requireNonNull(getSupportActionBar()).setDisplayShowTitleEnabled(false);
        toolbarMC.setTitle(getString(R.string.menu_create));
        toolbarMC.setTitleTextColor(Color.WHITE);
        toolbarMC.setNavigationIcon(R.drawable.undo);
    }
    private void initAction() {
        fabAddMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialogAddMenu();
            }
        });


    }

    private void showDialogAddMenu() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        @SuppressLint("InflateParams") View dialogView = Objects.requireNonNull(inflater).inflate(R.layout.dialog_add_menu, null);
        builder.setView(dialogView);
        final Dialog dialog = builder.show();

        Button btnAddFood = dialogView.findViewById(R.id.btnAddFood);
        btnAddFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                showDialogAddFood();
            }
        });
    }

    private void showDialogAddFood() {

        final AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        @SuppressLint("InflateParams") View dialogView = Objects.requireNonNull(inflater).inflate(R.layout.dialog_add_food, null);
        dialog.setView(dialogView);
        final Dialog dialog1 = dialog.show();





    }


}
