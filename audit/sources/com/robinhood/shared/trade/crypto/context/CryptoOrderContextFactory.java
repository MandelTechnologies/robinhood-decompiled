package com.robinhood.shared.trade.crypto.context;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.android.lib.margin.LeveredMarginSettingsStore;
import com.robinhood.android.lib.margin.p167db.models.MarginSettings;
import com.robinhood.android.margin.experiments.PdtRevampV1;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.BalancesStore;
import com.robinhood.librobinhood.data.store.CryptoAccountStore;
import com.robinhood.librobinhood.data.store.CryptoBuyingPowerStore;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CryptoHoldingStore;
import com.robinhood.librobinhood.data.store.CryptoL2QuoteStore;
import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.QuoteTouchPoint;
import com.robinhood.librobinhood.data.store.fee.CryptoFeeStore;
import com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore;
import com.robinhood.models.api.ApiCryptoOrderInputType;
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.models.api.fee.MonetizationModel;
import com.robinhood.models.crypto.p314db.CryptoAccount;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import com.robinhood.models.crypto.p314db.CryptoBuyingPower;
import com.robinhood.models.crypto.p314db.CryptoOrder;
import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.crypto.p314db.Quote;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.models.crypto.p315ui.UiCryptoHolding;
import com.robinhood.models.crypto.p315ui.UiCryptoTradeBonusEligibility;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.crypto.p315ui.fee.UiFeeEstimation;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.crypto.utils.OrderInfoCalculations;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.fee.MonetizationFeeCalculator;
import com.robinhood.shared.trade.crypto.p397ui.order.CryptoOrderPrices;
import com.robinhood.shared.trade.crypto.validation.RequestInputs;
import com.robinhood.shared.trade.crypto.validation.StaticInputs;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.math.BigDecimals7;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function5;
import io.reactivex.functions.Function6;
import io.reactivex.rxkotlin.Observables;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: CryptoOrderContextFactory.kt */
@Metadata(m3635d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 @2\u00020\u0001:\u0001@By\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ*\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0!Jk\u0010)\u001a\b\u0012\u0004\u0012\u0002H*0!\"\b\b\u0000\u0010**\u00020\u00012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010%\u001a\u00020&2\f\u0010.\u001a\b\u0012\u0004\u0012\u0002H*0,2(\u0010/\u001a$\u0012\u0004\u0012\u00020-\u0012\u0006\u0012\u0004\u0018\u000101\u0012\u0006\u0012\u0004\u0018\u000102\u0012\n\u0012\b\u0012\u0004\u0012\u0002H*0,00H\u0001¢\u0006\u0002\b3J)\u00104\u001a\b\u0012\u0004\u0012\u0002050!2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0!2\u0006\u0010%\u001a\u00020&H\u0001¢\u0006\u0002\b6J)\u00107\u001a\b\u0012\u0004\u0012\u0002050!2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0!2\u0006\u0010%\u001a\u00020&H\u0001¢\u0006\u0002\b8J6\u00109\u001a&\u0012\f\u0012\n :*\u0004\u0018\u00010(0( :*\u0012\u0012\f\u0012\n :*\u0004\u0018\u00010(0(\u0018\u00010!0!*\b\u0012\u0004\u0012\u00020(0!H\u0002J;\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0<0!2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0!2\u0006\u0010%\u001a\u00020&2\n\b\u0002\u0010>\u001a\u0004\u0018\u000102H\u0001¢\u0006\u0002\b?R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006A"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContextFactory;", "", "balancesStore", "Lcom/robinhood/librobinhood/data/store/BalancesStore;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "cryptoBuyingPowerStore", "Lcom/robinhood/librobinhood/data/store/CryptoBuyingPowerStore;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoFeeStore", "Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeStore;", "cryptoHoldingStore", "Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore;", "cryptoL2QuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoL2QuoteStore;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "marginSettingsStore", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "<init>", "(Lcom/robinhood/librobinhood/data/store/BalancesStore;Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;Lcom/robinhood/librobinhood/data/store/CryptoBuyingPowerStore;Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeStore;Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore;Lcom/robinhood/librobinhood/data/store/CryptoL2QuoteStore;Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;Lcom/robinhood/coroutines/rx/RxFactory;)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lio/reactivex/Observable;", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "staticInputs", "Lcom/robinhood/shared/trade/crypto/validation/StaticInputs;", "requestInputsObs", "Lcom/robinhood/shared/trade/crypto/validation/RequestInputs;", "switchOnMib", "T", "locationFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/crypto/db/CryptoAccountSwitcherLocation$WithCurrencyPair;", "nonMibFlow", "mibFlow", "Lkotlin/Function3;", "", "Ljava/util/UUID;", "switchOnMib$feature_trade_crypto_externalDebug", "cryptoQuoteObservable", "Lcom/robinhood/models/crypto/db/Quote;", "cryptoQuoteObservable$feature_trade_crypto_externalDebug", "cryptoL2QuoteObservable", "cryptoL2QuoteObservable$feature_trade_crypto_externalDebug", "takeFirstThenDebounce", "kotlin.jvm.PlatformType", "feeEstimationObservable", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/crypto/ui/fee/UiFeeEstimation;", "cryptoAccountId", "feeEstimationObservable$feature_trade_crypto_externalDebug", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CryptoOrderContextFactory {
    public static final long REQUEST_INPUTS_DEBOUNCE_MILLIS = 500;
    private final BalancesStore balancesStore;
    private final CryptoAccountProvider cryptoAccountProvider;
    private final CryptoAccountStore cryptoAccountStore;
    private final CryptoBuyingPowerStore cryptoBuyingPowerStore;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final CryptoFeeStore cryptoFeeStore;
    private final CryptoHoldingStore cryptoHoldingStore;
    private final CryptoL2QuoteStore cryptoL2QuoteStore;
    private final CryptoQuoteStore cryptoQuoteStore;
    private final CurrencyPairV2Store currencyPairStore;
    private final ExperimentsStore experimentsStore;
    private final LeveredMarginSettingsStore marginSettingsStore;
    private final RxFactory rxFactory;
    private final UnifiedAccountStore unifiedAccountStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public CryptoOrderContextFactory(BalancesStore balancesStore, CryptoAccountStore cryptoAccountStore, CryptoBuyingPowerStore cryptoBuyingPowerStore, CryptoAccountProvider cryptoAccountProvider, CryptoExperimentsStore cryptoExperimentsStore, CryptoFeeStore cryptoFeeStore, CryptoHoldingStore cryptoHoldingStore, CryptoL2QuoteStore cryptoL2QuoteStore, CryptoQuoteStore cryptoQuoteStore, CurrencyPairV2Store currencyPairStore, ExperimentsStore experimentsStore, LeveredMarginSettingsStore marginSettingsStore, UnifiedAccountStore unifiedAccountStore, RxFactory rxFactory) {
        Intrinsics.checkNotNullParameter(balancesStore, "balancesStore");
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        Intrinsics.checkNotNullParameter(cryptoBuyingPowerStore, "cryptoBuyingPowerStore");
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(cryptoFeeStore, "cryptoFeeStore");
        Intrinsics.checkNotNullParameter(cryptoHoldingStore, "cryptoHoldingStore");
        Intrinsics.checkNotNullParameter(cryptoL2QuoteStore, "cryptoL2QuoteStore");
        Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(marginSettingsStore, "marginSettingsStore");
        Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        this.balancesStore = balancesStore;
        this.cryptoAccountStore = cryptoAccountStore;
        this.cryptoBuyingPowerStore = cryptoBuyingPowerStore;
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.cryptoFeeStore = cryptoFeeStore;
        this.cryptoHoldingStore = cryptoHoldingStore;
        this.cryptoL2QuoteStore = cryptoL2QuoteStore;
        this.cryptoQuoteStore = cryptoQuoteStore;
        this.currencyPairStore = currencyPairStore;
        this.experimentsStore = experimentsStore;
        this.marginSettingsStore = marginSettingsStore;
        this.unifiedAccountStore = unifiedAccountStore;
        this.rxFactory = rxFactory;
    }

    public final Observable<CryptoOrderContext> create(Screen eventScreen, final StaticInputs staticInputs, final Observable<RequestInputs> requestInputsObs) {
        Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
        Intrinsics.checkNotNullParameter(staticInputs, "staticInputs");
        Intrinsics.checkNotNullParameter(requestInputsObs, "requestInputsObs");
        Observable observableDistinctUntilChanged = requestInputsObs.map(new Function() { // from class: com.robinhood.shared.trade.crypto.context.CryptoOrderContextFactory$create$locationFlow$1
            @Override // io.reactivex.functions.Function
            public final CryptoAccountSwitcherLocation.WithCurrencyPair apply(RequestInputs it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.cryptoAccountSwitcherLocation(staticInputs.getCurrencyPairId());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        final Flow<? extends CryptoAccountSwitcherLocation.WithCurrencyPair> flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(observableDistinctUntilChanged), Integer.MAX_VALUE, null, 2, null);
        Observable observableConvertToObservable = this.rxFactory.convertToObservable(FlowKt.transformLatest(flowBuffer$default, new CryptoOrderContextFactory$create$$inlined$flatMapLatest$1(null, this)));
        Observable observableSwitchOnMib$feature_trade_crypto_externalDebug = switchOnMib$feature_trade_crypto_externalDebug(flowBuffer$default, staticInputs, this.cryptoAccountStore.streamAccountOptional(), new Function3() { // from class: com.robinhood.shared.trade.crypto.context.CryptoOrderContextFactory$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return CryptoOrderContextFactory.create$lambda$2(this.f$0, (CryptoAccountSwitcherLocation.WithCurrencyPair) obj, (String) obj2, (UUID) obj3);
            }
        });
        Observable observableConvertToObservable2 = this.rxFactory.convertToObservable(Operators.toOptionals(FlowKt.transformLatest(flowBuffer$default, new CryptoOrderContextFactory$create$$inlined$flatMapLatest$2(null, this))));
        Observable<Quote> observableCryptoQuoteObservable$feature_trade_crypto_externalDebug = cryptoQuoteObservable$feature_trade_crypto_externalDebug(requestInputsObs, staticInputs);
        Observable<UiCurrencyPair> observableRefCount = this.currencyPairStore.streamCurrencyPair(staticInputs.getCurrencyPairId()).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        Observable<R> observableSwitchMap = observableRefCount.switchMap(new Function() { // from class: com.robinhood.shared.trade.crypto.context.CryptoOrderContextFactory$create$cryptoBuyingPowerObs$1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<CryptoBuyingPower>> apply(UiCurrencyPair currencyPair) {
                Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
                return this.rxFactory.convertToObservable(Operators.toOptionals(FlowKt.transformLatest(flowBuffer$default, new C40103x73fef2e3(null, this, currencyPair))));
            }
        });
        Optional2 optional2 = Optional2.INSTANCE;
        Observable observableStartWith = observableSwitchMap.startWith((Observable<R>) optional2);
        Observable observableDistinctUntilChanged2 = this.marginSettingsStore.streamMarginSettingsIndividual().map(new Function() { // from class: com.robinhood.shared.trade.crypto.context.CryptoOrderContextFactory$create$isMarginInvestingEnabledObs$1
            @Override // io.reactivex.functions.Function
            public final Optional<Boolean> apply(MarginSettings it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(Boolean.valueOf(it.isMarginInvestingEnabled()));
            }
        }).startWith((Observable<R>) optional2).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        Observable observableSwitchOnMib$feature_trade_crypto_externalDebug2 = switchOnMib$feature_trade_crypto_externalDebug(flowBuffer$default, staticInputs, Context7.buffer$default(RxConvert.asFlow(observableDistinctUntilChanged2), Integer.MAX_VALUE, null, 2, null), new Function3() { // from class: com.robinhood.shared.trade.crypto.context.CryptoOrderContextFactory$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return CryptoOrderContextFactory.create$lambda$6(this.f$0, (CryptoAccountSwitcherLocation.WithCurrencyPair) obj, (String) obj2, (UUID) obj3);
            }
        });
        UnifiedAccountStore.refresh$default(this.unifiedAccountStore, false, 1, null);
        Observable observableStartWith2 = ObservablesKt.toOptionals(this.unifiedAccountStore.streamIndividualAccount()).startWith((Observable) optional2);
        Intrinsics.checkNotNullExpressionValue(observableStartWith2, "startWith(...)");
        Observable observableSwitchOnMib$feature_trade_crypto_externalDebug3 = switchOnMib$feature_trade_crypto_externalDebug(flowBuffer$default, staticInputs, Context7.buffer$default(RxConvert.asFlow(observableStartWith2), Integer.MAX_VALUE, null, 2, null), new Function3() { // from class: com.robinhood.shared.trade.crypto.context.CryptoOrderContextFactory$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return CryptoOrderContextFactory.create$lambda$7(this.f$0, (CryptoAccountSwitcherLocation.WithCurrencyPair) obj, (String) obj2, (UUID) obj3);
            }
        });
        Observable observableSwitchOnMib$feature_trade_crypto_externalDebug4 = switchOnMib$feature_trade_crypto_externalDebug(flowBuffer$default, staticInputs, Context7.buffer$default(RxConvert.asFlow(m2848x14f6f1b(this, requestInputsObs, staticInputs, null, 4, null)), Integer.MAX_VALUE, null, 2, null), new Function3() { // from class: com.robinhood.shared.trade.crypto.context.CryptoOrderContextFactory$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return CryptoOrderContextFactory.create$lambda$8(this.f$0, requestInputsObs, staticInputs, (CryptoAccountSwitcherLocation.WithCurrencyPair) obj, (String) obj2, (UUID) obj3);
            }
        });
        Observables observables = Observables.INSTANCE;
        Observable observableCombineLatest = Observable.combineLatest(requestInputsObs, observableRefCount, observableConvertToObservable2, observableCryptoQuoteObservable$feature_trade_crypto_externalDebug, observableSwitchOnMib$feature_trade_crypto_externalDebug4, new Function5<T1, T2, T3, T4, T5, R>() { // from class: com.robinhood.shared.trade.crypto.context.CryptoOrderContextFactory$create$$inlined$combineLatest$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function5
            public final R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                Intrinsics.checkParameterIsNotNull(t4, "t4");
                Intrinsics.checkParameterIsNotNull(t5, "t5");
                return (R) new CryptoOrderContext.RequestContext((RequestInputs) t1, (UiCurrencyPair) t2, (UiCryptoHolding) ((Optional) t3).component1(), (Quote) t4, (UiFeeEstimation) ((Optional) t5).component1());
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…on(t1, t2, t3, t4, t5) })");
        Intrinsics.checkNotNull(observableStartWith);
        Observable observableCombineLatest2 = Observable.combineLatest(observableSwitchOnMib$feature_trade_crypto_externalDebug, observableConvertToObservable, observableSwitchOnMib$feature_trade_crypto_externalDebug3, observableStartWith, observableSwitchOnMib$feature_trade_crypto_externalDebug2, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{PdtRevampV1.INSTANCE}, false, null, 6, null), new Function6<T1, T2, T3, T4, T5, T6, R>() { // from class: com.robinhood.shared.trade.crypto.context.CryptoOrderContextFactory$create$$inlined$combineLatest$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function6
            public final R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                Intrinsics.checkParameterIsNotNull(t4, "t4");
                Intrinsics.checkParameterIsNotNull(t5, "t5");
                Intrinsics.checkParameterIsNotNull(t6, "t6");
                boolean zBooleanValue = ((Boolean) t6).booleanValue();
                return (R) new CryptoOrderContext.AccountContext((CryptoAccount) ((Optional) t1).component1(), (UnifiedAccountV2) ((Optional) t3).component1(), (UnifiedBalances) t2, (CryptoBuyingPower) ((Optional) t4).component1(), (Boolean) ((Optional) t5).component1(), zBooleanValue);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest2, "Observable.combineLatest…1, t2, t3, t4, t5, t6) })");
        Observable observableCombineLatest3 = Observable.combineLatest(observableCombineLatest, observableCombineLatest2, new BiFunction<T1, T2, R>() { // from class: com.robinhood.shared.trade.crypto.context.CryptoOrderContextFactory$create$$inlined$combineLatest$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T1 t1, T2 t2) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                CryptoOrderContext.RequestContext requestContext = (CryptoOrderContext.RequestContext) t1;
                return (R) CryptoOrderContextFactory.INSTANCE.createOrderInfo$feature_trade_crypto_externalDebug(requestContext, (CryptoOrderContext.AccountContext) t2);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest3, "Observable.combineLatest…ombineFunction(t1, t2) })");
        Observable observableCombineLatest4 = Observable.combineLatest(requestInputsObs, observableRefCount, observableCombineLatest2, observableCombineLatest, observableCombineLatest3, this.rxFactory.convertToObservable(this.cryptoExperimentsStore.streamCryptoEnteredAmountAllOrderTypesExperiment()), new Function6<T1, T2, T3, T4, T5, T6, R>() { // from class: com.robinhood.shared.trade.crypto.context.CryptoOrderContextFactory$create$$inlined$combineLatest$4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function6
            public final R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                Intrinsics.checkParameterIsNotNull(t4, "t4");
                Intrinsics.checkParameterIsNotNull(t5, "t5");
                Intrinsics.checkParameterIsNotNull(t6, "t6");
                boolean zBooleanValue = ((Boolean) t6).booleanValue();
                CryptoOrderContext.RequestContext requestContext = (CryptoOrderContext.RequestContext) t4;
                CryptoOrderContext.AccountContext accountContext = (CryptoOrderContext.AccountContext) t3;
                UiCurrencyPair uiCurrencyPair = (UiCurrencyPair) t2;
                RequestInputs requestInputs = (RequestInputs) t1;
                return (R) CryptoOrderContextFactory.INSTANCE.createRequestData(staticInputs, requestInputs, uiCurrencyPair, accountContext, requestContext, (CryptoOrderContext.OrderInfo) t5, zBooleanValue);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest4, "Observable.combineLatest…1, t2, t3, t4, t5, t6) })");
        Observable observableJust = Observable.just(eventScreen);
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        Observable<CryptoOrderContext> observableCombineLatest5 = Observable.combineLatest(observableJust, observableCombineLatest4, observableCombineLatest2, observableCombineLatest, observableCombineLatest3, new Function5<T1, T2, T3, T4, T5, R>() { // from class: com.robinhood.shared.trade.crypto.context.CryptoOrderContextFactory$create$$inlined$combineLatest$5
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function5
            public final R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                Intrinsics.checkParameterIsNotNull(t4, "t4");
                Intrinsics.checkParameterIsNotNull(t5, "t5");
                return (R) new CryptoOrderContext((Screen) t1, (CryptoOrderContext.RequestData) t2, (CryptoOrderContext.AccountContext) t3, (CryptoOrderContext.RequestContext) t4, (CryptoOrderContext.OrderInfo) t5);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest5, "Observable.combineLatest…on(t1, t2, t3, t4, t5) })");
        return observableCombineLatest5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow create$lambda$2(CryptoOrderContextFactory cryptoOrderContextFactory, CryptoAccountSwitcherLocation.WithCurrencyPair location, String str, UUID uuid) {
        Intrinsics.checkNotNullParameter(location, "location");
        return Operators.toOptionals(cryptoOrderContextFactory.cryptoAccountProvider.streamCryptoAccount(location));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow create$lambda$6(CryptoOrderContextFactory cryptoOrderContextFactory, CryptoAccountSwitcherLocation.WithCurrencyPair withCurrencyPair, String str, UUID uuid) {
        Intrinsics.checkNotNullParameter(withCurrencyPair, "<unused var>");
        if (str != null) {
            final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(cryptoOrderContextFactory.marginSettingsStore.streamMarginSettings(str)), Integer.MAX_VALUE, null, 2, null);
            return FlowKt.distinctUntilChanged(FlowKt.onStart(new Flow<Optional<? extends Boolean>>() { // from class: com.robinhood.shared.trade.crypto.context.CryptoOrderContextFactory$create$lambda$6$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Optional<? extends Boolean>> flowCollector, Continuation continuation) {
                    Object objCollect = flowBuffer$default.collect(new C401042(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.trade.crypto.context.CryptoOrderContextFactory$create$lambda$6$$inlined$map$1$2 */
                public static final class C401042<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.context.CryptoOrderContextFactory$create$lambda$6$$inlined$map$1$2", m3645f = "CryptoOrderContextFactory.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.shared.trade.crypto.context.CryptoOrderContextFactory$create$lambda$6$$inlined$map$1$2$1, reason: invalid class name */
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
                            return C401042.this.emit(null, this);
                        }
                    }

                    public C401042(FlowCollector flowCollector) {
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
                            Optional optionalAsOptional = Optional3.asOptional(boxing.boxBoolean(((MarginSettings) obj).isMarginInvestingEnabled()));
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
            }, new CryptoOrderContextFactory$create$isMarginInvestingEnabledObs$2$2(null)));
        }
        throw new IllegalStateException("RHS account number is required for MIB margin settings.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow create$lambda$7(CryptoOrderContextFactory cryptoOrderContextFactory, CryptoAccountSwitcherLocation.WithCurrencyPair withCurrencyPair, String str, UUID uuid) {
        Intrinsics.checkNotNullParameter(withCurrencyPair, "<unused var>");
        if (str != null) {
            return Context7.buffer$default(RxConvert.asFlow(cryptoOrderContextFactory.unifiedAccountStore.streamAccount(str)), Integer.MAX_VALUE, null, 2, null);
        }
        throw new IllegalStateException("RHS account number is required for MIB unified account flow");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow create$lambda$8(CryptoOrderContextFactory cryptoOrderContextFactory, Observable observable, StaticInputs staticInputs, CryptoAccountSwitcherLocation.WithCurrencyPair withCurrencyPair, String str, UUID uuid) {
        Intrinsics.checkNotNullParameter(withCurrencyPair, "<unused var>");
        return Context7.buffer$default(RxConvert.asFlow(cryptoOrderContextFactory.feeEstimationObservable$feature_trade_crypto_externalDebug(observable, staticInputs, uuid)), Integer.MAX_VALUE, null, 2, null);
    }

    public final <T> Observable<T> switchOnMib$feature_trade_crypto_externalDebug(Flow<? extends CryptoAccountSwitcherLocation.WithCurrencyPair> locationFlow, StaticInputs staticInputs, Flow<? extends T> nonMibFlow, Function3<? super CryptoAccountSwitcherLocation.WithCurrencyPair, ? super String, ? super UUID, ? extends Flow<? extends T>> mibFlow) {
        Intrinsics.checkNotNullParameter(locationFlow, "locationFlow");
        Intrinsics.checkNotNullParameter(staticInputs, "staticInputs");
        Intrinsics.checkNotNullParameter(nonMibFlow, "nonMibFlow");
        Intrinsics.checkNotNullParameter(mibFlow, "mibFlow");
        return this.rxFactory.convertToObservable(FlowKt.distinctUntilChanged(FlowKt.transformLatest(this.cryptoExperimentsStore.streamCryptoMibExperiment(), new CryptoOrderContextFactory$switchOnMib$$inlined$flatMapLatest$1(null, locationFlow, nonMibFlow, this, mibFlow))));
    }

    public final Observable<Quote> cryptoQuoteObservable$feature_trade_crypto_externalDebug(Observable<RequestInputs> requestInputsObs, final StaticInputs staticInputs) {
        Intrinsics.checkNotNullParameter(requestInputsObs, "requestInputsObs");
        Intrinsics.checkNotNullParameter(staticInputs, "staticInputs");
        Observable<Quote> observableCryptoL2QuoteObservable$feature_trade_crypto_externalDebug = cryptoL2QuoteObservable$feature_trade_crypto_externalDebug(requestInputsObs, staticInputs);
        Observable<R> map = requestInputsObs.map(new Function() { // from class: com.robinhood.shared.trade.crypto.context.CryptoOrderContextFactory$cryptoQuoteObservable$1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(RequestInputs it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.getOrderPrices().getOrderType() == CryptoOrderType.MARKET);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable<R> observableFlatMap = takeFirstThenDebounce(requestInputsObs).flatMap(new Function() { // from class: com.robinhood.shared.trade.crypto.context.CryptoOrderContextFactory$cryptoQuoteObservable$2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends CryptoQuote> apply(RequestInputs requestInputs) {
                Intrinsics.checkNotNullParameter(requestInputs, "requestInputs");
                return this.this$0.cryptoQuoteStore.getPollCryptoQuote().asObservable(new CryptoQuoteStore.CryptoQuoteArgs(staticInputs.getCurrencyPairId(), requestInputs.getMonetizationModel(), QuoteTouchPoint.TRADE));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        Observable<Quote> observableRefCount = ObservablesKt.connectWhen(observableCryptoL2QuoteObservable$feature_trade_crypto_externalDebug, map, observableFlatMap).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        return observableRefCount;
    }

    public final Observable<Quote> cryptoL2QuoteObservable$feature_trade_crypto_externalDebug(Observable<RequestInputs> requestInputsObs, final StaticInputs staticInputs) {
        Intrinsics.checkNotNullParameter(requestInputsObs, "requestInputsObs");
        Intrinsics.checkNotNullParameter(staticInputs, "staticInputs");
        Observable<Quote> observableSwitchMap = takeFirstThenDebounce(requestInputsObs).map(new Function() { // from class: com.robinhood.shared.trade.crypto.context.CryptoOrderContextFactory$cryptoL2QuoteObservable$1
            @Override // io.reactivex.functions.Function
            public final CryptoL2QuoteStore.Params apply(RequestInputs requestInputs) {
                Intrinsics.checkNotNullParameter(requestInputs, "requestInputs");
                if (requestInputs instanceof RequestInputs.AsAsset) {
                    RequestInputs.AsAsset asAsset = (RequestInputs.AsAsset) requestInputs;
                    return new CryptoL2QuoteStore.Params(staticInputs.getCurrencyPairId(), ApiCryptoOrderInputType.BASE, asAsset.getSide(), asAsset.getPurchaseSize(), requestInputs.getMonetizationModel(), QuoteTouchPoint.TRADE);
                }
                if (!(requestInputs instanceof RequestInputs.AsQuote)) {
                    throw new NoWhenBranchMatchedException();
                }
                RequestInputs.AsQuote asQuote = (RequestInputs.AsQuote) requestInputs;
                return new CryptoL2QuoteStore.Params(staticInputs.getCurrencyPairId(), ApiCryptoOrderInputType.QUOTE, asQuote.getSide(), asQuote.getPurchaseCost(), requestInputs.getMonetizationModel(), QuoteTouchPoint.TRADE);
            }
        }).switchMap(new Function() { // from class: com.robinhood.shared.trade.crypto.context.CryptoOrderContextFactory$cryptoL2QuoteObservable$2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Quote> apply(CryptoL2QuoteStore.Params it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.this$0.cryptoL2QuoteStore.pollCryptoL2Quote(it);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    private final Observable<RequestInputs> takeFirstThenDebounce(Observable<RequestInputs> observable) {
        return Observable.merge(observable.take(1L), observable.skip(1L).debounce(500L, TimeUnit.MILLISECONDS));
    }

    /* renamed from: feeEstimationObservable$feature_trade_crypto_externalDebug$default */
    public static /* synthetic */ Observable m2848x14f6f1b(CryptoOrderContextFactory cryptoOrderContextFactory, Observable observable, StaticInputs staticInputs, UUID uuid, int i, Object obj) {
        if ((i & 4) != 0) {
            uuid = null;
        }
        return cryptoOrderContextFactory.feeEstimationObservable$feature_trade_crypto_externalDebug(observable, staticInputs, uuid);
    }

    public final Observable<Optional<UiFeeEstimation>> feeEstimationObservable$feature_trade_crypto_externalDebug(Observable<RequestInputs> requestInputsObs, final StaticInputs staticInputs, final UUID cryptoAccountId) {
        Intrinsics.checkNotNullParameter(requestInputsObs, "requestInputsObs");
        Intrinsics.checkNotNullParameter(staticInputs, "staticInputs");
        Observable observableSwitchMap = requestInputsObs.distinctUntilChanged((Function<? super RequestInputs, K>) new Function() { // from class: com.robinhood.shared.trade.crypto.context.CryptoOrderContextFactory$feeEstimationObservable$1
            @Override // io.reactivex.functions.Function
            public final MonetizationModel apply(RequestInputs requestInputs) {
                Intrinsics.checkNotNullParameter(requestInputs, "requestInputs");
                return requestInputs.getMonetizationModel();
            }
        }).switchMap(new Function() { // from class: com.robinhood.shared.trade.crypto.context.CryptoOrderContextFactory$feeEstimationObservable$2

            /* compiled from: CryptoOrderContextFactory.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[MonetizationModel.values().length];
                    try {
                        iArr[MonetizationModel.FEE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[MonetizationModel.REBATE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<UiFeeEstimation>> apply(RequestInputs requestInputs) {
                Intrinsics.checkNotNullParameter(requestInputs, "requestInputs");
                int i = WhenMappings.$EnumSwitchMapping$0[requestInputs.getMonetizationModel().ordinal()];
                if (i == 1) {
                    return RxFactory.DefaultImpls.rxSingle$default(this.this$0.rxFactory, null, new C401081(this.this$0, staticInputs, requestInputs, cryptoAccountId, null), 1, null).toObservable();
                }
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return Observable.just(Optional2.INSTANCE);
            }

            /* compiled from: CryptoOrderContextFactory.kt */
            @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/crypto/ui/fee/UiFeeEstimation;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.context.CryptoOrderContextFactory$feeEstimationObservable$2$1", m3645f = "CryptoOrderContextFactory.kt", m3646l = {418}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.context.CryptoOrderContextFactory$feeEstimationObservable$2$1 */
            static final class C401081 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends UiFeeEstimation>>, Object> {
                final /* synthetic */ UUID $cryptoAccountId;
                final /* synthetic */ RequestInputs $requestInputs;
                final /* synthetic */ StaticInputs $staticInputs;
                int label;
                final /* synthetic */ CryptoOrderContextFactory this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C401081(CryptoOrderContextFactory cryptoOrderContextFactory, StaticInputs staticInputs, RequestInputs requestInputs, UUID uuid, Continuation<? super C401081> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoOrderContextFactory;
                    this.$staticInputs = staticInputs;
                    this.$requestInputs = requestInputs;
                    this.$cryptoAccountId = uuid;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C401081(this.this$0, this.$staticInputs, this.$requestInputs, this.$cryptoAccountId, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends UiFeeEstimation>> continuation) {
                    return invoke2(coroutineScope, (Continuation<? super Optional<UiFeeEstimation>>) continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<UiFeeEstimation>> continuation) {
                    return ((C401081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        CryptoFeeStore cryptoFeeStore = this.this$0.cryptoFeeStore;
                        UUID currencyPairId = this.$staticInputs.getCurrencyPairId();
                        OrderSide side = this.$requestInputs.getSide();
                        UUID uuid = this.$cryptoAccountId;
                        this.label = 1;
                        obj = cryptoFeeStore.getFeeEstimation(currencyPairId, side, uuid, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Optional3.asOptional(obj);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    /* compiled from: CryptoOrderContextFactory.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u001d\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\b\u0017J\u0014\u0010\u0018\u001a\u00020\u0019*\u00020\u00192\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContextFactory$Companion;", "", "<init>", "()V", "REQUEST_INPUTS_DEBOUNCE_MILLIS", "", "createRequestData", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext$RequestData;", "staticInputs", "Lcom/robinhood/shared/trade/crypto/validation/StaticInputs;", "inputs", "Lcom/robinhood/shared/trade/crypto/validation/RequestInputs;", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "accountContext", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext$AccountContext;", "requestContext", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext$RequestContext;", "orderInfo", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext$OrderInfo;", "isEnteredAmountAllOrderTypesEnabled", "", "createOrderInfo", "createOrderInfo$feature_trade_crypto_externalDebug", "roundToOrderQuantityIncrement", "Ljava/math/BigDecimal;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CryptoOrderContext.RequestData createRequestData(StaticInputs staticInputs, RequestInputs inputs, UiCurrencyPair currencyPair, CryptoOrderContext.AccountContext accountContext, CryptoOrderContext.RequestContext requestContext, CryptoOrderContext.OrderInfo orderInfo, boolean isEnteredAmountAllOrderTypesEnabled) {
            BigDecimal scale;
            BigDecimal scale2;
            BigDecimal bigDecimal;
            Intrinsics.checkNotNullParameter(staticInputs, "staticInputs");
            Intrinsics.checkNotNullParameter(inputs, "inputs");
            Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
            Intrinsics.checkNotNullParameter(accountContext, "accountContext");
            Intrinsics.checkNotNullParameter(requestContext, "requestContext");
            Intrinsics.checkNotNullParameter(orderInfo, "orderInfo");
            RoundingMode roundingMode = requestContext.getRequestInputs().getSide().getRoundingMode();
            int allowedPriceScale = currencyPair.getAllowedPriceScale();
            List<RequestInputs.TaxLot> selectedTaxLots = null;
            BigDecimal purchaseCost = ((inputs instanceof RequestInputs.AsQuote) && (isEnteredAmountAllOrderTypesEnabled || ((RequestInputs.AsQuote) inputs).getOrderPrices().getOrderType() == CryptoOrderType.MARKET)) ? ((RequestInputs.AsQuote) inputs).getPurchaseCost() : null;
            CryptoOrderPrices orderPrices = inputs.getOrderPrices();
            if ((orderPrices instanceof CryptoOrderPrices.Market) || (orderPrices instanceof CryptoOrderPrices.Limit) || (orderPrices instanceof CryptoOrderPrices.StopLoss)) {
                scale = null;
            } else {
                if (!(orderPrices instanceof CryptoOrderPrices.StopLimit)) {
                    throw new NoWhenBranchMatchedException();
                }
                scale = ((CryptoOrderPrices.StopLimit) orderPrices).getLimitPrice().setScale(allowedPriceScale, roundingMode);
            }
            CryptoOrderPrices orderPrices2 = inputs.getOrderPrices();
            if ((orderPrices2 instanceof CryptoOrderPrices.Market) || (orderPrices2 instanceof CryptoOrderPrices.Limit)) {
                bigDecimal = null;
            } else {
                if (orderPrices2 instanceof CryptoOrderPrices.StopLoss) {
                    scale2 = ((CryptoOrderPrices.StopLoss) orderPrices2).getStopPrice().setScale(allowedPriceScale, roundingMode);
                } else {
                    if (!(orderPrices2 instanceof CryptoOrderPrices.StopLimit)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    scale2 = ((CryptoOrderPrices.StopLimit) orderPrices2).getStopPrice().setScale(allowedPriceScale, roundingMode);
                }
                bigDecimal = scale2;
            }
            BigDecimal collaredPrice = orderInfo.getCollaredPrice();
            BigDecimal orderQuantity = orderInfo.getOrderQuantity();
            UUID currencyPairId = staticInputs.getCurrencyPairId();
            UUID clientRefId = staticInputs.getClientRefId();
            OrderSide side = inputs.getSide();
            OrderTimeInForce timeInForce = inputs.getTimeInForce();
            CryptoOrderType orderType = inputs.getOrderPrices().getOrderType();
            boolean zIsQuantityCollared = orderInfo.isQuantityCollared();
            UiCryptoTradeBonusEligibility tradeBonusEligibility = inputs.getTradeBonusEligibility();
            CryptoAccount cryptoAccount = accountContext.getCryptoAccount();
            String id = cryptoAccount != null ? cryptoAccount.getId() : null;
            if (id == null) {
                id = "";
            }
            String str = id;
            UiFeeEstimation uiFeeEstimation = requestContext.getUiFeeEstimation();
            BigDecimal feeRatio = uiFeeEstimation != null ? uiFeeEstimation.getFeeRatio() : null;
            if (inputs instanceof RequestInputs.AsAsset) {
                selectedTaxLots = ((RequestInputs.AsAsset) inputs).getSelectedTaxLots();
            } else if (!(inputs instanceof RequestInputs.AsQuote)) {
                throw new NoWhenBranchMatchedException();
            }
            return new CryptoOrderContext.RequestData(collaredPrice, orderQuantity, currencyPairId, clientRefId, side, timeInForce, orderType, zIsQuantityCollared, purchaseCost, tradeBonusEligibility, str, bigDecimal, scale, feeRatio, selectedTaxLots);
        }

        /* JADX WARN: Removed duplicated region for block: B:83:0x01c3  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x01c6  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01c9  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x01f0  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x01f7  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x01fb  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final CryptoOrderContext.OrderInfo createOrderInfo$feature_trade_crypto_externalDebug(CryptoOrderContext.RequestContext requestContext, CryptoOrderContext.AccountContext accountContext) {
            BigDecimal sell_collar_factor;
            BigDecimal scale;
            BigDecimal feeAmount;
            BigDecimal bigDecimalSafeDivide;
            BigDecimal purchaseCost;
            BigDecimal bigDecimal;
            boolean z;
            BigDecimal bigDecimal2;
            String currency$default;
            BigDecimal bigDecimalSafeMultiply;
            BigDecimal feeAmount2;
            Money buyingPower;
            Intrinsics.checkNotNullParameter(requestContext, "requestContext");
            Intrinsics.checkNotNullParameter(accountContext, "accountContext");
            UiCurrencyPair currencyPair = requestContext.getCurrencyPair();
            RequestInputs requestInputs = requestContext.getRequestInputs();
            int decimalScale = currencyPair.getAssetCurrency().getDecimalScale();
            int iCalculatePrecision = OrderInfoCalculations.INSTANCE.calculatePrecision(currencyPair);
            boolean z2 = requestInputs.getSide() == OrderSide.BUY;
            boolean z3 = requestInputs.getOrderPrices().getOrderType() == CryptoOrderType.MARKET || requestInputs.getOrderPrices().getOrderType() == CryptoOrderType.STOP_LOSS;
            BigDecimal priceByOrderType = requestContext.getPriceByOrderType();
            if (currencyPair.getMarketOrdersOnly()) {
                sell_collar_factor = BigDecimal.ONE;
            } else if (z2) {
                sell_collar_factor = CryptoOrder.INSTANCE.getBUY_COLLAR_FACTOR();
            } else {
                sell_collar_factor = CryptoOrder.INSTANCE.getSELL_COLLAR_FACTOR();
            }
            BigDecimal bigDecimalMultiply = z3 ? priceByOrderType.multiply(sell_collar_factor) : priceByOrderType;
            int allowedPriceScale = currencyPair.getAllowedPriceScale();
            RoundingMode roundingMode = RoundingMode.HALF_UP;
            BigDecimal scale2 = bigDecimalMultiply.setScale(allowedPriceScale, roundingMode);
            boolean z4 = requestInputs instanceof RequestInputs.AsQuote;
            if (z4) {
                scale = BigDecimals7.safeDivide(BigDecimals7.coerceScaleAtLeast(((RequestInputs.AsQuote) requestInputs).getPurchaseCost(), iCalculatePrecision), priceByOrderType);
            } else {
                if (!(requestInputs instanceof RequestInputs.AsAsset)) {
                    throw new NoWhenBranchMatchedException();
                }
                RequestInputs.AsAsset asAsset = (RequestInputs.AsAsset) requestInputs;
                if (asAsset.isSellAllOrder()) {
                    scale = asAsset.getPurchaseSize();
                } else {
                    scale = asAsset.getPurchaseSize().setScale(decimalScale, RoundingMode.DOWN);
                }
            }
            BigDecimal bigDecimal3 = scale;
            UiFeeEstimation uiFeeEstimation = requestContext.getUiFeeEstimation();
            if (uiFeeEstimation != null) {
                MonetizationFeeCalculator monetizationFeeCalculator = MonetizationFeeCalculator.INSTANCE;
                Intrinsics.checkNotNull(bigDecimal3);
                feeAmount = monetizationFeeCalculator.getFeeAmount(bigDecimal3, requestContext.getPriceByOrderType(), uiFeeEstimation, requestInputs.getSide(), requestInputs.getInputMode());
            } else {
                feeAmount = null;
            }
            BigDecimal bigDecimalApplyFeeToQuantity = bigDecimal3;
            if (feeAmount != null) {
                MonetizationFeeCalculator monetizationFeeCalculator2 = MonetizationFeeCalculator.INSTANCE;
                if (monetizationFeeCalculator2.shouldApplyFee(requestInputs)) {
                    Intrinsics.checkNotNull(bigDecimalApplyFeeToQuantity);
                    bigDecimalApplyFeeToQuantity = monetizationFeeCalculator2.applyFeeToQuantity(bigDecimalApplyFeeToQuantity, feeAmount, priceByOrderType, requestContext.getCurrencyPair());
                }
            }
            Intrinsics.checkNotNull(bigDecimalApplyFeeToQuantity);
            BigDecimal bigDecimalRoundToOrderQuantityIncrement = roundToOrderQuantityIncrement(bigDecimalApplyFeeToQuantity, currencyPair);
            if (z4) {
                bigDecimalSafeDivide = BigDecimals7.safeDivide(BigDecimals7.coerceScaleAtLeast(((RequestInputs.AsQuote) requestInputs).getPurchaseCost(), iCalculatePrecision), scale2);
            } else {
                if (!(requestInputs instanceof RequestInputs.AsAsset)) {
                    throw new NoWhenBranchMatchedException();
                }
                bigDecimalSafeDivide = BigDecimals7.safeDivide(BigDecimals7.coerceScaleAtLeast(((RequestInputs.AsAsset) requestInputs).getPurchaseSize().multiply(priceByOrderType), iCalculatePrecision), scale2);
            }
            if (feeAmount != null) {
                MonetizationFeeCalculator monetizationFeeCalculator3 = MonetizationFeeCalculator.INSTANCE;
                if (monetizationFeeCalculator3.shouldApplyFee(requestInputs)) {
                    Intrinsics.checkNotNull(scale2);
                    bigDecimalSafeDivide = monetizationFeeCalculator3.applyFeeToQuantity(bigDecimalSafeDivide, feeAmount, scale2, requestContext.getCurrencyPair());
                }
            }
            BigDecimal bigDecimalRoundToOrderQuantityIncrement2 = roundToOrderQuantityIncrement(bigDecimalSafeDivide, currencyPair);
            MonetizationFeeCalculator monetizationFeeCalculator4 = MonetizationFeeCalculator.INSTANCE;
            boolean z5 = requestInputs instanceof RequestInputs.AsAsset;
            if (z5) {
                purchaseCost = ((RequestInputs.AsAsset) requestInputs).getPurchaseSize().multiply(priceByOrderType);
                Intrinsics.checkNotNullExpressionValue(purchaseCost, "multiply(...)");
            } else {
                if (!z4) {
                    throw new NoWhenBranchMatchedException();
                }
                purchaseCost = ((RequestInputs.AsQuote) requestInputs).getPurchaseCost();
            }
            BigDecimal totalCost = monetizationFeeCalculator4.getTotalCost(purchaseCost, feeAmount, requestContext);
            CryptoBuyingPower cryptoBuyingPower = accountContext.getCryptoBuyingPower();
            BigDecimal decimalValue = (cryptoBuyingPower == null || (buyingPower = cryptoBuyingPower.getBuyingPower()) == null) ? null : buyingPower.getDecimalValue();
            if (decimalValue != null && z3 && z2) {
                if (z4) {
                    bigDecimalSafeMultiply = BigDecimals7.safeMultiply(BigDecimals7.safeDivide(((RequestInputs.AsQuote) requestInputs).getPurchaseCost(), priceByOrderType), scale2);
                } else {
                    if (!z5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bigDecimalSafeMultiply = BigDecimals7.safeMultiply(((RequestInputs.AsAsset) requestInputs).getPurchaseSize(), scale2);
                }
                UiFeeEstimation uiFeeEstimation2 = requestContext.getUiFeeEstimation();
                if (uiFeeEstimation2 != null) {
                    Intrinsics.checkNotNull(scale2);
                    feeAmount2 = monetizationFeeCalculator4.getFeeAmount(bigDecimalRoundToOrderQuantityIncrement2, scale2, uiFeeEstimation2, requestInputs.getSide(), requestInputs.getInputMode());
                    bigDecimal = scale2;
                } else {
                    bigDecimal = scale2;
                    feeAmount2 = null;
                }
                if (monetizationFeeCalculator4.getTotalCost(bigDecimalSafeMultiply, feeAmount2, requestContext).compareTo(decimalValue) > 0 && totalCost.compareTo(decimalValue) <= 0) {
                    z = true;
                }
                BigDecimal bigDecimal4 = !z ? bigDecimalRoundToOrderQuantityIncrement2 : bigDecimalRoundToOrderQuantityIncrement;
                if (feeAmount == null) {
                    bigDecimal2 = feeAmount;
                    currency$default = CurrencyDefinitions.formatCurrency$default(requestContext.getCurrencyPair().getQuoteCurrency(), bigDecimal2, false, false, roundingMode, 0, null, null, false, false, false, false, 2038, null);
                } else {
                    bigDecimal2 = feeAmount;
                    currency$default = null;
                }
                Intrinsics.checkNotNull(bigDecimal);
                if (!z4) {
                    bigDecimalRoundToOrderQuantityIncrement = bigDecimal4;
                } else if (!z5) {
                    throw new NoWhenBranchMatchedException();
                }
                return new CryptoOrderContext.OrderInfo(bigDecimal2, currency$default, totalCost, bigDecimalRoundToOrderQuantityIncrement, bigDecimal4, priceByOrderType, bigDecimal, z);
            }
            bigDecimal = scale2;
            z = false;
            if (!z) {
            }
            if (feeAmount == null) {
            }
            Intrinsics.checkNotNull(bigDecimal);
            if (!z4) {
            }
            return new CryptoOrderContext.OrderInfo(bigDecimal2, currency$default, totalCost, bigDecimalRoundToOrderQuantityIncrement, bigDecimal4, priceByOrderType, bigDecimal, z);
        }

        private final BigDecimal roundToOrderQuantityIncrement(BigDecimal bigDecimal, UiCurrencyPair uiCurrencyPair) {
            BigDecimal minOrderQuantityIncrement = uiCurrencyPair.getMinOrderQuantityIncrement();
            RoundingMode roundingMode = RoundingMode.DOWN;
            BigDecimal scale = BigDecimals7.roundToInterval(bigDecimal, minOrderQuantityIncrement, roundingMode).setScale(uiCurrencyPair.getAssetCurrency().getDecimalScale(), roundingMode);
            Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
            return scale;
        }
    }
}
