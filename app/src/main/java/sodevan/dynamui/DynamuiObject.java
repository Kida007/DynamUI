package sodevan.dynamui;

/**
 * Created by ravipiyush on 08/04/17.
 */

public class DynamuiObject {
    private Class<?> Classname ;
    private DynamuiObjectProperty[] Properties;

    public DynamuiObject(Class<?> classname, DynamuiObjectProperty[] properties) {
        Classname = classname;
        Properties = properties;
    }


    public Class<?> getClassname() {
        return Classname;
    }

    public void setClassname(Class<?> classname) {
        Classname = classname;
    }

    public DynamuiObjectProperty[] getProperties() {
        return Properties;
    }

    public void setProperties(DynamuiObjectProperty[] properties) {
        Properties = properties;
    }
}
