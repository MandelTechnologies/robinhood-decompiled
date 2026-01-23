package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzmw {
    static final zzmw zza = new zzmw(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private final Map zzd;

    zzmw() {
        this.zzd = new HashMap();
    }

    public final zznk zza(zzoq zzoqVar, int i) {
        return (zznk) this.zzd.get(new zzmv(zzoqVar, i));
    }

    zzmw(boolean z) {
        this.zzd = Collections.EMPTY_MAP;
    }
}
