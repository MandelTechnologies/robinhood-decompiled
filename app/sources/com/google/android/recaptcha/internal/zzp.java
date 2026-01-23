package com.google.android.recaptcha.internal;

import java.util.MissingResourceException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzp implements zzaa {
    private final zzem zza;
    private final Lazy zzb;
    private boolean zzc;

    public zzp(zzem zzemVar) {
        this.zza = zzemVar;
        int i = zzax.zza;
        this.zzb = LazyKt.lazy(zzo.zza);
        this.zzc = true;
    }

    private final zzbh zzg() {
        return (zzbh) this.zzb.getValue();
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final int zza() {
        return 25;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final zzem zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final Object zzc(String str, Continuation continuation) throws MissingResourceException {
        zzep zzepVarZzb = zzab.zzb(this, str);
        String strZza = zzg().zza();
        zzepVarZzb.zza();
        zzud zzudVarZzf = zzuh.zzf();
        zzuf zzufVarZzf = zzug.zzf();
        zzufVarZzf.zzv(strZza);
        zzudVarZzf.zzd(CollectionsKt.listOf(zzufVarZzf.zzj()));
        return zzab.zza(this, (zzuh) zzudVarZzf.zzj());
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final Object zzd(zzst zzstVar, Continuation continuation) throws MissingResourceException {
        zzep zzepVarZzc = zzab.zzc(this);
        if (zzstVar.zzL().length() == 0) {
            this.zzc = false;
            zzepVarZzc.zzb(new zzbf(zzbd.zzb, zzbc.zzab, null));
            return Unit.INSTANCE;
        }
        zzg().zzb(MapsKt.mapOf(Tuples4.m3642to("_GRECAPTCHA_KC", zzstVar.zzL())));
        zzepVarZzc.zza();
        return Unit.INSTANCE;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final void zze(zztl zztlVar) {
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final boolean zzf() {
        return this.zzc;
    }
}
