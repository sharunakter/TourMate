package com.example.hp.tourmate.main.tie.hackathon.travelguide;

/**
 * Created by HP on 1/31/2018.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.hp.tourmate.R;
import com.example.hp.tourmate.main.adapters.ImageAdapter;
import com.example.hp.tourmate.main.utils.Constants;

import java.util.ArrayList;


public class EventImage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_event_image);

        Intent intent = getIntent();
        String name = intent.getStringExtra(Constants.EVENT_NAME);
        int pos = intent.getIntExtra(Constants.IMAGE_NO, -1);

        ArrayList<String> images = intent.getStringArrayListExtra(Constants.EVENT_IMG);

        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        ImageAdapter adapter = new ImageAdapter(this, images);
        viewPager.setAdapter(adapter);
        if (pos != -1)
            viewPager.setCurrentItem(pos);

        setTitle(name);
        getSupportActionBar().hide();
    }
}
