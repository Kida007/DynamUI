package sodevan.dynamui;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.TextView;


public class MainActivity extends FragmentActivity{

    String TAG = "Main Activity" ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView t  ;



        // TODO: 09/04/17 Make Generic Property Builder

        Dynamui dynamui = new Dynamui("Main Activity", R.id.container , this , "android.widget.TextView-PROP-setText-VALUE-My Name Is Pro-TYPE-java.lang.CharSequence-PARSERC-java.lang.String-PARSERM-String-PROP-setTextSize-VALUE-30-TYPE-float-PARSERC-java.lang.Float-PARSERM-parseFloat") ;
        dynamui.initializefragment();


    }


}
