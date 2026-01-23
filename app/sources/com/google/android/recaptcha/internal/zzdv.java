package com.google.android.recaptcha.internal;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.android.recaptcha.RecaptchaAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.MissingResourceException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.Await2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job6;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.Timeout4;
import kotlinx.coroutines.Timeout6;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzdv {
    private final String zza;
    private final zzem zzb;
    private final zzl zzc;
    private final Lazy zzd;
    private final Lazy zze;
    private final Lazy zzf;
    private final Lazy zzg;
    private final Lazy zzh;
    private final zzbk zzi;

    public zzdv(String str, zzbk zzbkVar, zzem zzemVar, zzl zzlVar) {
        this.zza = str;
        this.zzi = zzbkVar;
        this.zzb = zzemVar;
        this.zzc = zzlVar;
        int i = zzax.zza;
        this.zzd = LazyKt.lazy(zzdo.zza);
        this.zze = LazyKt.lazy(zzdp.zza);
        this.zzf = LazyKt.lazy(zzdq.zza);
        this.zzg = LazyKt.lazy(zzdr.zza);
        this.zzh = LazyKt.lazy(zzds.zza);
    }

    public static final /* synthetic */ zzbt zzd(zzdv zzdvVar) {
        return (zzbt) zzdvVar.zze.getValue();
    }

    public static final /* synthetic */ zzfh zzg(zzdv zzdvVar) {
        return (zzfh) zzdvVar.zzd.getValue();
    }

    public static final /* synthetic */ zzfl zzh(zzdv zzdvVar) {
        return (zzfl) zzdvVar.zzg.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Application zzr() {
        return (Application) this.zzh.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbf zzs(Exception exc, zzbf zzbfVar) {
        return !zzx() ? new zzbf(zzbd.zzc, zzbc.zzao, exc.getMessage()) : zzbfVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbh zzt() {
        return (zzbh) this.zzf.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzem zzu(String str) {
        zzem zzemVarZza = this.zzb.zza();
        zzemVarZza.zzc(str);
        return zzemVarZza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzv(zzsq zzsqVar, long j, Continuation continuation) throws Throwable {
        zzdl zzdlVar;
        Object objZzc;
        zzdv zzdvVar;
        if (continuation instanceof zzdl) {
            zzdlVar = (zzdl) continuation;
            int i = zzdlVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzdlVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzdlVar = new zzdl(this, continuation);
            }
        }
        zzdl zzdlVar2 = zzdlVar;
        Object obj = zzdlVar2.zzb;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzdlVar2.zzd;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            zzy(zzsqVar.zzO());
            Iterator it = zzw().iterator();
            while (it.hasNext()) {
                this.zzc.zzf((zze) it.next());
            }
            zzl zzlVar = this.zzc;
            zzem zzemVar = this.zzb;
            zzdlVar2.zza = this;
            zzdlVar2.zzd = 1;
            objZzc = zzlVar.zzc(j, zzsqVar, zzemVar, zzdlVar2);
            if (objZzc != coroutine_suspended) {
                zzdvVar = this;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Throwable th = (Throwable) zzdlVar2.zza;
            ResultKt.throwOnFailure(obj);
            throw th;
        }
        zzdvVar = (zzdv) zzdlVar2.zza;
        ResultKt.throwOnFailure(obj);
        objZzc = ((Result) obj).getValue();
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objZzc);
        if (thM28553exceptionOrNullimpl == null) {
            return Unit.INSTANCE;
        }
        Job6.cancelChildren$default(zzdvVar.zzi.zzd().getCoroutineContext(), null, 1, null);
        List list = SequencesKt.toList(JobKt.getJob(zzdvVar.zzi.zzd().getCoroutineContext()).getChildren());
        zzdlVar2.zza = thM28553exceptionOrNullimpl;
        zzdlVar2.zzd = 2;
        if (Await2.joinAll(list, zzdlVar2) != coroutine_suspended) {
            throw thM28553exceptionOrNullimpl;
        }
        return coroutine_suspended;
    }

    private final List zzw() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zzx(zzr(), this.zzb.zza(), this.zzi, null, 8, null));
        arrayList.add(new zzjc(this.zzb, this.zzi));
        return CollectionsKt.toList(arrayList);
    }

    private final boolean zzx() {
        NetworkCapabilities networkCapabilities;
        int i = zzax.zza;
        try {
            Object systemService = zzr().getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                return false;
            }
            return networkCapabilities.hasCapability(16);
        } catch (Exception unused) {
            return false;
        }
    }

    private static final void zzy(String str) throws zzbf {
        try {
            zzsh zzshVarZzj = zzsh.zzj(zzbv.zza(str));
            int i = zzax.zza;
            ((zzfw) LazyKt.lazy(zzdg.zza).getValue()).zza(zzshVarZzj);
        } catch (Exception e) {
            throw new zzbf(zzbd.zzl, zzbc.zzan, e.getMessage());
        }
    }

    public final zzti zzi(RecaptchaAction recaptchaAction, zzsz zzszVar, zzsq zzsqVar) {
        zzth zzthVarZzf = zzti.zzf();
        zzthVarZzf.zzr(this.zza);
        zzthVarZzf.zzd(recaptchaAction.getAction());
        zzthVarZzf.zze(zzsqVar.zzN());
        zzthVarZzf.zzp(zzsqVar.zzM());
        zzthVarZzf.zzq(zzszVar);
        return (zzti) zzthVarZzf.zzj();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzl(String str, long j, Continuation continuation) throws MissingResourceException, zzbf {
        zzdf zzdfVar;
        Exception e;
        zzep zzepVar;
        Timeout4 e2;
        zzbf e3;
        if (continuation instanceof zzdf) {
            zzdfVar = (zzdf) continuation;
            int i = zzdfVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzdfVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzdfVar = new zzdf(this, continuation);
            }
        }
        Object obj = zzdfVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzdfVar.zzc;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            zzep zzepVarZzf = zzu(str).zzf(27);
            try {
                zzl zzlVar = this.zzc;
                zzdfVar.zzd = zzepVarZzf;
                zzdfVar.zzc = 1;
                Object objZzb = zzlVar.zzb(str, j, zzdfVar);
                if (objZzb == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = objZzb;
                zzepVar = zzepVarZzf;
            } catch (zzbf e4) {
                e3 = e4;
                zzepVar = zzepVarZzf;
                zzepVar.zzb(e3);
                throw e3;
            } catch (Timeout4 e5) {
                e2 = e5;
                zzepVar = zzepVarZzf;
                zzbf zzbfVar = new zzbf(zzbd.zzb, zzbc.zzb, e2.getMessage());
                zzepVar.zzb(zzbfVar);
                throw zzbfVar;
            } catch (Exception e6) {
                e = e6;
                zzepVar = zzepVarZzf;
                zzbf zzbfVar2 = new zzbf(zzbd.zzb, zzbc.zzaa, e.getMessage());
                zzepVar.zzb(zzbfVar2);
                throw zzbfVar2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzepVar = zzdfVar.zzd;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (zzbf e7) {
                e3 = e7;
                zzepVar.zzb(e3);
                throw e3;
            } catch (Timeout4 e8) {
                e2 = e8;
                zzbf zzbfVar3 = new zzbf(zzbd.zzb, zzbc.zzb, e2.getMessage());
                zzepVar.zzb(zzbfVar3);
                throw zzbfVar3;
            } catch (Exception e9) {
                e = e9;
                zzbf zzbfVar22 = new zzbf(zzbd.zzb, zzbc.zzaa, e.getMessage());
                zzepVar.zzb(zzbfVar22);
                throw zzbfVar22;
            }
        }
        zzsz zzszVar = (zzsz) obj;
        zzepVar.zza();
        return zzszVar;
    }

    public final Object zzm(zzti zztiVar, String str, long j, Continuation continuation) {
        return BuildersKt.withContext(this.zzi.zza().getCoroutineContext(), new zzdi(this, str, j, zztiVar, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzn(zzsq zzsqVar, long j, Continuation continuation) throws zzbf {
        zzdm zzdmVar;
        if (continuation instanceof zzdm) {
            zzdmVar = (zzdm) continuation;
            int i = zzdmVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzdmVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzdmVar = new zzdm(this, continuation);
            }
        }
        Object obj = zzdmVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzdmVar.zzc;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                zzdn zzdnVar = new zzdn(this, zzsqVar, j, null);
                zzdmVar.zzc = 1;
                if (Timeout6.withTimeout(j, zzdnVar, zzdmVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        } catch (zzbf e) {
            throw e;
        } catch (Timeout4 e2) {
            throw new zzbf(zzbd.zzb, zzbc.zzb, e2.getMessage());
        } catch (Exception e3) {
            throw new zzbf(zzbd.zzb, zzbc.zzap, e3.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzo(long j, Continuation continuation) throws MissingResourceException, zzbf {
        zzdt zzdtVar;
        Exception e;
        zzep zzepVar;
        zzdv zzdvVar;
        Timeout4 e2;
        zzbf e3;
        if (continuation instanceof zzdt) {
            zzdtVar = (zzdt) continuation;
            int i = zzdtVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzdtVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzdtVar = new zzdt(this, continuation);
            }
        }
        Object obj = zzdtVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzdtVar.zzc;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            zzep zzepVarZzf = this.zzb.zzf(22);
            try {
                zzdu zzduVar = new zzdu(this, zzepVarZzf, null);
                zzdtVar.zzd = this;
                zzdtVar.zze = zzepVarZzf;
                zzdtVar.zzc = 1;
                Object objWithTimeout = Timeout6.withTimeout(j, zzduVar, zzdtVar);
                if (objWithTimeout == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = objWithTimeout;
                zzepVar = zzepVarZzf;
                zzdvVar = this;
            } catch (zzbf e4) {
                e3 = e4;
                zzepVar = zzepVarZzf;
                zzdvVar = this;
                if (Intrinsics.areEqual(e3.zzb(), zzbd.zzc)) {
                }
                zzepVar.zzb(e3);
                throw e3;
            } catch (Timeout4 e5) {
                e2 = e5;
                zzepVar = zzepVarZzf;
                zzdvVar = this;
                zzbf zzbfVarZzs = zzdvVar.zzs(e2, new zzbf(zzbd.zzc, zzbc.zzb, e2.getMessage()));
                zzepVar.zzb(zzbfVarZzs);
                throw zzbfVarZzs;
            } catch (Exception e6) {
                e = e6;
                zzepVar = zzepVarZzf;
                zzdvVar = this;
                zzbf zzbfVarZzs2 = zzdvVar.zzs(e, new zzbf(zzbd.zzc, zzbc.zzaw, e.getMessage()));
                zzepVar.zzb(zzbfVarZzs2);
                throw zzbfVarZzs2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzepVar = zzdtVar.zze;
            zzdvVar = zzdtVar.zzd;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (zzbf e7) {
                e3 = e7;
                if (Intrinsics.areEqual(e3.zzb(), zzbd.zzc)) {
                    e3 = zzdvVar.zzs(e3, e3);
                }
                zzepVar.zzb(e3);
                throw e3;
            } catch (Timeout4 e8) {
                e2 = e8;
                zzbf zzbfVarZzs3 = zzdvVar.zzs(e2, new zzbf(zzbd.zzc, zzbc.zzb, e2.getMessage()));
                zzepVar.zzb(zzbfVarZzs3);
                throw zzbfVarZzs3;
            } catch (Exception e9) {
                e = e9;
                zzbf zzbfVarZzs22 = zzdvVar.zzs(e, new zzbf(zzbd.zzc, zzbc.zzaw, e.getMessage()));
                zzepVar.zzb(zzbfVarZzs22);
                throw zzbfVarZzs22;
            }
        }
        return (zzsq) obj;
    }

    public final void zzq(String str, zztl zztlVar) throws MissingResourceException {
        zzep zzepVarZzf = zzu(str).zzf(29);
        try {
            List<zzto> listZzk = zztlVar.zzk();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listZzk, 10)), 16));
            for (zzto zztoVar : listZzk) {
                Tuples2 tuples2M3642to = Tuples4.m3642to(zztoVar.zzg(), zztoVar.zzi());
                linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
            }
            zzt().zzb(linkedHashMap);
            this.zzc.zzg(zztlVar);
            zzepVarZzf.zza();
        } catch (zzbf e) {
            zzepVarZzf.zzb(e);
        } catch (Exception e2) {
            zzepVarZzf.zzb(new zzbf(zzbd.zzb, zzbc.zzas, e2.getMessage()));
        }
    }
}
