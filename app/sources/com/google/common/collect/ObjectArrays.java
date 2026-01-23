package com.google.common.collect;

/* loaded from: classes.dex */
public final class ObjectArrays {
    public static <T> T[] newArray(T[] tArr, int i) {
        return (T[]) Platform.newArray(tArr, i);
    }

    static Object[] checkElementsNotNull(Object... array2) {
        checkElementsNotNull(array2, array2.length);
        return array2;
    }

    static Object[] checkElementsNotNull(Object[] array2, int length) {
        for (int i = 0; i < length; i++) {
            checkElementNotNull(array2[i], i);
        }
        return array2;
    }

    static Object checkElementNotNull(Object element, int index) {
        if (element != null) {
            return element;
        }
        throw new NullPointerException("at index " + index);
    }
}
