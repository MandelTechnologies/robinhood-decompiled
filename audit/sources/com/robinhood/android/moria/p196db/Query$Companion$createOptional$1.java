package com.robinhood.android.moria.p196db;

import com.robinhood.coroutines.flow.Operators;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Query.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
/* synthetic */ class Query$Companion$createOptional$1<T> extends FunctionReferenceImpl implements Function1<Flow<? extends T>, Flow<? extends Optional<? extends T>>> {
    public static final Query$Companion$createOptional$1 INSTANCE = new Query$Companion$createOptional$1();

    Query$Companion$createOptional$1() {
        super(1, Operators.class, "toOptionals", "toOptionals(Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<Optional<T>> invoke(Flow<? extends T> p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Operators.toOptionals(p0);
    }
}
