package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaErrorCode;
import com.google.android.recaptcha.RecaptchaException;
import java.util.Map;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzbf extends Exception {
    public static final /* synthetic */ int zza = 0;
    private static final Map zzb;
    private final zzbd zzc;
    private final zzbc zzd;
    private final String zze;
    private final Map zzf;

    static {
        Tuples2 tuples2M3642to = Tuples4.m3642to(zzux.JS_NETWORK_ERROR, new zzbf(zzbd.zzc, zzbc.zzd, null));
        zzux zzuxVar = zzux.JS_INTERNAL_ERROR;
        zzbd zzbdVar = zzbd.zzb;
        zzb = MapsKt.mapOf(tuples2M3642to, Tuples4.m3642to(zzuxVar, new zzbf(zzbdVar, zzbc.zzc, null)), Tuples4.m3642to(zzux.JS_INVALID_SITE_KEY, new zzbf(zzbd.zzd, zzbc.zze, null)), Tuples4.m3642to(zzux.JS_INVALID_SITE_KEY_TYPE, new zzbf(zzbd.zze, zzbc.zzf, null)), Tuples4.m3642to(zzux.JS_THIRD_PARTY_APP_PACKAGE_NAME_NOT_ALLOWED, new zzbf(zzbd.zzf, zzbc.zzg, null)), Tuples4.m3642to(zzux.JS_INVALID_ACTION, new zzbf(zzbd.zzg, zzbc.zzh, null)), Tuples4.m3642to(zzux.JS_PROGRAM_ERROR, new zzbf(zzbdVar, zzbc.zzj, null)));
    }

    public zzbf(zzbd zzbdVar, zzbc zzbcVar, String str) {
        this.zzc = zzbdVar;
        this.zzd = zzbcVar;
        this.zze = str;
        zzbd zzbdVar2 = zzbd.zzc;
        RecaptchaErrorCode recaptchaErrorCode = RecaptchaErrorCode.NETWORK_ERROR;
        this.zzf = MapsKt.mapOf(Tuples4.m3642to(zzbdVar2, new RecaptchaException(recaptchaErrorCode, null, 2, null)), Tuples4.m3642to(zzbd.zzh, new RecaptchaException(recaptchaErrorCode, null, 2, null)), Tuples4.m3642to(zzbd.zzi, new RecaptchaException(recaptchaErrorCode, null, 2, null)), Tuples4.m3642to(zzbd.zzd, new RecaptchaException(RecaptchaErrorCode.INVALID_SITEKEY, null, 2, null)), Tuples4.m3642to(zzbd.zze, new RecaptchaException(RecaptchaErrorCode.INVALID_KEYTYPE, null, 2, null)), Tuples4.m3642to(zzbd.zzf, new RecaptchaException(RecaptchaErrorCode.INVALID_PACKAGE_NAME, null, 2, null)), Tuples4.m3642to(zzbd.zzg, new RecaptchaException(RecaptchaErrorCode.INVALID_ACTION, null, 2, null)), Tuples4.m3642to(zzbd.zzb, new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null)), Tuples4.m3642to(zzbd.zzj, new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, null, 2, null)));
    }

    public final zzbc zza() {
        return this.zzd;
    }

    public final zzbd zzb() {
        return this.zzc;
    }

    public final RecaptchaException zzc() {
        zzbc zzbcVar = this.zzd;
        if (Intrinsics.areEqual(zzbcVar, zzbc.zzI)) {
            return new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, null, 2, null);
        }
        if (Intrinsics.areEqual(zzbcVar, zzbc.zzao)) {
            return new RecaptchaException(RecaptchaErrorCode.NO_NETWORK_FOUND, null, 2, null);
        }
        RecaptchaException recaptchaException = (RecaptchaException) this.zzf.get(this.zzc);
        return recaptchaException == null ? new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null) : recaptchaException;
    }

    public final String zzd() {
        return this.zze;
    }
}
