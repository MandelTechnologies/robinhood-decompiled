package com.robinhood.android.event.detail;

import android.os.Parcelable;
import com.robinhood.android.event.detail.EventDetailDuxo2;
import com.robinhood.android.event.detail.EventDetailViewState;
import com.robinhood.android.event.detail.builders.BuildEventContractUiDetail;
import com.robinhood.android.event.detail.builders.BuildTopAppBarPrimaryText;
import com.robinhood.android.event.detail.builders.ContractListData;
import com.robinhood.android.event.detail.duel.DuelEventContractUiDetail;
import com.robinhood.android.event.detail.p129ui.bottomsheets.EventDetailDisplayDataBottomSheet;
import com.robinhood.android.event.detail.p129ui.dialog.EventTradeOverlayDialogData;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor2;
import com.robinhood.android.eventcontracts.sharedeventui.PriceUtils;
import com.robinhood.android.eventcontracts.sharedeventui.animation.Delta;
import com.robinhood.android.eventcontracts.sharedeventui.chart.EventChartLabelItem;
import com.robinhood.android.lib.futures.trade.MarketSessionChangeDataState;
import com.robinhood.android.models.event.p186db.arsenal.Event;
import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p186db.arsenal.EventContractTradability;
import com.robinhood.android.models.event.p186db.arsenal.EventTimeline;
import com.robinhood.android.models.event.p186db.arsenal.EventViewMode;
import com.robinhood.android.models.event.p186db.ceres.UiEventContractPosition;
import com.robinhood.android.models.event.p186db.marketdata.EventFundamental;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.android.models.event.p186db.order.UiEventOrder;
import com.robinhood.android.models.event.p187ui.UiEcEvent;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.ChartLegendItem;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.models.serverdriven.experimental.api.Point;
import com.robinhood.utils.Either;
import com.robinhood.utils.Optional;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: EventDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÙ\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000f\u0012\u001c\b\u0002\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u001a\b\u0002\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00150\u000f\u0012\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001c0\u000f\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010!\u001a\u00020\"\u0012\b\b\u0002\u0010#\u001a\u00020\"\u0012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%\u0012\b\b\u0002\u0010'\u001a\u00020(\u0012\b\b\u0002\u0010)\u001a\u00020*\u0012\b\b\u0002\u0010+\u001a\u00020\"\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/\u0012\b\b\u0002\u00100\u001a\u00020\"¢\u0006\u0004\b1\u00102J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010v\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u0010w\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0017\u0010y\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fHÆ\u0003J\u0017\u0010z\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000fHÆ\u0003J\u001d\u0010{\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u000fHÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u001b\u0010}\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00150\u000fHÆ\u0003J\u0015\u0010~\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001c0\u000fHÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010 HÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020\"HÂ\u0003J\n\u0010\u0082\u0001\u001a\u00020\"HÆ\u0003J\u0012\u0010\u0083\u0001\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%HÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020(HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020*HÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\"HÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010-HÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010/HÆ\u0003J\n\u0010\u0089\u0001\u001a\u00020\"HÆ\u0003JÜ\u0002\u0010\u008a\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000f2\u001c\b\u0002\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u000f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u001a\b\u0002\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00150\u000f2\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001c0\u000f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020\"2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\b\b\u0002\u00100\u001a\u00020\"HÆ\u0001J\u0015\u0010\u008b\u0001\u001a\u00020\"2\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010\u008d\u0001\u001a\u00030\u008e\u0001HÖ\u0001J\n\u0010\u008f\u0001\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u001f\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b?\u0010>R%\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b@\u0010>R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR#\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00150\u000f¢\u0006\b\n\u0000\u001a\u0004\bC\u0010>R\u001d\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001c0\u000f¢\u0006\b\n\u0000\u001a\u0004\bD\u0010>R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0013\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010#\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\b#\u0010IR\u0019\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0011\u0010'\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0011\u0010)\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0011\u0010+\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\b+\u0010IR\u0013\u0010,\u001a\u0004\u0018\u00010-¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0013\u0010.\u001a\u0004\u0018\u00010/¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0011\u00100\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\bT\u0010IR\u001f\u0010U\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bV\u0010>R\u0019\u0010W\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0013\u0010Z\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0013\u0010]\u001a\u0004\u0018\u00010^8F¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0013\u0010a\u001a\u0004\u0018\u00010b8F¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0011\u0010e\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\bf\u0010IR\u0019\u0010g\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\bh\u00108R\u0013\u0010i\u001a\u0004\u0018\u00010j8F¢\u0006\u0006\u001a\u0004\bk\u0010lR/\u0010m\u001a \u0012\u0006\u0012\u0004\u0018\u00010o\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020p\u0018\u00010%j\u0004\u0018\u0001`q\u0018\u00010n8F¢\u0006\u0006\u001a\u0004\br\u0010s¨\u0006\u0090\u0001"}, m3636d2 = {"Lcom/robinhood/android/event/detail/EventDetailDuelDataState;", "", "uiEvent", "Lcom/robinhood/android/models/event/ui/UiEcEvent;", "individualAccountNumber", "", "swapAccount", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/models/futures/db/FuturesAccount;", "chart", "Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "Landroid/os/Parcelable;", "eventTimeline", "Lcom/robinhood/android/models/event/db/arsenal/EventTimeline;", "contractIdToQuotes", "", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/db/marketdata/EventQuote;", "contractIdToPositionsForEcAccount", "Lcom/robinhood/android/models/event/db/ceres/UiEventContractPosition;", "contractIdToPendingOrders", "", "Lcom/robinhood/android/models/event/db/order/UiEventOrder;", "marketSessionChangeDataState", "Lcom/robinhood/android/lib/futures/trade/MarketSessionChangeDataState;", "contractIdToOpenInterestDeltas", "Lcom/robinhood/android/eventcontracts/sharedeventui/animation/Delta;", "contractIdToFundamentals", "Lcom/robinhood/android/models/event/db/marketdata/EventFundamental;", "chartActiveSpan", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "scrubbedPoint", "Lcom/robinhood/models/serverdriven/experimental/api/Point;", "isHeaderVisible", "", "isLiveActivityEnabled", "contractDataList", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/event/detail/builders/ContractListData;", "contractSelection", "Lcom/robinhood/android/event/detail/ContractSelection;", "selectedDisplayMode", "Lcom/robinhood/android/event/detail/ui/bottomsheets/EventDetailContractDisplayMode;", "isInEcSportsExperiment", "liveDataSection", "Lcom/robinhood/android/event/detail/EventDetailLiveDataSectionViewState;", "eventTradeOverlayDialogData", "Lcom/robinhood/android/event/detail/ui/dialog/EventTradeOverlayDialogData;", "formatPriceAsPercent", "<init>", "(Lcom/robinhood/android/models/event/ui/UiEcEvent;Ljava/lang/String;Lcom/robinhood/utils/Optional;Lcom/robinhood/models/serverdriven/experimental/api/Chart;Lcom/robinhood/android/models/event/db/arsenal/EventTimeline;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lcom/robinhood/android/lib/futures/trade/MarketSessionChangeDataState;Ljava/util/Map;Ljava/util/Map;Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;Lcom/robinhood/models/serverdriven/experimental/api/Point;ZZLkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/event/detail/ContractSelection;Lcom/robinhood/android/event/detail/ui/bottomsheets/EventDetailContractDisplayMode;ZLcom/robinhood/android/event/detail/EventDetailLiveDataSectionViewState;Lcom/robinhood/android/event/detail/ui/dialog/EventTradeOverlayDialogData;Z)V", "getUiEvent", "()Lcom/robinhood/android/models/event/ui/UiEcEvent;", "getIndividualAccountNumber", "()Ljava/lang/String;", "getSwapAccount", "()Lcom/robinhood/utils/Optional;", "getChart", "()Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "getEventTimeline", "()Lcom/robinhood/android/models/event/db/arsenal/EventTimeline;", "getContractIdToQuotes", "()Ljava/util/Map;", "getContractIdToPositionsForEcAccount", "getContractIdToPendingOrders", "getMarketSessionChangeDataState", "()Lcom/robinhood/android/lib/futures/trade/MarketSessionChangeDataState;", "getContractIdToOpenInterestDeltas", "getContractIdToFundamentals", "getChartActiveSpan", "()Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "getScrubbedPoint", "()Lcom/robinhood/models/serverdriven/experimental/api/Point;", "()Z", "getContractDataList", "()Lkotlinx/collections/immutable/ImmutableList;", "getContractSelection", "()Lcom/robinhood/android/event/detail/ContractSelection;", "getSelectedDisplayMode", "()Lcom/robinhood/android/event/detail/ui/bottomsheets/EventDetailContractDisplayMode;", "getLiveDataSection", "()Lcom/robinhood/android/event/detail/EventDetailLiveDataSectionViewState;", "getEventTradeOverlayDialogData", "()Lcom/robinhood/android/event/detail/ui/dialog/EventTradeOverlayDialogData;", "getFormatPriceAsPercent", "contractIdToPositions", "getContractIdToPositions", "contractDataListForChart", "getContractDataListForChart", "()Ljava/util/List;", "selectedContractId", "getSelectedContractId", "()Ljava/util/UUID;", "selectedContract", "Lcom/robinhood/android/models/event/db/arsenal/EventContract;", "getSelectedContract", "()Lcom/robinhood/android/models/event/db/arsenal/EventContract;", "viewMode", "Lcom/robinhood/android/models/event/db/arsenal/EventViewMode;", "getViewMode", "()Lcom/robinhood/android/models/event/db/arsenal/EventViewMode;", "marketOpen", "getMarketOpen", "title", "getTitle", "topBarData", "Lcom/robinhood/android/event/detail/EventDetailViewState$TopBarData;", "getTopBarData", "()Lcom/robinhood/android/event/detail/EventDetailViewState$TopBarData;", "contractHeader", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/android/event/detail/EventDetailViewState$DuelContractHeader;", "Lcom/robinhood/android/eventcontracts/sharedeventui/chart/EventChartLabelItem;", "Lcom/robinhood/android/eventcontracts/sharedeventui/chart/EventChartLabelData;", "getContractHeader", "()Lcom/robinhood/utils/Either;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "equals", "other", "hashCode", "", "toString", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class EventDetailDuelDataState {
    public static final int $stable = 8;
    private final Chart<Parcelable> chart;
    private final DisplaySpan chartActiveSpan;
    private final ImmutableList<ContractListData> contractDataList;
    private final List<ContractListData> contractDataListForChart;
    private final Map<UUID, EventFundamental> contractIdToFundamentals;
    private final Map<UUID, List<Delta>> contractIdToOpenInterestDeltas;
    private final Map<UUID, List<UiEventOrder>> contractIdToPendingOrders;
    private final Map<UUID, UiEventContractPosition> contractIdToPositionsForEcAccount;
    private final Map<UUID, EventQuote> contractIdToQuotes;
    private final EventDetailDuxo2 contractSelection;
    private final EventTimeline eventTimeline;
    private final EventTradeOverlayDialogData eventTradeOverlayDialogData;
    private final boolean formatPriceAsPercent;
    private final String individualAccountNumber;
    private final boolean isHeaderVisible;
    private final boolean isInEcSportsExperiment;
    private final boolean isLiveActivityEnabled;
    private final EventDetailLiveDataSectionViewState liveDataSection;
    private final MarketSessionChangeDataState marketSessionChangeDataState;
    private final Point scrubbedPoint;
    private final UUID selectedContractId;
    private final EventDetailDisplayDataBottomSheet selectedDisplayMode;
    private final Optional<FuturesAccount> swapAccount;
    private final UiEcEvent uiEvent;

    /* compiled from: EventDetailDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EventViewMode.values().length];
            try {
                iArr[EventViewMode.PAIR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventViewMode.MULTI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EventViewMode.UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public EventDetailDuelDataState() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, 4194303, null);
    }

    /* renamed from: component14, reason: from getter */
    private final boolean getIsHeaderVisible() {
        return this.isHeaderVisible;
    }

    public static /* synthetic */ EventDetailDuelDataState copy$default(EventDetailDuelDataState eventDetailDuelDataState, UiEcEvent uiEcEvent, String str, Optional optional, Chart chart, EventTimeline eventTimeline, Map map, Map map2, Map map3, MarketSessionChangeDataState marketSessionChangeDataState, Map map4, Map map5, DisplaySpan displaySpan, Point point, boolean z, boolean z2, ImmutableList immutableList, EventDetailDuxo2 eventDetailDuxo2, EventDetailDisplayDataBottomSheet eventDetailDisplayDataBottomSheet, boolean z3, EventDetailLiveDataSectionViewState eventDetailLiveDataSectionViewState, EventTradeOverlayDialogData eventTradeOverlayDialogData, boolean z4, int i, Object obj) {
        boolean z5;
        EventTradeOverlayDialogData eventTradeOverlayDialogData2;
        UiEcEvent uiEcEvent2 = (i & 1) != 0 ? eventDetailDuelDataState.uiEvent : uiEcEvent;
        String str2 = (i & 2) != 0 ? eventDetailDuelDataState.individualAccountNumber : str;
        Optional optional2 = (i & 4) != 0 ? eventDetailDuelDataState.swapAccount : optional;
        Chart chart2 = (i & 8) != 0 ? eventDetailDuelDataState.chart : chart;
        EventTimeline eventTimeline2 = (i & 16) != 0 ? eventDetailDuelDataState.eventTimeline : eventTimeline;
        Map map6 = (i & 32) != 0 ? eventDetailDuelDataState.contractIdToQuotes : map;
        Map map7 = (i & 64) != 0 ? eventDetailDuelDataState.contractIdToPositionsForEcAccount : map2;
        Map map8 = (i & 128) != 0 ? eventDetailDuelDataState.contractIdToPendingOrders : map3;
        MarketSessionChangeDataState marketSessionChangeDataState2 = (i & 256) != 0 ? eventDetailDuelDataState.marketSessionChangeDataState : marketSessionChangeDataState;
        Map map9 = (i & 512) != 0 ? eventDetailDuelDataState.contractIdToOpenInterestDeltas : map4;
        Map map10 = (i & 1024) != 0 ? eventDetailDuelDataState.contractIdToFundamentals : map5;
        DisplaySpan displaySpan2 = (i & 2048) != 0 ? eventDetailDuelDataState.chartActiveSpan : displaySpan;
        Point point2 = (i & 4096) != 0 ? eventDetailDuelDataState.scrubbedPoint : point;
        boolean z6 = (i & 8192) != 0 ? eventDetailDuelDataState.isHeaderVisible : z;
        UiEcEvent uiEcEvent3 = uiEcEvent2;
        boolean z7 = (i & 16384) != 0 ? eventDetailDuelDataState.isLiveActivityEnabled : z2;
        ImmutableList immutableList2 = (i & 32768) != 0 ? eventDetailDuelDataState.contractDataList : immutableList;
        EventDetailDuxo2 eventDetailDuxo22 = (i & 65536) != 0 ? eventDetailDuelDataState.contractSelection : eventDetailDuxo2;
        EventDetailDisplayDataBottomSheet eventDetailDisplayDataBottomSheet2 = (i & 131072) != 0 ? eventDetailDuelDataState.selectedDisplayMode : eventDetailDisplayDataBottomSheet;
        boolean z8 = (i & 262144) != 0 ? eventDetailDuelDataState.isInEcSportsExperiment : z3;
        EventDetailLiveDataSectionViewState eventDetailLiveDataSectionViewState2 = (i & 524288) != 0 ? eventDetailDuelDataState.liveDataSection : eventDetailLiveDataSectionViewState;
        EventTradeOverlayDialogData eventTradeOverlayDialogData3 = (i & 1048576) != 0 ? eventDetailDuelDataState.eventTradeOverlayDialogData : eventTradeOverlayDialogData;
        if ((i & 2097152) != 0) {
            eventTradeOverlayDialogData2 = eventTradeOverlayDialogData3;
            z5 = eventDetailDuelDataState.formatPriceAsPercent;
        } else {
            z5 = z4;
            eventTradeOverlayDialogData2 = eventTradeOverlayDialogData3;
        }
        return eventDetailDuelDataState.copy(uiEcEvent3, str2, optional2, chart2, eventTimeline2, map6, map7, map8, marketSessionChangeDataState2, map9, map10, displaySpan2, point2, z6, z7, immutableList2, eventDetailDuxo22, eventDetailDisplayDataBottomSheet2, z8, eventDetailLiveDataSectionViewState2, eventTradeOverlayDialogData2, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final UiEcEvent getUiEvent() {
        return this.uiEvent;
    }

    public final Map<UUID, List<Delta>> component10() {
        return this.contractIdToOpenInterestDeltas;
    }

    public final Map<UUID, EventFundamental> component11() {
        return this.contractIdToFundamentals;
    }

    /* renamed from: component12, reason: from getter */
    public final DisplaySpan getChartActiveSpan() {
        return this.chartActiveSpan;
    }

    /* renamed from: component13, reason: from getter */
    public final Point getScrubbedPoint() {
        return this.scrubbedPoint;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getIsLiveActivityEnabled() {
        return this.isLiveActivityEnabled;
    }

    public final ImmutableList<ContractListData> component16() {
        return this.contractDataList;
    }

    /* renamed from: component17, reason: from getter */
    public final EventDetailDuxo2 getContractSelection() {
        return this.contractSelection;
    }

    /* renamed from: component18, reason: from getter */
    public final EventDetailDisplayDataBottomSheet getSelectedDisplayMode() {
        return this.selectedDisplayMode;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getIsInEcSportsExperiment() {
        return this.isInEcSportsExperiment;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIndividualAccountNumber() {
        return this.individualAccountNumber;
    }

    /* renamed from: component20, reason: from getter */
    public final EventDetailLiveDataSectionViewState getLiveDataSection() {
        return this.liveDataSection;
    }

    /* renamed from: component21, reason: from getter */
    public final EventTradeOverlayDialogData getEventTradeOverlayDialogData() {
        return this.eventTradeOverlayDialogData;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getFormatPriceAsPercent() {
        return this.formatPriceAsPercent;
    }

    public final Optional<FuturesAccount> component3() {
        return this.swapAccount;
    }

    public final Chart<Parcelable> component4() {
        return this.chart;
    }

    /* renamed from: component5, reason: from getter */
    public final EventTimeline getEventTimeline() {
        return this.eventTimeline;
    }

    public final Map<UUID, EventQuote> component6() {
        return this.contractIdToQuotes;
    }

    public final Map<UUID, UiEventContractPosition> component7() {
        return this.contractIdToPositionsForEcAccount;
    }

    public final Map<UUID, List<UiEventOrder>> component8() {
        return this.contractIdToPendingOrders;
    }

    /* renamed from: component9, reason: from getter */
    public final MarketSessionChangeDataState getMarketSessionChangeDataState() {
        return this.marketSessionChangeDataState;
    }

    public final EventDetailDuelDataState copy(UiEcEvent uiEvent, String individualAccountNumber, Optional<FuturesAccount> swapAccount, Chart<? extends Parcelable> chart, EventTimeline eventTimeline, Map<UUID, EventQuote> contractIdToQuotes, Map<UUID, UiEventContractPosition> contractIdToPositionsForEcAccount, Map<UUID, ? extends List<UiEventOrder>> contractIdToPendingOrders, MarketSessionChangeDataState marketSessionChangeDataState, Map<UUID, ? extends List<Delta>> contractIdToOpenInterestDeltas, Map<UUID, EventFundamental> contractIdToFundamentals, DisplaySpan chartActiveSpan, Point scrubbedPoint, boolean isHeaderVisible, boolean isLiveActivityEnabled, ImmutableList<ContractListData> contractDataList, EventDetailDuxo2 contractSelection, EventDetailDisplayDataBottomSheet selectedDisplayMode, boolean isInEcSportsExperiment, EventDetailLiveDataSectionViewState liveDataSection, EventTradeOverlayDialogData eventTradeOverlayDialogData, boolean formatPriceAsPercent) {
        Intrinsics.checkNotNullParameter(contractIdToOpenInterestDeltas, "contractIdToOpenInterestDeltas");
        Intrinsics.checkNotNullParameter(contractIdToFundamentals, "contractIdToFundamentals");
        Intrinsics.checkNotNullParameter(contractSelection, "contractSelection");
        Intrinsics.checkNotNullParameter(selectedDisplayMode, "selectedDisplayMode");
        return new EventDetailDuelDataState(uiEvent, individualAccountNumber, swapAccount, chart, eventTimeline, contractIdToQuotes, contractIdToPositionsForEcAccount, contractIdToPendingOrders, marketSessionChangeDataState, contractIdToOpenInterestDeltas, contractIdToFundamentals, chartActiveSpan, scrubbedPoint, isHeaderVisible, isLiveActivityEnabled, contractDataList, contractSelection, selectedDisplayMode, isInEcSportsExperiment, liveDataSection, eventTradeOverlayDialogData, formatPriceAsPercent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventDetailDuelDataState)) {
            return false;
        }
        EventDetailDuelDataState eventDetailDuelDataState = (EventDetailDuelDataState) other;
        return Intrinsics.areEqual(this.uiEvent, eventDetailDuelDataState.uiEvent) && Intrinsics.areEqual(this.individualAccountNumber, eventDetailDuelDataState.individualAccountNumber) && Intrinsics.areEqual(this.swapAccount, eventDetailDuelDataState.swapAccount) && Intrinsics.areEqual(this.chart, eventDetailDuelDataState.chart) && Intrinsics.areEqual(this.eventTimeline, eventDetailDuelDataState.eventTimeline) && Intrinsics.areEqual(this.contractIdToQuotes, eventDetailDuelDataState.contractIdToQuotes) && Intrinsics.areEqual(this.contractIdToPositionsForEcAccount, eventDetailDuelDataState.contractIdToPositionsForEcAccount) && Intrinsics.areEqual(this.contractIdToPendingOrders, eventDetailDuelDataState.contractIdToPendingOrders) && Intrinsics.areEqual(this.marketSessionChangeDataState, eventDetailDuelDataState.marketSessionChangeDataState) && Intrinsics.areEqual(this.contractIdToOpenInterestDeltas, eventDetailDuelDataState.contractIdToOpenInterestDeltas) && Intrinsics.areEqual(this.contractIdToFundamentals, eventDetailDuelDataState.contractIdToFundamentals) && this.chartActiveSpan == eventDetailDuelDataState.chartActiveSpan && Intrinsics.areEqual(this.scrubbedPoint, eventDetailDuelDataState.scrubbedPoint) && this.isHeaderVisible == eventDetailDuelDataState.isHeaderVisible && this.isLiveActivityEnabled == eventDetailDuelDataState.isLiveActivityEnabled && Intrinsics.areEqual(this.contractDataList, eventDetailDuelDataState.contractDataList) && Intrinsics.areEqual(this.contractSelection, eventDetailDuelDataState.contractSelection) && this.selectedDisplayMode == eventDetailDuelDataState.selectedDisplayMode && this.isInEcSportsExperiment == eventDetailDuelDataState.isInEcSportsExperiment && Intrinsics.areEqual(this.liveDataSection, eventDetailDuelDataState.liveDataSection) && Intrinsics.areEqual(this.eventTradeOverlayDialogData, eventDetailDuelDataState.eventTradeOverlayDialogData) && this.formatPriceAsPercent == eventDetailDuelDataState.formatPriceAsPercent;
    }

    public int hashCode() {
        UiEcEvent uiEcEvent = this.uiEvent;
        int iHashCode = (uiEcEvent == null ? 0 : uiEcEvent.hashCode()) * 31;
        String str = this.individualAccountNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Optional<FuturesAccount> optional = this.swapAccount;
        int iHashCode3 = (iHashCode2 + (optional == null ? 0 : optional.hashCode())) * 31;
        Chart<Parcelable> chart = this.chart;
        int iHashCode4 = (iHashCode3 + (chart == null ? 0 : chart.hashCode())) * 31;
        EventTimeline eventTimeline = this.eventTimeline;
        int iHashCode5 = (iHashCode4 + (eventTimeline == null ? 0 : eventTimeline.hashCode())) * 31;
        Map<UUID, EventQuote> map = this.contractIdToQuotes;
        int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        Map<UUID, UiEventContractPosition> map2 = this.contractIdToPositionsForEcAccount;
        int iHashCode7 = (iHashCode6 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<UUID, List<UiEventOrder>> map3 = this.contractIdToPendingOrders;
        int iHashCode8 = (iHashCode7 + (map3 == null ? 0 : map3.hashCode())) * 31;
        MarketSessionChangeDataState marketSessionChangeDataState = this.marketSessionChangeDataState;
        int iHashCode9 = (((((iHashCode8 + (marketSessionChangeDataState == null ? 0 : marketSessionChangeDataState.hashCode())) * 31) + this.contractIdToOpenInterestDeltas.hashCode()) * 31) + this.contractIdToFundamentals.hashCode()) * 31;
        DisplaySpan displaySpan = this.chartActiveSpan;
        int iHashCode10 = (iHashCode9 + (displaySpan == null ? 0 : displaySpan.hashCode())) * 31;
        Point point = this.scrubbedPoint;
        int iHashCode11 = (((((iHashCode10 + (point == null ? 0 : point.hashCode())) * 31) + Boolean.hashCode(this.isHeaderVisible)) * 31) + Boolean.hashCode(this.isLiveActivityEnabled)) * 31;
        ImmutableList<ContractListData> immutableList = this.contractDataList;
        int iHashCode12 = (((((((iHashCode11 + (immutableList == null ? 0 : immutableList.hashCode())) * 31) + this.contractSelection.hashCode()) * 31) + this.selectedDisplayMode.hashCode()) * 31) + Boolean.hashCode(this.isInEcSportsExperiment)) * 31;
        EventDetailLiveDataSectionViewState eventDetailLiveDataSectionViewState = this.liveDataSection;
        int iHashCode13 = (iHashCode12 + (eventDetailLiveDataSectionViewState == null ? 0 : eventDetailLiveDataSectionViewState.hashCode())) * 31;
        EventTradeOverlayDialogData eventTradeOverlayDialogData = this.eventTradeOverlayDialogData;
        return ((iHashCode13 + (eventTradeOverlayDialogData != null ? eventTradeOverlayDialogData.hashCode() : 0)) * 31) + Boolean.hashCode(this.formatPriceAsPercent);
    }

    public String toString() {
        return "EventDetailDuelDataState(uiEvent=" + this.uiEvent + ", individualAccountNumber=" + this.individualAccountNumber + ", swapAccount=" + this.swapAccount + ", chart=" + this.chart + ", eventTimeline=" + this.eventTimeline + ", contractIdToQuotes=" + this.contractIdToQuotes + ", contractIdToPositionsForEcAccount=" + this.contractIdToPositionsForEcAccount + ", contractIdToPendingOrders=" + this.contractIdToPendingOrders + ", marketSessionChangeDataState=" + this.marketSessionChangeDataState + ", contractIdToOpenInterestDeltas=" + this.contractIdToOpenInterestDeltas + ", contractIdToFundamentals=" + this.contractIdToFundamentals + ", chartActiveSpan=" + this.chartActiveSpan + ", scrubbedPoint=" + this.scrubbedPoint + ", isHeaderVisible=" + this.isHeaderVisible + ", isLiveActivityEnabled=" + this.isLiveActivityEnabled + ", contractDataList=" + this.contractDataList + ", contractSelection=" + this.contractSelection + ", selectedDisplayMode=" + this.selectedDisplayMode + ", isInEcSportsExperiment=" + this.isInEcSportsExperiment + ", liveDataSection=" + this.liveDataSection + ", eventTradeOverlayDialogData=" + this.eventTradeOverlayDialogData + ", formatPriceAsPercent=" + this.formatPriceAsPercent + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EventDetailDuelDataState(UiEcEvent uiEcEvent, String str, Optional<FuturesAccount> optional, Chart<? extends Parcelable> chart, EventTimeline eventTimeline, Map<UUID, EventQuote> map, Map<UUID, UiEventContractPosition> map2, Map<UUID, ? extends List<UiEventOrder>> map3, MarketSessionChangeDataState marketSessionChangeDataState, Map<UUID, ? extends List<Delta>> contractIdToOpenInterestDeltas, Map<UUID, EventFundamental> contractIdToFundamentals, DisplaySpan displaySpan, Point point, boolean z, boolean z2, ImmutableList<ContractListData> immutableList, EventDetailDuxo2 contractSelection, EventDetailDisplayDataBottomSheet selectedDisplayMode, boolean z3, EventDetailLiveDataSectionViewState eventDetailLiveDataSectionViewState, EventTradeOverlayDialogData eventTradeOverlayDialogData, boolean z4) {
        List<ContractListData> listTake;
        List arrayList;
        Event event;
        Intrinsics.checkNotNullParameter(contractIdToOpenInterestDeltas, "contractIdToOpenInterestDeltas");
        Intrinsics.checkNotNullParameter(contractIdToFundamentals, "contractIdToFundamentals");
        Intrinsics.checkNotNullParameter(contractSelection, "contractSelection");
        Intrinsics.checkNotNullParameter(selectedDisplayMode, "selectedDisplayMode");
        this.uiEvent = uiEcEvent;
        this.individualAccountNumber = str;
        this.swapAccount = optional;
        this.chart = chart;
        this.eventTimeline = eventTimeline;
        this.contractIdToQuotes = map;
        this.contractIdToPositionsForEcAccount = map2;
        this.contractIdToPendingOrders = map3;
        this.marketSessionChangeDataState = marketSessionChangeDataState;
        this.contractIdToOpenInterestDeltas = contractIdToOpenInterestDeltas;
        this.contractIdToFundamentals = contractIdToFundamentals;
        this.chartActiveSpan = displaySpan;
        this.scrubbedPoint = point;
        this.isHeaderVisible = z;
        this.isLiveActivityEnabled = z2;
        this.contractDataList = immutableList;
        this.contractSelection = contractSelection;
        this.selectedDisplayMode = selectedDisplayMode;
        this.isInEcSportsExperiment = z3;
        this.liveDataSection = eventDetailLiveDataSectionViewState;
        this.eventTradeOverlayDialogData = eventTradeOverlayDialogData;
        this.formatPriceAsPercent = z4;
        if (immutableList != null) {
            EventViewMode viewMode = (uiEcEvent == null || (event = uiEcEvent.getEvent()) == null) ? null : event.getViewMode();
            int i = viewMode == null ? -1 : WhenMappings.$EnumSwitchMapping$0[viewMode.ordinal()];
            if (i == -1) {
                if (!immutableList.isEmpty()) {
                    arrayList = immutableList;
                    listTake = CollectionsKt.take(arrayList, 5);
                } else {
                    Iterator<ContractListData> it = immutableList.iterator();
                    while (it.hasNext()) {
                        if (it.next().getContract().getTradability() != EventContractTradability.UNTRADABLE) {
                            arrayList = new ArrayList();
                            for (ContractListData contractListData : immutableList) {
                                if (contractListData.getContract().getTradability() != EventContractTradability.UNTRADABLE) {
                                    arrayList.add(contractListData);
                                }
                            }
                            listTake = CollectionsKt.take(arrayList, 5);
                        }
                    }
                    arrayList = immutableList;
                    listTake = CollectionsKt.take(arrayList, 5);
                }
            } else if (i == 1) {
                listTake = CollectionsKt.take(immutableList, 2);
            } else {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!immutableList.isEmpty()) {
                }
            }
        } else {
            listTake = null;
        }
        this.contractDataListForChart = listTake;
        EventDetailDuxo2 eventDetailDuxo2 = this.contractSelection;
        EventDetailDuxo2.Selected selected = eventDetailDuxo2 instanceof EventDetailDuxo2.Selected ? (EventDetailDuxo2.Selected) eventDetailDuxo2 : null;
        this.selectedContractId = selected != null ? selected.getContractId() : null;
    }

    public final UiEcEvent getUiEvent() {
        return this.uiEvent;
    }

    public final String getIndividualAccountNumber() {
        return this.individualAccountNumber;
    }

    public final Optional<FuturesAccount> getSwapAccount() {
        return this.swapAccount;
    }

    public final Chart<Parcelable> getChart() {
        return this.chart;
    }

    public final EventTimeline getEventTimeline() {
        return this.eventTimeline;
    }

    public final Map<UUID, EventQuote> getContractIdToQuotes() {
        return this.contractIdToQuotes;
    }

    public final Map<UUID, UiEventContractPosition> getContractIdToPositionsForEcAccount() {
        return this.contractIdToPositionsForEcAccount;
    }

    public final Map<UUID, List<UiEventOrder>> getContractIdToPendingOrders() {
        return this.contractIdToPendingOrders;
    }

    public final MarketSessionChangeDataState getMarketSessionChangeDataState() {
        return this.marketSessionChangeDataState;
    }

    public /* synthetic */ EventDetailDuelDataState(UiEcEvent uiEcEvent, String str, Optional optional, Chart chart, EventTimeline eventTimeline, Map map, Map map2, Map map3, MarketSessionChangeDataState marketSessionChangeDataState, Map map4, Map map5, DisplaySpan displaySpan, Point point, boolean z, boolean z2, ImmutableList immutableList, EventDetailDuxo2 eventDetailDuxo2, EventDetailDisplayDataBottomSheet eventDetailDisplayDataBottomSheet, boolean z3, EventDetailLiveDataSectionViewState eventDetailLiveDataSectionViewState, EventTradeOverlayDialogData eventTradeOverlayDialogData, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uiEcEvent, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : optional, (i & 8) != 0 ? null : chart, (i & 16) != 0 ? null : eventTimeline, (i & 32) != 0 ? null : map, (i & 64) != 0 ? null : map2, (i & 128) != 0 ? null : map3, (i & 256) != 0 ? null : marketSessionChangeDataState, (i & 512) != 0 ? MapsKt.emptyMap() : map4, (i & 1024) != 0 ? MapsKt.emptyMap() : map5, (i & 2048) != 0 ? null : displaySpan, (i & 4096) != 0 ? null : point, (i & 8192) != 0 ? true : z, (i & 16384) != 0 ? false : z2, (i & 32768) != 0 ? null : immutableList, (i & 65536) != 0 ? EventDetailDuxo2.Loading.INSTANCE : eventDetailDuxo2, (i & 131072) != 0 ? EventDetailDisplayDataBottomSheet.LAST_YES_PRICE : eventDetailDisplayDataBottomSheet, (i & 262144) != 0 ? false : z3, (i & 524288) != 0 ? null : eventDetailLiveDataSectionViewState, (i & 1048576) != 0 ? null : eventTradeOverlayDialogData, (i & 2097152) != 0 ? false : z4);
    }

    public final Map<UUID, List<Delta>> getContractIdToOpenInterestDeltas() {
        return this.contractIdToOpenInterestDeltas;
    }

    public final Map<UUID, EventFundamental> getContractIdToFundamentals() {
        return this.contractIdToFundamentals;
    }

    public final DisplaySpan getChartActiveSpan() {
        return this.chartActiveSpan;
    }

    public final Point getScrubbedPoint() {
        return this.scrubbedPoint;
    }

    public final boolean isLiveActivityEnabled() {
        return this.isLiveActivityEnabled;
    }

    public final ImmutableList<ContractListData> getContractDataList() {
        return this.contractDataList;
    }

    public final EventDetailDuxo2 getContractSelection() {
        return this.contractSelection;
    }

    public final EventDetailDisplayDataBottomSheet getSelectedDisplayMode() {
        return this.selectedDisplayMode;
    }

    public final boolean isInEcSportsExperiment() {
        return this.isInEcSportsExperiment;
    }

    public final EventDetailLiveDataSectionViewState getLiveDataSection() {
        return this.liveDataSection;
    }

    public final EventTradeOverlayDialogData getEventTradeOverlayDialogData() {
        return this.eventTradeOverlayDialogData;
    }

    public final boolean getFormatPriceAsPercent() {
        return this.formatPriceAsPercent;
    }

    public final Map<UUID, UiEventContractPosition> getContractIdToPositions() {
        Map<UUID, UiEventContractPosition> map;
        if (this.uiEvent == null || (map = this.contractIdToPositionsForEcAccount) == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<UUID, UiEventContractPosition> entry : map.entrySet()) {
            if (this.uiEvent.getContractIds().contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public final List<ContractListData> getContractDataListForChart() {
        return this.contractDataListForChart;
    }

    public final UUID getSelectedContractId() {
        return this.selectedContractId;
    }

    public final EventContract getSelectedContract() {
        UiEcEvent uiEcEvent;
        SortedMap<Integer, EventContract> orderedContracts;
        Collection<EventContract> collectionValues;
        Object obj = null;
        if (this.selectedContractId == null || (uiEcEvent = this.uiEvent) == null || (orderedContracts = uiEcEvent.getOrderedContracts()) == null || (collectionValues = orderedContracts.values()) == null) {
            return null;
        }
        Iterator<T> it = collectionValues.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((EventContract) next).getContractId(), this.selectedContractId)) {
                obj = next;
                break;
            }
        }
        return (EventContract) obj;
    }

    public final EventViewMode getViewMode() {
        Event event;
        UiEcEvent uiEcEvent = this.uiEvent;
        if (uiEcEvent == null || (event = uiEcEvent.getEvent()) == null) {
            return null;
        }
        return event.getViewMode();
    }

    public final boolean getMarketOpen() {
        MarketSessionChangeDataState marketSessionChangeDataState = this.marketSessionChangeDataState;
        if (marketSessionChangeDataState != null) {
            return Intrinsics.areEqual(marketSessionChangeDataState.isOpen(), Boolean.TRUE);
        }
        return false;
    }

    public final Optional<String> getTitle() {
        Event event;
        Event event2;
        UiEcEvent uiEcEvent = this.uiEvent;
        String name = null;
        if (((uiEcEvent == null || (event2 = uiEcEvent.getEvent()) == null) ? null : event2.getViewMode()) == EventViewMode.PAIR && this.isInEcSportsExperiment) {
            return null;
        }
        Optional.Companion companion = Optional.INSTANCE;
        UiEcEvent uiEcEvent2 = this.uiEvent;
        if (uiEcEvent2 != null && (event = uiEcEvent2.getEvent()) != null) {
            name = event.getName();
        }
        return companion.m2972of(name);
    }

    public final EventDetailViewState.TopBarData getTopBarData() {
        EventContract eventContract;
        UiEcEvent uiEcEvent = this.uiEvent;
        if (uiEcEvent == null) {
            return null;
        }
        if (uiEcEvent.getEvent().getViewMode() == EventViewMode.PAIR) {
            if (this.isInEcSportsExperiment) {
                return new EventDetailViewState.TopBarData(StringResource.INSTANCE.invoke(this.uiEvent.getEvent().getName()), null);
            }
            if (this.isHeaderVisible) {
                return null;
            }
            Collection<EventContract> collectionValues = this.uiEvent.getOrderedContracts().values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
            List list = CollectionsKt.toList(collectionValues);
            EventContract eventContract2 = (EventContract) CollectionsKt.getOrNull(list, 0);
            if (eventContract2 == null || (eventContract = (EventContract) CollectionsKt.getOrNull(list, 1)) == null) {
                return null;
            }
            Map<UUID, EventQuote> map = this.contractIdToQuotes;
            EventQuote eventQuote = map != null ? map.get(eventContract2.getContractId()) : null;
            Map<UUID, EventQuote> map2 = this.contractIdToQuotes;
            return new EventDetailViewState.TopBarData(BuildTopAppBarPrimaryText.buildTopAppBarPrimaryText(eventQuote, map2 != null ? map2.get(eventContract.getContractId()) : null), this.uiEvent.getEvent().getName());
        }
        if (this.isHeaderVisible) {
            return null;
        }
        return new EventDetailViewState.TopBarData(StringResource.INSTANCE.invoke(this.uiEvent.getEvent().getName()), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Either<EventDetailViewState.DuelContractHeader, ImmutableList<EventChartLabelItem>> getContractHeader() {
        EventContract eventContract;
        EventQuote eventQuote;
        BigDecimal lastTradePrice;
        String ecPrice;
        EventQuote eventQuote2;
        BigDecimal lastTradePrice2;
        Object next;
        String value;
        Event event;
        UiEcEvent uiEcEvent = this.uiEvent;
        ImmutableList3 persistentList = null;
        EventViewMode viewMode = (uiEcEvent == null || (event = uiEcEvent.getEvent()) == null) ? null : event.getViewMode();
        int i = viewMode == null ? -1 : WhenMappings.$EnumSwitchMapping$0[viewMode.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            Collection<EventContract> collectionValues = this.uiEvent.getOrderedContracts().values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
            List list = CollectionsKt.toList(collectionValues);
            EventContract eventContract2 = (EventContract) CollectionsKt.getOrNull(list, 0);
            if (eventContract2 != null && (eventContract = (EventContract) CollectionsKt.getOrNull(list, 1)) != null) {
                Map<UUID, EventQuote> map = this.contractIdToQuotes;
                EventQuote eventQuote3 = map != null ? map.get(eventContract2.getContractId()) : null;
                Map<UUID, EventQuote> map2 = this.contractIdToQuotes;
                EventQuote eventQuote4 = map2 != null ? map2.get(eventContract.getContractId()) : null;
                Point point = this.scrubbedPoint;
                Chart<Parcelable> chart = this.chart;
                EventFundamental eventFundamental = this.contractIdToFundamentals.get(eventContract2.getContractId());
                List<Delta> listEmptyList = this.contractIdToOpenInterestDeltas.get(eventContract2.getContractId());
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                DuelEventContractUiDetail duelEventContractUiDetailBuildDuelEventContractUiDetail = BuildEventContractUiDetail.buildDuelEventContractUiDetail(eventContract2, point, chart, eventFundamental, eventQuote3, extensions2.toImmutableList(listEmptyList), this.formatPriceAsPercent);
                Point point2 = this.scrubbedPoint;
                Chart<Parcelable> chart2 = this.chart;
                EventFundamental eventFundamental2 = this.contractIdToFundamentals.get(eventContract.getContractId());
                List<Delta> listEmptyList2 = this.contractIdToOpenInterestDeltas.get(eventContract.getContractId());
                if (listEmptyList2 == null) {
                    listEmptyList2 = CollectionsKt.emptyList();
                }
                return new Either.Left(new EventDetailViewState.DuelContractHeader(duelEventContractUiDetailBuildDuelEventContractUiDetail, BuildEventContractUiDetail.buildDuelEventContractUiDetail(eventContract, point2, chart2, eventFundamental2, eventQuote4, extensions2.toImmutableList(listEmptyList2), this.formatPriceAsPercent), this.isLiveActivityEnabled && this.scrubbedPoint == null && getMarketOpen()));
            }
            return new Either.Left(null);
        }
        if (i != 2) {
            if (i == 3) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        List<ContractListData> list2 = this.contractDataListForChart;
        if (list2 != null) {
            List<ContractListData> list3 = list2;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                EventContract contract = ((ContractListData) it.next()).getContract();
                DayNightColor dayNightColor = DayNightColor2.getDayNightColor(contract);
                String displayShortName = contract.getDisplayShortName();
                if (this.scrubbedPoint == null) {
                    Map<UUID, EventQuote> map3 = this.contractIdToQuotes;
                    ecPrice = (map3 == null || (eventQuote = map3.get(contract.getContractId())) == null || (lastTradePrice = eventQuote.getLastTradePrice()) == null) ? null : PriceUtils.formatEcPrice(lastTradePrice, this.formatPriceAsPercent);
                } else {
                    Chart<Parcelable> chart3 = this.chart;
                    if ((chart3 != null ? chart3.getLegend_data() : null) != null) {
                        List<ChartLegendItem> list4 = this.chart.getLegend_data().get(String.valueOf(this.scrubbedPoint.getX()));
                        if (list4 != null) {
                            Iterator<T> it2 = list4.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                                if (Intrinsics.areEqual(((ChartLegendItem) next).getId(), contract.getContractId().toString())) {
                                    break;
                                }
                            }
                            ChartLegendItem chartLegendItem = (ChartLegendItem) next;
                            if (chartLegendItem == null || (value = chartLegendItem.getValue()) == null || (ecPrice = PriceUtils.formatEcPrice(value, this.formatPriceAsPercent)) == null) {
                                Map<UUID, EventQuote> map4 = this.contractIdToQuotes;
                                if (map4 != null && (eventQuote2 = map4.get(contract.getContractId())) != null && (lastTradePrice2 = eventQuote2.getLastTradePrice()) != null) {
                                    ecPrice = PriceUtils.formatEcPrice(lastTradePrice2, this.formatPriceAsPercent);
                                }
                            }
                        }
                    }
                }
                arrayList.add(new EventChartLabelItem(dayNightColor, displayShortName, ecPrice));
            }
            persistentList = extensions2.toPersistentList(arrayList);
        }
        return new Either.Right(persistentList);
    }
}
