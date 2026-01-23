package com.robinhood.android.common.buysell;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.margin.MarginEligibilityStore;
import com.robinhood.android.lib.store.margin.MarginSettingsStore;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.trading.contracts.EquitiesSubzero;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.AccountAccessStore;
import com.robinhood.librobinhood.data.store.AccountFeature;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Portfolio;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.TradingSession;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.base.PortfolioStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Observable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.internal.Combine;
import kotlinx.coroutines.rx2.RxAwait3;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Clock;

/* compiled from: BuySellStore.kt */
@Metadata(m3635d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001Bi\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\"\u0010#J%\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0$2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b'\u0010(J\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020)0$2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b*\u0010+J5\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020-\u0018\u00010%0$2\u0006\u0010\u001f\u001a\u00020\u001e2\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0$H\u0002¢\u0006\u0004\b.\u0010/J#\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000%0$2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b1\u0010+J\u0018\u00103\u001a\u0002022\u0006\u0010\u001d\u001a\u00020\u001cH\u0082@¢\u0006\u0004\b3\u00104J\u001f\u00105\u001a\b\u0012\u0004\u0012\u0002020$2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b5\u0010(J\u0017\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001020$H\u0002¢\u0006\u0004\b6\u00107J'\u0010:\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u000209\u0018\u0001080$2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b:\u0010(J'\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0$2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010=R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010>R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010?R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010@R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010AR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010BR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010CR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010DR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010ER\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010FR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010GR6\u0010J\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001c0I\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010!0 0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006L"}, m3636d2 = {"Lcom/robinhood/android/common/buysell/BuySellStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "quoteStore", "Lcom/robinhood/android/lib/store/margin/MarginSettingsStore;", "marginSettingsStore", "Lcom/robinhood/store/base/PortfolioStore;", "portfolioStore", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "marketHoursManager", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "accountAccessStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/experiments/ExperimentsProvider;", "experimentsProvider", "Lcom/robinhood/android/lib/margin/MarginEligibilityStore;", "marginEligibilityStore", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/PositionStore;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/android/lib/store/margin/MarginSettingsStore;Lcom/robinhood/store/base/PortfolioStore;Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;Lcom/robinhood/librobinhood/data/store/AccountAccessStore;Lj$/time/Clock;Lcom/robinhood/experiments/ExperimentsProvider;Lcom/robinhood/android/lib/margin/MarginEligibilityStore;Lcom/robinhood/store/StoreBundle;)V", "", "accountNumber", "Ljava/util/UUID;", "instrumentId", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/robinhood/android/common/buysell/BuySellData;", "createBuySellDataFlow", "(Ljava/lang/String;Ljava/util/UUID;)Lkotlinx/coroutines/flow/SharedFlow;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/Account;", "streamAccount", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/db/Instrument;", "streamInstrument", "(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", "accountNumberFlow", "Lcom/robinhood/models/db/Position;", "streamPosition", "(Ljava/util/UUID;Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/db/Quote;", "streamQuote", "", "fetchIsUnderMarginCall", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamMarginCallForAccount", "streamSubzeroExperiment", "()Lkotlinx/coroutines/flow/Flow;", "", "Lcom/robinhood/librobinhood/data/store/AccountFeature;", "streamAccountFeatures", "getBuySellData", "(Ljava/util/UUID;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/lib/account/AccountProvider;", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "Lcom/robinhood/android/lib/store/margin/MarginSettingsStore;", "Lcom/robinhood/store/base/PortfolioStore;", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "Lj$/time/Clock;", "Lcom/robinhood/experiments/ExperimentsProvider;", "Lcom/robinhood/android/lib/margin/MarginEligibilityStore;", "", "Lkotlin/Pair;", "buySellDataCache", "Ljava/util/Map;", "lib-buy-sell-helper_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class BuySellStore extends Store {
    private final AccountAccessStore accountAccessStore;
    private final AccountProvider accountProvider;
    private final Map<Tuples2<UUID, String>, SharedFlow<BuySellData>> buySellDataCache;
    private final Clock clock;
    private final ExperimentsProvider experimentsProvider;
    private final InstrumentStore instrumentStore;
    private final MarginEligibilityStore marginEligibilityStore;
    private final MarginSettingsStore marginSettingsStore;
    private final TraderMarketHoursManager marketHoursManager;
    private final PortfolioStore portfolioStore;
    private final PositionStore positionStore;
    private final QuoteStore quoteStore;

    /* compiled from: BuySellStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.buysell.BuySellStore", m3645f = "BuySellStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_INCOME_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE}, m3647m = "fetchIsUnderMarginCall")
    /* renamed from: com.robinhood.android.common.buysell.BuySellStore$fetchIsUnderMarginCall$1 */
    static final class C110631 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C110631(Continuation<? super C110631> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BuySellStore.this.fetchIsUnderMarginCall(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuySellStore(AccountProvider accountProvider, InstrumentStore instrumentStore, PositionStore positionStore, QuoteStore quoteStore, MarginSettingsStore marginSettingsStore, PortfolioStore portfolioStore, TraderMarketHoursManager marketHoursManager, AccountAccessStore accountAccessStore, Clock clock, ExperimentsProvider experimentsProvider, MarginEligibilityStore marginEligibilityStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(marginSettingsStore, "marginSettingsStore");
        Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        Intrinsics.checkNotNullParameter(marginEligibilityStore, "marginEligibilityStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.accountProvider = accountProvider;
        this.instrumentStore = instrumentStore;
        this.positionStore = positionStore;
        this.quoteStore = quoteStore;
        this.marginSettingsStore = marginSettingsStore;
        this.portfolioStore = portfolioStore;
        this.marketHoursManager = marketHoursManager;
        this.accountAccessStore = accountAccessStore;
        this.clock = clock;
        this.experimentsProvider = experimentsProvider;
        this.marginEligibilityStore = marginEligibilityStore;
        this.buySellDataCache = new LinkedHashMap();
    }

    public final Flow<BuySellData> getBuySellData(UUID instrumentId, String accountNumber) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Map<Tuples2<UUID, String>, SharedFlow<BuySellData>> map = this.buySellDataCache;
        Tuples2<UUID, String> tuples2M3642to = Tuples4.m3642to(instrumentId, accountNumber);
        SharedFlow<BuySellData> sharedFlowCreateBuySellDataFlow = map.get(tuples2M3642to);
        if (sharedFlowCreateBuySellDataFlow == null) {
            sharedFlowCreateBuySellDataFlow = createBuySellDataFlow(accountNumber, instrumentId);
            map.put(tuples2M3642to, sharedFlowCreateBuySellDataFlow);
        }
        return sharedFlowCreateBuySellDataFlow;
    }

    private final SharedFlow<BuySellData> createBuySellDataFlow(String accountNumber, UUID instrumentId) {
        Flow<String> flowDistinctUntilChanged;
        final Flow<Optional<Account>> flowStreamAccount = streamAccount(accountNumber);
        if (accountNumber != null) {
            flowDistinctUntilChanged = FlowKt.flowOf(accountNumber);
        } else {
            flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<String>() { // from class: com.robinhood.android.common.buysell.BuySellStore$createBuySellDataFlow$$inlined$map$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.common.buysell.BuySellStore$createBuySellDataFlow$$inlined$map$1$2 */
                public static final class C110602<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.common.buysell.BuySellStore$createBuySellDataFlow$$inlined$map$1$2", m3645f = "BuySellStore.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.common.buysell.BuySellStore$createBuySellDataFlow$$inlined$map$1$2$1, reason: invalid class name */
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
                            return C110602.this.emit(null, this);
                        }
                    }

                    public C110602(FlowCollector flowCollector) {
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
                            Account account = (Account) ((Optional) obj).getOrNull();
                            String accountNumber = account != null ? account.getAccountNumber() : null;
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(accountNumber, anonymousClass1) == coroutine_suspended) {
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

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                    Object objCollect = flowStreamAccount.collect(new C110602(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            });
        }
        final Flow[] flowArr = {flowStreamAccount, streamInstrument(instrumentId), streamPosition(instrumentId, flowDistinctUntilChanged), streamQuote(instrumentId), streamMarginCallForAccount(accountNumber), this.marketHoursManager.getCurrentTradingSession(), streamAccountFeatures(accountNumber), streamSubzeroExperiment(), FlowKt.transformLatest(flowStreamAccount, new BuySellStore$createBuySellDataFlow$$inlined$flatMapLatest$1(null, this))};
        return FlowKt.shareIn(FlowKt.distinctUntilChanged(new Flow<BuySellData>() { // from class: com.robinhood.android.common.buysell.BuySellStore$createBuySellDataFlow$$inlined$combine$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super BuySellData> flowCollector, Continuation continuation) {
                final Flow[] flowArr2 = flowArr;
                Object objCombineInternal = Combine.combineInternal(flowCollector, flowArr2, new Function0<Object[]>() { // from class: com.robinhood.android.common.buysell.BuySellStore$createBuySellDataFlow$$inlined$combine$1.2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object[] invoke() {
                        return new Object[flowArr2.length];
                    }
                }, new C110593(null, this), continuation);
                return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
            }

            /* compiled from: Zip.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
            @DebugMetadata(m3644c = "com.robinhood.android.common.buysell.BuySellStore$createBuySellDataFlow$$inlined$combine$1$3", m3645f = "BuySellStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.common.buysell.BuySellStore$createBuySellDataFlow$$inlined$combine$1$3 */
            public static final class C110593 extends ContinuationImpl7 implements Function3<FlowCollector<? super BuySellData>, Object[], Continuation<? super Unit>, Object> {
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;
                final /* synthetic */ BuySellStore this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C110593(Continuation continuation, BuySellStore buySellStore) {
                    super(3, continuation);
                    this.this$0 = buySellStore;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(FlowCollector<? super BuySellData> flowCollector, Object[] objArr, Continuation<? super Unit> continuation) {
                    C110593 c110593 = new C110593(continuation, this.this$0);
                    c110593.L$0 = flowCollector;
                    c110593.L$1 = objArr;
                    return c110593.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = (FlowCollector) this.L$0;
                        Object[] objArr = (Object[]) this.L$1;
                        Object obj2 = objArr[0];
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.robinhood.utils.Optional<com.robinhood.models.db.Account>");
                        Object obj3 = objArr[1];
                        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type com.robinhood.models.db.Instrument");
                        Instrument instrument = (Instrument) obj3;
                        Optional optional = (Optional) objArr[2];
                        Object obj4 = objArr[3];
                        Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type com.robinhood.utils.Optional<com.robinhood.models.db.Quote>");
                        Object obj5 = objArr[4];
                        Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                        Object obj6 = objArr[5];
                        Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type com.robinhood.models.db.TradingSession");
                        TradingSession tradingSession = (TradingSession) obj6;
                        Set set = (Set) objArr[6];
                        BuySellData buySellData = new BuySellData((Account) ((Optional) obj2).getOrNull(), instrument, optional, (Quote) ((Optional) obj4).getOrNull(), zBooleanValue, tradingSession, this.this$0.clock, (Boolean) objArr[7], set != null && set.contains(AccountFeature.OPTIONS_CAN_UPGRADE), set != null && set.contains(AccountFeature.OPTIONS_HAS_ACCESS), (Boolean) objArr[8]);
                        this.label = 1;
                        if (flowCollector.emit(buySellData, this) == coroutine_suspended) {
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
        }), getStoreScope(), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 100L, 0L, 2, null), 1);
    }

    private final Flow<Optional<Account>> streamAccount(String accountNumber) {
        return FlowKt.distinctUntilChanged(accountNumber != null ? Context7.buffer$default(RxConvert.asFlow(this.accountProvider.streamAccountOptional(accountNumber)), Integer.MAX_VALUE, null, 2, null) : Context7.buffer$default(RxConvert.asFlow(this.accountProvider.streamIndividualAccountOptional()), Integer.MAX_VALUE, null, 2, null));
    }

    private final Flow<Instrument> streamInstrument(UUID instrumentId) {
        return Context7.buffer$default(RxConvert.asFlow(this.instrumentStore.getInstrument(instrumentId)), Integer.MAX_VALUE, null, 2, null);
    }

    /* compiled from: BuySellStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/Position;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.buysell.BuySellStore$streamPosition$1", m3645f = "BuySellStore.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, 188, 188, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.common.buysell.BuySellStore$streamPosition$1 */
    static final class C110661 extends ContinuationImpl7 implements Function2<FlowCollector<? super Optional<? extends Position>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<String> $accountNumberFlow;
        final /* synthetic */ UUID $instrumentId;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ BuySellStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C110661(Flow<String> flow, BuySellStore buySellStore, UUID uuid, Continuation<? super C110661> continuation) {
            super(2, continuation);
            this.$accountNumberFlow = flow;
            this.this$0 = buySellStore;
            this.$instrumentId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C110661 c110661 = new C110661(this.$accountNumberFlow, this.this$0, this.$instrumentId, continuation);
            c110661.L$0 = obj;
            return c110661;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Optional<? extends Position>> flowCollector, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super Optional<Position>>) flowCollector, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super Optional<Position>> flowCollector, Continuation<? super Unit> continuation) {
            return ((C110661) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x00a7, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.emitAll(r3, r1, r9) != r0) goto L29;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            Flow flow;
            FlowCollector flowCollector2;
            Flow flow2;
            FlowCollector flowCollector3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector4 = (FlowCollector) this.L$0;
                this.L$0 = flowCollector4;
                this.label = 1;
                if (flowCollector4.emit(null, this) != coroutine_suspended) {
                    flowCollector = flowCollector4;
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                flowCollector = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i == 2) {
                    flowCollector = (FlowCollector) this.L$2;
                    flow = (Flow) this.L$1;
                    flowCollector2 = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    this.L$0 = flowCollector2;
                    this.L$1 = flow;
                    this.L$2 = null;
                    this.label = 3;
                    if (flowCollector.emit(obj, this) != coroutine_suspended) {
                        flow2 = flow;
                        flowCollector3 = flowCollector2;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 4;
                    }
                    return coroutine_suspended;
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                flow2 = (Flow) this.L$1;
                flowCollector3 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 4;
            }
            Flow flowTransformLatest = FlowKt.transformLatest(this.$accountNumberFlow, new C11061x2f9b22cd(null, this.this$0, this.$instrumentId));
            Duration.Companion companion = Duration.INSTANCE;
            Flow flowM22187timeoutWithDefault8Mi8wO0 = Operators.m22187timeoutWithDefault8Mi8wO0(flowTransformLatest, Duration3.toDuration(100, DurationUnitJvm.MILLISECONDS), Optional2.INSTANCE);
            this.L$0 = flowCollector;
            this.L$1 = flowTransformLatest;
            this.L$2 = flowCollector;
            this.label = 2;
            Object objFirst = FlowKt.first(flowM22187timeoutWithDefault8Mi8wO0, this);
            if (objFirst != coroutine_suspended) {
                flow = flowTransformLatest;
                obj = objFirst;
                flowCollector2 = flowCollector;
                this.L$0 = flowCollector2;
                this.L$1 = flow;
                this.L$2 = null;
                this.label = 3;
                if (flowCollector.emit(obj, this) != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
    }

    private final Flow<Optional<Position>> streamPosition(UUID instrumentId, Flow<String> accountNumberFlow) {
        return FlowKt.flow(new C110661(accountNumberFlow, this, instrumentId, null));
    }

    private final Flow<Optional<Quote>> streamQuote(UUID instrumentId) {
        final Flow<Quote> flowStreamQuote = this.quoteStore.streamQuote(instrumentId);
        return FlowKt.onStart(FlowKt.m28818catch(new Flow<Optional<? extends Quote>>() { // from class: com.robinhood.android.common.buysell.BuySellStore$streamQuote$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Optional<? extends Quote>> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamQuote.collect(new C110622(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.common.buysell.BuySellStore$streamQuote$$inlined$map$1$2 */
            public static final class C110622<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.common.buysell.BuySellStore$streamQuote$$inlined$map$1$2", m3645f = "BuySellStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.common.buysell.BuySellStore$streamQuote$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C110622.this.emit(null, this);
                    }
                }

                public C110622(FlowCollector flowCollector) {
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
                        Optional optionalAsOptional = Optional3.asOptional((Quote) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(optionalAsOptional, anonymousClass1) == coroutine_suspended) {
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
        }, new C110672(null)), new C110683(null));
    }

    /* compiled from: BuySellStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/Quote;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.buysell.BuySellStore$streamQuote$2", m3645f = "BuySellStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.buysell.BuySellStore$streamQuote$2 */
    static final class C110672 extends ContinuationImpl7 implements Function3<FlowCollector<? super Optional<? extends Quote>>, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C110672(Continuation<? super C110672> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Optional<? extends Quote>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super Optional<Quote>>) flowCollector, th, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super Optional<Quote>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            C110672 c110672 = new C110672(continuation);
            c110672.L$0 = flowCollector;
            return c110672.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Optional2 optional2 = Optional2.INSTANCE;
                this.label = 1;
                if (flowCollector.emit(optional2, this) == coroutine_suspended) {
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

    /* compiled from: BuySellStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/Quote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.buysell.BuySellStore$streamQuote$3", m3645f = "BuySellStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.buysell.BuySellStore$streamQuote$3 */
    static final class C110683 extends ContinuationImpl7 implements Function2<FlowCollector<? super Optional<? extends Quote>>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C110683(Continuation<? super C110683> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C110683 c110683 = new C110683(continuation);
            c110683.L$0 = obj;
            return c110683;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Optional<? extends Quote>> flowCollector, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super Optional<Quote>>) flowCollector, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super Optional<Quote>> flowCollector, Continuation<? super Unit> continuation) {
            return ((C110683) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Optional2 optional2 = Optional2.INSTANCE;
                this.label = 1;
                if (flowCollector.emit(optional2, this) == coroutine_suspended) {
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
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        if (r12 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchIsUnderMarginCall(String str, Continuation<? super Boolean> continuation) {
        C110631 c110631;
        if (continuation instanceof C110631) {
            c110631 = (C110631) continuation;
            int i = c110631.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c110631.label = i - Integer.MIN_VALUE;
            } else {
                c110631 = new C110631(continuation);
            }
        }
        Object portfolioForcedOrNull = c110631.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c110631.label;
        boolean zBooleanValue = false;
        try {
        } catch (Throwable th) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 4, null);
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(portfolioForcedOrNull);
            PortfolioStore portfolioStore = this.portfolioStore;
            c110631.L$0 = str;
            c110631.label = 1;
            portfolioForcedOrNull = portfolioStore.getPortfolioForcedOrNull(str, c110631);
            if (portfolioForcedOrNull != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(portfolioForcedOrNull);
            Intrinsics.checkNotNull(portfolioForcedOrNull);
            zBooleanValue = ((Boolean) portfolioForcedOrNull).booleanValue();
            return boxing.boxBoolean(zBooleanValue);
        }
        str = (String) c110631.L$0;
        ResultKt.throwOnFailure(portfolioForcedOrNull);
        if (((Portfolio) portfolioForcedOrNull) == null) {
            return boxing.boxBoolean(false);
        }
        Observable<Boolean> observableIsUnderMarginCall = this.marginSettingsStore.isUnderMarginCall(str);
        c110631.L$0 = null;
        c110631.label = 2;
        portfolioForcedOrNull = RxAwait3.awaitFirst(observableIsUnderMarginCall, c110631);
    }

    /* compiled from: BuySellStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.buysell.BuySellStore$streamMarginCallForAccount$1", m3645f = "BuySellStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SUBMIT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.buysell.BuySellStore$streamMarginCallForAccount$1 */
    static final class C110651 extends ContinuationImpl7 implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BuySellStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C110651(String str, BuySellStore buySellStore, Continuation<? super C110651> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
            this.this$0 = buySellStore;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C110651 c110651 = new C110651(this.$accountNumber, this.this$0, continuation);
            c110651.L$0 = obj;
            return c110651;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
            return ((C110651) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
        
            if (r1.emit(r6, r5) != r0) goto L24;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                Boolean boolBoxBoolean = boxing.boxBoolean(false);
                this.L$0 = flowCollector2;
                this.label = 1;
                if (flowCollector2.emit(boolBoxBoolean, this) != coroutine_suspended) {
                    flowCollector = flowCollector2;
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                flowCollector = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                flowCollector = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.L$0 = null;
                this.label = 3;
            }
            String str = this.$accountNumber;
            if (str != null) {
                BuySellStore buySellStore = this.this$0;
                this.L$0 = flowCollector;
                this.label = 2;
                obj = buySellStore.fetchIsUnderMarginCall(str, this);
                if (obj != coroutine_suspended) {
                    this.L$0 = null;
                    this.label = 3;
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    private final Flow<Boolean> streamMarginCallForAccount(String accountNumber) {
        return FlowKt.flow(new C110651(accountNumber, this, null));
    }

    /* compiled from: BuySellStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.buysell.BuySellStore$streamSubzeroExperiment$1", m3645f = "BuySellStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.buysell.BuySellStore$streamSubzeroExperiment$1 */
    static final class C110691 extends ContinuationImpl7 implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C110691(Continuation<? super C110691> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C110691 c110691 = new C110691(continuation);
            c110691.L$0 = obj;
            return c110691;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
            return ((C110691) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                this.label = 1;
                if (flowCollector.emit(null, this) == coroutine_suspended) {
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

    private final Flow<Boolean> streamSubzeroExperiment() {
        return FlowKt.onStart(ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsProvider, new Experiment[]{EquitiesSubzero.INSTANCE}, false, null, 4, null), new C110691(null));
    }

    private final Flow<Set<AccountFeature>> streamAccountFeatures(String accountNumber) {
        return FlowKt.distinctUntilChanged(FlowKt.onStart(FlowKt.transformLatest(streamAccount(accountNumber), new BuySellStore$streamAccountFeatures$$inlined$flatMapLatest$1(null, this)), new C110642(null)));
    }

    /* compiled from: BuySellStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/robinhood/librobinhood/data/store/AccountFeature;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.buysell.BuySellStore$streamAccountFeatures$2", m3645f = "BuySellStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.buysell.BuySellStore$streamAccountFeatures$2 */
    static final class C110642 extends ContinuationImpl7 implements Function2<FlowCollector<? super Set<? extends AccountFeature>>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C110642(Continuation<? super C110642> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C110642 c110642 = new C110642(continuation);
            c110642.L$0 = obj;
            return c110642;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Set<? extends AccountFeature>> flowCollector, Continuation<? super Unit> continuation) {
            return ((C110642) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                this.label = 1;
                if (flowCollector.emit(null, this) == coroutine_suspended) {
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
