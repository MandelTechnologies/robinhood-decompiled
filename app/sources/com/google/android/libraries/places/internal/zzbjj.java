package com.google.android.libraries.places.internal;

import java.util.ArrayList;

/* compiled from: com.google.android.libraries.places:places@@3.5.0 */
/* loaded from: classes27.dex */
public final class zzbjj {
    private final ArrayList zza = new ArrayList();

    public final String toString() {
        return this.zza.toString();
    }

    public final zzbjj zza(Object obj) {
        this.zza.add(obj.toString());
        return this;
    }

    public final zzbjj zzb(String str, Object obj) {
        this.zza.add(str + "=" + String.valueOf(obj));
        return this;
    }
}
