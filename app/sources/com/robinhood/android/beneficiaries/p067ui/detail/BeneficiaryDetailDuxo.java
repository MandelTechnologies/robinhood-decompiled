package com.robinhood.android.beneficiaries.p067ui.detail;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.beneficiaries.contracts.BeneficiariesFragmentKey;
import com.robinhood.android.beneficiaries.models.p066db.BeneficiaryDetail;
import com.robinhood.android.beneficiaries.p067ui.BeneficiaryExperiments;
import com.robinhood.android.beneficiaries.p067ui.detail.BeneficiaryDetailEvent;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.beneficiaries.BeneficiaryDetailStore;
import com.robinhood.librobinhood.data.store.bonfire.beneficiaries.BeneficiaryListStore;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: BeneficiaryDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001\"B1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0016\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u0015H\u0016J\b\u0010\u001c\u001a\u00020\u0015H\u0016J\b\u0010\u001d\u001a\u00020\u0015H\u0016J\b\u0010\u001e\u001a\u00020\u0015H\u0016J\b\u0010\u001f\u001a\u00020\u0015H\u0016J\b\u0010 \u001a\u00020\u0015H\u0016J\b\u0010!\u001a\u00020\u0015H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/detail/BeneficiaryDetailDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/beneficiaries/ui/detail/BeneficiaryDetailViewState;", "Lcom/robinhood/android/beneficiaries/ui/detail/BeneficiaryDetailEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/android/beneficiaries/ui/detail/BeneficiaryDetailCallbacks;", "beneficiaryDetailStore", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/BeneficiaryDetailStore;", "beneficiaryListStore", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/BeneficiaryListStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/BeneficiaryDetailStore;Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/BeneficiaryListStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "deleteBeneficiary", "accountNumber", "", "beneficiaryId", "Ljava/util/UUID;", "onClickDeleteBeneficiary", "onRemoveAllAlertDialogDismiss", "onRemoveAllAlertDialogConfirm", "onRemoveConfirmationDialogDismiss", "onRemoveConfirmationDialogConfirm", "onRemoveAllAlertDialogCancel", "onRemoveConfirmationDialogCancel", "Companion", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class BeneficiaryDetailDuxo extends BaseDuxo5<BeneficiaryDetailViewState, BeneficiaryDetailEvent> implements HasSavedState, BeneficiaryDetailCompose {
    private final BeneficiaryDetailStore beneficiaryDetailStore;
    private final BeneficiaryListStore beneficiaryListStore;
    private final ExperimentsStore experimentsStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeneficiaryDetailDuxo(BeneficiaryDetailStore beneficiaryDetailStore, BeneficiaryListStore beneficiaryListStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, ExperimentsStore experimentsStore) {
        super(new BeneficiaryDetailViewState(null, false, false, false, false, 31, null), duxoBundle);
        Intrinsics.checkNotNullParameter(beneficiaryDetailStore, "beneficiaryDetailStore");
        Intrinsics.checkNotNullParameter(beneficiaryListStore, "beneficiaryListStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        this.beneficiaryDetailStore = beneficiaryDetailStore;
        this.beneficiaryListStore = beneficiaryListStore;
        this.savedStateHandle = savedStateHandle;
        this.experimentsStore = experimentsStore;
        getLifecycleScope().launchWhenCreated(new C96841(null));
    }

    /* compiled from: BeneficiaryDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailDuxo$1", m3645f = "BeneficiaryDetailDuxo.kt", m3646l = {32}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailDuxo$1 */
    static final class C96841 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C96841(Continuation<? super C96841> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BeneficiaryDetailDuxo.this.new C96841(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C96841) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: BeneficiaryDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailDuxo$1$1", m3645f = "BeneficiaryDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailDuxo$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ BeneficiaryDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(BeneficiaryDetailDuxo beneficiaryDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = beneficiaryDetailDuxo;
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

            /* compiled from: BeneficiaryDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/ui/detail/BeneficiaryDetailViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailDuxo$1$1$1", m3645f = "BeneficiaryDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailDuxo$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C496341 extends ContinuationImpl7 implements Function2<BeneficiaryDetailViewState, Continuation<? super BeneficiaryDetailViewState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C496341(boolean z, Continuation<? super C496341> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C496341 c496341 = new C496341(this.$it, continuation);
                    c496341.L$0 = obj;
                    return c496341;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(BeneficiaryDetailViewState beneficiaryDetailViewState, Continuation<? super BeneficiaryDetailViewState> continuation) {
                    return ((C496341) create(beneficiaryDetailViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return BeneficiaryDetailViewState.copy$default((BeneficiaryDetailViewState) this.L$0, null, false, false, false, this.$it, 15, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C496341(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(BeneficiaryDetailDuxo.this.experimentsStore, new Experiment[]{BeneficiaryExperiments.INSTANCE}, false, null, 6, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(BeneficiaryDetailDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        BeneficiaryDetailStore beneficiaryDetailStore = this.beneficiaryDetailStore;
        Companion companion = INSTANCE;
        LifecycleHost.DefaultImpls.bind$default(this, beneficiaryDetailStore.stream(((BeneficiariesFragmentKey.Detail) companion.getArgs((HasSavedState) this)).getAccountNumber(), ((BeneficiariesFragmentKey.Detail) companion.getArgs((HasSavedState) this)).getBeneficiaryId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BeneficiaryDetailDuxo.onStart$lambda$0(this.f$0, (BeneficiaryDetail) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(BeneficiaryDetailDuxo beneficiaryDetailDuxo, BeneficiaryDetail beneficiaryDetail) {
        Intrinsics.checkNotNullParameter(beneficiaryDetail, "beneficiaryDetail");
        beneficiaryDetailDuxo.applyMutation(new BeneficiaryDetailDuxo6(beneficiaryDetail, null));
        return Unit.INSTANCE;
    }

    /* compiled from: BeneficiaryDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/ui/detail/BeneficiaryDetailViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailDuxo$deleteBeneficiary$1", m3645f = "BeneficiaryDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailDuxo$deleteBeneficiary$1 */
    static final class C96851 extends ContinuationImpl7 implements Function2<BeneficiaryDetailViewState, Continuation<? super BeneficiaryDetailViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C96851(Continuation<? super C96851> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C96851 c96851 = new C96851(continuation);
            c96851.L$0 = obj;
            return c96851;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BeneficiaryDetailViewState beneficiaryDetailViewState, Continuation<? super BeneficiaryDetailViewState> continuation) {
            return ((C96851) create(beneficiaryDetailViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return BeneficiaryDetailViewState.copy$default((BeneficiaryDetailViewState) this.L$0, null, true, false, false, false, 29, null);
        }
    }

    public final void deleteBeneficiary(String accountNumber, UUID beneficiaryId) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
        applyMutation(new C96851(null));
        LifecycleHost.DefaultImpls.bind$default(this, this.beneficiaryDetailStore.deleteBeneficiary(accountNumber, beneficiaryId), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BeneficiaryDetailDuxo.deleteBeneficiary$lambda$1(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BeneficiaryDetailDuxo.deleteBeneficiary$lambda$2(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteBeneficiary$lambda$1(BeneficiaryDetailDuxo beneficiaryDetailDuxo) {
        beneficiaryDetailDuxo.beneficiaryListStore.forceRefresh(((BeneficiariesFragmentKey.Detail) INSTANCE.getArgs((HasSavedState) beneficiaryDetailDuxo)).getAccountNumber());
        beneficiaryDetailDuxo.submit(BeneficiaryDetailEvent.DeleteSuccess.INSTANCE);
        beneficiaryDetailDuxo.applyMutation(new BeneficiaryDetailDuxo2(null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteBeneficiary$lambda$2(BeneficiaryDetailDuxo beneficiaryDetailDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        beneficiaryDetailDuxo.submit(new BeneficiaryDetailEvent.Error(it));
        beneficiaryDetailDuxo.applyMutation(new BeneficiaryDetailDuxo3(null));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.beneficiaries.p067ui.detail.BeneficiaryDetailCompose
    public void onClickDeleteBeneficiary() {
        withDataState(new Function1() { // from class: com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BeneficiaryDetailDuxo.onClickDeleteBeneficiary$lambda$3(this.f$0, (BeneficiaryDetailViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClickDeleteBeneficiary$lambda$3(BeneficiaryDetailDuxo beneficiaryDetailDuxo, BeneficiaryDetailViewState dataState) {
        BeneficiaryDetail.ViewModel viewModel;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.isContingentBeneficiaryExperiment()) {
            BeneficiaryDetail beneficiaryDetail = dataState.getBeneficiaryDetail();
            if (((beneficiaryDetail == null || (viewModel = beneficiaryDetail.getViewModel()) == null) ? null : viewModel.getRemoveAllAlert()) != null) {
                beneficiaryDetailDuxo.applyMutation(new BeneficiaryDetailDuxo4(null));
            } else {
                beneficiaryDetailDuxo.applyMutation(new BeneficiaryDetailDuxo5(null));
            }
        } else {
            beneficiaryDetailDuxo.submit(BeneficiaryDetailEvent.ShowDeleteConfirmationDialog.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: BeneficiaryDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/ui/detail/BeneficiaryDetailViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailDuxo$onRemoveAllAlertDialogDismiss$1", m3645f = "BeneficiaryDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailDuxo$onRemoveAllAlertDialogDismiss$1 */
    static final class C96861 extends ContinuationImpl7 implements Function2<BeneficiaryDetailViewState, Continuation<? super BeneficiaryDetailViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C96861(Continuation<? super C96861> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C96861 c96861 = new C96861(continuation);
            c96861.L$0 = obj;
            return c96861;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BeneficiaryDetailViewState beneficiaryDetailViewState, Continuation<? super BeneficiaryDetailViewState> continuation) {
            return ((C96861) create(beneficiaryDetailViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return BeneficiaryDetailViewState.copy$default((BeneficiaryDetailViewState) this.L$0, null, false, false, false, false, 27, null);
        }
    }

    @Override // com.robinhood.android.beneficiaries.p067ui.detail.BeneficiaryDetailCompose
    public void onRemoveAllAlertDialogDismiss() {
        applyMutation(new C96861(null));
    }

    @Override // com.robinhood.android.beneficiaries.p067ui.detail.BeneficiaryDetailCompose
    public void onRemoveAllAlertDialogConfirm() {
        onRemoveAllAlertDialogDismiss();
        Companion companion = INSTANCE;
        deleteBeneficiary(((BeneficiariesFragmentKey.Detail) companion.getArgs((HasSavedState) this)).getAccountNumber(), ((BeneficiariesFragmentKey.Detail) companion.getArgs((HasSavedState) this)).getBeneficiaryId());
    }

    /* compiled from: BeneficiaryDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/ui/detail/BeneficiaryDetailViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailDuxo$onRemoveConfirmationDialogDismiss$1", m3645f = "BeneficiaryDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailDuxo$onRemoveConfirmationDialogDismiss$1 */
    static final class C96871 extends ContinuationImpl7 implements Function2<BeneficiaryDetailViewState, Continuation<? super BeneficiaryDetailViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C96871(Continuation<? super C96871> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C96871 c96871 = new C96871(continuation);
            c96871.L$0 = obj;
            return c96871;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BeneficiaryDetailViewState beneficiaryDetailViewState, Continuation<? super BeneficiaryDetailViewState> continuation) {
            return ((C96871) create(beneficiaryDetailViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return BeneficiaryDetailViewState.copy$default((BeneficiaryDetailViewState) this.L$0, null, false, false, false, false, 23, null);
        }
    }

    @Override // com.robinhood.android.beneficiaries.p067ui.detail.BeneficiaryDetailCompose
    public void onRemoveConfirmationDialogDismiss() {
        applyMutation(new C96871(null));
    }

    @Override // com.robinhood.android.beneficiaries.p067ui.detail.BeneficiaryDetailCompose
    public void onRemoveConfirmationDialogConfirm() {
        onRemoveConfirmationDialogDismiss();
        Companion companion = INSTANCE;
        deleteBeneficiary(((BeneficiariesFragmentKey.Detail) companion.getArgs((HasSavedState) this)).getAccountNumber(), ((BeneficiariesFragmentKey.Detail) companion.getArgs((HasSavedState) this)).getBeneficiaryId());
    }

    @Override // com.robinhood.android.beneficiaries.p067ui.detail.BeneficiaryDetailCompose
    public void onRemoveAllAlertDialogCancel() {
        onRemoveAllAlertDialogDismiss();
    }

    @Override // com.robinhood.android.beneficiaries.p067ui.detail.BeneficiaryDetailCompose
    public void onRemoveConfirmationDialogCancel() {
        onRemoveConfirmationDialogDismiss();
    }

    /* compiled from: BeneficiaryDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/detail/BeneficiaryDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/beneficiaries/ui/detail/BeneficiaryDetailDuxo;", "Lcom/robinhood/android/beneficiaries/contracts/BeneficiariesFragmentKey$Detail;", "<init>", "()V", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<BeneficiaryDetailDuxo, BeneficiariesFragmentKey.Detail> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public BeneficiariesFragmentKey.Detail getArgs(SavedStateHandle savedStateHandle) {
            return (BeneficiariesFragmentKey.Detail) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public BeneficiariesFragmentKey.Detail getArgs(BeneficiaryDetailDuxo beneficiaryDetailDuxo) {
            return (BeneficiariesFragmentKey.Detail) DuxoCompanion.DefaultImpls.getArgs(this, beneficiaryDetailDuxo);
        }
    }
}
