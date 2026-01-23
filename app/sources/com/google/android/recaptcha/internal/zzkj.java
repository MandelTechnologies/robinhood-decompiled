package com.google.android.recaptcha.internal;

import java.io.IOException;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public abstract class zzkj {
    private static final zzkj zza = new zzkg("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final zzkj zzb = new zzkg("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    static {
        new zzki("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new zzki("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        zzkf zzkfVar = new zzkf("base16()", "0123456789ABCDEF".toCharArray());
        new zzki(zzkfVar, null);
        char[] cArr = new char[512];
        zzjh.zza(zzkfVar.zzf.length == 16);
        for (int i = 0; i < 256; i++) {
            cArr[i] = zzkfVar.zza(i >>> 4);
            cArr[i | 256] = zzkfVar.zza(i & 15);
        }
    }

    zzkj() {
    }

    public static zzkj zzg() {
        return zza;
    }

    public static zzkj zzh() {
        return zzb;
    }

    abstract int zza(byte[] bArr, CharSequence charSequence) throws zzkh;

    abstract void zzb(Appendable appendable, byte[] bArr, int i, int i2) throws IOException;

    abstract int zzc(int i);

    abstract int zzd(int i);

    CharSequence zze(CharSequence charSequence) {
        throw null;
    }

    public final String zzi(byte[] bArr, int i, int i2) {
        zzjh.zzd(0, i2, bArr.length);
        StringBuilder sb = new StringBuilder(zzd(i2));
        try {
            zzb(sb, bArr, 0, i2);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final byte[] zzj(CharSequence charSequence) {
        try {
            CharSequence charSequenceZze = zze(charSequence);
            int iZzc = zzc(charSequenceZze.length());
            byte[] bArr = new byte[iZzc];
            int iZza = zza(bArr, charSequenceZze);
            if (iZza == iZzc) {
                return bArr;
            }
            byte[] bArr2 = new byte[iZza];
            System.arraycopy(bArr, 0, bArr2, 0, iZza);
            return bArr2;
        } catch (zzkh e) {
            throw new IllegalArgumentException(e);
        }
    }
}
