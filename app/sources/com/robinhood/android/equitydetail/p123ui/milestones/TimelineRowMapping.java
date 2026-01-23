package com.robinhood.android.equitydetail.p123ui.milestones;

import com.robinhood.compose.bento.component.rows.Timeline;
import com.robinhood.models.serverdriven.p347db.TimelineRow;
import com.robinhood.utils.Preconditions;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TimelineRowMapping.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"toBentoTimelineRowPosition", "Lcom/robinhood/compose/bento/component/rows/Timeline$Position;", "Lcom/robinhood/models/serverdriven/db/TimelineRow$Position;", "toBentoTimelineRowStatus", "Lcom/robinhood/compose/bento/component/rows/Timeline$Status;", "Lcom/robinhood/models/serverdriven/db/TimelineRow$State;", "feature-equity-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.milestones.TimelineRowMappingKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class TimelineRowMapping {

    /* compiled from: TimelineRowMapping.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equitydetail.ui.milestones.TimelineRowMappingKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TimelineRow.Position.values().length];
            try {
                iArr[TimelineRow.Position.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimelineRow.Position.BETWEEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimelineRow.Position.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TimelineRow.State.values().length];
            try {
                iArr2[TimelineRow.State.COMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TimelineRow.State.ONGOING.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TimelineRow.State.INCOMPLETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[TimelineRow.State.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[TimelineRow.State.WARNING.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final Timeline.Position toBentoTimelineRowPosition(TimelineRow.Position position) {
        Intrinsics.checkNotNullParameter(position, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[position.ordinal()];
        if (i == 1) {
            return Timeline.Position.TOP;
        }
        if (i == 2) {
            return Timeline.Position.BETWEEN;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return Timeline.Position.BOTTOM;
    }

    public static final Timeline.Status toBentoTimelineRowStatus(TimelineRow.State state) {
        Intrinsics.checkNotNullParameter(state, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[state.ordinal()];
        if (i == 1) {
            return Timeline.Status.COMPLETE;
        }
        if (i == 2) {
            return Timeline.Status.ONGOING;
        }
        if (i == 3) {
            return Timeline.Status.INCOMPLETE;
        }
        if (i == 4) {
            return Timeline.Status.ERROR;
        }
        if (i == 5) {
            return Timeline.Status.WARNING;
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(state);
        throw new ExceptionsH();
    }
}
