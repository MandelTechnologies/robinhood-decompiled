package com.robinhood.android.futures.assethome.sections;

import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor2;
import com.robinhood.android.futures.charts.DisplaySpans;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.PerformanceChartContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Loggings.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0004H\u0002¨\u0006\u0007"}, m3636d2 = {"withChartContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "displaySpan", "", "toLoggingSpan", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$Span;", "feature-futures-asset-home_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.assethome.sections.LoggingsKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class Loggings2 {
    public static final Context withChartContext(Context context, String displaySpan) {
        Intrinsics.checkNotNullParameter(displaySpan, "displaySpan");
        return Context.copy$default(UserInteractionEventDescriptor2.orNew(context), 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new PerformanceChartContext(toLoggingSpan(displaySpan), PerformanceChartContext.ChartView.PERFORMANCE, PerformanceChartContext.ChartType.FUTURES, null, false, null, 56, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -129, -1, -1, 16383, null);
    }

    private static final PerformanceChartContext.Span toLoggingSpan(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 1596) {
            if (iHashCode != 1606) {
                if (iHashCode != 1608) {
                    if (iHashCode != 1658) {
                        if (iHashCode != 64897) {
                            if (iHashCode == 88201 && str.equals(DisplaySpans.YTD)) {
                                return PerformanceChartContext.Span.YTD;
                            }
                        } else if (str.equals(DisplaySpans.ALL)) {
                            return PerformanceChartContext.Span.ALL;
                        }
                    } else if (str.equals(DisplaySpans.THREE_MONTHS)) {
                        return PerformanceChartContext.Span.THREE_MONTHS;
                    }
                } else if (str.equals(DisplaySpans.YEAR)) {
                    return PerformanceChartContext.Span.ONE_YEAR;
                }
            } else if (str.equals(DisplaySpans.WEEK)) {
                return PerformanceChartContext.Span.ONE_WEEK;
            }
        } else if (str.equals(DisplaySpans.MONTH)) {
            return PerformanceChartContext.Span.ONE_MONTH;
        }
        return PerformanceChartContext.Span.UNKNOWN;
    }
}
