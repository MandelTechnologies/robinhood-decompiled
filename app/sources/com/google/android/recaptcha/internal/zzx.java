package com.google.android.recaptcha.internal;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzx extends zze {
    private final zzem zza;
    private final List zzb;
    private zzlg zzc;
    private final Map zzd;

    public /* synthetic */ zzx(Context context, zzem zzemVar, zzbk zzbkVar, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        zzad zzadVar = new zzad(zzemVar.zza());
        zzp zzpVar = new zzp(zzemVar.zza());
        zzm zzmVar = new zzm(zzemVar.zza(), context.getContentResolver());
        zzn zznVar = new zzn(zzemVar.zza());
        zzem zzemVarZza = zzemVar.zza();
        CoroutineScope coroutineScopeZzc = zzbkVar.zzc();
        List listListOf = CollectionsKt.listOf((Object[]) new zzaa[]{zzadVar, zzpVar, zzmVar, zznVar, new zzag(zzemVarZza, context, coroutineScopeZzc, new zzap(context, coroutineScopeZzc, zzemVarZza, IntegrityManagerFactory.createStandard(context), 28800000L), new zzbu(GoogleApiAvailabilityLight.getInstance()))});
        this.zza = zzemVar;
        this.zzb = listListOf;
        this.zzd = new LinkedHashMap();
    }

    public static final /* synthetic */ String zzo(zzx zzxVar, zzub zzubVar) {
        zzlg zzlgVar = zzxVar.zzc;
        if (zzlgVar == null) {
            zzlgVar = null;
        }
        byte[] bArrZzd = zzubVar.zzd();
        return zzch.zza(zzkj.zzh().zzi(bArrZzd, 0, bArrZzd.length), zzlgVar);
    }

    public static final /* synthetic */ String zzp(zzx zzxVar, zzuh zzuhVar) {
        zzlg zzlgVar = zzxVar.zzc;
        if (zzlgVar == null) {
            zzlgVar = null;
        }
        byte[] bArrZzd = zzuhVar.zzd();
        return zzch.zza(zzkj.zzh().zzi(bArrZzd, 0, bArrZzd.length), zzlgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzsz zzt(String str) {
        zztu zztuVar = (zztu) this.zzd.remove(str);
        zzsy zzsyVarZzf = zzsz.zzf();
        zzsyVarZzf.zzd(str);
        if (zztuVar != null) {
            byte[] bArrZzd = ((zztv) zztuVar.zzj()).zzd();
            String strZzi = zzkj.zzh().zzi(bArrZzd, 0, bArrZzd.length);
            zzsv zzsvVarZzf = zzsw.zzf();
            zzsvVarZzf.zzd(strZzi);
            zzsyVarZzf.zze(zzsvVarZzf);
        }
        return (zzsz) zzsyVarZzf.zzj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzu(String str, zzaa zzaaVar, Continuation continuation) {
        zzq zzqVar;
        if (continuation instanceof zzq) {
            zzqVar = (zzq) continuation;
            int i = zzqVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzqVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzqVar = new zzq(this, continuation);
            }
        }
        Object obj = zzqVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzqVar.zzc;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        zzr zzrVar = new zzr(zzaaVar, str, this, null);
        zzqVar.zzc = 1;
        Object objCoroutineScope = CoroutineScope2.coroutineScope(zzrVar, zzqVar);
        return objCoroutineScope == coroutine_suspended ? coroutine_suspended : objCoroutineScope;
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final zzep zza(String str) {
        zzem zzemVar = this.zza;
        zzemVar.zzc(str);
        return zzemVar.zzf(35);
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final zzep zzb() {
        zzem zzemVar = this.zza;
        zzemVar.zzc(zzemVar.zzd());
        return zzemVar.zzf(34);
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final Object zzd(String str, Continuation continuation) {
        return zzt(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final Object zzf(String str, Continuation continuation) {
        zzs zzsVar;
        if (continuation instanceof zzs) {
            zzsVar = (zzs) continuation;
            int i = zzsVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzsVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzsVar = new zzs(this, continuation);
            }
        }
        Object objCoroutineScope = zzsVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzsVar.zzc;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCoroutineScope);
            zzu zzuVar = new zzu(str, this, null);
            zzsVar.zzc = 1;
            objCoroutineScope = CoroutineScope2.coroutineScope(zzuVar, zzsVar);
            if (objCoroutineScope == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCoroutineScope);
        }
        return ((Result) objCoroutineScope).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final Object zzh(zzsq zzsqVar, Continuation continuation) {
        zzv zzvVar;
        if (continuation instanceof zzv) {
            zzvVar = (zzv) continuation;
            int i = zzvVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzvVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzvVar = new zzv(this, continuation);
            }
        }
        Object objCoroutineScope = zzvVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzvVar.zzc;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCoroutineScope);
            zzw zzwVar = new zzw(zzsqVar, this, null);
            zzvVar.zzc = 1;
            objCoroutineScope = CoroutineScope2.coroutineScope(zzwVar, zzvVar);
            if (objCoroutineScope == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCoroutineScope);
        }
        return ((Result) objCoroutineScope).getValue();
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final void zzk(zztl zztlVar) {
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            ((zzaa) it.next()).zze(zztlVar);
        }
    }

    public final Map zzr() {
        return this.zzd;
    }
}
