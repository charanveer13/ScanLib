package com.example.cardscantest;

import android.app.Activity;

import com.getbouncer.cardscan.ScanActivity;

public class ScanNow {
ScanActivity scanActivity;
public void scan(Activity activity)
{

    scanActivity.start(activity);
}

}
