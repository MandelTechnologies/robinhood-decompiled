package com.nimbusds.jose.shaded.json.reader;

import com.nimbusds.jose.shaded.asm.Accessor;
import com.nimbusds.jose.shaded.asm.BeansAccess;
import com.nimbusds.jose.shaded.json.JSONObject;
import com.nimbusds.jose.shaded.json.JSONStyle;
import com.nimbusds.jose.shaded.json.JSONUtil;
import java.io.IOException;

/* loaded from: classes27.dex */
public class BeansWriterASM implements JsonWriterI<Object> {
    @Override // com.nimbusds.jose.shaded.json.reader.JsonWriterI
    public <E> void writeJSONString(E e, Appendable appendable, JSONStyle jSONStyle) throws ClassNotFoundException, SecurityException, IOException {
        BeansAccess beansAccess = BeansAccess.get(e.getClass(), JSONUtil.JSON_SMART_FIELD_FILTER);
        appendable.append('{');
        boolean z = false;
        for (Accessor accessor : beansAccess.getAccessors()) {
            Object obj = beansAccess.get((BeansAccess) e, accessor.getIndex());
            if (obj != null || !jSONStyle.ignoreNull()) {
                if (z) {
                    appendable.append(',');
                } else {
                    z = true;
                }
                JSONObject.writeJSONKV(accessor.getName(), obj, appendable, jSONStyle);
            }
        }
        appendable.append('}');
    }
}
