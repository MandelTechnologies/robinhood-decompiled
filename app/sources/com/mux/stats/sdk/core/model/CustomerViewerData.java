package com.mux.stats.sdk.core.model;

import java.util.ArrayList;

/* loaded from: classes27.dex */
public class CustomerViewerData extends BaseQueryData {
    public static final ArrayList<String> keys;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        keys = arrayList;
        arrayList.add("mvrdvcg");
        arrayList.add("mvrdvmn");
        arrayList.add("mvrdvnm");
        arrayList.add("mvrosfm");
        arrayList.add("mvrosve");
        arrayList.add("mvrdvmo");
    }

    @Override // com.mux.stats.sdk.core.model.BaseQueryData
    public String getDebugString() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        StringBuilder sb = new StringBuilder("CustomerViewerData: ");
        String str6 = "";
        if (getMuxViewerDeviceCategory() != null) {
            str = "\n    muxViewerDeviceCategory: " + getMuxViewerDeviceCategory();
        } else {
            str = "";
        }
        sb.append(str);
        if (getMuxViewerDeviceManufacturer() != null) {
            str2 = "\n    muxViewerDeviceManufacturer: " + getMuxViewerDeviceManufacturer();
        } else {
            str2 = "";
        }
        sb.append(str2);
        if (getMuxViewerDeviceName() != null) {
            str3 = "\n    muxViewerDeviceName: " + getMuxViewerDeviceName();
        } else {
            str3 = "";
        }
        sb.append(str3);
        if (getMuxViewerOsFamily() != null) {
            str4 = "\n    muxViewerOsFamily: " + getMuxViewerOsFamily();
        } else {
            str4 = "";
        }
        sb.append(str4);
        if (getMuxViewerOsVersion() != null) {
            str5 = "\n    muxViewerOsVersion: " + getMuxViewerOsVersion();
        } else {
            str5 = "";
        }
        sb.append(str5);
        if (getMuxViewerDeviceModel() != null) {
            str6 = "\n    muxViewerDeviceModel: " + getMuxViewerDeviceModel();
        }
        sb.append(str6);
        return sb.toString();
    }

    public String getMuxViewerDeviceCategory() {
        return get("mvrdvcg");
    }

    public String getMuxViewerDeviceManufacturer() {
        return get("mvrdvmn");
    }

    public String getMuxViewerDeviceModel() {
        return get("mvrdvmo");
    }

    public String getMuxViewerDeviceName() {
        return get("mvrdvnm");
    }

    public String getMuxViewerOsFamily() {
        return get("mvrosfm");
    }

    public String getMuxViewerOsVersion() {
        return get("mvrosve");
    }

    @Override // com.mux.stats.sdk.core.model.BaseQueryData
    public void sync() {
    }
}
