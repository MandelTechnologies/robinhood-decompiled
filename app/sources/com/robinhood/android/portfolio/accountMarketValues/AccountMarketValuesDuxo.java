package com.robinhood.android.portfolio.accountMarketValues;

import androidx.lifecycle.SavedStateHandle;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.models.portfolio.AccountMarketValues;
import com.robinhood.android.portfolio.contracts.AccountMarketValuesContract;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.AccountMarketValuesStore;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: AccountMarketValuesDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0015B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/portfolio/accountMarketValues/AccountMarketValuesDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/portfolio/accountMarketValues/AccountMarketValuesDataState;", "Lcom/robinhood/android/portfolio/accountMarketValues/AccountMarketValuesViewState;", "Lcom/robinhood/android/udf/HasSavedState;", PlaceTypes.STORE, "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/AccountMarketValuesStore;", "stateProvider", "Lcom/robinhood/android/portfolio/accountMarketValues/AccountMarketValuesStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/AccountMarketValuesStore;Lcom/robinhood/android/portfolio/accountMarketValues/AccountMarketValuesStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/AccountMarketValuesStore;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class AccountMarketValuesDuxo extends BaseDuxo<AccountMarketValuesDataState, AccountMarketValuesViewState> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;
    private final AccountMarketValuesStore store;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final AccountMarketValuesStore getStore() {
        return this.store;
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountMarketValuesDuxo(AccountMarketValuesStore store, AccountMarketValuesStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new AccountMarketValuesDataState(null, 1, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.store = store;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: AccountMarketValuesDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/portfolio/accountMarketValues/AccountMarketValuesDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/portfolio/accountMarketValues/AccountMarketValuesDuxo;", "Lcom/robinhood/android/portfolio/contracts/AccountMarketValuesContract$Key;", "<init>", "()V", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AccountMarketValuesDuxo, AccountMarketValuesContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AccountMarketValuesContract.Key getArgs(SavedStateHandle savedStateHandle) {
            return (AccountMarketValuesContract.Key) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AccountMarketValuesContract.Key getArgs(AccountMarketValuesDuxo accountMarketValuesDuxo) {
            return (AccountMarketValuesContract.Key) DuxoCompanion.DefaultImpls.getArgs(this, accountMarketValuesDuxo);
        }
    }

    /* compiled from: AccountMarketValuesDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.accountMarketValues.AccountMarketValuesDuxo$onCreate$1", m3645f = "AccountMarketValuesDuxo.kt", m3646l = {33}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.portfolio.accountMarketValues.AccountMarketValuesDuxo$onCreate$1 */
    static final class C255551 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C255551(Continuation<? super C255551> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccountMarketValuesDuxo.this.new C255551(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C255551) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccountMarketValuesStore store = AccountMarketValuesDuxo.this.getStore();
                Companion companion = AccountMarketValuesDuxo.INSTANCE;
                Flow<AccountMarketValues> flowStreamMarketValues = store.streamMarketValues(((AccountMarketValuesContract.Key) companion.getArgs((HasSavedState) AccountMarketValuesDuxo.this)).getAccountNumber(), ((AccountMarketValuesContract.Key) companion.getArgs((HasSavedState) AccountMarketValuesDuxo.this)).getType(), ((AccountMarketValuesContract.Key) companion.getArgs((HasSavedState) AccountMarketValuesDuxo.this)).getDisplaySpan());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AccountMarketValuesDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamMarketValues, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: AccountMarketValuesDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "marketValues", "Lcom/robinhood/android/models/portfolio/AccountMarketValues;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.portfolio.accountMarketValues.AccountMarketValuesDuxo$onCreate$1$1", m3645f = "AccountMarketValuesDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.portfolio.accountMarketValues.AccountMarketValuesDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AccountMarketValues, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AccountMarketValuesDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AccountMarketValuesDuxo accountMarketValuesDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = accountMarketValuesDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AccountMarketValues accountMarketValues, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(accountMarketValues, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: AccountMarketValuesDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/accountMarketValues/AccountMarketValuesDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.portfolio.accountMarketValues.AccountMarketValuesDuxo$onCreate$1$1$1", m3645f = "AccountMarketValuesDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.portfolio.accountMarketValues.AccountMarketValuesDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C504571 extends ContinuationImpl7 implements Function2<AccountMarketValuesDataState, Continuation<? super AccountMarketValuesDataState>, Object> {
                final /* synthetic */ AccountMarketValues $marketValues;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C504571(AccountMarketValues accountMarketValues, Continuation<? super C504571> continuation) {
                    super(2, continuation);
                    this.$marketValues = accountMarketValues;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C504571 c504571 = new C504571(this.$marketValues, continuation);
                    c504571.L$0 = obj;
                    return c504571;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AccountMarketValuesDataState accountMarketValuesDataState, Continuation<? super AccountMarketValuesDataState> continuation) {
                    return ((C504571) create(accountMarketValuesDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((AccountMarketValuesDataState) this.L$0).copy(this.$marketValues);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C504571((AccountMarketValues) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C255551(null));
    }
}
