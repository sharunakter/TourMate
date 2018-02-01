package com.example.hp.tourmate.main.tie.hackathon.travelguide.destinations.description;

/**
 * Created by HP on 2/1/2018.
 */

public interface FinalCityInfoView {
    void onPause();
    void onResume();
    void onStart();
    void onStop();
    void showProgress();
    void dismissProgress();
    void parseResult(String description, String iconUrl, String temp, String humidity, String weatherInfo,
                     String lat, String lon);
}
