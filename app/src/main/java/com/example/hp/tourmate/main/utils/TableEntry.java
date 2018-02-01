package com.example.hp.tourmate.main.utils;

/**
 * Created by HP on 1/31/2018.
 */


import android.provider.BaseColumns;

/**
 * Created by Swati garg on 30-06-2015.
 * <p>
 * Constants for database column names
 */
public abstract class TableEntry implements BaseColumns {
    public static final String TABLE_NAME = "events_new";
    public static final String COLUMN_NAME_ID = "id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_NAME_ISDONE = "isdone";
}


