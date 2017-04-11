package sodevan.dynamui;

/**
 * Created by ravipiyush on 09/04/17.
 */

public class DynamuiObjectParams {

    private Class<?> Paramtype ;
    private String Paramvalue ;
    private Class<?> ParserClass ;
    private String Parsermethod ;


    public DynamuiObjectParams(Class<?> paramtype, String paramvalue, Class<?> parserClass, String parsermethod) {
        Paramtype = paramtype;
        Paramvalue = paramvalue;
        ParserClass = parserClass;
        Parsermethod = parsermethod;
    }

    public Class<?> getParamtype() {
        return Paramtype;
    }

    public void setParamtype(Class<?> paramtype) {
        Paramtype = paramtype;
    }

    public String getParamvalue() {
        return Paramvalue;
    }

    public void setParamvalue(String paramvalue) {
        Paramvalue = paramvalue;
    }

    public Class<?> getParserClass() {
        return ParserClass;
    }

    public void setParserClass(Class<?> parserClass) {
        ParserClass = parserClass;
    }

    public String getParsermethod() {
        return Parsermethod;
    }

    public void setParsermethod(String parsermethod) {
        Parsermethod = parsermethod;
    }
}
