package com.robinhood.android.beneficiaries.p067ui.list;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.beneficiaries.contracts.BeneficiariesFragmentKey;
import com.robinhood.android.beneficiaries.models.api.ApiBeneficiarySplashViewModel;
import com.robinhood.android.beneficiaries.models.p066db.BeneficiaryList;
import com.robinhood.android.beneficiaries.p067ui.BeneficiaryExperiments;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.beneficiaries.BeneficiaryListStore;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: BeneficiaryListDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0016B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/list/BeneficiaryListDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/beneficiaries/ui/list/BeneficiaryListDataState;", "Lcom/robinhood/android/beneficiaries/ui/list/BeneficiaryListViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/beneficiaries/ui/list/BeneficiaryListStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "beneficiaryListStore", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/BeneficiaryListStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/beneficiaries/ui/list/BeneficiaryListStateProvider;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/BeneficiaryListStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onStart", "Companion", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class BeneficiaryListDuxo extends BaseDuxo<BeneficiaryListDataState, BeneficiaryListViewState> implements HasSavedState {
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
    public BeneficiaryListDuxo(DuxoBundle duxoBundle, BeneficiaryListStateProvider stateProvider, SavedStateHandle savedStateHandle, BeneficiaryListStore beneficiaryListStore, ExperimentsStore experimentsStore) {
        super(new BeneficiaryListDataState(null, null, false, 7, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(beneficiaryListStore, "beneficiaryListStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        this.savedStateHandle = savedStateHandle;
        this.beneficiaryListStore = beneficiaryListStore;
        this.experimentsStore = experimentsStore;
        getLifecycleScope().launchWhenCreated(new C97861(null));
    }

    /* compiled from: BeneficiaryListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.list.BeneficiaryListDuxo$1", m3645f = "BeneficiaryListDuxo.kt", m3646l = {32}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.beneficiaries.ui.list.BeneficiaryListDuxo$1 */
    static final class C97861 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C97861(Continuation<? super C97861> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BeneficiaryListDuxo.this.new C97861(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C97861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: BeneficiaryListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.list.BeneficiaryListDuxo$1$1", m3645f = "BeneficiaryListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.beneficiaries.ui.list.BeneficiaryListDuxo$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ BeneficiaryListDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(BeneficiaryListDuxo beneficiaryListDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = beneficiaryListDuxo;
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

            /* compiled from: BeneficiaryListDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/ui/list/BeneficiaryListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.list.BeneficiaryListDuxo$1$1$1", m3645f = "BeneficiaryListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.beneficiaries.ui.list.BeneficiaryListDuxo$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C496401 extends ContinuationImpl7 implements Function2<BeneficiaryListDataState, Continuation<? super BeneficiaryListDataState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C496401(boolean z, Continuation<? super C496401> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C496401 c496401 = new C496401(this.$it, continuation);
                    c496401.L$0 = obj;
                    return c496401;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(BeneficiaryListDataState beneficiaryListDataState, Continuation<? super BeneficiaryListDataState> continuation) {
                    return ((C496401) create(beneficiaryListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return BeneficiaryListDataState.copy$default((BeneficiaryListDataState) this.L$0, null, null, this.$it, 3, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C496401(this.Z$0, null));
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
                Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(BeneficiaryListDuxo.this.experimentsStore, new Experiment[]{BeneficiaryExperiments.INSTANCE}, false, null, 6, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(BeneficiaryListDuxo.this, null);
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
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C97871(null));
    }

    /* compiled from: BeneficiaryListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.list.BeneficiaryListDuxo$onCreate$1", m3645f = "BeneficiaryListDuxo.kt", m3646l = {43}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.beneficiaries.ui.list.BeneficiaryListDuxo$onCreate$1 */
    static final class C97871 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C97871(Continuation<? super C97871> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C97871 c97871 = BeneficiaryListDuxo.this.new C97871(continuation);
            c97871.L$0 = obj;
            return c97871;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C97871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    BeneficiaryListDuxo beneficiaryListDuxo = BeneficiaryListDuxo.this;
                    Result.Companion companion = Result.INSTANCE;
                    BeneficiaryListStore beneficiaryListStore = beneficiaryListDuxo.beneficiaryListStore;
                    String accountNumber = ((BeneficiariesFragmentKey.List) BeneficiaryListDuxo.INSTANCE.getArgs((HasSavedState) beneficiaryListDuxo)).getAccountNumber();
                    this.label = 1;
                    obj = beneficiaryListStore.getBeneficiaryValueProps(accountNumber, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM28550constructorimpl = Result.m28550constructorimpl((ApiBeneficiarySplashViewModel) obj);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
                objM28550constructorimpl = null;
            }
            BeneficiaryListDuxo.this.applyMutation(new AnonymousClass1((ApiBeneficiarySplashViewModel) objM28550constructorimpl, null));
            return Unit.INSTANCE;
        }

        /* compiled from: BeneficiaryListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/ui/list/BeneficiaryListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.list.BeneficiaryListDuxo$onCreate$1$1", m3645f = "BeneficiaryListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.beneficiaries.ui.list.BeneficiaryListDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<BeneficiaryListDataState, Continuation<? super BeneficiaryListDataState>, Object> {
            final /* synthetic */ ApiBeneficiarySplashViewModel $splashViewModel;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ApiBeneficiarySplashViewModel apiBeneficiarySplashViewModel, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$splashViewModel = apiBeneficiarySplashViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$splashViewModel, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(BeneficiaryListDataState beneficiaryListDataState, Continuation<? super BeneficiaryListDataState> continuation) {
                return ((AnonymousClass1) create(beneficiaryListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return BeneficiaryListDataState.copy$default((BeneficiaryListDataState) this.L$0, null, this.$splashViewModel, false, 5, null);
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, this.beneficiaryListStore.stream(((BeneficiariesFragmentKey.List) INSTANCE.getArgs((HasSavedState) this)).getAccountNumber()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.beneficiaries.ui.list.BeneficiaryListDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BeneficiaryListDuxo.onStart$lambda$0(this.f$0, (BeneficiaryList) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(BeneficiaryListDuxo beneficiaryListDuxo, BeneficiaryList beneficiaryList) {
        Intrinsics.checkNotNullParameter(beneficiaryList, "beneficiaryList");
        beneficiaryListDuxo.applyMutation(new BeneficiaryListDuxo2(beneficiaryList, null));
        return Unit.INSTANCE;
    }

    /* compiled from: BeneficiaryListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/list/BeneficiaryListDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/beneficiaries/ui/list/BeneficiaryListDuxo;", "Lcom/robinhood/android/beneficiaries/contracts/BeneficiariesFragmentKey$List;", "<init>", "()V", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<BeneficiaryListDuxo, BeneficiariesFragmentKey.List> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public BeneficiariesFragmentKey.List getArgs(SavedStateHandle savedStateHandle) {
            return (BeneficiariesFragmentKey.List) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public BeneficiariesFragmentKey.List getArgs(BeneficiaryListDuxo beneficiaryListDuxo) {
            return (BeneficiariesFragmentKey.List) DuxoCompanion.DefaultImpls.getArgs(this, beneficiaryListDuxo);
        }
    }
}
