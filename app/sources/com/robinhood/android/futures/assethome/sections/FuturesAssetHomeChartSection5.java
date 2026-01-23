package com.robinhood.android.futures.assethome.sections;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: FuturesAssetHomeChartSection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartSectionKt$FuturesAssetHomeChartSectionContent$1$pnlEducationTourModifier$1$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class FuturesAssetHomeChartSection5 extends FunctionReferenceImpl implements Function0<Unit> {
    FuturesAssetHomeChartSection5(Object obj) {
        super(0, obj, FuturesAssetHomeChartDuxo2.class, "hideNetReturnsBottomSheet", "hideNetReturnsBottomSheet()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((FuturesAssetHomeChartDuxo2) this.receiver).hideNetReturnsBottomSheet();
    }
}
