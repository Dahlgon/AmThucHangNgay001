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

public class PartyActivity extends AppCompatActivity {

    private Toolbar toolbarPT;
    private RecyclerView lvListPT;
    private FloatingActionButton fabAddPT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_party);

        initViews();
        iniAction();
    }

    private void initViews() {
        toolbarPT = findViewById(R.id.toolbarPT);
        lvListPT = findViewById(R.id.lvListPT);
        fabAddPT = findViewById(R.id.fabAddPT);
        setSupportActionBar(toolbarPT);
        Objects.requireNonNull(getSupportActionBar()).setDisplayShowTitleEnabled(false);
        toolbarPT.setTitle(getString(R.string.party));
        toolbarPT.setTitleTextColor(Color.WHITE);
        toolbarPT.setNavigationIcon(R.drawable.undo);
    }

    private void iniAction(){
        fabAddPT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialogAddPT();
            }
        });

    }

    private void showDialogAddPT() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        @SuppressLint("InflateParams") View dialogView = Objects.requireNonNull(inflater).inflate(R.layout.dialog_add_party, null);
        builder.setView(dialogView);
        final Dialog dialog = builder.show();
    }
}
