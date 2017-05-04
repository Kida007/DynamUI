package sodevan.dynamui;

import java.lang.reflect.Method;
import java.util.LinkedHashMap;

/**
 * Created by ravipiyush on 30/04/17.
 */

public class DynamuiCompactTask {

    Object finalTaskObject ;
    LinkedHashMap<Method , Object[]> finalTaskMethod ;

    public DynamuiCompactTask(Object finalTaskObject, LinkedHashMap<Method, Object[]> finalTaskMethod) {
        this.finalTaskObject = finalTaskObject;
        this.finalTaskMethod = finalTaskMethod;
    }

    public Object getFinalTaskObject() {
        return finalTaskObject;
    }

    public void setFinalTaskObject(Object finalTaskObject) {
        this.finalTaskObject = finalTaskObject;
    }

    public LinkedHashMap<Method, Object[]> getFinalTaskMethod() {
        return finalTaskMethod;
    }

    public void setFinalTaskMethod(LinkedHashMap<Method, Object[]> finalTaskMethod) {
        this.finalTaskMethod = finalTaskMethod;
    }
}
