package com.google.android.recaptcha.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzfv implements zzfq {
    private final CoroutineScope zza;
    private final zzgh zzb;
    private final zzhz zzc;
    private final Map zzd;

    public zzfv(CoroutineScope coroutineScope, zzgh zzghVar, zzhz zzhzVar, Map map) {
        this.zza = coroutineScope;
        this.zzb = zzghVar;
        this.zzc = zzhzVar;
        this.zzd = map;
    }

    public static final /* synthetic */ void zzf(zzfv zzfvVar, zzvm zzvmVar, zzgf zzgfVar) throws zzcg {
        zzjj zzjjVarZzb = zzjj.zzb();
        int iZza = zzgfVar.zza();
        zzgz zzgzVar = (zzgz) zzfvVar.zzd.get(Integer.valueOf(zzvmVar.zzf()));
        if (zzgzVar == null) {
            throw new zzcg(5, 2, null);
        }
        int iZzg = zzvmVar.zzg();
        zzvl[] zzvlVarArr = (zzvl[]) zzvmVar.zzj().toArray(new zzvl[0]);
        zzgzVar.zza(iZzg, zzgfVar, (zzvl[]) Arrays.copyOf(zzvlVarArr, zzvlVarArr.length));
        if (iZza == zzgfVar.zza()) {
            zzgfVar.zzg(zzgfVar.zza() + 1);
        }
        zzjjVarZzb.zzf();
        long jZza = zzjjVarZzb.zza(TimeUnit.MICROSECONDS);
        int i = zzbm.zza;
        int iZzk = zzvmVar.zzk();
        if (iZzk == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzbm.zza(iZzk - 2, jZza);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzg(List list, zzgf zzgfVar, Continuation continuation) {
        Object objCoroutineScope = CoroutineScope2.coroutineScope(new zzfs(zzgfVar, list, this, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzh(Exception exc, zzgf zzgfVar, Continuation continuation) {
        Object objCoroutineScope = CoroutineScope2.coroutineScope(new zzft(exc, zzgfVar, this, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    @Override // com.google.android.recaptcha.internal.zzfq
    public final void zza(String str) {
        BuildersKt__Builders_commonKt.launch$default(this.zza, null, null, new zzfu(new zzgf(this.zzb), this, str, null), 3, null);
    }
}
