package com.robinhood.android.individualaccounts.onboarding.outro;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.dashboard.store.HomeDashboardStore;
import com.robinhood.android.home.contracts.HomeDashboardType;
import com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroDataState;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.account.creation.AccountCreationState;
import com.robinhood.android.lib.account.creation.UtilsKt;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;

/* compiled from: IndividualAccountOutroDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001eB1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0006\u0010\u0018\u001a\u00020\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0002J\b\u0010\u001a\u001a\u00020\u0016H\u0002J\u000e\u0010\u001b\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010\u001cJ\u000e\u0010\u001d\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010\u001cR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroDataState;", "Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "homeDashboardStore", "Lcom/robinhood/android/dashboard/store/HomeDashboardStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/dashboard/store/HomeDashboardStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "pollingJob", "Lkotlinx/coroutines/Job;", "onCreate", "", "onDestroy", "onRefresh", "startPolling", "stopPolling", "showLongLoadingStateAfterDelay", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pollForAccount", "Companion", "feature-individual-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class IndividualAccountOutroDuxo extends BaseDuxo<IndividualAccountOutroDataState, IndividualAccountOutroState3> implements HasSavedState {
    public static final long SHORT_LOADING_TIME_MS = 5000;
    private final AccountProvider accountProvider;
    private final HomeDashboardStore homeDashboardStore;
    private Job pollingJob;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: IndividualAccountOutroDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroDuxo", m3645f = "IndividualAccountOutroDuxo.kt", m3646l = {93}, m3647m = "pollForAccount")
    /* renamed from: com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroDuxo$pollForAccount$1 */
    static final class C189271 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C189271(Continuation<? super C189271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IndividualAccountOutroDuxo.this.pollForAccount(this);
        }
    }

    /* compiled from: IndividualAccountOutroDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroDuxo", m3645f = "IndividualAccountOutroDuxo.kt", m3646l = {86}, m3647m = "showLongLoadingStateAfterDelay")
    /* renamed from: com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroDuxo$showLongLoadingStateAfterDelay$1 */
    static final class C189301 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C189301(Continuation<? super C189301> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IndividualAccountOutroDuxo.this.showLongLoadingStateAfterDelay(this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndividualAccountOutroDuxo(AccountProvider accountProvider, HomeDashboardStore homeDashboardStore, SavedStateHandle savedStateHandle, IndividualAccountOutroState2 stateProvider, DuxoBundle duxoBundle) {
        super(new IndividualAccountOutroDataState(false, null, null, 7, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(homeDashboardStore, "homeDashboardStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.homeDashboardStore = homeDashboardStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        startPolling();
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onDestroy() {
        super.onDestroy();
        stopPolling();
    }

    /* compiled from: IndividualAccountOutroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroDuxo$onRefresh$1", m3645f = "IndividualAccountOutroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroDuxo$onRefresh$1 */
    static final class C189261 extends ContinuationImpl7 implements Function2<IndividualAccountOutroDataState, Continuation<? super IndividualAccountOutroDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C189261(Continuation<? super C189261> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C189261 c189261 = new C189261(continuation);
            c189261.L$0 = obj;
            return c189261;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(IndividualAccountOutroDataState individualAccountOutroDataState, Continuation<? super IndividualAccountOutroDataState> continuation) {
            return ((C189261) create(individualAccountOutroDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return IndividualAccountOutroDataState.copy$default((IndividualAccountOutroDataState) this.L$0, true, null, null, 6, null);
        }
    }

    public final void onRefresh() {
        applyMutation(new C189261(null));
        startPolling();
    }

    private final void startPolling() {
        withDataState(new Function1() { // from class: com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndividualAccountOutroDuxo.startPolling$lambda$0(this.f$0, (IndividualAccountOutroDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startPolling$lambda$0(IndividualAccountOutroDuxo individualAccountOutroDuxo, IndividualAccountOutroDataState currentState) {
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        individualAccountOutroDuxo.stopPolling();
        if (currentState.getAccountNumber() == null) {
            individualAccountOutroDuxo.applyMutation(new IndividualAccountOutroDuxo2(null));
            individualAccountOutroDuxo.pollingJob = BuildersKt__Builders_commonKt.launch$default(individualAccountOutroDuxo.getLifecycleScope(), null, null, new IndividualAccountOutroDuxo3(individualAccountOutroDuxo, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    private final void stopPolling() {
        Job job = this.pollingJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showLongLoadingStateAfterDelay(Continuation<? super Unit> continuation) {
        C189301 c189301;
        if (continuation instanceof C189301) {
            c189301 = (C189301) continuation;
            int i = c189301.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c189301.label = i - Integer.MIN_VALUE;
            } else {
                c189301 = new C189301(continuation);
            }
        }
        Object obj = c189301.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c189301.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c189301.label = 1;
            if (DelayKt.delay(5000L, c189301) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        applyMutation(new C189312(null));
        return Unit.INSTANCE;
    }

    /* compiled from: IndividualAccountOutroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroDuxo$showLongLoadingStateAfterDelay$2", m3645f = "IndividualAccountOutroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroDuxo$showLongLoadingStateAfterDelay$2 */
    static final class C189312 extends ContinuationImpl7 implements Function2<IndividualAccountOutroDataState, Continuation<? super IndividualAccountOutroDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C189312(Continuation<? super C189312> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C189312 c189312 = new C189312(continuation);
            c189312.L$0 = obj;
            return c189312;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(IndividualAccountOutroDataState individualAccountOutroDataState, Continuation<? super IndividualAccountOutroDataState> continuation) {
            return ((C189312) create(individualAccountOutroDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return IndividualAccountOutroDataState.copy$default((IndividualAccountOutroDataState) this.L$0, false, null, IndividualAccountOutroDataState.LoadingState.LONG, 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object pollForAccount(Continuation<? super Unit> continuation) {
        C189271 c189271;
        if (continuation instanceof C189271) {
            c189271 = (C189271) continuation;
            int i = c189271.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c189271.label = i - Integer.MIN_VALUE;
            } else {
                c189271 = new C189271(continuation);
            }
        }
        Object objPollForAccount = c189271.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c189271.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objPollForAccount);
            AccountProvider accountProvider = this.accountProvider;
            BrokerageAccountType brokerageAccountType = BrokerageAccountType.INDIVIDUAL;
            Function1 function1 = new Function1() { // from class: com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroDuxo$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(IndividualAccountOutroDuxo.pollForAccount$lambda$1(this.f$0, (Account) obj));
                }
            };
            c189271.label = 1;
            objPollForAccount = UtilsKt.pollForAccount(accountProvider, brokerageAccountType, function1, c189271);
            if (objPollForAccount == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objPollForAccount);
        }
        AccountCreationState accountCreationState = (AccountCreationState) objPollForAccount;
        if (Intrinsics.areEqual(accountCreationState, AccountCreationState.Absent.INSTANCE) || Intrinsics.areEqual(accountCreationState, AccountCreationState.Failed.INSTANCE)) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new Exception("Individual account was not returned by brokeback endpoint after 15 tries"), false, null, 4, null);
            applyMutation(new C189282(null));
        } else if (accountCreationState instanceof AccountCreationState.Fetched) {
            this.homeDashboardStore.forceRefresh();
            this.homeDashboardStore.setHomeDashboardType(new HomeDashboardType.Account(((AccountCreationState.Fetched) accountCreationState).getAccountNumber()));
            applyMutation(new C189293(accountCreationState, null));
        } else if (!Intrinsics.areEqual(accountCreationState, AccountCreationState.Polling.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean pollForAccount$lambda$1(IndividualAccountOutroDuxo individualAccountOutroDuxo, Account it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getRefId(), ((IndividualAccountOutroFragmentKey) INSTANCE.getArgs((HasSavedState) individualAccountOutroDuxo)).getApplicationId());
    }

    /* compiled from: IndividualAccountOutroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroDuxo$pollForAccount$2", m3645f = "IndividualAccountOutroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroDuxo$pollForAccount$2 */
    static final class C189282 extends ContinuationImpl7 implements Function2<IndividualAccountOutroDataState, Continuation<? super IndividualAccountOutroDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C189282(Continuation<? super C189282> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C189282 c189282 = new C189282(continuation);
            c189282.L$0 = obj;
            return c189282;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(IndividualAccountOutroDataState individualAccountOutroDataState, Continuation<? super IndividualAccountOutroDataState> continuation) {
            return ((C189282) create(individualAccountOutroDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return IndividualAccountOutroDataState.copy$default((IndividualAccountOutroDataState) this.L$0, false, null, IndividualAccountOutroDataState.LoadingState.TIMED_OUT, 3, null);
        }
    }

    /* compiled from: IndividualAccountOutroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroDuxo$pollForAccount$3", m3645f = "IndividualAccountOutroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroDuxo$pollForAccount$3 */
    static final class C189293 extends ContinuationImpl7 implements Function2<IndividualAccountOutroDataState, Continuation<? super IndividualAccountOutroDataState>, Object> {
        final /* synthetic */ AccountCreationState $creationResult;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C189293(AccountCreationState accountCreationState, Continuation<? super C189293> continuation) {
            super(2, continuation);
            this.$creationResult = accountCreationState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C189293 c189293 = new C189293(this.$creationResult, continuation);
            c189293.L$0 = obj;
            return c189293;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(IndividualAccountOutroDataState individualAccountOutroDataState, Continuation<? super IndividualAccountOutroDataState> continuation) {
            return ((C189293) create(individualAccountOutroDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return IndividualAccountOutroDataState.copy$default((IndividualAccountOutroDataState) this.L$0, false, ((AccountCreationState.Fetched) this.$creationResult).getAccountNumber(), null, 5, null);
        }
    }

    /* compiled from: IndividualAccountOutroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroDuxo;", "Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroFragmentKey;", "<init>", "()V", "SHORT_LOADING_TIME_MS", "", "feature-individual-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<IndividualAccountOutroDuxo, IndividualAccountOutroFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public IndividualAccountOutroFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (IndividualAccountOutroFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public IndividualAccountOutroFragmentKey getArgs(IndividualAccountOutroDuxo individualAccountOutroDuxo) {
            return (IndividualAccountOutroFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, individualAccountOutroDuxo);
        }
    }
}
