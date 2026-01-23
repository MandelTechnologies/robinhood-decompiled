package com.google.android.recaptcha.internal;

import android.content.Context;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import java.util.Timer;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferred3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.Mutex3;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzap {
    public CompletableDeferred zza;
    private final CoroutineScope zzb;
    private final zzem zzc;
    private final StandardIntegrityManager zzd;
    private long zzf;
    private boolean zzh;
    private zzaq zze = zzaq.zza;
    private final Mutex zzg = Mutex3.Mutex$default(false, 1, null);

    public zzap(Context context, CoroutineScope coroutineScope, zzem zzemVar, StandardIntegrityManager standardIntegrityManager, long j) {
        this.zzb = coroutineScope;
        this.zzc = zzemVar;
        this.zzd = standardIntegrityManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzi(Continuation continuation) throws Exception {
        zzai zzaiVar;
        if (continuation instanceof zzai) {
            zzaiVar = (zzai) continuation;
            int i = zzaiVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzaiVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzaiVar = new zzai(this, continuation);
            }
        }
        Object obj = zzaiVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzaiVar.zzc;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Deferred deferredZza = zzbz.zza(this.zzd.prepareIntegrityToken(StandardIntegrityManager.PrepareIntegrityTokenRequest.builder().setCloudProjectNumber(this.zzf).build()));
        zzaiVar.zzc = 1;
        Object objAwait = deferredZza.await(zzaiVar);
        return objAwait == coroutine_suspended ? coroutine_suspended : objAwait;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzj(String str, Continuation continuation) throws Exception {
        zzaj zzajVar;
        if (continuation instanceof zzaj) {
            zzajVar = (zzaj) continuation;
            int i = zzajVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzajVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzajVar = new zzaj(this, continuation);
            }
        }
        Object objAwait = zzajVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzajVar.zzc;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwait);
            CompletableDeferred completableDeferredZzf = zzf();
            zzajVar.zzd = str;
            zzajVar.zzc = 1;
            objAwait = completableDeferredZzf.await(zzajVar);
            if (objAwait != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAwait);
            return ((StandardIntegrityManager.StandardIntegrityToken) objAwait).token();
        }
        str = zzajVar.zzd;
        ResultKt.throwOnFailure(objAwait);
        Deferred deferredZza = zzbz.zza(((StandardIntegrityManager.StandardIntegrityTokenProvider) objAwait).request(StandardIntegrityManager.StandardIntegrityTokenRequest.builder().setRequestHash(str).build()));
        zzajVar.zzd = null;
        zzajVar.zzc = 2;
        objAwait = deferredZza.await(zzajVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
    
        if (r8 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069 A[PHI: r2 r7
      0x0069: PHI (r2v6 com.google.android.recaptcha.internal.zzap) = (r2v3 com.google.android.recaptcha.internal.zzap), (r2v8 com.google.android.recaptcha.internal.zzap) binds: [B:29:0x0066, B:16:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x0069: PHI (r7v4 java.lang.String) = (r7v1 java.lang.String), (r7v6 java.lang.String) binds: [B:29:0x0066, B:16:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(String str, Continuation continuation) throws Exception {
        zzah zzahVar;
        zzap zzapVar;
        if (continuation instanceof zzah) {
            zzahVar = (zzah) continuation;
            int i = zzahVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzahVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzahVar = new zzah(this, continuation);
            }
        }
        Object objZzj = zzahVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzahVar.zzc;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objZzj);
            try {
                zzahVar.zzd = this;
                zzahVar.zze = str;
                zzahVar.zzc = 1;
                objZzj = zzj(str, zzahVar);
                if (objZzj != coroutine_suspended) {
                    zzapVar = this;
                }
            } catch (Exception unused) {
                zzapVar = this;
                zzahVar.zzd = zzapVar;
                zzahVar.zze = str;
                zzahVar.zzc = 2;
                if (zzapVar.zze(zzahVar) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            str = zzahVar.zze;
            zzapVar = zzahVar.zzd;
            try {
                ResultKt.throwOnFailure(objZzj);
            } catch (Exception unused2) {
                zzahVar.zzd = zzapVar;
                zzahVar.zze = str;
                zzahVar.zzc = 2;
                if (zzapVar.zze(zzahVar) != coroutine_suspended) {
                    zzahVar.zzd = null;
                    zzahVar.zze = null;
                    zzahVar.zzc = 3;
                    objZzj = zzapVar.zzj(str, zzahVar);
                }
                return coroutine_suspended;
            }
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objZzj);
                return (String) objZzj;
            }
            str = zzahVar.zze;
            zzapVar = zzahVar.zzd;
            ResultKt.throwOnFailure(objZzj);
            zzahVar.zzd = null;
            zzahVar.zze = null;
            zzahVar.zzc = 3;
            objZzj = zzapVar.zzj(str, zzahVar);
        }
        return (String) objZzj;
    }

    public final Object zzd(long j, Continuation continuation) {
        this.zzf = j;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b3, code lost:
    
        if (kotlin.Unit.INSTANCE == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zze(Continuation continuation) {
        zzam zzamVar;
        Mutex mutex;
        zzap zzapVar;
        if (continuation instanceof zzam) {
            zzamVar = (zzam) continuation;
            int i = zzamVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzamVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzamVar = new zzam(this, continuation);
            }
        }
        Object obj = zzamVar.zzb;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzamVar.zzd;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                mutex = this.zzg;
                zzamVar.zze = this;
                zzamVar.zza = mutex;
                zzamVar.zzd = 1;
                if (mutex.lock(null, zzamVar) != coroutine_suspended) {
                    zzapVar = this;
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            mutex = (Mutex) zzamVar.zza;
            zzapVar = zzamVar.zze;
            ResultKt.throwOnFailure(obj);
            if (!Intrinsics.areEqual(zzapVar.zze, zzaq.zza)) {
                Unit unit = Unit.INSTANCE;
                mutex.unlock(null);
                return unit;
            }
            zzapVar.zze = zzaq.zzb;
            Unit unit2 = Unit.INSTANCE;
            mutex.unlock(null);
            zzem zzemVar = zzapVar.zzc;
            zzemVar.zzc(zzemVar.zzd());
            zzemVar.zzb(2);
            zzep zzepVarZzf = zzemVar.zzf(38);
            zzapVar.zza = CompletableDeferred3.CompletableDeferred$default(null, 1, null);
            BuildersKt__Builders_commonKt.launch$default(zzapVar.zzb, null, null, new zzao(zzapVar, zzepVarZzf, null), 3, null);
            zzamVar.zze = null;
            zzamVar.zza = null;
            zzamVar.zzd = 2;
            if (!zzapVar.zzh) {
                new Timer().schedule(new zzak(zzapVar), 28800000L, 28800000L);
                zzapVar.zzh = true;
            }
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }

    public final CompletableDeferred zzf() {
        CompletableDeferred completableDeferred = this.zza;
        if (completableDeferred != null) {
            return completableDeferred;
        }
        return null;
    }
}
