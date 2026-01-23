package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
class zzki extends zzkj {
    final zzkf zza;
    final Character zzb;

    zzki(zzkf zzkfVar, Character ch) {
        this.zza = zzkfVar;
        if (ch != null && zzkfVar.zzd('=')) {
            throw new IllegalArgumentException(zzjk.zza("Padding character %s was already in alphabet", ch));
        }
        this.zzb = ch;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzki) {
            zzki zzkiVar = (zzki) obj;
            if (this.zza.equals(zzkiVar.zza) && Objects.equals(this.zzb, zzkiVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch = this.zzb;
        return Objects.hashCode(ch) ^ this.zza.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.zza);
        if (8 % this.zza.zzb != 0) {
            if (this.zzb == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.zzb);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    @Override // com.google.android.recaptcha.internal.zzkj
    int zza(byte[] bArr, CharSequence charSequence) throws zzkh {
        zzkf zzkfVar;
        CharSequence charSequenceZze = zze(charSequence);
        if (!this.zza.zzc(charSequenceZze.length())) {
            throw new zzkh("Invalid input length " + charSequenceZze.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequenceZze.length()) {
            long jZzb = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                zzkfVar = this.zza;
                if (i3 >= zzkfVar.zzc) {
                    break;
                }
                jZzb <<= zzkfVar.zzb;
                if (i + i3 < charSequenceZze.length()) {
                    jZzb |= this.zza.zzb(charSequenceZze.charAt(i4 + i));
                    i4++;
                }
                i3++;
            }
            int i5 = zzkfVar.zzd;
            int i6 = i4 * zzkfVar.zzb;
            int i7 = (i5 - 1) * 8;
            while (i7 >= (i5 * 8) - i6) {
                bArr[i2] = (byte) ((jZzb >>> i7) & 255);
                i7 -= 8;
                i2++;
            }
            i += this.zza.zzc;
        }
        return i2;
    }

    @Override // com.google.android.recaptcha.internal.zzkj
    void zzb(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        zzjh.zzd(0, i2, bArr.length);
        while (i3 < i2) {
            zzf(appendable, bArr, i3, Math.min(this.zza.zzd, i2 - i3));
            i3 += this.zza.zzd;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzkj
    final int zzc(int i) {
        return (int) (((this.zza.zzb * i) + 7) / 8);
    }

    @Override // com.google.android.recaptcha.internal.zzkj
    final int zzd(int i) {
        zzkf zzkfVar = this.zza;
        return zzkfVar.zzc * zzkl.zza(i, zzkfVar.zzd, RoundingMode.CEILING);
    }

    final void zzf(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        zzjh.zzd(i, i + i2, bArr.length);
        int i3 = 0;
        zzjh.zza(i2 <= this.zza.zzd);
        long j = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            j = (j | (bArr[i + i4] & 255)) << 8;
        }
        int i5 = (i2 + 1) * 8;
        zzkf zzkfVar = this.zza;
        while (i3 < i2 * 8) {
            long j2 = j >>> ((i5 - zzkfVar.zzb) - i3);
            zzkf zzkfVar2 = this.zza;
            appendable.append(zzkfVar2.zza(((int) j2) & zzkfVar2.zza));
            i3 += this.zza.zzb;
        }
        if (this.zzb != null) {
            while (i3 < this.zza.zzd * 8) {
                this.zzb.getClass();
                appendable.append('=');
                i3 += this.zza.zzb;
            }
        }
    }

    zzki(String str, String str2, Character ch) {
        this(new zzkf(str, str2.toCharArray()), ch);
    }

    @Override // com.google.android.recaptcha.internal.zzkj
    final CharSequence zze(CharSequence charSequence) {
        charSequence.getClass();
        if (this.zzb == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }
}
