package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzbs {
    public static final zzbs zza = new zzbs();

    private zzbs() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ae, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r7, r1) != r3) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00ae -> B:13:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(Function1 function1, long j, long j2, double d, Function1 function12, Continuation continuation) throws Exception {
        zzbr zzbrVar;
        long jCoerceAtMost;
        long j3;
        double d2;
        Function1 function13;
        zzbr zzbrVar2;
        Function1 function14;
        Function1 function15;
        long j4;
        double d3;
        Exception e;
        if (continuation instanceof zzbr) {
            zzbrVar = (zzbr) continuation;
            int i = zzbrVar.zzh;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzbrVar.zzh = i - Integer.MIN_VALUE;
            } else {
                zzbrVar = new zzbr(this, continuation);
            }
        }
        Object obj = zzbrVar.zzf;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzbrVar.zzh;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            jCoerceAtMost = j;
            j3 = j2;
            d2 = d;
            function13 = function12;
            zzbrVar2 = zzbrVar;
            function14 = function1;
            zzbrVar2.zza = function14;
            zzbrVar2.zzb = function13;
            zzbrVar2.zzc = j3;
            zzbrVar2.zze = d2;
            zzbrVar2.zzd = jCoerceAtMost;
            zzbrVar2.zzh = 1;
            Object objInvoke = function13.invoke(zzbrVar2);
            if (objInvoke != coroutine_suspended) {
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jCoerceAtMost = zzbrVar.zzd;
                d3 = zzbrVar.zze;
                j4 = zzbrVar.zzc;
                function13 = (Function1) zzbrVar.zzb;
                function15 = (Function1) zzbrVar.zza;
                ResultKt.throwOnFailure(obj);
                Function1 function16 = function15;
                zzbrVar2 = zzbrVar;
                function14 = function16;
                long j5 = j4;
                d2 = d3;
                j3 = j5;
                try {
                } catch (Exception e2) {
                    e = e2;
                    zzbr zzbrVar3 = zzbrVar2;
                    function15 = function14;
                    zzbrVar = zzbrVar3;
                    double d4 = d2;
                    j4 = j3;
                    d3 = d4;
                    if (((Boolean) function15.invoke(e)).booleanValue()) {
                    }
                }
                zzbrVar2.zza = function14;
                zzbrVar2.zzb = function13;
                zzbrVar2.zzc = j3;
                zzbrVar2.zze = d2;
                zzbrVar2.zzd = jCoerceAtMost;
                zzbrVar2.zzh = 1;
                Object objInvoke2 = function13.invoke(zzbrVar2);
                return objInvoke2 != coroutine_suspended ? coroutine_suspended : objInvoke2;
            }
            jCoerceAtMost = zzbrVar.zzd;
            d3 = zzbrVar.zze;
            j4 = zzbrVar.zzc;
            function13 = (Function1) zzbrVar.zzb;
            function15 = (Function1) zzbrVar.zza;
            try {
                ResultKt.throwOnFailure(obj);
                return obj;
            } catch (Exception e3) {
                e = e3;
                if (((Boolean) function15.invoke(e)).booleanValue()) {
                    throw e;
                }
                jCoerceAtMost = RangesKt.coerceAtMost((long) (jCoerceAtMost * d3), j4);
                zzbrVar.zza = function15;
                zzbrVar.zzb = function13;
                zzbrVar.zzc = j4;
                zzbrVar.zze = d3;
                zzbrVar.zzd = jCoerceAtMost;
                zzbrVar.zzh = 2;
            }
        }
    }
}
