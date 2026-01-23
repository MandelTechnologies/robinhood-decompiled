package com.robinhood.android.account.settings.accountnumbers;

import bonfire.proto.idl.accounts.p028v1.AccountNumbersResponseDto;
import com.robinhood.android.account.store.settings.AccountSettingsStore;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: AccountNumbersDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/account/settings/accountnumbers/AccountNumbersDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/account/settings/accountnumbers/AccountNumbersDataState;", "Lcom/robinhood/android/account/settings/accountnumbers/AccountNumbersViewState;", "accountSettingsStore", "Lcom/robinhood/android/account/store/settings/AccountSettingsStore;", "stateProvider", "Lcom/robinhood/android/account/settings/accountnumbers/AccountNumbersStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/account/store/settings/AccountSettingsStore;Lcom/robinhood/android/account/settings/accountnumbers/AccountNumbersStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "value", "", "isSecondaryAuthenticated", "()Z", "setSecondaryAuthenticated", "(Z)V", "onCreate", "", "feature-account-number-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AccountNumbersDuxo extends BaseDuxo<AccountNumbersDataState, AccountNumbersViewState> {
    public static final int $stable = 8;
    private final AccountSettingsStore accountSettingsStore;
    private boolean isSecondaryAuthenticated;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AccountNumbersDuxo(AccountSettingsStore accountSettingsStore, AccountNumbersStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new AccountNumbersDataState(false, null, 3, 0 == true ? 1 : 0), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(accountSettingsStore, "accountSettingsStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountSettingsStore = accountSettingsStore;
    }

    /* renamed from: isSecondaryAuthenticated, reason: from getter */
    public final boolean getIsSecondaryAuthenticated() {
        return this.isSecondaryAuthenticated;
    }

    /* compiled from: AccountNumbersDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/account/settings/accountnumbers/AccountNumbersDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.account.settings.accountnumbers.AccountNumbersDuxo$isSecondaryAuthenticated$1", m3645f = "AccountNumbersDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.account.settings.accountnumbers.AccountNumbersDuxo$isSecondaryAuthenticated$1 */
    static final class C81651 extends ContinuationImpl7 implements Function2<AccountNumbersDataState, Continuation<? super AccountNumbersDataState>, Object> {
        final /* synthetic */ boolean $value;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C81651(boolean z, Continuation<? super C81651> continuation) {
            super(2, continuation);
            this.$value = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C81651 c81651 = new C81651(this.$value, continuation);
            c81651.L$0 = obj;
            return c81651;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccountNumbersDataState accountNumbersDataState, Continuation<? super AccountNumbersDataState> continuation) {
            return ((C81651) create(accountNumbersDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AccountNumbersDataState.copy$default((AccountNumbersDataState) this.L$0, this.$value, null, 2, null);
        }
    }

    public final void setSecondaryAuthenticated(boolean z) {
        this.isSecondaryAuthenticated = z;
        applyMutation(new C81651(z, null));
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C81661(null));
    }

    /* compiled from: AccountNumbersDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.account.settings.accountnumbers.AccountNumbersDuxo$onCreate$1", m3645f = "AccountNumbersDuxo.kt", m3646l = {35}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.account.settings.accountnumbers.AccountNumbersDuxo$onCreate$1 */
    static final class C81661 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C81661(Continuation<? super C81661> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccountNumbersDuxo.this.new C81661(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C81661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<AccountNumbersResponseDto> flowStreamAccountNumbers = AccountNumbersDuxo.this.accountSettingsStore.streamAccountNumbers();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AccountNumbersDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamAccountNumbers, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: AccountNumbersDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lbonfire/proto/idl/accounts/v1/AccountNumbersResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.account.settings.accountnumbers.AccountNumbersDuxo$onCreate$1$1", m3645f = "AccountNumbersDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.account.settings.accountnumbers.AccountNumbersDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AccountNumbersResponseDto, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AccountNumbersDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AccountNumbersDuxo accountNumbersDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = accountNumbersDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AccountNumbersResponseDto accountNumbersResponseDto, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(accountNumbersResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: AccountNumbersDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/account/settings/accountnumbers/AccountNumbersDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.account.settings.accountnumbers.AccountNumbersDuxo$onCreate$1$1$1", m3645f = "AccountNumbersDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.account.settings.accountnumbers.AccountNumbersDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C495121 extends ContinuationImpl7 implements Function2<AccountNumbersDataState, Continuation<? super AccountNumbersDataState>, Object> {
                final /* synthetic */ AccountNumbersResponseDto $response;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C495121(AccountNumbersResponseDto accountNumbersResponseDto, Continuation<? super C495121> continuation) {
                    super(2, continuation);
                    this.$response = accountNumbersResponseDto;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C495121 c495121 = new C495121(this.$response, continuation);
                    c495121.L$0 = obj;
                    return c495121;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AccountNumbersDataState accountNumbersDataState, Continuation<? super AccountNumbersDataState> continuation) {
                    return ((C495121) create(accountNumbersDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return AccountNumbersDataState.copy$default((AccountNumbersDataState) this.L$0, false, this.$response, 1, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C495121((AccountNumbersResponseDto) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
