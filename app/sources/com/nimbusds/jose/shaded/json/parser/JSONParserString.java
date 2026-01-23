package com.nimbusds.jose.shaded.json.parser;

import com.nimbusds.jose.shaded.json.JSONValue;
import com.nimbusds.jose.shaded.json.writer.JsonReaderI;

/* loaded from: classes27.dex */
class JSONParserString extends JSONParserMemory {

    /* renamed from: in */
    private String f1210in;

    public JSONParserString(int i) {
        super(i);
    }

    public Object parse(String str) throws ParseException {
        return parse(str, JSONValue.defaultReader.DEFAULT);
    }

    public <T> T parse(String str, JsonReaderI<T> jsonReaderI) throws ParseException {
        this.base = jsonReaderI.base;
        this.f1210in = str;
        this.len = str.length();
        return (T) parse(jsonReaderI);
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserMemory
    protected void extractString(int i, int i2) {
        this.f1207xs = this.f1210in.substring(i, i2);
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserMemory
    protected void extractStringTrim(int i, int i2) {
        while (i < i2 - 1 && Character.isWhitespace(this.f1210in.charAt(i))) {
            i++;
        }
        while (true) {
            int i3 = i2 - 1;
            if (i3 <= i || !Character.isWhitespace(this.f1210in.charAt(i3))) {
                break;
            } else {
                i2--;
            }
        }
        extractString(i, i2);
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserMemory
    protected int indexOf(char c, int i) {
        return this.f1210in.indexOf(c, i);
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    protected void read() {
        int i = this.pos + 1;
        this.pos = i;
        if (i >= this.len) {
            this.f1204c = (char) 26;
        } else {
            this.f1204c = this.f1210in.charAt(i);
        }
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    protected void readS() {
        int i = this.pos + 1;
        this.pos = i;
        if (i >= this.len) {
            this.f1204c = (char) 26;
        } else {
            this.f1204c = this.f1210in.charAt(i);
        }
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    protected void readNoEnd() throws ParseException {
        int i = this.pos + 1;
        this.pos = i;
        if (i >= this.len) {
            this.f1204c = (char) 26;
            throw new ParseException(this.pos - 1, 3, "EOF");
        }
        this.f1204c = this.f1210in.charAt(i);
    }
}
