package com.robinhood.android.futures.trade.p147ui.orderform;

import android.content.Context;
import android.view.KeyEvent;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.ionspin.kotlin.bignum.decimal.DecimalUtility;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.futures.contracts.FuturesOrderFormFragmentKey;
import com.robinhood.android.futures.trade.analytics.LoggingUtils6;
import com.robinhood.android.futures.trade.extensions.TextFieldValues2;
import com.robinhood.android.futures.trade.order.FuturesOrderManager;
import com.robinhood.android.futures.trade.p147ui.orderform.FuturesOrderFormDataState;
import com.robinhood.android.futures.trade.p147ui.orderform.FuturesOrderFormDuxo;
import com.robinhood.android.futures.trade.p147ui.orderform.OrderFormEvent;
import com.robinhood.android.futures.trade.p147ui.orderform.OrderSubmissionState;
import com.robinhood.android.lib.futures.trade.UiFuturesOrderContext;
import com.robinhood.android.lib.store.margin.MarginSubscriptionStore;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.models.futures.api.ApiFuturesBuyingPower;
import com.robinhood.android.models.futures.api.order.FuturesTimeInForce;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesTradingHours;
import com.robinhood.android.models.futures.arsenal.p188db.UiFuturesContract;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesQuote;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.android.models.futures.p189db.FuturesOrderConfiguration;
import com.robinhood.android.models.futures.p189db.UiFuturesOrder;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.ceres.p284v1.Ceres;
import com.robinhood.ceres.p284v1.GetBuyingPowerEffectRequestDto;
import com.robinhood.ceres.p284v1.GetBuyingPowerEffectResponseDto;
import com.robinhood.ceres.p284v1.TentativeFuturesOrderRequestDto;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.futures.ordercheck.contracts.FuturesOrderCheckResolver;
import com.robinhood.futures.ordercheck.contracts.FuturesOrderChecksService;
import com.robinhood.futures.ordercheck.contracts.models.FuturesOrderCheckRequest;
import com.robinhood.futures.ordercheck.contracts.models.FuturesOrderChecksResult;
import com.robinhood.futures.ordercheck.contracts.models.FuturesOrderPriceType;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.IdlDecimal2;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.subscription.p352db.MarginSubscription;
import com.robinhood.rosetta.eventlogging.FuturesOrderContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.common.microgramdeeplinklaunch.RealMicrogramDeeplinkService;
import com.robinhood.shared.common.microgramuilaunch.RealMicrogramUiLaunchService2;
import com.robinhood.store.futures.FuturesAccountStore;
import com.robinhood.store.futures.arsenal.FuturesContractStore;
import com.robinhood.store.futures.arsenal.FuturesTradingHoursStore;
import com.robinhood.store.futures.marketdata.FuturesQuoteStore;
import com.robinhood.store.futures.marketdata.MarketdataPollLocation;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.extensions.Uuids;
import com.robinhood.utils.logging.TimberLogger;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.websocket.p410dx.DxWebsocketSource;
import com.robinhood.websocket.p410dx.models.DxFeedData;
import com.robinhood.websocket.p410dx.models.DxResponse;
import io.reactivex.Observable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxConvert;
import microgram.android.Monitoring;
import microgram.android.Monitoring2;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramComponent;
import microgram.android.service.ManagedServiceExtension2;

/* compiled from: FuturesOrderFormDuxo.kt */
@Metadata(m3635d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 b2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006:\u0001bB\u0083\u0001\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\"\u0012\u0006\u0010#\u001a\u00020$¢\u0006\u0004\b%\u0010&J\b\u00105\u001a\u000206H\u0016J\u0006\u00107\u001a\u000206J\u0016\u00108\u001a\u0002062\u0006\u00109\u001a\u00020\u0002H\u0082@¢\u0006\u0002\u0010:J\u000e\u0010;\u001a\u0002062\u0006\u0010<\u001a\u00020=J\u0006\u0010>\u001a\u000206J\u0012\u0010?\u001a\u0002062\n\u0010@\u001a\u00060Aj\u0002`BJ\u000e\u0010C\u001a\u0002062\u0006\u0010D\u001a\u00020EJ\u000e\u0010F\u001a\u0002062\u0006\u0010G\u001a\u00020HJ\u000e\u0010I\u001a\u0002062\u0006\u0010J\u001a\u00020KJ\u0010\u0010L\u001a\u0002062\u0006\u0010J\u001a\u00020KH\u0002J\u000e\u0010M\u001a\u0002062\u0006\u0010N\u001a\u00020OJ\u0006\u0010P\u001a\u000206J\u000e\u0010Q\u001a\u0002062\u0006\u0010R\u001a\u00020SJ\u0006\u0010T\u001a\u000206J\u000e\u0010U\u001a\u000206H\u0096@¢\u0006\u0002\u0010VJ\u000e\u0010W\u001a\u000206H\u0096@¢\u0006\u0002\u0010VJ\u000e\u0010X\u001a\u000206H\u0096@¢\u0006\u0002\u0010VJ\u0016\u0010Y\u001a\u0002062\u0006\u0010Z\u001a\u00020[H\u0096@¢\u0006\u0002\u0010\\J\u001e\u0010]\u001a\u0002062\u0006\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020[H\u0096@¢\u0006\u0002\u0010aR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u00020\"X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010/\u001a\u0002008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0010\u00103\u001a\u0004\u0018\u000104X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006c"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState;", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormViewState;", "Lcom/robinhood/android/futures/trade/ui/orderform/OrderFormEvent;", "Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderCheckResolver;", "Lcom/robinhood/android/udf/HasSavedState;", "ceres", "Lcom/robinhood/ceres/v1/Ceres;", "dxWebsocketSource", "Lcom/robinhood/websocket/dx/DxWebsocketSource;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "futuresAccountStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "futuresContractStore", "Lcom/robinhood/store/futures/arsenal/FuturesContractStore;", "futuresOrderManager", "Lcom/robinhood/android/futures/trade/order/FuturesOrderManager;", "futuresQuoteStore", "Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;", "futuresTradingHoursStore", "Lcom/robinhood/store/futures/arsenal/FuturesTradingHoursStore;", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "context", "Landroid/content/Context;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/ceres/v1/Ceres;Lcom/robinhood/websocket/dx/DxWebsocketSource;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/store/futures/FuturesAccountStore;Lcom/robinhood/store/futures/arsenal/FuturesContractStore;Lcom/robinhood/android/futures/trade/order/FuturesOrderManager;Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;Lcom/robinhood/store/futures/arsenal/FuturesTradingHoursStore;Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;Landroid/content/Context;Lcom/robinhood/android/microgramsdui/MicrogramManager;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/android/navigation/Navigator;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "microgramComponent", "Lmicrogram/android/inject/MicrogramComponent;", "orderChecksService", "Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderChecksService;", "monitor", "Lmicrogram/android/Monitor;", "cameFromLadder", "", "getCameFromLadder", "()Z", "softOrderChecksJob", "Lkotlinx/coroutines/Job;", "onCreate", "", "onReviewClicked", "validateOrder", "dataState", "(Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCaretClicked", "type", "Lcom/robinhood/android/futures/trade/ui/orderform/CaretType;", "onBackPressed", "onKeyPressed", "event", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "onFocusChanged", "focus", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState$FocusedText;", "onDisabledClicked", "source", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState$DisabledClickSource;", "submitOrder", Card.Icon.ORDER, "Lcom/robinhood/android/lib/futures/trade/UiFuturesOrderContext;", "logOrderSubmissionEvent", "setOrderConfig", "orderConfig", "Lcom/robinhood/android/models/futures/db/FuturesOrderConfiguration;", "onShowTimeInForceSelector", "onTimeInForceSelected", "timeInForce", "Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;", "onTimeInForceSelectorDismissed", "applyForAccount", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "focusOnQuantityText", "focusOnPriceText", "makeDeposit", "suggestedAmount", "Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "(Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePrice", "priceType", "Lcom/robinhood/futures/ordercheck/contracts/models/FuturesOrderPriceType;", "newPrice", "(Lcom/robinhood/futures/ordercheck/contracts/models/FuturesOrderPriceType;Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class FuturesOrderFormDuxo extends BaseDuxo3<FuturesOrderFormDataState, FuturesOrderFormViewState, OrderFormEvent> implements FuturesOrderCheckResolver, HasSavedState {
    private final Ceres ceres;
    private final DxWebsocketSource dxWebsocketSource;
    private final EventLogger eventLogger;
    private final FuturesAccountStore futuresAccountStore;
    private final FuturesContractStore futuresContractStore;
    private final FuturesOrderManager futuresOrderManager;
    private final FuturesQuoteStore futuresQuoteStore;
    private final FuturesTradingHoursStore futuresTradingHoursStore;
    private final MarginSubscriptionStore marginSubscriptionStore;
    private final MicrogramComponent microgramComponent;
    private final Monitoring2 monitor;
    private final FuturesOrderChecksService orderChecksService;
    private final SavedStateHandle savedStateHandle;
    private Job softOrderChecksJob;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: FuturesOrderFormDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {389}, m3647m = "validateOrder")
    /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$validateOrder$1 */
    static final class C176171 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C176171(Continuation<? super C176171> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FuturesOrderFormDuxo.this.validateOrder(null, this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesOrderFormDuxo(Ceres ceres, DxWebsocketSource dxWebsocketSource, EventLogger eventLogger, FuturesAccountStore futuresAccountStore, FuturesContractStore futuresContractStore, FuturesOrderManager futuresOrderManager, FuturesQuoteStore futuresQuoteStore, FuturesTradingHoursStore futuresTradingHoursStore, MarginSubscriptionStore marginSubscriptionStore, Context context, MicrogramManager microgramManager, LazyMoshi moshi, Navigator navigator, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(FuturesOrderFormDataState.INSTANCE.initialState((FuturesOrderFormFragmentKey) INSTANCE.getArgs(savedStateHandle)), FuturesOrderFormStateProvider.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(ceres, "ceres");
        Intrinsics.checkNotNullParameter(dxWebsocketSource, "dxWebsocketSource");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        Intrinsics.checkNotNullParameter(futuresContractStore, "futuresContractStore");
        Intrinsics.checkNotNullParameter(futuresOrderManager, "futuresOrderManager");
        Intrinsics.checkNotNullParameter(futuresQuoteStore, "futuresQuoteStore");
        Intrinsics.checkNotNullParameter(futuresTradingHoursStore, "futuresTradingHoursStore");
        Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.ceres = ceres;
        this.dxWebsocketSource = dxWebsocketSource;
        this.eventLogger = eventLogger;
        this.futuresAccountStore = futuresAccountStore;
        this.futuresContractStore = futuresContractStore;
        this.futuresOrderManager = futuresOrderManager;
        this.futuresQuoteStore = futuresQuoteStore;
        this.futuresTradingHoursStore = futuresTradingHoursStore;
        this.marginSubscriptionStore = marginSubscriptionStore;
        this.savedStateHandle = savedStateHandle;
        MicrogramComponent componentWithUiLaunch = RealMicrogramUiLaunchService2.getComponentWithUiLaunch(microgramManager, new RemoteMicrogramApplication("app-futures-order-checks", null, 2, null), getLifecycleScope(), moshi, MapsKt.mapOf(ManagedServiceExtension2.providedBy(Reflection.getOrCreateKotlinClass(FuturesOrderCheckResolver.class), this), RealMicrogramDeeplinkService.INSTANCE.getExtension(context, navigator)), new Function1() { // from class: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesOrderFormDuxo.microgramComponent$lambda$0((FragmentKey) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesOrderFormDuxo.microgramComponent$lambda$2(this.f$0, (DialogFragmentKey) obj);
            }
        });
        this.microgramComponent = componentWithUiLaunch;
        this.orderChecksService = (FuturesOrderChecksService) componentWithUiLaunch.getServiceLocator().getClient(FuturesOrderChecksService.class);
        this.monitor = componentWithUiLaunch.getMicrogramMonitor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit microgramComponent$lambda$0(FragmentKey it) {
        Intrinsics.checkNotNullParameter(it, "it");
        throw new IllegalStateException("order checks service doesn't launch UI.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit microgramComponent$lambda$2(final FuturesOrderFormDuxo futuresOrderFormDuxo, final DialogFragmentKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        futuresOrderFormDuxo.withDataState(new Function1() { // from class: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesOrderFormDuxo.microgramComponent$lambda$2$lambda$1(this.f$0, key, (FuturesOrderFormDataState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit microgramComponent$lambda$2$lambda$1(FuturesOrderFormDuxo futuresOrderFormDuxo, DialogFragmentKey dialogFragmentKey, FuturesOrderFormDataState ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        OrderSubmissionState orderSubmissionState = ds.getOrderSubmissionState();
        if (Intrinsics.areEqual(orderSubmissionState, OrderSubmissionState.Editing.INSTANCE) || Intrinsics.areEqual(orderSubmissionState, OrderSubmissionState.Reviewing.INSTANCE)) {
            futuresOrderFormDuxo.submit(new OrderFormEvent.ShowOrderCheckDialog(dialogFragmentKey));
        } else if (!(orderSubmissionState instanceof OrderSubmissionState.Submitting)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getCameFromLadder() {
        return INSTANCE.getArgs((HasSavedState) this) instanceof FuturesOrderFormFragmentKey.WithOrderToReview;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C176061(null));
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C176072(null));
    }

    /* compiled from: FuturesOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$1", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$1 */
    static final class C176061 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C176061(Continuation<? super C176061> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FuturesOrderFormDuxo.this.new C176061(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C176061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (!FuturesOrderFormDuxo.this.getCameFromLadder()) {
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(FuturesOrderFormDuxo.this.futuresOrderManager.orderStateChanges(((FuturesOrderFormFragmentKey) FuturesOrderFormDuxo.INSTANCE.getArgs((HasSavedState) FuturesOrderFormDuxo.this)).getRefId())), Integer.MAX_VALUE, null, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(FuturesOrderFormDuxo.this, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: FuturesOrderFormDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "result", "Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager$Result;", "Lcom/robinhood/android/models/futures/db/UiFuturesOrder;", "Lcom/robinhood/android/lib/futures/trade/UiFuturesOrderContext;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$1$1", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OrderSubmissionManager.Result<? extends UiFuturesOrder, ? extends UiFuturesOrderContext>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ FuturesOrderFormDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(FuturesOrderFormDuxo futuresOrderFormDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = futuresOrderFormDuxo;
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

            /* compiled from: FuturesOrderFormDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$1$1$1", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C501531 extends ContinuationImpl7 implements Function2<FuturesOrderFormDataState, Continuation<? super FuturesOrderFormDataState>, Object> {
                final /* synthetic */ OrderSubmissionManager.Result<UiFuturesOrder, UiFuturesOrderContext> $result;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesOrderFormDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C501531(OrderSubmissionManager.Result<UiFuturesOrder, UiFuturesOrderContext> result, FuturesOrderFormDuxo futuresOrderFormDuxo, Continuation<? super C501531> continuation) {
                    super(2, continuation);
                    this.$result = result;
                    this.this$0 = futuresOrderFormDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C501531 c501531 = new C501531(this.$result, this.this$0, continuation);
                    c501531.L$0 = obj;
                    return c501531;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FuturesOrderFormDataState futuresOrderFormDataState, Continuation<? super FuturesOrderFormDataState> continuation) {
                    return ((C501531) create(futuresOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    FuturesOrderFormDataState futuresOrderFormDataState = (FuturesOrderFormDataState) this.L$0;
                    OrderSubmissionManager.Result<UiFuturesOrder, UiFuturesOrderContext> result = this.$result;
                    if (result instanceof OrderSubmissionManager.Result.Failure) {
                        this.this$0.submit(new OrderFormEvent.OrderError(((OrderSubmissionManager.Result.Failure) this.$result).getThrowable()));
                        return FuturesOrderFormDataState.copy$default(futuresOrderFormDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, OrderSubmissionState.Editing.INSTANCE, false, 3145727, null);
                    }
                    if (result instanceof OrderSubmissionManager.Result.Sending) {
                        return FuturesOrderFormDataState.copy$default(futuresOrderFormDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, new OrderSubmissionState.Submitting(this.$result), false, 3145727, null);
                    }
                    if (!(result instanceof OrderSubmissionManager.Result.Submitted)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.this$0.submit(OrderFormEvent.OrderSubmittedSuccessfully.INSTANCE);
                    return FuturesOrderFormDataState.copy$default(futuresOrderFormDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, new OrderSubmissionState.Submitting(this.$result), false, 3145727, null);
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
                FuturesOrderFormDuxo futuresOrderFormDuxo = this.this$0;
                futuresOrderFormDuxo.applyMutation(new C501531(result, futuresOrderFormDuxo, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: FuturesOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2 */
    static final class C176072 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C176072(Continuation<? super C176072> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C176072 c176072 = FuturesOrderFormDuxo.this.new C176072(continuation);
            c176072.L$0 = obj;
            return c176072;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C176072) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            if (FuturesOrderFormDuxo.INSTANCE.getArgs(FuturesOrderFormDuxo.this.getSavedStateHandle()) instanceof FuturesOrderFormFragmentKey.WithOrderToReview) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(FuturesOrderFormDuxo.this, null), 3, null);
            }
            final StateFlow<FuturesOrderFormViewState> stateFlow = FuturesOrderFormDuxo.this.getStateFlow();
            SharedFlow sharedFlowShareIn = FlowKt.shareIn(FlowKt.distinctUntilChanged(new Flow<String>() { // from class: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$invokeSuspend$$inlined$mapNotNull$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                    Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {52}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
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
                            String contractStreamingSymbol = ((FuturesOrderFormViewState) obj).getContractStreamingSymbol();
                            if (contractStreamingSymbol != null) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(contractStreamingSymbol, anonymousClass1) == coroutine_suspended) {
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
            }), coroutineScope, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), 1);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(sharedFlowShareIn, FuturesOrderFormDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(sharedFlowShareIn, FuturesOrderFormDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(FuturesOrderFormDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(FuturesOrderFormDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass6(FuturesOrderFormDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass7(FuturesOrderFormDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass8(FuturesOrderFormDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass9(FuturesOrderFormDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass10(FuturesOrderFormDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass11(FuturesOrderFormDuxo.this, null), 3, null);
            return Unit.INSTANCE;
        }

        /* compiled from: FuturesOrderFormDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$1", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_OVERRIDE_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesOrderFormDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(FuturesOrderFormDuxo futuresOrderFormDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = futuresOrderFormDuxo;
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
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<FuturesOrderFormViewState> stateFlow = this.this$0.getStateFlow();
                    Flow flowTake = FlowKt.take(new Flow<FuturesOrderFormViewState>() { // from class: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$1$invokeSuspend$$inlined$filter$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super FuturesOrderFormViewState> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$1$invokeSuspend$$inlined$filter$1$2", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
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
                                    if (((FuturesOrderFormViewState) obj).canMakeValidateOrderCall()) {
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

            /* compiled from: FuturesOrderFormDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$1$2", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<FuturesOrderFormViewState, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ FuturesOrderFormDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(FuturesOrderFormDuxo futuresOrderFormDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresOrderFormDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FuturesOrderFormViewState futuresOrderFormViewState, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(futuresOrderFormViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    final FuturesOrderFormDuxo futuresOrderFormDuxo = this.this$0;
                    futuresOrderFormDuxo.withDataState(new Function1() { // from class: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$1$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return FuturesOrderFormDuxo.C176072.AnonymousClass1.AnonymousClass2.invokeSuspend$lambda$0(futuresOrderFormDuxo, (FuturesOrderFormDataState) obj2);
                        }
                    });
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invokeSuspend$lambda$0(FuturesOrderFormDuxo futuresOrderFormDuxo, FuturesOrderFormDataState futuresOrderFormDataState) {
                    futuresOrderFormDuxo.softOrderChecksJob = BuildersKt__Builders_commonKt.launch$default(futuresOrderFormDuxo.getLifecycleScope(), null, null, new FuturesOrderFormDuxo$onCreate$2$1$2$1$1(futuresOrderFormDuxo, futuresOrderFormDataState, null), 3, null);
                    return Unit.INSTANCE;
                }
            }
        }

        /* compiled from: FuturesOrderFormDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$2", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<String> $streamingSymbolFlow;
            int label;
            final /* synthetic */ FuturesOrderFormDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SharedFlow<String> sharedFlow, FuturesOrderFormDuxo futuresOrderFormDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$streamingSymbolFlow = sharedFlow;
                this.this$0 = futuresOrderFormDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$streamingSymbolFlow, this.this$0, continuation);
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
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$streamingSymbolFlow, new C17594x1e448c8d(null, this.this$0));
                    C501552 c501552 = new C501552(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, c501552, this) == coroutine_suspended) {
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

            /* compiled from: FuturesOrderFormDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "dxDom", "Lcom/robinhood/websocket/dx/models/DxResponse$DomSnapshot;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$2$2", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$2$2, reason: invalid class name and collision with other inner class name */
            static final class C501552 extends ContinuationImpl7 implements Function2<DxResponse.DomSnapshot, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesOrderFormDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C501552(FuturesOrderFormDuxo futuresOrderFormDuxo, Continuation<? super C501552> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresOrderFormDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C501552 c501552 = new C501552(this.this$0, continuation);
                    c501552.L$0 = obj;
                    return c501552;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(DxResponse.DomSnapshot domSnapshot, Continuation<? super Unit> continuation) {
                    return ((C501552) create(domSnapshot, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesOrderFormDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$2$2$1", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$2$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesOrderFormDataState, Continuation<? super FuturesOrderFormDataState>, Object> {
                    final /* synthetic */ DxResponse.DomSnapshot $dxDom;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(DxResponse.DomSnapshot domSnapshot, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$dxDom = domSnapshot;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$dxDom, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesOrderFormDataState futuresOrderFormDataState, Continuation<? super FuturesOrderFormDataState> continuation) {
                        return ((AnonymousClass1) create(futuresOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        FuturesOrderFormDataState futuresOrderFormDataState = (FuturesOrderFormDataState) this.L$0;
                        return FuturesOrderFormDataState.copy$default(futuresOrderFormDataState, null, null, null, null, null, null, null, null, OrderFormQuoteWrapper.copy$default(futuresOrderFormDataState.getQuote(), null, this.$dxDom, null, 5, null), null, null, null, null, false, null, null, null, null, null, null, null, false, 4194047, null);
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

        /* compiled from: FuturesOrderFormDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$3", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {250}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<String> $streamingSymbolFlow;
            int label;
            final /* synthetic */ FuturesOrderFormDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(SharedFlow<String> sharedFlow, FuturesOrderFormDuxo futuresOrderFormDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$streamingSymbolFlow = sharedFlow;
                this.this$0 = futuresOrderFormDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$streamingSymbolFlow, this.this$0, continuation);
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
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$streamingSymbolFlow, new C17595x75627d6c(null, this.this$0));
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

            /* compiled from: FuturesOrderFormDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "lastTrade", "Lcom/robinhood/websocket/dx/models/DxFeedData$Trade;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$3$2", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$3$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<DxFeedData.Trade, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesOrderFormDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(FuturesOrderFormDuxo futuresOrderFormDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresOrderFormDuxo;
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

                /* compiled from: FuturesOrderFormDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$3$2$1", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$3$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesOrderFormDataState, Continuation<? super FuturesOrderFormDataState>, Object> {
                    final /* synthetic */ DxFeedData.Trade $lastTrade;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(DxFeedData.Trade trade, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$lastTrade = trade;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$lastTrade, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesOrderFormDataState futuresOrderFormDataState, Continuation<? super FuturesOrderFormDataState> continuation) {
                        return ((AnonymousClass1) create(futuresOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        FuturesOrderFormDataState futuresOrderFormDataState = (FuturesOrderFormDataState) this.L$0;
                        return FuturesOrderFormDataState.copy$default(futuresOrderFormDataState, null, null, null, null, null, null, null, null, OrderFormQuoteWrapper.copy$default(futuresOrderFormDataState.getQuote(), null, null, this.$lastTrade, 3, null), null, null, null, null, false, null, null, null, null, null, null, null, false, 4194047, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((DxFeedData.Trade) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: FuturesOrderFormDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$4", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_BOLT_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesOrderFormDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(FuturesOrderFormDuxo futuresOrderFormDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = futuresOrderFormDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: FuturesOrderFormDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "state", "Lmicrogram/android/MicrogramState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$4$1", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Monitoring, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesOrderFormDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FuturesOrderFormDuxo futuresOrderFormDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresOrderFormDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Monitoring monitoring, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(monitoring, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesOrderFormDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$4$1$1", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$4$1$1, reason: invalid class name and collision with other inner class name */
                static final class C501561 extends ContinuationImpl7 implements Function2<FuturesOrderFormDataState, Continuation<? super FuturesOrderFormDataState>, Object> {
                    final /* synthetic */ Monitoring $state;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C501561(Monitoring monitoring, Continuation<? super C501561> continuation) {
                        super(2, continuation);
                        this.$state = monitoring;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C501561 c501561 = new C501561(this.$state, continuation);
                        c501561.L$0 = obj;
                        return c501561;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesOrderFormDataState futuresOrderFormDataState, Continuation<? super FuturesOrderFormDataState> continuation) {
                        return ((C501561) create(futuresOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return FuturesOrderFormDataState.copy$default((FuturesOrderFormDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, this.$state, null, false, null, null, null, null, null, null, null, false, 4192255, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C501561((Monitoring) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<Monitoring> state = this.this$0.monitor.getState();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(state, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: FuturesOrderFormDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$5", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesOrderFormDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(FuturesOrderFormDuxo futuresOrderFormDuxo, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = futuresOrderFormDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.this$0, continuation);
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

            /* compiled from: FuturesOrderFormDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "futuresAccount", "Lcom/robinhood/android/models/futures/db/FuturesAccount;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$5$1", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$5$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesAccount, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesOrderFormDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FuturesOrderFormDuxo futuresOrderFormDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresOrderFormDuxo;
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

                /* compiled from: FuturesOrderFormDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$5$1$1", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$5$1$1, reason: invalid class name and collision with other inner class name */
                static final class C501571 extends ContinuationImpl7 implements Function2<FuturesOrderFormDataState, Continuation<? super FuturesOrderFormDataState>, Object> {
                    final /* synthetic */ FuturesAccount $futuresAccount;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C501571(FuturesAccount futuresAccount, Continuation<? super C501571> continuation) {
                        super(2, continuation);
                        this.$futuresAccount = futuresAccount;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C501571 c501571 = new C501571(this.$futuresAccount, continuation);
                        c501571.L$0 = obj;
                        return c501571;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesOrderFormDataState futuresOrderFormDataState, Continuation<? super FuturesOrderFormDataState> continuation) {
                        return ((C501571) create(futuresOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return FuturesOrderFormDataState.copy$default((FuturesOrderFormDataState) this.L$0, null, null, null, null, this.$futuresAccount, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, 4194287, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C501571((FuturesAccount) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: FuturesOrderFormDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$6", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$6, reason: invalid class name */
        static final class AnonymousClass6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesOrderFormDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(FuturesOrderFormDuxo futuresOrderFormDuxo, Continuation<? super AnonymousClass6> continuation) {
                super(2, continuation);
                this.this$0 = futuresOrderFormDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass6(this.this$0, continuation);
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

            /* compiled from: FuturesOrderFormDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "buyingPower", "Lcom/robinhood/android/models/futures/api/ApiFuturesBuyingPower;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$6$1", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$6$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ApiFuturesBuyingPower, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesOrderFormDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FuturesOrderFormDuxo futuresOrderFormDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresOrderFormDuxo;
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

                /* compiled from: FuturesOrderFormDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$6$1$1", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$6$1$1, reason: invalid class name and collision with other inner class name */
                static final class C501581 extends ContinuationImpl7 implements Function2<FuturesOrderFormDataState, Continuation<? super FuturesOrderFormDataState>, Object> {
                    final /* synthetic */ ApiFuturesBuyingPower $buyingPower;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C501581(ApiFuturesBuyingPower apiFuturesBuyingPower, Continuation<? super C501581> continuation) {
                        super(2, continuation);
                        this.$buyingPower = apiFuturesBuyingPower;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C501581 c501581 = new C501581(this.$buyingPower, continuation);
                        c501581.L$0 = obj;
                        return c501581;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesOrderFormDataState futuresOrderFormDataState, Continuation<? super FuturesOrderFormDataState> continuation) {
                        return ((C501581) create(futuresOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return FuturesOrderFormDataState.copy$default((FuturesOrderFormDataState) this.L$0, null, null, null, null, null, this.$buyingPower.getFutures_buying_power(), null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, 4194271, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C501581((ApiFuturesBuyingPower) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: FuturesOrderFormDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$7", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$7, reason: invalid class name */
        static final class AnonymousClass7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesOrderFormDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass7(FuturesOrderFormDuxo futuresOrderFormDuxo, Continuation<? super AnonymousClass7> continuation) {
                super(2, continuation);
                this.this$0 = futuresOrderFormDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass7(this.this$0, continuation);
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
                    Flow<UiFuturesContract> flowStreamUiFuturesContract = this.this$0.futuresContractStore.streamUiFuturesContract(((FuturesOrderFormFragmentKey) FuturesOrderFormDuxo.INSTANCE.getArgs(this.this$0.getSavedStateHandle())).getFuturesContractId());
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamUiFuturesContract, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: FuturesOrderFormDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "contract", "Lcom/robinhood/android/models/futures/arsenal/db/UiFuturesContract;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$7$1", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$7$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UiFuturesContract, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesOrderFormDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FuturesOrderFormDuxo futuresOrderFormDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresOrderFormDuxo;
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

                /* compiled from: FuturesOrderFormDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$7$1$1", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$7$1$1, reason: invalid class name and collision with other inner class name */
                static final class C501591 extends ContinuationImpl7 implements Function2<FuturesOrderFormDataState, Continuation<? super FuturesOrderFormDataState>, Object> {
                    final /* synthetic */ UiFuturesContract $contract;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C501591(UiFuturesContract uiFuturesContract, Continuation<? super C501591> continuation) {
                        super(2, continuation);
                        this.$contract = uiFuturesContract;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C501591 c501591 = new C501591(this.$contract, continuation);
                        c501591.L$0 = obj;
                        return c501591;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesOrderFormDataState futuresOrderFormDataState, Continuation<? super FuturesOrderFormDataState> continuation) {
                        return ((C501591) create(futuresOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return FuturesOrderFormDataState.copy$default((FuturesOrderFormDataState) this.L$0, null, null, null, null, null, null, this.$contract.getContract(), this.$contract.getProduct(), null, null, null, null, null, false, null, null, null, null, null, null, null, false, 4194111, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C501591((UiFuturesContract) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: FuturesOrderFormDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$8", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$8, reason: invalid class name */
        static final class AnonymousClass8 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesOrderFormDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass8(FuturesOrderFormDuxo futuresOrderFormDuxo, Continuation<? super AnonymousClass8> continuation) {
                super(2, continuation);
                this.this$0 = futuresOrderFormDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass8(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<FuturesQuote> quote = this.this$0.futuresQuoteStore.getQuote(((FuturesOrderFormFragmentKey) FuturesOrderFormDuxo.INSTANCE.getArgs(this.this$0.getSavedStateHandle())).getFuturesContractId(), MarketdataPollLocation.ORDER_FORM);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(quote, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: FuturesOrderFormDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "mdQuote", "Lcom/robinhood/android/models/futures/marketdata/db/FuturesQuote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$8$1", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$8$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesQuote, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesOrderFormDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FuturesOrderFormDuxo futuresOrderFormDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresOrderFormDuxo;
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

                /* compiled from: FuturesOrderFormDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$8$1$1", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$8$1$1, reason: invalid class name and collision with other inner class name */
                static final class C501601 extends ContinuationImpl7 implements Function2<FuturesOrderFormDataState, Continuation<? super FuturesOrderFormDataState>, Object> {
                    final /* synthetic */ FuturesQuote $mdQuote;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C501601(FuturesQuote futuresQuote, Continuation<? super C501601> continuation) {
                        super(2, continuation);
                        this.$mdQuote = futuresQuote;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C501601 c501601 = new C501601(this.$mdQuote, continuation);
                        c501601.L$0 = obj;
                        return c501601;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesOrderFormDataState futuresOrderFormDataState, Continuation<? super FuturesOrderFormDataState> continuation) {
                        return ((C501601) create(futuresOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        FuturesOrderFormDataState futuresOrderFormDataState = (FuturesOrderFormDataState) this.L$0;
                        return FuturesOrderFormDataState.copy$default(futuresOrderFormDataState, null, null, null, null, null, null, null, null, OrderFormQuoteWrapper.copy$default(futuresOrderFormDataState.getQuote(), this.$mdQuote, null, null, 6, null), null, null, null, null, false, null, null, null, null, null, null, null, false, 4194047, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C501601((FuturesQuote) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: FuturesOrderFormDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$9", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {333}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$9, reason: invalid class name */
        static final class AnonymousClass9 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesOrderFormDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass9(FuturesOrderFormDuxo futuresOrderFormDuxo, Continuation<? super AnonymousClass9> continuation) {
                super(2, continuation);
                this.this$0 = futuresOrderFormDuxo;
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
                    final StateFlow<FuturesOrderFormViewState> stateFlow = this.this$0.getStateFlow();
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.debounce(FlowKt.distinctUntilChanged(new Flow<GetBuyingPowerEffectRequestDto>() { // from class: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$9$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super GetBuyingPowerEffectRequestDto> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new C175962(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$9$invokeSuspend$$inlined$map$1$2 */
                        public static final class C175962<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$9$invokeSuspend$$inlined$map$1$2", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$9$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    return C175962.this.emit(null, this);
                                }
                            }

                            public C175962(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                GetBuyingPowerEffectRequestDto getBuyingPowerEffectRequestDto;
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
                                    FuturesOrderFormViewState futuresOrderFormViewState = (FuturesOrderFormViewState) obj;
                                    if (futuresOrderFormViewState.getRhdAccountId() == null || futuresOrderFormViewState.getCandidateOrder() == null) {
                                        getBuyingPowerEffectRequestDto = null;
                                    } else {
                                        String strSafeToString = Uuids.safeToString(futuresOrderFormViewState.getRhdAccountId());
                                        IdlDecimal idlDecimal = IdlDecimal2.toIdlDecimal(futuresOrderFormViewState.getCandidateOrder().getOrderRequest().getQuantity());
                                        List<UiFuturesOrderContext.Leg> legs = futuresOrderFormViewState.getCandidateOrder().getOrderRequest().getLegs();
                                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legs, 10));
                                        Iterator<T> it = legs.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(((UiFuturesOrderContext.Leg) it.next()).getIdlDto());
                                        }
                                        getBuyingPowerEffectRequestDto = new GetBuyingPowerEffectRequestDto(strSafeToString, new TentativeFuturesOrderRequestDto(arrayList, idlDecimal, null, null, null, null, 60, null));
                                    }
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(getBuyingPowerEffectRequestDto, anonymousClass1) == coroutine_suspended) {
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
                    }), 500L), new AnonymousClass2(this.this$0, null));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass3, this) == coroutine_suspended) {
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

            /* compiled from: FuturesOrderFormDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/Result;", "Lcom/robinhood/ceres/v1/GetBuyingPowerEffectResponseDto;", "request", "Lcom/robinhood/ceres/v1/GetBuyingPowerEffectRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$9$2", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_PROFILE_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ICON_STEP_COMPLETE_VALUE}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$9$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function3<FlowCollector<? super Result<? extends GetBuyingPowerEffectResponseDto>>, GetBuyingPowerEffectRequestDto, Continuation<? super Unit>, Object> {
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;
                final /* synthetic */ FuturesOrderFormDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(FuturesOrderFormDuxo futuresOrderFormDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(3, continuation);
                    this.this$0 = futuresOrderFormDuxo;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Result<? extends GetBuyingPowerEffectResponseDto>> flowCollector, GetBuyingPowerEffectRequestDto getBuyingPowerEffectRequestDto, Continuation<? super Unit> continuation) {
                    return invoke2((FlowCollector<? super Result<GetBuyingPowerEffectResponseDto>>) flowCollector, getBuyingPowerEffectRequestDto, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(FlowCollector<? super Result<GetBuyingPowerEffectResponseDto>> flowCollector, GetBuyingPowerEffectRequestDto getBuyingPowerEffectRequestDto, Continuation<? super Unit> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = flowCollector;
                    anonymousClass2.L$1 = getBuyingPowerEffectRequestDto;
                    return anonymousClass2.invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
                
                    if (r1.emit(r9, r8) == r0) goto L34;
                 */
                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    FlowCollector flowCollector;
                    GetBuyingPowerEffectRequestDto getBuyingPowerEffectRequestDto;
                    FlowCollector flowCollector2;
                    Throwable th;
                    Object objGetBuyingPowerEffect;
                    Object objM28550constructorimpl;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        flowCollector = (FlowCollector) this.L$0;
                        getBuyingPowerEffectRequestDto = (GetBuyingPowerEffectRequestDto) this.L$1;
                        this.L$0 = flowCollector;
                        this.L$1 = getBuyingPowerEffectRequestDto;
                        this.label = 1;
                        if (flowCollector.emit(null, this) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    if (i == 1) {
                        getBuyingPowerEffectRequestDto = (GetBuyingPowerEffectRequestDto) this.L$1;
                        FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        flowCollector = flowCollector3;
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        flowCollector2 = (FlowCollector) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            objM28550constructorimpl = Result.m28550constructorimpl((GetBuyingPowerEffectResponseDto) obj);
                        } catch (Throwable th2) {
                            th = th2;
                            Throwables.rethrowIfNotNetworkRelated(th);
                            Result.Companion companion = Result.INSTANCE;
                            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                            Result resultM28549boximpl = Result.m28549boximpl(objM28550constructorimpl);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 3;
                        }
                        Result resultM28549boximpl2 = Result.m28549boximpl(objM28550constructorimpl);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 3;
                    }
                    if (getBuyingPowerEffectRequestDto == null) {
                        return Unit.INSTANCE;
                    }
                    FuturesOrderFormDuxo futuresOrderFormDuxo = this.this$0;
                    try {
                        Result.Companion companion2 = Result.INSTANCE;
                        Ceres ceres = futuresOrderFormDuxo.ceres;
                        this.L$0 = flowCollector;
                        this.L$1 = null;
                        this.label = 2;
                        objGetBuyingPowerEffect = ceres.GetBuyingPowerEffect(getBuyingPowerEffectRequestDto, this);
                    } catch (Throwable th3) {
                        flowCollector2 = flowCollector;
                        th = th3;
                        Throwables.rethrowIfNotNetworkRelated(th);
                        Result.Companion companion3 = Result.INSTANCE;
                        objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                        Result resultM28549boximpl22 = Result.m28549boximpl(objM28550constructorimpl);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 3;
                    }
                    if (objGetBuyingPowerEffect != coroutine_suspended) {
                        flowCollector2 = flowCollector;
                        obj = objGetBuyingPowerEffect;
                        objM28550constructorimpl = Result.m28550constructorimpl((GetBuyingPowerEffectResponseDto) obj);
                        Result resultM28549boximpl222 = Result.m28549boximpl(objM28550constructorimpl);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 3;
                    }
                    return coroutine_suspended;
                }
            }

            /* compiled from: FuturesOrderFormDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "buyingPowerEffectResult", "Lkotlin/Result;", "Lcom/robinhood/ceres/v1/GetBuyingPowerEffectResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$9$3", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$9$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Result<? extends GetBuyingPowerEffectResponseDto>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesOrderFormDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(FuturesOrderFormDuxo futuresOrderFormDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresOrderFormDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Result<? extends GetBuyingPowerEffectResponseDto> result, Continuation<? super Unit> continuation) {
                    return invoke2((Result<GetBuyingPowerEffectResponseDto>) result, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Result<GetBuyingPowerEffectResponseDto> result, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(result, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((Result) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                /* compiled from: FuturesOrderFormDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$9$3$1", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$9$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesOrderFormDataState, Continuation<? super FuturesOrderFormDataState>, Object> {
                    final /* synthetic */ Result<GetBuyingPowerEffectResponseDto> $buyingPowerEffectResult;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Result<GetBuyingPowerEffectResponseDto> result, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$buyingPowerEffectResult = result;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$buyingPowerEffectResult, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesOrderFormDataState futuresOrderFormDataState, Continuation<? super FuturesOrderFormDataState> continuation) {
                        return ((AnonymousClass1) create(futuresOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        FuturesOrderFormDataState futuresOrderFormDataState = (FuturesOrderFormDataState) this.L$0;
                        Result<GetBuyingPowerEffectResponseDto> result = this.$buyingPowerEffectResult;
                        if (result != null) {
                            Object value = result.getValue();
                            getBuyingPowerEffectResponseDto = Result.m28555isFailureimpl(value) ? null : value;
                        }
                        return FuturesOrderFormDataState.copy$default(futuresOrderFormDataState, null, null, null, null, null, null, null, null, null, getBuyingPowerEffectResponseDto, null, null, null, false, null, null, null, null, null, null, null, false, 4193791, null);
                    }
                }
            }
        }

        /* compiled from: FuturesOrderFormDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$10", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {342}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$10, reason: invalid class name */
        static final class AnonymousClass10 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesOrderFormDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass10(FuturesOrderFormDuxo futuresOrderFormDuxo, Continuation<? super AnonymousClass10> continuation) {
                super(2, continuation);
                this.this$0 = futuresOrderFormDuxo;
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
                AnonymousClass10 anonymousClass10;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    FuturesTradingHoursStore futuresTradingHoursStore = this.this$0.futuresTradingHoursStore;
                    UUID futuresContractId = ((FuturesOrderFormFragmentKey) FuturesOrderFormDuxo.INSTANCE.getArgs(this.this$0.getSavedStateHandle())).getFuturesContractId();
                    this.label = 1;
                    anonymousClass10 = this;
                    obj = FuturesTradingHoursStore.getNextOpenTradingSession$default(futuresTradingHoursStore, futuresContractId, null, anonymousClass10, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    anonymousClass10 = this;
                }
                anonymousClass10.this$0.applyMutation(new AnonymousClass1((FuturesTradingHours.Session) obj, null));
                return Unit.INSTANCE;
            }

            /* compiled from: FuturesOrderFormDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$10$1", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$10$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesOrderFormDataState, Continuation<? super FuturesOrderFormDataState>, Object> {
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
                public final Object invoke(FuturesOrderFormDataState futuresOrderFormDataState, Continuation<? super FuturesOrderFormDataState> continuation) {
                    return ((AnonymousClass1) create(futuresOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return FuturesOrderFormDataState.copy$default((FuturesOrderFormDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, this.$nextTradingHours, null, null, false, null, null, null, null, null, null, null, false, 4193279, null);
                }
            }
        }

        /* compiled from: FuturesOrderFormDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$11", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {356}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$11, reason: invalid class name */
        static final class AnonymousClass11 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesOrderFormDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass11(FuturesOrderFormDuxo futuresOrderFormDuxo, Continuation<? super AnonymousClass11> continuation) {
                super(2, continuation);
                this.this$0 = futuresOrderFormDuxo;
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
                    Observable observable = MarginSubscriptionStore.checkCurrentMarginSubscription$default(this.this$0.marginSubscriptionStore, false, 1, null).toObservable();
                    Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(observable), Integer.MAX_VALUE, null, 2, null);
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

            /* compiled from: FuturesOrderFormDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/subscription/db/MarginSubscription;", "kotlin.jvm.PlatformType"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$11$1", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$11$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Optional<? extends MarginSubscription>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesOrderFormDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FuturesOrderFormDuxo futuresOrderFormDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresOrderFormDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Optional<MarginSubscription> optional, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Optional<? extends MarginSubscription> optional, Continuation<? super Unit> continuation) {
                    return invoke2((Optional<MarginSubscription>) optional, continuation);
                }

                /* compiled from: FuturesOrderFormDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$11$1$1", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCreate$2$11$1$1, reason: invalid class name and collision with other inner class name */
                static final class C501541 extends ContinuationImpl7 implements Function2<FuturesOrderFormDataState, Continuation<? super FuturesOrderFormDataState>, Object> {
                    final /* synthetic */ MarginSubscription $subscription;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C501541(MarginSubscription marginSubscription, Continuation<? super C501541> continuation) {
                        super(2, continuation);
                        this.$subscription = marginSubscription;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C501541 c501541 = new C501541(this.$subscription, continuation);
                        c501541.L$0 = obj;
                        return c501541;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesOrderFormDataState futuresOrderFormDataState, Continuation<? super FuturesOrderFormDataState> continuation) {
                        return ((C501541) create(futuresOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        FuturesOrderFormDataState futuresOrderFormDataState = (FuturesOrderFormDataState) this.L$0;
                        MarginSubscription marginSubscription = this.$subscription;
                        return FuturesOrderFormDataState.copy$default(futuresOrderFormDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, marginSubscription != null ? boxing.boxBoolean(marginSubscription.is24Karat()) : null, null, false, 3670015, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C501541((MarginSubscription) ((Optional) this.L$0).component1(), null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* compiled from: FuturesOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onReviewClicked$1", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onReviewClicked$1 */
    static final class C176111 extends ContinuationImpl7 implements Function2<FuturesOrderFormDataState, Continuation<? super FuturesOrderFormDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C176111(Continuation<? super C176111> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C176111 c176111 = FuturesOrderFormDuxo.this.new C176111(continuation);
            c176111.L$0 = obj;
            return c176111;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesOrderFormDataState futuresOrderFormDataState, Continuation<? super FuturesOrderFormDataState> continuation) {
            return ((C176111) create(futuresOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FuturesOrderFormDataState futuresOrderFormDataState = (FuturesOrderFormDataState) this.L$0;
            if (!Intrinsics.areEqual(futuresOrderFormDataState.getOrderSubmissionState(), OrderSubmissionState.Editing.INSTANCE)) {
                throw new IllegalStateException(("Can't review from state " + futuresOrderFormDataState.getOrderSubmissionState()).toString());
            }
            FuturesOrderFormDuxo futuresOrderFormDuxo = FuturesOrderFormDuxo.this;
            futuresOrderFormDuxo.softOrderChecksJob = BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(futuresOrderFormDuxo), null, null, new AnonymousClass1(FuturesOrderFormDuxo.this, futuresOrderFormDataState, null), 3, null);
            return FuturesOrderFormDataState.copy$default(futuresOrderFormDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, true, 2097151, null);
        }

        /* compiled from: FuturesOrderFormDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onReviewClicked$1$1", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {374}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onReviewClicked$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ FuturesOrderFormDataState $$this$applyMutation;
            int label;
            final /* synthetic */ FuturesOrderFormDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(FuturesOrderFormDuxo futuresOrderFormDuxo, FuturesOrderFormDataState futuresOrderFormDataState, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = futuresOrderFormDuxo;
                this.$$this$applyMutation = futuresOrderFormDataState;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$$this$applyMutation, continuation);
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
                    FuturesOrderFormDuxo futuresOrderFormDuxo = this.this$0;
                    FuturesOrderFormDataState futuresOrderFormDataState = this.$$this$applyMutation;
                    this.label = 1;
                    if (futuresOrderFormDuxo.validateOrder(futuresOrderFormDataState, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.this$0.softOrderChecksJob = null;
                this.this$0.applyMutation(new C501611(null));
                return Unit.INSTANCE;
            }

            /* compiled from: FuturesOrderFormDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onReviewClicked$1$1$1", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onReviewClicked$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C501611 extends ContinuationImpl7 implements Function2<FuturesOrderFormDataState, Continuation<? super FuturesOrderFormDataState>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                C501611(Continuation<? super C501611> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C501611 c501611 = new C501611(continuation);
                    c501611.L$0 = obj;
                    return c501611;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FuturesOrderFormDataState futuresOrderFormDataState, Continuation<? super FuturesOrderFormDataState> continuation) {
                    return ((C501611) create(futuresOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return FuturesOrderFormDataState.copy$default((FuturesOrderFormDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, 2097151, null);
                }
            }
        }
    }

    public final void onReviewClicked() {
        applyMutation(new C176111(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object validateOrder(FuturesOrderFormDataState futuresOrderFormDataState, Continuation<? super Unit> continuation) {
        C176171 c176171;
        FuturesOrderCheckRequest orderCheckRequest;
        if (continuation instanceof C176171) {
            c176171 = (C176171) continuation;
            int i = c176171.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c176171.label = i - Integer.MIN_VALUE;
            } else {
                c176171 = new C176171(continuation);
            }
        }
        Object objValidateOrderAndPresentErrorAlert = c176171.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c176171.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objValidateOrderAndPresentErrorAlert);
            if (Intrinsics.areEqual(futuresOrderFormDataState.getMicrogramState(), Monitoring.Ready.INSTANCE) && (orderCheckRequest = futuresOrderFormDataState.getOrderCheckRequest()) != null) {
                FuturesOrderChecksService futuresOrderChecksService = this.orderChecksService;
                c176171.label = 1;
                objValidateOrderAndPresentErrorAlert = futuresOrderChecksService.validateOrderAndPresentErrorAlert(orderCheckRequest, c176171);
                if (objValidateOrderAndPresentErrorAlert == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objValidateOrderAndPresentErrorAlert);
        FuturesOrderChecksResult futuresOrderChecksResult = (FuturesOrderChecksResult) objValidateOrderAndPresentErrorAlert;
        if (futuresOrderChecksResult instanceof FuturesOrderChecksResult.Invalid) {
            applyMutation(new C176182(null));
        } else if (futuresOrderChecksResult instanceof FuturesOrderChecksResult.NetworkError) {
            TimberLogger.INSTANCE.mo1679d("Order checks network error!", new Object[0]);
        } else {
            if (!(futuresOrderChecksResult instanceof FuturesOrderChecksResult.Valid)) {
                throw new NoWhenBranchMatchedException();
            }
            applyMutation(new C176193(null));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: FuturesOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$validateOrder$2", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$validateOrder$2 */
    static final class C176182 extends ContinuationImpl7 implements Function2<FuturesOrderFormDataState, Continuation<? super FuturesOrderFormDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C176182(Continuation<? super C176182> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C176182 c176182 = FuturesOrderFormDuxo.this.new C176182(continuation);
            c176182.L$0 = obj;
            return c176182;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesOrderFormDataState futuresOrderFormDataState, Continuation<? super FuturesOrderFormDataState> continuation) {
            return ((C176182) create(futuresOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FuturesOrderFormDataState futuresOrderFormDataState = (FuturesOrderFormDataState) this.L$0;
            OrderSubmissionState orderSubmissionState = futuresOrderFormDataState.getOrderSubmissionState();
            if (Intrinsics.areEqual(orderSubmissionState, OrderSubmissionState.Reviewing.INSTANCE)) {
                if (!FuturesOrderFormDuxo.this.getCameFromLadder()) {
                    return FuturesOrderFormDataState.copy$default(futuresOrderFormDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, OrderSubmissionState.Editing.INSTANCE, false, 3145727, null);
                }
            } else if (!Intrinsics.areEqual(orderSubmissionState, OrderSubmissionState.Editing.INSTANCE) && !(orderSubmissionState instanceof OrderSubmissionState.Submitting)) {
                throw new NoWhenBranchMatchedException();
            }
            return futuresOrderFormDataState;
        }
    }

    /* compiled from: FuturesOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$validateOrder$3", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$validateOrder$3 */
    static final class C176193 extends ContinuationImpl7 implements Function2<FuturesOrderFormDataState, Continuation<? super FuturesOrderFormDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C176193(Continuation<? super C176193> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C176193 c176193 = new C176193(continuation);
            c176193.L$0 = obj;
            return c176193;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesOrderFormDataState futuresOrderFormDataState, Continuation<? super FuturesOrderFormDataState> continuation) {
            return ((C176193) create(futuresOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FuturesOrderFormDataState.copy$default((FuturesOrderFormDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, OrderSubmissionState.Reviewing.INSTANCE, false, 3145727, null);
        }
    }

    /* compiled from: FuturesOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCaretClicked$1", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCaretClicked$1 */
    static final class C176051 extends ContinuationImpl7 implements Function2<FuturesOrderFormDataState, Continuation<? super FuturesOrderFormDataState>, Object> {
        final /* synthetic */ CaretType $type;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: FuturesOrderFormDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onCaretClicked$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FuturesOrderFormDataState.FocusedText.values().length];
                try {
                    iArr[FuturesOrderFormDataState.FocusedText.QUANTITY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FuturesOrderFormDataState.FocusedText.LIMIT_PRICE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[FuturesOrderFormDataState.FocusedText.STOP_PRICE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C176051(CaretType caretType, Continuation<? super C176051> continuation) {
            super(2, continuation);
            this.$type = caretType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C176051 c176051 = new C176051(this.$type, continuation);
            c176051.L$0 = obj;
            return c176051;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesOrderFormDataState futuresOrderFormDataState, Continuation<? super FuturesOrderFormDataState> continuation) {
            return ((C176051) create(futuresOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            String string2;
            BigDecimal priceIncrements;
            BigDecimal bigDecimalMultiply;
            BigDecimal limitPrice;
            BigDecimal bigDecimal;
            BigDecimal priceIncrements2;
            BigDecimal bigDecimalMultiply2;
            BigDecimal stopPrice;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FuturesOrderFormDataState futuresOrderFormDataState = (FuturesOrderFormDataState) this.L$0;
            BigDecimal signedSteps = this.$type.getSignedSteps(futuresOrderFormDataState.getFocusedText());
            int i = WhenMappings.$EnumSwitchMapping$0[futuresOrderFormDataState.getFocusedText().ordinal()];
            if (i == 1) {
                String quantityText = futuresOrderFormDataState.getQuantityText();
                BigDecimal ZERO = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                BigDecimal bigDecimalAdd = BigDecimals7.toBigDecimalOrDefault(quantityText, ZERO).add(signedSteps);
                Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                BigDecimal bigDecimal2 = (BigDecimal) RangesKt.coerceAtLeast(bigDecimalAdd, ZERO);
                if (BigDecimals7.isZero(bigDecimal2)) {
                    string2 = "";
                } else {
                    string2 = bigDecimal2.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                }
                return FuturesOrderFormDataState.copy$default(futuresOrderFormDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, string2, null, null, null, null, false, 4128767, null);
            }
            if (i == 2) {
                FuturesProduct product = futuresOrderFormDataState.getProduct();
                if (product != null && (priceIncrements = product.getPriceIncrements()) != null && (bigDecimalMultiply = priceIncrements.multiply(signedSteps)) != null && (limitPrice = futuresOrderFormDataState.getLimitPrice()) != null) {
                    BigDecimal bigDecimalAdd2 = limitPrice.add(bigDecimalMultiply);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalAdd2, "add(...)");
                    bigDecimal = BigDecimals7.isNegative(bigDecimalAdd2) ? null : bigDecimalAdd2;
                    if (bigDecimal != null) {
                        limitPrice = bigDecimal;
                    }
                    String plainString = limitPrice.toPlainString();
                    Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
                    return FuturesOrderFormDataState.copy$default(futuresOrderFormDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, plainString, null, null, null, false, 4063231, null);
                }
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                FuturesProduct product2 = futuresOrderFormDataState.getProduct();
                if (product2 != null && (priceIncrements2 = product2.getPriceIncrements()) != null && (bigDecimalMultiply2 = priceIncrements2.multiply(signedSteps)) != null && (stopPrice = futuresOrderFormDataState.getStopPrice()) != null) {
                    BigDecimal bigDecimalAdd3 = stopPrice.add(bigDecimalMultiply2);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalAdd3, "add(...)");
                    bigDecimal = BigDecimals7.isNegative(bigDecimalAdd3) ? null : bigDecimalAdd3;
                    if (bigDecimal != null) {
                        stopPrice = bigDecimal;
                    }
                    String plainString2 = stopPrice.toPlainString();
                    Intrinsics.checkNotNullExpressionValue(plainString2, "toPlainString(...)");
                    return FuturesOrderFormDataState.copy$default(futuresOrderFormDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, plainString2, null, null, false, 3932159, null);
                }
            }
            return futuresOrderFormDataState;
        }
    }

    public final void onCaretClicked(CaretType type2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        applyMutation(new C176051(type2, null));
    }

    /* compiled from: FuturesOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onBackPressed$1", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onBackPressed$1 */
    static final class C176041 extends ContinuationImpl7 implements Function2<FuturesOrderFormDataState, Continuation<? super FuturesOrderFormDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C176041(Continuation<? super C176041> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C176041 c176041 = FuturesOrderFormDuxo.this.new C176041(continuation);
            c176041.L$0 = obj;
            return c176041;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesOrderFormDataState futuresOrderFormDataState, Continuation<? super FuturesOrderFormDataState> continuation) {
            return ((C176041) create(futuresOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            OrderSubmissionState orderSubmissionState;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FuturesOrderFormDataState futuresOrderFormDataState = (FuturesOrderFormDataState) this.L$0;
            OrderSubmissionState orderSubmissionState2 = futuresOrderFormDataState.getOrderSubmissionState();
            OrderSubmissionState.Editing editing = OrderSubmissionState.Editing.INSTANCE;
            if (Intrinsics.areEqual(orderSubmissionState2, editing)) {
                throw new IllegalStateException(("Invalid onBackPressed state " + futuresOrderFormDataState.getOrderSubmissionState()).toString());
            }
            if (Intrinsics.areEqual(orderSubmissionState2, OrderSubmissionState.Reviewing.INSTANCE)) {
                orderSubmissionState = editing;
            } else {
                if (!(orderSubmissionState2 instanceof OrderSubmissionState.Submitting)) {
                    throw new NoWhenBranchMatchedException();
                }
                OrderSubmissionManager.Result<UiFuturesOrder, UiFuturesOrderContext> result = ((OrderSubmissionState.Submitting) futuresOrderFormDataState.getOrderSubmissionState()).getResult();
                if (!(result instanceof OrderSubmissionManager.Result.Failure)) {
                    if (result instanceof OrderSubmissionManager.Result.Sending) {
                        futuresOrderFormDataState.getOrderSubmissionState();
                    } else {
                        if (!(result instanceof OrderSubmissionManager.Result.Submitted)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (((OrderSubmissionManager.Result.Submitted) ((OrderSubmissionState.Submitting) futuresOrderFormDataState.getOrderSubmissionState()).getResult()).getTriggersConfirmation() || ((OrderSubmissionManager.Result.Submitted) ((OrderSubmissionState.Submitting) futuresOrderFormDataState.getOrderSubmissionState()).getResult()).getHasTriggeredConfirmation()) {
                            FuturesOrderFormDuxo.this.submit(new OrderFormEvent.ExitOrderForm(false, true, 1, null));
                        }
                        futuresOrderFormDataState.getOrderSubmissionState();
                    }
                }
                orderSubmissionState = futuresOrderFormDataState.getOrderSubmissionState();
            }
            if (Intrinsics.areEqual(orderSubmissionState, editing) && FuturesOrderFormDuxo.this.getCameFromLadder()) {
                FuturesOrderFormDuxo.this.submit(new OrderFormEvent.ExitOrderForm(false, false, 1, null));
                return futuresOrderFormDataState;
            }
            return FuturesOrderFormDataState.copy$default(futuresOrderFormDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, orderSubmissionState, false, 3145727, null);
        }
    }

    public final void onBackPressed() {
        applyMutation(new C176041(null));
    }

    /* compiled from: FuturesOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onKeyPressed$1", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onKeyPressed$1 */
    static final class C176101 extends ContinuationImpl7 implements Function2<FuturesOrderFormDataState, Continuation<? super FuturesOrderFormDataState>, Object> {
        final /* synthetic */ KeyEvent $event;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: FuturesOrderFormDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onKeyPressed$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FuturesOrderFormDataState.FocusedText.values().length];
                try {
                    iArr[FuturesOrderFormDataState.FocusedText.QUANTITY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FuturesOrderFormDataState.FocusedText.LIMIT_PRICE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[FuturesOrderFormDataState.FocusedText.STOP_PRICE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C176101(KeyEvent keyEvent, Continuation<? super C176101> continuation) {
            super(2, continuation);
            this.$event = keyEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C176101 c176101 = new C176101(this.$event, continuation);
            c176101.L$0 = obj;
            return c176101;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesOrderFormDataState futuresOrderFormDataState, Continuation<? super FuturesOrderFormDataState> continuation) {
            return ((C176101) create(futuresOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FuturesOrderFormDataState futuresOrderFormDataState = (FuturesOrderFormDataState) this.L$0;
            int i = WhenMappings.$EnumSwitchMapping$0[futuresOrderFormDataState.getFocusedText().ordinal()];
            if (i == 1) {
                String strM14928processKeyEventM8tDOmk$default = KeyEventInputHandler2.m14928processKeyEventM8tDOmk$default(futuresOrderFormDataState.getQuantityText(), TextFieldValues2.getTextSelectionAtEnd(futuresOrderFormDataState.getQuantityText()), this.$event, false, 8, null);
                if (strM14928processKeyEventM8tDOmk$default.length() > 4) {
                    strM14928processKeyEventM8tDOmk$default = futuresOrderFormDataState.getQuantityText();
                }
                return FuturesOrderFormDataState.copy$default(futuresOrderFormDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, strM14928processKeyEventM8tDOmk$default, null, null, null, null, false, 4128767, null);
            }
            if (i == 2) {
                return FuturesOrderFormDataState.copy$default(futuresOrderFormDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, KeyEventInputHandler2.m14927processKeyEventM8tDOmk(futuresOrderFormDataState.getUserInputtedLimitPrice(), TextFieldValues2.getTextSelectionAtEnd(futuresOrderFormDataState.getUserInputtedLimitPrice()), this.$event, true), null, null, null, false, 4063231, null);
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return FuturesOrderFormDataState.copy$default(futuresOrderFormDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, KeyEventInputHandler2.m14927processKeyEventM8tDOmk(futuresOrderFormDataState.getUserInputtedStopPrice(), TextFieldValues2.getTextSelectionAtEnd(futuresOrderFormDataState.getUserInputtedStopPrice()), this.$event, true), null, null, false, 3932159, null);
        }
    }

    public final void onKeyPressed(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        applyMutation(new C176101(event, null));
    }

    /* compiled from: FuturesOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onFocusChanged$1", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onFocusChanged$1 */
    static final class C176091 extends ContinuationImpl7 implements Function2<FuturesOrderFormDataState, Continuation<? super FuturesOrderFormDataState>, Object> {
        final /* synthetic */ FuturesOrderFormDataState.FocusedText $focus;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C176091(FuturesOrderFormDataState.FocusedText focusedText, Continuation<? super C176091> continuation) {
            super(2, continuation);
            this.$focus = focusedText;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C176091 c176091 = new C176091(this.$focus, continuation);
            c176091.L$0 = obj;
            return c176091;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesOrderFormDataState futuresOrderFormDataState, Continuation<? super FuturesOrderFormDataState> continuation) {
            return ((C176091) create(futuresOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FuturesOrderFormDataState.copy$default((FuturesOrderFormDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, false, this.$focus, null, null, null, null, null, null, false, 4177919, null);
        }
    }

    public final void onFocusChanged(FuturesOrderFormDataState.FocusedText focus) {
        Intrinsics.checkNotNullParameter(focus, "focus");
        applyMutation(new C176091(focus, null));
    }

    /* compiled from: FuturesOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onDisabledClicked$1", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onDisabledClicked$1 */
    static final class C176081 extends ContinuationImpl7 implements Function2<FuturesOrderFormDataState, Continuation<? super FuturesOrderFormDataState>, Object> {
        final /* synthetic */ FuturesOrderFormDataState.DisabledClickSource $source;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: FuturesOrderFormDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onDisabledClicked$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[FuturesOrderConfiguration.values().length];
                try {
                    iArr[FuturesOrderConfiguration.LIMIT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[FuturesOrderFormDataState.DisabledClickSource.values().length];
                try {
                    iArr2[FuturesOrderFormDataState.DisabledClickSource.QUANTITY.ordinal()] = 1;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr2[FuturesOrderFormDataState.DisabledClickSource.PRICE.ordinal()] = 2;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[FuturesOrderFormDataState.DisabledClickSource.TIME_IN_FORCE.ordinal()] = 3;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C176081(FuturesOrderFormDataState.DisabledClickSource disabledClickSource, Continuation<? super C176081> continuation) {
            super(2, continuation);
            this.$source = disabledClickSource;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C176081 c176081 = new C176081(this.$source, continuation);
            c176081.L$0 = obj;
            return c176081;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesOrderFormDataState futuresOrderFormDataState, Continuation<? super FuturesOrderFormDataState> continuation) {
            return ((C176081) create(futuresOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            FuturesOrderFormDataState.FocusedText focusedText;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FuturesOrderFormDataState futuresOrderFormDataState = (FuturesOrderFormDataState) this.L$0;
            if (!Intrinsics.areEqual(futuresOrderFormDataState.getOrderSubmissionState(), OrderSubmissionState.Reviewing.INSTANCE)) {
                return futuresOrderFormDataState;
            }
            int i = WhenMappings.$EnumSwitchMapping$1[this.$source.ordinal()];
            if (i == 1) {
                return FuturesOrderFormDataState.copy$default(futuresOrderFormDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, false, FuturesOrderFormDataState.FocusedText.QUANTITY, null, null, null, null, null, OrderSubmissionState.Editing.INSTANCE, false, 3129343, null);
            }
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return FuturesOrderFormDataState.copy$default(futuresOrderFormDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, null, null, false, 4186111, null);
            }
            OrderSubmissionState.Editing editing = OrderSubmissionState.Editing.INSTANCE;
            if (WhenMappings.$EnumSwitchMapping$0[futuresOrderFormDataState.getOrderConfig().ordinal()] == 1) {
                focusedText = FuturesOrderFormDataState.FocusedText.LIMIT_PRICE;
            } else {
                focusedText = FuturesOrderFormDataState.FocusedText.STOP_PRICE;
            }
            return FuturesOrderFormDataState.copy$default(futuresOrderFormDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, false, focusedText, null, null, null, null, null, editing, false, 3129343, null);
        }
    }

    public final void onDisabledClicked(FuturesOrderFormDataState.DisabledClickSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        applyMutation(new C176081(source, null));
    }

    public final void submitOrder(UiFuturesOrderContext order) {
        Intrinsics.checkNotNullParameter(order, "order");
        Job job = this.softOrderChecksJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        this.softOrderChecksJob = null;
        OrderSubmissionManager.submit$default(this.futuresOrderManager, order, null, true, 2, null);
        logOrderSubmissionEvent(order);
        if (getCameFromLadder()) {
            submit(new OrderFormEvent.ExitOrderForm(true, true));
        }
    }

    private final void logOrderSubmissionEvent(UiFuturesOrderContext order) {
        Screen screen;
        EventLogger eventLogger = this.eventLogger;
        Screen screen2 = new Screen(Screen.Name.FUTURES_ORDER_FORM_REVIEW_SCREEN, null, "FUTURES_ORDER_FORM_REVIEW_SCREEN", null, 10, null);
        UserInteractionEventData.Action action = UserInteractionEventData.Action.SUBMIT_ORDER;
        UserInteractionEventData.EventType eventType = UserInteractionEventData.EventType.SWIPE;
        FuturesOrderContext futuresOrderContext$default = LoggingUtils6.toFuturesOrderContext$default(order, null, 1, null);
        if (getCameFromLadder()) {
            screen = new Screen(Screen.Name.FUTURES_LADDER_SCREEN, null, "FUTURES_LADDER_SCREEN", null, 10, null);
        } else {
            screen = new Screen(Screen.Name.FUTURES_ORDER_FORM_SCREEN, null, "FUTURES_ORDER_FORM_SCREEN", null, 10, null);
        }
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, new UserInteractionEventData(eventType, screen2, null, action, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, screen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, futuresOrderContext$default, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4097, -1, -1, -1, -1, -9, 16383, null), null, null, 100, null), false, false, 6, null);
    }

    /* compiled from: FuturesOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$setOrderConfig$1", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$setOrderConfig$1 */
    static final class C176151 extends ContinuationImpl7 implements Function2<FuturesOrderFormDataState, Continuation<? super FuturesOrderFormDataState>, Object> {
        final /* synthetic */ FuturesOrderConfiguration $orderConfig;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C176151(FuturesOrderConfiguration futuresOrderConfiguration, Continuation<? super C176151> continuation) {
            super(2, continuation);
            this.$orderConfig = futuresOrderConfiguration;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C176151 c176151 = new C176151(this.$orderConfig, continuation);
            c176151.L$0 = obj;
            return c176151;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesOrderFormDataState futuresOrderFormDataState, Continuation<? super FuturesOrderFormDataState> continuation) {
            return ((C176151) create(futuresOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FuturesOrderFormDataState futuresOrderFormDataState = (FuturesOrderFormDataState) this.L$0;
            FuturesOrderConfiguration orderConfig = futuresOrderFormDataState.getOrderConfig();
            FuturesOrderConfiguration futuresOrderConfiguration = this.$orderConfig;
            return orderConfig != futuresOrderConfiguration ? FuturesOrderFormDataState.copy$default(futuresOrderFormDataState, null, null, null, null, null, null, null, null, null, null, null, null, futuresOrderConfiguration, false, null, null, "", "", "", null, null, false, 3731455, null) : futuresOrderFormDataState;
        }
    }

    public final void setOrderConfig(FuturesOrderConfiguration orderConfig) {
        Intrinsics.checkNotNullParameter(orderConfig, "orderConfig");
        applyMutation(new C176151(orderConfig, null));
    }

    /* compiled from: FuturesOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onShowTimeInForceSelector$1", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onShowTimeInForceSelector$1 */
    static final class C176121 extends ContinuationImpl7 implements Function2<FuturesOrderFormDataState, Continuation<? super FuturesOrderFormDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C176121(Continuation<? super C176121> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C176121 c176121 = new C176121(continuation);
            c176121.L$0 = obj;
            return c176121;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesOrderFormDataState futuresOrderFormDataState, Continuation<? super FuturesOrderFormDataState> continuation) {
            return ((C176121) create(futuresOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FuturesOrderFormDataState.copy$default((FuturesOrderFormDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, null, null, false, 4186111, null);
        }
    }

    public final void onShowTimeInForceSelector() {
        applyMutation(new C176121(null));
    }

    /* compiled from: FuturesOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onTimeInForceSelected$1", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onTimeInForceSelected$1 */
    static final class C176131 extends ContinuationImpl7 implements Function2<FuturesOrderFormDataState, Continuation<? super FuturesOrderFormDataState>, Object> {
        final /* synthetic */ FuturesTimeInForce $timeInForce;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C176131(FuturesTimeInForce futuresTimeInForce, Continuation<? super C176131> continuation) {
            super(2, continuation);
            this.$timeInForce = futuresTimeInForce;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C176131 c176131 = new C176131(this.$timeInForce, continuation);
            c176131.L$0 = obj;
            return c176131;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesOrderFormDataState futuresOrderFormDataState, Continuation<? super FuturesOrderFormDataState> continuation) {
            return ((C176131) create(futuresOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FuturesOrderFormDataState.copy$default((FuturesOrderFormDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, this.$timeInForce, null, null, null, null, null, false, 4161535, null);
        }
    }

    public final void onTimeInForceSelected(FuturesTimeInForce timeInForce) {
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        applyMutation(new C176131(timeInForce, null));
    }

    /* compiled from: FuturesOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onTimeInForceSelectorDismissed$1", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$onTimeInForceSelectorDismissed$1 */
    static final class C176141 extends ContinuationImpl7 implements Function2<FuturesOrderFormDataState, Continuation<? super FuturesOrderFormDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C176141(Continuation<? super C176141> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C176141 c176141 = new C176141(continuation);
            c176141.L$0 = obj;
            return c176141;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesOrderFormDataState futuresOrderFormDataState, Continuation<? super FuturesOrderFormDataState> continuation) {
            return ((C176141) create(futuresOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FuturesOrderFormDataState.copy$default((FuturesOrderFormDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, 4186111, null);
        }
    }

    public final void onTimeInForceSelectorDismissed() {
        applyMutation(new C176141(null));
    }

    @Override // com.robinhood.futures.ordercheck.contracts.FuturesOrderCheckResolver
    public Object applyForAccount(Continuation<? super Unit> continuation) {
        if (getCameFromLadder()) {
            submit(new OrderFormEvent.OrderCheckResolveOnLadderEvent(new C175982(null)));
        } else {
            submit(OrderFormEvent.ShowOnboardingFlow.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: FuturesOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "resolver", "Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderCheckResolver;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$applyForAccount$2", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {641}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$applyForAccount$2 */
    static final class C175982 extends ContinuationImpl7 implements Function2<FuturesOrderCheckResolver, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C175982(Continuation<? super C175982> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C175982 c175982 = new C175982(continuation);
            c175982.L$0 = obj;
            return c175982;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesOrderCheckResolver futuresOrderCheckResolver, Continuation<? super Unit> continuation) {
            return ((C175982) create(futuresOrderCheckResolver, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FuturesOrderCheckResolver futuresOrderCheckResolver = (FuturesOrderCheckResolver) this.L$0;
                this.label = 1;
                if (futuresOrderCheckResolver.applyForAccount(this) == coroutine_suspended) {
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

    @Override // com.robinhood.futures.ordercheck.contracts.FuturesOrderCheckResolver
    public Object focusOnQuantityText(Continuation<? super Unit> continuation) {
        if (getCameFromLadder()) {
            submit(new OrderFormEvent.OrderCheckResolveOnLadderEvent(new C176012(null)));
        } else {
            submit(new OrderFormEvent.FocusOnText(FuturesOrderFormDataState.FocusedText.QUANTITY));
            applyMutation(new C176023(null));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: FuturesOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "resolver", "Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderCheckResolver;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$focusOnQuantityText$2", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {653}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$focusOnQuantityText$2 */
    static final class C176012 extends ContinuationImpl7 implements Function2<FuturesOrderCheckResolver, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C176012(Continuation<? super C176012> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C176012 c176012 = new C176012(continuation);
            c176012.L$0 = obj;
            return c176012;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesOrderCheckResolver futuresOrderCheckResolver, Continuation<? super Unit> continuation) {
            return ((C176012) create(futuresOrderCheckResolver, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FuturesOrderCheckResolver futuresOrderCheckResolver = (FuturesOrderCheckResolver) this.L$0;
                this.label = 1;
                if (futuresOrderCheckResolver.focusOnQuantityText(this) == coroutine_suspended) {
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

    /* compiled from: FuturesOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$focusOnQuantityText$3", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$focusOnQuantityText$3 */
    static final class C176023 extends ContinuationImpl7 implements Function2<FuturesOrderFormDataState, Continuation<? super FuturesOrderFormDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C176023(Continuation<? super C176023> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C176023 c176023 = new C176023(continuation);
            c176023.L$0 = obj;
            return c176023;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesOrderFormDataState futuresOrderFormDataState, Continuation<? super FuturesOrderFormDataState> continuation) {
            return ((C176023) create(futuresOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FuturesOrderFormDataState.copy$default((FuturesOrderFormDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, false, FuturesOrderFormDataState.FocusedText.QUANTITY, null, null, null, null, null, null, false, 4177919, null);
        }
    }

    @Override // com.robinhood.futures.ordercheck.contracts.FuturesOrderCheckResolver
    public Object focusOnPriceText(Continuation<? super Unit> continuation) {
        if (getCameFromLadder()) {
            submit(new OrderFormEvent.OrderCheckResolveOnLadderEvent(new C175992(null)));
        } else {
            applyMutation(new C176003(null));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: FuturesOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "resolver", "Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderCheckResolver;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$focusOnPriceText$2", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {672}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$focusOnPriceText$2 */
    static final class C175992 extends ContinuationImpl7 implements Function2<FuturesOrderCheckResolver, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C175992(Continuation<? super C175992> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C175992 c175992 = new C175992(continuation);
            c175992.L$0 = obj;
            return c175992;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesOrderCheckResolver futuresOrderCheckResolver, Continuation<? super Unit> continuation) {
            return ((C175992) create(futuresOrderCheckResolver, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FuturesOrderCheckResolver futuresOrderCheckResolver = (FuturesOrderCheckResolver) this.L$0;
                this.label = 1;
                if (futuresOrderCheckResolver.focusOnPriceText(this) == coroutine_suspended) {
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

    /* compiled from: FuturesOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$focusOnPriceText$3", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$focusOnPriceText$3 */
    static final class C176003 extends ContinuationImpl7 implements Function2<FuturesOrderFormDataState, Continuation<? super FuturesOrderFormDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: FuturesOrderFormDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$focusOnPriceText$3$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FuturesOrderConfiguration.values().length];
                try {
                    iArr[FuturesOrderConfiguration.LIMIT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C176003(Continuation<? super C176003> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C176003 c176003 = FuturesOrderFormDuxo.this.new C176003(continuation);
            c176003.L$0 = obj;
            return c176003;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesOrderFormDataState futuresOrderFormDataState, Continuation<? super FuturesOrderFormDataState> continuation) {
            return ((C176003) create(futuresOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            FuturesOrderFormDataState.FocusedText focusedText;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FuturesOrderFormDataState futuresOrderFormDataState = (FuturesOrderFormDataState) this.L$0;
            if (WhenMappings.$EnumSwitchMapping$0[futuresOrderFormDataState.getOrderConfig().ordinal()] == 1) {
                focusedText = FuturesOrderFormDataState.FocusedText.LIMIT_PRICE;
            } else {
                focusedText = FuturesOrderFormDataState.FocusedText.STOP_PRICE;
            }
            FuturesOrderFormDuxo.this.submit(new OrderFormEvent.FocusOnText(focusedText));
            return FuturesOrderFormDataState.copy$default(futuresOrderFormDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, false, focusedText, null, null, null, null, null, null, false, 4177919, null);
        }
    }

    @Override // com.robinhood.futures.ordercheck.contracts.FuturesOrderCheckResolver
    public Object makeDeposit(final com.ionspin.kotlin.bignum.decimal.BigDecimal bigDecimal, Continuation<? super Unit> continuation) {
        if (getCameFromLadder()) {
            submit(new OrderFormEvent.OrderCheckResolveOnLadderEvent(new C176032(bigDecimal, null)));
        } else {
            withDataState(new Function1() { // from class: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FuturesOrderFormDuxo.makeDeposit$lambda$4(this.f$0, bigDecimal, (FuturesOrderFormDataState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* compiled from: FuturesOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "resolver", "Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderCheckResolver;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$makeDeposit$2", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {691}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$makeDeposit$2 */
    static final class C176032 extends ContinuationImpl7 implements Function2<FuturesOrderCheckResolver, Continuation<? super Unit>, Object> {
        final /* synthetic */ com.ionspin.kotlin.bignum.decimal.BigDecimal $suggestedAmount;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C176032(com.ionspin.kotlin.bignum.decimal.BigDecimal bigDecimal, Continuation<? super C176032> continuation) {
            super(2, continuation);
            this.$suggestedAmount = bigDecimal;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C176032 c176032 = new C176032(this.$suggestedAmount, continuation);
            c176032.L$0 = obj;
            return c176032;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesOrderCheckResolver futuresOrderCheckResolver, Continuation<? super Unit> continuation) {
            return ((C176032) create(futuresOrderCheckResolver, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FuturesOrderCheckResolver futuresOrderCheckResolver = (FuturesOrderCheckResolver) this.L$0;
                com.ionspin.kotlin.bignum.decimal.BigDecimal bigDecimal = this.$suggestedAmount;
                this.label = 1;
                if (futuresOrderCheckResolver.makeDeposit(bigDecimal, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeDeposit$lambda$4(FuturesOrderFormDuxo futuresOrderFormDuxo, com.ionspin.kotlin.bignum.decimal.BigDecimal bigDecimal, FuturesOrderFormDataState ds) {
        String rhsAccountNumber;
        Intrinsics.checkNotNullParameter(ds, "ds");
        FuturesAccount account = ds.getAccount();
        if (account != null && (rhsAccountNumber = account.getRhsAccountNumber()) != null) {
            futuresOrderFormDuxo.submit(new OrderFormEvent.ShowTransferFlow(DecimalUtility.toJavaBigDecimal(bigDecimal), rhsAccountNumber));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: FuturesOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$updatePrice$2", m3645f = "FuturesOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$updatePrice$2 */
    static final class C176162 extends ContinuationImpl7 implements Function2<FuturesOrderFormDataState, Continuation<? super FuturesOrderFormDataState>, Object> {
        final /* synthetic */ com.ionspin.kotlin.bignum.decimal.BigDecimal $newPrice;
        final /* synthetic */ FuturesOrderPriceType $priceType;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: FuturesOrderFormDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.futures.trade.ui.orderform.FuturesOrderFormDuxo$updatePrice$2$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FuturesOrderPriceType.values().length];
                try {
                    iArr[FuturesOrderPriceType.ORDER_PRICE_TYPE_LIMIT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FuturesOrderPriceType.ORDER_PRICE_TYPE_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C176162(FuturesOrderPriceType futuresOrderPriceType, com.ionspin.kotlin.bignum.decimal.BigDecimal bigDecimal, Continuation<? super C176162> continuation) {
            super(2, continuation);
            this.$priceType = futuresOrderPriceType;
            this.$newPrice = bigDecimal;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C176162 c176162 = new C176162(this.$priceType, this.$newPrice, continuation);
            c176162.L$0 = obj;
            return c176162;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesOrderFormDataState futuresOrderFormDataState, Continuation<? super FuturesOrderFormDataState> continuation) {
            return ((C176162) create(futuresOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FuturesOrderFormDataState futuresOrderFormDataState = (FuturesOrderFormDataState) this.L$0;
            int i = WhenMappings.$EnumSwitchMapping$0[this.$priceType.ordinal()];
            if (i == 1) {
                return FuturesOrderFormDataState.copy$default(futuresOrderFormDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, this.$newPrice.toPlainString(), null, null, null, false, 4063231, null);
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return FuturesOrderFormDataState.copy$default(futuresOrderFormDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, this.$newPrice.toPlainString(), null, null, false, 3932159, null);
        }
    }

    @Override // com.robinhood.futures.ordercheck.contracts.FuturesOrderCheckResolver
    public Object updatePrice(FuturesOrderPriceType futuresOrderPriceType, com.ionspin.kotlin.bignum.decimal.BigDecimal bigDecimal, Continuation<? super Unit> continuation) {
        applyMutation(new C176162(futuresOrderPriceType, bigDecimal, null));
        return Unit.INSTANCE;
    }

    /* compiled from: FuturesOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDuxo;", "Lcom/robinhood/android/futures/contracts/FuturesOrderFormFragmentKey;", "<init>", "()V", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<FuturesOrderFormDuxo, FuturesOrderFormFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public FuturesOrderFormFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (FuturesOrderFormFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public FuturesOrderFormFragmentKey getArgs(FuturesOrderFormDuxo futuresOrderFormDuxo) {
            return (FuturesOrderFormFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, futuresOrderFormDuxo);
        }
    }
}
