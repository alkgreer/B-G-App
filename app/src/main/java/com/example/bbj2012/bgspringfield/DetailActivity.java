package com.example.bbj2012.bgspringfield;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class DetailActivity extends Activity {
    public static final String EXTRA_TOPIC_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        BGTopicDetailFragment topicDetailFragment = (BGTopicDetailFragment)
                getFragmentManager().findFragmentById(R.id.detail_frag);
        int topicId = (int) getIntent().getExtras().get(EXTRA_TOPIC_ID);
        topicDetailFragment.setTopic(topicId);


    }

}
