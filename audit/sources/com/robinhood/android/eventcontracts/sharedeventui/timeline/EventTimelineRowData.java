package com.robinhood.android.eventcontracts.sharedeventui.timeline;

import com.robinhood.compose.bento.component.rows.Timeline;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventTimelineSection.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/sharedeventui/timeline/EventTimelineRowData;", "", "prevStatus", "Lcom/robinhood/compose/bento/component/rows/Timeline$Status;", "status", "title", "", "description", "<init>", "(Lcom/robinhood/compose/bento/component/rows/Timeline$Status;Lcom/robinhood/compose/bento/component/rows/Timeline$Status;Ljava/lang/String;Ljava/lang/String;)V", "getPrevStatus", "()Lcom/robinhood/compose/bento/component/rows/Timeline$Status;", "getStatus", "getTitle", "()Ljava/lang/String;", "getDescription", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-shared-event-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EventTimelineRowData {
    public static final int $stable = 0;
    private final String description;
    private final Timeline.Status prevStatus;
    private final Timeline.Status status;
    private final String title;

    public static /* synthetic */ EventTimelineRowData copy$default(EventTimelineRowData eventTimelineRowData, Timeline.Status status, Timeline.Status status2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            status = eventTimelineRowData.prevStatus;
        }
        if ((i & 2) != 0) {
            status2 = eventTimelineRowData.status;
        }
        if ((i & 4) != 0) {
            str = eventTimelineRowData.title;
        }
        if ((i & 8) != 0) {
            str2 = eventTimelineRowData.description;
        }
        return eventTimelineRowData.copy(status, status2, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final Timeline.Status getPrevStatus() {
        return this.prevStatus;
    }

    /* renamed from: component2, reason: from getter */
    public final Timeline.Status getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final EventTimelineRowData copy(Timeline.Status prevStatus, Timeline.Status status, String title, String description) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        return new EventTimelineRowData(prevStatus, status, title, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventTimelineRowData)) {
            return false;
        }
        EventTimelineRowData eventTimelineRowData = (EventTimelineRowData) other;
        return this.prevStatus == eventTimelineRowData.prevStatus && this.status == eventTimelineRowData.status && Intrinsics.areEqual(this.title, eventTimelineRowData.title) && Intrinsics.areEqual(this.description, eventTimelineRowData.description);
    }

    public int hashCode() {
        Timeline.Status status = this.prevStatus;
        return ((((((status == null ? 0 : status.hashCode()) * 31) + this.status.hashCode()) * 31) + this.title.hashCode()) * 31) + this.description.hashCode();
    }

    public String toString() {
        return "EventTimelineRowData(prevStatus=" + this.prevStatus + ", status=" + this.status + ", title=" + this.title + ", description=" + this.description + ")";
    }

    public EventTimelineRowData(Timeline.Status status, Timeline.Status status2, String title, String description) {
        Intrinsics.checkNotNullParameter(status2, "status");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.prevStatus = status;
        this.status = status2;
        this.title = title;
        this.description = description;
    }

    public final Timeline.Status getPrevStatus() {
        return this.prevStatus;
    }

    public final Timeline.Status getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }
}
