package com.google.android.play.integrity.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.integrity.internal.d */
/* loaded from: classes27.dex */
public final class C5198d {
    /* renamed from: a */
    public static final List m970a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC5200f abstractC5200f = (AbstractC5200f) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", abstractC5200f.mo972a());
            bundle.putLong("event_timestamp", abstractC5200f.mo973b());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final void m971b(int i, List list) {
        list.add(AbstractC5200f.m974c(i, System.currentTimeMillis()));
    }
}
