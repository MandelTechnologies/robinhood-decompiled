package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzlb extends zzlf {
    private final int zzc;

    zzlb(byte[] bArr, int i, int i2) {
        super(bArr);
        zzlg.zzi(0, i2, bArr.length);
        this.zzc = i2;
    }

    @Override // com.google.android.recaptcha.internal.zzlf, com.google.android.recaptcha.internal.zzlg
    final byte zzb(int i) {
        return ((zzlf) this).zza[i];
    }

    @Override // com.google.android.recaptcha.internal.zzlf
    protected final int zzc() {
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zzlf, com.google.android.recaptcha.internal.zzlg
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzlf, com.google.android.recaptcha.internal.zzlg
    protected final void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(((zzlf) this).zza, 0, bArr, 0, i3);
    }

    @Override // com.google.android.recaptcha.internal.zzlf, com.google.android.recaptcha.internal.zzlg
    public final byte zza(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) >= 0) {
            return ((zzlf) this).zza[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }
}
