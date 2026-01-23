package com.mux.stats.sdk.core.model;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes27.dex */
public class ViewDeviceOrientationData extends BaseQueryData {
    public static final ArrayList<String> keys;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        keys = arrayList;
        arrayList.add("x");
        arrayList.add("y");
        arrayList.add("z");
    }

    public ViewDeviceOrientationData() throws JSONException {
        setOrientationX(0);
        setOrientationY(0);
        setOrientationZ(0);
    }

    public ViewDeviceOrientationData(JSONObject jSONObject) throws JSONException {
        setOrientationX(Integer.valueOf(jSONObject.getInt("x")));
        setOrientationY(Integer.valueOf(jSONObject.getInt("y")));
        setOrientationZ(Integer.valueOf(jSONObject.getInt("z")));
    }

    @Override // com.mux.stats.sdk.core.model.BaseQueryData
    public String getDebugString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("ViewDeviceOrientationData: ");
        String str3 = "";
        if (getOrientationX() != null) {
            str = "\n    x: " + getOrientationX();
        } else {
            str = "";
        }
        sb.append(str);
        if (getOrientationY() != null) {
            str2 = "\n    y: " + getOrientationY();
        } else {
            str2 = "";
        }
        sb.append(str2);
        if (getOrientationZ() != null) {
            str3 = "\n    z: " + getOrientationZ();
        }
        sb.append(str3);
        return sb.toString();
    }

    public Integer getOrientationX() throws JSONException {
        String str = get("x");
        if (str == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    public Integer getOrientationY() throws JSONException {
        String str = get("y");
        if (str == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    public Integer getOrientationZ() throws JSONException {
        String str = get("z");
        if (str == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    public void setOrientationX(Integer num) throws JSONException {
        if (num != null) {
            put("x", num.toString());
        }
    }

    public void setOrientationY(Integer num) throws JSONException {
        if (num != null) {
            put("y", num.toString());
        }
    }

    public void setOrientationZ(Integer num) throws JSONException {
        if (num != null) {
            put("z", num.toString());
        }
    }

    @Override // com.mux.stats.sdk.core.model.BaseQueryData
    public void sync() {
    }

    public String toJsonString() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("x", getOrientationX());
        jSONObject.put("y", getOrientationY());
        jSONObject.put("z", getOrientationZ());
        return jSONObject.toString();
    }
}
