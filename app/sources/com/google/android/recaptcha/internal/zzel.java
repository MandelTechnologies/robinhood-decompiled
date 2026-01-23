package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzel {
    private final String zza;
    private final long zzb;
    private final int zzc;

    public zzel(String str, long j, int i) {
        this.zza = str;
        this.zzb = j;
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzel)) {
            return false;
        }
        zzel zzelVar = (zzel) obj;
        return Intrinsics.areEqual(zzelVar.zza, this.zza) && zzelVar.zzb == this.zzb && zzelVar.zzc == this.zzc;
    }

    public final int zza() {
        return this.zzc;
    }

    public final long zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zza;
    }
}
