package com.robinhood.android.beneficiaries.p067ui.introflow;

import androidx.lifecycle.SavedStateHandle;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowAgreementViewModel;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowBeneficiaryRoleViewModel;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowBeneficiaryTypeViewModel;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryInfoViewModel;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryRole;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryType;
import bonfire.proto.idl.beneficiaries.p031v1.GetBeneficiaryFlowIntroViewModelsResponse;
import com.robinhood.android.beneficiaries.p067ui.introflow.BeneficiaryIntroFlowEvent;
import com.robinhood.android.beneficiaries.p067ui.introflow.BeneficiaryIntroFlowFragment;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.bonfire.beneficiaries.BeneficiaryStore;
import dispatch.core.Launch;
import java.util.List;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BeneficiaryIntroFlowDuxo.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0019B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0012\u001a\u00020\u0010J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowViewState;", "Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "beneficiaryStore", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/BeneficiaryStore;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/BeneficiaryStore;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "beneficiaryInfoButtonClicked", "beneficiaryAgreementButtonClicked", "beneficiaryRoleSelected", "beneficiaryRole", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRole;", "beneficiaryTypeSelected", "beneficiaryType", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryType;", "Companion", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BeneficiaryIntroFlowDuxo extends BaseDuxo5<BeneficiaryIntroFlowViewState, BeneficiaryIntroFlowEvent> implements HasSavedState {
    private final BeneficiaryStore beneficiaryStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeneficiaryIntroFlowDuxo(DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, BeneficiaryStore beneficiaryStore) {
        super(new BeneficiaryIntroFlowViewState(((BeneficiaryIntroFlowFragment.Args) INSTANCE.getArgs(savedStateHandle)).getAccountNumber(), null, null, null, null, null, 62, null), duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(beneficiaryStore, "beneficiaryStore");
        this.savedStateHandle = savedStateHandle;
        this.beneficiaryStore = beneficiaryStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        Launch.launchIO$default(getLifecycleScope(), null, null, new C97461(null), 3, null);
    }

    /* compiled from: BeneficiaryIntroFlowDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.introflow.BeneficiaryIntroFlowDuxo$onCreate$1", m3645f = "BeneficiaryIntroFlowDuxo.kt", m3646l = {31}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.beneficiaries.ui.introflow.BeneficiaryIntroFlowDuxo$onCreate$1 */
    static final class C97461 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C97461(Continuation<? super C97461> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BeneficiaryIntroFlowDuxo.this.new C97461(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C97461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BeneficiaryStore beneficiaryStore = BeneficiaryIntroFlowDuxo.this.beneficiaryStore;
                String accountNumber = ((BeneficiaryIntroFlowFragment.Args) BeneficiaryIntroFlowDuxo.INSTANCE.getArgs(BeneficiaryIntroFlowDuxo.this.getSavedStateHandle())).getAccountNumber();
                this.label = 1;
                obj = beneficiaryStore.fetchIntroFlowViewModels(accountNumber, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            GetBeneficiaryFlowIntroViewModelsResponse getBeneficiaryFlowIntroViewModelsResponse = (GetBeneficiaryFlowIntroViewModelsResponse) obj;
            BeneficiaryIntroFlowDuxo.this.applyMutation(new AnonymousClass1(getBeneficiaryFlowIntroViewModelsResponse, null));
            BeneficiaryInfoViewModel info_view_model = getBeneficiaryFlowIntroViewModelsResponse.getInfo_view_model();
            BeneficiaryFlowAgreementViewModel agreement_view_model = getBeneficiaryFlowIntroViewModelsResponse.getAgreement_view_model();
            BeneficiaryFlowBeneficiaryRoleViewModel beneficiary_role_view_model = getBeneficiaryFlowIntroViewModelsResponse.getBeneficiary_role_view_model();
            BeneficiaryFlowBeneficiaryTypeViewModel beneficiary_type_view_model = getBeneficiaryFlowIntroViewModelsResponse.getBeneficiary_type_view_model();
            if (beneficiary_type_view_model == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (info_view_model != null) {
                BeneficiaryIntroFlowDuxo.this.submit(new BeneficiaryIntroFlowEvent.NavigateToInfoScreen(info_view_model));
            } else if (agreement_view_model != null) {
                BeneficiaryIntroFlowDuxo.this.submit(new BeneficiaryIntroFlowEvent.NavigateToAgreementScreen(agreement_view_model));
            } else if (beneficiary_role_view_model != null) {
                BeneficiaryIntroFlowDuxo.this.submit(new BeneficiaryIntroFlowEvent.NavigateToRoleScreen(beneficiary_role_view_model));
            } else {
                BeneficiaryIntroFlowDuxo.this.submit(new BeneficiaryIntroFlowEvent.NavigateToTypeScreen(beneficiary_type_view_model));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: BeneficiaryIntroFlowDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.introflow.BeneficiaryIntroFlowDuxo$onCreate$1$1", m3645f = "BeneficiaryIntroFlowDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.beneficiaries.ui.introflow.BeneficiaryIntroFlowDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<BeneficiaryIntroFlowViewState, Continuation<? super BeneficiaryIntroFlowViewState>, Object> {
            final /* synthetic */ GetBeneficiaryFlowIntroViewModelsResponse $introFlowViewModels;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(GetBeneficiaryFlowIntroViewModelsResponse getBeneficiaryFlowIntroViewModelsResponse, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$introFlowViewModels = getBeneficiaryFlowIntroViewModelsResponse;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$introFlowViewModels, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(BeneficiaryIntroFlowViewState beneficiaryIntroFlowViewState, Continuation<? super BeneficiaryIntroFlowViewState> continuation) {
                return ((AnonymousClass1) create(beneficiaryIntroFlowViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return BeneficiaryIntroFlowViewState.copy$default((BeneficiaryIntroFlowViewState) this.L$0, null, this.$introFlowViewModels.getInfo_view_model(), this.$introFlowViewModels.getAgreement_view_model(), this.$introFlowViewModels.getBeneficiary_role_view_model(), null, this.$introFlowViewModels.getBeneficiary_type_view_model(), 17, null);
            }
        }
    }

    public final void beneficiaryInfoButtonClicked() {
        withDataState(new Function1() { // from class: com.robinhood.android.beneficiaries.ui.introflow.BeneficiaryIntroFlowDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BeneficiaryIntroFlowDuxo.beneficiaryInfoButtonClicked$lambda$1(this.f$0, (BeneficiaryIntroFlowViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit beneficiaryInfoButtonClicked$lambda$1(BeneficiaryIntroFlowDuxo beneficiaryIntroFlowDuxo, BeneficiaryIntroFlowViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.getAgreementViewModel() != null) {
            beneficiaryIntroFlowDuxo.submit(new BeneficiaryIntroFlowEvent.NavigateToAgreementScreen(state.getAgreementViewModel()));
            return Unit.INSTANCE;
        }
        if (state.getBeneficiaryRoleViewModel() != null) {
            beneficiaryIntroFlowDuxo.submit(new BeneficiaryIntroFlowEvent.NavigateToRoleScreen(state.getBeneficiaryRoleViewModel()));
            return Unit.INSTANCE;
        }
        BeneficiaryFlowBeneficiaryTypeViewModel beneficiaryTypeViewModel = state.getBeneficiaryTypeViewModel();
        if (beneficiaryTypeViewModel == null) {
            throw new IllegalStateException("Should be always presented");
        }
        beneficiaryIntroFlowDuxo.submit(new BeneficiaryIntroFlowEvent.NavigateToTypeScreen(beneficiaryTypeViewModel));
        return Unit.INSTANCE;
    }

    public final void beneficiaryAgreementButtonClicked() {
        withDataState(new Function1() { // from class: com.robinhood.android.beneficiaries.ui.introflow.BeneficiaryIntroFlowDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BeneficiaryIntroFlowDuxo.beneficiaryAgreementButtonClicked$lambda$3(this.f$0, (BeneficiaryIntroFlowViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit beneficiaryAgreementButtonClicked$lambda$3(BeneficiaryIntroFlowDuxo beneficiaryIntroFlowDuxo, BeneficiaryIntroFlowViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.getBeneficiaryRoleViewModel() != null) {
            beneficiaryIntroFlowDuxo.submit(new BeneficiaryIntroFlowEvent.NavigateToRoleScreen(state.getBeneficiaryRoleViewModel()));
            return Unit.INSTANCE;
        }
        BeneficiaryFlowBeneficiaryTypeViewModel beneficiaryTypeViewModel = state.getBeneficiaryTypeViewModel();
        if (beneficiaryTypeViewModel == null) {
            throw new IllegalStateException("Should be always presented");
        }
        beneficiaryIntroFlowDuxo.submit(new BeneficiaryIntroFlowEvent.NavigateToTypeScreen(beneficiaryTypeViewModel));
        return Unit.INSTANCE;
    }

    public final void beneficiaryRoleSelected(final BeneficiaryRole beneficiaryRole) {
        Intrinsics.checkNotNullParameter(beneficiaryRole, "beneficiaryRole");
        withDataState(new Function1() { // from class: com.robinhood.android.beneficiaries.ui.introflow.BeneficiaryIntroFlowDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BeneficiaryIntroFlowDuxo.beneficiaryRoleSelected$lambda$5(this.f$0, beneficiaryRole, (BeneficiaryIntroFlowViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit beneficiaryRoleSelected$lambda$5(BeneficiaryIntroFlowDuxo beneficiaryIntroFlowDuxo, BeneficiaryRole beneficiaryRole, BeneficiaryIntroFlowViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        beneficiaryIntroFlowDuxo.applyMutation(new BeneficiaryIntroFlowDuxo2(beneficiaryRole, null));
        BeneficiaryFlowBeneficiaryTypeViewModel beneficiaryTypeViewModel = state.getBeneficiaryTypeViewModel();
        if (beneficiaryTypeViewModel == null) {
            throw new IllegalStateException("Should be always presented");
        }
        beneficiaryIntroFlowDuxo.submit(new BeneficiaryIntroFlowEvent.NavigateToTypeScreen(beneficiaryTypeViewModel));
        return Unit.INSTANCE;
    }

    public final void beneficiaryTypeSelected(final BeneficiaryType beneficiaryType) {
        Intrinsics.checkNotNullParameter(beneficiaryType, "beneficiaryType");
        withDataState(new Function1() { // from class: com.robinhood.android.beneficiaries.ui.introflow.BeneficiaryIntroFlowDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BeneficiaryIntroFlowDuxo.beneficiaryTypeSelected$lambda$6(this.f$0, beneficiaryType, (BeneficiaryIntroFlowViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit beneficiaryTypeSelected$lambda$6(BeneficiaryIntroFlowDuxo beneficiaryIntroFlowDuxo, BeneficiaryType beneficiaryType, BeneficiaryIntroFlowViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        BeneficiaryFlowAgreementViewModel agreementViewModel = state.getAgreementViewModel();
        List listListOfNotNull = CollectionsKt.listOfNotNull(agreementViewModel != null ? agreementViewModel.getAgreement_type() : null);
        BeneficiaryRole selectedBeneficiaryRole = state.getSelectedBeneficiaryRole();
        if (selectedBeneficiaryRole == null) {
            selectedBeneficiaryRole = BeneficiaryRole.BENEFICIARY_ROLE_PRIMARY;
        }
        beneficiaryIntroFlowDuxo.submit(new BeneficiaryIntroFlowEvent.CompleteIntroFlow(beneficiaryType, listListOfNotNull, selectedBeneficiaryRole, state.getAgreementViewModel()));
        return Unit.INSTANCE;
    }

    /* compiled from: BeneficiaryIntroFlowDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowDuxo;", "Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowFragment$Args;", "<init>", "()V", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<BeneficiaryIntroFlowDuxo, BeneficiaryIntroFlowFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public BeneficiaryIntroFlowFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (BeneficiaryIntroFlowFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public BeneficiaryIntroFlowFragment.Args getArgs(BeneficiaryIntroFlowDuxo beneficiaryIntroFlowDuxo) {
            return (BeneficiaryIntroFlowFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, beneficiaryIntroFlowDuxo);
        }
    }
}
