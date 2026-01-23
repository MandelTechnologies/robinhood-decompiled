package com.robinhood.android.equityscreener.filters;

import com.robinhood.models.serverdriven.experimental.api.ScreenerFilter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndicatorFilterFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equityscreener.filters.IndicatorFilterFragment$ComposeContent$3$1$2$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class IndicatorFilterFragment3 extends FunctionReferenceImpl implements Function1<ScreenerFilter, Unit> {
    IndicatorFilterFragment3(Object obj) {
        super(1, obj, IndicatorFilterFragment.class, "onSelectFilterUpdated", "onSelectFilterUpdated(Lcom/robinhood/models/serverdriven/experimental/api/ScreenerFilter;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ScreenerFilter screenerFilter) {
        invoke2(screenerFilter);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ScreenerFilter p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((IndicatorFilterFragment) this.receiver).onSelectFilterUpdated(p0);
    }
}
