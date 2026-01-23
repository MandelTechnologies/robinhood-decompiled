package com.mux.stats.sdk.core.model;

import java.util.ArrayList;
import org.json.JSONException;

/* loaded from: classes27.dex */
public class ViewerData extends BaseQueryData {
    public static final ArrayList<String> keys;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        keys = arrayList;
        arrayList.add("ualeg");
        arrayList.add("ualnm");
        arrayList.add("ualve");
        arrayList.add("udvcg");
        arrayList.add("udvmn");
        arrayList.add("udvmo");
        arrayList.add("uosar");
        arrayList.add("uosfm");
        arrayList.add("uosve");
        arrayList.add("ucxty");
        arrayList.add("uti");
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
        String str10;
        StringBuilder sb = new StringBuilder("ViewerData: ");
        String str11 = "";
        if (getViewerApplicationEngine() != null) {
            str = "\n    viewerApplicationEngine: " + getViewerApplicationEngine();
        } else {
            str = "";
        }
        sb.append(str);
        if (getViewerApplicationName() != null) {
            str2 = "\n    viewerApplicationName: " + getViewerApplicationName();
        } else {
            str2 = "";
        }
        sb.append(str2);
        if (getViewerApplicationVersion() != null) {
            str3 = "\n    viewerApplicationVersion: " + getViewerApplicationVersion();
        } else {
            str3 = "";
        }
        sb.append(str3);
        if (getViewerDeviceCategory() != null) {
            str4 = "\n    viewerDeviceCategory: " + getViewerDeviceCategory();
        } else {
            str4 = "";
        }
        sb.append(str4);
        if (getViewerDeviceManufacturer() != null) {
            str5 = "\n    viewerDeviceManufacturer: " + getViewerDeviceManufacturer();
        } else {
            str5 = "";
        }
        sb.append(str5);
        if (getViewerDeviceModel() != null) {
            str6 = "\n    viewerDeviceModel: " + getViewerDeviceModel();
        } else {
            str6 = "";
        }
        sb.append(str6);
        if (getViewerOsArchitecture() != null) {
            str7 = "\n    viewerOsArchitecture: " + getViewerOsArchitecture();
        } else {
            str7 = "";
        }
        sb.append(str7);
        if (getViewerOsFamily() != null) {
            str8 = "\n    viewerOsFamily: " + getViewerOsFamily();
        } else {
            str8 = "";
        }
        sb.append(str8);
        if (getViewerOsVersion() != null) {
            str9 = "\n    viewerOsVersion: " + getViewerOsVersion();
        } else {
            str9 = "";
        }
        sb.append(str9);
        if (getViewerConnectionType() != null) {
            str10 = "\n    viewerConnectionType: " + getViewerConnectionType();
        } else {
            str10 = "";
        }
        sb.append(str10);
        if (getViewerTime() != null) {
            str11 = "\n    viewerTime: " + getViewerTime();
        }
        sb.append(str11);
        return sb.toString();
    }

    public String getViewerApplicationEngine() {
        return get("ualeg");
    }

    public String getViewerApplicationName() {
        return get("ualnm");
    }

    public String getViewerApplicationVersion() {
        return get("ualve");
    }

    public String getViewerConnectionType() {
        return get("ucxty");
    }

    public String getViewerDeviceCategory() {
        return get("udvcg");
    }

    public String getViewerDeviceManufacturer() {
        return get("udvmn");
    }

    public String getViewerDeviceModel() {
        return get("udvmo");
    }

    public String getViewerOsArchitecture() {
        return get("uosar");
    }

    public String getViewerOsFamily() {
        return get("uosfm");
    }

    public String getViewerOsVersion() {
        return get("uosve");
    }

    public Long getViewerTime() throws JSONException {
        String str = get("uti");
        if (str == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public void setViewerApplicationName(String str) throws JSONException {
        if (str != null) {
            put("ualnm", str);
        }
    }

    public void setViewerApplicationVersion(String str) throws JSONException {
        if (str != null) {
            put("ualve", str);
        }
    }

    public void setViewerConnectionType(String str) throws JSONException {
        if (str != null) {
            put("ucxty", str);
        }
    }

    public void setViewerDeviceCategory(String str) throws JSONException {
        if (str != null) {
            put("udvcg", str);
        }
    }

    public void setViewerDeviceManufacturer(String str) throws JSONException {
        if (str != null) {
            put("udvmn", str);
        }
    }

    public void setViewerDeviceModel(String str) throws JSONException {
        if (str != null) {
            put("udvmo", str);
        }
    }

    public void setViewerDeviceName(String str) throws JSONException {
        if (str != null) {
            put("udvnm", str);
        }
    }

    public void setViewerOsArchitecture(String str) throws JSONException {
        if (str != null) {
            put("uosar", str);
        }
    }

    public void setViewerOsFamily(String str) throws JSONException {
        if (str != null) {
            put("uosfm", str);
        }
    }

    public void setViewerOsVersion(String str) throws JSONException {
        if (str != null) {
            put("uosve", str);
        }
    }

    @Override // com.mux.stats.sdk.core.model.BaseQueryData
    public void sync() {
    }
}
