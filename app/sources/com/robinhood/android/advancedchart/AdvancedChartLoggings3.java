package com.robinhood.android.advancedchart;

import com.robinhood.analytics.EventLogger;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.rosetta.eventlogging.AdvancedChartsAboutContext;
import com.robinhood.rosetta.eventlogging.AdvancedChartsContext;
import com.robinhood.rosetta.eventlogging.Boolean;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.TechnicalIndicatorContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicator;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedChartLoggings.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001a\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\r\u001a\u0012\u0010\u000e\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\r\u001a\u0012\u0010\u000f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\r\u001a\u001c\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\t\u001a\u0012\u0010\u0014\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016\u001a\u0012\u0010\u0017\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016\u001a\u0012\u0010\u0018\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002\u001a\f\u0010\u001d\u001a\u00020\u001e*\u00020\u001cH\u0002\u001a\f\u0010\u001f\u001a\u00020 *\u00020!H\u0002\u001a\f\u0010\"\u001a\u00020#*\u00020$H\u0002¨\u0006%"}, m3636d2 = {"logAdvancedChartAppear", "", "Lcom/robinhood/analytics/EventLogger;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/advancedchart/AdvancedChartAnalyticsCommonData;", "logAdvancedChartDisappear", "logAdvancedChartSpanTapped", "logAdvancedChartTechnicalIndicatorPillTapped", "indicatorTitle", "", "logEnterScrubbingMode", "logExitScrubbingMode", "logNewIndicatorAdded", "Lcom/robinhood/android/advancedchart/AdvancedChartIndicatorsAnalyticsCommonData;", "logEditExistingIndicator", "logIndicatorRemoved", "logIndicatorUpdateError", "instrumentId", "Ljava/util/UUID;", "personalInformationFreeLog", "logAdvancedChartOnboardingAppear", "sourceType", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsAboutContext$SourceType;", "logAdvancedChartOnboardingDisappear", "logAdvancedChartZoom", "getChartType", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContext$ChartType;", "isCandlestick", "", "toAnalyticsBoolean", "Lcom/robinhood/rosetta/eventlogging/Boolean;", "toAnalyticsSpan", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContext$Span;", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "toAnalyticsType", "Lcom/robinhood/rosetta/eventlogging/TechnicalIndicatorContext$IndicatorType;", "Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator$Type;", "feature-advanced-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advancedchart.AdvancedChartLoggingsKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AdvancedChartLoggings3 {

    /* compiled from: AdvancedChartLoggings.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advancedchart.AdvancedChartLoggingsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DisplaySpan.values().length];
            try {
                iArr[DisplaySpan.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DisplaySpan.WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DisplaySpan.MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DisplaySpan.f93673MONTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DisplaySpan.YTD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DisplaySpan.YEAR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DisplaySpan.f93695YEAR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DisplaySpan.ALL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DisplaySpan.HOUR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[DisplaySpan.f93684HOUR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[DisplaySpan.CORTEX_INSIGHTS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[DisplaySpan.UNKNOWN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiTechnicalIndicator.Type.values().length];
            try {
                iArr2[ApiTechnicalIndicator.Type.SMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[ApiTechnicalIndicator.Type.EMA.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[ApiTechnicalIndicator.Type.RSI.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[ApiTechnicalIndicator.Type.VWAP.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[ApiTechnicalIndicator.Type.MACD.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[ApiTechnicalIndicator.Type.BOLL.ordinal()] = 6;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[ApiTechnicalIndicator.Type.DEPTH.ordinal()] = 7;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[ApiTechnicalIndicator.Type.ORDER.ordinal()] = 8;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[ApiTechnicalIndicator.Type.UNKNOWN.ordinal()] = 9;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void logAdvancedChartAppear(EventLogger eventLogger, AdvancedChartAnalyticsCommonData data) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        EventLogger.DefaultImpls.logAppear$default(eventLogger, UserInteractionEventData.Action.VIEW_ADVANCED_CHARTS, data.getAnalyticsScreen(), null, null, data.getAnalyticsContext(), 12, null);
    }

    public static final void logAdvancedChartDisappear(EventLogger eventLogger, AdvancedChartAnalyticsCommonData data) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        EventLogger.DefaultImpls.logDisappear$default(eventLogger, UserInteractionEventData.Action.VIEW_ADVANCED_CHARTS, data.getAnalyticsScreen(), null, null, data.getAnalyticsContext(), 12, null);
    }

    public static final void logAdvancedChartSpanTapped(EventLogger eventLogger, AdvancedChartAnalyticsCommonData data) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.CHANGE_CHART_SPAN, data.getAnalyticsScreen(), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, data.getAnalyticsContext(), false, 40, null);
    }

    public static final void logAdvancedChartTechnicalIndicatorPillTapped(EventLogger eventLogger, String indicatorTitle, AdvancedChartAnalyticsCommonData data) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(indicatorTitle, "indicatorTitle");
        Intrinsics.checkNotNullParameter(data, "data");
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, data.getAnalyticsScreen(), new Component(Component.ComponentType.BUTTON, indicatorTitle, null, 4, null), null, data.getAnalyticsContext(), false, 41, null);
    }

    public static final void logEnterScrubbingMode(EventLogger eventLogger, AdvancedChartAnalyticsCommonData data) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        EventLogger.DefaultImpls.logDrag$default(eventLogger, UserInteractionEventData.Action.SCRUB, data.getAnalyticsScreen(), null, null, data.getAnalyticsContext(), false, 44, null);
    }

    public static final void logExitScrubbingMode(EventLogger eventLogger, AdvancedChartAnalyticsCommonData data) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.REMOVE_SCRUB, data.getAnalyticsScreen(), null, null, data.getAnalyticsContext(), false, 44, null);
    }

    public static final void logNewIndicatorAdded(EventLogger eventLogger, AdvancedChartIndicatorsAnalyticsCommonData data) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.CREATE_INDICATOR, data.getAnalyticsScreen(), null, null, data.getAnalyticsContext(), false, 44, null);
    }

    public static final void logEditExistingIndicator(EventLogger eventLogger, AdvancedChartIndicatorsAnalyticsCommonData data) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.EDIT_INDICATOR, data.getAnalyticsScreen(), null, null, data.getAnalyticsContext(), false, 44, null);
    }

    public static final void logIndicatorRemoved(EventLogger eventLogger, AdvancedChartIndicatorsAnalyticsCommonData data) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.REMOVE_INDICATOR, data.getAnalyticsScreen(), null, null, data.getAnalyticsContext(), false, 44, null);
    }

    public static /* synthetic */ void logIndicatorUpdateError$default(EventLogger eventLogger, UUID uuid, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        logIndicatorUpdateError(eventLogger, uuid, str);
    }

    public static final void logIndicatorUpdateError(EventLogger eventLogger, UUID instrumentId, String personalInformationFreeLog) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(personalInformationFreeLog, "personalInformationFreeLog");
        Screen.Name name = Screen.Name.EQUITY_ADVANCED_CHARTS;
        String string2 = instrumentId.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        EventLogger.DefaultImpls.logErrorEvent$default(eventLogger, null, new Screen(name, null, string2, null, 10, null), null, null, null, personalInformationFreeLog, null, 29, null);
    }

    public static final void logAdvancedChartOnboardingAppear(EventLogger eventLogger, AdvancedChartsAboutContext.SourceType sourceType) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        EventLogger.DefaultImpls.logAppear$default(eventLogger, null, new Screen(Screen.Name.ADVANCED_CHARTS_ONBOARDING, null, null, null, 14, null), null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new AdvancedChartsAboutContext(sourceType, null, 2, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -33554433, -1, -1, -1, 16383, null), 13, null);
    }

    public static final void logAdvancedChartOnboardingDisappear(EventLogger eventLogger, AdvancedChartsAboutContext.SourceType sourceType) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        EventLogger.DefaultImpls.logDisappear$default(eventLogger, null, new Screen(Screen.Name.ADVANCED_CHARTS_ONBOARDING, null, null, null, 14, null), null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new AdvancedChartsAboutContext(sourceType, null, 2, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -33554433, -1, -1, -1, 16383, null), 13, null);
    }

    public static final void logAdvancedChartZoom(EventLogger eventLogger, AdvancedChartAnalyticsCommonData data) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        EventLogger.DefaultImpls.logDrag$default(eventLogger, UserInteractionEventData.Action.ZOOM, data.getAnalyticsScreen(), new Component(Component.ComponentType.ADVANCED_CHART, null, null, 6, null), null, data.getAnalyticsContext(), false, 40, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdvancedChartsContext.ChartType getChartType(boolean z) {
        if (z) {
            return AdvancedChartsContext.ChartType.CANDLESTICK;
        }
        return AdvancedChartsContext.ChartType.LINE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean toAnalyticsBoolean(boolean z) {
        return z ? Boolean.TRUE : Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdvancedChartsContext.Span toAnalyticsSpan(DisplaySpan displaySpan) {
        switch (WhenMappings.$EnumSwitchMapping$0[displaySpan.ordinal()]) {
            case 1:
                return AdvancedChartsContext.Span.ONE_DAY;
            case 2:
                return AdvancedChartsContext.Span.ONE_WEEK;
            case 3:
                return AdvancedChartsContext.Span.ONE_MONTH;
            case 4:
                return AdvancedChartsContext.Span.THREE_MONTHS;
            case 5:
                return AdvancedChartsContext.Span.YEAR_TO_DATE;
            case 6:
                return AdvancedChartsContext.Span.ONE_YEAR;
            case 7:
                return AdvancedChartsContext.Span.FIVE_YEAR;
            case 8:
                return AdvancedChartsContext.Span.ALL;
            case 9:
                throw new IllegalStateException((displaySpan + " is not an option on the time interval bar").toString());
            case 10:
                throw new IllegalStateException((displaySpan + " is not an option on the time interval bar").toString());
            case 11:
                throw new IllegalStateException((displaySpan + " is not an option on the time interval bar").toString());
            case 12:
                throw new IllegalStateException((displaySpan + " is not an option on the time interval bar").toString());
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TechnicalIndicatorContext.IndicatorType toAnalyticsType(ApiTechnicalIndicator.Type type2) {
        switch (WhenMappings.$EnumSwitchMapping$1[type2.ordinal()]) {
            case 1:
                return TechnicalIndicatorContext.IndicatorType.SMA;
            case 2:
                return TechnicalIndicatorContext.IndicatorType.EMA;
            case 3:
                return TechnicalIndicatorContext.IndicatorType.RSI;
            case 4:
                return TechnicalIndicatorContext.IndicatorType.VWAP;
            case 5:
                return TechnicalIndicatorContext.IndicatorType.MACD;
            case 6:
                return TechnicalIndicatorContext.IndicatorType.BOLLINGER_BANDS;
            case 7:
            case 8:
            case 9:
                return TechnicalIndicatorContext.IndicatorType.INDICATOR_TYPE_UNSPECIFIED;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
