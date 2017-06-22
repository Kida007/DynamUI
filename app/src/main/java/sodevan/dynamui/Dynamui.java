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
     DynamuiObject[] dynamuiObjects ;


    public Dynamui(String activityname, int layoutid, Context context, DynamuiObject[] dynamuiObjects) {
        this.activityname = activityname;
        this.layoutid = layoutid;
        this.context = context;
        this.dynamuiObjects = dynamuiObjects;
    }

    public void initializefragment() {
        Dynamuifragment dynamuifragment = Dynamuifragment.newInstance(dynamuiObjects) ;
        FragmentActivity activity = (FragmentActivity)context ;
        activity.getSupportFragmentManager().beginTransaction().add(layoutid , dynamuifragment , activityname).commit() ;

    }
}
