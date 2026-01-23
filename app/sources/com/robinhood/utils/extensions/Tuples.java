package com.robinhood.utils.extensions;

import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Tuples.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aJ\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u0006\u0010\u0006\u001a\u0002H\u0004H\u0086\u0002¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"plus", "Lkotlin/Triple;", "A", "B", "C", "Lkotlin/Pair;", "third", "(Lkotlin/Pair;Ljava/lang/Object;)Lkotlin/Triple;", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.TuplesKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Tuples {
    public static final <A, B, C> Tuples3<A, B, C> plus(Tuples2<? extends A, ? extends B> tuples2, C c) {
        Intrinsics.checkNotNullParameter(tuples2, "<this>");
        return new Tuples3<>(tuples2.getFirst(), tuples2.getSecond(), c);
    }
}
