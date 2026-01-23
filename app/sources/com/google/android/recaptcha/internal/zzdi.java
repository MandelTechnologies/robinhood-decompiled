package com.google.android.recaptcha.internal;

import java.util.MissingResourceException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Timeout4;
import kotlinx.coroutines.Timeout6;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzdi extends ContinuationImpl7 implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzdv zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzti zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdi(zzdv zzdvVar, String str, long j, zzti zztiVar, Continuation continuation) {
        super(2, continuation);
        this.zzc = zzdvVar;
        this.zzd = str;
        this.zze = j;
        this.zzf = zztiVar;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzdi(this.zzc, this.zzd, this.zze, this.zzf, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdi) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws MissingResourceException, zzbf {
        zzep zzepVar;
        Exception e;
        Timeout4 e2;
        zzbf e3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.zzb != 0) {
            zzepVar = (zzep) this.zza;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (zzbf e4) {
                e3 = e4;
                zzbf zzbfVarZzs = this.zzc.zzs(e3, e3);
                zzepVar.zzb(zzbfVarZzs);
                throw zzbfVarZzs;
            } catch (Timeout4 e5) {
                e2 = e5;
                zzbf zzbfVarZzs2 = this.zzc.zzs(e2, new zzbf(zzbd.zzc, zzbc.zzb, e2.getMessage()));
                zzepVar.zzb(zzbfVarZzs2);
                throw zzbfVarZzs2;
            } catch (Exception e6) {
                e = e6;
                zzbf zzbfVarZzs3 = this.zzc.zzs(e, new zzbf(zzbd.zzc, zzbc.zzZ, e.getMessage()));
                zzepVar.zzb(zzbfVarZzs3);
                throw zzbfVarZzs3;
            }
        } else {
            ResultKt.throwOnFailure(obj);
            zzep zzepVarZzf = this.zzc.zzu(this.zzd).zzf(28);
            try {
                long j = this.zze;
                zzdh zzdhVar = new zzdh(this.zzc, this.zzf, zzepVarZzf, null);
                this.zza = zzepVarZzf;
                this.zzb = 1;
                Object objWithTimeout = Timeout6.withTimeout(j, zzdhVar, this);
                if (objWithTimeout == coroutine_suspended) {
                    return coroutine_suspended;
                }
                zzepVar = zzepVarZzf;
                obj = objWithTimeout;
            } catch (zzbf e7) {
                zzepVar = zzepVarZzf;
                e3 = e7;
                zzbf zzbfVarZzs4 = this.zzc.zzs(e3, e3);
                zzepVar.zzb(zzbfVarZzs4);
                throw zzbfVarZzs4;
            } catch (Timeout4 e8) {
                zzepVar = zzepVarZzf;
                e2 = e8;
                zzbf zzbfVarZzs22 = this.zzc.zzs(e2, new zzbf(zzbd.zzc, zzbc.zzb, e2.getMessage()));
                zzepVar.zzb(zzbfVarZzs22);
                throw zzbfVarZzs22;
            } catch (Exception e9) {
                zzepVar = zzepVarZzf;
                e = e9;
                zzbf zzbfVarZzs32 = this.zzc.zzs(e, new zzbf(zzbd.zzc, zzbc.zzZ, e.getMessage()));
                zzepVar.zzb(zzbfVarZzs32);
                throw zzbfVarZzs32;
            }
        }
        return (zztl) obj;
    }
}
