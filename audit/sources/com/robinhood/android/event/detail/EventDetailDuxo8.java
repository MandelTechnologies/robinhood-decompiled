package com.robinhood.android.event.detail;

import com.robinhood.android.event.detail.EventDetailViewState;
import com.robinhood.android.event.detail.builders.BreakingNewsInputData;
import com.robinhood.android.event.detail.builders.BuildEventChartUiState;
import com.robinhood.android.event.detail.builders.BuildMultiContractList;
import com.robinhood.android.event.detail.builders.BuildMultiTradeBarData;
import com.robinhood.android.event.detail.builders.ContractListData;
import com.robinhood.android.event.detail.multi.MultiTradeBarUiState;
import com.robinhood.android.event.detail.p129ui.bottomsheets.EventDetailDisplayDataBottomSheet;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor2;
import com.robinhood.android.eventcontracts.sharedeventui.animation.Delta;
import com.robinhood.android.eventcontracts.sharedeventui.chart.EventChartLabelItem;
import com.robinhood.android.eventcontracts.sharedeventui.timeline.BuildTimelineSection;
import com.robinhood.android.eventcontracts.sharedeventui.timeline.EventTimelineRowData;
import com.robinhood.android.eventcontracts.sharedeventui.util.BuildHistoryPreviewFilterForEvent;
import com.robinhood.android.eventcontracts.sharedeventui.util.EventContractHistoryFilterState;
import com.robinhood.android.futures.charts.EventContractChartArg;
import com.robinhood.android.lib.futures.trade.MarketSessionChangeDataState;
import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p186db.arsenal.EventContractTradability;
import com.robinhood.android.models.event.p186db.arsenal.EventViewMode;
import com.robinhood.android.models.event.p186db.ceres.UiEventContractPosition;
import com.robinhood.android.models.event.p186db.marketdata.EventFundamental;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.android.models.event.p186db.order.UiEventOrder;
import com.robinhood.android.models.event.p187ui.UiEcEvent;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.android.models.futures.p189db.FuturesAccount2;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.utils.Either;
import com.robinhood.utils.Optional;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: EventDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/event/detail/EventDetailStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/event/detail/EventDetailDuelDataState;", "Lcom/robinhood/android/event/detail/EventDetailViewState;", "<init>", "()V", "loadingState", "dataState", "reduce", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.detail.EventDetailStateProvider, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventDetailDuxo8 implements StateProvider<EventDetailDuelDataState, EventDetailViewState> {
    public static final int $stable = 0;
    public static final EventDetailDuxo8 INSTANCE = new EventDetailDuxo8();

    private EventDetailDuxo8() {
    }

    private final EventDetailViewState loadingState(EventDetailDuelDataState dataState) {
        return new EventDetailViewState(dataState.getIndividualAccountNumber(), dataState.getUiEvent(), null, null, null, null, false, null, null, BuildEventChartUiState.buildEventChartUiState(null, null, null, null, null, null, null, null), null, null, null, null, false, null, null, null, dataState.getSelectedDisplayMode(), null, null, EventViewMode.UNSPECIFIED, null, null, 12582912, null);
    }

    @Override // com.robinhood.android.udf.StateProvider
    public EventDetailViewState reduce(EventDetailDuelDataState dataState) {
        String str;
        ImmutableList3 persistentList;
        StringResource stringResource;
        EventContractChartArg eventContractChartArg;
        ImmutableList3 persistentList2;
        Either left;
        boolean z;
        MultiTradeBarUiState multiTradeBarUiStateBuildMultiTradeBarData;
        ImmutableList immutableListPersistentListOf;
        ImmutableList3 persistentList3;
        ContractListData contractListData;
        EventContract contract;
        ContractListData contractListData2;
        EventContract contract2;
        ContractListData contractListData3;
        EventContract contract3;
        ContractListData contractListData4;
        EventContract contract4;
        ContractListData contractListData5;
        EventContract contract5;
        EventContractChartArg eventContractChartArgCreate$default;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        UiEcEvent uiEvent = dataState.getUiEvent();
        Optional<FuturesAccount> swapAccount = dataState.getSwapAccount();
        if (uiEvent == null || !uiEvent.isActive() || swapAccount == null) {
            return loadingState(dataState);
        }
        String individualAccountNumber = dataState.getIndividualAccountNumber();
        UiEcEvent uiEvent2 = dataState.getUiEvent();
        MarketSessionChangeDataState marketSessionChangeDataState = dataState.getMarketSessionChangeDataState();
        StringResource headerString = marketSessionChangeDataState != null ? marketSessionChangeDataState.getHeaderString() : null;
        Optional<String> title = dataState.getTitle();
        EventDetailViewState.TopBarData topBarData = dataState.getTopBarData();
        StringResource stringResource2 = headerString;
        Either<EventDetailViewState.DuelContractHeader, ImmutableList<EventChartLabelItem>> contractHeader = dataState.getContractHeader();
        List<ContractListData> contractDataListForChart = dataState.getContractDataListForChart();
        if (contractDataListForChart != null) {
            List<ContractListData> list = contractDataListForChart;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ContractListData) it.next()).getContract().getContractId());
            }
            str = individualAccountNumber;
            persistentList = extensions2.toPersistentList(arrayList);
        } else {
            str = individualAccountNumber;
            persistentList = null;
        }
        List<ContractListData> contractDataListForChart2 = dataState.getContractDataListForChart();
        if (contractDataListForChart2 != null) {
            DisplaySpan chartActiveSpan = dataState.getChartActiveSpan();
            if (chartActiveSpan != null) {
                EventContractChartArg.Companion companion = EventContractChartArg.INSTANCE;
                List<ContractListData> list2 = contractDataListForChart2;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((ContractListData) it2.next()).getContract().getContractId());
                }
                eventContractChartArgCreate$default = EventContractChartArg.Companion.create$default(companion, arrayList2, chartActiveSpan, false, 4, null);
            } else {
                eventContractChartArgCreate$default = null;
            }
            stringResource = stringResource2;
            eventContractChartArg = eventContractChartArgCreate$default;
        } else {
            stringResource = stringResource2;
            eventContractChartArg = null;
        }
        List<ContractListData> contractDataListForChart3 = dataState.getContractDataListForChart();
        DayNightColor dayNightColor = (contractDataListForChart3 == null || (contractListData5 = (ContractListData) CollectionsKt.getOrNull(contractDataListForChart3, 0)) == null || (contract5 = contractListData5.getContract()) == null) ? null : DayNightColor2.getDayNightColor(contract5);
        List<ContractListData> contractDataListForChart4 = dataState.getContractDataListForChart();
        DayNightColor dayNightColor2 = (contractDataListForChart4 == null || (contractListData4 = (ContractListData) CollectionsKt.getOrNull(contractDataListForChart4, 1)) == null || (contract4 = contractListData4.getContract()) == null) ? null : DayNightColor2.getDayNightColor(contract4);
        List<ContractListData> contractDataListForChart5 = dataState.getContractDataListForChart();
        DayNightColor dayNightColor3 = (contractDataListForChart5 == null || (contractListData3 = (ContractListData) CollectionsKt.getOrNull(contractDataListForChart5, 2)) == null || (contract3 = contractListData3.getContract()) == null) ? null : DayNightColor2.getDayNightColor(contract3);
        List<ContractListData> contractDataListForChart6 = dataState.getContractDataListForChart();
        DayNightColor dayNightColor4 = (contractDataListForChart6 == null || (contractListData2 = (ContractListData) CollectionsKt.getOrNull(contractDataListForChart6, 3)) == null || (contract2 = contractListData2.getContract()) == null) ? null : DayNightColor2.getDayNightColor(contract2);
        List<ContractListData> contractDataListForChart7 = dataState.getContractDataListForChart();
        EventChartUiState eventChartUiStateBuildEventChartUiState = BuildEventChartUiState.buildEventChartUiState(dayNightColor, dayNightColor2, dayNightColor3, dayNightColor4, (contractDataListForChart7 == null || (contractListData = (ContractListData) CollectionsKt.getOrNull(contractDataListForChart7, 4)) == null || (contract = contractListData.getContract()) == null) ? null : DayNightColor2.getDayNightColor(contract), dataState.getChart(), dataState.getChartActiveSpan(), dataState.getScrubbedPoint());
        if (dataState.getViewMode() == EventViewMode.MULTI) {
            ImmutableList<ContractListData> contractDataList = dataState.getContractDataList();
            if (contractDataList != null) {
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(contractDataList, 10));
                for (ContractListData contractListData6 : contractDataList) {
                    EventFundamental eventFundamental = dataState.getContractIdToFundamentals().get(contractListData6.getContract().getContractId());
                    Integer openInterest = eventFundamental != null ? eventFundamental.getOpenInterest() : null;
                    List<Delta> list3 = dataState.getContractIdToOpenInterestDeltas().get(contractListData6.getContract().getContractId());
                    Delta delta = list3 != null ? (Delta) CollectionsKt.lastOrNull((List) list3) : null;
                    FuturesAccount orNull = swapAccount.getOrNull();
                    arrayList3.add(BuildMultiContractList.buildContractSelectorRowTreatmentViewState$default(contractListData6, true, false, openInterest, delta, (dataState.getMarketOpen() || orNull == null || !FuturesAccount2.signedAttestation(orNull, uiEvent.getEvent().getAttestation())) && contractListData6.getContract().getTradability() != EventContractTradability.UNTRADABLE, 4, null));
                }
                persistentList3 = extensions2.toPersistentList(arrayList3);
            } else {
                persistentList3 = null;
            }
            left = new Either.Right(persistentList3);
        } else {
            ImmutableList<ContractListData> contractDataList2 = dataState.getContractDataList();
            if (contractDataList2 != null) {
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(contractDataList2, 10));
                Iterator<ContractListData> it3 = contractDataList2.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(BuildMultiContractList.buildContractSelectorRowControlViewState(it3.next()));
                }
                persistentList2 = extensions2.toPersistentList(arrayList4);
            } else {
                persistentList2 = null;
            }
            left = new Either.Left(persistentList2);
        }
        Either either = left;
        String str2 = str;
        UUID selectedContractId = dataState.getSelectedContractId();
        EventContractHistoryFilterState eventContractHistoryFilterStateBuildUpcomingActivityPreviewFilterForEvent = BuildHistoryPreviewFilterForEvent.buildUpcomingActivityPreviewFilterForEvent(swapAccount.getOrNull(), uiEvent.getEvent().getEventId());
        EventContractHistoryFilterState eventContractHistoryFilterStateBuildHistoryPreviewFilterForEvent = BuildHistoryPreviewFilterForEvent.buildHistoryPreviewFilterForEvent(swapAccount.getOrNull(), uiEvent.getEvent().getEventId());
        Map<UUID, UiEventContractPosition> contractIdToPositions = dataState.getContractIdToPositions();
        if (contractIdToPositions == null || contractIdToPositions.isEmpty()) {
            z = false;
        } else {
            Iterator<Map.Entry<UUID, UiEventContractPosition>> it4 = contractIdToPositions.entrySet().iterator();
            while (it4.hasNext()) {
                if (!BigDecimals7.isZero(it4.next().getValue().getQuantity())) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        ImmutableList<EventTimelineRowData> immutableListBuildTimelineSection = BuildTimelineSection.buildTimelineSection(dataState.getEventTimeline());
        String longDescription = uiEvent.getEvent().getLongDescription();
        EventContract selectedContract = dataState.getSelectedContract();
        if (selectedContract == null || dataState.getViewMode() != EventViewMode.PAIR) {
            multiTradeBarUiStateBuildMultiTradeBarData = null;
        } else {
            boolean marketOpen = dataState.getMarketOpen();
            FuturesAccount orNull2 = swapAccount.getOrNull();
            Map<UUID, EventQuote> contractIdToQuotes = dataState.getContractIdToQuotes();
            EventQuote eventQuote = contractIdToQuotes != null ? contractIdToQuotes.get(selectedContract.getContractId()) : null;
            Map<UUID, UiEventContractPosition> contractIdToPositions2 = dataState.getContractIdToPositions();
            UiEventContractPosition uiEventContractPosition = contractIdToPositions2 != null ? contractIdToPositions2.get(selectedContract.getContractId()) : null;
            Map<UUID, List<UiEventOrder>> contractIdToPendingOrders = dataState.getContractIdToPendingOrders();
            List<UiEventOrder> listEmptyList = contractIdToPendingOrders != null ? contractIdToPendingOrders.get(selectedContract.getContractId()) : null;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            multiTradeBarUiStateBuildMultiTradeBarData = BuildMultiTradeBarData.buildMultiTradeBarData(marketOpen, orNull2, uiEvent, selectedContract, eventQuote, uiEventContractPosition, listEmptyList);
        }
        StringResource stringResource3 = stringResource;
        boolean z2 = z;
        EventDetailDisplayDataBottomSheet selectedDisplayMode = dataState.getSelectedDisplayMode();
        boolean zIsInEcSportsExperiment = dataState.isInEcSportsExperiment();
        EventDetailLiveDataSectionViewState liveDataSection = dataState.getLiveDataSection();
        List<String> prohibitionRules = uiEvent.getEvent().getProhibitionRules();
        if (prohibitionRules == null || (immutableListPersistentListOf = extensions2.toImmutableList(prohibitionRules)) == null) {
            immutableListPersistentListOf = extensions2.persistentListOf();
        }
        return new EventDetailViewState(str2, uiEvent2, stringResource3, topBarData, title, contractHeader, zIsInEcSportsExperiment, persistentList, eventContractChartArg, eventChartUiStateBuildEventChartUiState, either, selectedContractId, eventContractHistoryFilterStateBuildUpcomingActivityPreviewFilterForEvent, eventContractHistoryFilterStateBuildHistoryPreviewFilterForEvent, z2, immutableListBuildTimelineSection, longDescription, multiTradeBarUiStateBuildMultiTradeBarData, selectedDisplayMode, liveDataSection, immutableListPersistentListOf, dataState.getViewMode(), dataState.getEventTradeOverlayDialogData(), new BreakingNewsInputData(uiEvent.getEvent().getEventId(), dataState.getIndividualAccountNumber()));
    }
}
