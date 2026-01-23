package com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline;

import com.robinhood.android.designsystem.timeline.RdsTimelineRowView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DepositScheduleTimelineViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/TimelineRowAdapterItem;", "", "primaryText", "", "metaDataText", "timestampText", "state", "Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView$State;", "position", "Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView$Position;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView$State;Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView$Position;)V", "getPrimaryText", "()Ljava/lang/String;", "getMetaDataText", "getTimestampText", "getState", "()Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView$State;", "getPosition", "()Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView$Position;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TimelineRowAdapterItem {
    public static final int $stable = 0;
    private final String metaDataText;
    private final RdsTimelineRowView.Position position;
    private final String primaryText;
    private final RdsTimelineRowView.State state;
    private final String timestampText;

    public static /* synthetic */ TimelineRowAdapterItem copy$default(TimelineRowAdapterItem timelineRowAdapterItem, String str, String str2, String str3, RdsTimelineRowView.State state, RdsTimelineRowView.Position position, int i, Object obj) {
        if ((i & 1) != 0) {
            str = timelineRowAdapterItem.primaryText;
        }
        if ((i & 2) != 0) {
            str2 = timelineRowAdapterItem.metaDataText;
        }
        if ((i & 4) != 0) {
            str3 = timelineRowAdapterItem.timestampText;
        }
        if ((i & 8) != 0) {
            state = timelineRowAdapterItem.state;
        }
        if ((i & 16) != 0) {
            position = timelineRowAdapterItem.position;
        }
        RdsTimelineRowView.Position position2 = position;
        String str4 = str3;
        return timelineRowAdapterItem.copy(str, str2, str4, state, position2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPrimaryText() {
        return this.primaryText;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMetaDataText() {
        return this.metaDataText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTimestampText() {
        return this.timestampText;
    }

    /* renamed from: component4, reason: from getter */
    public final RdsTimelineRowView.State getState() {
        return this.state;
    }

    /* renamed from: component5, reason: from getter */
    public final RdsTimelineRowView.Position getPosition() {
        return this.position;
    }

    public final TimelineRowAdapterItem copy(String primaryText, String metaDataText, String timestampText, RdsTimelineRowView.State state, RdsTimelineRowView.Position position) {
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(timestampText, "timestampText");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(position, "position");
        return new TimelineRowAdapterItem(primaryText, metaDataText, timestampText, state, position);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimelineRowAdapterItem)) {
            return false;
        }
        TimelineRowAdapterItem timelineRowAdapterItem = (TimelineRowAdapterItem) other;
        return Intrinsics.areEqual(this.primaryText, timelineRowAdapterItem.primaryText) && Intrinsics.areEqual(this.metaDataText, timelineRowAdapterItem.metaDataText) && Intrinsics.areEqual(this.timestampText, timelineRowAdapterItem.timestampText) && this.state == timelineRowAdapterItem.state && this.position == timelineRowAdapterItem.position;
    }

    public int hashCode() {
        int iHashCode = this.primaryText.hashCode() * 31;
        String str = this.metaDataText;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.timestampText.hashCode()) * 31) + this.state.hashCode()) * 31) + this.position.hashCode();
    }

    public String toString() {
        return "TimelineRowAdapterItem(primaryText=" + this.primaryText + ", metaDataText=" + this.metaDataText + ", timestampText=" + this.timestampText + ", state=" + this.state + ", position=" + this.position + ")";
    }

    public TimelineRowAdapterItem(String primaryText, String str, String timestampText, RdsTimelineRowView.State state, RdsTimelineRowView.Position position) {
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(timestampText, "timestampText");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(position, "position");
        this.primaryText = primaryText;
        this.metaDataText = str;
        this.timestampText = timestampText;
        this.state = state;
        this.position = position;
    }

    public final String getPrimaryText() {
        return this.primaryText;
    }

    public final String getMetaDataText() {
        return this.metaDataText;
    }

    public final String getTimestampText() {
        return this.timestampText;
    }

    public final RdsTimelineRowView.State getState() {
        return this.state;
    }

    public final RdsTimelineRowView.Position getPosition() {
        return this.position;
    }
}
