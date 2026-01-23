package com.google.android.recaptcha.internal;

import android.os.Build;
import java.util.MissingResourceException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzad implements zzaa {
    private final zzem zza;

    public zzad(zzem zzemVar) {
        this.zza = zzemVar;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final int zza() {
        return 10;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final zzem zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final Object zzc(String str, Continuation continuation) throws MissingResourceException {
        zzep zzepVarZzb = zzab.zzb(this, str);
        int i = Build.VERSION.SDK_INT;
        zzepVarZzb.zza();
        zzud zzudVarZzf = zzuh.zzf();
        zzuf zzufVarZzf = zzug.zzf();
        zzufVarZzf.zzv(String.valueOf(i));
        zzudVarZzf.zzd(CollectionsKt.listOf(zzufVarZzf.zzj()));
        return zzab.zza(this, (zzuh) zzudVarZzf.zzj());
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final Object zzd(zzst zzstVar, Continuation continuation) throws MissingResourceException {
        zzab.zzc(this).zza();
        return Unit.INSTANCE;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final void zze(zztl zztlVar) {
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final boolean zzf() {
        return true;
    }
}
