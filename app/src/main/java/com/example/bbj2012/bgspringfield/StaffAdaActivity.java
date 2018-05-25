package com.example.bbj2012.bgspringfield;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;


public class StaffAdaActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_staff_ada);


    }

    public void onClickFindArea(View view){
        Spinner area = (Spinner) findViewById(R.id.area);
        String areaChoosen = area.getSelectedItem().toString();
        if(areaChoosen.equals("Tech Lab")){
            Intent intent = new Intent(this,TechLabActivity.class);
            startActivity(intent);
        }else if (areaChoosen.equals("Art Room")) {
            Intent intent = new Intent(this,ArtActivity.class);
            startActivity(intent);
        }else if (areaChoosen.equals("Pre-Teen Center")) {
            Intent intent = new Intent(this,PreTActivity.class);
            startActivity(intent);
        }else if (areaChoosen.equals("Gym")) {
            Intent intent = new Intent(this,GymActivity.class);
            startActivity(intent);
        }else if (areaChoosen.equals("Music Room")) {
            Intent intent = new Intent(this,MusicActivity.class);
            startActivity(intent);
        }else if (areaChoosen.equals("Games Room")){
            Intent intent = new Intent(this,GamesActivity.class);
            startActivity(intent);
        }else if(areaChoosen.equals("Learning Center")){
            Intent intent = new Intent(this,LearningActivity.class);
            startActivity(intent);
        }

    }






}
