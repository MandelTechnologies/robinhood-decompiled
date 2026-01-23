package com.google.android.recaptcha.internal;

import android.content.Context;
import java.nio.charset.StandardCharsets;
import java.util.MissingResourceException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzag implements zzaa {
    private final zzem zza;
    private final Context zzb;
    private final zzap zzc;
    private boolean zzd = true;
    private String zze = "";
    private final zzbu zzf;

    public zzag(zzem zzemVar, Context context, CoroutineScope coroutineScope, zzap zzapVar, zzbu zzbuVar) {
        this.zza = zzemVar;
        this.zzb = context;
        this.zzc = zzapVar;
        this.zzf = zzbuVar;
    }

    private static final String zzi(zzlg zzlgVar) {
        zzkj zzkjVarZzg = zzkj.zzg();
        byte[] bArrZzl = zzlgVar.zzl();
        byte[] bArrZzd = zzkb.zza().zza(zzkjVarZzg.zzi(bArrZzl, 0, bArrZzl.length), StandardCharsets.UTF_8).zzd();
        zzlg zzlgVarZzk = zzlg.zzk(bArrZzd, 0, bArrZzd.length);
        zzkj zzkjVarZzh = zzkj.zzh();
        byte[] bArrZzl2 = zzlgVarZzk.zzl();
        return zzkjVarZzh.zzi(bArrZzl2, 0, bArrZzl2.length);
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final zzem zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final Object zzc(String str, Continuation continuation) {
        return CoroutineScope2.coroutineScope(new zzae(this, str, null), continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
    
        if (r12.zze(r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zzaa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzd(zzst zzstVar, Continuation continuation) throws MissingResourceException {
        zzaf zzafVar;
        zzag zzagVar;
        zzep zzepVar;
        if (continuation instanceof zzaf) {
            zzafVar = (zzaf) continuation;
            int i = zzafVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzafVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzafVar = new zzaf(this, continuation);
            }
        }
        Object obj = zzafVar.zzb;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzafVar.zzd;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            zzep zzepVarZzc = zzab.zzc(this);
            if (this.zzf.zza(this.zzb) != 3 || zzstVar.zzf() == 0) {
                this.zzd = false;
                zzepVarZzc.zzb(new zzbf(zzbd.zzb, zzbc.zzab, null));
                return Unit.INSTANCE;
            }
            this.zze = zzi(zzstVar.zzg());
            zzap zzapVar = this.zzc;
            long jZzf = zzstVar.zzf();
            zzafVar.zza = this;
            zzafVar.zze = zzepVarZzc;
            zzafVar.zzd = 1;
            if (zzapVar.zzd(jZzf, zzafVar) != coroutine_suspended) {
                zzagVar = this;
                zzepVar = zzepVarZzc;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzepVar = (zzep) zzafVar.zza;
            ResultKt.throwOnFailure(obj);
            zzepVar.zza();
            return Unit.INSTANCE;
        }
        zzepVar = zzafVar.zze;
        zzagVar = (zzag) zzafVar.zza;
        ResultKt.throwOnFailure(obj);
        zzap zzapVar2 = zzagVar.zzc;
        zzafVar.zza = zzepVar;
        zzafVar.zze = null;
        zzafVar.zzd = 2;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final void zze(zztl zztlVar) {
        this.zze = zzi(zztlVar.zzf());
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final boolean zzf() {
        return this.zzd;
    }
}
