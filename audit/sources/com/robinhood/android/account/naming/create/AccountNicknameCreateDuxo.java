package com.robinhood.android.account.naming.create;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.account.contracts.naming.CreateAccountNicknameFragmentKey;
import com.robinhood.android.account.naming.C8116R;
import com.robinhood.android.account.naming.common.AccountNicknameDataState;
import com.robinhood.android.account.naming.common.AccountNicknameEvent;
import com.robinhood.android.account.naming.common.AccountNicknameStateProvider;
import com.robinhood.android.account.naming.common.BaseAccountNicknameDuxo;
import com.robinhood.android.account.store.naming.AccountNicknameStore;
import com.robinhood.android.account.store.naming.NicknameValidationResult;
import com.robinhood.android.account.store.onboarding.AccountOnboardingStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
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
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AccountNicknameCreateDuxo.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0015B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/account/naming/create/AccountNicknameCreateDuxo;", "Lcom/robinhood/android/account/naming/common/BaseAccountNicknameDuxo;", "Lcom/robinhood/android/udf/HasSavedState;", "accountOnboardingStore", "Lcom/robinhood/android/account/store/onboarding/AccountOnboardingStore;", "accountNicknameStore", "Lcom/robinhood/android/account/store/naming/AccountNicknameStore;", "stateProvider", "Lcom/robinhood/android/account/naming/common/AccountNicknameStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/account/store/onboarding/AccountOnboardingStore;Lcom/robinhood/android/account/store/naming/AccountNicknameStore;Lcom/robinhood/android/account/naming/common/AccountNicknameStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onSaveClicked", "", "nickname", "", "Companion", "feature-account-naming_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AccountNicknameCreateDuxo extends BaseAccountNicknameDuxo implements HasSavedState {
    private final AccountNicknameStore accountNicknameStore;
    private final AccountOnboardingStore accountOnboardingStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AccountNicknameCreateDuxo(AccountOnboardingStore accountOnboardingStore, AccountNicknameStore accountNicknameStore, AccountNicknameStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(accountOnboardingStore, "accountOnboardingStore");
        Intrinsics.checkNotNullParameter(accountNicknameStore, "accountNicknameStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        int i = C8116R.string.button_continue;
        Companion companion = INSTANCE;
        super(new AccountNicknameDataState(null, null, false, i, ((CreateAccountNicknameFragmentKey) companion.getArgs(savedStateHandle)).getBrokerageAccountType(), ((CreateAccountNicknameFragmentKey) companion.getArgs(savedStateHandle)).getManagementType(), 7, null), stateProvider, duxoBundle);
        this.accountOnboardingStore = accountOnboardingStore;
        this.accountNicknameStore = accountNicknameStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.account.naming.common.BaseAccountNicknameDuxo
    public void onSaveClicked(String nickname) {
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        String string2 = StringsKt.trim(nickname).toString();
        applyMutation(new C81291(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C81302(string2, null), 3, null);
    }

    /* compiled from: AccountNicknameCreateDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/account/naming/common/AccountNicknameDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.account.naming.create.AccountNicknameCreateDuxo$onSaveClicked$1", m3645f = "AccountNicknameCreateDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.account.naming.create.AccountNicknameCreateDuxo$onSaveClicked$1 */
    static final class C81291 extends ContinuationImpl7 implements Function2<AccountNicknameDataState, Continuation<? super AccountNicknameDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C81291(Continuation<? super C81291> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C81291 c81291 = new C81291(continuation);
            c81291.L$0 = obj;
            return c81291;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccountNicknameDataState accountNicknameDataState, Continuation<? super AccountNicknameDataState> continuation) {
            return ((C81291) create(accountNicknameDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AccountNicknameDataState.copy$default((AccountNicknameDataState) this.L$0, null, null, true, 0, null, null, 59, null);
        }
    }

    /* compiled from: AccountNicknameCreateDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.account.naming.create.AccountNicknameCreateDuxo$onSaveClicked$2", m3645f = "AccountNicknameCreateDuxo.kt", m3646l = {44, 48}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.account.naming.create.AccountNicknameCreateDuxo$onSaveClicked$2 */
    static final class C81302 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $trimmedNickname;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C81302(String str, Continuation<? super C81302> continuation) {
            super(2, continuation);
            this.$trimmedNickname = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccountNicknameCreateDuxo.this.new C81302(this.$trimmedNickname, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C81302) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
        
            if (r12 == r0) goto L26;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C81302 c81302;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable unused) {
                c81302 = this;
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccountNicknameStore accountNicknameStore = AccountNicknameCreateDuxo.this.accountNicknameStore;
                String str = this.$trimmedNickname;
                this.label = 1;
                c81302 = this;
                try {
                    obj = AccountNicknameStore.validateNickname$default(accountNicknameStore, str, null, c81302, 2, null);
                    if (obj == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                } catch (Throwable unused2) {
                    AccountNicknameCreateDuxo.this.applyMutation(new AnonymousClass4(null));
                    return Unit.INSTANCE;
                }
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c81302 = this;
                AccountNicknameCreateDuxo.this.applyMutation(new AnonymousClass1(null));
                AccountNicknameCreateDuxo.this.submit(new AccountNicknameEvent.CreateSuccess((String) obj));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            c81302 = this;
            NicknameValidationResult nicknameValidationResult = (NicknameValidationResult) obj;
            if (nicknameValidationResult instanceof NicknameValidationResult.Valid) {
                AccountOnboardingStore accountOnboardingStore = AccountNicknameCreateDuxo.this.accountOnboardingStore;
                Companion companion = AccountNicknameCreateDuxo.INSTANCE;
                BrokerageAccountType brokerageAccountType = ((CreateAccountNicknameFragmentKey) companion.getArgs((HasSavedState) AccountNicknameCreateDuxo.this)).getBrokerageAccountType();
                ManagementType managementType = ((CreateAccountNicknameFragmentKey) companion.getArgs((HasSavedState) AccountNicknameCreateDuxo.this)).getManagementType();
                String nickname = ((NicknameValidationResult.Valid) nicknameValidationResult).getNickname();
                if (nickname == null) {
                    nickname = c81302.$trimmedNickname;
                }
                c81302.label = 2;
                obj = accountOnboardingStore.createApplication(nickname, brokerageAccountType, managementType, this);
            } else {
                AccountNicknameCreateDuxo.this.applyMutation(new AnonymousClass2(nicknameValidationResult, null));
                return Unit.INSTANCE;
            }
        }

        /* compiled from: AccountNicknameCreateDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/account/naming/common/AccountNicknameDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.account.naming.create.AccountNicknameCreateDuxo$onSaveClicked$2$1", m3645f = "AccountNicknameCreateDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.account.naming.create.AccountNicknameCreateDuxo$onSaveClicked$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AccountNicknameDataState, Continuation<? super AccountNicknameDataState>, Object> {
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
            public final Object invoke(AccountNicknameDataState accountNicknameDataState, Continuation<? super AccountNicknameDataState> continuation) {
                return ((AnonymousClass1) create(accountNicknameDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return AccountNicknameDataState.copy$default((AccountNicknameDataState) this.L$0, null, null, false, 0, null, null, 59, null);
            }
        }

        /* compiled from: AccountNicknameCreateDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/account/naming/common/AccountNicknameDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.account.naming.create.AccountNicknameCreateDuxo$onSaveClicked$2$2", m3645f = "AccountNicknameCreateDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.account.naming.create.AccountNicknameCreateDuxo$onSaveClicked$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<AccountNicknameDataState, Continuation<? super AccountNicknameDataState>, Object> {
            final /* synthetic */ NicknameValidationResult $result;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(NicknameValidationResult nicknameValidationResult, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$result = nicknameValidationResult;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$result, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AccountNicknameDataState accountNicknameDataState, Continuation<? super AccountNicknameDataState> continuation) {
                return ((AnonymousClass2) create(accountNicknameDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return AccountNicknameDataState.copy$default((AccountNicknameDataState) this.L$0, null, this.$result, false, 0, null, null, 57, null);
            }
        }

        /* compiled from: AccountNicknameCreateDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/account/naming/common/AccountNicknameDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.account.naming.create.AccountNicknameCreateDuxo$onSaveClicked$2$4", m3645f = "AccountNicknameCreateDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.account.naming.create.AccountNicknameCreateDuxo$onSaveClicked$2$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<AccountNicknameDataState, Continuation<? super AccountNicknameDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AccountNicknameDataState accountNicknameDataState, Continuation<? super AccountNicknameDataState> continuation) {
                return ((AnonymousClass4) create(accountNicknameDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return AccountNicknameDataState.copy$default((AccountNicknameDataState) this.L$0, null, NicknameValidationResult.UnknownError.INSTANCE, false, 0, null, null, 57, null);
            }
        }
    }

    /* compiled from: AccountNicknameCreateDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/account/naming/create/AccountNicknameCreateDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/account/naming/create/AccountNicknameCreateDuxo;", "Lcom/robinhood/android/account/contracts/naming/CreateAccountNicknameFragmentKey;", "<init>", "()V", "feature-account-naming_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AccountNicknameCreateDuxo, CreateAccountNicknameFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CreateAccountNicknameFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (CreateAccountNicknameFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CreateAccountNicknameFragmentKey getArgs(AccountNicknameCreateDuxo accountNicknameCreateDuxo) {
            return (CreateAccountNicknameFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, accountNicknameCreateDuxo);
        }
    }
}
