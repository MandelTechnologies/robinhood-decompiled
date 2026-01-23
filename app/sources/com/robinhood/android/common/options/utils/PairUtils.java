package com.robinhood.android.common.options.utils;

import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PairUtils.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a4\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u0001¨\u0006\u0004"}, m3636d2 = {"toNullable", "Lkotlin/Pair;", "T", "P", "feature-lib-options_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.options.utils.PairUtilsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class PairUtils {
    public static final <T, P> Tuples2<T, P> toNullable(Tuples2<? extends T, ? extends P> tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<this>");
        T first = tuples2.getFirst();
        P second = tuples2.getSecond();
        if (first == null || second == null) {
            return null;
        }
        return Tuples4.m3642to(first, second);
    }
}
