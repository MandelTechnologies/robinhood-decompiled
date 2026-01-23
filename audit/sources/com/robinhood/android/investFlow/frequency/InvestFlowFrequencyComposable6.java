package com.robinhood.android.investFlow.frequency;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: InvestFlowFrequencyComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investFlow.frequency.InvestFlowFrequencyComposableKt$InvestFlowFrequencyContent$1$1$1$1$1$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class InvestFlowFrequencyComposable6 extends FunctionReferenceImpl implements Function1<LocalDate, Unit> {
    InvestFlowFrequencyComposable6(Object obj) {
        super(1, obj, InvestFlowFrequencyComposable3.class, "onDateClicked", "onDateClicked(Ljava/time/LocalDate;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LocalDate localDate) {
        invoke2(localDate);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LocalDate p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((InvestFlowFrequencyComposable3) this.receiver).onDateClicked(p0);
    }
}
