package com.google.android.recaptcha.internal;

import android.app.Application;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.api.ApiException;
import com.google.android.recaptcha.RecaptchaException;
import java.util.MissingResourceException;
import java.util.UUID;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Timeout4;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.Mutex3;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzcx {
    private final Application zza;
    private zzde zzc;
    private final Mutex zzb = Mutex3.Mutex$default(false, 1, null);
    private final String zzd = UUID.randomUUID().toString();
    private zzbk zzf = new zzbk();
    private final zzl zze = new zzl(null, 1, 0 == true ? 1 : 0);

    /* JADX WARN: Multi-variable type inference failed */
    public zzcx(Application application) {
        this.zza = application;
        int i = zzax.zza;
        zzay[] zzayVarArr = {new zzay(zzbb.class.getName().hashCode(), new zzbb(null, 1, null)), new zzay(zzfw.class.getName().hashCode(), new zzfw()), new zzay(zzbg.class.getName().hashCode(), new zzbg()), new zzay(zzjf.class.getName().hashCode(), new zzjf()), new zzay(zzbt.class.getName().hashCode(), new zzbt("https://www.recaptcha.net/recaptcha/api3")), new zzay(zzez.class.getName().hashCode(), new zzez(null, 1, null)), new zzay(zzfm.class.getName().hashCode(), new zzfm(true)), new zzay(Application.class.getName().hashCode(), application), new zzay(zzbh.class.getName().hashCode(), new zzbh(application)), new zzay(zzfl.class.getName().hashCode(), new zzfl()), new zzay(zzas.class.getName().hashCode(), new zzbo(application)), new zzay(zzfa.class.getName().hashCode(), new zzfc()), new zzay(zzfh.class.getName().hashCode(), new zzfh())};
        for (int i2 = 0; i2 < 13; i2++) {
            zzay zzayVar = zzayVarArr[i2];
            zzax.zzc.putIfAbsent(Integer.valueOf(zzayVar.zza()), zzayVar);
        }
    }

    public static final /* synthetic */ zzde zza(zzcx zzcxVar, String str) throws zzbf {
        zzde zzdeVar = zzcxVar.zzc;
        if (zzdeVar == null) {
            return null;
        }
        if (Intrinsics.areEqual(zzdeVar.zzd(), str)) {
            return zzdeVar;
        }
        throw new zzbf(zzbd.zzd, zzbc.zzam, null);
    }

    public static final /* synthetic */ void zzc(zzcx zzcxVar, long j) throws zzbf {
        if (j < 5000) {
            throw new zzbf(zzbd.zzj, zzbc.zzI, null);
        }
        if (ContextCompat.checkSelfPermission(zzcxVar.zza, "android.permission.INTERNET") != 0) {
            throw new zzbf(zzbd.zzc, zzbc.zzao, null);
        }
    }

    public static final /* synthetic */ zzcp zze(zzcx zzcxVar, String str, zzbk zzbkVar, zzcj zzcjVar, zzem zzemVar) {
        zzdv zzdvVar = new zzdv(str, zzbkVar, zzemVar, zzcxVar.zze);
        return Intrinsics.areEqual(zzcjVar, zzcj.zza) ? new zzeh(zzdvVar) : new zzee(zzdvVar, zzbkVar, zzemVar, new zzbq());
    }

    public static /* synthetic */ Object zzh(zzcx zzcxVar, String str, long j, zzcp zzcpVar, zzbk zzbkVar, zzcj zzcjVar, Continuation continuation, int i, Object obj) throws RecaptchaException, Timeout4, ApiException {
        if ((i & 8) != 0) {
            zzbkVar = zzcxVar.zzf;
        }
        zzbk zzbkVar2 = zzbkVar;
        if ((i & 16) != 0) {
            zzcjVar = zzcj.zza;
        }
        zzcj zzcjVar2 = zzcjVar;
        if ((i & 2) != 0) {
            j = 10000;
        }
        return zzcxVar.zzg(str, j, null, zzbkVar2, zzcjVar2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzj(String str, int i, Function2 function2, Continuation continuation) throws RecaptchaException, MissingResourceException {
        zzcw zzcwVar;
        Exception e;
        zzep zzepVar;
        zzbf e2;
        if (continuation instanceof zzcw) {
            zzcwVar = (zzcw) continuation;
            int i2 = zzcwVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzcwVar.zzc = i2 - Integer.MIN_VALUE;
            } else {
                zzcwVar = new zzcw(this, continuation);
            }
        }
        Object objInvoke = zzcwVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = zzcwVar.zzc;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            zzem zzemVarZzk = zzk(str, this.zzf, i);
            zzep zzepVarZzf = zzemVarZzk.zzf(6);
            try {
                zzcwVar.zzd = zzepVarZzf;
                zzcwVar.zzc = 1;
                objInvoke = function2.invoke(zzemVarZzk, zzcwVar);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                zzepVar = zzepVarZzf;
            } catch (zzbf e3) {
                e2 = e3;
                zzepVar = zzepVarZzf;
                zzepVar.zzb(e2);
                throw e2.zzc();
            } catch (Exception e4) {
                e = e4;
                zzepVar = zzepVarZzf;
                zzbf zzbfVar = new zzbf(zzbd.zzb, zzbc.zza, e.getMessage());
                zzepVar.zzb(zzbfVar);
                throw zzbfVar.zzc();
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzepVar = zzcwVar.zzd;
            try {
                ResultKt.throwOnFailure(objInvoke);
            } catch (zzbf e5) {
                e2 = e5;
                zzepVar.zzb(e2);
                throw e2.zzc();
            } catch (Exception e6) {
                e = e6;
                zzbf zzbfVar2 = new zzbf(zzbd.zzb, zzbc.zza, e.getMessage());
                zzepVar.zzb(zzbfVar2);
                throw zzbfVar2.zzc();
            }
        }
        zzepVar.zza();
        return objInvoke;
    }

    private final zzem zzk(String str, zzbk zzbkVar, int i) {
        String string2 = UUID.randomUUID().toString();
        int i2 = zzax.zza;
        zzeu zzeuVar = new zzeu(this.zza, new zzew(((zzbt) LazyKt.lazy(zzct.zza).getValue()).zzc()), zzbkVar.zza());
        zzem zzemVar = new zzem(str, this.zzd, string2, i, this.zza, zzeuVar, null);
        zzemVar.zzc(string2);
        return zzemVar;
    }

    public final zzbk zzd() {
        return this.zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzg(String str, long j, zzcp zzcpVar, zzbk zzbkVar, zzcj zzcjVar, Continuation continuation) throws Throwable {
        zzcu zzcuVar;
        zzbk zzbkVar2;
        zzcj zzcjVar2;
        long j2;
        zzcx zzcxVar;
        String str2;
        Mutex mutex;
        Mutex mutex2;
        if (continuation instanceof zzcu) {
            zzcuVar = (zzcu) continuation;
            int i = zzcuVar.zzg;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzcuVar.zzg = i - Integer.MIN_VALUE;
            } else {
                zzcuVar = new zzcu(this, continuation);
            }
        }
        Object objZzj = zzcuVar.zze;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzcuVar.zzg;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objZzj);
                Mutex mutex3 = this.zzb;
                zzcuVar.zza = this;
                zzcuVar.zzh = str;
                zzcuVar.zzb = null;
                zzcuVar.zzj = zzbkVar;
                zzcuVar.zzi = zzcjVar;
                zzcuVar.zzc = mutex3;
                zzcuVar.zzd = j;
                zzcuVar.zzg = 1;
                if (mutex3.lock(null, zzcuVar) != coroutine_suspended) {
                    zzbkVar2 = zzbkVar;
                    zzcjVar2 = zzcjVar;
                    j2 = j;
                    zzcxVar = this;
                    str2 = str;
                    mutex = mutex3;
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) zzcuVar.zza;
                try {
                    ResultKt.throwOnFailure(objZzj);
                    zzde zzdeVar = (zzde) objZzj;
                    mutex2.unlock(null);
                    return zzdeVar;
                } catch (Throwable th) {
                    th = th;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            long j3 = zzcuVar.zzd;
            Mutex mutex4 = (Mutex) zzcuVar.zzc;
            zzcj zzcjVar3 = zzcuVar.zzi;
            zzbk zzbkVar3 = zzcuVar.zzj;
            String str3 = zzcuVar.zzh;
            zzcx zzcxVar2 = (zzcx) zzcuVar.zza;
            ResultKt.throwOnFailure(objZzj);
            zzcjVar2 = zzcjVar3;
            zzbkVar2 = zzbkVar3;
            str2 = str3;
            zzcxVar = zzcxVar2;
            j2 = j3;
            mutex = mutex4;
            int i3 = Intrinsics.areEqual(zzcjVar2, zzcj.zza) ? 3 : Intrinsics.areEqual(zzcjVar2, zzcj.zzb) ? 4 : 2;
            zzcv zzcvVar = new zzcv(zzcxVar, str2, j2, null, zzbkVar2, zzcjVar2, null);
            zzcuVar.zza = mutex;
            zzcuVar.zzh = null;
            zzcuVar.zzb = null;
            zzcuVar.zzj = null;
            zzcuVar.zzi = null;
            zzcuVar.zzc = null;
            zzcuVar.zzg = 2;
            objZzj = zzcxVar.zzj(str2, i3, zzcvVar, zzcuVar);
            if (objZzj != coroutine_suspended) {
                mutex2 = mutex;
                zzde zzdeVar2 = (zzde) objZzj;
                mutex2.unlock(null);
                return zzdeVar2;
            }
            return coroutine_suspended;
        } catch (Throwable th2) {
            th = th2;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
    }
}
