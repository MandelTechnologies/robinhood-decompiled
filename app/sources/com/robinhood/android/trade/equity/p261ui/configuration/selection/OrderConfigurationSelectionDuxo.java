package com.robinhood.android.trade.equity.p261ui.configuration.selection;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.equities.taxlots.microgram.TaxLotsCachedService;
import com.robinhood.android.equity.ShareBasedMarketBuysRegionGate;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RecurringInvestmentRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.trade.configuration.OrderConfigurationRow;
import com.robinhood.android.trade.equity.p261ui.configuration.selection.OrderConfigurationContextFactory;
import com.robinhood.android.trade.options.OptionOrderLoggings;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.AccountAccessStore;
import com.robinhood.librobinhood.data.store.AccountFeature;
import com.robinhood.librobinhood.data.store.EquityOrderTypeSelectorStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.TaxLotEligibilityStore;
import com.robinhood.librobinhood.data.store.bonfire.TraderRecurringTradabilityStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.TaxLotEligibility;
import com.robinhood.models.p320db.TradingSession;
import com.robinhood.models.p320db.bonfire.InstrumentRecurringTradability;
import com.robinhood.models.p320db.bonfire.OrderTypeSelector;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.OrderKind;
import com.robinhood.rosetta.eventlogging.OrderKindType;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: OrderConfigurationSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 52\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u00015B\u0081\u0001\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020(H\u0016J\u000e\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020,J\u000e\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020/J\u000e\u00100\u001a\u00020(2\u0006\u00101\u001a\u000202J\b\u00103\u001a\u00020(H\u0002J\u0006\u00104\u001a\u00020(R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u00020\"X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationSelectionDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationSelectionDataState;", "Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationSelectionViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountStore", "Lcom/robinhood/android/lib/account/AccountProvider;", "equityOrderTypeSelectorStore", "Lcom/robinhood/librobinhood/data/store/EquityOrderTypeSelectorStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentRecurringTradabilityStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TraderRecurringTradabilityStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "orderConfigurationContextFactory", "Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationContextFactory;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "taxLotEligibilityStore", "Lcom/robinhood/librobinhood/data/store/TaxLotEligibilityStore;", "taxLotsCachedService", "Lcom/robinhood/android/equities/taxlots/microgram/TaxLotsCachedService;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "stateProvider", "Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationSelectionStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/EquityOrderTypeSelectorStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/bonfire/TraderRecurringTradabilityStore;Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationContextFactory;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/librobinhood/data/store/AccountAccessStore;Lcom/robinhood/librobinhood/data/store/TaxLotEligibilityStore;Lcom/robinhood/android/equities/taxlots/microgram/TaxLotsCachedService;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationSelectionStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onResume", "setDayNightOverlay", "dayNightOverlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "logRecurringOrderTypeSelected", "disabled", "", "setOrderRowSelected", "row", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow;", "clearTaxLots", "logDisclosureTap", "Companion", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class OrderConfigurationSelectionDuxo extends BaseDuxo<OrderConfigurationSelectionDataState, OrderConfigurationSelectionViewState> implements HasSavedState {
    private final AccountAccessStore accountAccessStore;
    private final AccountProvider accountStore;
    private final EquityOrderTypeSelectorStore equityOrderTypeSelectorStore;
    private final EventLogger eventLogger;
    private final TraderRecurringTradabilityStore instrumentRecurringTradabilityStore;
    private final InstrumentStore instrumentStore;
    private final TraderMarketHoursManager marketHoursManager;
    private final OrderConfigurationContextFactory orderConfigurationContextFactory;
    private final RegionGateProvider regionGateProvider;
    private final SavedStateHandle savedStateHandle;
    private final TaxLotEligibilityStore taxLotEligibilityStore;
    private final TaxLotsCachedService taxLotsCachedService;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OrderConfigurationSelectionDuxo(AccountProvider accountStore, EquityOrderTypeSelectorStore equityOrderTypeSelectorStore, InstrumentStore instrumentStore, TraderRecurringTradabilityStore instrumentRecurringTradabilityStore, TraderMarketHoursManager marketHoursManager, OrderConfigurationContextFactory orderConfigurationContextFactory, EventLogger eventLogger, RegionGateProvider regionGateProvider, AccountAccessStore accountAccessStore, TaxLotEligibilityStore taxLotEligibilityStore, TaxLotsCachedService taxLotsCachedService, UserStore userStore, OrderConfigurationSelectionStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(accountStore, "accountStore");
        Intrinsics.checkNotNullParameter(equityOrderTypeSelectorStore, "equityOrderTypeSelectorStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(instrumentRecurringTradabilityStore, "instrumentRecurringTradabilityStore");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(orderConfigurationContextFactory, "orderConfigurationContextFactory");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        Intrinsics.checkNotNullParameter(taxLotEligibilityStore, "taxLotEligibilityStore");
        Intrinsics.checkNotNullParameter(taxLotsCachedService, "taxLotsCachedService");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new OrderConfigurationSelectionDataState(null, null, ((OrderConfigurationContextFactory.OrderConfigurationContext) companion.getArgs(savedStateHandle)).getSide(), ((OrderConfigurationContextFactory.OrderConfigurationContext) companion.getArgs(savedStateHandle)).isShortPosition(), ((OrderConfigurationContextFactory.OrderConfigurationContext) companion.getArgs(savedStateHandle)).getUpsellOption(), ((OrderConfigurationContextFactory.OrderConfigurationContext) companion.getArgs(savedStateHandle)).isRecurringTradable(), ((OrderConfigurationContextFactory.OrderConfigurationContext) companion.getArgs(savedStateHandle)).getRecurringTradabilityReason(), false, null, null, null, null, null, false, false, false, false, null, false, false, 1048451, null), stateProvider, duxoBundle);
        this.accountStore = accountStore;
        this.equityOrderTypeSelectorStore = equityOrderTypeSelectorStore;
        this.instrumentStore = instrumentStore;
        this.instrumentRecurringTradabilityStore = instrumentRecurringTradabilityStore;
        this.marketHoursManager = marketHoursManager;
        this.orderConfigurationContextFactory = orderConfigurationContextFactory;
        this.eventLogger = eventLogger;
        this.regionGateProvider = regionGateProvider;
        this.accountAccessStore = accountAccessStore;
        this.taxLotEligibilityStore = taxLotEligibilityStore;
        this.taxLotsCachedService = taxLotsCachedService;
        this.userStore = userStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C294241(null));
        if (((OrderConfigurationContextFactory.OrderConfigurationContext) INSTANCE.getArgs((HasSavedState) this)).getSide() == EquityOrderSide.SELL) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C294252(null), 3, null);
        }
    }

    /* compiled from: OrderConfigurationSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo$onCreate$1", m3645f = "OrderConfigurationSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo$onCreate$1 */
    static final class C294241 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C294241(Continuation<? super C294241> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C294241 c294241 = OrderConfigurationSelectionDuxo.this.new C294241(continuation);
            c294241.L$0 = obj;
            return c294241;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C294241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: OrderConfigurationSelectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo$onCreate$1$1", m3645f = "OrderConfigurationSelectionDuxo.kt", m3646l = {79}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ OrderConfigurationSelectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OrderConfigurationSelectionDuxo orderConfigurationSelectionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = orderConfigurationSelectionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OrderConfigurationSelectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/db/sheriff/User;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo$onCreate$1$1$1", m3645f = "OrderConfigurationSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C505741 extends ContinuationImpl7 implements Function2<User, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OrderConfigurationSelectionDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C505741(OrderConfigurationSelectionDuxo orderConfigurationSelectionDuxo, Continuation<? super C505741> continuation) {
                    super(2, continuation);
                    this.this$0 = orderConfigurationSelectionDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C505741 c505741 = new C505741(this.this$0, continuation);
                    c505741.L$0 = obj;
                    return c505741;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(User user, Continuation<? super Unit> continuation) {
                    return ((C505741) create(user, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OrderConfigurationSelectionDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo$onCreate$1$1$1$1", m3645f = "OrderConfigurationSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo$onCreate$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C505751 extends ContinuationImpl7 implements Function2<OrderConfigurationSelectionDataState, Continuation<? super OrderConfigurationSelectionDataState>, Object> {
                    final /* synthetic */ User $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C505751(User user, Continuation<? super C505751> continuation) {
                        super(2, continuation);
                        this.$it = user;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C505751 c505751 = new C505751(this.$it, continuation);
                        c505751.L$0 = obj;
                        return c505751;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OrderConfigurationSelectionDataState orderConfigurationSelectionDataState, Continuation<? super OrderConfigurationSelectionDataState> continuation) {
                        return ((C505751) create(orderConfigurationSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return OrderConfigurationSelectionDataState.copy$default((OrderConfigurationSelectionDataState) this.L$0, null, null, null, false, null, false, null, false, null, null, null, null, null, false, false, false, false, null, this.$it.getIsUk(), false, 786431, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C505751((User) this.L$0, null));
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
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.userStore.getUser()), Integer.MAX_VALUE, null, 2, null);
                    C505741 c505741 = new C505741(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowBuffer$default, c505741, this) == coroutine_suspended) {
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

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(OrderConfigurationSelectionDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(OrderConfigurationSelectionDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: OrderConfigurationSelectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo$onCreate$1$2", m3645f = "OrderConfigurationSelectionDuxo.kt", m3646l = {86}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ OrderConfigurationSelectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OrderConfigurationSelectionDuxo orderConfigurationSelectionDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = orderConfigurationSelectionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OrderConfigurationSelectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo$onCreate$1$2$1", m3645f = "OrderConfigurationSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ OrderConfigurationSelectionDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OrderConfigurationSelectionDuxo orderConfigurationSelectionDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = orderConfigurationSelectionDuxo;
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

                /* compiled from: OrderConfigurationSelectionDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo$onCreate$1$2$1$1", m3645f = "OrderConfigurationSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo$onCreate$1$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C505761 extends ContinuationImpl7 implements Function2<OrderConfigurationSelectionDataState, Continuation<? super OrderConfigurationSelectionDataState>, Object> {
                    final /* synthetic */ boolean $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C505761(boolean z, Continuation<? super C505761> continuation) {
                        super(2, continuation);
                        this.$it = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C505761 c505761 = new C505761(this.$it, continuation);
                        c505761.L$0 = obj;
                        return c505761;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OrderConfigurationSelectionDataState orderConfigurationSelectionDataState, Continuation<? super OrderConfigurationSelectionDataState> continuation) {
                        return ((C505761) create(orderConfigurationSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return OrderConfigurationSelectionDataState.copy$default((OrderConfigurationSelectionDataState) this.L$0, null, null, null, false, null, false, null, false, null, null, null, null, null, false, false, false, false, null, false, this.$it, 524287, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C505761(this.Z$0, null));
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Boolean> featureAccess = this.this$0.accountAccessStore.getFeatureAccess(((OrderConfigurationContextFactory.OrderConfigurationContext) OrderConfigurationSelectionDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getAccountNumber(), AccountFeature.FX_AT_TRADE);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(featureAccess, anonymousClass1, this) == coroutine_suspended) {
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

    /* compiled from: OrderConfigurationSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo$onCreate$2", m3645f = "OrderConfigurationSelectionDuxo.kt", m3646l = {94, 98}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo$onCreate$2 */
    static final class C294252 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C294252(Continuation<? super C294252> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OrderConfigurationSelectionDuxo.this.new C294252(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C294252) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: OrderConfigurationSelectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo$onCreate$2$1", m3645f = "OrderConfigurationSelectionDuxo.kt", m3646l = {92}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OrderConfigurationSelectionDataState, Continuation<? super OrderConfigurationSelectionDataState>, Object> {
            int I$0;
            int I$1;
            int I$2;
            int I$3;
            int I$4;
            int I$5;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OrderConfigurationSelectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OrderConfigurationSelectionDuxo orderConfigurationSelectionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = orderConfigurationSelectionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OrderConfigurationSelectionDataState orderConfigurationSelectionDataState, Continuation<? super OrderConfigurationSelectionDataState> continuation) {
                return ((AnonymousClass1) create(orderConfigurationSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object objIsAccountEligible;
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                OrderConfigurationSelectionDataState orderConfigurationSelectionDataState;
                int i6;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    OrderConfigurationSelectionDataState orderConfigurationSelectionDataState2 = (OrderConfigurationSelectionDataState) this.L$0;
                    TaxLotEligibilityStore taxLotEligibilityStore = this.this$0.taxLotEligibilityStore;
                    String accountNumber = ((OrderConfigurationContextFactory.OrderConfigurationContext) OrderConfigurationSelectionDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getAccountNumber();
                    this.L$0 = orderConfigurationSelectionDataState2;
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.I$2 = 0;
                    this.I$3 = 0;
                    this.I$4 = 0;
                    this.I$5 = 0;
                    this.label = 1;
                    objIsAccountEligible = taxLotEligibilityStore.isAccountEligible(accountNumber, this);
                    if (objIsAccountEligible == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i = 0;
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                    orderConfigurationSelectionDataState = orderConfigurationSelectionDataState2;
                    i6 = 0;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.I$5;
                    int i8 = this.I$4;
                    int i9 = this.I$3;
                    int i10 = this.I$2;
                    int i11 = this.I$1;
                    int i12 = this.I$0;
                    OrderConfigurationSelectionDataState orderConfigurationSelectionDataState3 = (OrderConfigurationSelectionDataState) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    orderConfigurationSelectionDataState = orderConfigurationSelectionDataState3;
                    i6 = i12;
                    i5 = i11;
                    i4 = i10;
                    i3 = i9;
                    i2 = i8;
                    objIsAccountEligible = obj;
                }
                return OrderConfigurationSelectionDataState.copy$default(orderConfigurationSelectionDataState, null, null, null, i6 != 0, null, i5 != 0, null, i4 != 0, null, null, null, null, null, i3 != 0, i2 != 0, i != 0, ((Boolean) objIsAccountEligible).booleanValue(), null, false, false, 983039, null);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.collectLatest((kotlinx.coroutines.flow.Flow) r8, r1, r7) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OrderConfigurationSelectionDuxo orderConfigurationSelectionDuxo = OrderConfigurationSelectionDuxo.this;
                orderConfigurationSelectionDuxo.applyMutation(new AnonymousClass1(orderConfigurationSelectionDuxo, null));
                TaxLotEligibilityStore taxLotEligibilityStore = OrderConfigurationSelectionDuxo.this.taxLotEligibilityStore;
                Companion companion = OrderConfigurationSelectionDuxo.INSTANCE;
                UUID instrumentId = ((OrderConfigurationContextFactory.OrderConfigurationContext) companion.getArgs((HasSavedState) OrderConfigurationSelectionDuxo.this)).getInstrumentId();
                String accountNumber = ((OrderConfigurationContextFactory.OrderConfigurationContext) companion.getArgs((HasSavedState) OrderConfigurationSelectionDuxo.this)).getAccountNumber();
                this.label = 1;
                obj = taxLotEligibilityStore.getTaxLotPositionEligibility(instrumentId, accountNumber, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(OrderConfigurationSelectionDuxo.this, null);
            this.label = 2;
        }

        /* compiled from: OrderConfigurationSelectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/TaxLotEligibility;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo$onCreate$2$2", m3645f = "OrderConfigurationSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo$onCreate$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Optional<? extends TaxLotEligibility>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OrderConfigurationSelectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OrderConfigurationSelectionDuxo orderConfigurationSelectionDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = orderConfigurationSelectionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Optional<TaxLotEligibility> optional, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Optional<? extends TaxLotEligibility> optional, Continuation<? super Unit> continuation) {
                return invoke2((Optional<TaxLotEligibility>) optional, continuation);
            }

            /* compiled from: OrderConfigurationSelectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo$onCreate$2$2$1", m3645f = "OrderConfigurationSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo$onCreate$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OrderConfigurationSelectionDataState, Continuation<? super OrderConfigurationSelectionDataState>, Object> {
                final /* synthetic */ Optional<TaxLotEligibility> $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Optional<TaxLotEligibility> optional, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = optional;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OrderConfigurationSelectionDataState orderConfigurationSelectionDataState, Continuation<? super OrderConfigurationSelectionDataState> continuation) {
                    return ((AnonymousClass1) create(orderConfigurationSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OrderConfigurationSelectionDataState.copy$default((OrderConfigurationSelectionDataState) this.L$0, null, null, null, false, null, false, null, false, null, null, null, null, null, false, false, false, false, this.$it, false, false, 917503, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((Optional) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        AccountProvider.DefaultImpls.refresh$default(this.accountStore, false, 1, null);
        AccountProvider accountProvider = this.accountStore;
        Companion companion = INSTANCE;
        Observable<Account> observableRefCount = accountProvider.streamAccount(((OrderConfigurationContextFactory.OrderConfigurationContext) companion.getArgs((HasSavedState) this)).getAccountNumber()).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableRefCount, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfigurationSelectionDuxo.onResume$lambda$0(this.f$0, (Account) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.equityOrderTypeSelectorStore.orderTypeSelector(((OrderConfigurationContextFactory.OrderConfigurationContext) companion.getArgs((HasSavedState) this)).getSide()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfigurationSelectionDuxo.onResume$lambda$1(this.f$0, (OrderTypeSelector) obj);
            }
        });
        this.instrumentStore.refresh(false, ((OrderConfigurationContextFactory.OrderConfigurationContext) companion.getArgs((HasSavedState) this)).getInstrumentId());
        LifecycleHost.DefaultImpls.bind$default(this, this.instrumentStore.getInstrument(((OrderConfigurationContextFactory.OrderConfigurationContext) companion.getArgs((HasSavedState) this)).getInstrumentId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfigurationSelectionDuxo.onResume$lambda$2(this.f$0, (Instrument) obj);
            }
        });
        Observable observableDoOnSubscribe = asObservable(this.instrumentRecurringTradabilityStore.streamRecurringInstrumentTradable(((OrderConfigurationContextFactory.OrderConfigurationContext) companion.getArgs((HasSavedState) this)).getInstrumentId())).doOnSubscribe(new Consumer() { // from class: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo$onResume$recurringTradabilityObs$1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                TraderRecurringTradabilityStore.refresh$default(this.this$0.instrumentRecurringTradabilityStore, ((OrderConfigurationContextFactory.OrderConfigurationContext) OrderConfigurationSelectionDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getInstrumentId(), false, 2, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnSubscribe, "doOnSubscribe(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider;
        RecurringInvestmentRegionGate recurringInvestmentRegionGate = RecurringInvestmentRegionGate.INSTANCE;
        Observable observableConnectWhen$default = ObservablesKt.connectWhen$default(observableDoOnSubscribe, RegionGateProvider.DefaultImpls.streamRegionGateState$default(regionGateProvider, recurringInvestmentRegionGate, false, 2, null), null, 2, null);
        Observables observables = Observables.INSTANCE;
        ObservableSource observableSourceSwitchMap = observableRefCount.switchMap(new Function() { // from class: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo.onResume.4
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Boolean> apply(Account account) {
                Intrinsics.checkNotNullParameter(account, "account");
                OrderConfigurationSelectionDuxo orderConfigurationSelectionDuxo = OrderConfigurationSelectionDuxo.this;
                return orderConfigurationSelectionDuxo.asObservable(orderConfigurationSelectionDuxo.accountAccessStore.getFeatureAccess(account, AccountFeature.RECURRING));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSourceSwitchMap, "switchMap(...)");
        ObservableSource map = observableRefCount.map(new Function() { // from class: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo.onResume.5
            @Override // io.reactivex.functions.Function
            public final Boolean apply(Account it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.getBrokerageAccountType() == BrokerageAccountType.JOINT_TENANCY_WITH_ROS);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observables.combineLatest(observableSourceSwitchMap, observableConnectWhen$default, map), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfigurationSelectionDuxo.onResume$lambda$3(this.f$0, (Tuples3) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.orderConfigurationContextFactory.create(((OrderConfigurationContextFactory.OrderConfigurationContext) companion.getArgs((HasSavedState) this)).getInstrumentId(), ((OrderConfigurationContextFactory.OrderConfigurationContext) companion.getArgs((HasSavedState) this)).getSide(), ((OrderConfigurationContextFactory.OrderConfigurationContext) companion.getArgs((HasSavedState) this)).getAccountNumber(), ((OrderConfigurationContextFactory.OrderConfigurationContext) companion.getArgs((HasSavedState) this)).getRefId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfigurationSelectionDuxo.onResume$lambda$4(this.f$0, (OrderConfigurationContextFactory.OrderConfigurationContext) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfigurationSelectionDuxo.onResume$lambda$5((Throwable) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, asObservable(this.marketHoursManager.getCurrentTradingSession()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfigurationSelectionDuxo.onResume$lambda$6(this.f$0, (TradingSession) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.marketHoursManager.streamIsAdtHours(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfigurationSelectionDuxo.onResume$lambda$7(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, OptionsRegionGate.INSTANCE, false, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfigurationSelectionDuxo.onResume$lambda$8(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, recurringInvestmentRegionGate, false, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfigurationSelectionDuxo.onResume$lambda$9(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, ShareBasedMarketBuysRegionGate.INSTANCE, false, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfigurationSelectionDuxo.onResume$lambda$10(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$0(OrderConfigurationSelectionDuxo orderConfigurationSelectionDuxo, Account account) {
        orderConfigurationSelectionDuxo.applyMutation(new OrderConfigurationSelectionDuxo$onResume$1$1(account, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(OrderConfigurationSelectionDuxo orderConfigurationSelectionDuxo, OrderTypeSelector orderTypeSelectorResponse) {
        Intrinsics.checkNotNullParameter(orderTypeSelectorResponse, "orderTypeSelectorResponse");
        orderConfigurationSelectionDuxo.applyMutation(new OrderConfigurationSelectionDuxo$onResume$2$1(orderTypeSelectorResponse, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$2(OrderConfigurationSelectionDuxo orderConfigurationSelectionDuxo, Instrument instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        orderConfigurationSelectionDuxo.applyMutation(new OrderConfigurationSelectionDuxo$onResume$3$1(instrument, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$3(OrderConfigurationSelectionDuxo orderConfigurationSelectionDuxo, Tuples3 tuples3) {
        Intrinsics.checkNotNullParameter(tuples3, "<destruct>");
        orderConfigurationSelectionDuxo.applyMutation(new OrderConfigurationSelectionDuxo$onResume$6$1((Boolean) tuples3.component1(), (InstrumentRecurringTradability) tuples3.component2(), (Boolean) tuples3.component3(), null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$4(OrderConfigurationSelectionDuxo orderConfigurationSelectionDuxo, OrderConfigurationContextFactory.OrderConfigurationContext refreshedParams) {
        Intrinsics.checkNotNullParameter(refreshedParams, "refreshedParams");
        orderConfigurationSelectionDuxo.applyMutation(new OrderConfigurationSelectionDuxo$onResume$7$1(refreshedParams, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$5(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$6(OrderConfigurationSelectionDuxo orderConfigurationSelectionDuxo, TradingSession tradingSession) {
        Intrinsics.checkNotNullParameter(tradingSession, "tradingSession");
        orderConfigurationSelectionDuxo.applyMutation(new OrderConfigurationSelectionDuxo$onResume$9$1(tradingSession, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$7(OrderConfigurationSelectionDuxo orderConfigurationSelectionDuxo, boolean z) {
        orderConfigurationSelectionDuxo.applyMutation(new OrderConfigurationSelectionDuxo$onResume$10$1(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$8(OrderConfigurationSelectionDuxo orderConfigurationSelectionDuxo, boolean z) {
        orderConfigurationSelectionDuxo.applyMutation(new OrderConfigurationSelectionDuxo$onResume$11$1(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$9(OrderConfigurationSelectionDuxo orderConfigurationSelectionDuxo, boolean z) {
        orderConfigurationSelectionDuxo.applyMutation(new OrderConfigurationSelectionDuxo$onResume$12$1(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$10(OrderConfigurationSelectionDuxo orderConfigurationSelectionDuxo, boolean z) {
        orderConfigurationSelectionDuxo.applyMutation(new OrderConfigurationSelectionDuxo$onResume$13$1(z, null));
        return Unit.INSTANCE;
    }

    /* compiled from: OrderConfigurationSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo$setDayNightOverlay$1", m3645f = "OrderConfigurationSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo$setDayNightOverlay$1 */
    static final class C294291 extends ContinuationImpl7 implements Function2<OrderConfigurationSelectionDataState, Continuation<? super OrderConfigurationSelectionDataState>, Object> {
        final /* synthetic */ DayNightOverlay $dayNightOverlay;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C294291(DayNightOverlay dayNightOverlay, Continuation<? super C294291> continuation) {
            super(2, continuation);
            this.$dayNightOverlay = dayNightOverlay;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C294291 c294291 = new C294291(this.$dayNightOverlay, continuation);
            c294291.L$0 = obj;
            return c294291;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OrderConfigurationSelectionDataState orderConfigurationSelectionDataState, Continuation<? super OrderConfigurationSelectionDataState> continuation) {
            return ((C294291) create(orderConfigurationSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OrderConfigurationSelectionDataState.copy$default((OrderConfigurationSelectionDataState) this.L$0, null, null, null, false, null, false, null, false, this.$dayNightOverlay, null, null, null, null, false, false, false, false, null, false, false, 1048319, null);
        }
    }

    public final void setDayNightOverlay(DayNightOverlay dayNightOverlay) {
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        applyMutation(new C294291(dayNightOverlay, null));
    }

    public final void logRecurringOrderTypeSelected(boolean disabled) {
        OrderKind orderKind = new OrderKind(OrderKindType.RECURRING.getValue(), disabled, null, 4, null);
        EventLogger eventLogger = this.eventLogger;
        Screen screen = new Screen(Screen.Name.EQUITY_SELECT_ORDER_KIND_PAGE, null, null, null, 14, null);
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.SELECT, screen, new Component(Component.ComponentType.ROW, null, null, 6, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, orderKind, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16777217, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
    }

    /* compiled from: OrderConfigurationSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo$setOrderRowSelected$1", m3645f = "OrderConfigurationSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo$setOrderRowSelected$1 */
    static final class C294301 extends ContinuationImpl7 implements Function2<OrderConfigurationSelectionDataState, Continuation<? super OrderConfigurationSelectionDataState>, Object> {
        final /* synthetic */ OrderConfigurationRow $row;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C294301(OrderConfigurationRow orderConfigurationRow, Continuation<? super C294301> continuation) {
            super(2, continuation);
            this.$row = orderConfigurationRow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C294301 c294301 = new C294301(this.$row, continuation);
            c294301.L$0 = obj;
            return c294301;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OrderConfigurationSelectionDataState orderConfigurationSelectionDataState, Continuation<? super OrderConfigurationSelectionDataState> continuation) {
            return ((C294301) create(orderConfigurationSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OrderConfigurationSelectionDataState.copy$default((OrderConfigurationSelectionDataState) this.L$0, null, null, null, false, null, false, null, false, null, null, this.$row, null, null, false, false, false, false, null, false, false, 1047551, null);
        }
    }

    public final void setOrderRowSelected(OrderConfigurationRow row) {
        Intrinsics.checkNotNullParameter(row, "row");
        applyMutation(new C294301(row, null));
        OrderConfigurationRow.EquityDirectOrder equityDirectOrder = row instanceof OrderConfigurationRow.EquityDirectOrder ? (OrderConfigurationRow.EquityDirectOrder) row : null;
        if (equityDirectOrder == null || !equityDirectOrder.isTaxLots()) {
            clearTaxLots();
        }
    }

    /* compiled from: OrderConfigurationSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo$clearTaxLots$1", m3645f = "OrderConfigurationSelectionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo$clearTaxLots$1 */
    static final class C294231 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C294231(Continuation<? super C294231> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OrderConfigurationSelectionDuxo.this.new C294231(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C294231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TaxLotsCachedService taxLotsCachedService = OrderConfigurationSelectionDuxo.this.taxLotsCachedService;
                Companion companion = OrderConfigurationSelectionDuxo.INSTANCE;
                String accountNumber = ((OrderConfigurationContextFactory.OrderConfigurationContext) companion.getArgs((HasSavedState) OrderConfigurationSelectionDuxo.this)).getAccountNumber();
                UUID refId = ((OrderConfigurationContextFactory.OrderConfigurationContext) companion.getArgs((HasSavedState) OrderConfigurationSelectionDuxo.this)).getRefId();
                UUID instrumentId = ((OrderConfigurationContextFactory.OrderConfigurationContext) companion.getArgs((HasSavedState) OrderConfigurationSelectionDuxo.this)).getInstrumentId();
                this.label = 1;
                if (taxLotsCachedService.clearSelectedTaxLots(accountNumber, refId, instrumentId, this) == coroutine_suspended) {
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

    private final void clearTaxLots() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C294231(null), 3, null);
    }

    public final void logDisclosureTap() {
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, null, new Screen(Screen.Name.EQUITY_SELECT_ORDER_KIND_PAGE, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, OptionOrderLoggings.STOP_MARKET_DISCLOSURE_COMPONENT_IDENTIFIER, null, 4, null), null, null, false, 57, null);
    }

    /* compiled from: OrderConfigurationSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationSelectionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationSelectionDuxo;", "Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationContextFactory$OrderConfigurationContext;", "<init>", "()V", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<OrderConfigurationSelectionDuxo, OrderConfigurationContextFactory.OrderConfigurationContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OrderConfigurationContextFactory.OrderConfigurationContext getArgs(SavedStateHandle savedStateHandle) {
            return (OrderConfigurationContextFactory.OrderConfigurationContext) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OrderConfigurationContextFactory.OrderConfigurationContext getArgs(OrderConfigurationSelectionDuxo orderConfigurationSelectionDuxo) {
            return (OrderConfigurationContextFactory.OrderConfigurationContext) DuxoCompanion.DefaultImpls.getArgs(this, orderConfigurationSelectionDuxo);
        }
    }
}
