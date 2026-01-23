package com.mux.stats.sdk.core.model;

import java.util.LinkedList;
import java.util.List;

/* loaded from: classes27.dex */
public final class AdData extends BaseQueryData {
    public static final List<String> keys;

    static {
        LinkedList linkedList = new LinkedList();
        keys = linkedList;
        linkedList.add("dasur");
        linkedList.add("dcrid");
        linkedList.add("did");
        linkedList.add("dtaur");
        linkedList.add("dunid");
    }

    @Override // com.mux.stats.sdk.core.model.BaseQueryData
    public final void sync() {
    }
}
