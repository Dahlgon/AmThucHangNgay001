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

import java.util.Objects;

public class NormalActivity extends AppCompatActivity {

    private Toolbar toolbarNM;
    private RecyclerView lvListNM;
    private FloatingActionButton fabNM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);

        initViews();
        initAction();
    }

    private void initViews() {
        toolbarNM = findViewById(R.id.toolbarNM);
        lvListNM = findViewById(R.id.lvListMenu);
        fabNM = findViewById(R.id.fabAddNM);
        setSupportActionBar(toolbarNM);
        Objects.requireNonNull(getSupportActionBar()).setDisplayShowTitleEnabled(false);
        toolbarNM.setTitle(getString(R.string.normal));
        toolbarNM.setTitleTextColor(Color.WHITE);
        toolbarNM.setNavigationIcon(R.drawable.undo);

    }

    private void initAction(){
        fabNM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialogAddNM();
            }
        });
    }

    private void showDialogAddNM() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        @SuppressLint("InflateParams") View dialogView = Objects.requireNonNull(inflater).inflate(R.layout.dialog_add_normal, null);
        builder.setView(dialogView);
        final Dialog dialog = builder.show();
    }


}
