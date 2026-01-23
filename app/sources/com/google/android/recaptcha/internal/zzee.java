package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferred3;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzee implements zzcp {
    private final zzdv zza;
    private final zzem zzb;
    private zzbf zzd;
    private zzsq zze;
    private final zzbk zzg;
    private CompletableDeferred zzc = CompletableDeferred3.CompletableDeferred$default(null, 1, null);
    private zzco zzf = zzco.zza;

    public zzee(zzdv zzdvVar, zzbk zzbkVar, zzem zzemVar, zzbq zzbqVar) {
        this.zza = zzdvVar;
        this.zzg = zzbkVar;
        this.zzb = zzemVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzl(Function1 function1, Continuation continuation) {
        zzdx zzdxVar;
        zzbp zzbpVar;
        if (continuation instanceof zzdx) {
            zzdxVar = (zzdx) continuation;
            int i = zzdxVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzdxVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzdxVar = new zzdx(this, continuation);
            }
        }
        Object obj = zzdxVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzdxVar.zzc;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            zzbp zzbpVar2 = new zzbp();
            zzdxVar.zzd = zzbpVar2;
            zzdxVar.zzc = 1;
            if (function1.invoke(zzdxVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            zzbpVar = zzbpVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzbpVar = zzdxVar.zzd;
            ResultKt.throwOnFailure(obj);
        }
        zzbpVar.zzc();
        return boxing.boxLong(zzbpVar.zza(TimeUnit.MILLISECONDS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077 A[Catch: Exception -> 0x0031, TRY_ENTER, TryCatch #1 {Exception -> 0x0031, blocks: (B:13:0x002d, B:26:0x0065, B:31:0x0077, B:32:0x0080), top: B:53:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzm(long j, Continuation continuation) throws zzbf {
        zzdy zzdyVar;
        zzee zzeeVar;
        zzee zzeeVar2;
        zzbf zzbfVar;
        zzbf zzbfVar2;
        long jLongValue;
        if (continuation instanceof zzdy) {
            zzdyVar = (zzdy) continuation;
            int i = zzdyVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzdyVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzdyVar = new zzdy(this, continuation);
            }
        }
        Object objZzl = zzdyVar.zzb;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzdyVar.zzd;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objZzl);
                zzdyVar.zze = this;
                zzdyVar.zza = j;
                zzdyVar.zzd = 1;
                if (zzn(j, zzdyVar) != coroutine_suspended) {
                    zzeeVar = this;
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = zzdyVar.zza;
                zzeeVar2 = zzdyVar.zze;
                try {
                    ResultKt.throwOnFailure(objZzl);
                    jLongValue = j - ((Number) objZzl).longValue();
                    if (jLongValue < 500) {
                        return boxing.boxLong(jLongValue);
                    }
                    throw new zzbf(zzbd.zzc, zzbc.zzar, null);
                } catch (Exception e) {
                    e = e;
                    if (e instanceof zzbf) {
                    }
                    if (zzbfVar == null) {
                    }
                    if (Intrinsics.areEqual(zzeeVar2.zzf, zzco.zzd)) {
                    }
                    throw zzbfVar2;
                }
            }
            j = zzdyVar.zza;
            zzeeVar = zzdyVar.zze;
            ResultKt.throwOnFailure(objZzl);
            zzea zzeaVar = new zzea(j, zzeeVar, null);
            zzdyVar.zze = zzeeVar;
            zzdyVar.zza = j;
            zzdyVar.zzd = 2;
            objZzl = zzeeVar.zzl(zzeaVar, zzdyVar);
            if (objZzl != coroutine_suspended) {
                zzeeVar2 = zzeeVar;
                jLongValue = j - ((Number) objZzl).longValue();
                if (jLongValue < 500) {
                }
            }
            return coroutine_suspended;
        } catch (Exception e2) {
            e = e2;
            zzeeVar2 = zzeeVar;
            zzbfVar = e instanceof zzbf ? (zzbf) e : null;
            if (zzbfVar == null) {
                zzbfVar = new zzbf(zzbd.zzc, zzbc.zzar, e.getMessage());
            }
            if ((!Intrinsics.areEqual(zzeeVar2.zzf, zzco.zzd) || Intrinsics.areEqual(zzeeVar2.zzf, zzco.zzc)) && (zzbfVar2 = zzeeVar2.zzd) != null) {
                throw zzbfVar2;
            }
            throw zzbfVar;
        }
    }

    private final Object zzn(long j, Continuation continuation) {
        if (Intrinsics.areEqual(this.zzf, zzco.zzb) || Intrinsics.areEqual(this.zzf, zzco.zzc)) {
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(this.zzf, zzco.zzd) && !zzo(this.zzd)) {
            return Unit.INSTANCE;
        }
        this.zzf = zzco.zzc;
        CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferred3.CompletableDeferred$default(null, 1, null);
        this.zzc = completableDeferredCompletableDeferred$default;
        BuildersKt__Builders_commonKt.launch$default(this.zzg.zza(), null, null, new zzed(this, completableDeferredCompletableDeferred$default, j, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzo(Exception exc) {
        if (!(exc instanceof zzbf)) {
            return true;
        }
        zzbf zzbfVar = (zzbf) exc;
        return (Intrinsics.areEqual(zzbfVar.zzb(), zzbd.zzd) || Intrinsics.areEqual(zzbfVar.zzb(), zzbd.zze) || Intrinsics.areEqual(zzbfVar.zzb(), zzbd.zzf)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // com.google.android.recaptcha.internal.zzcp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(String str, RecaptchaAction recaptchaAction, long j, Continuation continuation) throws zzbf {
        zzdw zzdwVar;
        String str2;
        RecaptchaAction recaptchaAction2;
        Object objZzm;
        zzee zzeeVar;
        String str3;
        double d;
        zzee zzeeVar2;
        zzsq zzsqVar;
        String str4;
        zzee zzeeVar3;
        if (continuation instanceof zzdw) {
            zzdwVar = (zzdw) continuation;
            int i = zzdwVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzdwVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzdwVar = new zzdw(this, continuation);
            }
        }
        zzdw zzdwVar2 = zzdwVar;
        Object objZzm2 = zzdwVar2.zzb;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzdwVar2.zzd;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objZzm2);
                zzdwVar2.zze = this;
                str2 = str;
                zzdwVar2.zzf = str2;
                recaptchaAction2 = recaptchaAction;
                zzdwVar2.zzg = recaptchaAction2;
                zzdwVar2.zzd = 1;
                objZzm = zzm(j, zzdwVar2);
                if (objZzm == coroutine_suspended) {
                    return coroutine_suspended;
                }
                zzeeVar = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str4 = zzdwVar2.zzf;
                        zzeeVar3 = zzdwVar2.zze;
                        ResultKt.throwOnFailure(objZzm2);
                        zztl zztlVar = (zztl) objZzm2;
                        zzeeVar3.zza.zzq(str4, zztlVar);
                        return zztlVar.zzj();
                    }
                    d = zzdwVar2.zza;
                    recaptchaAction2 = zzdwVar2.zzg;
                    str3 = zzdwVar2.zzf;
                    zzeeVar2 = zzdwVar2.zze;
                    ResultKt.throwOnFailure(objZzm2);
                    zzsz zzszVar = (zzsz) objZzm2;
                    zzdv zzdvVar = zzeeVar2.zza;
                    zzsqVar = zzeeVar2.zze;
                    if (zzsqVar == null) {
                        zzsqVar = null;
                    }
                    zzti zztiVarZzi = zzdvVar.zzi(recaptchaAction2, zzszVar, zzsqVar);
                    zzdv zzdvVar2 = zzeeVar2.zza;
                    long j2 = (long) d;
                    zzdwVar2.zze = zzeeVar2;
                    zzdwVar2.zzf = str3;
                    zzdwVar2.zzg = null;
                    zzdwVar2.zzd = 3;
                    String str5 = str3;
                    objZzm2 = zzdvVar2.zzm(zztiVarZzi, str5, j2, zzdwVar2);
                    if (objZzm2 != coroutine_suspended) {
                        str4 = str5;
                        zzeeVar3 = zzeeVar2;
                        zztl zztlVar2 = (zztl) objZzm2;
                        zzeeVar3.zza.zzq(str4, zztlVar2);
                        return zztlVar2.zzj();
                    }
                    return coroutine_suspended;
                }
                recaptchaAction2 = zzdwVar2.zzg;
                String str6 = zzdwVar2.zzf;
                zzeeVar = zzdwVar2.zze;
                ResultKt.throwOnFailure(objZzm2);
                objZzm = objZzm2;
                str2 = str6;
            }
            double dLongValue = ((Number) objZzm).longValue();
            zzdv zzdvVar3 = zzeeVar.zza;
            double d2 = 0.45d * dLongValue;
            zzdwVar2.zze = zzeeVar;
            zzdwVar2.zzf = str2;
            zzdwVar2.zzg = recaptchaAction2;
            double d3 = dLongValue * 0.55d;
            zzdwVar2.zza = d3;
            zzdwVar2.zzd = 2;
            Object objZzl = zzdvVar3.zzl(str2, (long) d2, zzdwVar2);
            if (objZzl != coroutine_suspended) {
                zzee zzeeVar4 = zzeeVar;
                str3 = str2;
                objZzm2 = objZzl;
                d = d3;
                zzeeVar2 = zzeeVar4;
                zzsz zzszVar2 = (zzsz) objZzm2;
                zzdv zzdvVar4 = zzeeVar2.zza;
                zzsqVar = zzeeVar2.zze;
                if (zzsqVar == null) {
                }
                zzti zztiVarZzi2 = zzdvVar4.zzi(recaptchaAction2, zzszVar2, zzsqVar);
                zzdv zzdvVar22 = zzeeVar2.zza;
                long j22 = (long) d;
                zzdwVar2.zze = zzeeVar2;
                zzdwVar2.zzf = str3;
                zzdwVar2.zzg = null;
                zzdwVar2.zzd = 3;
                String str52 = str3;
                objZzm2 = zzdvVar22.zzm(zztiVarZzi2, str52, j22, zzdwVar2);
                if (objZzm2 != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        } catch (zzbf e) {
            throw e;
        } catch (Exception e2) {
            throw new zzbf(zzbd.zzb, zzbc.zzay, e2.getMessage());
        }
    }

    @Override // com.google.android.recaptcha.internal.zzcp
    public final Object zzb(long j, Continuation continuation) {
        Object objZzn = zzn(j, continuation);
        return objZzn == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objZzn : Unit.INSTANCE;
    }
}
