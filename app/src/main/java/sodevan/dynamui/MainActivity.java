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

        TextView tv ;


        // TODO: 09/04/17 Make Generic Property Builder

        Dynamui dynamui = new Dynamui("Main Activity", R.id.container , this , "android.widget.TextView$-prop-$setText$-value-$My Name Is Pro$-type-$String$-prop-$setPadding$-value-$0$-type-$Integer$-value-$0$-type-$Integer$-value-$0$-type-$Integer$-value-$0$-type-$Integer") ;
        dynamui.initializefragment();

    }
}
