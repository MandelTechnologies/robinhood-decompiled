package com.robinhood.android.eventcontracts.sharedeventui.chart;

import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventChartLabel.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/sharedeventui/chart/EventChartLabelItem;", "", ResourceTypes.COLOR, "Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "name", "", "value", "<init>", "(Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;Ljava/lang/String;Ljava/lang/String;)V", "getColor", "()Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "getName", "()Ljava/lang/String;", "getValue", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-shared-event-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EventChartLabelItem {
    public static final int $stable = 0;
    private final DayNightColor color;
    private final String name;
    private final String value;

    public static /* synthetic */ EventChartLabelItem copy$default(EventChartLabelItem eventChartLabelItem, DayNightColor dayNightColor, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            dayNightColor = eventChartLabelItem.color;
        }
        if ((i & 2) != 0) {
            str = eventChartLabelItem.name;
        }
        if ((i & 4) != 0) {
            str2 = eventChartLabelItem.value;
        }
        return eventChartLabelItem.copy(dayNightColor, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final DayNightColor getColor() {
        return this.color;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final EventChartLabelItem copy(DayNightColor color, String name, String value) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(name, "name");
        return new EventChartLabelItem(color, name, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventChartLabelItem)) {
            return false;
        }
        EventChartLabelItem eventChartLabelItem = (EventChartLabelItem) other;
        return Intrinsics.areEqual(this.color, eventChartLabelItem.color) && Intrinsics.areEqual(this.name, eventChartLabelItem.name) && Intrinsics.areEqual(this.value, eventChartLabelItem.value);
    }

    public int hashCode() {
        int iHashCode = ((this.color.hashCode() * 31) + this.name.hashCode()) * 31;
        String str = this.value;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "EventChartLabelItem(color=" + this.color + ", name=" + this.name + ", value=" + this.value + ")";
    }

    public EventChartLabelItem(DayNightColor color, String name, String str) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(name, "name");
        this.color = color;
        this.name = name;
        this.value = str;
    }

    public final DayNightColor getColor() {
        return this.color;
    }

    public final String getName() {
        return this.name;
    }

    public final String getValue() {
        return this.value;
    }
}
