package com.google.android.recaptcha.internal;

import java.util.Arrays;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzft extends ContinuationImpl7 implements Function2 {
    final /* synthetic */ Exception zza;
    final /* synthetic */ zzgf zzb;
    final /* synthetic */ zzfv zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzft(Exception exc, zzgf zzgfVar, zzfv zzfvVar, Continuation continuation) {
        super(2, continuation);
        this.zza = exc;
        this.zzb = zzgfVar;
        this.zzc = zzfvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation create(Object obj, Continuation continuation) {
        zzft zzftVar = new zzft(this.zza, this.zzb, this.zzc, continuation);
        zzftVar.zzd = obj;
        return zzftVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzft) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        zzua zzuaVarZza;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.zzd;
        Exception exc = this.zza;
        if (exc instanceof zzcg) {
            zzuaVarZza = ((zzcg) exc).zza();
            zzuaVarZza.zzd(this.zzb.zza());
        } else {
            zzgf zzgfVar = this.zzb;
            zzua zzuaVarZzf = zzub.zzf();
            zzuaVarZzf.zzd(zzgfVar.zza());
            zzuaVarZzf.zzq(2);
            zzuaVarZzf.zzp(2);
            zzuaVarZza = zzuaVarZzf;
        }
        zzub zzubVar = (zzub) zzuaVarZza.zzj();
        zzubVar.zzL();
        zzubVar.zzk();
        Reflection.getOrCreateKotlinClass(this.zza.getClass()).getSimpleName();
        this.zza.getMessage();
        zzgf zzgfVar2 = this.zzb;
        zzbp zzbpVarZzb = zzgfVar2.zzb();
        zzbp zzbpVar = zzgfVar2.zza;
        if (zzbpVar == null) {
            zzbpVar = null;
        }
        zzrv zzrvVarZza = zzex.zza(zzbpVarZzb, zzbpVar);
        String strZzd = this.zzb.zzd();
        if (strZzd.length() == 0) {
            strZzd = "recaptcha.m.Main.rge";
        }
        if (CoroutineScope2.isActive(coroutineScope)) {
            zzfv zzfvVar = this.zzc;
            zzkj zzkjVarZzh = zzkj.zzh();
            byte[] bArrZzd = zzubVar.zzd();
            String strZzi = zzkjVarZzh.zzi(bArrZzd, 0, bArrZzd.length);
            zzkj zzkjVarZzh2 = zzkj.zzh();
            byte[] bArrZzd2 = zzrvVarZza.zzd();
            zzfvVar.zzb.zzd().zzb(strZzd, (String[]) Arrays.copyOf(new String[]{strZzi, zzkjVarZzh2.zzi(bArrZzd2, 0, bArrZzd2.length)}, 2));
        }
        return Unit.INSTANCE;
    }
}
