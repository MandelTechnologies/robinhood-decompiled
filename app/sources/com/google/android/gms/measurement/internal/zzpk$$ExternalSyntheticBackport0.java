package com.google.android.gms.measurement.internal;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes27.dex */
public final /* synthetic */ class zzpk$$ExternalSyntheticBackport0 {
    /* renamed from: m */
    public static /* synthetic */ Set m829m(Object[] objArr) {
        HashSet hashSet = new HashSet(objArr.length);
        for (Object obj : objArr) {
            Objects.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException("duplicate element: " + obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
