package sodevan.dynamui;


/**
 * Created by ravipiyush on 09/04/17.
 */

public class DynamuiObjectProperty {
    private String Methodname ;
    private DynamuiObjectParams[] Parameters  ;

    public DynamuiObjectProperty(String methodname, DynamuiObjectParams[] parameters) {
        Methodname = methodname;
        Parameters = parameters;
    }

    public String getMethodname() {
        return Methodname;
    }

    public void setMethodname(String methodname) {
        Methodname = methodname;
    }

    public DynamuiObjectParams[] getParameters() {
        return Parameters;
    }

    public void setParameters(DynamuiObjectParams[] parameters) {
        Parameters = parameters;
    }
}
