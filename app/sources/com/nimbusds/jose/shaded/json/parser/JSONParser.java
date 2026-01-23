package com.nimbusds.jose.shaded.json.parser;

/* loaded from: classes27.dex */
public class JSONParser {
    public static int DEFAULT_PERMISSIVE_MODE;
    private int mode;
    private JSONParserString pString;

    static {
        DEFAULT_PERMISSIVE_MODE = System.getProperty("JSON_SMART_SIMPLE") != null ? 4032 : -1;
    }

    private JSONParserString getPString() {
        if (this.pString == null) {
            this.pString = new JSONParserString(this.mode);
        }
        return this.pString;
    }

    public JSONParser(int i) {
        this.mode = i;
    }

    public Object parse(String str) throws ParseException {
        return getPString().parse(str);
    }
}
