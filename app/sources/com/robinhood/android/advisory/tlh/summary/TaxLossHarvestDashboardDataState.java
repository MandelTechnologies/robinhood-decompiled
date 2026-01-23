package com.robinhood.android.advisory.tlh.summary;

import com.robinhood.android.advisory.tlh.summary.TaxLossHarvestDashboardViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.compose.bento.component.rows.BentoTimelineRowState;
import com.robinhood.compose.bento.component.rows.Timeline;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestDashboard;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: TaxLossHarvestDashboardDataState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/advisory/tlh/summary/TaxLossHarvestDashboardDataState;", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestDashboard;", "updateEnrollmentToastText", "", "<init>", "(Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestDashboard;Ljava/lang/String;)V", "getData", "()Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestDashboard;", "getUpdateEnrollmentToastText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "feature-tax-loss-harvesting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TaxLossHarvestDashboardDataState {
    private final TaxLossHarvestDashboard data;
    private final String updateEnrollmentToastText;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public TaxLossHarvestDashboardDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TaxLossHarvestDashboardDataState copy$default(TaxLossHarvestDashboardDataState taxLossHarvestDashboardDataState, TaxLossHarvestDashboard taxLossHarvestDashboard, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            taxLossHarvestDashboard = taxLossHarvestDashboardDataState.data;
        }
        if ((i & 2) != 0) {
            str = taxLossHarvestDashboardDataState.updateEnrollmentToastText;
        }
        return taxLossHarvestDashboardDataState.copy(taxLossHarvestDashboard, str);
    }

    /* renamed from: component1, reason: from getter */
    public final TaxLossHarvestDashboard getData() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUpdateEnrollmentToastText() {
        return this.updateEnrollmentToastText;
    }

    public final TaxLossHarvestDashboardDataState copy(TaxLossHarvestDashboard data, String updateEnrollmentToastText) {
        return new TaxLossHarvestDashboardDataState(data, updateEnrollmentToastText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxLossHarvestDashboardDataState)) {
            return false;
        }
        TaxLossHarvestDashboardDataState taxLossHarvestDashboardDataState = (TaxLossHarvestDashboardDataState) other;
        return Intrinsics.areEqual(this.data, taxLossHarvestDashboardDataState.data) && Intrinsics.areEqual(this.updateEnrollmentToastText, taxLossHarvestDashboardDataState.updateEnrollmentToastText);
    }

    public int hashCode() {
        TaxLossHarvestDashboard taxLossHarvestDashboard = this.data;
        int iHashCode = (taxLossHarvestDashboard == null ? 0 : taxLossHarvestDashboard.hashCode()) * 31;
        String str = this.updateEnrollmentToastText;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "TaxLossHarvestDashboardDataState(data=" + this.data + ", updateEnrollmentToastText=" + this.updateEnrollmentToastText + ")";
    }

    public TaxLossHarvestDashboardDataState(TaxLossHarvestDashboard taxLossHarvestDashboard, String str) {
        this.data = taxLossHarvestDashboard;
        this.updateEnrollmentToastText = str;
    }

    public /* synthetic */ TaxLossHarvestDashboardDataState(TaxLossHarvestDashboard taxLossHarvestDashboard, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : taxLossHarvestDashboard, (i & 2) != 0 ? null : str);
    }

    public final TaxLossHarvestDashboard getData() {
        return this.data;
    }

    public final String getUpdateEnrollmentToastText() {
        return this.updateEnrollmentToastText;
    }

    /* compiled from: TaxLossHarvestDashboardDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advisory/tlh/summary/TaxLossHarvestDashboardDataState$Companion;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/advisory/tlh/summary/TaxLossHarvestDashboardDataState;", "Lcom/robinhood/android/advisory/tlh/summary/TaxLossHarvestDashboardViewState;", "<init>", "()V", "reduce", "dataState", "feature-tax-loss-harvesting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements StateProvider<TaxLossHarvestDashboardDataState, TaxLossHarvestDashboardViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public TaxLossHarvestDashboardViewState reduce(TaxLossHarvestDashboardDataState dataState) {
            TaxLossHarvestDashboardViewState.TimelineState timelineState;
            Timeline.Status status;
            Timeline.Position position;
            TaxLossHarvestDashboard.Timeline timeline;
            Timeline.InfoAction infoAction;
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            if (dataState.getData() != null) {
                String year = dataState.getData().getYear();
                ImmutableList3 persistentList = extensions2.toPersistentList(dataState.getData().getAvailableYears());
                String title = dataState.getData().getTitle();
                String subtitleMarkdown = dataState.getData().getSubtitleMarkdown();
                TaxLossHarvestDashboard.Status status2 = dataState.getData().getStatus();
                TaxLossHarvestDashboard.GainsAndLossesSectionHeader gainsAndLossesSectionHeader = dataState.getData().getGainsAndLossesSectionHeader();
                TaxLossHarvestDashboard.Timeline timeline2 = dataState.getData().getTimeline();
                if (timeline2 != null) {
                    String title2 = timeline2.getTitle();
                    List<TaxLossHarvestDashboard.TimelineRow> rows = timeline2.getRows();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(rows, 10));
                    int i = 0;
                    for (Object obj : rows) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        TaxLossHarvestDashboard.TimelineRow timelineRow = (TaxLossHarvestDashboard.TimelineRow) obj;
                        TaxLossHarvestDashboard.TimelineRow timelineRow2 = (TaxLossHarvestDashboard.TimelineRow) CollectionsKt.getOrNull(timeline2.getRows(), i - 1);
                        boolean zIsCompleted = timelineRow2 != null ? timelineRow2.isCompleted() : true;
                        if (timelineRow.isCompleted()) {
                            status = Timeline.Status.COMPLETE;
                        } else if (zIsCompleted) {
                            status = Timeline.Status.ONGOING;
                        } else {
                            status = Timeline.Status.INCOMPLETE;
                        }
                        Timeline.Status status3 = status;
                        String title3 = timelineRow.getTitle();
                        String subtitle = timelineRow.getSubtitle();
                        if (i == 0) {
                            position = Timeline.Position.TOP;
                        } else {
                            position = i == timeline2.getRows().size() + (-1) ? Timeline.Position.BOTTOM : Timeline.Position.BETWEEN;
                        }
                        Timeline.Position position2 = position;
                        if (timelineRow.getShouldShowInfoIcon()) {
                            timeline = timeline2;
                            infoAction = new Timeline.InfoAction(Timeline.InfoIconPosition.METADATA, new Function0() { // from class: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestDashboardDataState$Companion$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            });
                        } else {
                            timeline = timeline2;
                            infoAction = null;
                        }
                        arrayList.add(new TaxLossHarvestDashboardViewState.TimelineState.TimelineRow(new BentoTimelineRowState(status3, position2, title3, infoAction, null, subtitle, null, null, null, false, null, null, null, null, false, false, 0, false, 0, false, false, false, null, null, 16777168, null), timelineRow.getInfoBottomSheet()));
                        i = i2;
                        timeline2 = timeline;
                    }
                    timelineState = new TaxLossHarvestDashboardViewState.TimelineState(title2, extensions2.toPersistentList(arrayList));
                } else {
                    timelineState = null;
                }
                return new TaxLossHarvestDashboardViewState(title, subtitleMarkdown, status2, timelineState, gainsAndLossesSectionHeader, dataState.getData().getCtaButton(), dataState.getUpdateEnrollmentToastText(), false, year, persistentList, 128, null);
            }
            return TaxLossHarvestDashboardViewState.INSTANCE.getLoading();
        }
    }
}
