package com.example.bbj2012.bgspringfield;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity
implements TopicListFragment.TopicListListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void itemClicked(long id){
        View fragmentContainer = findViewById(R.id.fragment_container);
        if(fragmentContainer != null) {
            BGTopicDetailFragment details = new BGTopicDetailFragment();
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            details.setTopic(id);
            ft.replace(R.id.fragment_container, details);
            ft.addToBackStack(null);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
        }else{
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.EXTRA_TOPIC_ID, (int)id);
            startActivity(intent);
        }
    }

    public void onStaffClick(View view){
        Intent intent = new Intent(this,StaffAdaActivity.class);
        startActivity(intent);
    }

}
