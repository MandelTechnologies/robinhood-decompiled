package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzfo {
    private final Lazy zza;

    public zzfo() {
        int i = zzax.zza;
        this.zza = LazyKt.lazy(zzfn.zza);
    }

    public final HttpURLConnection zza(String str) throws IOException, zzbf {
        if (!((zzfm) this.zza.getValue()).zzb(str)) {
            throw new zzbf(zzbd.zzc, zzbc.zzQ, null);
        }
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        return (HttpURLConnection) uRLConnectionOpenConnection;
    }
}
