package com.robinhood.shared.trade.crypto.p397ui.taxLots.selection;

import android.view.KeyEvent;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.microgramsdui.MicrogramManager2;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.IdlDecimal2;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.models.api.fee.MonetizationModel;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.crypto.p315ui.fee.CryptoOrderMonetizationModel;
import com.robinhood.models.crypto.p315ui.fee.UiFeeEstimation;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.serverdriven.experimental.api.AlertAction;
import com.robinhood.models.serverdriven.experimental.api.ConvertToRebateOrder;
import com.robinhood.models.serverdriven.experimental.api.CryptoAcknowledgeAlertAndContinueAction;
import com.robinhood.models.serverdriven.experimental.api.CryptoSideEffect;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.crypto.p375ui.trade.validator.ServerDrivenCryptoOrderValidator;
import com.robinhood.shared.crypto.trading.bottomsheet.CryptoTradingBottomSheetService;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.formats.crypto.CryptoInstrumentInputHelper;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContextFactory;
import com.robinhood.shared.trade.crypto.microgram.RealCryptoTradeFeeEstimationService;
import com.robinhood.shared.trade.crypto.microgram.RealCryptoTradeUserInputsService;
import com.robinhood.shared.trade.crypto.p397ui.extensions.CryptoOrderContexts;
import com.robinhood.shared.trade.crypto.p397ui.order.CryptoOrderPrices;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.selection.CryptoTaxLotSelectionEvent;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.selection.CryptoTaxLotSelectionFragment;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.selection.validation.CryptoTaxLotSelectionValidatorProvider;
import com.robinhood.shared.trade.crypto.validation.CryptoOrderUiEvent;
import com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator2;
import com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator3;
import com.robinhood.shared.trade.crypto.validation.CryptoOrderValidatorManager;
import com.robinhood.shared.trade.crypto.validation.RequestInputs;
import com.robinhood.shared.trade.crypto.validation.StaticInputs;
import com.robinhood.utils.extensions.KeyEvents2;
import com.robinhood.utils.extensions.Throwables;
import contracts.crypto.trade.proto.p431v1.BottomSheetTypeDto;
import contracts.crypto.trade.proto.p431v1.SourceDto;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.ClearTaxLotRowInvalidInputAmountRequestDto;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.CryptoTaxLotSelectionService;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.FetchTaxLotsNextPageRequestDto;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.InitializeCryptoTaxLotSelectionRequestDto;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.StreamSelectedTaxLotsRequestDto;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.StreamSelectedTaxLotsResponseDto;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.StreamTaxLotSelectionFooterRequestDto;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.StreamTaxLotSelectionFooterResponseDto;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.StreamTaxLotViewModelsRequestDto;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.StreamTaxLotViewModelsResponseDto;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.UpdateTaxLotRowCheckedStateRequestDto;
import nummus.p512v1.SortDirectionDto;

/* compiled from: CryptoTaxLotSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 ^2\u00020\u00012\u00020\u00022\u00020\u00032\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004:\u0001^By\b\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#¢\u0006\u0004\b$\u0010%J\b\u0010:\u001a\u00020;H\u0016J\u0006\u0010<\u001a\u00020;J\u000e\u0010=\u001a\u00020;2\u0006\u0010>\u001a\u00020?J\u0016\u0010@\u001a\u00020;2\u0006\u0010A\u001a\u00020?2\u0006\u0010B\u001a\u00020CJ\u0010\u0010D\u001a\u00020;2\b\u0010A\u001a\u0004\u0018\u00010?J\u0006\u0010E\u001a\u00020;J\u000e\u0010F\u001a\u00020;2\u0006\u0010G\u001a\u00020HJ\u0006\u0010I\u001a\u00020;J\u0006\u0010J\u001a\u00020;J\u0006\u0010K\u001a\u00020;J\u0010\u0010L\u001a\u00020;2\u0006\u0010M\u001a\u00020NH\u0016J\u0018\u0010O\u001a\u00020;2\u0006\u0010P\u001a\u00020Q2\u0006\u0010M\u001a\u00020NH\u0016J\u0006\u0010R\u001a\u00020CJ\u0006\u0010S\u001a\u00020CJ\u0006\u0010T\u001a\u00020;J\u000e\u0010U\u001a\u00020;2\u0006\u0010V\u001a\u00020WJ\b\u0010X\u001a\u00020;H\u0002J\u0014\u0010Y\u001a\u00020;2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\\0[J\u0006\u0010]\u001a\u00020;R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u00020#X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001b\u0010(\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b*\u0010+R\u0011\u0010.\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u000e\u00102\u001a\u000203X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00106\u001a\u0002078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006_"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionDuxo;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailureResolver;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidatorManager$Callback;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionDataState;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionViewState;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionEvent;", "bottomSheetService", "Lcom/robinhood/shared/crypto/trading/bottomsheet/CryptoTradingBottomSheetService;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoOrderContextFactory", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContextFactory;", "cryptoOrderValidatorManager", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidatorManager;", "cryptoTaxLotSelectionValidatorProvider", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/validation/CryptoTaxLotSelectionValidatorProvider;", "cryptoTradeFeeEstimationService", "Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeFeeEstimationService;", "cryptoTradeUserInputsService", "Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeUserInputsService;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "serverDrivenCryptoOrderValidator", "Lcom/robinhood/shared/crypto/ui/trade/validator/ServerDrivenCryptoOrderValidator;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "stateProvider", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/shared/crypto/trading/bottomsheet/CryptoTradingBottomSheetService;Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContextFactory;Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidatorManager;Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/validation/CryptoTaxLotSelectionValidatorProvider;Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeFeeEstimationService;Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeUserInputsService;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/shared/crypto/ui/trade/validator/ServerDrivenCryptoOrderValidator;Lcom/robinhood/android/microgramsdui/MicrogramManager;Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "staticInputs", "Lcom/robinhood/shared/trade/crypto/validation/StaticInputs;", "getStaticInputs", "()Lcom/robinhood/shared/trade/crypto/validation/StaticInputs;", "staticInputs$delegate", "Lkotlin/Lazy;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "microgramInstance", "Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "taxLotSelectionService", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTaxLotSelectionService;", "bottomSheetSourceDto", "Lcontracts/crypto/trade/proto/v1/SourceDto;", "getBottomSheetSourceDto", "()Lcontracts/crypto/trade/proto/v1/SourceDto;", "onCreate", "", "requestNextPage", "onHeaderClicked", "sortId", "", "onCheckBoxClicked", "taxLotId", "isSelected", "", "onInputFieldFocused", "onMaxSelected", "onKeyPressed", "keyEvent", "Landroid/view/KeyEvent;", "onContinueClicked", "onBackPressed", "onPriceInfoClicked", "onValidationSucceed", "orderContext", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "onValidationFailure", "failure", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailure;", "onPositiveResponse", "onNegativeResponse", "continueToReview", "onAcknowledgeAlertAndContinue", "action", "Lcom/robinhood/models/serverdriven/experimental/api/CryptoAcknowledgeAlertAndContinueAction;", "convertToRebateOrder", "emitBottomSheetData", "dtos", "Lkotlinx/collections/immutable/ImmutableList;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto;", "showTransferredInBottomSheet", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CryptoTaxLotSelectionDuxo extends BaseDuxo3<CryptoTaxLotSelectionDataState, CryptoTaxLotSelectionViewState, CryptoTaxLotSelectionEvent> implements HasSavedState, CryptoOrderValidator3, CryptoOrderValidatorManager.Callback {
    private final CryptoTradingBottomSheetService bottomSheetService;
    private final CryptoAccountProvider cryptoAccountProvider;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final CryptoOrderContextFactory cryptoOrderContextFactory;
    private final CryptoOrderValidatorManager cryptoOrderValidatorManager;
    private final CryptoTaxLotSelectionValidatorProvider cryptoTaxLotSelectionValidatorProvider;
    private final RealCryptoTradeFeeEstimationService cryptoTradeFeeEstimationService;
    private final RealCryptoTradeUserInputsService cryptoTradeUserInputsService;
    private final EventLogger eventLogger;
    private final MicrogramManager2 microgramInstance;
    private final SavedStateHandle savedStateHandle;
    private final ServerDrivenCryptoOrderValidator serverDrivenCryptoOrderValidator;

    /* renamed from: staticInputs$delegate, reason: from kotlin metadata */
    private final Lazy staticInputs;
    private final CryptoTaxLotSelectionService taxLotSelectionService;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CryptoTaxLotSelectionDuxo.kt */
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

    @Override // com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator3
    public void convertToSellAll() {
        CryptoOrderValidator3.DefaultImpls.convertToSellAll(this);
    }

    @Override // com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator3
    public void initiateDeposit() {
        CryptoOrderValidator3.DefaultImpls.initiateDeposit(this);
    }

    @Override // com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator3
    public void requestFocusOnLimitPriceInput() {
        CryptoOrderValidator3.DefaultImpls.requestFocusOnLimitPriceInput(this);
    }

    @Override // com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator3
    public void selectPaymentMethod() {
        CryptoOrderValidator3.DefaultImpls.selectPaymentMethod(this);
    }

    @Override // com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator3
    public void setLimitPrice(BigDecimal bigDecimal) {
        CryptoOrderValidator3.DefaultImpls.setLimitPrice(this, bigDecimal);
    }

    @Override // com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator3
    public void setOrderSize(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        CryptoOrderValidator3.DefaultImpls.setOrderSize(this, bigDecimal, bigDecimal2);
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
    public CryptoTaxLotSelectionDuxo(CryptoTradingBottomSheetService bottomSheetService, CryptoAccountProvider cryptoAccountProvider, CryptoExperimentsStore cryptoExperimentsStore, CryptoOrderContextFactory cryptoOrderContextFactory, CryptoOrderValidatorManager cryptoOrderValidatorManager, CryptoTaxLotSelectionValidatorProvider cryptoTaxLotSelectionValidatorProvider, RealCryptoTradeFeeEstimationService cryptoTradeFeeEstimationService, RealCryptoTradeUserInputsService cryptoTradeUserInputsService, EventLogger eventLogger, ServerDrivenCryptoOrderValidator serverDrivenCryptoOrderValidator, MicrogramManager microgramManager, CryptoTaxLotSelectionStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new CryptoTaxLotSelectionDataState(((CryptoTaxLotSelectionFragment.Args) INSTANCE.getArgs(savedStateHandle)).getInitialRequestInputs(), null, null, null, null, null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(bottomSheetService, "bottomSheetService");
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(cryptoOrderContextFactory, "cryptoOrderContextFactory");
        Intrinsics.checkNotNullParameter(cryptoOrderValidatorManager, "cryptoOrderValidatorManager");
        Intrinsics.checkNotNullParameter(cryptoTaxLotSelectionValidatorProvider, "cryptoTaxLotSelectionValidatorProvider");
        Intrinsics.checkNotNullParameter(cryptoTradeFeeEstimationService, "cryptoTradeFeeEstimationService");
        Intrinsics.checkNotNullParameter(cryptoTradeUserInputsService, "cryptoTradeUserInputsService");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(serverDrivenCryptoOrderValidator, "serverDrivenCryptoOrderValidator");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.bottomSheetService = bottomSheetService;
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.cryptoOrderContextFactory = cryptoOrderContextFactory;
        this.cryptoOrderValidatorManager = cryptoOrderValidatorManager;
        this.cryptoTaxLotSelectionValidatorProvider = cryptoTaxLotSelectionValidatorProvider;
        this.cryptoTradeFeeEstimationService = cryptoTradeFeeEstimationService;
        this.cryptoTradeUserInputsService = cryptoTradeUserInputsService;
        this.eventLogger = eventLogger;
        this.serverDrivenCryptoOrderValidator = serverDrivenCryptoOrderValidator;
        this.savedStateHandle = savedStateHandle;
        this.staticInputs = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoTaxLotSelectionDuxo.staticInputs_delegate$lambda$0(this.f$0);
            }
        });
        MicrogramManager2 microgramManager2M16549getInstancemoChb0s$default = MicrogramManager.DefaultImpls.m16549getInstancemoChb0s$default(microgramManager, getLifecycleScope(), new MicrogramLaunchId(new RemoteMicrogramApplication("app-crypto-trading-tax-lots", null, 2, null), null, 2, null), null, 4, null);
        this.microgramInstance = microgramManager2M16549getInstancemoChb0s$default;
        this.taxLotSelectionService = (CryptoTaxLotSelectionService) microgramManager2M16549getInstancemoChb0s$default.getComponent().getServiceLocator().getClient(CryptoTaxLotSelectionService.class);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C407591(null), 3, null);
        cryptoOrderValidatorManager.setValidationFailureResolver(this);
        cryptoOrderValidatorManager.setCallback(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StaticInputs getStaticInputs() {
        return (StaticInputs) this.staticInputs.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StaticInputs staticInputs_delegate$lambda$0(CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo) {
        Companion companion = INSTANCE;
        return new StaticInputs(((CryptoTaxLotSelectionFragment.Args) companion.getArgs((HasSavedState) cryptoTaxLotSelectionDuxo)).getCurrencyPairId(), ((CryptoTaxLotSelectionFragment.Args) companion.getArgs((HasSavedState) cryptoTaxLotSelectionDuxo)).getOrderUuid());
    }

    public final Screen getEventScreen() {
        Screen.Name name = Screen.Name.TAX_LOTS_SELECTION;
        String string2 = ((CryptoTaxLotSelectionFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getCurrencyPairId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Screen(name, "crypto_tax_lots", string2, null, 8, null);
    }

    private final SourceDto getBottomSheetSourceDto() {
        return new SourceDto(new SourceDto.TypeDto.TaxLotSelection(new SourceDto.TaxLotSelectionDto()));
    }

    /* compiled from: CryptoTaxLotSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$1", m3645f = "CryptoTaxLotSelectionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE, 144, EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$1 */
    static final class C407591 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C407591(Continuation<? super C407591> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTaxLotSelectionDuxo.this.new C407591(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C407591) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
        
            if (r9 == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00c0, code lost:
        
            if (r1.InitializeCryptoTaxLotSelection(r3, r8) != r0) goto L25;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String string2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowStreamCryptoMibExperiment = CryptoTaxLotSelectionDuxo.this.cryptoExperimentsStore.streamCryptoMibExperiment();
                this.label = 1;
                obj = FlowKt.first(flowStreamCryptoMibExperiment, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                string2 = ((UUID) obj).toString();
                CryptoTaxLotSelectionService cryptoTaxLotSelectionService = CryptoTaxLotSelectionDuxo.this.taxLotSelectionService;
                Companion companion = CryptoTaxLotSelectionDuxo.INSTANCE;
                String string3 = ((CryptoTaxLotSelectionFragment.Args) companion.getArgs((HasSavedState) CryptoTaxLotSelectionDuxo.this)).getCurrencyPairId().toString();
                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                InitializeCryptoTaxLotSelectionRequestDto initializeCryptoTaxLotSelectionRequestDto = new InitializeCryptoTaxLotSelectionRequestDto(string3, ((CryptoTaxLotSelectionFragment.Args) companion.getArgs((HasSavedState) CryptoTaxLotSelectionDuxo.this)).getStrategy(), IdlDecimal2.toIdlDecimal(((CryptoTaxLotSelectionFragment.Args) companion.getArgs((HasSavedState) CryptoTaxLotSelectionDuxo.this)).getInitialRequestInputs().getPurchaseSize()), string2);
                this.label = 3;
            }
            if (!((Boolean) obj).booleanValue()) {
                string2 = null;
                CryptoTaxLotSelectionService cryptoTaxLotSelectionService2 = CryptoTaxLotSelectionDuxo.this.taxLotSelectionService;
                Companion companion2 = CryptoTaxLotSelectionDuxo.INSTANCE;
                String string32 = ((CryptoTaxLotSelectionFragment.Args) companion2.getArgs((HasSavedState) CryptoTaxLotSelectionDuxo.this)).getCurrencyPairId().toString();
                Intrinsics.checkNotNullExpressionValue(string32, "toString(...)");
                InitializeCryptoTaxLotSelectionRequestDto initializeCryptoTaxLotSelectionRequestDto2 = new InitializeCryptoTaxLotSelectionRequestDto(string32, ((CryptoTaxLotSelectionFragment.Args) companion2.getArgs((HasSavedState) CryptoTaxLotSelectionDuxo.this)).getStrategy(), IdlDecimal2.toIdlDecimal(((CryptoTaxLotSelectionFragment.Args) companion2.getArgs((HasSavedState) CryptoTaxLotSelectionDuxo.this)).getInitialRequestInputs().getPurchaseSize()), string2);
                this.label = 3;
            } else {
                Flow flowFilterNotNull = FlowKt.filterNotNull(CryptoTaxLotSelectionDuxo.this.cryptoAccountProvider.streamCryptoAccountId(new CryptoAccountSwitcherLocation.SellAsset(((CryptoTaxLotSelectionFragment.Args) CryptoTaxLotSelectionDuxo.INSTANCE.getArgs((HasSavedState) CryptoTaxLotSelectionDuxo.this)).getCurrencyPairId())));
                this.label = 2;
                obj = FlowKt.first(flowFilterNotNull, this);
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        final StateFlow<CryptoTaxLotSelectionViewState> stateFlow = getStateFlow();
        SharedFlow sharedFlowShareIn = FlowKt.shareIn(new Flow<RequestInputs.AsAsset>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCreate$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super RequestInputs.AsAsset> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow.collect(new C407572(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCreate$$inlined$map$1$2 */
            public static final class C407572<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCreate$$inlined$map$1$2", m3645f = "CryptoTaxLotSelectionDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCreate$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C407572.this.emit(null, this);
                    }
                }

                public C407572(FlowCollector flowCollector) {
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
                        RequestInputs.AsAsset requestInputs = ((CryptoTaxLotSelectionViewState) obj).getRequestInputs();
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
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C407641(sharedFlowShareIn, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C407652(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C407663(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C407674(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C407685(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C407696(null));
    }

    /* compiled from: CryptoTaxLotSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCreate$1", m3645f = "CryptoTaxLotSelectionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCreate$1 */
    static final class C407641 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SharedFlow<RequestInputs.AsAsset> $requestInputsFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C407641(SharedFlow<RequestInputs.AsAsset> sharedFlow, Continuation<? super C407641> continuation) {
            super(2, continuation);
            this.$requestInputsFlow = sharedFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTaxLotSelectionDuxo.this.new C407641(this.$requestInputsFlow, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C407641) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(CryptoTaxLotSelectionDuxo.this.cryptoOrderContextFactory.create(CryptoTaxLotSelectionDuxo.this.getEventScreen(), CryptoTaxLotSelectionDuxo.this.getStaticInputs(), CryptoTaxLotSelectionDuxo.this.asObservable(this.$requestInputsFlow))), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoTaxLotSelectionDuxo.this, null);
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

        /* compiled from: CryptoTaxLotSelectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCreate$1$1", m3645f = "CryptoTaxLotSelectionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoOrderContext, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoTaxLotSelectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoTaxLotSelectionDuxo;
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
                CryptoOrderUiEvent shouldReviewOrder = cryptoOrderContext.getRequestContext().getRequestInputs().getShouldReviewOrder();
                if ((shouldReviewOrder != null ? shouldReviewOrder.consume() : null) != null) {
                    this.this$0.onContinueClicked();
                }
                this.this$0.applyMutation(new C508141(cryptoOrderContext, null));
                return Unit.INSTANCE;
            }

            /* compiled from: CryptoTaxLotSelectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCreate$1$1$1", m3645f = "CryptoTaxLotSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C508141 extends ContinuationImpl7 implements Function2<CryptoTaxLotSelectionDataState, Continuation<? super CryptoTaxLotSelectionDataState>, Object> {
                final /* synthetic */ CryptoOrderContext $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C508141(CryptoOrderContext cryptoOrderContext, Continuation<? super C508141> continuation) {
                    super(2, continuation);
                    this.$it = cryptoOrderContext;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C508141 c508141 = new C508141(this.$it, continuation);
                    c508141.L$0 = obj;
                    return c508141;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoTaxLotSelectionDataState cryptoTaxLotSelectionDataState, Continuation<? super CryptoTaxLotSelectionDataState> continuation) {
                    return ((C508141) create(cryptoTaxLotSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoTaxLotSelectionDataState.copy$default((CryptoTaxLotSelectionDataState) this.L$0, null, this.$it, null, null, null, null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null);
                }
            }
        }
    }

    /* compiled from: CryptoTaxLotSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCreate$2", m3645f = "CryptoTaxLotSelectionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCreate$2 */
    static final class C407652 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C407652(Continuation<? super C407652> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTaxLotSelectionDuxo.this.new C407652(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C407652) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<CryptoTaxLotSelectionViewState> stateFlow = CryptoTaxLotSelectionDuxo.this.getStateFlow();
                Flow<CryptoOrderContext> flow = new Flow<CryptoOrderContext>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCreate$2$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super CryptoOrderContext> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCreate$2$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCreate$2$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "CryptoTaxLotSelectionDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCreate$2$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                CryptoOrderContext cryptoOrderContext = ((CryptoTaxLotSelectionViewState) obj).getCryptoOrderContext();
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
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(CryptoTaxLotSelectionDuxo.this, null);
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

        /* compiled from: CryptoTaxLotSelectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCreate$2$2", m3645f = "CryptoTaxLotSelectionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCreate$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CryptoOrderContext, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoTaxLotSelectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cryptoTaxLotSelectionDuxo;
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

    /* compiled from: CryptoTaxLotSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCreate$3", m3645f = "CryptoTaxLotSelectionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCreate$3 */
    static final class C407663 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C407663(Continuation<? super C407663> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTaxLotSelectionDuxo.this.new C407663(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C407663) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<StreamTaxLotSelectionFooterResponseDto> flowStreamTaxLotSelectionFooter = CryptoTaxLotSelectionDuxo.this.taxLotSelectionService.StreamTaxLotSelectionFooter(new StreamTaxLotSelectionFooterRequestDto());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoTaxLotSelectionDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamTaxLotSelectionFooter, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoTaxLotSelectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCreate$3$1", m3645f = "CryptoTaxLotSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCreate$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<StreamTaxLotSelectionFooterResponseDto, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoTaxLotSelectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoTaxLotSelectionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(StreamTaxLotSelectionFooterResponseDto streamTaxLotSelectionFooterResponseDto, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(streamTaxLotSelectionFooterResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoTaxLotSelectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCreate$3$1$1", m3645f = "CryptoTaxLotSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCreate$3$1$1, reason: invalid class name and collision with other inner class name */
            static final class C508151 extends ContinuationImpl7 implements Function2<CryptoTaxLotSelectionDataState, Continuation<? super CryptoTaxLotSelectionDataState>, Object> {
                final /* synthetic */ StreamTaxLotSelectionFooterResponseDto $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C508151(StreamTaxLotSelectionFooterResponseDto streamTaxLotSelectionFooterResponseDto, Continuation<? super C508151> continuation) {
                    super(2, continuation);
                    this.$it = streamTaxLotSelectionFooterResponseDto;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C508151 c508151 = new C508151(this.$it, continuation);
                    c508151.L$0 = obj;
                    return c508151;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoTaxLotSelectionDataState cryptoTaxLotSelectionDataState, Continuation<? super CryptoTaxLotSelectionDataState> continuation) {
                    return ((C508151) create(cryptoTaxLotSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoTaxLotSelectionDataState.copy$default((CryptoTaxLotSelectionDataState) this.L$0, null, null, this.$it, null, null, null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C508151((StreamTaxLotSelectionFooterResponseDto) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoTaxLotSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCreate$4", m3645f = "CryptoTaxLotSelectionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCreate$4 */
    static final class C407674 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C407674(Continuation<? super C407674> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTaxLotSelectionDuxo.this.new C407674(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C407674) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<StreamSelectedTaxLotsResponseDto> flowStreamSelectedTaxLots = CryptoTaxLotSelectionDuxo.this.taxLotSelectionService.StreamSelectedTaxLots(new StreamSelectedTaxLotsRequestDto());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoTaxLotSelectionDuxo.this, null);
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

        /* compiled from: CryptoTaxLotSelectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotsResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCreate$4$1", m3645f = "CryptoTaxLotSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCreate$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<StreamSelectedTaxLotsResponseDto, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoTaxLotSelectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoTaxLotSelectionDuxo;
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

            /* compiled from: CryptoTaxLotSelectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCreate$4$1$1", m3645f = "CryptoTaxLotSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCreate$4$1$1, reason: invalid class name and collision with other inner class name */
            static final class C508161 extends ContinuationImpl7 implements Function2<CryptoTaxLotSelectionDataState, Continuation<? super CryptoTaxLotSelectionDataState>, Object> {
                final /* synthetic */ StreamSelectedTaxLotsResponseDto $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C508161(StreamSelectedTaxLotsResponseDto streamSelectedTaxLotsResponseDto, Continuation<? super C508161> continuation) {
                    super(2, continuation);
                    this.$it = streamSelectedTaxLotsResponseDto;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C508161 c508161 = new C508161(this.$it, continuation);
                    c508161.L$0 = obj;
                    return c508161;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoTaxLotSelectionDataState cryptoTaxLotSelectionDataState, Continuation<? super CryptoTaxLotSelectionDataState> continuation) {
                    return ((C508161) create(cryptoTaxLotSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoTaxLotSelectionDataState.copy$default((CryptoTaxLotSelectionDataState) this.L$0, null, null, null, this.$it, null, null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C508161((StreamSelectedTaxLotsResponseDto) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoTaxLotSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCreate$5", m3645f = "CryptoTaxLotSelectionDuxo.kt", m3646l = {201}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCreate$5 */
    static final class C407685 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C407685(Continuation<? super C407685> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTaxLotSelectionDuxo.this.new C407685(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C407685) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<StreamTaxLotViewModelsResponseDto> flowStreamTaxLotViewModels = CryptoTaxLotSelectionDuxo.this.taxLotSelectionService.StreamTaxLotViewModels(new StreamTaxLotViewModelsRequestDto());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoTaxLotSelectionDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamTaxLotViewModels, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoTaxLotSelectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCreate$5$1", m3645f = "CryptoTaxLotSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCreate$5$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<StreamTaxLotViewModelsResponseDto, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoTaxLotSelectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoTaxLotSelectionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(StreamTaxLotViewModelsResponseDto streamTaxLotViewModelsResponseDto, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(streamTaxLotViewModelsResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoTaxLotSelectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCreate$5$1$1", m3645f = "CryptoTaxLotSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCreate$5$1$1, reason: invalid class name and collision with other inner class name */
            static final class C508171 extends ContinuationImpl7 implements Function2<CryptoTaxLotSelectionDataState, Continuation<? super CryptoTaxLotSelectionDataState>, Object> {
                final /* synthetic */ StreamTaxLotViewModelsResponseDto $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C508171(StreamTaxLotViewModelsResponseDto streamTaxLotViewModelsResponseDto, Continuation<? super C508171> continuation) {
                    super(2, continuation);
                    this.$it = streamTaxLotViewModelsResponseDto;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C508171 c508171 = new C508171(this.$it, continuation);
                    c508171.L$0 = obj;
                    return c508171;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoTaxLotSelectionDataState cryptoTaxLotSelectionDataState, Continuation<? super CryptoTaxLotSelectionDataState> continuation) {
                    return ((C508171) create(cryptoTaxLotSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoTaxLotSelectionDataState.copy$default((CryptoTaxLotSelectionDataState) this.L$0, null, null, null, null, this.$it, null, false, false, 239, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C508171((StreamTaxLotViewModelsResponseDto) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoTaxLotSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCreate$6", m3645f = "CryptoTaxLotSelectionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCreate$6 */
    static final class C407696 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C407696(Continuation<? super C407696> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTaxLotSelectionDuxo.this.new C407696(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C407696) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<DialogFragmentKey> flowStreamLaunchDialog = CryptoTaxLotSelectionDuxo.this.bottomSheetService.streamLaunchDialog();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoTaxLotSelectionDuxo.this, null);
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

        /* compiled from: CryptoTaxLotSelectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCreate$6$1", m3645f = "CryptoTaxLotSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCreate$6$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DialogFragmentKey, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoTaxLotSelectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoTaxLotSelectionDuxo;
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
                this.this$0.submit(new CryptoTaxLotSelectionEvent.ShowDialogFragment((DialogFragmentKey) this.L$0));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoTaxLotSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$requestNextPage$1", m3645f = "CryptoTaxLotSelectionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_OVERRIDE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$requestNextPage$1 */
    static final class C407741 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C407741(Continuation<? super C407741> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTaxLotSelectionDuxo.this.new C407741(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C407741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoTaxLotSelectionService cryptoTaxLotSelectionService = CryptoTaxLotSelectionDuxo.this.taxLotSelectionService;
                FetchTaxLotsNextPageRequestDto fetchTaxLotsNextPageRequestDto = new FetchTaxLotsNextPageRequestDto();
                this.label = 1;
                if (cryptoTaxLotSelectionService.FetchTaxLotsNextPage(fetchTaxLotsNextPageRequestDto, this) == coroutine_suspended) {
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

    public final void requestNextPage() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C407741(null), 3, null);
    }

    public final void onHeaderClicked(final String sortId) {
        Intrinsics.checkNotNullParameter(sortId, "sortId");
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoTaxLotSelectionDuxo.onHeaderClicked$lambda$4(this.f$0, sortId, (CryptoTaxLotSelectionDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onHeaderClicked$lambda$4(CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo, String str, CryptoTaxLotSelectionDataState it) {
        List<StreamTaxLotViewModelsResponseDto.HeaderDto> headers;
        Object next;
        StreamTaxLotViewModelsResponseDto.HeaderDto.SortableDto value;
        UserInteractionEventData.Action action;
        Intrinsics.checkNotNullParameter(it, "it");
        StreamTaxLotViewModelsResponseDto taxLotViewModelsResponseDto = it.getTaxLotViewModelsResponseDto();
        if (taxLotViewModelsResponseDto != null && (headers = taxLotViewModelsResponseDto.getHeaders()) != null) {
            List<StreamTaxLotViewModelsResponseDto.HeaderDto> list = headers;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((StreamTaxLotViewModelsResponseDto.HeaderDto) it2.next()).getType());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (obj instanceof StreamTaxLotViewModelsResponseDto.HeaderDto.TypeDto.Sortable) {
                    arrayList2.add(obj);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                if (Intrinsics.areEqual(((StreamTaxLotViewModelsResponseDto.HeaderDto.TypeDto.Sortable) next).getValue().getSort_type().getJson_value(), str)) {
                    break;
                }
            }
            StreamTaxLotViewModelsResponseDto.HeaderDto.TypeDto.Sortable sortable = (StreamTaxLotViewModelsResponseDto.HeaderDto.TypeDto.Sortable) next;
            if (sortable != null && (value = sortable.getValue()) != null) {
                EventLogger eventLogger = cryptoTaxLotSelectionDuxo.eventLogger;
                Screen eventScreen = cryptoTaxLotSelectionDuxo.getEventScreen();
                Component.ComponentType componentType = Component.ComponentType.SECTION_HEADER;
                String json_value = value.getSort_type().getJson_value();
                if (json_value == null) {
                    json_value = "";
                }
                Component component = new Component(componentType, json_value, null, 4, null);
                if (value.getNext_sort_direction() == SortDirectionDto.SORT_DIRECTION_ASCENDING) {
                    action = UserInteractionEventData.Action.SORT_ASCENDING;
                } else {
                    action = UserInteractionEventData.Action.SORT_DESCENDING;
                }
                EventLogger.DefaultImpls.logTap$default(eventLogger, action, eventScreen, component, null, null, false, 56, null);
                BuildersKt__Builders_commonKt.launch$default(cryptoTaxLotSelectionDuxo.getLifecycleScope(), null, null, new CryptoTaxLotSelectionDuxo2(cryptoTaxLotSelectionDuxo, value, null), 3, null);
                return Unit.INSTANCE;
            }
        }
        throw new IllegalStateException("Unknown sort type");
    }

    /* compiled from: CryptoTaxLotSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCheckBoxClicked$1", m3645f = "CryptoTaxLotSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCheckBoxClicked$1 */
    static final class C407621 extends ContinuationImpl7 implements Function2<CryptoTaxLotSelectionDataState, Continuation<? super CryptoTaxLotSelectionDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C407621(Continuation<? super C407621> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C407621 c407621 = new C407621(continuation);
            c407621.L$0 = obj;
            return c407621;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoTaxLotSelectionDataState cryptoTaxLotSelectionDataState, Continuation<? super CryptoTaxLotSelectionDataState> continuation) {
            return ((C407621) create(cryptoTaxLotSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoTaxLotSelectionDataState.copy$default((CryptoTaxLotSelectionDataState) this.L$0, null, null, null, null, null, null, true, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null);
        }
    }

    public final void onCheckBoxClicked(String taxLotId, boolean isSelected) {
        UserInteractionEventData.Action action;
        Intrinsics.checkNotNullParameter(taxLotId, "taxLotId");
        applyMutation(new C407621(null));
        EventLogger eventLogger = this.eventLogger;
        Screen eventScreen = getEventScreen();
        Component component = new Component(null, "tax_lot_check_box", null, 5, null);
        if (isSelected) {
            action = UserInteractionEventData.Action.SELECT;
        } else {
            if (isSelected) {
                throw new NoWhenBranchMatchedException();
            }
            action = UserInteractionEventData.Action.DESELECT;
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, eventScreen, component, null, null, false, 56, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C407632(taxLotId, isSelected, null), 3, null);
    }

    /* compiled from: CryptoTaxLotSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCheckBoxClicked$2", m3645f = "CryptoTaxLotSelectionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onCheckBoxClicked$2 */
    static final class C407632 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isSelected;
        final /* synthetic */ String $taxLotId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C407632(String str, boolean z, Continuation<? super C407632> continuation) {
            super(2, continuation);
            this.$taxLotId = str;
            this.$isSelected = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTaxLotSelectionDuxo.this.new C407632(this.$taxLotId, this.$isSelected, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C407632) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoTaxLotSelectionService cryptoTaxLotSelectionService = CryptoTaxLotSelectionDuxo.this.taxLotSelectionService;
                UpdateTaxLotRowCheckedStateRequestDto updateTaxLotRowCheckedStateRequestDto = new UpdateTaxLotRowCheckedStateRequestDto(this.$taxLotId, this.$isSelected);
                this.label = 1;
                if (cryptoTaxLotSelectionService.UpdateTaxLotRowCheckedState(updateTaxLotRowCheckedStateRequestDto, this) == coroutine_suspended) {
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

    /* compiled from: CryptoTaxLotSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onInputFieldFocused$1", m3645f = "CryptoTaxLotSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onInputFieldFocused$1 */
    static final class C407701 extends ContinuationImpl7 implements Function2<CryptoTaxLotSelectionDataState, Continuation<? super CryptoTaxLotSelectionDataState>, Object> {
        final /* synthetic */ String $taxLotId;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CryptoTaxLotSelectionDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C407701(String str, CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo, Continuation<? super C407701> continuation) {
            super(2, continuation);
            this.$taxLotId = str;
            this.this$0 = cryptoTaxLotSelectionDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C407701 c407701 = new C407701(this.$taxLotId, this.this$0, continuation);
            c407701.L$0 = obj;
            return c407701;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoTaxLotSelectionDataState cryptoTaxLotSelectionDataState, Continuation<? super CryptoTaxLotSelectionDataState> continuation) {
            return ((C407701) create(cryptoTaxLotSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoTaxLotSelectionDataState cryptoTaxLotSelectionDataState = (CryptoTaxLotSelectionDataState) this.L$0;
            if (!Intrinsics.areEqual(cryptoTaxLotSelectionDataState.getFocusedInputTaxLotId(), this.$taxLotId)) {
                BuildersKt__Builders_commonKt.launch$default(this.this$0.getLifecycleScope(), null, null, new AnonymousClass1(this.this$0, null), 3, null);
            }
            return CryptoTaxLotSelectionDataState.copy$default(cryptoTaxLotSelectionDataState, null, null, null, null, null, this.$taxLotId, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null);
        }

        /* compiled from: CryptoTaxLotSelectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onInputFieldFocused$1$1", m3645f = "CryptoTaxLotSelectionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onInputFieldFocused$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CryptoTaxLotSelectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoTaxLotSelectionDuxo;
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
                    CryptoTaxLotSelectionService cryptoTaxLotSelectionService = this.this$0.taxLotSelectionService;
                    ClearTaxLotRowInvalidInputAmountRequestDto clearTaxLotRowInvalidInputAmountRequestDto = new ClearTaxLotRowInvalidInputAmountRequestDto();
                    this.label = 1;
                    if (cryptoTaxLotSelectionService.ClearTaxLotRowInvalidInputAmount(clearTaxLotRowInvalidInputAmountRequestDto, this) == coroutine_suspended) {
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

    public final void onInputFieldFocused(String taxLotId) {
        applyMutation(new C407701(taxLotId, this, null));
    }

    public final void onMaxSelected() {
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoTaxLotSelectionDuxo.onMaxSelected$lambda$5(this.f$0, (CryptoTaxLotSelectionDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMaxSelected$lambda$5(CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo, CryptoTaxLotSelectionDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String focusedInputTaxLotId = it.getFocusedInputTaxLotId();
        if (focusedInputTaxLotId == null) {
            return Unit.INSTANCE;
        }
        BuildersKt__Builders_commonKt.launch$default(cryptoTaxLotSelectionDuxo.getLifecycleScope(), null, null, new CryptoTaxLotSelectionDuxo4(cryptoTaxLotSelectionDuxo, focusedInputTaxLotId, null), 3, null);
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoTaxLotSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onKeyPressed$1", m3645f = "CryptoTaxLotSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onKeyPressed$1 */
    static final class C407711 extends ContinuationImpl7 implements Function2<CryptoTaxLotSelectionDataState, Continuation<? super CryptoTaxLotSelectionDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C407711(Continuation<? super C407711> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C407711 c407711 = new C407711(continuation);
            c407711.L$0 = obj;
            return c407711;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoTaxLotSelectionDataState cryptoTaxLotSelectionDataState, Continuation<? super CryptoTaxLotSelectionDataState> continuation) {
            return ((C407711) create(cryptoTaxLotSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoTaxLotSelectionDataState.copy$default((CryptoTaxLotSelectionDataState) this.L$0, null, null, null, null, null, null, true, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null);
        }
    }

    public final void onKeyPressed(final KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        applyMutation(new C407711(null));
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoTaxLotSelectionDuxo.onKeyPressed$lambda$7(keyEvent, this, (CryptoTaxLotSelectionDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onKeyPressed$lambda$7(KeyEvent keyEvent, CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo, CryptoTaxLotSelectionDataState it) {
        CryptoOrderContext.RequestContext requestContext;
        UiCurrencyPair currencyPair;
        Tuples2 tuples2ProcessKeyEvent$default;
        BigDecimal bigDecimalOrThrow;
        Intrinsics.checkNotNullParameter(it, "it");
        CryptoOrderContext cryptoOrderContext = it.getCryptoOrderContext();
        if (cryptoOrderContext == null || (requestContext = cryptoOrderContext.getRequestContext()) == null || (currencyPair = requestContext.getCurrencyPair()) == null) {
            return Unit.INSTANCE;
        }
        String focusedInputTaxLotId = it.getFocusedInputTaxLotId();
        if (focusedInputTaxLotId == null) {
            return Unit.INSTANCE;
        }
        StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.SelectedQuantityDto focusedInputCell = it.getFocusedInputCell();
        if (focusedInputCell == null) {
            throw new IllegalStateException("Cannot find focused tax lot");
        }
        String formatted_selected_quantity = focusedInputCell.getFormatted_selected_quantity();
        if (formatted_selected_quantity == null) {
            IdlDecimal selected_quantity = focusedInputCell.getSelected_quantity();
            formatted_selected_quantity = (selected_quantity == null || (bigDecimalOrThrow = selected_quantity.toBigDecimalOrThrow()) == null) ? null : CurrencyDefinitions.formatCurrency$default(currencyPair.getAssetCurrency(), bigDecimalOrThrow, false, false, null, 0, null, null, false, false, false, false, 2044, null);
            if (formatted_selected_quantity == null) {
                formatted_selected_quantity = "";
            }
        }
        String str = formatted_selected_quantity;
        if (str.length() <= 1 && KeyEvents2.isDelete(keyEvent)) {
            tuples2ProcessKeyEvent$default = Tuples4.m3642to(null, null);
        } else {
            tuples2ProcessKeyEvent$default = CryptoInstrumentInputHelper.processKeyEvent$default(new CryptoInstrumentInputHelper(currencyPair), keyEvent, str, CryptoInputMode.ASSET_CURRENCY, false, false, false, false, 104, null);
        }
        BuildersKt__Builders_commonKt.launch$default(cryptoTaxLotSelectionDuxo.getLifecycleScope(), null, null, new CryptoTaxLotSelectionDuxo3(cryptoTaxLotSelectionDuxo, (BigDecimal) tuples2ProcessKeyEvent$default.component2(), currencyPair, focusedInputTaxLotId, (String) tuples2ProcessKeyEvent$default.component1(), null), 3, null);
        return Unit.INSTANCE;
    }

    public final void onContinueClicked() {
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoTaxLotSelectionDuxo.onContinueClicked$lambda$8(this.f$0, (CryptoTaxLotSelectionDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onContinueClicked$lambda$8(CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo, CryptoTaxLotSelectionDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CryptoOrderContext cryptoOrderContext = it.getCryptoOrderContext();
        if (cryptoOrderContext == null) {
            return Unit.INSTANCE;
        }
        cryptoTaxLotSelectionDuxo.cryptoOrderValidatorManager.validateAndReviewOrder(cryptoOrderContext, false, cryptoTaxLotSelectionDuxo.cryptoTaxLotSelectionValidatorProvider.getValidator());
        return Unit.INSTANCE;
    }

    public final void onBackPressed() {
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoTaxLotSelectionDuxo.onBackPressed$lambda$9(this.f$0, (CryptoTaxLotSelectionDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBackPressed$lambda$9(CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo, CryptoTaxLotSelectionDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getHasCustomLotSelection()) {
            cryptoTaxLotSelectionDuxo.submit(CryptoTaxLotSelectionEvent.DisplayWorkLossAlertDialog.INSTANCE);
        } else {
            cryptoTaxLotSelectionDuxo.submit(CryptoTaxLotSelectionEvent.GoBack.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    public final void onPriceInfoClicked() {
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoTaxLotSelectionDuxo.onPriceInfoClicked$lambda$10(this.f$0, (CryptoTaxLotSelectionDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onPriceInfoClicked$lambda$10(CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo, CryptoTaxLotSelectionDataState it) {
        BottomSheetTypeDto marketPriceBottomSheetTypeDto;
        Intrinsics.checkNotNullParameter(it, "it");
        CryptoOrderPrices orderPrices = it.getRequestInputs().getOrderPrices();
        if (orderPrices instanceof CryptoOrderPrices.Limit) {
            CryptoOrderContext cryptoOrderContext = it.getCryptoOrderContext();
            if (cryptoOrderContext == null) {
                return Unit.INSTANCE;
            }
            cryptoTaxLotSelectionDuxo.bottomSheetService.launchBottomSheet(CryptoOrderContexts.getLimitOrderDefinitionBottomSheetTypeDto(cryptoOrderContext), cryptoTaxLotSelectionDuxo.getEventScreen(), cryptoTaxLotSelectionDuxo.getBottomSheetSourceDto());
        } else if (orderPrices instanceof CryptoOrderPrices.Market) {
            CryptoOrderContext cryptoOrderContext2 = it.getCryptoOrderContext();
            if (cryptoOrderContext2 == null) {
                return Unit.INSTANCE;
            }
            CryptoTradingBottomSheetService cryptoTradingBottomSheetService = cryptoTaxLotSelectionDuxo.bottomSheetService;
            int i = WhenMappings.$EnumSwitchMapping$0[it.getRequestInputs().getMonetizationModel().ordinal()];
            if (i == 1) {
                marketPriceBottomSheetTypeDto = CryptoOrderContexts.getMarketPriceBottomSheetTypeDto(cryptoOrderContext2);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                marketPriceBottomSheetTypeDto = CryptoOrderContexts.getSpreadBottomSheetTypeDto(cryptoOrderContext2);
            }
            cryptoTradingBottomSheetService.launchBottomSheet(marketPriceBottomSheetTypeDto, cryptoTaxLotSelectionDuxo.getEventScreen(), cryptoTaxLotSelectionDuxo.getBottomSheetSourceDto());
        } else {
            if (orderPrices instanceof CryptoOrderPrices.StopLimit) {
                throw new IllegalStateException("Stop limit tax lot orders unsupported");
            }
            if (orderPrices instanceof CryptoOrderPrices.StopLoss) {
                throw new IllegalStateException("Stop loss tax lot orders unsupported");
            }
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoTaxLotSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onValidationSucceed$1", m3645f = "CryptoTaxLotSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onValidationSucceed$1 */
    static final class C407721 extends ContinuationImpl7 implements Function2<CryptoTaxLotSelectionDataState, Continuation<? super CryptoTaxLotSelectionDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C407721(Continuation<? super C407721> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C407721 c407721 = new C407721(continuation);
            c407721.L$0 = obj;
            return c407721;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoTaxLotSelectionDataState cryptoTaxLotSelectionDataState, Continuation<? super CryptoTaxLotSelectionDataState> continuation) {
            return ((C407721) create(cryptoTaxLotSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoTaxLotSelectionDataState.copy$default((CryptoTaxLotSelectionDataState) this.L$0, null, null, null, null, null, null, false, true, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        }
    }

    /* compiled from: CryptoTaxLotSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onValidationSucceed$2", m3645f = "CryptoTaxLotSelectionDuxo.kt", m3646l = {392}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onValidationSucceed$2 */
    static final class C407732 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CryptoOrderContext $orderContext;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C407732(CryptoOrderContext cryptoOrderContext, Continuation<? super C407732> continuation) {
            super(2, continuation);
            this.$orderContext = cryptoOrderContext;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTaxLotSelectionDuxo.this.new C407732(this.$orderContext, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C407732) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            C407732 c407732;
            Throwable th;
            GenericAlertContent alert;
            Object showSduiValidationAlert;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    ServerDrivenCryptoOrderValidator serverDrivenCryptoOrderValidator = CryptoTaxLotSelectionDuxo.this.serverDrivenCryptoOrderValidator;
                    UUID id = this.$orderContext.getRequestContext().getCurrencyPair().getId();
                    MonetizationModel monetizationModel = this.$orderContext.getRequestContext().getRequestInputs().getMonetizationModel();
                    OrderSide side = this.$orderContext.getRequestContext().getRequestInputs().getSide();
                    CryptoOrderType orderType = this.$orderContext.getRequestContext().getRequestInputs().getOrderPrices().getOrderType();
                    this.label = 1;
                    c407732 = this;
                    try {
                        obj = ServerDrivenCryptoOrderValidator.validate$default(serverDrivenCryptoOrderValidator, id, monetizationModel, side, orderType, null, null, c407732, 48, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        if (!Throwables.isNetworkRelated(th)) {
                        }
                        CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo = CryptoTaxLotSelectionDuxo.this;
                        if (alert != null) {
                        }
                        cryptoTaxLotSelectionDuxo.submit(showSduiValidationAlert);
                        CryptoTaxLotSelectionDuxo.this.applyMutation(new AnonymousClass1(null));
                        return Unit.INSTANCE;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c407732 = this;
                    th = th;
                    if (!Throwables.isNetworkRelated(th)) {
                    }
                    CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo2 = CryptoTaxLotSelectionDuxo.this;
                    if (alert != null) {
                    }
                    cryptoTaxLotSelectionDuxo2.submit(showSduiValidationAlert);
                    CryptoTaxLotSelectionDuxo.this.applyMutation(new AnonymousClass1(null));
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    ResultKt.throwOnFailure(obj);
                    c407732 = this;
                } catch (Throwable th4) {
                    th = th4;
                    c407732 = this;
                    if (!Throwables.isNetworkRelated(th)) {
                        throw th;
                    }
                    CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo22 = CryptoTaxLotSelectionDuxo.this;
                    if (alert != null) {
                    }
                    cryptoTaxLotSelectionDuxo22.submit(showSduiValidationAlert);
                    CryptoTaxLotSelectionDuxo.this.applyMutation(new AnonymousClass1(null));
                    return Unit.INSTANCE;
                }
            }
            AlertAction alertAction = (AlertAction) obj;
            alert = alertAction != null ? alertAction.getAlert() : null;
            CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo222 = CryptoTaxLotSelectionDuxo.this;
            if (alert != null) {
                RequestInputs requestInputs = c407732.$orderContext.getRequestContext().getRequestInputs();
                Intrinsics.checkNotNull(requestInputs, "null cannot be cast to non-null type com.robinhood.shared.trade.crypto.validation.RequestInputs.AsAsset");
                showSduiValidationAlert = new CryptoTaxLotSelectionEvent.ContinueToReview((RequestInputs.AsAsset) requestInputs);
            } else {
                showSduiValidationAlert = new CryptoTaxLotSelectionEvent.ShowSduiValidationAlert(alert);
            }
            cryptoTaxLotSelectionDuxo222.submit(showSduiValidationAlert);
            CryptoTaxLotSelectionDuxo.this.applyMutation(new AnonymousClass1(null));
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoTaxLotSelectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onValidationSucceed$2$1", m3645f = "CryptoTaxLotSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onValidationSucceed$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoTaxLotSelectionDataState, Continuation<? super CryptoTaxLotSelectionDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoTaxLotSelectionDataState cryptoTaxLotSelectionDataState, Continuation<? super CryptoTaxLotSelectionDataState> continuation) {
                return ((AnonymousClass1) create(cryptoTaxLotSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoTaxLotSelectionDataState.copy$default((CryptoTaxLotSelectionDataState) this.L$0, null, null, null, null, null, null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            }
        }
    }

    @Override // com.robinhood.shared.trade.crypto.validation.CryptoOrderValidatorManager.Callback
    public void onValidationSucceed(CryptoOrderContext orderContext) {
        Intrinsics.checkNotNullParameter(orderContext, "orderContext");
        applyMutation(new C407721(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C407732(orderContext, null), 3, null);
    }

    @Override // com.robinhood.shared.trade.crypto.validation.CryptoOrderValidatorManager.Callback
    public void onValidationFailure(CryptoOrderValidator2 failure, CryptoOrderContext orderContext) {
        Intrinsics.checkNotNullParameter(failure, "failure");
        Intrinsics.checkNotNullParameter(orderContext, "orderContext");
        submit(new CryptoTaxLotSelectionEvent.ValidationFailureAlert(failure, orderContext));
    }

    public final boolean onPositiveResponse() {
        return this.cryptoOrderValidatorManager.onPositiveResponse(null);
    }

    public final boolean onNegativeResponse() {
        return this.cryptoOrderValidatorManager.onNegativeResponse(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit continueToReview$lambda$11(CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo, CryptoTaxLotSelectionDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        cryptoTaxLotSelectionDuxo.submit(new CryptoTaxLotSelectionEvent.ContinueToReview(it.getRequestInputs()));
        return Unit.INSTANCE;
    }

    public final void continueToReview() {
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoTaxLotSelectionDuxo.continueToReview$lambda$11(this.f$0, (CryptoTaxLotSelectionDataState) obj);
            }
        });
    }

    public final void onAcknowledgeAlertAndContinue(CryptoAcknowledgeAlertAndContinueAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.serverDrivenCryptoOrderValidator.acknowledgeAlert(action.getAcknowledged_alert_id());
        Iterator<T> it = action.getSide_effects().iterator();
        while (it.hasNext()) {
            if (!(((CryptoSideEffect) it.next()) instanceof ConvertToRebateOrder)) {
                throw new NoWhenBranchMatchedException();
            }
            convertToRebateOrder();
        }
        applyMutation(new C407612(null));
    }

    /* compiled from: CryptoTaxLotSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onAcknowledgeAlertAndContinue$2", m3645f = "CryptoTaxLotSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onAcknowledgeAlertAndContinue$2 */
    static final class C407612 extends ContinuationImpl7 implements Function2<CryptoTaxLotSelectionDataState, Continuation<? super CryptoTaxLotSelectionDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C407612(Continuation<? super C407612> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C407612 c407612 = new C407612(continuation);
            c407612.L$0 = obj;
            return c407612;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoTaxLotSelectionDataState cryptoTaxLotSelectionDataState, Continuation<? super CryptoTaxLotSelectionDataState> continuation) {
            return ((C407612) create(cryptoTaxLotSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoTaxLotSelectionDataState cryptoTaxLotSelectionDataState = (CryptoTaxLotSelectionDataState) this.L$0;
            return CryptoTaxLotSelectionDataState.copy$default(cryptoTaxLotSelectionDataState, RequestInputs.AsAsset.copy$default(cryptoTaxLotSelectionDataState.getInitialRequestInputs(), null, null, null, null, null, false, null, new CryptoOrderUiEvent(null, 1, null), false, null, 895, null), null, null, null, null, null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        }
    }

    /* compiled from: CryptoTaxLotSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$convertToRebateOrder$1", m3645f = "CryptoTaxLotSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$convertToRebateOrder$1 */
    static final class C407601 extends ContinuationImpl7 implements Function2<CryptoTaxLotSelectionDataState, Continuation<? super CryptoTaxLotSelectionDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C407601(Continuation<? super C407601> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C407601 c407601 = new C407601(continuation);
            c407601.L$0 = obj;
            return c407601;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoTaxLotSelectionDataState cryptoTaxLotSelectionDataState, Continuation<? super CryptoTaxLotSelectionDataState> continuation) {
            return ((C407601) create(cryptoTaxLotSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoTaxLotSelectionDataState cryptoTaxLotSelectionDataState = (CryptoTaxLotSelectionDataState) this.L$0;
            return CryptoTaxLotSelectionDataState.copy$default(cryptoTaxLotSelectionDataState, RequestInputs.AsAsset.copy$default(cryptoTaxLotSelectionDataState.getInitialRequestInputs(), null, new CryptoOrderMonetizationModel.Rebate(CryptoOrderMonetizationModel.Rebate.Reason.TemporarilyUnavailable.INSTANCE), null, null, null, false, null, null, false, null, 1021, null), null, null, null, null, null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        }
    }

    private final void convertToRebateOrder() {
        applyMutation(new C407601(null));
    }

    public final void emitBottomSheetData(ImmutableList<BottomSheetTypeDto> dtos) {
        Intrinsics.checkNotNullParameter(dtos, "dtos");
        this.bottomSheetService.emitBottomSheetData(dtos);
    }

    public final void showTransferredInBottomSheet() {
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoTaxLotSelectionDuxo.showTransferredInBottomSheet$lambda$13(this.f$0, (CryptoTaxLotSelectionDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showTransferredInBottomSheet$lambda$13(CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo, CryptoTaxLotSelectionDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        cryptoTaxLotSelectionDuxo.bottomSheetService.launchBottomSheet(new BottomSheetTypeDto(new BottomSheetTypeDto.TypeDto.TaxLotTransferredLot(new BottomSheetTypeDto.TaxLotTransferredLotDto())), cryptoTaxLotSelectionDuxo.getEventScreen(), cryptoTaxLotSelectionDuxo.getBottomSheetSourceDto());
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoTaxLotSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionDuxo;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionFragment$Args;", "<init>", "()V", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CryptoTaxLotSelectionDuxo, CryptoTaxLotSelectionFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoTaxLotSelectionFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (CryptoTaxLotSelectionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoTaxLotSelectionFragment.Args getArgs(CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo) {
            return (CryptoTaxLotSelectionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, cryptoTaxLotSelectionDuxo);
        }
    }
}
