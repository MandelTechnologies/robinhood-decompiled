package com.google.android.gms.internal.mlkit_common;

import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.mlkit:common@@18.11.0 */
/* loaded from: classes27.dex */
final class zzaq extends zzai {
    static final zzai zza = new zzaq(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzaq(Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d1  */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzaq zzg(int i, Object[] objArr, zzah zzahVar) {
        int iHighestOneBit;
        boolean z;
        int i2;
        char c;
        Object obj;
        char c2;
        short[] sArr;
        boolean z2;
        int i3;
        ?? r16;
        boolean z3;
        boolean z4;
        int i4 = i;
        Object[] objArrCopyOf = objArr;
        if (i4 == 0) {
            return (zzaq) zza;
        }
        Object obj2 = null;
        boolean z5 = false;
        int i5 = 1;
        if (i4 == 1) {
            Object obj3 = objArrCopyOf[0];
            Objects.requireNonNull(obj3);
            Object obj4 = objArrCopyOf[1];
            Objects.requireNonNull(obj4);
            zzw.zza(obj3, obj4);
            return new zzaq(null, objArrCopyOf, 1);
        }
        zzt.zzb(i4, objArrCopyOf.length >> 1, ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX);
        char c3 = 2;
        int iMax = Math.max(i4, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (iHighestOneBit * 0.7d < iMax);
        } else {
            iHighestOneBit = 1073741824;
            if (iMax >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i4 == 1) {
            Object obj5 = objArrCopyOf[0];
            Objects.requireNonNull(obj5);
            Object obj6 = objArrCopyOf[1];
            Objects.requireNonNull(obj6);
            zzw.zza(obj5, obj6);
            z4 = false;
            i4 = 1;
            i2 = 1;
        } else {
            int i6 = iHighestOneBit - 1;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i7 = 0;
                int i8 = 0;
                while (i7 < i4) {
                    int i9 = i8 + i8;
                    int i10 = i7 + i7;
                    Object obj7 = objArrCopyOf[i10];
                    Objects.requireNonNull(obj7);
                    Object obj8 = objArrCopyOf[i10 ^ i5];
                    Objects.requireNonNull(obj8);
                    zzw.zza(obj7, obj8);
                    int iZza = zzy.zza(obj7.hashCode());
                    while (true) {
                        int i11 = iZza & i6;
                        z2 = z5;
                        i3 = i5;
                        int i12 = bArr[i11] & 255;
                        if (i12 == 255) {
                            bArr[i11] = (byte) i9;
                            if (i8 < i7) {
                                objArrCopyOf[i9] = obj7;
                                objArrCopyOf[i9 ^ 1] = obj8;
                            }
                            i8++;
                        } else {
                            if (obj7.equals(objArrCopyOf[i12])) {
                                int i13 = i12 ^ 1;
                                Object obj9 = objArrCopyOf[i13];
                                Objects.requireNonNull(obj9);
                                zzag zzagVar = new zzag(obj7, obj8, obj9);
                                objArrCopyOf[i13] = obj8;
                                obj2 = zzagVar;
                                break;
                            }
                            iZza = i11 + 1;
                            z5 = z2;
                            i5 = i3;
                        }
                    }
                    i7++;
                    z5 = z2;
                    i5 = i3;
                }
                z = z5;
                i2 = i5;
                if (i8 == i4) {
                    c = 2;
                    obj = bArr;
                    r16 = z;
                    z3 = obj instanceof Object[];
                    Object obj10 = obj;
                    if (z3) {
                        Object[] objArr2 = (Object[]) obj;
                        zzag zzagVar2 = (zzag) objArr2[c];
                        if (zzahVar == null) {
                            throw zzagVar2.zza();
                        }
                        zzahVar.zzc = zzagVar2;
                        Object obj11 = objArr2[r16];
                        int iIntValue = ((Integer) objArr2[i2]).intValue();
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                        obj10 = obj11;
                        i4 = iIntValue;
                    }
                    return new zzaq(obj10, objArrCopyOf, i4);
                }
                sArr = new Object[3];
                sArr[z ? 1 : 0] = bArr;
                sArr[i2] = Integer.valueOf(i8);
                sArr[2] = obj2;
                obj2 = sArr;
                z4 = z;
            } else {
                z = false;
                i2 = 1;
                if (iHighestOneBit > 32768) {
                    int[] iArr = new int[iHighestOneBit];
                    Arrays.fill(iArr, -1);
                    int i14 = 0;
                    int i15 = 0;
                    while (i14 < i4) {
                        int i16 = i15 + i15;
                        int i17 = i14 + i14;
                        Object obj12 = objArrCopyOf[i17];
                        Objects.requireNonNull(obj12);
                        Object obj13 = objArrCopyOf[i17 ^ 1];
                        Objects.requireNonNull(obj13);
                        zzw.zza(obj12, obj13);
                        int iZza2 = zzy.zza(obj12.hashCode());
                        while (true) {
                            int i18 = iZza2 & i6;
                            int i19 = iArr[i18];
                            if (i19 == -1) {
                                iArr[i18] = i16;
                                if (i15 < i14) {
                                    objArrCopyOf[i16] = obj12;
                                    objArrCopyOf[i16 ^ 1] = obj13;
                                }
                                i15++;
                                c2 = c3;
                            } else {
                                c2 = c3;
                                if (obj12.equals(objArrCopyOf[i19])) {
                                    int i20 = i19 ^ 1;
                                    Object obj14 = objArrCopyOf[i20];
                                    Objects.requireNonNull(obj14);
                                    zzag zzagVar3 = new zzag(obj12, obj13, obj14);
                                    objArrCopyOf[i20] = obj13;
                                    obj2 = zzagVar3;
                                    break;
                                }
                                iZza2 = i18 + 1;
                                c3 = c2;
                            }
                        }
                        i14++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i15 == i4) {
                        obj = iArr;
                        r16 = z;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i15);
                        objArr3[c] = obj2;
                        obj = objArr3;
                        r16 = z;
                    }
                    z3 = obj instanceof Object[];
                    Object obj102 = obj;
                    if (z3) {
                    }
                    return new zzaq(obj102, objArrCopyOf, i4);
                }
                sArr = new short[iHighestOneBit];
                Arrays.fill(sArr, (short) -1);
                int i21 = 0;
                for (int i22 = 0; i22 < i4; i22++) {
                    int i23 = i21 + i21;
                    int i24 = i22 + i22;
                    Object obj15 = objArrCopyOf[i24];
                    Objects.requireNonNull(obj15);
                    Object obj16 = objArrCopyOf[i24 ^ 1];
                    Objects.requireNonNull(obj16);
                    zzw.zza(obj15, obj16);
                    int iZza3 = zzy.zza(obj15.hashCode());
                    while (true) {
                        int i25 = iZza3 & i6;
                        char c4 = (char) sArr[i25];
                        if (c4 == 65535) {
                            sArr[i25] = (short) i23;
                            if (i21 < i22) {
                                objArrCopyOf[i23] = obj15;
                                objArrCopyOf[i23 ^ 1] = obj16;
                            }
                            i21++;
                        } else {
                            if (obj15.equals(objArrCopyOf[c4])) {
                                int i26 = c4 ^ 1;
                                Object obj17 = objArrCopyOf[i26];
                                Objects.requireNonNull(obj17);
                                zzag zzagVar4 = new zzag(obj15, obj16, obj17);
                                objArrCopyOf[i26] = obj16;
                                obj2 = zzagVar4;
                                break;
                            }
                            iZza3 = i25 + 1;
                        }
                    }
                }
                if (i21 == i4) {
                    obj2 = sArr;
                    z4 = z;
                } else {
                    obj2 = new Object[]{sArr, Integer.valueOf(i21), obj2};
                    z4 = z;
                }
            }
        }
        c = 2;
        obj = obj2;
        r16 = z4;
        z3 = obj instanceof Object[];
        Object obj1022 = obj;
        if (z3) {
        }
        return new zzaq(obj1022, objArrCopyOf, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[EDGE_INSN: B:44:0x0003->B:4:0x0003 BREAK  A[LOOP:0: B:16:0x0038->B:22:0x004e], EDGE_INSN: B:46:0x0003->B:4:0x0003 BREAK  A[LOOP:1: B:26:0x0063->B:32:0x007a], EDGE_INSN: B:48:0x0003->B:4:0x0003 BREAK  A[LOOP:2: B:34:0x0089->B:43:0x00a0]] */
    @Override // com.google.android.gms.internal.mlkit_common.zzai, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i = this.zzd;
            Object[] objArr = this.zzb;
            if (i == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.zzc;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int iZza = zzy.zza(obj.hashCode());
                        while (true) {
                            int i2 = iZza & length;
                            int i3 = bArr[i2] & 255;
                            if (i3 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i3])) {
                                obj2 = objArr[i3 ^ 1];
                                break;
                            }
                            iZza = i2 + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int iZza2 = zzy.zza(obj.hashCode());
                        while (true) {
                            int i4 = iZza2 & length2;
                            char c = (char) sArr[i4];
                            if (c == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c])) {
                                obj2 = objArr[c ^ 1];
                                break;
                            }
                            iZza2 = i4 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int iZza3 = zzy.zza(obj.hashCode());
                        while (true) {
                            int i5 = iZza3 & length3;
                            int i6 = iArr[i5];
                            if (i6 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i6])) {
                                obj2 = objArr[i6 ^ 1];
                                break;
                            }
                            iZza3 = i5 + 1;
                        }
                    }
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzai
    final zzab zza() {
        return new zzap(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzai
    final zzaj zzd() {
        return new zzan(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzai
    final zzaj zze() {
        return new zzao(this, new zzap(this.zzb, 0, this.zzd));
    }
}
