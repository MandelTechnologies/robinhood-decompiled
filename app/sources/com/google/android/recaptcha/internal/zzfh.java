package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope2;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzfh {
    private final Lazy zza;
    private final Lazy zzb;
    private final Lazy zzc;

    public zzfh() {
        int i = zzax.zza;
        this.zza = LazyKt.lazy(zzfe.zza);
        this.zzb = LazyKt.lazy(zzff.zza);
        this.zzc = LazyKt.lazy(zzfg.zza);
    }

    public static final /* synthetic */ zzfm zzb(zzfh zzfhVar) {
        return (zzfm) zzfhVar.zza.getValue();
    }

    static /* synthetic */ Object zze(zzfh zzfhVar, zzsq zzsqVar, zzem zzemVar, Continuation continuation) throws Exception {
        String strZza;
        try {
            String strZzL = zzsqVar.zzL();
            String strZzM = zzsqVar.zzM();
            zzas zzasVarZzf = zzfhVar.zzf();
            String str = null;
            if (zzasVarZzf != null && zzasVarZzf.zzd(strZzM)) {
                zzep zzepVarZzf = zzemVar.zzf(25);
                try {
                    strZza = zzfhVar.zzf().zza(strZzM);
                } catch (Exception e) {
                    zzepVarZzf.zzb(new zzbf(zzbd.zzk, zzbc.zzR, e.getMessage()));
                }
                if (strZza != null) {
                    zzepVarZzf.zza();
                    str = strZza;
                } else {
                    zzepVarZzf.zzb(new zzbf(zzbd.zzk, zzbc.zzS, null));
                }
            }
            if (str == null) {
                zzas zzasVarZzf2 = zzfhVar.zzf();
                if (zzasVarZzf2 != null) {
                    zzasVarZzf2.zzb();
                }
                zzep zzepVarZzf2 = zzemVar.zzf(23);
                try {
                    String strZzb = zzfhVar.zzg().zzb(strZzL);
                    zzepVarZzf2.zza();
                    zzep zzepVarZzf3 = zzemVar.zzf(24);
                    try {
                        zzas zzasVarZzf3 = zzfhVar.zzf();
                        if (zzasVarZzf3 != null) {
                            zzasVarZzf3.zzc(strZzM, strZzb);
                        }
                        zzepVarZzf3.zza();
                    } catch (Exception e2) {
                        zzepVarZzf3.zzb(new zzbf(zzbd.zzk, zzbc.zzT, e2.getMessage()));
                    }
                    str = strZzb;
                } catch (zzbf e3) {
                    zzepVarZzf2.zzb(e3);
                    throw e3;
                }
            }
            return StringsKt.replace$default(zzsqVar.zzk(), "JAVASCRIPT_TAG", str, false, 4, (Object) null);
        } catch (Exception e4) {
            if (e4 instanceof zzbf) {
                throw e4;
            }
            throw new zzbf(zzbd.zzb, zzbc.zzL, e4.getMessage());
        }
    }

    private final zzas zzf() {
        return (zzas) this.zzb.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzfa zzg() {
        return (zzfa) this.zzc.getValue();
    }

    public final Object zzc(String str, zzun zzunVar, Continuation continuation) throws RecaptchaException {
        return CoroutineScope2.coroutineScope(new zzfd(this, str, zzunVar, null), continuation);
    }

    public final Object zzd(zzsq zzsqVar, zzem zzemVar, Continuation continuation) throws zzbf {
        return zze(this, zzsqVar, zzemVar, continuation);
    }
}
