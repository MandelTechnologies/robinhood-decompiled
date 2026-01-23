package com.robinhood.android.futures.trade.p147ui.ladder;

import android.os.SystemClock;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.futures.contracts.FuturesLadderFragmentKey;
import com.robinhood.android.futures.ladder.C17286R;
import com.robinhood.android.futures.sharedfuturesui.contextualbar.LadderFtuxManager;
import com.robinhood.android.futures.sharedfuturesui.contextualbar.LadderFtuxProgressState;
import com.robinhood.android.futures.trade.analytics.LoggingUtils6;
import com.robinhood.android.futures.trade.extensions.DomSnapshots;
import com.robinhood.android.futures.trade.extensions.FutureOrders;
import com.robinhood.android.futures.trade.order.FuturesOrderContextFactory;
import com.robinhood.android.futures.trade.order.FuturesOrderManager;
import com.robinhood.android.futures.trade.p147ui.ladder.FuturesLadderDataState;
import com.robinhood.android.futures.trade.p147ui.ladder.FuturesLadderDuxo;
import com.robinhood.android.futures.trade.p147ui.ladder.FuturesLadderViewState;
import com.robinhood.android.futures.trade.p147ui.ladder.LadderEvent;
import com.robinhood.android.futures.trade.p147ui.ladder.OrderSpec;
import com.robinhood.android.futures.trade.p147ui.ladder.gestures.LadderCustomGestureDetector;
import com.robinhood.android.lib.futures.trade.MarketSessionChangeDataState;
import com.robinhood.android.lib.futures.trade.StreamMarketSessionChangeStateUseCase;
import com.robinhood.android.lib.futures.trade.UiFuturesOrderContext;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.android.models.futures.FuturesLadderKillswitchExperiment;
import com.robinhood.android.models.futures.api.ApiFuturesBuyingPower;
import com.robinhood.android.models.futures.api.account.FuturesAccountType;
import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import com.robinhood.android.models.futures.api.order.FuturesOrderState;
import com.robinhood.android.models.futures.api.order.FuturesTimeInForce;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct5;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesTradingHours;
import com.robinhood.android.models.futures.arsenal.p188db.UiFuturesContract;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesClosesRange;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesQuote;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.android.models.futures.p189db.FuturesCostBasis;
import com.robinhood.android.models.futures.p189db.UiFuturesOrder;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.history.contracts.account.AccountsHistoryAccountTypeFilter;
import com.robinhood.shared.history.contracts.account.AccountsHistoryContract;
import com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeFilter;
import com.robinhood.store.futures.FuturesAccountStore;
import com.robinhood.store.futures.FuturesOrderStore;
import com.robinhood.store.futures.FuturesSettingsStore;
import com.robinhood.store.futures.PostTradeLadderFtuxState;
import com.robinhood.store.futures.RhdCostBasisStore;
import com.robinhood.store.futures.arsenal.FuturesContractStore;
import com.robinhood.store.futures.arsenal.FuturesTradingHoursStore;
import com.robinhood.store.futures.marketdata.FuturesMarketDataStore;
import com.robinhood.store.futures.marketdata.FuturesQuoteStore;
import com.robinhood.store.futures.p404di.FuturesFtuxPref;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.TimberLogger;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.websocket.p410dx.DxWebsocketSource;
import com.robinhood.websocket.p410dx.models.DxFeedData;
import com.robinhood.websocket.p410dx.models.DxResponse;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Await2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Timeout6;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: FuturesLadderDuxo.kt */
@Metadata(m3635d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 k2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006:\u0001kB£\u0001\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u000e\b\u0001\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 \u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020'\u0012\u0006\u0010(\u001a\u00020)\u0012\b\b\u0002\u0010*\u001a\u00020+¢\u0006\u0004\b,\u0010-J\b\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u000203H\u0016J\u0010\u00105\u001a\u0002032\u0006\u00106\u001a\u000207H\u0016J\b\u00108\u001a\u000203H\u0016J\b\u00109\u001a\u000203H\u0016J\u0010\u0010:\u001a\u0002032\u0006\u0010;\u001a\u000207H\u0016J\u0010\u0010<\u001a\u0002032\u0006\u0010=\u001a\u00020>H\u0016J\b\u0010?\u001a\u000203H\u0016J\b\u0010@\u001a\u00020AH\u0002J\b\u0010B\u001a\u000203H\u0016J\b\u0010C\u001a\u000203H\u0016J\b\u0010D\u001a\u000203H\u0016J\u0010\u0010E\u001a\u0002032\u0006\u0010F\u001a\u00020GH\u0016J\u0006\u0010H\u001a\u000203J\u0010\u0010I\u001a\u0002032\u0006\u0010J\u001a\u00020KH\u0016J\u0010\u0010L\u001a\u0002032\u0006\u0010M\u001a\u00020NH\u0016J\b\u0010O\u001a\u000203H\u0016J\u0010\u0010P\u001a\u0002032\u0006\u0010Q\u001a\u00020RH\u0016J\u0010\u0010S\u001a\u0002032\u0006\u0010T\u001a\u00020NH\u0016J\u0018\u0010U\u001a\u0002032\u0006\u0010V\u001a\u0002072\u0006\u0010W\u001a\u000207H\u0016J\u0012\u0010X\u001a\u0002032\b\u0010Y\u001a\u0004\u0018\u00010ZH\u0016J\u0010\u0010[\u001a\u0002032\u0006\u0010\\\u001a\u00020\u0002H\u0002J\u0010\u0010]\u001a\u0002032\u0006\u0010\\\u001a\u00020\u0002H\u0002J\u0010\u0010^\u001a\u0002032\u0006\u0010_\u001a\u000207H\u0016J\u0010\u0010`\u001a\u0002032\u0006\u0010a\u001a\u000207H\u0016J\u0018\u0010b\u001a\u0002032\u0006\u0010c\u001a\u00020N2\u0006\u0010d\u001a\u00020NH\u0016J\b\u0010e\u001a\u000203H\u0016J\b\u0010f\u001a\u000203H\u0016J\u0016\u0010g\u001a\u000207*\u00020h2\b\u0010i\u001a\u0004\u0018\u00010jH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u00020#X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006l"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState;", "Lcom/robinhood/android/futures/trade/ui/ladder/LadderEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/android/futures/trade/ui/ladder/LadderCallbacks;", "dxWebsocketSource", "Lcom/robinhood/websocket/dx/DxWebsocketSource;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "futuresAccountStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "futuresContractStore", "Lcom/robinhood/store/futures/arsenal/FuturesContractStore;", "futuresMarketDataStore", "Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore;", "futuresOrderManager", "Lcom/robinhood/android/futures/trade/order/FuturesOrderManager;", "futuresOrderStore", "Lcom/robinhood/store/futures/FuturesOrderStore;", "futuresQuoteStore", "Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;", "futuresSettingsStore", "Lcom/robinhood/store/futures/FuturesSettingsStore;", "futuresTradingHoursStore", "Lcom/robinhood/store/futures/arsenal/FuturesTradingHoursStore;", "rhdCostBasisStore", "Lcom/robinhood/store/futures/RhdCostBasisStore;", "ladderFtuxManager", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxManager;", "postTradeLadderFtuxStatePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/store/futures/PostTradeLadderFtuxState;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "streamMarketSessionChangeState", "Lcom/robinhood/android/lib/futures/trade/StreamMarketSessionChangeStateUseCase;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderStateProvider;", "<init>", "(Lcom/robinhood/websocket/dx/DxWebsocketSource;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/store/futures/FuturesAccountStore;Lcom/robinhood/store/futures/arsenal/FuturesContractStore;Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore;Lcom/robinhood/android/futures/trade/order/FuturesOrderManager;Lcom/robinhood/store/futures/FuturesOrderStore;Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;Lcom/robinhood/store/futures/FuturesSettingsStore;Lcom/robinhood/store/futures/arsenal/FuturesTradingHoursStore;Lcom/robinhood/store/futures/RhdCostBasisStore;Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxManager;Lcom/robinhood/prefs/EnumPreference;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/lib/futures/trade/StreamMarketSessionChangeStateUseCase;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderStateProvider;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "backupQuotePollJob", "Lkotlinx/coroutines/Job;", "onCreate", "", "onStart", "onSettingsVisibilityChange", "show", "", "onPnLClick", "showNextPostTradeFtuxState", "onAutoSendChanged", "autoSend", "onTimeInForceChanged", "timeInForce", "Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;", "onLadderEducationCtaClick", "generateNewRefId", "Ljava/util/UUID;", "continueToNextFtuxState", "backToPreviousFtuxState", "exitFtux", "onPlaceOrder", "orderSpec", "Lcom/robinhood/android/futures/trade/ui/ladder/OrderSpec;", "clearSelectedRowIndex", "onQuantityUpdated", "quantity", "Ljava/math/BigDecimal;", "onRowSelected", "selectedRowIndex", "", "onQuantitySelectorClicked", "onPendingOrderSelected", "selectedPendingOrders", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$SelectedPendingOrders;", "onPendingOrderDraggedOverRowChanged", "newDraggedOverIndex", "onPendingOrderDragEnded", "success", "isDelete", "onPendingOrderDragDirectionChanged", "direction", "Lcom/robinhood/android/futures/trade/ui/ladder/gestures/DragDirection;", "replaceSelectedPendingOrders", "state", "deletePendingOrder", "onExpandLadder", "expandOnTop", "onZoomStateChanged", "started", "onZoomScaleChanged", "zoomScale", "currentCenterIndex", "onFlattenClicked", "onOpenOrdersClicked", "isLadderKillswitchOnForUser", "Lcom/robinhood/android/models/futures/FuturesLadderKillswitchExperiment$Variant;", "futuresAccount", "Lcom/robinhood/android/models/futures/db/FuturesAccount;", "Companion", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class FuturesLadderDuxo extends BaseDuxo3<FuturesLadderDataState, FuturesLadderViewState, LadderEvent> implements HasSavedState, LadderCallbacks {
    public static final int DEPTH_OF_MARKET = 10;
    public static final String FUTURES_LADDER_FTUX_SAVED_STATE_HANDLE_KEY = "FUTURES_LADDER_FTUX_SAVED_STATE_HANDLE_KEY";
    private static final long MARKET_STATE_CHANGE_VIBRATION_MS = 500;
    public static final String SAVED_TRADE_QUANTITY = "trade_quantity";
    private Job backupQuotePollJob;
    private final DxWebsocketSource dxWebsocketSource;
    private final EventLogger eventLogger;
    private final ExperimentsStore experimentsStore;
    private final FuturesAccountStore futuresAccountStore;
    private final FuturesContractStore futuresContractStore;
    private final FuturesMarketDataStore futuresMarketDataStore;
    private final FuturesOrderManager futuresOrderManager;
    private final FuturesOrderStore futuresOrderStore;
    private final FuturesQuoteStore futuresQuoteStore;
    private final FuturesSettingsStore futuresSettingsStore;
    private final FuturesTradingHoursStore futuresTradingHoursStore;
    private final LadderFtuxManager ladderFtuxManager;
    private final EnumPreference<PostTradeLadderFtuxState> postTradeLadderFtuxStatePref;
    private final RhdCostBasisStore rhdCostBasisStore;
    private final SavedStateHandle savedStateHandle;
    private final StreamMarketSessionChangeStateUseCase streamMarketSessionChangeState;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: FuturesLadderDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FuturesLadderKillswitchExperiment.Variant.values().length];
            try {
                iArr[FuturesLadderKillswitchExperiment.Variant.ENABLE_ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FuturesLadderKillswitchExperiment.Variant.DISABLE_ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FuturesLadderKillswitchExperiment.Variant.DISABLE_NON_RHD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    public /* synthetic */ FuturesLadderDuxo(DxWebsocketSource dxWebsocketSource, ExperimentsStore experimentsStore, FuturesAccountStore futuresAccountStore, FuturesContractStore futuresContractStore, FuturesMarketDataStore futuresMarketDataStore, FuturesOrderManager futuresOrderManager, FuturesOrderStore futuresOrderStore, FuturesQuoteStore futuresQuoteStore, FuturesSettingsStore futuresSettingsStore, FuturesTradingHoursStore futuresTradingHoursStore, RhdCostBasisStore rhdCostBasisStore, LadderFtuxManager ladderFtuxManager, EnumPreference enumPreference, SavedStateHandle savedStateHandle, EventLogger eventLogger, StreamMarketSessionChangeStateUseCase streamMarketSessionChangeStateUseCase, DuxoBundle duxoBundle, FuturesLadderStateProvider futuresLadderStateProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dxWebsocketSource, experimentsStore, futuresAccountStore, futuresContractStore, futuresMarketDataStore, futuresOrderManager, futuresOrderStore, futuresQuoteStore, futuresSettingsStore, futuresTradingHoursStore, rhdCostBasisStore, ladderFtuxManager, enumPreference, savedStateHandle, eventLogger, streamMarketSessionChangeStateUseCase, duxoBundle, (i & 131072) != 0 ? new FuturesLadderStateProvider() : futuresLadderStateProvider);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FuturesLadderDuxo(DxWebsocketSource dxWebsocketSource, ExperimentsStore experimentsStore, FuturesAccountStore futuresAccountStore, FuturesContractStore futuresContractStore, FuturesMarketDataStore futuresMarketDataStore, FuturesOrderManager futuresOrderManager, FuturesOrderStore futuresOrderStore, FuturesQuoteStore futuresQuoteStore, FuturesSettingsStore futuresSettingsStore, FuturesTradingHoursStore futuresTradingHoursStore, RhdCostBasisStore rhdCostBasisStore, LadderFtuxManager ladderFtuxManager, @FuturesFtuxPref EnumPreference<PostTradeLadderFtuxState> postTradeLadderFtuxStatePref, SavedStateHandle savedStateHandle, EventLogger eventLogger, StreamMarketSessionChangeStateUseCase streamMarketSessionChangeState, DuxoBundle duxoBundle, FuturesLadderStateProvider stateProvider) {
        Intrinsics.checkNotNullParameter(dxWebsocketSource, "dxWebsocketSource");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        Intrinsics.checkNotNullParameter(futuresContractStore, "futuresContractStore");
        Intrinsics.checkNotNullParameter(futuresMarketDataStore, "futuresMarketDataStore");
        Intrinsics.checkNotNullParameter(futuresOrderManager, "futuresOrderManager");
        Intrinsics.checkNotNullParameter(futuresOrderStore, "futuresOrderStore");
        Intrinsics.checkNotNullParameter(futuresQuoteStore, "futuresQuoteStore");
        Intrinsics.checkNotNullParameter(futuresSettingsStore, "futuresSettingsStore");
        Intrinsics.checkNotNullParameter(futuresTradingHoursStore, "futuresTradingHoursStore");
        Intrinsics.checkNotNullParameter(rhdCostBasisStore, "rhdCostBasisStore");
        Intrinsics.checkNotNullParameter(ladderFtuxManager, "ladderFtuxManager");
        Intrinsics.checkNotNullParameter(postTradeLadderFtuxStatePref, "postTradeLadderFtuxStatePref");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(streamMarketSessionChangeState, "streamMarketSessionChangeState");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Companion companion = INSTANCE;
        Screen sourceScreen = ((FuturesLadderFragmentKey) companion.getArgs(savedStateHandle)).getSourceScreen();
        UUID futuresContractId = ((FuturesLadderFragmentKey) companion.getArgs(savedStateHandle)).getFuturesContractId();
        BigDecimal ONE = (BigDecimal) savedStateHandle.get(SAVED_TRADE_QUANTITY);
        if (ONE == null) {
            ONE = BigDecimal.ONE;
            Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        }
        super(new FuturesLadderDataState(sourceScreen, futuresContractId, ONE, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -8, null), stateProvider, duxoBundle);
        this.dxWebsocketSource = dxWebsocketSource;
        this.experimentsStore = experimentsStore;
        this.futuresAccountStore = futuresAccountStore;
        this.futuresContractStore = futuresContractStore;
        this.futuresMarketDataStore = futuresMarketDataStore;
        this.futuresOrderManager = futuresOrderManager;
        this.futuresOrderStore = futuresOrderStore;
        this.futuresQuoteStore = futuresQuoteStore;
        this.futuresSettingsStore = futuresSettingsStore;
        this.futuresTradingHoursStore = futuresTradingHoursStore;
        this.rhdCostBasisStore = rhdCostBasisStore;
        this.ladderFtuxManager = ladderFtuxManager;
        this.postTradeLadderFtuxStatePref = postTradeLadderFtuxStatePref;
        this.savedStateHandle = savedStateHandle;
        this.eventLogger = eventLogger;
        this.streamMarketSessionChangeState = streamMarketSessionChangeState;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        final StateFlow<FuturesLadderViewState> stateFlow = getStateFlow();
        SharedFlow sharedFlowShareIn = FlowKt.shareIn(FlowKt.take(new Flow<Integer>() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Integer> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow.collect(new C174902(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$$inlined$mapNotNull$1$2 */
            public static final class C174902<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$$inlined$mapNotNull$1$2", m3645f = "FuturesLadderDuxo.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C174902.this.emit(null, this);
                    }
                }

                public C174902(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        FuturesLadderViewState.LadderData ladder = ((FuturesLadderViewState) obj).getLadder();
                        Integer numBoxInt = ladder != null ? boxing.boxInt(ladder.getLastPriceIndex()) : null;
                        if (numBoxInt != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(numBoxInt, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        }, 1), getLifecycleScope(), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), 1);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C175041(sharedFlowShareIn, this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C175052(sharedFlowShareIn, this, null), 3, null);
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C175063(null));
    }

    /* compiled from: FuturesLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {128}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$1 */
    static final class C175041 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SharedFlow<Integer> $firstLastPriceIndexFlow;
        int label;
        final /* synthetic */ FuturesLadderDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C175041(SharedFlow<Integer> sharedFlow, FuturesLadderDuxo futuresLadderDuxo, Continuation<? super C175041> continuation) {
            super(2, continuation);
            this.$firstLastPriceIndexFlow = sharedFlow;
            this.this$0 = futuresLadderDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C175041(this.$firstLastPriceIndexFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C175041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: FuturesLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$1$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Integer, Continuation<? super Unit>, Object> {
            /* synthetic */ int I$0;
            int label;
            final /* synthetic */ FuturesLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(FuturesLadderDuxo futuresLadderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = futuresLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.I$0 = ((Number) obj).intValue();
                return anonymousClass1;
            }

            public final Object invoke(int i, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
                return invoke(num.intValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.submit(new LadderEvent.CenterAtIndex(this.I$0, false));
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<Integer> sharedFlow = this.$firstLastPriceIndexFlow;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: FuturesLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$2", m3645f = "FuturesLadderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$2 */
    static final class C175052 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SharedFlow<Integer> $firstLastPriceIndexFlow;
        int label;
        final /* synthetic */ FuturesLadderDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C175052(SharedFlow<Integer> sharedFlow, FuturesLadderDuxo futuresLadderDuxo, Continuation<? super C175052> continuation) {
            super(2, continuation);
            this.$firstLastPriceIndexFlow = sharedFlow;
            this.this$0 = futuresLadderDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C175052(this.$firstLastPriceIndexFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C175052) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: FuturesLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$2$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<Integer> $firstLastPriceIndexFlow;
            int label;
            final /* synthetic */ FuturesLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SharedFlow<Integer> sharedFlow, FuturesLadderDuxo futuresLadderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$firstLastPriceIndexFlow = sharedFlow;
                this.this$0 = futuresLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$firstLastPriceIndexFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$firstLastPriceIndexFlow, new C17491xfa56cebe(null, this.this$0));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: FuturesLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$2$1$2", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$2$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Integer, Continuation<? super Unit>, Object> {
                /* synthetic */ int I$0;
                int label;
                final /* synthetic */ FuturesLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(FuturesLadderDuxo futuresLadderDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.I$0 = ((Number) obj).intValue();
                    return anonymousClass2;
                }

                public final Object invoke(int i, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
                    return invoke(num.intValue(), continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.this$0.submit(new LadderEvent.CenterAtIndex(this.I$0, false));
                    return Unit.INSTANCE;
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$firstLastPriceIndexFlow, this.this$0, null);
                this.label = 1;
                if (Timeout6.withTimeout(1000L, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: FuturesLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3 */
    static final class C175063 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C175063(Continuation<? super C175063> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C175063 c175063 = FuturesLadderDuxo.this.new C175063(continuation);
            c175063.L$0 = obj;
            return c175063;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C175063) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: FuturesLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(FuturesLadderDuxo futuresLadderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = futuresLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                LadderFtuxProgressState firstFtuxPage$default = (LadderFtuxProgressState) this.this$0.getSavedStateHandle().get(FuturesLadderDuxo.FUTURES_LADDER_FTUX_SAVED_STATE_HANDLE_KEY);
                if (firstFtuxPage$default == null) {
                    firstFtuxPage$default = LadderFtuxManager.getFirstFtuxPage$default(this.this$0.ladderFtuxManager, false, 1, null);
                }
                this.this$0.applyMutation(new C501371(firstFtuxPage$default, null));
                return Unit.INSTANCE;
            }

            /* compiled from: FuturesLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$1$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$1$1, reason: invalid class name and collision with other inner class name */
            static final class C501371 extends ContinuationImpl7 implements Function2<FuturesLadderDataState, Continuation<? super FuturesLadderDataState>, Object> {
                final /* synthetic */ LadderFtuxProgressState $ftuxProgressState;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C501371(LadderFtuxProgressState ladderFtuxProgressState, Continuation<? super C501371> continuation) {
                    super(2, continuation);
                    this.$ftuxProgressState = ladderFtuxProgressState;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C501371 c501371 = new C501371(this.$ftuxProgressState, continuation);
                    c501371.L$0 = obj;
                    return c501371;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FuturesLadderDataState futuresLadderDataState, Continuation<? super FuturesLadderDataState> continuation) {
                    return ((C501371) create(futuresLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return FuturesLadderDataState.copy$default((FuturesLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, this.$ftuxProgressState, null, null, -536870913, null);
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(FuturesLadderDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(FuturesLadderDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(FuturesLadderDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(FuturesLadderDuxo.this, null), 3, null);
                Flow<UiFuturesContract> flowStreamUiFuturesContract = FuturesLadderDuxo.this.futuresContractStore.streamUiFuturesContract(((FuturesLadderFragmentKey) FuturesLadderDuxo.INSTANCE.getArgs(FuturesLadderDuxo.this.getSavedStateHandle())).getFuturesContractId());
                LifecycleHostCoroutineScope lifecycleScope = FuturesLadderDuxo.this.getLifecycleScope();
                SharingStarted.Companion companion = SharingStarted.INSTANCE;
                final SharedFlow sharedFlowShareIn = FlowKt.shareIn(flowStreamUiFuturesContract, lifecycleScope, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(sharedFlowShareIn, FuturesLadderDuxo.this, null), 3, null);
                SharedFlow sharedFlowShareIn2 = FlowKt.shareIn(FlowKt.distinctUntilChanged(new Flow<String>() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                        Object objCollect = sharedFlowShareIn.collect(new C174962(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$invokeSuspend$$inlined$map$1$2 */
                    public static final class C174962<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$invokeSuspend$$inlined$map$1$2", m3645f = "FuturesLadderDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C174962.this.emit(null, this);
                            }
                        }

                        public C174962(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                String streamingSymbol = ((UiFuturesContract) obj).getContract().getStreamingSymbol();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(streamingSymbol, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }), FuturesLadderDuxo.this.getLifecycleScope(), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass6(sharedFlowShareIn2, FuturesLadderDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass7(sharedFlowShareIn2, FuturesLadderDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass8(FuturesLadderDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass9(FuturesLadderDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass10(FuturesLadderDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass11(FuturesLadderDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass12(FuturesLadderDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass13(FuturesLadderDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass14(FuturesLadderDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass15(FuturesLadderDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass16(FuturesLadderDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass17(FuturesLadderDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass18(FuturesLadderDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass19(FuturesLadderDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass20(FuturesLadderDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: FuturesLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$2", m3645f = "FuturesLadderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(FuturesLadderDuxo futuresLadderDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = futuresLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.postTradeLadderFtuxStatePref.getChanges()), Integer.MAX_VALUE, null, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: FuturesLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "ladderFtuxState", "Lcom/robinhood/store/futures/PostTradeLadderFtuxState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$2$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PostTradeLadderFtuxState, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FuturesLadderDuxo futuresLadderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PostTradeLadderFtuxState postTradeLadderFtuxState, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(postTradeLadderFtuxState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesLadderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$2$1$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C501451 extends ContinuationImpl7 implements Function2<FuturesLadderDataState, Continuation<? super FuturesLadderDataState>, Object> {
                    final /* synthetic */ PostTradeLadderFtuxState $ladderFtuxState;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C501451(PostTradeLadderFtuxState postTradeLadderFtuxState, Continuation<? super C501451> continuation) {
                        super(2, continuation);
                        this.$ladderFtuxState = postTradeLadderFtuxState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C501451 c501451 = new C501451(this.$ladderFtuxState, continuation);
                        c501451.L$0 = obj;
                        return c501451;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesLadderDataState futuresLadderDataState, Continuation<? super FuturesLadderDataState> continuation) {
                        return ((C501451) create(futuresLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return FuturesLadderDataState.copy$default((FuturesLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, this.$ladderFtuxState, null, -1073741825, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C501451((PostTradeLadderFtuxState) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: FuturesLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$3", m3645f = "FuturesLadderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(FuturesLadderDuxo futuresLadderDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = futuresLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamIsInTradingSession$default = FuturesTradingHoursStore.streamIsInTradingSession$default(this.this$0.futuresTradingHoursStore, ((FuturesLadderFragmentKey) FuturesLadderDuxo.INSTANCE.getArgs(this.this$0.getSavedStateHandle())).getFuturesContractId(), null, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamIsInTradingSession$default, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: FuturesLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isInTradingSession", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$3$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ FuturesLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FuturesLadderDuxo futuresLadderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesLadderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$3$1$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$3$1$1, reason: invalid class name and collision with other inner class name */
                static final class C501461 extends ContinuationImpl7 implements Function2<FuturesLadderDataState, Continuation<? super FuturesLadderDataState>, Object> {
                    final /* synthetic */ boolean $isInTradingSession;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C501461(boolean z, Continuation<? super C501461> continuation) {
                        super(2, continuation);
                        this.$isInTradingSession = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C501461 c501461 = new C501461(this.$isInTradingSession, continuation);
                        c501461.L$0 = obj;
                        return c501461;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesLadderDataState futuresLadderDataState, Continuation<? super FuturesLadderDataState> continuation) {
                        return ((C501461) create(futuresLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return FuturesLadderDataState.copy$default((FuturesLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, boxing.boxBoolean(this.$isInTradingSession), null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -2049, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C501461(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: FuturesLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$4", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ FuturesLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(FuturesLadderDuxo futuresLadderDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = futuresLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                FuturesLadderDuxo futuresLadderDuxo = this.this$0;
                futuresLadderDuxo.backupQuotePollJob = FlowKt.launchIn(FlowKt.onStart(FlowKt.onEach(FuturesQuoteStore.getQuote$default(futuresLadderDuxo.futuresQuoteStore, ((FuturesLadderFragmentKey) FuturesLadderDuxo.INSTANCE.getArgs(this.this$0.getSavedStateHandle())).getFuturesContractId(), null, 2, null), new AnonymousClass1(this.this$0, null)), new AnonymousClass2(null)), coroutineScope);
                return Unit.INSTANCE;
            }

            /* compiled from: FuturesLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "quote", "Lcom/robinhood/android/models/futures/marketdata/db/FuturesQuote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$4$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesQuote, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FuturesLadderDuxo futuresLadderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FuturesQuote futuresQuote, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(futuresQuote, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesLadderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$4$1$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$4$1$1, reason: invalid class name and collision with other inner class name */
                static final class C501471 extends ContinuationImpl7 implements Function2<FuturesLadderDataState, Continuation<? super FuturesLadderDataState>, Object> {
                    final /* synthetic */ FuturesQuote $quote;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C501471(FuturesQuote futuresQuote, Continuation<? super C501471> continuation) {
                        super(2, continuation);
                        this.$quote = futuresQuote;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C501471 c501471 = new C501471(this.$quote, continuation);
                        c501471.L$0 = obj;
                        return c501471;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesLadderDataState futuresLadderDataState, Continuation<? super FuturesLadderDataState> continuation) {
                        return ((C501471) create(futuresLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        FuturesLadderDataState futuresLadderDataState = (FuturesLadderDataState) this.L$0;
                        return FuturesLadderDataState.copyForLadderPriceLevel$default(futuresLadderDataState, LadderPriceData.copy$default(futuresLadderDataState.getLadderPriceData(), null, null, null, null, null, this.$quote, boxing.boxLong(SystemClock.elapsedRealtime()), false, EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE, null), null, null, null, 14, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C501471((FuturesQuote) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* compiled from: FuturesLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/android/models/futures/marketdata/db/FuturesQuote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$4$2", m3645f = "FuturesLadderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CLIPBOARD_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$4$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<FlowCollector<? super FuturesQuote>, Continuation<? super Unit>, Object> {
                int label;

                AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FlowCollector<? super FuturesQuote> flowCollector, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        if (DelayKt.delay(5000L, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }
        }

        /* compiled from: FuturesLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$5", m3645f = "FuturesLadderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<UiFuturesContract> $futuresContractFlow;
            int label;
            final /* synthetic */ FuturesLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(SharedFlow<UiFuturesContract> sharedFlow, FuturesLadderDuxo futuresLadderDuxo, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.$futuresContractFlow = sharedFlow;
                this.this$0 = futuresLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.$futuresContractFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow<UiFuturesContract> sharedFlow = this.$futuresContractFlow;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: FuturesLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "contract", "Lcom/robinhood/android/models/futures/arsenal/db/UiFuturesContract;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$5$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$5$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UiFuturesContract, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FuturesLadderDuxo futuresLadderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UiFuturesContract uiFuturesContract, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(uiFuturesContract, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesLadderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$5$1$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$5$1$1, reason: invalid class name and collision with other inner class name */
                static final class C501481 extends ContinuationImpl7 implements Function2<FuturesLadderDataState, Continuation<? super FuturesLadderDataState>, Object> {
                    final /* synthetic */ UiFuturesContract $contract;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C501481(UiFuturesContract uiFuturesContract, Continuation<? super C501481> continuation) {
                        super(2, continuation);
                        this.$contract = uiFuturesContract;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C501481 c501481 = new C501481(this.$contract, continuation);
                        c501481.L$0 = obj;
                        return c501481;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesLadderDataState futuresLadderDataState, Continuation<? super FuturesLadderDataState> continuation) {
                        return ((C501481) create(futuresLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return FuturesLadderDataState.copyForLadderPriceLevel$default((FuturesLadderDataState) this.L$0, null, this.$contract.getContract(), this.$contract.getProduct(), null, 9, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C501481((UiFuturesContract) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: FuturesLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$6", m3645f = "FuturesLadderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$6, reason: invalid class name */
        static final class AnonymousClass6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<String> $streamingSymbolFlow;
            int label;
            final /* synthetic */ FuturesLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(SharedFlow<String> sharedFlow, FuturesLadderDuxo futuresLadderDuxo, Continuation<? super AnonymousClass6> continuation) {
                super(2, continuation);
                this.$streamingSymbolFlow = sharedFlow;
                this.this$0 = futuresLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass6(this.$streamingSymbolFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowFilterNotNull = FlowKt.filterNotNull(FlowKt.transformLatest(this.$streamingSymbolFlow, new C17494xb551b838(null, this.this$0)));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowFilterNotNull, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: FuturesLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "dom", "Lcom/robinhood/websocket/dx/models/DxResponse$DomSnapshot;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$6$2", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$6$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<DxResponse.DomSnapshot, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(FuturesLadderDuxo futuresLadderDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(DxResponse.DomSnapshot domSnapshot, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(domSnapshot, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesLadderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$6$2$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$6$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesLadderDataState, Continuation<? super FuturesLadderDataState>, Object> {
                    final /* synthetic */ DxResponse.DomSnapshot $dom;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(DxResponse.DomSnapshot domSnapshot, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$dom = domSnapshot;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$dom, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesLadderDataState futuresLadderDataState, Continuation<? super FuturesLadderDataState> continuation) {
                        return ((AnonymousClass1) create(futuresLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        FuturesLadderDataState futuresLadderDataState = (FuturesLadderDataState) this.L$0;
                        return FuturesLadderDataState.copy$default(futuresLadderDataState, null, null, null, LadderPriceData.copy$default(futuresLadderDataState.getLadderPriceData(), DomSnapshots.getOrderedBids(this.$dom, 10), DomSnapshots.getOrderedAsks(this.$dom, 10), null, null, boxing.boxLong(SystemClock.elapsedRealtime()), null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, null), null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -9, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((DxResponse.DomSnapshot) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: FuturesLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$7", m3645f = "FuturesLadderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$7, reason: invalid class name */
        static final class AnonymousClass7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<String> $streamingSymbolFlow;
            int label;
            final /* synthetic */ FuturesLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass7(SharedFlow<String> sharedFlow, FuturesLadderDuxo futuresLadderDuxo, Continuation<? super AnonymousClass7> continuation) {
                super(2, continuation);
                this.$streamingSymbolFlow = sharedFlow;
                this.this$0 = futuresLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass7(this.$streamingSymbolFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$streamingSymbolFlow, new C17495xc6fa917(null, this.this$0));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: FuturesLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "lastTrade", "Lcom/robinhood/websocket/dx/models/DxFeedData$Trade;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$7$2", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$7$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<DxFeedData.Trade, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(FuturesLadderDuxo futuresLadderDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(DxFeedData.Trade trade, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(trade, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesLadderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$7$2$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$7$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesLadderDataState, Continuation<? super FuturesLadderDataState>, Object> {
                    final /* synthetic */ DxFeedData.Trade $lastTrade;
                    private /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ FuturesLadderDuxo this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(FuturesLadderDuxo futuresLadderDuxo, DxFeedData.Trade trade, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.this$0 = futuresLadderDuxo;
                        this.$lastTrade = trade;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$lastTrade, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesLadderDataState futuresLadderDataState, Continuation<? super FuturesLadderDataState> continuation) {
                        return ((AnonymousClass1) create(futuresLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label == 0) {
                            ResultKt.throwOnFailure(obj);
                            FuturesLadderDataState futuresLadderDataState = (FuturesLadderDataState) this.L$0;
                            Job job = this.this$0.backupQuotePollJob;
                            if (job != null) {
                                Job.DefaultImpls.cancel$default(job, null, 1, null);
                            }
                            return FuturesLadderDataState.copyForLadderPriceLevel$default(futuresLadderDataState, LadderPriceData.copy$default(futuresLadderDataState.getLadderPriceData(), null, null, null, this.$lastTrade, boxing.boxLong(SystemClock.elapsedRealtime()), null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE, null), null, null, null, 14, null);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    DxFeedData.Trade trade = (DxFeedData.Trade) this.L$0;
                    FuturesLadderDuxo futuresLadderDuxo = this.this$0;
                    futuresLadderDuxo.applyMutation(new AnonymousClass1(futuresLadderDuxo, trade, null));
                    return Unit.INSTANCE;
                }
            }
        }

        /* compiled from: FuturesLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$8", m3645f = "FuturesLadderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$8, reason: invalid class name */
        static final class AnonymousClass8 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass8(FuturesLadderDuxo futuresLadderDuxo, Continuation<? super AnonymousClass8> continuation) {
                super(2, continuation);
                this.this$0 = futuresLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass8(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: FuturesLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "result", "Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager$Result;", "Lcom/robinhood/android/models/futures/db/UiFuturesOrder;", "Lcom/robinhood/android/lib/futures/trade/UiFuturesOrderContext;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$8$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$8$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OrderSubmissionManager.Result<? extends UiFuturesOrder, ? extends UiFuturesOrderContext>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FuturesLadderDuxo futuresLadderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(OrderSubmissionManager.Result<UiFuturesOrder, UiFuturesOrderContext> result, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(result, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(OrderSubmissionManager.Result<? extends UiFuturesOrder, ? extends UiFuturesOrderContext> result, Continuation<? super Unit> continuation) {
                    return invoke2((OrderSubmissionManager.Result<UiFuturesOrder, UiFuturesOrderContext>) result, continuation);
                }

                /* compiled from: FuturesLadderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$8$1$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$8$1$1, reason: invalid class name and collision with other inner class name */
                static final class C501491 extends ContinuationImpl7 implements Function2<FuturesLadderDataState, Continuation<? super FuturesLadderDataState>, Object> {
                    final /* synthetic */ OrderSubmissionManager.Result<UiFuturesOrder, UiFuturesOrderContext> $result;
                    private /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ FuturesLadderDuxo this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C501491(OrderSubmissionManager.Result<UiFuturesOrder, UiFuturesOrderContext> result, FuturesLadderDuxo futuresLadderDuxo, Continuation<? super C501491> continuation) {
                        super(2, continuation);
                        this.$result = result;
                        this.this$0 = futuresLadderDuxo;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C501491 c501491 = new C501491(this.$result, this.this$0, continuation);
                        c501491.L$0 = obj;
                        return c501491;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesLadderDataState futuresLadderDataState, Continuation<? super FuturesLadderDataState> continuation) {
                        return ((C501491) create(futuresLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        FuturesLadderDataState futuresLadderDataState = (FuturesLadderDataState) this.L$0;
                        boolean zAreEqual = Intrinsics.areEqual(this.$result.getUuid(), futuresLadderDataState.getRefIdToTrack());
                        OrderSubmissionManager.Result<UiFuturesOrder, UiFuturesOrderContext> result = this.$result;
                        if (result instanceof OrderSubmissionManager.Result.Sending) {
                            List listPlus = CollectionsKt.plus((Collection<? extends FuturesLadderDataState.PendingPlacedOrder>) futuresLadderDataState.getPendingPlacedOrders(), new FuturesLadderDataState.PendingPlacedOrder(((UiFuturesOrderContext) ((OrderSubmissionManager.Result.Sending) this.$result).getRequest()).getOrderRequest()));
                            return zAreEqual ? FuturesLadderDataState.copy$default(futuresLadderDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, false, null, null, listPlus, null, null, null, null, null, null, null, null, null, -4292609, null) : FuturesLadderDataState.copy$default(futuresLadderDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, false, null, null, listPlus, null, null, null, null, null, null, null, null, null, -4194305, null);
                        }
                        if (result instanceof OrderSubmissionManager.Result.Failure) {
                            if (zAreEqual) {
                                this.this$0.submit(new LadderEvent.ApiOrNetworkError(((OrderSubmissionManager.Result.Failure) this.$result).getThrowable()));
                                this.this$0.generateNewRefId();
                            }
                            List<FuturesLadderDataState.PendingPlacedOrder> pendingPlacedOrders = futuresLadderDataState.getPendingPlacedOrders();
                            OrderSubmissionManager.Result<UiFuturesOrder, UiFuturesOrderContext> result2 = this.$result;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : pendingPlacedOrders) {
                                if (!Intrinsics.areEqual(((FuturesLadderDataState.PendingPlacedOrder) obj2).getRefId(), ((OrderSubmissionManager.Result.Failure) result2).getUuid())) {
                                    arrayList.add(obj2);
                                }
                            }
                            return FuturesLadderDataState.copy$default(futuresLadderDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, false, null, null, arrayList, null, null, null, null, null, null, null, null, null, -4194305, null);
                        }
                        if (!(result instanceof OrderSubmissionManager.Result.Submitted)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (!((OrderSubmissionManager.Result.Submitted) result).getHasTriggeredConfirmation() && zAreEqual) {
                            this.this$0.submit(new LadderEvent.HapticFeedbacks(16));
                        }
                        List<FuturesLadderDataState.PendingPlacedOrder> pendingPlacedOrders2 = futuresLadderDataState.getPendingPlacedOrders();
                        OrderSubmissionManager.Result<UiFuturesOrder, UiFuturesOrderContext> result3 = this.$result;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : pendingPlacedOrders2) {
                            if (!Intrinsics.areEqual(((FuturesLadderDataState.PendingPlacedOrder) obj3).getRefId(), ((OrderSubmissionManager.Result.Submitted) result3).getUuid())) {
                                arrayList2.add(obj3);
                            }
                        }
                        return FuturesLadderDataState.copy$default(futuresLadderDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, false, null, null, arrayList2, null, null, null, null, null, null, null, null, null, -4194305, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    OrderSubmissionManager.Result result = (OrderSubmissionManager.Result) this.L$0;
                    FuturesLadderDuxo futuresLadderDuxo = this.this$0;
                    futuresLadderDuxo.applyMutation(new C501491(result, futuresLadderDuxo, null));
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(OrderSubmissionManager.orderStateChanges$default(this.this$0.futuresOrderManager, null, 1, null)), Integer.MAX_VALUE, null, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* compiled from: FuturesLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$9", m3645f = "FuturesLadderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$9, reason: invalid class name */
        static final class AnonymousClass9 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass9(FuturesLadderDuxo futuresLadderDuxo, Continuation<? super AnonymousClass9> continuation) {
                super(2, continuation);
                this.this$0 = futuresLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass9(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass9) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamFuturesAccount$default = FuturesAccountStore.streamFuturesAccount$default(this.this$0.futuresAccountStore, null, 1, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamFuturesAccount$default, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: FuturesLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "futuresAccount", "Lcom/robinhood/android/models/futures/db/FuturesAccount;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$9$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$9$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesAccount, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FuturesLadderDuxo futuresLadderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FuturesAccount futuresAccount, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(futuresAccount, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesLadderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$9$1$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$9$1$1, reason: invalid class name and collision with other inner class name */
                static final class C501501 extends ContinuationImpl7 implements Function2<FuturesLadderDataState, Continuation<? super FuturesLadderDataState>, Object> {
                    final /* synthetic */ FuturesAccount $futuresAccount;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C501501(FuturesAccount futuresAccount, Continuation<? super C501501> continuation) {
                        super(2, continuation);
                        this.$futuresAccount = futuresAccount;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C501501 c501501 = new C501501(this.$futuresAccount, continuation);
                        c501501.L$0 = obj;
                        return c501501;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesLadderDataState futuresLadderDataState, Continuation<? super FuturesLadderDataState> continuation) {
                        return ((C501501) create(futuresLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return FuturesLadderDataState.copy$default((FuturesLadderDataState) this.L$0, null, null, null, null, this.$futuresAccount, null, null, null, null, null, null, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -17, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C501501((FuturesAccount) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: FuturesLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$10", m3645f = "FuturesLadderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_STEP_COMPLETE_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$10, reason: invalid class name */
        static final class AnonymousClass10 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass10(FuturesLadderDuxo futuresLadderDuxo, Continuation<? super AnonymousClass10> continuation) {
                super(2, continuation);
                this.this$0 = futuresLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass10(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass10) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamPendingOrdersForContract$default = FuturesOrderStore.streamPendingOrdersForContract$default(this.this$0.futuresOrderStore, ((FuturesLadderFragmentKey) FuturesLadderDuxo.INSTANCE.getArgs(this.this$0.getSavedStateHandle())).getFuturesContractId(), null, false, 6, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamPendingOrdersForContract$default, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: FuturesLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "orders", "", "Lcom/robinhood/android/models/futures/db/UiFuturesOrder;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$10$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$10$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<List<? extends UiFuturesOrder>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FuturesLadderDuxo futuresLadderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(List<? extends UiFuturesOrder> list, Continuation<? super Unit> continuation) {
                    return invoke2((List<UiFuturesOrder>) list, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(List<UiFuturesOrder> list, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesLadderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$10$1$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$10$1$1, reason: invalid class name and collision with other inner class name */
                static final class C501381 extends ContinuationImpl7 implements Function2<FuturesLadderDataState, Continuation<? super FuturesLadderDataState>, Object> {
                    final /* synthetic */ List<UiFuturesOrder> $orders;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C501381(List<UiFuturesOrder> list, Continuation<? super C501381> continuation) {
                        super(2, continuation);
                        this.$orders = list;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C501381 c501381 = new C501381(this.$orders, continuation);
                        c501381.L$0 = obj;
                        return c501381;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesLadderDataState futuresLadderDataState, Continuation<? super FuturesLadderDataState> continuation) {
                        return ((C501381) create(futuresLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        FuturesLadderDataState futuresLadderDataState = (FuturesLadderDataState) this.L$0;
                        List<UiFuturesOrder> list = this.$orders;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((UiFuturesOrder) it.next()).getOrder().getRefId());
                        }
                        List<FuturesLadderDataState.PendingReplacedOrder> pendingReplacedOrders = futuresLadderDataState.getPendingReplacedOrders();
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(pendingReplacedOrders, 10));
                        Iterator<T> it2 = pendingReplacedOrders.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((FuturesLadderDataState.PendingReplacedOrder) it2.next()).getReplaceOrderRefId());
                        }
                        Set setIntersect = CollectionsKt.intersect(arrayList, CollectionsKt.toSet(arrayList2));
                        if (!setIntersect.isEmpty()) {
                            List<FuturesLadderDataState.PendingReplacedOrder> pendingReplacedOrders2 = futuresLadderDataState.getPendingReplacedOrders();
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj2 : pendingReplacedOrders2) {
                                if (!setIntersect.contains(((FuturesLadderDataState.PendingReplacedOrder) obj2).getReplaceOrderRefId())) {
                                    arrayList3.add(obj2);
                                }
                            }
                        }
                        return FuturesLadderDataState.copyForLadderPriceLevel$default(futuresLadderDataState, null, null, null, this.$orders, 7, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C501381((List) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: FuturesLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$11", m3645f = "FuturesLadderDuxo.kt", m3646l = {343}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$11, reason: invalid class name */
        static final class AnonymousClass11 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass11(FuturesLadderDuxo futuresLadderDuxo, Continuation<? super AnonymousClass11> continuation) {
                super(2, continuation);
                this.this$0 = futuresLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass11(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass11) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Boolean> flowStreamHasOrdersForContract = this.this$0.futuresOrderStore.streamHasOrdersForContract(((FuturesLadderFragmentKey) FuturesLadderDuxo.INSTANCE.getArgs(this.this$0.getSavedStateHandle())).getFuturesContractId());
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamHasOrdersForContract, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: FuturesLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "hasOrdersForContract", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$11$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$11$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ FuturesLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FuturesLadderDuxo futuresLadderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesLadderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$11$1$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$11$1$1, reason: invalid class name and collision with other inner class name */
                static final class C501391 extends ContinuationImpl7 implements Function2<FuturesLadderDataState, Continuation<? super FuturesLadderDataState>, Object> {
                    final /* synthetic */ boolean $hasOrdersForContract;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C501391(boolean z, Continuation<? super C501391> continuation) {
                        super(2, continuation);
                        this.$hasOrdersForContract = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C501391 c501391 = new C501391(this.$hasOrdersForContract, continuation);
                        c501391.L$0 = obj;
                        return c501391;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesLadderDataState futuresLadderDataState, Continuation<? super FuturesLadderDataState> continuation) {
                        return ((C501391) create(futuresLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return FuturesLadderDataState.copy$default((FuturesLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, boxing.boxBoolean(this.$hasOrdersForContract), null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -4097, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C501391(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: FuturesLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$12", m3645f = "FuturesLadderDuxo.kt", m3646l = {352}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$12, reason: invalid class name */
        static final class AnonymousClass12 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass12(FuturesLadderDuxo futuresLadderDuxo, Continuation<? super AnonymousClass12> continuation) {
                super(2, continuation);
                this.this$0 = futuresLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass12(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass12) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamBuyingPower$default = FuturesAccountStore.streamBuyingPower$default(this.this$0.futuresAccountStore, null, 1, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamBuyingPower$default, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: FuturesLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "buyingPower", "Lcom/robinhood/android/models/futures/api/ApiFuturesBuyingPower;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$12$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$12$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ApiFuturesBuyingPower, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FuturesLadderDuxo futuresLadderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ApiFuturesBuyingPower apiFuturesBuyingPower, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(apiFuturesBuyingPower, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesLadderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$12$1$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$12$1$1, reason: invalid class name and collision with other inner class name */
                static final class C501401 extends ContinuationImpl7 implements Function2<FuturesLadderDataState, Continuation<? super FuturesLadderDataState>, Object> {
                    final /* synthetic */ ApiFuturesBuyingPower $buyingPower;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C501401(ApiFuturesBuyingPower apiFuturesBuyingPower, Continuation<? super C501401> continuation) {
                        super(2, continuation);
                        this.$buyingPower = apiFuturesBuyingPower;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C501401 c501401 = new C501401(this.$buyingPower, continuation);
                        c501401.L$0 = obj;
                        return c501401;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesLadderDataState futuresLadderDataState, Continuation<? super FuturesLadderDataState> continuation) {
                        return ((C501401) create(futuresLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return FuturesLadderDataState.copy$default((FuturesLadderDataState) this.L$0, null, null, null, null, null, null, null, this.$buyingPower.getFutures_buying_power(), null, null, null, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -129, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C501401((ApiFuturesBuyingPower) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: FuturesLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$13", m3645f = "FuturesLadderDuxo.kt", m3646l = {364}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$13, reason: invalid class name */
        static final class AnonymousClass13 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass13(FuturesLadderDuxo futuresLadderDuxo, Continuation<? super AnonymousClass13> continuation) {
                super(2, continuation);
                this.this$0 = futuresLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass13(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass13) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamCostBasis$default = RhdCostBasisStore.streamCostBasis$default(this.this$0.rhdCostBasisStore, ((FuturesLadderFragmentKey) FuturesLadderDuxo.INSTANCE.getArgs(this.this$0.getSavedStateHandle())).getFuturesContractId(), FuturesAccountType.FUTURES, null, 4, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamCostBasis$default, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: FuturesLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "pnlCostBasis", "Lcom/robinhood/android/models/futures/db/FuturesCostBasis;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$13$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$13$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesCostBasis, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FuturesLadderDuxo futuresLadderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FuturesCostBasis futuresCostBasis, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(futuresCostBasis, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesLadderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$13$1$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$13$1$1, reason: invalid class name and collision with other inner class name */
                static final class C501411 extends ContinuationImpl7 implements Function2<FuturesLadderDataState, Continuation<? super FuturesLadderDataState>, Object> {
                    final /* synthetic */ FuturesCostBasis $pnlCostBasis;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C501411(FuturesCostBasis futuresCostBasis, Continuation<? super C501411> continuation) {
                        super(2, continuation);
                        this.$pnlCostBasis = futuresCostBasis;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C501411 c501411 = new C501411(this.$pnlCostBasis, continuation);
                        c501411.L$0 = obj;
                        return c501411;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesLadderDataState futuresLadderDataState, Continuation<? super FuturesLadderDataState> continuation) {
                        return ((C501411) create(futuresLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return FuturesLadderDataState.copy$default((FuturesLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, this.$pnlCostBasis, null, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -513, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C501411((FuturesCostBasis) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: FuturesLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$14", m3645f = "FuturesLadderDuxo.kt", m3646l = {372}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$14, reason: invalid class name */
        static final class AnonymousClass14 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass14(FuturesLadderDuxo futuresLadderDuxo, Continuation<? super AnonymousClass14> continuation) {
                super(2, continuation);
                this.this$0 = futuresLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass14(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass14) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                AnonymousClass14 anonymousClass14;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    FuturesTradingHoursStore futuresTradingHoursStore = this.this$0.futuresTradingHoursStore;
                    UUID futuresContractId = ((FuturesLadderFragmentKey) FuturesLadderDuxo.INSTANCE.getArgs(this.this$0.getSavedStateHandle())).getFuturesContractId();
                    this.label = 1;
                    anonymousClass14 = this;
                    obj = FuturesTradingHoursStore.getNextOpenTradingSession$default(futuresTradingHoursStore, futuresContractId, null, anonymousClass14, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    anonymousClass14 = this;
                }
                anonymousClass14.this$0.applyMutation(new AnonymousClass1((FuturesTradingHours.Session) obj, null));
                return Unit.INSTANCE;
            }

            /* compiled from: FuturesLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$14$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$14$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesLadderDataState, Continuation<? super FuturesLadderDataState>, Object> {
                final /* synthetic */ FuturesTradingHours.Session $nextTradingHours;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FuturesTradingHours.Session session, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$nextTradingHours = session;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$nextTradingHours, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FuturesLadderDataState futuresLadderDataState, Continuation<? super FuturesLadderDataState> continuation) {
                    return ((AnonymousClass1) create(futuresLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return FuturesLadderDataState.copy$default((FuturesLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, this.$nextTradingHours, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -1025, null);
                }
            }
        }

        /* compiled from: FuturesLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$15", m3645f = "FuturesLadderDuxo.kt", m3646l = {383}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$15, reason: invalid class name */
        static final class AnonymousClass15 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass15(FuturesLadderDuxo futuresLadderDuxo, Continuation<? super AnonymousClass15> continuation) {
                super(2, continuation);
                this.this$0 = futuresLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass15(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass15) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow stateFlow = this.this$0.getSavedStateHandle().getStateFlow(FuturesLadderDuxo.SAVED_TRADE_QUANTITY, BigDecimal.ONE);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: FuturesLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, m3636d2 = {"<anonymous>", "", "quantity", "Ljava/math/BigDecimal;", "kotlin.jvm.PlatformType"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$15$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$15$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<BigDecimal, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FuturesLadderDuxo futuresLadderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(BigDecimal bigDecimal, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(bigDecimal, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesLadderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$15$1$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$15$1$1, reason: invalid class name and collision with other inner class name */
                static final class C501421 extends ContinuationImpl7 implements Function2<FuturesLadderDataState, Continuation<? super FuturesLadderDataState>, Object> {
                    final /* synthetic */ BigDecimal $quantity;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C501421(BigDecimal bigDecimal, Continuation<? super C501421> continuation) {
                        super(2, continuation);
                        this.$quantity = bigDecimal;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C501421 c501421 = new C501421(this.$quantity, continuation);
                        c501421.L$0 = obj;
                        return c501421;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesLadderDataState futuresLadderDataState, Continuation<? super FuturesLadderDataState> continuation) {
                        return ((C501421) create(futuresLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        FuturesLadderDataState futuresLadderDataState = (FuturesLadderDataState) this.L$0;
                        BigDecimal bigDecimal = this.$quantity;
                        Intrinsics.checkNotNull(bigDecimal);
                        return FuturesLadderDataState.copy$default(futuresLadderDataState, null, null, bigDecimal, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -5, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C501421((BigDecimal) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: FuturesLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$16", m3645f = "FuturesLadderDuxo.kt", m3646l = {392}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$16, reason: invalid class name */
        static final class AnonymousClass16 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass16(FuturesLadderDuxo futuresLadderDuxo, Continuation<? super AnonymousClass16> continuation) {
                super(2, continuation);
                this.this$0 = futuresLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass16(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass16) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow effectiveClosesRange$default = FuturesMarketDataStore.getEffectiveClosesRange$default(this.this$0.futuresMarketDataStore, ((FuturesLadderFragmentKey) FuturesLadderDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getFuturesContractId(), null, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(effectiveClosesRange$default, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: FuturesLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "closesRange", "Lcom/robinhood/android/models/futures/marketdata/db/FuturesClosesRange;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$16$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$16$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesClosesRange, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FuturesLadderDuxo futuresLadderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FuturesClosesRange futuresClosesRange, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(futuresClosesRange, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesLadderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$16$1$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$16$1$1, reason: invalid class name and collision with other inner class name */
                static final class C501431 extends ContinuationImpl7 implements Function2<FuturesLadderDataState, Continuation<? super FuturesLadderDataState>, Object> {
                    final /* synthetic */ FuturesClosesRange $closesRange;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C501431(FuturesClosesRange futuresClosesRange, Continuation<? super C501431> continuation) {
                        super(2, continuation);
                        this.$closesRange = futuresClosesRange;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C501431 c501431 = new C501431(this.$closesRange, continuation);
                        c501431.L$0 = obj;
                        return c501431;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesLadderDataState futuresLadderDataState, Continuation<? super FuturesLadderDataState> continuation) {
                        return ((C501431) create(futuresLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return FuturesLadderDataState.copy$default((FuturesLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, this.$closesRange, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -8193, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C501431((FuturesClosesRange) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: FuturesLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$17", m3645f = "FuturesLadderDuxo.kt", m3646l = {404}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$17, reason: invalid class name */
        static final class AnonymousClass17 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass17(FuturesLadderDuxo futuresLadderDuxo, Continuation<? super AnonymousClass17> continuation) {
                super(2, continuation);
                this.this$0 = futuresLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass17(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass17) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FuturesOrderStore.streamRecentFilledOrderToShowConfirmation$default(this.this$0.futuresOrderStore, ((FuturesLadderFragmentKey) FuturesLadderDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getFuturesContractId(), null, 2, null), new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$17$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return Boolean.valueOf(FuturesLadderDuxo.C175063.AnonymousClass17.invokeSuspend$lambda$0((UiFuturesOrder) obj2, (UiFuturesOrder) obj3));
                        }
                    });
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: FuturesLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", Card.Icon.ORDER, "Lcom/robinhood/android/models/futures/db/UiFuturesOrder;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$17$2", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$17$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<UiFuturesOrder, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(FuturesLadderDuxo futuresLadderDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UiFuturesOrder uiFuturesOrder, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(uiFuturesOrder, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    UiFuturesOrder uiFuturesOrder = (UiFuturesOrder) this.L$0;
                    this.this$0.submit(new LadderEvent.HapticFeedbacks(16));
                    this.this$0.futuresOrderStore.onOrderFilledConfirmationShown(uiFuturesOrder.getId());
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean invokeSuspend$lambda$0(UiFuturesOrder uiFuturesOrder, UiFuturesOrder uiFuturesOrder2) {
                return Intrinsics.areEqual(uiFuturesOrder.getId(), uiFuturesOrder2.getId());
            }
        }

        /* compiled from: FuturesLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$18", m3645f = "FuturesLadderDuxo.kt", m3646l = {413}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$18, reason: invalid class name */
        static final class AnonymousClass18 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass18(FuturesLadderDuxo futuresLadderDuxo, Continuation<? super AnonymousClass18> continuation) {
                super(2, continuation);
                this.this$0 = futuresLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass18(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass18) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowInvoke$default = StreamMarketSessionChangeStateUseCase.invoke$default(this.this$0.streamMarketSessionChangeState, ((FuturesLadderFragmentKey) FuturesLadderDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getFuturesContractId(), null, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowInvoke$default, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: FuturesLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "state", "Lcom/robinhood/android/lib/futures/trade/MarketSessionChangeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$18$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$18$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MarketSessionChangeDataState, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FuturesLadderDuxo futuresLadderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(MarketSessionChangeDataState marketSessionChangeDataState, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(marketSessionChangeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesLadderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$18$1$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$18$1$1, reason: invalid class name and collision with other inner class name */
                static final class C501441 extends ContinuationImpl7 implements Function2<FuturesLadderDataState, Continuation<? super FuturesLadderDataState>, Object> {
                    final /* synthetic */ MarketSessionChangeDataState $state;
                    private /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ FuturesLadderDuxo this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C501441(MarketSessionChangeDataState marketSessionChangeDataState, FuturesLadderDuxo futuresLadderDuxo, Continuation<? super C501441> continuation) {
                        super(2, continuation);
                        this.$state = marketSessionChangeDataState;
                        this.this$0 = futuresLadderDuxo;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C501441 c501441 = new C501441(this.$state, this.this$0, continuation);
                        c501441.L$0 = obj;
                        return c501441;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesLadderDataState futuresLadderDataState, Continuation<? super FuturesLadderDataState> continuation) {
                        return ((C501441) create(futuresLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        FuturesLadderDataState futuresLadderDataState = (FuturesLadderDataState) this.L$0;
                        MarketSessionChangeDataState ladderMarketSessionChangeState = futuresLadderDataState.getLadderMarketSessionChangeState();
                        if (ladderMarketSessionChangeState.isOpen() != null && !Intrinsics.areEqual(this.$state.isOpen(), ladderMarketSessionChangeState.isOpen())) {
                            this.this$0.submit(new LadderEvent.Vibrate(500L));
                        }
                        return FuturesLadderDataState.copy$default(futuresLadderDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, this.$state, Integer.MAX_VALUE, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    MarketSessionChangeDataState marketSessionChangeDataState = (MarketSessionChangeDataState) this.L$0;
                    FuturesLadderDuxo futuresLadderDuxo = this.this$0;
                    futuresLadderDuxo.applyMutation(new C501441(marketSessionChangeDataState, futuresLadderDuxo, null));
                    return Unit.INSTANCE;
                }
            }
        }

        /* compiled from: FuturesLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$19", m3645f = "FuturesLadderDuxo.kt", m3646l = {433}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$19, reason: invalid class name */
        static final class AnonymousClass19 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass19(FuturesLadderDuxo futuresLadderDuxo, Continuation<? super AnonymousClass19> continuation) {
                super(2, continuation);
                this.this$0 = futuresLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass19(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass19) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowCoStreamVariant$default = ExperimentsProvider.DefaultImpls.coStreamVariant$default(this.this$0.experimentsStore, FuturesLadderKillswitchExperiment.INSTANCE, FuturesLadderKillswitchExperiment.Variant.ENABLE_ALL, false, 4, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowCoStreamVariant$default, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: FuturesLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "variant", "Lcom/robinhood/android/models/futures/FuturesLadderKillswitchExperiment$Variant;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$19$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$19$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesLadderKillswitchExperiment.Variant, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FuturesLadderDuxo futuresLadderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FuturesLadderKillswitchExperiment.Variant variant, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(variant, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    final FuturesLadderKillswitchExperiment.Variant variant = (FuturesLadderKillswitchExperiment.Variant) this.L$0;
                    final FuturesLadderDuxo futuresLadderDuxo = this.this$0;
                    futuresLadderDuxo.withDataState(new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$19$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return FuturesLadderDuxo.C175063.AnonymousClass19.AnonymousClass1.invokeSuspend$lambda$0(futuresLadderDuxo, variant, (FuturesLadderDataState) obj2);
                        }
                    });
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invokeSuspend$lambda$0(FuturesLadderDuxo futuresLadderDuxo, FuturesLadderKillswitchExperiment.Variant variant, FuturesLadderDataState futuresLadderDataState) {
                    if (futuresLadderDuxo.isLadderKillswitchOnForUser(variant, futuresLadderDataState.getAccount())) {
                        futuresLadderDuxo.submit(LadderEvent.LadderKillswitchIsActive.INSTANCE);
                    }
                    return Unit.INSTANCE;
                }
            }
        }

        /* compiled from: FuturesLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$20", m3645f = "FuturesLadderDuxo.kt", m3646l = {447}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$20, reason: invalid class name */
        static final class AnonymousClass20 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass20(FuturesLadderDuxo futuresLadderDuxo, Continuation<? super AnonymousClass20> continuation) {
                super(2, continuation);
                this.this$0 = futuresLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass20(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass20) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<FuturesLadderViewState> stateFlow = this.this$0.getStateFlow();
                    Flow flowTake = FlowKt.take(new Flow<FuturesLadderViewState>() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$20$invokeSuspend$$inlined$filter$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super FuturesLadderViewState> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new C174932(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$20$invokeSuspend$$inlined$filter$1$2 */
                        public static final class C174932<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$20$invokeSuspend$$inlined$filter$1$2", m3645f = "FuturesLadderDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$20$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                Object L$1;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return C174932.this.emit(null, this);
                                }
                            }

                            public C174932(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    FuturesLadderViewState.LadderData ladder = ((FuturesLadderViewState) obj).getLadder();
                                    if (ladder != null && ladder.isDxExperiencingDataDegradation()) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }, 1);
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTake, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: FuturesLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$20$2", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onCreate$3$20$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<FuturesLadderViewState, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ FuturesLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(FuturesLadderDuxo futuresLadderDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FuturesLadderViewState futuresLadderViewState, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(futuresLadderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    TimberLogger.INSTANCE.mo1681e(((FuturesLadderFragmentKey) FuturesLadderDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getFuturesContractId() + " is experiencing DX connection degradation", new Object[0]);
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new DxDataDegradationException(), false, null, 4, null);
                    return Unit.INSTANCE;
                }
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, this.futuresSettingsStore.streamAutoSendPref(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesLadderDuxo.onStart$lambda$1(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.futuresSettingsStore.streamTimeInForcePref(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesLadderDuxo.onStart$lambda$2(this.f$0, (FuturesTimeInForce) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(FuturesLadderDuxo futuresLadderDuxo, boolean z) {
        futuresLadderDuxo.applyMutation(new FuturesLadderDuxo$onStart$1$1(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(FuturesLadderDuxo futuresLadderDuxo, FuturesTimeInForce timeInForce) {
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        futuresLadderDuxo.applyMutation(new FuturesLadderDuxo$onStart$2$1(timeInForce, null));
        return Unit.INSTANCE;
    }

    /* compiled from: FuturesLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onSettingsVisibilityChange$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onSettingsVisibilityChange$1 */
    static final class C175151 extends ContinuationImpl7 implements Function2<FuturesLadderDataState, Continuation<? super FuturesLadderDataState>, Object> {
        final /* synthetic */ boolean $show;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C175151(boolean z, Continuation<? super C175151> continuation) {
            super(2, continuation);
            this.$show = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C175151 c175151 = new C175151(this.$show, continuation);
            c175151.L$0 = obj;
            return c175151;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesLadderDataState futuresLadderDataState, Continuation<? super FuturesLadderDataState> continuation) {
            return ((C175151) create(futuresLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FuturesLadderDataState.copy$default((FuturesLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.$show, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -16385, null);
        }
    }

    @Override // com.robinhood.android.futures.trade.p147ui.ladder.LadderCallbacks
    public void onSettingsVisibilityChange(boolean show) {
        applyMutation(new C175151(show, null));
    }

    /* compiled from: FuturesLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onPnLClick$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onPnLClick$1 */
    static final class C175121 extends ContinuationImpl7 implements Function2<FuturesLadderDataState, Continuation<? super FuturesLadderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: FuturesLadderDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onPnLClick$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FuturesLadderDataState2.values().length];
                try {
                    iArr[FuturesLadderDataState2.PRICE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FuturesLadderDataState2.PNL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C175121(Continuation<? super C175121> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C175121 c175121 = new C175121(continuation);
            c175121.L$0 = obj;
            return c175121;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesLadderDataState futuresLadderDataState, Continuation<? super FuturesLadderDataState> continuation) {
            return ((C175121) create(futuresLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            FuturesLadderDataState2 futuresLadderDataState2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FuturesLadderDataState futuresLadderDataState = (FuturesLadderDataState) this.L$0;
            int i = WhenMappings.$EnumSwitchMapping$0[futuresLadderDataState.getLadderDisplayMode().ordinal()];
            if (i == 1) {
                futuresLadderDataState2 = FuturesLadderDataState2.PNL;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                futuresLadderDataState2 = FuturesLadderDataState2.PRICE;
            }
            return FuturesLadderDataState.copy$default(futuresLadderDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, futuresLadderDataState2, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -131073, null);
        }
    }

    @Override // com.robinhood.android.futures.trade.p147ui.ladder.LadderCallbacks
    public void onPnLClick() {
        submit(new LadderEvent.HapticFeedbacks(1));
        applyMutation(new C175121(null));
    }

    /* compiled from: FuturesLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$showNextPostTradeFtuxState$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$showNextPostTradeFtuxState$1 */
    static final class C175191 extends ContinuationImpl7 implements Function2<FuturesLadderDataState, Continuation<? super FuturesLadderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C175191(Continuation<? super C175191> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C175191 c175191 = FuturesLadderDuxo.this.new C175191(continuation);
            c175191.L$0 = obj;
            return c175191;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesLadderDataState futuresLadderDataState, Continuation<? super FuturesLadderDataState> continuation) {
            return ((C175191) create(futuresLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            PostTradeLadderFtuxState postTradeLadderFtuxStateNextState;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FuturesLadderDataState futuresLadderDataState = (FuturesLadderDataState) this.L$0;
            PostTradeLadderFtuxState postTradeLadderFtuxProgressState = futuresLadderDataState.getPostTradeLadderFtuxProgressState();
            if (postTradeLadderFtuxProgressState != null && (postTradeLadderFtuxStateNextState = postTradeLadderFtuxProgressState.nextState()) != null) {
                FuturesLadderDuxo.this.postTradeLadderFtuxStatePref.set(postTradeLadderFtuxStateNextState);
                FuturesLadderDataState futuresLadderDataStateCopy$default = FuturesLadderDataState.copy$default(futuresLadderDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, postTradeLadderFtuxStateNextState, null, -1073741825, null);
                if (futuresLadderDataStateCopy$default != null) {
                    return futuresLadderDataStateCopy$default;
                }
            }
            return futuresLadderDataState;
        }
    }

    @Override // com.robinhood.android.futures.trade.p147ui.ladder.ftux.LadderFtuxCallbacks
    public void showNextPostTradeFtuxState() {
        applyMutation(new C175191(null));
    }

    @Override // com.robinhood.android.futures.trade.p147ui.ladder.LadderCallbacks
    public void onAutoSendChanged(boolean autoSend) {
        this.futuresSettingsStore.setAutoSendPref(autoSend);
    }

    @Override // com.robinhood.android.futures.trade.p147ui.ladder.LadderCallbacks
    public void onTimeInForceChanged(FuturesTimeInForce timeInForce) {
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        this.futuresSettingsStore.setTimeInForce(timeInForce);
    }

    /* compiled from: FuturesLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onLadderEducationCtaClick$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onLadderEducationCtaClick$1 */
    static final class C175081 extends ContinuationImpl7 implements Function2<FuturesLadderDataState, Continuation<? super FuturesLadderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C175081(Continuation<? super C175081> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C175081 c175081 = FuturesLadderDuxo.this.new C175081(continuation);
            c175081.L$0 = obj;
            return c175081;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesLadderDataState futuresLadderDataState, Continuation<? super FuturesLadderDataState> continuation) {
            return ((C175081) create(futuresLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FuturesLadderDataState.copy$default((FuturesLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, FuturesLadderDuxo.this.ladderFtuxManager.getFirstFtuxPage(true), null, null, -536870913, null);
        }
    }

    @Override // com.robinhood.android.futures.trade.p147ui.ladder.ftux.LadderFtuxCallbacks
    public void onLadderEducationCtaClick() {
        submit(LadderEvent.PrefetchFtuxLotties.INSTANCE);
        applyMutation(new C175081(null));
    }

    /* compiled from: FuturesLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$generateNewRefId$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$generateNewRefId$1 */
    static final class C175031 extends ContinuationImpl7 implements Function2<FuturesLadderDataState, Continuation<? super FuturesLadderDataState>, Object> {
        final /* synthetic */ UUID $refId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C175031(UUID uuid, Continuation<? super C175031> continuation) {
            super(2, continuation);
            this.$refId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C175031 c175031 = new C175031(this.$refId, continuation);
            c175031.L$0 = obj;
            return c175031;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesLadderDataState futuresLadderDataState, Continuation<? super FuturesLadderDataState> continuation) {
            return ((C175031) create(futuresLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FuturesLadderDataState futuresLadderDataState = (FuturesLadderDataState) this.L$0;
            return FuturesLadderDataState.copy$default(futuresLadderDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, Intrinsics.areEqual(futuresLadderDataState.getAutoSend(), boxing.boxBoolean(true)) ? this.$refId : null, null, null, null, null, null, -67108865, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UUID generateNewRefId() {
        UUID uuidRandomUUID = UUID.randomUUID();
        applyMutation(new C175031(uuidRandomUUID, null));
        Intrinsics.checkNotNull(uuidRandomUUID);
        return uuidRandomUUID;
    }

    /* compiled from: FuturesLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$continueToNextFtuxState$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$continueToNextFtuxState$1 */
    static final class C174991 extends ContinuationImpl7 implements Function2<FuturesLadderDataState, Continuation<? super FuturesLadderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C174991(Continuation<? super C174991> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C174991 c174991 = FuturesLadderDuxo.this.new C174991(continuation);
            c174991.L$0 = obj;
            return c174991;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesLadderDataState futuresLadderDataState, Continuation<? super FuturesLadderDataState> continuation) {
            return ((C174991) create(futuresLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FuturesLadderDataState futuresLadderDataState = (FuturesLadderDataState) this.L$0;
            LadderFtuxProgressState ladderFtuxProgressState = futuresLadderDataState.getLadderFtuxProgressState();
            LadderFtuxProgressState ladderFtuxProgressStateNextState = null;
            if (ladderFtuxProgressState != null) {
                FuturesContract contract = futuresLadderDataState.getContract();
                ladderFtuxProgressStateNextState = ladderFtuxProgressState.nextState(contract != null ? contract.getDisplaySymbol() : null);
            }
            FuturesLadderDuxo.this.getSavedStateHandle().set(FuturesLadderDuxo.FUTURES_LADDER_FTUX_SAVED_STATE_HANDLE_KEY, ladderFtuxProgressStateNextState);
            return FuturesLadderDataState.copy$default(futuresLadderDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, ladderFtuxProgressStateNextState, null, null, -536870913, null);
        }
    }

    @Override // com.robinhood.android.futures.trade.p147ui.ladder.ftux.LadderFtuxCallbacks
    public void continueToNextFtuxState() {
        applyMutation(new C174991(null));
    }

    /* compiled from: FuturesLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$backToPreviousFtuxState$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$backToPreviousFtuxState$1 */
    static final class C174971 extends ContinuationImpl7 implements Function2<FuturesLadderDataState, Continuation<? super FuturesLadderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C174971(Continuation<? super C174971> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C174971 c174971 = FuturesLadderDuxo.this.new C174971(continuation);
            c174971.L$0 = obj;
            return c174971;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesLadderDataState futuresLadderDataState, Continuation<? super FuturesLadderDataState> continuation) {
            return ((C174971) create(futuresLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FuturesLadderDataState futuresLadderDataState = (FuturesLadderDataState) this.L$0;
            LadderFtuxProgressState ladderFtuxProgressState = futuresLadderDataState.getLadderFtuxProgressState();
            LadderFtuxProgressState ladderFtuxProgressStatePrevState = ladderFtuxProgressState != null ? ladderFtuxProgressState.prevState() : null;
            FuturesLadderDuxo.this.getSavedStateHandle().set(FuturesLadderDuxo.FUTURES_LADDER_FTUX_SAVED_STATE_HANDLE_KEY, ladderFtuxProgressStatePrevState);
            return FuturesLadderDataState.copy$default(futuresLadderDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, ladderFtuxProgressStatePrevState, null, null, -536870913, null);
        }
    }

    @Override // com.robinhood.android.futures.trade.p147ui.ladder.ftux.LadderFtuxCallbacks
    public void backToPreviousFtuxState() {
        applyMutation(new C174971(null));
    }

    @Override // com.robinhood.android.futures.trade.p147ui.ladder.ftux.LadderFtuxCallbacks
    public void exitFtux() {
        this.ladderFtuxManager.onFtuxCompleted();
        getSavedStateHandle().remove(FUTURES_LADDER_FTUX_SAVED_STATE_HANDLE_KEY);
        submit(LadderEvent.ShowFtuxTooltip.INSTANCE);
        applyMutation(new C175021(null));
    }

    /* compiled from: FuturesLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$exitFtux$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$exitFtux$1 */
    static final class C175021 extends ContinuationImpl7 implements Function2<FuturesLadderDataState, Continuation<? super FuturesLadderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C175021(Continuation<? super C175021> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C175021 c175021 = new C175021(continuation);
            c175021.L$0 = obj;
            return c175021;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesLadderDataState futuresLadderDataState, Continuation<? super FuturesLadderDataState> continuation) {
            return ((C175021) create(futuresLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FuturesLadderDataState.copy$default((FuturesLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -536870913, null);
        }
    }

    @Override // com.robinhood.android.futures.trade.p147ui.ladder.LadderCallbacks
    public void onPlaceOrder(final OrderSpec orderSpec) {
        Intrinsics.checkNotNullParameter(orderSpec, "orderSpec");
        withDataState(new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesLadderDuxo.onPlaceOrder$lambda$4(this.f$0, orderSpec, (FuturesLadderDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onPlaceOrder$lambda$4(FuturesLadderDuxo futuresLadderDuxo, OrderSpec orderSpec, FuturesLadderDataState ds) {
        BigDecimal price;
        Intrinsics.checkNotNullParameter(ds, "ds");
        FuturesAccount account = ds.getAccount();
        if (account == null) {
            futuresLadderDuxo.submit(LadderEvent.NoFuturesAccountError.INSTANCE);
            return Unit.INSTANCE;
        }
        futuresLadderDuxo.submit(new LadderEvent.HapticFeedbacks(16));
        FuturesOrderSide side = orderSpec.getSide();
        BigDecimal price2 = null;
        if (orderSpec instanceof OrderSpec.LimitOrderSpec) {
            LadderPriceLevels ladderPriceLevels = ds.getLadderPriceLevels();
            Intrinsics.checkNotNull(ladderPriceLevels);
            price = ladderPriceLevels.getPrice(((OrderSpec.LimitOrderSpec) orderSpec).getLimitPriceIndex());
        } else {
            price = null;
        }
        if (orderSpec instanceof OrderSpec.StopMarketOrderSpec) {
            LadderPriceLevels ladderPriceLevels2 = ds.getLadderPriceLevels();
            Intrinsics.checkNotNull(ladderPriceLevels2);
            price2 = ladderPriceLevels2.getPrice(((OrderSpec.StopMarketOrderSpec) orderSpec).getStopPriceIndex());
        }
        final UiFuturesOrderContext uiFuturesOrderContextCreate = FuturesOrderContextFactory.INSTANCE.create(futuresLadderDuxo.generateNewRefId(), account, new FuturesOrderContextFactory.StaticInputs(ds.getContractId()), new FuturesOrderContextFactory.RequestInputs(side, price, price2), ds.getTradeQuantity(), ds.getTimeInForce());
        if (Intrinsics.areEqual(ds.getAutoSend(), Boolean.TRUE)) {
            OrderSubmissionManager.submit$default(futuresLadderDuxo.futuresOrderManager, uiFuturesOrderContextCreate, null, true, 2, null);
            EventLogger.DefaultImpls.logUserInteractionEvent$default(futuresLadderDuxo.eventLogger, FuturesLadderDataState.withDefaultInteractionEventData$default(ds, new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FuturesLadderDuxo.onPlaceOrder$lambda$4$lambda$3(uiFuturesOrderContextCreate, (Context) obj);
                }
            }, UserInteractionEventData.EventType.TAP, UserInteractionEventData.Action.SUBMIT_ORDER, (Component) null, 8, (Object) null), false, false, 6, null);
        } else {
            futuresLadderDuxo.submit(new LadderEvent.ReviewOrder(uiFuturesOrderContextCreate.getOrderRequest()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context onPlaceOrder$lambda$4$lambda$3(UiFuturesOrderContext uiFuturesOrderContext, Context withDefaultInteractionEventData) {
        Intrinsics.checkNotNullParameter(withDefaultInteractionEventData, "$this$withDefaultInteractionEventData");
        return Context.copy$default(withDefaultInteractionEventData, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LoggingUtils6.toFuturesOrderContext(uiFuturesOrderContext, Boolean.TRUE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -9, 16383, null);
    }

    /* compiled from: FuturesLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$clearSelectedRowIndex$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$clearSelectedRowIndex$1 */
    static final class C174981 extends ContinuationImpl7 implements Function2<FuturesLadderDataState, Continuation<? super FuturesLadderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C174981(Continuation<? super C174981> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C174981 c174981 = new C174981(continuation);
            c174981.L$0 = obj;
            return c174981;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesLadderDataState futuresLadderDataState, Continuation<? super FuturesLadderDataState> continuation) {
            return ((C174981) create(futuresLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FuturesLadderDataState.copy$default((FuturesLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -98305, null);
        }
    }

    public final void clearSelectedRowIndex() {
        applyMutation(new C174981(null));
    }

    @Override // com.robinhood.android.futures.trade.p147ui.ladder.LadderCallbacks
    public void onQuantityUpdated(BigDecimal quantity) {
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        getSavedStateHandle().set(SAVED_TRADE_QUANTITY, quantity);
    }

    /* compiled from: FuturesLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onRowSelected$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onRowSelected$1 */
    static final class C175141 extends ContinuationImpl7 implements Function2<FuturesLadderDataState, Continuation<? super FuturesLadderDataState>, Object> {
        final /* synthetic */ int $selectedRowIndex;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C175141(int i, Continuation<? super C175141> continuation) {
            super(2, continuation);
            this.$selectedRowIndex = i;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C175141 c175141 = FuturesLadderDuxo.this.new C175141(this.$selectedRowIndex, continuation);
            c175141.L$0 = obj;
            return c175141;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesLadderDataState futuresLadderDataState, Continuation<? super FuturesLadderDataState> continuation) {
            return ((C175141) create(futuresLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FuturesLadderDataState futuresLadderDataState = (FuturesLadderDataState) this.L$0;
            if (futuresLadderDataState.getSelectedRowIndex() != null || futuresLadderDataState.getQuantitySelectorOpen() || futuresLadderDataState.getSelectedPendingOrders() != null) {
                return futuresLadderDataState.copyToClearSelectionState();
            }
            FuturesLadderDuxo.this.submit(new LadderEvent.HapticFeedbacks(1));
            return FuturesLadderDataState.copy$default(futuresLadderDataState.copyToClearSelectionState(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, boxing.boxInt(this.$selectedRowIndex), false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -32769, null);
        }
    }

    @Override // com.robinhood.android.futures.trade.p147ui.ladder.LadderCallbacks
    public void onRowSelected(int selectedRowIndex) {
        applyMutation(new C175141(selectedRowIndex, null));
    }

    /* compiled from: FuturesLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onQuantitySelectorClicked$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onQuantitySelectorClicked$1 */
    static final class C175131 extends ContinuationImpl7 implements Function2<FuturesLadderDataState, Continuation<? super FuturesLadderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C175131(Continuation<? super C175131> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C175131 c175131 = new C175131(continuation);
            c175131.L$0 = obj;
            return c175131;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesLadderDataState futuresLadderDataState, Continuation<? super FuturesLadderDataState> continuation) {
            return ((C175131) create(futuresLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FuturesLadderDataState.copy$default((FuturesLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, !r2.getQuantitySelectorOpen(), null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -65537, null);
        }
    }

    @Override // com.robinhood.android.futures.trade.p147ui.ladder.LadderCallbacks
    public void onQuantitySelectorClicked() {
        applyMutation(new C175131(null));
    }

    /* compiled from: FuturesLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onPendingOrderSelected$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onPendingOrderSelected$1 */
    static final class C175111 extends ContinuationImpl7 implements Function2<FuturesLadderDataState, Continuation<? super FuturesLadderDataState>, Object> {
        final /* synthetic */ FuturesLadderViewState.LadderData.SelectedPendingOrders $selectedPendingOrders;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C175111(FuturesLadderViewState.LadderData.SelectedPendingOrders selectedPendingOrders, Continuation<? super C175111> continuation) {
            super(2, continuation);
            this.$selectedPendingOrders = selectedPendingOrders;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C175111 c175111 = FuturesLadderDuxo.this.new C175111(this.$selectedPendingOrders, continuation);
            c175111.L$0 = obj;
            return c175111;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesLadderDataState futuresLadderDataState, Continuation<? super FuturesLadderDataState> continuation) {
            return ((C175111) create(futuresLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FuturesLadderDataState futuresLadderDataState = (FuturesLadderDataState) this.L$0;
            EventLogger.DefaultImpls.logUserInteractionEvent$default(FuturesLadderDuxo.this.eventLogger, FuturesLadderDataState.withDefaultInteractionEventData$default(futuresLadderDataState, (Context) null, UserInteractionEventData.EventType.DRAG, UserInteractionEventData.Action.LADDER_SELECT_BULK_PENDING_ORDERS, (Component) null, 9, (Object) null), false, false, 6, null);
            FuturesLadderDataState futuresLadderDataStateCopyToClearSelectionState = futuresLadderDataState.copyToClearSelectionState();
            FuturesLadderViewState.LadderData.SelectedPendingOrders selectedPendingOrders = this.$selectedPendingOrders;
            return FuturesLadderDataState.copy$default(futuresLadderDataStateCopyToClearSelectionState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, false, selectedPendingOrders, boxing.boxInt(selectedPendingOrders.getRowIndex()), null, null, null, null, null, null, null, null, null, null, -3145729, null);
        }
    }

    @Override // com.robinhood.android.futures.trade.p147ui.ladder.LadderCallbacks
    public void onPendingOrderSelected(FuturesLadderViewState.LadderData.SelectedPendingOrders selectedPendingOrders) {
        Intrinsics.checkNotNullParameter(selectedPendingOrders, "selectedPendingOrders");
        submit(new LadderEvent.HapticFeedbacks(25));
        applyMutation(new C175111(selectedPendingOrders, null));
    }

    /* compiled from: FuturesLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onPendingOrderDraggedOverRowChanged$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onPendingOrderDraggedOverRowChanged$1 */
    static final class C175101 extends ContinuationImpl7 implements Function2<FuturesLadderDataState, Continuation<? super FuturesLadderDataState>, Object> {
        final /* synthetic */ int $newDraggedOverIndex;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ FuturesLadderDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C175101(int i, FuturesLadderDuxo futuresLadderDuxo, Continuation<? super C175101> continuation) {
            super(2, continuation);
            this.$newDraggedOverIndex = i;
            this.this$0 = futuresLadderDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C175101 c175101 = new C175101(this.$newDraggedOverIndex, this.this$0, continuation);
            c175101.L$0 = obj;
            return c175101;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesLadderDataState futuresLadderDataState, Continuation<? super FuturesLadderDataState> continuation) {
            return ((C175101) create(futuresLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FuturesLadderDataState futuresLadderDataState = (FuturesLadderDataState) this.L$0;
            Integer orderDraggedOverIndex = futuresLadderDataState.getOrderDraggedOverIndex();
            int i = this.$newDraggedOverIndex;
            if (orderDraggedOverIndex != null && orderDraggedOverIndex.intValue() == i) {
                return futuresLadderDataState;
            }
            this.this$0.submit(new LadderEvent.HapticFeedbacks(26));
            return FuturesLadderDataState.copy$default(futuresLadderDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, false, null, boxing.boxInt(this.$newDraggedOverIndex), null, null, null, null, null, null, null, null, null, null, -2097153, null);
        }
    }

    @Override // com.robinhood.android.futures.trade.p147ui.ladder.LadderCallbacks
    public void onPendingOrderDraggedOverRowChanged(int newDraggedOverIndex) {
        applyMutation(new C175101(newDraggedOverIndex, this, null));
    }

    @Override // com.robinhood.android.futures.trade.p147ui.ladder.LadderCallbacks
    public void onPendingOrderDragEnded(final boolean success, final boolean isDelete) {
        withDataState(new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesLadderDuxo.onPendingOrderDragEnded$lambda$5(success, isDelete, this, (FuturesLadderDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onPendingOrderDragEnded$lambda$5(boolean z, boolean z2, FuturesLadderDuxo futuresLadderDuxo, FuturesLadderDataState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (!z || state.getSelectedPendingOrders() == null || (!z2 && !state.getShouldPendingOrderChangePriceOnDragEnded())) {
            futuresLadderDuxo.applyMutation(new FuturesLadderDuxo$onPendingOrderDragEnded$1$1(null));
        } else if (z2) {
            futuresLadderDuxo.deletePendingOrder(state);
        } else {
            futuresLadderDuxo.replaceSelectedPendingOrders(state);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: FuturesLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onPendingOrderDragDirectionChanged$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onPendingOrderDragDirectionChanged$1 */
    static final class C175091 extends ContinuationImpl7 implements Function2<FuturesLadderDataState, Continuation<? super FuturesLadderDataState>, Object> {
        final /* synthetic */ LadderCustomGestureDetector $direction;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C175091(LadderCustomGestureDetector ladderCustomGestureDetector, Continuation<? super C175091> continuation) {
            super(2, continuation);
            this.$direction = ladderCustomGestureDetector;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C175091 c175091 = new C175091(this.$direction, continuation);
            c175091.L$0 = obj;
            return c175091;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesLadderDataState futuresLadderDataState, Continuation<? super FuturesLadderDataState> continuation) {
            return ((C175091) create(futuresLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FuturesLadderDataState.copy$default((FuturesLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, false, null, null, null, null, null, this.$direction, null, null, null, null, null, null, -33554433, null);
        }
    }

    @Override // com.robinhood.android.futures.trade.p147ui.ladder.LadderCallbacks
    public void onPendingOrderDragDirectionChanged(LadderCustomGestureDetector direction) {
        applyMutation(new C175091(direction, null));
    }

    private final void replaceSelectedPendingOrders(FuturesLadderDataState state) {
        List<FuturesLadderViewState.LadderData.UiPendingOrder> orders;
        FuturesLadderViewState.LadderData.SelectedPendingOrders selectedPendingOrders = state.getSelectedPendingOrders();
        if (selectedPendingOrders == null || (orders = selectedPendingOrders.getOrders()) == null) {
            return;
        }
        List<FuturesLadderViewState.LadderData.UiPendingOrder> list = orders;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((FuturesLadderViewState.LadderData.UiPendingOrder) it.next()).getId());
        }
        List<UiFuturesOrder> pendingOrders = state.getPendingOrders();
        if (pendingOrders != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : pendingOrders) {
                if (arrayList.contains(((UiFuturesOrder) obj).getId())) {
                    arrayList2.add(obj);
                }
            }
            ArrayList<Tuples2> arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(Tuples4.m3642to((UiFuturesOrder) it2.next(), UUID.randomUUID()));
            }
            Integer orderDraggedOverIndex = state.getOrderDraggedOverIndex();
            if (orderDraggedOverIndex != null) {
                int iIntValue = orderDraggedOverIndex.intValue();
                LadderPriceLevels ladderPriceLevels = state.getLadderPriceLevels();
                BigDecimal price = ladderPriceLevels != null ? ladderPriceLevels.getPrice(iIntValue) : null;
                if (price == null) {
                    return;
                }
                EventLogger.DefaultImpls.logUserInteractionEvent$default(this.eventLogger, FuturesLadderDataState.withDefaultInteractionEventData$default(state, (Context) null, (UserInteractionEventData.EventType) null, UserInteractionEventData.Action.LADDER_MODIFY_ORDER, (Component) null, 11, (Object) null), false, false, 6, null);
                submit(new LadderEvent.HapticFeedbacks(16));
                applyMutation(new C175181(arrayList3, price, null));
                for (Tuples2 tuples2 : arrayList3) {
                    BigDecimal bigDecimal = price;
                    BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new FuturesLadderDuxo$replaceSelectedPendingOrders$2$1(this, (UUID) tuples2.component2(), (UiFuturesOrder) tuples2.component1(), bigDecimal, null), 3, null);
                    price = bigDecimal;
                }
            }
        }
    }

    /* compiled from: FuturesLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$replaceSelectedPendingOrders$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$replaceSelectedPendingOrders$1 */
    static final class C175181 extends ContinuationImpl7 implements Function2<FuturesLadderDataState, Continuation<? super FuturesLadderDataState>, Object> {
        final /* synthetic */ List<Tuples2<UiFuturesOrder, UUID>> $pendingOrdersForChangeToRefIds;
        final /* synthetic */ BigDecimal $targetPrice;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C175181(List<Tuples2<UiFuturesOrder, UUID>> list, BigDecimal bigDecimal, Continuation<? super C175181> continuation) {
            super(2, continuation);
            this.$pendingOrdersForChangeToRefIds = list;
            this.$targetPrice = bigDecimal;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C175181 c175181 = new C175181(this.$pendingOrdersForChangeToRefIds, this.$targetPrice, continuation);
            c175181.L$0 = obj;
            return c175181;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesLadderDataState futuresLadderDataState, Continuation<? super FuturesLadderDataState> continuation) {
            return ((C175181) create(futuresLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FuturesLadderDataState futuresLadderDataState = (FuturesLadderDataState) this.L$0;
            FuturesLadderDataState futuresLadderDataStateCopyToClearSelectionState = futuresLadderDataState.copyToClearSelectionState();
            List<FuturesLadderDataState.PendingReplacedOrder> pendingReplacedOrders = futuresLadderDataState.getPendingReplacedOrders();
            List<Tuples2<UiFuturesOrder, UUID>> list = this.$pendingOrdersForChangeToRefIds;
            BigDecimal bigDecimal = this.$targetPrice;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Tuples2 tuples2 = (Tuples2) it.next();
                UiFuturesOrder uiFuturesOrder = (UiFuturesOrder) tuples2.component1();
                UUID uuid = (UUID) tuples2.component2();
                Intrinsics.checkNotNull(uuid);
                arrayList.add(new FuturesLadderDataState.PendingReplacedOrder(uuid, bigDecimal, uiFuturesOrder));
            }
            return FuturesLadderDataState.copy$default(futuresLadderDataStateCopyToClearSelectionState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, false, null, null, null, CollectionsKt.plus((Collection) pendingReplacedOrders, (Iterable) arrayList), null, null, null, null, null, null, null, null, -8388609, null);
        }
    }

    private final void deletePendingOrder(FuturesLadderDataState state) {
        Set<UUID> orderIds;
        FuturesLadderViewState.LadderData.SelectedPendingOrders selectedPendingOrders = state.getSelectedPendingOrders();
        if (selectedPendingOrders == null || (orderIds = selectedPendingOrders.getOrderIds()) == null) {
            return;
        }
        submit(new LadderEvent.HapticFeedbacks(16));
        EventLogger.DefaultImpls.logUserInteractionEvent$default(this.eventLogger, FuturesLadderDataState.withDefaultInteractionEventData$default(state, (Context) null, (UserInteractionEventData.EventType) null, UserInteractionEventData.Action.LADDER_CANCEL_ORDER, (Component) null, 11, (Object) null), false, false, 6, null);
        applyMutation(new C175001(orderIds, null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C175012(orderIds, this, state, null), 3, null);
    }

    /* compiled from: FuturesLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$deletePendingOrder$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$deletePendingOrder$1 */
    static final class C175001 extends ContinuationImpl7 implements Function2<FuturesLadderDataState, Continuation<? super FuturesLadderDataState>, Object> {
        final /* synthetic */ Set<UUID> $selectedPendingOrderIds;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C175001(Set<UUID> set, Continuation<? super C175001> continuation) {
            super(2, continuation);
            this.$selectedPendingOrderIds = set;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C175001 c175001 = new C175001(this.$selectedPendingOrderIds, continuation);
            c175001.L$0 = obj;
            return c175001;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesLadderDataState futuresLadderDataState, Continuation<? super FuturesLadderDataState> continuation) {
            return ((C175001) create(futuresLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FuturesLadderDataState futuresLadderDataState = (FuturesLadderDataState) this.L$0;
            return FuturesLadderDataState.copy$default(futuresLadderDataState.copyToClearSelectionState(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, false, null, null, null, null, SetsKt.plus((Set) futuresLadderDataState.getPendingOrderIdsInDeletion(), (Iterable) this.$selectedPendingOrderIds), null, null, null, null, null, null, null, -16777217, null);
        }
    }

    /* compiled from: FuturesLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$deletePendingOrder$2", m3645f = "FuturesLadderDuxo.kt", m3646l = {797}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$deletePendingOrder$2 */
    static final class C175012 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Set<UUID> $selectedPendingOrderIds;
        final /* synthetic */ FuturesLadderDataState $state;
        int label;
        final /* synthetic */ FuturesLadderDuxo this$0;

        /* compiled from: FuturesLadderDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$deletePendingOrder$2$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FuturesOrderState.values().length];
                try {
                    iArr[FuturesOrderState.CANCELED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FuturesOrderState.PENDING_CANCELLED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C175012(Set<UUID> set, FuturesLadderDuxo futuresLadderDuxo, FuturesLadderDataState futuresLadderDataState, Continuation<? super C175012> continuation) {
            super(2, continuation);
            this.$selectedPendingOrderIds = set;
            this.this$0 = futuresLadderDuxo;
            this.$state = futuresLadderDataState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C175012(this.$selectedPendingOrderIds, this.this$0, this.$state, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C175012) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            String nullable$default;
            String nullable$default2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Set<UUID> set = this.$selectedPendingOrderIds;
                FuturesLadderDuxo futuresLadderDuxo = this.this$0;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(BuildersKt__Builders_commonKt.async$default(futuresLadderDuxo.getLifecycleScope(), null, null, new FuturesLadderDuxo$deletePendingOrder$2$cancelOrderResults$1$1(futuresLadderDuxo, (UUID) it.next(), null), 3, null));
                }
                this.label = 1;
                obj = Await2.awaitAll(arrayList, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.applyMutation(new AnonymousClass1(this.$selectedPendingOrderIds, null));
            FuturesLadderDuxo futuresLadderDuxo2 = this.this$0;
            FuturesLadderDataState futuresLadderDataState = this.$state;
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                Object value = ((Result) it2.next()).getValue();
                if (Result.m28556isSuccessimpl(value)) {
                    UiFuturesOrder uiFuturesOrder = (UiFuturesOrder) value;
                    int i2 = WhenMappings.$EnumSwitchMapping$0[uiFuturesOrder.getOrder().getOrderState().ordinal()];
                    if (i2 == 1) {
                        StringResource.Companion companion = StringResource.INSTANCE;
                        int i3 = C17286R.string.futures_ladder_order_cancelled_msg;
                        StringResource orderPillLabel = FutureOrders.getOrderPillLabel(uiFuturesOrder);
                        FuturesContract contract = futuresLadderDataState.getContract();
                        String displaySymbol = contract != null ? contract.getDisplaySymbol() : null;
                        FuturesProduct product = futuresLadderDataState.getProduct();
                        if (product != null) {
                            BigDecimal stopPrice = uiFuturesOrder.getOrder().getStopPrice();
                            if (stopPrice == null) {
                                stopPrice = uiFuturesOrder.getOrder().getLimitPrice();
                            }
                            nullable$default = FuturesProduct5.formatNullable$default(product, stopPrice, null, 2, null);
                        } else {
                            nullable$default = null;
                        }
                        futuresLadderDuxo2.submit(new LadderEvent.Snackbar(companion.invoke(i3, orderPillLabel, displaySymbol, nullable$default)));
                    } else if (i2 == 2) {
                        StringResource.Companion companion2 = StringResource.INSTANCE;
                        int i4 = C17286R.string.futures_ladder_order_pending_cancelled_msg;
                        StringResource orderPillLabel2 = FutureOrders.getOrderPillLabel(uiFuturesOrder);
                        FuturesContract contract2 = futuresLadderDataState.getContract();
                        String displaySymbol2 = contract2 != null ? contract2.getDisplaySymbol() : null;
                        FuturesProduct product2 = futuresLadderDataState.getProduct();
                        if (product2 != null) {
                            BigDecimal stopPrice2 = uiFuturesOrder.getOrder().getStopPrice();
                            if (stopPrice2 == null) {
                                stopPrice2 = uiFuturesOrder.getOrder().getLimitPrice();
                            }
                            nullable$default2 = FuturesProduct5.formatNullable$default(product2, stopPrice2, null, 2, null);
                        } else {
                            nullable$default2 = null;
                        }
                        futuresLadderDuxo2.submit(new LadderEvent.Snackbar(companion2.invoke(i4, orderPillLabel2, displaySymbol2, nullable$default2)));
                    } else {
                        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Invalid state after canceling futures order: " + uiFuturesOrder.getOrder().getOrderState()), false, null, 6, null);
                    }
                }
                Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(value);
                if (thM28553exceptionOrNullimpl != null) {
                    futuresLadderDuxo2.submit(new LadderEvent.ApiOrNetworkError(thM28553exceptionOrNullimpl));
                }
            }
            return Unit.INSTANCE;
        }

        /* compiled from: FuturesLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$deletePendingOrder$2$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$deletePendingOrder$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesLadderDataState, Continuation<? super FuturesLadderDataState>, Object> {
            final /* synthetic */ Set<UUID> $selectedPendingOrderIds;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Set<UUID> set, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$selectedPendingOrderIds = set;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$selectedPendingOrderIds, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FuturesLadderDataState futuresLadderDataState, Continuation<? super FuturesLadderDataState> continuation) {
                return ((AnonymousClass1) create(futuresLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                FuturesLadderDataState futuresLadderDataState = (FuturesLadderDataState) this.L$0;
                return FuturesLadderDataState.copy$default(futuresLadderDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, false, null, null, null, null, SetsKt.minus((Set) futuresLadderDataState.getPendingOrderIdsInDeletion(), (Iterable) this.$selectedPendingOrderIds), null, null, null, null, null, null, null, -16777217, null);
            }
        }
    }

    /* compiled from: FuturesLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onExpandLadder$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onExpandLadder$1 */
    static final class C175071 extends ContinuationImpl7 implements Function2<FuturesLadderDataState, Continuation<? super FuturesLadderDataState>, Object> {
        final /* synthetic */ boolean $expandOnTop;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C175071(boolean z, Continuation<? super C175071> continuation) {
            super(2, continuation);
            this.$expandOnTop = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C175071 c175071 = new C175071(this.$expandOnTop, continuation);
            c175071.L$0 = obj;
            return c175071;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesLadderDataState futuresLadderDataState, Continuation<? super FuturesLadderDataState> continuation) {
            return ((C175071) create(futuresLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FuturesLadderDataState futuresLadderDataState = (FuturesLadderDataState) this.L$0;
            return futuresLadderDataState.getLadderPriceLevels() == null ? futuresLadderDataState : FuturesLadderDataState.copy$default(futuresLadderDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, LadderPriceLevels.expand$default(futuresLadderDataState.getLadderPriceLevels(), this.$expandOnTop, 0, 2, null), false, null, null, null, null, null, null, null, null, null, null, null, null, -262145, null);
        }
    }

    @Override // com.robinhood.android.futures.trade.p147ui.ladder.LadderCallbacks
    public void onExpandLadder(boolean expandOnTop) {
        applyMutation(new C175071(expandOnTop, null));
    }

    /* compiled from: FuturesLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onZoomStateChanged$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onZoomStateChanged$1 */
    static final class C175171 extends ContinuationImpl7 implements Function2<FuturesLadderDataState, Continuation<? super FuturesLadderDataState>, Object> {
        final /* synthetic */ boolean $started;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C175171(boolean z, Continuation<? super C175171> continuation) {
            super(2, continuation);
            this.$started = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C175171 c175171 = new C175171(this.$started, continuation);
            c175171.L$0 = obj;
            return c175171;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesLadderDataState futuresLadderDataState, Continuation<? super FuturesLadderDataState> continuation) {
            return ((C175171) create(futuresLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FuturesLadderDataState.copy$default((FuturesLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, this.$started, null, null, null, null, null, null, null, null, null, null, null, null, -524289, null);
        }
    }

    @Override // com.robinhood.android.futures.trade.p147ui.ladder.LadderCallbacks
    public void onZoomStateChanged(boolean started) {
        applyMutation(new C175171(started, null));
    }

    /* compiled from: FuturesLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onZoomScaleChanged$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onZoomScaleChanged$1 */
    static final class C175161 extends ContinuationImpl7 implements Function2<FuturesLadderDataState, Continuation<? super FuturesLadderDataState>, Object> {
        final /* synthetic */ int $currentCenterIndex;
        final /* synthetic */ int $zoomScale;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ FuturesLadderDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C175161(int i, int i2, FuturesLadderDuxo futuresLadderDuxo, Continuation<? super C175161> continuation) {
            super(2, continuation);
            this.$zoomScale = i;
            this.$currentCenterIndex = i2;
            this.this$0 = futuresLadderDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C175161 c175161 = new C175161(this.$zoomScale, this.$currentCenterIndex, this.this$0, continuation);
            c175161.L$0 = obj;
            return c175161;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesLadderDataState futuresLadderDataState, Continuation<? super FuturesLadderDataState> continuation) {
            return ((C175161) create(futuresLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FuturesLadderDataState futuresLadderDataState = (FuturesLadderDataState) this.L$0;
            if (futuresLadderDataState.getLadderPriceLevels() == null || futuresLadderDataState.getLadderPriceLevels().getScale() == this.$zoomScale) {
                return futuresLadderDataState;
            }
            BigDecimal price = futuresLadderDataState.getLadderPriceLevels().getPrice(this.$currentCenterIndex);
            LadderPriceLevels ladderPriceLevelsCopyForZoom = futuresLadderDataState.getLadderPriceLevels().copyForZoom(this.$zoomScale);
            this.this$0.submit(new LadderEvent.CenterAtIndex(LadderPriceLevels.getRowIndexFromPriceScaled$default(ladderPriceLevelsCopyForZoom, price, null, 2, null), false));
            return FuturesLadderDataState.copy$default(futuresLadderDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, ladderPriceLevelsCopyForZoom, false, null, null, null, null, null, null, null, null, null, null, null, null, -262145, null);
        }
    }

    @Override // com.robinhood.android.futures.trade.p147ui.ladder.LadderCallbacks
    public void onZoomScaleChanged(int zoomScale, int currentCenterIndex) {
        applyMutation(new C175161(zoomScale, currentCenterIndex, this, null));
    }

    @Override // com.robinhood.android.futures.trade.p147ui.ladder.LadderCallbacks
    public void onFlattenClicked() {
        withDataState(new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesLadderDuxo.onFlattenClicked$lambda$12(this.f$0, (FuturesLadderDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFlattenClicked$lambda$12(FuturesLadderDuxo futuresLadderDuxo, FuturesLadderDataState ds) {
        UUID id;
        Intrinsics.checkNotNullParameter(ds, "ds");
        UUID uuidRandomUUID = UUID.randomUUID();
        FuturesAccount account = ds.getAccount();
        if (account != null && (id = account.getId()) != null) {
            BuildersKt__Builders_commonKt.launch$default(futuresLadderDuxo.getLifecycleScope(), null, null, new FuturesLadderDuxo$onFlattenClicked$1$1$1(futuresLadderDuxo, id, ds, uuidRandomUUID, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.futures.trade.p147ui.ladder.LadderCallbacks
    public void onOpenOrdersClicked() {
        withDataState(new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesLadderDuxo.onOpenOrdersClicked$lambda$13(this.f$0, (FuturesLadderDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onOpenOrdersClicked$lambda$13(FuturesLadderDuxo futuresLadderDuxo, FuturesLadderDataState ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        futuresLadderDuxo.submit(new LadderEvent.OpenAccountHistory(new AccountsHistoryContract.Key(AccountsHistoryAccountTypeFilter.RHS, AccountsHistoryTransactionTypeFilter.FUTURES, new AccountsHistoryContract.InstrumentFilter(ds.getContractId(), AccountsHistoryContract.InstrumentFilterType.FUTURES), null, Intrinsics.areEqual(ds.getHasOrdersForContract(), Boolean.TRUE), null, 40, null)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isLadderKillswitchOnForUser(FuturesLadderKillswitchExperiment.Variant variant, FuturesAccount futuresAccount) {
        int i = WhenMappings.$EnumSwitchMapping$0[variant.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 3) {
            return futuresAccount == null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: FuturesLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0005R\u0016\u0010\r\u001a\u00020\u000b8\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0005¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDuxo;", "Lcom/robinhood/android/futures/contracts/FuturesLadderFragmentKey;", "<init>", "()V", "DEPTH_OF_MARKET", "", "MARKET_STATE_CHANGE_VIBRATION_MS", "", "SAVED_TRADE_QUANTITY", "", "getSAVED_TRADE_QUANTITY$annotations", FuturesLadderDuxo.FUTURES_LADDER_FTUX_SAVED_STATE_HANDLE_KEY, "getFUTURES_LADDER_FTUX_SAVED_STATE_HANDLE_KEY$annotations", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<FuturesLadderDuxo, FuturesLadderFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getFUTURES_LADDER_FTUX_SAVED_STATE_HANDLE_KEY$annotations() {
        }

        public static /* synthetic */ void getSAVED_TRADE_QUANTITY$annotations() {
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public FuturesLadderFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (FuturesLadderFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public FuturesLadderFragmentKey getArgs(FuturesLadderDuxo futuresLadderDuxo) {
            return (FuturesLadderFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, futuresLadderDuxo);
        }
    }
}
