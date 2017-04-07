package sodevan.dynamui;

import android.content.Context;
import android.support.v4.app.FragmentActivity;

/**
 * Created by ravipiyush on 08/04/17.
 */

public class Dynamui {
    private String activityname  ;
    private int layoutid ;
    private Context context;


    public Dynamui(String activityname, int layoutid, Context context) {
        this.activityname = activityname;
        this.layoutid = layoutid;
        this.context = context;
    }

    public void initializefragment() {
        Dynamuifragment dynamuifragment = Dynamuifragment.newInstance("Hello Noob") ;
        FragmentActivity activity = (FragmentActivity)context ;
        activity.getSupportFragmentManager().beginTransaction().add(layoutid , dynamuifragment , activityname).commit() ;
    }
}
