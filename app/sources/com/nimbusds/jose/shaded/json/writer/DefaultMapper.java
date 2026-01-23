package com.nimbusds.jose.shaded.json.writer;

import com.nimbusds.jose.shaded.json.JSONArray;
import com.nimbusds.jose.shaded.json.JSONAwareEx;
import com.nimbusds.jose.shaded.json.JSONObject;

/* loaded from: classes27.dex */
public class DefaultMapper<T> extends JsonReaderI<T> {
    protected DefaultMapper(JsonReader jsonReader) {
        super(jsonReader);
    }

    @Override // com.nimbusds.jose.shaded.json.writer.JsonReaderI
    public JsonReaderI<JSONAwareEx> startObject(String str) {
        return this.base.DEFAULT;
    }

    @Override // com.nimbusds.jose.shaded.json.writer.JsonReaderI
    public JsonReaderI<JSONAwareEx> startArray(String str) {
        return this.base.DEFAULT;
    }

    @Override // com.nimbusds.jose.shaded.json.writer.JsonReaderI
    public Object createObject() {
        return new JSONObject();
    }

    @Override // com.nimbusds.jose.shaded.json.writer.JsonReaderI
    public Object createArray() {
        return new JSONArray();
    }

    @Override // com.nimbusds.jose.shaded.json.writer.JsonReaderI
    public void setValue(Object obj, String str, Object obj2) {
        ((JSONObject) obj).put(str, obj2);
    }

    @Override // com.nimbusds.jose.shaded.json.writer.JsonReaderI
    public void addValue(Object obj, Object obj2) {
        ((JSONArray) obj).add(obj2);
    }
}
