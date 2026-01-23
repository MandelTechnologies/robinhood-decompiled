package com.robinhood.android.account.naming.edit;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.account.contracts.naming.EditAccountNicknameFragmentKey;
import com.robinhood.android.account.naming.C8116R;
import com.robinhood.android.account.naming.common.AccountNicknameDataState;
import com.robinhood.android.account.naming.common.AccountNicknameEvent;
import com.robinhood.android.account.naming.common.AccountNicknameStateProvider;
import com.robinhood.android.account.naming.common.BaseAccountNicknameDuxo;
import com.robinhood.android.account.store.naming.AccountNicknameStore;
import com.robinhood.android.account.store.naming.NicknameValidationResult;
import com.robinhood.android.dashboard.store.HomeDashboardStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.p320db.Account;
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
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: AccountNicknameEditDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u0018B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/account/naming/edit/AccountNicknameEditDuxo;", "Lcom/robinhood/android/account/naming/common/BaseAccountNicknameDuxo;", "Lcom/robinhood/android/udf/HasSavedState;", "accountNicknameStore", "Lcom/robinhood/android/account/store/naming/AccountNicknameStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "homeDashboardStore", "Lcom/robinhood/android/dashboard/store/HomeDashboardStore;", "stateProvider", "Lcom/robinhood/android/account/naming/common/AccountNicknameStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/account/store/naming/AccountNicknameStore;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/dashboard/store/HomeDashboardStore;Lcom/robinhood/android/account/naming/common/AccountNicknameStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onSaveClicked", "nickname", "", "Companion", "feature-account-naming_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AccountNicknameEditDuxo extends BaseAccountNicknameDuxo implements HasSavedState {
    private final AccountNicknameStore accountNicknameStore;
    private final AccountProvider accountProvider;
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
    public AccountNicknameEditDuxo(AccountNicknameStore accountNicknameStore, AccountProvider accountProvider, HomeDashboardStore homeDashboardStore, AccountNicknameStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new AccountNicknameDataState(null, null, false, C8116R.string.button_save, null, null, 55, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(accountNicknameStore, "accountNicknameStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(homeDashboardStore, "homeDashboardStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountNicknameStore = accountNicknameStore;
        this.accountProvider = accountProvider;
        this.homeDashboardStore = homeDashboardStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C81401(null), 3, null);
    }

    /* compiled from: AccountNicknameEditDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.account.naming.edit.AccountNicknameEditDuxo$onCreate$1", m3645f = "AccountNicknameEditDuxo.kt", m3646l = {43}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.account.naming.edit.AccountNicknameEditDuxo$onCreate$1 */
    static final class C81401 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C81401(Continuation<? super C81401> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccountNicknameEditDuxo.this.new C81401(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C81401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(AccountNicknameEditDuxo.this.accountProvider.streamAccount(((EditAccountNicknameFragmentKey) AccountNicknameEditDuxo.INSTANCE.getArgs((HasSavedState) AccountNicknameEditDuxo.this)).getAccountNumber())), Integer.MAX_VALUE, null, 2, null);
                this.label = 1;
                obj = FlowKt.firstOrNull(flowBuffer$default, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Account account = (Account) obj;
            if (account != null) {
                String nickname = account.getNickname();
                if (nickname != null) {
                    AccountNicknameEditDuxo.this.onNicknameChanged(nickname);
                }
                AccountNicknameEditDuxo.this.applyMutation(new AnonymousClass2(account, null));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: AccountNicknameEditDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/account/naming/common/AccountNicknameDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.account.naming.edit.AccountNicknameEditDuxo$onCreate$1$2", m3645f = "AccountNicknameEditDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.account.naming.edit.AccountNicknameEditDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<AccountNicknameDataState, Continuation<? super AccountNicknameDataState>, Object> {
            final /* synthetic */ Account $account;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Account account, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$account = account;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$account, continuation);
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
                return AccountNicknameDataState.copy$default((AccountNicknameDataState) this.L$0, null, null, false, 0, this.$account.getBrokerageAccountType(), this.$account.getManagementType(), 15, null);
            }
        }
    }

    @Override // com.robinhood.android.account.naming.common.BaseAccountNicknameDuxo
    public void onSaveClicked(String nickname) {
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        String string2 = StringsKt.trim(nickname).toString();
        applyMutation(new C81411(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C81422(string2, ((EditAccountNicknameFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getAccountNumber(), null), 3, null);
    }

    /* compiled from: AccountNicknameEditDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/account/naming/common/AccountNicknameDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.account.naming.edit.AccountNicknameEditDuxo$onSaveClicked$1", m3645f = "AccountNicknameEditDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.account.naming.edit.AccountNicknameEditDuxo$onSaveClicked$1 */
    static final class C81411 extends ContinuationImpl7 implements Function2<AccountNicknameDataState, Continuation<? super AccountNicknameDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C81411(Continuation<? super C81411> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C81411 c81411 = new C81411(continuation);
            c81411.L$0 = obj;
            return c81411;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccountNicknameDataState accountNicknameDataState, Continuation<? super AccountNicknameDataState> continuation) {
            return ((C81411) create(accountNicknameDataState, continuation)).invokeSuspend(Unit.INSTANCE);
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

    /* compiled from: AccountNicknameEditDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.account.naming.edit.AccountNicknameEditDuxo$onSaveClicked$2", m3645f = "AccountNicknameEditDuxo.kt", m3646l = {65, 69}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.account.naming.edit.AccountNicknameEditDuxo$onSaveClicked$2 */
    static final class C81422 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ String $trimmedNickname;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C81422(String str, String str2, Continuation<? super C81422> continuation) {
            super(2, continuation);
            this.$trimmedNickname = str;
            this.$accountNumber = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccountNicknameEditDuxo.this.new C81422(this.$trimmedNickname, this.$accountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C81422) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
        
            if (r1.setNickname(r7, r5, r6) == r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable unused) {
                AccountNicknameEditDuxo.this.applyMutation(new AnonymousClass4(null));
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccountNicknameStore accountNicknameStore = AccountNicknameEditDuxo.this.accountNicknameStore;
                String str = this.$trimmedNickname;
                String str2 = this.$accountNumber;
                this.label = 1;
                obj = accountNicknameStore.validateNickname(str, str2, this);
                if (obj == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                AccountNicknameEditDuxo.this.accountProvider.refresh(true);
                AccountNicknameEditDuxo.this.homeDashboardStore.forceRefresh();
                AccountNicknameEditDuxo.this.applyMutation(new AnonymousClass1(null));
                AccountNicknameEditDuxo.this.submit(AccountNicknameEvent.OnSaveSuccess.INSTANCE);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            NicknameValidationResult nicknameValidationResult = (NicknameValidationResult) obj;
            if (nicknameValidationResult instanceof NicknameValidationResult.Valid) {
                AccountNicknameStore accountNicknameStore2 = AccountNicknameEditDuxo.this.accountNicknameStore;
                String nickname = ((NicknameValidationResult.Valid) nicknameValidationResult).getNickname();
                if (nickname == null) {
                    nickname = this.$trimmedNickname;
                }
                String str3 = this.$accountNumber;
                this.label = 2;
            } else {
                AccountNicknameEditDuxo.this.applyMutation(new AnonymousClass2(nicknameValidationResult, null));
                return Unit.INSTANCE;
            }
        }

        /* compiled from: AccountNicknameEditDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/account/naming/common/AccountNicknameDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.account.naming.edit.AccountNicknameEditDuxo$onSaveClicked$2$1", m3645f = "AccountNicknameEditDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.account.naming.edit.AccountNicknameEditDuxo$onSaveClicked$2$1, reason: invalid class name */
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

        /* compiled from: AccountNicknameEditDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/account/naming/common/AccountNicknameDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.account.naming.edit.AccountNicknameEditDuxo$onSaveClicked$2$2", m3645f = "AccountNicknameEditDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.account.naming.edit.AccountNicknameEditDuxo$onSaveClicked$2$2, reason: invalid class name */
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

        /* compiled from: AccountNicknameEditDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/account/naming/common/AccountNicknameDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.account.naming.edit.AccountNicknameEditDuxo$onSaveClicked$2$4", m3645f = "AccountNicknameEditDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.account.naming.edit.AccountNicknameEditDuxo$onSaveClicked$2$4, reason: invalid class name */
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

    /* compiled from: AccountNicknameEditDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/account/naming/edit/AccountNicknameEditDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/account/naming/edit/AccountNicknameEditDuxo;", "Lcom/robinhood/android/account/contracts/naming/EditAccountNicknameFragmentKey;", "<init>", "()V", "feature-account-naming_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AccountNicknameEditDuxo, EditAccountNicknameFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EditAccountNicknameFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (EditAccountNicknameFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EditAccountNicknameFragmentKey getArgs(AccountNicknameEditDuxo accountNicknameEditDuxo) {
            return (EditAccountNicknameFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, accountNicknameEditDuxo);
        }
    }
}
