package com.robinhood.shared.trade.crypto.p397ui.taxLots.orderForm;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.CryptoEventLogger;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.microgramsdui.MicrogramManager2;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.models.api.ApiCryptoOrderRequest;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.crypto.p314db.CryptoAccount;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.ServerDrivenAlert;
import com.robinhood.rosetta.eventlogging.CryptoOrderMeta;
import com.robinhood.rosetta.eventlogging.OrderFormStep;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewMessageAndDisclosuresState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRowState;
import com.robinhood.shared.crypto.trading.CryptoOrderManager;
import com.robinhood.shared.crypto.trading.bottomsheet.CryptoTradingBottomSheetService;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContextFactory;
import com.robinhood.shared.trade.crypto.p397ui.disclosures.CryptoTradeDisclosuresProvider;
import com.robinhood.shared.trade.crypto.p397ui.extensions.CryptoOrderContexts;
import com.robinhood.shared.trade.crypto.p397ui.fee.definitionBottomSheet.CryptoFeeDefinitionBottomSheetFragment;
import com.robinhood.shared.trade.crypto.p397ui.powerInfoAlert.CryptoPowerInfoAlertProvider;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.orderForm.CryptoTaxLotOrderFormEvent;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.orderForm.CryptoTaxLotOrderFormFragment;
import com.robinhood.shared.trade.crypto.util.CryptoOrderMinuteFlowProvider;
import com.robinhood.shared.trade.crypto.validation.RequestInputs;
import com.robinhood.shared.trade.crypto.validation.StaticInputs;
import io.reactivex.Observable;
import kotlin.Metadata;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.coroutines.rx2.RxConvert;
import microgram.android.MicrogramLaunchId;
import microgram.android.RemoteMicrogramApplication;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.CryptoTaxLotSelectionService;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.StreamSelectedTaxLotsRequestDto;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.StreamSelectedTaxLotsResponseDto;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: CryptoTaxLotOrderFormDuxo.kt */
@Metadata(m3635d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 I2\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002:\u0001IBy\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020$2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020$2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00101R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00102R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00103R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00104R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00105R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00106R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00107R\u001a\u0010!\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u00108\u001a\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001c\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010B0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0011\u0010H\u001a\u00020E8F¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006J"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/orderForm/CryptoTaxLotOrderFormDuxo;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/orderForm/CryptoTaxLotOrderFormDataState;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/orderForm/CryptoTaxLotOrderFormViewState;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/orderForm/CryptoTaxLotOrderFormEvent;", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/shared/crypto/trading/bottomsheet/CryptoTradingBottomSheetService;", "bottomSheetService", "Lcom/robinhood/analytics/CryptoEventLogger;", "cryptoEventLogger", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoExperimentsStore", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContextFactory;", "cryptoOrderContextFactory", "Lcom/robinhood/shared/trade/crypto/ui/powerInfoAlert/CryptoPowerInfoAlertProvider;", "cryptoPowerInfoAlertProvider", "Lcom/robinhood/shared/trade/crypto/util/CryptoOrderMinuteFlowProvider;", "cryptoOrderMinuteFlowProvider", "Lcom/robinhood/shared/crypto/trading/CryptoOrderManager;", "cryptoOrderManager", "Lcom/robinhood/shared/trade/crypto/ui/disclosures/CryptoTradeDisclosuresProvider;", "cryptoTradeDisclosuresProvider", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "microgramManager", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/shared/trade/crypto/ui/taxLots/orderForm/CryptoTaxLotOrderFormStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/shared/crypto/trading/bottomsheet/CryptoTradingBottomSheetService;Lcom/robinhood/analytics/CryptoEventLogger;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContextFactory;Lcom/robinhood/shared/trade/crypto/ui/powerInfoAlert/CryptoPowerInfoAlertProvider;Lcom/robinhood/shared/trade/crypto/util/CryptoOrderMinuteFlowProvider;Lcom/robinhood/shared/crypto/trading/CryptoOrderManager;Lcom/robinhood/shared/trade/crypto/ui/disclosures/CryptoTradeDisclosuresProvider;Lcom/robinhood/android/microgramsdui/MicrogramManager;Lj$/time/Clock;Lcom/robinhood/shared/trade/crypto/ui/taxLots/orderForm/CryptoTaxLotOrderFormStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "", "onCreate", "()V", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext$RequestData;", "requestData", "submitOrder", "(Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext$RequestData;)V", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction;", "tapAction", "onOrderReviewRowTapped", "(Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction;)V", "Lcom/robinhood/android/lib/account/AccountProvider;", "Lcom/robinhood/shared/crypto/trading/bottomsheet/CryptoTradingBottomSheetService;", "Lcom/robinhood/analytics/CryptoEventLogger;", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContextFactory;", "Lcom/robinhood/shared/trade/crypto/ui/powerInfoAlert/CryptoPowerInfoAlertProvider;", "Lcom/robinhood/shared/trade/crypto/util/CryptoOrderMinuteFlowProvider;", "Lcom/robinhood/shared/crypto/trading/CryptoOrderManager;", "Lcom/robinhood/shared/trade/crypto/ui/disclosures/CryptoTradeDisclosuresProvider;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "microgramInstance", "Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTaxLotSelectionService;", "taxLotSelectionService", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTaxLotSelectionService;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "cryptoOrderContextFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventScreen", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CryptoTaxLotOrderFormDuxo extends BaseDuxo3<CryptoTaxLotOrderFormDataState, CryptoTaxLotOrderFormViewState, CryptoTaxLotOrderFormEvent> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final CryptoTradingBottomSheetService bottomSheetService;
    private final CryptoEventLogger cryptoEventLogger;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final CryptoOrderContextFactory cryptoOrderContextFactory;
    private final StateFlow2<CryptoOrderContext> cryptoOrderContextFlow;
    private final CryptoOrderManager cryptoOrderManager;
    private final CryptoOrderMinuteFlowProvider cryptoOrderMinuteFlowProvider;
    private final CryptoPowerInfoAlertProvider cryptoPowerInfoAlertProvider;
    private final CryptoTradeDisclosuresProvider cryptoTradeDisclosuresProvider;
    private final MicrogramManager2 microgramInstance;
    private final SavedStateHandle savedStateHandle;
    private final CryptoTaxLotSelectionService taxLotSelectionService;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CryptoTaxLotOrderFormDuxo(AccountProvider accountProvider, CryptoTradingBottomSheetService bottomSheetService, CryptoEventLogger cryptoEventLogger, CryptoExperimentsStore cryptoExperimentsStore, CryptoOrderContextFactory cryptoOrderContextFactory, CryptoPowerInfoAlertProvider cryptoPowerInfoAlertProvider, CryptoOrderMinuteFlowProvider cryptoOrderMinuteFlowProvider, CryptoOrderManager cryptoOrderManager, CryptoTradeDisclosuresProvider cryptoTradeDisclosuresProvider, MicrogramManager microgramManager, Clock clock, CryptoTaxLotOrderFormStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(bottomSheetService, "bottomSheetService");
        Intrinsics.checkNotNullParameter(cryptoEventLogger, "cryptoEventLogger");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(cryptoOrderContextFactory, "cryptoOrderContextFactory");
        Intrinsics.checkNotNullParameter(cryptoPowerInfoAlertProvider, "cryptoPowerInfoAlertProvider");
        Intrinsics.checkNotNullParameter(cryptoOrderMinuteFlowProvider, "cryptoOrderMinuteFlowProvider");
        Intrinsics.checkNotNullParameter(cryptoOrderManager, "cryptoOrderManager");
        Intrinsics.checkNotNullParameter(cryptoTradeDisclosuresProvider, "cryptoTradeDisclosuresProvider");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        RequestInputs.AsAsset requestInputs = ((CryptoTaxLotOrderFormFragment.Args) INSTANCE.getArgs(savedStateHandle)).getRequestInputs();
        Instant instantNow = Instant.now(clock);
        Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
        super(new CryptoTaxLotOrderFormDataState(bottomSheetService, requestInputs, null, null, instantNow, null, null, false, null, false, null, 2028, null), stateProvider, duxoBundle);
        this.accountProvider = accountProvider;
        this.bottomSheetService = bottomSheetService;
        this.cryptoEventLogger = cryptoEventLogger;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.cryptoOrderContextFactory = cryptoOrderContextFactory;
        this.cryptoPowerInfoAlertProvider = cryptoPowerInfoAlertProvider;
        this.cryptoOrderMinuteFlowProvider = cryptoOrderMinuteFlowProvider;
        this.cryptoOrderManager = cryptoOrderManager;
        this.cryptoTradeDisclosuresProvider = cryptoTradeDisclosuresProvider;
        this.savedStateHandle = savedStateHandle;
        MicrogramManager2 microgramManager2M16549getInstancemoChb0s$default = MicrogramManager.DefaultImpls.m16549getInstancemoChb0s$default(microgramManager, getLifecycleScope(), new MicrogramLaunchId(new RemoteMicrogramApplication("app-crypto-trading-tax-lots", null, 2, null), null, 2, null), null, 4, null);
        this.microgramInstance = microgramManager2M16549getInstancemoChb0s$default;
        this.taxLotSelectionService = (CryptoTaxLotSelectionService) microgramManager2M16549getInstancemoChb0s$default.getComponent().getServiceLocator().getClient(CryptoTaxLotSelectionService.class);
        this.cryptoOrderContextFlow = StateFlow4.MutableStateFlow(null);
    }

    public final Screen getEventScreen() {
        Screen.Name name = Screen.Name.CRYPTO_ORDER_REVIEW;
        String string2 = ((CryptoTaxLotOrderFormFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getCurrencyPairId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Screen(name, "crypto_tax_lots", string2, null, 8, null);
    }

    /* compiled from: CryptoTaxLotOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$1", m3645f = "CryptoTaxLotOrderFormDuxo.kt", m3646l = {105}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$1 */
    static final class C407271 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C407271(Continuation<? super C407271> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTaxLotOrderFormDuxo.this.new C407271(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C407271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Instant> minuteFlow = CryptoTaxLotOrderFormDuxo.this.cryptoOrderMinuteFlowProvider.getMinuteFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoTaxLotOrderFormDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(minuteFlow, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoTaxLotOrderFormDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m3636d2 = {"j$/time/Instant", "it", "", "<anonymous>", "(Lj$/time/Instant;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$1$1", m3645f = "CryptoTaxLotOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Instant, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoTaxLotOrderFormDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoTaxLotOrderFormDuxo cryptoTaxLotOrderFormDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoTaxLotOrderFormDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Instant instant, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(instant, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoTaxLotOrderFormDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/orderForm/CryptoTaxLotOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$1$1$1", m3645f = "CryptoTaxLotOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C508101 extends ContinuationImpl7 implements Function2<CryptoTaxLotOrderFormDataState, Continuation<? super CryptoTaxLotOrderFormDataState>, Object> {
                final /* synthetic */ Instant $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C508101(Instant instant, Continuation<? super C508101> continuation) {
                    super(2, continuation);
                    this.$it = instant;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C508101 c508101 = new C508101(this.$it, continuation);
                    c508101.L$0 = obj;
                    return c508101;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoTaxLotOrderFormDataState cryptoTaxLotOrderFormDataState, Continuation<? super CryptoTaxLotOrderFormDataState> continuation) {
                    return ((C508101) create(cryptoTaxLotOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoTaxLotOrderFormDataState.copy$default((CryptoTaxLotOrderFormDataState) this.L$0, null, null, null, null, this.$it, null, null, false, null, false, null, 2031, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C508101((Instant) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C407271(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C407282(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C407293(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C407304(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C407315(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C407326(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C407337(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C407348(null));
    }

    /* compiled from: CryptoTaxLotOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$2", m3645f = "CryptoTaxLotOrderFormDuxo.kt", m3646l = {118}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$2 */
    static final class C407282 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C407282(Continuation<? super C407282> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTaxLotOrderFormDuxo.this.new C407282(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C407282) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoOrderContextFactory cryptoOrderContextFactory = CryptoTaxLotOrderFormDuxo.this.cryptoOrderContextFactory;
                Screen eventScreen = CryptoTaxLotOrderFormDuxo.this.getEventScreen();
                Companion companion = CryptoTaxLotOrderFormDuxo.INSTANCE;
                StaticInputs staticInputs = new StaticInputs(((CryptoTaxLotOrderFormFragment.Args) companion.getArgs((HasSavedState) CryptoTaxLotOrderFormDuxo.this)).getCurrencyPairId(), ((CryptoTaxLotOrderFormFragment.Args) companion.getArgs((HasSavedState) CryptoTaxLotOrderFormDuxo.this)).getOrderUuid());
                Observable<RequestInputs> observableJust = Observable.just(((CryptoTaxLotOrderFormFragment.Args) companion.getArgs((HasSavedState) CryptoTaxLotOrderFormDuxo.this)).getRequestInputs());
                Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(cryptoOrderContextFactory.create(eventScreen, staticInputs, observableJust)), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoTaxLotOrderFormDuxo.this, null);
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

        /* compiled from: CryptoTaxLotOrderFormDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "cryptoOrderContext", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$2$1", m3645f = "CryptoTaxLotOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoOrderContext, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoTaxLotOrderFormDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoTaxLotOrderFormDuxo cryptoTaxLotOrderFormDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoTaxLotOrderFormDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoOrderContext cryptoOrderContext, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(cryptoOrderContext, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object value;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    CryptoOrderContext cryptoOrderContext = (CryptoOrderContext) this.L$0;
                    StateFlow2 stateFlow2 = this.this$0.cryptoOrderContextFlow;
                    do {
                        value = stateFlow2.getValue();
                    } while (!stateFlow2.compareAndSet(value, cryptoOrderContext));
                    this.this$0.applyMutation(new AnonymousClass2(cryptoOrderContext, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* compiled from: CryptoTaxLotOrderFormDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/orderForm/CryptoTaxLotOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$2$1$2", m3645f = "CryptoTaxLotOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$2$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CryptoTaxLotOrderFormDataState, Continuation<? super CryptoTaxLotOrderFormDataState>, Object> {
                final /* synthetic */ CryptoOrderContext $cryptoOrderContext;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(CryptoOrderContext cryptoOrderContext, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.$cryptoOrderContext = cryptoOrderContext;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$cryptoOrderContext, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoTaxLotOrderFormDataState cryptoTaxLotOrderFormDataState, Continuation<? super CryptoTaxLotOrderFormDataState> continuation) {
                    return ((AnonymousClass2) create(cryptoTaxLotOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoTaxLotOrderFormDataState.copy$default((CryptoTaxLotOrderFormDataState) this.L$0, null, null, this.$cryptoOrderContext, null, null, null, null, false, null, false, null, 2043, null);
                }
            }
        }
    }

    /* compiled from: CryptoTaxLotOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$3", m3645f = "CryptoTaxLotOrderFormDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$3 */
    static final class C407293 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C407293(Continuation<? super C407293> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTaxLotOrderFormDuxo.this.new C407293(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C407293) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<ServerDrivenAlert> powerInfoAlertFlow = CryptoTaxLotOrderFormDuxo.this.cryptoPowerInfoAlertProvider.getPowerInfoAlertFlow(((CryptoTaxLotOrderFormFragment.Args) CryptoTaxLotOrderFormDuxo.INSTANCE.getArgs((HasSavedState) CryptoTaxLotOrderFormDuxo.this)).getCurrencyPairId(), OrderSide.SELL, CryptoInputMode.ASSET_CURRENCY);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoTaxLotOrderFormDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(powerInfoAlertFlow, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoTaxLotOrderFormDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/ui/ServerDrivenAlert;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$3$1", m3645f = "CryptoTaxLotOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ServerDrivenAlert, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoTaxLotOrderFormDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoTaxLotOrderFormDuxo cryptoTaxLotOrderFormDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoTaxLotOrderFormDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ServerDrivenAlert serverDrivenAlert, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(serverDrivenAlert, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoTaxLotOrderFormDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/orderForm/CryptoTaxLotOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$3$1$1", m3645f = "CryptoTaxLotOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$3$1$1, reason: invalid class name and collision with other inner class name */
            static final class C508111 extends ContinuationImpl7 implements Function2<CryptoTaxLotOrderFormDataState, Continuation<? super CryptoTaxLotOrderFormDataState>, Object> {
                final /* synthetic */ ServerDrivenAlert $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C508111(ServerDrivenAlert serverDrivenAlert, Continuation<? super C508111> continuation) {
                    super(2, continuation);
                    this.$it = serverDrivenAlert;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C508111 c508111 = new C508111(this.$it, continuation);
                    c508111.L$0 = obj;
                    return c508111;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoTaxLotOrderFormDataState cryptoTaxLotOrderFormDataState, Continuation<? super CryptoTaxLotOrderFormDataState> continuation) {
                    return ((C508111) create(cryptoTaxLotOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoTaxLotOrderFormDataState.copy$default((CryptoTaxLotOrderFormDataState) this.L$0, null, null, null, this.$it, null, null, null, false, null, false, null, 2039, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C508111((ServerDrivenAlert) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoTaxLotOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$4", m3645f = "CryptoTaxLotOrderFormDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$4 */
    static final class C407304 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C407304(Continuation<? super C407304> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTaxLotOrderFormDuxo.this.new C407304(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C407304) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<StreamSelectedTaxLotsResponseDto> flowStreamSelectedTaxLots = CryptoTaxLotOrderFormDuxo.this.taxLotSelectionService.StreamSelectedTaxLots(new StreamSelectedTaxLotsRequestDto());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoTaxLotOrderFormDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamSelectedTaxLots, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoTaxLotOrderFormDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotsResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$4$1", m3645f = "CryptoTaxLotOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<StreamSelectedTaxLotsResponseDto, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoTaxLotOrderFormDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoTaxLotOrderFormDuxo cryptoTaxLotOrderFormDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoTaxLotOrderFormDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(StreamSelectedTaxLotsResponseDto streamSelectedTaxLotsResponseDto, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(streamSelectedTaxLotsResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoTaxLotOrderFormDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/orderForm/CryptoTaxLotOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$4$1$1", m3645f = "CryptoTaxLotOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$4$1$1, reason: invalid class name and collision with other inner class name */
            static final class C508121 extends ContinuationImpl7 implements Function2<CryptoTaxLotOrderFormDataState, Continuation<? super CryptoTaxLotOrderFormDataState>, Object> {
                final /* synthetic */ StreamSelectedTaxLotsResponseDto $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C508121(StreamSelectedTaxLotsResponseDto streamSelectedTaxLotsResponseDto, Continuation<? super C508121> continuation) {
                    super(2, continuation);
                    this.$it = streamSelectedTaxLotsResponseDto;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C508121 c508121 = new C508121(this.$it, continuation);
                    c508121.L$0 = obj;
                    return c508121;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoTaxLotOrderFormDataState cryptoTaxLotOrderFormDataState, Continuation<? super CryptoTaxLotOrderFormDataState> continuation) {
                    return ((C508121) create(cryptoTaxLotOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoTaxLotOrderFormDataState.copy$default((CryptoTaxLotOrderFormDataState) this.L$0, null, null, null, null, null, this.$it, null, false, null, false, null, 2015, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C508121((StreamSelectedTaxLotsResponseDto) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoTaxLotOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$5", m3645f = "CryptoTaxLotOrderFormDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$5 */
    static final class C407315 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C407315(Continuation<? super C407315> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTaxLotOrderFormDuxo.this.new C407315(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C407315) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<DialogFragmentKey> flowStreamLaunchDialog = CryptoTaxLotOrderFormDuxo.this.bottomSheetService.streamLaunchDialog();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoTaxLotOrderFormDuxo.this, null);
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

        /* compiled from: CryptoTaxLotOrderFormDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$5$1", m3645f = "CryptoTaxLotOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$5$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DialogFragmentKey, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoTaxLotOrderFormDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoTaxLotOrderFormDuxo cryptoTaxLotOrderFormDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoTaxLotOrderFormDuxo;
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
                this.this$0.submit(new CryptoTaxLotOrderFormEvent.ShowDialogFragment((DialogFragmentKey) this.L$0));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoTaxLotOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$6", m3645f = "CryptoTaxLotOrderFormDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$6 */
    static final class C407326 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C407326(Continuation<? super C407326> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTaxLotOrderFormDuxo.this.new C407326(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C407326) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<CryptoTaxLotOrderFormViewState> stateFlow = CryptoTaxLotOrderFormDuxo.this.getStateFlow();
                Flow flowTransformLatest = FlowKt.transformLatest(new Flow<CryptoOrderContext>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$6$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super CryptoOrderContext> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$6$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$6$invokeSuspend$$inlined$map$1$2", m3645f = "CryptoTaxLotOrderFormDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$6$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                CryptoOrderContext cryptoOrderContext = ((CryptoTaxLotOrderFormViewState) obj).getCryptoOrderContext();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(cryptoOrderContext, anonymousClass1) == coroutine_suspended) {
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
                }, new C40723xca8ecfc0(null, CryptoTaxLotOrderFormDuxo.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(CryptoTaxLotOrderFormDuxo.this, null);
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

        /* compiled from: CryptoTaxLotOrderFormDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$6$3", m3645f = "CryptoTaxLotOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$6$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CryptoOrderReviewMessageAndDisclosuresState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoTaxLotOrderFormDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CryptoTaxLotOrderFormDuxo cryptoTaxLotOrderFormDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = cryptoTaxLotOrderFormDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(cryptoOrderReviewMessageAndDisclosuresState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoTaxLotOrderFormDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/orderForm/CryptoTaxLotOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$6$3$1", m3645f = "CryptoTaxLotOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$6$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoTaxLotOrderFormDataState, Continuation<? super CryptoTaxLotOrderFormDataState>, Object> {
                final /* synthetic */ CryptoOrderReviewMessageAndDisclosuresState $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = cryptoOrderReviewMessageAndDisclosuresState;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoTaxLotOrderFormDataState cryptoTaxLotOrderFormDataState, Continuation<? super CryptoTaxLotOrderFormDataState> continuation) {
                    return ((AnonymousClass1) create(cryptoTaxLotOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoTaxLotOrderFormDataState.copy$default((CryptoTaxLotOrderFormDataState) this.L$0, null, null, null, null, null, null, null, false, this.$it, false, null, 1791, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new AnonymousClass1((CryptoOrderReviewMessageAndDisclosuresState) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoTaxLotOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$7", m3645f = "CryptoTaxLotOrderFormDuxo.kt", m3646l = {151}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$7 */
    static final class C407337 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C407337(Continuation<? super C407337> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTaxLotOrderFormDuxo.this.new C407337(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C407337) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowStreamCryptoMibExperiment = CryptoTaxLotOrderFormDuxo.this.cryptoExperimentsStore.streamCryptoMibExperiment();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoTaxLotOrderFormDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamCryptoMibExperiment, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoTaxLotOrderFormDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$7$1", m3645f = "CryptoTaxLotOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$7$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ CryptoTaxLotOrderFormDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoTaxLotOrderFormDuxo cryptoTaxLotOrderFormDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoTaxLotOrderFormDuxo;
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

            /* compiled from: CryptoTaxLotOrderFormDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/orderForm/CryptoTaxLotOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$7$1$1", m3645f = "CryptoTaxLotOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$7$1$1, reason: invalid class name and collision with other inner class name */
            static final class C508131 extends ContinuationImpl7 implements Function2<CryptoTaxLotOrderFormDataState, Continuation<? super CryptoTaxLotOrderFormDataState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C508131(boolean z, Continuation<? super C508131> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C508131 c508131 = new C508131(this.$it, continuation);
                    c508131.L$0 = obj;
                    return c508131;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoTaxLotOrderFormDataState cryptoTaxLotOrderFormDataState, Continuation<? super CryptoTaxLotOrderFormDataState> continuation) {
                    return ((C508131) create(cryptoTaxLotOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoTaxLotOrderFormDataState.copy$default((CryptoTaxLotOrderFormDataState) this.L$0, null, null, null, null, null, null, null, false, null, this.$it, null, 1535, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C508131(this.Z$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoTaxLotOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$8", m3645f = "CryptoTaxLotOrderFormDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$8 */
    static final class C407348 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C407348(Continuation<? super C407348> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTaxLotOrderFormDuxo.this.new C407348(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C407348) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow2 stateFlow2 = CryptoTaxLotOrderFormDuxo.this.cryptoOrderContextFlow;
                Flow flowTransformLatest = FlowKt.transformLatest(Operators.connectWhen$default(new Flow<String>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$8$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow2.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$8$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$8$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "CryptoTaxLotOrderFormDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$8$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                            CryptoOrderContext.AccountContext accountContext;
                            CryptoAccount cryptoAccount;
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
                                CryptoOrderContext cryptoOrderContext = (CryptoOrderContext) obj;
                                String rhsAccountNumber = (cryptoOrderContext == null || (accountContext = cryptoOrderContext.getAccountContext()) == null || (cryptoAccount = accountContext.getCryptoAccount()) == null) ? null : cryptoAccount.getRhsAccountNumber();
                                if (rhsAccountNumber != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(rhsAccountNumber, anonymousClass1) == coroutine_suspended) {
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
                }, CryptoTaxLotOrderFormDuxo.this.cryptoExperimentsStore.streamCryptoMibExperiment(), null, 2, null), new C40725x78cab17e(null, CryptoTaxLotOrderFormDuxo.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(CryptoTaxLotOrderFormDuxo.this, null);
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

        /* compiled from: CryptoTaxLotOrderFormDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$8$3", m3645f = "CryptoTaxLotOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$8$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Account, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoTaxLotOrderFormDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CryptoTaxLotOrderFormDuxo cryptoTaxLotOrderFormDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = cryptoTaxLotOrderFormDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Account account, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(account, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoTaxLotOrderFormDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/orderForm/CryptoTaxLotOrderFormDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$8$3$1", m3645f = "CryptoTaxLotOrderFormDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$onCreate$8$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoTaxLotOrderFormDataState, Continuation<? super CryptoTaxLotOrderFormDataState>, Object> {
                final /* synthetic */ Account $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Account account, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = account;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoTaxLotOrderFormDataState cryptoTaxLotOrderFormDataState, Continuation<? super CryptoTaxLotOrderFormDataState> continuation) {
                    return ((AnonymousClass1) create(cryptoTaxLotOrderFormDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoTaxLotOrderFormDataState.copy$default((CryptoTaxLotOrderFormDataState) this.L$0, null, null, null, null, null, null, null, false, null, false, this.$it, 1023, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((Account) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void submitOrder(CryptoOrderContext.RequestData requestData) {
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        ApiCryptoOrderRequest apiRequest = requestData.toApiRequest();
        this.cryptoEventLogger.logCryptoOrderEvent(OrderFormStep.SUBMIT, apiRequest, ((CryptoTaxLotOrderFormFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getRequestInputs().getMonetizationModel(), new CryptoOrderMeta(null, "crypto_tax_lots", null, 5, null));
        OrderSubmissionManager.submit$default(this.cryptoOrderManager, new CryptoOrderManager.Request.Standard(apiRequest), null, false, 6, null);
    }

    public final void onOrderReviewRowTapped(final CryptoOrderReviewRowState.TapAction tapAction) {
        Intrinsics.checkNotNullParameter(tapAction, "tapAction");
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoTaxLotOrderFormDuxo.onOrderReviewRowTapped$lambda$0(tapAction, this, (CryptoTaxLotOrderFormDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onOrderReviewRowTapped$lambda$0(CryptoOrderReviewRowState.TapAction tapAction, CryptoTaxLotOrderFormDuxo cryptoTaxLotOrderFormDuxo, CryptoTaxLotOrderFormDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (tapAction instanceof CryptoOrderReviewRowState.TapAction.ShowMarketPriceBottomSheet) {
            CryptoOrderContext cryptoOrderContext$feature_trade_crypto_externalDebug = it.getCryptoOrderContext$feature_trade_crypto_externalDebug();
            if (cryptoOrderContext$feature_trade_crypto_externalDebug == null) {
                return Unit.INSTANCE;
            }
            CryptoTradingBottomSheetService.launchBottomSheet$default(cryptoTaxLotOrderFormDuxo.bottomSheetService, CryptoOrderContexts.getMarketPriceBottomSheetTypeDto(cryptoOrderContext$feature_trade_crypto_externalDebug), cryptoTaxLotOrderFormDuxo.getEventScreen(), null, 4, null);
        } else if (tapAction instanceof CryptoOrderReviewRowState.TapAction.ShowFeeDefinitionBottomSheet) {
            CryptoOrderReviewRowState.TapAction.ShowFeeDefinitionBottomSheet showFeeDefinitionBottomSheet = (CryptoOrderReviewRowState.TapAction.ShowFeeDefinitionBottomSheet) tapAction;
            cryptoTaxLotOrderFormDuxo.submit(new CryptoTaxLotOrderFormEvent.ShowFeeDefinitionBottomSheet(new CryptoFeeDefinitionBottomSheetFragment.Args(cryptoTaxLotOrderFormDuxo.getEventScreen(), ((CryptoTaxLotOrderFormFragment.Args) INSTANCE.getArgs((HasSavedState) cryptoTaxLotOrderFormDuxo)).getCurrencyPairId(), showFeeDefinitionBottomSheet.getUiFeeEstimation().getFeeRatio(), showFeeDefinitionBottomSheet.getUiFeeEstimation().getMinFeeAmount(), showFeeDefinitionBottomSheet.getUiFeeEstimation().getRobinhoodFeeRatio(), showFeeDefinitionBottomSheet.getUiFeeEstimation().getExchangeFeeRatio(), false, null, 128, null)));
        } else if (tapAction instanceof CryptoOrderReviewRowState.TapAction.ShowSpreadBottomSheet) {
            CryptoOrderContext cryptoOrderContext$feature_trade_crypto_externalDebug2 = it.getCryptoOrderContext$feature_trade_crypto_externalDebug();
            if (cryptoOrderContext$feature_trade_crypto_externalDebug2 == null) {
                return Unit.INSTANCE;
            }
            CryptoTradingBottomSheetService.launchBottomSheet$default(cryptoTaxLotOrderFormDuxo.bottomSheetService, CryptoOrderContexts.getSpreadBottomSheetTypeDto(cryptoOrderContext$feature_trade_crypto_externalDebug2), cryptoTaxLotOrderFormDuxo.getEventScreen(), null, 4, null);
        } else {
            throw new IllegalStateException(("Unexpected tapAction " + tapAction).toString());
        }
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoTaxLotOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/orderForm/CryptoTaxLotOrderFormDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/orderForm/CryptoTaxLotOrderFormDuxo;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/orderForm/CryptoTaxLotOrderFormFragment$Args;", "<init>", "()V", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CryptoTaxLotOrderFormDuxo, CryptoTaxLotOrderFormFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoTaxLotOrderFormFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (CryptoTaxLotOrderFormFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoTaxLotOrderFormFragment.Args getArgs(CryptoTaxLotOrderFormDuxo cryptoTaxLotOrderFormDuxo) {
            return (CryptoTaxLotOrderFormFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, cryptoTaxLotOrderFormDuxo);
        }
    }
}
