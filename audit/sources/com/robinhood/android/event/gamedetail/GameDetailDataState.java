package com.robinhood.android.event.gamedetail;

import android.os.Parcelable;
import com.robinhood.android.event.gamedetail.BottomSheetSelection;
import com.robinhood.android.event.gamedetail.GameDetailViewState;
import com.robinhood.android.event.gamedetail.builders.AboutEventType;
import com.robinhood.android.event.gamedetail.builders.BuildGameDetailBottomSheetState;
import com.robinhood.android.event.gamedetail.builders.BuildPrepacksState;
import com.robinhood.android.event.gamedetail.builders.TitleState;
import com.robinhood.android.event.gamedetail.builders.sixbox.BuildSixBoxState;
import com.robinhood.android.event.gamedetail.builders.tradebottomsheet.BuildTradeButton;
import com.robinhood.android.event.gamedetail.combostates.GameDetailSelectionState;
import com.robinhood.android.event.gamedetail.components.ContractOptionData;
import com.robinhood.android.event.gamedetail.components.GameDetailLastPlayState;
import com.robinhood.android.event.gamedetail.components.GameDetailTradeBarState;
import com.robinhood.android.event.gamedetail.components.PrepacksState;
import com.robinhood.android.event.gamedetail.components.bottomsheet.GameDetailBottomSheetState;
import com.robinhood.android.event.gamedetail.p130ui.chart.ChartSideLegendState;
import com.robinhood.android.event.gamedetail.p130ui.chart.ChartState;
import com.robinhood.android.event.gamedetail.p130ui.props.BuildPlayerPropsState;
import com.robinhood.android.event.gamedetail.p130ui.props.PlayerPropsState;
import com.robinhood.android.eventcontracts.models.event.ContractIdWithSide;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor2;
import com.robinhood.android.eventcontracts.sharedeventui.PriceUtils;
import com.robinhood.android.eventcontracts.sharedeventui.animation.Delta;
import com.robinhood.android.eventcontracts.sharedeventui.chart.EventChartColorOverlay;
import com.robinhood.android.eventcontracts.sharedeventui.chart.EventChartLabelItem;
import com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase3;
import com.robinhood.android.futures.charts.EventContractChartArg;
import com.robinhood.android.lib.futures.trade.MarketSessionChangeDataState;
import com.robinhood.android.models.event.p186db.arsenal.Event;
import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p186db.arsenal.EventTimeline;
import com.robinhood.android.models.event.p186db.ceres.UiEventContractPosition;
import com.robinhood.android.models.event.p186db.marketdata.EventFundamental;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.android.models.event.p186db.order.UiEventOrder;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractDisplayDetails;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractGroup;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractGroup3;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractGroupSectionWithContractGroup;
import com.robinhood.android.models.event.p186db.predictionmarkets.PredictionMarketEventState;
import com.robinhood.android.models.event.p186db.predictionmarkets.StrikeContract;
import com.robinhood.android.models.event.p187ui.UiEcEvent;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.ChartLegendItem;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.models.serverdriven.experimental.api.Line;
import com.robinhood.models.serverdriven.experimental.api.Point;
import com.robinhood.models.serverdriven.experimental.api.Segment;
import com.robinhood.utils.Optional;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: GameDetailDataState.kt */
@Metadata(m3635d1 = {"\u0000¦\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bC\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b1\b\u0087\b\u0018\u0000 ã\u00012\u00020\u0001:\u0002ã\u0001Bÿ\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u001a\b\u0002\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u0018\u0012\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001e0\u0018\u0012\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u0018\u0012\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020#\u0018\u00010\u0018\u0012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u001b\u0012\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u001b\u0012\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u001b\u0012\u0016\b\u0002\u0010)\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010*0\u0018\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\b\b\u0002\u0010,\u001a\u00020-\u0012\u0016\b\u0002\u0010.\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010*0\u0018\u0012\u0014\b\u0002\u0010/\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u0018\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u000101\u0012\u0016\b\u0002\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u000203\u0018\u00010\u0018\u0012\u001a\b\u0002\u00104\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u001b0\u0018\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000107\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000109\u0012\b\b\u0002\u0010:\u001a\u00020;\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?\u0012\b\b\u0002\u0010@\u001a\u00020\u0003\u0012\b\b\u0002\u0010A\u001a\u00020B\u0012\u0014\b\u0002\u0010C\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u00030\u0018\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010E\u0012\b\b\u0002\u0010F\u001a\u00020\u0003\u0012\b\b\u0002\u0010G\u001a\u00020\u0003\u0012\b\b\u0002\u0010H\u001a\u00020\u0003\u0012\b\b\u0002\u0010I\u001a\u00020\u0003\u0012\u0006\u0010J\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020E0\u0018¢\u0006\u0004\bL\u0010MJ\f\u0010\u0098\u0001\u001a\u00030\u0099\u0001*\u00020#J\n\u0010¶\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010·\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0012\u0010¸\u0001\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\f\u0010¹\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010º\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010»\u0001\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0012\u0010¼\u0001\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003J\f\u0010½\u0001\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0012\u0010¾\u0001\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003J\u0016\u0010¿\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00190\u0018HÆ\u0003J\u001c\u0010À\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u0018HÆ\u0003J\u0016\u0010Á\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001e0\u0018HÆ\u0003J\u0016\u0010Â\u0001\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u0018HÆ\u0003J\u0018\u0010Ã\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020#\u0018\u00010\u0018HÆ\u0003J\u0012\u0010Ä\u0001\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u001bHÆ\u0003J\u0012\u0010Å\u0001\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u001bHÆ\u0003J\u0012\u0010Æ\u0001\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u001bHÆ\u0003J\u0018\u0010Ç\u0001\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010*0\u0018HÆ\u0003J\f\u0010È\u0001\u001a\u0004\u0018\u00010*HÆ\u0003J\n\u0010É\u0001\u001a\u00020-HÆ\u0003J\u0018\u0010Ê\u0001\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010*0\u0018HÆ\u0003J\u0016\u0010Ë\u0001\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u0018HÆ\u0003J\f\u0010Ì\u0001\u001a\u0004\u0018\u000101HÆ\u0003J\u0018\u0010Í\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u000203\u0018\u00010\u0018HÆ\u0003J\u001c\u0010Î\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u001b0\u0018HÆ\u0003J\f\u0010Ï\u0001\u001a\u0004\u0018\u000107HÆ\u0003J\f\u0010Ð\u0001\u001a\u0004\u0018\u000109HÆ\u0003J\n\u0010Ñ\u0001\u001a\u00020;HÆ\u0003J\f\u0010Ò\u0001\u001a\u0004\u0018\u00010=HÆ\u0003J\f\u0010Ó\u0001\u001a\u0004\u0018\u00010?HÆ\u0003J\n\u0010Ô\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Õ\u0001\u001a\u00020BHÆ\u0003J\u0016\u0010Ö\u0001\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u00030\u0018HÆ\u0003J\f\u0010×\u0001\u001a\u0004\u0018\u00010EHÆ\u0003J\n\u0010Ø\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ù\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ú\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Û\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ü\u0001\u001a\u00020\u0003HÆ\u0003J\u0016\u0010Ý\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020E0\u0018HÆ\u0003J\u0086\u0005\u0010Þ\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00190\u00182\u001a\b\u0002\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u00182\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001e0\u00182\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u00182\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020#\u0018\u00010\u00182\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u001b2\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u001b2\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u001b2\u0016\b\u0002\u0010)\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010*0\u00182\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010,\u001a\u00020-2\u0016\b\u0002\u0010.\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010*0\u00182\u0014\b\u0002\u0010/\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u00182\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\u0016\b\u0002\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u000203\u0018\u00010\u00182\u001a\b\u0002\u00104\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u001b0\u00182\n\b\u0002\u00106\u001a\u0004\u0018\u0001072\n\b\u0002\u00108\u001a\u0004\u0018\u0001092\b\b\u0002\u0010:\u001a\u00020;2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?2\b\b\u0002\u0010@\u001a\u00020\u00032\b\b\u0002\u0010A\u001a\u00020B2\u0014\b\u0002\u0010C\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u00030\u00182\n\b\u0002\u0010D\u001a\u0004\u0018\u00010E2\b\b\u0002\u0010F\u001a\u00020\u00032\b\b\u0002\u0010G\u001a\u00020\u00032\b\b\u0002\u0010H\u001a\u00020\u00032\b\b\u0002\u0010I\u001a\u00020\u00032\b\b\u0002\u0010J\u001a\u00020\u00032\u0014\b\u0002\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020E0\u0018HÆ\u0001J\u0015\u0010ß\u0001\u001a\u00020\u00032\t\u0010à\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010á\u0001\u001a\u00020BHÖ\u0001J\n\u0010â\u0001\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010NR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u001d\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\b\n\u0000\u001a\u0004\b_\u0010`R#\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u0018¢\u0006\b\n\u0000\u001a\u0004\ba\u0010`R\u001d\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001e0\u0018¢\u0006\b\n\u0000\u001a\u0004\bb\u0010`R\u001d\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u0018¢\u0006\b\n\u0000\u001a\u0004\bc\u0010`R\u001f\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020#\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\bd\u0010`R\u0019\u0010$\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\be\u0010fR\u0019\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\bg\u0010fR\u0019\u0010'\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\bh\u0010fR\u001f\u0010)\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010*0\u0018¢\u0006\b\n\u0000\u001a\u0004\bi\u0010`R\u0013\u0010+\u001a\u0004\u0018\u00010*¢\u0006\b\n\u0000\u001a\u0004\bj\u0010kR\u0011\u0010,\u001a\u00020-¢\u0006\b\n\u0000\u001a\u0004\bl\u0010mR\u001f\u0010.\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010*0\u0018¢\u0006\b\n\u0000\u001a\u0004\bn\u0010`R\u001d\u0010/\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u0018¢\u0006\b\n\u0000\u001a\u0004\bo\u0010`R\u0013\u00100\u001a\u0004\u0018\u000101¢\u0006\b\n\u0000\u001a\u0004\bp\u0010qR\u001f\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u000203\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\br\u0010`R#\u00104\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u001b0\u0018¢\u0006\b\n\u0000\u001a\u0004\bs\u0010`R\u0013\u00106\u001a\u0004\u0018\u000107¢\u0006\b\n\u0000\u001a\u0004\bt\u0010uR\u0013\u00108\u001a\u0004\u0018\u000109¢\u0006\b\n\u0000\u001a\u0004\bv\u0010wR\u0011\u0010:\u001a\u00020;¢\u0006\b\n\u0000\u001a\u0004\bx\u0010yR\u0013\u0010<\u001a\u0004\u0018\u00010=¢\u0006\b\n\u0000\u001a\u0004\bz\u0010{R\u0013\u0010>\u001a\u0004\u0018\u00010?¢\u0006\b\n\u0000\u001a\u0004\b|\u0010}R\u0011\u0010@\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b~\u0010NR\u0012\u0010A\u001a\u00020B¢\u0006\t\n\u0000\u001a\u0005\b\u007f\u0010\u0080\u0001R\u001e\u0010C\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u00030\u0018¢\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010`R\u0015\u0010D\u001a\u0004\u0018\u00010E¢\u0006\n\n\u0000\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0011\u0010F\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010NR\u0011\u0010G\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010NR\u0011\u0010H\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u0010NR\u0011\u0010I\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u0010NR\u0012\u0010J\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010NR\u001e\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020E0\u0018¢\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010`R\u001b\u0010\u0086\u0001\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u001b¢\u0006\t\n\u0000\u001a\u0005\b\u0087\u0001\u0010fR\u0017\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0089\u00018F¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0013\u0010\u008c\u0001\u001a\u00020\u00038F¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u0010NR\u0015\u0010\u008e\u0001\u001a\u00030\u008f\u00018F¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0015\u0010\u0092\u0001\u001a\u00030\u0093\u00018F¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0013\u0010\u0096\u0001\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0097\u0001\u0010NR\u0013\u0010\u009a\u0001\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u009b\u0001\u0010NR\u0017\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u009d\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0016\u0010 \u0001\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¡\u0001\u0010NR\u0017\u0010¢\u0001\u001a\u0005\u0018\u00010£\u00018F¢\u0006\b\u001a\u0006\b¤\u0001\u0010¥\u0001R\u0017\u0010¦\u0001\u001a\u0005\u0018\u00010§\u0001¢\u0006\n\n\u0000\u001a\u0006\b¨\u0001\u0010©\u0001R\u0017\u0010ª\u0001\u001a\u0005\u0018\u00010«\u0001¢\u0006\n\n\u0000\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u0017\u0010®\u0001\u001a\u0005\u0018\u00010¯\u0001¢\u0006\n\n\u0000\u001a\u0006\b°\u0001\u0010±\u0001R\u0015\u0010²\u0001\u001a\u00030³\u0001¢\u0006\n\n\u0000\u001a\u0006\b´\u0001\u0010µ\u0001¨\u0006ä\u0001"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/GameDetailDataState;", "", "isComboEnabled", "", "event", "Lcom/robinhood/android/models/event/ui/UiEcEvent;", "swapAccount", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/models/futures/db/FuturesAccount;", "individualAccountNumber", "", "marketSessionChangeDataState", "Lcom/robinhood/android/lib/futures/trade/MarketSessionChangeDataState;", "chartSpan", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "chart", "Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "Landroid/os/Parcelable;", "scrubbedPoint", "Lcom/robinhood/models/serverdriven/experimental/api/Point;", "allContractIdsForGame", "", "Ljava/util/UUID;", "contractIdToQuotes", "", "Lcom/robinhood/android/models/event/db/marketdata/EventQuote;", "contractIdToOpenInterestDeltas", "", "Lcom/robinhood/android/eventcontracts/sharedeventui/animation/Delta;", "contractIdToFundamentals", "Lcom/robinhood/android/models/event/db/marketdata/EventFundamental;", "contractIdToStrikeContract", "Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;", "Lcom/robinhood/android/models/event/db/predictionmarkets/StrikeContract;", "allContractIdsToEventContract", "Lcom/robinhood/android/models/event/db/arsenal/EventContract;", "contractGroup", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractGroup;", "prepacksContractGroup", "playerPropsGroupSection", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractGroupSectionWithContractGroup;", "displayDetails", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractDisplayDetails;", "bottomSheetDisplayDetails", "comboSelection", "Lcom/robinhood/android/event/gamedetail/combostates/GameDetailSelectionState;", "comboSheetDisplayDetails", "comboSelectedStrikeContracts", "comboQuoteResult", "Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboQuoteResult;", "contractIdToPositionsForCurrentGame", "Lcom/robinhood/android/models/event/db/ceres/UiEventContractPosition;", "pendingOrders", "Lcom/robinhood/android/models/event/db/order/UiEventOrder;", "eventTimeline", "Lcom/robinhood/android/models/event/db/arsenal/EventTimeline;", "eventState", "Lcom/robinhood/android/models/event/db/predictionmarkets/PredictionMarketEventState;", "titleState", "Lcom/robinhood/android/event/gamedetail/builders/TitleState;", "bottomSheetSelection", "Lcom/robinhood/android/event/gamedetail/BottomSheetSelection;", "selectedAboutEventType", "Lcom/robinhood/android/event/gamedetail/builders/AboutEventType;", "showDisabledTradeButtonMessage", "selectedPropsCategoryIndex", "", "propsExpansionState", "estimatedFeesPerQuantity", "Ljava/math/BigDecimal;", "isInEcSportsExperiment", "isInAmericanOddsExperiment", "isInLastPlayExperiment", "isInPricePayoutExperiment", "showAmericanOdds", "contractIdToEstimatedFees", "<init>", "(ZLcom/robinhood/android/models/event/ui/UiEcEvent;Lcom/robinhood/utils/Optional;Ljava/lang/String;Lcom/robinhood/android/lib/futures/trade/MarketSessionChangeDataState;Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;Lcom/robinhood/models/serverdriven/experimental/api/Chart;Lcom/robinhood/models/serverdriven/experimental/api/Point;Ljava/util/Set;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lcom/robinhood/android/models/event/db/predictionmarkets/ContractDisplayDetails;Lcom/robinhood/android/event/gamedetail/combostates/GameDetailSelectionState;Ljava/util/Map;Ljava/util/Map;Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboQuoteResult;Ljava/util/Map;Ljava/util/Map;Lcom/robinhood/android/models/event/db/arsenal/EventTimeline;Lcom/robinhood/android/models/event/db/predictionmarkets/PredictionMarketEventState;Lcom/robinhood/android/event/gamedetail/builders/TitleState;Lcom/robinhood/android/event/gamedetail/BottomSheetSelection;Lcom/robinhood/android/event/gamedetail/builders/AboutEventType;ZILjava/util/Map;Ljava/math/BigDecimal;ZZZZZLjava/util/Map;)V", "()Z", "getEvent", "()Lcom/robinhood/android/models/event/ui/UiEcEvent;", "getSwapAccount", "()Lcom/robinhood/utils/Optional;", "getIndividualAccountNumber", "()Ljava/lang/String;", "getMarketSessionChangeDataState", "()Lcom/robinhood/android/lib/futures/trade/MarketSessionChangeDataState;", "getChartSpan", "()Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "getChart", "()Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "getScrubbedPoint", "()Lcom/robinhood/models/serverdriven/experimental/api/Point;", "getAllContractIdsForGame", "()Ljava/util/Set;", "getContractIdToQuotes", "()Ljava/util/Map;", "getContractIdToOpenInterestDeltas", "getContractIdToFundamentals", "getContractIdToStrikeContract", "getAllContractIdsToEventContract", "getContractGroup", "()Ljava/util/List;", "getPrepacksContractGroup", "getPlayerPropsGroupSection", "getDisplayDetails", "getBottomSheetDisplayDetails", "()Lcom/robinhood/android/models/event/db/predictionmarkets/ContractDisplayDetails;", "getComboSelection", "()Lcom/robinhood/android/event/gamedetail/combostates/GameDetailSelectionState;", "getComboSheetDisplayDetails", "getComboSelectedStrikeContracts", "getComboQuoteResult", "()Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboQuoteResult;", "getContractIdToPositionsForCurrentGame", "getPendingOrders", "getEventTimeline", "()Lcom/robinhood/android/models/event/db/arsenal/EventTimeline;", "getEventState", "()Lcom/robinhood/android/models/event/db/predictionmarkets/PredictionMarketEventState;", "getTitleState", "()Lcom/robinhood/android/event/gamedetail/builders/TitleState;", "getBottomSheetSelection", "()Lcom/robinhood/android/event/gamedetail/BottomSheetSelection;", "getSelectedAboutEventType", "()Lcom/robinhood/android/event/gamedetail/builders/AboutEventType;", "getShowDisabledTradeButtonMessage", "getSelectedPropsCategoryIndex", "()I", "getPropsExpansionState", "getEstimatedFeesPerQuantity", "()Ljava/math/BigDecimal;", "getShowAmericanOdds", "getContractIdToEstimatedFees", "contractsForChart", "getContractsForChart", "chartArgs", "Lcom/robinhood/android/futures/charts/EventContractChartArg;", "getChartArgs", "()Lcom/robinhood/android/futures/charts/EventContractChartArg;", "marketOpen", "getMarketOpen", "chartSideLegendState", "Lcom/robinhood/android/event/gamedetail/ui/chart/ChartSideLegendState;", "getChartSideLegendState", "()Lcom/robinhood/android/event/gamedetail/ui/chart/ChartSideLegendState;", "chartState", "Lcom/robinhood/android/event/gamedetail/ui/chart/ChartState;", "getChartState", "()Lcom/robinhood/android/event/gamedetail/ui/chart/ChartState;", "hasPositions", "getHasPositions", "toChartLabelItem", "Lcom/robinhood/android/eventcontracts/sharedeventui/chart/EventChartLabelItem;", "shouldMirrorSecondContractImage", "getShouldMirrorSecondContractImage", "sixBoxState", "Lcom/robinhood/android/event/gamedetail/GameDetailViewState$SixBoxState;", "getSixBoxState", "()Lcom/robinhood/android/event/gamedetail/GameDetailViewState$SixBoxState;", "overrideWithPositionBottomSheet", "getOverrideWithPositionBottomSheet", "bottomSheetState", "Lcom/robinhood/android/event/gamedetail/components/bottomsheet/GameDetailBottomSheetState;", "getBottomSheetState", "()Lcom/robinhood/android/event/gamedetail/components/bottomsheet/GameDetailBottomSheetState;", "lastPlayState", "Lcom/robinhood/android/event/gamedetail/components/GameDetailLastPlayState;", "getLastPlayState", "()Lcom/robinhood/android/event/gamedetail/components/GameDetailLastPlayState;", "prepacksState", "Lcom/robinhood/android/event/gamedetail/components/PrepacksState;", "getPrepacksState", "()Lcom/robinhood/android/event/gamedetail/components/PrepacksState;", "playerPropsState", "Lcom/robinhood/android/event/gamedetail/ui/props/PlayerPropsState;", "getPlayerPropsState", "()Lcom/robinhood/android/event/gamedetail/ui/props/PlayerPropsState;", "tradeBarState", "Lcom/robinhood/android/event/gamedetail/components/GameDetailTradeBarState;", "getTradeBarState", "()Lcom/robinhood/android/event/gamedetail/components/GameDetailTradeBarState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "copy", "equals", "other", "hashCode", "toString", "Companion", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class GameDetailDataState {
    private final Set<UUID> allContractIdsForGame;
    private final Map<UUID, EventContract> allContractIdsToEventContract;
    private final ContractDisplayDetails bottomSheetDisplayDetails;
    private final BottomSheetSelection bottomSheetSelection;
    private final Chart<Parcelable> chart;
    private final DisplaySpan chartSpan;
    private final StreamComboQuoteUseCase3 comboQuoteResult;
    private final Map<ContractIdWithSide, StrikeContract> comboSelectedStrikeContracts;
    private final GameDetailSelectionState comboSelection;
    private final Map<ContractIdWithSide, ContractDisplayDetails> comboSheetDisplayDetails;
    private final List<ContractGroup> contractGroup;
    private final Map<UUID, BigDecimal> contractIdToEstimatedFees;
    private final Map<UUID, EventFundamental> contractIdToFundamentals;
    private final Map<UUID, List<Delta>> contractIdToOpenInterestDeltas;
    private final Map<UUID, UiEventContractPosition> contractIdToPositionsForCurrentGame;
    private final Map<UUID, EventQuote> contractIdToQuotes;
    private final Map<ContractIdWithSide, StrikeContract> contractIdToStrikeContract;
    private final List<EventContract> contractsForChart;
    private final Map<ContractIdWithSide, ContractDisplayDetails> displayDetails;
    private final BigDecimal estimatedFeesPerQuantity;
    private final UiEcEvent event;
    private final PredictionMarketEventState eventState;
    private final EventTimeline eventTimeline;
    private final boolean hasPositions;
    private final String individualAccountNumber;
    private final boolean isComboEnabled;
    private final boolean isInAmericanOddsExperiment;
    private final boolean isInEcSportsExperiment;
    private final boolean isInLastPlayExperiment;
    private final boolean isInPricePayoutExperiment;
    private final GameDetailLastPlayState lastPlayState;
    private final MarketSessionChangeDataState marketSessionChangeDataState;
    private final Map<UUID, List<UiEventOrder>> pendingOrders;
    private final List<ContractGroupSectionWithContractGroup> playerPropsGroupSection;
    private final PlayerPropsState playerPropsState;
    private final List<ContractGroup> prepacksContractGroup;
    private final PrepacksState prepacksState;
    private final Map<Integer, Boolean> propsExpansionState;
    private final Point scrubbedPoint;
    private final AboutEventType selectedAboutEventType;
    private final int selectedPropsCategoryIndex;
    private final boolean shouldMirrorSecondContractImage;
    private final boolean showAmericanOdds;
    private final boolean showDisabledTradeButtonMessage;
    private final GameDetailViewState.SixBoxState sixBoxState;
    private final Optional<FuturesAccount> swapAccount;
    private final TitleState titleState;
    private final GameDetailTradeBarState tradeBarState;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final ImmutableList3<DisplaySpan> defaultSpans = extensions2.persistentListOf(DisplaySpan.HOUR, DisplaySpan.ALL);

    /* renamed from: component1, reason: from getter */
    public final boolean getIsComboEnabled() {
        return this.isComboEnabled;
    }

    public final Map<UUID, EventQuote> component10() {
        return this.contractIdToQuotes;
    }

    public final Map<UUID, List<Delta>> component11() {
        return this.contractIdToOpenInterestDeltas;
    }

    public final Map<UUID, EventFundamental> component12() {
        return this.contractIdToFundamentals;
    }

    public final Map<ContractIdWithSide, StrikeContract> component13() {
        return this.contractIdToStrikeContract;
    }

    public final Map<UUID, EventContract> component14() {
        return this.allContractIdsToEventContract;
    }

    public final List<ContractGroup> component15() {
        return this.contractGroup;
    }

    public final List<ContractGroup> component16() {
        return this.prepacksContractGroup;
    }

    public final List<ContractGroupSectionWithContractGroup> component17() {
        return this.playerPropsGroupSection;
    }

    public final Map<ContractIdWithSide, ContractDisplayDetails> component18() {
        return this.displayDetails;
    }

    /* renamed from: component19, reason: from getter */
    public final ContractDisplayDetails getBottomSheetDisplayDetails() {
        return this.bottomSheetDisplayDetails;
    }

    /* renamed from: component2, reason: from getter */
    public final UiEcEvent getEvent() {
        return this.event;
    }

    /* renamed from: component20, reason: from getter */
    public final GameDetailSelectionState getComboSelection() {
        return this.comboSelection;
    }

    public final Map<ContractIdWithSide, ContractDisplayDetails> component21() {
        return this.comboSheetDisplayDetails;
    }

    public final Map<ContractIdWithSide, StrikeContract> component22() {
        return this.comboSelectedStrikeContracts;
    }

    /* renamed from: component23, reason: from getter */
    public final StreamComboQuoteUseCase3 getComboQuoteResult() {
        return this.comboQuoteResult;
    }

    public final Map<UUID, UiEventContractPosition> component24() {
        return this.contractIdToPositionsForCurrentGame;
    }

    public final Map<UUID, List<UiEventOrder>> component25() {
        return this.pendingOrders;
    }

    /* renamed from: component26, reason: from getter */
    public final EventTimeline getEventTimeline() {
        return this.eventTimeline;
    }

    /* renamed from: component27, reason: from getter */
    public final PredictionMarketEventState getEventState() {
        return this.eventState;
    }

    /* renamed from: component28, reason: from getter */
    public final TitleState getTitleState() {
        return this.titleState;
    }

    /* renamed from: component29, reason: from getter */
    public final BottomSheetSelection getBottomSheetSelection() {
        return this.bottomSheetSelection;
    }

    public final Optional<FuturesAccount> component3() {
        return this.swapAccount;
    }

    /* renamed from: component30, reason: from getter */
    public final AboutEventType getSelectedAboutEventType() {
        return this.selectedAboutEventType;
    }

    /* renamed from: component31, reason: from getter */
    public final boolean getShowDisabledTradeButtonMessage() {
        return this.showDisabledTradeButtonMessage;
    }

    /* renamed from: component32, reason: from getter */
    public final int getSelectedPropsCategoryIndex() {
        return this.selectedPropsCategoryIndex;
    }

    public final Map<Integer, Boolean> component33() {
        return this.propsExpansionState;
    }

    /* renamed from: component34, reason: from getter */
    public final BigDecimal getEstimatedFeesPerQuantity() {
        return this.estimatedFeesPerQuantity;
    }

    /* renamed from: component35, reason: from getter */
    public final boolean getIsInEcSportsExperiment() {
        return this.isInEcSportsExperiment;
    }

    /* renamed from: component36, reason: from getter */
    public final boolean getIsInAmericanOddsExperiment() {
        return this.isInAmericanOddsExperiment;
    }

    /* renamed from: component37, reason: from getter */
    public final boolean getIsInLastPlayExperiment() {
        return this.isInLastPlayExperiment;
    }

    /* renamed from: component38, reason: from getter */
    public final boolean getIsInPricePayoutExperiment() {
        return this.isInPricePayoutExperiment;
    }

    /* renamed from: component39, reason: from getter */
    public final boolean getShowAmericanOdds() {
        return this.showAmericanOdds;
    }

    /* renamed from: component4, reason: from getter */
    public final String getIndividualAccountNumber() {
        return this.individualAccountNumber;
    }

    public final Map<UUID, BigDecimal> component40() {
        return this.contractIdToEstimatedFees;
    }

    /* renamed from: component5, reason: from getter */
    public final MarketSessionChangeDataState getMarketSessionChangeDataState() {
        return this.marketSessionChangeDataState;
    }

    /* renamed from: component6, reason: from getter */
    public final DisplaySpan getChartSpan() {
        return this.chartSpan;
    }

    public final Chart<Parcelable> component7() {
        return this.chart;
    }

    /* renamed from: component8, reason: from getter */
    public final Point getScrubbedPoint() {
        return this.scrubbedPoint;
    }

    public final Set<UUID> component9() {
        return this.allContractIdsForGame;
    }

    public final GameDetailDataState copy(boolean isComboEnabled, UiEcEvent event, Optional<FuturesAccount> swapAccount, String individualAccountNumber, MarketSessionChangeDataState marketSessionChangeDataState, DisplaySpan chartSpan, Chart<? extends Parcelable> chart, Point scrubbedPoint, Set<UUID> allContractIdsForGame, Map<UUID, EventQuote> contractIdToQuotes, Map<UUID, ? extends List<Delta>> contractIdToOpenInterestDeltas, Map<UUID, EventFundamental> contractIdToFundamentals, Map<ContractIdWithSide, StrikeContract> contractIdToStrikeContract, Map<UUID, EventContract> allContractIdsToEventContract, List<ContractGroup> contractGroup, List<ContractGroup> prepacksContractGroup, List<ContractGroupSectionWithContractGroup> playerPropsGroupSection, Map<ContractIdWithSide, ContractDisplayDetails> displayDetails, ContractDisplayDetails bottomSheetDisplayDetails, GameDetailSelectionState comboSelection, Map<ContractIdWithSide, ContractDisplayDetails> comboSheetDisplayDetails, Map<ContractIdWithSide, StrikeContract> comboSelectedStrikeContracts, StreamComboQuoteUseCase3 comboQuoteResult, Map<UUID, UiEventContractPosition> contractIdToPositionsForCurrentGame, Map<UUID, ? extends List<UiEventOrder>> pendingOrders, EventTimeline eventTimeline, PredictionMarketEventState eventState, TitleState titleState, BottomSheetSelection bottomSheetSelection, AboutEventType selectedAboutEventType, boolean showDisabledTradeButtonMessage, int selectedPropsCategoryIndex, Map<Integer, Boolean> propsExpansionState, BigDecimal estimatedFeesPerQuantity, boolean isInEcSportsExperiment, boolean isInAmericanOddsExperiment, boolean isInLastPlayExperiment, boolean isInPricePayoutExperiment, boolean showAmericanOdds, Map<UUID, ? extends BigDecimal> contractIdToEstimatedFees) {
        Intrinsics.checkNotNullParameter(contractIdToQuotes, "contractIdToQuotes");
        Intrinsics.checkNotNullParameter(contractIdToOpenInterestDeltas, "contractIdToOpenInterestDeltas");
        Intrinsics.checkNotNullParameter(contractIdToFundamentals, "contractIdToFundamentals");
        Intrinsics.checkNotNullParameter(contractIdToStrikeContract, "contractIdToStrikeContract");
        Intrinsics.checkNotNullParameter(displayDetails, "displayDetails");
        Intrinsics.checkNotNullParameter(comboSelection, "comboSelection");
        Intrinsics.checkNotNullParameter(comboSheetDisplayDetails, "comboSheetDisplayDetails");
        Intrinsics.checkNotNullParameter(comboSelectedStrikeContracts, "comboSelectedStrikeContracts");
        Intrinsics.checkNotNullParameter(pendingOrders, "pendingOrders");
        Intrinsics.checkNotNullParameter(titleState, "titleState");
        Intrinsics.checkNotNullParameter(propsExpansionState, "propsExpansionState");
        Intrinsics.checkNotNullParameter(contractIdToEstimatedFees, "contractIdToEstimatedFees");
        return new GameDetailDataState(isComboEnabled, event, swapAccount, individualAccountNumber, marketSessionChangeDataState, chartSpan, chart, scrubbedPoint, allContractIdsForGame, contractIdToQuotes, contractIdToOpenInterestDeltas, contractIdToFundamentals, contractIdToStrikeContract, allContractIdsToEventContract, contractGroup, prepacksContractGroup, playerPropsGroupSection, displayDetails, bottomSheetDisplayDetails, comboSelection, comboSheetDisplayDetails, comboSelectedStrikeContracts, comboQuoteResult, contractIdToPositionsForCurrentGame, pendingOrders, eventTimeline, eventState, titleState, bottomSheetSelection, selectedAboutEventType, showDisabledTradeButtonMessage, selectedPropsCategoryIndex, propsExpansionState, estimatedFeesPerQuantity, isInEcSportsExperiment, isInAmericanOddsExperiment, isInLastPlayExperiment, isInPricePayoutExperiment, showAmericanOdds, contractIdToEstimatedFees);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GameDetailDataState)) {
            return false;
        }
        GameDetailDataState gameDetailDataState = (GameDetailDataState) other;
        return this.isComboEnabled == gameDetailDataState.isComboEnabled && Intrinsics.areEqual(this.event, gameDetailDataState.event) && Intrinsics.areEqual(this.swapAccount, gameDetailDataState.swapAccount) && Intrinsics.areEqual(this.individualAccountNumber, gameDetailDataState.individualAccountNumber) && Intrinsics.areEqual(this.marketSessionChangeDataState, gameDetailDataState.marketSessionChangeDataState) && this.chartSpan == gameDetailDataState.chartSpan && Intrinsics.areEqual(this.chart, gameDetailDataState.chart) && Intrinsics.areEqual(this.scrubbedPoint, gameDetailDataState.scrubbedPoint) && Intrinsics.areEqual(this.allContractIdsForGame, gameDetailDataState.allContractIdsForGame) && Intrinsics.areEqual(this.contractIdToQuotes, gameDetailDataState.contractIdToQuotes) && Intrinsics.areEqual(this.contractIdToOpenInterestDeltas, gameDetailDataState.contractIdToOpenInterestDeltas) && Intrinsics.areEqual(this.contractIdToFundamentals, gameDetailDataState.contractIdToFundamentals) && Intrinsics.areEqual(this.contractIdToStrikeContract, gameDetailDataState.contractIdToStrikeContract) && Intrinsics.areEqual(this.allContractIdsToEventContract, gameDetailDataState.allContractIdsToEventContract) && Intrinsics.areEqual(this.contractGroup, gameDetailDataState.contractGroup) && Intrinsics.areEqual(this.prepacksContractGroup, gameDetailDataState.prepacksContractGroup) && Intrinsics.areEqual(this.playerPropsGroupSection, gameDetailDataState.playerPropsGroupSection) && Intrinsics.areEqual(this.displayDetails, gameDetailDataState.displayDetails) && Intrinsics.areEqual(this.bottomSheetDisplayDetails, gameDetailDataState.bottomSheetDisplayDetails) && Intrinsics.areEqual(this.comboSelection, gameDetailDataState.comboSelection) && Intrinsics.areEqual(this.comboSheetDisplayDetails, gameDetailDataState.comboSheetDisplayDetails) && Intrinsics.areEqual(this.comboSelectedStrikeContracts, gameDetailDataState.comboSelectedStrikeContracts) && Intrinsics.areEqual(this.comboQuoteResult, gameDetailDataState.comboQuoteResult) && Intrinsics.areEqual(this.contractIdToPositionsForCurrentGame, gameDetailDataState.contractIdToPositionsForCurrentGame) && Intrinsics.areEqual(this.pendingOrders, gameDetailDataState.pendingOrders) && Intrinsics.areEqual(this.eventTimeline, gameDetailDataState.eventTimeline) && Intrinsics.areEqual(this.eventState, gameDetailDataState.eventState) && Intrinsics.areEqual(this.titleState, gameDetailDataState.titleState) && Intrinsics.areEqual(this.bottomSheetSelection, gameDetailDataState.bottomSheetSelection) && Intrinsics.areEqual(this.selectedAboutEventType, gameDetailDataState.selectedAboutEventType) && this.showDisabledTradeButtonMessage == gameDetailDataState.showDisabledTradeButtonMessage && this.selectedPropsCategoryIndex == gameDetailDataState.selectedPropsCategoryIndex && Intrinsics.areEqual(this.propsExpansionState, gameDetailDataState.propsExpansionState) && Intrinsics.areEqual(this.estimatedFeesPerQuantity, gameDetailDataState.estimatedFeesPerQuantity) && this.isInEcSportsExperiment == gameDetailDataState.isInEcSportsExperiment && this.isInAmericanOddsExperiment == gameDetailDataState.isInAmericanOddsExperiment && this.isInLastPlayExperiment == gameDetailDataState.isInLastPlayExperiment && this.isInPricePayoutExperiment == gameDetailDataState.isInPricePayoutExperiment && this.showAmericanOdds == gameDetailDataState.showAmericanOdds && Intrinsics.areEqual(this.contractIdToEstimatedFees, gameDetailDataState.contractIdToEstimatedFees);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isComboEnabled) * 31;
        UiEcEvent uiEcEvent = this.event;
        int iHashCode2 = (iHashCode + (uiEcEvent == null ? 0 : uiEcEvent.hashCode())) * 31;
        Optional<FuturesAccount> optional = this.swapAccount;
        int iHashCode3 = (iHashCode2 + (optional == null ? 0 : optional.hashCode())) * 31;
        String str = this.individualAccountNumber;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        MarketSessionChangeDataState marketSessionChangeDataState = this.marketSessionChangeDataState;
        int iHashCode5 = (iHashCode4 + (marketSessionChangeDataState == null ? 0 : marketSessionChangeDataState.hashCode())) * 31;
        DisplaySpan displaySpan = this.chartSpan;
        int iHashCode6 = (iHashCode5 + (displaySpan == null ? 0 : displaySpan.hashCode())) * 31;
        Chart<Parcelable> chart = this.chart;
        int iHashCode7 = (iHashCode6 + (chart == null ? 0 : chart.hashCode())) * 31;
        Point point = this.scrubbedPoint;
        int iHashCode8 = (iHashCode7 + (point == null ? 0 : point.hashCode())) * 31;
        Set<UUID> set = this.allContractIdsForGame;
        int iHashCode9 = (((((((((iHashCode8 + (set == null ? 0 : set.hashCode())) * 31) + this.contractIdToQuotes.hashCode()) * 31) + this.contractIdToOpenInterestDeltas.hashCode()) * 31) + this.contractIdToFundamentals.hashCode()) * 31) + this.contractIdToStrikeContract.hashCode()) * 31;
        Map<UUID, EventContract> map = this.allContractIdsToEventContract;
        int iHashCode10 = (iHashCode9 + (map == null ? 0 : map.hashCode())) * 31;
        List<ContractGroup> list = this.contractGroup;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        List<ContractGroup> list2 = this.prepacksContractGroup;
        int iHashCode12 = (iHashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<ContractGroupSectionWithContractGroup> list3 = this.playerPropsGroupSection;
        int iHashCode13 = (((iHashCode12 + (list3 == null ? 0 : list3.hashCode())) * 31) + this.displayDetails.hashCode()) * 31;
        ContractDisplayDetails contractDisplayDetails = this.bottomSheetDisplayDetails;
        int iHashCode14 = (((((((iHashCode13 + (contractDisplayDetails == null ? 0 : contractDisplayDetails.hashCode())) * 31) + this.comboSelection.hashCode()) * 31) + this.comboSheetDisplayDetails.hashCode()) * 31) + this.comboSelectedStrikeContracts.hashCode()) * 31;
        StreamComboQuoteUseCase3 streamComboQuoteUseCase3 = this.comboQuoteResult;
        int iHashCode15 = (iHashCode14 + (streamComboQuoteUseCase3 == null ? 0 : streamComboQuoteUseCase3.hashCode())) * 31;
        Map<UUID, UiEventContractPosition> map2 = this.contractIdToPositionsForCurrentGame;
        int iHashCode16 = (((iHashCode15 + (map2 == null ? 0 : map2.hashCode())) * 31) + this.pendingOrders.hashCode()) * 31;
        EventTimeline eventTimeline = this.eventTimeline;
        int iHashCode17 = (iHashCode16 + (eventTimeline == null ? 0 : eventTimeline.hashCode())) * 31;
        PredictionMarketEventState predictionMarketEventState = this.eventState;
        int iHashCode18 = (((iHashCode17 + (predictionMarketEventState == null ? 0 : predictionMarketEventState.hashCode())) * 31) + this.titleState.hashCode()) * 31;
        BottomSheetSelection bottomSheetSelection = this.bottomSheetSelection;
        int iHashCode19 = (iHashCode18 + (bottomSheetSelection == null ? 0 : bottomSheetSelection.hashCode())) * 31;
        AboutEventType aboutEventType = this.selectedAboutEventType;
        int iHashCode20 = (((((((iHashCode19 + (aboutEventType == null ? 0 : aboutEventType.hashCode())) * 31) + Boolean.hashCode(this.showDisabledTradeButtonMessage)) * 31) + Integer.hashCode(this.selectedPropsCategoryIndex)) * 31) + this.propsExpansionState.hashCode()) * 31;
        BigDecimal bigDecimal = this.estimatedFeesPerQuantity;
        return ((((((((((((iHashCode20 + (bigDecimal != null ? bigDecimal.hashCode() : 0)) * 31) + Boolean.hashCode(this.isInEcSportsExperiment)) * 31) + Boolean.hashCode(this.isInAmericanOddsExperiment)) * 31) + Boolean.hashCode(this.isInLastPlayExperiment)) * 31) + Boolean.hashCode(this.isInPricePayoutExperiment)) * 31) + Boolean.hashCode(this.showAmericanOdds)) * 31) + this.contractIdToEstimatedFees.hashCode();
    }

    public String toString() {
        return "GameDetailDataState(isComboEnabled=" + this.isComboEnabled + ", event=" + this.event + ", swapAccount=" + this.swapAccount + ", individualAccountNumber=" + this.individualAccountNumber + ", marketSessionChangeDataState=" + this.marketSessionChangeDataState + ", chartSpan=" + this.chartSpan + ", chart=" + this.chart + ", scrubbedPoint=" + this.scrubbedPoint + ", allContractIdsForGame=" + this.allContractIdsForGame + ", contractIdToQuotes=" + this.contractIdToQuotes + ", contractIdToOpenInterestDeltas=" + this.contractIdToOpenInterestDeltas + ", contractIdToFundamentals=" + this.contractIdToFundamentals + ", contractIdToStrikeContract=" + this.contractIdToStrikeContract + ", allContractIdsToEventContract=" + this.allContractIdsToEventContract + ", contractGroup=" + this.contractGroup + ", prepacksContractGroup=" + this.prepacksContractGroup + ", playerPropsGroupSection=" + this.playerPropsGroupSection + ", displayDetails=" + this.displayDetails + ", bottomSheetDisplayDetails=" + this.bottomSheetDisplayDetails + ", comboSelection=" + this.comboSelection + ", comboSheetDisplayDetails=" + this.comboSheetDisplayDetails + ", comboSelectedStrikeContracts=" + this.comboSelectedStrikeContracts + ", comboQuoteResult=" + this.comboQuoteResult + ", contractIdToPositionsForCurrentGame=" + this.contractIdToPositionsForCurrentGame + ", pendingOrders=" + this.pendingOrders + ", eventTimeline=" + this.eventTimeline + ", eventState=" + this.eventState + ", titleState=" + this.titleState + ", bottomSheetSelection=" + this.bottomSheetSelection + ", selectedAboutEventType=" + this.selectedAboutEventType + ", showDisabledTradeButtonMessage=" + this.showDisabledTradeButtonMessage + ", selectedPropsCategoryIndex=" + this.selectedPropsCategoryIndex + ", propsExpansionState=" + this.propsExpansionState + ", estimatedFeesPerQuantity=" + this.estimatedFeesPerQuantity + ", isInEcSportsExperiment=" + this.isInEcSportsExperiment + ", isInAmericanOddsExperiment=" + this.isInAmericanOddsExperiment + ", isInLastPlayExperiment=" + this.isInLastPlayExperiment + ", isInPricePayoutExperiment=" + this.isInPricePayoutExperiment + ", showAmericanOdds=" + this.showAmericanOdds + ", contractIdToEstimatedFees=" + this.contractIdToEstimatedFees + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GameDetailDataState(boolean z, UiEcEvent uiEcEvent, Optional<FuturesAccount> optional, String str, MarketSessionChangeDataState marketSessionChangeDataState, DisplaySpan displaySpan, Chart<? extends Parcelable> chart, Point point, Set<UUID> set, Map<UUID, EventQuote> contractIdToQuotes, Map<UUID, ? extends List<Delta>> contractIdToOpenInterestDeltas, Map<UUID, EventFundamental> contractIdToFundamentals, Map<ContractIdWithSide, StrikeContract> contractIdToStrikeContract, Map<UUID, EventContract> map, List<ContractGroup> list, List<ContractGroup> list2, List<ContractGroupSectionWithContractGroup> list3, Map<ContractIdWithSide, ContractDisplayDetails> displayDetails, ContractDisplayDetails contractDisplayDetails, GameDetailSelectionState comboSelection, Map<ContractIdWithSide, ContractDisplayDetails> comboSheetDisplayDetails, Map<ContractIdWithSide, StrikeContract> comboSelectedStrikeContracts, StreamComboQuoteUseCase3 streamComboQuoteUseCase3, Map<UUID, UiEventContractPosition> map2, Map<UUID, ? extends List<UiEventOrder>> pendingOrders, EventTimeline eventTimeline, PredictionMarketEventState predictionMarketEventState, TitleState titleState, BottomSheetSelection bottomSheetSelection, AboutEventType aboutEventType, boolean z2, int i, Map<Integer, Boolean> propsExpansionState, BigDecimal bigDecimal, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, Map<UUID, ? extends BigDecimal> contractIdToEstimatedFees) {
        boolean z8;
        GameDetailViewState.SixBoxState sixBoxStateBuildSixBoxState;
        GameDetailLastPlayState gameDetailLastPlayState;
        PrepacksState prepacksStateBuildPrepacksState;
        PlayerPropsState playerPropsStateBuildPlayerPropsState;
        StringResource stringResourceInvoke;
        ContractGroup contractGroup;
        SortedMap<Integer, EventContract> orderedContracts;
        Collection<EventContract> collectionValues;
        Intrinsics.checkNotNullParameter(contractIdToQuotes, "contractIdToQuotes");
        Intrinsics.checkNotNullParameter(contractIdToOpenInterestDeltas, "contractIdToOpenInterestDeltas");
        Intrinsics.checkNotNullParameter(contractIdToFundamentals, "contractIdToFundamentals");
        Intrinsics.checkNotNullParameter(contractIdToStrikeContract, "contractIdToStrikeContract");
        Intrinsics.checkNotNullParameter(displayDetails, "displayDetails");
        Intrinsics.checkNotNullParameter(comboSelection, "comboSelection");
        Intrinsics.checkNotNullParameter(comboSheetDisplayDetails, "comboSheetDisplayDetails");
        Intrinsics.checkNotNullParameter(comboSelectedStrikeContracts, "comboSelectedStrikeContracts");
        Intrinsics.checkNotNullParameter(pendingOrders, "pendingOrders");
        Intrinsics.checkNotNullParameter(titleState, "titleState");
        Intrinsics.checkNotNullParameter(propsExpansionState, "propsExpansionState");
        Intrinsics.checkNotNullParameter(contractIdToEstimatedFees, "contractIdToEstimatedFees");
        this.isComboEnabled = z;
        this.event = uiEcEvent;
        this.swapAccount = optional;
        this.individualAccountNumber = str;
        this.marketSessionChangeDataState = marketSessionChangeDataState;
        this.chartSpan = displaySpan;
        this.chart = chart;
        this.scrubbedPoint = point;
        this.allContractIdsForGame = set;
        this.contractIdToQuotes = contractIdToQuotes;
        this.contractIdToOpenInterestDeltas = contractIdToOpenInterestDeltas;
        this.contractIdToFundamentals = contractIdToFundamentals;
        this.contractIdToStrikeContract = contractIdToStrikeContract;
        this.allContractIdsToEventContract = map;
        this.contractGroup = list;
        this.prepacksContractGroup = list2;
        this.playerPropsGroupSection = list3;
        this.displayDetails = displayDetails;
        this.bottomSheetDisplayDetails = contractDisplayDetails;
        this.comboSelection = comboSelection;
        this.comboSheetDisplayDetails = comboSheetDisplayDetails;
        this.comboSelectedStrikeContracts = comboSelectedStrikeContracts;
        this.comboQuoteResult = streamComboQuoteUseCase3;
        this.contractIdToPositionsForCurrentGame = map2;
        this.pendingOrders = pendingOrders;
        this.eventTimeline = eventTimeline;
        this.eventState = predictionMarketEventState;
        this.titleState = titleState;
        this.bottomSheetSelection = bottomSheetSelection;
        this.selectedAboutEventType = aboutEventType;
        this.showDisabledTradeButtonMessage = z2;
        this.selectedPropsCategoryIndex = i;
        this.propsExpansionState = propsExpansionState;
        this.estimatedFeesPerQuantity = bigDecimal;
        this.isInEcSportsExperiment = z3;
        this.isInAmericanOddsExperiment = z4;
        this.isInLastPlayExperiment = z5;
        this.isInPricePayoutExperiment = z6;
        this.showAmericanOdds = z7;
        this.contractIdToEstimatedFees = contractIdToEstimatedFees;
        this.contractsForChart = (uiEcEvent == null || (orderedContracts = uiEcEvent.getOrderedContracts()) == null || (collectionValues = orderedContracts.values()) == null) ? null : CollectionsKt.take(collectionValues, 2);
        if (map2 != null) {
            z8 = map2.isEmpty() ^ true;
        }
        this.hasPositions = z8;
        this.shouldMirrorSecondContractImage = z3;
        if (list == null || (contractGroup = (ContractGroup) CollectionsKt.firstOrNull((List) list)) == null) {
            sixBoxStateBuildSixBoxState = null;
        } else {
            BottomSheetSelection.ContractOption contractOption = bottomSheetSelection instanceof BottomSheetSelection.ContractOption ? (BottomSheetSelection.ContractOption) bottomSheetSelection : null;
            ContractOptionData data = contractOption != null ? contractOption.getData() : null;
            GameDetailSelectionState.ContractSideSelections contractSideSelections = comboSelection instanceof GameDetailSelectionState.ContractSideSelections ? (GameDetailSelectionState.ContractSideSelections) comboSelection : null;
            sixBoxStateBuildSixBoxState = BuildSixBoxState.buildSixBoxState(contractGroup, contractIdToQuotes, data, contractSideSelections != null ? contractSideSelections.getSelections() : null, z7, contractIdToEstimatedFees);
        }
        this.sixBoxState = sixBoxStateBuildSixBoxState;
        if (z5) {
            if ((predictionMarketEventState != null ? predictionMarketEventState.getLastPlayHeader() : null) == null) {
                if ((predictionMarketEventState != null ? predictionMarketEventState.getLastPlayDescription() : null) != null) {
                }
            }
            String lastPlayHeader = predictionMarketEventState.getLastPlayHeader();
            gameDetailLastPlayState = new GameDetailLastPlayState((lastPlayHeader == null || (stringResourceInvoke = StringResource.INSTANCE.invoke(lastPlayHeader)) == null) ? StringResource.INSTANCE.invoke(C16283R.string.game_detail_last_play_header, new Object[0]) : stringResourceInvoke, predictionMarketEventState.getLastPlayDescription());
        } else {
            gameDetailLastPlayState = null;
        }
        this.lastPlayState = gameDetailLastPlayState;
        if (list2 != null) {
            BottomSheetSelection.ContractOption contractOption2 = bottomSheetSelection instanceof BottomSheetSelection.ContractOption ? (BottomSheetSelection.ContractOption) bottomSheetSelection : null;
            ContractOptionData data2 = contractOption2 != null ? contractOption2.getData() : null;
            GameDetailSelectionState.ContractSideSelections contractSideSelections2 = comboSelection instanceof GameDetailSelectionState.ContractSideSelections ? (GameDetailSelectionState.ContractSideSelections) comboSelection : null;
            prepacksStateBuildPrepacksState = BuildPrepacksState.buildPrepacksState(list2, contractIdToQuotes, data2, z7, contractIdToEstimatedFees, contractSideSelections2 != null ? contractSideSelections2.getSelections() : null);
        } else {
            prepacksStateBuildPrepacksState = null;
        }
        this.prepacksState = prepacksStateBuildPrepacksState;
        if (list3 != null) {
            BottomSheetSelection.ContractOption contractOption3 = bottomSheetSelection instanceof BottomSheetSelection.ContractOption ? (BottomSheetSelection.ContractOption) bottomSheetSelection : null;
            ContractOptionData data3 = contractOption3 != null ? contractOption3.getData() : null;
            GameDetailSelectionState.ContractSideSelections contractSideSelections3 = comboSelection instanceof GameDetailSelectionState.ContractSideSelections ? (GameDetailSelectionState.ContractSideSelections) comboSelection : null;
            playerPropsStateBuildPlayerPropsState = BuildPlayerPropsState.buildPlayerPropsState(list3, i, data3, contractIdToQuotes, propsExpansionState, z7, contractIdToEstimatedFees, contractSideSelections3 != null ? contractSideSelections3.getSelections() : null);
        } else {
            playerPropsStateBuildPlayerPropsState = null;
        }
        this.playerPropsState = playerPropsStateBuildPlayerPropsState;
        BottomSheetSelection.ContractOption contractOption4 = bottomSheetSelection instanceof BottomSheetSelection.ContractOption ? (BottomSheetSelection.ContractOption) bottomSheetSelection : null;
        ContractOptionData data4 = contractOption4 != null ? contractOption4.getData() : null;
        BottomSheetSelection.Position position = bottomSheetSelection instanceof BottomSheetSelection.Position ? (BottomSheetSelection.Position) bottomSheetSelection : null;
        this.tradeBarState = BuildTradeButton.buildTradeBar(optional, uiEcEvent, map, data4, position != null ? position.getContractId() : null, contractIdToQuotes, map2, bigDecimal, z6, getMarketOpen(), getOverrideWithPositionBottomSheet(), z2, pendingOrders);
    }

    public final boolean isComboEnabled() {
        return this.isComboEnabled;
    }

    public final UiEcEvent getEvent() {
        return this.event;
    }

    public final Optional<FuturesAccount> getSwapAccount() {
        return this.swapAccount;
    }

    public final String getIndividualAccountNumber() {
        return this.individualAccountNumber;
    }

    public final MarketSessionChangeDataState getMarketSessionChangeDataState() {
        return this.marketSessionChangeDataState;
    }

    public final DisplaySpan getChartSpan() {
        return this.chartSpan;
    }

    public final Chart<Parcelable> getChart() {
        return this.chart;
    }

    public final Point getScrubbedPoint() {
        return this.scrubbedPoint;
    }

    public final Set<UUID> getAllContractIdsForGame() {
        return this.allContractIdsForGame;
    }

    public /* synthetic */ GameDetailDataState(boolean z, UiEcEvent uiEcEvent, Optional optional, String str, MarketSessionChangeDataState marketSessionChangeDataState, DisplaySpan displaySpan, Chart chart, Point point, Set set, Map map, Map map2, Map map3, Map map4, Map map5, List list, List list2, List list3, Map map6, ContractDisplayDetails contractDisplayDetails, GameDetailSelectionState gameDetailSelectionState, Map map7, Map map8, StreamComboQuoteUseCase3 streamComboQuoteUseCase3, Map map9, Map map10, EventTimeline eventTimeline, PredictionMarketEventState predictionMarketEventState, TitleState titleState, BottomSheetSelection bottomSheetSelection, AboutEventType aboutEventType, boolean z2, int i, Map map11, BigDecimal bigDecimal, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, Map map12, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i2 & 2) != 0 ? null : uiEcEvent, (i2 & 4) != 0 ? null : optional, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : marketSessionChangeDataState, (i2 & 32) != 0 ? null : displaySpan, (i2 & 64) != 0 ? null : chart, (i2 & 128) != 0 ? null : point, (i2 & 256) != 0 ? null : set, (i2 & 512) != 0 ? MapsKt.emptyMap() : map, (i2 & 1024) != 0 ? MapsKt.emptyMap() : map2, (i2 & 2048) != 0 ? MapsKt.emptyMap() : map3, (i2 & 4096) != 0 ? MapsKt.emptyMap() : map4, (i2 & 8192) != 0 ? null : map5, (i2 & 16384) != 0 ? null : list, (32768 & i2) != 0 ? null : list2, (65536 & i2) != 0 ? null : list3, (131072 & i2) != 0 ? MapsKt.emptyMap() : map6, (262144 & i2) != 0 ? null : contractDisplayDetails, (524288 & i2) != 0 ? new GameDetailSelectionState.Empty(null, 1, null) : gameDetailSelectionState, (1048576 & i2) != 0 ? MapsKt.emptyMap() : map7, (2097152 & i2) != 0 ? MapsKt.emptyMap() : map8, (4194304 & i2) != 0 ? null : streamComboQuoteUseCase3, (8388608 & i2) != 0 ? null : map9, (16777216 & i2) != 0 ? MapsKt.emptyMap() : map10, (33554432 & i2) != 0 ? null : eventTimeline, (67108864 & i2) != 0 ? null : predictionMarketEventState, (134217728 & i2) != 0 ? new TitleState(null, null, 3, null) : titleState, (268435456 & i2) != 0 ? null : bottomSheetSelection, (536870912 & i2) != 0 ? null : aboutEventType, (1073741824 & i2) != 0 ? false : z2, (i2 & Integer.MIN_VALUE) != 0 ? 0 : i, (i3 & 1) != 0 ? MapsKt.emptyMap() : map11, (i3 & 2) != 0 ? null : bigDecimal, (i3 & 4) != 0 ? false : z3, (i3 & 8) != 0 ? false : z4, (i3 & 16) != 0 ? false : z5, (i3 & 32) != 0 ? false : z6, z7, (i3 & 128) != 0 ? MapsKt.emptyMap() : map12);
    }

    public final Map<UUID, EventQuote> getContractIdToQuotes() {
        return this.contractIdToQuotes;
    }

    public final Map<UUID, List<Delta>> getContractIdToOpenInterestDeltas() {
        return this.contractIdToOpenInterestDeltas;
    }

    public final Map<UUID, EventFundamental> getContractIdToFundamentals() {
        return this.contractIdToFundamentals;
    }

    public final Map<ContractIdWithSide, StrikeContract> getContractIdToStrikeContract() {
        return this.contractIdToStrikeContract;
    }

    public final Map<UUID, EventContract> getAllContractIdsToEventContract() {
        return this.allContractIdsToEventContract;
    }

    public final List<ContractGroup> getContractGroup() {
        return this.contractGroup;
    }

    public final List<ContractGroup> getPrepacksContractGroup() {
        return this.prepacksContractGroup;
    }

    public final List<ContractGroupSectionWithContractGroup> getPlayerPropsGroupSection() {
        return this.playerPropsGroupSection;
    }

    public final Map<ContractIdWithSide, ContractDisplayDetails> getDisplayDetails() {
        return this.displayDetails;
    }

    public final ContractDisplayDetails getBottomSheetDisplayDetails() {
        return this.bottomSheetDisplayDetails;
    }

    public final GameDetailSelectionState getComboSelection() {
        return this.comboSelection;
    }

    public final Map<ContractIdWithSide, ContractDisplayDetails> getComboSheetDisplayDetails() {
        return this.comboSheetDisplayDetails;
    }

    public final Map<ContractIdWithSide, StrikeContract> getComboSelectedStrikeContracts() {
        return this.comboSelectedStrikeContracts;
    }

    public final StreamComboQuoteUseCase3 getComboQuoteResult() {
        return this.comboQuoteResult;
    }

    public final Map<UUID, UiEventContractPosition> getContractIdToPositionsForCurrentGame() {
        return this.contractIdToPositionsForCurrentGame;
    }

    public final Map<UUID, List<UiEventOrder>> getPendingOrders() {
        return this.pendingOrders;
    }

    public final EventTimeline getEventTimeline() {
        return this.eventTimeline;
    }

    public final PredictionMarketEventState getEventState() {
        return this.eventState;
    }

    public final TitleState getTitleState() {
        return this.titleState;
    }

    public final BottomSheetSelection getBottomSheetSelection() {
        return this.bottomSheetSelection;
    }

    public final AboutEventType getSelectedAboutEventType() {
        return this.selectedAboutEventType;
    }

    public final boolean getShowDisabledTradeButtonMessage() {
        return this.showDisabledTradeButtonMessage;
    }

    public final int getSelectedPropsCategoryIndex() {
        return this.selectedPropsCategoryIndex;
    }

    public final Map<Integer, Boolean> getPropsExpansionState() {
        return this.propsExpansionState;
    }

    public final BigDecimal getEstimatedFeesPerQuantity() {
        return this.estimatedFeesPerQuantity;
    }

    public final boolean isInEcSportsExperiment() {
        return this.isInEcSportsExperiment;
    }

    public final boolean isInAmericanOddsExperiment() {
        return this.isInAmericanOddsExperiment;
    }

    public final boolean isInLastPlayExperiment() {
        return this.isInLastPlayExperiment;
    }

    public final boolean isInPricePayoutExperiment() {
        return this.isInPricePayoutExperiment;
    }

    public final boolean getShowAmericanOdds() {
        return this.showAmericanOdds;
    }

    public final Map<UUID, BigDecimal> getContractIdToEstimatedFees() {
        return this.contractIdToEstimatedFees;
    }

    public final List<EventContract> getContractsForChart() {
        return this.contractsForChart;
    }

    public final EventContractChartArg getChartArgs() {
        List<EventContract> list = this.contractsForChart;
        if (list == null) {
            return null;
        }
        List<EventContract> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((EventContract) it.next()).getContractId());
        }
        DisplaySpan displaySpan = this.chartSpan;
        if (displaySpan == null) {
            return null;
        }
        return EventContractChartArg.INSTANCE.create(arrayList, displaySpan, true);
    }

    public final boolean getMarketOpen() {
        MarketSessionChangeDataState marketSessionChangeDataState = this.marketSessionChangeDataState;
        if (marketSessionChangeDataState != null) {
            return Intrinsics.areEqual(marketSessionChangeDataState.isOpen(), Boolean.TRUE);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ChartSideLegendState getChartSideLegendState() {
        ImmutableList immutableListPersistentListOf;
        List<Line> lines;
        ChartSideLegendState.ContractItem contractItem;
        List<Point> points;
        Point point;
        DayNightColor dayNightColor;
        String value;
        List<EventContract> list = this.contractsForChart;
        int i = 0;
        EventContract eventContract = list != null ? (EventContract) CollectionsKt.getOrNull(list, 0) : null;
        List<EventContract> list2 = this.contractsForChart;
        EventContract eventContract2 = list2 != null ? (EventContract) CollectionsKt.getOrNull(list2, 1) : null;
        EventChartLabelItem chartLabelItem = eventContract != null ? toChartLabelItem(eventContract) : null;
        EventChartLabelItem chartLabelItem2 = eventContract2 != null ? toChartLabelItem(eventContract2) : null;
        Chart<Parcelable> chart = this.chart;
        if (chart == null || (lines = chart.getLines()) == null) {
            immutableListPersistentListOf = extensions2.persistentListOf();
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : lines) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Segment segment = (Segment) CollectionsKt.lastOrNull((List) ((Line) obj).getSegments());
                if (segment == null || (points = segment.getPoints()) == null || (point = (Point) CollectionsKt.lastOrNull((List) points)) == null) {
                    contractItem = null;
                } else {
                    float y = point.getY();
                    if (i != 1 ? !(eventContract2 == null || (dayNightColor = DayNightColor2.getDayNightColor(eventContract2)) == null) : !(eventContract == null || (dayNightColor = DayNightColor2.getDayNightColor(eventContract)) == null)) {
                        if (i == 1) {
                            value = chartLabelItem != null ? chartLabelItem.getValue() : null;
                            if (value == null) {
                                value = "";
                            }
                            contractItem = new ChartSideLegendState.ContractItem(value, dayNightColor, y);
                        } else {
                            if (chartLabelItem2 != null) {
                                value = chartLabelItem2.getValue();
                            }
                            if (value == null) {
                            }
                            contractItem = new ChartSideLegendState.ContractItem(value, dayNightColor, y);
                        }
                    }
                }
                if (contractItem != null) {
                    arrayList.add(contractItem);
                }
                i = i2;
            }
            immutableListPersistentListOf = extensions2.toImmutableList(arrayList);
            if (immutableListPersistentListOf == null) {
            }
        }
        return new ChartSideLegendState(immutableListPersistentListOf);
    }

    public final ChartState getChartState() {
        ChartState.DeltaAnimationData deltaAnimationData;
        List<EventContract> list = this.contractsForChart;
        ChartState.DeltaAnimationData deltaAnimationData2 = null;
        EventContract eventContract = list != null ? (EventContract) CollectionsKt.getOrNull(list, 0) : null;
        List<EventContract> list2 = this.contractsForChart;
        EventContract eventContract2 = list2 != null ? (EventContract) CollectionsKt.getOrNull(list2, 1) : null;
        Chart<Parcelable> chart = this.chart;
        EventChartColorOverlay eventChartColorOverlay = new EventChartColorOverlay(eventContract != null ? DayNightColor2.getDayNightColor(eventContract) : null, eventContract2 != null ? DayNightColor2.getDayNightColor(eventContract2) : null, null, null, null, 28, null);
        ChartSideLegendState chartSideLegendState = getChartSideLegendState();
        Point point = this.scrubbedPoint;
        DisplaySpan displaySpan = this.chartSpan;
        if (eventContract != null) {
            List<Delta> listEmptyList = this.contractIdToOpenInterestDeltas.get(eventContract.getContractId());
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            deltaAnimationData = new ChartState.DeltaAnimationData(extensions2.toImmutableList(listEmptyList), DayNightColor2.getDayNightColor(eventContract));
        } else {
            deltaAnimationData = null;
        }
        if (eventContract2 != null) {
            List<Delta> listEmptyList2 = this.contractIdToOpenInterestDeltas.get(eventContract2.getContractId());
            if (listEmptyList2 == null) {
                listEmptyList2 = CollectionsKt.emptyList();
            }
            deltaAnimationData2 = new ChartState.DeltaAnimationData(extensions2.toImmutableList(listEmptyList2), DayNightColor2.getDayNightColor(eventContract2));
        }
        return new ChartState(chart, eventChartColorOverlay, chartSideLegendState, point, displaySpan, deltaAnimationData, deltaAnimationData2);
    }

    public final boolean getHasPositions() {
        return this.hasPositions;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final EventChartLabelItem toChartLabelItem(EventContract eventContract) {
        BigDecimal lastTradePrice;
        BigDecimal lastTradePrice2;
        Object next;
        String value;
        String ecPrice;
        Intrinsics.checkNotNullParameter(eventContract, "<this>");
        DayNightColor dayNightColor = DayNightColor2.getDayNightColor(eventContract);
        String displayShortName = eventContract.getDisplayShortName();
        String ecPrice2 = null;
        if (this.scrubbedPoint == null) {
            EventQuote eventQuote = this.contractIdToQuotes.get(eventContract.getContractId());
            if (eventQuote != null && (lastTradePrice = eventQuote.getLastTradePrice()) != null) {
                ecPrice2 = PriceUtils.formatEcPrice(lastTradePrice, true);
            }
        } else {
            Chart<Parcelable> chart = this.chart;
            if ((chart != null ? chart.getLegend_data() : null) != null) {
                List<ChartLegendItem> list = this.chart.getLegend_data().get(String.valueOf(this.scrubbedPoint.getX()));
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (Intrinsics.areEqual(((ChartLegendItem) next).getId(), eventContract.getContractId().toString())) {
                            break;
                        }
                    }
                    ChartLegendItem chartLegendItem = (ChartLegendItem) next;
                    if (chartLegendItem == null || (value = chartLegendItem.getValue()) == null || (ecPrice = PriceUtils.formatEcPrice(value, true)) == null) {
                        EventQuote eventQuote2 = this.contractIdToQuotes.get(eventContract.getContractId());
                        if (eventQuote2 != null && (lastTradePrice2 = eventQuote2.getLastTradePrice()) != null) {
                            ecPrice2 = PriceUtils.formatEcPrice(lastTradePrice2, true);
                        }
                    } else {
                        ecPrice2 = ecPrice;
                    }
                }
            }
        }
        return new EventChartLabelItem(dayNightColor, displayShortName, ecPrice2);
    }

    public final boolean getShouldMirrorSecondContractImage() {
        return this.shouldMirrorSecondContractImage;
    }

    public final GameDetailViewState.SixBoxState getSixBoxState() {
        return this.sixBoxState;
    }

    private final boolean getOverrideWithPositionBottomSheet() {
        Map<UUID, UiEventContractPosition> map;
        BottomSheetSelection bottomSheetSelection = this.bottomSheetSelection;
        BottomSheetSelection.ContractOption contractOption = bottomSheetSelection instanceof BottomSheetSelection.ContractOption ? (BottomSheetSelection.ContractOption) bottomSheetSelection : null;
        if (contractOption == null) {
            return false;
        }
        ContractOptionData data = contractOption.getData();
        return (data.getContractColumnType() == ContractGroup3.CONTRACT_COLUMN_TYPE_BINARY || data.getContractColumnType() == ContractGroup3.CONTRACT_COLUMN_TYPE_PREPACK || data.getContractColumnType() == ContractGroup3.CONTRACT_COLUMN_TYPE_PROPS) && (map = this.contractIdToPositionsForCurrentGame) != null && map.containsKey(data.getSelectedContract().getContractId());
    }

    public final GameDetailBottomSheetState getBottomSheetState() {
        Map<UUID, EventContract> contractIdToEventContract;
        Event event;
        BottomSheetSelection bottomSheetSelection = this.bottomSheetSelection;
        boolean overrideWithPositionBottomSheet = getOverrideWithPositionBottomSheet();
        UiEcEvent uiEcEvent = this.event;
        if (uiEcEvent != null) {
            contractIdToEventContract = uiEcEvent.getContractIdToEventContract();
            event = null;
        } else {
            contractIdToEventContract = null;
            event = null;
        }
        Map<UUID, EventQuote> map = this.contractIdToQuotes;
        Event event2 = event;
        Map<ContractIdWithSide, StrikeContract> map2 = this.contractIdToStrikeContract;
        Event event3 = event2;
        ContractDisplayDetails contractDisplayDetails = this.bottomSheetDisplayDetails;
        UiEcEvent uiEcEvent2 = this.event;
        if (uiEcEvent2 != null) {
            event3 = uiEcEvent2.getEvent();
        }
        return BuildGameDetailBottomSheetState.buildGameDetailBottomSheetState(bottomSheetSelection, overrideWithPositionBottomSheet, contractIdToEventContract, map, map2, contractDisplayDetails, event3, this.contractIdToPositionsForCurrentGame, this.isInPricePayoutExperiment);
    }

    public final GameDetailLastPlayState getLastPlayState() {
        return this.lastPlayState;
    }

    public final PrepacksState getPrepacksState() {
        return this.prepacksState;
    }

    public final PlayerPropsState getPlayerPropsState() {
        return this.playerPropsState;
    }

    public final GameDetailTradeBarState getTradeBarState() {
        return this.tradeBarState;
    }

    /* compiled from: GameDetailDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/GameDetailDataState$Companion;", "", "<init>", "()V", "defaultSpans", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "getDefaultSpans", "()Lkotlinx/collections/immutable/PersistentList;", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ImmutableList3<DisplaySpan> getDefaultSpans() {
            return GameDetailDataState.defaultSpans;
        }
    }
}
