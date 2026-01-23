package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.Mutex3;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzcd {
    private Object zza;
    private final Mutex zzb = Mutex3.Mutex$default(false, 1, null);

    public zzcd(Object obj) {
        this.zza = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(Object obj, Continuation continuation) {
        zzca zzcaVar;
        Mutex mutex;
        zzcd zzcdVar;
        if (continuation instanceof zzca) {
            zzcaVar = (zzca) continuation;
            int i = zzcaVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzcaVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzcaVar = new zzca(this, continuation);
            }
        }
        Object obj2 = zzcaVar.zzb;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzcaVar.zzd;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj2);
            mutex = this.zzb;
            zzcaVar.zze = this;
            zzcaVar.zzf = (zzjg) obj;
            zzcaVar.zza = mutex;
            zzcaVar.zzd = 1;
            if (mutex.lock(null, zzcaVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            zzcdVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex2 = (Mutex) zzcaVar.zza;
            zzjg zzjgVar = zzcaVar.zzf;
            zzcdVar = zzcaVar.zze;
            ResultKt.throwOnFailure(obj2);
            mutex = mutex2;
            obj = zzjgVar;
        }
        try {
            return boxing.boxBoolean(Intrinsics.areEqual(zzcdVar.zza, obj));
        } finally {
            mutex.unlock(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb(Object[] objArr, Continuation continuation) {
        zzcb zzcbVar;
        Mutex mutex;
        zzcd zzcdVar;
        if (continuation instanceof zzcb) {
            zzcbVar = (zzcb) continuation;
            int i = zzcbVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzcbVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzcbVar = new zzcb(this, continuation);
            }
        }
        Object obj = zzcbVar.zzb;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzcbVar.zzd;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            mutex = this.zzb;
            zzcbVar.zze = this;
            zzcbVar.zzf = (zzjg[]) objArr;
            zzcbVar.zza = mutex;
            zzcbVar.zzd = 1;
            if (mutex.lock(null, zzcbVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            zzcdVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex2 = (Mutex) zzcbVar.zza;
            zzjg[] zzjgVarArr = zzcbVar.zzf;
            zzcdVar = zzcbVar.zze;
            ResultKt.throwOnFailure(obj);
            mutex = mutex2;
            objArr = zzjgVarArr;
        }
        try {
            return boxing.boxBoolean(ArraysKt.contains(objArr, zzcdVar.zza));
        } finally {
            mutex.unlock(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(Object obj, Continuation continuation) {
        zzcc zzccVar;
        Mutex mutex;
        zzcd zzcdVar;
        if (continuation instanceof zzcc) {
            zzccVar = (zzcc) continuation;
            int i = zzccVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzccVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzccVar = new zzcc(this, continuation);
            }
        }
        Object obj2 = zzccVar.zzb;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzccVar.zzd;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj2);
            mutex = this.zzb;
            zzccVar.zze = this;
            zzccVar.zzf = (zzjg) obj;
            zzccVar.zza = mutex;
            zzccVar.zzd = 1;
            if (mutex.lock(null, zzccVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            zzcdVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex2 = (Mutex) zzccVar.zza;
            zzjg zzjgVar = zzccVar.zzf;
            zzcdVar = zzccVar.zze;
            ResultKt.throwOnFailure(obj2);
            mutex = mutex2;
            obj = zzjgVar;
        }
        try {
            zzcdVar.zza = obj;
            Unit unit = Unit.INSTANCE;
            mutex.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }
}
