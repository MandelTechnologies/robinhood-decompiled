package com.robinhood.android.serverclientcomponents.timeline;

import com.robinhood.android.designsystem.timeline.RdsTimelineRowView;
import com.robinhood.models.serverdriven.p347db.TimelineRow;
import com.robinhood.utils.Preconditions;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TimelineRows.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"toRdsTimelineRowViewState", "Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView$State;", "Lcom/robinhood/models/serverdriven/db/TimelineRow;", "toViewPosition", "Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView$Position;", "Lcom/robinhood/models/serverdriven/db/TimelineRow$Position;", "lib-server-client-components_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.serverclientcomponents.timeline.TimelineRowsKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class TimelineRows {

    /* compiled from: TimelineRows.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.serverclientcomponents.timeline.TimelineRowsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TimelineRow.State.values().length];
            try {
                iArr[TimelineRow.State.COMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimelineRow.State.ONGOING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimelineRow.State.INCOMPLETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TimelineRow.State.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TimelineRow.Position.values().length];
            try {
                iArr2[TimelineRow.Position.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TimelineRow.Position.BETWEEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[TimelineRow.Position.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final RdsTimelineRowView.State toRdsTimelineRowViewState(TimelineRow timelineRow) {
        Intrinsics.checkNotNullParameter(timelineRow, "<this>");
        if (timelineRow.getPrevRowState() == TimelineRow.State.ONGOING || (timelineRow.getPrevRowState() == TimelineRow.State.COMPLETE && timelineRow.getState() == TimelineRow.State.INCOMPLETE)) {
            return RdsTimelineRowView.State.NEXT;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[timelineRow.getState().ordinal()];
        if (i == 1) {
            return RdsTimelineRowView.State.COMPLETE;
        }
        if (i == 2) {
            return RdsTimelineRowView.State.IN_PROGRESS;
        }
        if (i == 3) {
            return RdsTimelineRowView.State.INCOMPLETE;
        }
        if (i == 4) {
            return RdsTimelineRowView.State.ERROR;
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(timelineRow.getState());
        throw new ExceptionsH();
    }

    public static final RdsTimelineRowView.Position toViewPosition(TimelineRow.Position position) {
        Intrinsics.checkNotNullParameter(position, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[position.ordinal()];
        if (i == 1) {
            return RdsTimelineRowView.Position.TOP;
        }
        if (i == 2) {
            return RdsTimelineRowView.Position.BETWEEN;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return RdsTimelineRowView.Position.BOTTOM;
    }
}
