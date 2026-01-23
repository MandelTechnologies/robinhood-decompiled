package com.robinhood.android.moria.p196db;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Query.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
/* synthetic */ class Query$Companion$create$1<T> extends FunctionReferenceImpl implements Function1<Flow<? extends T>, Flow<? extends T>> {
    public static final Query$Companion$create$1 INSTANCE = new Query$Companion$create$1();

    Query$Companion$create$1() {
        super(1, FlowKt.class, "filterNotNull", "filterNotNull(Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<T> invoke(Flow<? extends T> p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FlowKt.filterNotNull(p0);
    }
}
