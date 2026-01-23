package com.google.android.recaptcha.internal;

import com.robinhood.utils.http.ContentEncoding;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p481io.ReadWrite2;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzfc implements zzfa {
    private final Lazy zza;

    public zzfc() {
        int i = zzax.zza;
        this.zza = LazyKt.lazy(zzfb.zza);
    }

    @Override // com.google.android.recaptcha.internal.zzfa
    public final zzsq zza(String str, zzun zzunVar) throws zzbf {
        zzey zzeyVarZza = null;
        try {
            try {
                try {
                    zzeyVarZza = ((zzez) this.zza.getValue()).zza(str);
                    zzeyVarZza.zzc();
                    zzeyVarZza.zze(zzunVar.zzd());
                    zzsq zzsqVar = (zzsq) zzeyVarZza.zza(zzsq.zzi());
                    zzeyVarZza.zzd();
                    return zzsqVar;
                } catch (Exception e) {
                    throw new zzbf(zzbd.zzc, zzbc.zzF, e.getMessage());
                }
            } catch (zzbf e2) {
                if (zzeyVarZza == null || !Intrinsics.areEqual(e2.zza(), zzbc.zzau)) {
                    throw e2;
                }
                try {
                    throw zzbe.zza(zzuw.zzg(zzeyVarZza.zzb().getErrorStream()).zzi());
                } catch (Exception e3) {
                    throw new zzbf(zzbd.zzc, zzbc.zzG, e3.getMessage());
                }
            }
        } catch (Throwable th) {
            if (zzeyVarZza != null) {
                zzeyVarZza.zzd();
            }
            throw th;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzfa
    public final String zzb(String str) throws IOException, zzbf {
        try {
            try {
                URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
                Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setDoInput(true);
                httpURLConnection.setRequestProperty("Accept", "application/x-protobuffer");
                httpURLConnection.setRequestProperty("Accept-Encoding", ContentEncoding.GZIP);
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() != 200) {
                    throw new zzbf(zzbd.zzc, new zzbc(httpURLConnection.getResponseCode()), null);
                }
                try {
                    return ReadWrite2.readText(Intrinsics.areEqual(ContentEncoding.GZIP, httpURLConnection.getContentEncoding()) ? new InputStreamReader(new GZIPInputStream(httpURLConnection.getInputStream())) : new InputStreamReader(httpURLConnection.getInputStream()));
                } catch (Exception unused) {
                    throw new zzbf(zzbd.zzc, zzbc.zzP, null);
                }
            } catch (Exception unused2) {
                throw new zzbf(zzbd.zzc, zzbc.zzO, null);
            }
        } catch (Exception unused3) {
            throw new zzbf(zzbd.zzb, zzbc.zzN, null);
        }
    }
}
