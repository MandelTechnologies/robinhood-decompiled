package com.robinhood.android.common.options.order;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.options.OptionDefaultPricingState;
import com.robinhood.android.common.options.order.OptionOrderContext;
import com.robinhood.android.common.options.order.OptionOrderContextFactory;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.markethours.data.store.MarketHoursStore;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.AggregateOptionPositionStore;
import com.robinhood.librobinhood.data.store.CollateralStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.OptionChainStore;
import com.robinhood.librobinhood.data.store.OptionInstrumentStore;
import com.robinhood.librobinhood.data.store.OptionOrderNomenclatureStore;
import com.robinhood.librobinhood.data.store.OptionOrderStrategyStore;
import com.robinhood.librobinhood.data.store.OptionPositionStore;
import com.robinhood.librobinhood.data.store.OptionQuoteStore;
import com.robinhood.librobinhood.data.store.OptionSettingsStore;
import com.robinhood.librobinhood.data.store.OptionsBuyingPowerStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.models.api.ApiCollateral;
import com.robinhood.models.api.ApiCryptoCancelAllPendingOrders;
import com.robinhood.models.api.ApiOptionOrderRequest;
import com.robinhood.models.api.ApiOptionOrderStrategies;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.KaizenExperiment;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionInstrumentPosition;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.OptionPositionType;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.OptionsBuyingPower;
import com.robinhood.models.p320db.OrderDirection;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p355ui.OptionChainBundle;
import com.robinhood.models.p355ui.OptionConfigurationBundle;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.OptionOrderBundle;
import com.robinhood.models.p355ui.OptionOrderToReplaceBundle;
import com.robinhood.models.p355ui.UiAggregateOptionPositionFull;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionInstrument;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.SinglesKt;
import com.robinhood.utils.math.BigDecimals7;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.SingleSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.functions.Function4;
import io.reactivex.functions.Function5;
import io.reactivex.functions.Function9;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.Observables;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Produce4;
import retrofit2.Response;
import rosetta.option.OptionOrderFormSource;

/* compiled from: OptionOrderContextFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u000212B\u0089\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!¢\u0006\u0004\b\"\u0010#J\"\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0%J\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020,0%2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/common/options/order/OptionOrderContextFactory;", "", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "aggregateOptionPositionStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "collateralStore", "Lcom/robinhood/librobinhood/data/store/CollateralStore;", "marketHoursStore", "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "optionOrderStrategyStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderStrategyStore;", "optionOrderNomenclatureStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderNomenclatureStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "equityInstrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "optionsBuyingPowerStore", "Lcom/robinhood/librobinhood/data/store/OptionsBuyingPowerStore;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;Lcom/robinhood/librobinhood/data/store/PositionStore;Lcom/robinhood/librobinhood/data/store/CollateralStore;Lcom/robinhood/android/markethours/data/store/MarketHoursStore;Lcom/robinhood/librobinhood/data/store/OptionChainStore;Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;Lcom/robinhood/librobinhood/data/store/OptionOrderStrategyStore;Lcom/robinhood/librobinhood/data/store/OptionOrderNomenclatureStore;Lcom/robinhood/librobinhood/data/store/OptionPositionStore;Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/OptionsBuyingPowerStore;Lcom/robinhood/coroutines/rx/RxFactory;)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lio/reactivex/Observable;", "Lcom/robinhood/android/common/options/order/OptionOrderContext;", "staticInputs", "Lcom/robinhood/android/common/options/order/OptionOrderContextFactory$StaticInputs;", "requestInputs", "Lcom/robinhood/android/common/options/order/OptionOrderContextFactory$RequestInputs;", "createForLeg", "Lcom/robinhood/android/common/options/order/OptionOrderContext$LegContext;", "accountNumber", "", "optionLegBundle", "Lcom/robinhood/models/ui/OptionLegBundle;", "RequestInputs", "StaticInputs", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class OptionOrderContextFactory {
    public static final int $stable = 8;
    private final AccountProvider accountProvider;
    private final AggregateOptionPositionStore aggregateOptionPositionStore;
    private final CollateralStore collateralStore;
    private final InstrumentStore equityInstrumentStore;
    private final ExperimentsStore experimentsStore;
    private final MarketHoursStore marketHoursStore;
    private final OptionChainStore optionChainStore;
    private final OptionInstrumentStore optionInstrumentStore;
    private final OptionOrderNomenclatureStore optionOrderNomenclatureStore;
    private final OptionOrderStrategyStore optionOrderStrategyStore;
    private final OptionPositionStore optionPositionStore;
    private final OptionQuoteStore optionQuoteStore;
    private final OptionSettingsStore optionSettingsStore;
    private final OptionsBuyingPowerStore optionsBuyingPowerStore;
    private final PositionStore positionStore;
    private final RxFactory rxFactory;

    public OptionOrderContextFactory(AccountProvider accountProvider, AggregateOptionPositionStore aggregateOptionPositionStore, PositionStore positionStore, CollateralStore collateralStore, MarketHoursStore marketHoursStore, OptionChainStore optionChainStore, OptionInstrumentStore optionInstrumentStore, OptionOrderStrategyStore optionOrderStrategyStore, OptionOrderNomenclatureStore optionOrderNomenclatureStore, OptionPositionStore optionPositionStore, OptionQuoteStore optionQuoteStore, OptionSettingsStore optionSettingsStore, InstrumentStore equityInstrumentStore, ExperimentsStore experimentsStore, OptionsBuyingPowerStore optionsBuyingPowerStore, RxFactory rxFactory) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(collateralStore, "collateralStore");
        Intrinsics.checkNotNullParameter(marketHoursStore, "marketHoursStore");
        Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
        Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
        Intrinsics.checkNotNullParameter(optionOrderStrategyStore, "optionOrderStrategyStore");
        Intrinsics.checkNotNullParameter(optionOrderNomenclatureStore, "optionOrderNomenclatureStore");
        Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
        Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
        Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
        Intrinsics.checkNotNullParameter(equityInstrumentStore, "equityInstrumentStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(optionsBuyingPowerStore, "optionsBuyingPowerStore");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        this.accountProvider = accountProvider;
        this.aggregateOptionPositionStore = aggregateOptionPositionStore;
        this.positionStore = positionStore;
        this.collateralStore = collateralStore;
        this.marketHoursStore = marketHoursStore;
        this.optionChainStore = optionChainStore;
        this.optionInstrumentStore = optionInstrumentStore;
        this.optionOrderStrategyStore = optionOrderStrategyStore;
        this.optionOrderNomenclatureStore = optionOrderNomenclatureStore;
        this.optionPositionStore = optionPositionStore;
        this.optionQuoteStore = optionQuoteStore;
        this.optionSettingsStore = optionSettingsStore;
        this.equityInstrumentStore = equityInstrumentStore;
        this.experimentsStore = experimentsStore;
        this.optionsBuyingPowerStore = optionsBuyingPowerStore;
        this.rxFactory = rxFactory;
    }

    public final Observable<OptionOrderContext> create(final StaticInputs staticInputs, Observable<RequestInputs> requestInputs) {
        Intrinsics.checkNotNullParameter(staticInputs, "staticInputs");
        Intrinsics.checkNotNullParameter(requestInputs, "requestInputs");
        OptionOrderBundle optionOrderBundle = staticInputs.getOptionOrderBundle();
        OptionChainBundle optionChainBundle = optionOrderBundle.getOptionChainBundle();
        final OptionOrderFormSource source = staticInputs.getSource();
        Observable observableDistinctUntilChanged = requestInputs.map(new Function() { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$create$$inlined$mapDistinct$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (R) ((OptionOrderContextFactory.RequestInputs) it).getAccountNumber();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        Observable observableRefCount = observableDistinctUntilChanged.switchMap(new Function() { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$create$accountObs$2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Account> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                this.this$0.accountProvider.refresh(true);
                return this.this$0.accountProvider.streamAccount(accountNumber);
            }
        }).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        Observable observableDistinctUntilChanged2 = requestInputs.map(new Function() { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$create$$inlined$mapDistinct$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                OptionOrderContextFactory.RequestInputs requestInputs2 = (OptionOrderContextFactory.RequestInputs) it;
                String accountNumber = requestInputs2.getAccountNumber();
                OptionOrderToReplaceBundle optionOrderToReplaceBundle = requestInputs2.getOptionOrderToReplaceBundle();
                return (R) Tuples4.m3642to(accountNumber, optionOrderToReplaceBundle != null ? optionOrderToReplaceBundle.getOrderToReplaceId() : null);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        Observable observableSwitchMap = observableDistinctUntilChanged2.switchMap(new Function() { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$create$displayedOptionsBuyingPowerObs$2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<OptionsBuyingPower>> apply(Tuples2<String, UUID> accountNumberToOrderToReplaceId) {
                Intrinsics.checkNotNullParameter(accountNumberToOrderToReplaceId, "accountNumberToOrderToReplaceId");
                String strComponent1 = accountNumberToOrderToReplaceId.component1();
                UUID uuidComponent2 = accountNumberToOrderToReplaceId.component2();
                return ObservablesKt.toOptionals(uuidComponent2 != null ? this.this$0.optionsBuyingPowerStore.pollOptionsBuyingPowerAsIfPreviousOrderCanceled(strComponent1, uuidComponent2) : this.this$0.optionsBuyingPowerStore.streamOptionsBuyingPower(strComponent1)).startWith((Observable) Optional2.INSTANCE);
            }
        });
        final UUID equityInstrumentId = optionChainBundle.getEquityInstrumentId();
        final OptionOrderContextFactory$create$equityPositionObs$1 optionOrderContextFactory$create$equityPositionObs$1 = new PropertyReference1Impl() { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$create$equityPositionObs$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((Account) obj).getAccountNumber();
            }
        };
        Observable observableSwitchMap2 = observableRefCount.map(new Function(optionOrderContextFactory$create$equityPositionObs$1) { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(optionOrderContextFactory$create$equityPositionObs$1, "function");
                this.function = optionOrderContextFactory$create$equityPositionObs$1;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        }).switchMap(new Function() { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$create$equityPositionObs$2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<Position>> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                if (equityInstrumentId != null) {
                    this.positionStore.refreshAccount(accountNumber, true);
                    return PositionStore.getPositionForAccountOptional$default(this.positionStore, equityInstrumentId, accountNumber, false, 4, null).startWith((Observable) Optional2.INSTANCE);
                }
                return Observable.just(Optional2.INSTANCE);
            }
        });
        final UUID aggregateOptionPositionId = optionOrderBundle.getAggregateOptionPositionId();
        final OptionOrderContextFactory$create$aggregateOptionPositionObs$1 optionOrderContextFactory$create$aggregateOptionPositionObs$1 = new PropertyReference1Impl() { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$create$aggregateOptionPositionObs$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((Account) obj).getAccountNumber();
            }
        };
        Observable observableSwitchMap3 = observableRefCount.map(new Function(optionOrderContextFactory$create$aggregateOptionPositionObs$1) { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(optionOrderContextFactory$create$aggregateOptionPositionObs$1, "function");
                this.function = optionOrderContextFactory$create$aggregateOptionPositionObs$1;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        }).switchMap(new Function() { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$create$aggregateOptionPositionObs$2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<UiAggregateOptionPositionFull>> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                if (aggregateOptionPositionId != null) {
                    this.aggregateOptionPositionStore.refresh(true, aggregateOptionPositionId, accountNumber);
                    return ObservablesKt.toOptionals(this.aggregateOptionPositionStore.streamUiAggregateOptionPosition(aggregateOptionPositionId));
                }
                Observable observableJust = Observable.just(Optional2.INSTANCE);
                Intrinsics.checkNotNull(observableJust);
                return observableJust;
            }
        });
        Observable<UiOptionChain> observableRefCount2 = this.optionChainStore.getStreamUiOptionChain().asObservable(optionChainBundle.getOptionChainId()).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount2, "refCount(...)");
        ObservableSource map = requestInputs.map(new Function() { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$create$argumentsObs$1
            @Override // io.reactivex.functions.Function
            public final OptionOrderContext.RequestArguments apply(OptionOrderContextFactory.RequestInputs inputs) {
                Intrinsics.checkNotNullParameter(inputs, "inputs");
                return new OptionOrderContext.RequestArguments(inputs.getOverrideDayTradeChecks(), inputs.getOverrideDtbpChecks(), inputs.getQuantity(), staticInputs.getUuid(), inputs.getOptionOrderToReplaceBundle(), inputs.getTimeInForce(), inputs.getTradingSession());
            }
        });
        ImmutableList<OptionLegBundle> legBundles = optionOrderBundle.getLegBundles();
        final OptionOrderContextFactory$create$legContextsObs$1 optionOrderContextFactory$create$legContextsObs$1 = new PropertyReference1Impl() { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$create$legContextsObs$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((Account) obj).getAccountNumber();
            }
        };
        Observable observableRefCount3 = observableRefCount.map(new Function(optionOrderContextFactory$create$legContextsObs$1) { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(optionOrderContextFactory$create$legContextsObs$1, "function");
                this.function = optionOrderContextFactory$create$legContextsObs$1;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        }).switchMap(new OptionOrderContextFactory$create$legContextsObs$2(legBundles, this)).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount3, "refCount(...)");
        Observable observableRefCount4 = observableRefCount3.switchMap(new OptionOrderContextFactory$create$equityInstrumentsObs$1(this)).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount4, "refCount(...)");
        final C11370x4637ed32 c11370x4637ed32 = new PropertyReference1Impl() { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$create$defaultPricingSettingServerValueObs$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((Account) obj).getAccountNumber();
            }
        };
        Observable observableDistinctUntilChanged3 = observableRefCount.map(new Function(c11370x4637ed32) { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(c11370x4637ed32, "function");
                this.function = c11370x4637ed32;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        }).switchMap(new Function() { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$create$defaultPricingSettingServerValueObs$2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<OptionSettings.DefaultPricingSetting>> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                return this.this$0.optionSettingsStore.streamOptionSettings(accountNumber).map(new Function() { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$create$defaultPricingSettingServerValueObs$2.1
                    @Override // io.reactivex.functions.Function
                    public final Optional<OptionSettings.DefaultPricingSetting> apply(OptionSettings it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Optional3.asOptional(it.getDefaultPricingSetting());
                    }
                }).startWith((Observable<R>) Optional2.INSTANCE).distinctUntilChanged();
            }
        }).map(new Function() { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$create$defaultPricingStateObs$1
            @Override // io.reactivex.functions.Function
            public final OptionDefaultPricingState apply(Optional<? extends OptionSettings.DefaultPricingSetting> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                return OptionDefaultPricingState.INSTANCE.from(optional.component1(), staticInputs.getDefaultPricingSettingOverride(), staticInputs.getShouldIgnoreDefaultPricing());
            }
        }).distinctUntilChanged();
        Observables observables = Observables.INSTANCE;
        Intrinsics.checkNotNull(observableDistinctUntilChanged3);
        Observable observableCombineLatest = Observable.combineLatest(observableRefCount3, requestInputs, observableDistinctUntilChanged3, new Function3<T1, T2, T3, R>() { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$create$$inlined$combineLatest$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function3
            public final R apply(T1 t1, T2 t2, T3 t3) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                OptionOrderContextFactory.RequestInputs requestInputs2 = (OptionOrderContextFactory.RequestInputs) t2;
                return (R) OptionOrderContext.Prices.INSTANCE.from(requestInputs2.getDirectionOverride(), requestInputs2.getPreserveUserInput(), (List) t1, requestInputs2.getUserInputPrices(), ((OptionDefaultPricingState) t3).getOverallDefaultPricingType());
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…neFunction(t1, t2, t3) })");
        Observable observableRefCount5 = observableCombineLatest.replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount5, "refCount(...)");
        Intrinsics.checkNotNull(observableSwitchMap2);
        Intrinsics.checkNotNull(observableSwitchMap3);
        Intrinsics.checkNotNull(observableSwitchMap);
        ObservableSource map2 = this.accountProvider.streamAllSelfDirectedAccounts().map(new Function() { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$create$accountContextObs$1
            @Override // io.reactivex.functions.Function
            public final Integer apply(List<Account> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Integer.valueOf(it.size());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        Observable observableCombineLatest2 = Observable.combineLatest(observableRefCount, observableSwitchMap2, observableSwitchMap3, observableSwitchMap, map2, new Function5<T1, T2, T3, T4, T5, R>() { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$create$$inlined$combineLatest$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function5
            public final R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                Intrinsics.checkParameterIsNotNull(t4, "t4");
                Intrinsics.checkParameterIsNotNull(t5, "t5");
                return (R) new OptionOrderContext.AccountContext((Account) t1, ((Integer) t5).intValue(), (Position) ((Optional) t2).component1(), (UiAggregateOptionPositionFull) ((Optional) t3).component1(), (OptionsBuyingPower) ((Optional) t4).component1());
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest2, "Observable.combineLatest…on(t1, t2, t3, t4, t5) })");
        Observable observableRefCount6 = observableCombineLatest2.replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount6, "refCount(...)");
        Intrinsics.checkNotNull(map);
        Observable observableCombineLatest3 = Observable.combineLatest(observableRefCount6, observableRefCount3, map, observableRefCount5, new Function4<T1, T2, T3, T4, R>() { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$create$$inlined$combineLatest$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function4
            public final R apply(T1 t1, T2 t2, T3 t3, T4 t4) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                Intrinsics.checkParameterIsNotNull(t4, "t4");
                OptionOrderContext.RequestArguments requestArguments = (OptionOrderContext.RequestArguments) t3;
                List<OptionOrderContext.LegContext> list = (List) t2;
                OptionOrderContext.AccountContext accountContext = (OptionOrderContext.AccountContext) t1;
                return (R) OptionOrderContext.INSTANCE.createApiRequest(accountContext, source, list, requestArguments, (OptionOrderContext.Prices) t4);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest3, "Observable.combineLatest…nction(t1, t2, t3, t4) })");
        Observable observableRefCount7 = observableCombineLatest3.replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount7, "refCount(...)");
        Observable observableSwitchMap4 = observableRefCount7.filter(new Predicate() { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$create$collateralObs$1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(ApiOptionOrderRequest it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (BigDecimals7.isPositive(it.getQuantity())) {
                    return it.getPrice() == null || !BigDecimals7.isNegative(it.getPrice());
                }
                return false;
            }
        }).distinctUntilChanged(new BiPredicate() { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$create$collateralObs$2
            @Override // io.reactivex.functions.BiPredicate
            public final boolean test(ApiOptionOrderRequest r1, ApiOptionOrderRequest r2) {
                Intrinsics.checkNotNullParameter(r1, "r1");
                Intrinsics.checkNotNullParameter(r2, "r2");
                return r1.hasEqualCollateral(r2);
            }
        }).switchMap(new Function() { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$create$collateralObs$3

            /* compiled from: OptionOrderContextFactory.kt */
            @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/robinhood/models/api/ApiCollateral;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.common.options.order.OptionOrderContextFactory$create$collateralObs$3$1", m3645f = "OptionOrderContextFactory.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.common.options.order.OptionOrderContextFactory$create$collateralObs$3$1 */
            static final class C113681 extends ContinuationImpl7 implements Function2<Produce4<? super ApiCollateral>, Continuation<? super Unit>, Object> {
                final /* synthetic */ ApiOptionOrderRequest $request;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionOrderContextFactory this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C113681(OptionOrderContextFactory optionOrderContextFactory, ApiOptionOrderRequest apiOptionOrderRequest, Continuation<? super C113681> continuation) {
                    super(2, continuation);
                    this.this$0 = optionOrderContextFactory;
                    this.$request = apiOptionOrderRequest;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C113681 c113681 = new C113681(this.this$0, this.$request, continuation);
                    c113681.L$0 = obj;
                    return c113681;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Produce4<? super ApiCollateral> produce4, Continuation<? super Unit> continuation) {
                    return ((C113681) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
                
                    if (r1.send(r6, r5) == r0) goto L15;
                 */
                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Produce4 produce4;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        produce4 = (Produce4) this.L$0;
                        CollateralStore collateralStore = this.this$0.collateralStore;
                        ApiOptionOrderRequest apiOptionOrderRequest = this.$request;
                        Intrinsics.checkNotNull(apiOptionOrderRequest);
                        this.L$0 = produce4;
                        this.label = 1;
                        obj = collateralStore.getOptionOrderCollateral(apiOptionOrderRequest, this);
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
                    produce4 = (Produce4) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 2;
                }
            }

            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<ApiCollateral>> apply(ApiOptionOrderRequest request) {
                Intrinsics.checkNotNullParameter(request, "request");
                return ObservablesKt.toOptionals(RxFactory.DefaultImpls.rxObservable$default(this.this$0.rxFactory, null, new C113681(this.this$0, request, null), 1, null)).onErrorReturn(new Function() { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$create$collateralObs$3.2
                    @Override // io.reactivex.functions.Function
                    public final Optional<ApiCollateral> apply(Throwable it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Optional2.INSTANCE;
                    }
                });
            }
        });
        Optional2 optional2 = Optional2.INSTANCE;
        Observable observableStartWith = observableSwitchMap4.startWith((Observable) optional2);
        Observable<MarketHours> andRefreshCurrentOrNextOpenMarketHoursForEquity = this.marketHoursStore.getAndRefreshCurrentOrNextOpenMarketHoursForEquity(false, null);
        Observable map3 = Observables.INSTANCE.combineLatest(observableRefCount4, observableRefCount2).map(new Function() { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$create$requestContextObs$1
            @Override // io.reactivex.functions.Function
            public final OptionOrderContext.RequestContext apply(Tuples2<? extends Map<UUID, Instrument>, UiOptionChain> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                Map<UUID, Instrument> mapComponent1 = tuples2.component1();
                UiOptionChain uiOptionChainComponent2 = tuples2.component2();
                Intrinsics.checkNotNull(mapComponent1);
                Intrinsics.checkNotNull(uiOptionChainComponent2);
                return new OptionOrderContext.RequestContext(mapComponent1, uiOptionChainComponent2);
            }
        });
        Observable observableCombineLatest4 = Observable.combineLatest(observableRefCount7, this.optionOrderNomenclatureStore.isInNomenclatureExperiment(), new BiFunction<T1, T2, R>() { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$create$$inlined$combineLatest$4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T1 t1, T2 t2) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Boolean bool = (Boolean) t2;
                bool.booleanValue();
                return (R) Tuples4.m3642to(((ApiOptionOrderRequest) t1).getLegs(), bool);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest4, "Observable.combineLatest…ombineFunction(t1, t2) })");
        Observable map4 = observableCombineLatest4.distinctUntilChanged().switchMapSingle(new Function() { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$create$strategiesObs$2

            /* compiled from: OptionOrderContextFactory.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiOptionOrderStrategies;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.common.options.order.OptionOrderContextFactory$create$strategiesObs$2$1", m3645f = "OptionOrderContextFactory.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.common.options.order.OptionOrderContextFactory$create$strategiesObs$2$1 */
            static final class C113751 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiOptionOrderStrategies>, Object> {
                final /* synthetic */ boolean $isInNomenclatureExperiment;
                final /* synthetic */ List<ApiOptionOrderRequest.Leg> $legs;
                int label;
                final /* synthetic */ OptionOrderContextFactory this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C113751(boolean z, OptionOrderContextFactory optionOrderContextFactory, List<ApiOptionOrderRequest.Leg> list, Continuation<? super C113751> continuation) {
                    super(2, continuation);
                    this.$isInNomenclatureExperiment = z;
                    this.this$0 = optionOrderContextFactory;
                    this.$legs = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C113751(this.$isInNomenclatureExperiment, this.this$0, this.$legs, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiOptionOrderStrategies> continuation) {
                    return ((C113751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
                
                    if (r5 == r0) goto L19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
                
                    if (r5 == r0) goto L19;
                 */
                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i != 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                            return (ApiOptionOrderStrategies) obj;
                        }
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return (ApiOptionOrderStrategies) obj;
                    }
                    ResultKt.throwOnFailure(obj);
                    if (this.$isInNomenclatureExperiment) {
                        OptionOrderStrategyStore optionOrderStrategyStore = this.this$0.optionOrderStrategyStore;
                        List<ApiOptionOrderRequest.Leg> list = this.$legs;
                        this.label = 1;
                        obj = optionOrderStrategyStore.fetchOptionOrderStrategyDisplayName(list, this);
                    } else {
                        OptionOrderStrategyStore optionOrderStrategyStore2 = this.this$0.optionOrderStrategyStore;
                        List<ApiOptionOrderRequest.Leg> list2 = this.$legs;
                        this.label = 2;
                        obj = optionOrderStrategyStore2.fetchOptionOrderStrategies(list2, this);
                    }
                    return coroutine_suspended;
                }
            }

            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Optional<ApiOptionOrderStrategies>> apply(Tuples2<? extends List<ApiOptionOrderRequest.Leg>, Boolean> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                List<ApiOptionOrderRequest.Leg> listComponent1 = tuples2.component1();
                return SinglesKt.mapToOptional(RxFactory.DefaultImpls.rxSingle$default(this.this$0.rxFactory, null, new C113751(tuples2.component2().booleanValue(), this.this$0, listComponent1, null), 1, null)).onErrorReturn(new Function() { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$create$strategiesObs$2.2
                    @Override // io.reactivex.functions.Function
                    public final Optional<ApiOptionOrderStrategies> apply(Throwable it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Optional2.INSTANCE;
                    }
                });
            }
        }).startWith((Observable) optional2).map(new Function() { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$create$strategiesObs$3
            @Override // io.reactivex.functions.Function
            public final OptionOrderContext.StrategyContext apply(Optional<ApiOptionOrderStrategies> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                ApiOptionOrderStrategies apiOptionOrderStrategiesComponent1 = optional.component1();
                return new OptionOrderContext.StrategyContext(apiOptionOrderStrategiesComponent1 != null ? apiOptionOrderStrategiesComponent1.getOpening_strategy() : null, apiOptionOrderStrategiesComponent1 != null ? apiOptionOrderStrategiesComponent1.getClosing_strategy() : null, apiOptionOrderStrategiesComponent1 != null ? apiOptionOrderStrategiesComponent1.getStrategy_display_name() : null);
            }
        });
        Intrinsics.checkNotNull(observableStartWith);
        ObservableSource map5 = requestInputs.map(new Function() { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$create$validationContextObs$1
            @Override // io.reactivex.functions.Function
            public final Optional<Response<ApiCryptoCancelAllPendingOrders>> apply(OptionOrderContextFactory.RequestInputs it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it.getCryptoCancelAllPendingOrdersResponse());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map5, "map(...)");
        Observable observableCombineLatest5 = Observable.combineLatest(observableStartWith, andRefreshCurrentOrNextOpenMarketHoursForEquity, map5, new Function3<T1, T2, T3, R>() { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$create$$inlined$combineLatest$5
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function3
            public final R apply(T1 t1, T2 t2, T3 t3) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                return (R) new OptionOrderContext.ValidationContext((ApiCollateral) ((Optional) t1).component1(), (Response) ((Optional) t3).component1(), (MarketHours) t2);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest5, "Observable.combineLatest…neFunction(t1, t2, t3) })");
        Observable observableDistinctUntilChanged4 = observableCombineLatest5.distinctUntilChanged();
        Observable<List<KaizenExperiment>> observableStreamExperiments = this.experimentsStore.streamExperiments();
        Intrinsics.checkNotNull(map3);
        Intrinsics.checkNotNull(map4);
        Intrinsics.checkNotNull(observableDistinctUntilChanged4);
        Observable observableCombineLatest6 = Observable.combineLatest(observableRefCount7, observableRefCount6, observableRefCount3, observableRefCount5, map, map3, map4, observableDistinctUntilChanged4, observableStreamExperiments, new Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R>() { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$create$$inlined$combineLatest$6
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function9
            public final R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                Intrinsics.checkParameterIsNotNull(t4, "t4");
                Intrinsics.checkParameterIsNotNull(t5, "t5");
                Intrinsics.checkParameterIsNotNull(t6, "t6");
                Intrinsics.checkParameterIsNotNull(t7, "t7");
                Intrinsics.checkParameterIsNotNull(t8, "t8");
                Intrinsics.checkParameterIsNotNull(t9, "t9");
                return (R) new OptionOrderContext((ApiOptionOrderRequest) t1, (OptionOrderContext.AccountContext) t2, (List) t3, (OptionOrderContext.Prices) t4, (OptionOrderContext.RequestArguments) t5, (OptionOrderContext.RequestContext) t6, (OptionOrderContext.StrategyContext) t7, (OptionOrderContext.ValidationContext) t8, (List) t9);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest6, "Observable.combineLatest…4, t5, t6, t7, t8, t9) })");
        Observable<OptionOrderContext> observableRefCount8 = observableCombineLatest6.replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount8, "refCount(...)");
        return observableRefCount8;
    }

    public final Observable<OptionOrderContext.LegContext> createForLeg(String accountNumber, OptionLegBundle optionLegBundle) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(optionLegBundle, "optionLegBundle");
        OptionConfigurationBundle optionConfigurationBundle = optionLegBundle.getOptionConfigurationBundle();
        OptionInstrument optionInstrument = optionLegBundle.getOptionInstrument();
        OptionChainBundle optionChainBundle = optionConfigurationBundle.getOptionChainBundle();
        this.optionQuoteStore.refresh(true, optionInstrument.getId());
        Observable observableRefCount = ObservablesKt.toOptionals(this.optionQuoteStore.getOptionQuote(optionInstrument.getId())).onErrorReturn(new Function() { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$createForLeg$quoteObs$1
            @Override // io.reactivex.functions.Function
            public final Optional<OptionInstrumentQuote> apply(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional2.INSTANCE;
            }
        }).startWith((Observable) Optional2.INSTANCE).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        this.optionPositionStore.refresh(true, optionChainBundle.getOptionChainId(), accountNumber);
        Observable<Optional<OptionInstrumentPosition>> optionPosition = this.optionPositionStore.getOptionPosition(accountNumber, optionInstrument.getId(), OptionPositionType.SHORT);
        Observable<Optional<OptionInstrumentPosition>> optionPosition2 = this.optionPositionStore.getOptionPosition(accountNumber, optionInstrument.getId(), OptionPositionType.LONG);
        Endpoint.DefaultImpls.refresh$default(this.optionInstrumentStore.getGetOptionInstrument(), optionInstrument.getId(), true, null, 4, null);
        Observable<UiOptionInstrument> observableRefCount2 = this.optionInstrumentStore.getStreamUiOptionInstrument().asObservable(optionInstrument.getId()).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount2, "refCount(...)");
        OrderSide optionSide = optionConfigurationBundle.getOptionSide();
        final OptionOrderContext.LegContext.RequestArguments requestArguments = new OptionOrderContext.LegContext.RequestArguments(optionSide, new BigDecimal(optionLegBundle.getRatio()));
        Observable<OrderPositionEffect> orderPositionEffect = this.optionPositionStore.getOrderPositionEffect(accountNumber, optionInstrument.getId(), optionSide);
        Observables observables = Observables.INSTANCE;
        Observable observableCombineLatest = Observable.combineLatest(observableRefCount2, observableRefCount, orderPositionEffect, new Function3<T1, T2, T3, R>() { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$createForLeg$$inlined$combineLatest$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function3
            public final R apply(T1 t1, T2 t2, T3 t3) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                return (R) new OptionOrderContext.LegContext.RequestContext((UiOptionInstrument) t1, (OptionInstrumentQuote) ((Optional) t2).component1(), (OrderPositionEffect) t3);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…neFunction(t1, t2, t3) })");
        Observable observableCombineLatest2 = Observable.combineLatest(optionPosition, optionPosition2, new BiFunction<T1, T2, R>() { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$createForLeg$$inlined$combineLatest$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T1 t1, T2 t2) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                return (R) new OptionOrderContext.LegContext.AccountContext((OptionInstrumentPosition) ((Optional) t1).component1(), (OptionInstrumentPosition) ((Optional) t2).component1());
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest2, "Observable.combineLatest…ombineFunction(t1, t2) })");
        Observable<OptionOrderContext.LegContext> observableCombineLatest3 = Observable.combineLatest(observableCombineLatest, observableCombineLatest2, new BiFunction<T1, T2, R>() { // from class: com.robinhood.android.common.options.order.OptionOrderContextFactory$createForLeg$$inlined$combineLatest$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T1 t1, T2 t2) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                OptionOrderContext.LegContext.RequestContext requestContext = (OptionOrderContext.LegContext.RequestContext) t1;
                return (R) new OptionOrderContext.LegContext(requestArguments, requestContext, (OptionOrderContext.LegContext.AccountContext) t2);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest3, "Observable.combineLatest…ombineFunction(t1, t2) })");
        return observableCombineLatest3;
    }

    /* compiled from: OptionOrderContextFactory.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\t\u00102\u001a\u00020\u000bHÆ\u0003J\t\u00103\u001a\u00020\rHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u00105\u001a\u00020\u0011HÆ\u0003J\u0011\u00106\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0085\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001J\u0013\u00109\u001a\u00020\u00072\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020<HÖ\u0001J\t\u0010=\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006>"}, m3636d2 = {"Lcom/robinhood/android/common/options/order/OptionOrderContextFactory$RequestInputs;", "", "directionOverride", "Lcom/robinhood/models/db/OrderDirection;", "userInputPrices", "Lcom/robinhood/android/common/options/order/OptionOrderUserInputPrices;", "overrideDayTradeChecks", "", "overrideDtbpChecks", "preserveUserInput", "quantity", "Ljava/math/BigDecimal;", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "tradingSession", "Lcom/robinhood/models/db/OrderMarketHours;", "accountNumber", "", "cryptoCancelAllPendingOrdersResponse", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiCryptoCancelAllPendingOrders;", "optionOrderToReplaceBundle", "Lcom/robinhood/models/ui/OptionOrderToReplaceBundle;", "<init>", "(Lcom/robinhood/models/db/OrderDirection;Lcom/robinhood/android/common/options/order/OptionOrderUserInputPrices;ZZZLjava/math/BigDecimal;Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/models/db/OrderMarketHours;Ljava/lang/String;Lretrofit2/Response;Lcom/robinhood/models/ui/OptionOrderToReplaceBundle;)V", "getDirectionOverride", "()Lcom/robinhood/models/db/OrderDirection;", "getUserInputPrices", "()Lcom/robinhood/android/common/options/order/OptionOrderUserInputPrices;", "getOverrideDayTradeChecks", "()Z", "getOverrideDtbpChecks", "getPreserveUserInput", "getQuantity", "()Ljava/math/BigDecimal;", "getTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "getTradingSession", "()Lcom/robinhood/models/db/OrderMarketHours;", "getAccountNumber", "()Ljava/lang/String;", "getCryptoCancelAllPendingOrdersResponse", "()Lretrofit2/Response;", "getOptionOrderToReplaceBundle", "()Lcom/robinhood/models/ui/OptionOrderToReplaceBundle;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", "toString", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RequestInputs {
        public static final int $stable = 8;
        private final String accountNumber;
        private final Response<ApiCryptoCancelAllPendingOrders> cryptoCancelAllPendingOrdersResponse;
        private final OrderDirection directionOverride;
        private final OptionOrderToReplaceBundle optionOrderToReplaceBundle;
        private final boolean overrideDayTradeChecks;
        private final boolean overrideDtbpChecks;
        private final boolean preserveUserInput;
        private final BigDecimal quantity;
        private final OrderTimeInForce timeInForce;
        private final OrderMarketHours tradingSession;
        private final OptionOrderUserInputPrices userInputPrices;

        public static /* synthetic */ RequestInputs copy$default(RequestInputs requestInputs, OrderDirection orderDirection, OptionOrderUserInputPrices optionOrderUserInputPrices, boolean z, boolean z2, boolean z3, BigDecimal bigDecimal, OrderTimeInForce orderTimeInForce, OrderMarketHours orderMarketHours, String str, Response response, OptionOrderToReplaceBundle optionOrderToReplaceBundle, int i, Object obj) {
            if ((i & 1) != 0) {
                orderDirection = requestInputs.directionOverride;
            }
            if ((i & 2) != 0) {
                optionOrderUserInputPrices = requestInputs.userInputPrices;
            }
            if ((i & 4) != 0) {
                z = requestInputs.overrideDayTradeChecks;
            }
            if ((i & 8) != 0) {
                z2 = requestInputs.overrideDtbpChecks;
            }
            if ((i & 16) != 0) {
                z3 = requestInputs.preserveUserInput;
            }
            if ((i & 32) != 0) {
                bigDecimal = requestInputs.quantity;
            }
            if ((i & 64) != 0) {
                orderTimeInForce = requestInputs.timeInForce;
            }
            if ((i & 128) != 0) {
                orderMarketHours = requestInputs.tradingSession;
            }
            if ((i & 256) != 0) {
                str = requestInputs.accountNumber;
            }
            if ((i & 512) != 0) {
                response = requestInputs.cryptoCancelAllPendingOrdersResponse;
            }
            if ((i & 1024) != 0) {
                optionOrderToReplaceBundle = requestInputs.optionOrderToReplaceBundle;
            }
            Response response2 = response;
            OptionOrderToReplaceBundle optionOrderToReplaceBundle2 = optionOrderToReplaceBundle;
            OrderMarketHours orderMarketHours2 = orderMarketHours;
            String str2 = str;
            BigDecimal bigDecimal2 = bigDecimal;
            OrderTimeInForce orderTimeInForce2 = orderTimeInForce;
            boolean z4 = z3;
            boolean z5 = z;
            return requestInputs.copy(orderDirection, optionOrderUserInputPrices, z5, z2, z4, bigDecimal2, orderTimeInForce2, orderMarketHours2, str2, response2, optionOrderToReplaceBundle2);
        }

        /* renamed from: component1, reason: from getter */
        public final OrderDirection getDirectionOverride() {
            return this.directionOverride;
        }

        public final Response<ApiCryptoCancelAllPendingOrders> component10() {
            return this.cryptoCancelAllPendingOrdersResponse;
        }

        /* renamed from: component11, reason: from getter */
        public final OptionOrderToReplaceBundle getOptionOrderToReplaceBundle() {
            return this.optionOrderToReplaceBundle;
        }

        /* renamed from: component2, reason: from getter */
        public final OptionOrderUserInputPrices getUserInputPrices() {
            return this.userInputPrices;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getOverrideDayTradeChecks() {
            return this.overrideDayTradeChecks;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getOverrideDtbpChecks() {
            return this.overrideDtbpChecks;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getPreserveUserInput() {
            return this.preserveUserInput;
        }

        /* renamed from: component6, reason: from getter */
        public final BigDecimal getQuantity() {
            return this.quantity;
        }

        /* renamed from: component7, reason: from getter */
        public final OrderTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        /* renamed from: component8, reason: from getter */
        public final OrderMarketHours getTradingSession() {
            return this.tradingSession;
        }

        /* renamed from: component9, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final RequestInputs copy(OrderDirection directionOverride, OptionOrderUserInputPrices userInputPrices, boolean overrideDayTradeChecks, boolean overrideDtbpChecks, boolean preserveUserInput, BigDecimal quantity, OrderTimeInForce timeInForce, OrderMarketHours tradingSession, String accountNumber, Response<ApiCryptoCancelAllPendingOrders> cryptoCancelAllPendingOrdersResponse, OptionOrderToReplaceBundle optionOrderToReplaceBundle) {
            Intrinsics.checkNotNullParameter(userInputPrices, "userInputPrices");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new RequestInputs(directionOverride, userInputPrices, overrideDayTradeChecks, overrideDtbpChecks, preserveUserInput, quantity, timeInForce, tradingSession, accountNumber, cryptoCancelAllPendingOrdersResponse, optionOrderToReplaceBundle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RequestInputs)) {
                return false;
            }
            RequestInputs requestInputs = (RequestInputs) other;
            return this.directionOverride == requestInputs.directionOverride && Intrinsics.areEqual(this.userInputPrices, requestInputs.userInputPrices) && this.overrideDayTradeChecks == requestInputs.overrideDayTradeChecks && this.overrideDtbpChecks == requestInputs.overrideDtbpChecks && this.preserveUserInput == requestInputs.preserveUserInput && Intrinsics.areEqual(this.quantity, requestInputs.quantity) && this.timeInForce == requestInputs.timeInForce && this.tradingSession == requestInputs.tradingSession && Intrinsics.areEqual(this.accountNumber, requestInputs.accountNumber) && Intrinsics.areEqual(this.cryptoCancelAllPendingOrdersResponse, requestInputs.cryptoCancelAllPendingOrdersResponse) && Intrinsics.areEqual(this.optionOrderToReplaceBundle, requestInputs.optionOrderToReplaceBundle);
        }

        public int hashCode() {
            OrderDirection orderDirection = this.directionOverride;
            int iHashCode = (((((((((((((orderDirection == null ? 0 : orderDirection.hashCode()) * 31) + this.userInputPrices.hashCode()) * 31) + Boolean.hashCode(this.overrideDayTradeChecks)) * 31) + Boolean.hashCode(this.overrideDtbpChecks)) * 31) + Boolean.hashCode(this.preserveUserInput)) * 31) + this.quantity.hashCode()) * 31) + this.timeInForce.hashCode()) * 31;
            OrderMarketHours orderMarketHours = this.tradingSession;
            int iHashCode2 = (((iHashCode + (orderMarketHours == null ? 0 : orderMarketHours.hashCode())) * 31) + this.accountNumber.hashCode()) * 31;
            Response<ApiCryptoCancelAllPendingOrders> response = this.cryptoCancelAllPendingOrdersResponse;
            int iHashCode3 = (iHashCode2 + (response == null ? 0 : response.hashCode())) * 31;
            OptionOrderToReplaceBundle optionOrderToReplaceBundle = this.optionOrderToReplaceBundle;
            return iHashCode3 + (optionOrderToReplaceBundle != null ? optionOrderToReplaceBundle.hashCode() : 0);
        }

        public String toString() {
            return "RequestInputs(directionOverride=" + this.directionOverride + ", userInputPrices=" + this.userInputPrices + ", overrideDayTradeChecks=" + this.overrideDayTradeChecks + ", overrideDtbpChecks=" + this.overrideDtbpChecks + ", preserveUserInput=" + this.preserveUserInput + ", quantity=" + this.quantity + ", timeInForce=" + this.timeInForce + ", tradingSession=" + this.tradingSession + ", accountNumber=" + this.accountNumber + ", cryptoCancelAllPendingOrdersResponse=" + this.cryptoCancelAllPendingOrdersResponse + ", optionOrderToReplaceBundle=" + this.optionOrderToReplaceBundle + ")";
        }

        public RequestInputs(OrderDirection orderDirection, OptionOrderUserInputPrices userInputPrices, boolean z, boolean z2, boolean z3, BigDecimal quantity, OrderTimeInForce timeInForce, OrderMarketHours orderMarketHours, String accountNumber, Response<ApiCryptoCancelAllPendingOrders> response, OptionOrderToReplaceBundle optionOrderToReplaceBundle) {
            Intrinsics.checkNotNullParameter(userInputPrices, "userInputPrices");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.directionOverride = orderDirection;
            this.userInputPrices = userInputPrices;
            this.overrideDayTradeChecks = z;
            this.overrideDtbpChecks = z2;
            this.preserveUserInput = z3;
            this.quantity = quantity;
            this.timeInForce = timeInForce;
            this.tradingSession = orderMarketHours;
            this.accountNumber = accountNumber;
            this.cryptoCancelAllPendingOrdersResponse = response;
            this.optionOrderToReplaceBundle = optionOrderToReplaceBundle;
        }

        public final OrderDirection getDirectionOverride() {
            return this.directionOverride;
        }

        public final OptionOrderUserInputPrices getUserInputPrices() {
            return this.userInputPrices;
        }

        public final boolean getOverrideDayTradeChecks() {
            return this.overrideDayTradeChecks;
        }

        public final boolean getOverrideDtbpChecks() {
            return this.overrideDtbpChecks;
        }

        public final boolean getPreserveUserInput() {
            return this.preserveUserInput;
        }

        public final BigDecimal getQuantity() {
            return this.quantity;
        }

        public final OrderTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        public final OrderMarketHours getTradingSession() {
            return this.tradingSession;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final Response<ApiCryptoCancelAllPendingOrders> getCryptoCancelAllPendingOrdersResponse() {
            return this.cryptoCancelAllPendingOrdersResponse;
        }

        public final OptionOrderToReplaceBundle getOptionOrderToReplaceBundle() {
            return this.optionOrderToReplaceBundle;
        }
    }

    /* compiled from: OptionOrderContextFactory.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/common/options/order/OptionOrderContextFactory$StaticInputs;", "", "optionOrderBundle", "Lcom/robinhood/models/ui/OptionOrderBundle;", "source", "Lrosetta/option/OptionOrderFormSource;", "uuid", "Ljava/util/UUID;", "defaultPricingSettingOverride", "Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "shouldIgnoreDefaultPricing", "", "<init>", "(Lcom/robinhood/models/ui/OptionOrderBundle;Lrosetta/option/OptionOrderFormSource;Ljava/util/UUID;Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;Z)V", "getOptionOrderBundle", "()Lcom/robinhood/models/ui/OptionOrderBundle;", "getSource", "()Lrosetta/option/OptionOrderFormSource;", "getUuid", "()Ljava/util/UUID;", "getDefaultPricingSettingOverride", "()Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "getShouldIgnoreDefaultPricing", "()Z", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StaticInputs {
        public static final int $stable = 8;
        private final OptionSettings.DefaultPricingSetting defaultPricingSettingOverride;
        private final OptionOrderBundle optionOrderBundle;
        private final boolean shouldIgnoreDefaultPricing;
        private final OptionOrderFormSource source;
        private final UUID uuid;

        public StaticInputs(OptionOrderBundle optionOrderBundle, OptionOrderFormSource source, UUID uuid, OptionSettings.DefaultPricingSetting defaultPricingSetting, boolean z) {
            Intrinsics.checkNotNullParameter(optionOrderBundle, "optionOrderBundle");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            this.optionOrderBundle = optionOrderBundle;
            this.source = source;
            this.uuid = uuid;
            this.defaultPricingSettingOverride = defaultPricingSetting;
            this.shouldIgnoreDefaultPricing = z;
        }

        public final OptionOrderBundle getOptionOrderBundle() {
            return this.optionOrderBundle;
        }

        public final OptionOrderFormSource getSource() {
            return this.source;
        }

        public final UUID getUuid() {
            return this.uuid;
        }

        public final OptionSettings.DefaultPricingSetting getDefaultPricingSettingOverride() {
            return this.defaultPricingSettingOverride;
        }

        public final boolean getShouldIgnoreDefaultPricing() {
            return this.shouldIgnoreDefaultPricing;
        }
    }
}
