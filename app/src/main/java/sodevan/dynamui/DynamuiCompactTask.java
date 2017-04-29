package sodevan.dynamui;

import java.lang.reflect.Method;

/**
 * Created by ravipiyush on 30/04/17.
 */

public class DynamuiCompactTask {

    Object o ;
    Method m ;
    Object[] fp ;

    public DynamuiCompactTask(Object o, Method m, Object[] fp) {
        this.o = o;
        this.m = m;
        this.fp = fp;
    }


    public Object getO() {
        return o;
    }

    public void setO(Object o) {
        this.o = o;
    }

    public Method getM() {
        return m;
    }

    public void setM(Method m) {
        this.m = m;
    }

    public Object[] getFp() {
        return fp;
    }

    public void setFp(Object[] fp) {
        this.fp = fp;
    }
}
