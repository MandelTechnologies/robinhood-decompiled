package com.robinhood.android.history.p153ui.acats;

import com.robinhood.models.acats.p299db.bonfire.AcatsDetailPageResponse;
import com.robinhood.models.acats.p299db.bonfire.AcatsTransfer;
import com.robinhood.models.serverdriven.p347db.TimelineRow;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsDetailDataState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/history/ui/acats/AcatsDetailDataState;", "", "detailPageResponse", "Lcom/robinhood/models/acats/db/bonfire/AcatsDetailPageResponse;", "acatsTransfer", "Lcom/robinhood/models/acats/db/bonfire/AcatsTransfer;", "<init>", "(Lcom/robinhood/models/acats/db/bonfire/AcatsDetailPageResponse;Lcom/robinhood/models/acats/db/bonfire/AcatsTransfer;)V", "getDetailPageResponse", "()Lcom/robinhood/models/acats/db/bonfire/AcatsDetailPageResponse;", "getAcatsTransfer", "()Lcom/robinhood/models/acats/db/bonfire/AcatsTransfer;", "timelineRows", "", "Lcom/robinhood/models/serverdriven/db/TimelineRow;", "getTimelineRows", "()Ljava/util/List;", "showHelpIcon", "", "getShowHelpIcon", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AcatsDetailDataState {
    public static final int $stable = 8;
    private final AcatsTransfer acatsTransfer;
    private final AcatsDetailPageResponse detailPageResponse;
    private final boolean showHelpIcon;
    private final List<TimelineRow> timelineRows;

    /* JADX WARN: Multi-variable type inference failed */
    public AcatsDetailDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AcatsDetailDataState copy$default(AcatsDetailDataState acatsDetailDataState, AcatsDetailPageResponse acatsDetailPageResponse, AcatsTransfer acatsTransfer, int i, Object obj) {
        if ((i & 1) != 0) {
            acatsDetailPageResponse = acatsDetailDataState.detailPageResponse;
        }
        if ((i & 2) != 0) {
            acatsTransfer = acatsDetailDataState.acatsTransfer;
        }
        return acatsDetailDataState.copy(acatsDetailPageResponse, acatsTransfer);
    }

    /* renamed from: component1, reason: from getter */
    public final AcatsDetailPageResponse getDetailPageResponse() {
        return this.detailPageResponse;
    }

    /* renamed from: component2, reason: from getter */
    public final AcatsTransfer getAcatsTransfer() {
        return this.acatsTransfer;
    }

    public final AcatsDetailDataState copy(AcatsDetailPageResponse detailPageResponse, AcatsTransfer acatsTransfer) {
        return new AcatsDetailDataState(detailPageResponse, acatsTransfer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsDetailDataState)) {
            return false;
        }
        AcatsDetailDataState acatsDetailDataState = (AcatsDetailDataState) other;
        return Intrinsics.areEqual(this.detailPageResponse, acatsDetailDataState.detailPageResponse) && Intrinsics.areEqual(this.acatsTransfer, acatsDetailDataState.acatsTransfer);
    }

    public int hashCode() {
        AcatsDetailPageResponse acatsDetailPageResponse = this.detailPageResponse;
        int iHashCode = (acatsDetailPageResponse == null ? 0 : acatsDetailPageResponse.hashCode()) * 31;
        AcatsTransfer acatsTransfer = this.acatsTransfer;
        return iHashCode + (acatsTransfer != null ? acatsTransfer.hashCode() : 0);
    }

    public String toString() {
        return "AcatsDetailDataState(detailPageResponse=" + this.detailPageResponse + ", acatsTransfer=" + this.acatsTransfer + ")";
    }

    public AcatsDetailDataState(AcatsDetailPageResponse acatsDetailPageResponse, AcatsTransfer acatsTransfer) {
        List<TimelineRow> timelineRows;
        this.detailPageResponse = acatsDetailPageResponse;
        this.acatsTransfer = acatsTransfer;
        this.timelineRows = (acatsDetailPageResponse == null || (timelineRows = acatsDetailPageResponse.getTimelineRows()) == null) ? CollectionsKt.emptyList() : timelineRows;
        this.showHelpIcon = (acatsDetailPageResponse != null ? acatsDetailPageResponse.getHelpAlertSheet() : null) != null;
    }

    public /* synthetic */ AcatsDetailDataState(AcatsDetailPageResponse acatsDetailPageResponse, AcatsTransfer acatsTransfer, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : acatsDetailPageResponse, (i & 2) != 0 ? null : acatsTransfer);
    }

    public final AcatsDetailPageResponse getDetailPageResponse() {
        return this.detailPageResponse;
    }

    public final AcatsTransfer getAcatsTransfer() {
        return this.acatsTransfer;
    }

    public final List<TimelineRow> getTimelineRows() {
        return this.timelineRows;
    }

    public final boolean getShowHelpIcon() {
        return this.showHelpIcon;
    }
}
