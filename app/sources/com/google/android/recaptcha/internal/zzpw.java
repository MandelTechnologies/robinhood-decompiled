package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzpw {
    private static final zzpw zza = new zzpw(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzpw() {
        this(0, new int[8], new Object[8], true);
    }

    private zzpw(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzpw zzc() {
        return zza;
    }

    static zzpw zze(zzpw zzpwVar, zzpw zzpwVar2) {
        int i = zzpwVar.zzb + zzpwVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzpwVar.zzc, i);
        System.arraycopy(zzpwVar2.zzc, 0, iArrCopyOf, zzpwVar.zzb, zzpwVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzpwVar.zzd, i);
        System.arraycopy(zzpwVar2.zzd, 0, objArrCopyOf, zzpwVar.zzb, zzpwVar2.zzb);
        return new zzpw(i, iArrCopyOf, objArrCopyOf, true);
    }

    static zzpw zzf() {
        return new zzpw(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzpw)) {
            return false;
        }
        zzpw zzpwVar = (zzpw) obj;
        int i = this.zzb;
        if (i == zzpwVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzpwVar.zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzpwVar.zzd;
                    int i3 = this.zzb;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = i + 527;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.zzd;
        int i6 = this.zzb;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public final int zza() {
        int iZzA;
        int iZzB;
        int iZzA2;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.zzd[i3]).getClass();
                    iZzA2 = zzlr.zzA(i5 << 3) + 8;
                } else if (i6 == 2) {
                    int i7 = i5 << 3;
                    zzlg zzlgVar = (zzlg) this.zzd[i3];
                    int iZzA3 = zzlr.zzA(i7);
                    int iZzd = zzlgVar.zzd();
                    iZzA2 = iZzA3 + zzlr.zzA(iZzd) + iZzd;
                } else if (i6 == 3) {
                    int iZzA4 = zzlr.zzA(i5 << 3);
                    iZzA = iZzA4 + iZzA4;
                    iZzB = ((zzpw) this.zzd[i3]).zza();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(new zznu("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i3]).getClass();
                    iZzA2 = zzlr.zzA(i5 << 3) + 4;
                }
                i2 += iZzA2;
            } else {
                int i8 = i5 << 3;
                long jLongValue = ((Long) this.zzd[i3]).longValue();
                iZzA = zzlr.zzA(i8);
                iZzB = zzlr.zzB(jLongValue);
            }
            iZzA2 = iZzA + iZzB;
            i2 += iZzA2;
        }
        this.zze = i2;
        return i2;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iZzA = 0;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            int i3 = this.zzc[i2] >>> 3;
            zzlg zzlgVar = (zzlg) this.zzd[i2];
            int iZzA2 = zzlr.zzA(8);
            int iZzA3 = zzlr.zzA(16) + zzlr.zzA(i3);
            int iZzA4 = zzlr.zzA(24);
            int iZzd = zzlgVar.zzd();
            iZzA += iZzA2 + iZzA2 + iZzA3 + iZzA4 + zzlr.zzA(iZzd) + iZzd;
        }
        this.zze = iZzA;
        return iZzA;
    }

    final zzpw zzd(zzpw zzpwVar) {
        if (zzpwVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzpwVar.zzb;
        zzm(i);
        System.arraycopy(zzpwVar.zzc, 0, this.zzc, this.zzb, zzpwVar.zzb);
        System.arraycopy(zzpwVar.zzd, 0, this.zzd, this.zzb, zzpwVar.zzb);
        this.zzb = i;
        return this;
    }

    final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    final void zzi(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzos.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    final void zzj(int i, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    final void zzk(zzqi zzqiVar) throws IOException {
        for (int i = 0; i < this.zzb; i++) {
            zzqiVar.zzw(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzl(zzqi zzqiVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzqiVar.zzt(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    zzqiVar.zzm(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    zzqiVar.zzd(i4, (zzlg) obj);
                } else if (i3 == 3) {
                    zzqiVar.zzF(i4);
                    ((zzpw) obj).zzl(zzqiVar);
                    zzqiVar.zzh(i4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(new zznu("Protocol message tag had invalid wire type."));
                    }
                    zzqiVar.zzk(i4, ((Integer) obj).intValue());
                }
            }
        }
    }
}
