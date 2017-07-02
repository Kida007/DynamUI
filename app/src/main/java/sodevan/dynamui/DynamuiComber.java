package sodevan.dynamui;



/**
 * Created by ravipiyush on 01/07/17.
 */

public class DynamuiComber {

    Class<?>[] classes;
    Object[] objects;


    public DynamuiComber(Class<?>[] classes, Object[] objects) {
        this.classes = classes;
        this.objects = objects;
    }


    public Class<?>[] getClasses() {
        return classes;
    }

    public void setClasses(Class<?>[] classes) {
        this.classes = classes;
    }

    public Object[] getObjects() {
        return objects;
    }

    public void setObjects(Object[] objects) {
        this.objects = objects;
    }
}
