package sodevan.dynamui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ravipiyush on 06/04/17.
 */


public class Dynamuifragment extends Fragment {

    public static Dynamuifragment newInstance() {
        Bundle args = new Bundle();
        Dynamuifragment fragment = new Dynamuifragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.dynamui_fragment , container , false) ;
        return v ;
    }
}
