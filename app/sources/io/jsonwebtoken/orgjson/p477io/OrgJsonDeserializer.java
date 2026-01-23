package io.jsonwebtoken.orgjson.p477io;

import io.jsonwebtoken.lang.Assert;
import io.jsonwebtoken.lang.Strings;
import io.jsonwebtoken.p476io.DeserializationException;
import io.jsonwebtoken.p476io.Deserializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes14.dex */
public class OrgJsonDeserializer implements Deserializer<Object> {
    @Override // io.jsonwebtoken.p476io.Deserializer
    public Object deserialize(byte[] bArr) throws DeserializationException {
        Assert.notNull(bArr, "JSON byte array cannot be null");
        if (bArr.length == 0) {
            throw new DeserializationException("Invalid JSON: zero length byte array.");
        }
        try {
            return parse(new String(bArr, Strings.UTF_8));
        } catch (Exception e) {
            throw new DeserializationException("Invalid JSON: " + e.getMessage(), e);
        }
    }

    private Object parse(String str) throws JSONException {
        JSONTokener jSONTokener = new JSONTokener(str);
        char cNextClean = jSONTokener.nextClean();
        jSONTokener.back();
        if (cNextClean == '{') {
            return toMap(new JSONObject(jSONTokener));
        }
        if (cNextClean == '[') {
            return toList(new JSONArray(jSONTokener));
        }
        return convertIfNecessary(jSONTokener.nextValue());
    }

    private Map<String, Object> toMap(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            linkedHashMap.put(next, convertIfNecessary(jSONObject.get(next)));
        }
        return linkedHashMap;
    }

    private List<Object> toList(JSONArray jSONArray) {
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(convertIfNecessary(jSONArray.get(i)));
        }
        return arrayList;
    }

    private Object convertIfNecessary(Object obj) {
        if (JSONObject.NULL.equals(obj)) {
            return null;
        }
        if (obj instanceof JSONArray) {
            return toList((JSONArray) obj);
        }
        return obj instanceof JSONObject ? toMap((JSONObject) obj) : obj;
    }
}
