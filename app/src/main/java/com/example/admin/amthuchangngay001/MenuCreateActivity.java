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

public class MenuCreateActivity extends AppCompatActivity {

    private android.support.v7.widget.Toolbar toolbarMC;
    private FloatingActionButton fabAddMenu;
    private RecyclerView lvListMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_create);

        initViews();
        initAction();
    }

    private void initViews() {
        toolbarMC = findViewById(R.id.toolbarMC);
        lvListMenu = findViewById(R.id.lvListMenu);
        fabAddMenu = findViewById(R.id.fabAddMenu);
        setSupportActionBar(toolbarMC);
        Objects.requireNonNull(getSupportActionBar()).setDisplayShowTitleEnabled(false);
        toolbarMC.setTitleTextColor(Color.WHITE);
        toolbarMC.setTitle(getString(R.string.menu_create));
        toolbarMC.setNavigationIcon(R.drawable.undo);

    }

    private void initAction() {
        fabAddMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialogAddMenu();
            }
        });
        toolbarMC.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        lvListMenu.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                if (dy > 0 && fabAddMenu.getVisibility() == View.VISIBLE) {
                    fabAddMenu.hide();
                } else if (dy < 0 && fabAddMenu.getVisibility() != View.VISIBLE) {
                    fabAddMenu.show();
                }
            }
        });


    }

    private void showDialogAddMenu() {

        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        @SuppressLint("InflateParams") View dialogView = Objects.requireNonNull(inflater).inflate(R.layout.dialog_add_menu, null);
        builder.setView(dialogView);
        final Dialog dialog = builder.show();

    }


}
