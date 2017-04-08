package sodevan.dynamui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by ravipiyush on 06/04/17.
 */


public class Dynamuifragment extends Fragment {

    String TAG = "DynamuiFragment";


    public static Dynamuifragment newInstance(String ns) {
        Bundle args = new Bundle();
        args.putString("stuff",ns);
        Dynamuifragment fragment = new Dynamuifragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.dynamui_fragment , container , false) ;

        RelativeLayout r = (RelativeLayout)v.findViewById(R.id.mag) ;

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT) ;
        params.addRule(RelativeLayout.CENTER_IN_PARENT);

        String stuff =  getArguments().get("stuff").toString() ;
        String stuffing[] = stuff.split("-") ;
        DynamuiObject stuffinfo = new DynamuiObject(stuffing[0] , stuffing[1] , stuffing[2]) ;
        Class<?> c=null;
        Object o =null ;




        try {
             c = Class.forName(stuffinfo.getClassname());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Constructor<?> cons = c.getConstructor(Context.class);

            o = cons.newInstance(getContext()) ;
            Log.i(TAG , "Object :"+o+"") ;

        } catch (java.lang.InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


        try {
            Method method = c.getDeclaredMethod (stuffinfo.getMethodname(), String.class) ;
            method.invoke(o , stuffinfo.getValue()) ;

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        r.addView((TextView)o);



        return v ;
    }
}
