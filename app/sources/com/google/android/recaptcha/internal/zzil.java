package com.google.android.recaptcha.internal;

import android.webkit.JavascriptInterface;
import java.util.MissingResourceException;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzil {
    final /* synthetic */ zzjc zza;
    private Long zzb;
    private final zzjj zzc = zzjj.zzb();

    public zzil(zzjc zzjcVar) {
        this.zza = zzjcVar;
    }

    private final void zzb() {
        if (this.zzb == null) {
            this.zzc.zzf();
            this.zzb = Long.valueOf(this.zzc.zza(TimeUnit.MILLISECONDS));
        }
    }

    public final Long zza() {
        return this.zzb;
    }

    @JavascriptInterface
    public final void zzlce(String str) throws zznv, MissingResourceException {
        zzjc zzjcVar = this.zza;
        if (zzjcVar.zzq().zzb == null) {
            zzep zzepVar = zzjcVar.zzp;
            if (zzepVar != null) {
                zzepVar.zza();
            }
            this.zza.zzp = null;
        }
        zzb();
        zzrm zzrmVarZzL = zzrm.zzL(zzbv.zza(str));
        zzuz zzuzVarZzi = zzva.zzi();
        zzuzVarZzi.zze(zzrmVarZzL);
        this.zza.zzj.zze((zzva) zzuzVarZzi.zzj());
    }

    @JavascriptInterface
    public final void zzlsm(String str) {
        zzb();
        zzuz zzuzVarZzi = zzva.zzi();
        zzuzVarZzi.zzp(zzsb.zzi(zzbv.zza(str)));
        this.zza.zzj.zze((zzva) zzuzVarZzi.zzj());
    }

    @JavascriptInterface
    public final void zzoid(String str) throws zznv {
        zzb();
        zzut zzutVarZzg = zzut.zzg(zzbv.zza(str));
        zzutVarZzg.zzi().name();
        if (zzutVarZzg.zzi() == zzux.JS_CODE_SUCCESS) {
            this.zza.zzA().hashCode();
            if (this.zza.zzA().complete(Unit.INSTANCE)) {
                return;
            }
            this.zza.zzA().hashCode();
            return;
        }
        zzutVarZzg.zzi().name();
        int i = zzbf.zza;
        zzbf zzbfVarZza = zzbe.zza(zzutVarZzg.zzi());
        this.zza.zzA().hashCode();
        this.zza.zzA().completeExceptionally(zzbfVarZza);
    }

    @JavascriptInterface
    public final void zzrp(String str) {
        zzb();
        zzfq zzfqVar = this.zza.zzb;
        if (zzfqVar == null) {
            zzfqVar = null;
        }
        zzfqVar.zza(str);
    }

    @JavascriptInterface
    public final void zzscd(String str) throws zznv {
        zzb();
        zzsz zzszVarZzi = zzsz.zzi(zzbv.zza(str));
        zzszVarZzi.toString();
        CompletableDeferred completableDeferred = (CompletableDeferred) this.zza.zze.remove(zzszVarZzi.zzk());
        if (completableDeferred != null) {
            completableDeferred.complete(zzszVarZzi);
        }
    }
}
