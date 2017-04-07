package sodevan.dynamui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ravipiyush on 06/04/17.
 */


public class Dynamuifragment extends Fragment {

    public static Dynamuifragment newInstance(String ns) {
        Bundle args = new Bundle();
        args.putString("textviewstring",ns);
        Dynamuifragment fragment = new Dynamuifragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.dynamui_fragment , container , false) ;
        TextView tv = (TextView)v.findViewById(R.id.tvid) ;
        tv.setText(getArguments().get("textviewstring").toString());
        return v ;
    }
}
