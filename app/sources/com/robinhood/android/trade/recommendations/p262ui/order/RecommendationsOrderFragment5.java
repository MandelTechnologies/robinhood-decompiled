package com.robinhood.android.trade.recommendations.p262ui.order;

import com.robinhood.recommendations.models.p363ui.UiRecommendationsCheckoutReview;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendationsOrderFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderFragment$nbboAdapter$1, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class RecommendationsOrderFragment5 extends FunctionReferenceImpl implements Function2<RecommendationsNbboRowView, UiRecommendationsCheckoutReview.OrderEntryRow, Unit> {
    public static final RecommendationsOrderFragment5 INSTANCE = new RecommendationsOrderFragment5();

    RecommendationsOrderFragment5() {
        super(2, RecommendationsNbboRowView.class, "bind", "bind(Lcom/robinhood/recommendations/models/ui/UiRecommendationsCheckoutReview$OrderEntryRow;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(RecommendationsNbboRowView recommendationsNbboRowView, UiRecommendationsCheckoutReview.OrderEntryRow orderEntryRow) {
        invoke2(recommendationsNbboRowView, orderEntryRow);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(RecommendationsNbboRowView p0, UiRecommendationsCheckoutReview.OrderEntryRow p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        p0.bind(p1);
    }
}
