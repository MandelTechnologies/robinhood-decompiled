package com.google.android.recaptcha.internal;

import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.core.integrity.model.StandardIntegrityErrorCode;
import java.util.MissingResourceException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzae extends ContinuationImpl7 implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzag zzc;
    final /* synthetic */ String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzae(zzag zzagVar, String str, Continuation continuation) {
        super(2, continuation);
        this.zzc = zzagVar;
        this.zzd = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzae(this.zzc, this.zzd, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzae) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r7 != r0) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.google.android.recaptcha.internal.zzep] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws MissingResourceException {
        zzaa zzaaVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        zzep zzepVar = this.zzb;
        try {
        } catch (Exception e) {
            zzepVar.zzb(new zzbf(zzbd.zzb, zzbc.zzaa, e.getMessage()));
            zzag zzagVar = this.zzc;
            this.zza = zzagVar;
            int i = 2;
            this.zzb = 2;
            if (e instanceof StandardIntegrityException) {
                int errorCode = ((StandardIntegrityException) e).getErrorCode();
                if (errorCode == -100) {
                    i = 44;
                } else if (errorCode == -12) {
                    i = 39;
                } else if (errorCode == -3) {
                    i = 30;
                } else if (errorCode == -2) {
                    i = 29;
                } else if (errorCode != -1) {
                    switch (errorCode) {
                        case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                            i = 54;
                            break;
                        case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                            i = 53;
                            break;
                        case -17:
                            i = 52;
                            break;
                        case -16:
                            i = 43;
                            break;
                        case -15:
                            i = 42;
                            break;
                        case -14:
                            i = 41;
                            break;
                        default:
                            switch (errorCode) {
                                case -9:
                                    i = 36;
                                    break;
                                case -8:
                                    i = 35;
                                    break;
                                case -7:
                                    i = 34;
                                    break;
                                case -6:
                                    i = 33;
                                    break;
                                case -5:
                                    i = 32;
                                    break;
                            }
                    }
                } else {
                    i = 28;
                }
            } else {
                i = 45;
            }
            zzua zzuaVarZzf = zzub.zzf();
            zzuaVarZzf.zzp(i);
            zzuaVarZzf.zzq(15);
            obj = zzuaVarZzf.zzj();
            if (obj != coroutine_suspended) {
                zzaaVar = zzagVar;
            }
            return coroutine_suspended;
        }
        if (zzepVar == 0) {
            ResultKt.throwOnFailure(obj);
            zzep zzepVarZzb = zzab.zzb(this.zzc, this.zzd);
            zzag zzagVar2 = this.zzc;
            zzap zzapVar = zzagVar2.zzc;
            String str = zzagVar2.zze;
            this.zza = zzepVarZzb;
            this.zzb = 1;
            obj = zzapVar.zzc(str, this);
            zzepVar = zzepVarZzb;
        } else {
            if (zzepVar != 1) {
                zzaaVar = (zzaa) this.zza;
                ResultKt.throwOnFailure(obj);
                int iZza = zzaaVar.zza();
                zzua zzuaVar = (zzua) ((zzub) obj).zzq();
                zzuaVar.zze(zzaaVar.zza());
                return new zzy(iZza, (zzub) zzuaVar.zzj());
            }
            zzep zzepVar2 = (zzep) this.zza;
            ResultKt.throwOnFailure(obj);
            zzepVar = zzepVar2;
        }
        zzepVar.zza();
        zzag zzagVar3 = this.zzc;
        zzud zzudVarZzf = zzuh.zzf();
        zzuf zzufVarZzf = zzug.zzf();
        zzufVarZzf.zzv((String) obj);
        zzudVarZzf.zze((zzug) zzufVarZzf.zzj());
        return zzab.zza(zzagVar3, (zzuh) zzudVarZzf.zzj());
    }
}
