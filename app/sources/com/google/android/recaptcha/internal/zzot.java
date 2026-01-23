package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzot<T> implements zzpe<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzqc.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzoq zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzpv zzm;
    private final zzmx zzn;

    private zzot(int[] iArr, Object[] objArr, int i, int i2, zzoq zzoqVar, boolean z, int[] iArr2, int i3, int i4, zzow zzowVar, zzod zzodVar, zzpv zzpvVar, zzmx zzmxVar, zzol zzolVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzoqVar instanceof zznl;
        boolean z2 = false;
        if (zzmxVar != null && (zzoqVar instanceof zzni)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzm = zzpvVar;
        this.zzn = zzmxVar;
        this.zzg = zzoqVar;
    }

    private final Object zzA(Object obj, int i) {
        zzpe zzpeVarZzx = zzx(i);
        int iZzu = zzu(i) & 1048575;
        if (!zzN(obj, i)) {
            return zzpeVarZzx.zze();
        }
        Object object = zzb.getObject(obj, iZzu);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzpeVarZzx.zze();
        if (object != null) {
            zzpeVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzB(Object obj, int i, int i2) {
        zzpe zzpeVarZzx = zzx(i2);
        if (!zzR(obj, i, i2)) {
            return zzpeVarZzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i2) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzpeVarZzx.zze();
        if (object != null) {
            zzpeVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzE(Object obj, Object obj2, int i) {
        if (zzN(obj2, i)) {
            int iZzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzpe zzpeVarZzx = zzx(i);
            if (!zzN(obj, i)) {
                if (zzQ(object)) {
                    Object objZze = zzpeVarZzx.zze();
                    zzpeVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzH(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object objZze2 = zzpeVarZzx.zze();
                zzpeVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzpeVarZzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzR(obj2, i2, i)) {
            int iZzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzpe zzpeVarZzx = zzx(i);
            if (!zzR(obj, i2, i)) {
                if (zzQ(object)) {
                    Object objZze = zzpeVarZzx.zze();
                    zzpeVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzI(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object objZze2 = zzpeVarZzx.zze();
                zzpeVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzpeVarZzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i, zzpd zzpdVar) throws IOException {
        long j = i & 1048575;
        if (zzM(i)) {
            zzqc.zzs(obj, j, zzpdVar.zzs());
        } else if (this.zzi) {
            zzqc.zzs(obj, j, zzpdVar.zzr());
        } else {
            zzqc.zzs(obj, j, zzpdVar.zzp());
        }
    }

    private final void zzH(Object obj, int i) {
        int iZzr = zzr(i);
        long j = 1048575 & iZzr;
        if (j == 1048575) {
            return;
        }
        zzqc.zzq(obj, j, (1 << (iZzr >>> 20)) | zzqc.zzc(obj, j));
    }

    private final void zzI(Object obj, int i, int i2) {
        zzqc.zzq(obj, zzr(i2) & 1048575, i);
    }

    private final void zzJ(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzu(i) & 1048575, obj2);
        zzH(obj, i);
    }

    private final void zzK(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzu(i2) & 1048575, obj2);
        zzI(obj, i, i2);
    }

    private final boolean zzL(Object obj, Object obj2, int i) {
        return zzN(obj, i) == zzN(obj2, i);
    }

    private static boolean zzM(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i) {
        int iZzr = zzr(i);
        long j = iZzr & 1048575;
        if (j != 1048575) {
            return (zzqc.zzc(obj, j) & (1 << (iZzr >>> 20))) != 0;
        }
        int iZzu = zzu(i);
        long j2 = iZzu & 1048575;
        switch (zzt(iZzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzqc.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzqc.zzb(obj, j2)) != 0;
            case 2:
                return zzqc.zzd(obj, j2) != 0;
            case 3:
                return zzqc.zzd(obj, j2) != 0;
            case 4:
                return zzqc.zzc(obj, j2) != 0;
            case 5:
                return zzqc.zzd(obj, j2) != 0;
            case 6:
                return zzqc.zzc(obj, j2) != 0;
            case 7:
                return zzqc.zzw(obj, j2);
            case 8:
                Object objZzf = zzqc.zzf(obj, j2);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzlg) {
                    return !zzlg.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzqc.zzf(obj, j2) != null;
            case 10:
                return !zzlg.zzb.equals(zzqc.zzf(obj, j2));
            case 11:
                return zzqc.zzc(obj, j2) != 0;
            case 12:
                return zzqc.zzc(obj, j2) != 0;
            case 13:
                return zzqc.zzc(obj, j2) != 0;
            case 14:
                return zzqc.zzd(obj, j2) != 0;
            case 15:
                return zzqc.zzc(obj, j2) != 0;
            case 16:
                return zzqc.zzd(obj, j2) != 0;
            case 17:
                return zzqc.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzN(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzP(Object obj, int i, zzpe zzpeVar) {
        return zzpeVar.zzl(zzqc.zzf(obj, i & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zznl) {
            return ((zznl) obj).zzK();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i, int i2) {
        return zzqc.zzc(obj, (long) (zzr(i2) & 1048575)) == i;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzqc.zzf(obj, j)).booleanValue();
    }

    private static final void zzT(int i, Object obj, zzqi zzqiVar) throws IOException {
        if (obj instanceof String) {
            zzqiVar.zzG(i, (String) obj);
        } else {
            zzqiVar.zzd(i, (zzlg) obj);
        }
    }

    static zzpw zzd(Object obj) {
        zznl zznlVar = (zznl) obj;
        zzpw zzpwVar = zznlVar.zzc;
        if (zzpwVar != zzpw.zzc()) {
            return zzpwVar;
        }
        zzpw zzpwVarZzf = zzpw.zzf();
        zznlVar.zzc = zzpwVarZzf;
        return zzpwVarZzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzot zzm(Class cls, zzon zzonVar, zzow zzowVar, zzod zzodVar, zzpv zzpvVar, zzmx zzmxVar, zzol zzolVar) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        int i7;
        int i8;
        char cCharAt;
        int i9;
        char cCharAt2;
        int i10;
        char cCharAt3;
        int i11;
        char cCharAt4;
        int i12;
        char cCharAt5;
        int i13;
        char cCharAt6;
        int i14;
        char cCharAt7;
        int i15;
        char cCharAt8;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        String str;
        int iObjectFieldOffset;
        char c;
        int iObjectFieldOffset2;
        int i21;
        int i22;
        int i23;
        Field fieldZzC;
        char cCharAt9;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        Object obj;
        Field fieldZzC2;
        Object obj2;
        Field fieldZzC3;
        int i29;
        char cCharAt10;
        int i30;
        char cCharAt11;
        int i31;
        char cCharAt12;
        int i32;
        char cCharAt13;
        if (!(zzonVar instanceof zzpc)) {
            throw null;
        }
        zzpc zzpcVar = (zzpc) zzonVar;
        String strZzd = zzpcVar.zzd();
        int length = strZzd.length();
        char c2 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i33 = 1;
            while (true) {
                i = i33 + 1;
                if (strZzd.charAt(i33) < 55296) {
                    break;
                }
                i33 = i;
            }
        } else {
            i = 1;
        }
        int i34 = i + 1;
        int iCharAt2 = strZzd.charAt(i);
        if (iCharAt2 >= 55296) {
            int i35 = iCharAt2 & 8191;
            int i36 = 13;
            while (true) {
                i32 = i34 + 1;
                cCharAt13 = strZzd.charAt(i34);
                if (cCharAt13 < 55296) {
                    break;
                }
                i35 |= (cCharAt13 & 8191) << i36;
                i36 += 13;
                i34 = i32;
            }
            iCharAt2 = i35 | (cCharAt13 << i36);
            i34 = i32;
        }
        if (iCharAt2 == 0) {
            i3 = 0;
            i6 = 0;
            iCharAt = 0;
            i2 = 0;
            i4 = 0;
            i5 = 0;
            iArr = zza;
            i7 = 0;
        } else {
            int i37 = i34 + 1;
            int iCharAt3 = strZzd.charAt(i34);
            if (iCharAt3 >= 55296) {
                int i38 = iCharAt3 & 8191;
                int i39 = 13;
                while (true) {
                    i15 = i37 + 1;
                    cCharAt8 = strZzd.charAt(i37);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i38 |= (cCharAt8 & 8191) << i39;
                    i39 += 13;
                    i37 = i15;
                }
                iCharAt3 = i38 | (cCharAt8 << i39);
                i37 = i15;
            }
            int i40 = i37 + 1;
            int iCharAt4 = strZzd.charAt(i37);
            if (iCharAt4 >= 55296) {
                int i41 = iCharAt4 & 8191;
                int i42 = 13;
                while (true) {
                    i14 = i40 + 1;
                    cCharAt7 = strZzd.charAt(i40);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt7 & 8191) << i42;
                    i42 += 13;
                    i40 = i14;
                }
                iCharAt4 = i41 | (cCharAt7 << i42);
                i40 = i14;
            }
            int i43 = i40 + 1;
            int iCharAt5 = strZzd.charAt(i40);
            if (iCharAt5 >= 55296) {
                int i44 = iCharAt5 & 8191;
                int i45 = 13;
                while (true) {
                    i13 = i43 + 1;
                    cCharAt6 = strZzd.charAt(i43);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt6 & 8191) << i45;
                    i45 += 13;
                    i43 = i13;
                }
                iCharAt5 = i44 | (cCharAt6 << i45);
                i43 = i13;
            }
            int i46 = i43 + 1;
            int iCharAt6 = strZzd.charAt(i43);
            if (iCharAt6 >= 55296) {
                int i47 = iCharAt6 & 8191;
                int i48 = 13;
                while (true) {
                    i12 = i46 + 1;
                    cCharAt5 = strZzd.charAt(i46);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt5 & 8191) << i48;
                    i48 += 13;
                    i46 = i12;
                }
                iCharAt6 = i47 | (cCharAt5 << i48);
                i46 = i12;
            }
            int i49 = i46 + 1;
            iCharAt = strZzd.charAt(i46);
            if (iCharAt >= 55296) {
                int i50 = iCharAt & 8191;
                int i51 = 13;
                while (true) {
                    i11 = i49 + 1;
                    cCharAt4 = strZzd.charAt(i49);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt4 & 8191) << i51;
                    i51 += 13;
                    i49 = i11;
                }
                iCharAt = i50 | (cCharAt4 << i51);
                i49 = i11;
            }
            int i52 = i49 + 1;
            int iCharAt7 = strZzd.charAt(i49);
            if (iCharAt7 >= 55296) {
                int i53 = iCharAt7 & 8191;
                int i54 = 13;
                while (true) {
                    i10 = i52 + 1;
                    cCharAt3 = strZzd.charAt(i52);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt3 & 8191) << i54;
                    i54 += 13;
                    i52 = i10;
                }
                iCharAt7 = i53 | (cCharAt3 << i54);
                i52 = i10;
            }
            int i55 = i52 + 1;
            int iCharAt8 = strZzd.charAt(i52);
            if (iCharAt8 >= 55296) {
                int i56 = iCharAt8 & 8191;
                int i57 = 13;
                while (true) {
                    i9 = i55 + 1;
                    cCharAt2 = strZzd.charAt(i55);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt2 & 8191) << i57;
                    i57 += 13;
                    i55 = i9;
                }
                iCharAt8 = i56 | (cCharAt2 << i57);
                i55 = i9;
            }
            int i58 = i55 + 1;
            int iCharAt9 = strZzd.charAt(i55);
            if (iCharAt9 >= 55296) {
                int i59 = iCharAt9 & 8191;
                int i60 = 13;
                while (true) {
                    i8 = i58 + 1;
                    cCharAt = strZzd.charAt(i58);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i59 |= (cCharAt & 8191) << i60;
                    i60 += 13;
                    i58 = i8;
                }
                iCharAt9 = i59 | (cCharAt << i60);
                i58 = i8;
            }
            int i61 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i62 = iCharAt7;
            i2 = iCharAt5;
            i3 = i62;
            i4 = iCharAt6;
            i5 = iCharAt9;
            i6 = i61;
            iArr = iArr2;
            i7 = iCharAt3;
            i34 = i58;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzpcVar.zze();
        Class<?> cls2 = zzpcVar.zza().getClass();
        int i63 = i5 + i3;
        int i64 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i64];
        int i65 = i5;
        int i66 = i63;
        int i67 = 0;
        int i68 = 0;
        while (i34 < length) {
            int i69 = i34 + 1;
            int iCharAt10 = strZzd.charAt(i34);
            if (iCharAt10 >= c2) {
                int i70 = iCharAt10 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i31 = i71 + 1;
                    cCharAt12 = strZzd.charAt(i71);
                    if (cCharAt12 < c2) {
                        break;
                    }
                    i70 |= (cCharAt12 & 8191) << i72;
                    i72 += 13;
                    i71 = i31;
                }
                iCharAt10 = i70 | (cCharAt12 << i72);
                i16 = i31;
            } else {
                i16 = i69;
            }
            int i73 = i16 + 1;
            int iCharAt11 = strZzd.charAt(i16);
            if (iCharAt11 >= c2) {
                int i74 = iCharAt11 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i30 = i75 + 1;
                    cCharAt11 = strZzd.charAt(i75);
                    if (cCharAt11 < c2) {
                        break;
                    }
                    i74 |= (cCharAt11 & 8191) << i76;
                    i76 += 13;
                    i75 = i30;
                }
                iCharAt11 = i74 | (cCharAt11 << i76);
                i17 = i30;
            } else {
                i17 = i73;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i67] = i68;
                i67++;
            }
            int i77 = iCharAt11 & 255;
            zzpc zzpcVar2 = zzpcVar;
            int i78 = iCharAt11 & 2048;
            if (i77 >= 51) {
                int i79 = i17 + 1;
                int iCharAt12 = strZzd.charAt(i17);
                char c3 = 55296;
                if (iCharAt12 >= 55296) {
                    int i80 = iCharAt12 & 8191;
                    int i81 = i79;
                    int i82 = 13;
                    while (true) {
                        i29 = i81 + 1;
                        cCharAt10 = strZzd.charAt(i81);
                        if (cCharAt10 < c3) {
                            break;
                        }
                        i80 |= (cCharAt10 & 8191) << i82;
                        i82 += 13;
                        i81 = i29;
                        c3 = 55296;
                    }
                    iCharAt12 = i80 | (cCharAt10 << i82);
                    i26 = i29;
                } else {
                    i26 = i79;
                }
                int i83 = i26;
                int i84 = i77 - 51;
                i18 = length;
                if (i84 == 9 || i84 == 17) {
                    i27 = i6 + 1;
                    int i85 = i68 / 3;
                    objArr[i85 + i85 + 1] = objArrZze[i6];
                } else {
                    if (i84 != 12) {
                        i28 = i78;
                    } else if (zzpcVar2.zzc() == 1 || i78 != 0) {
                        i27 = i6 + 1;
                        int i86 = i68 / 3;
                        objArr[i86 + i86 + 1] = objArrZze[i6];
                    } else {
                        i28 = 0;
                    }
                    int i87 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i87];
                    int i88 = i28;
                    if (obj instanceof Field) {
                        fieldZzC2 = zzC(cls2, (String) obj);
                        objArrZze[i87] = fieldZzC2;
                    } else {
                        fieldZzC2 = (Field) obj;
                    }
                    int i89 = i7;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC2);
                    int i90 = i87 + 1;
                    obj2 = objArrZze[i90];
                    i19 = i89;
                    if (obj2 instanceof Field) {
                        fieldZzC3 = zzC(cls2, (String) obj2);
                        objArrZze[i90] = fieldZzC3;
                    } else {
                        fieldZzC3 = (Field) obj2;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC3);
                    str = strZzd;
                    i22 = i88;
                    i17 = i83;
                    i21 = 0;
                    c = 55296;
                }
                i6 = i27;
                i28 = i78;
                int i872 = iCharAt12 + iCharAt12;
                obj = objArrZze[i872];
                int i882 = i28;
                if (obj instanceof Field) {
                }
                int i892 = i7;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC2);
                int i902 = i872 + 1;
                obj2 = objArrZze[i902];
                i19 = i892;
                if (obj2 instanceof Field) {
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC3);
                str = strZzd;
                i22 = i882;
                i17 = i83;
                i21 = 0;
                c = 55296;
            } else {
                i18 = length;
                i19 = i7;
                int i91 = i6 + 1;
                Field fieldZzC4 = zzC(cls2, (String) objArrZze[i6]);
                if (i77 == 9 || i77 == 17) {
                    i20 = i91;
                    int i92 = i68 / 3;
                    objArr[i92 + i92 + 1] = fieldZzC4.getType();
                } else {
                    if (i77 == 27) {
                        i24 = i91;
                        i25 = 1;
                        i6 += 2;
                    } else if (i77 == 49) {
                        i6 += 2;
                        i24 = i91;
                        i25 = 1;
                    } else if (i77 == 12 || i77 == 30 || i77 == 44) {
                        if (zzpcVar2.zzc() == 1 || i78 != 0) {
                            i6 += 2;
                            int i93 = i68 / 3;
                            objArr[i93 + i93 + 1] = objArrZze[i91];
                            str = strZzd;
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
                            if ((iCharAt11 & 4096) != 0 || i77 > 17) {
                                c = 55296;
                                iObjectFieldOffset2 = 1048575;
                                i21 = 0;
                            } else {
                                int i94 = i17 + 1;
                                int iCharAt13 = str.charAt(i17);
                                if (iCharAt13 >= 55296) {
                                    int i95 = iCharAt13 & 8191;
                                    int i96 = 13;
                                    while (true) {
                                        i23 = i94 + 1;
                                        cCharAt9 = str.charAt(i94);
                                        if (cCharAt9 < 55296) {
                                            break;
                                        }
                                        i95 |= (cCharAt9 & 8191) << i96;
                                        i96 += 13;
                                        i94 = i23;
                                    }
                                    iCharAt13 = i95 | (cCharAt9 << i96);
                                } else {
                                    i23 = i94;
                                }
                                int i97 = i19 + i19 + (iCharAt13 / 32);
                                Object obj3 = objArrZze[i97];
                                if (obj3 instanceof Field) {
                                    fieldZzC = (Field) obj3;
                                } else {
                                    fieldZzC = zzC(cls2, (String) obj3);
                                    objArrZze[i97] = fieldZzC;
                                }
                                int i98 = iCharAt13;
                                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzC);
                                i21 = i98 % 32;
                                i17 = i23;
                                c = 55296;
                                iObjectFieldOffset2 = iObjectFieldOffset3;
                            }
                            if (i77 >= 18 && i77 <= 49) {
                                iArr[i66] = iObjectFieldOffset;
                                i66++;
                            }
                            i22 = i78;
                        } else {
                            str = strZzd;
                            i6 = i91;
                            i78 = 0;
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
                            if ((iCharAt11 & 4096) != 0) {
                                c = 55296;
                                iObjectFieldOffset2 = 1048575;
                                i21 = 0;
                                if (i77 >= 18) {
                                    iArr[i66] = iObjectFieldOffset;
                                    i66++;
                                }
                                i22 = i78;
                            }
                        }
                    } else if (i77 == 50) {
                        int i99 = i6 + 2;
                        int i100 = i65 + 1;
                        iArr[i65] = i68;
                        int i101 = i68 / 3;
                        int i102 = i101 + i101;
                        objArr[i102] = objArrZze[i91];
                        if (i78 != 0) {
                            objArr[i102 + 1] = objArrZze[i99];
                            i6 += 3;
                            str = strZzd;
                            i65 = i100;
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
                            if ((iCharAt11 & 4096) != 0) {
                            }
                        } else {
                            i6 = i99;
                            i65 = i100;
                            i78 = 0;
                            str = strZzd;
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
                            if ((iCharAt11 & 4096) != 0) {
                            }
                        }
                    } else {
                        i20 = i91;
                    }
                    int i103 = i68 / 3;
                    objArr[i103 + i103 + i25] = objArrZze[i24];
                    str = strZzd;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
                    if ((iCharAt11 & 4096) != 0) {
                    }
                }
                str = strZzd;
                i6 = i20;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
                if ((iCharAt11 & 4096) != 0) {
                }
            }
            int i104 = i68 + 1;
            iArr3[i68] = iCharAt10;
            int i105 = i68 + 2;
            iArr3[i104] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i22 != 0 ? Integer.MIN_VALUE : 0) | (i77 << 20) | iObjectFieldOffset;
            i68 += 3;
            iArr3[i105] = (i21 << 20) | iObjectFieldOffset2;
            i34 = i17;
            strZzd = str;
            c2 = c;
            zzpcVar = zzpcVar2;
            length = i18;
            i7 = i19;
        }
        return new zzot(iArr3, objArr, i2, i4, zzpcVar.zza(), false, iArr, i5, i63, zzowVar, zzodVar, zzpvVar, zzmxVar, zzolVar);
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzqc.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzqc.zzf(obj, j)).floatValue();
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zzqc.zzf(obj, j)).intValue();
    }

    private final int zzq(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzs(i, 0);
    }

    private final int zzr(int i) {
        return this.zzc[i + 2];
    }

    private final int zzs(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int zzt(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzu(int i) {
        return this.zzc[i + 1];
    }

    private static long zzv(Object obj, long j) {
        return ((Long) zzqc.zzf(obj, j)).longValue();
    }

    private final zznp zzw(int i) {
        int i2 = i / 3;
        return (zznp) this.zzd[i2 + i2 + 1];
    }

    private final zzpe zzx(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzpe zzpeVar = (zzpe) objArr[i3];
        if (zzpeVar != null) {
            return zzpeVar;
        }
        zzpe zzpeVarZzb = zzpa.zza().zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzpeVarZzb;
        return zzpeVarZzb;
    }

    private final Object zzy(Object obj, int i, Object obj2, zzpv zzpvVar, Object obj3) {
        int i2 = this.zzc[i];
        Object objZzf = zzqc.zzf(obj, zzu(i) & 1048575);
        if (objZzf == null || zzw(i) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0714 A[PHI: r0
      0x0714: PHI (r0v2 com.google.android.recaptcha.internal.zzot<T>) = 
      (r0v1 com.google.android.recaptcha.internal.zzot<T>)
      (r0v1 com.google.android.recaptcha.internal.zzot<T>)
      (r0v1 com.google.android.recaptcha.internal.zzot<T>)
      (r0v39 com.google.android.recaptcha.internal.zzot<T>)
      (r0v1 com.google.android.recaptcha.internal.zzot<T>)
      (r0v1 com.google.android.recaptcha.internal.zzot<T>)
      (r0v1 com.google.android.recaptcha.internal.zzot<T>)
      (r0v1 com.google.android.recaptcha.internal.zzot<T>)
      (r0v1 com.google.android.recaptcha.internal.zzot<T>)
      (r0v1 com.google.android.recaptcha.internal.zzot<T>)
      (r0v1 com.google.android.recaptcha.internal.zzot<T>)
      (r0v1 com.google.android.recaptcha.internal.zzot<T>)
      (r0v1 com.google.android.recaptcha.internal.zzot<T>)
      (r0v1 com.google.android.recaptcha.internal.zzot<T>)
      (r0v1 com.google.android.recaptcha.internal.zzot<T>)
      (r0v1 com.google.android.recaptcha.internal.zzot<T>)
      (r0v1 com.google.android.recaptcha.internal.zzot<T>)
      (r0v1 com.google.android.recaptcha.internal.zzot<T>)
      (r0v1 com.google.android.recaptcha.internal.zzot<T>)
      (r0v1 com.google.android.recaptcha.internal.zzot<T>)
      (r0v1 com.google.android.recaptcha.internal.zzot<T>)
      (r0v1 com.google.android.recaptcha.internal.zzot<T>)
      (r0v1 com.google.android.recaptcha.internal.zzot<T>)
      (r0v1 com.google.android.recaptcha.internal.zzot<T>)
      (r0v1 com.google.android.recaptcha.internal.zzot<T>)
      (r0v1 com.google.android.recaptcha.internal.zzot<T>)
      (r0v1 com.google.android.recaptcha.internal.zzot<T>)
      (r0v1 com.google.android.recaptcha.internal.zzot<T>)
      (r0v1 com.google.android.recaptcha.internal.zzot<T>)
      (r0v1 com.google.android.recaptcha.internal.zzot<T>)
      (r0v1 com.google.android.recaptcha.internal.zzot<T>)
      (r0v1 com.google.android.recaptcha.internal.zzot<T>)
      (r0v1 com.google.android.recaptcha.internal.zzot<T>)
      (r0v1 com.google.android.recaptcha.internal.zzot<T>)
      (r0v1 com.google.android.recaptcha.internal.zzot<T>)
      (r0v1 com.google.android.recaptcha.internal.zzot<T>)
      (r0v1 com.google.android.recaptcha.internal.zzot<T>)
      (r0v1 com.google.android.recaptcha.internal.zzot<T>)
      (r0v1 com.google.android.recaptcha.internal.zzot<T>)
     binds: [B:18:0x004f, B:278:0x0707, B:248:0x0643, B:225:0x05b3, B:218:0x0580, B:138:0x036e, B:135:0x0356, B:132:0x033e, B:129:0x0326, B:126:0x030e, B:123:0x02f6, B:120:0x02de, B:117:0x02c6, B:114:0x02ad, B:111:0x0296, B:108:0x027f, B:105:0x0268, B:102:0x0251, B:97:0x0235, B:83:0x01e1, B:85:0x01ef, B:80:0x01c7, B:77:0x01b9, B:74:0x01a3, B:71:0x018d, B:68:0x0176, B:65:0x0168, B:62:0x015a, B:59:0x014b, B:53:0x0120, B:50:0x010c, B:46:0x00ee, B:43:0x00d9, B:40:0x00c3, B:36:0x00b4, B:32:0x00a5, B:29:0x008b, B:25:0x0070, B:21:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.recaptcha.internal.zzpe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(Object obj) {
        int i;
        int iZzA;
        int iZzA2;
        int iZzB;
        int iZzA3;
        int iZzA4;
        int iZzA5;
        int iZzd;
        int iZzA6;
        int iZzh;
        int size;
        int iZzl;
        int iZzA7;
        int iZzg;
        int iZzA8;
        int iZzA9;
        int iZzB2;
        int iZze;
        int iZzA10;
        int iZzA11;
        int iZzw;
        int iZzA12;
        int iZzA13;
        int iZzA14;
        int iZzd2;
        int iZzA15;
        zzot<T> zzotVar = this;
        Object obj2 = obj;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 0;
        int iZzA16 = 0;
        int i5 = 1048575;
        while (i3 < zzotVar.zzc.length) {
            int iZzu = zzotVar.zzu(i3);
            int iZzt = zzt(iZzu);
            int[] iArr = zzotVar.zzc;
            int i6 = iArr[i3];
            int i7 = iArr[i3 + 2];
            int i8 = i7 & i2;
            if (iZzt <= 17) {
                if (i8 != i5) {
                    i4 = i8 == i2 ? 0 : unsafe.getInt(obj2, i8);
                    i5 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            int i9 = iZzu & i2;
            if (iZzt >= zznc.zzJ.zza()) {
                zznc.zzW.zza();
            }
            int i10 = iZzA16;
            long j = i9;
            switch (iZzt) {
                case 0:
                    iZzA16 = zzotVar.zzO(obj2, i3, i5, i4, i) ? i10 + zzlr.zzA(i6 << 3) + 8 : i10;
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 1:
                    if (zzotVar.zzO(obj2, i3, i5, i4, i)) {
                        iZzA = zzlr.zzA(i6 << 3);
                        iZzA4 = iZzA + 4;
                        iZzA16 = i10 + iZzA4;
                        zzotVar = this;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    zzotVar = this;
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 2:
                    if (zzotVar.zzO(obj2, i3, i5, i4, i)) {
                        long j2 = unsafe.getLong(obj2, j);
                        iZzA2 = zzlr.zzA(i6 << 3);
                        iZzB = zzlr.zzB(j2);
                        iZzA4 = iZzA2 + iZzB;
                        iZzA16 = i10 + iZzA4;
                        zzotVar = this;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    zzotVar = this;
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 3:
                    if (zzotVar.zzO(obj2, i3, i5, i4, i)) {
                        long j3 = unsafe.getLong(obj2, j);
                        iZzA2 = zzlr.zzA(i6 << 3);
                        iZzB = zzlr.zzB(j3);
                        iZzA4 = iZzA2 + iZzB;
                        iZzA16 = i10 + iZzA4;
                        zzotVar = this;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    zzotVar = this;
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 4:
                    if (zzotVar.zzO(obj2, i3, i5, i4, i)) {
                        long j4 = unsafe.getInt(obj2, j);
                        iZzA2 = zzlr.zzA(i6 << 3);
                        iZzB = zzlr.zzB(j4);
                        iZzA4 = iZzA2 + iZzB;
                        iZzA16 = i10 + iZzA4;
                        zzotVar = this;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    zzotVar = this;
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 5:
                    if (zzotVar.zzO(obj2, i3, i5, i4, i)) {
                        iZzA3 = zzlr.zzA(i6 << 3);
                        iZzA4 = iZzA3 + 8;
                        iZzA16 = i10 + iZzA4;
                        zzotVar = this;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    zzotVar = this;
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 6:
                    if (zzotVar.zzO(obj2, i3, i5, i4, i)) {
                        iZzA = zzlr.zzA(i6 << 3);
                        iZzA4 = iZzA + 4;
                        iZzA16 = i10 + iZzA4;
                        zzotVar = this;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    zzotVar = this;
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 7:
                    if (zzotVar.zzO(obj2, i3, i5, i4, i)) {
                        iZzA4 = zzlr.zzA(i6 << 3) + 1;
                        iZzA16 = i10 + iZzA4;
                        zzotVar = this;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    zzotVar = this;
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 8:
                    if (zzotVar.zzO(obj2, i3, i5, i4, i)) {
                        int i11 = i6 << 3;
                        Object object = unsafe.getObject(obj2, j);
                        if (object instanceof zzlg) {
                            iZzA5 = zzlr.zzA(i11);
                            iZzd = ((zzlg) object).zzd();
                            iZzA6 = zzlr.zzA(iZzd);
                            iZzA4 = iZzA5 + iZzA6 + iZzd;
                            iZzA16 = i10 + iZzA4;
                            zzotVar = this;
                            i3 += 3;
                            obj2 = obj;
                            i2 = 1048575;
                        } else {
                            iZzA2 = zzlr.zzA(i11);
                            iZzB = zzlr.zzz((String) object);
                            iZzA4 = iZzA2 + iZzB;
                            iZzA16 = i10 + iZzA4;
                            zzotVar = this;
                            i3 += 3;
                            obj2 = obj;
                            i2 = 1048575;
                        }
                    }
                    zzotVar = this;
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 9:
                    if (zzotVar.zzO(obj2, i3, i5, i4, i)) {
                        iZzh = zzpg.zzh(i6, unsafe.getObject(obj2, j), zzotVar.zzx(i3));
                        iZzA16 = i10 + iZzh;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 10:
                    if (zzotVar.zzO(obj2, i3, i5, i4, i)) {
                        zzlg zzlgVar = (zzlg) unsafe.getObject(obj2, j);
                        iZzA5 = zzlr.zzA(i6 << 3);
                        iZzd = zzlgVar.zzd();
                        iZzA6 = zzlr.zzA(iZzd);
                        iZzA4 = iZzA5 + iZzA6 + iZzd;
                        iZzA16 = i10 + iZzA4;
                        zzotVar = this;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    zzotVar = this;
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 11:
                    if (zzotVar.zzO(obj2, i3, i5, i4, i)) {
                        int i12 = unsafe.getInt(obj2, j);
                        iZzA2 = zzlr.zzA(i6 << 3);
                        iZzB = zzlr.zzA(i12);
                        iZzA4 = iZzA2 + iZzB;
                        iZzA16 = i10 + iZzA4;
                        zzotVar = this;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    zzotVar = this;
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 12:
                    if (zzotVar.zzO(obj2, i3, i5, i4, i)) {
                        long j5 = unsafe.getInt(obj2, j);
                        iZzA2 = zzlr.zzA(i6 << 3);
                        iZzB = zzlr.zzB(j5);
                        iZzA4 = iZzA2 + iZzB;
                        iZzA16 = i10 + iZzA4;
                        zzotVar = this;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    zzotVar = this;
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 13:
                    if (zzotVar.zzO(obj2, i3, i5, i4, i)) {
                        iZzA = zzlr.zzA(i6 << 3);
                        iZzA4 = iZzA + 4;
                        iZzA16 = i10 + iZzA4;
                        zzotVar = this;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    zzotVar = this;
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 14:
                    if (zzotVar.zzO(obj2, i3, i5, i4, i)) {
                        iZzA3 = zzlr.zzA(i6 << 3);
                        iZzA4 = iZzA3 + 8;
                        iZzA16 = i10 + iZzA4;
                        zzotVar = this;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    zzotVar = this;
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 15:
                    if (zzotVar.zzO(obj2, i3, i5, i4, i)) {
                        int i13 = unsafe.getInt(obj2, j);
                        iZzA2 = zzlr.zzA(i6 << 3);
                        iZzB = zzlr.zzA((i13 >> 31) ^ (i13 + i13));
                        iZzA4 = iZzA2 + iZzB;
                        iZzA16 = i10 + iZzA4;
                        zzotVar = this;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    zzotVar = this;
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 16:
                    if (zzotVar.zzO(obj2, i3, i5, i4, i)) {
                        long j6 = unsafe.getLong(obj2, j);
                        iZzA2 = zzlr.zzA(i6 << 3);
                        iZzB = zzlr.zzB((j6 >> 63) ^ (j6 + j6));
                        iZzA4 = iZzA2 + iZzB;
                        iZzA16 = i10 + iZzA4;
                        zzotVar = this;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    zzotVar = this;
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 17:
                    if (zzotVar.zzO(obj2, i3, i5, i4, i)) {
                        iZzh = zzlr.zzw(i6, (zzoq) unsafe.getObject(obj2, j), zzotVar.zzx(i3));
                        iZzA16 = i10 + iZzh;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 18:
                    iZzh = zzpg.zzd(i6, (List) unsafe.getObject(obj2, j), false);
                    iZzA16 = i10 + iZzh;
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 19:
                    iZzh = zzpg.zzb(i6, (List) unsafe.getObject(obj2, j), false);
                    iZzA16 = i10 + iZzh;
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j);
                    int i14 = zzpg.zza;
                    iZzg = list.size() == 0 ? 0 : zzpg.zzg(list) + (list.size() * zzlr.zzA(i6 << 3));
                    iZzA16 = iZzg + i10;
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(obj2, j);
                    int i15 = zzpg.zza;
                    size = list2.size();
                    if (size != 0) {
                        iZzl = zzpg.zzl(list2);
                        iZzA7 = zzlr.zzA(i6 << 3);
                        iZzB2 = size * iZzA7;
                        iZzh = iZzl + iZzB2;
                        iZzA16 = i10 + iZzh;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    iZzA16 = i10 + iZzh;
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j);
                    int i16 = zzpg.zza;
                    size = list3.size();
                    if (size != 0) {
                        iZzl = zzpg.zzf(list3);
                        iZzA7 = zzlr.zzA(i6 << 3);
                        iZzB2 = size * iZzA7;
                        iZzh = iZzl + iZzB2;
                        iZzA16 = i10 + iZzh;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    iZzA16 = i10 + iZzh;
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 23:
                    iZzh = zzpg.zzd(i6, (List) unsafe.getObject(obj2, j), false);
                    iZzA16 = i10 + iZzh;
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 24:
                    iZzh = zzpg.zzb(i6, (List) unsafe.getObject(obj2, j), false);
                    iZzA16 = i10 + iZzh;
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j);
                    int i17 = zzpg.zza;
                    int size2 = list4.size();
                    iZzh = size2 == 0 ? 0 : size2 * (zzlr.zzA(i6 << 3) + 1);
                    iZzA16 = i10 + iZzh;
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, j);
                    int i18 = zzpg.zza;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        iZzg = zzlr.zzA(i6 << 3) * size3;
                        if (list5 instanceof zzoc) {
                            zzoc zzocVar = (zzoc) list5;
                            for (int i19 = 0; i19 < size3; i19++) {
                                Object objZzc = zzocVar.zzc();
                                if (objZzc instanceof zzlg) {
                                    int iZzd3 = ((zzlg) objZzc).zzd();
                                    iZzg += zzlr.zzA(iZzd3) + iZzd3;
                                } else {
                                    iZzg += zzlr.zzz((String) objZzc);
                                }
                            }
                        } else {
                            for (int i20 = 0; i20 < size3; i20++) {
                                Object obj3 = list5.get(i20);
                                if (obj3 instanceof zzlg) {
                                    int iZzd4 = ((zzlg) obj3).zzd();
                                    iZzg += zzlr.zzA(iZzd4) + iZzd4;
                                } else {
                                    iZzg += zzlr.zzz((String) obj3);
                                }
                            }
                        }
                    }
                    iZzA16 = iZzg + i10;
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, j);
                    zzpe zzpeVarZzx = zzotVar.zzx(i3);
                    int i21 = zzpg.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iZzA8 = 0;
                    } else {
                        iZzA8 = zzlr.zzA(i6 << 3) * size4;
                        for (int i22 = 0; i22 < size4; i22++) {
                            Object obj4 = list6.get(i22);
                            if (obj4 instanceof zzob) {
                                int iZza = ((zzob) obj4).zza();
                                iZzA8 += zzlr.zzA(iZza) + iZza;
                            } else {
                                iZzA8 += zzlr.zzy((zzoq) obj4, zzpeVarZzx);
                            }
                        }
                    }
                    iZzA16 = i10 + iZzA8;
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j);
                    int i23 = zzpg.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iZzA9 = 0;
                    } else {
                        iZzA9 = size5 * zzlr.zzA(i6 << 3);
                        for (int i24 = 0; i24 < list7.size(); i24++) {
                            int iZzd5 = ((zzlg) list7.get(i24)).zzd();
                            iZzA9 += zzlr.zzA(iZzd5) + iZzd5;
                        }
                    }
                    iZzA16 = i10 + iZzA9;
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j);
                    int i25 = zzpg.zza;
                    size = list8.size();
                    if (size != 0) {
                        iZzl = zzpg.zzk(list8);
                        iZzA7 = zzlr.zzA(i6 << 3);
                        iZzB2 = size * iZzA7;
                        iZzh = iZzl + iZzB2;
                        iZzA16 = i10 + iZzh;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    iZzA16 = i10 + iZzh;
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 30:
                    List list9 = (List) unsafe.getObject(obj2, j);
                    int i26 = zzpg.zza;
                    size = list9.size();
                    if (size != 0) {
                        iZzl = zzpg.zza(list9);
                        iZzA7 = zzlr.zzA(i6 << 3);
                        iZzB2 = size * iZzA7;
                        iZzh = iZzl + iZzB2;
                        iZzA16 = i10 + iZzh;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    iZzA16 = i10 + iZzh;
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 31:
                    iZzh = zzpg.zzb(i6, (List) unsafe.getObject(obj2, j), false);
                    iZzA16 = i10 + iZzh;
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 32:
                    iZzh = zzpg.zzd(i6, (List) unsafe.getObject(obj2, j), false);
                    iZzA16 = i10 + iZzh;
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j);
                    int i27 = zzpg.zza;
                    size = list10.size();
                    if (size != 0) {
                        iZzl = zzpg.zzi(list10);
                        iZzA7 = zzlr.zzA(i6 << 3);
                        iZzB2 = size * iZzA7;
                        iZzh = iZzl + iZzB2;
                        iZzA16 = i10 + iZzh;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    iZzA16 = i10 + iZzh;
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j);
                    int i28 = zzpg.zza;
                    size = list11.size();
                    if (size != 0) {
                        iZzl = zzpg.zzj(list11);
                        iZzA7 = zzlr.zzA(i6 << 3);
                        iZzB2 = size * iZzA7;
                        iZzh = iZzl + iZzB2;
                        iZzA16 = i10 + iZzh;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    iZzA16 = i10 + iZzh;
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 35:
                    iZze = zzpg.zze((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzA10 = zzlr.zzA(i6 << 3);
                        iZzA11 = zzlr.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA16 = i10 + iZzA9;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 36:
                    iZze = zzpg.zzc((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzA10 = zzlr.zzA(i6 << 3);
                        iZzA11 = zzlr.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA16 = i10 + iZzA9;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 37:
                    iZze = zzpg.zzg((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzA10 = zzlr.zzA(i6 << 3);
                        iZzA11 = zzlr.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA16 = i10 + iZzA9;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 38:
                    iZze = zzpg.zzl((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzA10 = zzlr.zzA(i6 << 3);
                        iZzA11 = zzlr.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA16 = i10 + iZzA9;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 39:
                    iZze = zzpg.zzf((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzA10 = zzlr.zzA(i6 << 3);
                        iZzA11 = zzlr.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA16 = i10 + iZzA9;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 40:
                    iZze = zzpg.zze((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzA10 = zzlr.zzA(i6 << 3);
                        iZzA11 = zzlr.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA16 = i10 + iZzA9;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 41:
                    iZze = zzpg.zzc((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzA10 = zzlr.zzA(i6 << 3);
                        iZzA11 = zzlr.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA16 = i10 + iZzA9;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 42:
                    List list12 = (List) unsafe.getObject(obj2, j);
                    int i29 = zzpg.zza;
                    iZze = list12.size();
                    if (iZze > 0) {
                        iZzA10 = zzlr.zzA(i6 << 3);
                        iZzA11 = zzlr.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA16 = i10 + iZzA9;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 43:
                    iZze = zzpg.zzk((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzA10 = zzlr.zzA(i6 << 3);
                        iZzA11 = zzlr.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA16 = i10 + iZzA9;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 44:
                    iZze = zzpg.zza((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzA10 = zzlr.zzA(i6 << 3);
                        iZzA11 = zzlr.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA16 = i10 + iZzA9;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 45:
                    iZze = zzpg.zzc((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzA10 = zzlr.zzA(i6 << 3);
                        iZzA11 = zzlr.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA16 = i10 + iZzA9;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 46:
                    iZze = zzpg.zze((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzA10 = zzlr.zzA(i6 << 3);
                        iZzA11 = zzlr.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA16 = i10 + iZzA9;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 47:
                    iZze = zzpg.zzi((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzA10 = zzlr.zzA(i6 << 3);
                        iZzA11 = zzlr.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA16 = i10 + iZzA9;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 48:
                    iZze = zzpg.zzj((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzA10 = zzlr.zzA(i6 << 3);
                        iZzA11 = zzlr.zzA(iZze);
                        iZzA9 = iZzA10 + iZzA11 + iZze;
                        iZzA16 = i10 + iZzA9;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j);
                    zzpe zzpeVarZzx2 = zzotVar.zzx(i3);
                    int i30 = zzpg.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iZzw = 0;
                    } else {
                        iZzw = 0;
                        for (int i31 = 0; i31 < size6; i31++) {
                            iZzw += zzlr.zzw(i6, (zzoq) list13.get(i31), zzpeVarZzx2);
                        }
                    }
                    iZzA16 = i10 + iZzw;
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 50:
                    zzok zzokVar = (zzok) unsafe.getObject(obj2, j);
                    if (!zzokVar.isEmpty()) {
                        Iterator it = zzokVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 51:
                    if (zzotVar.zzR(obj2, i6, i3)) {
                        iZzA12 = zzlr.zzA(i6 << 3);
                        iZzh = iZzA12 + 8;
                        iZzA16 = i10 + iZzh;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 52:
                    if (zzotVar.zzR(obj2, i6, i3)) {
                        iZzA13 = zzlr.zzA(i6 << 3);
                        iZzh = iZzA13 + 4;
                        iZzA16 = i10 + iZzh;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 53:
                    if (zzotVar.zzR(obj2, i6, i3)) {
                        long jZzv = zzv(obj2, j);
                        iZzl = zzlr.zzA(i6 << 3);
                        iZzB2 = zzlr.zzB(jZzv);
                        iZzh = iZzl + iZzB2;
                        iZzA16 = i10 + iZzh;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 54:
                    if (zzotVar.zzR(obj2, i6, i3)) {
                        long jZzv2 = zzv(obj2, j);
                        iZzl = zzlr.zzA(i6 << 3);
                        iZzB2 = zzlr.zzB(jZzv2);
                        iZzh = iZzl + iZzB2;
                        iZzA16 = i10 + iZzh;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 55:
                    if (zzotVar.zzR(obj2, i6, i3)) {
                        long jZzp = zzp(obj2, j);
                        iZzl = zzlr.zzA(i6 << 3);
                        iZzB2 = zzlr.zzB(jZzp);
                        iZzh = iZzl + iZzB2;
                        iZzA16 = i10 + iZzh;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 56:
                    if (zzotVar.zzR(obj2, i6, i3)) {
                        iZzA12 = zzlr.zzA(i6 << 3);
                        iZzh = iZzA12 + 8;
                        iZzA16 = i10 + iZzh;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 57:
                    if (zzotVar.zzR(obj2, i6, i3)) {
                        iZzA13 = zzlr.zzA(i6 << 3);
                        iZzh = iZzA13 + 4;
                        iZzA16 = i10 + iZzh;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 58:
                    if (zzotVar.zzR(obj2, i6, i3)) {
                        iZzh = zzlr.zzA(i6 << 3) + 1;
                        iZzA16 = i10 + iZzh;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 59:
                    if (zzotVar.zzR(obj2, i6, i3)) {
                        int i32 = i6 << 3;
                        Object object2 = unsafe.getObject(obj2, j);
                        if (object2 instanceof zzlg) {
                            iZzA14 = zzlr.zzA(i32);
                            iZzd2 = ((zzlg) object2).zzd();
                            iZzA15 = zzlr.zzA(iZzd2);
                            iZzh = iZzA14 + iZzA15 + iZzd2;
                            iZzA16 = i10 + iZzh;
                            i3 += 3;
                            obj2 = obj;
                            i2 = 1048575;
                        } else {
                            iZzl = zzlr.zzA(i32);
                            iZzB2 = zzlr.zzz((String) object2);
                            iZzh = iZzl + iZzB2;
                            iZzA16 = i10 + iZzh;
                            i3 += 3;
                            obj2 = obj;
                            i2 = 1048575;
                        }
                    }
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 60:
                    if (zzotVar.zzR(obj2, i6, i3)) {
                        iZzh = zzpg.zzh(i6, unsafe.getObject(obj2, j), zzotVar.zzx(i3));
                        iZzA16 = i10 + iZzh;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 61:
                    if (zzotVar.zzR(obj2, i6, i3)) {
                        zzlg zzlgVar2 = (zzlg) unsafe.getObject(obj2, j);
                        iZzA14 = zzlr.zzA(i6 << 3);
                        iZzd2 = zzlgVar2.zzd();
                        iZzA15 = zzlr.zzA(iZzd2);
                        iZzh = iZzA14 + iZzA15 + iZzd2;
                        iZzA16 = i10 + iZzh;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 62:
                    if (zzotVar.zzR(obj2, i6, i3)) {
                        int iZzp = zzp(obj2, j);
                        iZzl = zzlr.zzA(i6 << 3);
                        iZzB2 = zzlr.zzA(iZzp);
                        iZzh = iZzl + iZzB2;
                        iZzA16 = i10 + iZzh;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 63:
                    if (zzotVar.zzR(obj2, i6, i3)) {
                        long jZzp2 = zzp(obj2, j);
                        iZzl = zzlr.zzA(i6 << 3);
                        iZzB2 = zzlr.zzB(jZzp2);
                        iZzh = iZzl + iZzB2;
                        iZzA16 = i10 + iZzh;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 64:
                    if (zzotVar.zzR(obj2, i6, i3)) {
                        iZzA13 = zzlr.zzA(i6 << 3);
                        iZzh = iZzA13 + 4;
                        iZzA16 = i10 + iZzh;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 65:
                    if (zzotVar.zzR(obj2, i6, i3)) {
                        iZzA12 = zzlr.zzA(i6 << 3);
                        iZzh = iZzA12 + 8;
                        iZzA16 = i10 + iZzh;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 66:
                    if (zzotVar.zzR(obj2, i6, i3)) {
                        int iZzp2 = zzp(obj2, j);
                        iZzl = zzlr.zzA(i6 << 3);
                        iZzB2 = zzlr.zzA((iZzp2 >> 31) ^ (iZzp2 + iZzp2));
                        iZzh = iZzl + iZzB2;
                        iZzA16 = i10 + iZzh;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case 67:
                    if (zzotVar.zzR(obj2, i6, i3)) {
                        long jZzv3 = zzv(obj2, j);
                        iZzl = zzlr.zzA(i6 << 3);
                        iZzB2 = zzlr.zzB((jZzv3 >> 63) ^ (jZzv3 + jZzv3));
                        iZzh = iZzl + iZzB2;
                        iZzA16 = i10 + iZzh;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
                case SDK_ASSET_ICON_HOME_VALUE:
                    if (zzotVar.zzR(obj2, i6, i3)) {
                        iZzh = zzlr.zzw(i6, (zzoq) unsafe.getObject(obj2, j), zzotVar.zzx(i3));
                        iZzA16 = i10 + iZzh;
                        i3 += 3;
                        obj2 = obj;
                        i2 = 1048575;
                    }
                    i3 += 3;
                    obj2 = obj;
                    i2 = 1048575;
            }
        }
        int iZza2 = iZzA16 + ((zznl) obj).zzc.zza();
        if (!zzotVar.zzh) {
            return iZza2;
        }
        zznb zznbVar = ((zzni) obj).zzb;
        int iZzc = zznbVar.zza.zzc();
        int iZza3 = 0;
        for (int i33 = 0; i33 < iZzc; i33++) {
            Map.Entry entryZzg = zznbVar.zza.zzg(i33);
            iZza3 += zznb.zza((zzna) ((zzpi) entryZzg).zza(), entryZzg.getValue());
        }
        for (Map.Entry entry2 : zznbVar.zza.zzd()) {
            iZza3 += zznb.zza((zzna) entry2.getKey(), entry2.getValue());
        }
        return iZza2 + iZza3;
    }

    @Override // com.google.android.recaptcha.internal.zzpe
    public final int zzb(Object obj) {
        int i;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzc.length; i4 += 3) {
            int iZzu = zzu(i4);
            int[] iArr = this.zzc;
            int i5 = 1048575 & iZzu;
            int iZzt = zzt(iZzu);
            int i6 = iArr[i4];
            long j = i5;
            int iHashCode = 37;
            switch (iZzt) {
                case 0:
                    i = i3 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzqc.zza(obj, j));
                    byte[] bArr = zznt.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 1:
                    i = i3 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzqc.zzb(obj, j));
                    i3 = i + iFloatToIntBits;
                    break;
                case 2:
                    i = i3 * 53;
                    jDoubleToLongBits = zzqc.zzd(obj, j);
                    byte[] bArr2 = zznt.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 3:
                    i = i3 * 53;
                    jDoubleToLongBits = zzqc.zzd(obj, j);
                    byte[] bArr3 = zznt.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 4:
                    i = i3 * 53;
                    iFloatToIntBits = zzqc.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 5:
                    i = i3 * 53;
                    jDoubleToLongBits = zzqc.zzd(obj, j);
                    byte[] bArr4 = zznt.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 6:
                    i = i3 * 53;
                    iFloatToIntBits = zzqc.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 7:
                    i = i3 * 53;
                    iFloatToIntBits = zznt.zza(zzqc.zzw(obj, j));
                    i3 = i + iFloatToIntBits;
                    break;
                case 8:
                    i = i3 * 53;
                    iFloatToIntBits = ((String) zzqc.zzf(obj, j)).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 9:
                    i2 = i3 * 53;
                    Object objZzf = zzqc.zzf(obj, j);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i3 = i2 + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iFloatToIntBits = zzqc.zzf(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 11:
                    i = i3 * 53;
                    iFloatToIntBits = zzqc.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 12:
                    i = i3 * 53;
                    iFloatToIntBits = zzqc.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 13:
                    i = i3 * 53;
                    iFloatToIntBits = zzqc.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 14:
                    i = i3 * 53;
                    jDoubleToLongBits = zzqc.zzd(obj, j);
                    byte[] bArr5 = zznt.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 15:
                    i = i3 * 53;
                    iFloatToIntBits = zzqc.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 16:
                    i = i3 * 53;
                    jDoubleToLongBits = zzqc.zzd(obj, j);
                    byte[] bArr6 = zznt.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 17:
                    i2 = i3 * 53;
                    Object objZzf2 = zzqc.zzf(obj, j);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i3 = i2 + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i3 * 53;
                    iFloatToIntBits = zzqc.zzf(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 50:
                    i = i3 * 53;
                    iFloatToIntBits = zzqc.zzf(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 51:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzn(obj, j));
                        byte[] bArr7 = zznt.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzo(obj, j));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr8 = zznt.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr9 = zznt.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr10 = zznt.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zznt.zza(zzS(obj, j));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = ((String) zzqc.zzf(obj, j)).hashCode();
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzqc.zzf(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzqc.zzf(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr11 = zznt.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr12 = zznt.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case SDK_ASSET_ICON_HOME_VALUE:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzqc.zzf(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i3 * 53) + ((zznl) obj).zzc.hashCode();
        return this.zzh ? (iHashCode2 * 53) + ((zzni) obj).zzb.zza.hashCode() : iHashCode2;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    final int zzc(java.lang.Object r32, byte[] r33, int r34, int r35, int r36, com.google.android.recaptcha.internal.zzkv r37) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzot.zzc(java.lang.Object, byte[], int, int, int, com.google.android.recaptcha.internal.zzkv):int");
    }

    @Override // com.google.android.recaptcha.internal.zzpe
    public final Object zze() {
        return ((zznl) this.zzg).zzu();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    @Override // com.google.android.recaptcha.internal.zzpe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zznl) {
                zznl zznlVar = (zznl) obj;
                zznlVar.zzI(Integer.MAX_VALUE);
                zznlVar.zza = 0;
                zznlVar.zzG();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int iZzu = zzu(i);
                int i2 = 1048575 & iZzu;
                int iZzt = zzt(iZzu);
                long j = i2;
                if (iZzt != 9) {
                    if (iZzt != 60 && iZzt != 68) {
                        switch (iZzt) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                ((zzns) zzqc.zzf(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzok) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzR(obj, this.zzc[i], i)) {
                        zzx(i).zzf(zzb.getObject(obj, j));
                    }
                } else if (zzN(obj, i)) {
                    zzx(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzm.zzi(obj);
            if (this.zzh) {
                this.zzn.zza(obj);
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpe
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzu = zzu(i);
            int i2 = 1048575 & iZzu;
            int[] iArr = this.zzc;
            int iZzt = zzt(iZzu);
            int i3 = iArr[i];
            long j = i2;
            switch (iZzt) {
                case 0:
                    if (zzN(obj2, i)) {
                        zzqc.zzo(obj, j, zzqc.zza(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i)) {
                        zzqc.zzp(obj, j, zzqc.zzb(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzN(obj2, i)) {
                        zzqc.zzr(obj, j, zzqc.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzN(obj2, i)) {
                        zzqc.zzr(obj, j, zzqc.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzN(obj2, i)) {
                        zzqc.zzq(obj, j, zzqc.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzN(obj2, i)) {
                        zzqc.zzr(obj, j, zzqc.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzN(obj2, i)) {
                        zzqc.zzq(obj, j, zzqc.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzN(obj2, i)) {
                        zzqc.zzm(obj, j, zzqc.zzw(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzN(obj2, i)) {
                        zzqc.zzs(obj, j, zzqc.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzE(obj, obj2, i);
                    break;
                case 10:
                    if (zzN(obj2, i)) {
                        zzqc.zzs(obj, j, zzqc.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzN(obj2, i)) {
                        zzqc.zzq(obj, j, zzqc.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzN(obj2, i)) {
                        zzqc.zzq(obj, j, zzqc.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzN(obj2, i)) {
                        zzqc.zzq(obj, j, zzqc.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzN(obj2, i)) {
                        zzqc.zzr(obj, j, zzqc.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzN(obj2, i)) {
                        zzqc.zzq(obj, j, zzqc.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzN(obj2, i)) {
                        zzqc.zzr(obj, j, zzqc.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzE(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzns zznsVarZzd = (zzns) zzqc.zzf(obj, j);
                    zzns zznsVar = (zzns) zzqc.zzf(obj2, j);
                    int size = zznsVarZzd.size();
                    int size2 = zznsVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zznsVarZzd.zzc()) {
                            zznsVarZzd = zznsVarZzd.zzd(size2 + size);
                        }
                        zznsVarZzd.addAll(zznsVar);
                    }
                    if (size > 0) {
                        zznsVar = zznsVarZzd;
                    }
                    zzqc.zzs(obj, j, zznsVar);
                    break;
                case 50:
                    int i4 = zzpg.zza;
                    zzqc.zzs(obj, j, zzol.zzb(zzqc.zzf(obj, j), zzqc.zzf(obj2, j)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzR(obj2, i3, i)) {
                        zzqc.zzs(obj, j, zzqc.zzf(obj2, j));
                        zzI(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzF(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i3, i)) {
                        zzqc.zzs(obj, j, zzqc.zzf(obj2, j));
                        zzI(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case SDK_ASSET_ICON_HOME_VALUE:
                    zzF(obj, obj2, i);
                    break;
            }
        }
        zzpg.zzq(this.zzm, obj, obj2);
        if (this.zzh) {
            zzpg.zzp(this.zzn, obj, obj2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bd, code lost:
    
        r2 = r3;
        r5 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:245:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0750 A[LOOP:3: B:251:0x074c->B:253:0x0750, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x071d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x072b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:371:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:372:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016f A[Catch: all -> 0x0054, TryCatch #12 {all -> 0x0054, blocks: (B:20:0x004b, B:24:0x005c, B:26:0x0064, B:27:0x0068, B:60:0x015e, B:68:0x0189, B:65:0x016f, B:67:0x0177, B:29:0x006e, B:30:0x0078, B:31:0x0082, B:32:0x008c, B:33:0x0096, B:34:0x009d, B:35:0x009e, B:36:0x00a8, B:37:0x00ae, B:39:0x00b8, B:41:0x00cd, B:42:0x00da, B:43:0x00df, B:44:0x00e0, B:46:0x00ea, B:48:0x00ff, B:49:0x010c, B:50:0x0111, B:51:0x0112, B:52:0x0117, B:53:0x0120, B:54:0x0129, B:55:0x0132, B:56:0x013b, B:57:0x0144, B:58:0x014d, B:59:0x0156, B:71:0x0192, B:72:0x0195, B:74:0x0198), top: B:270:0x004b }] */
    @Override // com.google.android.recaptcha.internal.zzpe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh(Object obj, zzpd zzpdVar, zzmw zzmwVar) throws Throwable {
        Object obj2;
        Object obj3;
        zzot<T> zzotVar;
        Throwable th;
        int i;
        zzpv zzpvVar;
        Object obj4;
        Object obj5;
        Object objValueOf;
        int iOrdinal;
        Object objZze;
        zzmwVar.getClass();
        zzD(obj);
        zzpv zzpvVar2 = this.zzm;
        Object objZza = null;
        zznb zznbVarZzi = null;
        while (true) {
            try {
                int iZzc = zzpdVar.zzc();
                int iZzq = zzq(iZzc);
                if (iZzq >= 0) {
                    obj5 = obj;
                    zzpvVar = zzpvVar2;
                    zzotVar = this;
                    obj4 = objZza;
                    try {
                        int iZzu = zzu(iZzq);
                        try {
                        } catch (zznu unused) {
                            obj2 = obj5;
                        }
                        switch (zzt(iZzu)) {
                            case 0:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                zzqc.zzo(obj2, iZzu & 1048575, zzpdVar.zza());
                                zzH(obj2, iZzq);
                                objZza = obj3;
                                obj = obj2;
                            case 1:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                zzqc.zzp(obj2, iZzu & 1048575, zzpdVar.zzb());
                                zzH(obj2, iZzq);
                                objZza = obj3;
                                obj = obj2;
                            case 2:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                zzqc.zzr(obj2, iZzu & 1048575, zzpdVar.zzl());
                                zzH(obj2, iZzq);
                                objZza = obj3;
                                obj = obj2;
                            case 3:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                zzqc.zzr(obj2, iZzu & 1048575, zzpdVar.zzo());
                                zzH(obj2, iZzq);
                                objZza = obj3;
                                obj = obj2;
                            case 4:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                zzqc.zzq(obj2, iZzu & 1048575, zzpdVar.zzg());
                                zzH(obj2, iZzq);
                                objZza = obj3;
                                obj = obj2;
                            case 5:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                zzqc.zzr(obj2, iZzu & 1048575, zzpdVar.zzk());
                                zzH(obj2, iZzq);
                                objZza = obj3;
                                obj = obj2;
                            case 6:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                zzqc.zzq(obj2, iZzu & 1048575, zzpdVar.zzf());
                                zzH(obj2, iZzq);
                                objZza = obj3;
                                obj = obj2;
                            case 7:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                zzqc.zzm(obj2, iZzu & 1048575, zzpdVar.zzN());
                                zzH(obj2, iZzq);
                                objZza = obj3;
                                obj = obj2;
                            case 8:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                zzG(obj2, iZzu, zzpdVar);
                                zzH(obj2, iZzq);
                                objZza = obj3;
                                obj = obj2;
                            case 9:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                zzoq zzoqVar = (zzoq) zzA(obj2, iZzq);
                                zzpdVar.zzu(zzoqVar, zzx(iZzq), zzmwVar);
                                zzJ(obj2, iZzq, zzoqVar);
                                objZza = obj3;
                                obj = obj2;
                            case 10:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                zzqc.zzs(obj2, iZzu & 1048575, zzpdVar.zzp());
                                zzH(obj2, iZzq);
                                objZza = obj3;
                                obj = obj2;
                            case 11:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                zzqc.zzq(obj2, iZzu & 1048575, zzpdVar.zzj());
                                zzH(obj2, iZzq);
                                objZza = obj3;
                                obj = obj2;
                            case 12:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                int iZze = zzpdVar.zze();
                                zznp zznpVarZzw = zzw(iZzq);
                                if (zznpVarZzw != null && !zznpVarZzw.zza(iZze)) {
                                    objZza = zzpg.zzo(obj2, iZzc, iZze, obj3, zzpvVar2);
                                    obj = obj2;
                                }
                                zzqc.zzq(obj2, iZzu & 1048575, iZze);
                                zzH(obj2, iZzq);
                                objZza = obj3;
                                obj = obj2;
                                break;
                            case 13:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                zzqc.zzq(obj2, iZzu & 1048575, zzpdVar.zzh());
                                zzH(obj2, iZzq);
                                objZza = obj3;
                                obj = obj2;
                            case 14:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                zzqc.zzr(obj2, iZzu & 1048575, zzpdVar.zzm());
                                zzH(obj2, iZzq);
                                objZza = obj3;
                                obj = obj2;
                            case 15:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                zzqc.zzq(obj2, iZzu & 1048575, zzpdVar.zzi());
                                zzH(obj2, iZzq);
                                objZza = obj3;
                                obj = obj2;
                            case 16:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                zzqc.zzr(obj2, iZzu & 1048575, zzpdVar.zzn());
                                zzH(obj2, iZzq);
                                objZza = obj3;
                                obj = obj2;
                            case 17:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                zzoq zzoqVar2 = (zzoq) zzA(obj2, iZzq);
                                zzpdVar.zzt(zzoqVar2, zzx(iZzq), zzmwVar);
                                zzJ(obj2, iZzq, zzoqVar2);
                                objZza = obj3;
                                obj = obj2;
                            case 18:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                zzpdVar.zzx(zzod.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 19:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                zzpdVar.zzB(zzod.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 20:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                zzpdVar.zzE(zzod.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 21:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                zzpdVar.zzM(zzod.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 22:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                zzpdVar.zzD(zzod.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 23:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                zzpdVar.zzA(zzod.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 24:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                zzpdVar.zzz(zzod.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 25:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                zzpdVar.zzv(zzod.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 26:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                if (zzM(iZzu)) {
                                    ((zzln) zzpdVar).zzK(zzod.zza(obj2, iZzu & 1048575), true);
                                } else {
                                    ((zzln) zzpdVar).zzK(zzod.zza(obj2, iZzu & 1048575), false);
                                }
                                objZza = obj3;
                                obj = obj2;
                            case 27:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                zzpdVar.zzF(zzod.zza(obj2, iZzu & 1048575), zzx(iZzq), zzmwVar);
                                objZza = obj3;
                                obj = obj2;
                            case 28:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                zzpdVar.zzw(zzod.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 29:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                zzpdVar.zzL(zzod.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 30:
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                try {
                                    List listZza = zzod.zza(obj5, iZzu & 1048575);
                                    zzpdVar.zzy(listZza);
                                    objZza = zzpg.zzn(obj5, iZzc, listZza, zzw(iZzq), obj3, zzpvVar2);
                                    obj2 = obj5;
                                    zzpvVar2 = zzpvVar2;
                                } catch (zznu unused2) {
                                    obj2 = obj5;
                                    objZza = obj3;
                                    if (objZza == null) {
                                    }
                                    if (!zzpvVar2.zzk(objZza, zzpdVar, 0)) {
                                    }
                                    obj = obj2;
                                } catch (Throwable th2) {
                                    th = th2;
                                    obj2 = obj5;
                                    th = th;
                                    objZza = obj3;
                                    i = zzotVar.zzk;
                                    while (i < zzotVar.zzl) {
                                    }
                                    if (objZza == null) {
                                    }
                                }
                                obj = obj2;
                                break;
                            case 31:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                zzpdVar.zzG(zzod.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 32:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                zzpdVar.zzH(zzod.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 33:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                zzpdVar.zzI(zzod.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 34:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                zzpdVar.zzJ(zzod.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 35:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                zzpdVar.zzx(zzod.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 36:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                zzpdVar.zzB(zzod.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 37:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                zzpdVar.zzE(zzod.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 38:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                zzpdVar.zzM(zzod.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 39:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                zzpdVar.zzD(zzod.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 40:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                zzpdVar.zzA(zzod.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 41:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                zzpdVar.zzz(zzod.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 42:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                zzpdVar.zzv(zzod.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 43:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                try {
                                    zzpdVar.zzL(zzod.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                } catch (zznu unused3) {
                                    objZza = obj3;
                                    if (objZza == null) {
                                        try {
                                            objZza = zzpvVar2.zza(obj2);
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                    }
                                    if (!zzpvVar2.zzk(objZza, zzpdVar, 0)) {
                                        for (int i2 = zzotVar.zzk; i2 < zzotVar.zzl; i2++) {
                                            zzotVar.zzy(obj2, zzotVar.zzj[i2], objZza, zzpvVar2, obj2);
                                        }
                                        if (objZza == null) {
                                        }
                                    }
                                    obj = obj2;
                                } catch (Throwable th4) {
                                    th = th4;
                                    th = th;
                                    objZza = obj3;
                                    i = zzotVar.zzk;
                                    while (i < zzotVar.zzl) {
                                    }
                                    if (objZza == null) {
                                    }
                                }
                                obj = obj2;
                                break;
                            case 44:
                                List listZza2 = zzod.zza(obj5, iZzu & 1048575);
                                zzpdVar.zzy(listZza2);
                                try {
                                    objZza = zzpg.zzn(obj5, iZzc, listZza2, zzw(iZzq), obj4, zzpvVar);
                                    obj2 = obj5;
                                    zzpvVar2 = zzpvVar;
                                } catch (zznu unused4) {
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzpvVar2 = zzpvVar;
                                    objZza = obj3;
                                    if (objZza == null) {
                                    }
                                    if (!zzpvVar2.zzk(objZza, zzpdVar, 0)) {
                                    }
                                    obj = obj2;
                                } catch (Throwable th5) {
                                    th = th5;
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzpvVar2 = zzpvVar;
                                    th = th;
                                    objZza = obj3;
                                    i = zzotVar.zzk;
                                    while (i < zzotVar.zzl) {
                                    }
                                    if (objZza == null) {
                                    }
                                }
                                obj = obj2;
                                break;
                            case 45:
                                zzpdVar.zzG(zzod.zza(obj5, iZzu & 1048575));
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                objZza = obj3;
                                obj = obj2;
                            case 46:
                                zzpdVar.zzH(zzod.zza(obj5, iZzu & 1048575));
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                objZza = obj3;
                                obj = obj2;
                            case 47:
                                zzpdVar.zzI(zzod.zza(obj5, iZzu & 1048575));
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                objZza = obj3;
                                obj = obj2;
                            case 48:
                                zzpdVar.zzJ(zzod.zza(obj5, iZzu & 1048575));
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                objZza = obj3;
                                obj = obj2;
                            case 49:
                                zzpdVar.zzC(zzod.zza(obj5, iZzu & 1048575), zzx(iZzq), zzmwVar);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                objZza = obj3;
                                obj = obj2;
                            case 50:
                                Object objZzz = zzz(iZzq);
                                long jZzu = zzu(iZzq) & 1048575;
                                Object objZzf = zzqc.zzf(obj5, jZzu);
                                if (objZzf == null) {
                                    objZzf = zzok.zza().zzb();
                                    zzqc.zzs(obj5, jZzu, objZzf);
                                } else if (zzol.zza(objZzf)) {
                                    Object objZzb = zzok.zza().zzb();
                                    zzol.zzb(objZzb, objZzf);
                                    zzqc.zzs(obj5, jZzu, objZzb);
                                    objZzf = objZzb;
                                }
                                throw null;
                                break;
                            case 51:
                                zzqc.zzs(obj5, iZzu & 1048575, Double.valueOf(zzpdVar.zza()));
                                zzI(obj5, iZzc, iZzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                objZza = obj3;
                                obj = obj2;
                            case 52:
                                zzqc.zzs(obj5, iZzu & 1048575, Float.valueOf(zzpdVar.zzb()));
                                zzI(obj5, iZzc, iZzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                objZza = obj3;
                                obj = obj2;
                            case 53:
                                zzqc.zzs(obj5, iZzu & 1048575, Long.valueOf(zzpdVar.zzl()));
                                zzI(obj5, iZzc, iZzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                objZza = obj3;
                                obj = obj2;
                            case 54:
                                zzqc.zzs(obj5, iZzu & 1048575, Long.valueOf(zzpdVar.zzo()));
                                zzI(obj5, iZzc, iZzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                objZza = obj3;
                                obj = obj2;
                            case 55:
                                zzqc.zzs(obj5, iZzu & 1048575, Integer.valueOf(zzpdVar.zzg()));
                                zzI(obj5, iZzc, iZzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                objZza = obj3;
                                obj = obj2;
                            case 56:
                                zzqc.zzs(obj5, iZzu & 1048575, Long.valueOf(zzpdVar.zzk()));
                                zzI(obj5, iZzc, iZzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                objZza = obj3;
                                obj = obj2;
                            case 57:
                                zzqc.zzs(obj5, iZzu & 1048575, Integer.valueOf(zzpdVar.zzf()));
                                zzI(obj5, iZzc, iZzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                objZza = obj3;
                                obj = obj2;
                            case 58:
                                zzqc.zzs(obj5, iZzu & 1048575, Boolean.valueOf(zzpdVar.zzN()));
                                zzI(obj5, iZzc, iZzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                objZza = obj3;
                                obj = obj2;
                            case 59:
                                zzG(obj5, iZzu, zzpdVar);
                                zzI(obj5, iZzc, iZzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                objZza = obj3;
                                obj = obj2;
                            case 60:
                                zzoq zzoqVar3 = (zzoq) zzB(obj5, iZzc, iZzq);
                                zzpdVar.zzu(zzoqVar3, zzx(iZzq), zzmwVar);
                                zzK(obj5, iZzc, iZzq, zzoqVar3);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                objZza = obj3;
                                obj = obj2;
                            case 61:
                                zzqc.zzs(obj5, iZzu & 1048575, zzpdVar.zzp());
                                zzI(obj5, iZzc, iZzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                objZza = obj3;
                                obj = obj2;
                            case 62:
                                zzqc.zzs(obj5, iZzu & 1048575, Integer.valueOf(zzpdVar.zzj()));
                                zzI(obj5, iZzc, iZzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                objZza = obj3;
                                obj = obj2;
                            case 63:
                                int iZze2 = zzpdVar.zze();
                                zznp zznpVarZzw2 = zzw(iZzq);
                                if (zznpVarZzw2 != null && !zznpVarZzw2.zza(iZze2)) {
                                    objZza = zzpg.zzo(obj5, iZzc, iZze2, obj4, zzpvVar);
                                    obj = obj5;
                                    zzpvVar2 = zzpvVar;
                                }
                                zzqc.zzs(obj5, iZzu & 1048575, Integer.valueOf(iZze2));
                                zzI(obj5, iZzc, iZzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                objZza = obj3;
                                obj = obj2;
                                break;
                            case 64:
                                zzqc.zzs(obj5, iZzu & 1048575, Integer.valueOf(zzpdVar.zzh()));
                                zzI(obj5, iZzc, iZzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                objZza = obj3;
                                obj = obj2;
                            case 65:
                                zzqc.zzs(obj5, iZzu & 1048575, Long.valueOf(zzpdVar.zzm()));
                                zzI(obj5, iZzc, iZzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                objZza = obj3;
                                obj = obj2;
                            case 66:
                                zzqc.zzs(obj5, iZzu & 1048575, Integer.valueOf(zzpdVar.zzi()));
                                zzI(obj5, iZzc, iZzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                objZza = obj3;
                                obj = obj2;
                            case 67:
                                zzqc.zzs(obj5, iZzu & 1048575, Long.valueOf(zzpdVar.zzn()));
                                zzI(obj5, iZzc, iZzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                objZza = obj3;
                                obj = obj2;
                            case SDK_ASSET_ICON_HOME_VALUE:
                                zzoq zzoqVar4 = (zzoq) zzB(obj5, iZzc, iZzq);
                                zzpdVar.zzt(zzoqVar4, zzx(iZzq), zzmwVar);
                                zzK(obj5, iZzc, iZzq, zzoqVar4);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzpvVar2 = zzpvVar;
                                objZza = obj3;
                                obj = obj2;
                            default:
                                if (obj4 == null) {
                                    try {
                                        objZza = zzpvVar.zza(obj5);
                                    } catch (Throwable th6) {
                                        th = th6;
                                        th = th;
                                        obj2 = obj5;
                                        obj3 = obj4;
                                        zzpvVar2 = zzpvVar;
                                        objZza = obj3;
                                        i = zzotVar.zzk;
                                        while (i < zzotVar.zzl) {
                                        }
                                        if (objZza == null) {
                                        }
                                    }
                                } else {
                                    objZza = obj4;
                                }
                                try {
                                    if (!zzpvVar.zzk(objZza, zzpdVar, 0)) {
                                        for (int i3 = zzotVar.zzk; i3 < zzotVar.zzl; i3++) {
                                            zzpv zzpvVar3 = zzpvVar;
                                            Object obj6 = obj5;
                                            zzotVar.zzy(obj6, zzotVar.zzj[i3], objZza, zzpvVar3, obj5);
                                            obj5 = obj6;
                                            zzpvVar = zzpvVar3;
                                        }
                                        break;
                                    }
                                    obj = obj5;
                                    zzpvVar2 = zzpvVar;
                                } catch (zznu unused5) {
                                    obj2 = obj5;
                                    zzpvVar2 = zzpvVar;
                                    if (objZza == null) {
                                    }
                                    if (!zzpvVar2.zzk(objZza, zzpdVar, 0)) {
                                    }
                                    obj = obj2;
                                } catch (Throwable th7) {
                                    th = th7;
                                    th = th;
                                    obj2 = obj5;
                                    zzpvVar2 = zzpvVar;
                                    i = zzotVar.zzk;
                                    while (i < zzotVar.zzl) {
                                    }
                                    if (objZza == null) {
                                    }
                                }
                                break;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        obj2 = obj5;
                    }
                } else if (iZzc == Integer.MAX_VALUE) {
                    int i4 = this.zzk;
                    while (i4 < this.zzl) {
                        zzy(obj, this.zzj[i4], objZza, zzpvVar2, obj);
                        i4++;
                        zzpvVar2 = zzpvVar2;
                    }
                    obj2 = obj;
                    zzpvVar2 = zzpvVar2;
                } else {
                    zzpvVar = zzpvVar2;
                    obj4 = objZza;
                    try {
                        zznk zznkVarZza = !this.zzh ? null : zzmwVar.zza(this.zzg, iZzc);
                        if (zznkVarZza != null) {
                            if (zznbVarZzi == null) {
                                try {
                                    zznbVarZzi = ((zzni) obj).zzi();
                                } catch (Throwable th9) {
                                    th = th9;
                                    obj2 = obj;
                                    zzotVar = this;
                                    obj3 = obj4;
                                    zzpvVar2 = zzpvVar;
                                    objZza = obj3;
                                    i = zzotVar.zzk;
                                    while (i < zzotVar.zzl) {
                                    }
                                    if (objZza == null) {
                                    }
                                }
                            }
                            zznj zznjVar = zznkVarZza.zza;
                            zzqg zzqgVar = zzqg.zzn;
                            zzqg zzqgVar2 = zznjVar.zzb;
                            if (zzqgVar2 == zzqgVar) {
                                zzpdVar.zzg();
                                throw null;
                            }
                            switch (zzqgVar2.ordinal()) {
                                case 0:
                                    objValueOf = Double.valueOf(zzpdVar.zza());
                                    iOrdinal = zznkVarZza.zza.zzb.ordinal();
                                    if ((iOrdinal != 9 || iOrdinal == 10) && (objZze = zznbVarZzi.zze(zznkVarZza.zza)) != null) {
                                        byte[] bArr = zznt.zzb;
                                        objValueOf = ((zzoq) objZze).zzae().zzc((zzoq) objValueOf).zzk();
                                    }
                                    zznbVarZzi.zzi(zznkVarZza.zza, objValueOf);
                                    objZza = obj4;
                                    zzpvVar2 = zzpvVar;
                                    break;
                                case 1:
                                    objValueOf = Float.valueOf(zzpdVar.zzb());
                                    iOrdinal = zznkVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr2 = zznt.zzb;
                                        objValueOf = ((zzoq) objZze).zzae().zzc((zzoq) objValueOf).zzk();
                                        zznbVarZzi.zzi(zznkVarZza.zza, objValueOf);
                                        objZza = obj4;
                                        zzpvVar2 = zzpvVar;
                                        break;
                                    } else {
                                        byte[] bArr22 = zznt.zzb;
                                        objValueOf = ((zzoq) objZze).zzae().zzc((zzoq) objValueOf).zzk();
                                        zznbVarZzi.zzi(zznkVarZza.zza, objValueOf);
                                        objZza = obj4;
                                        zzpvVar2 = zzpvVar;
                                    }
                                case 2:
                                    objValueOf = Long.valueOf(zzpdVar.zzl());
                                    iOrdinal = zznkVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                    }
                                    break;
                                case 3:
                                    objValueOf = Long.valueOf(zzpdVar.zzo());
                                    iOrdinal = zznkVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                    }
                                    break;
                                case 4:
                                    objValueOf = Integer.valueOf(zzpdVar.zzg());
                                    iOrdinal = zznkVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                    }
                                    break;
                                case 5:
                                    objValueOf = Long.valueOf(zzpdVar.zzk());
                                    iOrdinal = zznkVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                    }
                                    break;
                                case 6:
                                    objValueOf = Integer.valueOf(zzpdVar.zzf());
                                    iOrdinal = zznkVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                    }
                                    break;
                                case 7:
                                    objValueOf = Boolean.valueOf(zzpdVar.zzN());
                                    iOrdinal = zznkVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                    }
                                    break;
                                case 8:
                                    objValueOf = zzpdVar.zzr();
                                    iOrdinal = zznkVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                    }
                                    break;
                                case 9:
                                    Object objZze2 = zznbVarZzi.zze(zznkVarZza.zza);
                                    if (!(objZze2 instanceof zznl)) {
                                        throw null;
                                    }
                                    zzpe zzpeVarZzb = zzpa.zza().zzb(objZze2.getClass());
                                    if (!((zznl) objZze2).zzK()) {
                                        Object objZze3 = zzpeVarZzb.zze();
                                        zzpeVarZzb.zzg(objZze3, objZze2);
                                        zznbVarZzi.zzi(zznkVarZza.zza, objZze3);
                                        objZze2 = objZze3;
                                    }
                                    zzpdVar.zzt(objZze2, zzpeVarZzb, zzmwVar);
                                    objZza = obj4;
                                    zzpvVar2 = zzpvVar;
                                case 10:
                                    Object objZze4 = zznbVarZzi.zze(zznkVarZza.zza);
                                    if (!(objZze4 instanceof zznl)) {
                                        throw null;
                                    }
                                    zzpe zzpeVarZzb2 = zzpa.zza().zzb(objZze4.getClass());
                                    if (!((zznl) objZze4).zzK()) {
                                        Object objZze5 = zzpeVarZzb2.zze();
                                        zzpeVarZzb2.zzg(objZze5, objZze4);
                                        zznbVarZzi.zzi(zznkVarZza.zza, objZze5);
                                        objZze4 = objZze5;
                                    }
                                    zzpdVar.zzu(objZze4, zzpeVarZzb2, zzmwVar);
                                    objZza = obj4;
                                    zzpvVar2 = zzpvVar;
                                case 11:
                                    objValueOf = zzpdVar.zzp();
                                    iOrdinal = zznkVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                    }
                                    break;
                                case 12:
                                    objValueOf = Integer.valueOf(zzpdVar.zzj());
                                    iOrdinal = zznkVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                    }
                                    break;
                                case 13:
                                    throw new IllegalStateException("Shouldn't reach here.");
                                case 14:
                                    objValueOf = Integer.valueOf(zzpdVar.zzh());
                                    iOrdinal = zznkVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                    }
                                    break;
                                case 15:
                                    objValueOf = Long.valueOf(zzpdVar.zzm());
                                    iOrdinal = zznkVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                    }
                                    break;
                                case 16:
                                    objValueOf = Integer.valueOf(zzpdVar.zzi());
                                    iOrdinal = zznkVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                    }
                                    break;
                                case 17:
                                    objValueOf = Long.valueOf(zzpdVar.zzn());
                                    iOrdinal = zznkVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                    }
                                    break;
                                default:
                                    objValueOf = null;
                                    iOrdinal = zznkVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                    }
                                    break;
                            }
                        } else {
                            objZza = obj4 == null ? zzpvVar.zza(obj) : obj4;
                            try {
                                if (zzpvVar.zzk(objZza, zzpdVar, 0)) {
                                    obj5 = obj;
                                    obj = obj5;
                                    zzpvVar2 = zzpvVar;
                                } else {
                                    int i5 = this.zzk;
                                    while (i5 < this.zzl) {
                                        zzpv zzpvVar4 = zzpvVar;
                                        Object obj7 = obj;
                                        zzy(obj7, this.zzj[i5], objZza, zzpvVar4, obj);
                                        zzpvVar = zzpvVar4;
                                        i5++;
                                        obj = obj7;
                                    }
                                    obj5 = obj;
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                obj5 = obj;
                                zzotVar = this;
                                th = th;
                                obj2 = obj5;
                                zzpvVar2 = zzpvVar;
                                i = zzotVar.zzk;
                                while (i < zzotVar.zzl) {
                                }
                                if (objZza == null) {
                                }
                            }
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        obj5 = obj;
                        zzotVar = this;
                        th = th;
                        obj2 = obj5;
                        obj3 = obj4;
                        zzpvVar2 = zzpvVar;
                        objZza = obj3;
                        i = zzotVar.zzk;
                        while (i < zzotVar.zzl) {
                        }
                        if (objZza == null) {
                        }
                    }
                }
            } catch (Throwable th12) {
                th = th12;
                obj2 = obj;
                obj3 = objZza;
                zzotVar = this;
            }
            i = zzotVar.zzk;
            while (i < zzotVar.zzl) {
                zzotVar.zzy(obj2, zzotVar.zzj[i], objZza, zzpvVar2, obj2);
                i++;
                zzotVar = this;
            }
            if (objZza == null) {
                throw th;
            }
            zzpvVar2.zzj(obj2, objZza);
            throw th;
        }
        if (objZza == null) {
            zzpvVar2.zzj(obj2, objZza);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpe
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzkv zzkvVar) throws IOException {
        zzc(obj, bArr, i, i2, 0, zzkvVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    @Override // com.google.android.recaptcha.internal.zzpe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj(Object obj, zzqi zzqiVar) throws IOException {
        Map.Entry entry;
        Iterator it;
        int i;
        Map.Entry entry2;
        int i2;
        int i3;
        int i4;
        zzot<T> zzotVar = this;
        if (zzotVar.zzh) {
            zznb zznbVar = ((zzni) obj).zzb;
            if (zznbVar.zza.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itZzf = zznbVar.zzf();
                entry = (Map.Entry) itZzf.next();
                it = itZzf;
            }
        }
        int[] iArr = zzotVar.zzc;
        Unsafe unsafe = zzb;
        int i5 = 0;
        int i6 = 1048575;
        int i7 = 0;
        while (i5 < iArr.length) {
            int iZzu = zzotVar.zzu(i5);
            int[] iArr2 = zzotVar.zzc;
            int iZzt = zzt(iZzu);
            int i8 = iArr2[i5];
            if (iZzt <= 17) {
                int i9 = iArr2[i5 + 2];
                int i10 = i9 & 1048575;
                if (i10 != i6) {
                    i = 1;
                    i7 = i10 == 1048575 ? 0 : unsafe.getInt(obj, i10);
                    i6 = i10;
                } else {
                    i = 1;
                }
                entry2 = entry;
                i2 = i6;
                i3 = i7;
                i4 = i << (i9 >>> 20);
            } else {
                i = 1;
                entry2 = entry;
                i2 = i6;
                i3 = i7;
                i4 = 0;
            }
            while (entry2 != null && ((zznj) entry2.getKey()).zza <= i8) {
                zzotVar.zzn.zzb(zzqiVar, entry2);
                entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long j = iZzu & 1048575;
            switch (iZzt) {
                case 0:
                    if (zzotVar.zzO(obj, i5, i2, i3, i4)) {
                        zzqiVar.zzf(i8, zzqc.zza(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 1:
                    if (zzotVar.zzO(obj, i5, i2, i3, i4)) {
                        zzqiVar.zzo(i8, zzqc.zzb(obj, j));
                    }
                    zzotVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 2:
                    if (zzotVar.zzO(obj, i5, i2, i3, i4)) {
                        zzqiVar.zzt(i8, unsafe.getLong(obj, j));
                    }
                    zzotVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 3:
                    if (zzotVar.zzO(obj, i5, i2, i3, i4)) {
                        zzqiVar.zzK(i8, unsafe.getLong(obj, j));
                    }
                    zzotVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 4:
                    if (zzotVar.zzO(obj, i5, i2, i3, i4)) {
                        zzqiVar.zzr(i8, unsafe.getInt(obj, j));
                    }
                    zzotVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 5:
                    if (zzotVar.zzO(obj, i5, i2, i3, i4)) {
                        zzqiVar.zzm(i8, unsafe.getLong(obj, j));
                    }
                    zzotVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 6:
                    if (zzotVar.zzO(obj, i5, i2, i3, i4)) {
                        zzqiVar.zzk(i8, unsafe.getInt(obj, j));
                    }
                    zzotVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 7:
                    if (zzotVar.zzO(obj, i5, i2, i3, i4)) {
                        zzqiVar.zzb(i8, zzqc.zzw(obj, j));
                    }
                    zzotVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 8:
                    if (zzotVar.zzO(obj, i5, i2, i3, i4)) {
                        zzT(i8, unsafe.getObject(obj, j), zzqiVar);
                    }
                    zzotVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 9:
                    if (zzotVar.zzO(obj, i5, i2, i3, i4)) {
                        zzqiVar.zzv(i8, unsafe.getObject(obj, j), zzotVar.zzx(i5));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 10:
                    if (zzotVar.zzO(obj, i5, i2, i3, i4)) {
                        zzqiVar.zzd(i8, (zzlg) unsafe.getObject(obj, j));
                    }
                    zzotVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 11:
                    if (zzotVar.zzO(obj, i5, i2, i3, i4)) {
                        zzqiVar.zzI(i8, unsafe.getInt(obj, j));
                    }
                    zzotVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 12:
                    if (zzotVar.zzO(obj, i5, i2, i3, i4)) {
                        zzqiVar.zzi(i8, unsafe.getInt(obj, j));
                    }
                    zzotVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 13:
                    if (zzotVar.zzO(obj, i5, i2, i3, i4)) {
                        zzqiVar.zzx(i8, unsafe.getInt(obj, j));
                    }
                    zzotVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 14:
                    if (zzotVar.zzO(obj, i5, i2, i3, i4)) {
                        zzqiVar.zzz(i8, unsafe.getLong(obj, j));
                    }
                    zzotVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 15:
                    if (zzotVar.zzO(obj, i5, i2, i3, i4)) {
                        zzqiVar.zzB(i8, unsafe.getInt(obj, j));
                    }
                    zzotVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 16:
                    if (zzotVar.zzO(obj, i5, i2, i3, i4)) {
                        zzqiVar.zzD(i8, unsafe.getLong(obj, j));
                    }
                    zzotVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 17:
                    if (zzotVar.zzO(obj, i5, i2, i3, i4)) {
                        zzqiVar.zzq(i8, unsafe.getObject(obj, j), zzotVar.zzx(i5));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 18:
                    zzpg.zzs(zzotVar.zzc[i5], (List) unsafe.getObject(obj, j), zzqiVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 19:
                    zzpg.zzw(zzotVar.zzc[i5], (List) unsafe.getObject(obj, j), zzqiVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 20:
                    zzpg.zzy(zzotVar.zzc[i5], (List) unsafe.getObject(obj, j), zzqiVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 21:
                    zzpg.zzE(zzotVar.zzc[i5], (List) unsafe.getObject(obj, j), zzqiVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 22:
                    zzpg.zzx(zzotVar.zzc[i5], (List) unsafe.getObject(obj, j), zzqiVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 23:
                    zzpg.zzv(zzotVar.zzc[i5], (List) unsafe.getObject(obj, j), zzqiVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 24:
                    zzpg.zzu(zzotVar.zzc[i5], (List) unsafe.getObject(obj, j), zzqiVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 25:
                    zzpg.zzr(zzotVar.zzc[i5], (List) unsafe.getObject(obj, j), zzqiVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 26:
                    int i11 = zzotVar.zzc[i5];
                    List list = (List) unsafe.getObject(obj, j);
                    int i12 = zzpg.zza;
                    if (list != null && !list.isEmpty()) {
                        zzqiVar.zzH(i11, list);
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                    break;
                case 27:
                    int i13 = zzotVar.zzc[i5];
                    List list2 = (List) unsafe.getObject(obj, j);
                    zzpe zzpeVarZzx = zzotVar.zzx(i5);
                    int i14 = zzpg.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i15 = 0; i15 < list2.size(); i15++) {
                            ((zzls) zzqiVar).zzv(i13, list2.get(i15), zzpeVarZzx);
                        }
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                    break;
                case 28:
                    int i16 = zzotVar.zzc[i5];
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i17 = zzpg.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zzqiVar.zze(i16, list3);
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                    break;
                case 29:
                    zzpg.zzD(zzotVar.zzc[i5], (List) unsafe.getObject(obj, j), zzqiVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 30:
                    zzpg.zzt(zzotVar.zzc[i5], (List) unsafe.getObject(obj, j), zzqiVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 31:
                    zzpg.zzz(zzotVar.zzc[i5], (List) unsafe.getObject(obj, j), zzqiVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 32:
                    zzpg.zzA(zzotVar.zzc[i5], (List) unsafe.getObject(obj, j), zzqiVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 33:
                    zzpg.zzB(zzotVar.zzc[i5], (List) unsafe.getObject(obj, j), zzqiVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 34:
                    zzpg.zzC(zzotVar.zzc[i5], (List) unsafe.getObject(obj, j), zzqiVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 35:
                    zzpg.zzs(zzotVar.zzc[i5], (List) unsafe.getObject(obj, j), zzqiVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 36:
                    zzpg.zzw(zzotVar.zzc[i5], (List) unsafe.getObject(obj, j), zzqiVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 37:
                    zzpg.zzy(zzotVar.zzc[i5], (List) unsafe.getObject(obj, j), zzqiVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 38:
                    zzpg.zzE(zzotVar.zzc[i5], (List) unsafe.getObject(obj, j), zzqiVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 39:
                    zzpg.zzx(zzotVar.zzc[i5], (List) unsafe.getObject(obj, j), zzqiVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 40:
                    zzpg.zzv(zzotVar.zzc[i5], (List) unsafe.getObject(obj, j), zzqiVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 41:
                    zzpg.zzu(zzotVar.zzc[i5], (List) unsafe.getObject(obj, j), zzqiVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 42:
                    zzpg.zzr(zzotVar.zzc[i5], (List) unsafe.getObject(obj, j), zzqiVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 43:
                    zzpg.zzD(zzotVar.zzc[i5], (List) unsafe.getObject(obj, j), zzqiVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 44:
                    zzpg.zzt(zzotVar.zzc[i5], (List) unsafe.getObject(obj, j), zzqiVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 45:
                    zzpg.zzz(zzotVar.zzc[i5], (List) unsafe.getObject(obj, j), zzqiVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 46:
                    zzpg.zzA(zzotVar.zzc[i5], (List) unsafe.getObject(obj, j), zzqiVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 47:
                    zzpg.zzB(zzotVar.zzc[i5], (List) unsafe.getObject(obj, j), zzqiVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 48:
                    zzpg.zzC(zzotVar.zzc[i5], (List) unsafe.getObject(obj, j), zzqiVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 49:
                    int i18 = zzotVar.zzc[i5];
                    List list4 = (List) unsafe.getObject(obj, j);
                    zzpe zzpeVarZzx2 = zzotVar.zzx(i5);
                    int i19 = zzpg.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i20 = 0; i20 < list4.size(); i20++) {
                            ((zzls) zzqiVar).zzq(i18, list4.get(i20), zzpeVarZzx2);
                        }
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        throw null;
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 51:
                    if (zzotVar.zzR(obj, i8, i5)) {
                        zzqiVar.zzf(i8, zzn(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 52:
                    if (zzotVar.zzR(obj, i8, i5)) {
                        zzqiVar.zzo(i8, zzo(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 53:
                    if (zzotVar.zzR(obj, i8, i5)) {
                        zzqiVar.zzt(i8, zzv(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 54:
                    if (zzotVar.zzR(obj, i8, i5)) {
                        zzqiVar.zzK(i8, zzv(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 55:
                    if (zzotVar.zzR(obj, i8, i5)) {
                        zzqiVar.zzr(i8, zzp(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 56:
                    if (zzotVar.zzR(obj, i8, i5)) {
                        zzqiVar.zzm(i8, zzv(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 57:
                    if (zzotVar.zzR(obj, i8, i5)) {
                        zzqiVar.zzk(i8, zzp(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 58:
                    if (zzotVar.zzR(obj, i8, i5)) {
                        zzqiVar.zzb(i8, zzS(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 59:
                    if (zzotVar.zzR(obj, i8, i5)) {
                        zzT(i8, unsafe.getObject(obj, j), zzqiVar);
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 60:
                    if (zzotVar.zzR(obj, i8, i5)) {
                        zzqiVar.zzv(i8, unsafe.getObject(obj, j), zzotVar.zzx(i5));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 61:
                    if (zzotVar.zzR(obj, i8, i5)) {
                        zzqiVar.zzd(i8, (zzlg) unsafe.getObject(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 62:
                    if (zzotVar.zzR(obj, i8, i5)) {
                        zzqiVar.zzI(i8, zzp(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 63:
                    if (zzotVar.zzR(obj, i8, i5)) {
                        zzqiVar.zzi(i8, zzp(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 64:
                    if (zzotVar.zzR(obj, i8, i5)) {
                        zzqiVar.zzx(i8, zzp(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 65:
                    if (zzotVar.zzR(obj, i8, i5)) {
                        zzqiVar.zzz(i8, zzv(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 66:
                    if (zzotVar.zzR(obj, i8, i5)) {
                        zzqiVar.zzB(i8, zzp(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case 67:
                    if (zzotVar.zzR(obj, i8, i5)) {
                        zzqiVar.zzD(i8, zzv(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                case SDK_ASSET_ICON_HOME_VALUE:
                    if (zzotVar.zzR(obj, i8, i5)) {
                        zzqiVar.zzq(i8, unsafe.getObject(obj, j), zzotVar.zzx(i5));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
                default:
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry2;
            }
        }
        while (entry != null) {
            zzotVar.zzn.zzb(zzqiVar, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        ((zznl) obj).zzc.zzl(zzqiVar);
    }

    @Override // com.google.android.recaptcha.internal.zzpe
    public final boolean zzk(Object obj, Object obj2) {
        boolean zZzF;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzu = zzu(i);
            long j = iZzu & 1048575;
            switch (zzt(iZzu)) {
                case 0:
                    if (!zzL(obj, obj2, i) || Double.doubleToLongBits(zzqc.zza(obj, j)) != Double.doubleToLongBits(zzqc.zza(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i) || Float.floatToIntBits(zzqc.zzb(obj, j)) != Float.floatToIntBits(zzqc.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i) || zzqc.zzd(obj, j) != zzqc.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i) || zzqc.zzd(obj, j) != zzqc.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i) || zzqc.zzc(obj, j) != zzqc.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i) || zzqc.zzd(obj, j) != zzqc.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i) || zzqc.zzc(obj, j) != zzqc.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i) || zzqc.zzw(obj, j) != zzqc.zzw(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i) || !zzpg.zzF(zzqc.zzf(obj, j), zzqc.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i) || !zzpg.zzF(zzqc.zzf(obj, j), zzqc.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i) || !zzpg.zzF(zzqc.zzf(obj, j), zzqc.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i) || zzqc.zzc(obj, j) != zzqc.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i) || zzqc.zzc(obj, j) != zzqc.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i) || zzqc.zzc(obj, j) != zzqc.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i) || zzqc.zzd(obj, j) != zzqc.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i) || zzqc.zzc(obj, j) != zzqc.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i) || zzqc.zzd(obj, j) != zzqc.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i) || !zzpg.zzF(zzqc.zzf(obj, j), zzqc.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zZzF = zzpg.zzF(zzqc.zzf(obj, j), zzqc.zzf(obj2, j));
                    break;
                case 50:
                    zZzF = zzpg.zzF(zzqc.zzf(obj, j), zzqc.zzf(obj2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case SDK_ASSET_ICON_HOME_VALUE:
                    long jZzr = zzr(i) & 1048575;
                    if (zzqc.zzc(obj, jZzr) != zzqc.zzc(obj2, jZzr) || !zzpg.zzF(zzqc.zzf(obj, j), zzqc.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zZzF) {
                return false;
            }
        }
        if (!((zznl) obj).zzc.equals(((zznl) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzni) obj).zzb.equals(((zzni) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
    @Override // com.google.android.recaptcha.internal.zzpe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzl(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i3 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i6 = iArr[i3];
            int i7 = iArr2[i6];
            int iZzu = zzu(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i4 = zzb.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i5;
                i2 = i4;
            }
            Object obj2 = obj;
            if ((268435456 & iZzu) != 0 && !zzO(obj2, i6, i, i2, i10)) {
                return false;
            }
            int iZzt = zzt(iZzu);
            if (iZzt == 9 || iZzt == 17) {
                if (zzO(obj2, i6, i, i2, i10) && !zzP(obj2, iZzu, zzx(i6))) {
                    return false;
                }
            } else if (iZzt == 27) {
                List list = (List) zzqc.zzf(obj2, iZzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzpe zzpeVarZzx = zzx(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzpeVarZzx.zzl(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (iZzt == 60 || iZzt == 68) {
                if (zzR(obj2, i7, i6) && !zzP(obj2, iZzu, zzx(i6))) {
                    return false;
                }
            } else if (iZzt != 49) {
                if (iZzt == 50 && !((zzok) zzqc.zzf(obj2, iZzu & 1048575)).isEmpty()) {
                    throw null;
                }
            }
            i3++;
            obj = obj2;
            i5 = i;
            i4 = i2;
        }
        return !this.zzh || ((zzni) obj).zzb.zzk();
    }
}
