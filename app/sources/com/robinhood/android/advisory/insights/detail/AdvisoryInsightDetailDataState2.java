package com.robinhood.android.advisory.insights.detail;

import com.robinhood.models.advisory.p304db.insights.AdvisoryInsight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryInsightDetailDataState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"computeNavButtons", "Lcom/robinhood/android/advisory/insights/detail/NavButtonsVisibility;", "Lcom/robinhood/android/advisory/insights/detail/AdvisoryInsightDetailDataState;", "feature-advisory-insights_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDataStateKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdvisoryInsightDetailDataState2 {
    public static final NavButtonsVisibility computeNavButtons(AdvisoryInsightDetailDataState advisoryInsightDetailDataState) {
        Intrinsics.checkNotNullParameter(advisoryInsightDetailDataState, "<this>");
        AdvisoryInsight insight = advisoryInsightDetailDataState.getInsight();
        boolean z = (insight != null ? insight.getPageType() : null) == AdvisoryInsight.PageType.MULTI_PAGE_CHILD;
        return new NavButtonsVisibility((z && advisoryInsightDetailDataState.getCurrentMultiPageIndex() > 0) || advisoryInsightDetailDataState.getPrevInsightNavArg() != null, (z && advisoryInsightDetailDataState.getCurrentMultiPageIndex() < advisoryInsightDetailDataState.getTotalMultiPageCount() - 1) || advisoryInsightDetailDataState.getNextInsightNavArg() != null);
    }
}
