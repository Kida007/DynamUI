package sodevan.dynamui;

/**
 * Created by ravipiyush on 08/04/17.
 */

public class DynamuiObject {
    private String Classname ;
    private DynamuiObjectProperty[] Properties;

    public DynamuiObject(String classname, DynamuiObjectProperty[] properties) {
        Classname = classname;
        Properties = properties;
    }

    public String getClassname() {
        return Classname;
    }

    public void setClassname(String classname) {
        Classname = classname;
    }

    public DynamuiObjectProperty[] getProperties() {
        return Properties;
    }

    public void setProperties(DynamuiObjectProperty[] properties) {
        Properties = properties;
    }
}
