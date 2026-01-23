package com.google.android.recaptcha.internal;

import android.content.ContentValues;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzet extends ContinuationImpl7 implements Function2 {
    final /* synthetic */ zzeu zza;
    final /* synthetic */ zzva zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzet(zzeu zzeuVar, zzva zzvaVar, Continuation continuation) {
        super(2, continuation);
        this.zza = zzeuVar;
        this.zzb = zzvaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzet(this.zza, this.zzb, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzet) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        zzva zzvaVar = this.zzb;
        zzeu zzeuVar = this.zza;
        synchronized (zzeq.class) {
            try {
                if (zzeuVar.zze != null) {
                    byte[] bArrZzd = zzvaVar.zzd();
                    zzel zzelVar = new zzel(zzkj.zzg().zzi(bArrZzd, 0, bArrZzd.length), System.currentTimeMillis(), 0);
                    zzek zzekVar = zzeuVar.zze;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("ss", zzelVar.zzc());
                    contentValues.put("ts", Long.valueOf(zzelVar.zzb()));
                    zzekVar.getWritableDatabase().insert("ce", null, contentValues);
                    int iZzb = zzeuVar.zze.zzb() - 500;
                    if (iZzb > 0) {
                        zzeuVar.zze.zza(CollectionsKt.take(zzeuVar.zze.zzd(), iZzb));
                    }
                    if (zzeuVar.zze.zzb() >= 20) {
                        zzeuVar.zzg();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return Unit.INSTANCE;
    }
}
