package com.robinhood.android.crypto.p094ui.historicalchart.compat;

import com.robinhood.models.p355ui.GraphSelection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoHistoricalChartCompatComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.ui.historicalchart.compat.CryptoHistoricalChartCompatComposableKt$CryptoHistoricalChartCompatComposable$1$1$1$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class CryptoHistoricalChartCompatComposable2 extends FunctionReferenceImpl implements Function1<GraphSelection, Unit> {
    CryptoHistoricalChartCompatComposable2(Object obj) {
        super(1, obj, CryptoHistoricalChartCompatDuxo.class, "setGraphSelection", "setGraphSelection(Lcom/robinhood/models/ui/GraphSelection;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GraphSelection graphSelection) {
        invoke2(graphSelection);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(GraphSelection p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((CryptoHistoricalChartCompatDuxo) this.receiver).setGraphSelection(p0);
    }
}
