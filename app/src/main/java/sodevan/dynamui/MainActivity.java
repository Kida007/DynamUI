package sodevan.dynamui;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;


public class MainActivity extends FragmentActivity{

    String TAG = "Main Activity" ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // TODO: 09/04/17 Make Generic Property Builder

        Dynamui dynamui = new Dynamui("Main Activity", R.id.container , this , "android.widget.TextView-prop-setText-value-My Name Is Pro-type-java.lang.CharSequence") ;
        dynamui.initializefragment();

    }
}
