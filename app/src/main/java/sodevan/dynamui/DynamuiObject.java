package sodevan.dynamui;

/**
 * Created by ravipiyush on 08/04/17.
 */

public class DynamuiObject {
    private String Classname ;
    private String Methodname ;
    private String Value ;


    public DynamuiObject(String classname, String methodname, String value) {
        Classname = classname;
        Methodname = methodname;
        Value = value;
    }

    public String getClassname() {
        return Classname;
    }

    public void setClassname(String classname) {
        Classname = classname;
    }

    public String getMethodname() {
        return Methodname;
    }

    public String getValue() {
        return Value;
    }
}
