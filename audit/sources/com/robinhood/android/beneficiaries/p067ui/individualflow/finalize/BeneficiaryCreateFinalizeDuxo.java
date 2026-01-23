package com.robinhood.android.beneficiaries.p067ui.individualflow.finalize;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.beneficiaries.models.api.ApiBeneficiaryAgreementViewModel;
import com.robinhood.android.beneficiaries.models.api.ApiBeneficiaryFlowResponse;
import com.robinhood.android.beneficiaries.models.api.ApiBeneficiarySignedAgreement;
import com.robinhood.android.beneficiaries.models.api.ApiCreateBeneficiaryConfiguration;
import com.robinhood.android.beneficiaries.models.api.ApiCreateBeneficiaryRequest;
import com.robinhood.android.beneficiaries.models.api.ApiUpdateBeneficiaryRequest;
import com.robinhood.android.beneficiaries.p067ui.individualflow.finalize.BeneficiaryCreateFinalizeFragment;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.bonfire.beneficiaries.BeneficiaryDetailStore;
import com.robinhood.librobinhood.data.store.bonfire.beneficiaries.BeneficiaryListStore;
import com.robinhood.utils.Optional3;
import io.reactivex.Single;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: BeneficiaryCreateFinalizeDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0015B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/finalize/BeneficiaryCreateFinalizeDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/finalize/BeneficiaryCreateFinalizeDataState;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/finalize/BeneficiaryCreateFinalizeViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "beneficiaryListStore", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/BeneficiaryListStore;", "beneficiaryDetailStore", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/BeneficiaryDetailStore;", "stateProvider", "Lcom/robinhood/android/beneficiaries/ui/individualflow/finalize/BeneficiaryCreateFinalizeStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/BeneficiaryListStore;Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/BeneficiaryDetailStore;Lcom/robinhood/android/beneficiaries/ui/individualflow/finalize/BeneficiaryCreateFinalizeStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class BeneficiaryCreateFinalizeDuxo extends BaseDuxo<BeneficiaryCreateFinalizeDataState, BeneficiaryCreateFinalizeViewState> implements HasSavedState {
    private final BeneficiaryDetailStore beneficiaryDetailStore;
    private final BeneficiaryListStore beneficiaryListStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeneficiaryCreateFinalizeDuxo(BeneficiaryListStore beneficiaryListStore, BeneficiaryDetailStore beneficiaryDetailStore, BeneficiaryCreateFinalizeStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new BeneficiaryCreateFinalizeDataState(null, null, 3, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(beneficiaryListStore, "beneficiaryListStore");
        Intrinsics.checkNotNullParameter(beneficiaryDetailStore, "beneficiaryDetailStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.beneficiaryListStore = beneficiaryListStore;
        this.beneficiaryDetailStore = beneficiaryDetailStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        Single<ApiBeneficiaryFlowResponse> singleCreateBeneficiary;
        super.onCreate();
        Companion companion = INSTANCE;
        ApiCreateBeneficiaryConfiguration configuration = ((BeneficiaryCreateFinalizeFragment.Args) companion.getArgs((HasSavedState) this)).getConfiguration();
        UUID beneficiary_id = configuration.getBeneficiary_id();
        ApiBeneficiaryAgreementViewModel agreement_view_model = configuration.getAgreement_view_model();
        ApiBeneficiarySignedAgreement apiBeneficiarySignedAgreement = agreement_view_model != null ? new ApiBeneficiarySignedAgreement(agreement_view_model.getContentful_id(), agreement_view_model.getAgreement_type(), agreement_view_model.getAgreement_context(), agreement_view_model.getAccount_number(), 0, 16, null) : null;
        if (beneficiary_id != null) {
            singleCreateBeneficiary = this.beneficiaryDetailStore.updateBeneficiary(configuration.getAccount_number(), new ApiUpdateBeneficiaryRequest(beneficiary_id, ((BeneficiaryCreateFinalizeFragment.Args) companion.getArgs((HasSavedState) this)).getFirstName(), ((BeneficiaryCreateFinalizeFragment.Args) companion.getArgs((HasSavedState) this)).getLastName(), ((BeneficiaryCreateFinalizeFragment.Args) companion.getArgs((HasSavedState) this)).getRelationship(), ((BeneficiaryCreateFinalizeFragment.Args) companion.getArgs((HasSavedState) this)).getDob(), ((BeneficiaryCreateFinalizeFragment.Args) companion.getArgs((HasSavedState) this)).getEmail(), apiBeneficiarySignedAgreement, ((BeneficiaryCreateFinalizeFragment.Args) companion.getArgs((HasSavedState) this)).getSignedSpousalAgreement(), ((BeneficiaryCreateFinalizeFragment.Args) companion.getArgs((HasSavedState) this)).getAdditionalAccounts(), ((BeneficiaryCreateFinalizeFragment.Args) companion.getArgs((HasSavedState) this)).getAdditionalAgreements()));
        } else {
            singleCreateBeneficiary = this.beneficiaryDetailStore.createBeneficiary(configuration.getAccount_number(), new ApiCreateBeneficiaryRequest(((BeneficiaryCreateFinalizeFragment.Args) companion.getArgs((HasSavedState) this)).getFirstName(), ((BeneficiaryCreateFinalizeFragment.Args) companion.getArgs((HasSavedState) this)).getLastName(), ((BeneficiaryCreateFinalizeFragment.Args) companion.getArgs((HasSavedState) this)).getRelationship(), ((BeneficiaryCreateFinalizeFragment.Args) companion.getArgs((HasSavedState) this)).getDob(), ((BeneficiaryCreateFinalizeFragment.Args) companion.getArgs((HasSavedState) this)).getEmail(), configuration.getBeneficiary_role(), apiBeneficiarySignedAgreement, ((BeneficiaryCreateFinalizeFragment.Args) companion.getArgs((HasSavedState) this)).getSignedSpousalAgreement(), ((BeneficiaryCreateFinalizeFragment.Args) companion.getArgs((HasSavedState) this)).getAdditionalAccounts(), ((BeneficiaryCreateFinalizeFragment.Args) companion.getArgs((HasSavedState) this)).getAdditionalAgreements()));
        }
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C97231(singleCreateBeneficiary, this, null), 3, null);
    }

    /* compiled from: BeneficiaryCreateFinalizeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.individualflow.finalize.BeneficiaryCreateFinalizeDuxo$onCreate$1", m3645f = "BeneficiaryCreateFinalizeDuxo.kt", m3646l = {103}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.beneficiaries.ui.individualflow.finalize.BeneficiaryCreateFinalizeDuxo$onCreate$1 */
    static final class C97231 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Single<ApiBeneficiaryFlowResponse> $request;
        int label;
        final /* synthetic */ BeneficiaryCreateFinalizeDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C97231(Single<ApiBeneficiaryFlowResponse> single, BeneficiaryCreateFinalizeDuxo beneficiaryCreateFinalizeDuxo, Continuation<? super C97231> continuation) {
            super(2, continuation);
            this.$request = single;
            this.this$0 = beneficiaryCreateFinalizeDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C97231(this.$request, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C97231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Single<ApiBeneficiaryFlowResponse> single = this.$request;
                    this.label = 1;
                    obj = RxAwait3.await(single, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.this$0.beneficiaryListStore.forceRefresh(((BeneficiaryCreateFinalizeFragment.Args) BeneficiaryCreateFinalizeDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getConfiguration().getAccount_number());
                this.this$0.applyMutation(new AnonymousClass1((ApiBeneficiaryFlowResponse) obj, null));
            } catch (Throwable th) {
                this.this$0.applyMutation(new AnonymousClass2(th, null));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: BeneficiaryCreateFinalizeDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/ui/individualflow/finalize/BeneficiaryCreateFinalizeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.individualflow.finalize.BeneficiaryCreateFinalizeDuxo$onCreate$1$1", m3645f = "BeneficiaryCreateFinalizeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.beneficiaries.ui.individualflow.finalize.BeneficiaryCreateFinalizeDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<BeneficiaryCreateFinalizeDataState, Continuation<? super BeneficiaryCreateFinalizeDataState>, Object> {
            final /* synthetic */ ApiBeneficiaryFlowResponse $requestResult;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ApiBeneficiaryFlowResponse apiBeneficiaryFlowResponse, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$requestResult = apiBeneficiaryFlowResponse;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$requestResult, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(BeneficiaryCreateFinalizeDataState beneficiaryCreateFinalizeDataState, Continuation<? super BeneficiaryCreateFinalizeDataState> continuation) {
                return ((AnonymousClass1) create(beneficiaryCreateFinalizeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return new BeneficiaryCreateFinalizeDataState(Optional3.asOptional(this.$requestResult.getPost_submit_alert()), null, 2, null);
            }
        }

        /* compiled from: BeneficiaryCreateFinalizeDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/ui/individualflow/finalize/BeneficiaryCreateFinalizeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.individualflow.finalize.BeneficiaryCreateFinalizeDuxo$onCreate$1$2", m3645f = "BeneficiaryCreateFinalizeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.beneficiaries.ui.individualflow.finalize.BeneficiaryCreateFinalizeDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<BeneficiaryCreateFinalizeDataState, Continuation<? super BeneficiaryCreateFinalizeDataState>, Object> {

            /* renamed from: $t */
            final /* synthetic */ Throwable f3932$t;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Throwable th, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.f3932$t = th;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.f3932$t, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(BeneficiaryCreateFinalizeDataState beneficiaryCreateFinalizeDataState, Continuation<? super BeneficiaryCreateFinalizeDataState> continuation) {
                return ((AnonymousClass2) create(beneficiaryCreateFinalizeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return new BeneficiaryCreateFinalizeDataState(null, this.f3932$t, 1, null);
            }
        }
    }

    /* compiled from: BeneficiaryCreateFinalizeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/finalize/BeneficiaryCreateFinalizeDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/finalize/BeneficiaryCreateFinalizeDuxo;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/finalize/BeneficiaryCreateFinalizeFragment$Args;", "<init>", "()V", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<BeneficiaryCreateFinalizeDuxo, BeneficiaryCreateFinalizeFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public BeneficiaryCreateFinalizeFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (BeneficiaryCreateFinalizeFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public BeneficiaryCreateFinalizeFragment.Args getArgs(BeneficiaryCreateFinalizeDuxo beneficiaryCreateFinalizeDuxo) {
            return (BeneficiaryCreateFinalizeFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, beneficiaryCreateFinalizeDuxo);
        }
    }
}
