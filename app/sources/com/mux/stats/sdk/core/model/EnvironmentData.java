package com.mux.stats.sdk.core.model;

import com.singular.sdk.internal.SLRemoteConfiguration;
import java.util.ArrayList;
import org.json.JSONException;

/* loaded from: classes27.dex */
public class EnvironmentData extends BaseQueryData {
    public static final ArrayList<String> keys;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        keys = arrayList;
        arrayList.add(SLRemoteConfiguration.Constants.DEBUG_JSON_KEY);
        arrayList.add("mapve");
        arrayList.add("memve");
        arrayList.add("mem");
        arrayList.add("mvrid");
        arrayList.add("sex");
        arrayList.add("sid");
        arrayList.add("sst");
    }

    public String getDebug() {
        return get(SLRemoteConfiguration.Constants.DEBUG_JSON_KEY);
    }

    @Override // com.mux.stats.sdk.core.model.BaseQueryData
    public String getDebugString() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        StringBuilder sb = new StringBuilder("EnvironmentData: ");
        String str8 = "";
        if (getDebug() != null) {
            str = "\n    debug: " + getDebug();
        } else {
            str = "";
        }
        sb.append(str);
        if (getMuxApiVersion() != null) {
            str2 = "\n    muxApiVersion: " + getMuxApiVersion();
        } else {
            str2 = "";
        }
        sb.append(str2);
        if (getMuxEmbed() != null) {
            str3 = "\n    muxEmbed: " + getMuxEmbed();
        } else {
            str3 = "";
        }
        sb.append(str3);
        if (getMuxEmbedVersion() != null) {
            str4 = "\n    muxEmbedVersion: " + getMuxEmbedVersion();
        } else {
            str4 = "";
        }
        sb.append(str4);
        if (getMuxViewerId() != null) {
            str5 = "\n    getMuxViewerId: " + getMuxViewerId();
        } else {
            str5 = "";
        }
        sb.append(str5);
        if (getSessionExpires() != null) {
            str6 = "\n    sessionExpires: " + getSessionExpires();
        } else {
            str6 = "";
        }
        sb.append(str6);
        if (getSessionId() != null) {
            str7 = "\n    sessionId: " + getSessionId();
        } else {
            str7 = "";
        }
        sb.append(str7);
        if (getSessionStart() != null) {
            str8 = "\n    sessionStart: " + getSessionStart();
        }
        sb.append(str8);
        return sb.toString();
    }

    public String getMuxApiVersion() {
        return get("mapve");
    }

    public String getMuxEmbed() {
        return get("mem");
    }

    public String getMuxEmbedVersion() {
        return get("memve");
    }

    public String getMuxViewerId() {
        return get("mvrid");
    }

    public Long getSessionExpires() throws JSONException {
        String str = get("sex");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public String getSessionId() {
        return get("sid");
    }

    public Long getSessionStart() throws JSONException {
        String str = get("sst");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public void setMuxApiVersion(String str) throws JSONException {
        if (str != null) {
            put("mapve", str);
        }
    }

    public void setMuxEmbed(String str) throws JSONException {
        if (str != null) {
            put("mem", str);
        }
    }

    public void setMuxEmbedVersion(String str) throws JSONException {
        if (str != null) {
            put("memve", str);
        }
    }

    public void setMuxViewerId(String str) throws JSONException {
        if (str != null) {
            put("mvrid", str);
        }
    }

    public void setSessionExpires(Long l) throws JSONException {
        if (l != null) {
            put("sex", l.toString());
        }
    }

    public void setSessionId(String str) throws JSONException {
        if (str != null) {
            put("sid", str);
        }
    }

    public void setSessionStart(Long l) throws JSONException {
        if (l != null) {
            put("sst", l.toString());
        }
    }

    @Override // com.mux.stats.sdk.core.model.BaseQueryData
    public void sync() {
    }
}
