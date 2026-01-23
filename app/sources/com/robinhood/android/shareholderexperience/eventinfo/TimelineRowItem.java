package com.robinhood.android.shareholderexperience.eventinfo;

import com.robinhood.android.designsystem.timeline.RdsTimelineRowView;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.TimelineRow;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TimelineRowItem.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/eventinfo/TimelineRowItem;", "", "row", "Lcom/robinhood/models/serverdriven/experimental/api/TimelineRow;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "position", "Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView$Position;", "viewState", "Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView$State;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/TimelineRow;Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView$Position;Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView$State;)V", "getRow", "()Lcom/robinhood/models/serverdriven/experimental/api/TimelineRow;", "getPosition", "()Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView$Position;", "getViewState", "()Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView$State;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TimelineRowItem {
    public static final int $stable = 8;
    private final RdsTimelineRowView.Position position;
    private final TimelineRow<GenericAction> row;
    private final RdsTimelineRowView.State viewState;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TimelineRowItem copy$default(TimelineRowItem timelineRowItem, TimelineRow timelineRow, RdsTimelineRowView.Position position, RdsTimelineRowView.State state, int i, Object obj) {
        if ((i & 1) != 0) {
            timelineRow = timelineRowItem.row;
        }
        if ((i & 2) != 0) {
            position = timelineRowItem.position;
        }
        if ((i & 4) != 0) {
            state = timelineRowItem.viewState;
        }
        return timelineRowItem.copy(timelineRow, position, state);
    }

    public final TimelineRow<GenericAction> component1() {
        return this.row;
    }

    /* renamed from: component2, reason: from getter */
    public final RdsTimelineRowView.Position getPosition() {
        return this.position;
    }

    /* renamed from: component3, reason: from getter */
    public final RdsTimelineRowView.State getViewState() {
        return this.viewState;
    }

    public final TimelineRowItem copy(TimelineRow<? extends GenericAction> row, RdsTimelineRowView.Position position, RdsTimelineRowView.State viewState) {
        Intrinsics.checkNotNullParameter(row, "row");
        Intrinsics.checkNotNullParameter(position, "position");
        return new TimelineRowItem(row, position, viewState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimelineRowItem)) {
            return false;
        }
        TimelineRowItem timelineRowItem = (TimelineRowItem) other;
        return Intrinsics.areEqual(this.row, timelineRowItem.row) && this.position == timelineRowItem.position && this.viewState == timelineRowItem.viewState;
    }

    public int hashCode() {
        int iHashCode = ((this.row.hashCode() * 31) + this.position.hashCode()) * 31;
        RdsTimelineRowView.State state = this.viewState;
        return iHashCode + (state == null ? 0 : state.hashCode());
    }

    public String toString() {
        return "TimelineRowItem(row=" + this.row + ", position=" + this.position + ", viewState=" + this.viewState + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TimelineRowItem(TimelineRow<? extends GenericAction> row, RdsTimelineRowView.Position position, RdsTimelineRowView.State state) {
        Intrinsics.checkNotNullParameter(row, "row");
        Intrinsics.checkNotNullParameter(position, "position");
        this.row = row;
        this.position = position;
        this.viewState = state;
    }

    public final TimelineRow<GenericAction> getRow() {
        return this.row;
    }

    public final RdsTimelineRowView.Position getPosition() {
        return this.position;
    }

    public final RdsTimelineRowView.State getViewState() {
        return this.viewState;
    }
}
