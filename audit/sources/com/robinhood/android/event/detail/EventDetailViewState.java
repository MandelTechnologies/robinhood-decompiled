package com.robinhood.android.event.detail;

import com.robinhood.android.event.detail.builders.BreakingNewsInputData;
import com.robinhood.android.event.detail.builders.ContractSelectorRowControlViewState;
import com.robinhood.android.event.detail.builders.ContractSelectorRowTreatmentViewState;
import com.robinhood.android.event.detail.duel.DuelEventContractUiDetail;
import com.robinhood.android.event.detail.multi.MultiTradeBarUiState;
import com.robinhood.android.event.detail.p129ui.bottomsheets.EventDetailDisplayDataBottomSheet;
import com.robinhood.android.event.detail.p129ui.dialog.EventTradeOverlayDialogData;
import com.robinhood.android.eventcontracts.sharedeventui.chart.EventChartLabelItem;
import com.robinhood.android.eventcontracts.sharedeventui.timeline.EventTimelineRowData;
import com.robinhood.android.eventcontracts.sharedeventui.util.EventContractHistoryFilterState;
import com.robinhood.android.futures.charts.EventContractChartArg;
import com.robinhood.android.models.event.p186db.arsenal.Event;
import com.robinhood.android.models.event.p186db.arsenal.EventViewMode;
import com.robinhood.android.models.event.p187ui.UiEcEvent;
import com.robinhood.utils.Either;
import com.robinhood.utils.Optional;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: EventDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bJ\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002~\u007fBÃ\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u0012$\u0010\f\u001a \u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fj\u0004\u0018\u0001`\u0011\u0018\u00010\r\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012$\u0010\u001a\u001a \u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u000f\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u000f\u0018\u00010\r\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010!\u001a\u00020\u0013\u0012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u000f\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010&\u0012\u0006\u0010'\u001a\u00020(\u0012\b\u0010)\u001a\u0004\u0018\u00010*\u0012\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f\u0012\b\u0010,\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u000101¢\u0006\u0004\b2\u00103J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0003J'\u0010e\u001a \u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fj\u0004\u0018\u0001`\u0011\u0018\u00010\rHÆ\u0003J\t\u0010f\u001a\u00020\u0013HÆ\u0003J\u0011\u0010g\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000fHÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\t\u0010i\u001a\u00020\u0019HÆ\u0003J'\u0010j\u001a \u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u000f\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u000f\u0018\u00010\rHÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\t\u0010n\u001a\u00020\u0013HÆ\u0003J\u0011\u0010o\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u000fHÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010&HÆ\u0003J\t\u0010r\u001a\u00020(HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010*HÆ\u0003J\u0011\u0010t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fHÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010-HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010/HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u000101HÆ\u0003Jñ\u0002\u0010x\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2&\b\u0002\u0010\f\u001a \u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fj\u0004\u0018\u0001`\u0011\u0018\u00010\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192&\b\u0002\u0010\u001a\u001a \u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u000f\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u000f\u0018\u00010\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010!\u001a\u00020\u00132\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u000f2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010'\u001a\u00020(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\n\b\u0002\u00100\u001a\u0004\u0018\u000101HÆ\u0001J\u0013\u0010y\u001a\u00020\u00132\b\u0010z\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010{\u001a\u00020|HÖ\u0001J\t\u0010}\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R/\u0010\f\u001a \u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fj\u0004\u0018\u0001`\u0011\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010@R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR/\u0010\u001a\u001a \u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u000f\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u000f\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\bG\u0010?R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0013\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\bL\u0010KR\u0011\u0010!\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\bM\u0010@R\u0019\u0010\"\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bN\u0010BR\u0013\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u00105R\u0013\u0010%\u001a\u0004\u0018\u00010&¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0011\u0010'\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0013\u0010)\u001a\u0004\u0018\u00010*¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0019\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bV\u0010BR\u0013\u0010,\u001a\u0004\u0018\u00010-¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u0013\u0010.\u001a\u0004\u0018\u00010/¢\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u0013\u00100\u001a\u0004\u0018\u000101¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0011\u0010]\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b]\u0010@R\u0013\u0010^\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b_\u0010I¨\u0006\u0080\u0001"}, m3636d2 = {"Lcom/robinhood/android/event/detail/EventDetailViewState;", "", "individualAccountNumber", "", "uiEvent", "Lcom/robinhood/android/models/event/ui/UiEcEvent;", "marketClosedBanner", "Lcom/robinhood/utils/resource/StringResource;", "topBarData", "Lcom/robinhood/android/event/detail/EventDetailViewState$TopBarData;", "title", "Lcom/robinhood/utils/Optional;", "contractHeader", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/android/event/detail/EventDetailViewState$DuelContractHeader;", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/eventcontracts/sharedeventui/chart/EventChartLabelItem;", "Lcom/robinhood/android/eventcontracts/sharedeventui/chart/EventChartLabelData;", "isInEcSportsExperiment", "", "contractIdsForChart", "Ljava/util/UUID;", "eventContractChartArg", "Lcom/robinhood/android/futures/charts/EventContractChartArg;", "chartState", "Lcom/robinhood/android/event/detail/EventChartUiState;", "contractDataList", "Lcom/robinhood/android/event/detail/builders/ContractSelectorRowControlViewState;", "Lcom/robinhood/android/event/detail/builders/ContractSelectorRowTreatmentViewState;", "selectedContractId", "upcomingActivityFilter", "Lcom/robinhood/android/eventcontracts/sharedeventui/util/EventContractHistoryFilterState;", "historyFilter", "hasPosition", "timeline", "Lcom/robinhood/android/eventcontracts/sharedeventui/timeline/EventTimelineRowData;", "about", "tradeBar", "Lcom/robinhood/android/event/detail/multi/MultiTradeBarUiState;", "selectedDisplayMode", "Lcom/robinhood/android/event/detail/ui/bottomsheets/EventDetailContractDisplayMode;", "liveDataSection", "Lcom/robinhood/android/event/detail/EventDetailLiveDataSectionViewState;", "tradingProhibitionRules", "viewMode", "Lcom/robinhood/android/models/event/db/arsenal/EventViewMode;", "eventTradeOverlayDialogData", "Lcom/robinhood/android/event/detail/ui/dialog/EventTradeOverlayDialogData;", "breakingNewsData", "Lcom/robinhood/android/event/detail/builders/BreakingNewsInputData;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/models/event/ui/UiEcEvent;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/event/detail/EventDetailViewState$TopBarData;Lcom/robinhood/utils/Optional;Lcom/robinhood/utils/Either;ZLkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/futures/charts/EventContractChartArg;Lcom/robinhood/android/event/detail/EventChartUiState;Lcom/robinhood/utils/Either;Ljava/util/UUID;Lcom/robinhood/android/eventcontracts/sharedeventui/util/EventContractHistoryFilterState;Lcom/robinhood/android/eventcontracts/sharedeventui/util/EventContractHistoryFilterState;ZLkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;Lcom/robinhood/android/event/detail/multi/MultiTradeBarUiState;Lcom/robinhood/android/event/detail/ui/bottomsheets/EventDetailContractDisplayMode;Lcom/robinhood/android/event/detail/EventDetailLiveDataSectionViewState;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/models/event/db/arsenal/EventViewMode;Lcom/robinhood/android/event/detail/ui/dialog/EventTradeOverlayDialogData;Lcom/robinhood/android/event/detail/builders/BreakingNewsInputData;)V", "getIndividualAccountNumber", "()Ljava/lang/String;", "getUiEvent", "()Lcom/robinhood/android/models/event/ui/UiEcEvent;", "getMarketClosedBanner", "()Lcom/robinhood/utils/resource/StringResource;", "getTopBarData", "()Lcom/robinhood/android/event/detail/EventDetailViewState$TopBarData;", "getTitle", "()Lcom/robinhood/utils/Optional;", "getContractHeader", "()Lcom/robinhood/utils/Either;", "()Z", "getContractIdsForChart", "()Lkotlinx/collections/immutable/ImmutableList;", "getEventContractChartArg", "()Lcom/robinhood/android/futures/charts/EventContractChartArg;", "getChartState", "()Lcom/robinhood/android/event/detail/EventChartUiState;", "getContractDataList", "getSelectedContractId", "()Ljava/util/UUID;", "getUpcomingActivityFilter", "()Lcom/robinhood/android/eventcontracts/sharedeventui/util/EventContractHistoryFilterState;", "getHistoryFilter", "getHasPosition", "getTimeline", "getAbout", "getTradeBar", "()Lcom/robinhood/android/event/detail/multi/MultiTradeBarUiState;", "getSelectedDisplayMode", "()Lcom/robinhood/android/event/detail/ui/bottomsheets/EventDetailContractDisplayMode;", "getLiveDataSection", "()Lcom/robinhood/android/event/detail/EventDetailLiveDataSectionViewState;", "getTradingProhibitionRules", "getViewMode", "()Lcom/robinhood/android/models/event/db/arsenal/EventViewMode;", "getEventTradeOverlayDialogData", "()Lcom/robinhood/android/event/detail/ui/dialog/EventTradeOverlayDialogData;", "getBreakingNewsData", "()Lcom/robinhood/android/event/detail/builders/BreakingNewsInputData;", "isMultiContractViewMode", "eventId", "getEventId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "equals", "other", "hashCode", "", "toString", "TopBarData", "DuelContractHeader", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EventDetailViewState {
    public static final int $stable = 8;
    private final String about;
    private final BreakingNewsInputData breakingNewsData;
    private final EventChartUiState chartState;
    private final Either<ImmutableList<ContractSelectorRowControlViewState>, ImmutableList<ContractSelectorRowTreatmentViewState>> contractDataList;
    private final Either<DuelContractHeader, ImmutableList<EventChartLabelItem>> contractHeader;
    private final ImmutableList<UUID> contractIdsForChart;
    private final EventContractChartArg eventContractChartArg;
    private final EventTradeOverlayDialogData eventTradeOverlayDialogData;
    private final boolean hasPosition;
    private final EventContractHistoryFilterState historyFilter;
    private final String individualAccountNumber;
    private final boolean isInEcSportsExperiment;
    private final EventDetailLiveDataSectionViewState liveDataSection;
    private final StringResource marketClosedBanner;
    private final UUID selectedContractId;
    private final EventDetailDisplayDataBottomSheet selectedDisplayMode;
    private final ImmutableList<EventTimelineRowData> timeline;
    private final Optional<String> title;
    private final TopBarData topBarData;
    private final MultiTradeBarUiState tradeBar;
    private final ImmutableList<String> tradingProhibitionRules;
    private final UiEcEvent uiEvent;
    private final EventContractHistoryFilterState upcomingActivityFilter;
    private final EventViewMode viewMode;

    public static /* synthetic */ EventDetailViewState copy$default(EventDetailViewState eventDetailViewState, String str, UiEcEvent uiEcEvent, StringResource stringResource, TopBarData topBarData, Optional optional, Either either, boolean z, ImmutableList immutableList, EventContractChartArg eventContractChartArg, EventChartUiState eventChartUiState, Either either2, UUID uuid, EventContractHistoryFilterState eventContractHistoryFilterState, EventContractHistoryFilterState eventContractHistoryFilterState2, boolean z2, ImmutableList immutableList2, String str2, MultiTradeBarUiState multiTradeBarUiState, EventDetailDisplayDataBottomSheet eventDetailDisplayDataBottomSheet, EventDetailLiveDataSectionViewState eventDetailLiveDataSectionViewState, ImmutableList immutableList3, EventViewMode eventViewMode, EventTradeOverlayDialogData eventTradeOverlayDialogData, BreakingNewsInputData breakingNewsInputData, int i, Object obj) {
        BreakingNewsInputData breakingNewsInputData2;
        EventTradeOverlayDialogData eventTradeOverlayDialogData2;
        String str3 = (i & 1) != 0 ? eventDetailViewState.individualAccountNumber : str;
        UiEcEvent uiEcEvent2 = (i & 2) != 0 ? eventDetailViewState.uiEvent : uiEcEvent;
        StringResource stringResource2 = (i & 4) != 0 ? eventDetailViewState.marketClosedBanner : stringResource;
        TopBarData topBarData2 = (i & 8) != 0 ? eventDetailViewState.topBarData : topBarData;
        Optional optional2 = (i & 16) != 0 ? eventDetailViewState.title : optional;
        Either either3 = (i & 32) != 0 ? eventDetailViewState.contractHeader : either;
        boolean z3 = (i & 64) != 0 ? eventDetailViewState.isInEcSportsExperiment : z;
        ImmutableList immutableList4 = (i & 128) != 0 ? eventDetailViewState.contractIdsForChart : immutableList;
        EventContractChartArg eventContractChartArg2 = (i & 256) != 0 ? eventDetailViewState.eventContractChartArg : eventContractChartArg;
        EventChartUiState eventChartUiState2 = (i & 512) != 0 ? eventDetailViewState.chartState : eventChartUiState;
        Either either4 = (i & 1024) != 0 ? eventDetailViewState.contractDataList : either2;
        UUID uuid2 = (i & 2048) != 0 ? eventDetailViewState.selectedContractId : uuid;
        EventContractHistoryFilterState eventContractHistoryFilterState3 = (i & 4096) != 0 ? eventDetailViewState.upcomingActivityFilter : eventContractHistoryFilterState;
        EventContractHistoryFilterState eventContractHistoryFilterState4 = (i & 8192) != 0 ? eventDetailViewState.historyFilter : eventContractHistoryFilterState2;
        String str4 = str3;
        boolean z4 = (i & 16384) != 0 ? eventDetailViewState.hasPosition : z2;
        ImmutableList immutableList5 = (i & 32768) != 0 ? eventDetailViewState.timeline : immutableList2;
        String str5 = (i & 65536) != 0 ? eventDetailViewState.about : str2;
        MultiTradeBarUiState multiTradeBarUiState2 = (i & 131072) != 0 ? eventDetailViewState.tradeBar : multiTradeBarUiState;
        EventDetailDisplayDataBottomSheet eventDetailDisplayDataBottomSheet2 = (i & 262144) != 0 ? eventDetailViewState.selectedDisplayMode : eventDetailDisplayDataBottomSheet;
        EventDetailLiveDataSectionViewState eventDetailLiveDataSectionViewState2 = (i & 524288) != 0 ? eventDetailViewState.liveDataSection : eventDetailLiveDataSectionViewState;
        ImmutableList immutableList6 = (i & 1048576) != 0 ? eventDetailViewState.tradingProhibitionRules : immutableList3;
        EventViewMode eventViewMode2 = (i & 2097152) != 0 ? eventDetailViewState.viewMode : eventViewMode;
        EventTradeOverlayDialogData eventTradeOverlayDialogData3 = (i & 4194304) != 0 ? eventDetailViewState.eventTradeOverlayDialogData : eventTradeOverlayDialogData;
        if ((i & 8388608) != 0) {
            eventTradeOverlayDialogData2 = eventTradeOverlayDialogData3;
            breakingNewsInputData2 = eventDetailViewState.breakingNewsData;
        } else {
            breakingNewsInputData2 = breakingNewsInputData;
            eventTradeOverlayDialogData2 = eventTradeOverlayDialogData3;
        }
        return eventDetailViewState.copy(str4, uiEcEvent2, stringResource2, topBarData2, optional2, either3, z3, immutableList4, eventContractChartArg2, eventChartUiState2, either4, uuid2, eventContractHistoryFilterState3, eventContractHistoryFilterState4, z4, immutableList5, str5, multiTradeBarUiState2, eventDetailDisplayDataBottomSheet2, eventDetailLiveDataSectionViewState2, immutableList6, eventViewMode2, eventTradeOverlayDialogData2, breakingNewsInputData2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getIndividualAccountNumber() {
        return this.individualAccountNumber;
    }

    /* renamed from: component10, reason: from getter */
    public final EventChartUiState getChartState() {
        return this.chartState;
    }

    public final Either<ImmutableList<ContractSelectorRowControlViewState>, ImmutableList<ContractSelectorRowTreatmentViewState>> component11() {
        return this.contractDataList;
    }

    /* renamed from: component12, reason: from getter */
    public final UUID getSelectedContractId() {
        return this.selectedContractId;
    }

    /* renamed from: component13, reason: from getter */
    public final EventContractHistoryFilterState getUpcomingActivityFilter() {
        return this.upcomingActivityFilter;
    }

    /* renamed from: component14, reason: from getter */
    public final EventContractHistoryFilterState getHistoryFilter() {
        return this.historyFilter;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getHasPosition() {
        return this.hasPosition;
    }

    public final ImmutableList<EventTimelineRowData> component16() {
        return this.timeline;
    }

    /* renamed from: component17, reason: from getter */
    public final String getAbout() {
        return this.about;
    }

    /* renamed from: component18, reason: from getter */
    public final MultiTradeBarUiState getTradeBar() {
        return this.tradeBar;
    }

    /* renamed from: component19, reason: from getter */
    public final EventDetailDisplayDataBottomSheet getSelectedDisplayMode() {
        return this.selectedDisplayMode;
    }

    /* renamed from: component2, reason: from getter */
    public final UiEcEvent getUiEvent() {
        return this.uiEvent;
    }

    /* renamed from: component20, reason: from getter */
    public final EventDetailLiveDataSectionViewState getLiveDataSection() {
        return this.liveDataSection;
    }

    public final ImmutableList<String> component21() {
        return this.tradingProhibitionRules;
    }

    /* renamed from: component22, reason: from getter */
    public final EventViewMode getViewMode() {
        return this.viewMode;
    }

    /* renamed from: component23, reason: from getter */
    public final EventTradeOverlayDialogData getEventTradeOverlayDialogData() {
        return this.eventTradeOverlayDialogData;
    }

    /* renamed from: component24, reason: from getter */
    public final BreakingNewsInputData getBreakingNewsData() {
        return this.breakingNewsData;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getMarketClosedBanner() {
        return this.marketClosedBanner;
    }

    /* renamed from: component4, reason: from getter */
    public final TopBarData getTopBarData() {
        return this.topBarData;
    }

    public final Optional<String> component5() {
        return this.title;
    }

    public final Either<DuelContractHeader, ImmutableList<EventChartLabelItem>> component6() {
        return this.contractHeader;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsInEcSportsExperiment() {
        return this.isInEcSportsExperiment;
    }

    public final ImmutableList<UUID> component8() {
        return this.contractIdsForChart;
    }

    /* renamed from: component9, reason: from getter */
    public final EventContractChartArg getEventContractChartArg() {
        return this.eventContractChartArg;
    }

    public final EventDetailViewState copy(String individualAccountNumber, UiEcEvent uiEvent, StringResource marketClosedBanner, TopBarData topBarData, Optional<String> title, Either<DuelContractHeader, ? extends ImmutableList<EventChartLabelItem>> contractHeader, boolean isInEcSportsExperiment, ImmutableList<UUID> contractIdsForChart, EventContractChartArg eventContractChartArg, EventChartUiState chartState, Either<? extends ImmutableList<ContractSelectorRowControlViewState>, ? extends ImmutableList<ContractSelectorRowTreatmentViewState>> contractDataList, UUID selectedContractId, EventContractHistoryFilterState upcomingActivityFilter, EventContractHistoryFilterState historyFilter, boolean hasPosition, ImmutableList<EventTimelineRowData> timeline, String about, MultiTradeBarUiState tradeBar, EventDetailDisplayDataBottomSheet selectedDisplayMode, EventDetailLiveDataSectionViewState liveDataSection, ImmutableList<String> tradingProhibitionRules, EventViewMode viewMode, EventTradeOverlayDialogData eventTradeOverlayDialogData, BreakingNewsInputData breakingNewsData) {
        Intrinsics.checkNotNullParameter(chartState, "chartState");
        Intrinsics.checkNotNullParameter(selectedDisplayMode, "selectedDisplayMode");
        return new EventDetailViewState(individualAccountNumber, uiEvent, marketClosedBanner, topBarData, title, contractHeader, isInEcSportsExperiment, contractIdsForChart, eventContractChartArg, chartState, contractDataList, selectedContractId, upcomingActivityFilter, historyFilter, hasPosition, timeline, about, tradeBar, selectedDisplayMode, liveDataSection, tradingProhibitionRules, viewMode, eventTradeOverlayDialogData, breakingNewsData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventDetailViewState)) {
            return false;
        }
        EventDetailViewState eventDetailViewState = (EventDetailViewState) other;
        return Intrinsics.areEqual(this.individualAccountNumber, eventDetailViewState.individualAccountNumber) && Intrinsics.areEqual(this.uiEvent, eventDetailViewState.uiEvent) && Intrinsics.areEqual(this.marketClosedBanner, eventDetailViewState.marketClosedBanner) && Intrinsics.areEqual(this.topBarData, eventDetailViewState.topBarData) && Intrinsics.areEqual(this.title, eventDetailViewState.title) && Intrinsics.areEqual(this.contractHeader, eventDetailViewState.contractHeader) && this.isInEcSportsExperiment == eventDetailViewState.isInEcSportsExperiment && Intrinsics.areEqual(this.contractIdsForChart, eventDetailViewState.contractIdsForChart) && Intrinsics.areEqual(this.eventContractChartArg, eventDetailViewState.eventContractChartArg) && Intrinsics.areEqual(this.chartState, eventDetailViewState.chartState) && Intrinsics.areEqual(this.contractDataList, eventDetailViewState.contractDataList) && Intrinsics.areEqual(this.selectedContractId, eventDetailViewState.selectedContractId) && Intrinsics.areEqual(this.upcomingActivityFilter, eventDetailViewState.upcomingActivityFilter) && Intrinsics.areEqual(this.historyFilter, eventDetailViewState.historyFilter) && this.hasPosition == eventDetailViewState.hasPosition && Intrinsics.areEqual(this.timeline, eventDetailViewState.timeline) && Intrinsics.areEqual(this.about, eventDetailViewState.about) && Intrinsics.areEqual(this.tradeBar, eventDetailViewState.tradeBar) && this.selectedDisplayMode == eventDetailViewState.selectedDisplayMode && Intrinsics.areEqual(this.liveDataSection, eventDetailViewState.liveDataSection) && Intrinsics.areEqual(this.tradingProhibitionRules, eventDetailViewState.tradingProhibitionRules) && this.viewMode == eventDetailViewState.viewMode && Intrinsics.areEqual(this.eventTradeOverlayDialogData, eventDetailViewState.eventTradeOverlayDialogData) && Intrinsics.areEqual(this.breakingNewsData, eventDetailViewState.breakingNewsData);
    }

    public int hashCode() {
        String str = this.individualAccountNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        UiEcEvent uiEcEvent = this.uiEvent;
        int iHashCode2 = (iHashCode + (uiEcEvent == null ? 0 : uiEcEvent.hashCode())) * 31;
        StringResource stringResource = this.marketClosedBanner;
        int iHashCode3 = (iHashCode2 + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
        TopBarData topBarData = this.topBarData;
        int iHashCode4 = (iHashCode3 + (topBarData == null ? 0 : topBarData.hashCode())) * 31;
        Optional<String> optional = this.title;
        int iHashCode5 = (iHashCode4 + (optional == null ? 0 : optional.hashCode())) * 31;
        Either<DuelContractHeader, ImmutableList<EventChartLabelItem>> either = this.contractHeader;
        int iHashCode6 = (((iHashCode5 + (either == null ? 0 : either.hashCode())) * 31) + Boolean.hashCode(this.isInEcSportsExperiment)) * 31;
        ImmutableList<UUID> immutableList = this.contractIdsForChart;
        int iHashCode7 = (iHashCode6 + (immutableList == null ? 0 : immutableList.hashCode())) * 31;
        EventContractChartArg eventContractChartArg = this.eventContractChartArg;
        int iHashCode8 = (((iHashCode7 + (eventContractChartArg == null ? 0 : eventContractChartArg.hashCode())) * 31) + this.chartState.hashCode()) * 31;
        Either<ImmutableList<ContractSelectorRowControlViewState>, ImmutableList<ContractSelectorRowTreatmentViewState>> either2 = this.contractDataList;
        int iHashCode9 = (iHashCode8 + (either2 == null ? 0 : either2.hashCode())) * 31;
        UUID uuid = this.selectedContractId;
        int iHashCode10 = (iHashCode9 + (uuid == null ? 0 : uuid.hashCode())) * 31;
        EventContractHistoryFilterState eventContractHistoryFilterState = this.upcomingActivityFilter;
        int iHashCode11 = (iHashCode10 + (eventContractHistoryFilterState == null ? 0 : eventContractHistoryFilterState.hashCode())) * 31;
        EventContractHistoryFilterState eventContractHistoryFilterState2 = this.historyFilter;
        int iHashCode12 = (((iHashCode11 + (eventContractHistoryFilterState2 == null ? 0 : eventContractHistoryFilterState2.hashCode())) * 31) + Boolean.hashCode(this.hasPosition)) * 31;
        ImmutableList<EventTimelineRowData> immutableList2 = this.timeline;
        int iHashCode13 = (iHashCode12 + (immutableList2 == null ? 0 : immutableList2.hashCode())) * 31;
        String str2 = this.about;
        int iHashCode14 = (iHashCode13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        MultiTradeBarUiState multiTradeBarUiState = this.tradeBar;
        int iHashCode15 = (((iHashCode14 + (multiTradeBarUiState == null ? 0 : multiTradeBarUiState.hashCode())) * 31) + this.selectedDisplayMode.hashCode()) * 31;
        EventDetailLiveDataSectionViewState eventDetailLiveDataSectionViewState = this.liveDataSection;
        int iHashCode16 = (iHashCode15 + (eventDetailLiveDataSectionViewState == null ? 0 : eventDetailLiveDataSectionViewState.hashCode())) * 31;
        ImmutableList<String> immutableList3 = this.tradingProhibitionRules;
        int iHashCode17 = (iHashCode16 + (immutableList3 == null ? 0 : immutableList3.hashCode())) * 31;
        EventViewMode eventViewMode = this.viewMode;
        int iHashCode18 = (iHashCode17 + (eventViewMode == null ? 0 : eventViewMode.hashCode())) * 31;
        EventTradeOverlayDialogData eventTradeOverlayDialogData = this.eventTradeOverlayDialogData;
        int iHashCode19 = (iHashCode18 + (eventTradeOverlayDialogData == null ? 0 : eventTradeOverlayDialogData.hashCode())) * 31;
        BreakingNewsInputData breakingNewsInputData = this.breakingNewsData;
        return iHashCode19 + (breakingNewsInputData != null ? breakingNewsInputData.hashCode() : 0);
    }

    public String toString() {
        return "EventDetailViewState(individualAccountNumber=" + this.individualAccountNumber + ", uiEvent=" + this.uiEvent + ", marketClosedBanner=" + this.marketClosedBanner + ", topBarData=" + this.topBarData + ", title=" + this.title + ", contractHeader=" + this.contractHeader + ", isInEcSportsExperiment=" + this.isInEcSportsExperiment + ", contractIdsForChart=" + this.contractIdsForChart + ", eventContractChartArg=" + this.eventContractChartArg + ", chartState=" + this.chartState + ", contractDataList=" + this.contractDataList + ", selectedContractId=" + this.selectedContractId + ", upcomingActivityFilter=" + this.upcomingActivityFilter + ", historyFilter=" + this.historyFilter + ", hasPosition=" + this.hasPosition + ", timeline=" + this.timeline + ", about=" + this.about + ", tradeBar=" + this.tradeBar + ", selectedDisplayMode=" + this.selectedDisplayMode + ", liveDataSection=" + this.liveDataSection + ", tradingProhibitionRules=" + this.tradingProhibitionRules + ", viewMode=" + this.viewMode + ", eventTradeOverlayDialogData=" + this.eventTradeOverlayDialogData + ", breakingNewsData=" + this.breakingNewsData + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EventDetailViewState(String str, UiEcEvent uiEcEvent, StringResource stringResource, TopBarData topBarData, Optional<String> optional, Either<DuelContractHeader, ? extends ImmutableList<EventChartLabelItem>> either, boolean z, ImmutableList<UUID> immutableList, EventContractChartArg eventContractChartArg, EventChartUiState chartState, Either<? extends ImmutableList<ContractSelectorRowControlViewState>, ? extends ImmutableList<ContractSelectorRowTreatmentViewState>> either2, UUID uuid, EventContractHistoryFilterState eventContractHistoryFilterState, EventContractHistoryFilterState eventContractHistoryFilterState2, boolean z2, ImmutableList<EventTimelineRowData> immutableList2, String str2, MultiTradeBarUiState multiTradeBarUiState, EventDetailDisplayDataBottomSheet selectedDisplayMode, EventDetailLiveDataSectionViewState eventDetailLiveDataSectionViewState, ImmutableList<String> immutableList3, EventViewMode eventViewMode, EventTradeOverlayDialogData eventTradeOverlayDialogData, BreakingNewsInputData breakingNewsInputData) {
        Intrinsics.checkNotNullParameter(chartState, "chartState");
        Intrinsics.checkNotNullParameter(selectedDisplayMode, "selectedDisplayMode");
        this.individualAccountNumber = str;
        this.uiEvent = uiEcEvent;
        this.marketClosedBanner = stringResource;
        this.topBarData = topBarData;
        this.title = optional;
        this.contractHeader = either;
        this.isInEcSportsExperiment = z;
        this.contractIdsForChart = immutableList;
        this.eventContractChartArg = eventContractChartArg;
        this.chartState = chartState;
        this.contractDataList = either2;
        this.selectedContractId = uuid;
        this.upcomingActivityFilter = eventContractHistoryFilterState;
        this.historyFilter = eventContractHistoryFilterState2;
        this.hasPosition = z2;
        this.timeline = immutableList2;
        this.about = str2;
        this.tradeBar = multiTradeBarUiState;
        this.selectedDisplayMode = selectedDisplayMode;
        this.liveDataSection = eventDetailLiveDataSectionViewState;
        this.tradingProhibitionRules = immutableList3;
        this.viewMode = eventViewMode;
        this.eventTradeOverlayDialogData = eventTradeOverlayDialogData;
        this.breakingNewsData = breakingNewsInputData;
    }

    public /* synthetic */ EventDetailViewState(String str, UiEcEvent uiEcEvent, StringResource stringResource, TopBarData topBarData, Optional optional, Either either, boolean z, ImmutableList immutableList, EventContractChartArg eventContractChartArg, EventChartUiState eventChartUiState, Either either2, UUID uuid, EventContractHistoryFilterState eventContractHistoryFilterState, EventContractHistoryFilterState eventContractHistoryFilterState2, boolean z2, ImmutableList immutableList2, String str2, MultiTradeBarUiState multiTradeBarUiState, EventDetailDisplayDataBottomSheet eventDetailDisplayDataBottomSheet, EventDetailLiveDataSectionViewState eventDetailLiveDataSectionViewState, ImmutableList immutableList3, EventViewMode eventViewMode, EventTradeOverlayDialogData eventTradeOverlayDialogData, BreakingNewsInputData breakingNewsInputData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, uiEcEvent, stringResource, topBarData, optional, either, z, immutableList, eventContractChartArg, eventChartUiState, either2, uuid, eventContractHistoryFilterState, eventContractHistoryFilterState2, z2, immutableList2, str2, multiTradeBarUiState, eventDetailDisplayDataBottomSheet, eventDetailLiveDataSectionViewState, immutableList3, eventViewMode, (i & 4194304) != 0 ? null : eventTradeOverlayDialogData, (i & 8388608) != 0 ? null : breakingNewsInputData);
    }

    public final String getIndividualAccountNumber() {
        return this.individualAccountNumber;
    }

    public final UiEcEvent getUiEvent() {
        return this.uiEvent;
    }

    public final StringResource getMarketClosedBanner() {
        return this.marketClosedBanner;
    }

    public final TopBarData getTopBarData() {
        return this.topBarData;
    }

    public final Optional<String> getTitle() {
        return this.title;
    }

    public final Either<DuelContractHeader, ImmutableList<EventChartLabelItem>> getContractHeader() {
        return this.contractHeader;
    }

    public final boolean isInEcSportsExperiment() {
        return this.isInEcSportsExperiment;
    }

    public final ImmutableList<UUID> getContractIdsForChart() {
        return this.contractIdsForChart;
    }

    public final EventContractChartArg getEventContractChartArg() {
        return this.eventContractChartArg;
    }

    public final EventChartUiState getChartState() {
        return this.chartState;
    }

    public final Either<ImmutableList<ContractSelectorRowControlViewState>, ImmutableList<ContractSelectorRowTreatmentViewState>> getContractDataList() {
        return this.contractDataList;
    }

    public final UUID getSelectedContractId() {
        return this.selectedContractId;
    }

    public final EventContractHistoryFilterState getUpcomingActivityFilter() {
        return this.upcomingActivityFilter;
    }

    public final EventContractHistoryFilterState getHistoryFilter() {
        return this.historyFilter;
    }

    public final boolean getHasPosition() {
        return this.hasPosition;
    }

    public final ImmutableList<EventTimelineRowData> getTimeline() {
        return this.timeline;
    }

    public final String getAbout() {
        return this.about;
    }

    public final MultiTradeBarUiState getTradeBar() {
        return this.tradeBar;
    }

    public final EventDetailDisplayDataBottomSheet getSelectedDisplayMode() {
        return this.selectedDisplayMode;
    }

    public final EventDetailLiveDataSectionViewState getLiveDataSection() {
        return this.liveDataSection;
    }

    public final ImmutableList<String> getTradingProhibitionRules() {
        return this.tradingProhibitionRules;
    }

    public final EventViewMode getViewMode() {
        return this.viewMode;
    }

    public final EventTradeOverlayDialogData getEventTradeOverlayDialogData() {
        return this.eventTradeOverlayDialogData;
    }

    public final BreakingNewsInputData getBreakingNewsData() {
        return this.breakingNewsData;
    }

    public final boolean isMultiContractViewMode() {
        Event event;
        UiEcEvent uiEcEvent = this.uiEvent;
        return ((uiEcEvent == null || (event = uiEcEvent.getEvent()) == null) ? null : event.getViewMode()) == EventViewMode.MULTI;
    }

    public final UUID getEventId() {
        Event event;
        UiEcEvent uiEcEvent = this.uiEvent;
        if (uiEcEvent == null || (event = uiEcEvent.getEvent()) == null) {
            return null;
        }
        return event.getEventId();
    }

    /* compiled from: EventDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/event/detail/EventDetailViewState$TopBarData;", "", "primaryText", "Lcom/robinhood/utils/resource/StringResource;", "secondaryText", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;)V", "getPrimaryText", "()Lcom/robinhood/utils/resource/StringResource;", "getSecondaryText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TopBarData {
        public static final int $stable = StringResource.$stable;
        private final StringResource primaryText;
        private final String secondaryText;

        public static /* synthetic */ TopBarData copy$default(TopBarData topBarData, StringResource stringResource, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = topBarData.primaryText;
            }
            if ((i & 2) != 0) {
                str = topBarData.secondaryText;
            }
            return topBarData.copy(stringResource, str);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getPrimaryText() {
            return this.primaryText;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSecondaryText() {
            return this.secondaryText;
        }

        public final TopBarData copy(StringResource primaryText, String secondaryText) {
            return new TopBarData(primaryText, secondaryText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TopBarData)) {
                return false;
            }
            TopBarData topBarData = (TopBarData) other;
            return Intrinsics.areEqual(this.primaryText, topBarData.primaryText) && Intrinsics.areEqual(this.secondaryText, topBarData.secondaryText);
        }

        public int hashCode() {
            StringResource stringResource = this.primaryText;
            int iHashCode = (stringResource == null ? 0 : stringResource.hashCode()) * 31;
            String str = this.secondaryText;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "TopBarData(primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ")";
        }

        public TopBarData(StringResource stringResource, String str) {
            this.primaryText = stringResource;
            this.secondaryText = str;
        }

        public final StringResource getPrimaryText() {
            return this.primaryText;
        }

        public final String getSecondaryText() {
            return this.secondaryText;
        }
    }

    /* compiled from: EventDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/event/detail/EventDetailViewState$DuelContractHeader;", "", "leftContract", "Lcom/robinhood/android/event/detail/duel/DuelEventContractUiDetail;", "rightContract", "showLiveActivity", "", "<init>", "(Lcom/robinhood/android/event/detail/duel/DuelEventContractUiDetail;Lcom/robinhood/android/event/detail/duel/DuelEventContractUiDetail;Z)V", "getLeftContract", "()Lcom/robinhood/android/event/detail/duel/DuelEventContractUiDetail;", "getRightContract", "getShowLiveActivity", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DuelContractHeader {
        public static final int $stable = 0;
        private final DuelEventContractUiDetail leftContract;
        private final DuelEventContractUiDetail rightContract;
        private final boolean showLiveActivity;

        public static /* synthetic */ DuelContractHeader copy$default(DuelContractHeader duelContractHeader, DuelEventContractUiDetail duelEventContractUiDetail, DuelEventContractUiDetail duelEventContractUiDetail2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                duelEventContractUiDetail = duelContractHeader.leftContract;
            }
            if ((i & 2) != 0) {
                duelEventContractUiDetail2 = duelContractHeader.rightContract;
            }
            if ((i & 4) != 0) {
                z = duelContractHeader.showLiveActivity;
            }
            return duelContractHeader.copy(duelEventContractUiDetail, duelEventContractUiDetail2, z);
        }

        /* renamed from: component1, reason: from getter */
        public final DuelEventContractUiDetail getLeftContract() {
            return this.leftContract;
        }

        /* renamed from: component2, reason: from getter */
        public final DuelEventContractUiDetail getRightContract() {
            return this.rightContract;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShowLiveActivity() {
            return this.showLiveActivity;
        }

        public final DuelContractHeader copy(DuelEventContractUiDetail leftContract, DuelEventContractUiDetail rightContract, boolean showLiveActivity) {
            return new DuelContractHeader(leftContract, rightContract, showLiveActivity);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DuelContractHeader)) {
                return false;
            }
            DuelContractHeader duelContractHeader = (DuelContractHeader) other;
            return Intrinsics.areEqual(this.leftContract, duelContractHeader.leftContract) && Intrinsics.areEqual(this.rightContract, duelContractHeader.rightContract) && this.showLiveActivity == duelContractHeader.showLiveActivity;
        }

        public int hashCode() {
            DuelEventContractUiDetail duelEventContractUiDetail = this.leftContract;
            int iHashCode = (duelEventContractUiDetail == null ? 0 : duelEventContractUiDetail.hashCode()) * 31;
            DuelEventContractUiDetail duelEventContractUiDetail2 = this.rightContract;
            return ((iHashCode + (duelEventContractUiDetail2 != null ? duelEventContractUiDetail2.hashCode() : 0)) * 31) + Boolean.hashCode(this.showLiveActivity);
        }

        public String toString() {
            return "DuelContractHeader(leftContract=" + this.leftContract + ", rightContract=" + this.rightContract + ", showLiveActivity=" + this.showLiveActivity + ")";
        }

        public DuelContractHeader(DuelEventContractUiDetail duelEventContractUiDetail, DuelEventContractUiDetail duelEventContractUiDetail2, boolean z) {
            this.leftContract = duelEventContractUiDetail;
            this.rightContract = duelEventContractUiDetail2;
            this.showLiveActivity = z;
        }

        public final DuelEventContractUiDetail getLeftContract() {
            return this.leftContract;
        }

        public final DuelEventContractUiDetail getRightContract() {
            return this.rightContract;
        }

        public final boolean getShowLiveActivity() {
            return this.showLiveActivity;
        }
    }
}
