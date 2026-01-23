package com.robinhood.android.transfers.p271ui.max;

import com.robinhood.android.transfers.p271ui.TransfersRequestCreator;
import com.robinhood.android.transfers.p271ui.max.BaseCreateTransferFragment;
import com.robinhood.android.transfers.p271ui.max.ManagedValidationResult;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.store.stripe.StripeStore;
import com.robinhood.udf.UiEvent;
import io.reactivex.Observable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: CreateTransferDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onContinueClick$1$2", m3645f = "CreateTransferDuxo.kt", m3646l = {1262, 2480, 1299, 1314}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes9.dex */
final class CreateTransferDuxo$onContinueClick$1$2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $skipPreCreate;
    final /* synthetic */ CreateTransferViewState $this_applyMutation;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;
    final /* synthetic */ CreateTransferDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateTransferDuxo$onContinueClick$1$2(CreateTransferDuxo createTransferDuxo, CreateTransferViewState createTransferViewState, boolean z, Continuation<? super CreateTransferDuxo$onContinueClick$1$2> continuation) {
        super(2, continuation);
        this.this$0 = createTransferDuxo;
        this.$this_applyMutation = createTransferViewState;
        this.$skipPreCreate = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState invokeSuspend$lambda$5$lambda$3(CreateTransferViewState createTransferViewState, CreateTransferViewState createTransferViewState2) {
        return createTransferViewState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateTransferDuxo$onContinueClick$1$2(this.this$0, this.$this_applyMutation, this.$skipPreCreate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreateTransferDuxo$onContinueClick$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c1, code lost:
    
        if (r2 == r1) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d5 A[Catch: StripeException -> 0x010a, TRY_ENTER, TryCatch #0 {StripeException -> 0x010a, blocks: (B:13:0x0044, B:46:0x0107, B:39:0x00d5, B:41:0x00e9, B:43:0x00f6, B:42:0x00ec), top: B:70:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0213  */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Boolean bool;
        TransfersRequestCreator.Result result;
        CreateTransferDuxo createTransferDuxo;
        CreateTransferViewState createTransferViewState;
        TransferData transferData;
        Object preCreateContentState;
        boolean z;
        ApiCreateTransferRequest apiCreateTransferRequest;
        UUID uuid;
        final CreateTransferViewState createTransferViewStateCopy$default;
        Object objRunManagedValidationCheck;
        Object objAwaitFirst;
        ApiTransferAccount.TransferAccountType type2;
        Object radarSessionId;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        Object objBoxBoolean = this.label;
        if (objBoxBoolean == 0) {
            ResultKt.throwOnFailure(obj);
            CreateTransferDuxo createTransferDuxo2 = this.this$0;
            CreateTransferViewState createTransferViewState2 = this.$this_applyMutation;
            this.label = 1;
            objRunManagedValidationCheck = CreateTransferDuxoKt.runManagedValidationCheck(createTransferDuxo2, createTransferViewState2, true, this);
            if (objRunManagedValidationCheck != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (objBoxBoolean != 1) {
            if (objBoxBoolean == 2) {
                ResultKt.throwOnFailure(obj);
                objAwaitFirst = obj;
                objBoxBoolean = (Boolean) objAwaitFirst;
                if (this.$this_applyMutation.getSourceAccount().getType() == ApiTransferAccount.TransferAccountType.DEBIT_CARD) {
                    if (((BaseCreateTransferFragment.Args) CreateTransferDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getTransferConfiguration().getUseQueuedDepositMode()) {
                        type2 = ApiTransferAccount.TransferAccountType.RHS;
                    } else {
                        type2 = this.$this_applyMutation.getSinkAccount().getType();
                    }
                    StripeStore stripeStore = this.this$0.stripeStore;
                    this.L$0 = objBoxBoolean;
                    this.label = 3;
                    radarSessionId = stripeStore.getRadarSessionId(type2, this);
                    objBoxBoolean = objBoxBoolean;
                    if (radarSessionId == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str = (String) radarSessionId;
                    bool = objBoxBoolean;
                    CreateTransferDuxo createTransferDuxo3 = this.this$0;
                    createTransferDuxo3.currentRequest = this.$this_applyMutation.toTransfersRequest(createTransferDuxo3.refIdFactory, bool, str);
                    result = this.this$0.currentRequest;
                    if (result != null) {
                    }
                    return Unit.INSTANCE;
                }
                str = null;
                bool = objBoxBoolean;
                CreateTransferDuxo createTransferDuxo32 = this.this$0;
                createTransferDuxo32.currentRequest = this.$this_applyMutation.toTransfersRequest(createTransferDuxo32.refIdFactory, bool, str);
                result = this.this$0.currentRequest;
                if (result != null) {
                }
                return Unit.INSTANCE;
            }
            if (objBoxBoolean != 3) {
                if (objBoxBoolean != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = this.Z$0;
                transferData = (TransferData) this.L$4;
                ApiCreateTransferRequest apiCreateTransferRequest2 = (ApiCreateTransferRequest) this.L$3;
                UUID uuid2 = (UUID) this.L$2;
                createTransferViewState = (CreateTransferViewState) this.L$1;
                createTransferDuxo = (CreateTransferDuxo) this.L$0;
                ResultKt.throwOnFailure(obj);
                apiCreateTransferRequest = apiCreateTransferRequest2;
                uuid = uuid2;
                preCreateContentState = obj;
                TransferData transferData2 = transferData;
                CreateTransferDuxo createTransferDuxo4 = createTransferDuxo;
                if (z) {
                    preCreateContentState = null;
                }
                CreateTransferViewState createTransferViewState3 = (CreateTransferViewState) preCreateContentState;
                createTransferViewStateCopy$default = createTransferViewState3 != null ? CreateTransferViewState.copy$default(createTransferViewState3, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -8193, -1, 262143, null) : null;
                if (createTransferViewStateCopy$default != null) {
                    createTransferDuxo4.createTransferInternal(uuid, transferData2, apiCreateTransferRequest, createTransferViewState.getSourceAccount(), createTransferViewState.getSinkAccount(), createTransferViewState.getEntryPointIdentifier(), createTransferViewState.getRothConversionYear(), createTransferViewState.getScreenIdentifier());
                    createTransferDuxo4.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onContinueClick$1$2$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return CreateTransferDuxo$onContinueClick$1$2.invokeSuspend$lambda$5$lambda$4((CreateTransferViewState) obj2);
                        }
                    });
                } else {
                    createTransferDuxo4.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onContinueClick$1$2$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return CreateTransferDuxo$onContinueClick$1$2.invokeSuspend$lambda$5$lambda$3(createTransferViewStateCopy$default, (CreateTransferViewState) obj2);
                        }
                    });
                }
                return Unit.INSTANCE;
            }
            Boolean bool2 = (Boolean) this.L$0;
            ResultKt.throwOnFailure(obj);
            radarSessionId = obj;
            objBoxBoolean = bool2;
            str = (String) radarSessionId;
            bool = objBoxBoolean;
            CreateTransferDuxo createTransferDuxo322 = this.this$0;
            createTransferDuxo322.currentRequest = this.$this_applyMutation.toTransfersRequest(createTransferDuxo322.refIdFactory, bool, str);
            result = this.this$0.currentRequest;
            if (result != null) {
                createTransferDuxo = this.this$0;
                createTransferViewState = this.$this_applyMutation;
                boolean z2 = this.$skipPreCreate;
                UUID refId = result.getRefId();
                ApiCreateTransferRequest apiCreateTransferRequest3 = result.getApiCreateTransferRequest();
                transferData = result.getTransferData();
                this.L$0 = createTransferDuxo;
                this.L$1 = createTransferViewState;
                this.L$2 = refId;
                this.L$3 = apiCreateTransferRequest3;
                this.L$4 = transferData;
                this.Z$0 = z2;
                this.label = 4;
                preCreateContentState = createTransferDuxo.getPreCreateContentState(createTransferViewState, apiCreateTransferRequest3, this);
                if (preCreateContentState != coroutine_suspended) {
                    z = z2;
                    apiCreateTransferRequest = apiCreateTransferRequest3;
                    uuid = refId;
                    TransferData transferData22 = transferData;
                    CreateTransferDuxo createTransferDuxo42 = createTransferDuxo;
                    if (z) {
                    }
                    CreateTransferViewState createTransferViewState32 = (CreateTransferViewState) preCreateContentState;
                    if (createTransferViewState32 != null) {
                    }
                    if (createTransferViewStateCopy$default != null) {
                    }
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        objRunManagedValidationCheck = obj;
        final ManagedValidationResult managedValidationResult = (ManagedValidationResult) objRunManagedValidationCheck;
        if (managedValidationResult instanceof ManagedValidationResult.ValidationErrorsWereDisplayed) {
            return Unit.INSTANCE;
        }
        if (managedValidationResult instanceof ManagedValidationResult.ExceptionOccuredDuringValidation) {
            this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onContinueClick$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return CreateTransferDuxo$onContinueClick$1$2.invokeSuspend$lambda$0(managedValidationResult, (CreateTransferViewState) obj2);
                }
            });
            return Unit.INSTANCE;
        }
        if (!(managedValidationResult instanceof ManagedValidationResult.Continue)) {
            throw new NoWhenBranchMatchedException();
        }
        this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onContinueClick$1$2$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return CreateTransferDuxo$onContinueClick$1$2.invokeSuspend$lambda$1((CreateTransferViewState) obj2);
            }
        });
        if (this.$this_applyMutation.getSinkAccount().getType().isIra()) {
            objBoxBoolean = boxing.boxBoolean(false);
            if (this.$this_applyMutation.getSourceAccount().getType() == ApiTransferAccount.TransferAccountType.DEBIT_CARD) {
            }
            str = null;
            bool = objBoxBoolean;
            CreateTransferDuxo createTransferDuxo3222 = this.this$0;
            createTransferDuxo3222.currentRequest = this.$this_applyMutation.toTransfersRequest(createTransferDuxo3222.refIdFactory, bool, str);
            result = this.this$0.currentRequest;
            if (result != null) {
            }
            return Unit.INSTANCE;
        }
        Observable observableStreamState$default = ExperimentsProvider.DefaultImpls.streamState$default(this.this$0.experimentsStore, new Experiment[]{Experiment.INSTANT_INFO_DELIVERY_REVAMP.INSTANCE}, false, null, 6, null);
        this.label = 2;
        objAwaitFirst = RxAwait3.awaitFirst(observableStreamState$default, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState invokeSuspend$lambda$0(ManagedValidationResult managedValidationResult, CreateTransferViewState createTransferViewState) {
        return CreateTransferViewState.copy$default(createTransferViewState, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, new UiEvent(((ManagedValidationResult.ExceptionOccuredDuringValidation) managedValidationResult).getE()), false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1, -1073741825, 262143, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState invokeSuspend$lambda$1(CreateTransferViewState createTransferViewState) {
        return CreateTransferViewState.copy$default(createTransferViewState, null, null, null, null, null, null, null, null, false, null, false, null, null, true, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -8193, -1, 262143, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState invokeSuspend$lambda$5$lambda$4(CreateTransferViewState createTransferViewState) {
        return CreateTransferViewState.copy$default(createTransferViewState, null, null, null, null, null, null, null, null, false, null, false, null, null, true, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -8193, -134217729, 262143, null);
    }
}
