package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Await2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzu extends ContinuationImpl7 implements Function2 {
    int zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzx zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzu(String str, zzx zzxVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = str;
        this.zzc = zzxVar;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation create(Object obj, Continuation continuation) {
        zzu zzuVar = new zzu(this.zzb, this.zzc, continuation);
        zzuVar.zzd = obj;
        return zzuVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzu) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        ResultKt.throwOnFailure(obj);
        if (i == 0) {
            CoroutineScope coroutineScope = (CoroutineScope) this.zzd;
            String str = this.zzb;
            zztu zztuVarZzf = zztv.zzf();
            zztuVarZzf.zze(str);
            zzx zzxVar = this.zzc;
            zzxVar.zzr().put(this.zzb, zztuVarZzf);
            ArrayList arrayList = new ArrayList();
            List list = this.zzc.zzb;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (((zzaa) obj2).zzf()) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new zzt(this.zzc, this.zzb, (zzaa) it.next(), zztuVarZzf, null), 3, null));
                zztuVarZzf = zztuVarZzf;
            }
            Job[] jobArr = (Job[]) arrayList.toArray(new Job[0]);
            Job[] jobArr2 = (Job[]) Arrays.copyOf(jobArr, jobArr.length);
            this.zza = 1;
            if (Await2.joinAll(jobArr2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        Result.Companion companion = Result.INSTANCE;
        return Result.m28549boximpl(Result.m28550constructorimpl(this.zzc.zzt(this.zzb)));
    }
}
