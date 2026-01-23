package com.robinhood.shared.trade.crypto.p397ui.orderTypeSelector;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.regiongate.RecurringInvestmentRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoAccountPreferencesStore;
import com.robinhood.librobinhood.data.store.CryptoAccountStore;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.librobinhood.data.store.TaxlotabilityStore;
import com.robinhood.librobinhood.data.store.fee.monetizationModel.CryptoOrderMonetizationModelProvider;
import com.robinhood.models.crypto.p314db.CryptoAccount;
import com.robinhood.models.crypto.p314db.CryptoAccountPreferences;
import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.bonfire.InstrumentRecurringTradability;
import com.robinhood.prefs.IntPreference;
import com.robinhood.rosetta.converters.orders.Orders2;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.CryptoOrderContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.trade.crypto.dagger.CryptoUsTaxLotsOrderTypeDisplayCountPref;
import com.robinhood.shared.trade.crypto.p397ui.orderTypeSelector.CryptoOrderTypeSelectorEvent;
import com.robinhood.shared.trade.crypto.p397ui.orderTypeSelector.CryptoOrderTypeSelectorFragment;
import com.robinhood.shared.trade.crypto.p397ui.orderTypeSelector.CryptoOrderTypeSelectorViewState2;
import com.robinhood.store.base.InstrumentRecurringTradabilityStore;
import com.robinhood.utils.Optional;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import nummus.p512v1.TaxlotabilityResponseDto;
import nummus.p512v1.TaxlotabilityStateDto;
import rosetta.order.Side;

/* compiled from: CryptoOrderTypeSelectorDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 82\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u00018B{\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!¢\u0006\u0004\b\"\u0010#J\b\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020/H\u0016J\u000e\u00101\u001a\u00020/2\u0006\u00102\u001a\u000203J\u0012\u00104\u001a\u00020/2\b\u00105\u001a\u0004\u0018\u000106H\u0002J\u0006\u00107\u001a\u00020/R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010&\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010*\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00069"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorDataState;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorViewState;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "stateProvider", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "recurringTradabilityStore", "Lcom/robinhood/store/base/InstrumentRecurringTradabilityStore;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "cryptoOrderMonetizationModelProvider", "Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/CryptoOrderMonetizationModelProvider;", "cryptoAccountPreferencesStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountPreferencesStore;", "cryptoUsTaxLotsOrderTypeDisplayCountPref", "Lcom/robinhood/prefs/IntPreference;", "taxlotabilityStore", "Lcom/robinhood/librobinhood/data/store/TaxlotabilityStore;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "<init>", "(Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;Lcom/robinhood/store/base/InstrumentRecurringTradabilityStore;Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/CryptoOrderMonetizationModelProvider;Lcom/robinhood/librobinhood/data/store/CryptoAccountPreferencesStore;Lcom/robinhood/prefs/IntPreference;Lcom/robinhood/librobinhood/data/store/TaxlotabilityStore;Lcom/robinhood/shared/app/type/AppType;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "onStart", "", "onCreate", "onRowTapped", "tapAction", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState$TapAction;", "handleRecurringInvestmentTapped", "tradability", "Lcom/robinhood/models/db/bonfire/InstrumentRecurringTradability;", "onBackPressed", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoOrderTypeSelectorDuxo extends BaseDuxo3<CryptoOrderTypeSelectorDataState, CryptoOrderTypeSelectorViewState, CryptoOrderTypeSelectorEvent> implements HasSavedState {
    private final AppType appType;
    private final CryptoAccountPreferencesStore cryptoAccountPreferencesStore;
    private final CryptoAccountStore cryptoAccountStore;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final CryptoOrderMonetizationModelProvider cryptoOrderMonetizationModelProvider;
    private final CryptoQuoteStore cryptoQuoteStore;
    private final IntPreference cryptoUsTaxLotsOrderTypeDisplayCountPref;
    private final CurrencyPairV2Store currencyPairStore;
    private final InstrumentRecurringTradabilityStore recurringTradabilityStore;
    private final RegionGateProvider regionGateProvider;
    private final SavedStateHandle savedStateHandle;
    private final TaxlotabilityStore taxlotabilityStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoOrderTypeSelectorDuxo(CryptoOrderTypeSelectorDuxo5 stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, CurrencyPairV2Store currencyPairStore, InstrumentRecurringTradabilityStore recurringTradabilityStore, CryptoQuoteStore cryptoQuoteStore, RegionGateProvider regionGateProvider, CryptoExperimentsStore cryptoExperimentsStore, CryptoAccountStore cryptoAccountStore, CryptoOrderMonetizationModelProvider cryptoOrderMonetizationModelProvider, CryptoAccountPreferencesStore cryptoAccountPreferencesStore, @CryptoUsTaxLotsOrderTypeDisplayCountPref IntPreference cryptoUsTaxLotsOrderTypeDisplayCountPref, TaxlotabilityStore taxlotabilityStore, AppType appType) {
        super(new CryptoOrderTypeSelectorDataState(appType == AppType.RHC, ((CryptoOrderTypeSelectorFragment.Args) INSTANCE.getArgs(savedStateHandle)).getSide(), null, null, null, false, null, false, null, null, cryptoUsTaxLotsOrderTypeDisplayCountPref.get(), 1020, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(recurringTradabilityStore, "recurringTradabilityStore");
        Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        Intrinsics.checkNotNullParameter(cryptoOrderMonetizationModelProvider, "cryptoOrderMonetizationModelProvider");
        Intrinsics.checkNotNullParameter(cryptoAccountPreferencesStore, "cryptoAccountPreferencesStore");
        Intrinsics.checkNotNullParameter(cryptoUsTaxLotsOrderTypeDisplayCountPref, "cryptoUsTaxLotsOrderTypeDisplayCountPref");
        Intrinsics.checkNotNullParameter(taxlotabilityStore, "taxlotabilityStore");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.savedStateHandle = savedStateHandle;
        this.currencyPairStore = currencyPairStore;
        this.recurringTradabilityStore = recurringTradabilityStore;
        this.cryptoQuoteStore = cryptoQuoteStore;
        this.regionGateProvider = regionGateProvider;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.cryptoAccountStore = cryptoAccountStore;
        this.cryptoOrderMonetizationModelProvider = cryptoOrderMonetizationModelProvider;
        this.cryptoAccountPreferencesStore = cryptoAccountPreferencesStore;
        this.cryptoUsTaxLotsOrderTypeDisplayCountPref = cryptoUsTaxLotsOrderTypeDisplayCountPref;
        this.taxlotabilityStore = taxlotabilityStore;
        this.appType = appType;
    }

    public final Screen getEventScreen() {
        Screen.Name name = Screen.Name.CRYPTO_SELECT_ORDER_KIND_PAGE;
        String string2 = ((CryptoOrderTypeSelectorFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getCurrencyPairId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Screen(name, null, string2, null, 10, null);
    }

    public final Context getScreenEventContext() {
        Companion companion = INSTANCE;
        Side protobuf = Orders2.toProtobuf(((CryptoOrderTypeSelectorFragment.Args) companion.getArgs((HasSavedState) this)).getSide());
        CryptoOrderContext.CryptoOrderType protobuf2 = Orders2.toProtobuf(((CryptoOrderTypeSelectorFragment.Args) companion.getArgs((HasSavedState) this)).getOrderType());
        String string2 = ((CryptoOrderTypeSelectorFragment.Args) companion.getArgs((HasSavedState) this)).getCurrencyPairId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String string3 = ((CryptoOrderTypeSelectorFragment.Args) companion.getArgs((HasSavedState) this)).getOrderUuid().toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new CryptoOrderContext(protobuf2, protobuf, string2, string3, 0.0d, null, null, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, null, null, 0.0d, null, 1048560, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -2049, -1, -1, 16383, null);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C404821(((CryptoOrderTypeSelectorFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getCurrencyPairId(), null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C404832(null), 3, null);
        this.cryptoAccountStore.refreshIfNull();
        LifecycleHost.DefaultImpls.bind$default(this, asObservable(this.cryptoAccountStore.streamAccountOptional()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderTypeSelectorDuxo.onStart$lambda$0(this.f$0, (Optional) obj);
            }
        });
    }

    /* compiled from: CryptoOrderTypeSelectorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onStart$1", m3645f = "CryptoOrderTypeSelectorDuxo.kt", m3646l = {96}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onStart$1 */
    static final class C404821 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $currencyPairId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C404821(UUID uuid, Continuation<? super C404821> continuation) {
            super(2, continuation);
            this.$currencyPairId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderTypeSelectorDuxo.this.new C404821(this.$currencyPairId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C404821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<CryptoQuote> flowAsFlow = CryptoOrderTypeSelectorDuxo.this.cryptoQuoteStore.getStreamCryptoQuote().asFlow(new CryptoQuoteStore.CryptoQuoteArgs(this.$currencyPairId, null, null, 6, null));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoOrderTypeSelectorDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowAsFlow, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoOrderTypeSelectorDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "cryptoQuote", "Lcom/robinhood/models/crypto/db/CryptoQuote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onStart$1$1", m3645f = "CryptoOrderTypeSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoQuote, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoOrderTypeSelectorDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoOrderTypeSelectorDuxo cryptoOrderTypeSelectorDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderTypeSelectorDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoQuote cryptoQuote, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(cryptoQuote, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoOrderTypeSelectorDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onStart$1$1$1", m3645f = "CryptoOrderTypeSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onStart$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507901 extends ContinuationImpl7 implements Function2<CryptoOrderTypeSelectorDataState, Continuation<? super CryptoOrderTypeSelectorDataState>, Object> {
                final /* synthetic */ CryptoQuote $cryptoQuote;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507901(CryptoQuote cryptoQuote, Continuation<? super C507901> continuation) {
                    super(2, continuation);
                    this.$cryptoQuote = cryptoQuote;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507901 c507901 = new C507901(this.$cryptoQuote, continuation);
                    c507901.L$0 = obj;
                    return c507901;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoOrderTypeSelectorDataState cryptoOrderTypeSelectorDataState, Continuation<? super CryptoOrderTypeSelectorDataState> continuation) {
                    return ((C507901) create(cryptoOrderTypeSelectorDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoOrderTypeSelectorDataState.copy$default((CryptoOrderTypeSelectorDataState) this.L$0, false, null, null, this.$cryptoQuote, null, false, null, false, null, null, 0, 2039, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C507901((CryptoQuote) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoOrderTypeSelectorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onStart$2", m3645f = "CryptoOrderTypeSelectorDuxo.kt", m3646l = {101}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onStart$2 */
    static final class C404832 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C404832(Continuation<? super C404832> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderTypeSelectorDuxo.this.new C404832(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C404832) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowStreamCryptoRecurringOrdersVTExperiment = CryptoOrderTypeSelectorDuxo.this.cryptoExperimentsStore.streamCryptoRecurringOrdersVTExperiment();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoOrderTypeSelectorDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamCryptoRecurringOrdersVTExperiment, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoOrderTypeSelectorDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isEnabled", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onStart$2$1", m3645f = "CryptoOrderTypeSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onStart$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ CryptoOrderTypeSelectorDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoOrderTypeSelectorDuxo cryptoOrderTypeSelectorDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderTypeSelectorDuxo;
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

            /* compiled from: CryptoOrderTypeSelectorDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onStart$2$1$1", m3645f = "CryptoOrderTypeSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onStart$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507911 extends ContinuationImpl7 implements Function2<CryptoOrderTypeSelectorDataState, Continuation<? super CryptoOrderTypeSelectorDataState>, Object> {
                final /* synthetic */ boolean $isEnabled;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507911(boolean z, Continuation<? super C507911> continuation) {
                    super(2, continuation);
                    this.$isEnabled = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507911 c507911 = new C507911(this.$isEnabled, continuation);
                    c507911.L$0 = obj;
                    return c507911;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoOrderTypeSelectorDataState cryptoOrderTypeSelectorDataState, Continuation<? super CryptoOrderTypeSelectorDataState> continuation) {
                    return ((C507911) create(cryptoOrderTypeSelectorDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoOrderTypeSelectorDataState.copy$default((CryptoOrderTypeSelectorDataState) this.L$0, false, null, null, null, null, false, null, this.$isEnabled, null, null, 0, 1919, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C507911(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(CryptoOrderTypeSelectorDuxo cryptoOrderTypeSelectorDuxo, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        cryptoOrderTypeSelectorDuxo.applyMutation(new CryptoOrderTypeSelectorDuxo4((CryptoAccount) optional.component1(), null));
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoOrderTypeSelectorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$1", m3645f = "CryptoOrderTypeSelectorDuxo.kt", m3646l = {118}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$1 */
    static final class C404761 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C404761(Continuation<? super C404761> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderTypeSelectorDuxo.this.new C404761(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C404761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<UiCurrencyPair> flowStreamCurrencyPairFlow = CryptoOrderTypeSelectorDuxo.this.currencyPairStore.streamCurrencyPairFlow(((CryptoOrderTypeSelectorFragment.Args) CryptoOrderTypeSelectorDuxo.INSTANCE.getArgs((HasSavedState) CryptoOrderTypeSelectorDuxo.this)).getCurrencyPairId());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoOrderTypeSelectorDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamCurrencyPairFlow, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoOrderTypeSelectorDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$1$1", m3645f = "CryptoOrderTypeSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UiCurrencyPair, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoOrderTypeSelectorDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoOrderTypeSelectorDuxo cryptoOrderTypeSelectorDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderTypeSelectorDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UiCurrencyPair uiCurrencyPair, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(uiCurrencyPair, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoOrderTypeSelectorDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$1$1$1", m3645f = "CryptoOrderTypeSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507851 extends ContinuationImpl7 implements Function2<CryptoOrderTypeSelectorDataState, Continuation<? super CryptoOrderTypeSelectorDataState>, Object> {
                final /* synthetic */ UiCurrencyPair $currencyPair;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507851(UiCurrencyPair uiCurrencyPair, Continuation<? super C507851> continuation) {
                    super(2, continuation);
                    this.$currencyPair = uiCurrencyPair;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507851 c507851 = new C507851(this.$currencyPair, continuation);
                    c507851.L$0 = obj;
                    return c507851;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoOrderTypeSelectorDataState cryptoOrderTypeSelectorDataState, Continuation<? super CryptoOrderTypeSelectorDataState> continuation) {
                    return ((C507851) create(cryptoOrderTypeSelectorDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoOrderTypeSelectorDataState.copy$default((CryptoOrderTypeSelectorDataState) this.L$0, false, null, this.$currencyPair, null, null, false, null, false, null, null, 0, 2043, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C507851((UiCurrencyPair) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C404761(null));
        if (this.appType == AppType.TRADER) {
            getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C404772(null));
        }
        Companion companion = INSTANCE;
        if (((CryptoOrderTypeSelectorFragment.Args) companion.getArgs((HasSavedState) this)).getSide() == OrderSide.SELL) {
            Flow<TaxlotabilityResponseDto> flowStreamTaxlotability = this.taxlotabilityStore.streamTaxlotability(((CryptoOrderTypeSelectorFragment.Args) companion.getArgs((HasSavedState) this)).getCurrencyPairId());
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C404783(flowStreamTaxlotability, this, null));
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C404794(flowStreamTaxlotability, this, null), 3, null);
        }
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C404805(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C404816(null));
    }

    /* compiled from: CryptoOrderTypeSelectorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$2", m3645f = "CryptoOrderTypeSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$2 */
    static final class C404772 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C404772(Continuation<? super C404772> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C404772 c404772 = CryptoOrderTypeSelectorDuxo.this.new C404772(continuation);
            c404772.L$0 = obj;
            return c404772;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C404772) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoOrderTypeSelectorDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$2$1", m3645f = "CryptoOrderTypeSelectorDuxo.kt", m3646l = {123}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CryptoOrderTypeSelectorDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoOrderTypeSelectorDuxo cryptoOrderTypeSelectorDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderTypeSelectorDuxo;
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
                    CryptoAccountPreferencesStore cryptoAccountPreferencesStore = this.this$0.cryptoAccountPreferencesStore;
                    this.label = 1;
                    if (cryptoAccountPreferencesStore.m22601refreshAccountPreferencesIoAF18A(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    ((Result) obj).getValue();
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
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(CryptoOrderTypeSelectorDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(CryptoOrderTypeSelectorDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: CryptoOrderTypeSelectorDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$2$2", m3645f = "CryptoOrderTypeSelectorDuxo.kt", m3646l = {128}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CryptoOrderTypeSelectorDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CryptoOrderTypeSelectorDuxo cryptoOrderTypeSelectorDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderTypeSelectorDuxo;
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
                    Flow<CryptoAccountPreferences> flowStreamAccountPreferences = this.this$0.cryptoAccountPreferencesStore.streamAccountPreferences();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamAccountPreferences, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: CryptoOrderTypeSelectorDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "accountPreferences", "Lcom/robinhood/models/crypto/db/CryptoAccountPreferences;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$2$2$1", m3645f = "CryptoOrderTypeSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoAccountPreferences, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CryptoOrderTypeSelectorDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CryptoOrderTypeSelectorDuxo cryptoOrderTypeSelectorDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoOrderTypeSelectorDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoAccountPreferences cryptoAccountPreferences, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(cryptoAccountPreferences, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: CryptoOrderTypeSelectorDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$2$2$1$1", m3645f = "CryptoOrderTypeSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$2$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C507861 extends ContinuationImpl7 implements Function2<CryptoOrderTypeSelectorDataState, Continuation<? super CryptoOrderTypeSelectorDataState>, Object> {
                    final /* synthetic */ CryptoAccountPreferences $accountPreferences;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C507861(CryptoAccountPreferences cryptoAccountPreferences, Continuation<? super C507861> continuation) {
                        super(2, continuation);
                        this.$accountPreferences = cryptoAccountPreferences;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C507861 c507861 = new C507861(this.$accountPreferences, continuation);
                        c507861.L$0 = obj;
                        return c507861;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CryptoOrderTypeSelectorDataState cryptoOrderTypeSelectorDataState, Continuation<? super CryptoOrderTypeSelectorDataState> continuation) {
                        return ((C507861) create(cryptoOrderTypeSelectorDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return CryptoOrderTypeSelectorDataState.copy$default((CryptoOrderTypeSelectorDataState) this.L$0, false, null, null, null, null, false, this.$accountPreferences, false, null, null, 0, 1983, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C507861((CryptoAccountPreferences) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* compiled from: CryptoOrderTypeSelectorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$3", m3645f = "CryptoOrderTypeSelectorDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$3 */
    static final class C404783 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<TaxlotabilityResponseDto> $taxlotabilityStream;
        int label;
        final /* synthetic */ CryptoOrderTypeSelectorDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C404783(Flow<TaxlotabilityResponseDto> flow, CryptoOrderTypeSelectorDuxo cryptoOrderTypeSelectorDuxo, Continuation<? super C404783> continuation) {
            super(2, continuation);
            this.$taxlotabilityStream = flow;
            this.this$0 = cryptoOrderTypeSelectorDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C404783(this.$taxlotabilityStream, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C404783) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoOrderTypeSelectorDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lnummus/v1/TaxlotabilityResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$3$1", m3645f = "CryptoOrderTypeSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<TaxlotabilityResponseDto, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoOrderTypeSelectorDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoOrderTypeSelectorDuxo cryptoOrderTypeSelectorDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderTypeSelectorDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(TaxlotabilityResponseDto taxlotabilityResponseDto, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(taxlotabilityResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoOrderTypeSelectorDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$3$1$1", m3645f = "CryptoOrderTypeSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$3$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507871 extends ContinuationImpl7 implements Function2<CryptoOrderTypeSelectorDataState, Continuation<? super CryptoOrderTypeSelectorDataState>, Object> {
                final /* synthetic */ TaxlotabilityResponseDto $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507871(TaxlotabilityResponseDto taxlotabilityResponseDto, Continuation<? super C507871> continuation) {
                    super(2, continuation);
                    this.$it = taxlotabilityResponseDto;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507871 c507871 = new C507871(this.$it, continuation);
                    c507871.L$0 = obj;
                    return c507871;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoOrderTypeSelectorDataState cryptoOrderTypeSelectorDataState, Continuation<? super CryptoOrderTypeSelectorDataState> continuation) {
                    return ((C507871) create(cryptoOrderTypeSelectorDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoOrderTypeSelectorDataState.copy$default((CryptoOrderTypeSelectorDataState) this.L$0, false, null, null, null, null, false, null, false, this.$it, null, 0, 1791, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C507871((TaxlotabilityResponseDto) this.L$0, null));
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<TaxlotabilityResponseDto> flow = this.$taxlotabilityStream;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
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

    /* compiled from: CryptoOrderTypeSelectorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$4", m3645f = "CryptoOrderTypeSelectorDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$4 */
    static final class C404794 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<TaxlotabilityResponseDto> $taxlotabilityStream;
        int label;
        final /* synthetic */ CryptoOrderTypeSelectorDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C404794(Flow<TaxlotabilityResponseDto> flow, CryptoOrderTypeSelectorDuxo cryptoOrderTypeSelectorDuxo, Continuation<? super C404794> continuation) {
            super(2, continuation);
            this.$taxlotabilityStream = flow;
            this.this$0 = cryptoOrderTypeSelectorDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C404794(this.$taxlotabilityStream, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C404794) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow<TaxlotabilityResponseDto> flow = this.$taxlotabilityStream;
                Flow flowTake = FlowKt.take(new Flow<TaxlotabilityResponseDto>() { // from class: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$4$invokeSuspend$$inlined$filter$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super TaxlotabilityResponseDto> flowCollector, Continuation continuation) {
                        Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$4$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$4$invokeSuspend$$inlined$filter$1$2", m3645f = "CryptoOrderTypeSelectorDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$4$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                                if (((TaxlotabilityResponseDto) obj).getState() == TaxlotabilityStateDto.STATE_ENABLED) {
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

        /* compiled from: CryptoOrderTypeSelectorDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lnummus/v1/TaxlotabilityResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$4$2", m3645f = "CryptoOrderTypeSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$4$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<TaxlotabilityResponseDto, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CryptoOrderTypeSelectorDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CryptoOrderTypeSelectorDuxo cryptoOrderTypeSelectorDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderTypeSelectorDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(TaxlotabilityResponseDto taxlotabilityResponseDto, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(taxlotabilityResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    int i = this.this$0.cryptoUsTaxLotsOrderTypeDisplayCountPref.get();
                    if (i < 10) {
                        this.this$0.cryptoUsTaxLotsOrderTypeDisplayCountPref.set(i + 1);
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: CryptoOrderTypeSelectorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$5", m3645f = "CryptoOrderTypeSelectorDuxo.kt", m3646l = {156}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$5 */
    static final class C404805 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C404805(Continuation<? super C404805> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderTypeSelectorDuxo.this.new C404805(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C404805) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamRegionGateStateFlow$default = RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(CryptoOrderTypeSelectorDuxo.this.regionGateProvider, RecurringInvestmentRegionGate.INSTANCE, false, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoOrderTypeSelectorDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamRegionGateStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoOrderTypeSelectorDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isRecurringInvestmentFeatureEnabled", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$5$1", m3645f = "CryptoOrderTypeSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$5$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ CryptoOrderTypeSelectorDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoOrderTypeSelectorDuxo cryptoOrderTypeSelectorDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderTypeSelectorDuxo;
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

            /* compiled from: CryptoOrderTypeSelectorDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$5$1$1", m3645f = "CryptoOrderTypeSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$5$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507881 extends ContinuationImpl7 implements Function2<CryptoOrderTypeSelectorDataState, Continuation<? super CryptoOrderTypeSelectorDataState>, Object> {
                final /* synthetic */ boolean $isRecurringInvestmentFeatureEnabled;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507881(boolean z, Continuation<? super C507881> continuation) {
                    super(2, continuation);
                    this.$isRecurringInvestmentFeatureEnabled = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507881 c507881 = new C507881(this.$isRecurringInvestmentFeatureEnabled, continuation);
                    c507881.L$0 = obj;
                    return c507881;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoOrderTypeSelectorDataState cryptoOrderTypeSelectorDataState, Continuation<? super CryptoOrderTypeSelectorDataState> continuation) {
                    return ((C507881) create(cryptoOrderTypeSelectorDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoOrderTypeSelectorDataState.copy$default((CryptoOrderTypeSelectorDataState) this.L$0, false, null, null, null, null, this.$isRecurringInvestmentFeatureEnabled, null, false, null, null, 0, 2015, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C507881(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: CryptoOrderTypeSelectorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$6", m3645f = "CryptoOrderTypeSelectorDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$6 */
    static final class C404816 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C404816(Continuation<? super C404816> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderTypeSelectorDuxo.this.new C404816(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C404816) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowConnectWhen$default = Operators.connectWhen$default(CryptoOrderTypeSelectorDuxo.this.recurringTradabilityStore.streamRecurringInstrumentTradableByAssetType(InstrumentRecurringTradabilityStore.AssetType.CRYPTO, ((CryptoOrderTypeSelectorFragment.Args) CryptoOrderTypeSelectorDuxo.INSTANCE.getArgs((HasSavedState) CryptoOrderTypeSelectorDuxo.this)).getCurrencyPairId()), RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(CryptoOrderTypeSelectorDuxo.this.regionGateProvider, RecurringInvestmentRegionGate.INSTANCE, false, 2, null), null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoOrderTypeSelectorDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowConnectWhen$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoOrderTypeSelectorDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "recurringTradability", "Lcom/robinhood/models/db/bonfire/InstrumentRecurringTradability;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$6$1", m3645f = "CryptoOrderTypeSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$6$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InstrumentRecurringTradability, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoOrderTypeSelectorDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoOrderTypeSelectorDuxo cryptoOrderTypeSelectorDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderTypeSelectorDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InstrumentRecurringTradability instrumentRecurringTradability, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(instrumentRecurringTradability, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoOrderTypeSelectorDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$6$1$1", m3645f = "CryptoOrderTypeSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$onCreate$6$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507891 extends ContinuationImpl7 implements Function2<CryptoOrderTypeSelectorDataState, Continuation<? super CryptoOrderTypeSelectorDataState>, Object> {
                final /* synthetic */ InstrumentRecurringTradability $recurringTradability;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507891(InstrumentRecurringTradability instrumentRecurringTradability, Continuation<? super C507891> continuation) {
                    super(2, continuation);
                    this.$recurringTradability = instrumentRecurringTradability;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507891 c507891 = new C507891(this.$recurringTradability, continuation);
                    c507891.L$0 = obj;
                    return c507891;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoOrderTypeSelectorDataState cryptoOrderTypeSelectorDataState, Continuation<? super CryptoOrderTypeSelectorDataState> continuation) {
                    return ((C507891) create(cryptoOrderTypeSelectorDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoOrderTypeSelectorDataState.copy$default((CryptoOrderTypeSelectorDataState) this.L$0, false, null, null, null, this.$recurringTradability, false, null, false, null, null, 0, 2031, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C507891((InstrumentRecurringTradability) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void onRowTapped(CryptoOrderTypeSelectorViewState2.TapAction tapAction) {
        Intrinsics.checkNotNullParameter(tapAction, "tapAction");
        if (tapAction instanceof CryptoOrderTypeSelectorViewState2.TapAction.RecurringInvestmentSelected) {
            handleRecurringInvestmentTapped(((CryptoOrderTypeSelectorViewState2.TapAction.RecurringInvestmentSelected) tapAction).getTradability());
            return;
        }
        if (tapAction instanceof CryptoOrderTypeSelectorViewState2.TapAction.SelectOrderType) {
            CryptoOrderTypeSelectorViewState2.TapAction.SelectOrderType selectOrderType = (CryptoOrderTypeSelectorViewState2.TapAction.SelectOrderType) tapAction;
            submit(new CryptoOrderTypeSelectorEvent.OrderTypeSelected(selectOrderType.getUiCurrencyPair(), selectOrderType.getType(), selectOrderType.getInputMode()));
        } else if (tapAction instanceof CryptoOrderTypeSelectorViewState2.TapAction.TaxLotSelected) {
            submit(CryptoOrderTypeSelectorEvent.EnterTaxLotOrderFlow.INSTANCE);
        } else {
            if (!(tapAction instanceof CryptoOrderTypeSelectorViewState2.TapAction.ShowTaxLotDisabledAlert)) {
                throw new NoWhenBranchMatchedException();
            }
            CryptoOrderTypeSelectorViewState2.TapAction.ShowTaxLotDisabledAlert showTaxLotDisabledAlert = (CryptoOrderTypeSelectorViewState2.TapAction.ShowTaxLotDisabledAlert) tapAction;
            submit(new CryptoOrderTypeSelectorEvent.ShowTaxLotOrderDisabledAlert(showTaxLotDisabledAlert.getTitle(), showTaxLotDisabledAlert.getMessage(), showTaxLotDisabledAlert.getDismissCtaText()));
        }
    }

    private final void handleRecurringInvestmentTapped(final InstrumentRecurringTradability tradability) {
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderTypeSelectorDuxo.handleRecurringInvestmentTapped$lambda$1(this.f$0, tradability, (CryptoOrderTypeSelectorDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleRecurringInvestmentTapped$lambda$1(CryptoOrderTypeSelectorDuxo cryptoOrderTypeSelectorDuxo, InstrumentRecurringTradability instrumentRecurringTradability, CryptoOrderTypeSelectorDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(cryptoOrderTypeSelectorDuxo), null, null, new CryptoOrderTypeSelectorDuxo2(cryptoOrderTypeSelectorDuxo, instrumentRecurringTradability, dataState, null), 3, null);
        return Unit.INSTANCE;
    }

    public final void onBackPressed() {
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderTypeSelectorDuxo.onBackPressed$lambda$2(this.f$0, (CryptoOrderTypeSelectorDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBackPressed$lambda$2(CryptoOrderTypeSelectorDuxo cryptoOrderTypeSelectorDuxo, CryptoOrderTypeSelectorDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(cryptoOrderTypeSelectorDuxo), null, null, new CryptoOrderTypeSelectorDuxo3(cryptoOrderTypeSelectorDuxo, dataState, null), 3, null);
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoOrderTypeSelectorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorDuxo;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorFragment$Args;", "<init>", "()V", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CryptoOrderTypeSelectorDuxo, CryptoOrderTypeSelectorFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoOrderTypeSelectorFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (CryptoOrderTypeSelectorFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoOrderTypeSelectorFragment.Args getArgs(CryptoOrderTypeSelectorDuxo cryptoOrderTypeSelectorDuxo) {
            return (CryptoOrderTypeSelectorFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, cryptoOrderTypeSelectorDuxo);
        }
    }
}
