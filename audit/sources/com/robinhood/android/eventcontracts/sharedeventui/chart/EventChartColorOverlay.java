package com.robinhood.android.eventcontracts.sharedeventui.chart;

import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventChartColorOverlay.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/sharedeventui/chart/EventChartColorOverlay;", "", "c1ThemedColor", "Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "c2ThemedColor", "c3ThemedColor", "c4ThemedColor", "c5ThemedColor", "<init>", "(Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;)V", "getC1ThemedColor", "()Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "getC2ThemedColor", "getC3ThemedColor", "getC4ThemedColor", "getC5ThemedColor", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-shared-event-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EventChartColorOverlay {
    public static final int $stable = 0;
    private final DayNightColor c1ThemedColor;
    private final DayNightColor c2ThemedColor;
    private final DayNightColor c3ThemedColor;
    private final DayNightColor c4ThemedColor;
    private final DayNightColor c5ThemedColor;

    public EventChartColorOverlay() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ EventChartColorOverlay copy$default(EventChartColorOverlay eventChartColorOverlay, DayNightColor dayNightColor, DayNightColor dayNightColor2, DayNightColor dayNightColor3, DayNightColor dayNightColor4, DayNightColor dayNightColor5, int i, Object obj) {
        if ((i & 1) != 0) {
            dayNightColor = eventChartColorOverlay.c1ThemedColor;
        }
        if ((i & 2) != 0) {
            dayNightColor2 = eventChartColorOverlay.c2ThemedColor;
        }
        if ((i & 4) != 0) {
            dayNightColor3 = eventChartColorOverlay.c3ThemedColor;
        }
        if ((i & 8) != 0) {
            dayNightColor4 = eventChartColorOverlay.c4ThemedColor;
        }
        if ((i & 16) != 0) {
            dayNightColor5 = eventChartColorOverlay.c5ThemedColor;
        }
        DayNightColor dayNightColor6 = dayNightColor5;
        DayNightColor dayNightColor7 = dayNightColor3;
        return eventChartColorOverlay.copy(dayNightColor, dayNightColor2, dayNightColor7, dayNightColor4, dayNightColor6);
    }

    /* renamed from: component1, reason: from getter */
    public final DayNightColor getC1ThemedColor() {
        return this.c1ThemedColor;
    }

    /* renamed from: component2, reason: from getter */
    public final DayNightColor getC2ThemedColor() {
        return this.c2ThemedColor;
    }

    /* renamed from: component3, reason: from getter */
    public final DayNightColor getC3ThemedColor() {
        return this.c3ThemedColor;
    }

    /* renamed from: component4, reason: from getter */
    public final DayNightColor getC4ThemedColor() {
        return this.c4ThemedColor;
    }

    /* renamed from: component5, reason: from getter */
    public final DayNightColor getC5ThemedColor() {
        return this.c5ThemedColor;
    }

    public final EventChartColorOverlay copy(DayNightColor c1ThemedColor, DayNightColor c2ThemedColor, DayNightColor c3ThemedColor, DayNightColor c4ThemedColor, DayNightColor c5ThemedColor) {
        return new EventChartColorOverlay(c1ThemedColor, c2ThemedColor, c3ThemedColor, c4ThemedColor, c5ThemedColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventChartColorOverlay)) {
            return false;
        }
        EventChartColorOverlay eventChartColorOverlay = (EventChartColorOverlay) other;
        return Intrinsics.areEqual(this.c1ThemedColor, eventChartColorOverlay.c1ThemedColor) && Intrinsics.areEqual(this.c2ThemedColor, eventChartColorOverlay.c2ThemedColor) && Intrinsics.areEqual(this.c3ThemedColor, eventChartColorOverlay.c3ThemedColor) && Intrinsics.areEqual(this.c4ThemedColor, eventChartColorOverlay.c4ThemedColor) && Intrinsics.areEqual(this.c5ThemedColor, eventChartColorOverlay.c5ThemedColor);
    }

    public int hashCode() {
        DayNightColor dayNightColor = this.c1ThemedColor;
        int iHashCode = (dayNightColor == null ? 0 : dayNightColor.hashCode()) * 31;
        DayNightColor dayNightColor2 = this.c2ThemedColor;
        int iHashCode2 = (iHashCode + (dayNightColor2 == null ? 0 : dayNightColor2.hashCode())) * 31;
        DayNightColor dayNightColor3 = this.c3ThemedColor;
        int iHashCode3 = (iHashCode2 + (dayNightColor3 == null ? 0 : dayNightColor3.hashCode())) * 31;
        DayNightColor dayNightColor4 = this.c4ThemedColor;
        int iHashCode4 = (iHashCode3 + (dayNightColor4 == null ? 0 : dayNightColor4.hashCode())) * 31;
        DayNightColor dayNightColor5 = this.c5ThemedColor;
        return iHashCode4 + (dayNightColor5 != null ? dayNightColor5.hashCode() : 0);
    }

    public String toString() {
        return "EventChartColorOverlay(c1ThemedColor=" + this.c1ThemedColor + ", c2ThemedColor=" + this.c2ThemedColor + ", c3ThemedColor=" + this.c3ThemedColor + ", c4ThemedColor=" + this.c4ThemedColor + ", c5ThemedColor=" + this.c5ThemedColor + ")";
    }

    public EventChartColorOverlay(DayNightColor dayNightColor, DayNightColor dayNightColor2, DayNightColor dayNightColor3, DayNightColor dayNightColor4, DayNightColor dayNightColor5) {
        this.c1ThemedColor = dayNightColor;
        this.c2ThemedColor = dayNightColor2;
        this.c3ThemedColor = dayNightColor3;
        this.c4ThemedColor = dayNightColor4;
        this.c5ThemedColor = dayNightColor5;
    }

    public /* synthetic */ EventChartColorOverlay(DayNightColor dayNightColor, DayNightColor dayNightColor2, DayNightColor dayNightColor3, DayNightColor dayNightColor4, DayNightColor dayNightColor5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : dayNightColor, (i & 2) != 0 ? null : dayNightColor2, (i & 4) != 0 ? null : dayNightColor3, (i & 8) != 0 ? null : dayNightColor4, (i & 16) != 0 ? null : dayNightColor5);
    }

    public final DayNightColor getC1ThemedColor() {
        return this.c1ThemedColor;
    }

    public final DayNightColor getC2ThemedColor() {
        return this.c2ThemedColor;
    }

    public final DayNightColor getC3ThemedColor() {
        return this.c3ThemedColor;
    }

    public final DayNightColor getC4ThemedColor() {
        return this.c4ThemedColor;
    }

    public final DayNightColor getC5ThemedColor() {
        return this.c5ThemedColor;
    }
}
