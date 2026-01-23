package com.robinhood.android.rosetta.portfolio;

import com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo;
import com.robinhood.android.models.portfolio.PerformanceChartSpanOption;
import com.robinhood.android.models.portfolio.api.PerformanceChartStyle;
import com.robinhood.android.models.portfolio.api.PerformanceChartType;
import com.robinhood.models.api.pathfinder.userview.ApiRenderablePlatforms;
import com.robinhood.rosetta.eventlogging.PerformanceChartContext;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PerformanceChartContextExt.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\u000e\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r\"\u0015\u0010\u0003\u001a\u00020\u0004*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0015\u0010\u0003\u001a\u00020\b*\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\n¨\u0006\u000e"}, m3636d2 = {"toContextType", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$Span;", "Lcom/robinhood/android/models/portfolio/PerformanceChartSpanOption;", "contextType", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$ChartView;", "Lcom/robinhood/android/models/portfolio/api/PerformanceChartStyle;", "getContextType", "(Lcom/robinhood/android/models/portfolio/api/PerformanceChartStyle;)Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$ChartView;", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$ChartType;", "Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;", "(Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;)Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$ChartType;", "spanQueryStringToContextType", "spanString", "", "lib-models-portfolio_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rosetta.portfolio.PerformanceChartContextExtKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class PerformanceChartContextExt {

    /* compiled from: PerformanceChartContextExt.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rosetta.portfolio.PerformanceChartContextExtKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[PerformanceChartSpanOption.values().length];
            try {
                iArr[PerformanceChartSpanOption.LIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PerformanceChartSpanOption.ONE_DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PerformanceChartSpanOption.ONE_WEEK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PerformanceChartSpanOption.ONE_MONTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PerformanceChartSpanOption.THREE_MONTHS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PerformanceChartSpanOption.YTD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PerformanceChartSpanOption.ONE_YEAR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PerformanceChartSpanOption.ALL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PerformanceChartStyle.values().length];
            try {
                iArr2[PerformanceChartStyle.PERFORMANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[PerformanceChartStyle.CONTRIBUTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[PerformanceChartStyle.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[PerformanceChartType.values().length];
            try {
                iArr3[PerformanceChartType.HISTORICAL_PORTFOLIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[PerformanceChartType.CRYPTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[PerformanceChartType.OPTIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[PerformanceChartType.EQUITY.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[PerformanceChartType.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final PerformanceChartContext.Span toContextType(PerformanceChartSpanOption performanceChartSpanOption) {
        switch (performanceChartSpanOption == null ? -1 : WhenMappings.$EnumSwitchMapping$0[performanceChartSpanOption.ordinal()]) {
            case -1:
                return PerformanceChartContext.Span.SPAN_UNSPECIFIED;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return PerformanceChartContext.Span.LIVE;
            case 2:
                return PerformanceChartContext.Span.ONE_DAY;
            case 3:
                return PerformanceChartContext.Span.ONE_WEEK;
            case 4:
                return PerformanceChartContext.Span.ONE_MONTH;
            case 5:
                return PerformanceChartContext.Span.THREE_MONTHS;
            case 6:
                return PerformanceChartContext.Span.YTD;
            case 7:
                return PerformanceChartContext.Span.ONE_YEAR;
            case 8:
                return PerformanceChartContext.Span.ALL;
        }
    }

    public static final PerformanceChartContext.ChartView getContextType(PerformanceChartStyle performanceChartStyle) {
        Intrinsics.checkNotNullParameter(performanceChartStyle, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[performanceChartStyle.ordinal()];
        if (i == 1) {
            return PerformanceChartContext.ChartView.PERFORMANCE;
        }
        if (i == 2) {
            return PerformanceChartContext.ChartView.CONTRIBUTION;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return PerformanceChartContext.ChartView.CHART_VIEW_UNSPECIFIED;
    }

    public static final PerformanceChartContext.ChartType getContextType(PerformanceChartType performanceChartType) {
        Intrinsics.checkNotNullParameter(performanceChartType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$2[performanceChartType.ordinal()];
        if (i == 1) {
            return PerformanceChartContext.ChartType.EQUITY;
        }
        if (i == 2) {
            return PerformanceChartContext.ChartType.CRYPTO;
        }
        if (i == 3) {
            return PerformanceChartContext.ChartType.OPTIONS;
        }
        if (i == 4) {
            return PerformanceChartContext.ChartType.EQUITY;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return PerformanceChartContext.ChartType.CHART_TYPE_UNSPECIFIED;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static final PerformanceChartContext.Span spanQueryStringToContextType(String spanString) {
        Intrinsics.checkNotNullParameter(spanString, "spanString");
        switch (spanString.hashCode()) {
            case 96673:
                if (spanString.equals(ApiRenderablePlatforms.VERSIONS_ALL)) {
                    return PerformanceChartContext.Span.ALL;
                }
                break;
            case 99228:
                if (spanString.equals("day")) {
                    return PerformanceChartContext.Span.ONE_DAY;
                }
                break;
            case 119977:
                if (spanString.equals("ytd")) {
                    return PerformanceChartContext.Span.YTD;
                }
                break;
            case 3208676:
                if (spanString.equals("hour")) {
                    return PerformanceChartContext.Span.LIVE;
                }
                break;
            case 3645428:
                if (spanString.equals("week")) {
                    return PerformanceChartContext.Span.ONE_WEEK;
                }
                break;
            case 3704893:
                if (spanString.equals("year")) {
                    return PerformanceChartContext.Span.ONE_YEAR;
                }
                break;
            case 104080000:
                if (spanString.equals(ManagedDashboardOverviewDuxo.DEFAULT_SPAN_RETURNS)) {
                    return PerformanceChartContext.Span.ONE_MONTH;
                }
                break;
            case 1564166701:
                if (spanString.equals("3month")) {
                    return PerformanceChartContext.Span.THREE_MONTHS;
                }
                break;
        }
        return PerformanceChartContext.Span.SPAN_UNSPECIFIED;
    }
}
