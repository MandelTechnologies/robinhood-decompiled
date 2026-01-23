package com.google.android.recaptcha.internal;

import java.net.HttpURLConnection;
import java.net.ProtocolException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzez {
    private final zzfo zza;

    /* JADX WARN: Multi-variable type inference failed */
    public zzez() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ zzez(zzfo zzfoVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this.zza = new zzfo();
    }

    public final zzey zza(String str) throws ProtocolException, zzbf {
        try {
            HttpURLConnection httpURLConnectionZza = this.zza.zza(str);
            httpURLConnectionZza.setRequestMethod("POST");
            httpURLConnectionZza.setDoOutput(true);
            httpURLConnectionZza.setRequestProperty("Content-Type", "application/x-protobuffer");
            return new zzey(httpURLConnectionZza);
        } catch (zzbf e) {
            throw e;
        } catch (Exception e2) {
            throw new zzbf(zzbd.zzc, zzbc.zzai, e2.getMessage());
        }
    }
}
