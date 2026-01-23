package com.robinhood.android.equitydetail.p123ui;

import com.robinhood.android.equitydetail.p123ui.HeaderData;
import com.robinhood.models.api.bonfire.ApiStockDetail;
import com.robinhood.models.serverdriven.p347db.TimelineRow;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailData.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/MilestonesViewData;", "Lcom/robinhood/android/equitydetail/ui/DetailData;", "headerTitle", "", "timelineRows", "", "Lcom/robinhood/models/serverdriven/db/TimelineRow;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getHeaderTitle", "()Ljava/lang/String;", "getTimelineRows", "()Ljava/util/List;", "section", "Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "getSection", "()Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "headerData", "Lcom/robinhood/android/equitydetail/ui/HeaderData$FromCharSequence;", "getHeaderData", "()Lcom/robinhood/android/equitydetail/ui/HeaderData$FromCharSequence;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MilestonesViewData extends DetailData {
    public static final int $stable = 8;
    private final HeaderData.FromCharSequence headerData;
    private final String headerTitle;
    private final ApiStockDetail.Section section;
    private final List<TimelineRow> timelineRows;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MilestonesViewData copy$default(MilestonesViewData milestonesViewData, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = milestonesViewData.headerTitle;
        }
        if ((i & 2) != 0) {
            list = milestonesViewData.timelineRows;
        }
        return milestonesViewData.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getHeaderTitle() {
        return this.headerTitle;
    }

    public final List<TimelineRow> component2() {
        return this.timelineRows;
    }

    public final MilestonesViewData copy(String headerTitle, List<TimelineRow> timelineRows) {
        Intrinsics.checkNotNullParameter(headerTitle, "headerTitle");
        Intrinsics.checkNotNullParameter(timelineRows, "timelineRows");
        return new MilestonesViewData(headerTitle, timelineRows);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MilestonesViewData)) {
            return false;
        }
        MilestonesViewData milestonesViewData = (MilestonesViewData) other;
        return Intrinsics.areEqual(this.headerTitle, milestonesViewData.headerTitle) && Intrinsics.areEqual(this.timelineRows, milestonesViewData.timelineRows);
    }

    public int hashCode() {
        return (this.headerTitle.hashCode() * 31) + this.timelineRows.hashCode();
    }

    public String toString() {
        return "MilestonesViewData(headerTitle=" + this.headerTitle + ", timelineRows=" + this.timelineRows + ")";
    }

    public final String getHeaderTitle() {
        return this.headerTitle;
    }

    public final List<TimelineRow> getTimelineRows() {
        return this.timelineRows;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MilestonesViewData(String headerTitle, List<TimelineRow> timelineRows) {
        super(null);
        Intrinsics.checkNotNullParameter(headerTitle, "headerTitle");
        Intrinsics.checkNotNullParameter(timelineRows, "timelineRows");
        this.headerTitle = headerTitle;
        this.timelineRows = timelineRows;
        this.section = ApiStockDetail.Section.MILESTONES;
        this.headerData = new HeaderData.FromCharSequence(headerTitle, getSection(), null, 4, null);
    }

    @Override // com.robinhood.android.equitydetail.p123ui.DetailData
    public ApiStockDetail.Section getSection() {
        return this.section;
    }

    @Override // com.robinhood.android.equitydetail.p123ui.DetailData
    public HeaderData.FromCharSequence getHeaderData() {
        return this.headerData;
    }
}
