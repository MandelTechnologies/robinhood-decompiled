package com.truelayer.payments.analytics.events;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnalyticsEvent.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/truelayer/payments/analytics/events/AnalyticsEvent;", "", "uid", "", "eventName", "", WebsocketGatewayConstants.DATA_KEY, "timestamp", "", "(ILjava/lang/String;Ljava/lang/String;J)V", "getData", "()Ljava/lang/String;", "getEventName", "getTimestamp", "()J", "getUid", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AnalyticsEvent {
    private final String data;
    private final String eventName;
    private final long timestamp;
    private final int uid;

    public static /* synthetic */ AnalyticsEvent copy$default(AnalyticsEvent analyticsEvent, int i, String str, String str2, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = analyticsEvent.uid;
        }
        if ((i2 & 2) != 0) {
            str = analyticsEvent.eventName;
        }
        if ((i2 & 4) != 0) {
            str2 = analyticsEvent.data;
        }
        if ((i2 & 8) != 0) {
            j = analyticsEvent.timestamp;
        }
        String str3 = str2;
        return analyticsEvent.copy(i, str, str3, j);
    }

    /* renamed from: component1, reason: from getter */
    public final int getUid() {
        return this.uid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getData() {
        return this.data;
    }

    /* renamed from: component4, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final AnalyticsEvent copy(int uid, String eventName, String data, long timestamp) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(data, "data");
        return new AnalyticsEvent(uid, eventName, data, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsEvent)) {
            return false;
        }
        AnalyticsEvent analyticsEvent = (AnalyticsEvent) other;
        return this.uid == analyticsEvent.uid && Intrinsics.areEqual(this.eventName, analyticsEvent.eventName) && Intrinsics.areEqual(this.data, analyticsEvent.data) && this.timestamp == analyticsEvent.timestamp;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.uid) * 31) + this.eventName.hashCode()) * 31) + this.data.hashCode()) * 31) + Long.hashCode(this.timestamp);
    }

    public String toString() {
        return "AnalyticsEvent(uid=" + this.uid + ", eventName=" + this.eventName + ", data=" + this.data + ", timestamp=" + this.timestamp + ")";
    }

    public AnalyticsEvent(int i, String eventName, String data, long j) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(data, "data");
        this.uid = i;
        this.eventName = eventName;
        this.data = data;
        this.timestamp = j;
    }

    public final int getUid() {
        return this.uid;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final String getData() {
        return this.data;
    }

    public /* synthetic */ AnalyticsEvent(int i, String str, String str2, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, str, str2, (i2 & 8) != 0 ? System.currentTimeMillis() : j);
    }

    public final long getTimestamp() {
        return this.timestamp;
    }
}
