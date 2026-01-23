package com.robinhood.android.optionschain;

import com.robinhood.android.optionschain.strategybuilder.OptionStrategyBuilderAdapter2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionStrategyBuilderView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.OptionStrategyBuilderView$adapter$1, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class OptionStrategyBuilderView3 extends FunctionReferenceImpl implements Function1<OptionStrategyBuilderAdapter2.StrategyCardData, Unit> {
    OptionStrategyBuilderView3(Object obj) {
        super(1, obj, OptionStrategyBuilderView.class, "onCardClicked", "onCardClicked(Lcom/robinhood/android/optionschain/strategybuilder/BuilderData$StrategyCardData;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OptionStrategyBuilderAdapter2.StrategyCardData strategyCardData) {
        invoke2(strategyCardData);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(OptionStrategyBuilderAdapter2.StrategyCardData p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((OptionStrategyBuilderView) this.receiver).onCardClicked(p0);
    }
}
