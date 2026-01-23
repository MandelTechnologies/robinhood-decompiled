package com.robinhood.ticker;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes12.dex */
public class LevenshteinUtils {
    static final int ACTION_DELETE = 2;
    static final int ACTION_INSERT = 1;
    static final int ACTION_SAME = 0;

    public static int[] computeColumnActions(char[] cArr, char[] cArr2, Set<Character> set) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = i == cArr.length;
            boolean z2 = i2 == cArr2.length;
            if (z && z2) {
                break;
            }
            if (z) {
                fillWithActions(arrayList, cArr2.length - i2, 1);
                break;
            }
            if (z2) {
                fillWithActions(arrayList, cArr.length - i, 2);
                break;
            }
            boolean zContains = set.contains(Character.valueOf(cArr[i]));
            boolean zContains2 = set.contains(Character.valueOf(cArr2[i2]));
            if (zContains && zContains2) {
                int iFindNextUnsupportedChar = findNextUnsupportedChar(cArr, i + 1, set);
                int iFindNextUnsupportedChar2 = findNextUnsupportedChar(cArr2, i2 + 1, set);
                appendColumnActionsForSegment(arrayList, cArr, cArr2, i, iFindNextUnsupportedChar, i2, iFindNextUnsupportedChar2);
                i = iFindNextUnsupportedChar;
                i2 = iFindNextUnsupportedChar2;
            } else {
                if (zContains) {
                    arrayList.add(1);
                } else if (zContains2) {
                    arrayList.add(2);
                    i++;
                } else {
                    arrayList.add(0);
                    i++;
                }
                i2++;
            }
        }
        int[] iArr = new int[arrayList.size()];
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            iArr[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr;
    }

    private static int findNextUnsupportedChar(char[] cArr, int i, Set<Character> set) {
        while (i < cArr.length) {
            if (!set.contains(Character.valueOf(cArr[i]))) {
                return i;
            }
            i++;
        }
        return cArr.length;
    }

    private static void fillWithActions(List<Integer> list, int i, int i2) {
        for (int i3 = 0; i3 < i; i3++) {
            list.add(Integer.valueOf(i2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void appendColumnActionsForSegment(List<Integer> list, char[] cArr, char[] cArr2, int i, int i2, int i3, int i4) {
        char c = 2;
        int i5 = 1;
        int i6 = i2 - i;
        int i7 = i4 - i3;
        int iMax = Math.max(i6, i7);
        int i8 = 0;
        if (i6 == i7) {
            fillWithActions(list, iMax, 0);
            return;
        }
        int i9 = i6 + 1;
        int i10 = i7 + 1;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i9, i10);
        for (int i11 = 0; i11 < i9; i11++) {
            iArr[i11][0] = i11;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            iArr[0][i12] = i12;
        }
        for (int i13 = 1; i13 < i9; i13++) {
            int i14 = i5;
            while (i14 < i10) {
                int i15 = i13 - 1;
                int i16 = i14 - 1;
                char c2 = c;
                int i17 = cArr[i15 + i] == cArr2[i16 + i3] ? i8 : i5;
                int[] iArr2 = iArr[i13];
                int[] iArr3 = iArr[i15];
                iArr2[i14] = min(iArr3[i14] + 1, iArr2[i16] + 1, iArr3[i16] + i17);
                i14++;
                i8 = i8;
                c = c2;
                i5 = i5;
            }
        }
        int i18 = i8;
        ArrayList arrayList = new ArrayList(iMax * 2);
        while (true) {
            if (i6 <= 0 && i7 <= 0) {
                break;
            }
            if (i6 == 0) {
                arrayList.add(1);
            } else {
                if (i7 == 0) {
                    arrayList.add(2);
                } else {
                    int i19 = i7 - 1;
                    int i20 = iArr[i6][i19];
                    int[] iArr4 = iArr[i6 - 1];
                    int i21 = iArr4[i7];
                    int i22 = iArr4[i19];
                    if (i20 < i21 && i20 < i22) {
                        arrayList.add(1);
                    } else if (i21 < i22) {
                        arrayList.add(2);
                    } else {
                        arrayList.add(Integer.valueOf(i18));
                        i6--;
                    }
                }
                i6--;
            }
            i7--;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            list.add(arrayList.get(size));
        }
    }

    private static int min(int i, int i2, int i3) {
        return Math.min(i, Math.min(i2, i3));
    }
}
