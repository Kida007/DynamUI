package sodevan.dynamui;

/**
 * Created by ravipiyush on 08/04/17.
 */

public class DynamuiObject {
    private String Classname;
    private DynamuiObjectProperty[] Properties;
    private String Status;
    private DynamuiListener dynamuiListener;
    private int Id;
    private int objheight;
    private int objwidth;
    private DynamuiPosition posi;


    public DynamuiObject(String classname, DynamuiObjectProperty[] properties, String status, DynamuiListener dynamuiListener, int id, int objheight, int objwidth, DynamuiPosition posi) {
        Classname = classname;
        Properties = properties;
        Status = status;
        this.dynamuiListener = dynamuiListener;
        Id = id;
        this.objheight = objheight;
        this.objwidth = objwidth;
        this.posi = posi;
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

    public DynamuiListener getDynamuiListener() {
        return dynamuiListener;
    }

    public void setDynamuiListener(DynamuiListener dynamuiListener) {
        this.dynamuiListener = dynamuiListener;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getObjheight() {
        return objheight;
    }

    public void setObjheight(int objheight) {
        this.objheight = objheight;
    }

    public int getObjwidth() {
        return objwidth;
    }

    public void setObjwidth(int objwidth) {
        this.objwidth = objwidth;
    }

    public DynamuiPosition getPosi() {
        return posi;
    }

    public void setPosi(DynamuiPosition posi) {
        this.posi = posi;
    }
}