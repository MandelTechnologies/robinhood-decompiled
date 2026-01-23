package com.google.android.recaptcha.internal;

import java.io.IOException;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
class zzlf extends zzle {
    protected final byte[] zza;

    zzlf(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.recaptcha.internal.zzlg
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzlg) || zzd() != ((zzlg) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzlf)) {
            return obj.equals(this);
        }
        zzlf zzlfVar = (zzlf) obj;
        int iZzj = zzj();
        int iZzj2 = zzlfVar.zzj();
        if (iZzj != 0 && iZzj2 != 0 && iZzj != iZzj2) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > zzlfVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + iZzd + zzd());
        }
        if (iZzd > zzlfVar.zzd()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iZzd + ", " + zzlfVar.zzd());
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzlfVar.zza;
        zzlfVar.zzc();
        int i = 0;
        int i2 = 0;
        while (i < iZzd) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzlg
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.recaptcha.internal.zzlg
    byte zzb(int i) {
        return this.zza[i];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zzlg
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.recaptcha.internal.zzlg
    protected void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, 0, bArr, 0, i3);
    }

    @Override // com.google.android.recaptcha.internal.zzlg
    protected final int zzf(int i, int i2, int i3) {
        return zznt.zzb(i, this.zza, 0, i3);
    }

    @Override // com.google.android.recaptcha.internal.zzlg
    public final zzlg zzg(int i, int i2) {
        int iZzi = zzlg.zzi(0, i2, zzd());
        return iZzi == 0 ? zzlg.zzb : new zzlb(this.zza, 0, iZzi);
    }

    @Override // com.google.android.recaptcha.internal.zzlg
    final void zzh(zzky zzkyVar) throws IOException {
        ((zzlo) zzkyVar).zzc(this.zza, 0, zzd());
    }
}
