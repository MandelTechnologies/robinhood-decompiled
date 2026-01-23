package com.mux.stats.sdk.core.model;

import java.util.ArrayList;

/* loaded from: classes27.dex */
public class CustomerViewData extends BaseQueryData {
    public static final ArrayList<String> keys;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        keys = arrayList;
        arrayList.add("xseid");
        arrayList.add("ivwseid");
        arrayList.add("iviep");
        arrayList.add("xdrty");
    }

    @Override // com.mux.stats.sdk.core.model.BaseQueryData
    public String getDebugString() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder("CustomerViewData: ");
        String str4 = "";
        if (getViewDrmType() != null) {
            str = "\n    viewDrmType: " + getViewDrmType();
        } else {
            str = "";
        }
        sb.append(str);
        if (getViewSessionId() != null) {
            str2 = "\n    viewSessionId: " + getViewSessionId();
        } else {
            str2 = "";
        }
        sb.append(str2);
        if (getInternalViewSessionId() != null) {
            str3 = "\n    internalViewSessionId: " + getInternalViewSessionId();
        } else {
            str3 = "";
        }
        sb.append(str3);
        if (getInternalVideoExperiments() != null) {
            str4 = "\n    getInternalVideoExperiments: " + getInternalVideoExperiments();
        }
        sb.append(str4);
        return sb.toString();
    }

    public String getInternalVideoExperiments() {
        return get("iviep");
    }

    public String getInternalViewSessionId() {
        return get("ivwseid");
    }

    public String getViewDrmType() {
        return get("xdrty");
    }

    public String getViewSessionId() {
        return get("xseid");
    }

    @Override // com.mux.stats.sdk.core.model.BaseQueryData
    public void sync() {
    }
}
