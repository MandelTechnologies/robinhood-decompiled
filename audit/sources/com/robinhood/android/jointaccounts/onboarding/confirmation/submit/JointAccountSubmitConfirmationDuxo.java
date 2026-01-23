package com.robinhood.android.jointaccounts.onboarding.confirmation.submit;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.dashboard.store.HomeDashboardStore;
import com.robinhood.android.jointaccounts.api.JointAccountsApi;
import com.robinhood.android.jointaccounts.onboarding.confirmation.submit.JointAccountSubmitConfirmationFragment;
import com.robinhood.android.jointaccounts.onboarding.creation.JointAccountCreatedViewState;
import com.robinhood.android.jointaccounts.onboarding.creation.UtilsKt;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.account.creation.AccountCreationState;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.jointaccounts.api.confirmation.ApiConfirmSecondarySubmittedViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: JointAccountSubmitConfirmationDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001cB1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0006\u0010\u0017\u001a\u00020\u0014J\u0006\u0010\u0018\u001a\u00020\u0014J\u000e\u0010\u0019\u001a\u00020\u0014H\u0082@¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0014H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/confirmation/submit/JointAccountSubmitConfirmationDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/jointaccounts/onboarding/confirmation/submit/JointAccountSubmitConfirmationDataState;", "Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCreatedViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "homeDashboardStore", "Lcom/robinhood/android/dashboard/store/HomeDashboardStore;", "api", "Lcom/robinhood/android/jointaccounts/api/JointAccountsApi;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/dashboard/store/HomeDashboardStore;Lcom/robinhood/android/jointaccounts/api/JointAccountsApi;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "handleResult", "", "state", "Lcom/robinhood/android/lib/account/creation/AccountCreationState;", "retryInitialization", "retryFetchAccount", "makeInitialNetworkRequest", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onStart", "Companion", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class JointAccountSubmitConfirmationDuxo extends BaseDuxo<JointAccountSubmitConfirmationDataState, JointAccountCreatedViewState> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final JointAccountsApi api;
    private final HomeDashboardStore homeDashboardStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: JointAccountSubmitConfirmationDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.confirmation.submit.JointAccountSubmitConfirmationDuxo", m3645f = "JointAccountSubmitConfirmationDuxo.kt", m3646l = {79, 85}, m3647m = "makeInitialNetworkRequest")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.confirmation.submit.JointAccountSubmitConfirmationDuxo$makeInitialNetworkRequest$1 */
    static final class C200301 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C200301(Continuation<? super C200301> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return JointAccountSubmitConfirmationDuxo.this.makeInitialNetworkRequest(this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JointAccountSubmitConfirmationDuxo(AccountProvider accountProvider, HomeDashboardStore homeDashboardStore, JointAccountsApi api, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new JointAccountSubmitConfirmationDataState(((JointAccountSubmitConfirmationFragment.Args) INSTANCE.getArgs(savedStateHandle)).getSource(), false, null, 0, null, null, 62, null), JointAccountSubmitConfirmationDataState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(homeDashboardStore, "homeDashboardStore");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.homeDashboardStore = homeDashboardStore;
        this.api = api;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: JointAccountSubmitConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/jointaccounts/onboarding/confirmation/submit/JointAccountSubmitConfirmationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.confirmation.submit.JointAccountSubmitConfirmationDuxo$handleResult$1", m3645f = "JointAccountSubmitConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.confirmation.submit.JointAccountSubmitConfirmationDuxo$handleResult$1 */
    static final class C200291 extends ContinuationImpl7 implements Function2<JointAccountSubmitConfirmationDataState, Continuation<? super JointAccountSubmitConfirmationDataState>, Object> {
        final /* synthetic */ AccountCreationState $state;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C200291(AccountCreationState accountCreationState, Continuation<? super C200291> continuation) {
            super(2, continuation);
            this.$state = accountCreationState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C200291 c200291 = new C200291(this.$state, continuation);
            c200291.L$0 = obj;
            return c200291;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(JointAccountSubmitConfirmationDataState jointAccountSubmitConfirmationDataState, Continuation<? super JointAccountSubmitConfirmationDataState> continuation) {
            return ((C200291) create(jointAccountSubmitConfirmationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            JointAccountSubmitConfirmationDataState jointAccountSubmitConfirmationDataState = (JointAccountSubmitConfirmationDataState) this.L$0;
            return JointAccountSubmitConfirmationDataState.copy$default(jointAccountSubmitConfirmationDataState, null, false, null, jointAccountSubmitConfirmationDataState.getAttempts() + 1, this.$state, null, 39, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleResult(AccountCreationState state) {
        applyMutation(new C200291(state, null));
        UtilsKt.updateDashboard(this.homeDashboardStore, state);
    }

    /* compiled from: JointAccountSubmitConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.confirmation.submit.JointAccountSubmitConfirmationDuxo$retryInitialization$1", m3645f = "JointAccountSubmitConfirmationDuxo.kt", m3646l = {53}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.confirmation.submit.JointAccountSubmitConfirmationDuxo$retryInitialization$1 */
    static final class C200381 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C200381(Continuation<? super C200381> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return JointAccountSubmitConfirmationDuxo.this.new C200381(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C200381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                JointAccountSubmitConfirmationDuxo jointAccountSubmitConfirmationDuxo = JointAccountSubmitConfirmationDuxo.this;
                this.label = 1;
                if (jointAccountSubmitConfirmationDuxo.makeInitialNetworkRequest(this) == coroutine_suspended) {
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

    public final void retryInitialization() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C200381(null), 3, null);
    }

    /* compiled from: JointAccountSubmitConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/jointaccounts/onboarding/confirmation/submit/JointAccountSubmitConfirmationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.confirmation.submit.JointAccountSubmitConfirmationDuxo$retryFetchAccount$1", m3645f = "JointAccountSubmitConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.confirmation.submit.JointAccountSubmitConfirmationDuxo$retryFetchAccount$1 */
    static final class C200361 extends ContinuationImpl7 implements Function2<JointAccountSubmitConfirmationDataState, Continuation<? super JointAccountSubmitConfirmationDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C200361(Continuation<? super C200361> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C200361 c200361 = new C200361(continuation);
            c200361.L$0 = obj;
            return c200361;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(JointAccountSubmitConfirmationDataState jointAccountSubmitConfirmationDataState, Continuation<? super JointAccountSubmitConfirmationDataState> continuation) {
            return ((C200361) create(jointAccountSubmitConfirmationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return JointAccountSubmitConfirmationDataState.copy$default((JointAccountSubmitConfirmationDataState) this.L$0, null, false, null, 0, AccountCreationState.Polling.INSTANCE, null, 47, null);
        }
    }

    public final void retryFetchAccount() {
        applyMutation(new C200361(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C200372(null), 3, null);
    }

    /* compiled from: JointAccountSubmitConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.confirmation.submit.JointAccountSubmitConfirmationDuxo$retryFetchAccount$2", m3645f = "JointAccountSubmitConfirmationDuxo.kt", m3646l = {64}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.confirmation.submit.JointAccountSubmitConfirmationDuxo$retryFetchAccount$2 */
    static final class C200372 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C200372(Continuation<? super C200372> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return JointAccountSubmitConfirmationDuxo.this.new C200372(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C200372) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C200372 c200372;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccountProvider accountProvider = JointAccountSubmitConfirmationDuxo.this.accountProvider;
                BrokerageAccountType brokerageAccountType = BrokerageAccountType.JOINT_TENANCY_WITH_ROS;
                this.label = 1;
                c200372 = this;
                obj = com.robinhood.android.lib.account.creation.UtilsKt.pollForAccount$default(accountProvider, brokerageAccountType, null, c200372, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c200372 = this;
            }
            JointAccountSubmitConfirmationDuxo.this.handleResult((AccountCreationState) obj);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: JointAccountSubmitConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/jointaccounts/onboarding/confirmation/submit/JointAccountSubmitConfirmationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.confirmation.submit.JointAccountSubmitConfirmationDuxo$makeInitialNetworkRequest$2", m3645f = "JointAccountSubmitConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.confirmation.submit.JointAccountSubmitConfirmationDuxo$makeInitialNetworkRequest$2 */
    static final class C200312 extends ContinuationImpl7 implements Function2<JointAccountSubmitConfirmationDataState, Continuation<? super JointAccountSubmitConfirmationDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C200312(Continuation<? super C200312> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C200312 c200312 = new C200312(continuation);
            c200312.L$0 = obj;
            return c200312;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(JointAccountSubmitConfirmationDataState jointAccountSubmitConfirmationDataState, Continuation<? super JointAccountSubmitConfirmationDataState> continuation) {
            return ((C200312) create(jointAccountSubmitConfirmationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return JointAccountSubmitConfirmationDataState.copy$default((JointAccountSubmitConfirmationDataState) this.L$0, null, false, null, 0, AccountCreationState.Polling.INSTANCE, null, 15, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        if (r9 == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object makeInitialNetworkRequest(Continuation<? super Unit> continuation) {
        C200301 c200301;
        if (continuation instanceof C200301) {
            c200301 = (C200301) continuation;
            int i = c200301.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c200301.label = i - Integer.MIN_VALUE;
            } else {
                c200301 = new C200301(continuation);
            }
        }
        C200301 c2003012 = c200301;
        Object objConfirmSecondary = c2003012.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c2003012.label;
        try {
        } catch (Exception e) {
            applyMutation(new C200334(e, null));
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(objConfirmSecondary);
            applyMutation(new C200312(null));
            JointAccountsApi jointAccountsApi = this.api;
            String invitationId = ((JointAccountSubmitConfirmationFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getInvitationId();
            c2003012.label = 1;
            objConfirmSecondary = jointAccountsApi.confirmSecondary(invitationId, c2003012);
            if (objConfirmSecondary == coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objConfirmSecondary);
            handleResult((AccountCreationState) objConfirmSecondary);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objConfirmSecondary);
        applyMutation(new C200323((ApiConfirmSecondarySubmittedViewModel) objConfirmSecondary, null));
        AccountProvider accountProvider = this.accountProvider;
        BrokerageAccountType brokerageAccountType = BrokerageAccountType.JOINT_TENANCY_WITH_ROS;
        c2003012.label = 2;
        objConfirmSecondary = com.robinhood.android.lib.account.creation.UtilsKt.pollForAccount$default(accountProvider, brokerageAccountType, null, c2003012, 2, null);
    }

    /* compiled from: JointAccountSubmitConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/jointaccounts/onboarding/confirmation/submit/JointAccountSubmitConfirmationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.confirmation.submit.JointAccountSubmitConfirmationDuxo$makeInitialNetworkRequest$3", m3645f = "JointAccountSubmitConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.confirmation.submit.JointAccountSubmitConfirmationDuxo$makeInitialNetworkRequest$3 */
    static final class C200323 extends ContinuationImpl7 implements Function2<JointAccountSubmitConfirmationDataState, Continuation<? super JointAccountSubmitConfirmationDataState>, Object> {
        final /* synthetic */ ApiConfirmSecondarySubmittedViewModel $response;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C200323(ApiConfirmSecondarySubmittedViewModel apiConfirmSecondarySubmittedViewModel, Continuation<? super C200323> continuation) {
            super(2, continuation);
            this.$response = apiConfirmSecondarySubmittedViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C200323 c200323 = new C200323(this.$response, continuation);
            c200323.L$0 = obj;
            return c200323;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(JointAccountSubmitConfirmationDataState jointAccountSubmitConfirmationDataState, Continuation<? super JointAccountSubmitConfirmationDataState> continuation) {
            return ((C200323) create(jointAccountSubmitConfirmationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return JointAccountSubmitConfirmationDataState.copy$default((JointAccountSubmitConfirmationDataState) this.L$0, null, false, this.$response, 0, null, null, 59, null);
        }
    }

    /* compiled from: JointAccountSubmitConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/jointaccounts/onboarding/confirmation/submit/JointAccountSubmitConfirmationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.confirmation.submit.JointAccountSubmitConfirmationDuxo$makeInitialNetworkRequest$4", m3645f = "JointAccountSubmitConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.confirmation.submit.JointAccountSubmitConfirmationDuxo$makeInitialNetworkRequest$4 */
    static final class C200334 extends ContinuationImpl7 implements Function2<JointAccountSubmitConfirmationDataState, Continuation<? super JointAccountSubmitConfirmationDataState>, Object> {

        /* renamed from: $e */
        final /* synthetic */ Exception f4261$e;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C200334(Exception exc, Continuation<? super C200334> continuation) {
            super(2, continuation);
            this.f4261$e = exc;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C200334 c200334 = new C200334(this.f4261$e, continuation);
            c200334.L$0 = obj;
            return c200334;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(JointAccountSubmitConfirmationDataState jointAccountSubmitConfirmationDataState, Continuation<? super JointAccountSubmitConfirmationDataState> continuation) {
            return ((C200334) create(jointAccountSubmitConfirmationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return JointAccountSubmitConfirmationDataState.copy$default((JointAccountSubmitConfirmationDataState) this.L$0, null, false, null, 0, null, this.f4261$e, 31, null);
        }
    }

    /* compiled from: JointAccountSubmitConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.confirmation.submit.JointAccountSubmitConfirmationDuxo$onStart$1", m3645f = "JointAccountSubmitConfirmationDuxo.kt", m3646l = {99}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.confirmation.submit.JointAccountSubmitConfirmationDuxo$onStart$1 */
    static final class C200341 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C200341(Continuation<? super C200341> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return JointAccountSubmitConfirmationDuxo.this.new C200341(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C200341) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                JointAccountSubmitConfirmationDuxo jointAccountSubmitConfirmationDuxo = JointAccountSubmitConfirmationDuxo.this;
                this.label = 1;
                if (jointAccountSubmitConfirmationDuxo.makeInitialNetworkRequest(this) == coroutine_suspended) {
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
        getLifecycleScope().launchWhenStarted(new C200341(null));
        getLifecycleScope().launchWhenStarted(new C200352(null));
    }

    /* compiled from: JointAccountSubmitConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.confirmation.submit.JointAccountSubmitConfirmationDuxo$onStart$2", m3645f = "JointAccountSubmitConfirmationDuxo.kt", m3646l = {103}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.confirmation.submit.JointAccountSubmitConfirmationDuxo$onStart$2 */
    static final class C200352 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C200352(Continuation<? super C200352> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return JointAccountSubmitConfirmationDuxo.this.new C200352(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C200352) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(5000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            JointAccountSubmitConfirmationDuxo.this.applyMutation(new AnonymousClass1(null));
            return Unit.INSTANCE;
        }

        /* compiled from: JointAccountSubmitConfirmationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/jointaccounts/onboarding/confirmation/submit/JointAccountSubmitConfirmationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.confirmation.submit.JointAccountSubmitConfirmationDuxo$onStart$2$1", m3645f = "JointAccountSubmitConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.jointaccounts.onboarding.confirmation.submit.JointAccountSubmitConfirmationDuxo$onStart$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<JointAccountSubmitConfirmationDataState, Continuation<? super JointAccountSubmitConfirmationDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(JointAccountSubmitConfirmationDataState jointAccountSubmitConfirmationDataState, Continuation<? super JointAccountSubmitConfirmationDataState> continuation) {
                return ((AnonymousClass1) create(jointAccountSubmitConfirmationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return JointAccountSubmitConfirmationDataState.copy$default((JointAccountSubmitConfirmationDataState) this.L$0, null, true, null, 0, null, null, 61, null);
            }
        }
    }

    /* compiled from: JointAccountSubmitConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/confirmation/submit/JointAccountSubmitConfirmationDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/jointaccounts/onboarding/confirmation/submit/JointAccountSubmitConfirmationDuxo;", "Lcom/robinhood/android/jointaccounts/onboarding/confirmation/submit/JointAccountSubmitConfirmationFragment$Args;", "<init>", "()V", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<JointAccountSubmitConfirmationDuxo, JointAccountSubmitConfirmationFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public JointAccountSubmitConfirmationFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (JointAccountSubmitConfirmationFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public JointAccountSubmitConfirmationFragment.Args getArgs(JointAccountSubmitConfirmationDuxo jointAccountSubmitConfirmationDuxo) {
            return (JointAccountSubmitConfirmationFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, jointAccountSubmitConfirmationDuxo);
        }
    }
}
