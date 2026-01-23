package com.robinhood.android.trade.options.profitloss;

import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsProfitLossAnalytics.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0004"}, m3636d2 = {"logOptionsProfitLossLearnMoreTap", "", "Lcom/robinhood/analytics/AnalyticsLogger;", "logOptionsProfitLossChartFirstScrub", "feature-options-pl-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.options.profitloss.OptionsProfitLossAnalyticsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class OptionsProfitLossAnalytics {
    public static final void logOptionsProfitLossLearnMoreTap(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<this>");
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(analyticsLogger, AnalyticsStrings.BUTTON_GROUP_PROFIT_LOSS_CHART, AnalyticsStrings.BUTTON_PROFIT_LOSS_CHART_LEARN_MORE, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
    }

    public static final void logOptionsProfitLossChartFirstScrub(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<this>");
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(analyticsLogger, AnalyticsStrings.BUTTON_GROUP_PROFIT_LOSS_CHART, AnalyticsStrings.BUTTON_PROFIT_LOSS_CHART_FIRST_SCRUB, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
    }
}
