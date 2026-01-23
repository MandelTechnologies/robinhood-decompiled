package com.robinhood.android.crypto.p094ui.historicalchart;

import com.robinhood.models.serverdriven.experimental.api.Point;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CryptoHistoricalChartComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartComposableKt$CryptoHistoricalChartComposable$5$1, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class CryptoHistoricalChartComposable5 extends FunctionReferenceImpl implements Function1<Point, Unit> {
    CryptoHistoricalChartComposable5(Object obj) {
        super(1, obj, CryptoHistoricalChartDuxo.class, "onScrub", "onScrub$feature_crypto_externalDebug(Lcom/robinhood/models/serverdriven/experimental/api/Point;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Point point) {
        invoke2(point);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Point point) {
        ((CryptoHistoricalChartDuxo) this.receiver).onScrub$feature_crypto_externalDebug(point);
    }
}
