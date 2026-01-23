package com.nimbusds.jose.shaded.json;

import com.nimbusds.jose.shaded.json.reader.JsonWriter;
import com.nimbusds.jose.shaded.json.reader.JsonWriterI;
import com.nimbusds.jose.shaded.json.writer.JsonReader;
import java.io.IOException;

/* loaded from: classes27.dex */
public class JSONValue {
    public static JSONStyle COMPRESSION = JSONStyle.NO_COMPRESS;
    public static final JsonWriter defaultWriter = new JsonWriter();
    public static final JsonReader defaultReader = new JsonReader();

    public static void writeJSONString(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
        if (obj == null) {
            appendable.append("null");
            return;
        }
        Class<?> cls = obj.getClass();
        JsonWriter jsonWriter = defaultWriter;
        JsonWriterI<Object> write = jsonWriter.getWrite(cls);
        if (write == null) {
            if (cls.isArray()) {
                write = JsonWriter.arrayWriter;
            } else {
                write = jsonWriter.getWriterByInterface(obj.getClass());
                if (write == null) {
                    write = JsonWriter.beansWriterASM;
                }
            }
            jsonWriter.registerWriter(write, cls);
        }
        write.writeJSONString(obj, appendable, jSONStyle);
    }

    public static void escape(String str, Appendable appendable, JSONStyle jSONStyle) {
        if (str == null) {
            return;
        }
        jSONStyle.escape(str, appendable);
    }
}
