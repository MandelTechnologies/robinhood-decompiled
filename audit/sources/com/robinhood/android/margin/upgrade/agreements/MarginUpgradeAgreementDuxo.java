package com.robinhood.android.margin.upgrade.agreements;

import androidx.lifecycle.SavedStateHandle;
import bonfire.proto.idl.joint_accounts_onboarding.p035v1.JointAccountsOnboardingService;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.agreements.AgreementsStore;
import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.brokeragecontent.BrokerageAgreement;
import com.robinhood.android.brokeragecontent.BrokerageResource2;
import com.robinhood.android.common.margin.p083ui.eligibility.MarginEligibilityChecklistViewState4;
import com.robinhood.android.jointaccounts.api.JointAccountsApi;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.margin.LeveredMarginSettingsStore;
import com.robinhood.android.lib.margin.MarginInvestingInfoStore;
import com.robinhood.android.lib.margin.api.ApiMarginInvestingInfo;
import com.robinhood.android.lib.margin.api.ApiToggleMarginInvestingResponse;
import com.robinhood.android.lib.margin.api.ApiToggleMarginInvestingResponse2;
import com.robinhood.android.margin.upgrade.C21137R;
import com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementFragment;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.jointaccounts.api.users.ApiJointUserInfo;
import com.robinhood.models.jointaccounts.api.users.ApiJointUsers;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.store.user.UserStore;
import io.reactivex.Observable;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: MarginUpgradeAgreementDuxo.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001'BY\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020 J\u000e\u0010&\u001a\u00020$2\u0006\u0010%\u001a\u00020 R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementDataState;", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "marginInvestingInfoStore", "Lcom/robinhood/android/lib/margin/MarginInvestingInfoStore;", "leveredMarginSettingsStore", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "jointAccountsApi", "Lcom/robinhood/android/jointaccounts/api/JointAccountsApi;", "jointAccountsOnboardingService", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/JointAccountsOnboardingService;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "agreementsStore", "Lcom/robinhood/android/agreements/AgreementsStore;", "stateProvider", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/lib/margin/MarginInvestingInfoStore;Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;Lcom/robinhood/android/jointaccounts/api/JointAccountsApi;Lbonfire/proto/idl/joint_accounts_onboarding/v1/JointAccountsOnboardingService;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/agreements/AgreementsStore;Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "enableMarginInvesting", "Lkotlinx/coroutines/Job;", "isJointAccount", "", "agreement", "Lcom/robinhood/android/agreements/models/UiAgreementWithContent;", "onToggleFirstCheckbox", "", "checked", "onToggleSecondCheckbox", "Companion", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MarginUpgradeAgreementDuxo extends BaseDuxo<MarginUpgradeAgreementDataState, MarginUpgradeAgreementState3> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final AgreementsStore agreementsStore;
    private final JointAccountsApi jointAccountsApi;
    private final JointAccountsOnboardingService jointAccountsOnboardingService;
    private final LeveredMarginSettingsStore leveredMarginSettingsStore;
    private final MarginInvestingInfoStore marginInvestingInfoStore;
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
    public MarginUpgradeAgreementDuxo(AccountProvider accountProvider, MarginInvestingInfoStore marginInvestingInfoStore, LeveredMarginSettingsStore leveredMarginSettingsStore, JointAccountsApi jointAccountsApi, JointAccountsOnboardingService jointAccountsOnboardingService, UserStore userStore, AgreementsStore agreementsStore, MarginUpgradeAgreementState2 stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new MarginUpgradeAgreementDataState(null, false, null, null, null, null, null, null, false, false, null, null, 4095, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(marginInvestingInfoStore, "marginInvestingInfoStore");
        Intrinsics.checkNotNullParameter(leveredMarginSettingsStore, "leveredMarginSettingsStore");
        Intrinsics.checkNotNullParameter(jointAccountsApi, "jointAccountsApi");
        Intrinsics.checkNotNullParameter(jointAccountsOnboardingService, "jointAccountsOnboardingService");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.marginInvestingInfoStore = marginInvestingInfoStore;
        this.leveredMarginSettingsStore = leveredMarginSettingsStore;
        this.jointAccountsApi = jointAccountsApi;
        this.jointAccountsOnboardingService = jointAccountsOnboardingService;
        this.userStore = userStore;
        this.agreementsStore = agreementsStore;
        this.savedStateHandle = savedStateHandle;
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C211381(null), 3, null);
    }

    /* compiled from: MarginUpgradeAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementDuxo$1", m3645f = "MarginUpgradeAgreementDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE, 62, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, EnumC7081g.SDK_ASSET_ICON_HOME_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementDuxo$1 */
    static final class C211381 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        C211381(Continuation<? super C211381> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarginUpgradeAgreementDuxo.this.new C211381(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C211381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00d3  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0120  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x012a  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0138  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CountryCode.Supported locality;
            User user;
            Object objAwaitFirst;
            UiAgreementWithContent uiAgreementWithContent;
            User user2;
            CountryCode.Supported supported;
            Account account;
            Ref.ObjectRef objectRef;
            Account account2;
            Account account3;
            Ref.ObjectRef objectRef2;
            int i;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Observable<User> user3 = MarginUpgradeAgreementDuxo.this.userStore.getUser();
                this.label = 1;
                obj = RxAwait3.awaitFirstOrNull(user3, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    locality = (CountryCode.Supported) this.L$1;
                    user = (User) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    UiAgreementWithContent uiAgreementWithContent2 = (UiAgreementWithContent) obj;
                    Observable<Account> observableStreamAccount = MarginUpgradeAgreementDuxo.this.accountProvider.streamAccount(((MarginUpgradeAgreementFragment.Args) MarginUpgradeAgreementDuxo.INSTANCE.getArgs((HasSavedState) MarginUpgradeAgreementDuxo.this)).getAccountNumber());
                    this.L$0 = user;
                    this.L$1 = locality;
                    this.L$2 = uiAgreementWithContent2;
                    this.label = 3;
                    objAwaitFirst = RxAwait3.awaitFirst(observableStreamAccount, this);
                    if (objAwaitFirst != coroutine_suspended) {
                        uiAgreementWithContent = uiAgreementWithContent2;
                        obj = objAwaitFirst;
                        user2 = user;
                        supported = locality;
                        account = (Account) obj;
                        objectRef = new Ref.ObjectRef();
                        if (account.getBrokerageAccountType() != BrokerageAccountType.JOINT_TENANCY_WITH_ROS) {
                        }
                    }
                    return coroutine_suspended;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef2 = (Ref.ObjectRef) this.L$5;
                    objectRef = (Ref.ObjectRef) this.L$4;
                    account3 = (Account) this.L$3;
                    uiAgreementWithContent = (UiAgreementWithContent) this.L$2;
                    supported = (CountryCode.Supported) this.L$1;
                    user2 = (User) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    ApiJointUserInfo coOwnerUser = ((ApiJointUsers) obj).getCoOwnerUser(user2.getId());
                    objectRef2.element = coOwnerUser != null ? coOwnerUser.getFirst_name() : 0;
                    account2 = account3;
                    Ref.ObjectRef objectRef3 = objectRef;
                    UiAgreementWithContent uiAgreementWithContent3 = uiAgreementWithContent;
                    if (Intrinsics.areEqual(supported, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
                        i = C21137R.string.margin_upgrade_agreement_disclaimer_uk;
                    } else {
                        i = C21137R.string.margin_upgrade_agreement_disclaimer;
                    }
                    MarginUpgradeAgreementDuxo.this.applyMutation(new AnonymousClass2(uiAgreementWithContent3, objectRef3, account2, i, null));
                    return Unit.INSTANCE;
                }
                UiAgreementWithContent uiAgreementWithContent4 = (UiAgreementWithContent) this.L$2;
                CountryCode.Supported supported2 = (CountryCode.Supported) this.L$1;
                User user4 = (User) this.L$0;
                ResultKt.throwOnFailure(obj);
                user2 = user4;
                supported = supported2;
                uiAgreementWithContent = uiAgreementWithContent4;
                account = (Account) obj;
                objectRef = new Ref.ObjectRef();
                if (account.getBrokerageAccountType() != BrokerageAccountType.JOINT_TENANCY_WITH_ROS) {
                    JointAccountsApi jointAccountsApi = MarginUpgradeAgreementDuxo.this.jointAccountsApi;
                    String accountNumber = ((MarginUpgradeAgreementFragment.Args) MarginUpgradeAgreementDuxo.INSTANCE.getArgs((HasSavedState) MarginUpgradeAgreementDuxo.this)).getAccountNumber();
                    this.L$0 = user2;
                    this.L$1 = supported;
                    this.L$2 = uiAgreementWithContent;
                    this.L$3 = account;
                    this.L$4 = objectRef;
                    this.L$5 = objectRef;
                    this.label = 4;
                    Object jointUsers = jointAccountsApi.getJointUsers(accountNumber, this);
                    if (jointUsers != coroutine_suspended) {
                        account3 = account;
                        obj = jointUsers;
                        objectRef2 = objectRef;
                        ApiJointUserInfo coOwnerUser2 = ((ApiJointUsers) obj).getCoOwnerUser(user2.getId());
                        objectRef2.element = coOwnerUser2 != null ? coOwnerUser2.getFirst_name() : 0;
                        account2 = account3;
                        Ref.ObjectRef objectRef32 = objectRef;
                        UiAgreementWithContent uiAgreementWithContent32 = uiAgreementWithContent;
                        if (Intrinsics.areEqual(supported, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
                        }
                        MarginUpgradeAgreementDuxo.this.applyMutation(new AnonymousClass2(uiAgreementWithContent32, objectRef32, account2, i, null));
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
                account2 = account;
                Ref.ObjectRef objectRef322 = objectRef;
                UiAgreementWithContent uiAgreementWithContent322 = uiAgreementWithContent;
                if (Intrinsics.areEqual(supported, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
                }
                MarginUpgradeAgreementDuxo.this.applyMutation(new AnonymousClass2(uiAgreementWithContent322, objectRef322, account2, i, null));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            User user5 = (User) obj;
            if (user5 == null) {
                MarginUpgradeAgreementDuxo.this.applyMutation(new AnonymousClass1(null));
                return Unit.INSTANCE;
            }
            locality = user5.getOrigin().getLocality();
            AgreementsStore agreementsStore = MarginUpgradeAgreementDuxo.this.agreementsStore;
            String contentfulId = BrokerageResource2.getContentfulId(BrokerageAgreement.MARGIN_ENABLE, locality);
            this.L$0 = user5;
            this.L$1 = locality;
            this.label = 2;
            Object agreementWithContent = agreementsStore.getAgreementWithContent(contentfulId, this);
            if (agreementWithContent != coroutine_suspended) {
                user = user5;
                obj = agreementWithContent;
                UiAgreementWithContent uiAgreementWithContent22 = (UiAgreementWithContent) obj;
                Observable<Account> observableStreamAccount2 = MarginUpgradeAgreementDuxo.this.accountProvider.streamAccount(((MarginUpgradeAgreementFragment.Args) MarginUpgradeAgreementDuxo.INSTANCE.getArgs((HasSavedState) MarginUpgradeAgreementDuxo.this)).getAccountNumber());
                this.L$0 = user;
                this.L$1 = locality;
                this.L$2 = uiAgreementWithContent22;
                this.label = 3;
                objAwaitFirst = RxAwait3.awaitFirst(observableStreamAccount2, this);
                if (objAwaitFirst != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }

        /* compiled from: MarginUpgradeAgreementDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementDuxo$1$1", m3645f = "MarginUpgradeAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementDuxo$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MarginUpgradeAgreementDataState, Continuation<? super MarginUpgradeAgreementDataState>, Object> {
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
            public final Object invoke(MarginUpgradeAgreementDataState marginUpgradeAgreementDataState, Continuation<? super MarginUpgradeAgreementDataState> continuation) {
                return ((AnonymousClass1) create(marginUpgradeAgreementDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return MarginUpgradeAgreementDataState.copy$default((MarginUpgradeAgreementDataState) this.L$0, null, false, null, null, null, null, null, new IllegalStateException("the user is null"), false, false, null, null, 3967, null);
            }
        }

        /* compiled from: MarginUpgradeAgreementDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementDuxo$1$2", m3645f = "MarginUpgradeAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementDuxo$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<MarginUpgradeAgreementDataState, Continuation<? super MarginUpgradeAgreementDataState>, Object> {
            final /* synthetic */ Account $account;
            final /* synthetic */ UiAgreementWithContent $agreement;
            final /* synthetic */ int $disclaimerStringRes;
            final /* synthetic */ Ref.ObjectRef<String> $jointAccountCoOwnerFirstName;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(UiAgreementWithContent uiAgreementWithContent, Ref.ObjectRef<String> objectRef, Account account, int i, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$agreement = uiAgreementWithContent;
                this.$jointAccountCoOwnerFirstName = objectRef;
                this.$account = account;
                this.$disclaimerStringRes = i;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$agreement, this.$jointAccountCoOwnerFirstName, this.$account, this.$disclaimerStringRes, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MarginUpgradeAgreementDataState marginUpgradeAgreementDataState, Continuation<? super MarginUpgradeAgreementDataState> continuation) {
                return ((AnonymousClass2) create(marginUpgradeAgreementDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return MarginUpgradeAgreementDataState.copy$default((MarginUpgradeAgreementDataState) this.L$0, this.$account, false, this.$agreement.getContent(), this.$agreement, null, null, null, null, false, false, this.$jointAccountCoOwnerFirstName.element, boxing.boxInt(this.$disclaimerStringRes), 1008, null);
            }
        }
    }

    /* compiled from: MarginUpgradeAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementDuxo$enableMarginInvesting$1", m3645f = "MarginUpgradeAgreementDuxo.kt", m3646l = {110, EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE, 119}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementDuxo$enableMarginInvesting$1 */
    static final class C211391 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UiAgreementWithContent $agreement;
        final /* synthetic */ boolean $isJointAccount;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C211391(boolean z, UiAgreementWithContent uiAgreementWithContent, Continuation<? super C211391> continuation) {
            super(2, continuation);
            this.$isJointAccount = z;
            this.$agreement = uiAgreementWithContent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarginUpgradeAgreementDuxo.this.new C211391(this.$isJointAccount, this.$agreement, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C211391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: MarginUpgradeAgreementDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementDuxo$enableMarginInvesting$1$1", m3645f = "MarginUpgradeAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementDuxo$enableMarginInvesting$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MarginUpgradeAgreementDataState, Continuation<? super MarginUpgradeAgreementDataState>, Object> {
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
            public final Object invoke(MarginUpgradeAgreementDataState marginUpgradeAgreementDataState, Continuation<? super MarginUpgradeAgreementDataState> continuation) {
                return ((AnonymousClass1) create(marginUpgradeAgreementDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return MarginUpgradeAgreementDataState.copy$default((MarginUpgradeAgreementDataState) this.L$0, null, true, null, null, null, null, null, null, false, false, null, null, 4093, null);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x00c5  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object marginInvestingInfo;
            ApiToggleMarginInvestingResponse apiToggleMarginInvestingResponse;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            boolean z = true;
            try {
            } catch (Exception e) {
                MarginUpgradeAgreementDuxo.this.applyMutation(new AnonymousClass3(e, null));
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MarginUpgradeAgreementDuxo.this.applyMutation(new AnonymousClass1(null));
                Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(MarginUpgradeAgreementDuxo.this.getLifecycleScope(), null, null, new MarginUpgradeAgreementDuxo2(this.$isJointAccount, MarginUpgradeAgreementDuxo.this, this.$agreement, null), 3, null);
                this.label = 1;
                if (jobLaunch$default.join(this) == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    apiToggleMarginInvestingResponse = (ApiToggleMarginInvestingResponse) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    MarginUpgradeAgreementDuxo.this.applyMutation(new AnonymousClass2(apiToggleMarginInvestingResponse, (ApiMarginInvestingInfo) obj, null));
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                ApiToggleMarginInvestingResponse apiToggleMarginInvestingResponse2 = (ApiToggleMarginInvestingResponse) obj;
                MarginInvestingInfoStore marginInvestingInfoStore = MarginUpgradeAgreementDuxo.this.marginInvestingInfoStore;
                String accountNumber = ((MarginUpgradeAgreementFragment.Args) MarginUpgradeAgreementDuxo.INSTANCE.getArgs((HasSavedState) MarginUpgradeAgreementDuxo.this)).getAccountNumber();
                this.L$0 = apiToggleMarginInvestingResponse2;
                this.label = 3;
                marginInvestingInfo = marginInvestingInfoStore.getMarginInvestingInfo(accountNumber, this);
                if (marginInvestingInfo != coroutine_suspended) {
                    apiToggleMarginInvestingResponse = apiToggleMarginInvestingResponse2;
                    obj = marginInvestingInfo;
                    MarginUpgradeAgreementDuxo.this.applyMutation(new AnonymousClass2(apiToggleMarginInvestingResponse, (ApiMarginInvestingInfo) obj, null));
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            ResultKt.throwOnFailure(obj);
            LeveredMarginSettingsStore leveredMarginSettingsStore = MarginUpgradeAgreementDuxo.this.leveredMarginSettingsStore;
            Companion companion = MarginUpgradeAgreementDuxo.INSTANCE;
            String accountNumber2 = ((MarginUpgradeAgreementFragment.Args) companion.getArgs((HasSavedState) MarginUpgradeAgreementDuxo.this)).getAccountNumber();
            if (!((MarginUpgradeAgreementFragment.Args) companion.getArgs((HasSavedState) MarginUpgradeAgreementDuxo.this)).getFromAcats() && !(((MarginUpgradeAgreementFragment.Args) companion.getArgs((HasSavedState) MarginUpgradeAgreementDuxo.this)).getMarginFlow() instanceof MarginEligibilityChecklistViewState4.Skip2KCheck)) {
                z = false;
            }
            Single<ApiToggleMarginInvestingResponse> singleEnableMarginInvesting = leveredMarginSettingsStore.enableMarginInvesting(accountNumber2, null, null, false, z);
            this.label = 2;
            obj = RxAwait3.await(singleEnableMarginInvesting, this);
            if (obj != coroutine_suspended) {
                ApiToggleMarginInvestingResponse apiToggleMarginInvestingResponse22 = (ApiToggleMarginInvestingResponse) obj;
                MarginInvestingInfoStore marginInvestingInfoStore2 = MarginUpgradeAgreementDuxo.this.marginInvestingInfoStore;
                String accountNumber3 = ((MarginUpgradeAgreementFragment.Args) MarginUpgradeAgreementDuxo.INSTANCE.getArgs((HasSavedState) MarginUpgradeAgreementDuxo.this)).getAccountNumber();
                this.L$0 = apiToggleMarginInvestingResponse22;
                this.label = 3;
                marginInvestingInfo = marginInvestingInfoStore2.getMarginInvestingInfo(accountNumber3, this);
                if (marginInvestingInfo != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }

        /* compiled from: MarginUpgradeAgreementDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementDuxo$enableMarginInvesting$1$2", m3645f = "MarginUpgradeAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementDuxo$enableMarginInvesting$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<MarginUpgradeAgreementDataState, Continuation<? super MarginUpgradeAgreementDataState>, Object> {
            final /* synthetic */ ApiMarginInvestingInfo $marginInvestingInfo;
            final /* synthetic */ ApiToggleMarginInvestingResponse $toggleMarginResponse;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ApiToggleMarginInvestingResponse apiToggleMarginInvestingResponse, ApiMarginInvestingInfo apiMarginInvestingInfo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$toggleMarginResponse = apiToggleMarginInvestingResponse;
                this.$marginInvestingInfo = apiMarginInvestingInfo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$toggleMarginResponse, this.$marginInvestingInfo, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MarginUpgradeAgreementDataState marginUpgradeAgreementDataState, Continuation<? super MarginUpgradeAgreementDataState> continuation) {
                return ((AnonymousClass2) create(marginUpgradeAgreementDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return MarginUpgradeAgreementDataState.copy$default((MarginUpgradeAgreementDataState) this.L$0, null, false, null, null, this.$toggleMarginResponse.getResult(), this.$toggleMarginResponse.getResult() == ApiToggleMarginInvestingResponse2.SUCCESS ? this.$marginInvestingInfo.getBuyingPowerWithUserSetLimit() : null, this.$toggleMarginResponse.getErrorReason(), null, false, false, null, null, 3981, null);
            }
        }

        /* compiled from: MarginUpgradeAgreementDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementDuxo$enableMarginInvesting$1$3", m3645f = "MarginUpgradeAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementDuxo$enableMarginInvesting$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<MarginUpgradeAgreementDataState, Continuation<? super MarginUpgradeAgreementDataState>, Object> {

            /* renamed from: $e */
            final /* synthetic */ Exception f4537$e;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(Exception exc, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.f4537$e = exc;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.f4537$e, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MarginUpgradeAgreementDataState marginUpgradeAgreementDataState, Continuation<? super MarginUpgradeAgreementDataState> continuation) {
                return ((AnonymousClass3) create(marginUpgradeAgreementDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return MarginUpgradeAgreementDataState.copy$default((MarginUpgradeAgreementDataState) this.L$0, null, false, null, null, null, null, null, this.f4537$e, false, false, null, null, 3965, null);
            }
        }
    }

    public final Job enableMarginInvesting(boolean isJointAccount, UiAgreementWithContent agreement) {
        Intrinsics.checkNotNullParameter(agreement, "agreement");
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C211391(isJointAccount, agreement, null), 3, null);
    }

    /* compiled from: MarginUpgradeAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementDuxo$onToggleFirstCheckbox$1", m3645f = "MarginUpgradeAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementDuxo$onToggleFirstCheckbox$1 */
    static final class C211411 extends ContinuationImpl7 implements Function2<MarginUpgradeAgreementDataState, Continuation<? super MarginUpgradeAgreementDataState>, Object> {
        final /* synthetic */ boolean $checked;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C211411(boolean z, Continuation<? super C211411> continuation) {
            super(2, continuation);
            this.$checked = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C211411 c211411 = new C211411(this.$checked, continuation);
            c211411.L$0 = obj;
            return c211411;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MarginUpgradeAgreementDataState marginUpgradeAgreementDataState, Continuation<? super MarginUpgradeAgreementDataState> continuation) {
            return ((C211411) create(marginUpgradeAgreementDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return MarginUpgradeAgreementDataState.copy$default((MarginUpgradeAgreementDataState) this.L$0, null, false, null, null, null, null, null, null, this.$checked, false, null, null, 3839, null);
        }
    }

    public final void onToggleFirstCheckbox(boolean checked) {
        applyMutation(new C211411(checked, null));
    }

    /* compiled from: MarginUpgradeAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementDuxo$onToggleSecondCheckbox$1", m3645f = "MarginUpgradeAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementDuxo$onToggleSecondCheckbox$1 */
    static final class C211421 extends ContinuationImpl7 implements Function2<MarginUpgradeAgreementDataState, Continuation<? super MarginUpgradeAgreementDataState>, Object> {
        final /* synthetic */ boolean $checked;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C211421(boolean z, Continuation<? super C211421> continuation) {
            super(2, continuation);
            this.$checked = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C211421 c211421 = new C211421(this.$checked, continuation);
            c211421.L$0 = obj;
            return c211421;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MarginUpgradeAgreementDataState marginUpgradeAgreementDataState, Continuation<? super MarginUpgradeAgreementDataState> continuation) {
            return ((C211421) create(marginUpgradeAgreementDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return MarginUpgradeAgreementDataState.copy$default((MarginUpgradeAgreementDataState) this.L$0, null, false, null, null, null, null, null, null, false, this.$checked, null, null, 3583, null);
        }
    }

    public final void onToggleSecondCheckbox(boolean checked) {
        applyMutation(new C211421(checked, null));
    }

    /* compiled from: MarginUpgradeAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementDuxo;", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementFragment$Args;", "<init>", "()V", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<MarginUpgradeAgreementDuxo, MarginUpgradeAgreementFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MarginUpgradeAgreementFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (MarginUpgradeAgreementFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MarginUpgradeAgreementFragment.Args getArgs(MarginUpgradeAgreementDuxo marginUpgradeAgreementDuxo) {
            return (MarginUpgradeAgreementFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, marginUpgradeAgreementDuxo);
        }
    }
}
