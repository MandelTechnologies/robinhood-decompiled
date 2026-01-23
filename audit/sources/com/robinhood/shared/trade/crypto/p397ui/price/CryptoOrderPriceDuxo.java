package com.robinhood.shared.trade.crypto.p397ui.price;

import android.view.KeyEvent;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.formats.FormatsLocalized;
import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.android.lib.trade.OrderPriceValidation;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.g11n.CurrencyFormatterLocale;
import com.robinhood.g11n.Locales2;
import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.librobinhood.data.store.fee.monetizationModel.CryptoOrderMonetizationModelProvider;
import com.robinhood.models.api.fee.MonetizationModel;
import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.crypto.p315ui.fee.CryptoOrderMonetizationModel;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.trading.bottomsheet.CryptoTradingBottomSheetService;
import com.robinhood.shared.crypto.utils.OrderSides3;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.formats.crypto.CryptoInstrumentInputHelper;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.p397ui.price.CryptoOrderPriceDataState;
import com.robinhood.shared.trade.crypto.p397ui.price.CryptoOrderPriceEvent;
import com.robinhood.shared.trade.crypto.p397ui.price.CryptoOrderPriceFragment;
import com.robinhood.shared.trade.crypto.p397ui.price.CryptoOrderPriceGroup;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import contracts.crypto.trade.proto.p431v1.BottomSheetTypeDto;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
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
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoOrderPriceDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 62\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u00016BI\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0014\u0010 \u001a\u00020\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"J\u0010\u0010$\u001a\u00020\u001f2\b\u0010%\u001a\u0004\u0018\u00010&J\u0006\u0010'\u001a\u00020\u001fJ\u0015\u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020&H\u0001¢\u0006\u0002\b)J\u0006\u0010*\u001a\u00020\u001fJ\u0006\u0010+\u001a\u00020\u001fJ\u0006\u0010,\u001a\u00020\u001fJ\u0006\u0010-\u001a\u00020\u001fJ\u0006\u0010.\u001a\u00020\u001fJ\u000e\u0010/\u001a\u00020\u001f2\u0006\u00100\u001a\u000201J\u000e\u00102\u001a\u00020\u001f2\u0006\u00100\u001a\u000201J\u000e\u00103\u001a\u00020\u001f2\u0006\u00104\u001a\u000205R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u00067"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceDataState;", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceViewState;", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "bottomSheetService", "Lcom/robinhood/shared/crypto/trading/bottomsheet/CryptoTradingBottomSheetService;", "cryptoOrderMonetizationModelProvider", "Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/CryptoOrderMonetizationModelProvider;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceStateProvider;", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/shared/crypto/trading/bottomsheet/CryptoTradingBottomSheetService;Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/CryptoOrderMonetizationModelProvider;Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceStateProvider;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "onCreate", "", "emitBottomSheetData", "dtos", "Lkotlinx/collections/immutable/ImmutableList;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto;", "onAmountChanged", "amount", "Ljava/math/BigDecimal;", "verifyPrice", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "verifyPrice$feature_trade_crypto_externalDebug", "handlePriceSelected", "handleInfoPressed", "verifyRoundedPrice", "onCurrentPriceInfoClicked", "onContinueClick", "onDialogPositiveButtonClicked", "id", "", "onDialogNegativeButtonClicked", "onNumpadKeyPress", "keyEvent", "Landroid/view/KeyEvent;", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoOrderPriceDuxo extends BaseDuxo3<CryptoOrderPriceDataState, CryptoOrderPriceViewState, CryptoOrderPriceEvent> implements HasSavedState {
    private final AppType appType;
    private final CryptoTradingBottomSheetService bottomSheetService;
    private final CryptoOrderMonetizationModelProvider cryptoOrderMonetizationModelProvider;
    private final CryptoQuoteStore cryptoQuoteStore;
    private final CurrencyPairV2Store currencyPairStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CryptoOrderPriceDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CryptoOrderPriceDataState.OrderPriceType.values().length];
            try {
                iArr[CryptoOrderPriceDataState.OrderPriceType.LIMIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoOrderPriceDataState.OrderPriceType.STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CryptoOrderPriceDuxo(AppType appType, CryptoTradingBottomSheetService bottomSheetService, CryptoOrderMonetizationModelProvider cryptoOrderMonetizationModelProvider, CryptoQuoteStore cryptoQuoteStore, CurrencyPairV2Store currencyPairStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, CryptoOrderPriceDuxo3 stateProvider) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(bottomSheetService, "bottomSheetService");
        Intrinsics.checkNotNullParameter(cryptoOrderMonetizationModelProvider, "cryptoOrderMonetizationModelProvider");
        Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Companion companion = INSTANCE;
        super(new CryptoOrderPriceDataState(((CryptoOrderPriceFragment.Args) companion.getArgs(savedStateHandle)).getSide(), ((CryptoOrderPriceFragment.Args) companion.getArgs(savedStateHandle)).getPriceGroup(), null, null, null, null, Locales2.getMonetaryDecimalSeparator(CurrencyFormatterLocale.INSTANCE.getInstance().getCryptoLocale()), appType, null, 316, null), stateProvider, duxoBundle);
        this.appType = appType;
        this.bottomSheetService = bottomSheetService;
        this.cryptoOrderMonetizationModelProvider = cryptoOrderMonetizationModelProvider;
        this.cryptoQuoteStore = cryptoQuoteStore;
        this.currencyPairStore = currencyPairStore;
        this.savedStateHandle = savedStateHandle;
    }

    public final Screen getEventScreen() {
        CryptoOrderPriceGroup priceGroup = ((CryptoOrderPriceFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getPriceGroup();
        if (priceGroup instanceof CryptoOrderPriceGroup.Limit) {
            return new Screen(Screen.Name.CRYPTO_ORDER_SET_LIMIT_PRICE, null, null, null, 14, null);
        }
        if (priceGroup instanceof CryptoOrderPriceGroup.StopLoss) {
            return new Screen(Screen.Name.CRYPTO_ORDER_SET_STOP_PRICE, null, null, null, 14, null);
        }
        if (!(priceGroup instanceof CryptoOrderPriceGroup.StopLimit)) {
            throw new NoWhenBranchMatchedException();
        }
        if (((CryptoOrderPriceGroup.StopLimit) priceGroup).getStopPrice() == null) {
            return new Screen(Screen.Name.CRYPTO_ORDER_SET_STOP_PRICE, null, null, null, 14, null);
        }
        return new Screen(Screen.Name.CRYPTO_ORDER_SET_LIMIT_PRICE, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C405141(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C405152(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C405163(null));
    }

    /* compiled from: CryptoOrderPriceDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceDuxo$onCreate$1", m3645f = "CryptoOrderPriceDuxo.kt", m3646l = {86}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceDuxo$onCreate$1 */
    static final class C405141 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C405141(Continuation<? super C405141> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderPriceDuxo.this.new C405141(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C405141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<UiCurrencyPair> flowStreamCurrencyPairFlow = CryptoOrderPriceDuxo.this.currencyPairStore.streamCurrencyPairFlow(((CryptoOrderPriceFragment.Args) CryptoOrderPriceDuxo.INSTANCE.getArgs((HasSavedState) CryptoOrderPriceDuxo.this)).getPairId());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoOrderPriceDuxo.this, null);
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

        /* compiled from: CryptoOrderPriceDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceDuxo$onCreate$1$1", m3645f = "CryptoOrderPriceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UiCurrencyPair, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoOrderPriceDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoOrderPriceDuxo cryptoOrderPriceDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderPriceDuxo;
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

            /* compiled from: CryptoOrderPriceDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceDuxo$onCreate$1$1$1", m3645f = "CryptoOrderPriceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507921 extends ContinuationImpl7 implements Function2<CryptoOrderPriceDataState, Continuation<? super CryptoOrderPriceDataState>, Object> {
                final /* synthetic */ UiCurrencyPair $currencyPair;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507921(UiCurrencyPair uiCurrencyPair, Continuation<? super C507921> continuation) {
                    super(2, continuation);
                    this.$currencyPair = uiCurrencyPair;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507921 c507921 = new C507921(this.$currencyPair, continuation);
                    c507921.L$0 = obj;
                    return c507921;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoOrderPriceDataState cryptoOrderPriceDataState, Continuation<? super CryptoOrderPriceDataState> continuation) {
                    return ((C507921) create(cryptoOrderPriceDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoOrderPriceDataState.copy$default((CryptoOrderPriceDataState) this.L$0, null, null, this.$currencyPair, null, null, null, (char) 0, null, null, 507, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C507921((UiCurrencyPair) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoOrderPriceDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceDuxo$onCreate$2", m3645f = "CryptoOrderPriceDuxo.kt", m3646l = {90, 103}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceDuxo$onCreate$2 */
    static final class C405152 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C405152(Continuation<? super C405152> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderPriceDuxo.this.new C405152(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C405152) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0084, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(r12, r1, r11) == r0) goto L15;
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
                CryptoOrderMonetizationModelProvider cryptoOrderMonetizationModelProvider = CryptoOrderPriceDuxo.this.cryptoOrderMonetizationModelProvider;
                UUID pairId = ((CryptoOrderPriceFragment.Args) CryptoOrderPriceDuxo.INSTANCE.getArgs((HasSavedState) CryptoOrderPriceDuxo.this)).getPairId();
                this.label = 1;
                obj = cryptoOrderMonetizationModelProvider.get(pairId, this);
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
            CryptoOrderMonetizationModel cryptoOrderMonetizationModel = (CryptoOrderMonetizationModel) obj;
            CryptoOrderPriceDuxo.this.applyMutation(new AnonymousClass1(cryptoOrderMonetizationModel, null));
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(CryptoOrderPriceDuxo.this.cryptoQuoteStore.getPollCryptoQuote().asFlow(new CryptoQuoteStore.CryptoQuoteArgs(((CryptoOrderPriceFragment.Args) CryptoOrderPriceDuxo.INSTANCE.getArgs((HasSavedState) CryptoOrderPriceDuxo.this)).getPairId(), cryptoOrderMonetizationModel.getMonetizationModel(), null, 4, null)));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(CryptoOrderPriceDuxo.this, null);
            this.label = 2;
        }

        /* compiled from: CryptoOrderPriceDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceDuxo$onCreate$2$1", m3645f = "CryptoOrderPriceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoOrderPriceDataState, Continuation<? super CryptoOrderPriceDataState>, Object> {
            final /* synthetic */ CryptoOrderMonetizationModel $cryptoOrderMonetizationModel;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoOrderMonetizationModel cryptoOrderMonetizationModel, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$cryptoOrderMonetizationModel = cryptoOrderMonetizationModel;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$cryptoOrderMonetizationModel, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoOrderPriceDataState cryptoOrderPriceDataState, Continuation<? super CryptoOrderPriceDataState> continuation) {
                return ((AnonymousClass1) create(cryptoOrderPriceDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoOrderPriceDataState.copy$default((CryptoOrderPriceDataState) this.L$0, null, null, null, null, null, null, (char) 0, null, this.$cryptoOrderMonetizationModel, 255, null);
            }
        }

        /* compiled from: CryptoOrderPriceDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "quote", "Lcom/robinhood/models/crypto/db/CryptoQuote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceDuxo$onCreate$2$2", m3645f = "CryptoOrderPriceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceDuxo$onCreate$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CryptoQuote, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoOrderPriceDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CryptoOrderPriceDuxo cryptoOrderPriceDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderPriceDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoQuote cryptoQuote, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(cryptoQuote, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoOrderPriceDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceDuxo$onCreate$2$2$1", m3645f = "CryptoOrderPriceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceDuxo$onCreate$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoOrderPriceDataState, Continuation<? super CryptoOrderPriceDataState>, Object> {
                final /* synthetic */ CryptoQuote $quote;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CryptoQuote cryptoQuote, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$quote = cryptoQuote;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$quote, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoOrderPriceDataState cryptoOrderPriceDataState, Continuation<? super CryptoOrderPriceDataState> continuation) {
                    return ((AnonymousClass1) create(cryptoOrderPriceDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoOrderPriceDataState.copy$default((CryptoOrderPriceDataState) this.L$0, null, null, null, this.$quote, null, null, (char) 0, null, null, 503, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new AnonymousClass1((CryptoQuote) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoOrderPriceDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceDuxo$onCreate$3", m3645f = "CryptoOrderPriceDuxo.kt", m3646l = {109}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceDuxo$onCreate$3 */
    static final class C405163 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C405163(Continuation<? super C405163> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderPriceDuxo.this.new C405163(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C405163) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<DialogFragmentKey> flowStreamLaunchDialog = CryptoOrderPriceDuxo.this.bottomSheetService.streamLaunchDialog();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoOrderPriceDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamLaunchDialog, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoOrderPriceDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceDuxo$onCreate$3$1", m3645f = "CryptoOrderPriceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceDuxo$onCreate$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DialogFragmentKey, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoOrderPriceDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoOrderPriceDuxo cryptoOrderPriceDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderPriceDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(DialogFragmentKey dialogFragmentKey, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(dialogFragmentKey, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.submit(new CryptoOrderPriceEvent.ShowDialogFragment((DialogFragmentKey) this.L$0));
                return Unit.INSTANCE;
            }
        }
    }

    public final void emitBottomSheetData(ImmutableList<BottomSheetTypeDto> dtos) {
        Intrinsics.checkNotNullParameter(dtos, "dtos");
        this.bottomSheetService.emitBottomSheetData(dtos);
    }

    /* compiled from: CryptoOrderPriceDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceDuxo$onAmountChanged$1", m3645f = "CryptoOrderPriceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceDuxo$onAmountChanged$1 */
    static final class C405131 extends ContinuationImpl7 implements Function2<CryptoOrderPriceDataState, Continuation<? super CryptoOrderPriceDataState>, Object> {
        final /* synthetic */ BigDecimal $amount;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C405131(BigDecimal bigDecimal, Continuation<? super C405131> continuation) {
            super(2, continuation);
            this.$amount = bigDecimal;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C405131 c405131 = new C405131(this.$amount, continuation);
            c405131.L$0 = obj;
            return c405131;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoOrderPriceDataState cryptoOrderPriceDataState, Continuation<? super CryptoOrderPriceDataState> continuation) {
            return ((C405131) create(cryptoOrderPriceDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoOrderPriceDataState cryptoOrderPriceDataState = (CryptoOrderPriceDataState) this.L$0;
            UiCurrencyPair currencyPair$feature_trade_crypto_externalDebug = cryptoOrderPriceDataState.getCurrencyPair$feature_trade_crypto_externalDebug();
            Currency quoteCurrencyForPriceInput = currencyPair$feature_trade_crypto_externalDebug != null ? currencyPair$feature_trade_crypto_externalDebug.getQuoteCurrencyForPriceInput() : null;
            if (quoteCurrencyForPriceInput != null) {
                BigDecimal bigDecimal = this.$amount;
                return CryptoOrderPriceDataState.copy$default(cryptoOrderPriceDataState, null, null, null, null, bigDecimal != null ? bigDecimal.setScale(quoteCurrencyForPriceInput.getDecimalScale(), RoundingMode.DOWN) : null, null, (char) 0, null, null, 495, null);
            }
            return CryptoOrderPriceDataState.copy$default(cryptoOrderPriceDataState, null, null, null, null, null, null, (char) 0, null, null, 511, null);
        }
    }

    public final void onAmountChanged(BigDecimal amount) {
        applyMutation(new C405131(amount, null));
    }

    public final void verifyPrice() {
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderPriceDuxo.verifyPrice$lambda$0(this.f$0, (CryptoOrderPriceDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit verifyPrice$lambda$0(CryptoOrderPriceDuxo cryptoOrderPriceDuxo, CryptoOrderPriceDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        cryptoOrderPriceDuxo.verifyPrice$feature_trade_crypto_externalDebug(BigDecimals7.orZero(it.getAmount$feature_trade_crypto_externalDebug()));
        return Unit.INSTANCE;
    }

    public final void verifyPrice$feature_trade_crypto_externalDebug(final BigDecimal price) {
        Intrinsics.checkNotNullParameter(price, "price");
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderPriceDuxo.verifyPrice$lambda$1(price, this, (CryptoOrderPriceDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit verifyPrice$lambda$1(BigDecimal bigDecimal, CryptoOrderPriceDuxo cryptoOrderPriceDuxo, CryptoOrderPriceDataState it) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(it, "it");
        UiCurrencyPair currencyPair$feature_trade_crypto_externalDebug = it.getCurrencyPair$feature_trade_crypto_externalDebug();
        if (currencyPair$feature_trade_crypto_externalDebug != null && !currencyPair$feature_trade_crypto_externalDebug.isRoundedToTickSize(bigDecimal)) {
            String currency$default = CurrencyDefinitions.formatCurrency$default(it.getCurrencyPair$feature_trade_crypto_externalDebug().getQuoteCurrency(), it.getCurrencyPair$feature_trade_crypto_externalDebug().roundToTickSize(bigDecimal, it.getOrderSide$feature_trade_crypto_externalDebug()), false, false, null, 0, null, null, false, false, false, false, 2046, null);
            int i3 = C20649R.id.dialog_id_order_tick_size;
            StringResource.Companion companion = StringResource.INSTANCE;
            cryptoOrderPriceDuxo.submit(new CryptoOrderPriceEvent.DialogEvent(new CryptoOrderPriceEvent.DialogData(i3, companion.invoke(C40095R.string.crypto_order_create_tick_size_dialog_title, it.getCurrencyPair$feature_trade_crypto_externalDebug().getAssetCurrency().getCode()), companion.invoke(C40095R.string.crypto_order_create_tick_size_dialog_message, it.getCurrencyPair$feature_trade_crypto_externalDebug().getAssetCurrency().getCode(), CurrencyDefinitions.formatCurrency$default(it.getCurrencyPair$feature_trade_crypto_externalDebug().getQuoteCurrency(), it.getCurrencyPair$feature_trade_crypto_externalDebug().getMinOrderPriceIncrement(), false, false, null, 0, null, null, false, false, false, false, 2046, null)), companion.invoke(C20649R.string.order_create_tick_size_dialog_round_price, currency$default), companion.invoke(C11048R.string.general_label_dismiss, new Object[0]), "minPriceIncrementDialog", null, 64, null)));
            return Unit.INSTANCE;
        }
        int i4 = WhenMappings.$EnumSwitchMapping$0[it.getPriceType$feature_trade_crypto_externalDebug().ordinal()];
        if (i4 == 1) {
            OrderPriceValidation orderPriceValidation = OrderPriceValidation.INSTANCE;
            BigDecimal priceForOrder = it.getPriceForOrder();
            OrderSide orderSide$feature_trade_crypto_externalDebug = it.getOrderSide$feature_trade_crypto_externalDebug();
            OrderSide orderSide = OrderSide.BUY;
            BigDecimal aggressiveLimitPricePercent = orderPriceValidation.getAggressiveLimitPricePercent(priceForOrder, orderSide$feature_trade_crypto_externalDebug == orderSide, bigDecimal);
            if (aggressiveLimitPricePercent != null) {
                String str = FormatsLocalized.getPercentFormat().format(aggressiveLimitPricePercent);
                if (it.getOrderSide$feature_trade_crypto_externalDebug() == orderSide) {
                    int i5 = C20649R.id.dialog_id_order_aggressive_limit_price;
                    StringResource.Companion companion2 = StringResource.INSTANCE;
                    cryptoOrderPriceDuxo.submit(new CryptoOrderPriceEvent.DialogEvent(new CryptoOrderPriceEvent.DialogData(i5, companion2.invoke(C20649R.string.order_create_aggressive_limit_buy_dialog_title, new Object[0]), companion2.invoke(C20649R.string.order_create_aggressive_limit_buy_dialog_body, str), companion2.invoke(C20649R.string.order_create_aggressive_limit_edit_action, new Object[0]), companion2.invoke(C40095R.string.crypto_order_price_dialog_continue, new Object[0]), "highLimitPriceDialog", null, 64, null)));
                } else {
                    int i6 = C20649R.id.dialog_id_order_aggressive_limit_price;
                    StringResource.Companion companion3 = StringResource.INSTANCE;
                    cryptoOrderPriceDuxo.submit(new CryptoOrderPriceEvent.DialogEvent(new CryptoOrderPriceEvent.DialogData(i6, companion3.invoke(C20649R.string.order_create_aggressive_limit_sell_dialog_title, new Object[0]), companion3.invoke(C20649R.string.order_create_aggressive_limit_sell_dialog_body, str), companion3.invoke(C20649R.string.order_create_aggressive_limit_edit_action, new Object[0]), companion3.invoke(C40095R.string.crypto_order_price_dialog_continue, new Object[0]), "lowLimitPriceDialog", null, 64, null)));
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            BigDecimal priceForOrder2 = it.getPriceForOrder();
            UiCurrencyPair currencyPair$feature_trade_crypto_externalDebug2 = it.getCurrencyPair$feature_trade_crypto_externalDebug();
            if (priceForOrder2 != null && currencyPair$feature_trade_crypto_externalDebug2 != null) {
                if (it.getOrderSide$feature_trade_crypto_externalDebug() == OrderSide.BUY && BigDecimals7.m2978gt(priceForOrder2, bigDecimal)) {
                    int i7 = C20649R.id.dialog_id_order_aggressive_stop_price;
                    StringResource.Companion companion4 = StringResource.INSTANCE;
                    StringResource stringResourceInvoke = companion4.invoke(C40095R.string.crypto_order_create_low_stop_price_dialog_title, new Object[0]);
                    if (cryptoOrderPriceDuxo.appType == AppType.RHC) {
                        i2 = C40095R.string.crypto_order_create_low_stop_price_dialog_body;
                    } else {
                        i2 = C40095R.string.crypto_order_create_low_stop_price_dialog_body_us;
                    }
                    cryptoOrderPriceDuxo.submit(new CryptoOrderPriceEvent.DialogEvent(new CryptoOrderPriceEvent.DialogData(i7, stringResourceInvoke, companion4.invoke(i2, currencyPair$feature_trade_crypto_externalDebug2.getAssetCurrency().getCode(), CurrencyDefinitions.formatCurrency$default(currencyPair$feature_trade_crypto_externalDebug2.getQuoteCurrencyForPriceInput(), bigDecimal, false, false, null, 0, null, null, false, false, false, false, 2046, null), CurrencyDefinitions.formatCurrency$default(currencyPair$feature_trade_crypto_externalDebug2.getQuoteCurrencyForPriceInput(), priceForOrder2, false, false, null, 0, null, null, false, false, false, false, 2046, null)), companion4.invoke(C40095R.string.crypto_order_create_edit_stop_price_action, new Object[0]), null, "lowStopPriceDialog", "Low stop price")));
                    return Unit.INSTANCE;
                }
                if (it.getOrderSide$feature_trade_crypto_externalDebug() == OrderSide.SELL && BigDecimals7.m2979lt(priceForOrder2, bigDecimal)) {
                    int i8 = C20649R.id.dialog_id_order_aggressive_stop_price;
                    StringResource.Companion companion5 = StringResource.INSTANCE;
                    StringResource stringResourceInvoke2 = companion5.invoke(C40095R.string.crypto_order_create_high_stop_price_dialog_title, new Object[0]);
                    if (cryptoOrderPriceDuxo.appType == AppType.RHC) {
                        i = C40095R.string.crypto_order_create_high_stop_price_dialog_body;
                    } else {
                        i = C40095R.string.crypto_order_create_high_stop_price_dialog_body_us;
                    }
                    cryptoOrderPriceDuxo.submit(new CryptoOrderPriceEvent.DialogEvent(new CryptoOrderPriceEvent.DialogData(i8, stringResourceInvoke2, companion5.invoke(i, currencyPair$feature_trade_crypto_externalDebug2.getAssetCurrency().getCode(), CurrencyDefinitions.formatCurrency$default(currencyPair$feature_trade_crypto_externalDebug2.getQuoteCurrencyForPriceInput(), bigDecimal, false, false, null, 0, null, null, false, false, false, false, 2046, null), CurrencyDefinitions.formatCurrency$default(currencyPair$feature_trade_crypto_externalDebug2.getQuoteCurrencyForPriceInput(), priceForOrder2, false, false, null, 0, null, null, false, false, false, false, 2046, null)), companion5.invoke(C40095R.string.crypto_order_create_edit_stop_price_action, new Object[0]), null, "highStopPriceDialog", "High stop price")));
                    return Unit.INSTANCE;
                }
            }
        }
        cryptoOrderPriceDuxo.handlePriceSelected();
        return Unit.INSTANCE;
    }

    public final void handlePriceSelected() {
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderPriceDuxo.handlePriceSelected$lambda$2(this.f$0, (CryptoOrderPriceDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handlePriceSelected$lambda$2(CryptoOrderPriceDuxo cryptoOrderPriceDuxo, CryptoOrderPriceDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BigDecimal bigDecimalOrZero = BigDecimals7.orZero(it.getAmount$feature_trade_crypto_externalDebug());
        CryptoOrderPriceGroup priceGroup = ((CryptoOrderPriceFragment.Args) INSTANCE.getArgs((HasSavedState) cryptoOrderPriceDuxo)).getPriceGroup();
        if (priceGroup instanceof CryptoOrderPriceGroup.Limit) {
            cryptoOrderPriceDuxo.submit(new CryptoOrderPriceEvent.LimitOrderPriceSelectedEvent(bigDecimalOrZero));
        } else if (priceGroup instanceof CryptoOrderPriceGroup.StopLoss) {
            cryptoOrderPriceDuxo.submit(new CryptoOrderPriceEvent.StopLossOrderPriceSelectedEvent(bigDecimalOrZero));
        } else {
            if (!(priceGroup instanceof CryptoOrderPriceGroup.StopLimit)) {
                throw new NoWhenBranchMatchedException();
            }
            int i = WhenMappings.$EnumSwitchMapping$0[it.getPriceType$feature_trade_crypto_externalDebug().ordinal()];
            if (i == 1) {
                CryptoOrderPriceGroup.StopLimit stopLimit = (CryptoOrderPriceGroup.StopLimit) priceGroup;
                if (stopLimit.getStopPrice() == null) {
                    throw new IllegalStateException("Need to have a stop price to select limit price for stop limit order.");
                }
                cryptoOrderPriceDuxo.submit(new CryptoOrderPriceEvent.StopLimitOrderLimitPriceSelectedEvent(stopLimit.getStopPrice(), bigDecimalOrZero));
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                cryptoOrderPriceDuxo.submit(new CryptoOrderPriceEvent.StopLimitOrderStopPriceSelectedEvent(bigDecimalOrZero));
            }
        }
        return Unit.INSTANCE;
    }

    public final void handleInfoPressed() {
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderPriceDuxo.handleInfoPressed$lambda$3(this.f$0, (CryptoOrderPriceDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleInfoPressed$lambda$3(CryptoOrderPriceDuxo cryptoOrderPriceDuxo, CryptoOrderPriceDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CryptoOrderPriceGroup priceGroup$feature_trade_crypto_externalDebug = it.getPriceGroup$feature_trade_crypto_externalDebug();
        if (priceGroup$feature_trade_crypto_externalDebug instanceof CryptoOrderPriceGroup.Limit) {
            throw new IllegalStateException("Info icon should not appear for limit orders");
        }
        if (priceGroup$feature_trade_crypto_externalDebug instanceof CryptoOrderPriceGroup.StopLoss) {
            cryptoOrderPriceDuxo.submit(new CryptoOrderPriceEvent.ShowOrderEducationEvent(Order.Configuration.STOP_LOSS, it.getOrderSide$feature_trade_crypto_externalDebug()));
        } else {
            if (!(priceGroup$feature_trade_crypto_externalDebug instanceof CryptoOrderPriceGroup.StopLimit)) {
                throw new NoWhenBranchMatchedException();
            }
            cryptoOrderPriceDuxo.submit(new CryptoOrderPriceEvent.ShowOrderEducationEvent(Order.Configuration.STOP_LIMIT, it.getOrderSide$feature_trade_crypto_externalDebug()));
        }
        return Unit.INSTANCE;
    }

    public final void verifyRoundedPrice() {
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderPriceDuxo.verifyRoundedPrice$lambda$4(this.f$0, (CryptoOrderPriceDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit verifyRoundedPrice$lambda$4(CryptoOrderPriceDuxo cryptoOrderPriceDuxo, CryptoOrderPriceDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BigDecimal bigDecimalOrZero = BigDecimals7.orZero(it.getAmount$feature_trade_crypto_externalDebug());
        if (it.getCurrencyPair$feature_trade_crypto_externalDebug() == null) {
            return Unit.INSTANCE;
        }
        cryptoOrderPriceDuxo.verifyPrice$feature_trade_crypto_externalDebug(it.getCurrencyPair$feature_trade_crypto_externalDebug().roundToTickSize(bigDecimalOrZero, it.getOrderSide$feature_trade_crypto_externalDebug()));
        return Unit.INSTANCE;
    }

    public final void onCurrentPriceInfoClicked() {
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderPriceDuxo.onCurrentPriceInfoClicked$lambda$5(this.f$0, (CryptoOrderPriceDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit onCurrentPriceInfoClicked$lambda$5(CryptoOrderPriceDuxo cryptoOrderPriceDuxo, CryptoOrderPriceDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (cryptoOrderPriceDuxo.appType != AppType.RHC) {
            CryptoOrderMonetizationModel cryptoOrderMonetizationModelM2875x5cfb4369 = dataState.m2875x5cfb4369();
            if ((cryptoOrderMonetizationModelM2875x5cfb4369 != null ? cryptoOrderMonetizationModelM2875x5cfb4369.getMonetizationModel() : null) != MonetizationModel.FEE) {
                BottomSheetTypeDto spreadBottomSheetTypeDto = dataState.getSpreadBottomSheetTypeDto();
                if (spreadBottomSheetTypeDto == null) {
                    return Unit.INSTANCE;
                }
                CryptoTradingBottomSheetService.launchBottomSheet$default(cryptoOrderPriceDuxo.bottomSheetService, spreadBottomSheetTypeDto, cryptoOrderPriceDuxo.getEventScreen(), null, 4, null);
            }
        } else {
            UiCurrencyPair currencyPair$feature_trade_crypto_externalDebug = dataState.getCurrencyPair$feature_trade_crypto_externalDebug();
            if (currencyPair$feature_trade_crypto_externalDebug == null) {
                return Unit.INSTANCE;
            }
            CryptoTradingBottomSheetService.launchBottomSheet$default(cryptoOrderPriceDuxo.bottomSheetService, new BottomSheetTypeDto(new BottomSheetTypeDto.TypeDto.MarketPrice(new BottomSheetTypeDto.MarketPriceDto(OrderSides3.getSideDto(dataState.getOrderSide$feature_trade_crypto_externalDebug()), currencyPair$feature_trade_crypto_externalDebug.getAssetCurrency().getCode()))), cryptoOrderPriceDuxo.getEventScreen(), null, 4, null);
        }
        return Unit.INSTANCE;
    }

    public final void onContinueClick() {
        verifyPrice();
    }

    public final void onDialogPositiveButtonClicked(int id) {
        if (id == C20649R.id.dialog_id_order_tick_size) {
            verifyRoundedPrice();
        }
    }

    public final void onDialogNegativeButtonClicked(int id) {
        if (id != C20649R.id.dialog_id_order_tick_size) {
            if (id == C20649R.id.dialog_id_order_aggressive_limit_price) {
                handlePriceSelected();
            } else if (id == C20649R.id.dialog_id_order_aggressive_stop_price) {
                handlePriceSelected();
            }
        }
    }

    /* compiled from: CryptoOrderPriceDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceDuxo$onNumpadKeyPress$1", m3645f = "CryptoOrderPriceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceDuxo$onNumpadKeyPress$1 */
    static final class C405171 extends ContinuationImpl7 implements Function2<CryptoOrderPriceDataState, Continuation<? super CryptoOrderPriceDataState>, Object> {
        final /* synthetic */ KeyEvent $keyEvent;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C405171(KeyEvent keyEvent, Continuation<? super C405171> continuation) {
            super(2, continuation);
            this.$keyEvent = keyEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C405171 c405171 = new C405171(this.$keyEvent, continuation);
            c405171.L$0 = obj;
            return c405171;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoOrderPriceDataState cryptoOrderPriceDataState, Continuation<? super CryptoOrderPriceDataState> continuation) {
            return ((C405171) create(cryptoOrderPriceDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoOrderPriceDataState cryptoOrderPriceDataState = (CryptoOrderPriceDataState) this.L$0;
            UiCurrencyPair currencyPair$feature_trade_crypto_externalDebug = cryptoOrderPriceDataState.getCurrencyPair$feature_trade_crypto_externalDebug();
            if (currencyPair$feature_trade_crypto_externalDebug != null) {
                CryptoInstrumentInputHelper cryptoInstrumentInputHelper = new CryptoInstrumentInputHelper(UiCurrencyPair.copy$default(currencyPair$feature_trade_crypto_externalDebug, null, null, false, null, false, null, null, null, null, null, null, null, currencyPair$feature_trade_crypto_externalDebug.getQuoteCurrencyForPriceInput(), null, null, null, null, null, null, null, null, 2093055, null));
                KeyEvent keyEvent = this.$keyEvent;
                String formattedAmount$feature_trade_crypto_externalDebug = cryptoOrderPriceDataState.getFormattedAmount$feature_trade_crypto_externalDebug();
                if (formattedAmount$feature_trade_crypto_externalDebug == null) {
                    formattedAmount$feature_trade_crypto_externalDebug = "";
                }
                Tuples2 tuples2ProcessKeyEvent$default = CryptoInstrumentInputHelper.processKeyEvent$default(cryptoInstrumentInputHelper, keyEvent, formattedAmount$feature_trade_crypto_externalDebug, CryptoInputMode.QUOTE_CURRENCY, false, true, true, true, 8, null);
                String str = (String) tuples2ProcessKeyEvent$default.component1();
                BigDecimal bigDecimal = (BigDecimal) tuples2ProcessKeyEvent$default.component2();
                if (str.length() <= 30) {
                    BigDecimal scale = bigDecimal.setScale(currencyPair$feature_trade_crypto_externalDebug.getQuoteCurrencyForPriceInput().getDecimalScale(), RoundingMode.DOWN);
                    if (str.length() == 0) {
                        str = null;
                    }
                    return CryptoOrderPriceDataState.copy$default(cryptoOrderPriceDataState, null, null, null, null, scale, str, (char) 0, null, null, 463, null);
                }
            }
            return cryptoOrderPriceDataState;
        }
    }

    public final void onNumpadKeyPress(KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        applyMutation(new C405171(keyEvent, null));
    }

    /* compiled from: CryptoOrderPriceDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceDuxo;", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceFragment$Args;", "<init>", "()V", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CryptoOrderPriceDuxo, CryptoOrderPriceFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoOrderPriceFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (CryptoOrderPriceFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoOrderPriceFragment.Args getArgs(CryptoOrderPriceDuxo cryptoOrderPriceDuxo) {
            return (CryptoOrderPriceFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, cryptoOrderPriceDuxo);
        }
    }
}
