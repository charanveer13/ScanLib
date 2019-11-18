package com.example.scanlibcard;


import android.app.Activity;

import com.getbouncer.cardscan.ScanActivity;

public class ScanNow {

    public void scan(Activity activity)
    {
        ScanActivity.start(activity);
    }
}
