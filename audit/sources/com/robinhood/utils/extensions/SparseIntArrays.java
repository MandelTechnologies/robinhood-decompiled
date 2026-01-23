package com.robinhood.utils.extensions;

import android.util.SparseIntArray;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SparseIntArrays.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\n\u001aH\u0010\u0006\u001a\u00020\u0001*\u00020\u000226\u0010\u0007\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00010\bH\u0086\bø\u0001\u0000\u001a\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, m3636d2 = {"set", "", "Landroid/util/SparseIntArray;", "key", "", "value", "forEach", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "getOrNull", "(Landroid/util/SparseIntArray;I)Ljava/lang/Integer;", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.SparseIntArraysKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class SparseIntArrays {
    public static final void set(SparseIntArray sparseIntArray, int i, int i2) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        sparseIntArray.put(i, i2);
    }

    public static final void forEach(SparseIntArray sparseIntArray, Function2<? super Integer, ? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int size = sparseIntArray.size();
        for (int i = 0; i < size; i++) {
            action.invoke(Integer.valueOf(sparseIntArray.keyAt(i)), Integer.valueOf(sparseIntArray.valueAt(i)));
        }
    }

    public static final Integer getOrNull(SparseIntArray sparseIntArray, int i) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        int iIndexOfKey = sparseIntArray.indexOfKey(i);
        if (iIndexOfKey < 0) {
            return null;
        }
        return Integer.valueOf(sparseIntArray.get(iIndexOfKey));
    }
}
