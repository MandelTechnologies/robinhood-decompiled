package com.mux.stats.sdk.core.model;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes27.dex */
public abstract class BaseQueryData {

    /* renamed from: a */
    private static ArrayList<String> f1049a = new ArrayList<>();

    /* renamed from: b */
    private static ArrayList<String> f1050b = new ArrayList<>();
    protected JSONObject query = new JSONObject();

    static {
        f1049a.add("qrphe");
        f1049a.add("qrfls");
        f1050b.add("media");
    }

    public static boolean isKeyJsonObject(String str) {
        return f1049a.contains(str);
    }

    public void clear() {
        this.query = new JSONObject();
    }

    public String get(String str) throws JSONException {
        if (!this.query.has(str)) {
            return null;
        }
        String string2 = this.query.getString(str);
        if (string2.isEmpty()) {
            return null;
        }
        return string2;
    }

    public String getDebugString() {
        return "BaseQueryData: \n    query: \n" + this.query.toString(2);
    }

    public JSONObject getMuxDictionary() {
        return new JSONObject(this.query.toString());
    }

    public JSONArray keys() {
        return this.query.names() == null ? new JSONArray() : this.query.names();
    }

    public void put(String str, String str2) throws JSONException {
        this.query.put(str, str2);
    }

    public void put(String str, JSONObject jSONObject) throws JSONException {
        this.query.put(str, jSONObject);
    }

    public void remove(String str) {
        this.query.remove(str);
    }

    public void replace(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.query = new JSONObject(jSONObject.toString());
            sync();
        }
    }

    public abstract void sync();

    public void update(BaseQueryData baseQueryData) {
        if (baseQueryData != null) {
            synchronized (this) {
                try {
                    synchronized (baseQueryData) {
                        update(baseQueryData.query);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void update(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArrayNames = jSONObject.names();
        if (jSONArrayNames == null) {
            return;
        }
        int i = 0;
        while (i < jSONArrayNames.length()) {
            String str = (String) jSONArrayNames.get(i);
            if (isKeyJsonObject(str)) {
                this.query.put(str, new JSONObject(jSONObject.getJSONObject(str).toString()));
            } else if (isKeyJsonObject(str)) {
                JSONArray jSONArray = jSONObject.getJSONArray(str);
                JSONArray jSONArray2 = new JSONArray();
                while (i < jSONArray.length()) {
                    jSONArray2.put(jSONArray.get(0));
                    i++;
                }
                this.query.put(str, jSONArray2);
            } else {
                put(str, jSONObject.getString(str));
            }
            i++;
        }
    }
}
