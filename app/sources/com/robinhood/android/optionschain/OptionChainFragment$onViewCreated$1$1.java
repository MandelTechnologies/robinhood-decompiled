package com.robinhood.android.optionschain;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OptionChainFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class OptionChainFragment$onViewCreated$1$1 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
    OptionChainFragment$onViewCreated$1$1(Object obj) {
        super(1, obj, OptionChainDuxo.class, "setCurrentPage", "setCurrentPage(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        ((OptionChainDuxo) this.receiver).setCurrentPage(i);
    }
}
