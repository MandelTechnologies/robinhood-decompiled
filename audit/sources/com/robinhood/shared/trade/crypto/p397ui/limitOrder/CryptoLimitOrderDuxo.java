package com.robinhood.shared.trade.crypto.p397ui.limitOrder;

import android.content.res.Resources;
import android.view.KeyEvent;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.CryptoEventLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.lib.trade.DefaultOrderState;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.microgramsdui.MicrogramManager2;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.g11n.CurrencyFormatterLocale;
import com.robinhood.g11n.Locales2;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.fee.monetizationModel.CryptoOrderMonetizationModelProvider;
import com.robinhood.models.api.ApiCryptoOrderRequest;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.crypto.p315ui.UiCryptoHolding;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.crypto.p315ui.fee.CryptoOrderMonetizationModel;
import com.robinhood.models.crypto.p315ui.fee.UiFeeEstimation;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.ServerDrivenAlert;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.OrderFormStep;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewMessageAndDisclosuresState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRowState;
import com.robinhood.shared.crypto.trading.CryptoOrderManager;
import com.robinhood.shared.crypto.trading.bottomsheet.CryptoTradingBottomSheetService;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.formats.crypto.CryptoInstrumentInputHelper;
import com.robinhood.shared.trade.crypto.analytics.AnalyticsExtensions2;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContextFactory;
import com.robinhood.shared.trade.crypto.microgram.RealCryptoTradeUserInputsService;
import com.robinhood.shared.trade.crypto.p397ui.disclosures.CryptoTradeDisclosuresProvider;
import com.robinhood.shared.trade.crypto.p397ui.extensions.CryptoOrderContexts;
import com.robinhood.shared.trade.crypto.p397ui.fee.definitionBottomSheet.CryptoFeeDefinitionBottomSheetFragment;
import com.robinhood.shared.trade.crypto.p397ui.limitOrder.CryptoLimitOrderDataState;
import com.robinhood.shared.trade.crypto.p397ui.limitOrder.CryptoLimitOrderDuxo;
import com.robinhood.shared.trade.crypto.p397ui.limitOrder.CryptoLimitOrderEvent;
import com.robinhood.shared.trade.crypto.p397ui.limitOrder.CryptoLimitOrderFragment;
import com.robinhood.shared.trade.crypto.p397ui.limitOrder.CryptoLimitOrderViewState;
import com.robinhood.shared.trade.crypto.p397ui.order.CryptoOrderPrices;
import com.robinhood.shared.trade.crypto.p397ui.powerInfoAlert.CryptoPowerInfoAlertProvider;
import com.robinhood.shared.trade.crypto.validation.RequestInputs;
import com.robinhood.shared.trade.crypto.validation.StaticInputs;
import com.robinhood.utils.math.BigDecimals7;
import contracts.crypto.trade.proto.p431v1.CryptoOrderValidationService;
import contracts.crypto.trade.proto.p431v1.ValidateCryptoOrderRequestDto;
import contracts.crypto.trade.proto.p431v1.ValidateCryptoOrderResponseDto;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxConvert;
import microgram.android.MicrogramLaunchId;
import microgram.android.RemoteMicrogramApplication;
import rh_server_driven_ui.p531v1.AlertDto;

/* compiled from: CryptoLimitOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 p2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001pB\u008f\u0001\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\"\u0012\u0006\u0010#\u001a\u00020$\u0012\u0006\u0010%\u001a\u00020&¢\u0006\u0004\b'\u0010(J\b\u0010<\u001a\u00020=H\u0017J\b\u0010>\u001a\u00020=H\u0016J\u001c\u0010?\u001a\u00020=2\u0006\u0010@\u001a\u00020A2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010CH\u0002J\u000e\u0010D\u001a\u00020=2\u0006\u0010E\u001a\u00020FJ\u000e\u0010G\u001a\u00020=2\u0006\u0010H\u001a\u00020\u000eJ\u0016\u0010I\u001a\u00020=2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020MJ\u0016\u0010N\u001a\u00020=2\u0006\u0010O\u001a\u00020F2\u0006\u0010P\u001a\u00020FJ\u0006\u0010Q\u001a\u00020=J\u000e\u0010R\u001a\u00020=2\u0006\u0010S\u001a\u00020TJ\u0006\u0010U\u001a\u00020=J\u0006\u0010V\u001a\u00020=J\u0016\u0010W\u001a\u00020=2\u0006\u0010X\u001a\u0002072\u0006\u0010Y\u001a\u000207J\u000e\u0010Z\u001a\u00020=2\u0006\u0010[\u001a\u000207J\u0006\u0010\\\u001a\u00020=J\u0006\u0010]\u001a\u00020=J\u0006\u0010^\u001a\u00020=J\u000e\u0010_\u001a\u00020=2\u0006\u0010`\u001a\u00020aJ\u0006\u0010b\u001a\u00020=J\u0010\u0010c\u001a\u00020=2\u0006\u0010d\u001a\u00020eH\u0002J&\u0010f\u001a\u00020=2\u0017\u0010g\u001a\u0013\u0012\u0004\u0012\u00020i\u0012\u0004\u0012\u00020i0h¢\u0006\u0002\bjH\u0001¢\u0006\u0002\bkJ\u0018\u0010l\u001a\u00020=2\u0006\u0010m\u001a\u00020a2\u0006\u0010n\u001a\u00020aH\u0002J\u000e\u0010o\u001a\u00020=2\u0006\u0010B\u001a\u00020CR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u00020 X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001b\u0010+\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b-\u0010.R\u0011\u00101\u001a\u0002028F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00105\u001a\b\u0012\u0004\u0012\u00020706X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000209X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020;X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006q"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderDataState;", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState;", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "bottomSheetService", "Lcom/robinhood/shared/crypto/trading/bottomsheet/CryptoTradingBottomSheetService;", "cryptoEventLogger", "Lcom/robinhood/analytics/CryptoEventLogger;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoInputModePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "cryptoOrderContextFactory", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContextFactory;", "cryptoOrderManager", "Lcom/robinhood/shared/crypto/trading/CryptoOrderManager;", "cryptoOrderMonetizationModelProvider", "Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/CryptoOrderMonetizationModelProvider;", "cryptoPowerInfoAlertProvider", "Lcom/robinhood/shared/trade/crypto/ui/powerInfoAlert/CryptoPowerInfoAlertProvider;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "resources", "Landroid/content/res/Resources;", "cryptoTradeDisclosuresProvider", "Lcom/robinhood/shared/trade/crypto/ui/disclosures/CryptoTradeDisclosuresProvider;", "cryptoTradeUserInputsService", "Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeUserInputsService;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "stateProvider", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderStateProvider;", "<init>", "(Lcom/robinhood/shared/crypto/trading/bottomsheet/CryptoTradingBottomSheetService;Lcom/robinhood/analytics/CryptoEventLogger;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/prefs/EnumPreference;Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContextFactory;Lcom/robinhood/shared/crypto/trading/CryptoOrderManager;Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/CryptoOrderMonetizationModelProvider;Lcom/robinhood/shared/trade/crypto/ui/powerInfoAlert/CryptoPowerInfoAlertProvider;Lcom/robinhood/analytics/EventLogger;Landroid/content/res/Resources;Lcom/robinhood/shared/trade/crypto/ui/disclosures/CryptoTradeDisclosuresProvider;Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeUserInputsService;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/microgramsdui/MicrogramManager;Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderStateProvider;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "staticInputs", "Lcom/robinhood/shared/trade/crypto/validation/StaticInputs;", "getStaticInputs", "()Lcom/robinhood/shared/trade/crypto/validation/StaticInputs;", "staticInputs$delegate", "Lkotlin/Lazy;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "validateAndSubmitOrderTrigger", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Ljava/math/BigDecimal;", "cryptoTradingMicrogram", "Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "microgramOrderValidationService", "Lcontracts/crypto/trade/proto/v1/CryptoOrderValidationService;", "onStart", "", "onCreate", "performMicrogramOrderValidation", "orderContext", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "acknowledgeId", "", "onAccessibilityEnabled", "isAccessibilityEnabled", "", "onInputTypeTapped", "currentInputMode", "consumeKeyEvent", "keyEvent", "Landroid/view/KeyEvent;", "focusedEdtType", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderEdtType;", "setFocusedEdt", "isAmountEdtFocused", "isLimitPriceEdtFocused", "onLimitPriceTapped", "handleCryptoOrderReviewRowOnTap", "tapAction", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction;", "validateAndReviewOrder", "initiateDeposit", "setOrderSize", "orderAmount", "orderQuantity", "setLimitPrice", "limitPrice", "onValidationSucceed", "submitOrder", "sellAll", "updateFormState", "formState", "Lcom/robinhood/android/lib/trade/DefaultOrderState;", "onHeaderSubtitleTapped", "showFeeDefinitionBottomSheet", "uiFeeEstimation", "Lcom/robinhood/models/crypto/ui/fee/UiFeeEstimation;", "applyMutationIfLoaded", "mutator", "Lkotlin/Function1;", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderDataState$Loaded;", "Lkotlin/ExtensionFunctionType;", "applyMutationIfLoaded$feature_trade_crypto_externalDebug", "logScreenTransitionEvents", "previousOrderState", "newOrderState", "onOrderValidationAcknowledgeAndContinue", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CryptoLimitOrderDuxo extends BaseDuxo3<CryptoLimitOrderDataState, CryptoLimitOrderViewState, CryptoLimitOrderEvent> implements HasSavedState {
    private final CryptoTradingBottomSheetService bottomSheetService;
    private final CryptoEventLogger cryptoEventLogger;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final EnumPreference<CryptoInputMode> cryptoInputModePref;
    private final CryptoOrderContextFactory cryptoOrderContextFactory;
    private final CryptoOrderManager cryptoOrderManager;
    private final CryptoOrderMonetizationModelProvider cryptoOrderMonetizationModelProvider;
    private final CryptoPowerInfoAlertProvider cryptoPowerInfoAlertProvider;
    private final CryptoTradeDisclosuresProvider cryptoTradeDisclosuresProvider;
    private final RealCryptoTradeUserInputsService cryptoTradeUserInputsService;
    private final MicrogramManager2 cryptoTradingMicrogram;
    private final EventLogger eventLogger;
    private final CryptoOrderValidationService microgramOrderValidationService;
    private final Resources resources;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: staticInputs$delegate, reason: from kotlin metadata */
    private final Lazy staticInputs;
    private final SharedFlow2<BigDecimal> validateAndSubmitOrderTrigger;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CryptoLimitOrderDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[CryptoInputMode.values().length];
            try {
                iArr[CryptoInputMode.QUOTE_CURRENCY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoInputMode.ASSET_CURRENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CryptoLimitOrderEdtType.values().length];
            try {
                iArr2[CryptoLimitOrderEdtType.AMOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CryptoLimitOrderEdtType.LIMIT_PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CryptoLimitOrderEdtType.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[OrderSide.values().length];
            try {
                iArr3[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[DefaultOrderState.values().length];
            try {
                iArr4[DefaultOrderState.EDITING.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[DefaultOrderState.REVIEWING.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoLimitOrderDuxo(CryptoTradingBottomSheetService bottomSheetService, CryptoEventLogger cryptoEventLogger, CryptoExperimentsStore cryptoExperimentsStore, EnumPreference<CryptoInputMode> cryptoInputModePref, CryptoOrderContextFactory cryptoOrderContextFactory, CryptoOrderManager cryptoOrderManager, CryptoOrderMonetizationModelProvider cryptoOrderMonetizationModelProvider, CryptoPowerInfoAlertProvider cryptoPowerInfoAlertProvider, EventLogger eventLogger, Resources resources, CryptoTradeDisclosuresProvider cryptoTradeDisclosuresProvider, RealCryptoTradeUserInputsService cryptoTradeUserInputsService, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, MicrogramManager microgramManager, CryptoLimitOrderStateProvider stateProvider) {
        super(new CryptoLimitOrderDataState.Loading((CryptoInputMode) cryptoInputModePref.get(), ((CryptoLimitOrderFragment.Args) INSTANCE.getArgs(savedStateHandle)).getOrderSide(), false, null, null, 28, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(bottomSheetService, "bottomSheetService");
        Intrinsics.checkNotNullParameter(cryptoEventLogger, "cryptoEventLogger");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(cryptoInputModePref, "cryptoInputModePref");
        Intrinsics.checkNotNullParameter(cryptoOrderContextFactory, "cryptoOrderContextFactory");
        Intrinsics.checkNotNullParameter(cryptoOrderManager, "cryptoOrderManager");
        Intrinsics.checkNotNullParameter(cryptoOrderMonetizationModelProvider, "cryptoOrderMonetizationModelProvider");
        Intrinsics.checkNotNullParameter(cryptoPowerInfoAlertProvider, "cryptoPowerInfoAlertProvider");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(cryptoTradeDisclosuresProvider, "cryptoTradeDisclosuresProvider");
        Intrinsics.checkNotNullParameter(cryptoTradeUserInputsService, "cryptoTradeUserInputsService");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.bottomSheetService = bottomSheetService;
        this.cryptoEventLogger = cryptoEventLogger;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.cryptoInputModePref = cryptoInputModePref;
        this.cryptoOrderContextFactory = cryptoOrderContextFactory;
        this.cryptoOrderManager = cryptoOrderManager;
        this.cryptoOrderMonetizationModelProvider = cryptoOrderMonetizationModelProvider;
        this.cryptoPowerInfoAlertProvider = cryptoPowerInfoAlertProvider;
        this.eventLogger = eventLogger;
        this.resources = resources;
        this.cryptoTradeDisclosuresProvider = cryptoTradeDisclosuresProvider;
        this.cryptoTradeUserInputsService = cryptoTradeUserInputsService;
        this.savedStateHandle = savedStateHandle;
        this.staticInputs = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoLimitOrderDuxo.staticInputs_delegate$lambda$0(this.f$0);
            }
        });
        this.validateAndSubmitOrderTrigger = SharedFlow4.MutableSharedFlow$default(0, 0, null, 7, null);
        MicrogramManager2 microgramManager2M16549getInstancemoChb0s$default = MicrogramManager.DefaultImpls.m16549getInstancemoChb0s$default(microgramManager, getLifecycleScope(), new MicrogramLaunchId(new RemoteMicrogramApplication("app-crypto-trading", null, 2, null), null, 2, null), null, 4, null);
        this.cryptoTradingMicrogram = microgramManager2M16549getInstancemoChb0s$default;
        this.microgramOrderValidationService = (CryptoOrderValidationService) microgramManager2M16549getInstancemoChb0s$default.getComponent().getServiceLocator().getClient(CryptoOrderValidationService.class);
    }

    private final StaticInputs getStaticInputs() {
        return (StaticInputs) this.staticInputs.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StaticInputs staticInputs_delegate$lambda$0(CryptoLimitOrderDuxo cryptoLimitOrderDuxo) {
        Companion companion = INSTANCE;
        return new StaticInputs(((CryptoLimitOrderFragment.Args) companion.getArgs((HasSavedState) cryptoLimitOrderDuxo)).getCurrencyPairId(), ((CryptoLimitOrderFragment.Args) companion.getArgs((HasSavedState) cryptoLimitOrderDuxo)).getOrderUuid());
    }

    public final Screen getEventScreen() {
        Screen.Name name = Screen.Name.CRYPTO_ORDER_ENTRY;
        String string2 = ((CryptoLimitOrderFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getCurrencyPairId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Screen(name, null, string2, null, 10, null);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        CryptoOrderContextFactory cryptoOrderContextFactory = this.cryptoOrderContextFactory;
        Screen eventScreen = getEventScreen();
        StaticInputs staticInputs = getStaticInputs();
        final StateFlow<CryptoLimitOrderViewState> stateFlow = getStateFlow();
        SharedFlow sharedFlowShareIn = FlowKt.shareIn(FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(cryptoOrderContextFactory.create(eventScreen, staticInputs, asObservable(new Flow<RequestInputs>() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onStart$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super RequestInputs> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow.collect(new C402352(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onStart$$inlined$map$1$2 */
            public static final class C402352<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onStart$$inlined$map$1$2", m3645f = "CryptoLimitOrderDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onStart$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C402352.this.emit(null, this);
                    }
                }

                public C402352(FlowCollector flowCollector) {
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
                        RequestInputs requestInputs = ((CryptoLimitOrderViewState) obj).getRequestInputs();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(requestInputs, anonymousClass1) == coroutine_suspended) {
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
        }))), Integer.MAX_VALUE, null, 2, null)), getLifecycleScope(), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), 1);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C402461(sharedFlowShareIn, this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C402472(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C402483(sharedFlowShareIn, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C402494(null), 3, null);
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C402505(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C402516(null));
    }

    /* compiled from: CryptoLimitOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onStart$1", m3645f = "CryptoLimitOrderDuxo.kt", m3646l = {147}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onStart$1 */
    static final class C402461 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SharedFlow<CryptoOrderContext> $orderContextFlow;
        int label;
        final /* synthetic */ CryptoLimitOrderDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C402461(SharedFlow<CryptoOrderContext> sharedFlow, CryptoLimitOrderDuxo cryptoLimitOrderDuxo, Continuation<? super C402461> continuation) {
            super(2, continuation);
            this.$orderContextFlow = sharedFlow;
            this.this$0 = cryptoLimitOrderDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C402461(this.$orderContextFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C402461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<CryptoOrderContext> sharedFlow = this.$orderContextFlow;
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

        /* compiled from: CryptoLimitOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "cryptoOrderContext", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onStart$1$1", m3645f = "CryptoLimitOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoOrderContext, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoLimitOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoLimitOrderDuxo cryptoLimitOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoLimitOrderDuxo;
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

            /* compiled from: CryptoLimitOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onStart$1$1$1", m3645f = "CryptoLimitOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onStart$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507651 extends ContinuationImpl7 implements Function2<CryptoLimitOrderDataState, Continuation<? super CryptoLimitOrderDataState>, Object> {
                final /* synthetic */ CryptoOrderContext $cryptoOrderContext;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CryptoLimitOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507651(CryptoLimitOrderDuxo cryptoLimitOrderDuxo, CryptoOrderContext cryptoOrderContext, Continuation<? super C507651> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoLimitOrderDuxo;
                    this.$cryptoOrderContext = cryptoOrderContext;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507651 c507651 = new C507651(this.this$0, this.$cryptoOrderContext, continuation);
                    c507651.L$0 = obj;
                    return c507651;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoLimitOrderDataState cryptoLimitOrderDataState, Continuation<? super CryptoLimitOrderDataState> continuation) {
                    return ((C507651) create(cryptoLimitOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CryptoLimitOrderDataState cryptoLimitOrderDataState = (CryptoLimitOrderDataState) this.L$0;
                    if (cryptoLimitOrderDataState instanceof CryptoLimitOrderDataState.Loading) {
                        OrderSide orderSide = ((CryptoLimitOrderFragment.Args) CryptoLimitOrderDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getOrderSide();
                        CryptoLimitOrderDataState.Loading loading = (CryptoLimitOrderDataState.Loading) cryptoLimitOrderDataState;
                        return new CryptoLimitOrderDataState.Loaded(loading.getIsAccessibilityEnabled(), null, (CryptoInputMode) this.this$0.cryptoInputModePref.get(), null, orderSide, false, false, loading.getPowerInfoAlert(), loading.getCryptoOrderMonetizationModel(), Locales2.getMonetaryDecimalSeparator(CurrencyFormatterLocale.INSTANCE.getInstance().getCryptoLocale()), this.this$0.bottomSheetService, null, null, this.$cryptoOrderContext, null, null, null, false, 252010, null);
                    }
                    if (!(cryptoLimitOrderDataState instanceof CryptoLimitOrderDataState.Loaded)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return CryptoLimitOrderDataState.Loaded.copy$default((CryptoLimitOrderDataState.Loaded) cryptoLimitOrderDataState, false, null, null, null, null, false, false, null, null, (char) 0, null, null, null, this.$cryptoOrderContext, null, null, null, false, 253951, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CryptoOrderContext cryptoOrderContext = (CryptoOrderContext) this.L$0;
                CryptoLimitOrderDuxo cryptoLimitOrderDuxo = this.this$0;
                cryptoLimitOrderDuxo.applyMutation(new C507651(cryptoLimitOrderDuxo, cryptoOrderContext, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoLimitOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onStart$2", m3645f = "CryptoLimitOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onStart$2 */
    static final class C402472 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C402472(Continuation<? super C402472> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoLimitOrderDuxo.this.new C402472(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C402472) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoPowerInfoAlertProvider cryptoPowerInfoAlertProvider = CryptoLimitOrderDuxo.this.cryptoPowerInfoAlertProvider;
                Companion companion = CryptoLimitOrderDuxo.INSTANCE;
                Flow powerInfoAlertFlow$default = CryptoPowerInfoAlertProvider.getPowerInfoAlertFlow$default(cryptoPowerInfoAlertProvider, ((CryptoLimitOrderFragment.Args) companion.getArgs((HasSavedState) CryptoLimitOrderDuxo.this)).getCurrencyPairId(), ((CryptoLimitOrderFragment.Args) companion.getArgs((HasSavedState) CryptoLimitOrderDuxo.this)).getOrderSide(), null, 4, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoLimitOrderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(powerInfoAlertFlow$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoLimitOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/ui/ServerDrivenAlert;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onStart$2$1", m3645f = "CryptoLimitOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onStart$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ServerDrivenAlert, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoLimitOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoLimitOrderDuxo cryptoLimitOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoLimitOrderDuxo;
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

            /* compiled from: CryptoLimitOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onStart$2$1$1", m3645f = "CryptoLimitOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onStart$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507661 extends ContinuationImpl7 implements Function2<CryptoLimitOrderDataState, Continuation<? super CryptoLimitOrderDataState>, Object> {
                final /* synthetic */ ServerDrivenAlert $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507661(ServerDrivenAlert serverDrivenAlert, Continuation<? super C507661> continuation) {
                    super(2, continuation);
                    this.$it = serverDrivenAlert;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507661 c507661 = new C507661(this.$it, continuation);
                    c507661.L$0 = obj;
                    return c507661;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoLimitOrderDataState cryptoLimitOrderDataState, Continuation<? super CryptoLimitOrderDataState> continuation) {
                    return ((C507661) create(cryptoLimitOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CryptoLimitOrderDataState cryptoLimitOrderDataState = (CryptoLimitOrderDataState) this.L$0;
                    if (cryptoLimitOrderDataState instanceof CryptoLimitOrderDataState.Loaded) {
                        return CryptoLimitOrderDataState.Loaded.copy$default((CryptoLimitOrderDataState.Loaded) cryptoLimitOrderDataState, false, null, null, null, null, false, false, this.$it, null, (char) 0, null, null, null, null, null, null, null, false, 262015, null);
                    }
                    if (cryptoLimitOrderDataState instanceof CryptoLimitOrderDataState.Loading) {
                        return CryptoLimitOrderDataState.Loading.copy$default((CryptoLimitOrderDataState.Loading) cryptoLimitOrderDataState, null, null, false, this.$it, null, 23, null);
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C507661((ServerDrivenAlert) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: CryptoLimitOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onStart$3", m3645f = "CryptoLimitOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_INCOME_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onStart$3 */
    static final class C402483 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SharedFlow<CryptoOrderContext> $orderContextFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C402483(SharedFlow<CryptoOrderContext> sharedFlow, Continuation<? super C402483> continuation) {
            super(2, continuation);
            this.$orderContextFlow = sharedFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoLimitOrderDuxo.this.new C402483(this.$orderContextFlow, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C402483) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(CryptoLimitOrderDuxo.this.validateAndSubmitOrderTrigger, new C40236x606855b4(null, this.$orderContextFlow));
                final CryptoLimitOrderDuxo cryptoLimitOrderDuxo = CryptoLimitOrderDuxo.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo.onStart.3.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((CryptoOrderContext) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(CryptoOrderContext cryptoOrderContext, Continuation<? super Unit> continuation) {
                        CryptoLimitOrderDuxo.performMicrogramOrderValidation$default(cryptoLimitOrderDuxo, cryptoOrderContext, null, 2, null);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowTransformLatest.collect(flowCollector, this) == coroutine_suspended) {
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

    /* compiled from: CryptoLimitOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onStart$4", m3645f = "CryptoLimitOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PIN_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onStart$4 */
    static final class C402494 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C402494(Continuation<? super C402494> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoLimitOrderDuxo.this.new C402494(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C402494) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoOrderMonetizationModelProvider cryptoOrderMonetizationModelProvider = CryptoLimitOrderDuxo.this.cryptoOrderMonetizationModelProvider;
                UUID currencyPairId = ((CryptoLimitOrderFragment.Args) CryptoLimitOrderDuxo.INSTANCE.getArgs((HasSavedState) CryptoLimitOrderDuxo.this)).getCurrencyPairId();
                this.label = 1;
                obj = cryptoOrderMonetizationModelProvider.get(currencyPairId, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CryptoLimitOrderDuxo.this.applyMutation(new AnonymousClass1((CryptoOrderMonetizationModel) obj, null));
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoLimitOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onStart$4$1", m3645f = "CryptoLimitOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onStart$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoLimitOrderDataState, Continuation<? super CryptoLimitOrderDataState>, Object> {
            final /* synthetic */ CryptoOrderMonetizationModel $orderMonetizationModel;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoOrderMonetizationModel cryptoOrderMonetizationModel, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$orderMonetizationModel = cryptoOrderMonetizationModel;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$orderMonetizationModel, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoLimitOrderDataState cryptoLimitOrderDataState, Continuation<? super CryptoLimitOrderDataState> continuation) {
                return ((AnonymousClass1) create(cryptoLimitOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CryptoLimitOrderDataState cryptoLimitOrderDataState = (CryptoLimitOrderDataState) this.L$0;
                if (cryptoLimitOrderDataState instanceof CryptoLimitOrderDataState.Loaded) {
                    return CryptoLimitOrderDataState.Loaded.copy$default((CryptoLimitOrderDataState.Loaded) cryptoLimitOrderDataState, false, null, null, null, null, false, false, null, this.$orderMonetizationModel, (char) 0, null, null, null, null, null, null, null, false, 261887, null);
                }
                if (cryptoLimitOrderDataState instanceof CryptoLimitOrderDataState.Loading) {
                    return CryptoLimitOrderDataState.Loading.copy$default((CryptoLimitOrderDataState.Loading) cryptoLimitOrderDataState, null, null, false, null, this.$orderMonetizationModel, 15, null);
                }
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* compiled from: CryptoLimitOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onStart$5", m3645f = "CryptoLimitOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onStart$5 */
    static final class C402505 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C402505(Continuation<? super C402505> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoLimitOrderDuxo.this.new C402505(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C402505) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<CryptoLimitOrderViewState> stateFlow = CryptoLimitOrderDuxo.this.getStateFlow();
                Flow<CryptoOrderContext> flow = new Flow<CryptoOrderContext>() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onStart$5$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super CryptoOrderContext> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onStart$5$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onStart$5$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "CryptoLimitOrderDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onStart$5$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                CryptoLimitOrderViewState cryptoLimitOrderViewState = (CryptoLimitOrderViewState) obj;
                                CryptoLimitOrderViewState.Loaded loaded = cryptoLimitOrderViewState instanceof CryptoLimitOrderViewState.Loaded ? (CryptoLimitOrderViewState.Loaded) cryptoLimitOrderViewState : null;
                                CryptoOrderContext cryptoOrderContext = loaded != null ? loaded.getCryptoOrderContext() : null;
                                if (cryptoOrderContext != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(cryptoOrderContext, anonymousClass1) == coroutine_suspended) {
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
                };
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(CryptoLimitOrderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: CryptoLimitOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onStart$5$2", m3645f = "CryptoLimitOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onStart$5$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CryptoOrderContext, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoLimitOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CryptoLimitOrderDuxo cryptoLimitOrderDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cryptoLimitOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoOrderContext cryptoOrderContext, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(cryptoOrderContext, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CryptoOrderContext cryptoOrderContext = (CryptoOrderContext) this.L$0;
                    RealCryptoTradeUserInputsService realCryptoTradeUserInputsService = this.this$0.cryptoTradeUserInputsService;
                    this.label = 1;
                    if (realCryptoTradeUserInputsService.setCryptoOrderContext(cryptoOrderContext, this) == coroutine_suspended) {
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

    /* compiled from: CryptoLimitOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onStart$6", m3645f = "CryptoLimitOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onStart$6 */
    static final class C402516 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C402516(Continuation<? super C402516> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoLimitOrderDuxo.this.new C402516(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C402516) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<CryptoLimitOrderViewState> stateFlow = CryptoLimitOrderDuxo.this.getStateFlow();
                Flow flowTransformLatest = FlowKt.transformLatest(new Flow<CryptoOrderContext>() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onStart$6$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super CryptoOrderContext> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onStart$6$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onStart$6$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "CryptoLimitOrderDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onStart$6$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                CryptoLimitOrderViewState cryptoLimitOrderViewState = (CryptoLimitOrderViewState) obj;
                                CryptoLimitOrderViewState.Loaded loaded = cryptoLimitOrderViewState instanceof CryptoLimitOrderViewState.Loaded ? (CryptoLimitOrderViewState.Loaded) cryptoLimitOrderViewState : null;
                                CryptoOrderContext cryptoOrderContext = loaded != null ? loaded.getCryptoOrderContext() : null;
                                if (cryptoOrderContext != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(cryptoOrderContext, anonymousClass1) == coroutine_suspended) {
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
                }, new C40239x65c22851(null, CryptoLimitOrderDuxo.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(CryptoLimitOrderDuxo.this, null);
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

        /* compiled from: CryptoLimitOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onStart$6$3", m3645f = "CryptoLimitOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onStart$6$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CryptoOrderReviewMessageAndDisclosuresState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoLimitOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CryptoLimitOrderDuxo cryptoLimitOrderDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = cryptoLimitOrderDuxo;
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

            /* JADX INFO: Access modifiers changed from: private */
            public static final CryptoLimitOrderDataState.Loaded invokeSuspend$lambda$0(CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState, CryptoLimitOrderDataState.Loaded loaded) {
                return CryptoLimitOrderDataState.Loaded.copy$default(loaded, false, null, null, null, null, false, false, null, null, (char) 0, null, cryptoOrderReviewMessageAndDisclosuresState, null, null, null, null, null, false, 260095, null);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState = (CryptoOrderReviewMessageAndDisclosuresState) this.L$0;
                this.this$0.applyMutationIfLoaded$feature_trade_crypto_externalDebug(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onStart$6$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CryptoLimitOrderDuxo.C402516.AnonymousClass3.invokeSuspend$lambda$0(cryptoOrderReviewMessageAndDisclosuresState, (CryptoLimitOrderDataState.Loaded) obj2);
                    }
                });
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoLimitOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onCreate$1", m3645f = "CryptoLimitOrderDuxo.kt", m3646l = {EnumC7081g.f2778x3356acf6}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onCreate$1 */
    static final class C402451 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C402451(Continuation<? super C402451> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoLimitOrderDuxo.this.new C402451(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C402451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<DialogFragmentKey> flowStreamLaunchDialog = CryptoLimitOrderDuxo.this.bottomSheetService.streamLaunchDialog();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoLimitOrderDuxo.this, null);
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

        /* compiled from: CryptoLimitOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onCreate$1$1", m3645f = "CryptoLimitOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DialogFragmentKey, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoLimitOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoLimitOrderDuxo cryptoLimitOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoLimitOrderDuxo;
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
                this.this$0.submit(new CryptoLimitOrderEvent.ShowDialogFragment((DialogFragmentKey) this.L$0));
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C402451(null));
    }

    static /* synthetic */ void performMicrogramOrderValidation$default(CryptoLimitOrderDuxo cryptoLimitOrderDuxo, CryptoOrderContext cryptoOrderContext, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        cryptoLimitOrderDuxo.performMicrogramOrderValidation(cryptoOrderContext, str);
    }

    /* compiled from: CryptoLimitOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$performMicrogramOrderValidation$1", m3645f = "CryptoLimitOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_BOLT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$performMicrogramOrderValidation$1 */
    static final class C402531 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $acknowledgeId;
        final /* synthetic */ CryptoOrderContext $orderContext;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C402531(CryptoOrderContext cryptoOrderContext, String str, Continuation<? super C402531> continuation) {
            super(2, continuation);
            this.$orderContext = cryptoOrderContext;
            this.$acknowledgeId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoLimitOrderDuxo.this.new C402531(this.$orderContext, this.$acknowledgeId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C402531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoEventLogger.DefaultImpls.logCryptoOrderEvent$default(CryptoLimitOrderDuxo.this.cryptoEventLogger, OrderFormStep.REVIEW, this.$orderContext.getRequest().toApiRequest(), this.$orderContext.getRequestContext().getRequestInputs().getMonetizationModel(), null, 8, null);
                CryptoLimitOrderDuxo.this.applyMutationIfLoaded$feature_trade_crypto_externalDebug(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$performMicrogramOrderValidation$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CryptoLimitOrderDuxo.C402531.invokeSuspend$lambda$0((CryptoLimitOrderDataState.Loaded) obj2);
                    }
                });
                CryptoOrderValidationService cryptoOrderValidationService = CryptoLimitOrderDuxo.this.microgramOrderValidationService;
                ValidateCryptoOrderRequestDto validateCryptoOrderRequestDtoValidateCryptoOrderRequestDto$default = CryptoOrderContexts.validateCryptoOrderRequestDto$default(this.$orderContext, null, this.$acknowledgeId, CryptoLimitOrderDuxo.this.resources, 1, null);
                this.label = 1;
                obj = cryptoOrderValidationService.ValidateCryptoOrder(validateCryptoOrderRequestDtoValidateCryptoOrderRequestDto$default, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ValidateCryptoOrderResponseDto.MobileDto mobile = ((ValidateCryptoOrderResponseDto) obj).getMobile();
            AlertDto alert = mobile != null ? mobile.getAlert() : null;
            if (alert != null) {
                CryptoLimitOrderDuxo.this.applyMutationIfLoaded$feature_trade_crypto_externalDebug(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$performMicrogramOrderValidation$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CryptoLimitOrderDuxo.C402531.invokeSuspend$lambda$1((CryptoLimitOrderDataState.Loaded) obj2);
                    }
                });
                CryptoLimitOrderDuxo.this.submit(new CryptoLimitOrderEvent.ShowAlertDto(alert, this.$orderContext.getLoggingCryptoOrderContext()));
            } else {
                CryptoLimitOrderDuxo.this.onValidationSucceed();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CryptoLimitOrderDataState.Loaded invokeSuspend$lambda$0(CryptoLimitOrderDataState.Loaded loaded) {
            return CryptoLimitOrderDataState.Loaded.copy$default(loaded, false, null, null, null, null, false, false, null, null, (char) 0, null, null, null, null, null, null, null, true, 131071, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CryptoLimitOrderDataState.Loaded invokeSuspend$lambda$1(CryptoLimitOrderDataState.Loaded loaded) {
            return CryptoLimitOrderDataState.Loaded.copy$default(loaded, false, null, null, null, null, false, false, null, null, (char) 0, null, null, null, null, null, null, null, false, 131071, null);
        }
    }

    private final void performMicrogramOrderValidation(CryptoOrderContext orderContext, String acknowledgeId) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C402531(orderContext, acknowledgeId, null), 3, null);
    }

    /* compiled from: CryptoLimitOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onAccessibilityEnabled$1", m3645f = "CryptoLimitOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onAccessibilityEnabled$1 */
    static final class C402441 extends ContinuationImpl7 implements Function2<CryptoLimitOrderDataState, Continuation<? super CryptoLimitOrderDataState>, Object> {
        final /* synthetic */ boolean $isAccessibilityEnabled;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C402441(boolean z, Continuation<? super C402441> continuation) {
            super(2, continuation);
            this.$isAccessibilityEnabled = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C402441 c402441 = new C402441(this.$isAccessibilityEnabled, continuation);
            c402441.L$0 = obj;
            return c402441;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoLimitOrderDataState cryptoLimitOrderDataState, Continuation<? super CryptoLimitOrderDataState> continuation) {
            return ((C402441) create(cryptoLimitOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoLimitOrderDataState cryptoLimitOrderDataState = (CryptoLimitOrderDataState) this.L$0;
            if (cryptoLimitOrderDataState instanceof CryptoLimitOrderDataState.Loaded) {
                return CryptoLimitOrderDataState.Loaded.copy$default((CryptoLimitOrderDataState.Loaded) cryptoLimitOrderDataState, this.$isAccessibilityEnabled, null, null, null, null, false, false, null, null, (char) 0, null, null, null, null, null, null, null, false, 262142, null);
            }
            if (cryptoLimitOrderDataState instanceof CryptoLimitOrderDataState.Loading) {
                return CryptoLimitOrderDataState.Loading.copy$default((CryptoLimitOrderDataState.Loading) cryptoLimitOrderDataState, null, null, this.$isAccessibilityEnabled, null, null, 27, null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void onAccessibilityEnabled(boolean isAccessibilityEnabled) {
        applyMutation(new C402441(isAccessibilityEnabled, null));
    }

    public final void onInputTypeTapped(final CryptoInputMode currentInputMode) {
        Intrinsics.checkNotNullParameter(currentInputMode, "currentInputMode");
        applyMutationIfLoaded$feature_trade_crypto_externalDebug(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoLimitOrderDuxo.onInputTypeTapped$lambda$2(currentInputMode, this, (CryptoLimitOrderDataState.Loaded) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoLimitOrderDataState.Loaded onInputTypeTapped$lambda$2(CryptoInputMode cryptoInputMode, CryptoLimitOrderDuxo cryptoLimitOrderDuxo, CryptoLimitOrderDataState.Loaded applyMutationIfLoaded) {
        Intrinsics.checkNotNullParameter(applyMutationIfLoaded, "$this$applyMutationIfLoaded");
        CryptoInputMode other = cryptoInputMode.getOther();
        cryptoLimitOrderDuxo.cryptoInputModePref.set(other);
        return CryptoLimitOrderDataState.Loaded.copy$default(applyMutationIfLoaded, false, null, other, null, null, false, false, null, null, (char) 0, null, null, null, null, "", null, null, false, 245753, null);
    }

    public final void consumeKeyEvent(final KeyEvent keyEvent, final CryptoLimitOrderEdtType focusedEdtType) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        Intrinsics.checkNotNullParameter(focusedEdtType, "focusedEdtType");
        applyMutationIfLoaded$feature_trade_crypto_externalDebug(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoLimitOrderDuxo.consumeKeyEvent$lambda$3(focusedEdtType, keyEvent, (CryptoLimitOrderDataState.Loaded) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoLimitOrderDataState.Loaded consumeKeyEvent$lambda$3(CryptoLimitOrderEdtType cryptoLimitOrderEdtType, KeyEvent keyEvent, CryptoLimitOrderDataState.Loaded applyMutationIfLoaded) {
        int decimalScale;
        Intrinsics.checkNotNullParameter(applyMutationIfLoaded, "$this$applyMutationIfLoaded");
        int i = WhenMappings.$EnumSwitchMapping$1[cryptoLimitOrderEdtType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return applyMutationIfLoaded;
                }
                throw new NoWhenBranchMatchedException();
            }
            Tuples2 tuples2ProcessKeyEvent$default = CryptoInstrumentInputHelper.processKeyEvent$default(applyMutationIfLoaded.getLimitPriceCryptoInstrumentInputHelper(), keyEvent, applyMutationIfLoaded.getLimitPriceFormatted(), CryptoInputMode.QUOTE_CURRENCY, false, false, true, false, 72, null);
            String str = (String) tuples2ProcessKeyEvent$default.component1();
            BigDecimal scale = ((BigDecimal) tuples2ProcessKeyEvent$default.component2()).setScale(applyMutationIfLoaded.getUiCurrencyPair().getQuoteCurrencyForPriceInput().getDecimalScale(), RoundingMode.DOWN);
            Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
            return CryptoLimitOrderDataState.Loaded.copy$default(applyMutationIfLoaded, false, null, null, new CryptoOrderPrices.Limit(scale), null, false, false, null, null, (char) 0, null, null, null, null, null, str, null, false, 229367, null);
        }
        Tuples2 tuples2ProcessKeyEvent$default2 = CryptoInstrumentInputHelper.processKeyEvent$default(applyMutationIfLoaded.getAmountCryptoInstrumentInputHelper(), keyEvent, applyMutationIfLoaded.getInputAmountFormatted(), applyMutationIfLoaded.getInputMode(), false, false, true, false, 72, null);
        String str2 = (String) tuples2ProcessKeyEvent$default2.component1();
        BigDecimal bigDecimal = (BigDecimal) tuples2ProcessKeyEvent$default2.component2();
        int i2 = WhenMappings.$EnumSwitchMapping$0[applyMutationIfLoaded.getInputMode().ordinal()];
        if (i2 == 1) {
            decimalScale = applyMutationIfLoaded.getUiCurrencyPair().getQuoteCurrency().getDecimalScale();
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            decimalScale = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(applyMutationIfLoaded.getUiCurrencyPair().getMinOrderQuantityIncrement()).scale();
        }
        return CryptoLimitOrderDataState.Loaded.copy$default(applyMutationIfLoaded, false, bigDecimal.setScale(decimalScale, RoundingMode.DOWN), null, null, null, false, false, null, null, (char) 0, null, null, null, null, str2, null, null, false, 245757, null);
    }

    /* compiled from: CryptoLimitOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$setFocusedEdt$1", m3645f = "CryptoLimitOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$setFocusedEdt$1 */
    static final class C402541 extends ContinuationImpl7 implements Function2<CryptoLimitOrderDataState, Continuation<? super CryptoLimitOrderDataState>, Object> {
        final /* synthetic */ boolean $isAmountEdtFocused;
        final /* synthetic */ boolean $isLimitPriceEdtFocused;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C402541(boolean z, boolean z2, Continuation<? super C402541> continuation) {
            super(2, continuation);
            this.$isAmountEdtFocused = z;
            this.$isLimitPriceEdtFocused = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C402541 c402541 = new C402541(this.$isAmountEdtFocused, this.$isLimitPriceEdtFocused, continuation);
            c402541.L$0 = obj;
            return c402541;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoLimitOrderDataState cryptoLimitOrderDataState, Continuation<? super CryptoLimitOrderDataState> continuation) {
            return ((C402541) create(cryptoLimitOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            CryptoLimitOrderEdtType cryptoLimitOrderEdtType;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoLimitOrderDataState cryptoLimitOrderDataState = (CryptoLimitOrderDataState) this.L$0;
            if (cryptoLimitOrderDataState instanceof CryptoLimitOrderDataState.Loaded) {
                CryptoLimitOrderDataState.Loaded loaded = (CryptoLimitOrderDataState.Loaded) cryptoLimitOrderDataState;
                if (this.$isAmountEdtFocused) {
                    cryptoLimitOrderEdtType = CryptoLimitOrderEdtType.AMOUNT;
                } else {
                    cryptoLimitOrderEdtType = this.$isLimitPriceEdtFocused ? CryptoLimitOrderEdtType.LIMIT_PRICE : CryptoLimitOrderEdtType.NONE;
                }
                return CryptoLimitOrderDataState.Loaded.copy$default(loaded, false, null, null, null, null, false, false, null, null, (char) 0, null, null, null, null, null, null, cryptoLimitOrderEdtType, false, 196607, null);
            }
            if (cryptoLimitOrderDataState instanceof CryptoLimitOrderDataState.Loading) {
                return cryptoLimitOrderDataState;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void setFocusedEdt(boolean isAmountEdtFocused, boolean isLimitPriceEdtFocused) {
        applyMutation(new C402541(isAmountEdtFocused, isLimitPriceEdtFocused, null));
    }

    public final void onLimitPriceTapped() {
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoLimitOrderDuxo.onLimitPriceTapped$lambda$4(this.f$0, (CryptoLimitOrderDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onLimitPriceTapped$lambda$4(CryptoLimitOrderDuxo cryptoLimitOrderDuxo, CryptoLimitOrderDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BuildersKt__Builders_commonKt.launch$default(cryptoLimitOrderDuxo.getLifecycleScope(), null, null, new CryptoLimitOrderDuxo3(cryptoLimitOrderDuxo, (CryptoLimitOrderDataState.Loaded) it, null), 3, null);
        return Unit.INSTANCE;
    }

    public final void handleCryptoOrderReviewRowOnTap(CryptoOrderReviewRowState.TapAction tapAction) {
        Intrinsics.checkNotNullParameter(tapAction, "tapAction");
        if (tapAction instanceof CryptoOrderReviewRowState.TapAction.ShowFeeDefinitionBottomSheet) {
            showFeeDefinitionBottomSheet(((CryptoOrderReviewRowState.TapAction.ShowFeeDefinitionBottomSheet) tapAction).getUiFeeEstimation());
            return;
        }
        throw new IllegalStateException((tapAction + " not supported on EU limit screen").toString());
    }

    public final void validateAndReviewOrder() {
        applyMutationIfLoaded$feature_trade_crypto_externalDebug(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoLimitOrderDuxo.validateAndReviewOrder$lambda$5(this.f$0, (CryptoLimitOrderDataState.Loaded) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoLimitOrderDataState.Loaded validateAndReviewOrder$lambda$5(CryptoLimitOrderDuxo cryptoLimitOrderDuxo, CryptoLimitOrderDataState.Loaded applyMutationIfLoaded) {
        CryptoLimitOrderDataState.Loaded loadedCopy$default;
        BigDecimal decimalValue;
        Intrinsics.checkNotNullParameter(applyMutationIfLoaded, "$this$applyMutationIfLoaded");
        EventLogger.DefaultImpls.logTap$default(cryptoLimitOrderDuxo.cryptoEventLogger, null, cryptoLimitOrderDuxo.getEventScreen(), new Component(Component.ComponentType.BUTTON, "review", null, 4, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, applyMutationIfLoaded.getCryptoOrderContext().getLoggingCryptoOrderContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -2049, -1, -1, 16383, null), false, 41, null);
        if (applyMutationIfLoaded.getOrderPrices() == null) {
            CryptoInstrumentInputHelper limitPriceCryptoInstrumentInputHelper = applyMutationIfLoaded.getLimitPriceCryptoInstrumentInputHelper();
            UiCurrencyPair currencyPair = applyMutationIfLoaded.getCryptoOrderContext().getRequestContext().getCurrencyPair();
            int i = WhenMappings.$EnumSwitchMapping$2[applyMutationIfLoaded.getOrderSide().ordinal()];
            if (i == 1) {
                decimalValue = applyMutationIfLoaded.getCryptoOrderContext().getRequestContext().getQuote().getAskPrice().getDecimalValue();
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                decimalValue = applyMutationIfLoaded.getCryptoOrderContext().getRequestContext().getQuote().getBidPrice().getDecimalValue();
            }
            Tuples2 tuples2ProcessAmount$default = CryptoInstrumentInputHelper.processAmount$default(limitPriceCryptoInstrumentInputHelper, currencyPair.roundToTickSize(decimalValue, applyMutationIfLoaded.getOrderSide()), null, CryptoInputMode.QUOTE_CURRENCY, true, false, true, false, 66, null);
            loadedCopy$default = CryptoLimitOrderDataState.Loaded.copy$default(applyMutationIfLoaded, false, null, null, new CryptoOrderPrices.Limit((BigDecimal) tuples2ProcessAmount$default.component2()), null, false, false, null, null, (char) 0, null, null, null, null, null, (String) tuples2ProcessAmount$default.component1(), null, false, 229367, null);
        } else {
            loadedCopy$default = applyMutationIfLoaded;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(cryptoLimitOrderDuxo), null, null, new CryptoLimitOrderDuxo4(loadedCopy$default, cryptoLimitOrderDuxo, null), 3, null);
        return loadedCopy$default;
    }

    public final void initiateDeposit() {
        submit(new CryptoLimitOrderEvent.StartActivity(new Transfer(new TransferConfiguration.Standard(null, null, false, new TransferConfiguration.TransferAccountSelection(null, false, ApiTransferAccount.TransferAccountType.ACH, 3, null), new TransferConfiguration.TransferAccountSelection(null, false, ApiTransferAccount.TransferAccountType.RHS, 3, null), null, MAXTransferContext.EntryPoint.CRYPTO_ORDER_CHECK, null, false, false, null, null, false, 8103, null))));
    }

    public final void setOrderSize(final BigDecimal orderAmount, final BigDecimal orderQuantity) {
        Intrinsics.checkNotNullParameter(orderAmount, "orderAmount");
        Intrinsics.checkNotNullParameter(orderQuantity, "orderQuantity");
        applyMutationIfLoaded$feature_trade_crypto_externalDebug(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoLimitOrderDuxo.setOrderSize$lambda$6(orderAmount, orderQuantity, (CryptoLimitOrderDataState.Loaded) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoLimitOrderDataState.Loaded setOrderSize$lambda$6(BigDecimal bigDecimal, BigDecimal bigDecimal2, CryptoLimitOrderDataState.Loaded applyMutationIfLoaded) {
        BigDecimal bigDecimal3;
        Intrinsics.checkNotNullParameter(applyMutationIfLoaded, "$this$applyMutationIfLoaded");
        int i = WhenMappings.$EnumSwitchMapping$0[applyMutationIfLoaded.getInputMode().ordinal()];
        if (i == 1) {
            bigDecimal3 = bigDecimal;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bigDecimal3 = bigDecimal2;
        }
        CryptoInstrumentInputHelper amountCryptoInstrumentInputHelper = applyMutationIfLoaded.getAmountCryptoInstrumentInputHelper();
        BigDecimal bigDecimalM822m = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(bigDecimal3);
        Intrinsics.checkNotNullExpressionValue(bigDecimalM822m, "stripTrailingZeros(...)");
        return CryptoLimitOrderDataState.Loaded.copy$default(applyMutationIfLoaded, false, bigDecimal3, null, null, null, false, false, null, null, (char) 0, null, null, null, null, (String) CryptoInstrumentInputHelper.processAmount$default(amountCryptoInstrumentInputHelper, bigDecimalM822m, null, applyMutationIfLoaded.getInputMode(), true, false, true, false, 66, null).component1(), null, null, false, 245757, null);
    }

    public final void setLimitPrice(final BigDecimal limitPrice) {
        Intrinsics.checkNotNullParameter(limitPrice, "limitPrice");
        applyMutationIfLoaded$feature_trade_crypto_externalDebug(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoLimitOrderDuxo.setLimitPrice$lambda$7(limitPrice, (CryptoLimitOrderDataState.Loaded) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoLimitOrderDataState.Loaded setLimitPrice$lambda$7(BigDecimal bigDecimal, CryptoLimitOrderDataState.Loaded applyMutationIfLoaded) {
        Intrinsics.checkNotNullParameter(applyMutationIfLoaded, "$this$applyMutationIfLoaded");
        Tuples2 tuples2ProcessAmount$default = CryptoInstrumentInputHelper.processAmount$default(applyMutationIfLoaded.getLimitPriceCryptoInstrumentInputHelper(), bigDecimal, null, CryptoInputMode.QUOTE_CURRENCY, true, false, true, false, 66, null);
        return CryptoLimitOrderDataState.Loaded.copy$default(applyMutationIfLoaded, false, null, null, new CryptoOrderPrices.Limit((BigDecimal) tuples2ProcessAmount$default.component2()), null, false, false, null, null, (char) 0, null, null, null, null, null, (String) tuples2ProcessAmount$default.component1(), null, false, 229367, null);
    }

    /* compiled from: CryptoLimitOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onValidationSucceed$1", m3645f = "CryptoLimitOrderDuxo.kt", m3646l = {478, 479}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onValidationSucceed$1 */
    static final class C402521 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C402521(Continuation<? super C402521> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoLimitOrderDuxo.this.new C402521(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C402521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        
            if (r5.suspendUntilReady(r4) == r0) goto L17;
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
                Flow<Boolean> flowStreamCryptoTradeFlowMicrogramDisclosureExperiment = CryptoLimitOrderDuxo.this.cryptoExperimentsStore.streamCryptoTradeFlowMicrogramDisclosureExperiment();
                this.label = 1;
                obj = FlowKt.first(flowStreamCryptoTradeFlowMicrogramDisclosureExperiment, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CryptoLimitOrderDuxo.this.applyMutationIfLoaded$feature_trade_crypto_externalDebug(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onValidationSucceed$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CryptoLimitOrderDuxo.C402521.invokeSuspend$lambda$0((CryptoLimitOrderDataState.Loaded) obj2);
                    }
                });
                CryptoLimitOrderDuxo.this.updateFormState(DefaultOrderState.REVIEWING);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            if (zBooleanValue) {
                CryptoTradeDisclosuresProvider cryptoTradeDisclosuresProvider = CryptoLimitOrderDuxo.this.cryptoTradeDisclosuresProvider;
                this.label = 2;
            } else if (zBooleanValue) {
                throw new NoWhenBranchMatchedException();
            }
            CryptoLimitOrderDuxo.this.applyMutationIfLoaded$feature_trade_crypto_externalDebug(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$onValidationSucceed$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return CryptoLimitOrderDuxo.C402521.invokeSuspend$lambda$0((CryptoLimitOrderDataState.Loaded) obj2);
                }
            });
            CryptoLimitOrderDuxo.this.updateFormState(DefaultOrderState.REVIEWING);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CryptoLimitOrderDataState.Loaded invokeSuspend$lambda$0(CryptoLimitOrderDataState.Loaded loaded) {
            return CryptoLimitOrderDataState.Loaded.copy$default(loaded, false, null, null, null, null, false, false, null, null, (char) 0, null, null, null, null, null, null, null, false, 131071, null);
        }
    }

    public final void onValidationSucceed() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C402521(null), 3, null);
    }

    public final void submitOrder() {
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoLimitOrderDuxo.submitOrder$lambda$8(this.f$0, (CryptoLimitOrderDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitOrder$lambda$8(CryptoLimitOrderDuxo cryptoLimitOrderDuxo, CryptoLimitOrderDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CryptoOrderContext cryptoOrderContext = ((CryptoLimitOrderDataState.Loaded) it).getCryptoOrderContext();
        ApiCryptoOrderRequest apiRequest = cryptoOrderContext.getRequest().toApiRequest();
        CryptoEventLogger.DefaultImpls.logCryptoOrderEvent$default(cryptoLimitOrderDuxo.cryptoEventLogger, OrderFormStep.SUBMIT, apiRequest, cryptoOrderContext.getRequestContext().getRequestInputs().getMonetizationModel(), null, 8, null);
        OrderSubmissionManager.submit$default(cryptoLimitOrderDuxo.cryptoOrderManager, new CryptoOrderManager.Request.Standard(apiRequest), null, false, 6, null);
        return Unit.INSTANCE;
    }

    public final void sellAll() {
        applyMutationIfLoaded$feature_trade_crypto_externalDebug(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoLimitOrderDuxo.sellAll$lambda$9(this.f$0, (CryptoLimitOrderDataState.Loaded) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoLimitOrderDataState.Loaded sellAll$lambda$9(CryptoLimitOrderDuxo cryptoLimitOrderDuxo, CryptoLimitOrderDataState.Loaded applyMutationIfLoaded) {
        CryptoOrderPrices.Limit limit;
        Intrinsics.checkNotNullParameter(applyMutationIfLoaded, "$this$applyMutationIfLoaded");
        CryptoInstrumentInputHelper amountCryptoInstrumentInputHelper = applyMutationIfLoaded.getAmountCryptoInstrumentInputHelper();
        UiCryptoHolding holding = applyMutationIfLoaded.getCryptoOrderContext().getRequestContext().getHolding();
        BigDecimal bigDecimalM822m = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(BigDecimals7.orZero(holding != null ? holding.getQuantityAvailable() : null));
        Intrinsics.checkNotNullExpressionValue(bigDecimalM822m, "stripTrailingZeros(...)");
        CryptoInputMode cryptoInputMode = CryptoInputMode.ASSET_CURRENCY;
        Tuples2 tuples2ProcessAmount$default = CryptoInstrumentInputHelper.processAmount$default(amountCryptoInstrumentInputHelper, bigDecimalM822m, null, cryptoInputMode, true, false, true, false, 66, null);
        String str = (String) tuples2ProcessAmount$default.component1();
        BigDecimal bigDecimal = (BigDecimal) tuples2ProcessAmount$default.component2();
        CryptoInstrumentInputHelper limitPriceCryptoInstrumentInputHelper = applyMutationIfLoaded.getLimitPriceCryptoInstrumentInputHelper();
        BigDecimal bigDecimalM822m2 = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(applyMutationIfLoaded.getCryptoOrderContext().getRequestContext().getCurrencyPair().roundToTickSize(applyMutationIfLoaded.getCryptoOrderContext().getRequestContext().getQuote().getBidPrice().getDecimalValue(), OrderSide.SELL));
        Intrinsics.checkNotNullExpressionValue(bigDecimalM822m2, "stripTrailingZeros(...)");
        Tuples2 tuples2ProcessAmount$default2 = CryptoInstrumentInputHelper.processAmount$default(limitPriceCryptoInstrumentInputHelper, bigDecimalM822m2, null, CryptoInputMode.QUOTE_CURRENCY, true, false, true, false, 66, null);
        String limitPriceFormatted = (String) tuples2ProcessAmount$default2.component1();
        BigDecimal bigDecimal2 = (BigDecimal) tuples2ProcessAmount$default2.component2();
        CryptoOrderPrices.Limit orderPrices = applyMutationIfLoaded.getOrderPrices();
        boolean zIsPositive = BigDecimals7.isPositive(BigDecimals7.orZero(orderPrices != null ? orderPrices.getLimitPrice() : null));
        DefaultOrderState defaultOrderState = DefaultOrderState.EDITING;
        DefaultOrderState defaultOrderState2 = DefaultOrderState.REVIEWING;
        cryptoLimitOrderDuxo.logScreenTransitionEvents(defaultOrderState, defaultOrderState2);
        if (zIsPositive) {
            limit = applyMutationIfLoaded.getOrderPrices();
        } else {
            limit = new CryptoOrderPrices.Limit(bigDecimal2);
        }
        if (zIsPositive) {
            limitPriceFormatted = applyMutationIfLoaded.getLimitPriceFormatted();
        }
        return CryptoLimitOrderDataState.Loaded.copy$default(applyMutationIfLoaded, false, bigDecimal, cryptoInputMode, limit, null, false, true, null, null, (char) 0, null, null, defaultOrderState2, null, str, limitPriceFormatted, null, false, 208817, null);
    }

    public final void updateFormState(final DefaultOrderState formState) {
        Intrinsics.checkNotNullParameter(formState, "formState");
        applyMutationIfLoaded$feature_trade_crypto_externalDebug(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoLimitOrderDuxo.updateFormState$lambda$10(formState, this, (CryptoLimitOrderDataState.Loaded) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoLimitOrderDataState.Loaded updateFormState$lambda$10(DefaultOrderState defaultOrderState, CryptoLimitOrderDuxo cryptoLimitOrderDuxo, CryptoLimitOrderDataState.Loaded applyMutationIfLoaded) {
        boolean isSellAllOrder;
        Intrinsics.checkNotNullParameter(applyMutationIfLoaded, "$this$applyMutationIfLoaded");
        if (defaultOrderState != applyMutationIfLoaded.getFormState()) {
            cryptoLimitOrderDuxo.logScreenTransitionEvents(applyMutationIfLoaded.getFormState(), defaultOrderState);
        }
        int i = WhenMappings.$EnumSwitchMapping$3[defaultOrderState.ordinal()];
        if (i == 1) {
            isSellAllOrder = false;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            isSellAllOrder = applyMutationIfLoaded.getIsSellAllOrder();
        }
        return CryptoLimitOrderDataState.Loaded.copy$default(applyMutationIfLoaded, false, null, null, null, null, false, isSellAllOrder, null, null, (char) 0, null, null, defaultOrderState, null, null, null, null, false, 257983, null);
    }

    public final void onHeaderSubtitleTapped() {
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoLimitOrderDuxo.onHeaderSubtitleTapped$lambda$12(this.f$0, (CryptoLimitOrderDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onHeaderSubtitleTapped$lambda$12(CryptoLimitOrderDuxo cryptoLimitOrderDuxo, CryptoLimitOrderDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        ServerDrivenAlert powerInfoAlert = dataState.getPowerInfoAlert();
        if (powerInfoAlert != null) {
            cryptoLimitOrderDuxo.submit(new CryptoLimitOrderEvent.ShowPowerInfoAlert(powerInfoAlert));
        }
        return Unit.INSTANCE;
    }

    private final void showFeeDefinitionBottomSheet(UiFeeEstimation uiFeeEstimation) {
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, null, getEventScreen(), new Component(Component.ComponentType.TOOLTIP, "crypto_fees", null, 4, null), null, null, false, 57, null);
        submit(new CryptoLimitOrderEvent.ShowFeeDefinitionBottomSheet(new CryptoFeeDefinitionBottomSheetFragment.Args(getEventScreen(), ((CryptoLimitOrderFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getCurrencyPairId(), uiFeeEstimation.getFeeRatio(), uiFeeEstimation.getMinFeeAmount(), uiFeeEstimation.getRobinhoodFeeRatio(), uiFeeEstimation.getExchangeFeeRatio(), false, null, 128, null)));
    }

    public final void applyMutationIfLoaded$feature_trade_crypto_externalDebug(Function1<? super CryptoLimitOrderDataState.Loaded, CryptoLimitOrderDataState.Loaded> mutator) {
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        applyMutation(new CryptoLimitOrderDuxo2(mutator, null));
    }

    private final void logScreenTransitionEvents(DefaultOrderState previousOrderState, DefaultOrderState newOrderState) {
        EventLogger eventLogger = this.eventLogger;
        Screen.Name analyticsScreenName = AnalyticsExtensions2.getAnalyticsScreenName(previousOrderState);
        Companion companion = INSTANCE;
        String string2 = ((CryptoLimitOrderFragment.Args) companion.getArgs((HasSavedState) this)).getCurrencyPairId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        EventLogger.DefaultImpls.logScreenDisappear$default(eventLogger, null, new Screen(analyticsScreenName, null, string2, null, 10, null), null, null, null, 29, null);
        EventLogger eventLogger2 = this.eventLogger;
        Screen.Name analyticsScreenName2 = AnalyticsExtensions2.getAnalyticsScreenName(newOrderState);
        String string3 = ((CryptoLimitOrderFragment.Args) companion.getArgs((HasSavedState) this)).getCurrencyPairId().toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        EventLogger.DefaultImpls.logScreenAppear$default(eventLogger2, null, new Screen(analyticsScreenName2, null, string3, null, 10, null), null, null, null, 29, null);
    }

    public final void onOrderValidationAcknowledgeAndContinue(final String acknowledgeId) {
        Intrinsics.checkNotNullParameter(acknowledgeId, "acknowledgeId");
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoLimitOrderDuxo.onOrderValidationAcknowledgeAndContinue$lambda$13(this.f$0, acknowledgeId, (CryptoLimitOrderDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onOrderValidationAcknowledgeAndContinue$lambda$13(CryptoLimitOrderDuxo cryptoLimitOrderDuxo, String str, CryptoLimitOrderDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        cryptoLimitOrderDuxo.performMicrogramOrderValidation(((CryptoLimitOrderDataState.Loaded) it).getCryptoOrderContext(), str);
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoLimitOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderDuxo;", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderFragment$Args;", "<init>", "()V", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CryptoLimitOrderDuxo, CryptoLimitOrderFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoLimitOrderFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (CryptoLimitOrderFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoLimitOrderFragment.Args getArgs(CryptoLimitOrderDuxo cryptoLimitOrderDuxo) {
            return (CryptoLimitOrderFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, cryptoLimitOrderDuxo);
        }
    }
}
