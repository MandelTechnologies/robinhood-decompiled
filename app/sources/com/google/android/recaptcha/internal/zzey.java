package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p481io.IOStreams;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzey {
    private final HttpURLConnection zza;

    public zzey(HttpURLConnection httpURLConnection) {
        this.zza = httpURLConnection;
    }

    private final InputStream zzf() throws zzbf {
        try {
            return this.zza.getInputStream();
        } catch (UnknownServiceException e) {
            throw new zzbf(zzbd.zzc, zzbc.zzaf, e.getMessage());
        } catch (IOException e2) {
            throw new zzbf(zzbd.zzc, zzbc.zzae, e2.getMessage());
        } catch (Exception e3) {
            throw new zzbf(zzbd.zzc, zzbc.zzak, e3.getMessage());
        }
    }

    private final OutputStream zzg() throws zzbf {
        try {
            return this.zza.getOutputStream();
        } catch (UnknownServiceException e) {
            throw new zzbf(zzbd.zzc, zzbc.zzaf, e.getMessage());
        } catch (IOException e2) {
            throw new zzbf(zzbd.zzc, zzbc.zzae, e2.getMessage());
        } catch (Exception e3) {
            throw new zzbf(zzbd.zzc, zzbc.zzak, e3.getMessage());
        }
    }

    public final zzoq zza(zzoq zzoqVar) throws IOException, zzbf {
        try {
            int responseCode = this.zza.getResponseCode();
            if (responseCode != 200) {
                if (responseCode == 400) {
                    throw new zzbf(zzbd.zzc, zzbc.zzau, null);
                }
                if (responseCode != 503 && responseCode != 403) {
                    if (responseCode != 404) {
                        throw new zzbf(zzbd.zzc, zzbc.zzK, null);
                    }
                    throw new zzbf(zzbd.zzc, zzbc.zzi, null);
                }
                throw new zzbf(zzbd.zzi, zzbc.zzJ, null);
            }
            byte[] bytes = IOStreams.readBytes(zzf());
            if (bytes.length == 0) {
                throw new zzbf(zzbd.zzc, zzbc.zzat, null);
            }
            try {
                Object objZzb = zzoqVar.zzC().zzb(bytes);
                Intrinsics.checkNotNull(objZzb, "null cannot be cast to non-null type T of com.google.android.libraries.abuse.recaptcha.network.CaptchaFeConnection.getResponse");
                return (zzoq) objZzb;
            } catch (Exception e) {
                throw new zzbf(zzbd.zzc, zzbc.zzG, e.getMessage());
            }
        } catch (Exception e2) {
            throw new zzbf(zzbd.zzc, zzbc.zzah, e2.getMessage());
        }
    }

    public final HttpURLConnection zzb() {
        return this.zza;
    }

    public final void zzd() {
        this.zza.disconnect();
    }

    public final void zze(byte[] bArr) throws IOException, zzbf {
        try {
            zzg().write(bArr);
        } catch (zzbf e) {
            throw e;
        } catch (IOException e2) {
            throw new zzbf(zzbd.zzc, zzbc.zzag, e2.getMessage());
        } catch (Exception e3) {
            throw new zzbf(zzbd.zzc, zzbc.zzal, e3.getMessage());
        }
    }

    public final void zzc() throws IOException, zzbf {
        try {
            this.zza.connect();
        } catch (SocketTimeoutException e) {
            throw new zzbf(zzbd.zzc, zzbc.zzac, e.getMessage());
        } catch (IOException e2) {
            throw new zzbf(zzbd.zzc, zzbc.zzad, e2.getMessage());
        } catch (Exception e3) {
            throw new zzbf(zzbd.zzc, zzbc.zzaj, e3.getMessage());
        }
    }
}
