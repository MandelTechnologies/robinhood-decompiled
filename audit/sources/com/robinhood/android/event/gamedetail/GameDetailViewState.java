package com.robinhood.android.event.gamedetail;

import com.robinhood.android.event.gamedetail.builders.AboutEventType;
import com.robinhood.android.event.gamedetail.builders.HeaderState;
import com.robinhood.android.event.gamedetail.builders.TitleState;
import com.robinhood.android.event.gamedetail.combostates.GameDetailComboBottomSheetContentViewState;
import com.robinhood.android.event.gamedetail.components.ContractRowHeaderState;
import com.robinhood.android.event.gamedetail.components.ContractRowState;
import com.robinhood.android.event.gamedetail.components.GameDetailLastPlayState;
import com.robinhood.android.event.gamedetail.components.GameDetailTradeBarState;
import com.robinhood.android.event.gamedetail.components.PrepacksState;
import com.robinhood.android.event.gamedetail.components.bottomsheet.GameDetailBottomSheetState;
import com.robinhood.android.event.gamedetail.p130ui.chart.ChartState;
import com.robinhood.android.event.gamedetail.p130ui.combo.GameDetailComboTradeBarState;
import com.robinhood.android.event.gamedetail.p130ui.position.GameDetailPositionRowState;
import com.robinhood.android.event.gamedetail.p130ui.props.PlayerPropsState;
import com.robinhood.android.eventcontracts.sharedeventui.timeline.EventTimelineRowData;
import com.robinhood.android.eventcontracts.sharedeventui.util.EventContractHistoryFilterState;
import com.robinhood.android.futures.charts.EventContractChartArg;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: GameDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bU\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0006\u008e\u0001\u008f\u0001\u0090\u0001BÁ\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000f\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u000f\u0012\b\u0010 \u001a\u0004\u0018\u00010!\u0012\u0006\u0010\"\u001a\u00020#\u0012\b\u0010$\u001a\u0004\u0018\u00010%\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010'\u001a\u0004\u0018\u00010(\u0012\b\b\u0002\u0010)\u001a\u00020*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,\u0012\b\u0010-\u001a\u0004\u0018\u00010.\u0012\u0006\u0010/\u001a\u00020*\u0012\b\u00100\u001a\u0004\u0018\u000101\u0012\u0006\u00102\u001a\u00020*\u0012\b\b\u0002\u00103\u001a\u000204\u0012\u0006\u00105\u001a\u000206¢\u0006\u0004\b7\u00108J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010l\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010o\u001a\u00020\u000bHÆ\u0003J\t\u0010p\u001a\u00020\rHÆ\u0003J\u0011\u0010q\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fHÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u0010s\u001a\u00020\u0013HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000f\u0010w\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000fHÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u0011\u0010y\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000fHÆ\u0003J\u0011\u0010z\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u000fHÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010!HÆ\u0003J\t\u0010|\u001a\u00020#HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010%HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010%HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010(HÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020*HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010,HÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010.HÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020*HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u000101HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020*HÆ\u0003J\n\u0010\u0086\u0001\u001a\u000204HÆ\u0003J\n\u0010\u0087\u0001\u001a\u000206HÆ\u0003Jð\u0002\u0010\u0088\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u000f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\"\u001a\u00020#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010)\u001a\u00020*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.2\b\b\u0002\u0010/\u001a\u00020*2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u00020*2\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u000206HÆ\u0001J\u0015\u0010\u0089\u0001\u001a\u00020*2\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010\u008b\u0001\u001a\u00030\u008c\u0001HÖ\u0001J\n\u0010\u008d\u0001\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0019\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010:R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000f¢\u0006\b\n\u0000\u001a\u0004\bP\u0010ER\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0019\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bS\u0010ER\u0019\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bT\u0010ER\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0011\u0010\"\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u0013\u0010$\u001a\u0004\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u0013\u0010&\u001a\u0004\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\b[\u0010ZR\u0013\u0010'\u001a\u0004\u0018\u00010(¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010]R\u0011\u0010)\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\b^\u0010_R\u0013\u0010+\u001a\u0004\u0018\u00010,¢\u0006\b\n\u0000\u001a\u0004\b`\u0010aR\u0013\u0010-\u001a\u0004\u0018\u00010.¢\u0006\b\n\u0000\u001a\u0004\bb\u0010cR\u0011\u0010/\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\bd\u0010_R\u0013\u00100\u001a\u0004\u0018\u000101¢\u0006\b\n\u0000\u001a\u0004\be\u0010fR\u0011\u00102\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\b2\u0010_R\u0011\u00103\u001a\u000204¢\u0006\b\n\u0000\u001a\u0004\bg\u0010hR\u0011\u00105\u001a\u000206¢\u0006\b\n\u0000\u001a\u0004\bi\u0010j¨\u0006\u0091\u0001"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/GameDetailViewState;", "", "eventId", "Ljava/util/UUID;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "individualAccountNumber", "", "swapsAccountId", "titleState", "Lcom/robinhood/android/event/gamedetail/builders/TitleState;", "headerState", "Lcom/robinhood/android/event/gamedetail/builders/HeaderState;", "contractIdsForChart", "Lkotlinx/collections/immutable/ImmutableList;", "chartArgs", "Lcom/robinhood/android/futures/charts/EventContractChartArg;", "chartState", "Lcom/robinhood/android/event/gamedetail/ui/chart/ChartState;", "volumeState", "Lcom/robinhood/android/event/gamedetail/GameDetailViewState$VolumeState;", "positionState", "Lcom/robinhood/android/event/gamedetail/GameDetailViewState$PositionState;", "sixBoxState", "Lcom/robinhood/android/event/gamedetail/GameDetailViewState$SixBoxState;", "aboutEventTypes", "Lcom/robinhood/android/event/gamedetail/builders/AboutEventType;", "selectedAboutEventType", "tradingProhibitionRules", "timeline", "Lcom/robinhood/android/eventcontracts/sharedeventui/timeline/EventTimelineRowData;", "bottomSheetState", "Lcom/robinhood/android/event/gamedetail/components/bottomsheet/GameDetailBottomSheetState;", "tradeBarState", "Lcom/robinhood/android/event/gamedetail/components/GameDetailTradeBarState;", "upcomingActivityFilter", "Lcom/robinhood/android/eventcontracts/sharedeventui/util/EventContractHistoryFilterState;", "historyFilter", "lastPlayState", "Lcom/robinhood/android/event/gamedetail/components/GameDetailLastPlayState;", "showSettingsSection", "", "marketClosedBanner", "Lcom/robinhood/utils/resource/StringResource;", "prepacksState", "Lcom/robinhood/android/event/gamedetail/components/PrepacksState;", "showAmericanOdds", "playerPropsState", "Lcom/robinhood/android/event/gamedetail/ui/props/PlayerPropsState;", "isCombosEnabled", "comboSheetViewState", "Lcom/robinhood/android/event/gamedetail/combostates/GameDetailComboBottomSheetContentViewState;", "comboTradeBarState", "Lcom/robinhood/android/event/gamedetail/ui/combo/GameDetailComboTradeBarState;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/rosetta/eventlogging/Context;Ljava/lang/String;Ljava/util/UUID;Lcom/robinhood/android/event/gamedetail/builders/TitleState;Lcom/robinhood/android/event/gamedetail/builders/HeaderState;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/futures/charts/EventContractChartArg;Lcom/robinhood/android/event/gamedetail/ui/chart/ChartState;Lcom/robinhood/android/event/gamedetail/GameDetailViewState$VolumeState;Lcom/robinhood/android/event/gamedetail/GameDetailViewState$PositionState;Lcom/robinhood/android/event/gamedetail/GameDetailViewState$SixBoxState;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/event/gamedetail/builders/AboutEventType;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/event/gamedetail/components/bottomsheet/GameDetailBottomSheetState;Lcom/robinhood/android/event/gamedetail/components/GameDetailTradeBarState;Lcom/robinhood/android/eventcontracts/sharedeventui/util/EventContractHistoryFilterState;Lcom/robinhood/android/eventcontracts/sharedeventui/util/EventContractHistoryFilterState;Lcom/robinhood/android/event/gamedetail/components/GameDetailLastPlayState;ZLcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/event/gamedetail/components/PrepacksState;ZLcom/robinhood/android/event/gamedetail/ui/props/PlayerPropsState;ZLcom/robinhood/android/event/gamedetail/combostates/GameDetailComboBottomSheetContentViewState;Lcom/robinhood/android/event/gamedetail/ui/combo/GameDetailComboTradeBarState;)V", "getEventId", "()Ljava/util/UUID;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "getIndividualAccountNumber", "()Ljava/lang/String;", "getSwapsAccountId", "getTitleState", "()Lcom/robinhood/android/event/gamedetail/builders/TitleState;", "getHeaderState", "()Lcom/robinhood/android/event/gamedetail/builders/HeaderState;", "getContractIdsForChart", "()Lkotlinx/collections/immutable/ImmutableList;", "getChartArgs", "()Lcom/robinhood/android/futures/charts/EventContractChartArg;", "getChartState", "()Lcom/robinhood/android/event/gamedetail/ui/chart/ChartState;", "getVolumeState", "()Lcom/robinhood/android/event/gamedetail/GameDetailViewState$VolumeState;", "getPositionState", "()Lcom/robinhood/android/event/gamedetail/GameDetailViewState$PositionState;", "getSixBoxState", "()Lcom/robinhood/android/event/gamedetail/GameDetailViewState$SixBoxState;", "getAboutEventTypes", "getSelectedAboutEventType", "()Lcom/robinhood/android/event/gamedetail/builders/AboutEventType;", "getTradingProhibitionRules", "getTimeline", "getBottomSheetState", "()Lcom/robinhood/android/event/gamedetail/components/bottomsheet/GameDetailBottomSheetState;", "getTradeBarState", "()Lcom/robinhood/android/event/gamedetail/components/GameDetailTradeBarState;", "getUpcomingActivityFilter", "()Lcom/robinhood/android/eventcontracts/sharedeventui/util/EventContractHistoryFilterState;", "getHistoryFilter", "getLastPlayState", "()Lcom/robinhood/android/event/gamedetail/components/GameDetailLastPlayState;", "getShowSettingsSection", "()Z", "getMarketClosedBanner", "()Lcom/robinhood/utils/resource/StringResource;", "getPrepacksState", "()Lcom/robinhood/android/event/gamedetail/components/PrepacksState;", "getShowAmericanOdds", "getPlayerPropsState", "()Lcom/robinhood/android/event/gamedetail/ui/props/PlayerPropsState;", "getComboSheetViewState", "()Lcom/robinhood/android/event/gamedetail/combostates/GameDetailComboBottomSheetContentViewState;", "getComboTradeBarState", "()Lcom/robinhood/android/event/gamedetail/ui/combo/GameDetailComboTradeBarState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "copy", "equals", "other", "hashCode", "", "toString", "VolumeState", "PositionState", "SixBoxState", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GameDetailViewState {
    public static final int $stable = 8;
    private final ImmutableList<AboutEventType> aboutEventTypes;
    private final GameDetailBottomSheetState bottomSheetState;
    private final EventContractChartArg chartArgs;
    private final ChartState chartState;
    private final GameDetailComboBottomSheetContentViewState comboSheetViewState;
    private final GameDetailComboTradeBarState comboTradeBarState;
    private final ImmutableList<UUID> contractIdsForChart;
    private final UUID eventId;
    private final HeaderState headerState;
    private final EventContractHistoryFilterState historyFilter;
    private final String individualAccountNumber;
    private final boolean isCombosEnabled;
    private final GameDetailLastPlayState lastPlayState;
    private final StringResource marketClosedBanner;
    private final PlayerPropsState playerPropsState;
    private final PositionState positionState;
    private final PrepacksState prepacksState;
    private final Context screenEventContext;
    private final AboutEventType selectedAboutEventType;
    private final boolean showAmericanOdds;
    private final boolean showSettingsSection;
    private final SixBoxState sixBoxState;
    private final UUID swapsAccountId;
    private final ImmutableList<EventTimelineRowData> timeline;
    private final TitleState titleState;
    private final GameDetailTradeBarState tradeBarState;
    private final ImmutableList<String> tradingProhibitionRules;
    private final EventContractHistoryFilterState upcomingActivityFilter;
    private final VolumeState volumeState;

    public static /* synthetic */ GameDetailViewState copy$default(GameDetailViewState gameDetailViewState, UUID uuid, Context context, String str, UUID uuid2, TitleState titleState, HeaderState headerState, ImmutableList immutableList, EventContractChartArg eventContractChartArg, ChartState chartState, VolumeState volumeState, PositionState positionState, SixBoxState sixBoxState, ImmutableList immutableList2, AboutEventType aboutEventType, ImmutableList immutableList3, ImmutableList immutableList4, GameDetailBottomSheetState gameDetailBottomSheetState, GameDetailTradeBarState gameDetailTradeBarState, EventContractHistoryFilterState eventContractHistoryFilterState, EventContractHistoryFilterState eventContractHistoryFilterState2, GameDetailLastPlayState gameDetailLastPlayState, boolean z, StringResource stringResource, PrepacksState prepacksState, boolean z2, PlayerPropsState playerPropsState, boolean z3, GameDetailComboBottomSheetContentViewState gameDetailComboBottomSheetContentViewState, GameDetailComboTradeBarState gameDetailComboTradeBarState, int i, Object obj) {
        GameDetailComboTradeBarState gameDetailComboTradeBarState2;
        GameDetailComboBottomSheetContentViewState gameDetailComboBottomSheetContentViewState2;
        UUID uuid3 = (i & 1) != 0 ? gameDetailViewState.eventId : uuid;
        Context context2 = (i & 2) != 0 ? gameDetailViewState.screenEventContext : context;
        String str2 = (i & 4) != 0 ? gameDetailViewState.individualAccountNumber : str;
        UUID uuid4 = (i & 8) != 0 ? gameDetailViewState.swapsAccountId : uuid2;
        TitleState titleState2 = (i & 16) != 0 ? gameDetailViewState.titleState : titleState;
        HeaderState headerState2 = (i & 32) != 0 ? gameDetailViewState.headerState : headerState;
        ImmutableList immutableList5 = (i & 64) != 0 ? gameDetailViewState.contractIdsForChart : immutableList;
        EventContractChartArg eventContractChartArg2 = (i & 128) != 0 ? gameDetailViewState.chartArgs : eventContractChartArg;
        ChartState chartState2 = (i & 256) != 0 ? gameDetailViewState.chartState : chartState;
        VolumeState volumeState2 = (i & 512) != 0 ? gameDetailViewState.volumeState : volumeState;
        PositionState positionState2 = (i & 1024) != 0 ? gameDetailViewState.positionState : positionState;
        SixBoxState sixBoxState2 = (i & 2048) != 0 ? gameDetailViewState.sixBoxState : sixBoxState;
        ImmutableList immutableList6 = (i & 4096) != 0 ? gameDetailViewState.aboutEventTypes : immutableList2;
        AboutEventType aboutEventType2 = (i & 8192) != 0 ? gameDetailViewState.selectedAboutEventType : aboutEventType;
        UUID uuid5 = uuid3;
        ImmutableList immutableList7 = (i & 16384) != 0 ? gameDetailViewState.tradingProhibitionRules : immutableList3;
        ImmutableList immutableList8 = (i & 32768) != 0 ? gameDetailViewState.timeline : immutableList4;
        GameDetailBottomSheetState gameDetailBottomSheetState2 = (i & 65536) != 0 ? gameDetailViewState.bottomSheetState : gameDetailBottomSheetState;
        GameDetailTradeBarState gameDetailTradeBarState2 = (i & 131072) != 0 ? gameDetailViewState.tradeBarState : gameDetailTradeBarState;
        EventContractHistoryFilterState eventContractHistoryFilterState3 = (i & 262144) != 0 ? gameDetailViewState.upcomingActivityFilter : eventContractHistoryFilterState;
        EventContractHistoryFilterState eventContractHistoryFilterState4 = (i & 524288) != 0 ? gameDetailViewState.historyFilter : eventContractHistoryFilterState2;
        GameDetailLastPlayState gameDetailLastPlayState2 = (i & 1048576) != 0 ? gameDetailViewState.lastPlayState : gameDetailLastPlayState;
        boolean z4 = (i & 2097152) != 0 ? gameDetailViewState.showSettingsSection : z;
        StringResource stringResource2 = (i & 4194304) != 0 ? gameDetailViewState.marketClosedBanner : stringResource;
        PrepacksState prepacksState2 = (i & 8388608) != 0 ? gameDetailViewState.prepacksState : prepacksState;
        boolean z5 = (i & 16777216) != 0 ? gameDetailViewState.showAmericanOdds : z2;
        PlayerPropsState playerPropsState2 = (i & 33554432) != 0 ? gameDetailViewState.playerPropsState : playerPropsState;
        boolean z6 = (i & 67108864) != 0 ? gameDetailViewState.isCombosEnabled : z3;
        GameDetailComboBottomSheetContentViewState gameDetailComboBottomSheetContentViewState3 = (i & 134217728) != 0 ? gameDetailViewState.comboSheetViewState : gameDetailComboBottomSheetContentViewState;
        if ((i & 268435456) != 0) {
            gameDetailComboBottomSheetContentViewState2 = gameDetailComboBottomSheetContentViewState3;
            gameDetailComboTradeBarState2 = gameDetailViewState.comboTradeBarState;
        } else {
            gameDetailComboTradeBarState2 = gameDetailComboTradeBarState;
            gameDetailComboBottomSheetContentViewState2 = gameDetailComboBottomSheetContentViewState3;
        }
        return gameDetailViewState.copy(uuid5, context2, str2, uuid4, titleState2, headerState2, immutableList5, eventContractChartArg2, chartState2, volumeState2, positionState2, sixBoxState2, immutableList6, aboutEventType2, immutableList7, immutableList8, gameDetailBottomSheetState2, gameDetailTradeBarState2, eventContractHistoryFilterState3, eventContractHistoryFilterState4, gameDetailLastPlayState2, z4, stringResource2, prepacksState2, z5, playerPropsState2, z6, gameDetailComboBottomSheetContentViewState2, gameDetailComboTradeBarState2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getEventId() {
        return this.eventId;
    }

    /* renamed from: component10, reason: from getter */
    public final VolumeState getVolumeState() {
        return this.volumeState;
    }

    /* renamed from: component11, reason: from getter */
    public final PositionState getPositionState() {
        return this.positionState;
    }

    /* renamed from: component12, reason: from getter */
    public final SixBoxState getSixBoxState() {
        return this.sixBoxState;
    }

    public final ImmutableList<AboutEventType> component13() {
        return this.aboutEventTypes;
    }

    /* renamed from: component14, reason: from getter */
    public final AboutEventType getSelectedAboutEventType() {
        return this.selectedAboutEventType;
    }

    public final ImmutableList<String> component15() {
        return this.tradingProhibitionRules;
    }

    public final ImmutableList<EventTimelineRowData> component16() {
        return this.timeline;
    }

    /* renamed from: component17, reason: from getter */
    public final GameDetailBottomSheetState getBottomSheetState() {
        return this.bottomSheetState;
    }

    /* renamed from: component18, reason: from getter */
    public final GameDetailTradeBarState getTradeBarState() {
        return this.tradeBarState;
    }

    /* renamed from: component19, reason: from getter */
    public final EventContractHistoryFilterState getUpcomingActivityFilter() {
        return this.upcomingActivityFilter;
    }

    /* renamed from: component2, reason: from getter */
    public final Context getScreenEventContext() {
        return this.screenEventContext;
    }

    /* renamed from: component20, reason: from getter */
    public final EventContractHistoryFilterState getHistoryFilter() {
        return this.historyFilter;
    }

    /* renamed from: component21, reason: from getter */
    public final GameDetailLastPlayState getLastPlayState() {
        return this.lastPlayState;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getShowSettingsSection() {
        return this.showSettingsSection;
    }

    /* renamed from: component23, reason: from getter */
    public final StringResource getMarketClosedBanner() {
        return this.marketClosedBanner;
    }

    /* renamed from: component24, reason: from getter */
    public final PrepacksState getPrepacksState() {
        return this.prepacksState;
    }

    /* renamed from: component25, reason: from getter */
    public final boolean getShowAmericanOdds() {
        return this.showAmericanOdds;
    }

    /* renamed from: component26, reason: from getter */
    public final PlayerPropsState getPlayerPropsState() {
        return this.playerPropsState;
    }

    /* renamed from: component27, reason: from getter */
    public final boolean getIsCombosEnabled() {
        return this.isCombosEnabled;
    }

    /* renamed from: component28, reason: from getter */
    public final GameDetailComboBottomSheetContentViewState getComboSheetViewState() {
        return this.comboSheetViewState;
    }

    /* renamed from: component29, reason: from getter */
    public final GameDetailComboTradeBarState getComboTradeBarState() {
        return this.comboTradeBarState;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIndividualAccountNumber() {
        return this.individualAccountNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final UUID getSwapsAccountId() {
        return this.swapsAccountId;
    }

    /* renamed from: component5, reason: from getter */
    public final TitleState getTitleState() {
        return this.titleState;
    }

    /* renamed from: component6, reason: from getter */
    public final HeaderState getHeaderState() {
        return this.headerState;
    }

    public final ImmutableList<UUID> component7() {
        return this.contractIdsForChart;
    }

    /* renamed from: component8, reason: from getter */
    public final EventContractChartArg getChartArgs() {
        return this.chartArgs;
    }

    /* renamed from: component9, reason: from getter */
    public final ChartState getChartState() {
        return this.chartState;
    }

    public final GameDetailViewState copy(UUID eventId, Context screenEventContext, String individualAccountNumber, UUID swapsAccountId, TitleState titleState, HeaderState headerState, ImmutableList<UUID> contractIdsForChart, EventContractChartArg chartArgs, ChartState chartState, VolumeState volumeState, PositionState positionState, SixBoxState sixBoxState, ImmutableList<AboutEventType> aboutEventTypes, AboutEventType selectedAboutEventType, ImmutableList<String> tradingProhibitionRules, ImmutableList<EventTimelineRowData> timeline, GameDetailBottomSheetState bottomSheetState, GameDetailTradeBarState tradeBarState, EventContractHistoryFilterState upcomingActivityFilter, EventContractHistoryFilterState historyFilter, GameDetailLastPlayState lastPlayState, boolean showSettingsSection, StringResource marketClosedBanner, PrepacksState prepacksState, boolean showAmericanOdds, PlayerPropsState playerPropsState, boolean isCombosEnabled, GameDetailComboBottomSheetContentViewState comboSheetViewState, GameDetailComboTradeBarState comboTradeBarState) {
        Intrinsics.checkNotNullParameter(titleState, "titleState");
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(chartState, "chartState");
        Intrinsics.checkNotNullParameter(aboutEventTypes, "aboutEventTypes");
        Intrinsics.checkNotNullParameter(tradeBarState, "tradeBarState");
        Intrinsics.checkNotNullParameter(comboSheetViewState, "comboSheetViewState");
        Intrinsics.checkNotNullParameter(comboTradeBarState, "comboTradeBarState");
        return new GameDetailViewState(eventId, screenEventContext, individualAccountNumber, swapsAccountId, titleState, headerState, contractIdsForChart, chartArgs, chartState, volumeState, positionState, sixBoxState, aboutEventTypes, selectedAboutEventType, tradingProhibitionRules, timeline, bottomSheetState, tradeBarState, upcomingActivityFilter, historyFilter, lastPlayState, showSettingsSection, marketClosedBanner, prepacksState, showAmericanOdds, playerPropsState, isCombosEnabled, comboSheetViewState, comboTradeBarState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GameDetailViewState)) {
            return false;
        }
        GameDetailViewState gameDetailViewState = (GameDetailViewState) other;
        return Intrinsics.areEqual(this.eventId, gameDetailViewState.eventId) && Intrinsics.areEqual(this.screenEventContext, gameDetailViewState.screenEventContext) && Intrinsics.areEqual(this.individualAccountNumber, gameDetailViewState.individualAccountNumber) && Intrinsics.areEqual(this.swapsAccountId, gameDetailViewState.swapsAccountId) && Intrinsics.areEqual(this.titleState, gameDetailViewState.titleState) && Intrinsics.areEqual(this.headerState, gameDetailViewState.headerState) && Intrinsics.areEqual(this.contractIdsForChart, gameDetailViewState.contractIdsForChart) && Intrinsics.areEqual(this.chartArgs, gameDetailViewState.chartArgs) && Intrinsics.areEqual(this.chartState, gameDetailViewState.chartState) && Intrinsics.areEqual(this.volumeState, gameDetailViewState.volumeState) && Intrinsics.areEqual(this.positionState, gameDetailViewState.positionState) && Intrinsics.areEqual(this.sixBoxState, gameDetailViewState.sixBoxState) && Intrinsics.areEqual(this.aboutEventTypes, gameDetailViewState.aboutEventTypes) && Intrinsics.areEqual(this.selectedAboutEventType, gameDetailViewState.selectedAboutEventType) && Intrinsics.areEqual(this.tradingProhibitionRules, gameDetailViewState.tradingProhibitionRules) && Intrinsics.areEqual(this.timeline, gameDetailViewState.timeline) && Intrinsics.areEqual(this.bottomSheetState, gameDetailViewState.bottomSheetState) && Intrinsics.areEqual(this.tradeBarState, gameDetailViewState.tradeBarState) && Intrinsics.areEqual(this.upcomingActivityFilter, gameDetailViewState.upcomingActivityFilter) && Intrinsics.areEqual(this.historyFilter, gameDetailViewState.historyFilter) && Intrinsics.areEqual(this.lastPlayState, gameDetailViewState.lastPlayState) && this.showSettingsSection == gameDetailViewState.showSettingsSection && Intrinsics.areEqual(this.marketClosedBanner, gameDetailViewState.marketClosedBanner) && Intrinsics.areEqual(this.prepacksState, gameDetailViewState.prepacksState) && this.showAmericanOdds == gameDetailViewState.showAmericanOdds && Intrinsics.areEqual(this.playerPropsState, gameDetailViewState.playerPropsState) && this.isCombosEnabled == gameDetailViewState.isCombosEnabled && Intrinsics.areEqual(this.comboSheetViewState, gameDetailViewState.comboSheetViewState) && Intrinsics.areEqual(this.comboTradeBarState, gameDetailViewState.comboTradeBarState);
    }

    public int hashCode() {
        UUID uuid = this.eventId;
        int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        Context context = this.screenEventContext;
        int iHashCode2 = (iHashCode + (context == null ? 0 : context.hashCode())) * 31;
        String str = this.individualAccountNumber;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        UUID uuid2 = this.swapsAccountId;
        int iHashCode4 = (((((iHashCode3 + (uuid2 == null ? 0 : uuid2.hashCode())) * 31) + this.titleState.hashCode()) * 31) + this.headerState.hashCode()) * 31;
        ImmutableList<UUID> immutableList = this.contractIdsForChart;
        int iHashCode5 = (iHashCode4 + (immutableList == null ? 0 : immutableList.hashCode())) * 31;
        EventContractChartArg eventContractChartArg = this.chartArgs;
        int iHashCode6 = (((iHashCode5 + (eventContractChartArg == null ? 0 : eventContractChartArg.hashCode())) * 31) + this.chartState.hashCode()) * 31;
        VolumeState volumeState = this.volumeState;
        int iHashCode7 = (iHashCode6 + (volumeState == null ? 0 : volumeState.hashCode())) * 31;
        PositionState positionState = this.positionState;
        int iHashCode8 = (iHashCode7 + (positionState == null ? 0 : positionState.hashCode())) * 31;
        SixBoxState sixBoxState = this.sixBoxState;
        int iHashCode9 = (((iHashCode8 + (sixBoxState == null ? 0 : sixBoxState.hashCode())) * 31) + this.aboutEventTypes.hashCode()) * 31;
        AboutEventType aboutEventType = this.selectedAboutEventType;
        int iHashCode10 = (iHashCode9 + (aboutEventType == null ? 0 : aboutEventType.hashCode())) * 31;
        ImmutableList<String> immutableList2 = this.tradingProhibitionRules;
        int iHashCode11 = (iHashCode10 + (immutableList2 == null ? 0 : immutableList2.hashCode())) * 31;
        ImmutableList<EventTimelineRowData> immutableList3 = this.timeline;
        int iHashCode12 = (iHashCode11 + (immutableList3 == null ? 0 : immutableList3.hashCode())) * 31;
        GameDetailBottomSheetState gameDetailBottomSheetState = this.bottomSheetState;
        int iHashCode13 = (((iHashCode12 + (gameDetailBottomSheetState == null ? 0 : gameDetailBottomSheetState.hashCode())) * 31) + this.tradeBarState.hashCode()) * 31;
        EventContractHistoryFilterState eventContractHistoryFilterState = this.upcomingActivityFilter;
        int iHashCode14 = (iHashCode13 + (eventContractHistoryFilterState == null ? 0 : eventContractHistoryFilterState.hashCode())) * 31;
        EventContractHistoryFilterState eventContractHistoryFilterState2 = this.historyFilter;
        int iHashCode15 = (iHashCode14 + (eventContractHistoryFilterState2 == null ? 0 : eventContractHistoryFilterState2.hashCode())) * 31;
        GameDetailLastPlayState gameDetailLastPlayState = this.lastPlayState;
        int iHashCode16 = (((iHashCode15 + (gameDetailLastPlayState == null ? 0 : gameDetailLastPlayState.hashCode())) * 31) + Boolean.hashCode(this.showSettingsSection)) * 31;
        StringResource stringResource = this.marketClosedBanner;
        int iHashCode17 = (iHashCode16 + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
        PrepacksState prepacksState = this.prepacksState;
        int iHashCode18 = (((iHashCode17 + (prepacksState == null ? 0 : prepacksState.hashCode())) * 31) + Boolean.hashCode(this.showAmericanOdds)) * 31;
        PlayerPropsState playerPropsState = this.playerPropsState;
        return ((((((iHashCode18 + (playerPropsState != null ? playerPropsState.hashCode() : 0)) * 31) + Boolean.hashCode(this.isCombosEnabled)) * 31) + this.comboSheetViewState.hashCode()) * 31) + this.comboTradeBarState.hashCode();
    }

    public String toString() {
        return "GameDetailViewState(eventId=" + this.eventId + ", screenEventContext=" + this.screenEventContext + ", individualAccountNumber=" + this.individualAccountNumber + ", swapsAccountId=" + this.swapsAccountId + ", titleState=" + this.titleState + ", headerState=" + this.headerState + ", contractIdsForChart=" + this.contractIdsForChart + ", chartArgs=" + this.chartArgs + ", chartState=" + this.chartState + ", volumeState=" + this.volumeState + ", positionState=" + this.positionState + ", sixBoxState=" + this.sixBoxState + ", aboutEventTypes=" + this.aboutEventTypes + ", selectedAboutEventType=" + this.selectedAboutEventType + ", tradingProhibitionRules=" + this.tradingProhibitionRules + ", timeline=" + this.timeline + ", bottomSheetState=" + this.bottomSheetState + ", tradeBarState=" + this.tradeBarState + ", upcomingActivityFilter=" + this.upcomingActivityFilter + ", historyFilter=" + this.historyFilter + ", lastPlayState=" + this.lastPlayState + ", showSettingsSection=" + this.showSettingsSection + ", marketClosedBanner=" + this.marketClosedBanner + ", prepacksState=" + this.prepacksState + ", showAmericanOdds=" + this.showAmericanOdds + ", playerPropsState=" + this.playerPropsState + ", isCombosEnabled=" + this.isCombosEnabled + ", comboSheetViewState=" + this.comboSheetViewState + ", comboTradeBarState=" + this.comboTradeBarState + ")";
    }

    public GameDetailViewState(UUID uuid, Context context, String str, UUID uuid2, TitleState titleState, HeaderState headerState, ImmutableList<UUID> immutableList, EventContractChartArg eventContractChartArg, ChartState chartState, VolumeState volumeState, PositionState positionState, SixBoxState sixBoxState, ImmutableList<AboutEventType> aboutEventTypes, AboutEventType aboutEventType, ImmutableList<String> immutableList2, ImmutableList<EventTimelineRowData> immutableList3, GameDetailBottomSheetState gameDetailBottomSheetState, GameDetailTradeBarState tradeBarState, EventContractHistoryFilterState eventContractHistoryFilterState, EventContractHistoryFilterState eventContractHistoryFilterState2, GameDetailLastPlayState gameDetailLastPlayState, boolean z, StringResource stringResource, PrepacksState prepacksState, boolean z2, PlayerPropsState playerPropsState, boolean z3, GameDetailComboBottomSheetContentViewState comboSheetViewState, GameDetailComboTradeBarState comboTradeBarState) {
        Intrinsics.checkNotNullParameter(titleState, "titleState");
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(chartState, "chartState");
        Intrinsics.checkNotNullParameter(aboutEventTypes, "aboutEventTypes");
        Intrinsics.checkNotNullParameter(tradeBarState, "tradeBarState");
        Intrinsics.checkNotNullParameter(comboSheetViewState, "comboSheetViewState");
        Intrinsics.checkNotNullParameter(comboTradeBarState, "comboTradeBarState");
        this.eventId = uuid;
        this.screenEventContext = context;
        this.individualAccountNumber = str;
        this.swapsAccountId = uuid2;
        this.titleState = titleState;
        this.headerState = headerState;
        this.contractIdsForChart = immutableList;
        this.chartArgs = eventContractChartArg;
        this.chartState = chartState;
        this.volumeState = volumeState;
        this.positionState = positionState;
        this.sixBoxState = sixBoxState;
        this.aboutEventTypes = aboutEventTypes;
        this.selectedAboutEventType = aboutEventType;
        this.tradingProhibitionRules = immutableList2;
        this.timeline = immutableList3;
        this.bottomSheetState = gameDetailBottomSheetState;
        this.tradeBarState = tradeBarState;
        this.upcomingActivityFilter = eventContractHistoryFilterState;
        this.historyFilter = eventContractHistoryFilterState2;
        this.lastPlayState = gameDetailLastPlayState;
        this.showSettingsSection = z;
        this.marketClosedBanner = stringResource;
        this.prepacksState = prepacksState;
        this.showAmericanOdds = z2;
        this.playerPropsState = playerPropsState;
        this.isCombosEnabled = z3;
        this.comboSheetViewState = comboSheetViewState;
        this.comboTradeBarState = comboTradeBarState;
    }

    public final UUID getEventId() {
        return this.eventId;
    }

    public final Context getScreenEventContext() {
        return this.screenEventContext;
    }

    public final String getIndividualAccountNumber() {
        return this.individualAccountNumber;
    }

    public final UUID getSwapsAccountId() {
        return this.swapsAccountId;
    }

    public final TitleState getTitleState() {
        return this.titleState;
    }

    public final HeaderState getHeaderState() {
        return this.headerState;
    }

    public final ImmutableList<UUID> getContractIdsForChart() {
        return this.contractIdsForChart;
    }

    public final EventContractChartArg getChartArgs() {
        return this.chartArgs;
    }

    public final ChartState getChartState() {
        return this.chartState;
    }

    public final VolumeState getVolumeState() {
        return this.volumeState;
    }

    public final PositionState getPositionState() {
        return this.positionState;
    }

    public final SixBoxState getSixBoxState() {
        return this.sixBoxState;
    }

    public /* synthetic */ GameDetailViewState(UUID uuid, Context context, String str, UUID uuid2, TitleState titleState, HeaderState headerState, ImmutableList immutableList, EventContractChartArg eventContractChartArg, ChartState chartState, VolumeState volumeState, PositionState positionState, SixBoxState sixBoxState, ImmutableList immutableList2, AboutEventType aboutEventType, ImmutableList immutableList3, ImmutableList immutableList4, GameDetailBottomSheetState gameDetailBottomSheetState, GameDetailTradeBarState gameDetailTradeBarState, EventContractHistoryFilterState eventContractHistoryFilterState, EventContractHistoryFilterState eventContractHistoryFilterState2, GameDetailLastPlayState gameDetailLastPlayState, boolean z, StringResource stringResource, PrepacksState prepacksState, boolean z2, PlayerPropsState playerPropsState, boolean z3, GameDetailComboBottomSheetContentViewState gameDetailComboBottomSheetContentViewState, GameDetailComboTradeBarState gameDetailComboTradeBarState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, (i & 2) != 0 ? null : context, str, uuid2, titleState, headerState, immutableList, eventContractChartArg, chartState, volumeState, positionState, sixBoxState, (i & 4096) != 0 ? extensions2.persistentListOf() : immutableList2, (i & 8192) != 0 ? null : aboutEventType, immutableList3, (32768 & i) != 0 ? null : immutableList4, gameDetailBottomSheetState, gameDetailTradeBarState, eventContractHistoryFilterState, eventContractHistoryFilterState2, gameDetailLastPlayState, (2097152 & i) != 0 ? false : z, (4194304 & i) != 0 ? null : stringResource, prepacksState, z2, playerPropsState, z3, (i & 134217728) != 0 ? new GameDetailComboBottomSheetContentViewState.Empty(null) : gameDetailComboBottomSheetContentViewState, gameDetailComboTradeBarState);
    }

    public final ImmutableList<AboutEventType> getAboutEventTypes() {
        return this.aboutEventTypes;
    }

    public final AboutEventType getSelectedAboutEventType() {
        return this.selectedAboutEventType;
    }

    public final ImmutableList<String> getTradingProhibitionRules() {
        return this.tradingProhibitionRules;
    }

    public final ImmutableList<EventTimelineRowData> getTimeline() {
        return this.timeline;
    }

    public final GameDetailBottomSheetState getBottomSheetState() {
        return this.bottomSheetState;
    }

    public final GameDetailTradeBarState getTradeBarState() {
        return this.tradeBarState;
    }

    public final EventContractHistoryFilterState getUpcomingActivityFilter() {
        return this.upcomingActivityFilter;
    }

    public final EventContractHistoryFilterState getHistoryFilter() {
        return this.historyFilter;
    }

    public final GameDetailLastPlayState getLastPlayState() {
        return this.lastPlayState;
    }

    public final boolean getShowSettingsSection() {
        return this.showSettingsSection;
    }

    public final StringResource getMarketClosedBanner() {
        return this.marketClosedBanner;
    }

    public final PrepacksState getPrepacksState() {
        return this.prepacksState;
    }

    public final boolean getShowAmericanOdds() {
        return this.showAmericanOdds;
    }

    public final PlayerPropsState getPlayerPropsState() {
        return this.playerPropsState;
    }

    public final boolean isCombosEnabled() {
        return this.isCombosEnabled;
    }

    public final GameDetailComboBottomSheetContentViewState getComboSheetViewState() {
        return this.comboSheetViewState;
    }

    public final GameDetailComboTradeBarState getComboTradeBarState() {
        return this.comboTradeBarState;
    }

    /* compiled from: GameDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/GameDetailViewState$VolumeState;", "", "totalVolume", "", "totalOpenInterest", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTotalVolume", "()Ljava/lang/String;", "getTotalOpenInterest", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class VolumeState {
        public static final int $stable = 0;
        private final String totalOpenInterest;
        private final String totalVolume;

        public static /* synthetic */ VolumeState copy$default(VolumeState volumeState, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = volumeState.totalVolume;
            }
            if ((i & 2) != 0) {
                str2 = volumeState.totalOpenInterest;
            }
            return volumeState.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTotalVolume() {
            return this.totalVolume;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTotalOpenInterest() {
            return this.totalOpenInterest;
        }

        public final VolumeState copy(String totalVolume, String totalOpenInterest) {
            return new VolumeState(totalVolume, totalOpenInterest);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VolumeState)) {
                return false;
            }
            VolumeState volumeState = (VolumeState) other;
            return Intrinsics.areEqual(this.totalVolume, volumeState.totalVolume) && Intrinsics.areEqual(this.totalOpenInterest, volumeState.totalOpenInterest);
        }

        public int hashCode() {
            String str = this.totalVolume;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.totalOpenInterest;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "VolumeState(totalVolume=" + this.totalVolume + ", totalOpenInterest=" + this.totalOpenInterest + ")";
        }

        public VolumeState(String str, String str2) {
            this.totalVolume = str;
            this.totalOpenInterest = str2;
        }

        public final String getTotalVolume() {
            return this.totalVolume;
        }

        public final String getTotalOpenInterest() {
            return this.totalOpenInterest;
        }
    }

    /* compiled from: GameDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/GameDetailViewState$PositionState;", "", "positions", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/event/gamedetail/ui/position/GameDetailPositionRowState;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;)V", "getPositions", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PositionState {
        public static final int $stable = 0;
        private final ImmutableList<GameDetailPositionRowState> positions;

        /* JADX WARN: Multi-variable type inference failed */
        public PositionState() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PositionState copy$default(PositionState positionState, ImmutableList immutableList, int i, Object obj) {
            if ((i & 1) != 0) {
                immutableList = positionState.positions;
            }
            return positionState.copy(immutableList);
        }

        public final ImmutableList<GameDetailPositionRowState> component1() {
            return this.positions;
        }

        public final PositionState copy(ImmutableList<GameDetailPositionRowState> positions) {
            return new PositionState(positions);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PositionState) && Intrinsics.areEqual(this.positions, ((PositionState) other).positions);
        }

        public int hashCode() {
            ImmutableList<GameDetailPositionRowState> immutableList = this.positions;
            if (immutableList == null) {
                return 0;
            }
            return immutableList.hashCode();
        }

        public String toString() {
            return "PositionState(positions=" + this.positions + ")";
        }

        public PositionState(ImmutableList<GameDetailPositionRowState> immutableList) {
            this.positions = immutableList;
        }

        public /* synthetic */ PositionState(ImmutableList immutableList, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : immutableList);
        }

        public final ImmutableList<GameDetailPositionRowState> getPositions() {
            return this.positions;
        }
    }

    /* compiled from: GameDetailViewState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/GameDetailViewState$SixBoxState;", "", "contractRowHeaderState", "Lcom/robinhood/android/event/gamedetail/components/ContractRowHeaderState;", "contractRows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/event/gamedetail/components/ContractRowState;", "<init>", "(Lcom/robinhood/android/event/gamedetail/components/ContractRowHeaderState;Lkotlinx/collections/immutable/ImmutableList;)V", "getContractRowHeaderState", "()Lcom/robinhood/android/event/gamedetail/components/ContractRowHeaderState;", "getContractRows", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SixBoxState {
        public static final int $stable = 8;
        private final ContractRowHeaderState contractRowHeaderState;
        private final ImmutableList<ContractRowState> contractRows;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SixBoxState copy$default(SixBoxState sixBoxState, ContractRowHeaderState contractRowHeaderState, ImmutableList immutableList, int i, Object obj) {
            if ((i & 1) != 0) {
                contractRowHeaderState = sixBoxState.contractRowHeaderState;
            }
            if ((i & 2) != 0) {
                immutableList = sixBoxState.contractRows;
            }
            return sixBoxState.copy(contractRowHeaderState, immutableList);
        }

        /* renamed from: component1, reason: from getter */
        public final ContractRowHeaderState getContractRowHeaderState() {
            return this.contractRowHeaderState;
        }

        public final ImmutableList<ContractRowState> component2() {
            return this.contractRows;
        }

        public final SixBoxState copy(ContractRowHeaderState contractRowHeaderState, ImmutableList<ContractRowState> contractRows) {
            Intrinsics.checkNotNullParameter(contractRowHeaderState, "contractRowHeaderState");
            Intrinsics.checkNotNullParameter(contractRows, "contractRows");
            return new SixBoxState(contractRowHeaderState, contractRows);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SixBoxState)) {
                return false;
            }
            SixBoxState sixBoxState = (SixBoxState) other;
            return Intrinsics.areEqual(this.contractRowHeaderState, sixBoxState.contractRowHeaderState) && Intrinsics.areEqual(this.contractRows, sixBoxState.contractRows);
        }

        public int hashCode() {
            return (this.contractRowHeaderState.hashCode() * 31) + this.contractRows.hashCode();
        }

        public String toString() {
            return "SixBoxState(contractRowHeaderState=" + this.contractRowHeaderState + ", contractRows=" + this.contractRows + ")";
        }

        public SixBoxState(ContractRowHeaderState contractRowHeaderState, ImmutableList<ContractRowState> contractRows) {
            Intrinsics.checkNotNullParameter(contractRowHeaderState, "contractRowHeaderState");
            Intrinsics.checkNotNullParameter(contractRows, "contractRows");
            this.contractRowHeaderState = contractRowHeaderState;
            this.contractRows = contractRows;
        }

        public final ContractRowHeaderState getContractRowHeaderState() {
            return this.contractRowHeaderState;
        }

        public final ImmutableList<ContractRowState> getContractRows() {
            return this.contractRows;
        }
    }
}
