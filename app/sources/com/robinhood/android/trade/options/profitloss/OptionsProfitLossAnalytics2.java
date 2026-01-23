package com.robinhood.android.trade.options.profitloss;

import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.trade.options.profitloss.OptionsProfitLossAnalytics2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: OptionsProfitLossAnalytics.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0001%JM\u0010\r\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\t*\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\t*\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\t*\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u0013\u0010\u0013\u001a\u00020\t*\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u0013\u0010\u0014\u001a\u00020\t*\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0010J\u0013\u0010\u0015\u001a\u00020\t*\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0010J\u0013\u0010\u0016\u001a\u00020\t*\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0010J\u0013\u0010\u0014\u001a\u00020\t*\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0017J\u0013\u0010\u0015\u001a\u00020\t*\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010$\u001a\u00020\u001f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossInfoBarAnalyticable;", "", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossInfoBar;", "Lcom/robinhood/analytics/AnalyticsLogger;", "analytics", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lkotlin/Function1;", "", "", "onChangeChartVisibility", "", "onError", "onInfoBarClickWithLogging", "(Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossInfoBar;Lcom/robinhood/analytics/AnalyticsLogger;Lcom/robinhood/analytics/EventLogger;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "logChartDisappear", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "logOptionsProfitLossAnalysisBtnAppear", "logOptionsProfitLossAnalysisBtnTap", "logOptionsProfitLossInfoBarAppear", "logOptionsProfitLossInfoBarExpand", "logOptionsProfitLossInfoBarCollapse", "logOptionsProfitLossInfoBarError", "(Lcom/robinhood/analytics/EventLogger;)V", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossInfoBarAnalyticable$Source;", "getSource", "()Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossInfoBarAnalyticable$Source;", "source", "getChartContainerVisibility", "()Z", "chartContainerVisibility", "j$/time/Instant", "getLastExpanded", "()Lj$/time/Instant;", "setLastExpanded", "(Lj$/time/Instant;)V", "lastExpanded", "Source", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.options.profitloss.OptionsProfitLossInfoBarAnalyticable, reason: use source file name */
/* loaded from: classes9.dex */
public interface OptionsProfitLossAnalytics2 {
    boolean getChartContainerVisibility();

    Instant getLastExpanded();

    Source getSource();

    void logChartDisappear(AnalyticsLogger analyticsLogger);

    void logOptionsProfitLossAnalysisBtnAppear(AnalyticsLogger analyticsLogger);

    void logOptionsProfitLossAnalysisBtnTap(AnalyticsLogger analyticsLogger);

    void logOptionsProfitLossInfoBarAppear(AnalyticsLogger analyticsLogger);

    void logOptionsProfitLossInfoBarCollapse(AnalyticsLogger analyticsLogger);

    void logOptionsProfitLossInfoBarCollapse(EventLogger eventLogger);

    void logOptionsProfitLossInfoBarError(AnalyticsLogger analyticsLogger);

    void logOptionsProfitLossInfoBarExpand(AnalyticsLogger analyticsLogger);

    void logOptionsProfitLossInfoBarExpand(EventLogger eventLogger);

    void onInfoBarClickWithLogging(OptionsProfitLossInfoBar optionsProfitLossInfoBar, AnalyticsLogger analyticsLogger, EventLogger eventLogger, Function1<? super Boolean, Unit> function1, Function1<? super Throwable, Unit> function12);

    void setLastExpanded(Instant instant);

    /* compiled from: OptionsProfitLossAnalytics.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.options.profitloss.OptionsProfitLossInfoBarAnalyticable$DefaultImpls */
    public static final class DefaultImpls {
        public static void onInfoBarClickWithLogging(final OptionsProfitLossAnalytics2 optionsProfitLossAnalytics2, OptionsProfitLossInfoBar receiver, final AnalyticsLogger analytics, final EventLogger eventLogger, final Function1<? super Boolean, Unit> onChangeChartVisibility, final Function1<? super Throwable, Unit> onError) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(onChangeChartVisibility, "onChangeChartVisibility");
            Intrinsics.checkNotNullParameter(onError, "onError");
            receiver.onInfoBarClick(new Function0() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossInfoBarAnalyticable$DefaultImpls$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OptionsProfitLossAnalytics2.DefaultImpls.onInfoBarClickWithLogging$lambda$0(onChangeChartVisibility, optionsProfitLossAnalytics2, analytics, eventLogger);
                }
            }, new Function1() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossInfoBarAnalyticable$DefaultImpls$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionsProfitLossAnalytics2.DefaultImpls.onInfoBarClickWithLogging$lambda$1(onError, optionsProfitLossAnalytics2, analytics, (Throwable) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Unit onInfoBarClickWithLogging$lambda$0(Function1 function1, OptionsProfitLossAnalytics2 optionsProfitLossAnalytics2, AnalyticsLogger analyticsLogger, EventLogger eventLogger) {
            function1.invoke(Boolean.valueOf(!optionsProfitLossAnalytics2.getChartContainerVisibility()));
            if (optionsProfitLossAnalytics2.getChartContainerVisibility()) {
                optionsProfitLossAnalytics2.logOptionsProfitLossInfoBarExpand(analyticsLogger);
                if (eventLogger != null) {
                    optionsProfitLossAnalytics2.logOptionsProfitLossInfoBarExpand(eventLogger);
                }
                Instant instantNow = Instant.now();
                Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
                optionsProfitLossAnalytics2.setLastExpanded(instantNow);
            } else {
                optionsProfitLossAnalytics2.logOptionsProfitLossInfoBarCollapse(analyticsLogger);
                if (eventLogger != null) {
                    optionsProfitLossAnalytics2.logOptionsProfitLossInfoBarCollapse(eventLogger);
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Unit onInfoBarClickWithLogging$lambda$1(Function1 function1, OptionsProfitLossAnalytics2 optionsProfitLossAnalytics2, AnalyticsLogger analyticsLogger, Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            function1.invoke(throwable);
            optionsProfitLossAnalytics2.logOptionsProfitLossInfoBarError(analyticsLogger);
            return Unit.INSTANCE;
        }

        public static void logChartDisappear(OptionsProfitLossAnalytics2 optionsProfitLossAnalytics2, AnalyticsLogger receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            receiver.buildEvent("screen_transition", AnalyticsStrings.SCREEN_TRANSITION_EVENT_DISAPPEAR).appendEventData("screen_name", AnalyticsStrings.BUTTON_GROUP_PROFIT_LOSS_CHART).appendEventData("time_spent", Long.valueOf(Instant.now().toEpochMilli() - optionsProfitLossAnalytics2.getLastExpanded().toEpochMilli())).send();
        }

        public static void logOptionsProfitLossAnalysisBtnAppear(OptionsProfitLossAnalytics2 optionsProfitLossAnalytics2, AnalyticsLogger receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(receiver, optionsProfitLossAnalytics2.getSource().getSmallScreenCtaAnalyticsString(), AnalyticsStrings.BUTTON_PROFIT_LOSS_ANALYSIS, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        }

        public static void logOptionsProfitLossAnalysisBtnTap(OptionsProfitLossAnalytics2 optionsProfitLossAnalytics2, AnalyticsLogger receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(receiver, optionsProfitLossAnalytics2.getSource().getSmallScreenCtaAnalyticsString(), AnalyticsStrings.BUTTON_PROFIT_LOSS_ANALYSIS, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        }

        public static void logOptionsProfitLossInfoBarAppear(OptionsProfitLossAnalytics2 optionsProfitLossAnalytics2, AnalyticsLogger receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(receiver, optionsProfitLossAnalytics2.getSource().getInfoBarAnalyticsString(), AnalyticsStrings.BUTTON_PROFIT_LOSS_INFO_BAR, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        }

        public static void logOptionsProfitLossInfoBarExpand(OptionsProfitLossAnalytics2 optionsProfitLossAnalytics2, AnalyticsLogger receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(receiver, optionsProfitLossAnalytics2.getSource().getInfoBarAnalyticsString(), AnalyticsStrings.BUTTON_PROFIT_LOSS_CHART_EXPAND, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        }

        public static void logOptionsProfitLossInfoBarCollapse(OptionsProfitLossAnalytics2 optionsProfitLossAnalytics2, AnalyticsLogger receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(receiver, optionsProfitLossAnalytics2.getSource().getInfoBarAnalyticsString(), AnalyticsStrings.BUTTON_PROFIT_LOSS_CHART_COLLAPSE, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        }

        public static void logOptionsProfitLossInfoBarError(OptionsProfitLossAnalytics2 optionsProfitLossAnalytics2, AnalyticsLogger receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(receiver, optionsProfitLossAnalytics2.getSource().getInfoBarAnalyticsString(), AnalyticsStrings.BUTTON_PROFIT_LOSS_INFO_BAR_ERROR, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        }

        public static void logOptionsProfitLossInfoBarExpand(OptionsProfitLossAnalytics2 optionsProfitLossAnalytics2, EventLogger receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            EventLogger.DefaultImpls.logTap$default(receiver, UserInteractionEventData.Action.EXPAND, new Screen(Screen.Name.OPTION_SHOPPING_CART, null, null, null, 14, null), new Component(Component.ComponentType.OPTION_PNL_CHART, null, null, 6, null), null, null, false, 56, null);
        }

        public static void logOptionsProfitLossInfoBarCollapse(OptionsProfitLossAnalytics2 optionsProfitLossAnalytics2, EventLogger receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            EventLogger.DefaultImpls.logTap$default(receiver, UserInteractionEventData.Action.COLLAPSE, new Screen(Screen.Name.OPTION_SHOPPING_CART, null, null, null, 14, null), new Component(Component.ComponentType.OPTION_PNL_CHART, null, null, 6, null), null, null, false, 56, null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OptionsProfitLossAnalytics.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossInfoBarAnalyticable$Source;", "", "smallScreenCtaAnalyticsString", "", "infoBarAnalyticsString", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getSmallScreenCtaAnalyticsString", "()Ljava/lang/String;", "getInfoBarAnalyticsString", "ORDER_FLOW", "SHOPPING_CART", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.options.profitloss.OptionsProfitLossInfoBarAnalyticable$Source */
    public static final class Source {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;
        public static final Source ORDER_FLOW = new Source("ORDER_FLOW", 0, AnalyticsStrings.BUTTON_GROUP_PROFIT_LOSS_ORDER_SMALL_SCREEN_CTA, AnalyticsStrings.BUTTON_GROUP_PROFIT_LOSS_ORDER_INFO_BAR);
        public static final Source SHOPPING_CART = new Source("SHOPPING_CART", 1, AnalyticsStrings.BUTTON_GROUP_PROFIT_LOSS_MULTILEG_SMALL_SCREEN_CTA, AnalyticsStrings.BUTTON_GROUP_PROFIT_LOSS_MULTILEG_INFO_BAR);
        private final String infoBarAnalyticsString;
        private final String smallScreenCtaAnalyticsString;

        private static final /* synthetic */ Source[] $values() {
            return new Source[]{ORDER_FLOW, SHOPPING_CART};
        }

        public static EnumEntries<Source> getEntries() {
            return $ENTRIES;
        }

        private Source(String str, int i, String str2, String str3) {
            this.smallScreenCtaAnalyticsString = str2;
            this.infoBarAnalyticsString = str3;
        }

        public final String getInfoBarAnalyticsString() {
            return this.infoBarAnalyticsString;
        }

        public final String getSmallScreenCtaAnalyticsString() {
            return this.smallScreenCtaAnalyticsString;
        }

        static {
            Source[] sourceArr$values = $values();
            $VALUES = sourceArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sourceArr$values);
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }
}
