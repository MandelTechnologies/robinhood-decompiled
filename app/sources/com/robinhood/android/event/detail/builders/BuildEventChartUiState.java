package com.robinhood.android.event.detail.builders;

import android.os.Parcelable;
import com.robinhood.android.event.detail.EventChartUiState;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.android.eventcontracts.sharedeventui.chart.EventChartColorOverlay;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.models.serverdriven.experimental.api.Point;
import kotlin.Metadata;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: BuildEventChartUiState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\\\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e\"\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"buildEventChartUiState", "Lcom/robinhood/android/event/detail/EventChartUiState;", "c1Color", "Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "c2Color", "c3Color", "c4Color", "c5Color", "chart", "Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "Landroid/os/Parcelable;", "chartActiveSpan", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "scrubbedPoint", "Lcom/robinhood/models/serverdriven/experimental/api/Point;", "eventChartDisplaySpans", "Lkotlinx/collections/immutable/PersistentList;", "feature-event-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.detail.builders.BuildEventChartUiStateKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class BuildEventChartUiState {
    private static final ImmutableList3<DisplaySpan> eventChartDisplaySpans = extensions2.persistentListOf(DisplaySpan.HOUR, DisplaySpan.DAY, DisplaySpan.WEEK, DisplaySpan.ALL);

    public static final EventChartUiState buildEventChartUiState(DayNightColor dayNightColor, DayNightColor dayNightColor2, DayNightColor dayNightColor3, DayNightColor dayNightColor4, DayNightColor dayNightColor5, Chart<? extends Parcelable> chart, DisplaySpan displaySpan, Point point) {
        return new EventChartUiState(chart, displaySpan, eventChartDisplaySpans, point, (dayNightColor == null || dayNightColor2 == null) ? null : new EventChartColorOverlay(dayNightColor, dayNightColor2, dayNightColor3, dayNightColor4, dayNightColor5));
    }
}
