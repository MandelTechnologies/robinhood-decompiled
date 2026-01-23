package com.robinhood.android.futures.trade.p147ui;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.transition.Transition;
import android.transition.TransitionInflater;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.futures.contracts.FuturesGenericLadderFragmentKey;
import com.robinhood.android.futures.contracts.FuturesLadderFragmentKey;
import com.robinhood.android.futures.contracts.FuturesOrderFormFragmentKey;
import com.robinhood.android.futures.contracts.FuturesTradeActivityKey;
import com.robinhood.android.futures.trade.p147ui.ladder.FuturesGenericLadderExperiment;
import com.robinhood.android.futures.trade.p147ui.ladder.FuturesGenericLadderFragment;
import com.robinhood.android.futures.trade.p147ui.ladder.FuturesLadderFragment;
import com.robinhood.android.futures.trade.p147ui.orderform.FuturesOrderFormFragment;
import com.robinhood.android.futures.trade.p147ui.ordertype.FuturesOrderTypeFragment;
import com.robinhood.android.lib.futures.trade.FuturesLadderFragmentCallbacks;
import com.robinhood.android.lib.futures.trade.FuturesOrderFormFragmentCallbacks;
import com.robinhood.android.lib.futures.trade.UiFuturesOrderContext;
import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import com.robinhood.android.models.futures.api.order.FuturesOrderTrigger;
import com.robinhood.android.models.futures.api.order.FuturesOrderType;
import com.robinhood.android.models.futures.p189db.FuturesOrderConfiguration;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.regiongate.FuturesTradingRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.futures.ordercheck.contracts.FuturesOrderCheckResolver;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.store.futures.FuturesOrderStore;
import com.robinhood.tooltips.TooltipActivity;
import com.robinhood.tooltips.TooltipManager;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.Set;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: FuturesTradeActivity.kt */
@Metadata(m3635d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 P2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001PB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0015J\u0010\u00104\u001a\u0002012\u0006\u00105\u001a\u000206H\u0002J\u0010\u00107\u001a\u0002012\u0006\u00108\u001a\u000209H\u0016J\b\u0010:\u001a\u00020(H\u0016J\u0010\u0010;\u001a\u0002012\u0006\u0010<\u001a\u00020=H\u0016J\u0010\u0010>\u001a\u0002012\u0006\u0010?\u001a\u00020@H\u0016J\b\u0010A\u001a\u000201H\u0016J\b\u0010B\u001a\u000201H\u0016J\u0018\u0010C\u001a\u0002012\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020GH\u0016J\b\u0010H\u001a\u00020IH\u0016J\t\u0010J\u001a\u00020@H\u0096\u0001R\u001e\u0010\t\u001a\u00020\n8\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R+\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020(8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0018\u0010K\u001a\b\u0012\u0004\u0012\u00020M0LX\u0096\u0005¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006Q"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/FuturesTradeActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/tooltips/TooltipActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/lib/futures/trade/FuturesLadderFragmentCallbacks;", "Lcom/robinhood/android/lib/futures/trade/FuturesOrderFormFragmentCallbacks;", "Lcom/robinhood/android/futures/trade/ui/ordertype/FuturesOrderTypeFragment$Callbacks;", "<init>", "()V", "tooltipManager", "Lcom/robinhood/tooltips/TooltipManager;", "getTooltipManager", "()Lcom/robinhood/tooltips/TooltipManager;", "setTooltipManager", "(Lcom/robinhood/tooltips/TooltipManager;)V", "goldUpsellNavigationHelper", "Lcom/robinhood/android/futures/trade/ui/GoldUpsellNavigationHelper;", "getGoldUpsellNavigationHelper", "()Lcom/robinhood/android/futures/trade/ui/GoldUpsellNavigationHelper;", "setGoldUpsellNavigationHelper", "(Lcom/robinhood/android/futures/trade/ui/GoldUpsellNavigationHelper;)V", "futuresOrderStore", "Lcom/robinhood/store/futures/FuturesOrderStore;", "getFuturesOrderStore", "()Lcom/robinhood/store/futures/FuturesOrderStore;", "setFuturesOrderStore", "(Lcom/robinhood/store/futures/FuturesOrderStore;)V", "bwWebViewManager", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;", "getBwWebViewManager", "()Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;", "setBwWebViewManager", "(Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;)V", "experimentsProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "getExperimentsProvider", "()Lcom/robinhood/experiments/ExperimentsProvider;", "setExperimentsProvider", "(Lcom/robinhood/experiments/ExperimentsProvider;)V", "<set-?>", "Lcom/robinhood/android/models/futures/db/FuturesOrderConfiguration;", "_orderConfig", "get_orderConfig", "()Lcom/robinhood/android/models/futures/db/FuturesOrderConfiguration;", "set_orderConfig", "(Lcom/robinhood/android/models/futures/db/FuturesOrderConfiguration;)V", "_orderConfig$delegate", "Lkotlin/properties/ReadWriteProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "navigateToLadderFragment", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/futures/contracts/FuturesTradeActivityKey$TradeData$Ladder;", "reviewOrder", Card.Icon.ORDER, "Lcom/robinhood/android/lib/futures/trade/UiFuturesOrderContext$OrderRequest;", "getOrderConfig", "onOrderTypeClicked", "side", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "exitOrderForm", "shouldFadeOut", "", "onExitLadder", "onDonePressed", "onOrderTypeSelected", "newOrderType", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderType;", "newOrderTrigger", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderTrigger;", "getLadderFragmentOrderChecksResolver", "Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderCheckResolver;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class FuturesTradeActivity extends BaseActivity implements TooltipActivity, RegionGated, FuturesLadderFragmentCallbacks, FuturesOrderFormFragmentCallbacks, FuturesOrderTypeFragment.Callbacks {
    private static final String TAG_LADDER_FRAGMENT = "ladderFragment";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: _orderConfig$delegate, reason: from kotlin metadata */
    private final Interfaces3 _orderConfig;
    public BwWebViewManager bwWebViewManager;
    public ExperimentsProvider experimentsProvider;
    public FuturesOrderStore futuresOrderStore;
    public GoldUpsellNavigationHelper goldUpsellNavigationHelper;
    public TooltipManager tooltipManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(FuturesTradeActivity.class, "_orderConfig", "get_orderConfig()Lcom/robinhood/android/models/futures/db/FuturesOrderConfiguration;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public FuturesTradeActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(FuturesTradingRegionGate.INSTANCE);
        this._orderConfig = (Interfaces3) BindSavedState2.savedParcelable(this, FuturesOrderConfiguration.INSTANCE.invoke(FuturesOrderType.MARKET, FuturesOrderTrigger.IMMEDIATE)).provideDelegate(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.tooltips.TooltipActivity
    public TooltipManager getTooltipManager() {
        TooltipManager tooltipManager = this.tooltipManager;
        if (tooltipManager != null) {
            return tooltipManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tooltipManager");
        return null;
    }

    public void setTooltipManager(TooltipManager tooltipManager) {
        Intrinsics.checkNotNullParameter(tooltipManager, "<set-?>");
        this.tooltipManager = tooltipManager;
    }

    public final GoldUpsellNavigationHelper getGoldUpsellNavigationHelper() {
        GoldUpsellNavigationHelper goldUpsellNavigationHelper = this.goldUpsellNavigationHelper;
        if (goldUpsellNavigationHelper != null) {
            return goldUpsellNavigationHelper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("goldUpsellNavigationHelper");
        return null;
    }

    public final void setGoldUpsellNavigationHelper(GoldUpsellNavigationHelper goldUpsellNavigationHelper) {
        Intrinsics.checkNotNullParameter(goldUpsellNavigationHelper, "<set-?>");
        this.goldUpsellNavigationHelper = goldUpsellNavigationHelper;
    }

    public final FuturesOrderStore getFuturesOrderStore() {
        FuturesOrderStore futuresOrderStore = this.futuresOrderStore;
        if (futuresOrderStore != null) {
            return futuresOrderStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("futuresOrderStore");
        return null;
    }

    public final void setFuturesOrderStore(FuturesOrderStore futuresOrderStore) {
        Intrinsics.checkNotNullParameter(futuresOrderStore, "<set-?>");
        this.futuresOrderStore = futuresOrderStore;
    }

    public final BwWebViewManager getBwWebViewManager() {
        BwWebViewManager bwWebViewManager = this.bwWebViewManager;
        if (bwWebViewManager != null) {
            return bwWebViewManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bwWebViewManager");
        return null;
    }

    public final void setBwWebViewManager(BwWebViewManager bwWebViewManager) {
        Intrinsics.checkNotNullParameter(bwWebViewManager, "<set-?>");
        this.bwWebViewManager = bwWebViewManager;
    }

    public final ExperimentsProvider getExperimentsProvider() {
        ExperimentsProvider experimentsProvider = this.experimentsProvider;
        if (experimentsProvider != null) {
            return experimentsProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentsProvider");
        return null;
    }

    public final void setExperimentsProvider(ExperimentsProvider experimentsProvider) {
        Intrinsics.checkNotNullParameter(experimentsProvider, "<set-?>");
        this.experimentsProvider = experimentsProvider;
    }

    private final FuturesOrderConfiguration get_orderConfig() {
        return (FuturesOrderConfiguration) this._orderConfig.getValue(this, $$delegatedProperties[0]);
    }

    private final void set_orderConfig(FuturesOrderConfiguration futuresOrderConfiguration) {
        this._orderConfig.setValue(this, $$delegatedProperties[0], futuresOrderConfiguration);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"CommitTransaction"})
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            FuturesTradeActivityKey.TradeData data = ((FuturesTradeActivityKey) INSTANCE.getExtras((Activity) this)).getData();
            if (data instanceof FuturesTradeActivityKey.TradeData.Ladder) {
                navigateToLadderFragment((FuturesTradeActivityKey.TradeData.Ladder) data);
            } else {
                if (!(data instanceof FuturesTradeActivityKey.TradeData.OrderForm)) {
                    throw new NoWhenBranchMatchedException();
                }
                FuturesTradeActivityKey.TradeData.OrderForm orderForm = (FuturesTradeActivityKey.TradeData.OrderForm) data;
                setFragment(C11048R.id.fragment_container, (FuturesOrderFormFragment) FuturesOrderFormFragment.INSTANCE.newInstance((Parcelable) new FuturesOrderFormFragmentKey.Default(null, orderForm.getFuturesContractId(), orderForm.getSide(), orderForm.getSourceScreen(), orderForm.getDefaultQuantity(), 1, null)));
            }
        }
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C174691(null));
        if (((FuturesTradeActivityKey) INSTANCE.getExtras((Activity) this)).getData().getRetainAdvancedChart()) {
            getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C174702(null));
        }
    }

    /* compiled from: FuturesTradeActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.FuturesTradeActivity$onCreate$1", m3645f = "FuturesTradeActivity.kt", m3646l = {86}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.FuturesTradeActivity$onCreate$1 */
    static final class C174691 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C174691(Continuation<? super C174691> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FuturesTradeActivity.this.new C174691(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C174691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Object> flowSubscribeToWebsocketOrderUpdates = FuturesTradeActivity.this.getFuturesOrderStore().subscribeToWebsocketOrderUpdates();
                FlowCollector<? super Object> flowCollector = new FlowCollector() { // from class: com.robinhood.android.futures.trade.ui.FuturesTradeActivity.onCreate.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation<? super Unit> continuation) {
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowSubscribeToWebsocketOrderUpdates.collect(flowCollector, this) == coroutine_suspended) {
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

    /* compiled from: FuturesTradeActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.FuturesTradeActivity$onCreate$2", m3645f = "FuturesTradeActivity.kt", m3646l = {91}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.FuturesTradeActivity$onCreate$2 */
    static final class C174702 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C174702(Continuation<? super C174702> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FuturesTradeActivity.this.new C174702(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C174702) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BwWebViewManager bwWebViewManager = FuturesTradeActivity.this.getBwWebViewManager();
                this.label = 1;
                if (bwWebViewManager.retainUntilCanceled(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    /* compiled from: FuturesTradeActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.FuturesTradeActivity$navigateToLadderFragment$1", m3645f = "FuturesTradeActivity.kt", m3646l = {100}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.FuturesTradeActivity$navigateToLadderFragment$1 */
    static final class C174681 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FuturesTradeActivityKey.TradeData.Ladder $data;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C174681(FuturesTradeActivityKey.TradeData.Ladder ladder, Continuation<? super C174681> continuation) {
            super(2, continuation);
            this.$data = ladder;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FuturesTradeActivity.this.new C174681(this.$data, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C174681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Fragment fragmentCreateFragment;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(FuturesTradeActivity.this.getExperimentsProvider(), new Experiment[]{FuturesGenericLadderExperiment.INSTANCE}, false, null, 6, null);
                this.label = 1;
                obj = FlowKt.firstOrNull(flowStreamStateFlow$default, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Boolean bool = (Boolean) obj;
            if (bool != null ? bool.booleanValue() : false) {
                fragmentCreateFragment = FuturesGenericLadderFragment.INSTANCE.createFragment((FragmentKey) new FuturesGenericLadderFragmentKey(this.$data.getFuturesContractId(), this.$data.getSourceScreen()));
            } else {
                fragmentCreateFragment = FuturesLadderFragment.INSTANCE.createFragment((FragmentKey) new FuturesLadderFragmentKey(this.$data.getFuturesContractId(), this.$data.getSourceScreen(), null, 4, null));
            }
            FuturesTradeActivity.this.getSupportFragmentManager().beginTransaction().add(C11048R.id.fragment_container, fragmentCreateFragment, FuturesTradeActivity.TAG_LADDER_FRAGMENT).commitAllowingStateLoss();
            return Unit.INSTANCE;
        }
    }

    private final void navigateToLadderFragment(FuturesTradeActivityKey.TradeData.Ladder data) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C174681(data, null), 3, null);
    }

    @Override // com.robinhood.android.lib.futures.trade.FuturesLadderFragmentCallbacks
    public void reviewOrder(UiFuturesOrderContext.OrderRequest order) {
        Intrinsics.checkNotNullParameter(order, "order");
        set_orderConfig(FuturesOrderConfiguration.INSTANCE.invoke(order.getOrderType(), order.getOrderTrigger()));
        replaceFragment(FuturesOrderFormFragment.INSTANCE.newInstance((Parcelable) new FuturesOrderFormFragmentKey.WithOrderToReview(order, new Screen(Screen.Name.FUTURES_LADDER_SCREEN, null, null, null, 14, null))));
    }

    @Override // com.robinhood.android.lib.futures.trade.FuturesOrderFormFragmentCallbacks
    public FuturesOrderConfiguration getOrderConfig() {
        return get_orderConfig();
    }

    @Override // com.robinhood.android.lib.futures.trade.FuturesOrderFormFragmentCallbacks
    public void onOrderTypeClicked(FuturesOrderSide side) {
        Intrinsics.checkNotNullParameter(side, "side");
        Companion companion = INSTANCE;
        replaceFragment((FuturesOrderTypeFragment) FuturesOrderTypeFragment.INSTANCE.newInstance((Parcelable) new FuturesTradeActivityKey.TradeData.OrderForm(((FuturesTradeActivityKey) companion.getExtras((Activity) this)).getData().getFuturesContractId(), ((FuturesTradeActivityKey) companion.getExtras((Activity) this)).getData().getSourceScreen(), side, null, false, 24, null)));
    }

    @Override // com.robinhood.android.lib.futures.trade.FuturesOrderFormFragmentCallbacks
    public void exitOrderForm(boolean shouldFadeOut) {
        if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
            if (shouldFadeOut) {
                Transition transitionInflateTransition = TransitionInflater.from(this).inflateTransition(R.transition.fade);
                Fragment currentFragment = getCurrentFragment();
                if (currentFragment != null) {
                    currentFragment.setReturnTransition(transitionInflateTransition);
                }
            }
            popLastFragment();
            return;
        }
        finishThisActivity();
    }

    @Override // com.robinhood.android.lib.futures.trade.FuturesLadderFragmentCallbacks
    public void onExitLadder() {
        onBackPressed();
    }

    /* compiled from: FuturesTradeActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.FuturesTradeActivity$onDonePressed$1", m3645f = "FuturesTradeActivity.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.FuturesTradeActivity$onDonePressed$1 */
    static final class C174711 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C174711(Continuation<? super C174711> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FuturesTradeActivity.this.new C174711(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C174711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                GoldUpsellNavigationHelper goldUpsellNavigationHelper = FuturesTradeActivity.this.getGoldUpsellNavigationHelper();
                FuturesTradeActivity futuresTradeActivity = FuturesTradeActivity.this;
                FuturesTradeActivityKey.TradeData data = ((FuturesTradeActivityKey) FuturesTradeActivity.INSTANCE.getExtras((Activity) futuresTradeActivity)).getData();
                this.label = 1;
                if (goldUpsellNavigationHelper.navigateToGoldUpsellScreen(futuresTradeActivity, data, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            FuturesOrderFormFragmentCallbacks.DefaultImpls.exitOrderForm$default(FuturesTradeActivity.this, false, 1, null);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.lib.futures.trade.FuturesOrderFormFragmentCallbacks
    public void onDonePressed() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C174711(null), 3, null);
    }

    @Override // com.robinhood.android.futures.trade.ui.ordertype.FuturesOrderTypeFragment.Callbacks
    public void onOrderTypeSelected(FuturesOrderType newOrderType, FuturesOrderTrigger newOrderTrigger) {
        Intrinsics.checkNotNullParameter(newOrderType, "newOrderType");
        Intrinsics.checkNotNullParameter(newOrderTrigger, "newOrderTrigger");
        set_orderConfig(FuturesOrderConfiguration.INSTANCE.invoke(newOrderType, newOrderTrigger));
        popLastFragment();
    }

    @Override // com.robinhood.android.lib.futures.trade.FuturesOrderFormFragmentCallbacks
    public FuturesOrderCheckResolver getLadderFragmentOrderChecksResolver() {
        Fragment fragmentFindFragmentByTag = getSupportFragmentManager().findFragmentByTag(TAG_LADDER_FRAGMENT);
        FuturesLadderFragment futuresLadderFragment = fragmentFindFragmentByTag instanceof FuturesLadderFragment ? (FuturesLadderFragment) fragmentFindFragmentByTag : null;
        if (futuresLadderFragment != null) {
            return futuresLadderFragment;
        }
        throw new IllegalStateException("Called getLadderFragmentOrderChecksResolver, but LadderFragment wasn't the root!");
    }

    /* compiled from: FuturesTradeActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/FuturesTradeActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/futures/trade/ui/FuturesTradeActivity;", "Lcom/robinhood/android/futures/contracts/FuturesTradeActivityKey;", "<init>", "()V", "TAG_LADDER_FRAGMENT", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<FuturesTradeActivity, FuturesTradeActivityKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public FuturesTradeActivityKey getExtras(FuturesTradeActivity futuresTradeActivity) {
            return (FuturesTradeActivityKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, futuresTradeActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, FuturesTradeActivityKey futuresTradeActivityKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, futuresTradeActivityKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, FuturesTradeActivityKey futuresTradeActivityKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, futuresTradeActivityKey);
        }
    }
}
