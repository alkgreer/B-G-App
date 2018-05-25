package com.example.bbj2012.bgspringfield;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Spinner;

public class ParentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void onClickFindArea(View view){
        Spinner area = (Spinner) findViewById(R.id.area);
        String areaChoosen = area.getSelectedItem().toString();
        if(areaChoosen.equals("Tech Lab")){
            Intent intent = new Intent(this,TechLabActivity.class);
            startActivity(intent);
        }
    }

}
