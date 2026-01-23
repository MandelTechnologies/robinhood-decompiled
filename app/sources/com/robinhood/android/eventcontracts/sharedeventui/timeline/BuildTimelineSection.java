package com.robinhood.android.eventcontracts.sharedeventui.timeline;

import com.robinhood.android.models.event.p186db.arsenal.EventTimeline;
import com.robinhood.android.models.event.p186db.arsenal.EventTimelineEntry;
import com.robinhood.compose.bento.component.rows.Timeline;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: BuildTimelineSection.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¨\u0006\u0005"}, m3636d2 = {"buildTimelineSection", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/eventcontracts/sharedeventui/timeline/EventTimelineRowData;", "timeline", "Lcom/robinhood/android/models/event/db/arsenal/EventTimeline;", "lib-shared-event-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.timeline.BuildTimelineSectionKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class BuildTimelineSection {
    public static final ImmutableList<EventTimelineRowData> buildTimelineSection(EventTimeline eventTimeline) {
        if (eventTimeline == null) {
            return null;
        }
        List<EventTimelineEntry> entries = eventTimeline.getEntries();
        List listEmptyList = CollectionsKt.emptyList();
        for (EventTimelineEntry eventTimelineEntry : entries) {
            EventTimelineRowData eventTimelineRowData = (EventTimelineRowData) CollectionsKt.lastOrNull(listEmptyList);
            listEmptyList = CollectionsKt.plus((Collection<? extends EventTimelineRowData>) listEmptyList, new EventTimelineRowData(eventTimelineRowData != null ? eventTimelineRowData.getStatus() : null, Timeline.Status.INCOMPLETE, eventTimelineEntry.getTitle(), eventTimelineEntry.getDescription()));
        }
        return extensions2.toPersistentList(listEmptyList);
    }
}
