package com.example.bbj2012.bgspringfield;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BGTopicDetailFragment extends Fragment {
    private long topicId;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if (savedInstanceState != null){
            topicId = savedInstanceState.getLong("topicId");
        }
        return inflater.inflate(R.layout.fragment_bgtopic_detail, container, false);
    }


    @Override
    public void onStart(){
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            BGTopics topic = BGTopics.topics[(int) topicId];
            title.setText(topic.getName());
            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(topic.getDescription());
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        savedInstanceState.putLong("topicId", topicId);
    }



    public void setTopic(long id){
        this.topicId = id;
    }

}
