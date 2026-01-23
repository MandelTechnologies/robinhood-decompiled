package com.robinhood.android.transfers.international.p266ui.review;

import androidx.lifecycle.SavedStateHandle;
import bff_money_movement.service.p019v1.BffMoneyMovementService;
import bff_money_movement.service.p019v1.GetServiceFeeRequestDto;
import bff_money_movement.service.p019v1.GetServiceFeeResponseDto;
import cashier_protos.payment_intents.p047v1.DirectionDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.lib.stepupverification.SuvResult;
import com.robinhood.android.lib.stepupverification.SuvWorkflowManager;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.transfers.international.p266ui.common.DisclosureComposable3;
import com.robinhood.android.transfers.international.p266ui.model.FxData;
import com.robinhood.android.transfers.international.p266ui.model.MultiCurrencyAccount;
import com.robinhood.android.transfers.international.p266ui.model.TransferType;
import com.robinhood.android.transfers.international.p266ui.model.TransferType3;
import com.robinhood.android.transfers.international.p266ui.review.ReviewTransferEvent;
import com.robinhood.android.transfers.international.p266ui.review.ReviewTransferFragment;
import com.robinhood.android.transfers.international.p266ui.review.TransferRequestCreator;
import com.robinhood.android.transfers.international.p266ui.util.Currency2;
import com.robinhood.android.transfers.international.p266ui.util.ErrorDialog;
import com.robinhood.android.transfers.international.p266ui.util.ErrorDialog5;
import com.robinhood.android.transfers.international.p266ui.util.McwFxRateExtensions;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.GenericAlertErrorResponse;
import com.robinhood.models.api.GenericErrorResponse;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.ApiCreateTransferResponse;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.p325fx.p326db.McwFxRate;
import com.robinhood.models.p355ui.bonfire.PostTransferFlow2;
import com.robinhood.models.util.Money;
import com.robinhood.shared.common.contracts.SduiInfoSheetKey;
import com.robinhood.transfers.disclosures.contracts.TransferDisclosureManagedService;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.utils.resource.StringResource;
import java.math.RoundingMode;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import microgram.android.MicrogramLaunchId;
import microgram.android.RemoteMicrogramApplication;
import retrofit2.Response;

/* compiled from: ReviewTransferDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 42\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u00014BQ\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\"\u001a\u00020#H\u0016J\u0006\u0010$\u001a\u00020#J\u0006\u0010%\u001a\u00020#J\u001e\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0082@¢\u0006\u0002\u0010+J\u0016\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020.H\u0082@¢\u0006\u0002\u0010/J\u0016\u00100\u001a\u00020\u00042\f\u00101\u001a\b\u0012\u0004\u0012\u00020302H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferDataState;", "Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferViewState;", "Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "bffMoneyMovementService", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "transferRequestCreator", "Lcom/robinhood/android/transfers/international/ui/review/TransferRequestCreator;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "suvWorkflowManager", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "stateProvider", "Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lbff_money_movement/service/v1/BffMoneyMovementService;Lcom/robinhood/android/microgramsdui/MicrogramManager;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/android/transfers/international/ui/review/TransferRequestCreator;Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "disclosureService", "Lcom/robinhood/transfers/disclosures/contracts/TransferDisclosureManagedService;", "getDisclosureService", "()Lcom/robinhood/transfers/disclosures/contracts/TransferDisclosureManagedService;", "disclosureService$delegate", "Lkotlin/Lazy;", "onStart", "", "submitTransfer", "showExchangeRateInfoSheet", "fetchServiceFee", "amount", "Lcom/robinhood/models/util/Money;", "transferType", "Lcom/robinhood/android/transfers/international/ui/model/TransferType;", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/android/transfers/international/ui/model/TransferType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createTransferAndSubmitResultEvent", "transferRequest", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest;", "(Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleErrorResponse", "result", "Lretrofit2/Response;", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferResponse;", "Companion", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class ReviewTransferDuxo extends BaseDuxo3<ReviewTransferDataState, ReviewTransferViewState, ReviewTransferEvent> implements HasSavedState {
    private final BffMoneyMovementService bffMoneyMovementService;

    /* renamed from: disclosureService$delegate, reason: from kotlin metadata */
    private final Lazy disclosureService;
    private final MicrogramManager microgramManager;
    private final LazyMoshi moshi;
    private final SavedStateHandle savedStateHandle;
    private final SuvWorkflowManager suvWorkflowManager;
    private final TransferRequestCreator transferRequestCreator;
    private final TransfersBonfireApi transfersBonfireApi;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ReviewTransferDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.international.ui.review.ReviewTransferDuxo", m3645f = "ReviewTransferDuxo.kt", m3646l = {182}, m3647m = "createTransferAndSubmitResultEvent")
    /* renamed from: com.robinhood.android.transfers.international.ui.review.ReviewTransferDuxo$createTransferAndSubmitResultEvent$1 */
    static final class C303781 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C303781(Continuation<? super C303781> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReviewTransferDuxo.this.createTransferAndSubmitResultEvent(null, this);
        }
    }

    /* compiled from: ReviewTransferDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.international.ui.review.ReviewTransferDuxo", m3645f = "ReviewTransferDuxo.kt", m3646l = {155}, m3647m = "fetchServiceFee")
    /* renamed from: com.robinhood.android.transfers.international.ui.review.ReviewTransferDuxo$fetchServiceFee$1 */
    static final class C303791 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C303791(Continuation<? super C303791> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReviewTransferDuxo.this.fetchServiceFee(null, null, this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ReviewTransferDuxo(BffMoneyMovementService bffMoneyMovementService, MicrogramManager microgramManager, LazyMoshi moshi, TransferRequestCreator transferRequestCreator, TransfersBonfireApi transfersBonfireApi, SuvWorkflowManager suvWorkflowManager, ReviewTransferStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(transferRequestCreator, "transferRequestCreator");
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new ReviewTransferDataState(((ReviewTransferFragment.Args) companion.getArgs(savedStateHandle)).getAmount(), ((ReviewTransferFragment.Args) companion.getArgs(savedStateHandle)).getTransferType(), ((ReviewTransferFragment.Args) companion.getArgs(savedStateHandle)).getSourceAccount(), ((ReviewTransferFragment.Args) companion.getArgs(savedStateHandle)).getSinkAccount(), ((ReviewTransferFragment.Args) companion.getArgs(savedStateHandle)).getMemo(), null, ((ReviewTransferFragment.Args) companion.getArgs(savedStateHandle)).getFxData(), false, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, null), stateProvider, duxoBundle);
        this.bffMoneyMovementService = bffMoneyMovementService;
        this.microgramManager = microgramManager;
        this.moshi = moshi;
        this.transferRequestCreator = transferRequestCreator;
        this.transfersBonfireApi = transfersBonfireApi;
        this.suvWorkflowManager = suvWorkflowManager;
        this.savedStateHandle = savedStateHandle;
        this.disclosureService = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.international.ui.review.ReviewTransferDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReviewTransferDuxo.disclosureService_delegate$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TransferDisclosureManagedService getDisclosureService() {
        return (TransferDisclosureManagedService) this.disclosureService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransferDisclosureManagedService disclosureService_delegate$lambda$0(ReviewTransferDuxo reviewTransferDuxo) {
        return (TransferDisclosureManagedService) MicrogramManager.DefaultImpls.m16549getInstancemoChb0s$default(reviewTransferDuxo.microgramManager, reviewTransferDuxo.getLifecycleScope(), new MicrogramLaunchId(new RemoteMicrogramApplication(DisclosureComposable3.DISCLOSURES_APP_ID, null, 2, null), null, 2, null), null, 4, null).getComponent().getServiceLocator().getClient(TransferDisclosureManagedService.class);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.international.ui.review.ReviewTransferDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReviewTransferDuxo.onStart$lambda$1(this.f$0, (ReviewTransferDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(ReviewTransferDuxo reviewTransferDuxo, ReviewTransferDataState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (TransferType3.getHasServiceFee(state.getTransferType())) {
            BuildersKt__Builders_commonKt.launch$default(reviewTransferDuxo.getLifecycleScope(), null, null, new ReviewTransferDuxo4(reviewTransferDuxo, state, null), 3, null);
        }
        BuildersKt__Builders_commonKt.launch$default(reviewTransferDuxo.getLifecycleScope(), null, null, new ReviewTransferDuxo5(reviewTransferDuxo, state, null), 3, null);
        return Unit.INSTANCE;
    }

    public final void submitTransfer() {
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.international.ui.review.ReviewTransferDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReviewTransferDuxo.submitTransfer$lambda$2(this.f$0, (ReviewTransferDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitTransfer$lambda$2(ReviewTransferDuxo reviewTransferDuxo, ReviewTransferDataState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        MultiCurrencyAccount sourceAccount = state.getSourceAccount();
        Intrinsics.checkNotNull(sourceAccount, "null cannot be cast to non-null type com.robinhood.android.transfers.international.ui.model.MultiCurrencyAccount.Internal");
        MultiCurrencyAccount sinkAccount = state.getSinkAccount();
        Intrinsics.checkNotNull(sinkAccount, "null cannot be cast to non-null type com.robinhood.android.transfers.international.ui.model.MultiCurrencyAccount.External");
        TransferRequestCreator transferRequestCreator = reviewTransferDuxo.transferRequestCreator;
        Money amount = state.getAmount();
        TransferType transferType = state.getTransferType();
        String accountNumber = ((MultiCurrencyAccount.Internal) sourceAccount).getAccountNumber();
        String string2 = ((MultiCurrencyAccount.External) sinkAccount).getInstrument().getInstrumentId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        BuildersKt__Builders_commonKt.launch$default(reviewTransferDuxo.getLifecycleScope(), null, null, new ReviewTransferDuxo6(reviewTransferDuxo, transferRequestCreator.createTransferRequest(new TransferRequestCreator.TransferData(amount, TransferDirection.WITHDRAW, transferType, accountNumber, string2, state.getMemo(), state.getFxData(), state.getServiceFeeResponse())), null), 3, null);
        return Unit.INSTANCE;
    }

    public final void showExchangeRateInfoSheet() {
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.international.ui.review.ReviewTransferDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReviewTransferDuxo.showExchangeRateInfoSheet$lambda$3(this.f$0, (ReviewTransferDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showExchangeRateInfoSheet$lambda$3(ReviewTransferDuxo reviewTransferDuxo, ReviewTransferDataState state) {
        McwFxRate fxRate;
        String exchangeRateSduiSheetId;
        Intrinsics.checkNotNullParameter(state, "state");
        FxData fxData = state.getFxData();
        if (fxData == null || (fxRate = fxData.getFxRate()) == null || (exchangeRateSduiSheetId = McwFxRateExtensions.getExchangeRateSduiSheetId(fxRate, state.getSourceAccount().getCurrency(), state.getSinkAccount().getCurrency())) == null) {
            return Unit.INSTANCE;
        }
        reviewTransferDuxo.submit(new ReviewTransferEvent.ShowSduiInfoSheet(new SduiInfoSheetKey(exchangeRateSduiSheetId, exchangeRateSduiSheetId, null, null, 12, null)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchServiceFee(Money money, TransferType transferType, Continuation<? super Unit> continuation) {
        C303791 c303791;
        Object objM28550constructorimpl;
        if (continuation instanceof C303791) {
            c303791 = (C303791) continuation;
            int i = c303791.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c303791.label = i - Integer.MIN_VALUE;
            } else {
                c303791 = new C303791(continuation);
            }
        }
        Object objGetServiceFee = c303791.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c303791.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetServiceFee);
                Result.Companion companion = Result.INSTANCE;
                BffMoneyMovementService bffMoneyMovementService = this.bffMoneyMovementService;
                GetServiceFeeRequestDto getServiceFeeRequestDto = new GetServiceFeeRequestDto(money.getDecimalValue().setScale(2, RoundingMode.HALF_EVEN).toPlainString(), Currency2.toCurrencyDto(money.getCurrency()), DirectionDto.DIRECTION_WITHDRAW, TransferType3.toPurposeDto(transferType), null, 16, null);
                c303791.label = 1;
                objGetServiceFee = bffMoneyMovementService.GetServiceFee(getServiceFeeRequestDto, c303791);
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
            applyMutation(new ReviewTransferDuxo3((GetServiceFeeResponseDto) objM28550constructorimpl, null));
        } else {
            submit(new ReviewTransferEvent.Error(ErrorDialog5.INSTANCE.getGenericTransferError()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createTransferAndSubmitResultEvent(ApiCreateTransferRequest apiCreateTransferRequest, Continuation<? super Unit> continuation) {
        C303781 c303781;
        ReviewTransferEvent error;
        if (continuation instanceof C303781) {
            c303781 = (C303781) continuation;
            int i = c303781.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c303781.label = i - Integer.MIN_VALUE;
            } else {
                c303781 = new C303781(continuation);
            }
        }
        Object objHandleRequest = c303781.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c303781.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objHandleRequest);
            SuvWorkflowManager suvWorkflowManager = this.suvWorkflowManager;
            ReviewTransferDuxo2 reviewTransferDuxo2 = new ReviewTransferDuxo2(this, apiCreateTransferRequest, null);
            c303781.label = 1;
            objHandleRequest = suvWorkflowManager.handleRequest(reviewTransferDuxo2, c303781);
            if (objHandleRequest == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objHandleRequest);
        }
        SuvResult suvResult = (SuvResult) objHandleRequest;
        if (suvResult instanceof SuvResult.Success) {
            SuvResult.Success success = (SuvResult.Success) suvResult;
            if (((Response) success.getValue()).isSuccessful()) {
                Object objBody = ((Response) success.getValue()).body();
                if (objBody == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                error = new ReviewTransferEvent.TransferCreated(PostTransferFlow2.toUiModel((ApiCreateTransferResponse) objBody, ApiTransferAccount.TransferAccountType.I18N_BANK_ACCOUNT));
            } else {
                error = handleErrorResponse((Response) success.getValue());
            }
        } else if (suvResult instanceof SuvResult.VerificationRequired) {
            SuvResult.VerificationRequired verificationRequired = (SuvResult.VerificationRequired) suvResult;
            error = new ReviewTransferEvent.VerificationRequired(verificationRequired.getWorkflowId(), verificationRequired.isMigrated());
        } else {
            if (!(suvResult instanceof SuvResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            error = new ReviewTransferEvent.Error(ErrorDialog5.INSTANCE.getGenericTransferError());
        }
        submit(error);
        return Unit.INSTANCE;
    }

    private final ReviewTransferEvent handleErrorResponse(Response<ApiCreateTransferResponse> result) {
        ErrorResponse errorResponse = null;
        try {
            String strExtractErrorBodyString = NetworkThrowables.extractErrorBodyString(result);
            if (strExtractErrorBodyString != null) {
                LazyMoshi lazyMoshi = this.moshi;
                Types types = Types.INSTANCE;
                errorResponse = (ErrorResponse) lazyMoshi.adapter(new TypeToken<ErrorResponse>() { // from class: com.robinhood.android.transfers.international.ui.review.ReviewTransferDuxo$handleErrorResponse$lambda$7$$inlined$getAdapter$1
                }.getType()).fromJson(strExtractErrorBodyString);
            }
        } catch (Throwable unused) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Malformed transfer creation error response"), false, null, 6, null);
        }
        if (errorResponse instanceof GenericAlertErrorResponse) {
            return new ReviewTransferEvent.SduiError(((GenericAlertErrorResponse) errorResponse).getAlert());
        }
        if (errorResponse instanceof GenericErrorResponse) {
            String error_message = ((GenericErrorResponse) errorResponse).getError_message();
            if (error_message != null) {
                StringResource.Companion companion = StringResource.INSTANCE;
                return new ReviewTransferEvent.Error(new ErrorDialog(companion.invoke(C11048R.string.general_error_title, new Object[0]), companion.invoke(error_message), ErrorDialog.DismissAction.FINISH));
            }
            return new ReviewTransferEvent.Error(ErrorDialog5.INSTANCE.getGenericTransferError());
        }
        return new ReviewTransferEvent.Error(ErrorDialog5.INSTANCE.getGenericTransferError());
    }

    /* compiled from: ReviewTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferDuxo;", "Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferFragment$Args;", "<init>", "()V", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<ReviewTransferDuxo, ReviewTransferFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ReviewTransferFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (ReviewTransferFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ReviewTransferFragment.Args getArgs(ReviewTransferDuxo reviewTransferDuxo) {
            return (ReviewTransferFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, reviewTransferDuxo);
        }
    }
}
