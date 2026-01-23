package com.google.android.recaptcha.internal;

import com.plaid.internal.EnumC7081g;
import java.io.IOException;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzkw {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    static int zza(byte[] bArr, int i, zzkv zzkvVar) throws zznv {
        int iZzi = zzi(bArr, i, zzkvVar);
        int i2 = zzkvVar.zza;
        if (i2 < 0) {
            throw new zznv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - iZzi) {
            throw new zznv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            zzkvVar.zzc = zzlg.zzb;
            return iZzi;
        }
        zzkvVar.zzc = zzlg.zzk(bArr, iZzi, i2);
        return iZzi + i2;
    }

    static int zzb(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    static int zzc(zzpe zzpeVar, byte[] bArr, int i, int i2, int i3, zzkv zzkvVar) throws IOException {
        Object objZze = zzpeVar.zze();
        int iZzm = zzm(objZze, zzpeVar, bArr, i, i2, i3, zzkvVar);
        zzpeVar.zzf(objZze);
        zzkvVar.zzc = objZze;
        return iZzm;
    }

    static int zzd(zzpe zzpeVar, byte[] bArr, int i, int i2, zzkv zzkvVar) throws IOException {
        Object objZze = zzpeVar.zze();
        int iZzn = zzn(objZze, zzpeVar, bArr, i, i2, zzkvVar);
        zzpeVar.zzf(objZze);
        zzkvVar.zzc = objZze;
        return iZzn;
    }

    static int zze(zzpe zzpeVar, int i, byte[] bArr, int i2, int i3, zzns zznsVar, zzkv zzkvVar) throws IOException {
        int iZzd = zzd(zzpeVar, bArr, i2, i3, zzkvVar);
        zznsVar.add(zzkvVar.zzc);
        while (iZzd < i3) {
            int iZzi = zzi(bArr, iZzd, zzkvVar);
            if (i != zzkvVar.zza) {
                break;
            }
            iZzd = zzd(zzpeVar, bArr, iZzi, i3, zzkvVar);
            zznsVar.add(zzkvVar.zzc);
        }
        return iZzd;
    }

    static int zzf(byte[] bArr, int i, zzns zznsVar, zzkv zzkvVar) throws IOException {
        zznm zznmVar = (zznm) zznsVar;
        int iZzi = zzi(bArr, i, zzkvVar);
        int i2 = zzkvVar.zza + iZzi;
        while (iZzi < i2) {
            iZzi = zzi(bArr, iZzi, zzkvVar);
            zznmVar.zzh(zzkvVar.zza);
        }
        if (iZzi == i2) {
            return iZzi;
        }
        throw new zznv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int zzg(byte[] bArr, int i, zzkv zzkvVar) throws zznv {
        int iZzi = zzi(bArr, i, zzkvVar);
        int i2 = zzkvVar.zza;
        if (i2 < 0) {
            throw new zznv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 == 0) {
            zzkvVar.zzc = "";
            return iZzi;
        }
        zzkvVar.zzc = new String(bArr, iZzi, i2, zznt.zza);
        return iZzi + i2;
    }

    static int zzh(int i, byte[] bArr, int i2, int i3, zzpw zzpwVar, zzkv zzkvVar) throws zznv {
        if ((i >>> 3) == 0) {
            throw new zznv("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iZzl = zzl(bArr, i2, zzkvVar);
            zzpwVar.zzj(i, Long.valueOf(zzkvVar.zzb));
            return iZzl;
        }
        if (i4 == 1) {
            zzpwVar.zzj(i, Long.valueOf(zzp(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iZzi = zzi(bArr, i2, zzkvVar);
            int i5 = zzkvVar.zza;
            if (i5 < 0) {
                throw new zznv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i5 > bArr.length - iZzi) {
                throw new zznv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i5 == 0) {
                zzpwVar.zzj(i, zzlg.zzb);
            } else {
                zzpwVar.zzj(i, zzlg.zzk(bArr, iZzi, i5));
            }
            return iZzi + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new zznv("Protocol message contained an invalid tag (zero).");
            }
            zzpwVar.zzj(i, Integer.valueOf(zzb(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        zzpw zzpwVarZzf = zzpw.zzf();
        int i7 = zzkvVar.zze + 1;
        zzkvVar.zze = i7;
        zzq(i7);
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iZzi2 = zzi(bArr, i2, zzkvVar);
            int i9 = zzkvVar.zza;
            if (i9 == i6) {
                i8 = i9;
                i2 = iZzi2;
                break;
            }
            i2 = zzh(i9, bArr, iZzi2, i3, zzpwVarZzf, zzkvVar);
            i8 = i9;
        }
        zzkvVar.zze--;
        if (i2 > i3 || i8 != i6) {
            throw new zznv("Failed to parse the message.");
        }
        zzpwVar.zzj(i, zzpwVarZzf);
        return i2;
    }

    static int zzi(byte[] bArr, int i, zzkv zzkvVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzj(b, bArr, i2, zzkvVar);
        }
        zzkvVar.zza = b;
        return i2;
    }

    static int zzj(int i, byte[] bArr, int i2, zzkv zzkvVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE;
        if (b >= 0) {
            zzkvVar.zza = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zzkvVar.zza = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzkvVar.zza = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzkvVar.zza = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzkvVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int zzk(int i, byte[] bArr, int i2, int i3, zzns zznsVar, zzkv zzkvVar) {
        zznm zznmVar = (zznm) zznsVar;
        int iZzi = zzi(bArr, i2, zzkvVar);
        zznmVar.zzh(zzkvVar.zza);
        while (iZzi < i3) {
            int iZzi2 = zzi(bArr, iZzi, zzkvVar);
            if (i != zzkvVar.zza) {
                break;
            }
            iZzi = zzi(bArr, iZzi2, zzkvVar);
            zznmVar.zzh(zzkvVar.zza);
        }
        return iZzi;
    }

    static int zzl(byte[] bArr, int i, zzkv zzkvVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            zzkvVar.zzb = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & 127) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & 127) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        zzkvVar.zzb = j2;
        return i3;
    }

    static int zzm(Object obj, zzpe zzpeVar, byte[] bArr, int i, int i2, int i3, zzkv zzkvVar) throws IOException {
        int i4 = zzkvVar.zze + 1;
        zzkvVar.zze = i4;
        zzq(i4);
        int iZzc = ((zzot) zzpeVar).zzc(obj, bArr, i, i2, i3, zzkvVar);
        zzkvVar.zze--;
        zzkvVar.zzc = obj;
        return iZzc;
    }

    static int zzn(Object obj, zzpe zzpeVar, byte[] bArr, int i, int i2, zzkv zzkvVar) throws IOException {
        int iZzj = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iZzj = zzj(i3, bArr, iZzj, zzkvVar);
            i3 = zzkvVar.zza;
        }
        int i4 = iZzj;
        if (i3 < 0 || i3 > i2 - i4) {
            throw new zznv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i5 = zzkvVar.zze + 1;
        zzkvVar.zze = i5;
        zzq(i5);
        int i6 = i4 + i3;
        zzpeVar.zzi(obj, bArr, i4, i6, zzkvVar);
        zzkvVar.zze--;
        zzkvVar.zzc = obj;
        return i6;
    }

    static int zzo(int i, byte[] bArr, int i2, int i3, zzkv zzkvVar) throws zznv {
        if ((i >>> 3) == 0) {
            throw new zznv("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return zzl(bArr, i2, zzkvVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return zzi(bArr, i2, zzkvVar) + zzkvVar.zza;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw new zznv("Protocol message contained an invalid tag (zero).");
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = zzi(bArr, i2, zzkvVar);
            i6 = zzkvVar.zza;
            if (i6 == i5) {
                break;
            }
            i2 = zzo(i6, bArr, i2, i3, zzkvVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw new zznv("Failed to parse the message.");
        }
        return i2;
    }

    static long zzp(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    private static void zzq(int i) throws zznv {
        if (i >= zzb) {
            throw new zznv("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
