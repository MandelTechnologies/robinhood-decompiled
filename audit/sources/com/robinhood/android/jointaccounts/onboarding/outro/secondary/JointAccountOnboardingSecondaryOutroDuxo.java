package com.robinhood.android.jointaccounts.onboarding.outro.secondary;

import androidx.lifecycle.SavedStateHandle;
import bonfire.proto.idl.joint_accounts_onboarding.p035v1.FetchSecondaryPostAgreementsRequestDto;
import bonfire.proto.idl.joint_accounts_onboarding.p035v1.FetchSecondaryPostAgreementsResponseDto;
import bonfire.proto.idl.joint_accounts_onboarding.p035v1.JointAccountsOnboardingService;
import com.robinhood.android.account.contracts.jointaccounts.JointAccountOnboardingSecondaryOutro;
import com.robinhood.android.dashboard.store.HomeDashboardStore;
import com.robinhood.android.jointaccounts.onboarding.creation.JointAccountCreatedViewState;
import com.robinhood.android.jointaccounts.onboarding.creation.UtilsKt;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.account.creation.AccountCreationState;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.FeatureDiscoveryStore;
import com.robinhood.models.api.BrokerageAccountType;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: JointAccountOnboardingSecondaryOutroDuxo.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001cB9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0006\u0010\u0019\u001a\u00020\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0016J\u0006\u0010\u001b\u001a\u00020\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/outro/secondary/JointAccountOnboardingSecondaryOutroDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/jointaccounts/onboarding/outro/secondary/JointAccountOnboardingSecondaryOutroDataState;", "Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCreatedViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "homeDashboardStore", "Lcom/robinhood/android/dashboard/store/HomeDashboardStore;", "featureDiscoveryStore", "Lcom/robinhood/librobinhood/data/store/FeatureDiscoveryStore;", "service", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/JointAccountsOnboardingService;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/dashboard/store/HomeDashboardStore;Lcom/robinhood/librobinhood/data/store/FeatureDiscoveryStore;Lbonfire/proto/idl/joint_accounts_onboarding/v1/JointAccountsOnboardingService;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "handleResult", "", "state", "Lcom/robinhood/android/lib/account/creation/AccountCreationState;", "retryFetchAccount", "onStart", "fetchOutro", "Companion", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class JointAccountOnboardingSecondaryOutroDuxo extends BaseDuxo<JointAccountOnboardingSecondaryOutroDataState, JointAccountCreatedViewState> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final FeatureDiscoveryStore featureDiscoveryStore;
    private final HomeDashboardStore homeDashboardStore;
    private final SavedStateHandle savedStateHandle;
    private final JointAccountsOnboardingService service;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JointAccountOnboardingSecondaryOutroDuxo(AccountProvider accountProvider, HomeDashboardStore homeDashboardStore, FeatureDiscoveryStore featureDiscoveryStore, JointAccountsOnboardingService service, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new JointAccountOnboardingSecondaryOutroDataState(null, 0, null, null, 15, null), JointAccountOnboardingSecondaryOutroDataState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(homeDashboardStore, "homeDashboardStore");
        Intrinsics.checkNotNullParameter(featureDiscoveryStore, "featureDiscoveryStore");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.homeDashboardStore = homeDashboardStore;
        this.featureDiscoveryStore = featureDiscoveryStore;
        this.service = service;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: JointAccountOnboardingSecondaryOutroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/jointaccounts/onboarding/outro/secondary/JointAccountOnboardingSecondaryOutroDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.outro.secondary.JointAccountOnboardingSecondaryOutroDuxo$handleResult$1", m3645f = "JointAccountOnboardingSecondaryOutroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.outro.secondary.JointAccountOnboardingSecondaryOutroDuxo$handleResult$1 */
    static final class C201641 extends ContinuationImpl7 implements Function2<JointAccountOnboardingSecondaryOutroDataState, Continuation<? super JointAccountOnboardingSecondaryOutroDataState>, Object> {
        final /* synthetic */ AccountCreationState $state;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C201641(AccountCreationState accountCreationState, Continuation<? super C201641> continuation) {
            super(2, continuation);
            this.$state = accountCreationState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C201641 c201641 = new C201641(this.$state, continuation);
            c201641.L$0 = obj;
            return c201641;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(JointAccountOnboardingSecondaryOutroDataState jointAccountOnboardingSecondaryOutroDataState, Continuation<? super JointAccountOnboardingSecondaryOutroDataState> continuation) {
            return ((C201641) create(jointAccountOnboardingSecondaryOutroDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            JointAccountOnboardingSecondaryOutroDataState jointAccountOnboardingSecondaryOutroDataState = (JointAccountOnboardingSecondaryOutroDataState) this.L$0;
            return JointAccountOnboardingSecondaryOutroDataState.copy$default(jointAccountOnboardingSecondaryOutroDataState, null, jointAccountOnboardingSecondaryOutroDataState.getAttempts() + 1, this.$state, null, 9, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleResult(AccountCreationState state) {
        applyMutation(new C201641(state, null));
        UtilsKt.updateDashboard(this.homeDashboardStore, state);
    }

    /* compiled from: JointAccountOnboardingSecondaryOutroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/jointaccounts/onboarding/outro/secondary/JointAccountOnboardingSecondaryOutroDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.outro.secondary.JointAccountOnboardingSecondaryOutroDuxo$retryFetchAccount$1", m3645f = "JointAccountOnboardingSecondaryOutroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.outro.secondary.JointAccountOnboardingSecondaryOutroDuxo$retryFetchAccount$1 */
    static final class C201651 extends ContinuationImpl7 implements Function2<JointAccountOnboardingSecondaryOutroDataState, Continuation<? super JointAccountOnboardingSecondaryOutroDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C201651(Continuation<? super C201651> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C201651 c201651 = new C201651(continuation);
            c201651.L$0 = obj;
            return c201651;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(JointAccountOnboardingSecondaryOutroDataState jointAccountOnboardingSecondaryOutroDataState, Continuation<? super JointAccountOnboardingSecondaryOutroDataState> continuation) {
            return ((C201651) create(jointAccountOnboardingSecondaryOutroDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return JointAccountOnboardingSecondaryOutroDataState.copy$default((JointAccountOnboardingSecondaryOutroDataState) this.L$0, null, 0, AccountCreationState.Polling.INSTANCE, null, 11, null);
        }
    }

    public final void retryFetchAccount() {
        applyMutation(new C201651(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C201662(null), 3, null);
    }

    /* compiled from: JointAccountOnboardingSecondaryOutroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.outro.secondary.JointAccountOnboardingSecondaryOutroDuxo$retryFetchAccount$2", m3645f = "JointAccountOnboardingSecondaryOutroDuxo.kt", m3646l = {58}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.outro.secondary.JointAccountOnboardingSecondaryOutroDuxo$retryFetchAccount$2 */
    static final class C201662 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C201662(Continuation<? super C201662> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return JointAccountOnboardingSecondaryOutroDuxo.this.new C201662(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C201662) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C201662 c201662;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccountProvider accountProvider = JointAccountOnboardingSecondaryOutroDuxo.this.accountProvider;
                BrokerageAccountType brokerageAccountType = BrokerageAccountType.JOINT_TENANCY_WITH_ROS;
                this.label = 1;
                c201662 = this;
                obj = com.robinhood.android.lib.account.creation.UtilsKt.pollForAccount$default(accountProvider, brokerageAccountType, null, c201662, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c201662 = this;
            }
            JointAccountOnboardingSecondaryOutroDuxo.this.handleResult((AccountCreationState) obj);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        fetchOutro();
    }

    /* compiled from: JointAccountOnboardingSecondaryOutroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/jointaccounts/onboarding/outro/secondary/JointAccountOnboardingSecondaryOutroDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.outro.secondary.JointAccountOnboardingSecondaryOutroDuxo$fetchOutro$1", m3645f = "JointAccountOnboardingSecondaryOutroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.outro.secondary.JointAccountOnboardingSecondaryOutroDuxo$fetchOutro$1 */
    static final class C201621 extends ContinuationImpl7 implements Function2<JointAccountOnboardingSecondaryOutroDataState, Continuation<? super JointAccountOnboardingSecondaryOutroDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C201621(Continuation<? super C201621> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C201621 c201621 = new C201621(continuation);
            c201621.L$0 = obj;
            return c201621;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(JointAccountOnboardingSecondaryOutroDataState jointAccountOnboardingSecondaryOutroDataState, Continuation<? super JointAccountOnboardingSecondaryOutroDataState> continuation) {
            return ((C201621) create(jointAccountOnboardingSecondaryOutroDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return JointAccountOnboardingSecondaryOutroDataState.copy$default((JointAccountOnboardingSecondaryOutroDataState) this.L$0, null, 0, AccountCreationState.Polling.INSTANCE, null, 3, null);
        }
    }

    public final void fetchOutro() {
        applyMutation(new C201621(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C201632(null), 3, null);
    }

    /* compiled from: JointAccountOnboardingSecondaryOutroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.outro.secondary.JointAccountOnboardingSecondaryOutroDuxo$fetchOutro$2", m3645f = "JointAccountOnboardingSecondaryOutroDuxo.kt", m3646l = {79, 88}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.outro.secondary.JointAccountOnboardingSecondaryOutroDuxo$fetchOutro$2 */
    static final class C201632 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C201632(Continuation<? super C201632> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return JointAccountOnboardingSecondaryOutroDuxo.this.new C201632(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C201632) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
        
            if (r11 == r0) goto L24;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Exception exc;
            C201632 c201632;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Exception e) {
                e = e;
            }
            if (i != 0) {
                try {
                } catch (Exception e2) {
                    exc = e2;
                    c201632 = this;
                    JointAccountOnboardingSecondaryOutroDuxo.this.applyMutation(new AnonymousClass2(exc, null));
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    c201632 = this;
                    JointAccountOnboardingSecondaryOutroDuxo.this.handleResult((AccountCreationState) obj);
                    JointAccountOnboardingSecondaryOutroDuxo.this.featureDiscoveryStore.clearCache();
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                try {
                    JointAccountsOnboardingService jointAccountsOnboardingService = JointAccountOnboardingSecondaryOutroDuxo.this.service;
                    FetchSecondaryPostAgreementsRequestDto fetchSecondaryPostAgreementsRequestDto = new FetchSecondaryPostAgreementsRequestDto(((JointAccountOnboardingSecondaryOutro) JointAccountOnboardingSecondaryOutroDuxo.INSTANCE.getArgs((HasSavedState) JointAccountOnboardingSecondaryOutroDuxo.this)).getInvitationId());
                    this.label = 1;
                    obj = jointAccountsOnboardingService.FetchSecondaryPostAgreements(fetchSecondaryPostAgreementsRequestDto, this);
                    if (obj == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                } catch (Exception e3) {
                    e = e3;
                    c201632 = this;
                    exc = e;
                    JointAccountOnboardingSecondaryOutroDuxo.this.applyMutation(new AnonymousClass2(exc, null));
                    return Unit.INSTANCE;
                }
            }
            FetchSecondaryPostAgreementsResponseDto fetchSecondaryPostAgreementsResponseDto = (FetchSecondaryPostAgreementsResponseDto) obj;
            JointAccountOnboardingSecondaryOutroDuxo.this.applyMutation(new AnonymousClass1(fetchSecondaryPostAgreementsResponseDto, null));
            if (fetchSecondaryPostAgreementsResponseDto.getInvitation_completed()) {
                AccountProvider accountProvider = JointAccountOnboardingSecondaryOutroDuxo.this.accountProvider;
                BrokerageAccountType brokerageAccountType = BrokerageAccountType.JOINT_TENANCY_WITH_ROS;
                this.label = 2;
                c201632 = this;
                obj = com.robinhood.android.lib.account.creation.UtilsKt.pollForAccount$default(accountProvider, brokerageAccountType, null, c201632, 2, null);
            } else {
                c201632 = this;
                JointAccountOnboardingSecondaryOutroDuxo.this.homeDashboardStore.forceRefresh();
                JointAccountOnboardingSecondaryOutroDuxo.this.featureDiscoveryStore.clearCache();
                return Unit.INSTANCE;
            }
        }

        /* compiled from: JointAccountOnboardingSecondaryOutroDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/jointaccounts/onboarding/outro/secondary/JointAccountOnboardingSecondaryOutroDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.outro.secondary.JointAccountOnboardingSecondaryOutroDuxo$fetchOutro$2$1", m3645f = "JointAccountOnboardingSecondaryOutroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.jointaccounts.onboarding.outro.secondary.JointAccountOnboardingSecondaryOutroDuxo$fetchOutro$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<JointAccountOnboardingSecondaryOutroDataState, Continuation<? super JointAccountOnboardingSecondaryOutroDataState>, Object> {
            final /* synthetic */ FetchSecondaryPostAgreementsResponseDto $response;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(FetchSecondaryPostAgreementsResponseDto fetchSecondaryPostAgreementsResponseDto, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$response = fetchSecondaryPostAgreementsResponseDto;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$response, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(JointAccountOnboardingSecondaryOutroDataState jointAccountOnboardingSecondaryOutroDataState, Continuation<? super JointAccountOnboardingSecondaryOutroDataState> continuation) {
                return ((AnonymousClass1) create(jointAccountOnboardingSecondaryOutroDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return JointAccountOnboardingSecondaryOutroDataState.copy$default((JointAccountOnboardingSecondaryOutroDataState) this.L$0, this.$response, 0, null, null, 14, null);
            }
        }

        /* compiled from: JointAccountOnboardingSecondaryOutroDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/jointaccounts/onboarding/outro/secondary/JointAccountOnboardingSecondaryOutroDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.outro.secondary.JointAccountOnboardingSecondaryOutroDuxo$fetchOutro$2$2", m3645f = "JointAccountOnboardingSecondaryOutroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.jointaccounts.onboarding.outro.secondary.JointAccountOnboardingSecondaryOutroDuxo$fetchOutro$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<JointAccountOnboardingSecondaryOutroDataState, Continuation<? super JointAccountOnboardingSecondaryOutroDataState>, Object> {

            /* renamed from: $e */
            final /* synthetic */ Exception f4262$e;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Exception exc, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.f4262$e = exc;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f4262$e, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(JointAccountOnboardingSecondaryOutroDataState jointAccountOnboardingSecondaryOutroDataState, Continuation<? super JointAccountOnboardingSecondaryOutroDataState> continuation) {
                return ((AnonymousClass2) create(jointAccountOnboardingSecondaryOutroDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return JointAccountOnboardingSecondaryOutroDataState.copy$default((JointAccountOnboardingSecondaryOutroDataState) this.L$0, null, 0, null, this.f4262$e, 7, null);
            }
        }
    }

    /* compiled from: JointAccountOnboardingSecondaryOutroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/outro/secondary/JointAccountOnboardingSecondaryOutroDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/jointaccounts/onboarding/outro/secondary/JointAccountOnboardingSecondaryOutroDuxo;", "Lcom/robinhood/android/account/contracts/jointaccounts/JointAccountOnboardingSecondaryOutro;", "<init>", "()V", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<JointAccountOnboardingSecondaryOutroDuxo, JointAccountOnboardingSecondaryOutro> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public JointAccountOnboardingSecondaryOutro getArgs(SavedStateHandle savedStateHandle) {
            return (JointAccountOnboardingSecondaryOutro) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public JointAccountOnboardingSecondaryOutro getArgs(JointAccountOnboardingSecondaryOutroDuxo jointAccountOnboardingSecondaryOutroDuxo) {
            return (JointAccountOnboardingSecondaryOutro) DuxoCompanion.DefaultImpls.getArgs(this, jointAccountOnboardingSecondaryOutroDuxo);
        }
    }
}
