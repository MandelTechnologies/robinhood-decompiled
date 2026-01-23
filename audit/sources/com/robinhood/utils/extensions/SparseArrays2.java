package com.robinhood.utils.extensions;

import android.os.Build;
import android.util.SparseArray;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;

/* compiled from: SparseArrays.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a7\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0006H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a!\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0002\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\u0002H\u0086\b\u001a\u0016\u0010\r\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002\u001a/\u0010\u000f\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0001*\f\u0012\u0006\b\u0001\u0012\u0002H\u0001\u0018\u00010\u00022\u0010\u0010\u0011\u001a\f\u0012\u0006\b\u0001\u0012\u0002H\u0001\u0018\u00010\u0002H\u0086\u0004\u001a\u000e\u0010\u0012\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0002\"\"\u0010\t\u001a\u00020\n\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, m3636d2 = {"getOrPut", "E", "Landroid/util/SparseArray;", "key", "", "defaultValue", "Lkotlin/Function0;", "(Landroid/util/SparseArray;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "orEmpty", "indices", "Lkotlin/ranges/IntRange;", "getIndices", "(Landroid/util/SparseArray;)Lkotlin/ranges/IntRange;", "keysToIntArray", "", "contentEqualsCompat", "", "other", "contentHashCodeCompat", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.extensions.SparseArraysKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class SparseArrays2 {
    public static final <E> E getOrPut(SparseArray<E> sparseArray, int i, Function0<? extends E> defaultValue) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        E e = sparseArray.get(i);
        if (e != null) {
            return e;
        }
        E eInvoke = defaultValue.invoke();
        sparseArray.put(i, eInvoke);
        return eInvoke;
    }

    public static final <E> PrimitiveRanges2 getIndices(SparseArray<E> sparseArray) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        return RangesKt.until(0, sparseArray.size());
    }

    public static final <E> int[] keysToIntArray(SparseArray<E> sparseArray) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        int size = sparseArray.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = sparseArray.keyAt(i);
        }
        return iArr;
    }

    public static final <E> SparseArray<E> orEmpty(SparseArray<E> sparseArray) {
        return sparseArray == null ? new SparseArray<>() : sparseArray;
    }

    public static final <E> boolean contentEqualsCompat(SparseArray<? extends E> sparseArray, SparseArray<? extends E> sparseArray2) {
        if (sparseArray == sparseArray2) {
            return true;
        }
        if (sparseArray == null || sparseArray2 == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return sparseArray.contentEquals(sparseArray2);
        }
        if (!Intrinsics.areEqual(sparseArray.getClass(), sparseArray2.getClass()) || sparseArray.size() != sparseArray2.size()) {
            return false;
        }
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            if (!Intrinsics.areEqual(sparseArray.valueAt(i), sparseArray2.get(sparseArray.keyAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public static final int contentHashCodeCompat(SparseArray<?> sparseArray) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return sparseArray.contentHashCode();
        }
        int size = sparseArray.size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            Object objValueAt = sparseArray.valueAt(i);
            iHashCode = (((iHashCode * 31) + Integer.hashCode(iKeyAt)) * 31) + (objValueAt != null ? objValueAt.hashCode() : 0);
        }
        return iHashCode;
    }
}
