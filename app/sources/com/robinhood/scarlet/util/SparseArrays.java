package com.robinhood.scarlet.util;

import android.util.SparseArray;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SparseArrays.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003¨\u0006\u0005"}, m3636d2 = {"deepEquals", "", "T", "Landroid/util/SparseArray;", "other", "lib-scarlet_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.scarlet.util.SparseArraysKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class SparseArrays {
    public static final <T> boolean deepEquals(SparseArray<T> sparseArray, SparseArray<T> other) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (Intrinsics.areEqual(sparseArray, other)) {
            return true;
        }
        if (sparseArray.size() != other.size()) {
            return false;
        }
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            if (sparseArray.keyAt(i) != other.keyAt(i) || !Intrinsics.areEqual(sparseArray.valueAt(i), other.valueAt(i))) {
                return false;
            }
        }
        return true;
    }
}
