package sodevan.dynamui;

/**
 * Created by ravipiyush on 22/04/17.
 */

public class DynamuiListener {
    private String listenername ;
    private DynamuiTask[] objoperations ;
    private int totaloper ;

    public DynamuiListener(String listenername, DynamuiTask[] objoperations, int totaloper) {
        this.listenername = listenername;
        this.objoperations = objoperations;
        this.totaloper = totaloper;
    }


    public String getListenername() {
        return listenername;
    }

    public void setListenername(String listenername) {
        this.listenername = listenername;
    }

    public DynamuiTask[] getObjoperations() {
        return objoperations;
    }

    public void setObjoperations(DynamuiTask[] objoperations) {
        this.objoperations = objoperations;
    }

    public int getTotaloper() {
        return totaloper;
    }

    public void setTotaloper(int totaloper) {
        this.totaloper = totaloper;
    }
}
