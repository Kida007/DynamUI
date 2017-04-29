package sodevan.dynamui;

/**
 * Created by ravipiyush on 30/04/17.
 */

public class DynamuiTask {

    private String Classname ;
    private DynamuiObjectProperty[] Properties;
    private String Status ;


    public DynamuiTask(String classname, DynamuiObjectProperty[] properties, String status) {
        Classname = classname;
        Properties = properties;
        Status = status;
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

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
