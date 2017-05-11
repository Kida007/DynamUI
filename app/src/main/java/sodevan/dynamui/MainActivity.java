package sodevan.dynamui;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.TextView;


public class MainActivity extends FragmentActivity{

    String TAG = "Main Activity" ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Context c =getApplicationContext();





        //          TODO: 12/04/17 Add Multiple View feature

        DynamuiObjectParams[] apra = {new DynamuiObjectParams("android.content.Context", "this" , "android.content.Context" ,"android.content.Context" ) , new DynamuiObjectParams("java.lang.CharSequence","Im Pro" , "java.lang.String","String") , new DynamuiObjectParams("int" ,"1" , "java.lang.Integer","parseInt" ) } ;
        DynamuiObjectParams[] apra2 = new DynamuiObjectParams[0];
        DynamuiObjectParams[] apra3 = {new DynamuiObjectParams("int" , "#FFC220" , "android.graphics.Color" , "parseColor" )} ;
        DynamuiObjectParams[] apra4 = {new DynamuiObjectParams("android.view.View", "mag" , "findview" , "stringid") , new DynamuiObjectParams("java.lang.CharSequence",  "My Name Is Pro" , "java.lang.String","String" ) , new DynamuiObjectParams("int" ,"5123" , "java.lang.Integer","parseInt" )};
        DynamuiObjectParams[] apra5 = new DynamuiObjectParams[0];
        DynamuiObjectParams[] apra6 = {new DynamuiObjectParams("int" , "#B000E5" , "android.graphics.Color" , "parseColor" )} ;








        DynamuiObjectProperty[] dp3 = { new DynamuiObjectProperty("setTextColor" , apra3)};
        DynamuiObjectProperty[] dp5 = { new DynamuiObjectProperty("setBackgroundColor" , apra6)};
        DynamuiObjectProperty[] dp4   = {new DynamuiObjectProperty("make", apra4 ) , new DynamuiObjectProperty("show", apra5 )} ;
        DynamuiObjectProperty[] dp2   = {new DynamuiObjectProperty("makeText", apra ) , new DynamuiObjectProperty("show", apra2 )} ;



        DynamuiTask[] t = {new DynamuiTask("android.widget.Toast" , dp2 , "new")  , new DynamuiTask("android.widget.TextView",dp3 , "12345") , new DynamuiTask("android.support.design.widget.Snackbar" , dp4 , "new") , new DynamuiTask("android.widget.RelativeLayout",dp5 , "mag")};


        DynamuiListener lis = new DynamuiListener("click" , t , 1 ) ;

        DynamuiObjectParams[] para4 ={ new DynamuiObjectParams("int","123" , "java.lang.Integer","parseInt" )} ;

        DynamuiObjectParams[] para1 ={ new DynamuiObjectParams("java.lang.CharSequence","My Name Is Pro" , "java.lang.String","String" )} ;
        DynamuiObjectParams[] para2= {new DynamuiObjectParams("float" ,"30" , "java.lang.Float","parseFloat" )} ;
        DynamuiObjectParams[] para3= {new DynamuiObjectParams("int" ,"130" , "java.lang.Integer","parseInt" ) , new DynamuiObjectParams("int" ,"130" , "java.lang.Integer","parseInt" ) , new DynamuiObjectParams("int" ,"130" , "java.lang.Integer","parseInt" ) , new DynamuiObjectParams("int" ,"130" , "java.lang.Integer","parseInt" )} ;
        DynamuiObjectProperty[] dp = {new DynamuiObjectProperty("setText" , para1) , new DynamuiObjectProperty("setTextSize", para2) , new DynamuiObjectProperty("setPadding" ,para3) , new DynamuiObjectProperty("setId" ,para4)}  ;



        DynamuiObject n1 = new DynamuiObject("android.widget.TextView" ,dp , "new" , lis , 12345 ) ;
         Dynamui dynamui = new Dynamui("Main Activity", R.id.container , this , n1) ;
        dynamui.initializefragment();




        TextView tv = new TextView(this);


    }


}
