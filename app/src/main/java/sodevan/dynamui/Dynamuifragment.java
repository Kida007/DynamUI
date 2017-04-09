package sodevan.dynamui;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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
        Log.i("dynamuiobject : "  , dynamuiObject.getProperties()[0].getParameters()[0].getParamtype()+"") ;

        View view= buildView(dynamuiObject)  ;
        r.addView(view);
        return v ;
    }






    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public View buildView(DynamuiObject object) {

        Class classname = object.getClassname() ;
        Object viewObject = buildViewObject(classname)  ;
        DynamuiObjectProperty[] properties = object.getProperties() ;
        int n = properties.length  ;

        for (int h=0 ; h<n ; h++) {

            DynamuiObjectParams[]  params = properties[h].getParameters() ;

            int n1 = params.length ;
            Class<?>[] allparams = new Class[n1] ;


            for (int k=0 ; k<n1 ; k++) {
                allparams[k] = params[k].getParamtype()  ;
            }

            try {
                Method method = viewObject.getClass().getMethod(properties[h].getMethodname() , allparams ) ;
                Log.i( TAG, method+"");
                method.invoke(viewObject , "Helloworld") ;

            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }









        View view=(View) viewObject ;

        return view ;
    }


    public DynamuiObject buildDynamuiObjects(String stuff) {

        String Stuffing[] = stuff.split("-prop-") ;
        String Classname = Stuffing[0] ;
        Log.i("dynamuiobject2 : "  , Stuffing[0]) ;

        int propno =Stuffing.length-1 ;
        DynamuiObjectProperty[] Objectproperty = buildDynamuiObjectProperties(Stuffing , propno) ;

        DynamuiObject dynamuiObject = new DynamuiObject(getClassfromname(Classname), Objectproperty) ;
        return  dynamuiObject;
    }



    public DynamuiObjectProperty[] buildDynamuiObjectProperties (String Stuffing[] , int propno){

        DynamuiObjectProperty[] Objectproperty= new DynamuiObjectProperty[propno] ;
        for(int i=1 ; i <=propno  ; i++) {
           String property =  Stuffing[i] ;

            String propvars[] = property.split("-value-") ;
            String methodname = propvars[0] ;
            int valueno  = propvars.length-1 ;
            DynamuiObjectParams[] objectParams = buildDynamuiObjectParams(propvars , valueno) ;
            Objectproperty[i-1] = new DynamuiObjectProperty(methodname , objectParams) ;
        }

        return  Objectproperty ;
    }




    public DynamuiObjectParams[] buildDynamuiObjectParams(String propvars[], int valueno ) {

        DynamuiObjectParams[] propparams = new DynamuiObjectParams[valueno] ;

        for (int j=1; j<=valueno ; j++) {
            String param = propvars[j] ;
            String paramvars[] = param.split("-type-") ;
            propparams[j-1]= new DynamuiObjectParams(getClassfromname(paramvars[1]), paramvars[0])  ;

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


    public Object buildViewObject(Class<?> classname){

        Object o =null ;


        try {

            Constructor<?> constructor = classname.getConstructor(Context.class) ;
            o = constructor.newInstance(getContext()) ;
            Log.i(TAG , "Object :"+o+"") ;


        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (java.lang.InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return o ;
    }




}


/*  Class[] classes = new Class[n] ;

        for (int k=0 ; k<n ; k++) {

            classes[k] = params[k].getParamtype() ;
        }*/
