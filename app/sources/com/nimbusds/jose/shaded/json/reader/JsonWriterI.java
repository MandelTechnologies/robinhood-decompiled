package com.nimbusds.jose.shaded.json.reader;

import com.nimbusds.jose.shaded.json.JSONStyle;
import java.io.IOException;

/* loaded from: classes27.dex */
public interface JsonWriterI<T> {
    <E extends T> void writeJSONString(E e, Appendable appendable, JSONStyle jSONStyle) throws IOException;
}
