package com.robinhood.librobinhood.data.store.identi;

import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: InvestmentProfileStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.identi.InvestmentProfileStore$streamQuestionnaireCompleted$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class InvestmentProfileStore8 extends FunctionReferenceImpl implements Function1<Tuples2<? extends String, ? extends String>, Flow<? extends Boolean>> {
    InvestmentProfileStore8(Object obj) {
        super(1, obj, InvestmentProfileStore.class, "getQuestionnaireCompletedFunction", "getQuestionnaireCompletedFunction(Lkotlin/Pair;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Flow<? extends Boolean> invoke(Tuples2<? extends String, ? extends String> tuples2) {
        return invoke2((Tuples2<String, String>) tuples2);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Flow<Boolean> invoke2(Tuples2<String, String> p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((InvestmentProfileStore) this.receiver).getQuestionnaireCompletedFunction(p0);
    }
}
