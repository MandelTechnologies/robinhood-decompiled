package com.mux.stats.sdk.core.model;

import java.util.ArrayList;

/* loaded from: classes27.dex */
public class CustomData extends BaseQueryData {
    public static final ArrayList<String> keys;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        keys = arrayList;
        arrayList.add("c1");
        arrayList.add("c2");
        arrayList.add("c3");
        arrayList.add("c4");
        arrayList.add("c5");
        arrayList.add("c6");
        arrayList.add("c7");
        arrayList.add("c8");
        arrayList.add("c9");
        arrayList.add("c10");
    }

    public String getCustomData1() {
        return get("c1");
    }

    public String getCustomData10() {
        return get("c10");
    }

    public String getCustomData2() {
        return get("c2");
    }

    public String getCustomData3() {
        return get("c3");
    }

    public String getCustomData4() {
        return get("c4");
    }

    public String getCustomData5() {
        return get("c5");
    }

    public String getCustomData6() {
        return get("c6");
    }

    public String getCustomData7() {
        return get("c7");
    }

    public String getCustomData8() {
        return get("c8");
    }

    public String getCustomData9() {
        return get("c9");
    }

    @Override // com.mux.stats.sdk.core.model.BaseQueryData
    public String getDebugString() {
        return "CustomData: \n    CUSTOM_DATA_1: \n" + getCustomData1() + "\n    CUSTOM_DATA_2: \n" + getCustomData2() + "\n    CUSTOM_DATA_3: \n" + getCustomData3() + "\n    CUSTOM_DATA_4: \n" + getCustomData4() + "\n    CUSTOM_DATA_5: \n" + getCustomData5() + "\n    CUSTOM_DATA_6: \n" + getCustomData6() + "\n    CUSTOM_DATA_7: \n" + getCustomData7() + "\n    CUSTOM_DATA_8: \n" + getCustomData8() + "\n    CUSTOM_DATA_9: \n" + getCustomData9() + "\n    CUSTOM_DATA_10: \n" + getCustomData10();
    }

    @Override // com.mux.stats.sdk.core.model.BaseQueryData
    public void sync() {
    }
}
