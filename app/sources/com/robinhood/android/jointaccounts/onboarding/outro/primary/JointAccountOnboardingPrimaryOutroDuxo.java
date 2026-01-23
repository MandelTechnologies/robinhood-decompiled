package com.robinhood.android.jointaccounts.onboarding.outro.primary;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.account.contracts.jointaccounts.JointAccountOnboardingPrimaryOutro;
import com.robinhood.android.dashboard.store.HomeDashboardStore;
import com.robinhood.android.jointaccounts.api.JointAccountsApi;
import com.robinhood.android.jointaccounts.onboarding.UtilsKt;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.FeatureDiscoveryStore;
import com.robinhood.models.jointaccounts.api.onboarding.ApiJointAccountOnboardingPrimaryPostAgreementsViewModel;
import com.robinhood.store.AsyncResult;
import com.robinhood.store.AsyncResult2;
import kotlin.Metadata;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: JointAccountOnboardingPrimaryOutroDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00162\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u00020\u0004:\u0001\u0016B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0006\u0010\u0015\u001a\u00020\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/outro/primary/JointAccountOnboardingPrimaryOutroDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/store/AsyncResult;", "Lcom/robinhood/android/jointaccounts/onboarding/outro/primary/PrimaryOutroViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "api", "Lcom/robinhood/android/jointaccounts/api/JointAccountsApi;", "homeDashboardStore", "Lcom/robinhood/android/dashboard/store/HomeDashboardStore;", "featureDiscoveryStore", "Lcom/robinhood/librobinhood/data/store/FeatureDiscoveryStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/jointaccounts/api/JointAccountsApi;Lcom/robinhood/android/dashboard/store/HomeDashboardStore;Lcom/robinhood/librobinhood/data/store/FeatureDiscoveryStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "fetchOutro", "Companion", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class JointAccountOnboardingPrimaryOutroDuxo extends BaseDuxo4<AsyncResult<? extends PrimaryOutroViewState>> implements HasSavedState {
    private final JointAccountsApi api;
    private final FeatureDiscoveryStore featureDiscoveryStore;
    private final HomeDashboardStore homeDashboardStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JointAccountOnboardingPrimaryOutroDuxo(JointAccountsApi api, HomeDashboardStore homeDashboardStore, FeatureDiscoveryStore featureDiscoveryStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(AsyncResult.Loading.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(homeDashboardStore, "homeDashboardStore");
        Intrinsics.checkNotNullParameter(featureDiscoveryStore, "featureDiscoveryStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.api = api;
        this.homeDashboardStore = homeDashboardStore;
        this.featureDiscoveryStore = featureDiscoveryStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        fetchOutro();
    }

    /* compiled from: JointAccountOnboardingPrimaryOutroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.outro.primary.JointAccountOnboardingPrimaryOutroDuxo$fetchOutro$1", m3645f = "JointAccountOnboardingPrimaryOutroDuxo.kt", m3646l = {53}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.outro.primary.JointAccountOnboardingPrimaryOutroDuxo$fetchOutro$1 */
    static final class C201451 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C201451(Continuation<? super C201451> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return JointAccountOnboardingPrimaryOutroDuxo.this.new C201451(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C201451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: JointAccountOnboardingPrimaryOutroDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/jointaccounts/onboarding/outro/primary/PrimaryOutroViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.outro.primary.JointAccountOnboardingPrimaryOutroDuxo$fetchOutro$1$1", m3645f = "JointAccountOnboardingPrimaryOutroDuxo.kt", m3646l = {40}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.jointaccounts.onboarding.outro.primary.JointAccountOnboardingPrimaryOutroDuxo$fetchOutro$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function1<Continuation<? super PrimaryOutroViewState>, Object> {
            int label;
            final /* synthetic */ JointAccountOnboardingPrimaryOutroDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(JointAccountOnboardingPrimaryOutroDuxo jointAccountOnboardingPrimaryOutroDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
                this.this$0 = jointAccountOnboardingPrimaryOutroDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super PrimaryOutroViewState> continuation) {
                return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    JointAccountsApi jointAccountsApi = this.this$0.api;
                    String invitationId = ((JointAccountOnboardingPrimaryOutro) JointAccountOnboardingPrimaryOutroDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getInvitationId();
                    this.label = 1;
                    obj = jointAccountsApi.getPrimaryOnboardingPostAgreements(invitationId, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.this$0.featureDiscoveryStore.clearCache();
                this.this$0.homeDashboardStore.forceRefresh();
                return new PrimaryOutroViewState((ApiJointAccountOnboardingPrimaryPostAgreementsViewModel) obj, ((JointAccountOnboardingPrimaryOutro) JointAccountOnboardingPrimaryOutroDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getSource());
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFlowCatching = AsyncResult2.flowCatching(new AnonymousClass1(JointAccountOnboardingPrimaryOutroDuxo.this, null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(JointAccountOnboardingPrimaryOutroDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowFlowCatching, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: JointAccountOnboardingPrimaryOutroDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "result", "Lcom/robinhood/store/AsyncResult;", "Lcom/robinhood/android/jointaccounts/onboarding/outro/primary/PrimaryOutroViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.outro.primary.JointAccountOnboardingPrimaryOutroDuxo$fetchOutro$1$2", m3645f = "JointAccountOnboardingPrimaryOutroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.jointaccounts.onboarding.outro.primary.JointAccountOnboardingPrimaryOutroDuxo$fetchOutro$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<AsyncResult<? extends PrimaryOutroViewState>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ JointAccountOnboardingPrimaryOutroDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(JointAccountOnboardingPrimaryOutroDuxo jointAccountOnboardingPrimaryOutroDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = jointAccountOnboardingPrimaryOutroDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(AsyncResult<PrimaryOutroViewState> asyncResult, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(asyncResult, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(AsyncResult<? extends PrimaryOutroViewState> asyncResult, Continuation<? super Unit> continuation) {
                return invoke2((AsyncResult<PrimaryOutroViewState>) asyncResult, continuation);
            }

            /* compiled from: JointAccountOnboardingPrimaryOutroDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/store/AsyncResult;", "Lcom/robinhood/android/jointaccounts/onboarding/outro/primary/PrimaryOutroViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.outro.primary.JointAccountOnboardingPrimaryOutroDuxo$fetchOutro$1$2$1", m3645f = "JointAccountOnboardingPrimaryOutroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.jointaccounts.onboarding.outro.primary.JointAccountOnboardingPrimaryOutroDuxo$fetchOutro$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AsyncResult<? extends PrimaryOutroViewState>, Continuation<? super AsyncResult<? extends PrimaryOutroViewState>>, Object> {
                final /* synthetic */ AsyncResult<PrimaryOutroViewState> $result;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AsyncResult<PrimaryOutroViewState> asyncResult, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$result = asyncResult;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$result, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(AsyncResult<PrimaryOutroViewState> asyncResult, Continuation<? super AsyncResult<PrimaryOutroViewState>> continuation) {
                    return ((AnonymousClass1) create(asyncResult, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(AsyncResult<? extends PrimaryOutroViewState> asyncResult, Continuation<? super AsyncResult<? extends PrimaryOutroViewState>> continuation) {
                    return invoke2((AsyncResult<PrimaryOutroViewState>) asyncResult, (Continuation<? super AsyncResult<PrimaryOutroViewState>>) continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return UtilsKt.takeMostRelevantState((AsyncResult) this.L$0, this.$result);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((AsyncResult) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void fetchOutro() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C201451(null), 3, null);
    }

    /* compiled from: JointAccountOnboardingPrimaryOutroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/outro/primary/JointAccountOnboardingPrimaryOutroDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/jointaccounts/onboarding/outro/primary/JointAccountOnboardingPrimaryOutroDuxo;", "Lcom/robinhood/android/account/contracts/jointaccounts/JointAccountOnboardingPrimaryOutro;", "<init>", "()V", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<JointAccountOnboardingPrimaryOutroDuxo, JointAccountOnboardingPrimaryOutro> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public JointAccountOnboardingPrimaryOutro getArgs(SavedStateHandle savedStateHandle) {
            return (JointAccountOnboardingPrimaryOutro) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public JointAccountOnboardingPrimaryOutro getArgs(JointAccountOnboardingPrimaryOutroDuxo jointAccountOnboardingPrimaryOutroDuxo) {
            return (JointAccountOnboardingPrimaryOutro) DuxoCompanion.DefaultImpls.getArgs(this, jointAccountOnboardingPrimaryOutroDuxo);
        }
    }
}
