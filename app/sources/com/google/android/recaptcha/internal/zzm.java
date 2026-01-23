package com.google.android.recaptcha.internal;

import android.content.ContentResolver;
import java.util.MissingResourceException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzm implements zzaa {
    private final zzem zza;
    private final ContentResolver zzb;

    public zzm(zzem zzemVar, ContentResolver contentResolver) {
        this.zza = zzemVar;
        this.zzb = contentResolver;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final int zza() {
        return 17;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final zzem zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final Object zzc(String str, Continuation continuation) throws MissingResourceException {
        zzep zzepVarZzb = zzab.zzb(this, str);
        String strZza = zzar.zza(this.zzb);
        zzepVarZzb.zza();
        zzud zzudVarZzf = zzuh.zzf();
        zzuf zzufVarZzf = zzug.zzf();
        zzufVarZzf.zzv(strZza);
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
