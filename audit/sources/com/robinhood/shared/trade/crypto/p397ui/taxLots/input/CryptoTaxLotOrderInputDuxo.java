package com.robinhood.shared.trade.crypto.p397ui.taxLots.input;

import android.os.Bundle;
import android.view.KeyEvent;
import androidx.lifecycle.SavedStateHandle;
import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
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
import com.robinhood.librobinhood.data.store.fee.monetizationModel.CryptoOrderMonetizationModelProvider;
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import com.robinhood.models.crypto.p315ui.UiCryptoHolding;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.crypto.p315ui.fee.CryptoOrderMonetizationModel;
import com.robinhood.models.crypto.p315ui.fee.UiFeeEstimation;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.ServerDrivenAlert;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderInputRowState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRowState;
import com.robinhood.shared.crypto.trading.bottomsheet.CryptoTradingBottomSheetService;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.formats.crypto.CryptoInstrumentInputHelper;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContextFactory;
import com.robinhood.shared.trade.crypto.microgram.RealCryptoTradeFeeEstimationService;
import com.robinhood.shared.trade.crypto.microgram.RealCryptoTradeUserInputsService;
import com.robinhood.shared.trade.crypto.p397ui.extensions.CryptoOrderContexts;
import com.robinhood.shared.trade.crypto.p397ui.fee.definitionBottomSheet.CryptoFeeDefinitionBottomSheetFragment;
import com.robinhood.shared.trade.crypto.p397ui.order.CryptoOrderPrices;
import com.robinhood.shared.trade.crypto.p397ui.powerInfoAlert.CryptoPowerInfoAlertProvider;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.input.CryptoTaxLotOrderInputDataState;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.input.CryptoTaxLotOrderInputDuxo;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.input.CryptoTaxLotOrderInputEvent;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.input.CryptoTaxLotOrderInputFragment;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.input.alert.lotLimit.CryptoTaxLotOrderInputLotLimitAlertDialogState;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.input.validation.CryptoTaxLotOrderInputValidatorProvider;
import com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator2;
import com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator3;
import com.robinhood.shared.trade.crypto.validation.CryptoOrderValidatorManager;
import com.robinhood.shared.trade.crypto.validation.RequestInputs;
import com.robinhood.shared.trade.crypto.validation.StaticInputs;
import com.robinhood.utils.math.BigDecimals7;
import contracts.crypto.trade.proto.p431v1.BottomSheetTypeDto;
import contracts.crypto.trade.proto.p431v1.CryptoTradeUserInputsService;
import contracts.crypto.trade.proto.p431v1.SourceDto;
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
import kotlin.collections.MapsKt;
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
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxConvert;
import microgram.android.MicrogramLaunchId;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.service.ManagedServiceExtension2;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.ClearTemporarilySelectedTaxLotStrategyRequestDto;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.ContinueWithSelectedTaxLotStrategyRequestDto;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.CryptoTradeFeeEstimationService;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.CryptoTradingTaxLotsService;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.InitializeCryptoTaxLotOrderInputRequestDto;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.StreamAvailableTaxLotStrategyViewModelsRequestDto;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.StreamAvailableTaxLotStrategyViewModelsResponseDto;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.StreamGainLossAmountRequestDto;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.StreamGainLossAmountResponseDto;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.StreamSelectedTaxLotStrategyRequestDto;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.StreamSelectedTaxLotStrategyResponseDto;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.UpdateTemporarilySelectedTaxLotStrategyRequestDto;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.ValidateStrategyAndQuantityRequestDto;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.ValidateStrategyAndQuantityResponseDto;
import nummus.p512v1.TaxLotStrategyTypeDto;

/* compiled from: CryptoTaxLotOrderInputDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 h2\u00020\u00012\u00020\u00022\u00020\u00032\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004:\u0001hBy\b\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#¢\u0006\u0004\b$\u0010%J\b\u0010:\u001a\u00020;H\u0016J\u000e\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020>J\u0006\u0010?\u001a\u00020;J\u0006\u0010@\u001a\u00020;J\u000e\u0010A\u001a\u00020;2\u0006\u0010B\u001a\u00020CJ\u0006\u0010D\u001a\u00020;J\u000e\u0010E\u001a\u00020;2\u0006\u0010F\u001a\u00020GJ\u000e\u0010H\u001a\u00020;2\u0006\u0010I\u001a\u00020JJ\u0006\u0010K\u001a\u00020;J\u000e\u0010L\u001a\u00020;2\u0006\u0010M\u001a\u00020NJ\u000e\u0010O\u001a\u00020;2\u0006\u0010M\u001a\u00020PJ\u0018\u0010Q\u001a\u00020;2\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020SH\u0016J\b\u0010U\u001a\u00020;H\u0016J\u0010\u0010V\u001a\u00020;2\u0006\u0010W\u001a\u00020SH\u0016J\u0010\u0010X\u001a\u00020;2\u0006\u0010Y\u001a\u00020ZH\u0016J\u0018\u0010[\u001a\u00020;2\u0006\u0010\\\u001a\u00020]2\u0006\u0010Y\u001a\u00020ZH\u0016J\u0010\u0010^\u001a\u00020_2\b\u0010`\u001a\u0004\u0018\u00010aJ\u0010\u0010b\u001a\u00020_2\b\u0010`\u001a\u0004\u0018\u00010aJ\b\u0010c\u001a\u00020;H\u0016J\u0014\u0010d\u001a\u00020;2\f\u0010e\u001a\b\u0012\u0004\u0012\u00020g0fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u00020#X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001b\u0010(\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b*\u0010+R\u0011\u0010.\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u000e\u00102\u001a\u000203X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00106\u001a\u0002078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006i"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputDuxo;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailureResolver;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidatorManager$Callback;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputDataState;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputViewState;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputEvent;", "bottomSheetService", "Lcom/robinhood/shared/crypto/trading/bottomsheet/CryptoTradingBottomSheetService;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoOrderContextFactory", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContextFactory;", "cryptoOrderMonetizationModelProvider", "Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/CryptoOrderMonetizationModelProvider;", "cryptoOrderValidatorManager", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidatorManager;", "cryptoPowerInfoAlertProvider", "Lcom/robinhood/shared/trade/crypto/ui/powerInfoAlert/CryptoPowerInfoAlertProvider;", "cryptoTaxLotOrderInputValidatorProvider", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/validation/CryptoTaxLotOrderInputValidatorProvider;", "cryptoTradeFeeEstimationService", "Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeFeeEstimationService;", "cryptoTradeUserInputsService", "Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeUserInputsService;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "stateProvider", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/shared/crypto/trading/bottomsheet/CryptoTradingBottomSheetService;Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContextFactory;Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/CryptoOrderMonetizationModelProvider;Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidatorManager;Lcom/robinhood/shared/trade/crypto/ui/powerInfoAlert/CryptoPowerInfoAlertProvider;Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/validation/CryptoTaxLotOrderInputValidatorProvider;Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeFeeEstimationService;Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeUserInputsService;Lcom/robinhood/android/microgramsdui/MicrogramManager;Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "staticInputs", "Lcom/robinhood/shared/trade/crypto/validation/StaticInputs;", "getStaticInputs", "()Lcom/robinhood/shared/trade/crypto/validation/StaticInputs;", "staticInputs$delegate", "Lkotlin/Lazy;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "microgramInstance", "Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "taxLotsService", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTradingTaxLotsService;", "bottomSheetSourceDto", "Lcontracts/crypto/trade/proto/v1/SourceDto;", "getBottomSheetSourceDto", "()Lcontracts/crypto/trade/proto/v1/SourceDto;", "onCreate", "", "onStrategyTypeTapped", "type", "Lnummus/v1/TaxLotStrategyTypeDto;", "onClearTemporarilySelectedStrategyType", "onStrategyTypeSelected", "onOrderTypeSelected", "orderType", "Lcom/robinhood/models/api/CryptoOrderType;", "onViewTaxLotsClicked", "onInputFieldFocusRequested", "inputField", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputDataState$InputField;", "onKeyPressed", "keyEvent", "Landroid/view/KeyEvent;", "onOrderTypeClicked", "onOrderInputRowTapped", "tapAction", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState$TapAction;", "onOrderReviewRowTapped", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction;", "setOrderSize", "orderAmount", "Ljava/math/BigDecimal;", "orderQuantity", "convertToSellAll", "setLimitPrice", "limitPrice", "onValidationSucceed", "orderContext", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "onValidationFailure", "failure", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailure;", "onPositiveResponse", "", "passthroughArgs", "Landroid/os/Bundle;", "onNegativeResponse", "requestFocusOnLimitPriceInput", "emitBottomSheetData", "dtos", "Lkotlinx/collections/immutable/ImmutableList;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto;", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CryptoTaxLotOrderInputDuxo extends BaseDuxo3<CryptoTaxLotOrderInputDataState, CryptoTaxLotOrderInputViewState, CryptoTaxLotOrderInputEvent> implements HasSavedState, CryptoOrderValidator3, CryptoOrderValidatorManager.Callback {
    private final CryptoTradingBottomSheetService bottomSheetService;
    private final CryptoAccountProvider cryptoAccountProvider;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final CryptoOrderContextFactory cryptoOrderContextFactory;
    private final CryptoOrderMonetizationModelProvider cryptoOrderMonetizationModelProvider;
    private final CryptoOrderValidatorManager cryptoOrderValidatorManager;
    private final CryptoPowerInfoAlertProvider cryptoPowerInfoAlertProvider;
    private final CryptoTaxLotOrderInputValidatorProvider cryptoTaxLotOrderInputValidatorProvider;
    private final RealCryptoTradeFeeEstimationService cryptoTradeFeeEstimationService;
    private final RealCryptoTradeUserInputsService cryptoTradeUserInputsService;
    private final MicrogramManager2 microgramInstance;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: staticInputs$delegate, reason: from kotlin metadata */
    private final Lazy staticInputs;
    private final CryptoTradingTaxLotsService taxLotsService;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator3
    public void initiateDeposit() {
        CryptoOrderValidator3.DefaultImpls.initiateDeposit(this);
    }

    @Override // com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator3
    public void selectPaymentMethod() {
        CryptoOrderValidator3.DefaultImpls.selectPaymentMethod(this);
    }

    @Override // com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator3
    public void setPdtWarningAsSeen() {
        CryptoOrderValidator3.DefaultImpls.setPdtWarningAsSeen(this);
    }

    @Override // com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator3
    public void startSignupFlow() {
        CryptoOrderValidator3.DefaultImpls.startSignupFlow(this);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoTaxLotOrderInputDuxo(CryptoTradingBottomSheetService bottomSheetService, CryptoAccountProvider cryptoAccountProvider, CryptoExperimentsStore cryptoExperimentsStore, CryptoOrderContextFactory cryptoOrderContextFactory, CryptoOrderMonetizationModelProvider cryptoOrderMonetizationModelProvider, CryptoOrderValidatorManager cryptoOrderValidatorManager, CryptoPowerInfoAlertProvider cryptoPowerInfoAlertProvider, CryptoTaxLotOrderInputValidatorProvider cryptoTaxLotOrderInputValidatorProvider, RealCryptoTradeFeeEstimationService cryptoTradeFeeEstimationService, RealCryptoTradeUserInputsService cryptoTradeUserInputsService, MicrogramManager microgramManager, CryptoTaxLotOrderInputStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new CryptoTaxLotOrderInputDataState(((CryptoTaxLotOrderInputFragment.Args) INSTANCE.getArgs(savedStateHandle)).getCurrencyPairId(), null, null, null, null, null, null, null, null, null, null, null, false, 8190, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(bottomSheetService, "bottomSheetService");
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(cryptoOrderContextFactory, "cryptoOrderContextFactory");
        Intrinsics.checkNotNullParameter(cryptoOrderMonetizationModelProvider, "cryptoOrderMonetizationModelProvider");
        Intrinsics.checkNotNullParameter(cryptoOrderValidatorManager, "cryptoOrderValidatorManager");
        Intrinsics.checkNotNullParameter(cryptoPowerInfoAlertProvider, "cryptoPowerInfoAlertProvider");
        Intrinsics.checkNotNullParameter(cryptoTaxLotOrderInputValidatorProvider, "cryptoTaxLotOrderInputValidatorProvider");
        Intrinsics.checkNotNullParameter(cryptoTradeFeeEstimationService, "cryptoTradeFeeEstimationService");
        Intrinsics.checkNotNullParameter(cryptoTradeUserInputsService, "cryptoTradeUserInputsService");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.bottomSheetService = bottomSheetService;
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.cryptoOrderContextFactory = cryptoOrderContextFactory;
        this.cryptoOrderMonetizationModelProvider = cryptoOrderMonetizationModelProvider;
        this.cryptoOrderValidatorManager = cryptoOrderValidatorManager;
        this.cryptoPowerInfoAlertProvider = cryptoPowerInfoAlertProvider;
        this.cryptoTaxLotOrderInputValidatorProvider = cryptoTaxLotOrderInputValidatorProvider;
        this.cryptoTradeFeeEstimationService = cryptoTradeFeeEstimationService;
        this.cryptoTradeUserInputsService = cryptoTradeUserInputsService;
        this.savedStateHandle = savedStateHandle;
        this.staticInputs = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoTaxLotOrderInputDuxo.staticInputs_delegate$lambda$0(this.f$0);
            }
        });
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        MicrogramLaunchId microgramLaunchId = new MicrogramLaunchId(new RemoteMicrogramApplication("app-crypto-trading-tax-lots", null, 2, null), null, 2, null);
        microgramLaunchId.setExtensions(MapsKt.mapOf(ManagedServiceExtension2.providedBy(Reflection.getOrCreateKotlinClass(CryptoTradeFeeEstimationService.class), cryptoTradeFeeEstimationService), ManagedServiceExtension2.providedBy(Reflection.getOrCreateKotlinClass(CryptoTradeUserInputsService.class), cryptoTradeUserInputsService)));
        Unit unit = Unit.INSTANCE;
        MicrogramManager2 microgramManager2M16549getInstancemoChb0s$default = MicrogramManager.DefaultImpls.m16549getInstancemoChb0s$default(microgramManager, lifecycleScope, microgramLaunchId, null, 4, null);
        this.microgramInstance = microgramManager2M16549getInstancemoChb0s$default;
        this.taxLotsService = (CryptoTradingTaxLotsService) microgramManager2M16549getInstancemoChb0s$default.getComponent().getServiceLocator().getClient(CryptoTradingTaxLotsService.class);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C406801(null), 3, null);
        cryptoOrderValidatorManager.setValidationFailureResolver(this);
        cryptoOrderValidatorManager.setCallback(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StaticInputs getStaticInputs() {
        return (StaticInputs) this.staticInputs.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StaticInputs staticInputs_delegate$lambda$0(CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo) {
        Companion companion = INSTANCE;
        return new StaticInputs(((CryptoTaxLotOrderInputFragment.Args) companion.getArgs((HasSavedState) cryptoTaxLotOrderInputDuxo)).getCurrencyPairId(), ((CryptoTaxLotOrderInputFragment.Args) companion.getArgs((HasSavedState) cryptoTaxLotOrderInputDuxo)).getOrderUuid());
    }

    public final Screen getEventScreen() {
        Screen.Name name = Screen.Name.CRYPTO_ORDER_ENTRY;
        String string2 = ((CryptoTaxLotOrderInputFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getCurrencyPairId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Screen(name, "crypto_tax_lots", string2, null, 8, null);
    }

    private final SourceDto getBottomSheetSourceDto() {
        return new SourceDto(new SourceDto.TypeDto.TaxLotEditing(new SourceDto.TaxLotEditingDto()));
    }

    /* compiled from: CryptoTaxLotOrderInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$1", m3645f = "CryptoTaxLotOrderInputDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$1 */
    static final class C406801 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C406801(Continuation<? super C406801> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTaxLotOrderInputDuxo.this.new C406801(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C406801) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
        
            if (r7.InitializeCryptoTaxLotOrderInput(r1, r6) == r0) goto L17;
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
                Flow<Boolean> flowStreamCryptoMibExperiment = CryptoTaxLotOrderInputDuxo.this.cryptoExperimentsStore.streamCryptoMibExperiment();
                this.label = 1;
                obj = FlowKt.first(flowStreamCryptoMibExperiment, this);
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
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            CryptoTaxLotOrderInputDuxo.this.applyMutation(new AnonymousClass1(zBooleanValue, null));
            if (!zBooleanValue) {
                CryptoTradingTaxLotsService cryptoTradingTaxLotsService = CryptoTaxLotOrderInputDuxo.this.taxLotsService;
                String string2 = ((CryptoTaxLotOrderInputFragment.Args) CryptoTaxLotOrderInputDuxo.INSTANCE.getArgs((HasSavedState) CryptoTaxLotOrderInputDuxo.this)).getCurrencyPairId().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                InitializeCryptoTaxLotOrderInputRequestDto initializeCryptoTaxLotOrderInputRequestDto = new InitializeCryptoTaxLotOrderInputRequestDto(string2, null, 2, null);
                this.label = 2;
            }
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoTaxLotOrderInputDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$1$1", m3645f = "CryptoTaxLotOrderInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoTaxLotOrderInputDataState, Continuation<? super CryptoTaxLotOrderInputDataState>, Object> {
            final /* synthetic */ boolean $isMibEnabled;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(boolean z, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$isMibEnabled = z;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isMibEnabled, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoTaxLotOrderInputDataState cryptoTaxLotOrderInputDataState, Continuation<? super CryptoTaxLotOrderInputDataState> continuation) {
                return ((AnonymousClass1) create(cryptoTaxLotOrderInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoTaxLotOrderInputDataState.copy$default((CryptoTaxLotOrderInputDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, this.$isMibEnabled, 4095, null);
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        final StateFlow<CryptoTaxLotOrderInputViewState> stateFlow = getStateFlow();
        SharedFlow sharedFlowShareIn = FlowKt.shareIn(new Flow<RequestInputs>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super RequestInputs> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow.collect(new C406772(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$$inlined$map$1$2 */
            public static final class C406772<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$$inlined$map$1$2", m3645f = "CryptoTaxLotOrderInputDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C406772.this.emit(null, this);
                    }
                }

                public C406772(FlowCollector flowCollector) {
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
                        RequestInputs requestInputs = ((CryptoTaxLotOrderInputViewState) obj).getRequestInputs();
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
        }, getLifecycleScope(), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), 1);
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C406821(sharedFlowShareIn, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C406832(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C406843(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C406854(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C406865(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C406876(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C406887(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C406898(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C406909(null));
    }

    /* compiled from: CryptoTaxLotOrderInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$1", m3645f = "CryptoTaxLotOrderInputDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$1 */
    static final class C406821 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SharedFlow<RequestInputs> $requestInputsFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C406821(SharedFlow<? extends RequestInputs> sharedFlow, Continuation<? super C406821> continuation) {
            super(2, continuation);
            this.$requestInputsFlow = sharedFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTaxLotOrderInputDuxo.this.new C406821(this.$requestInputsFlow, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C406821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(CryptoTaxLotOrderInputDuxo.this.cryptoOrderContextFactory.create(CryptoTaxLotOrderInputDuxo.this.getEventScreen(), CryptoTaxLotOrderInputDuxo.this.getStaticInputs(), CryptoTaxLotOrderInputDuxo.this.asObservable(this.$requestInputsFlow))), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoTaxLotOrderInputDuxo.this, null);
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

        /* compiled from: CryptoTaxLotOrderInputDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$1$1", m3645f = "CryptoTaxLotOrderInputDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoOrderContext, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoTaxLotOrderInputDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoTaxLotOrderInputDuxo;
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
                CryptoOrderContext cryptoOrderContext;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CryptoOrderContext cryptoOrderContext2 = (CryptoOrderContext) this.L$0;
                    RealCryptoTradeFeeEstimationService realCryptoTradeFeeEstimationService = this.this$0.cryptoTradeFeeEstimationService;
                    UiFeeEstimation uiFeeEstimation = cryptoOrderContext2.getUiFeeEstimation();
                    this.L$0 = cryptoOrderContext2;
                    this.label = 1;
                    if (realCryptoTradeFeeEstimationService.setUiFeeEstimation(uiFeeEstimation, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    cryptoOrderContext = cryptoOrderContext2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cryptoOrderContext = (CryptoOrderContext) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                this.this$0.applyMutation(new C508051(cryptoOrderContext, null));
                return Unit.INSTANCE;
            }

            /* compiled from: CryptoTaxLotOrderInputDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$1$1$1", m3645f = "CryptoTaxLotOrderInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C508051 extends ContinuationImpl7 implements Function2<CryptoTaxLotOrderInputDataState, Continuation<? super CryptoTaxLotOrderInputDataState>, Object> {
                final /* synthetic */ CryptoOrderContext $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C508051(CryptoOrderContext cryptoOrderContext, Continuation<? super C508051> continuation) {
                    super(2, continuation);
                    this.$it = cryptoOrderContext;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C508051 c508051 = new C508051(this.$it, continuation);
                    c508051.L$0 = obj;
                    return c508051;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoTaxLotOrderInputDataState cryptoTaxLotOrderInputDataState, Continuation<? super CryptoTaxLotOrderInputDataState> continuation) {
                    return ((C508051) create(cryptoTaxLotOrderInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoTaxLotOrderInputDataState.copy$default((CryptoTaxLotOrderInputDataState) this.L$0, null, null, this.$it, null, null, null, null, null, null, null, null, null, false, 8187, null);
                }
            }
        }
    }

    /* compiled from: CryptoTaxLotOrderInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$2", m3645f = "CryptoTaxLotOrderInputDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$2 */
    static final class C406832 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C406832(Continuation<? super C406832> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTaxLotOrderInputDuxo.this.new C406832(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C406832) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<CryptoTaxLotOrderInputViewState> stateFlow = CryptoTaxLotOrderInputDuxo.this.getStateFlow();
                Flow<CryptoOrderContext> flow = new Flow<CryptoOrderContext>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$2$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super CryptoOrderContext> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$2$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$2$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "CryptoTaxLotOrderInputDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$2$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                CryptoOrderContext cryptoOrderContext = ((CryptoTaxLotOrderInputViewState) obj).getCryptoOrderContext();
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
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(CryptoTaxLotOrderInputDuxo.this, null);
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

        /* compiled from: CryptoTaxLotOrderInputDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$2$2", m3645f = "CryptoTaxLotOrderInputDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CryptoOrderContext, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoTaxLotOrderInputDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cryptoTaxLotOrderInputDuxo;
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

    /* compiled from: CryptoTaxLotOrderInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$3", m3645f = "CryptoTaxLotOrderInputDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$3 */
    static final class C406843 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C406843(Continuation<? super C406843> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTaxLotOrderInputDuxo.this.new C406843(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C406843) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<ServerDrivenAlert> powerInfoAlertFlow = CryptoTaxLotOrderInputDuxo.this.cryptoPowerInfoAlertProvider.getPowerInfoAlertFlow(((CryptoTaxLotOrderInputFragment.Args) CryptoTaxLotOrderInputDuxo.INSTANCE.getArgs((HasSavedState) CryptoTaxLotOrderInputDuxo.this)).getCurrencyPairId(), OrderSide.SELL, CryptoInputMode.ASSET_CURRENCY);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoTaxLotOrderInputDuxo.this, null);
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

        /* compiled from: CryptoTaxLotOrderInputDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/ui/ServerDrivenAlert;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$3$1", m3645f = "CryptoTaxLotOrderInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ServerDrivenAlert, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoTaxLotOrderInputDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoTaxLotOrderInputDuxo;
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

            /* compiled from: CryptoTaxLotOrderInputDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$3$1$1", m3645f = "CryptoTaxLotOrderInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$3$1$1, reason: invalid class name and collision with other inner class name */
            static final class C508061 extends ContinuationImpl7 implements Function2<CryptoTaxLotOrderInputDataState, Continuation<? super CryptoTaxLotOrderInputDataState>, Object> {
                final /* synthetic */ ServerDrivenAlert $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C508061(ServerDrivenAlert serverDrivenAlert, Continuation<? super C508061> continuation) {
                    super(2, continuation);
                    this.$it = serverDrivenAlert;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C508061 c508061 = new C508061(this.$it, continuation);
                    c508061.L$0 = obj;
                    return c508061;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoTaxLotOrderInputDataState cryptoTaxLotOrderInputDataState, Continuation<? super CryptoTaxLotOrderInputDataState> continuation) {
                    return ((C508061) create(cryptoTaxLotOrderInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoTaxLotOrderInputDataState.copy$default((CryptoTaxLotOrderInputDataState) this.L$0, null, null, null, this.$it, null, null, null, null, null, null, null, null, false, 8183, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C508061((ServerDrivenAlert) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoTaxLotOrderInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$4", m3645f = "CryptoTaxLotOrderInputDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_WARNING_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$4 */
    static final class C406854 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C406854(Continuation<? super C406854> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTaxLotOrderInputDuxo.this.new C406854(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C406854) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(CryptoTaxLotOrderInputDuxo.this.taxLotsService.StreamSelectedTaxLotStrategy(new StreamSelectedTaxLotStrategyRequestDto()));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoTaxLotOrderInputDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoTaxLotOrderInputDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "newSelectedStrategyTypeDto", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotStrategyResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$4$1", m3645f = "CryptoTaxLotOrderInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<StreamSelectedTaxLotStrategyResponseDto, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoTaxLotOrderInputDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoTaxLotOrderInputDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(StreamSelectedTaxLotStrategyResponseDto streamSelectedTaxLotStrategyResponseDto, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(streamSelectedTaxLotStrategyResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoTaxLotOrderInputDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$4$1$1", m3645f = "CryptoTaxLotOrderInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$4$1$1, reason: invalid class name and collision with other inner class name */
            static final class C508071 extends ContinuationImpl7 implements Function2<CryptoTaxLotOrderInputDataState, Continuation<? super CryptoTaxLotOrderInputDataState>, Object> {
                final /* synthetic */ StreamSelectedTaxLotStrategyResponseDto $newSelectedStrategyTypeDto;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C508071(StreamSelectedTaxLotStrategyResponseDto streamSelectedTaxLotStrategyResponseDto, Continuation<? super C508071> continuation) {
                    super(2, continuation);
                    this.$newSelectedStrategyTypeDto = streamSelectedTaxLotStrategyResponseDto;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C508071 c508071 = new C508071(this.$newSelectedStrategyTypeDto, continuation);
                    c508071.L$0 = obj;
                    return c508071;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoTaxLotOrderInputDataState cryptoTaxLotOrderInputDataState, Continuation<? super CryptoTaxLotOrderInputDataState> continuation) {
                    return ((C508071) create(cryptoTaxLotOrderInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CryptoTaxLotOrderInputDataState cryptoTaxLotOrderInputDataState = (CryptoTaxLotOrderInputDataState) this.L$0;
                    return CryptoTaxLotOrderInputDataState.copy$default(cryptoTaxLotOrderInputDataState, null, null, null, null, this.$newSelectedStrategyTypeDto, null, CryptoTaxLotOrderInputDataStates.newFocusedInputField(cryptoTaxLotOrderInputDataState, cryptoTaxLotOrderInputDataState.getCryptoOrderPrices$feature_trade_crypto_externalDebug().getOrderType(), this.$newSelectedStrategyTypeDto.getStrategy_type()), null, null, null, null, null, false, 8111, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C508071((StreamSelectedTaxLotStrategyResponseDto) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: CryptoTaxLotOrderInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$5", m3645f = "CryptoTaxLotOrderInputDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PIN_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$5 */
    static final class C406865 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C406865(Continuation<? super C406865> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTaxLotOrderInputDuxo.this.new C406865(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C406865) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoTradingTaxLotsService cryptoTradingTaxLotsService = CryptoTaxLotOrderInputDuxo.this.taxLotsService;
                String string2 = ((CryptoTaxLotOrderInputFragment.Args) CryptoTaxLotOrderInputDuxo.INSTANCE.getArgs((HasSavedState) CryptoTaxLotOrderInputDuxo.this)).getCurrencyPairId().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                Flow<StreamAvailableTaxLotStrategyViewModelsResponseDto> flowStreamAvailableTaxLotStrategyViewModels = cryptoTradingTaxLotsService.StreamAvailableTaxLotStrategyViewModels(new StreamAvailableTaxLotStrategyViewModelsRequestDto(string2));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoTaxLotOrderInputDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamAvailableTaxLotStrategyViewModels, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoTaxLotOrderInputDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$5$1", m3645f = "CryptoTaxLotOrderInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$5$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<StreamAvailableTaxLotStrategyViewModelsResponseDto, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoTaxLotOrderInputDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoTaxLotOrderInputDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(StreamAvailableTaxLotStrategyViewModelsResponseDto streamAvailableTaxLotStrategyViewModelsResponseDto, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(streamAvailableTaxLotStrategyViewModelsResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoTaxLotOrderInputDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$5$1$1", m3645f = "CryptoTaxLotOrderInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$5$1$1, reason: invalid class name and collision with other inner class name */
            static final class C508081 extends ContinuationImpl7 implements Function2<CryptoTaxLotOrderInputDataState, Continuation<? super CryptoTaxLotOrderInputDataState>, Object> {
                final /* synthetic */ StreamAvailableTaxLotStrategyViewModelsResponseDto $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C508081(StreamAvailableTaxLotStrategyViewModelsResponseDto streamAvailableTaxLotStrategyViewModelsResponseDto, Continuation<? super C508081> continuation) {
                    super(2, continuation);
                    this.$it = streamAvailableTaxLotStrategyViewModelsResponseDto;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C508081 c508081 = new C508081(this.$it, continuation);
                    c508081.L$0 = obj;
                    return c508081;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoTaxLotOrderInputDataState cryptoTaxLotOrderInputDataState, Continuation<? super CryptoTaxLotOrderInputDataState> continuation) {
                    return ((C508081) create(cryptoTaxLotOrderInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoTaxLotOrderInputDataState.copy$default((CryptoTaxLotOrderInputDataState) this.L$0, null, null, null, null, null, this.$it, null, null, null, null, null, null, false, 8159, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C508081((StreamAvailableTaxLotStrategyViewModelsResponseDto) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoTaxLotOrderInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$6", m3645f = "CryptoTaxLotOrderInputDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$6 */
    static final class C406876 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C406876(Continuation<? super C406876> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTaxLotOrderInputDuxo.this.new C406876(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C406876) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<StreamGainLossAmountResponseDto> flowStreamGainLossAmount = CryptoTaxLotOrderInputDuxo.this.taxLotsService.StreamGainLossAmount(new StreamGainLossAmountRequestDto());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoTaxLotOrderInputDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamGainLossAmount, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoTaxLotOrderInputDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamGainLossAmountResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$6$1", m3645f = "CryptoTaxLotOrderInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$6$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<StreamGainLossAmountResponseDto, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoTaxLotOrderInputDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoTaxLotOrderInputDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(StreamGainLossAmountResponseDto streamGainLossAmountResponseDto, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(streamGainLossAmountResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoTaxLotOrderInputDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$6$1$1", m3645f = "CryptoTaxLotOrderInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$6$1$1, reason: invalid class name and collision with other inner class name */
            static final class C508091 extends ContinuationImpl7 implements Function2<CryptoTaxLotOrderInputDataState, Continuation<? super CryptoTaxLotOrderInputDataState>, Object> {
                final /* synthetic */ StreamGainLossAmountResponseDto $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C508091(StreamGainLossAmountResponseDto streamGainLossAmountResponseDto, Continuation<? super C508091> continuation) {
                    super(2, continuation);
                    this.$it = streamGainLossAmountResponseDto;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C508091 c508091 = new C508091(this.$it, continuation);
                    c508091.L$0 = obj;
                    return c508091;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoTaxLotOrderInputDataState cryptoTaxLotOrderInputDataState, Continuation<? super CryptoTaxLotOrderInputDataState> continuation) {
                    return ((C508091) create(cryptoTaxLotOrderInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoTaxLotOrderInputDataState.copy$default((CryptoTaxLotOrderInputDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, this.$it, null, false, 7167, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C508091((StreamGainLossAmountResponseDto) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoTaxLotOrderInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$7", m3645f = "CryptoTaxLotOrderInputDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$7 */
    static final class C406887 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C406887(Continuation<? super C406887> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTaxLotOrderInputDuxo.this.new C406887(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C406887) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoOrderMonetizationModelProvider cryptoOrderMonetizationModelProvider = CryptoTaxLotOrderInputDuxo.this.cryptoOrderMonetizationModelProvider;
                UUID currencyPairId = ((CryptoTaxLotOrderInputFragment.Args) CryptoTaxLotOrderInputDuxo.INSTANCE.getArgs((HasSavedState) CryptoTaxLotOrderInputDuxo.this)).getCurrencyPairId();
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
            CryptoOrderMonetizationModel cryptoOrderMonetizationModel = (CryptoOrderMonetizationModel) obj;
            CryptoTaxLotOrderInputDuxo.this.applyMutation(new AnonymousClass1(cryptoOrderMonetizationModel, null));
            if (!(cryptoOrderMonetizationModel instanceof CryptoOrderMonetizationModel.Fee)) {
                CryptoTaxLotOrderInputDuxo.this.submit(CryptoTaxLotOrderInputEvent.DismissFeeDefinitionBottomSheet.INSTANCE);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoTaxLotOrderInputDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$7$1", m3645f = "CryptoTaxLotOrderInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$7$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoTaxLotOrderInputDataState, Continuation<? super CryptoTaxLotOrderInputDataState>, Object> {
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
            public final Object invoke(CryptoTaxLotOrderInputDataState cryptoTaxLotOrderInputDataState, Continuation<? super CryptoTaxLotOrderInputDataState> continuation) {
                return ((AnonymousClass1) create(cryptoTaxLotOrderInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoTaxLotOrderInputDataState.copy$default((CryptoTaxLotOrderInputDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, this.$cryptoOrderMonetizationModel, false, 6143, null);
            }
        }
    }

    /* compiled from: CryptoTaxLotOrderInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$8", m3645f = "CryptoTaxLotOrderInputDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$8 */
    static final class C406898 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C406898(Continuation<? super C406898> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTaxLotOrderInputDuxo.this.new C406898(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C406898) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<DialogFragmentKey> flowStreamLaunchDialog = CryptoTaxLotOrderInputDuxo.this.bottomSheetService.streamLaunchDialog();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoTaxLotOrderInputDuxo.this, null);
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

        /* compiled from: CryptoTaxLotOrderInputDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$8$1", m3645f = "CryptoTaxLotOrderInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$8$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DialogFragmentKey, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoTaxLotOrderInputDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoTaxLotOrderInputDuxo;
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
                this.this$0.submit(new CryptoTaxLotOrderInputEvent.ShowDialogFragment((DialogFragmentKey) this.L$0));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoTaxLotOrderInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$9", m3645f = "CryptoTaxLotOrderInputDuxo.kt", m3646l = {EnumC7081g.f2779x59907a3d}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$9 */
    static final class C406909 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C406909(Continuation<? super C406909> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTaxLotOrderInputDuxo.this.new C406909(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C406909) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowOnEach = FlowKt.onEach(Operators.connectWhen$default(FlowKt.distinctUntilChanged(FlowKt.filterNotNull(CryptoTaxLotOrderInputDuxo.this.cryptoAccountProvider.streamCryptoAccountId(new CryptoAccountSwitcherLocation.SellAsset(((CryptoTaxLotOrderInputFragment.Args) CryptoTaxLotOrderInputDuxo.INSTANCE.getArgs((HasSavedState) CryptoTaxLotOrderInputDuxo.this)).getCurrencyPairId())))), CryptoTaxLotOrderInputDuxo.this.cryptoExperimentsStore.streamCryptoMibExperiment(), null, 2, null), new AnonymousClass1(CryptoTaxLotOrderInputDuxo.this, null));
                this.label = 1;
                if (FlowKt.collect(flowOnEach, this) == coroutine_suspended) {
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

        /* compiled from: CryptoTaxLotOrderInputDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "cryptoAccountId", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$9$1", m3645f = "CryptoTaxLotOrderInputDuxo.kt", m3646l = {EnumC7081g.f2778x3356acf6}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onCreate$9$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoTaxLotOrderInputDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoTaxLotOrderInputDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UUID uuid, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    UUID uuid = (UUID) this.L$0;
                    CryptoTradingTaxLotsService cryptoTradingTaxLotsService = this.this$0.taxLotsService;
                    String string2 = ((CryptoTaxLotOrderInputFragment.Args) CryptoTaxLotOrderInputDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getCurrencyPairId().toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    InitializeCryptoTaxLotOrderInputRequestDto initializeCryptoTaxLotOrderInputRequestDto = new InitializeCryptoTaxLotOrderInputRequestDto(string2, uuid.toString());
                    this.label = 1;
                    if (cryptoTradingTaxLotsService.InitializeCryptoTaxLotOrderInput(initializeCryptoTaxLotOrderInputRequestDto, this) == coroutine_suspended) {
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

    /* compiled from: CryptoTaxLotOrderInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onStrategyTypeTapped$1", m3645f = "CryptoTaxLotOrderInputDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onStrategyTypeTapped$1 */
    static final class C406951 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TaxLotStrategyTypeDto $type;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C406951(TaxLotStrategyTypeDto taxLotStrategyTypeDto, Continuation<? super C406951> continuation) {
            super(2, continuation);
            this.$type = taxLotStrategyTypeDto;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTaxLotOrderInputDuxo.this.new C406951(this.$type, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C406951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoTradingTaxLotsService cryptoTradingTaxLotsService = CryptoTaxLotOrderInputDuxo.this.taxLotsService;
                UpdateTemporarilySelectedTaxLotStrategyRequestDto updateTemporarilySelectedTaxLotStrategyRequestDto = new UpdateTemporarilySelectedTaxLotStrategyRequestDto(this.$type);
                this.label = 1;
                if (cryptoTradingTaxLotsService.UpdateTemporarilySelectedTaxLotStrategy(updateTemporarilySelectedTaxLotStrategyRequestDto, this) == coroutine_suspended) {
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

    public final void onStrategyTypeTapped(TaxLotStrategyTypeDto type2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C406951(type2, null), 3, null);
    }

    /* compiled from: CryptoTaxLotOrderInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onClearTemporarilySelectedStrategyType$1", m3645f = "CryptoTaxLotOrderInputDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onClearTemporarilySelectedStrategyType$1 */
    static final class C406811 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C406811(Continuation<? super C406811> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTaxLotOrderInputDuxo.this.new C406811(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C406811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoTradingTaxLotsService cryptoTradingTaxLotsService = CryptoTaxLotOrderInputDuxo.this.taxLotsService;
                ClearTemporarilySelectedTaxLotStrategyRequestDto clearTemporarilySelectedTaxLotStrategyRequestDto = new ClearTemporarilySelectedTaxLotStrategyRequestDto();
                this.label = 1;
                if (cryptoTradingTaxLotsService.ClearTemporarilySelectedTaxLotStrategy(clearTemporarilySelectedTaxLotStrategyRequestDto, this) == coroutine_suspended) {
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

    public final void onClearTemporarilySelectedStrategyType() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C406811(null), 3, null);
    }

    /* compiled from: CryptoTaxLotOrderInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onStrategyTypeSelected$1", m3645f = "CryptoTaxLotOrderInputDuxo.kt", m3646l = {283}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onStrategyTypeSelected$1 */
    static final class C406941 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C406941(Continuation<? super C406941> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTaxLotOrderInputDuxo.this.new C406941(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C406941) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoTradingTaxLotsService cryptoTradingTaxLotsService = CryptoTaxLotOrderInputDuxo.this.taxLotsService;
                ContinueWithSelectedTaxLotStrategyRequestDto continueWithSelectedTaxLotStrategyRequestDto = new ContinueWithSelectedTaxLotStrategyRequestDto();
                this.label = 1;
                if (cryptoTradingTaxLotsService.ContinueWithSelectedTaxLotStrategy(continueWithSelectedTaxLotStrategyRequestDto, this) == coroutine_suspended) {
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

    public final void onStrategyTypeSelected() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C406941(null), 3, null);
    }

    /* compiled from: CryptoTaxLotOrderInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onOrderTypeSelected$1", m3645f = "CryptoTaxLotOrderInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onOrderTypeSelected$1 */
    static final class C406931 extends ContinuationImpl7 implements Function2<CryptoTaxLotOrderInputDataState, Continuation<? super CryptoTaxLotOrderInputDataState>, Object> {
        final /* synthetic */ CryptoOrderType $orderType;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: CryptoTaxLotOrderInputDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onOrderTypeSelected$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CryptoOrderType.values().length];
                try {
                    iArr[CryptoOrderType.MARKET.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CryptoOrderType.LIMIT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CryptoOrderType.STOP_LOSS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CryptoOrderType.STOP_LIMIT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C406931(CryptoOrderType cryptoOrderType, Continuation<? super C406931> continuation) {
            super(2, continuation);
            this.$orderType = cryptoOrderType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C406931 c406931 = new C406931(this.$orderType, continuation);
            c406931.L$0 = obj;
            return c406931;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoTaxLotOrderInputDataState cryptoTaxLotOrderInputDataState, Continuation<? super CryptoTaxLotOrderInputDataState> continuation) {
            return ((C406931) create(cryptoTaxLotOrderInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            CryptoOrderPrices limit;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoTaxLotOrderInputDataState cryptoTaxLotOrderInputDataState = (CryptoTaxLotOrderInputDataState) this.L$0;
            if (this.$orderType == cryptoTaxLotOrderInputDataState.getCryptoOrderPrices$feature_trade_crypto_externalDebug().getOrderType()) {
                return cryptoTaxLotOrderInputDataState;
            }
            CryptoOrderType cryptoOrderType = this.$orderType;
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i = iArr[cryptoOrderType.ordinal()];
            if (i == 1) {
                limit = CryptoOrderPrices.Market.INSTANCE;
            } else {
                if (i != 2) {
                    if (i == 3) {
                        throw new IllegalStateException("Tax lots for stop loss orders not supported");
                    }
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("Tax lots for stop limit orders not supported");
                }
                BigDecimal ZERO = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                limit = new CryptoOrderPrices.Limit(ZERO);
            }
            CryptoOrderType cryptoOrderType2 = this.$orderType;
            StreamSelectedTaxLotStrategyResponseDto selectedStrategyDto$feature_trade_crypto_externalDebug = cryptoTaxLotOrderInputDataState.getSelectedStrategyDto$feature_trade_crypto_externalDebug();
            String formattedLimitPrice$feature_trade_crypto_externalDebug = null;
            CryptoTaxLotOrderInputDataState.InputField inputFieldNewFocusedInputField = CryptoTaxLotOrderInputDataStates.newFocusedInputField(cryptoTaxLotOrderInputDataState, cryptoOrderType2, selectedStrategyDto$feature_trade_crypto_externalDebug != null ? selectedStrategyDto$feature_trade_crypto_externalDebug.getStrategy_type() : null);
            int i2 = iArr[this.$orderType.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        throw new IllegalStateException("Tax lots for stop loss orders not supported");
                    }
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("Tax lots for stop limit orders not supported");
                }
                formattedLimitPrice$feature_trade_crypto_externalDebug = cryptoTaxLotOrderInputDataState.getFormattedLimitPrice$feature_trade_crypto_externalDebug();
            }
            return CryptoTaxLotOrderInputDataState.copy$default(cryptoTaxLotOrderInputDataState, null, limit, null, null, null, null, inputFieldNewFocusedInputField, formattedLimitPrice$feature_trade_crypto_externalDebug, null, null, null, null, false, 7997, null);
        }
    }

    public final void onOrderTypeSelected(CryptoOrderType orderType) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        applyMutation(new C406931(orderType, null));
    }

    public final void onViewTaxLotsClicked() {
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoTaxLotOrderInputDuxo.onViewTaxLotsClicked$lambda$3(this.f$0, (CryptoTaxLotOrderInputDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewTaxLotsClicked$lambda$3(CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo, CryptoTaxLotOrderInputDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CryptoOrderContext cryptoOrderContext$feature_trade_crypto_externalDebug = it.getCryptoOrderContext$feature_trade_crypto_externalDebug();
        if (cryptoOrderContext$feature_trade_crypto_externalDebug == null) {
            return Unit.INSTANCE;
        }
        CryptoOrderValidatorManager cryptoOrderValidatorManager = cryptoTaxLotOrderInputDuxo.cryptoOrderValidatorManager;
        CryptoTaxLotOrderInputValidatorProvider cryptoTaxLotOrderInputValidatorProvider = cryptoTaxLotOrderInputDuxo.cryptoTaxLotOrderInputValidatorProvider;
        StreamSelectedTaxLotStrategyResponseDto selectedStrategyDto$feature_trade_crypto_externalDebug = it.getSelectedStrategyDto$feature_trade_crypto_externalDebug();
        UiCryptoHolding holding = cryptoOrderContext$feature_trade_crypto_externalDebug.getRequestContext().getHolding();
        cryptoOrderValidatorManager.validateAndReviewOrder(cryptoOrderContext$feature_trade_crypto_externalDebug, false, cryptoTaxLotOrderInputValidatorProvider.getValidator(selectedStrategyDto$feature_trade_crypto_externalDebug, BigDecimals7.isZero(holding != null ? holding.getQuantityAvailable() : null)));
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoTaxLotOrderInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onInputFieldFocusRequested$1", m3645f = "CryptoTaxLotOrderInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onInputFieldFocusRequested$1 */
    static final class C406911 extends ContinuationImpl7 implements Function2<CryptoTaxLotOrderInputDataState, Continuation<? super CryptoTaxLotOrderInputDataState>, Object> {
        final /* synthetic */ CryptoTaxLotOrderInputDataState.InputField $inputField;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C406911(CryptoTaxLotOrderInputDataState.InputField inputField, Continuation<? super C406911> continuation) {
            super(2, continuation);
            this.$inputField = inputField;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C406911 c406911 = new C406911(this.$inputField, continuation);
            c406911.L$0 = obj;
            return c406911;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoTaxLotOrderInputDataState cryptoTaxLotOrderInputDataState, Continuation<? super CryptoTaxLotOrderInputDataState> continuation) {
            return ((C406911) create(cryptoTaxLotOrderInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoTaxLotOrderInputDataState.copy$default((CryptoTaxLotOrderInputDataState) this.L$0, null, null, null, null, null, null, this.$inputField, null, null, null, null, null, false, 8127, null);
        }
    }

    public final void onInputFieldFocusRequested(CryptoTaxLotOrderInputDataState.InputField inputField) {
        Intrinsics.checkNotNullParameter(inputField, "inputField");
        applyMutation(new C406911(inputField, null));
    }

    /* compiled from: CryptoTaxLotOrderInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onKeyPressed$1", m3645f = "CryptoTaxLotOrderInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onKeyPressed$1 */
    static final class C406921 extends ContinuationImpl7 implements Function2<CryptoTaxLotOrderInputDataState, Continuation<? super CryptoTaxLotOrderInputDataState>, Object> {
        final /* synthetic */ KeyEvent $keyEvent;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: CryptoTaxLotOrderInputDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onKeyPressed$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CryptoTaxLotOrderInputDataState.InputField.values().length];
                try {
                    iArr[CryptoTaxLotOrderInputDataState.InputField.LIMIT_PRICE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CryptoTaxLotOrderInputDataState.InputField.ASSET_AMOUNT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C406921(KeyEvent keyEvent, Continuation<? super C406921> continuation) {
            super(2, continuation);
            this.$keyEvent = keyEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C406921 c406921 = new C406921(this.$keyEvent, continuation);
            c406921.L$0 = obj;
            return c406921;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoTaxLotOrderInputDataState cryptoTaxLotOrderInputDataState, Continuation<? super CryptoTaxLotOrderInputDataState> continuation) {
            return ((C406921) create(cryptoTaxLotOrderInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            CryptoOrderContext.RequestContext requestContext;
            UiCurrencyPair currencyPair;
            CryptoOrderPrices cryptoOrderPricesCopy$default;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoTaxLotOrderInputDataState cryptoTaxLotOrderInputDataState = (CryptoTaxLotOrderInputDataState) this.L$0;
            CryptoOrderContext cryptoOrderContext$feature_trade_crypto_externalDebug = cryptoTaxLotOrderInputDataState.getCryptoOrderContext$feature_trade_crypto_externalDebug();
            if (cryptoOrderContext$feature_trade_crypto_externalDebug == null || (requestContext = cryptoOrderContext$feature_trade_crypto_externalDebug.getRequestContext()) == null || (currencyPair = requestContext.getCurrencyPair()) == null) {
                return cryptoTaxLotOrderInputDataState;
            }
            CryptoTaxLotOrderInputDataState.InputField focusedInputField$feature_trade_crypto_externalDebug = cryptoTaxLotOrderInputDataState.getFocusedInputField$feature_trade_crypto_externalDebug();
            int i = focusedInputField$feature_trade_crypto_externalDebug == null ? -1 : WhenMappings.$EnumSwitchMapping$0[focusedInputField$feature_trade_crypto_externalDebug.ordinal()];
            if (i == -1) {
                return cryptoTaxLotOrderInputDataState;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                CryptoInstrumentInputHelper cryptoInstrumentInputHelper = new CryptoInstrumentInputHelper(currencyPair);
                KeyEvent keyEvent = this.$keyEvent;
                String formattedAssetAmount$feature_trade_crypto_externalDebug = cryptoTaxLotOrderInputDataState.getFormattedAssetAmount$feature_trade_crypto_externalDebug();
                Tuples2 tuples2ProcessKeyEvent$default = CryptoInstrumentInputHelper.processKeyEvent$default(cryptoInstrumentInputHelper, keyEvent, formattedAssetAmount$feature_trade_crypto_externalDebug == null ? "" : formattedAssetAmount$feature_trade_crypto_externalDebug, CryptoInputMode.ASSET_CURRENCY, false, false, false, false, 104, null);
                String str = (String) tuples2ProcessKeyEvent$default.component1();
                BigDecimal scale = ((BigDecimal) tuples2ProcessKeyEvent$default.component2()).setScale(zzah$$ExternalSyntheticBackportWithForwarding0.m822m(currencyPair.getMinOrderQuantityIncrement()).scale(), RoundingMode.DOWN);
                Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
                return CryptoTaxLotOrderInputDataState.copy$default(cryptoTaxLotOrderInputDataState, null, null, null, null, null, null, null, null, scale, str, null, null, false, 7423, null);
            }
            CryptoInstrumentInputHelper cryptoInstrumentInputHelper2 = new CryptoInstrumentInputHelper(UiCurrencyPair.copy$default(currencyPair, null, null, false, null, false, null, null, null, null, null, null, null, currencyPair.getQuoteCurrencyForPriceInput(), null, null, null, null, null, null, null, null, 2093055, null));
            KeyEvent keyEvent2 = this.$keyEvent;
            String formattedLimitPrice$feature_trade_crypto_externalDebug = cryptoTaxLotOrderInputDataState.getFormattedLimitPrice$feature_trade_crypto_externalDebug();
            Tuples2 tuples2ProcessKeyEvent$default2 = CryptoInstrumentInputHelper.processKeyEvent$default(cryptoInstrumentInputHelper2, keyEvent2, formattedLimitPrice$feature_trade_crypto_externalDebug == null ? "" : formattedLimitPrice$feature_trade_crypto_externalDebug, CryptoInputMode.QUOTE_CURRENCY, false, true, true, false, 72, null);
            String str2 = (String) tuples2ProcessKeyEvent$default2.component1();
            BigDecimal bigDecimal = (BigDecimal) tuples2ProcessKeyEvent$default2.component2();
            CryptoOrderPrices cryptoOrderPrices$feature_trade_crypto_externalDebug = cryptoTaxLotOrderInputDataState.getCryptoOrderPrices$feature_trade_crypto_externalDebug();
            if (cryptoOrderPrices$feature_trade_crypto_externalDebug instanceof CryptoOrderPrices.Limit) {
                CryptoOrderPrices.Limit limit = (CryptoOrderPrices.Limit) cryptoTaxLotOrderInputDataState.getCryptoOrderPrices$feature_trade_crypto_externalDebug();
                BigDecimal scale2 = bigDecimal.setScale(currencyPair.getQuoteCurrencyForPriceInput().getDecimalScale(), RoundingMode.DOWN);
                Intrinsics.checkNotNullExpressionValue(scale2, "setScale(...)");
                cryptoOrderPricesCopy$default = limit.copy(scale2);
            } else {
                if (!(cryptoOrderPrices$feature_trade_crypto_externalDebug instanceof CryptoOrderPrices.StopLimit)) {
                    return cryptoTaxLotOrderInputDataState;
                }
                CryptoOrderPrices.StopLimit stopLimit = (CryptoOrderPrices.StopLimit) cryptoTaxLotOrderInputDataState.getCryptoOrderPrices$feature_trade_crypto_externalDebug();
                BigDecimal scale3 = bigDecimal.setScale(currencyPair.getQuoteCurrencyForPriceInput().getDecimalScale(), RoundingMode.DOWN);
                Intrinsics.checkNotNullExpressionValue(scale3, "setScale(...)");
                cryptoOrderPricesCopy$default = CryptoOrderPrices.StopLimit.copy$default(stopLimit, scale3, null, 2, null);
            }
            return CryptoTaxLotOrderInputDataState.copy$default(cryptoTaxLotOrderInputDataState, null, cryptoOrderPricesCopy$default, null, null, null, null, null, str2, null, null, null, null, false, 8061, null);
        }
    }

    public final void onKeyPressed(KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        applyMutation(new C406921(keyEvent, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onOrderTypeClicked$lambda$4(CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo, CryptoTaxLotOrderInputDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        cryptoTaxLotOrderInputDuxo.submit(new CryptoTaxLotOrderInputEvent.ShowOrderTypeSelector(it.getCryptoOrderPrices$feature_trade_crypto_externalDebug().getOrderType()));
        return Unit.INSTANCE;
    }

    public final void onOrderTypeClicked() {
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoTaxLotOrderInputDuxo.onOrderTypeClicked$lambda$4(this.f$0, (CryptoTaxLotOrderInputDataState) obj);
            }
        });
    }

    public final void onOrderInputRowTapped(CryptoOrderInputRowState.TapAction tapAction) {
        Intrinsics.checkNotNullParameter(tapAction, "tapAction");
        if (Intrinsics.areEqual(tapAction, CryptoOrderInputRowState.TapAction.ShowLimitPriceBottomSheet.INSTANCE)) {
            withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoTaxLotOrderInputDuxo.onOrderInputRowTapped$lambda$5(this.f$0, (CryptoTaxLotOrderInputDataState) obj);
                }
            });
        } else {
            if (Intrinsics.areEqual(tapAction, CryptoOrderInputRowState.TapAction.ShowStopPriceBottomSheet.INSTANCE)) {
                throw new IllegalStateException("Stop orders not supported");
            }
            if (!(tapAction instanceof CryptoOrderInputRowState.TapAction.Tokenization)) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException("Tokenized stocks orders not supported");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onOrderInputRowTapped$lambda$5(CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo, CryptoTaxLotOrderInputDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CryptoOrderContext cryptoOrderContext$feature_trade_crypto_externalDebug = it.getCryptoOrderContext$feature_trade_crypto_externalDebug();
        if (cryptoOrderContext$feature_trade_crypto_externalDebug == null) {
            return Unit.INSTANCE;
        }
        cryptoTaxLotOrderInputDuxo.bottomSheetService.launchBottomSheet(CryptoOrderContexts.getLimitOrderDefinitionBottomSheetTypeDto(cryptoOrderContext$feature_trade_crypto_externalDebug), cryptoTaxLotOrderInputDuxo.getEventScreen(), cryptoTaxLotOrderInputDuxo.getBottomSheetSourceDto());
        return Unit.INSTANCE;
    }

    public final void onOrderReviewRowTapped(final CryptoOrderReviewRowState.TapAction tapAction) {
        Intrinsics.checkNotNullParameter(tapAction, "tapAction");
        if (tapAction instanceof CryptoOrderReviewRowState.TapAction.ShowFeeDefinitionBottomSheet) {
            withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoTaxLotOrderInputDuxo.onOrderReviewRowTapped$lambda$6(this.f$0, tapAction, (CryptoTaxLotOrderInputDataState) obj);
                }
            });
            return;
        }
        if (tapAction instanceof CryptoOrderReviewRowState.TapAction.ShowMarketPriceBottomSheet) {
            withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoTaxLotOrderInputDuxo.onOrderReviewRowTapped$lambda$7(this.f$0, (CryptoTaxLotOrderInputDataState) obj);
                }
            });
        } else {
            if (tapAction instanceof CryptoOrderReviewRowState.TapAction.ShowSpreadBottomSheet) {
                withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoTaxLotOrderInputDuxo.onOrderReviewRowTapped$lambda$8(this.f$0, (CryptoTaxLotOrderInputDataState) obj);
                    }
                });
                return;
            }
            throw new IllegalStateException(("Unexpected tapAction " + tapAction).toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onOrderReviewRowTapped$lambda$6(CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo, CryptoOrderReviewRowState.TapAction tapAction, CryptoTaxLotOrderInputDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CryptoOrderReviewRowState.TapAction.ShowFeeDefinitionBottomSheet showFeeDefinitionBottomSheet = (CryptoOrderReviewRowState.TapAction.ShowFeeDefinitionBottomSheet) tapAction;
        cryptoTaxLotOrderInputDuxo.submit(new CryptoTaxLotOrderInputEvent.ShowFeeDefinitionBottomSheet(new CryptoFeeDefinitionBottomSheetFragment.Args(cryptoTaxLotOrderInputDuxo.getEventScreen(), ((CryptoTaxLotOrderInputFragment.Args) INSTANCE.getArgs((HasSavedState) cryptoTaxLotOrderInputDuxo)).getCurrencyPairId(), showFeeDefinitionBottomSheet.getUiFeeEstimation().getFeeRatio(), showFeeDefinitionBottomSheet.getUiFeeEstimation().getMinFeeAmount(), showFeeDefinitionBottomSheet.getUiFeeEstimation().getRobinhoodFeeRatio(), showFeeDefinitionBottomSheet.getUiFeeEstimation().getExchangeFeeRatio(), false, null, 128, null)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onOrderReviewRowTapped$lambda$7(CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo, CryptoTaxLotOrderInputDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CryptoOrderContext cryptoOrderContext$feature_trade_crypto_externalDebug = it.getCryptoOrderContext$feature_trade_crypto_externalDebug();
        if (cryptoOrderContext$feature_trade_crypto_externalDebug == null) {
            return Unit.INSTANCE;
        }
        cryptoTaxLotOrderInputDuxo.bottomSheetService.launchBottomSheet(CryptoOrderContexts.getMarketPriceBottomSheetTypeDto(cryptoOrderContext$feature_trade_crypto_externalDebug), cryptoTaxLotOrderInputDuxo.getEventScreen(), cryptoTaxLotOrderInputDuxo.getBottomSheetSourceDto());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onOrderReviewRowTapped$lambda$8(CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo, CryptoTaxLotOrderInputDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CryptoOrderContext cryptoOrderContext$feature_trade_crypto_externalDebug = it.getCryptoOrderContext$feature_trade_crypto_externalDebug();
        if (cryptoOrderContext$feature_trade_crypto_externalDebug == null) {
            return Unit.INSTANCE;
        }
        cryptoTaxLotOrderInputDuxo.bottomSheetService.launchBottomSheet(CryptoOrderContexts.getSpreadBottomSheetTypeDto(cryptoOrderContext$feature_trade_crypto_externalDebug), cryptoTaxLotOrderInputDuxo.getEventScreen(), cryptoTaxLotOrderInputDuxo.getBottomSheetSourceDto());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator3
    public void setOrderSize(BigDecimal orderAmount, final BigDecimal orderQuantity) {
        Intrinsics.checkNotNullParameter(orderAmount, "orderAmount");
        Intrinsics.checkNotNullParameter(orderQuantity, "orderQuantity");
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoTaxLotOrderInputDuxo.setOrderSize$lambda$9(orderQuantity, this, (CryptoTaxLotOrderInputDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setOrderSize$lambda$9(BigDecimal bigDecimal, CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo, CryptoTaxLotOrderInputDataState it) {
        CryptoOrderContext.RequestContext requestContext;
        UiCurrencyPair currencyPair;
        Intrinsics.checkNotNullParameter(it, "it");
        CryptoOrderContext cryptoOrderContext$feature_trade_crypto_externalDebug = it.getCryptoOrderContext$feature_trade_crypto_externalDebug();
        if (cryptoOrderContext$feature_trade_crypto_externalDebug == null || (requestContext = cryptoOrderContext$feature_trade_crypto_externalDebug.getRequestContext()) == null || (currencyPair = requestContext.getCurrencyPair()) == null) {
            return Unit.INSTANCE;
        }
        CryptoInstrumentInputHelper cryptoInstrumentInputHelper = new CryptoInstrumentInputHelper(currencyPair);
        BigDecimal bigDecimalM822m = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(bigDecimal);
        Intrinsics.checkNotNullExpressionValue(bigDecimalM822m, "stripTrailingZeros(...)");
        Tuples2 tuples2ProcessAmount$default = CryptoInstrumentInputHelper.processAmount$default(cryptoInstrumentInputHelper, bigDecimalM822m, null, CryptoInputMode.ASSET_CURRENCY, true, false, true, false, 66, null);
        cryptoTaxLotOrderInputDuxo.applyMutation(new CryptoTaxLotOrderInputDuxo4((BigDecimal) tuples2ProcessAmount$default.component2(), (String) tuples2ProcessAmount$default.component1(), null));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator3
    public void convertToSellAll() {
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoTaxLotOrderInputDuxo.convertToSellAll$lambda$10(this.f$0, (CryptoTaxLotOrderInputDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit convertToSellAll$lambda$10(CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo, CryptoTaxLotOrderInputDataState it) {
        CryptoOrderContext.RequestContext requestContext;
        Intrinsics.checkNotNullParameter(it, "it");
        CryptoOrderContext cryptoOrderContext$feature_trade_crypto_externalDebug = it.getCryptoOrderContext$feature_trade_crypto_externalDebug();
        if (cryptoOrderContext$feature_trade_crypto_externalDebug == null || (requestContext = cryptoOrderContext$feature_trade_crypto_externalDebug.getRequestContext()) == null) {
            return Unit.INSTANCE;
        }
        CryptoInstrumentInputHelper cryptoInstrumentInputHelper = new CryptoInstrumentInputHelper(requestContext.getCurrencyPair());
        UiCryptoHolding holding = requestContext.getHolding();
        BigDecimal bigDecimalM822m = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(BigDecimals7.orZero(holding != null ? holding.getQuantityAvailable() : null));
        Intrinsics.checkNotNullExpressionValue(bigDecimalM822m, "stripTrailingZeros(...)");
        Tuples2 tuples2ProcessAmount$default = CryptoInstrumentInputHelper.processAmount$default(cryptoInstrumentInputHelper, bigDecimalM822m, null, CryptoInputMode.ASSET_CURRENCY, true, false, true, false, 66, null);
        cryptoTaxLotOrderInputDuxo.applyMutation(new CryptoTaxLotOrderInputDuxo2((BigDecimal) tuples2ProcessAmount$default.component2(), (String) tuples2ProcessAmount$default.component1(), null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setLimitPrice$lambda$11(CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo, BigDecimal bigDecimal, CryptoTaxLotOrderInputDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        cryptoTaxLotOrderInputDuxo.applyMutation(new CryptoTaxLotOrderInputDuxo3(bigDecimal, null));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator3
    public void setLimitPrice(final BigDecimal limitPrice) {
        Intrinsics.checkNotNullParameter(limitPrice, "limitPrice");
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoTaxLotOrderInputDuxo.setLimitPrice$lambda$11(this.f$0, limitPrice, (CryptoTaxLotOrderInputDataState) obj);
            }
        });
    }

    /* compiled from: CryptoTaxLotOrderInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onValidationSucceed$1", m3645f = "CryptoTaxLotOrderInputDuxo.kt", m3646l = {507}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onValidationSucceed$1 */
    static final class C406961 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CryptoOrderContext $orderContext;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C406961(CryptoOrderContext cryptoOrderContext, Continuation<? super C406961> continuation) {
            super(2, continuation);
            this.$orderContext = cryptoOrderContext;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTaxLotOrderInputDuxo.this.new C406961(this.$orderContext, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C406961) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoTradingTaxLotsService cryptoTradingTaxLotsService = CryptoTaxLotOrderInputDuxo.this.taxLotsService;
                ValidateStrategyAndQuantityRequestDto validateStrategyAndQuantityRequestDto = new ValidateStrategyAndQuantityRequestDto();
                this.label = 1;
                obj = cryptoTradingTaxLotsService.ValidateStrategyAndQuantity(validateStrategyAndQuantityRequestDto, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ValidateStrategyAndQuantityResponseDto.ErrorDto error = ((ValidateStrategyAndQuantityResponseDto) obj).getError();
            ValidateStrategyAndQuantityResponseDto.ErrorDto.TypeDto type2 = error != null ? error.getType() : null;
            if (type2 instanceof ValidateStrategyAndQuantityResponseDto.ErrorDto.TypeDto.InputsResultInMaxLotsExceeded) {
                ValidateStrategyAndQuantityResponseDto.ErrorDto.TypeDto.InputsResultInMaxLotsExceeded inputsResultInMaxLotsExceeded = (ValidateStrategyAndQuantityResponseDto.ErrorDto.TypeDto.InputsResultInMaxLotsExceeded) type2;
                CryptoTaxLotOrderInputDuxo.this.submit(new CryptoTaxLotOrderInputEvent.ShowLotLimitAlert(new CryptoTaxLotOrderInputLotLimitAlertDialogState(this.$orderContext.getRequestContext().getCurrencyPair().getAssetCurrency(), inputsResultInMaxLotsExceeded.getValue().getMaximum_quantity().toBigDecimalOrThrow(), inputsResultInMaxLotsExceeded.getValue().getMaximum_lots())));
            } else {
                if (type2 != null) {
                    throw new NoWhenBranchMatchedException();
                }
                final CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo = CryptoTaxLotOrderInputDuxo.this;
                cryptoTaxLotOrderInputDuxo.withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$onValidationSucceed$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CryptoTaxLotOrderInputDuxo.C406961.invokeSuspend$lambda$0(cryptoTaxLotOrderInputDuxo, (CryptoTaxLotOrderInputDataState) obj2);
                    }
                });
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo, CryptoTaxLotOrderInputDataState cryptoTaxLotOrderInputDataState) {
            StreamSelectedTaxLotStrategyResponseDto selectedStrategyDto$feature_trade_crypto_externalDebug = cryptoTaxLotOrderInputDataState.getSelectedStrategyDto$feature_trade_crypto_externalDebug();
            if (selectedStrategyDto$feature_trade_crypto_externalDebug != null) {
                cryptoTaxLotOrderInputDuxo.submit(new CryptoTaxLotOrderInputEvent.ShowLotSelectionScreen(selectedStrategyDto$feature_trade_crypto_externalDebug.getStrategy_type(), cryptoTaxLotOrderInputDataState.getRequestInputs()));
                return Unit.INSTANCE;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // com.robinhood.shared.trade.crypto.validation.CryptoOrderValidatorManager.Callback
    public void onValidationSucceed(CryptoOrderContext orderContext) {
        Intrinsics.checkNotNullParameter(orderContext, "orderContext");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C406961(orderContext, null), 3, null);
    }

    @Override // com.robinhood.shared.trade.crypto.validation.CryptoOrderValidatorManager.Callback
    public void onValidationFailure(CryptoOrderValidator2 failure, CryptoOrderContext orderContext) {
        Intrinsics.checkNotNullParameter(failure, "failure");
        Intrinsics.checkNotNullParameter(orderContext, "orderContext");
        submit(new CryptoTaxLotOrderInputEvent.ValidationFailureAlert(failure, orderContext));
    }

    public final boolean onPositiveResponse(Bundle passthroughArgs) {
        return this.cryptoOrderValidatorManager.onPositiveResponse(passthroughArgs);
    }

    public final boolean onNegativeResponse(Bundle passthroughArgs) {
        return this.cryptoOrderValidatorManager.onNegativeResponse(passthroughArgs);
    }

    /* compiled from: CryptoTaxLotOrderInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$requestFocusOnLimitPriceInput$1", m3645f = "CryptoTaxLotOrderInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDuxo$requestFocusOnLimitPriceInput$1 */
    static final class C406971 extends ContinuationImpl7 implements Function2<CryptoTaxLotOrderInputDataState, Continuation<? super CryptoTaxLotOrderInputDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C406971(Continuation<? super C406971> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C406971 c406971 = new C406971(continuation);
            c406971.L$0 = obj;
            return c406971;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoTaxLotOrderInputDataState cryptoTaxLotOrderInputDataState, Continuation<? super CryptoTaxLotOrderInputDataState> continuation) {
            return ((C406971) create(cryptoTaxLotOrderInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoTaxLotOrderInputDataState.copy$default((CryptoTaxLotOrderInputDataState) this.L$0, null, null, null, null, null, null, CryptoTaxLotOrderInputDataState.InputField.LIMIT_PRICE, null, null, null, null, null, false, 8127, null);
        }
    }

    @Override // com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator3
    public void requestFocusOnLimitPriceInput() {
        applyMutation(new C406971(null));
    }

    public final void emitBottomSheetData(ImmutableList<BottomSheetTypeDto> dtos) {
        Intrinsics.checkNotNullParameter(dtos, "dtos");
        this.bottomSheetService.emitBottomSheetData(dtos);
    }

    /* compiled from: CryptoTaxLotOrderInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputDuxo;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputFragment$Args;", "<init>", "()V", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CryptoTaxLotOrderInputDuxo, CryptoTaxLotOrderInputFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoTaxLotOrderInputFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (CryptoTaxLotOrderInputFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoTaxLotOrderInputFragment.Args getArgs(CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo) {
            return (CryptoTaxLotOrderInputFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, cryptoTaxLotOrderInputDuxo);
        }
    }
}
