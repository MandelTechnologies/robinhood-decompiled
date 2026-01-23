package com.robinhood.utils.extensions;

import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Pairs.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00020\u0003¨\u0006\u0004"}, m3636d2 = {"asList", "", "E", "Lkotlin/Pair;", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.PairsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Pairs {
    public static final <E> List<E> asList(Tuples2<? extends E, ? extends E> tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<this>");
        return CollectionsKt.listOf(tuples2.getFirst(), tuples2.getSecond());
    }
}
