package com.robinhood.android.shareholderexperience;

import com.robinhood.android.designsystem.timeline.RdsTimelineRowView;
import com.robinhood.android.shareholderexperience.eventinfo.TimelineRowItem;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.TimelineRow;
import com.robinhood.models.serverdriven.experimental.api.TimelineRowState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SduiExtensions.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001¨\u0006\u0005"}, m3636d2 = {"toViewItems", "", "Lcom/robinhood/android/shareholderexperience/eventinfo/TimelineRowItem;", "Lcom/robinhood/models/serverdriven/experimental/api/TimelineRow;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "feature-shareholder-experience_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.shareholderexperience.SduiExtensionsKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class SduiExtensions {

    /* compiled from: SduiExtensions.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.shareholderexperience.SduiExtensionsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimelineRowState.values().length];
            try {
                iArr[TimelineRowState.COMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimelineRowState.ONGOING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimelineRowState.INCOMPLETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TimelineRowState.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final List<TimelineRowItem> toViewItems(List<? extends TimelineRow<? extends GenericAction>> list) {
        RdsTimelineRowView.Position position;
        RdsTimelineRowView.State state;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<? extends TimelineRow<? extends GenericAction>> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            TimelineRow timelineRow = (TimelineRow) obj;
            if (i == 0) {
                position = RdsTimelineRowView.Position.TOP;
            } else {
                position = i == list.size() - 1 ? RdsTimelineRowView.Position.BOTTOM : RdsTimelineRowView.Position.BETWEEN;
            }
            int i3 = WhenMappings.$EnumSwitchMapping$0[timelineRow.getState().ordinal()];
            if (i3 == 1) {
                state = RdsTimelineRowView.State.COMPLETE;
            } else if (i3 == 2) {
                state = RdsTimelineRowView.State.IN_PROGRESS;
            } else if (i3 == 3) {
                state = RdsTimelineRowView.State.INCOMPLETE;
            } else {
                state = i3 != 4 ? null : RdsTimelineRowView.State.ERROR;
            }
            arrayList.add(new TimelineRowItem(timelineRow, position, state));
            i = i2;
        }
        return arrayList;
    }
}
