package com.robinhood.android.internalassettransfers.review;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.internalassettransfers.accountselection.UiIatAccount;
import com.robinhood.android.internalassettransfers.presubmissionwarn.PreSubmitWarningsCheckUseCase;
import com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewEvent;
import com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewFragment;
import com.robinhood.android.internalassettransfers.review.models.UiAssets;
import com.robinhood.android.internalassettransfers.review.models.UiEligibleAsset;
import com.robinhood.android.lib.stepupverification.SuvWorkflowManager;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.utils.extensions.Throwables;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import nimbus.service.p511v1.CreateAssetTransferRequestDto;
import nimbus.service.p511v1.CreateAssetTransferResponseDto;
import nimbus.service.p511v1.NimbusService;
import nimbus.service.p511v1.TransferAccountInfoDto;

/* compiled from: InternalAssetTransferReviewDuxo.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 $2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001$B9\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001aJ \u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!H\u0002J\u0006\u0010\"\u001a\u00020\u001aJ\u0006\u0010#\u001a\u00020\u001aR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\n \u0018*\u0004\u0018\u00010\u00170\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewDataState;", "Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewViewState;", "Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "nimbusService", "Lnimbus/service/v1/NimbusService;", "preSubmitWarningsCheckUseCase", "Lcom/robinhood/android/internalassettransfers/presubmissionwarn/PreSubmitWarningsCheckUseCase;", "suvWorkflowManager", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "stateProvider", "Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lnimbus/service/v1/NimbusService;Lcom/robinhood/android/internalassettransfers/presubmissionwarn/PreSubmitWarningsCheckUseCase;Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "uuid", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "submitWithPresubmitCheck", "", "submitWithoutPresubmitCheck", "submitTransferRequest", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "assetsToTransfer", "Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;", "dismissErrorDialog", "navigateToCustomSelection", "Companion", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InternalAssetTransferReviewDuxo extends BaseDuxo3<InternalAssetTransferReviewDataState, InternalAssetTransferReviewViewState, InternalAssetTransferReviewEvent> implements HasSavedState {
    private final NimbusService nimbusService;
    private final PreSubmitWarningsCheckUseCase preSubmitWarningsCheckUseCase;
    private final SavedStateHandle savedStateHandle;
    private final SuvWorkflowManager suvWorkflowManager;
    private final UUID uuid;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InternalAssetTransferReviewDuxo(NimbusService nimbusService, PreSubmitWarningsCheckUseCase preSubmitWarningsCheckUseCase, SuvWorkflowManager suvWorkflowManager, InternalAssetTransferReviewStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(nimbusService, "nimbusService");
        Intrinsics.checkNotNullParameter(preSubmitWarningsCheckUseCase, "preSubmitWarningsCheckUseCase");
        Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new InternalAssetTransferReviewDataState(((InternalAssetTransferReviewFragment.Args) companion.getArgs(savedStateHandle)).getSourceAccount(), ((InternalAssetTransferReviewFragment.Args) companion.getArgs(savedStateHandle)).getSinkAccount(), ((InternalAssetTransferReviewFragment.Args) companion.getArgs(savedStateHandle)).getAssetsToTransfer(), ((InternalAssetTransferReviewFragment.Args) companion.getArgs(savedStateHandle)).getNonTransferableAssetsToDisplay(), false, null, null, 112, null), stateProvider, duxoBundle);
        this.nimbusService = nimbusService;
        this.preSubmitWarningsCheckUseCase = preSubmitWarningsCheckUseCase;
        this.suvWorkflowManager = suvWorkflowManager;
        this.savedStateHandle = savedStateHandle;
        this.uuid = UUID.randomUUID();
    }

    public final void submitWithPresubmitCheck() {
        withDataState(new Function1() { // from class: com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternalAssetTransferReviewDuxo.submitWithPresubmitCheck$lambda$1(this.f$0, (InternalAssetTransferReviewDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitWithPresubmitCheck$lambda$1(InternalAssetTransferReviewDuxo internalAssetTransferReviewDuxo, InternalAssetTransferReviewDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BuildersKt__Builders_commonKt.launch$default(internalAssetTransferReviewDuxo.getLifecycleScope(), new CoroutineExceptionHandler4(CoroutineExceptionHandler.INSTANCE, internalAssetTransferReviewDuxo), null, new InternalAssetTransferReviewDuxo5(internalAssetTransferReviewDuxo, it.getSourceAccount(), it.getSinkAccount(), it.getAssetsToTransfer(), null), 2, null);
        return Unit.INSTANCE;
    }

    public final void submitWithoutPresubmitCheck() {
        withDataState(new Function1() { // from class: com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternalAssetTransferReviewDuxo.submitWithoutPresubmitCheck$lambda$2(this.f$0, (InternalAssetTransferReviewDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitWithoutPresubmitCheck$lambda$2(InternalAssetTransferReviewDuxo internalAssetTransferReviewDuxo, InternalAssetTransferReviewDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        internalAssetTransferReviewDuxo.applyMutation(new InternalAssetTransferReviewDuxo6(null));
        internalAssetTransferReviewDuxo.submitTransferRequest(it.getSourceAccount(), it.getSinkAccount(), it.getAssetsToTransfer());
        return Unit.INSTANCE;
    }

    /* compiled from: InternalAssetTransferReviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lnimbus/service/v1/CreateAssetTransferResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewDuxo$submitTransferRequest$1", m3645f = "InternalAssetTransferReviewDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewDuxo$submitTransferRequest$1 */
    static final class C192701 extends ContinuationImpl7 implements Function1<Continuation<? super CreateAssetTransferResponseDto>, Object> {
        final /* synthetic */ UiAssets $assetsToTransfer;
        final /* synthetic */ UiIatAccount $sinkAccount;
        final /* synthetic */ UiIatAccount $sourceAccount;
        int label;
        final /* synthetic */ InternalAssetTransferReviewDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C192701(UiIatAccount uiIatAccount, UiIatAccount uiIatAccount2, UiAssets uiAssets, InternalAssetTransferReviewDuxo internalAssetTransferReviewDuxo, Continuation<? super C192701> continuation) {
            super(1, continuation);
            this.$sourceAccount = uiIatAccount;
            this.$sinkAccount = uiIatAccount2;
            this.$assetsToTransfer = uiAssets;
            this.this$0 = internalAssetTransferReviewDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C192701(this.$sourceAccount, this.$sinkAccount, this.$assetsToTransfer, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super CreateAssetTransferResponseDto> continuation) {
            return ((C192701) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            TransferAccountInfoDto transferAccountInfoDto = InternalAssetTransferReviewDuxo7.toTransferAccountInfoDto(this.$sourceAccount);
            TransferAccountInfoDto transferAccountInfoDto2 = InternalAssetTransferReviewDuxo7.toTransferAccountInfoDto(this.$sinkAccount);
            String string2 = this.$assetsToTransfer.getCash().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            IdlDecimal idlDecimal = new IdlDecimal(string2);
            List<UiEligibleAsset> equities = this.$assetsToTransfer.getEquities();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(equities, 10));
            Iterator<T> it = equities.iterator();
            while (it.hasNext()) {
                arrayList.add(InternalAssetTransferReviewDuxo7.toEquityPositionDto((UiEligibleAsset) it.next()));
            }
            String string3 = this.this$0.uuid.toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            CreateAssetTransferRequestDto createAssetTransferRequestDto = new CreateAssetTransferRequestDto(transferAccountInfoDto, transferAccountInfoDto2, idlDecimal, arrayList, string3);
            NimbusService nimbusService = this.this$0.nimbusService;
            this.label = 1;
            Object objCreateAssetTransfer = nimbusService.CreateAssetTransfer(createAssetTransferRequestDto, this);
            return objCreateAssetTransfer == coroutine_suspended ? coroutine_suspended : objCreateAssetTransfer;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void submitTransferRequest(UiIatAccount sourceAccount, UiIatAccount sinkAccount, UiAssets assetsToTransfer) {
        this.suvWorkflowManager.handleRequest(new C192701(sourceAccount, sinkAccount, assetsToTransfer, this, null), new Function1() { // from class: com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternalAssetTransferReviewDuxo.submitTransferRequest$lambda$3(this.f$0, (CreateAssetTransferResponseDto) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternalAssetTransferReviewDuxo.submitTransferRequest$lambda$4(this.f$0, (Throwable) obj);
            }
        }, new Function2() { // from class: com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return InternalAssetTransferReviewDuxo.submitTransferRequest$lambda$5(this.f$0, (UUID) obj, ((Boolean) obj2).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitTransferRequest$lambda$3(InternalAssetTransferReviewDuxo internalAssetTransferReviewDuxo, CreateAssetTransferResponseDto response) {
        Intrinsics.checkNotNullParameter(response, "response");
        internalAssetTransferReviewDuxo.submit(new InternalAssetTransferReviewEvent.NavigateToConfirmationScreen(response.getId()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitTransferRequest$lambda$4(InternalAssetTransferReviewDuxo internalAssetTransferReviewDuxo, Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (!Throwables.isNetworkRelated(throwable)) {
            throw throwable;
        }
        internalAssetTransferReviewDuxo.applyMutation(new InternalAssetTransferReviewDuxo2(throwable, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitTransferRequest$lambda$5(InternalAssetTransferReviewDuxo internalAssetTransferReviewDuxo, UUID workflowId, boolean z) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        internalAssetTransferReviewDuxo.applyMutation(new InternalAssetTransferReviewDuxo3(null));
        internalAssetTransferReviewDuxo.submit(new InternalAssetTransferReviewEvent.VerificationWorkflow(workflowId, z));
        return Unit.INSTANCE;
    }

    /* compiled from: InternalAssetTransferReviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewDuxo$dismissErrorDialog$1", m3645f = "InternalAssetTransferReviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewDuxo$dismissErrorDialog$1 */
    static final class C192691 extends ContinuationImpl7 implements Function2<InternalAssetTransferReviewDataState, Continuation<? super InternalAssetTransferReviewDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C192691(Continuation<? super C192691> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C192691 c192691 = new C192691(continuation);
            c192691.L$0 = obj;
            return c192691;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InternalAssetTransferReviewDataState internalAssetTransferReviewDataState, Continuation<? super InternalAssetTransferReviewDataState> continuation) {
            return ((C192691) create(internalAssetTransferReviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return InternalAssetTransferReviewDataState.copy$default((InternalAssetTransferReviewDataState) this.L$0, null, null, null, null, false, null, null, 95, null);
        }
    }

    public final void dismissErrorDialog() {
        applyMutation(new C192691(null));
    }

    public final void navigateToCustomSelection() {
        submit(InternalAssetTransferReviewEvent.NavigateToCustomSelectionScreen.INSTANCE);
    }

    /* compiled from: InternalAssetTransferReviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewDuxo;", "Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewFragment$Args;", "<init>", "()V", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<InternalAssetTransferReviewDuxo, InternalAssetTransferReviewFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InternalAssetTransferReviewFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (InternalAssetTransferReviewFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InternalAssetTransferReviewFragment.Args getArgs(InternalAssetTransferReviewDuxo internalAssetTransferReviewDuxo) {
            return (InternalAssetTransferReviewFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, internalAssetTransferReviewDuxo);
        }
    }
}
