package com.google.android.libraries.places.internal;

import com.adjust.sdk.Constants;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;

/* compiled from: com.google.android.libraries.places:places@@3.5.0 */
/* loaded from: classes27.dex */
public final class zzbug {
    String zza;
    String zzb;
    int zzc = -1;

    /* JADX WARN: Code restructure failed: missing block: B:100:?, code lost:
    
        return r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        r17 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008d, code lost:
    
        if ((r12 - r10) == 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008f, code lost:
    
        r3[r7] = (byte) r14;
        r11 = r17;
        r7 = r7 + 1;
        r10 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d7, code lost:
    
        if (r8 == 16) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d9, code lost:
    
        if (r9 != (-1)) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00db, code lost:
    
        return r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00dc, code lost:
    
        r0 = r8 - r9;
        java.lang.System.arraycopy(r3, r9, r3, 16 - r0, r0);
        java.util.Arrays.fill(r3, r9, (16 - r8) + r9, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ec, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f2, code lost:
    
        throw new java.lang.AssertionError();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static InetAddress zzf(String str, int i, int i2) {
        InetAddress inetAddress;
        InetAddress inetAddress2;
        byte[] bArr = new byte[16];
        int i3 = 1;
        int i4 = -1;
        int i5 = -1;
        int i6 = 0;
        while (true) {
            InetAddress inetAddress3 = null;
            if (i3 >= i2) {
                break;
            }
            if (i6 == 16) {
                return null;
            }
            int i7 = i3 + 2;
            if (i7 > i2 || !str.regionMatches(i3, "::", 0, 2)) {
                if (i6 == 0) {
                    inetAddress = null;
                    i5 = i3;
                } else if (str.regionMatches(i3, ":", 0, 1)) {
                    i5 = i3 + 1;
                    inetAddress = null;
                } else {
                    if (!str.regionMatches(i3, ".", 0, 1)) {
                        return null;
                    }
                    int i8 = i6 - 2;
                    int i9 = i8;
                    while (i5 < i2) {
                        if (i9 != 16) {
                            if (i9 != i8) {
                                if (str.charAt(i5) == '.') {
                                    i5++;
                                }
                            }
                            int i10 = 0;
                            int i11 = i5;
                            while (true) {
                                if (i11 >= i2) {
                                    inetAddress2 = inetAddress3;
                                    break;
                                }
                                char cCharAt = str.charAt(i11);
                                inetAddress2 = inetAddress3;
                                if (cCharAt < '0' || cCharAt > '9') {
                                    break;
                                }
                                if (i10 == 0) {
                                    if (i5 != i11) {
                                        return inetAddress2;
                                    }
                                    i10 = 0;
                                }
                                i10 = ((i10 * 10) + cCharAt) - 48;
                                if (i10 > 255) {
                                    return inetAddress2;
                                }
                                i11++;
                                inetAddress3 = inetAddress2;
                            }
                        }
                        return inetAddress3;
                    }
                    InetAddress inetAddress4 = inetAddress3;
                    if (i9 != i6 + 2) {
                        return inetAddress4;
                    }
                    i6 += 2;
                }
            } else {
                if (i4 != -1) {
                    return null;
                }
                i6 += 2;
                if (i7 == i2) {
                    i4 = i6;
                    break;
                }
                i4 = i6;
                inetAddress = null;
                i5 = i7;
            }
            int i12 = 0;
            i3 = i5;
            while (i3 < i2) {
                int iZza = zzbui.zza(str.charAt(i3));
                if (iZza == -1) {
                    break;
                }
                i3++;
                i12 = (i12 << 4) + iZza;
            }
            int i13 = i3 - i5;
            if (i13 == 0 || i13 > 4) {
                break;
            }
            int i14 = i6 + 1;
            bArr[i6] = (byte) (255 & (i12 >>> 8));
            i6 += 2;
            bArr[i14] = (byte) (i12 & 255);
        }
        return inetAddress;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.zza);
        sb.append("://");
        if (this.zzb.indexOf(58) != -1) {
            sb.append('[');
            sb.append(this.zzb);
            sb.append(']');
        } else {
            sb.append(this.zzb);
        }
        int iZza = zza();
        if (iZza != zzbui.zzb(this.zza)) {
            sb.append(':');
            sb.append(iZza);
        }
        return sb.toString();
    }

    final int zza() {
        int i = this.zzc;
        return i != -1 ? i : zzbui.zzb(this.zza);
    }

    public final zzbug zzb(String str) {
        int i;
        String strSubstring;
        if (str == null) {
            throw new IllegalArgumentException("host == null");
        }
        int i2 = 0;
        int iCharCount = 0;
        while (true) {
            int length = str.length();
            i = -1;
            if (iCharCount >= length) {
                strSubstring = str.substring(0, length);
                break;
            }
            if (str.charAt(iCharCount) != '%') {
                iCharCount++;
            } else {
                zzbwb zzbwbVar = new zzbwb();
                zzbwbVar.zzt(str, 0, iCharCount);
                while (iCharCount < length) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt != 37) {
                        zzbwbVar.zzu(iCodePointAt);
                    } else {
                        int i3 = iCharCount + 2;
                        if (i3 < length) {
                            int iZza = zzbui.zza(str.charAt(iCharCount + 1));
                            int iZza2 = zzbui.zza(str.charAt(i3));
                            if (iZza != -1 && iZza2 != -1) {
                                zzbwbVar.zzm((iZza << 4) + iZza2);
                                iCharCount = i3;
                                iCodePointAt = 37;
                            }
                        }
                        iCodePointAt = 37;
                        zzbwbVar.zzu(iCodePointAt);
                    }
                    iCharCount += Character.charCount(iCodePointAt);
                }
                strSubstring = zzbwbVar.zzi();
            }
        }
        String strZzi = null;
        if (strSubstring.startsWith("[") && strSubstring.endsWith("]")) {
            InetAddress inetAddressZzf = zzf(strSubstring, 1, strSubstring.length() - 1);
            if (inetAddressZzf != null) {
                byte[] address = inetAddressZzf.getAddress();
                if (address.length != 16) {
                    throw new AssertionError();
                }
                int i4 = 0;
                int i5 = 0;
                while (i4 < address.length) {
                    int i6 = i4;
                    while (i6 < 16 && address[i6] == 0 && address[i6 + 1] == 0) {
                        i6 += 2;
                    }
                    int i7 = i6 - i4;
                    int i8 = i7 > i5 ? i7 : i5;
                    if (i7 > i5) {
                        i = i4;
                    }
                    i4 = i6 + 2;
                    i5 = i8;
                }
                zzbwb zzbwbVar2 = new zzbwb();
                while (i2 < address.length) {
                    if (i2 == i) {
                        zzbwbVar2.zzm(58);
                        i2 += i5;
                        if (i2 == 16) {
                            zzbwbVar2.zzm(58);
                        }
                    } else {
                        if (i2 > 0) {
                            zzbwbVar2.zzm(58);
                        }
                        zzbwbVar2.zzo(((address[i2] & 255) << 8) | (address[i2 + 1] & 255));
                        i2 += 2;
                    }
                }
                strZzi = zzbwbVar2.zzi();
            }
        } else {
            try {
                String lowerCase = IDN.toASCII(strSubstring).toLowerCase(Locale.US);
                if (!lowerCase.isEmpty()) {
                    while (true) {
                        if (i2 >= lowerCase.length()) {
                            strZzi = lowerCase;
                            break;
                        }
                        char cCharAt = lowerCase.charAt(i2);
                        if (cCharAt <= 31 || cCharAt >= 127 || " #%/:?@[\\]".indexOf(cCharAt) != -1) {
                            break;
                        }
                        i2++;
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        if (strZzi == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        this.zzb = strZzi;
        return this;
    }

    public final zzbug zzc(int i) {
        if (i > 0 && i <= 65535) {
            this.zzc = i;
            return this;
        }
        throw new IllegalArgumentException("unexpected port: " + i);
    }

    public final zzbui zze() {
        if (this.zza == null) {
            throw new IllegalStateException("scheme == null");
        }
        if (this.zzb != null) {
            return new zzbui(this, null);
        }
        throw new IllegalStateException("host == null");
    }

    public final zzbug zzd(String str) {
        this.zza = Constants.SCHEME;
        return this;
    }
}
