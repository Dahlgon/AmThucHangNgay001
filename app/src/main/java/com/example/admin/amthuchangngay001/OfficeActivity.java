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

public class OfficeActivity extends AppCompatActivity {

    private Toolbar toolbarOF;
    private RecyclerView lvListOF;
    private FloatingActionButton fabAddNM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_office);

        initViews();
        initActions();
}



    private void initViews() {
        toolbarOF = findViewById(R.id.toolbarOF);
        lvListOF = findViewById(R.id.lvListOF);
        fabAddNM = findViewById(R.id.fabAddOF);
        setSupportActionBar(toolbarOF);
        Objects.requireNonNull(getSupportActionBar()).setDisplayShowTitleEnabled(false);
        toolbarOF.setTitle(getString(R.string.office));
        toolbarOF.setTitleTextColor(Color.WHITE);
        toolbarOF.setNavigationIcon(R.drawable.undo);
    }
    private void initActions() {
        fabAddNM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showDialogAddOF();

            }
        });
    }

    private void showDialogAddOF() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        @SuppressLint("InflateParams") View dialogView = Objects.requireNonNull(inflater).inflate(R.layout.dialog_add_office, null);
        builder.setView(dialogView);
        final Dialog dialog = builder.show();
    }
}
