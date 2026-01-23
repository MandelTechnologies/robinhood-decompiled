package com.robinhood.android.margin.upgrade.jointaccounts;

import androidx.lifecycle.SavedStateHandle;
import bonfire.proto.idl.joint_accounts_onboarding.p035v1.JointAccountCoOwnerQuestionnaireCompletedRequestDto;
import bonfire.proto.idl.joint_accounts_onboarding.p035v1.JointAccountCoOwnerQuestionnaireCompletedResponseDto;
import bonfire.proto.idl.joint_accounts_onboarding.p035v1.JointAccountsOnboardingService;
import bonfire.proto.idl.joint_accounts_onboarding.p035v1.SendCoOwnerIpEmailRequestDto;
import com.robinhood.android.jointaccounts.api.JointAccountsApi;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.margin.upgrade.investorprofile.MarginUpgradeInvestorProfileProductContext;
import com.robinhood.android.margin.upgrade.jointaccounts.MarginUpgradeJointAccountCoOwnerEvent;
import com.robinhood.android.margin.upgrade.jointaccounts.MarginUpgradeJointAccountCoOwnerValidationFragment;
import com.robinhood.android.margin.upgrade.jointaccounts.MarginUpgradeJointAccountCoOwnerValidationViewState;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.jointaccounts.api.users.ApiJointUserInfo;
import com.robinhood.models.jointaccounts.api.users.ApiJointUsers;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.store.user.UserStore;
import io.reactivex.Observable;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: MarginUpgradeJointAccountCoOwnerValidationDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0018B9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0006\u0010\u0017\u001a\u00020\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/jointaccounts/MarginUpgradeJointAccountCoOwnerValidationDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/margin/upgrade/jointaccounts/MarginUpgradeJointAccountCoOwnerValidationViewState;", "Lcom/robinhood/android/margin/upgrade/jointaccounts/MarginUpgradeJointAccountCoOwnerEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "jointAccountsApi", "Lcom/robinhood/android/jointaccounts/api/JointAccountsApi;", "jointAccountsOnboardingService", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/JointAccountsOnboardingService;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/jointaccounts/api/JointAccountsApi;Lbonfire/proto/idl/joint_accounts_onboarding/v1/JointAccountsOnboardingService;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "onSendEmailToCoOwner", "Companion", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MarginUpgradeJointAccountCoOwnerValidationDuxo extends BaseDuxo5<MarginUpgradeJointAccountCoOwnerValidationViewState, MarginUpgradeJointAccountCoOwnerEvent> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final JointAccountsApi jointAccountsApi;
    private final JointAccountsOnboardingService jointAccountsOnboardingService;
    private final SavedStateHandle savedStateHandle;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginUpgradeJointAccountCoOwnerValidationDuxo(AccountProvider accountProvider, JointAccountsApi jointAccountsApi, JointAccountsOnboardingService jointAccountsOnboardingService, UserStore userStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new MarginUpgradeJointAccountCoOwnerValidationViewState(MarginUpgradeJointAccountCoOwnerValidationViewState.State.Loading.INSTANCE, false, 2, null), duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(jointAccountsApi, "jointAccountsApi");
        Intrinsics.checkNotNullParameter(jointAccountsOnboardingService, "jointAccountsOnboardingService");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.jointAccountsApi = jointAccountsApi;
        this.jointAccountsOnboardingService = jointAccountsOnboardingService;
        this.userStore = userStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        getLifecycleScope().launchWhenStarted(new C211921(null));
    }

    /* compiled from: MarginUpgradeJointAccountCoOwnerValidationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.jointaccounts.MarginUpgradeJointAccountCoOwnerValidationDuxo$onStart$1", m3645f = "MarginUpgradeJointAccountCoOwnerValidationDuxo.kt", m3646l = {110, 111, 51, 54}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.margin.upgrade.jointaccounts.MarginUpgradeJointAccountCoOwnerValidationDuxo$onStart$1 */
    static final class C211921 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;

        C211921(Continuation<? super C211921> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarginUpgradeJointAccountCoOwnerValidationDuxo.this.new C211921(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C211921) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00e2  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00ea  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String str;
            Object jointUsers;
            User user;
            String str2;
            Object objJointAccountCoOwnerQuestionnaireCompleted;
            ApiJointUsers apiJointUsers;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Observable<Account> observableStreamAccount = MarginUpgradeJointAccountCoOwnerValidationDuxo.this.accountProvider.streamAccount(((MarginUpgradeJointAccountCoOwnerValidationFragment.Args) MarginUpgradeJointAccountCoOwnerValidationDuxo.INSTANCE.getArgs((HasSavedState) MarginUpgradeJointAccountCoOwnerValidationDuxo.this)).getAccountNumber());
                this.label = 1;
                obj = RxAwait3.awaitFirst(observableStreamAccount, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i == 2) {
                    str = (String) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    User user2 = (User) obj;
                    JointAccountsApi jointAccountsApi = MarginUpgradeJointAccountCoOwnerValidationDuxo.this.jointAccountsApi;
                    String accountNumber = ((MarginUpgradeJointAccountCoOwnerValidationFragment.Args) MarginUpgradeJointAccountCoOwnerValidationDuxo.INSTANCE.getArgs((HasSavedState) MarginUpgradeJointAccountCoOwnerValidationDuxo.this)).getAccountNumber();
                    this.L$0 = str;
                    this.L$1 = user2;
                    this.label = 3;
                    jointUsers = jointAccountsApi.getJointUsers(accountNumber, this);
                    if (jointUsers != coroutine_suspended) {
                        String str3 = str;
                        user = user2;
                        obj = jointUsers;
                        str2 = str3;
                        ApiJointUsers apiJointUsers2 = (ApiJointUsers) obj;
                        JointAccountsOnboardingService jointAccountsOnboardingService = MarginUpgradeJointAccountCoOwnerValidationDuxo.this.jointAccountsOnboardingService;
                        JointAccountCoOwnerQuestionnaireCompletedRequestDto jointAccountCoOwnerQuestionnaireCompletedRequestDto = new JointAccountCoOwnerQuestionnaireCompletedRequestDto(str2, ((MarginUpgradeJointAccountCoOwnerValidationFragment.Args) MarginUpgradeJointAccountCoOwnerValidationDuxo.INSTANCE.getArgs((HasSavedState) MarginUpgradeJointAccountCoOwnerValidationDuxo.this)).getAccountNumber());
                        this.L$0 = user;
                        this.L$1 = apiJointUsers2;
                        this.label = 4;
                        objJointAccountCoOwnerQuestionnaireCompleted = jointAccountsOnboardingService.JointAccountCoOwnerQuestionnaireCompleted(jointAccountCoOwnerQuestionnaireCompletedRequestDto, this);
                        if (objJointAccountCoOwnerQuestionnaireCompleted != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    apiJointUsers = (ApiJointUsers) this.L$1;
                    user = (User) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (!((JointAccountCoOwnerQuestionnaireCompletedResponseDto) obj).getQuestionnaire_completed()) {
                        MarginUpgradeJointAccountCoOwnerValidationDuxo.this.submit(MarginUpgradeJointAccountCoOwnerEvent.CoOwnerQuestionnaireAlreadyCompleted.INSTANCE);
                    } else {
                        ApiJointUserInfo coOwnerUser = apiJointUsers.getCoOwnerUser(user.getId());
                        String first_name = coOwnerUser != null ? coOwnerUser.getFirst_name() : null;
                        if (first_name != null) {
                            MarginUpgradeJointAccountCoOwnerValidationDuxo.this.applyMutation(new AnonymousClass1(first_name, null));
                        } else {
                            MarginUpgradeJointAccountCoOwnerValidationDuxo.this.submit(new MarginUpgradeJointAccountCoOwnerEvent.Error("Co-owner not found"));
                        }
                    }
                    return Unit.INSTANCE;
                }
                user = (User) this.L$1;
                str2 = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
                ApiJointUsers apiJointUsers22 = (ApiJointUsers) obj;
                JointAccountsOnboardingService jointAccountsOnboardingService2 = MarginUpgradeJointAccountCoOwnerValidationDuxo.this.jointAccountsOnboardingService;
                JointAccountCoOwnerQuestionnaireCompletedRequestDto jointAccountCoOwnerQuestionnaireCompletedRequestDto2 = new JointAccountCoOwnerQuestionnaireCompletedRequestDto(str2, ((MarginUpgradeJointAccountCoOwnerValidationFragment.Args) MarginUpgradeJointAccountCoOwnerValidationDuxo.INSTANCE.getArgs((HasSavedState) MarginUpgradeJointAccountCoOwnerValidationDuxo.this)).getAccountNumber());
                this.L$0 = user;
                this.L$1 = apiJointUsers22;
                this.label = 4;
                objJointAccountCoOwnerQuestionnaireCompleted = jointAccountsOnboardingService2.JointAccountCoOwnerQuestionnaireCompleted(jointAccountCoOwnerQuestionnaireCompletedRequestDto2, this);
                if (objJointAccountCoOwnerQuestionnaireCompleted != coroutine_suspended) {
                    apiJointUsers = apiJointUsers22;
                    obj = objJointAccountCoOwnerQuestionnaireCompleted;
                    if (!((JointAccountCoOwnerQuestionnaireCompletedResponseDto) obj).getQuestionnaire_completed()) {
                    }
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            ResultKt.throwOnFailure(obj);
            String investorProfileProductContext = MarginUpgradeInvestorProfileProductContext.getInvestorProfileProductContext(((Account) obj).getBrokerageAccountType());
            Observable<User> user3 = MarginUpgradeJointAccountCoOwnerValidationDuxo.this.userStore.getUser();
            this.L$0 = investorProfileProductContext;
            this.label = 2;
            Object objAwaitFirst = RxAwait3.awaitFirst(user3, this);
            if (objAwaitFirst != coroutine_suspended) {
                str = investorProfileProductContext;
                obj = objAwaitFirst;
                User user22 = (User) obj;
                JointAccountsApi jointAccountsApi2 = MarginUpgradeJointAccountCoOwnerValidationDuxo.this.jointAccountsApi;
                String accountNumber2 = ((MarginUpgradeJointAccountCoOwnerValidationFragment.Args) MarginUpgradeJointAccountCoOwnerValidationDuxo.INSTANCE.getArgs((HasSavedState) MarginUpgradeJointAccountCoOwnerValidationDuxo.this)).getAccountNumber();
                this.L$0 = str;
                this.L$1 = user22;
                this.label = 3;
                jointUsers = jointAccountsApi2.getJointUsers(accountNumber2, this);
                if (jointUsers != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }

        /* compiled from: MarginUpgradeJointAccountCoOwnerValidationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/margin/upgrade/jointaccounts/MarginUpgradeJointAccountCoOwnerValidationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.jointaccounts.MarginUpgradeJointAccountCoOwnerValidationDuxo$onStart$1$1", m3645f = "MarginUpgradeJointAccountCoOwnerValidationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.margin.upgrade.jointaccounts.MarginUpgradeJointAccountCoOwnerValidationDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MarginUpgradeJointAccountCoOwnerValidationViewState, Continuation<? super MarginUpgradeJointAccountCoOwnerValidationViewState>, Object> {
            final /* synthetic */ String $coOwnerFirstName;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$coOwnerFirstName = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$coOwnerFirstName, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MarginUpgradeJointAccountCoOwnerValidationViewState marginUpgradeJointAccountCoOwnerValidationViewState, Continuation<? super MarginUpgradeJointAccountCoOwnerValidationViewState> continuation) {
                return ((AnonymousClass1) create(marginUpgradeJointAccountCoOwnerValidationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return MarginUpgradeJointAccountCoOwnerValidationViewState.copy$default((MarginUpgradeJointAccountCoOwnerValidationViewState) this.L$0, new MarginUpgradeJointAccountCoOwnerValidationViewState.State.CoOwnerInvestorActionRequired(this.$coOwnerFirstName), false, 2, null);
            }
        }
    }

    /* compiled from: MarginUpgradeJointAccountCoOwnerValidationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/margin/upgrade/jointaccounts/MarginUpgradeJointAccountCoOwnerValidationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.jointaccounts.MarginUpgradeJointAccountCoOwnerValidationDuxo$onSendEmailToCoOwner$1", m3645f = "MarginUpgradeJointAccountCoOwnerValidationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.margin.upgrade.jointaccounts.MarginUpgradeJointAccountCoOwnerValidationDuxo$onSendEmailToCoOwner$1 */
    static final class C211901 extends ContinuationImpl7 implements Function2<MarginUpgradeJointAccountCoOwnerValidationViewState, Continuation<? super MarginUpgradeJointAccountCoOwnerValidationViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C211901(Continuation<? super C211901> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C211901 c211901 = new C211901(continuation);
            c211901.L$0 = obj;
            return c211901;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MarginUpgradeJointAccountCoOwnerValidationViewState marginUpgradeJointAccountCoOwnerValidationViewState, Continuation<? super MarginUpgradeJointAccountCoOwnerValidationViewState> continuation) {
            return ((C211901) create(marginUpgradeJointAccountCoOwnerValidationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return MarginUpgradeJointAccountCoOwnerValidationViewState.copy$default((MarginUpgradeJointAccountCoOwnerValidationViewState) this.L$0, null, true, 1, null);
        }
    }

    /* compiled from: MarginUpgradeJointAccountCoOwnerValidationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.jointaccounts.MarginUpgradeJointAccountCoOwnerValidationDuxo$onSendEmailToCoOwner$2", m3645f = "MarginUpgradeJointAccountCoOwnerValidationDuxo.kt", m3646l = {84}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.margin.upgrade.jointaccounts.MarginUpgradeJointAccountCoOwnerValidationDuxo$onSendEmailToCoOwner$2 */
    static final class C211912 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C211912(Continuation<? super C211912> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarginUpgradeJointAccountCoOwnerValidationDuxo.this.new C211912(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C211912) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    JointAccountsOnboardingService jointAccountsOnboardingService = MarginUpgradeJointAccountCoOwnerValidationDuxo.this.jointAccountsOnboardingService;
                    SendCoOwnerIpEmailRequestDto sendCoOwnerIpEmailRequestDto = new SendCoOwnerIpEmailRequestDto(((MarginUpgradeJointAccountCoOwnerValidationFragment.Args) MarginUpgradeJointAccountCoOwnerValidationDuxo.INSTANCE.getArgs((HasSavedState) MarginUpgradeJointAccountCoOwnerValidationDuxo.this)).getAccountNumber());
                    this.label = 1;
                    if (jointAccountsOnboardingService.SendCoOwnerIpEmail(sendCoOwnerIpEmailRequestDto, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                MarginUpgradeJointAccountCoOwnerValidationDuxo.this.applyMutation(new AnonymousClass1(null));
            } catch (Throwable unused) {
                MarginUpgradeJointAccountCoOwnerValidationDuxo.this.applyMutation(new AnonymousClass2(null));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: MarginUpgradeJointAccountCoOwnerValidationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/margin/upgrade/jointaccounts/MarginUpgradeJointAccountCoOwnerValidationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.jointaccounts.MarginUpgradeJointAccountCoOwnerValidationDuxo$onSendEmailToCoOwner$2$1", m3645f = "MarginUpgradeJointAccountCoOwnerValidationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.margin.upgrade.jointaccounts.MarginUpgradeJointAccountCoOwnerValidationDuxo$onSendEmailToCoOwner$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MarginUpgradeJointAccountCoOwnerValidationViewState, Continuation<? super MarginUpgradeJointAccountCoOwnerValidationViewState>, Object> {
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
            public final Object invoke(MarginUpgradeJointAccountCoOwnerValidationViewState marginUpgradeJointAccountCoOwnerValidationViewState, Continuation<? super MarginUpgradeJointAccountCoOwnerValidationViewState> continuation) {
                return ((AnonymousClass1) create(marginUpgradeJointAccountCoOwnerValidationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return MarginUpgradeJointAccountCoOwnerValidationViewState.copy$default((MarginUpgradeJointAccountCoOwnerValidationViewState) this.L$0, new MarginUpgradeJointAccountCoOwnerValidationViewState.State.EmailSentToCoOwner(), false, 2, null);
            }
        }

        /* compiled from: MarginUpgradeJointAccountCoOwnerValidationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/margin/upgrade/jointaccounts/MarginUpgradeJointAccountCoOwnerValidationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.jointaccounts.MarginUpgradeJointAccountCoOwnerValidationDuxo$onSendEmailToCoOwner$2$2", m3645f = "MarginUpgradeJointAccountCoOwnerValidationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.margin.upgrade.jointaccounts.MarginUpgradeJointAccountCoOwnerValidationDuxo$onSendEmailToCoOwner$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<MarginUpgradeJointAccountCoOwnerValidationViewState, Continuation<? super MarginUpgradeJointAccountCoOwnerValidationViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MarginUpgradeJointAccountCoOwnerValidationViewState marginUpgradeJointAccountCoOwnerValidationViewState, Continuation<? super MarginUpgradeJointAccountCoOwnerValidationViewState> continuation) {
                return ((AnonymousClass2) create(marginUpgradeJointAccountCoOwnerValidationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return MarginUpgradeJointAccountCoOwnerValidationViewState.copy$default((MarginUpgradeJointAccountCoOwnerValidationViewState) this.L$0, MarginUpgradeJointAccountCoOwnerValidationViewState.State.ErrorSendingEmail.INSTANCE, false, 2, null);
            }
        }
    }

    public final void onSendEmailToCoOwner() {
        applyMutation(new C211901(null));
        getLifecycleScope().launchWhenStarted(new C211912(null));
    }

    /* compiled from: MarginUpgradeJointAccountCoOwnerValidationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/jointaccounts/MarginUpgradeJointAccountCoOwnerValidationDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/margin/upgrade/jointaccounts/MarginUpgradeJointAccountCoOwnerValidationDuxo;", "Lcom/robinhood/android/margin/upgrade/jointaccounts/MarginUpgradeJointAccountCoOwnerValidationFragment$Args;", "<init>", "()V", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<MarginUpgradeJointAccountCoOwnerValidationDuxo, MarginUpgradeJointAccountCoOwnerValidationFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MarginUpgradeJointAccountCoOwnerValidationFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (MarginUpgradeJointAccountCoOwnerValidationFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MarginUpgradeJointAccountCoOwnerValidationFragment.Args getArgs(MarginUpgradeJointAccountCoOwnerValidationDuxo marginUpgradeJointAccountCoOwnerValidationDuxo) {
            return (MarginUpgradeJointAccountCoOwnerValidationFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, marginUpgradeJointAccountCoOwnerValidationDuxo);
        }
    }
}
