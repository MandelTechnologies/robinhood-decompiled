package com.robinhood.android.event.gamedetail;

import com.robinhood.android.event.gamedetail.GameDetailViewState;
import com.robinhood.android.event.gamedetail.builders.AboutEventType;
import com.robinhood.android.event.gamedetail.builders.BuildGameDetailAbout2;
import com.robinhood.android.event.gamedetail.builders.BuildGameDetailHeaderState;
import com.robinhood.android.event.gamedetail.builders.BuildGameDetailPositions;
import com.robinhood.android.event.gamedetail.builders.HeaderState;
import com.robinhood.android.event.gamedetail.builders.TitleState;
import com.robinhood.android.event.gamedetail.builders.combo.BuildGameDetailComboBottomSheetViewState;
import com.robinhood.android.event.gamedetail.builders.combo.BuildGameDetailComboTradeBarState;
import com.robinhood.android.event.gamedetail.combostates.GameDetailComboBottomSheetContentViewState;
import com.robinhood.android.event.gamedetail.combostates.GameDetailSelectionState;
import com.robinhood.android.event.gamedetail.components.GameDetailTradeBarState;
import com.robinhood.android.event.gamedetail.components.bottomsheet.GameDetailBottomSheetState;
import com.robinhood.android.event.gamedetail.p130ui.chart.ChartState;
import com.robinhood.android.event.gamedetail.p130ui.position.GameDetailPositionRowState;
import com.robinhood.android.eventcontracts.models.event.ContractIdWithSide;
import com.robinhood.android.eventcontracts.sharedeventui.timeline.BuildTimelineSection;
import com.robinhood.android.eventcontracts.sharedeventui.timeline.EventTimelineRowData;
import com.robinhood.android.eventcontracts.sharedeventui.util.BuildHistoryPreviewFilterForEvent;
import com.robinhood.android.eventcontracts.sharedeventui.util.EventContractHistoryFilterState;
import com.robinhood.android.futures.charts.EventContractChartArg;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.futures.trade.MarketSessionChangeDataState;
import com.robinhood.android.models.event.p186db.arsenal.Event;
import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p186db.ceres.UiEventContractPosition;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractDisplayDetails;
import com.robinhood.android.models.event.p186db.predictionmarkets.PredictionMarketEventState;
import com.robinhood.android.models.event.p187ui.UiEcEvent;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.utils.Optional;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: GameDetailStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/GameDetailStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;", "Lcom/robinhood/android/event/gamedetail/GameDetailViewState;", "<init>", "()V", "reduce", "dataState", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class GameDetailStateProvider implements StateProvider<GameDetailDataState, GameDetailViewState> {
    public static final int $stable = 0;
    public static final GameDetailStateProvider INSTANCE = new GameDetailStateProvider();

    private GameDetailStateProvider() {
    }

    @Override // com.robinhood.android.udf.StateProvider
    public GameDetailViewState reduce(GameDetailDataState dataState) {
        Context context;
        ImmutableList3 persistentList;
        GameDetailViewState.VolumeState volumeState;
        ImmutableList3 immutableList3;
        ImmutableList3 persistentList2;
        ImmutableList3 immutableList32;
        EventContractHistoryFilterState eventContractHistoryFilterStateBuildUpcomingActivityPreviewFilterForEvent;
        EventContractChartArg eventContractChartArg;
        ImmutableList<EventTimelineRowData> immutableList;
        EventContractHistoryFilterState eventContractHistoryFilterStateBuildHistoryPreviewFilterForEvent;
        Event event;
        UUID eventId;
        Event event2;
        UUID eventId2;
        Event event3;
        List<String> prohibitionRules;
        FuturesAccount orNull;
        Event event4;
        UUID eventId3;
        Event event5;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        Map<UUID, UiEventContractPosition> contractIdToPositionsForCurrentGame = dataState.getContractIdToPositionsForCurrentGame();
        List<GameDetailPositionRowState> listBuildGameDetailPositionRows = (contractIdToPositionsForCurrentGame == null || !dataState.getHasPositions()) ? null : BuildGameDetailPositions.buildGameDetailPositionRows(contractIdToPositionsForCurrentGame, dataState.getContractIdToQuotes(), dataState.getBottomSheetSelection(), dataState.getComboSelection(), dataState.getDisplayDetails(), dataState.isInPricePayoutExperiment());
        List<AboutEventType> listBuildAboutEventTypes = BuildGameDetailAbout2.buildAboutEventTypes(dataState.getContractGroup(), dataState.getPrepacksContractGroup(), dataState.getPlayerPropsGroupSection());
        AboutEventType selectedAboutEventType = dataState.getSelectedAboutEventType();
        if (selectedAboutEventType == null) {
            selectedAboutEventType = (AboutEventType) CollectionsKt.firstOrNull((List) listBuildAboutEventTypes);
        }
        AboutEventType aboutEventType = selectedAboutEventType;
        GameDetailSelectionState comboSelection = dataState.getComboSelection();
        Map<ContractIdWithSide, ContractDisplayDetails> comboSheetDisplayDetails = dataState.getComboSheetDisplayDetails();
        Map<UUID, EventQuote> contractIdToQuotes = dataState.getContractIdToQuotes();
        Map<UUID, UiEventContractPosition> contractIdToPositionsForCurrentGame2 = dataState.getContractIdToPositionsForCurrentGame();
        if (contractIdToPositionsForCurrentGame2 == null) {
            contractIdToPositionsForCurrentGame2 = MapsKt.emptyMap();
        }
        GameDetailComboBottomSheetContentViewState gameDetailComboBottomSheetContentViewStateBuildGameDetailComboBottomSheetContentViewState = BuildGameDetailComboBottomSheetViewState.buildGameDetailComboBottomSheetContentViewState(comboSelection, comboSheetDisplayDetails, contractIdToQuotes, contractIdToPositionsForCurrentGame2, dataState.getComboSelectedStrikeContracts());
        UiEcEvent event6 = dataState.getEvent();
        UUID eventId4 = (event6 == null || (event5 = event6.getEvent()) == null) ? null : event5.getEventId();
        UiEcEvent event7 = dataState.getEvent();
        if (event7 == null || (event4 = event7.getEvent()) == null || (eventId3 = event4.getEventId()) == null) {
            context = null;
        } else {
            String string2 = eventId3.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            context = new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, new Asset(string2, null, null, null, 14, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16385, -1, -1, -1, -1, -1, 16383, null);
        }
        String individualAccountNumber = dataState.getIndividualAccountNumber();
        Optional<FuturesAccount> swapAccount = dataState.getSwapAccount();
        UUID id = (swapAccount == null || (orNull = swapAccount.getOrNull()) == null) ? null : orNull.getId();
        TitleState titleState = dataState.getTitleState();
        HeaderState headerStateBuildGameDetailHeaderState = BuildGameDetailHeaderState.buildGameDetailHeaderState(dataState.getEvent(), dataState.getEventState(), dataState.getShouldMirrorSecondContractImage());
        List<EventContract> contractsForChart = dataState.getContractsForChart();
        if (contractsForChart != null) {
            List<EventContract> list = contractsForChart;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((EventContract) it.next()).getContractId());
            }
            persistentList = extensions2.toPersistentList(arrayList);
        } else {
            persistentList = null;
        }
        EventContractChartArg chartArgs = dataState.getChartArgs();
        ChartState chartState = dataState.getChartState();
        PredictionMarketEventState eventState = dataState.getEventState();
        if (eventState != null) {
            BigDecimal totalVolumeOfAllContracts = eventState.getTotalVolumeOfAllContracts();
            volumeState = new GameDetailViewState.VolumeState((totalVolumeOfAllContracts == null || !BigDecimals7.isPositive(totalVolumeOfAllContracts)) ? null : Formats.getLowPrecisionCurrencyFormat().format(totalVolumeOfAllContracts), eventState.getTotalOpenInterestOfAllContracts() > 0 ? Formats.getIntegerFormat().format(Long.valueOf(eventState.getTotalOpenInterestOfAllContracts())) : null);
        } else {
            volumeState = null;
        }
        GameDetailViewState.PositionState positionState = new GameDetailViewState.PositionState(listBuildGameDetailPositionRows != null ? extensions2.toPersistentList(listBuildGameDetailPositionRows) : null);
        GameDetailViewState.SixBoxState sixBoxState = dataState.getSixBoxState();
        ImmutableList3 persistentList3 = extensions2.toPersistentList(listBuildAboutEventTypes);
        UiEcEvent event8 = dataState.getEvent();
        if (event8 == null || (event3 = event8.getEvent()) == null || (prohibitionRules = event3.getProhibitionRules()) == null) {
            immutableList3 = persistentList;
            persistentList2 = null;
        } else {
            immutableList3 = persistentList;
            persistentList2 = extensions2.toPersistentList(prohibitionRules);
        }
        ImmutableList<EventTimelineRowData> immutableListBuildTimelineSection = BuildTimelineSection.buildTimelineSection(dataState.getEventTimeline());
        GameDetailBottomSheetState bottomSheetState = dataState.getBottomSheetState();
        GameDetailViewState.VolumeState volumeState2 = volumeState;
        GameDetailTradeBarState tradeBarState = dataState.getTradeBarState();
        UiEcEvent event9 = dataState.getEvent();
        if (event9 == null || (event2 = event9.getEvent()) == null || (eventId2 = event2.getEventId()) == null) {
            immutableList32 = immutableList3;
            eventContractHistoryFilterStateBuildUpcomingActivityPreviewFilterForEvent = null;
        } else {
            Optional<FuturesAccount> swapAccount2 = dataState.getSwapAccount();
            immutableList32 = immutableList3;
            eventContractHistoryFilterStateBuildUpcomingActivityPreviewFilterForEvent = BuildHistoryPreviewFilterForEvent.buildUpcomingActivityPreviewFilterForEvent(swapAccount2 != null ? swapAccount2.getOrNull() : null, eventId2);
        }
        UiEcEvent event10 = dataState.getEvent();
        if (event10 == null || (event = event10.getEvent()) == null || (eventId = event.getEventId()) == null) {
            eventContractChartArg = chartArgs;
            immutableList = immutableListBuildTimelineSection;
            eventContractHistoryFilterStateBuildHistoryPreviewFilterForEvent = null;
        } else {
            Optional<FuturesAccount> swapAccount3 = dataState.getSwapAccount();
            eventContractChartArg = chartArgs;
            immutableList = immutableListBuildTimelineSection;
            eventContractHistoryFilterStateBuildHistoryPreviewFilterForEvent = BuildHistoryPreviewFilterForEvent.buildHistoryPreviewFilterForEvent(swapAccount3 != null ? swapAccount3.getOrNull() : null, eventId);
        }
        boolean zIsInAmericanOddsExperiment = dataState.isInAmericanOddsExperiment();
        MarketSessionChangeDataState marketSessionChangeDataState = dataState.getMarketSessionChangeDataState();
        return new GameDetailViewState(eventId4, context, individualAccountNumber, id, titleState, headerStateBuildGameDetailHeaderState, immutableList32, eventContractChartArg, chartState, volumeState2, positionState, sixBoxState, persistentList3, aboutEventType, persistentList2, immutableList, bottomSheetState, tradeBarState, eventContractHistoryFilterStateBuildUpcomingActivityPreviewFilterForEvent, eventContractHistoryFilterStateBuildHistoryPreviewFilterForEvent, dataState.getLastPlayState(), zIsInAmericanOddsExperiment, marketSessionChangeDataState != null ? marketSessionChangeDataState.getHeaderString() : null, dataState.getPrepacksState(), dataState.getShowAmericanOdds(), dataState.getPlayerPropsState(), dataState.isComboEnabled(), gameDetailComboBottomSheetContentViewStateBuildGameDetailComboBottomSheetContentViewState, BuildGameDetailComboTradeBarState.buildGameDetailComboTradeBarState(dataState.getSwapAccount(), dataState.getEvent(), gameDetailComboBottomSheetContentViewStateBuildGameDetailComboBottomSheetContentViewState, dataState.getContractIdToPositionsForCurrentGame(), dataState.getContractIdToQuotes(), dataState.getPendingOrders(), dataState.getMarketOpen(), dataState.getComboQuoteResult(), dataState.getAllContractIdsToEventContract()));
    }
}
