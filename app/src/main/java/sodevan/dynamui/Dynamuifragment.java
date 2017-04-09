package sodevan.dynamui;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/**
 * Created by ravipiyush on 06/04/17.
 */

// TODO: 09/04/17 Make Generic Property Builder


public class Dynamuifragment extends Fragment {

    String TAG = "DynamuiFragment";


    public static Dynamuifragment newInstance(String ns) {
        Bundle args = new Bundle();
        args.putString("stuff",ns);
        Dynamuifragment fragment = new Dynamuifragment();
        fragment.setArguments(args);
        return fragment;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.dynamui_fragment , container , false) ;

        RelativeLayout r = (RelativeLayout)v.findViewById(R.id.mag) ;

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT) ;
        params.addRule(RelativeLayout.CENTER_IN_PARENT);

        String stuff =  getArguments().get("stuff").toString() ;
        DynamuiObject dynamuiObject =  buildDynamuiObjects(stuff) ;
        View view= buildView(dynamuiObject)  ;
        r.addView(view);
        return v ;
    }






    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public View buildView(DynamuiObject stuffinfo) {

        /*Class<?> c=null;
        Object o =null ;


        try {
            c = Class.forName(stuffinfo.getClassname());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            assert c != null;
            Constructor<?> cons = c.getConstructor(Context.class);

            o = cons.newInstance(getContext()) ;
            Log.i(TAG , "Object :"+o+"") ;

        } catch (java.lang.InstantiationException | InvocationTargetException | NoSuchMethodException | IllegalAccessException e) {
            e.printStackTrace();
        }


        try {
            assert o != null;
            Method method = o.getClass().getMethod( stuffinfo.getMethodname(), CharSequence.class)  ;
            Log.i( TAG, method+"");
            method.invoke(o , stuffinfo.getValue()) ;

        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }

        View view = (View)o ; */

        View view=null ;

        return view ;
    }


    public DynamuiObject buildDynamuiObjects(String stuff) {

        String Stuffing[] = stuff.split("$-prop-$") ;
        String Classname = Stuffing[0] ;
        int propno =Stuffing.length-1 ;
        DynamuiObjectProperty[] Objectproperty = buildDynamuiObjectProperties(Stuffing , propno) ;

        DynamuiObject dynamuiObject = new DynamuiObject(getClassfromname(Classname), Objectproperty) ;
        return  dynamuiObject;
    }



    public DynamuiObjectProperty[] buildDynamuiObjectProperties (String Stuffing[] , int propno){

        DynamuiObjectProperty[] Objectproperty=null ;
        for(int i=1 ; i <=propno  ; i++) {
           String property =  Stuffing[i] ;

            String propvars[] = property.split("$-value-$") ;
            String methodname = propvars[1] ;
            int valueno  = propvars.length-1 ;
            DynamuiObjectParams[] objectParams = buildDynamuiObjectParams(propvars , valueno) ;
            Objectproperty[i-1] = new DynamuiObjectProperty(methodname , objectParams) ;
        }

        return  Objectproperty ;
    }




    public DynamuiObjectParams[] buildDynamuiObjectParams(String propvars[], int valueno ) {

        DynamuiObjectParams[] propparams = null ;

        for (int j=1; j<=valueno ; j++) {
            String param = propvars[j] ;
            String paramvars[] = param.split("$-type-$") ;
            propparams[j-1]= new DynamuiObjectParams(getClassfromname(paramvars[0]), paramvars[1])  ;

        }
        return propparams ;

    }





    public Class<?> getClassfromname(String Classname) {

        Class<?> c=null ;

        try {
            c = Class.forName(Classname);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return c ;

    }




}
