package com.example.scanlibcard;


import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;

import androidx.fragment.app.Fragment;

import com.fxn.pix.Options;
import com.fxn.pix.Pix;
import com.fxn.utility.ImageQuality;
import com.getbouncer.cardscan.ScanActivity;

public class ScanNow {

    public void scan(Fragment activity)
    {
        Pix.start(activity, Options.init().setRequestCode(100));
    }
}
