package com.nimbusds.jose.shaded.json.writer;

import com.nimbusds.jose.shaded.json.parser.ParseException;
import java.io.IOException;

/* loaded from: classes27.dex */
public abstract class JsonReaderI<T> {
    private static String ERR_MSG = "Invalid or non Implemented status";
    public final JsonReader base;

    public abstract void addValue(Object obj, Object obj2) throws ParseException, IOException;

    /* JADX WARN: Multi-variable type inference failed */
    public T convert(Object obj) {
        return obj;
    }

    public abstract Object createArray();

    public JsonReaderI(JsonReader jsonReader) {
        this.base = jsonReader;
    }

    public JsonReaderI<?> startObject(String str) throws ParseException, IOException {
        throw new RuntimeException(ERR_MSG + " startObject(String key) in " + getClass() + " key=" + str);
    }

    public JsonReaderI<?> startArray(String str) throws ParseException, IOException {
        throw new RuntimeException(ERR_MSG + " startArray in " + getClass() + " key=" + str);
    }

    public void setValue(Object obj, String str, Object obj2) throws ParseException, IOException {
        throw new RuntimeException(ERR_MSG + " setValue in " + getClass() + " key=" + str);
    }

    public Object createObject() {
        throw new RuntimeException(ERR_MSG + " createObject() in " + getClass());
    }
}
