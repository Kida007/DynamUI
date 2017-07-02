package sodevan.dynamui;

/**
 * Created by ravipiyush on 27/06/17.
 */

public class DynamuiPreTasks {

    private String ObjClassName ;
    private DynamuiObjectProperty[] Properties;
    private String CreatorName  ;
    private String Methodname ;
    private String applyobjid ;
    private int constructType ;
    private String pretaskid  ;

    public DynamuiPreTasks(String objClassName, DynamuiObjectProperty[] properties, String creatorName, String methodname, String applyobjid, int constructType, String pretaskid) {
        ObjClassName = objClassName;
        Properties = properties;
        CreatorName = creatorName;
        Methodname = methodname;
        this.applyobjid = applyobjid;
        this.constructType = constructType;
        this.pretaskid = pretaskid;

    }


    public String getObjClassName() {
        return ObjClassName;
    }

    public void setObjClassName(String objClassName) {
        ObjClassName = objClassName;
    }

    public DynamuiObjectProperty[] getProperties() {
        return Properties;
    }

    public void setProperties(DynamuiObjectProperty[] properties) {
        Properties = properties;
    }

    public String getCreatorName() {
        return CreatorName;
    }

    public void setCreatorName(String creatorName) {
        CreatorName = creatorName;
    }

    public String getMethodname() {
        return Methodname;
    }

    public void setMethodname(String methodname) {
        Methodname = methodname;
    }

    public String getApplyobjid() {
        return applyobjid;
    }

    public void setApplyobjid(String applyobjid) {
        this.applyobjid = applyobjid;
    }

    public int getConstructType() {
        return constructType;
    }

    public void setConstructType(int constructType) {
        this.constructType = constructType;
    }

    public String getPretaskid() {
        return pretaskid;
    }

    public void setPretaskid(String pretaskid) {
        this.pretaskid = pretaskid ;
    }
}


