package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import java.util.MissingResourceException;
import java.util.UUID;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzde implements RecaptchaClient, RecaptchaTasksClient {
    private static final Regex zza = new Regex("^[a-zA-Z0-9/_]{0,100}$");
    private final zzcp zzb;
    private final String zzc;
    private final zzem zzd;
    private final zzbk zze;

    public zzde(zzcp zzcpVar, String str, zzbk zzbkVar, zzem zzemVar) {
        this.zzb = zzcpVar;
        this.zzc = str;
        this.zze = zzbkVar;
        this.zzd = zzemVar;
    }

    public static final /* synthetic */ void zze(zzde zzdeVar, long j, RecaptchaAction recaptchaAction) throws zzbf {
        zzbf zzbfVar = !zza.matches(recaptchaAction.getAction()) ? new zzbf(zzbd.zzg, zzbc.zzh, null) : null;
        if (j < 5000) {
            zzbfVar = new zzbf(zzbd.zzb, zzbc.zzI, null);
        }
        if (zzbfVar != null) {
            throw zzbfVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.android.recaptcha.internal.zzep] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzg(String str, Function2 function2, Continuation continuation) throws MissingResourceException, zzbf {
        zzdd zzddVar;
        if (continuation instanceof zzdd) {
            zzddVar = (zzdd) continuation;
            int i = zzddVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzddVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzddVar = new zzdd(this, continuation);
            }
        }
        Object objInvoke = zzddVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzddVar.zzc;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objInvoke);
                zzem zzemVarZza = this.zzd.zza();
                zzemVarZza.zzc(str);
                zzep zzepVarZzf = zzemVarZza.zzf(9);
                zzddVar.zzd = zzepVarZzf;
                zzddVar.zzc = 1;
                objInvoke = function2.invoke(zzemVarZza, zzddVar);
                str = zzepVarZzf;
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zzep zzepVar = zzddVar.zzd;
                ResultKt.throwOnFailure(objInvoke);
                str = zzepVar;
            }
            str.zza();
            return objInvoke;
        } catch (zzbf e) {
            str.zzb(e);
            throw e;
        } catch (Exception e2) {
            zzbf zzbfVar = new zzbf(zzbd.zzb, zzbc.zzX, e2.getMessage());
            str.zzb(zzbfVar);
            throw zzbfVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* renamed from: execute-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo9243execute0E7RQCE(RecaptchaAction recaptchaAction, long j, Continuation<? super Result<String>> continuation) throws MissingResourceException {
        zzcy zzcyVar;
        if (continuation instanceof zzcy) {
            zzcyVar = (zzcy) continuation;
            int i = zzcyVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzcyVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzcyVar = new zzcy(this, continuation);
            }
        }
        Object obj = zzcyVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzcyVar.zzc;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        zzcyVar.zzc = 1;
        Object objZzf = zzf(recaptchaAction, j, zzcyVar);
        return objZzf == coroutine_suspended ? coroutine_suspended : objZzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* renamed from: execute-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo9244executegIAlus(RecaptchaAction recaptchaAction, Continuation<? super Result<String>> continuation) throws MissingResourceException {
        zzcz zzczVar;
        if (continuation instanceof zzcz) {
            zzczVar = (zzcz) continuation;
            int i = zzczVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzczVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzczVar = new zzcz(this, continuation);
            }
        }
        Object obj = zzczVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzczVar.zzc;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        zzczVar.zzc = 1;
        Object objMo9243execute0E7RQCE = mo9243execute0E7RQCE(recaptchaAction, 10000L, zzczVar);
        return objMo9243execute0E7RQCE == coroutine_suspended ? coroutine_suspended : objMo9243execute0E7RQCE;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction) {
        return zzau.zza(BuildersKt__Builders_commonKt.async$default(this.zze.zzb(), null, null, new zzdc(this, recaptchaAction, 10000L, null), 3, null));
    }

    public final String zzd() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction, long j) {
        return zzau.zza(BuildersKt__Builders_commonKt.async$default(this.zze.zzb(), null, null, new zzdc(this, recaptchaAction, j, null), 3, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzf(RecaptchaAction recaptchaAction, long j, Continuation continuation) throws MissingResourceException {
        zzda zzdaVar;
        String string2;
        zzbf zzbfVar;
        if (continuation instanceof zzda) {
            zzdaVar = (zzda) continuation;
            int i = zzdaVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzdaVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzdaVar = new zzda(this, continuation);
            }
        }
        Object objZzg = zzdaVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzdaVar.zzc;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objZzg);
            try {
                string2 = UUID.randomUUID().toString();
            } catch (zzbf e) {
                e = e;
                zzbfVar = e;
                Result.Companion companion = Result.INSTANCE;
                return Result.m28550constructorimpl(ResultKt.createFailure(zzbfVar.zzc()));
            }
            try {
                Function2 zzdbVar = new zzdb(this, j, recaptchaAction, string2, null);
                zzdaVar.zzc = 1;
                objZzg = zzg(string2, zzdbVar, zzdaVar);
                if (objZzg == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (zzbf e2) {
                e = e2;
                zzbfVar = e;
                Result.Companion companion2 = Result.INSTANCE;
                return Result.m28550constructorimpl(ResultKt.createFailure(zzbfVar.zzc()));
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                ResultKt.throwOnFailure(objZzg);
            } catch (zzbf e3) {
                zzbfVar = e3;
                Result.Companion companion22 = Result.INSTANCE;
                return Result.m28550constructorimpl(ResultKt.createFailure(zzbfVar.zzc()));
            }
        }
        return ((Result) objZzg).getValue();
    }
}
