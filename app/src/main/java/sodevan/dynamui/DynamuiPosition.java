package sodevan.dynamui;

/**
 * Created by ravipiyush on 22/06/17.
 */

public class DynamuiPosition {
    int rlposiparam  ;
    int rlobjid ;

    public DynamuiPosition(int rlposiparam, int rlobjid) {
        this.rlposiparam = rlposiparam;
        this.rlobjid = rlobjid;
    }


    public int getRlposiparam() {
        return rlposiparam;
    }

    public void setRlposiparam(int rlposiparam) {
        this.rlposiparam = rlposiparam;
    }

    public int getRlobjid() {
        return rlobjid;
    }

    public void setRlobjid(int rlobjid) {
        this.rlobjid = rlobjid;
    }
}
