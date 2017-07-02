package sodevan.dynamui;

/**
 * Created by ravipiyush on 09/04/17.
 */

public class DynamuiObjectParams {

    private String Paramtype ;
    private String Paramvalue ;
    private String ParserClass ;
    private String Parsermethod ;
    private String Paramid ;

    public DynamuiObjectParams(String paramtype, String paramvalue, String parserClass, String parsermethod, String paramid) {
        Paramtype = paramtype;
        Paramvalue = paramvalue;
        ParserClass = parserClass;
        Parsermethod = parsermethod;
        Paramid = paramid;
    }


    public String getParamtype() {

        return Paramtype;


    }

    public void setParamtype(String paramtype) {
        Paramtype = paramtype;
    }

    public String getParamvalue() {
        return Paramvalue;
    }

    public void setParamvalue(String paramvalue) {
        Paramvalue = paramvalue;
    }

    public String getParserClass() {
        return ParserClass;
    }

    public void setParserClass(String parserClass) {
        ParserClass = parserClass;
    }

    public String getParsermethod() {
        return Parsermethod;
    }

    public void setParsermethod(String parsermethod) {
        Parsermethod = parsermethod;
    }

    public String getParamid() {
        return Paramid;
    }

    public void setParamid(String paramid) {
        Paramid = paramid;
    }
}
