package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import java.util.MissingResourceException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzeh implements zzcp {
    private final zzdv zza;
    private zzco zzb = zzco.zza;
    private zzsq zzc;

    public zzeh(zzdv zzdvVar) {
        this.zza = zzdvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    @Override // com.google.android.recaptcha.internal.zzcp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(String str, RecaptchaAction recaptchaAction, long j, Continuation continuation) throws zzbf {
        zzef zzefVar;
        String str2;
        RecaptchaAction recaptchaAction2;
        double d;
        zzeh zzehVar;
        String str3;
        zzeh zzehVar2;
        if (continuation instanceof zzef) {
            zzefVar = (zzef) continuation;
            int i = zzefVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzefVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzefVar = new zzef(this, continuation);
            }
        }
        zzef zzefVar2 = zzefVar;
        Object objZzl = zzefVar2.zzb;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzefVar2.zzd;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objZzl);
                if (!Intrinsics.areEqual(this.zzb, zzco.zzb)) {
                    throw new zzbf(zzbd.zzb, zzbc.zzar, null);
                }
                double d2 = j;
                zzdv zzdvVar = this.zza;
                double d3 = 0.45d * d2;
                zzefVar2.zze = this;
                zzefVar2.zzf = str;
                zzefVar2.zzg = recaptchaAction;
                double d4 = d2 * 0.55d;
                zzefVar2.zza = d4;
                zzefVar2.zzd = 1;
                objZzl = zzdvVar.zzl(str, (long) d3, zzefVar2);
                if (objZzl != coroutine_suspended) {
                    str2 = str;
                    recaptchaAction2 = recaptchaAction;
                    d = d4;
                    zzehVar = this;
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str3 = zzefVar2.zzf;
                zzehVar2 = zzefVar2.zze;
                ResultKt.throwOnFailure(objZzl);
                zztl zztlVar = (zztl) objZzl;
                zzehVar2.zza.zzq(str3, zztlVar);
                return zztlVar.zzj();
            }
            double d5 = zzefVar2.zza;
            recaptchaAction2 = zzefVar2.zzg;
            String str4 = zzefVar2.zzf;
            zzeh zzehVar3 = zzefVar2.zze;
            ResultKt.throwOnFailure(objZzl);
            d = d5;
            zzehVar = zzehVar3;
            str2 = str4;
            zzsz zzszVar = (zzsz) objZzl;
            zzdv zzdvVar2 = zzehVar.zza;
            zzsq zzsqVar = zzehVar.zzc;
            if (zzsqVar == null) {
                zzsqVar = null;
            }
            zzti zztiVarZzi = zzdvVar2.zzi(recaptchaAction2, zzszVar, zzsqVar);
            zzefVar2.zze = zzehVar;
            zzefVar2.zzf = str2;
            zzefVar2.zzg = null;
            zzefVar2.zzd = 2;
            objZzl = zzehVar.zza.zzm(zztiVarZzi, str2, (long) d, zzefVar2);
            if (objZzl != coroutine_suspended) {
                str3 = str2;
                zzehVar2 = zzehVar;
                zztl zztlVar2 = (zztl) objZzl;
                zzehVar2.zza.zzq(str3, zztlVar2);
                return zztlVar2.zzj();
            }
            return coroutine_suspended;
        } catch (zzbf e) {
            throw e;
        } catch (Exception e2) {
            throw new zzbf(zzbd.zzb, zzbc.zzaz, e2.getMessage());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0099, code lost:
    
        if (r12 == r1) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v10, types: [com.google.android.recaptcha.internal.zzeh] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    @Override // com.google.android.recaptcha.internal.zzcp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb(long j, Continuation continuation) throws MissingResourceException, zzbf {
        zzeg zzegVar;
        Object obj;
        double d;
        zzeh zzehVar;
        if (continuation instanceof zzeg) {
            zzegVar = (zzeg) continuation;
            int i = zzegVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzegVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzegVar = new zzeg(this, continuation);
            }
        }
        Object obj2 = zzegVar.zzb;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzegVar.zzd;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj2);
                if (Intrinsics.areEqual(this.zzb, zzco.zzb) || Intrinsics.areEqual(this.zzb, zzco.zzd)) {
                    return Unit.INSTANCE;
                }
                this.zzb = zzco.zzc;
                double d2 = j;
                try {
                    zzdv zzdvVar = this.zza;
                    double d3 = 0.6d * d2;
                    zzegVar.zze = this;
                    double d4 = d2 * 0.4d;
                    zzegVar.zza = d4;
                    zzegVar.zzd = 1;
                    Object objZzo = zzdvVar.zzo((long) d3, zzegVar);
                    if (objZzo != coroutine_suspended) {
                        obj = objZzo;
                        d = d4;
                        zzehVar = this;
                        zzsq zzsqVar = (zzsq) obj;
                        zzehVar.zzc = zzsqVar;
                        zzegVar.zze = zzehVar;
                        zzegVar.zzd = 2;
                        Object objZzn = zzehVar.zza.zzn(zzsqVar, (long) d, zzegVar);
                        j = zzehVar;
                    }
                    return coroutine_suspended;
                } catch (zzbf e) {
                    e = e;
                    j = this;
                    j.zzb = zzco.zzd;
                    throw e;
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zzeh zzehVar2 = zzegVar.zze;
                ResultKt.throwOnFailure(obj2);
                j = zzehVar2;
                j.zzb = zzco.zzb;
                return Unit.INSTANCE;
            }
            double d5 = zzegVar.zza;
            zzeh zzehVar3 = zzegVar.zze;
            try {
                ResultKt.throwOnFailure(obj2);
                obj = obj2;
                d = d5;
                zzehVar = zzehVar3;
                zzsq zzsqVar2 = (zzsq) obj;
                zzehVar.zzc = zzsqVar2;
                zzegVar.zze = zzehVar;
                zzegVar.zzd = 2;
                Object objZzn2 = zzehVar.zza.zzn(zzsqVar2, (long) d, zzegVar);
                j = zzehVar;
            } catch (zzbf e2) {
                e = e2;
                j = zzehVar3;
                j.zzb = zzco.zzd;
                throw e;
            }
        } catch (zzbf e3) {
            e = e3;
        }
    }
}
