package com.example.hp.tourmate.main.tie.hackathon.travelguide.destinations.funfacts;

/**
 * Created by HP on 2/1/2018.
 */

import org.json.JSONArray;

/**
 * Created by niranjanb on 14/06/17.
 */

public interface FunFactsView {
    void showProgressDialog();
    void hideProgressDialog();
    void setupViewPager(JSONArray factsArray);
}