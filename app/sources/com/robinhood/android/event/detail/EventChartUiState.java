package com.robinhood.android.event.detail;

import android.os.Parcelable;
import com.robinhood.android.eventcontracts.sharedeventui.chart.EventChartColorOverlay;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.models.serverdriven.experimental.api.Point;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: EventDetailChartSection.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/event/detail/EventChartUiState;", "", "chart", "Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "Landroid/os/Parcelable;", "activeSpan", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "spans", "Lkotlinx/collections/immutable/ImmutableList;", "scrubbedPoint", "Lcom/robinhood/models/serverdriven/experimental/api/Point;", "colorOverlay", "Lcom/robinhood/android/eventcontracts/sharedeventui/chart/EventChartColorOverlay;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/Chart;Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/models/serverdriven/experimental/api/Point;Lcom/robinhood/android/eventcontracts/sharedeventui/chart/EventChartColorOverlay;)V", "getChart", "()Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "getActiveSpan", "()Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "getSpans", "()Lkotlinx/collections/immutable/ImmutableList;", "getScrubbedPoint", "()Lcom/robinhood/models/serverdriven/experimental/api/Point;", "getColorOverlay", "()Lcom/robinhood/android/eventcontracts/sharedeventui/chart/EventChartColorOverlay;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EventChartUiState {
    public static final int $stable = 8;
    private final DisplaySpan activeSpan;
    private final Chart<Parcelable> chart;
    private final EventChartColorOverlay colorOverlay;
    private final Point scrubbedPoint;
    private final ImmutableList<DisplaySpan> spans;

    public static /* synthetic */ EventChartUiState copy$default(EventChartUiState eventChartUiState, Chart chart, DisplaySpan displaySpan, ImmutableList immutableList, Point point, EventChartColorOverlay eventChartColorOverlay, int i, Object obj) {
        if ((i & 1) != 0) {
            chart = eventChartUiState.chart;
        }
        if ((i & 2) != 0) {
            displaySpan = eventChartUiState.activeSpan;
        }
        if ((i & 4) != 0) {
            immutableList = eventChartUiState.spans;
        }
        if ((i & 8) != 0) {
            point = eventChartUiState.scrubbedPoint;
        }
        if ((i & 16) != 0) {
            eventChartColorOverlay = eventChartUiState.colorOverlay;
        }
        EventChartColorOverlay eventChartColorOverlay2 = eventChartColorOverlay;
        ImmutableList immutableList2 = immutableList;
        return eventChartUiState.copy(chart, displaySpan, immutableList2, point, eventChartColorOverlay2);
    }

    public final Chart<Parcelable> component1() {
        return this.chart;
    }

    /* renamed from: component2, reason: from getter */
    public final DisplaySpan getActiveSpan() {
        return this.activeSpan;
    }

    public final ImmutableList<DisplaySpan> component3() {
        return this.spans;
    }

    /* renamed from: component4, reason: from getter */
    public final Point getScrubbedPoint() {
        return this.scrubbedPoint;
    }

    /* renamed from: component5, reason: from getter */
    public final EventChartColorOverlay getColorOverlay() {
        return this.colorOverlay;
    }

    public final EventChartUiState copy(Chart<? extends Parcelable> chart, DisplaySpan activeSpan, ImmutableList<? extends DisplaySpan> spans, Point scrubbedPoint, EventChartColorOverlay colorOverlay) {
        Intrinsics.checkNotNullParameter(spans, "spans");
        return new EventChartUiState(chart, activeSpan, spans, scrubbedPoint, colorOverlay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventChartUiState)) {
            return false;
        }
        EventChartUiState eventChartUiState = (EventChartUiState) other;
        return Intrinsics.areEqual(this.chart, eventChartUiState.chart) && this.activeSpan == eventChartUiState.activeSpan && Intrinsics.areEqual(this.spans, eventChartUiState.spans) && Intrinsics.areEqual(this.scrubbedPoint, eventChartUiState.scrubbedPoint) && Intrinsics.areEqual(this.colorOverlay, eventChartUiState.colorOverlay);
    }

    public int hashCode() {
        Chart<Parcelable> chart = this.chart;
        int iHashCode = (chart == null ? 0 : chart.hashCode()) * 31;
        DisplaySpan displaySpan = this.activeSpan;
        int iHashCode2 = (((iHashCode + (displaySpan == null ? 0 : displaySpan.hashCode())) * 31) + this.spans.hashCode()) * 31;
        Point point = this.scrubbedPoint;
        int iHashCode3 = (iHashCode2 + (point == null ? 0 : point.hashCode())) * 31;
        EventChartColorOverlay eventChartColorOverlay = this.colorOverlay;
        return iHashCode3 + (eventChartColorOverlay != null ? eventChartColorOverlay.hashCode() : 0);
    }

    public String toString() {
        return "EventChartUiState(chart=" + this.chart + ", activeSpan=" + this.activeSpan + ", spans=" + this.spans + ", scrubbedPoint=" + this.scrubbedPoint + ", colorOverlay=" + this.colorOverlay + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EventChartUiState(Chart<? extends Parcelable> chart, DisplaySpan displaySpan, ImmutableList<? extends DisplaySpan> spans, Point point, EventChartColorOverlay eventChartColorOverlay) {
        Intrinsics.checkNotNullParameter(spans, "spans");
        this.chart = chart;
        this.activeSpan = displaySpan;
        this.spans = spans;
        this.scrubbedPoint = point;
        this.colorOverlay = eventChartColorOverlay;
    }

    public final Chart<Parcelable> getChart() {
        return this.chart;
    }

    public final DisplaySpan getActiveSpan() {
        return this.activeSpan;
    }

    public final ImmutableList<DisplaySpan> getSpans() {
        return this.spans;
    }

    public final Point getScrubbedPoint() {
        return this.scrubbedPoint;
    }

    public final EventChartColorOverlay getColorOverlay() {
        return this.colorOverlay;
    }
}
