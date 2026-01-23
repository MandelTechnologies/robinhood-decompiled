package com.nimbusds.jose.shaded.json.writer;

import com.nimbusds.jose.shaded.json.JSONArray;
import com.nimbusds.jose.shaded.json.JSONAwareEx;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes27.dex */
public class DefaultMapperOrdered extends JsonReaderI<JSONAwareEx> {
    protected DefaultMapperOrdered(JsonReader jsonReader) {
        super(jsonReader);
    }

    @Override // com.nimbusds.jose.shaded.json.writer.JsonReaderI
    public JsonReaderI<JSONAwareEx> startObject(String str) {
        return this.base.DEFAULT_ORDERED;
    }

    @Override // com.nimbusds.jose.shaded.json.writer.JsonReaderI
    public JsonReaderI<JSONAwareEx> startArray(String str) {
        return this.base.DEFAULT_ORDERED;
    }

    @Override // com.nimbusds.jose.shaded.json.writer.JsonReaderI
    public void setValue(Object obj, String str, Object obj2) {
        ((Map) obj).put(str, obj2);
    }

    @Override // com.nimbusds.jose.shaded.json.writer.JsonReaderI
    public Object createObject() {
        return new LinkedHashMap();
    }

    @Override // com.nimbusds.jose.shaded.json.writer.JsonReaderI
    public void addValue(Object obj, Object obj2) {
        ((JSONArray) obj).add(obj2);
    }

    @Override // com.nimbusds.jose.shaded.json.writer.JsonReaderI
    public Object createArray() {
        return new JSONArray();
    }
}
