package sodevan.dynamui;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;


public class MainActivity extends FragmentActivity{

    String TAG = "Main Activity" ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Context c =getApplicationContext();






        DynamuiObjectParams[] apra = {new DynamuiObjectParams("android.content.Context", "this" , "android.content.Context" ,"android.content.Context" ) , new DynamuiObjectParams("java.lang.CharSequence","Im Pro" , "java.lang.String","String") , new DynamuiObjectParams("int" ,"1" , "java.lang.Integer","parseInt" ) } ;
        DynamuiObjectParams[] apra2 = new DynamuiObjectParams[0];
        DynamuiObjectParams[] apra3 = {new DynamuiObjectParams("int" , "#956BD5" , "android.graphics.Color" , "parseColor" )} ;
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
        DynamuiObjectParams[] para5 = {new DynamuiObjectParams("int" , "#00BFD8" , "android.graphics.Color" , "parseColor" )} ;
        DynamuiObjectParams[] para6 = {new DynamuiObjectParams("int" , "#" , "android.graphics.Color" , "parseColor" )} ;


        DynamuiObjectProperty[] dp = {new DynamuiObjectProperty("setText" , para1) , new DynamuiObjectProperty("setTextSize", para2) , new DynamuiObjectProperty("setPadding" ,para3) , new DynamuiObjectProperty("setId" ,para4) , new DynamuiObjectProperty("setBackgroundColor" , para5)}  ;



        //obj2


        DynamuiObjectParams[] apra1 = {new DynamuiObjectParams("android.content.Context", "this" , "android.content.Context" ,"android.content.Context" ) , new DynamuiObjectParams("java.lang.CharSequence","Im too much pro" , "java.lang.String","String") , new DynamuiObjectParams("int" ,"1" , "java.lang.Integer","parseInt" ) } ;
        DynamuiObjectParams[] apra21 = new DynamuiObjectParams[0];
        DynamuiObjectParams[] apra31 = {new DynamuiObjectParams("int" , "#00BFD8" , "android.graphics.Color" , "parseColor" )} ;
        DynamuiObjectParams[] apra41 = {new DynamuiObjectParams("android.view.View", "mag" , "findview" , "stringid") , new DynamuiObjectParams("java.lang.CharSequence",  "My Name Is Pro" , "java.lang.String", "String" ) , new DynamuiObjectParams("int" ,"5123" , "java.lang.Integer","parseInt" )};
        DynamuiObjectParams[] apra51 = new DynamuiObjectParams[0];
        DynamuiObjectParams[] apra61 = {new DynamuiObjectParams("int" , "#6A6964" , "android.graphics.Color" , "parseColor" )} ;


        DynamuiObjectProperty[] dp31 = { new DynamuiObjectProperty("setTextColor" , apra31)};
        DynamuiObjectProperty[] dp51 = { new DynamuiObjectProperty("setBackgroundColor" , apra61)};




        DynamuiTask[] t1 = { new DynamuiTask("android.widget.TextView",dp31 , "123456") , new DynamuiTask("android.widget.RelativeLayout",dp51 , "mag")};


        DynamuiListener lis1 = new DynamuiListener("click" , t1 , 1 ) ;

        DynamuiObjectParams[] para41 ={ new DynamuiObjectParams("int","123456" , "java.lang.Integer","parseInt" )} ;

        DynamuiObjectParams[] para11 ={ new DynamuiObjectParams("java.lang.CharSequence","Boys Played Well xD" , "java.lang.String","String" )} ;
        DynamuiObjectParams[] para21= {new DynamuiObjectParams("float" ,"30" , "java.lang.Float","parseFloat" )} ;
        DynamuiObjectParams[] para31= {new DynamuiObjectParams("int" ,"130" , "java.lang.Integer","parseInt" ) , new DynamuiObjectParams("int" ,"130" , "java.lang.Integer","parseInt" ) , new DynamuiObjectParams("int" ,"130" , "java.lang.Integer","parseInt" ) , new DynamuiObjectParams("int" ,"130" , "java.lang.Integer","parseInt" )} ;
        DynamuiObjectParams[] para51 = {new DynamuiObjectParams("int" , "#956BD5" , "android.graphics.Color" , "parseColor" )} ;

        DynamuiObjectProperty[] dp1 = {new DynamuiObjectProperty("setText" , para11) , new DynamuiObjectProperty("setTextSize", para21) , new DynamuiObjectProperty("setPadding" ,para31) , new DynamuiObjectProperty("setId" ,para41) , new DynamuiObjectProperty("setBackgroundColor" , para51)}  ;






        DynamuiObject n1 = new DynamuiObject("android.widget.TextView" ,dp , "new" , lis , 12345, -2, -1 , new DynamuiPosition(14, -1) ) ;
        DynamuiObject nw = new DynamuiObject("android.widget.TextView" ,dp1 , "new" , lis1 , 123456, -2, -1 , new DynamuiPosition(3, 12345) ) ;

        DynamuiObject[] objects = {n1 , nw} ;

        Dynamui dynamui = new Dynamui("Main Activity", R.id.container , this , objects) ;
        dynamui.initializefragment();






    }


}
