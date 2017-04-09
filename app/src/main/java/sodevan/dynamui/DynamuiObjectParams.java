package sodevan.dynamui;

/**
 * Created by ravipiyush on 09/04/17.
 */

public class DynamuiObjectParams {

    private Class<?> Paramtype ;
    private String Paramvalue ;




    public DynamuiObjectParams(Class<?> paramtype, String paramvalue) {
        Paramtype = paramtype;
        Paramvalue = paramvalue;
    }

    public Class<?> getParamtype() {
        return Paramtype;
    }

    public void setParamtype(Class<?> paramtype) {
        Paramtype = paramtype;
    }

    public String getParamvalue() {
        return Paramvalue;
    }

    public void setParamvalue(String paramvalue) {
        Paramvalue = paramvalue;
    }
}
