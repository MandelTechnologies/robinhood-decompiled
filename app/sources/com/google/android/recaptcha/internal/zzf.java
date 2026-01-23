package com.google.android.recaptcha.internal;

import kotlinx.coroutines.Timeout4;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzf {
    public static final zzbf zza(Exception exc, zzbf zzbfVar) {
        return exc instanceof Timeout4 ? new zzbf(zzbd.zzb, zzbc.zzb, exc.getMessage()) : exc instanceof zzbf ? (zzbf) exc : zzbfVar;
    }
}
