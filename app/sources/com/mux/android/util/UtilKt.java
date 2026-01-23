package com.mux.android.util;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Util.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a+\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u00028\u00002\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u00028\u00002\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001d\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Any", "", "these", "", "oneOf", "(Ljava/lang/Object;[Ljava/lang/Object;)Z", "noneOf", "", "px", "", "displayDensity", "convertPxToDp", "(IF)I", "mux-kt-utils_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class UtilKt {
    public static final <Any> boolean oneOf(Any any, Any... these) {
        Intrinsics.checkNotNullParameter(these, "these");
        return ArraysKt.contains(these, any);
    }

    public static final <Any> boolean noneOf(Any any, Any... these) {
        Intrinsics.checkNotNullParameter(these, "these");
        return !ArraysKt.contains(these, any);
    }

    public static final int convertPxToDp(int i, float f) {
        double dCeil;
        if (f < 0.75f) {
            dCeil = Math.ceil(i / 0.75f);
        } else {
            dCeil = Math.ceil(i / f);
        }
        return (int) dCeil;
    }
}
