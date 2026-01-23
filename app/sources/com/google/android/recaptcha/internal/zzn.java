package com.google.android.recaptcha.internal;

import android.os.Build;
import java.util.MissingResourceException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzn implements zzaa {
    private final zzem zza;

    public zzn(zzem zzemVar) {
        this.zza = zzemVar;
    }

    private static final zzug zzg(String str) {
        zzuf zzufVarZzf = zzug.zzf();
        zzufVarZzf.zzv(str);
        return (zzug) zzufVarZzf.zzj();
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final zzem zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final Object zzc(String str, Continuation continuation) throws MissingResourceException {
        zzep zzepVarZzb = zzab.zzb(this, str);
        zzud zzudVarZzf = zzuh.zzf();
        zzug zzugVarZzg = zzg(Build.MANUFACTURER);
        zzug zzugVarZzg2 = zzg(Build.MODEL);
        zzug zzugVarZzg3 = zzg(Build.DEVICE);
        zzug zzugVarZzg4 = zzg(Build.HARDWARE);
        zzug zzugVarZzg5 = zzg(Build.FINGERPRINT);
        zzug zzugVarZzg6 = zzg(Build.PRODUCT);
        zzug zzugVarZzg7 = zzg(Build.BOARD);
        zzug zzugVarZzg8 = zzg(Build.BRAND);
        zzug zzugVarZzg9 = zzg(ArraysKt.joinToString$default(Build.SUPPORTED_ABIS, ",", "[", "]", 0, (CharSequence) null, (Function1) null, 56, (Object) null));
        long j = Build.TIME;
        zzuf zzufVarZzf = zzug.zzf();
        zzufVarZzf.zzu(j);
        zzudVarZzf.zzd(CollectionsKt.listOf((Object[]) new zzug[]{zzugVarZzg, zzugVarZzg2, zzugVarZzg3, zzugVarZzg4, zzugVarZzg5, zzugVarZzg6, zzugVarZzg7, zzugVarZzg8, zzugVarZzg9, (zzug) zzufVarZzf.zzj(), zzg(Build.ID), zzg(Build.BOOTLOADER), zzg(Build.DISPLAY), zzg(Build.TYPE), zzg(Build.TAGS)}));
        zzepVarZzb.zza();
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
