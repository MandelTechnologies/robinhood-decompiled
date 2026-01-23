package com.mux.stats.sdk.core.model;

import java.util.ArrayList;
import org.json.JSONException;

/* loaded from: classes27.dex */
public class CustomerPlayerData extends BaseQueryData {
    public static final ArrayList<String> keys;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        keys = arrayList;
        arrayList.add("dcnva");
        arrayList.add("fnm");
        arrayList.add("wty");
        arrayList.add("piiti");
        arrayList.add("pnm");
        arrayList.add("pve");
        arrayList.add("ake");
        arrayList.add("ypyid");
        arrayList.add("uusid");
    }

    public String getAdConfigVariant() {
        return get("dcnva");
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
        String str8;
        String str9;
        StringBuilder sb = new StringBuilder("CustomerPlayerData: ");
        String str10 = "";
        if (getAdConfigVariant() != null) {
            str = "\n    adConfigVariant: " + getAdConfigVariant();
        } else {
            str = "";
        }
        sb.append(str);
        if (getExperimentName() != null) {
            str2 = "\n    experimentName: " + getExperimentName();
        } else {
            str2 = "";
        }
        sb.append(str2);
        if (getPageType() != null) {
            str3 = "\n    pageType: " + getPageType();
        } else {
            str3 = "";
        }
        sb.append(str3);
        if (getPlayerInitTime() != null) {
            str4 = "\n    playerInitTime: " + getPlayerInitTime();
        } else {
            str4 = "";
        }
        sb.append(str4);
        if (getPlayerName() != null) {
            str5 = "\n    playerName: " + getPlayerName();
        } else {
            str5 = "";
        }
        sb.append(str5);
        if (getPlayerVersion() != null) {
            str6 = "\n    playerVersion: " + getPlayerVersion();
        } else {
            str6 = "";
        }
        sb.append(str6);
        if (getEnvironmentKey() != null) {
            str7 = "\n    environmentKey: " + getEnvironmentKey();
        } else {
            str7 = "";
        }
        sb.append(str7);
        if (getPropertyKey() != null) {
            str8 = "\n    propertyKey: " + getPropertyKey();
        } else {
            str8 = "";
        }
        sb.append(str8);
        if (getSubPropertyId() != null) {
            str9 = "\n    subPropertyId: " + getSubPropertyId();
        } else {
            str9 = "";
        }
        sb.append(str9);
        if (getViewerUserId() != null) {
            str10 = "\n    viewerUserId: " + getViewerUserId();
        }
        sb.append(str10);
        return sb.toString();
    }

    public String getEnvironmentKey() {
        return get("ake");
    }

    public String getExperimentName() {
        return get("fnm");
    }

    public String getPageType() {
        return get("wty");
    }

    public Long getPlayerInitTime() throws JSONException {
        String str = get("piiti");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public String getPlayerName() {
        return get("pnm");
    }

    public String getPlayerVersion() {
        return get("pve");
    }

    public String getPropertyKey() {
        return get("ake");
    }

    public String getSubPropertyId() {
        return get("ypyid");
    }

    public String getViewerUserId() {
        return get("uusid");
    }

    public void setEnvironmentKey(String str) throws JSONException {
        if (str != null) {
            put("ake", str);
        }
    }

    public void setPlayerName(String str) throws JSONException {
        if (str != null) {
            put("pnm", str);
        }
    }

    @Override // com.mux.stats.sdk.core.model.BaseQueryData
    public void sync() {
    }
}
