package com.google.android.recaptcha.internal;

import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzkd extends zzjt {
    private final MessageDigest zza;
    private final int zzb;
    private boolean zzc;

    /* synthetic */ zzkd(MessageDigest messageDigest, int i, zzkc zzkcVar) {
        this.zza = messageDigest;
        this.zzb = i;
    }

    private final void zzc() {
        zzjh.zze(!this.zzc, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    protected final void zza(byte[] bArr, int i, int i2) {
        zzc();
        this.zza.update(bArr, 0, i2);
    }

    @Override // com.google.android.recaptcha.internal.zzjz
    public final zzjx zzb() {
        zzc();
        this.zzc = true;
        int i = this.zzb;
        if (i == this.zza.getDigestLength()) {
            byte[] bArrDigest = this.zza.digest();
            int i2 = zzjx.zzb;
            return new zzjw(bArrDigest);
        }
        byte[] bArrCopyOf = Arrays.copyOf(this.zza.digest(), i);
        int i3 = zzjx.zzb;
        return new zzjw(bArrCopyOf);
    }
}
