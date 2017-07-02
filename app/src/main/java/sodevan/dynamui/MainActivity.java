package sodevan.dynamui;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import java.util.HashMap;


public class MainActivity extends FragmentActivity{

    String TAG = "Main Activity" ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        Context c =getApplicationContext();

        DynamuiObjectParams[] apra = {new DynamuiObjectParams("android.content.Context", "this" , "android.content.Context" ,"android.content.Context"  , "basic_bunder") , new DynamuiObjectParams("java.lang.CharSequence","Im Pro" , "java.lang.String","String" , "basic_bunder") , new DynamuiObjectParams("int" ,"1" , "java.lang.Integer","parseInt" , "basic_bunder" ) } ;
        DynamuiObjectParams[] apra2 = new DynamuiObjectParams[0];
        DynamuiObjectParams[] apra3 = {new DynamuiObjectParams("int" , "#956BD5" , "android.graphics.Color" , "parseColor"  , "basic_bunder")} ;
        DynamuiObjectParams[] apra4 = {new DynamuiObjectParams("android.view.View", "mag" , "findview" , "stringid" , "basic_bunder") , new DynamuiObjectParams("java.lang.CharSequence",  "My Name Is Pro" , "java.lang.String","String" , "basic_bunder" ) , new DynamuiObjectParams("int" ,"5123" , "java.lang.Integer","parseInt"  , "basic_bunder")};
        DynamuiObjectParams[] apra5 = new DynamuiObjectParams[0];
        DynamuiObjectParams[] apra6 = {new DynamuiObjectParams("int" , "#B000E5" , "android.graphics.Color" , "parseColor"  , "basic_bunder")} ;



        DynamuiObjectProperty[] dp3 = { new DynamuiObjectProperty("setTextColor" , apra3)};
        DynamuiObjectProperty[] dp5 = { new DynamuiObjectProperty("setBackgroundColor" , apra6)};
        DynamuiObjectProperty[] dp4   = {new DynamuiObjectProperty("make", apra4 ) , new DynamuiObjectProperty("show", apra5 )} ;
        DynamuiObjectProperty[] dp2   = {new DynamuiObjectProperty("makeText", apra ) , new DynamuiObjectProperty("show", apra2 )} ;



        DynamuiTask[] t = {new DynamuiTask("android.widget.Toast" , dp2 , "new")  , new DynamuiTask("android.widget.TextView",dp3 , "12345") , new DynamuiTask("android.support.design.widget.Snackbar" , dp4 , "new") , new DynamuiTask("android.widget.RelativeLayout",dp5 , "mag")};

        DynamuiTask[] tx ={} ;
        DynamuiListener lis = new DynamuiListener("click" , t , 1 ) ;
        DynamuiListener lis1 = new DynamuiListener("nope" , tx , 1 ) ;

        DynamuiObjectParams[] para4 ={ new DynamuiObjectParams("int","123" , "java.lang.Integer","parseInt"  , "basic_bunder")} ;

        DynamuiObjectParams[] para1 ={ new DynamuiObjectParams("java.lang.CharSequence","My Name Is Pro" , "java.lang.String","String"  ,"basic_bunder")} ;
        DynamuiObjectParams[] para2= {new DynamuiObjectParams("float" ,"30" , "java.lang.Float","parseFloat" , "basic_bunder" )} ;
        DynamuiObjectParams[] para3= {new DynamuiObjectParams("int" ,"130" , "java.lang.Integer","parseInt"  , "basic_bunder") , new DynamuiObjectParams("int" ,"130" , "java.lang.Integer","parseInt" , "basic_bunder" ) , new DynamuiObjectParams("int" ,"130" , "java.lang.Integer","parseInt"  , "basic_bunder") , new DynamuiObjectParams("int" ,"130" , "java.lang.Integer","parseInt"  , "basic_bunder")} ;
        DynamuiObjectParams[] para5 = {new DynamuiObjectParams("int" , "#00BFD8" , "android.graphics.Color" , "parseColor" , "basic_bunder")} ;


        DynamuiObjectProperty[] dp = {new DynamuiObjectProperty("setText" , para1) , new DynamuiObjectProperty("setTextSize", para2) , new DynamuiObjectProperty("setPadding" ,para3) , new DynamuiObjectProperty("setId" ,para4) , new DynamuiObjectProperty("setBackgroundColor" , para5)}  ;


        // Object 2


        DynamuiObjectParams[] para120 ={ new DynamuiObjectParams("android.graphics.Bitmap","" , "",""  , "bitmap")} ;


        DynamuiObjectParams[] blankparams = { } ;

        DynamuiObjectProperty[] proper2 = {new DynamuiObjectProperty("getResources" , blankparams) } ;
        DynamuiPreTasks pt2 = new DynamuiPreTasks("" ,  proper2 , "" , "" , "" , 0 , "context" ) ;

        DynamuiObjectParams[] paramss = {new DynamuiObjectParams("android.content.res.Resources", "" , "" , "" , "get-resources") , new DynamuiObjectParams("int", "pro" , "findDrawable" , "stringid" , "basic_bunder") } ;
        DynamuiObjectProperty[] proper3 = {new DynamuiObjectProperty("decodeResource" , paramss) } ;
        DynamuiPreTasks pt3 = new DynamuiPreTasks("" ,  proper3 , "android.graphics.BitmapFactory" , "decodeResource" , "" , 0 , "basic_bunder" ) ;


        HashMap<String , DynamuiPreTasks  > pth2  = new HashMap<>() ;

        HashMap<String , DynamuiPreTasks  > pth1  = new HashMap<>() ;


        pth2.put("get-resources" ,pt2) ;
        pth2.put("bitmap" ,pt3) ;


        DynamuiObjectProperty[] dp10 = {new DynamuiObjectProperty("setImageBitmap" , para120) }  ;



        DynamuiObject n1 = new DynamuiObject("android.widget.TextView" ,dp , "new" , lis , 12345, -2, -1 , new DynamuiPosition(14, -1) , pth1 ) ;
        DynamuiObject n2 = new DynamuiObject("android.widget.ImageView" ,dp10 , "new" , lis1 , 2345, 400, 400 , new DynamuiPosition(3, 12345) , pth2 ) ;

        DynamuiObject[] objects = {n1 , n2} ;




        Dynamui dynamui = new Dynamui("Main Activity", R.id.container , this , objects) ;
        dynamui.initializefragment();

    }


}
