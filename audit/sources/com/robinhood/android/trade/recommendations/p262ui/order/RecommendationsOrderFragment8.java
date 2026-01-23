package com.robinhood.android.trade.recommendations.p262ui.order;

import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendationsOrderFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderFragment$totalAdapter$1, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class RecommendationsOrderFragment8 extends FunctionReferenceImpl implements Function2<RecommendationsTotalRowView, Money, Unit> {
    public static final RecommendationsOrderFragment8 INSTANCE = new RecommendationsOrderFragment8();

    RecommendationsOrderFragment8() {
        super(2, RecommendationsTotalRowView.class, "bind", "bind(Lcom/robinhood/models/util/Money;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(RecommendationsTotalRowView recommendationsTotalRowView, Money money) {
        invoke2(recommendationsTotalRowView, money);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(RecommendationsTotalRowView p0, Money p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        p0.bind(p1);
    }
}
