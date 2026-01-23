package com.robinhood.android.transfers.international.p266ui.amountinput;

import android.view.KeyEvent;
import androidx.lifecycle.SavedStateHandle;
import bff_money_movement.service.p019v1.BffMoneyMovementService;
import bff_money_movement.service.p019v1.GetServiceFeeRequestDto;
import bff_money_movement.service.p019v1.GetServiceFeeResponseDto;
import cashier_protos.payment_intents.p047v1.DirectionDto;
import cashier_protos.payment_intents.p047v1.PurposeDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.lib.p166fx.provider.McwFxRatesProvider;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.transfers.international.p266ui.amountinput.AmountInputDataState;
import com.robinhood.android.transfers.international.p266ui.amountinput.AmountInputEvent;
import com.robinhood.android.transfers.international.p266ui.amountinput.AmountInputFragment;
import com.robinhood.android.transfers.international.p266ui.amountinput.KeyEventConsumer;
import com.robinhood.android.transfers.international.p266ui.common.DisclosureComposable3;
import com.robinhood.android.transfers.international.p266ui.model.FxData;
import com.robinhood.android.transfers.international.p266ui.model.MultiCurrencyAccount2;
import com.robinhood.android.transfers.international.p266ui.model.TransferType;
import com.robinhood.android.transfers.international.p266ui.model.TransferType3;
import com.robinhood.android.transfers.international.p266ui.util.Currency2;
import com.robinhood.android.transfers.international.p266ui.util.ErrorDialog5;
import com.robinhood.android.transfers.international.p266ui.util.McwFxRateExtensions;
import com.robinhood.android.transfers.international.p266ui.util.Moneys3;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.lib.transfers.contracts.TransferEntryPoint;
import com.robinhood.models.api.bonfire.transfer.ApiTransferSummaryRequest;
import com.robinhood.models.api.bonfire.transfer.ApiTransferSummaryResponse;
import com.robinhood.models.p325fx.p326db.McwFxRate;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.common.contracts.SduiInfoSheetKey;
import com.robinhood.transfers.disclosures.contracts.CreateTransferState;
import com.robinhood.transfers.disclosures.contracts.CreateTransferState6;
import com.robinhood.transfers.disclosures.contracts.ServiceFeeParams;
import com.robinhood.transfers.disclosures.contracts.TransferDisclosureManagedService;
import com.robinhood.transfers.disclosures.contracts.TransferMode;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import microgram.android.MicrogramLaunchId;
import microgram.android.RemoteMicrogramApplication;
import microgram.contracts.money_movement.transfer_validation.proto.p501v1.ValidationService;

/* compiled from: AmountInputDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 92\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u00019BI\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010%\u001a\u00020&H\u0016J\u000e\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020)J\u0016\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.J\u0010\u0010/\u001a\u00020&2\u0006\u00100\u001a\u00020\u0002H\u0002J\u000e\u00101\u001a\u00020&2\u0006\u00102\u001a\u000203J\u0006\u00104\u001a\u00020&J\u000e\u00105\u001a\u00020&H\u0082@¢\u0006\u0002\u00106J\b\u00107\u001a\u00020&H\u0002J\b\u00108\u001a\u00020&H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b\"\u0010#¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDataState;", "Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputViewState;", "Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "bffMoneyMovementService", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "fxRatesProvider", "Lcom/robinhood/android/lib/fx/provider/McwFxRatesProvider;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "stateProvider", "Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lbff_money_movement/service/v1/BffMoneyMovementService;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/lib/fx/provider/McwFxRatesProvider;Lcom/robinhood/android/microgramsdui/MicrogramManager;Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "disclosureService", "Lcom/robinhood/transfers/disclosures/contracts/TransferDisclosureManagedService;", "getDisclosureService", "()Lcom/robinhood/transfers/disclosures/contracts/TransferDisclosureManagedService;", "disclosureService$delegate", "Lkotlin/Lazy;", "validationService", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/ValidationService;", "getValidationService", "()Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/ValidationService;", "validationService$delegate", "onStart", "", "consumeKeyEvent", "keyEvent", "Landroid/view/KeyEvent;", "continueButtonClicked", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "submitAmountEnteredEvent", "state", "setSelectedInput", "inputType", "Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDataState$InputType;", "exchangeRateInfoClicked", "fetchWireServiceFee", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchTransferSummary", "showGenericError", "Companion", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class AmountInputDuxo extends BaseDuxo3<AmountInputDataState, AmountInputViewState, AmountInputEvent> implements HasSavedState {
    public static final String CURRENCY_PAIR_USDSGD = "USDSGD";
    private final BffMoneyMovementService bffMoneyMovementService;

    /* renamed from: disclosureService$delegate, reason: from kotlin metadata */
    private final Lazy disclosureService;
    private final EventLogger eventLogger;
    private final McwFxRatesProvider fxRatesProvider;
    private final MicrogramManager microgramManager;
    private final SavedStateHandle savedStateHandle;
    private final TransfersBonfireApi transfersBonfireApi;

    /* renamed from: validationService$delegate, reason: from kotlin metadata */
    private final Lazy validationService;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final KeyEventConsumer inputKeyEventConsumer = new KeyEventConsumer(new BigDecimal("1E9"), true);

    /* compiled from: AmountInputDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.international.ui.amountinput.AmountInputDuxo", m3645f = "AmountInputDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE}, m3647m = "fetchWireServiceFee")
    /* renamed from: com.robinhood.android.transfers.international.ui.amountinput.AmountInputDuxo$fetchWireServiceFee$1 */
    static final class C303441 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C303441(Continuation<? super C303441> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AmountInputDuxo.this.fetchWireServiceFee(this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AmountInputDuxo(BffMoneyMovementService bffMoneyMovementService, EventLogger eventLogger, McwFxRatesProvider fxRatesProvider, MicrogramManager microgramManager, TransfersBonfireApi transfersBonfireApi, AmountInputStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(fxRatesProvider, "fxRatesProvider");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        AmountInputDataState.Companion companion = AmountInputDataState.INSTANCE;
        Companion companion2 = INSTANCE;
        super(companion.initial(((AmountInputFragment.Args) companion2.getArgs(savedStateHandle)).getSourceAccount(), ((AmountInputFragment.Args) companion2.getArgs(savedStateHandle)).getSinkAccount(), ((AmountInputFragment.Args) companion2.getArgs(savedStateHandle)).getTransferType()), stateProvider, duxoBundle);
        this.bffMoneyMovementService = bffMoneyMovementService;
        this.eventLogger = eventLogger;
        this.fxRatesProvider = fxRatesProvider;
        this.microgramManager = microgramManager;
        this.transfersBonfireApi = transfersBonfireApi;
        this.savedStateHandle = savedStateHandle;
        this.disclosureService = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.international.ui.amountinput.AmountInputDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AmountInputDuxo.disclosureService_delegate$lambda$0(this.f$0);
            }
        });
        this.validationService = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.international.ui.amountinput.AmountInputDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AmountInputDuxo.validationService_delegate$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TransferDisclosureManagedService getDisclosureService() {
        return (TransferDisclosureManagedService) this.disclosureService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransferDisclosureManagedService disclosureService_delegate$lambda$0(AmountInputDuxo amountInputDuxo) {
        return (TransferDisclosureManagedService) MicrogramManager.DefaultImpls.m16549getInstancemoChb0s$default(amountInputDuxo.microgramManager, amountInputDuxo.getLifecycleScope(), new MicrogramLaunchId(new RemoteMicrogramApplication(DisclosureComposable3.DISCLOSURES_APP_ID, null, 2, null), null, 2, null), null, 4, null).getComponent().getServiceLocator().getClient(TransferDisclosureManagedService.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ValidationService getValidationService() {
        return (ValidationService) this.validationService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ValidationService validationService_delegate$lambda$1(AmountInputDuxo amountInputDuxo) {
        return (ValidationService) MicrogramManager.DefaultImpls.m16549getInstancemoChb0s$default(amountInputDuxo.microgramManager, amountInputDuxo.getLifecycleScope(), new MicrogramLaunchId(new RemoteMicrogramApplication("app-transfer-validation", null, 2, null), null, 2, null), null, 4, null).getComponent().getServiceLocator().getClient(ValidationService.class);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        if (((AmountInputFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getTransferType() == TransferType.WIRE) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C303451(null), 3, null);
        }
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C303462(null), 3, null);
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C303473(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C303484(null), 3, null);
    }

    /* compiled from: AmountInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.international.ui.amountinput.AmountInputDuxo$onStart$1", m3645f = "AmountInputDuxo.kt", m3646l = {107}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.international.ui.amountinput.AmountInputDuxo$onStart$1 */
    static final class C303451 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C303451(Continuation<? super C303451> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AmountInputDuxo.this.new C303451(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C303451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AmountInputDuxo amountInputDuxo = AmountInputDuxo.this;
                this.label = 1;
                if (amountInputDuxo.fetchWireServiceFee(this) == coroutine_suspended) {
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

    /* compiled from: AmountInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.international.ui.amountinput.AmountInputDuxo$onStart$2", m3645f = "AmountInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.international.ui.amountinput.AmountInputDuxo$onStart$2 */
    static final class C303462 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C303462(Continuation<? super C303462> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AmountInputDuxo.this.new C303462(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C303462) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                AmountInputDuxo.this.fetchTransferSummary();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: AmountInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.international.ui.amountinput.AmountInputDuxo$onStart$3", m3645f = "AmountInputDuxo.kt", m3646l = {117}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.international.ui.amountinput.AmountInputDuxo$onStart$3 */
    static final class C303473 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C303473(Continuation<? super C303473> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AmountInputDuxo.this.new C303473(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C303473) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<List<McwFxRate>> flowStreamFxRates = AmountInputDuxo.this.fxRatesProvider.streamFxRates(CollectionsKt.listOf(AmountInputDuxo.CURRENCY_PAIR_USDSGD));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AmountInputDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamFxRates, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: AmountInputDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "", "Lcom/robinhood/models/fx/db/McwFxRate;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.international.ui.amountinput.AmountInputDuxo$onStart$3$1", m3645f = "AmountInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.international.ui.amountinput.AmountInputDuxo$onStart$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<List<? extends McwFxRate>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AmountInputDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AmountInputDuxo amountInputDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = amountInputDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends McwFxRate> list, Continuation<? super Unit> continuation) {
                return invoke2((List<McwFxRate>) list, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<McwFxRate> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: AmountInputDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.international.ui.amountinput.AmountInputDuxo$onStart$3$1$1", m3645f = "AmountInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.transfers.international.ui.amountinput.AmountInputDuxo$onStart$3$1$1, reason: invalid class name and collision with other inner class name */
            static final class C506041 extends ContinuationImpl7 implements Function2<AmountInputDataState, Continuation<? super AmountInputDataState>, Object> {
                final /* synthetic */ List<McwFxRate> $response;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C506041(List<McwFxRate> list, Continuation<? super C506041> continuation) {
                    super(2, continuation);
                    this.$response = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C506041 c506041 = new C506041(this.$response, continuation);
                    c506041.L$0 = obj;
                    return c506041;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AmountInputDataState amountInputDataState, Continuation<? super AmountInputDataState> continuation) {
                    return ((C506041) create(amountInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object next;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    AmountInputDataState amountInputDataState = (AmountInputDataState) this.L$0;
                    Iterator<T> it = this.$response.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (Intrinsics.areEqual(((McwFxRate) next).getSymbol(), AmountInputDuxo.CURRENCY_PAIR_USDSGD)) {
                            break;
                        }
                    }
                    return AmountInputDataState.copy$default(amountInputDataState, null, null, null, null, null, null, null, null, (McwFxRate) next, false, 767, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C506041((List) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: AmountInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.international.ui.amountinput.AmountInputDuxo$onStart$4", m3645f = "AmountInputDuxo.kt", m3646l = {125}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.international.ui.amountinput.AmountInputDuxo$onStart$4 */
    static final class C303484 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C303484(Continuation<? super C303484> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AmountInputDuxo.this.new C303484(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C303484) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TransferDisclosureManagedService disclosureService = AmountInputDuxo.this.getDisclosureService();
                com.ionspin.kotlin.bignum.decimal.BigDecimal zero = com.ionspin.kotlin.bignum.decimal.BigDecimal.INSTANCE.getZERO();
                Companion companion = AmountInputDuxo.INSTANCE;
                CreateTransferState createTransferState = new CreateTransferState(zero, MultiCurrencyAccount2.toMgTransferAccount(((AmountInputFragment.Args) companion.getArgs((HasSavedState) AmountInputDuxo.this)).getSourceAccount()), MultiCurrencyAccount2.toMgTransferAccount(((AmountInputFragment.Args) companion.getArgs((HasSavedState) AmountInputDuxo.this)).getSinkAccount()), CreateTransferState6.ONCE, (CreateTransferState.ApiTransferAdditionalData) null, ((AmountInputFragment.Args) companion.getArgs((HasSavedState) AmountInputDuxo.this)).getSourceAccount().getCurrency().getCurrencyCode(), TransferType3.toMgTransferType(((AmountInputFragment.Args) companion.getArgs((HasSavedState) AmountInputDuxo.this)).getTransferType()), TransferMode.EDIT, (ServiceFeeParams) null, (TransferEntryPoint) null, 16, (DefaultConstructorMarker) null);
                this.label = 1;
                if (disclosureService.updateDisclosure(createTransferState, this) == coroutine_suspended) {
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

    /* compiled from: AmountInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.international.ui.amountinput.AmountInputDuxo$consumeKeyEvent$1", m3645f = "AmountInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.international.ui.amountinput.AmountInputDuxo$consumeKeyEvent$1 */
    static final class C303411 extends ContinuationImpl7 implements Function2<AmountInputDataState, Continuation<? super AmountInputDataState>, Object> {
        final /* synthetic */ KeyEvent $keyEvent;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AmountInputDuxo this$0;

        /* compiled from: AmountInputDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.transfers.international.ui.amountinput.AmountInputDuxo$consumeKeyEvent$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AmountInputDataState.InputType.values().length];
                try {
                    iArr[AmountInputDataState.InputType.SOURCE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AmountInputDataState.InputType.SINK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C303411(KeyEvent keyEvent, AmountInputDuxo amountInputDuxo, Continuation<? super C303411> continuation) {
            super(2, continuation);
            this.$keyEvent = keyEvent;
            this.this$0 = amountInputDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C303411 c303411 = new C303411(this.$keyEvent, this.this$0, continuation);
            c303411.L$0 = obj;
            return c303411;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AmountInputDataState amountInputDataState, Continuation<? super AmountInputDataState> continuation) {
            return ((C303411) create(amountInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            AmountInputDataState.InputState sourceInputState;
            McwFxRate fxRate;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AmountInputDataState amountInputDataState = (AmountInputDataState) this.L$0;
            AmountInputDataState.InputType selectedInputType = amountInputDataState.getSelectedInputType();
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i = iArr[selectedInputType.ordinal()];
            if (i == 1) {
                sourceInputState = amountInputDataState.getSourceInputState();
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                sourceInputState = amountInputDataState.getSinkInputState();
                if (sourceInputState == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            KeyEventConsumer keyEventConsumer = AmountInputDuxo.inputKeyEventConsumer;
            BigDecimal decimalValue = sourceInputState.getAmount().getDecimalValue();
            char[] charArray = sourceInputState.getFormattedDecimalValue().toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
            KeyEventConsumer.InputState inputStateConsume = keyEventConsumer.consume(new KeyEventConsumer.InputState(decimalValue, charArray), this.$keyEvent);
            AmountInputDataState.InputState inputStateCopy = null;
            AmountInputDataState.InputState inputStateCopy2 = sourceInputState.copy(Money.copy$default(sourceInputState.getAmount(), null, inputStateConsume.getValue(), 1, null), new String(inputStateConsume.getChars()));
            BigDecimal effectiveExchangeRate = (!amountInputDataState.isFxEnabled() || (fxRate = amountInputDataState.getFxRate()) == null) ? null : McwFxRateExtensions.getEffectiveExchangeRate(fxRate, amountInputDataState.getSourceAccount().getCurrency(), amountInputDataState.getSinkAccount().getCurrency());
            if (amountInputDataState.isFxEnabled() && effectiveExchangeRate == null) {
                this.this$0.showGenericError();
                return amountInputDataState;
            }
            int i2 = iArr[amountInputDataState.getSelectedInputType().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                BigDecimal bigDecimalSafeDivide = BigDecimals7.safeDivide(inputStateCopy2.getAmount().getDecimalValue(), effectiveExchangeRate);
                AmountInputDataState.InputState sourceInputState2 = amountInputDataState.getSourceInputState();
                Money moneyCopy$default = Money.copy$default(amountInputDataState.getSourceInputState().getAmount(), null, bigDecimalSafeDivide, 1, null);
                String str = KeyEventConsumer.INSTANCE.getFORMATTER$feature_international_transfers_externalDebug().format(bigDecimalSafeDivide);
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                return AmountInputDataState.copy$default(amountInputDataState, null, null, null, null, sourceInputState2.copy(moneyCopy$default, str), inputStateCopy2, null, null, null, false, 975, null);
            }
            if (amountInputDataState.isFxEnabled()) {
                AmountInputDataState.InputState sinkInputState = amountInputDataState.getSinkInputState();
                if (sinkInputState == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                BigDecimal bigDecimalSafeMultiply = BigDecimals7.safeMultiply(inputStateCopy2.getAmount().getDecimalValue(), effectiveExchangeRate);
                Money moneyCopy$default2 = Money.copy$default(sinkInputState.getAmount(), null, bigDecimalSafeMultiply, 1, null);
                String str2 = KeyEventConsumer.INSTANCE.getFORMATTER$feature_international_transfers_externalDebug().format(bigDecimalSafeMultiply);
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                inputStateCopy = sinkInputState.copy(moneyCopy$default2, str2);
            }
            return AmountInputDataState.copy$default(amountInputDataState, null, null, null, null, inputStateCopy2, inputStateCopy, null, null, null, false, 975, null);
        }
    }

    public final void consumeKeyEvent(KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        applyMutation(new C303411(keyEvent, this, null));
    }

    public final void continueButtonClicked(final Screen eventScreen, final Context eventContext) {
        Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
        Intrinsics.checkNotNullParameter(eventContext, "eventContext");
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.international.ui.amountinput.AmountInputDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AmountInputDuxo.continueButtonClicked$lambda$2(this.f$0, eventContext, eventScreen, (AmountInputDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit continueButtonClicked$lambda$2(AmountInputDuxo amountInputDuxo, Context context, Screen screen, AmountInputDataState state) {
        MAXTransferContext mAXTransferContextCopy;
        Intrinsics.checkNotNullParameter(state, "state");
        EventLogger eventLogger = amountInputDuxo.eventLogger;
        MAXTransferContext max_transfer_context = context.getMax_transfer_context();
        if (max_transfer_context != null) {
            mAXTransferContextCopy = max_transfer_context.copy((377169 & 1) != 0 ? max_transfer_context.id : null, (377169 & 2) != 0 ? max_transfer_context.amount : Moneys3.toRosettaMoney(state.getSourceInputState().getAmount()), (377169 & 4) != 0 ? max_transfer_context.source_account : null, (377169 & 8) != 0 ? max_transfer_context.sink_account : null, (377169 & 16) != 0 ? max_transfer_context.frequency : null, (377169 & 32) != 0 ? max_transfer_context.ira_contribution_data : null, (377169 & 64) != 0 ? max_transfer_context.entry_point : null, (377169 & 128) != 0 ? max_transfer_context.ira_distribution_data : null, (377169 & 256) != 0 ? max_transfer_context.session_id : null, (377169 & 512) != 0 ? max_transfer_context.ach_transfer_data : null, (377169 & 1024) != 0 ? max_transfer_context.deposit_suggestions : null, (377169 & 2048) != 0 ? max_transfer_context.ira_roth_conversion_data : null, (377169 & 4096) != 0 ? max_transfer_context.transfer_limit_validation_error : null, (377169 & 8192) != 0 ? max_transfer_context.currency_conversion_data : null, (377169 & 16384) != 0 ? max_transfer_context.locality : null, (377169 & 32768) != 0 ? max_transfer_context.entry_point_logging_identifier : null, (377169 & 65536) != 0 ? max_transfer_context.transfer_v2_direction : null, (377169 & 131072) != 0 ? max_transfer_context.selected_pill_amount : null, (377169 & 262144) != 0 ? max_transfer_context.transfer_method : null, (377169 & 524288) != 0 ? max_transfer_context.unknownFields() : null);
        } else {
            mAXTransferContextCopy = null;
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.CONTINUE, screen, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, Context.copy$default(context, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, mAXTransferContextCopy, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -131073, -1, -1, -1, -1, 16383, null), false, 40, null);
        BuildersKt__Builders_commonKt.launch$default(amountInputDuxo.getLifecycleScope(), null, null, new AmountInputDuxo2(amountInputDuxo, state, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void submitAmountEnteredEvent(AmountInputDataState state) {
        FxData fxData;
        Money amount = state.getSourceInputState().getAmount();
        if (state.isFxEnabled()) {
            AmountInputDataState.InputState sinkInputState = state.getSinkInputState();
            if (sinkInputState == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Money amount2 = sinkInputState.getAmount();
            McwFxRate fxRate = state.getFxRate();
            if (fxRate != null) {
                fxData = new FxData(amount2, fxRate);
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            fxData = null;
        }
        submit(new AmountInputEvent.AmountEntered(amount, fxData));
    }

    /* compiled from: AmountInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.international.ui.amountinput.AmountInputDuxo$setSelectedInput$1", m3645f = "AmountInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.international.ui.amountinput.AmountInputDuxo$setSelectedInput$1 */
    static final class C303491 extends ContinuationImpl7 implements Function2<AmountInputDataState, Continuation<? super AmountInputDataState>, Object> {
        final /* synthetic */ AmountInputDataState.InputType $inputType;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C303491(AmountInputDataState.InputType inputType, Continuation<? super C303491> continuation) {
            super(2, continuation);
            this.$inputType = inputType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C303491 c303491 = new C303491(this.$inputType, continuation);
            c303491.L$0 = obj;
            return c303491;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AmountInputDataState amountInputDataState, Continuation<? super AmountInputDataState> continuation) {
            return ((C303491) create(amountInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AmountInputDataState.copy$default((AmountInputDataState) this.L$0, null, null, null, this.$inputType, null, null, null, null, null, false, 1015, null);
        }
    }

    public final void setSelectedInput(AmountInputDataState.InputType inputType) {
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        applyMutation(new C303491(inputType, null));
    }

    public final void exchangeRateInfoClicked() {
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.international.ui.amountinput.AmountInputDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AmountInputDuxo.exchangeRateInfoClicked$lambda$3(this.f$0, (AmountInputDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit exchangeRateInfoClicked$lambda$3(AmountInputDuxo amountInputDuxo, AmountInputDataState state) {
        String exchangeRateSduiSheetId;
        Intrinsics.checkNotNullParameter(state, "state");
        McwFxRate fxRate = state.getFxRate();
        if (fxRate == null || (exchangeRateSduiSheetId = McwFxRateExtensions.getExchangeRateSduiSheetId(fxRate, state.getSourceAccount().getCurrency(), state.getSinkAccount().getCurrency())) == null) {
            return Unit.INSTANCE;
        }
        amountInputDuxo.submit(new AmountInputEvent.ShowSduiInfoSheet(new SduiInfoSheetKey(exchangeRateSduiSheetId, exchangeRateSduiSheetId, null, null, 12, null)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchWireServiceFee(Continuation<? super Unit> continuation) {
        C303441 c303441;
        Object objM28550constructorimpl;
        if (continuation instanceof C303441) {
            c303441 = (C303441) continuation;
            int i = c303441.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c303441.label = i - Integer.MIN_VALUE;
            } else {
                c303441 = new C303441(continuation);
            }
        }
        Object objGetServiceFee = c303441.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c303441.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetServiceFee);
                Result.Companion companion = Result.INSTANCE;
                BffMoneyMovementService bffMoneyMovementService = this.bffMoneyMovementService;
                GetServiceFeeRequestDto getServiceFeeRequestDto = new GetServiceFeeRequestDto(null, Currency2.toCurrencyDto(((AmountInputFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getSinkAccount().getCurrency()), DirectionDto.DIRECTION_WITHDRAW, PurposeDto.PURPOSE_I18N_WIRE_TRANSFER, null, 17, null);
                c303441.label = 1;
                objGetServiceFee = bffMoneyMovementService.GetServiceFee(getServiceFeeRequestDto, c303441);
                if (objGetServiceFee == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetServiceFee);
            }
            objM28550constructorimpl = Result.m28550constructorimpl((GetServiceFeeResponseDto) objGetServiceFee);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m28553exceptionOrNullimpl(objM28550constructorimpl) == null) {
            applyMutation(new AmountInputDuxo6((GetServiceFeeResponseDto) objM28550constructorimpl, null));
        } else {
            showGenericError();
        }
        return Unit.INSTANCE;
    }

    /* compiled from: AmountInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.international.ui.amountinput.AmountInputDuxo$fetchTransferSummary$1", m3645f = "AmountInputDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.international.ui.amountinput.AmountInputDuxo$fetchTransferSummary$1 */
    static final class C303431 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C303431(Continuation<? super C303431> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C303431 c303431 = AmountInputDuxo.this.new C303431(continuation);
            c303431.L$0 = obj;
            return c303431;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C303431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    AmountInputDuxo amountInputDuxo = AmountInputDuxo.this;
                    Result.Companion companion = Result.INSTANCE;
                    TransfersBonfireApi transfersBonfireApi = amountInputDuxo.transfersBonfireApi;
                    Companion companion2 = AmountInputDuxo.INSTANCE;
                    ApiTransferSummaryRequest apiTransferSummaryRequest = new ApiTransferSummaryRequest(MultiCurrencyAccount2.toTransferSummaryRequestAccount(((AmountInputFragment.Args) companion2.getArgs((HasSavedState) amountInputDuxo)).getSourceAccount()), MultiCurrencyAccount2.toTransferSummaryRequestAccount(((AmountInputFragment.Args) companion2.getArgs((HasSavedState) amountInputDuxo)).getSinkAccount()), null, null, null, null, null, 80, null);
                    this.label = 1;
                    obj = transfersBonfireApi.postTransferSummary(apiTransferSummaryRequest, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM28550constructorimpl = Result.m28550constructorimpl((ApiTransferSummaryResponse) obj);
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            AmountInputDuxo amountInputDuxo2 = AmountInputDuxo.this;
            if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                amountInputDuxo2.applyMutation(new AmountInputDuxo5((ApiTransferSummaryResponse) objM28550constructorimpl, null));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchTransferSummary() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C303431(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showGenericError() {
        submit(new AmountInputEvent.Error(ErrorDialog5.INSTANCE.getGenericTransferError()));
    }

    /* compiled from: AmountInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDuxo;", "Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputFragment$Args;", "<init>", "()V", "inputKeyEventConsumer", "Lcom/robinhood/android/transfers/international/ui/amountinput/KeyEventConsumer;", "CURRENCY_PAIR_USDSGD", "", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AmountInputDuxo, AmountInputFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AmountInputFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (AmountInputFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AmountInputFragment.Args getArgs(AmountInputDuxo amountInputDuxo) {
            return (AmountInputFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, amountInputDuxo);
        }
    }
}
