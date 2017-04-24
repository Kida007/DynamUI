package sodevan.dynamui;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;


public class MainActivity extends FragmentActivity{

    String TAG = "Main Activity" ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: 12/04/17 Add Multiple View feature

        DynamuiObjectParams[] para1 ={ new DynamuiObjectParams("java.lang.CharSequence","My Name Is Pro" , "java.lang.String","String" )} ;
        DynamuiObjectParams[] para2= {new DynamuiObjectParams("float" ,"30" , "java.lang.Float","parseFloat" )} ;
        DynamuiObjectProperty[] dp = {new DynamuiObjectProperty("setText" , para1) , new DynamuiObjectProperty("setTextSize", para2)}  ;


        DynamuiObject n1 = new DynamuiObject("android.widget.TextView" ,dp ) ;
         Dynamui dynamui = new Dynamui("Main Activity", R.id.container , this , n1) ;
        dynamui.initializefragment();


    }


}
