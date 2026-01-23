package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.MissingResourceException;
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
import kotlinx.coroutines.Deferred;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzk extends ContinuationImpl7 implements Function2 {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ zzem zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzsq zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzk(zzl zzlVar, zzem zzemVar, long j, zzsq zzsqVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzlVar;
        this.zzc = zzemVar;
        this.zzd = j;
        this.zze = zzsqVar;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation create(Object obj, Continuation continuation) {
        zzk zzkVar = new zzk(this.zzb, this.zzc, this.zzd, this.zze, continuation);
        zzkVar.zzf = obj;
        return zzkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzk) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws MissingResourceException {
        Object objAwaitAll;
        zzep zzepVar;
        Object objM28550constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.zza != 0) {
            zzepVar = (zzep) this.zzf;
            ResultKt.throwOnFailure(obj);
            objAwaitAll = obj;
        } else {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.zzf;
            this.zzb.zzb = this.zzc;
            zzem zzemVar = this.zzc;
            zzemVar.zzc(zzemVar.zzd());
            zzep zzepVarZzf = zzemVar.zzf(30);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzd().iterator();
            while (it.hasNext()) {
                arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new zzj((zze) it.next(), this.zzd, this.zze, null), 3, null));
            }
            Deferred[] deferredArr = (Deferred[]) arrayList.toArray(new Deferred[0]);
            Deferred[] deferredArr2 = (Deferred[]) Arrays.copyOf(deferredArr, deferredArr.length);
            this.zzf = zzepVarZzf;
            this.zza = 1;
            objAwaitAll = Await2.awaitAll(deferredArr2, this);
            if (objAwaitAll == coroutine_suspended) {
                return coroutine_suspended;
            }
            zzepVar = zzepVarZzf;
        }
        List list = (List) objAwaitAll;
        if ((list instanceof Collection) && list.isEmpty()) {
            zzbf zzbfVar = new zzbf(zzbd.zzb, zzbc.zzY, null);
            zzepVar.zzb(zzbfVar);
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(zzbfVar));
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!Result.m28555isFailureimpl(((Result) it2.next()).getValue())) {
                    zzepVar.zza();
                    objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
                    break;
                }
            }
            zzbf zzbfVar2 = new zzbf(zzbd.zzb, zzbc.zzY, null);
            zzepVar.zzb(zzbfVar2);
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(zzbfVar2));
        }
        return Result.m28549boximpl(objM28550constructorimpl);
    }
}
