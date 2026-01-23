package com.google.android.recaptcha.internal;

import java.util.MissingResourceException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.Timeout6;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public abstract class zze {
    private boolean zza;

    protected zzep zza(String str) {
        throw null;
    }

    protected zzep zzb() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00dc, code lost:
    
        if (r0 != r5) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(String str, long j, Continuation continuation) throws MissingResourceException, zzbf {
        zza zzaVar;
        zzep zzepVarZza;
        Exception exc;
        long j2;
        zzep zzepVar;
        zze zzeVar;
        zze zzeVar2;
        String str2;
        zze zzeVar3;
        String str3;
        long j3;
        Exception e;
        String str4 = str;
        long j4 = j;
        if (continuation instanceof zza) {
            zzaVar = (zza) continuation;
            int i = zzaVar.zze;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzaVar.zze = i - Integer.MIN_VALUE;
            } else {
                zzaVar = new zza(this, continuation);
            }
        }
        zza zzaVar2 = zzaVar;
        Object objWithTimeout = zzaVar2.zzc;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzaVar2.zze;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithTimeout);
            zzepVarZza = zza(str);
            try {
                zzb zzbVar = new zzb(this, str4, null);
                zzaVar2.zza = this;
                zzaVar2.zzf = str4;
                zzaVar2.zzg = zzepVarZza;
                zzaVar2.zzb = j4;
                zzaVar2.zze = 1;
                objWithTimeout = Timeout6.withTimeout(j4, zzbVar, zzaVar2);
                if (objWithTimeout != coroutine_suspended) {
                    zzeVar2 = this;
                }
            } catch (Exception e2) {
                exc = e2;
                j2 = j4;
                zzepVar = zzepVarZza;
                zzeVar = this;
                zzbf zzbfVarZza = zzf.zza(exc, new zzbf(zzbd.zzb, zzbc.zzaa, exc.getMessage()));
                if (zzepVar != null) {
                }
                zzaVar2.zza = zzeVar;
                zzaVar2.zzf = str4;
                zzaVar2.zzg = null;
                zzaVar2.zze = 2;
                str2 = str4;
                if (zzeVar.zzi(str2, j2, exc, zzaVar2) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            long j5 = zzaVar2.zzb;
            zzepVar = zzaVar2.zzg;
            String str5 = zzaVar2.zzf;
            zzeVar2 = (zze) zzaVar2.zza;
            try {
                ResultKt.throwOnFailure(objWithTimeout);
                zzepVarZza = zzepVar;
                j4 = j5;
                str4 = str5;
            } catch (Exception e3) {
                e = e3;
                j3 = j5;
                str4 = str5;
                zzeVar = zzeVar2;
                j2 = j3;
                exc = e;
                zzbf zzbfVarZza2 = zzf.zza(exc, new zzbf(zzbd.zzb, zzbc.zzaa, exc.getMessage()));
                if (zzepVar != null) {
                }
                zzaVar2.zza = zzeVar;
                zzaVar2.zzf = str4;
                zzaVar2.zzg = null;
                zzaVar2.zze = 2;
                str2 = str4;
                if (zzeVar.zzi(str2, j2, exc, zzaVar2) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objWithTimeout);
                return Result.m28550constructorimpl(objWithTimeout);
            }
            str3 = zzaVar2.zzf;
            zzeVar3 = (zze) zzaVar2.zza;
            ResultKt.throwOnFailure(objWithTimeout);
            Result.Companion companion = Result.INSTANCE;
            zzaVar2.zza = null;
            zzaVar2.zzf = null;
            zzaVar2.zze = 3;
            objWithTimeout = zzeVar3.zzd(str3, zzaVar2);
        }
        try {
            Object value = ((Result) objWithTimeout).getValue();
            ResultKt.throwOnFailure(value);
            zzsz zzszVar = (zzsz) value;
            if (zzepVarZza != null) {
                zzepVarZza.zza();
            }
            return Result.m28550constructorimpl(zzszVar);
        } catch (Exception e4) {
            e = e4;
            j3 = j4;
            zzepVar = zzepVarZza;
            zzeVar = zzeVar2;
            j2 = j3;
            exc = e;
            zzbf zzbfVarZza22 = zzf.zza(exc, new zzbf(zzbd.zzb, zzbc.zzaa, exc.getMessage()));
            if (zzepVar != null) {
                zzepVar.zzb(zzbfVarZza22);
            }
            zzaVar2.zza = zzeVar;
            zzaVar2.zzf = str4;
            zzaVar2.zzg = null;
            zzaVar2.zze = 2;
            str2 = str4;
            if (zzeVar.zzi(str2, j2, exc, zzaVar2) != coroutine_suspended) {
                zzeVar3 = zzeVar;
                str3 = str2;
                Result.Companion companion2 = Result.INSTANCE;
                zzaVar2.zza = null;
                zzaVar2.zzf = null;
                zzaVar2.zze = 3;
                objWithTimeout = zzeVar3.zzd(str3, zzaVar2);
            }
            return coroutine_suspended;
        }
    }

    protected abstract Object zzd(String str, Continuation continuation);

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9 A[PHI: r8 r9 r11
      0x00a9: PHI (r8v12 com.google.android.recaptcha.internal.zzep) = (r8v8 com.google.android.recaptcha.internal.zzep), (r8v19 com.google.android.recaptcha.internal.zzep) binds: [B:37:0x00a7, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r9v6 com.google.android.recaptcha.internal.zze) = (r9v3 com.google.android.recaptcha.internal.zze), (r9v11 com.google.android.recaptcha.internal.zze) binds: [B:37:0x00a7, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r11v8 java.lang.Object) = (r11v9 java.lang.Object), (r11v10 java.lang.Object) binds: [B:37:0x00a7, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zze(long j, zzsq zzsqVar, Continuation continuation) throws MissingResourceException, zzbf {
        zzc zzcVar;
        Exception e;
        zze zzeVar;
        zzep zzepVar;
        Object obj;
        Object objZzj;
        Object obj2;
        zzbf zzbfVar;
        zzbf zzbfVar2;
        if (continuation instanceof zzc) {
            zzcVar = (zzc) continuation;
            int i = zzcVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzcVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzcVar = new zzc(this, continuation);
            }
        }
        Object obj3 = zzcVar.zzb;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzcVar.zzd;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj3);
            zzep zzepVarZzb = zzb();
            if (this.zza) {
                zzepVarZzb.zza();
                Result.Companion companion = Result.INSTANCE;
                return Result.m28550constructorimpl(Unit.INSTANCE);
            }
            try {
                zzd zzdVar = new zzd(this, zzsqVar, null);
                zzcVar.zza = this;
                zzcVar.zze = zzepVarZzb;
                zzcVar.zzd = 1;
                Object objWithTimeout = Timeout6.withTimeout(j, zzdVar, zzcVar);
                if (objWithTimeout != coroutine_suspended) {
                    obj = objWithTimeout;
                    zzepVar = zzepVarZzb;
                    zzeVar = this;
                }
            } catch (Exception e2) {
                e = e2;
                zzeVar = this;
                zzepVar = zzepVarZzb;
                zzeVar.zza = false;
                zzcVar.zza = zzeVar;
                zzcVar.zze = zzepVar;
                zzcVar.zzd = 2;
                objZzj = zzeVar.zzj(e, zzcVar);
                obj2 = objZzj;
                if (objZzj != coroutine_suspended) {
                    zzbfVar = (zzbf) obj2;
                    if (zzepVar != null) {
                    }
                    zzcVar.zza = zzbfVar;
                    zzcVar.zze = null;
                    zzcVar.zzd = 3;
                    if (zzeVar.zzg(zzbfVar, zzcVar) != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zzbfVar2 = (zzbf) zzcVar.zza;
                ResultKt.throwOnFailure(obj3);
                Result.Companion companion2 = Result.INSTANCE;
                return Result.m28550constructorimpl(ResultKt.createFailure(zzbfVar2));
            }
            zzepVar = zzcVar.zze;
            zzeVar = (zze) zzcVar.zza;
            ResultKt.throwOnFailure(obj3);
            obj2 = obj3;
            zzbfVar = (zzbf) obj2;
            if (zzepVar != null) {
                zzepVar.zzb(zzbfVar);
            }
            zzcVar.zza = zzbfVar;
            zzcVar.zze = null;
            zzcVar.zzd = 3;
            if (zzeVar.zzg(zzbfVar, zzcVar) != coroutine_suspended) {
                zzbfVar2 = zzbfVar;
                Result.Companion companion22 = Result.INSTANCE;
                return Result.m28550constructorimpl(ResultKt.createFailure(zzbfVar2));
            }
            return coroutine_suspended;
        }
        zzepVar = zzcVar.zze;
        zzeVar = (zze) zzcVar.zza;
        try {
            ResultKt.throwOnFailure(obj3);
            obj = obj3;
        } catch (Exception e3) {
            e = e3;
            zzeVar.zza = false;
            zzcVar.zza = zzeVar;
            zzcVar.zze = zzepVar;
            zzcVar.zzd = 2;
            objZzj = zzeVar.zzj(e, zzcVar);
            obj2 = objZzj;
            if (objZzj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        ResultKt.throwOnFailure(((Result) obj).getValue());
        Unit unit = Unit.INSTANCE;
        zzeVar.zza = true;
        if (zzepVar != null) {
            zzepVar.zza();
        }
        return Result.m28550constructorimpl(unit);
    }

    protected abstract Object zzf(String str, Continuation continuation) throws zzbf;

    protected Object zzg(zzbf zzbfVar, Continuation continuation) {
        return Unit.INSTANCE;
    }

    protected abstract Object zzh(zzsq zzsqVar, Continuation continuation) throws zzbf;

    protected Object zzi(String str, long j, Exception exc, Continuation continuation) {
        return Unit.INSTANCE;
    }

    protected Object zzj(Exception exc, Continuation continuation) {
        return zzf.zza(exc, new zzbf(zzbd.zzb, zzbc.zzap, exc.getMessage()));
    }

    protected void zzk(zztl zztlVar) {
    }

    public final boolean zzl() {
        return this.zza;
    }
}
