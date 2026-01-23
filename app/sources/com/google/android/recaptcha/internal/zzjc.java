package com.google.android.recaptcha.internal;

import android.app.Application;
import android.webkit.WebView;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.MissingResourceException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferred3;
import kotlinx.coroutines.Timeout4;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzjc extends zze {
    public CompletableDeferred zza;
    public zzfq zzb;
    private final zzem zzc;
    private zzsq zzf;
    private final zzem zzj;
    private final Lazy zzk;
    private final Lazy zzl;
    private final Lazy zzm;
    private final Lazy zzn;
    private final Lazy zzo;
    private zzep zzp;
    private final zzbk zzq;
    private final Map zzd = zzjd.zza();
    private final Map zze = new LinkedHashMap();
    private final zzcd zzg = new zzcd(zzjg.zza);
    private final zzjj zzh = zzjj.zzc();
    private final zzil zzi = new zzil(this);

    public zzjc(zzem zzemVar, zzbk zzbkVar) {
        this.zzc = zzemVar;
        this.zzq = zzbkVar;
        zzem zzemVarZza = zzemVar.zza();
        zzemVarZza.zzc(zzemVar.zzd());
        this.zzj = zzemVarZza;
        int i = zzax.zza;
        this.zzk = LazyKt.lazy(zziu.zza);
        this.zzl = LazyKt.lazy(zziv.zza);
        this.zzm = LazyKt.lazy(zziw.zza);
        this.zzn = LazyKt.lazy(zzix.zza);
        this.zzo = LazyKt.lazy(zziy.zza);
    }

    private final Application zzD() {
        return (Application) this.zzo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzE(zzsq zzsqVar, Continuation continuation) {
        zzio zzioVar;
        zzbf zzbfVar;
        zzjc zzjcVar;
        if (continuation instanceof zzio) {
            zzioVar = (zzio) continuation;
            int i = zzioVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzioVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzioVar = new zzio(this, continuation);
            }
        }
        Object objZzd = zzioVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzioVar.zzc;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objZzd);
            try {
                zzfh zzfhVar = (zzfh) this.zzn.getValue();
                zzem zzemVar = this.zzj;
                zzioVar.zzd = this;
                zzioVar.zzc = 1;
                objZzd = zzfhVar.zzd(zzsqVar, zzemVar, zzioVar);
                if (objZzd == coroutine_suspended) {
                    return coroutine_suspended;
                }
                zzjcVar = this;
            } catch (zzbf e) {
                zzbfVar = e;
                zzjcVar = this;
                zzjcVar.zzA().completeExceptionally(zzbfVar);
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzjcVar = zzioVar.zzd;
            try {
                ResultKt.throwOnFailure(objZzd);
            } catch (zzbf e2) {
                zzbfVar = e2;
                zzjcVar.zzA().completeExceptionally(zzbfVar);
                return Unit.INSTANCE;
            }
        }
        BuildersKt__Builders_commonKt.launch$default(zzjcVar.zzq.zzb(), null, null, new zzip(zzjcVar, (String) objZzd, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzF(String str, Continuation continuation) throws MissingResourceException {
        zziq zziqVar;
        Exception exc;
        zzjc zzjcVar;
        String str2;
        String str3;
        zzjc zzjcVar2;
        zzep zzepVar;
        if (continuation instanceof zziq) {
            zziqVar = (zziq) continuation;
            int i = zziqVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zziqVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zziqVar = new zziq(this, continuation);
            }
        }
        Object obj = zziqVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zziqVar.zzc;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            this.zzp = this.zzj.zzf(26);
            try {
                String strZza = ((zzbt) this.zzl.getValue()).zza();
                zziqVar.zzd = this;
                zziqVar.zze = str;
                zziqVar.zzf = strZza;
                zziqVar.zzc = 1;
                Object objZzw = zzw(zziqVar);
                if (objZzw == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str2 = str;
                str3 = strZza;
                obj = objZzw;
                zzjcVar2 = this;
                ((WebView) obj).loadDataWithBaseURL(str3, str2, "text/html", "utf-8", null);
            } catch (Exception e) {
                exc = e;
                zzjcVar = this;
                zzbf zzbfVar = new zzbf(zzbd.zzb, zzbc.zzU, exc.getMessage());
                zzepVar = zzjcVar.zzp;
                if (zzepVar != null) {
                    zzepVar.zzb(zzbfVar);
                }
                zzjcVar.zzp = null;
                zzjcVar.zzA().completeExceptionally(zzbfVar);
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str4 = zziqVar.zzf;
            String str5 = zziqVar.zze;
            zzjcVar = zziqVar.zzd;
            try {
                ResultKt.throwOnFailure(obj);
                str3 = str4;
                str2 = str5;
                zzjcVar2 = zzjcVar;
                try {
                    ((WebView) obj).loadDataWithBaseURL(str3, str2, "text/html", "utf-8", null);
                } catch (Exception e2) {
                    zzjcVar = zzjcVar2;
                    exc = e2;
                    zzbf zzbfVar2 = new zzbf(zzbd.zzb, zzbc.zzU, exc.getMessage());
                    zzepVar = zzjcVar.zzp;
                    if (zzepVar != null) {
                    }
                    zzjcVar.zzp = null;
                    zzjcVar.zzA().completeExceptionally(zzbfVar2);
                    return Unit.INSTANCE;
                }
            } catch (Exception e3) {
                exc = e3;
                zzbf zzbfVar22 = new zzbf(zzbd.zzb, zzbc.zzU, exc.getMessage());
                zzepVar = zzjcVar.zzp;
                if (zzepVar != null) {
                }
                zzjcVar.zzp = null;
                zzjcVar.zzA().completeExceptionally(zzbfVar22);
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzG(String str, Continuation continuation) {
        zziz zzizVar;
        zzjc zzjcVar;
        zzjc zzjcVar2;
        if (continuation instanceof zziz) {
            zzizVar = (zziz) continuation;
            int i = zzizVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzizVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzizVar = new zziz(this, continuation);
            }
        }
        Object objZzb = zzizVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzizVar.zzc;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objZzb);
            zzcd zzcdVar = this.zzg;
            zzjg[] zzjgVarArr = {zzjg.zzd, zzjg.zzc, zzjg.zzb};
            zzizVar.zzd = this;
            zzizVar.zze = str;
            zzizVar.zzc = 1;
            objZzb = zzcdVar.zzb(zzjgVarArr, zzizVar);
            if (objZzb != coroutine_suspended) {
                zzjcVar = this;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = zzizVar.zze;
            zzjcVar2 = zzizVar.zzd;
            ResultKt.throwOnFailure(objZzb);
            zzjcVar2.zza = CompletableDeferred3.CompletableDeferred$default(null, 1, null);
            zzem zzemVar = zzjcVar2.zzj;
            zzemVar.zzc(str);
            BuildersKt__Builders_commonKt.launch$default(zzjcVar2.zzq.zza(), null, null, new zzjb(zzjcVar2, zzemVar.zzf(42), null), 3, null);
            return Unit.INSTANCE;
        }
        str = zzizVar.zze;
        zzjcVar = zzizVar.zzd;
        ResultKt.throwOnFailure(objZzb);
        if (((Boolean) objZzb).booleanValue()) {
            return Unit.INSTANCE;
        }
        zzcd zzcdVar2 = zzjcVar.zzg;
        zzjg zzjgVar = zzjg.zzb;
        zzizVar.zzd = zzjcVar;
        zzizVar.zze = str;
        zzizVar.zzc = 2;
        if (zzcdVar2.zzc(zzjgVar, zzizVar) != coroutine_suspended) {
            zzjcVar2 = zzjcVar;
            zzjcVar2.zza = CompletableDeferred3.CompletableDeferred$default(null, 1, null);
            zzem zzemVar2 = zzjcVar2.zzj;
            zzemVar2.zzc(str);
            BuildersKt__Builders_commonKt.launch$default(zzjcVar2.zzq.zza(), null, null, new zzjb(zzjcVar2, zzemVar2.zzf(42), null), 3, null);
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    public static final /* synthetic */ zzfm zzp(zzjc zzjcVar) {
        return (zzfm) zzjcVar.zzm.getValue();
    }

    public final CompletableDeferred zzA() {
        CompletableDeferred completableDeferred = this.zza;
        if (completableDeferred != null) {
            return completableDeferred;
        }
        return null;
    }

    public final zzfv zzC(zzsq zzsqVar, zzci zzciVar, WebView webView) {
        zzfy zzfyVar = new zzfy(webView, this.zzq.zzb());
        zzia zziaVar = new zzia();
        zziaVar.zzb(CollectionsKt.toLongArray(zzsqVar.zzP()));
        zzgh zzghVar = new zzgh(zzfyVar, zzciVar, new zzbq());
        zzib zzibVar = new zzib(zziaVar, new zzhy());
        zzghVar.zze(3, zzD());
        zzghVar.zze(5, zzii.zza());
        zzghVar.zze(6, new zzic(zzD()));
        zzghVar.zze(7, new zzie());
        zzghVar.zze(8, new zzik(zzD()));
        zzghVar.zze(9, new zzif(zzD()));
        zzghVar.zze(10, new zzid(zzD()));
        return new zzfv(this.zzq.zzd(), zzghVar, zzibVar, zzfp.zza());
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final zzep zza(String str) {
        zzem zzemVar = this.zzc;
        zzemVar.zzc(str);
        return zzemVar.zzf(33);
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final zzep zzb() {
        zzem zzemVar = this.zzc;
        zzemVar.zzc(zzemVar.zzd());
        return zzemVar.zzf(32);
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final Object zzd(String str, Continuation continuation) {
        zzsy zzsyVarZzf = zzsz.zzf();
        zzsyVarZzf.zzd(str);
        return zzsyVarZzf.zzj();
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c6, code lost:
    
        if (r8.zzG(r4, r2) != r3) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final Object zzf(String str, Continuation continuation) {
        zzir zzirVar;
        String str2;
        zzjc zzjcVar;
        zzjc zzjcVar2;
        zzjc zzjcVar3;
        String str3;
        zzjc zzjcVar4;
        CompletableDeferred completableDeferredZzA;
        zzjc zzjcVar5;
        CompletableDeferred completableDeferred;
        if (continuation instanceof zzir) {
            zzirVar = (zzir) continuation;
            int i = zzirVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzirVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzirVar = new zzir(this, continuation);
            }
        }
        Object objZza = zzirVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzirVar.zzc;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objZza);
            zzcd zzcdVar = this.zzg;
            zzjg zzjgVar = zzjg.zzd;
            zzirVar.zzd = this;
            zzirVar.zze = str;
            zzirVar.zzc = 1;
            objZza = zzcdVar.zza(zzjgVar, zzirVar);
            if (objZza != coroutine_suspended) {
                str2 = str;
                zzjcVar = this;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                str2 = zzirVar.zze;
                zzjcVar2 = zzirVar.zzd;
                ResultKt.throwOnFailure(objZza);
                if (!((Boolean) objZza).booleanValue()) {
                    zzirVar.zzd = zzjcVar2;
                    zzirVar.zze = str2;
                    zzirVar.zzc = 3;
                }
                zzjcVar3 = zzjcVar2;
                completableDeferredZzA = zzjcVar3.zzA();
                zzirVar.zzd = zzjcVar3;
                zzirVar.zze = str2;
                zzirVar.zzc = 4;
                if (completableDeferredZzA.await(zzirVar) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 == 3) {
                str2 = zzirVar.zze;
                zzjcVar3 = zzirVar.zzd;
                ResultKt.throwOnFailure(objZza);
                try {
                    completableDeferredZzA = zzjcVar3.zzA();
                    zzirVar.zzd = zzjcVar3;
                    zzirVar.zze = str2;
                    zzirVar.zzc = 4;
                    if (completableDeferredZzA.await(zzirVar) != coroutine_suspended) {
                        zzjcVar5 = zzjcVar3;
                        CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferred3.CompletableDeferred$default(null, 1, null);
                        zzjcVar5.zze.put(str2, completableDeferredCompletableDeferred$default);
                        zzup zzupVarZzf = zzuq.zzf();
                        zzupVarZzf.zzd(str2);
                        byte[] bArrZzd = ((zzuq) zzupVarZzf.zzj()).zzd();
                        BuildersKt__Builders_commonKt.launch$default(zzjcVar5.zzq.zzb(), null, null, new zzis(zzjcVar5, zzkj.zzh().zzi(bArrZzd, 0, bArrZzd.length), null), 3, null);
                        zzirVar.zzd = zzjcVar5;
                        zzirVar.zze = str2;
                        zzirVar.zzc = 5;
                        objZza = completableDeferredCompletableDeferred$default.await(zzirVar);
                        if (objZza != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                } catch (Exception e) {
                    e = e;
                    str3 = str2;
                    zzjcVar4 = zzjcVar3;
                    zzbf zzbfVarZza = zzf.zza(e, new zzbf(zzbd.zzb, zzbc.zzW, e.getMessage()));
                    completableDeferred = (CompletableDeferred) zzjcVar4.zze.remove(str3);
                    if (completableDeferred != null) {
                    }
                    Result.Companion companion = Result.INSTANCE;
                    return Result.m28550constructorimpl(ResultKt.createFailure(zzbfVarZza));
                }
            }
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str3 = zzirVar.zze;
                zzjcVar4 = zzirVar.zzd;
                try {
                    ResultKt.throwOnFailure(objZza);
                    zzsz zzszVar = (zzsz) objZza;
                    zzsy zzsyVarZzf = zzsz.zzf();
                    zzsyVarZzf.zzd(str3);
                    zzte zzteVarZzf = zztf.zzf();
                    zzteVarZzf.zzd(zzszVar.zzL());
                    zzsyVarZzf.zzp(zzteVarZzf);
                    zztb zztbVarZzf = zztc.zzf();
                    zztbVarZzf.zzd(zzszVar.zzj());
                    zztbVarZzf.zze(zzszVar.zzM());
                    zzsyVarZzf.zzq(zztbVarZzf);
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m28550constructorimpl(zzsyVarZzf.zzj());
                } catch (Exception e2) {
                    e = e2;
                    zzbf zzbfVarZza2 = zzf.zza(e, new zzbf(zzbd.zzb, zzbc.zzW, e.getMessage()));
                    completableDeferred = (CompletableDeferred) zzjcVar4.zze.remove(str3);
                    if (completableDeferred != null) {
                        boxing.boxBoolean(completableDeferred.completeExceptionally(zzbfVarZza2));
                    }
                    Result.Companion companion3 = Result.INSTANCE;
                    return Result.m28550constructorimpl(ResultKt.createFailure(zzbfVarZza2));
                }
            }
            str2 = zzirVar.zze;
            zzjcVar5 = zzirVar.zzd;
            try {
                ResultKt.throwOnFailure(objZza);
                CompletableDeferred completableDeferredCompletableDeferred$default2 = CompletableDeferred3.CompletableDeferred$default(null, 1, null);
                zzjcVar5.zze.put(str2, completableDeferredCompletableDeferred$default2);
                zzup zzupVarZzf2 = zzuq.zzf();
                zzupVarZzf2.zzd(str2);
                byte[] bArrZzd2 = ((zzuq) zzupVarZzf2.zzj()).zzd();
                BuildersKt__Builders_commonKt.launch$default(zzjcVar5.zzq.zzb(), null, null, new zzis(zzjcVar5, zzkj.zzh().zzi(bArrZzd2, 0, bArrZzd2.length), null), 3, null);
                zzirVar.zzd = zzjcVar5;
                zzirVar.zze = str2;
                zzirVar.zzc = 5;
                objZza = completableDeferredCompletableDeferred$default2.await(zzirVar);
                if (objZza != coroutine_suspended) {
                    str3 = str2;
                    zzjcVar4 = zzjcVar5;
                    zzsz zzszVar2 = (zzsz) objZza;
                    zzsy zzsyVarZzf2 = zzsz.zzf();
                    zzsyVarZzf2.zzd(str3);
                    zzte zzteVarZzf2 = zztf.zzf();
                    zzteVarZzf2.zzd(zzszVar2.zzL());
                    zzsyVarZzf2.zzp(zzteVarZzf2);
                    zztb zztbVarZzf2 = zztc.zzf();
                    zztbVarZzf2.zzd(zzszVar2.zzj());
                    zztbVarZzf2.zze(zzszVar2.zzM());
                    zzsyVarZzf2.zzq(zztbVarZzf2);
                    Result.Companion companion22 = Result.INSTANCE;
                    return Result.m28550constructorimpl(zzsyVarZzf2.zzj());
                }
                return coroutine_suspended;
            } catch (Exception e3) {
                e = e3;
                str3 = str2;
                zzjcVar4 = zzjcVar5;
                zzbf zzbfVarZza22 = zzf.zza(e, new zzbf(zzbd.zzb, zzbc.zzW, e.getMessage()));
                completableDeferred = (CompletableDeferred) zzjcVar4.zze.remove(str3);
                if (completableDeferred != null) {
                }
                Result.Companion companion32 = Result.INSTANCE;
                return Result.m28550constructorimpl(ResultKt.createFailure(zzbfVarZza22));
            }
        }
        str2 = zzirVar.zze;
        zzjcVar = zzirVar.zzd;
        ResultKt.throwOnFailure(objZza);
        if (((Boolean) objZza).booleanValue()) {
            zzbf zzbfVar = new zzbf(zzbd.zzb, zzbc.zzav, null);
            Result.Companion companion4 = Result.INSTANCE;
            return Result.m28550constructorimpl(ResultKt.createFailure(zzbfVar));
        }
        zzcd zzcdVar2 = zzjcVar.zzg;
        zzjg zzjgVar2 = zzjg.zzc;
        zzirVar.zzd = zzjcVar;
        zzirVar.zze = str2;
        zzirVar.zzc = 2;
        objZza = zzcdVar2.zza(zzjgVar2, zzirVar);
        if (objZza != coroutine_suspended) {
            zzjcVar2 = zzjcVar;
            if (!((Boolean) objZza).booleanValue()) {
            }
            zzjcVar3 = zzjcVar2;
            completableDeferredZzA = zzjcVar3.zzA();
            zzirVar.zzd = zzjcVar3;
            zzirVar.zze = str2;
            zzirVar.zzc = 4;
            if (completableDeferredZzA.await(zzirVar) != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final Object zzg(zzbf zzbfVar, Continuation continuation) throws MissingResourceException {
        if (Intrinsics.areEqual(zzbfVar.zza(), zzbc.zzb)) {
            zzep zzepVar = this.zzp;
            if (zzepVar != null) {
                zzepVar.zzb(zzbfVar);
            }
            this.zzp = null;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (zzG(r6, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        if (r6.zzc(r7, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final Object zzh(zzsq zzsqVar, Continuation continuation) {
        zzit zzitVar;
        if (continuation instanceof zzit) {
            zzitVar = (zzit) continuation;
            int i = zzitVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzitVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzitVar = new zzit(this, continuation);
            }
        }
        Object obj = zzitVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzitVar.zzc;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
                Result.Companion companion = Result.INSTANCE;
                return Result.m28550constructorimpl(ResultKt.createFailure(new zzbf(zzbd.zzb, zzbc.zzav, null)));
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m28550constructorimpl(Unit.INSTANCE);
        }
        ResultKt.throwOnFailure(obj);
        if (zzsqVar.zzT() && zzsqVar.zzR() && zzsqVar.zzQ()) {
            this.zzf = zzsqVar;
            String strZzd = this.zzc.zzd();
            zzitVar.zzc = 2;
        } else {
            zzcd zzcdVar = this.zzg;
            zzjg zzjgVar = zzjg.zzd;
            zzitVar.zzc = 1;
        }
        return coroutine_suspended;
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final Object zzi(String str, long j, Exception exc, Continuation continuation) {
        exc.getMessage();
        CompletableDeferred completableDeferred = (CompletableDeferred) this.zze.remove(str);
        if (completableDeferred != null) {
            boxing.boxBoolean(completableDeferred.completeExceptionally(exc));
        }
        return Unit.INSTANCE;
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final Object zzj(Exception exc, Continuation continuation) {
        return ((exc instanceof Timeout4) && this.zzi.zza() == null) ? new zzbf(zzbd.zzc, zzbc.zzH, null) : zzf.zza(exc, new zzbf(zzbd.zzb, zzbc.zzV, exc.getMessage()));
    }

    public final zzcd zzm() {
        return this.zzg;
    }

    public final zzil zzq() {
        return this.zzi;
    }

    public final Object zzw(Continuation continuation) {
        return BuildersKt.withContext(this.zzq.zzb().getCoroutineContext(), new zzje((zzjf) this.zzk.getValue(), zzD(), null), continuation);
    }

    public final Object zzx(Continuation continuation) {
        Object objWithContext = BuildersKt.withContext(this.zzq.zzb().getCoroutineContext(), new zzin(this, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }
}
