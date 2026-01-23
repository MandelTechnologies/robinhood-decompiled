package com.robinhood.android.common.margin.p083ui.eligibility;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.margin.p083ui.eligibility.MarginEligibilityChecklistFragment;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.margin.MarginEligibilityStore;
import com.robinhood.android.lib.margin.api.ApiMarginEligibility;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: MarginEligibilityChecklistDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0017B9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistDataState;", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "marginEligibilityStore", "Lcom/robinhood/android/lib/margin/MarginEligibilityStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistStateProvider;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/lib/margin/MarginEligibilityStore;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistStateProvider;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class MarginEligibilityChecklistDuxo extends BaseDuxo<MarginEligibilityChecklistDataState, MarginEligibilityChecklistViewState> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final MarginEligibilityStore marginEligibilityStore;
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
    public MarginEligibilityChecklistDuxo(AccountProvider accountProvider, MarginEligibilityStore marginEligibilityStore, UserStore userStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, MarginEligibilityChecklistViewState3 stateProvider) {
        super(new MarginEligibilityChecklistDataState(null, null, null, null, 15, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(marginEligibilityStore, "marginEligibilityStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.accountProvider = accountProvider;
        this.marginEligibilityStore = marginEligibilityStore;
        this.userStore = userStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: MarginEligibilityChecklistDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.margin.ui.eligibility.MarginEligibilityChecklistDuxo$onCreate$1", m3645f = "MarginEligibilityChecklistDuxo.kt", m3646l = {78, 79}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.common.margin.ui.eligibility.MarginEligibilityChecklistDuxo$onCreate$1 */
    static final class C112391 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C112391(Continuation<? super C112391> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarginEligibilityChecklistDuxo.this.new C112391(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C112391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            User user;
            Account account;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Observable<User> user2 = MarginEligibilityChecklistDuxo.this.userStore.getUser();
                this.label = 1;
                obj = RxAwait3.awaitFirstOrNull(user2, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                user = (User) this.L$0;
                ResultKt.throwOnFailure(obj);
                account = (Account) obj;
                if (account != null) {
                    throw new IllegalStateException("Must have account!");
                }
                MarginEligibilityChecklistDuxo.this.getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new AnonymousClass1(MarginEligibilityChecklistDuxo.this, account, user, null));
                MarginEligibilityChecklistDuxo.this.getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new AnonymousClass2(MarginEligibilityChecklistDuxo.this, null));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            User user3 = (User) obj;
            if (user3 != null) {
                Observable<Account> observableStreamAccount = MarginEligibilityChecklistDuxo.this.accountProvider.streamAccount(((MarginEligibilityChecklistFragment.Args) MarginEligibilityChecklistDuxo.INSTANCE.getArgs((HasSavedState) MarginEligibilityChecklistDuxo.this)).getAccountNumber());
                this.L$0 = user3;
                this.label = 2;
                Object objAwaitFirstOrNull = RxAwait3.awaitFirstOrNull(observableStreamAccount, this);
                if (objAwaitFirstOrNull != coroutine_suspended) {
                    user = user3;
                    obj = objAwaitFirstOrNull;
                    account = (Account) obj;
                    if (account != null) {
                    }
                }
                return coroutine_suspended;
            }
            throw new IllegalStateException("Must have user!");
        }

        /* compiled from: MarginEligibilityChecklistDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.margin.ui.eligibility.MarginEligibilityChecklistDuxo$onCreate$1$1", m3645f = "MarginEligibilityChecklistDuxo.kt", m3646l = {39}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.margin.ui.eligibility.MarginEligibilityChecklistDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Account $account;
            final /* synthetic */ User $user;
            int label;
            final /* synthetic */ MarginEligibilityChecklistDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(MarginEligibilityChecklistDuxo marginEligibilityChecklistDuxo, Account account, User user, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = marginEligibilityChecklistDuxo;
                this.$account = account;
                this.$user = user;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$account, this.$user, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        MarginEligibilityStore marginEligibilityStore = this.this$0.marginEligibilityStore;
                        String accountNumber = ((MarginEligibilityChecklistFragment.Args) MarginEligibilityChecklistDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getAccountNumber();
                        this.label = 1;
                        obj = marginEligibilityStore.updateMarginEligibilityCooldown(accountNumber, true, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    this.this$0.applyMutation(new C496811(this.$account, (ApiMarginEligibility) obj, this.$user, null));
                } catch (Exception e) {
                    this.this$0.applyMutation(new AnonymousClass2(e, null));
                }
                return Unit.INSTANCE;
            }

            /* compiled from: MarginEligibilityChecklistDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.common.margin.ui.eligibility.MarginEligibilityChecklistDuxo$onCreate$1$1$1", m3645f = "MarginEligibilityChecklistDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.common.margin.ui.eligibility.MarginEligibilityChecklistDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C496811 extends ContinuationImpl7 implements Function2<MarginEligibilityChecklistDataState, Continuation<? super MarginEligibilityChecklistDataState>, Object> {
                final /* synthetic */ Account $account;
                final /* synthetic */ ApiMarginEligibility $eligibility;
                final /* synthetic */ User $user;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C496811(Account account, ApiMarginEligibility apiMarginEligibility, User user, Continuation<? super C496811> continuation) {
                    super(2, continuation);
                    this.$account = account;
                    this.$eligibility = apiMarginEligibility;
                    this.$user = user;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C496811 c496811 = new C496811(this.$account, this.$eligibility, this.$user, continuation);
                    c496811.L$0 = obj;
                    return c496811;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(MarginEligibilityChecklistDataState marginEligibilityChecklistDataState, Continuation<? super MarginEligibilityChecklistDataState> continuation) {
                    return ((C496811) create(marginEligibilityChecklistDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return MarginEligibilityChecklistDataState.copy$default((MarginEligibilityChecklistDataState) this.L$0, this.$account, this.$eligibility, this.$user.getOrigin().getLocality(), null, 8, null);
                }
            }

            /* compiled from: MarginEligibilityChecklistDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.common.margin.ui.eligibility.MarginEligibilityChecklistDuxo$onCreate$1$1$2", m3645f = "MarginEligibilityChecklistDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.common.margin.ui.eligibility.MarginEligibilityChecklistDuxo$onCreate$1$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<MarginEligibilityChecklistDataState, Continuation<? super MarginEligibilityChecklistDataState>, Object> {

                /* renamed from: $e */
                final /* synthetic */ Exception f3988$e;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(Exception exc, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.f3988$e = exc;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f3988$e, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(MarginEligibilityChecklistDataState marginEligibilityChecklistDataState, Continuation<? super MarginEligibilityChecklistDataState> continuation) {
                    return ((AnonymousClass2) create(marginEligibilityChecklistDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return MarginEligibilityChecklistDataState.copy$default((MarginEligibilityChecklistDataState) this.L$0, null, null, null, this.f3988$e, 7, null);
                }
            }
        }

        /* compiled from: MarginEligibilityChecklistDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.margin.ui.eligibility.MarginEligibilityChecklistDuxo$onCreate$1$2", m3645f = "MarginEligibilityChecklistDuxo.kt", m3646l = {59}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.margin.ui.eligibility.MarginEligibilityChecklistDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ MarginEligibilityChecklistDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(MarginEligibilityChecklistDuxo marginEligibilityChecklistDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = marginEligibilityChecklistDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        MarginEligibilityStore marginEligibilityStore = this.this$0.marginEligibilityStore;
                        String accountNumber = ((MarginEligibilityChecklistFragment.Args) MarginEligibilityChecklistDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getAccountNumber();
                        this.label = 1;
                        obj = marginEligibilityStore.getMarginEligibility(accountNumber, true, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    this.this$0.applyMutation(new AnonymousClass1((ApiMarginEligibility) obj, null));
                } catch (Exception e) {
                    this.this$0.applyMutation(new C496822(e, null));
                }
                return Unit.INSTANCE;
            }

            /* compiled from: MarginEligibilityChecklistDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.common.margin.ui.eligibility.MarginEligibilityChecklistDuxo$onCreate$1$2$1", m3645f = "MarginEligibilityChecklistDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.common.margin.ui.eligibility.MarginEligibilityChecklistDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MarginEligibilityChecklistDataState, Continuation<? super MarginEligibilityChecklistDataState>, Object> {
                final /* synthetic */ ApiMarginEligibility $eligibility;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ApiMarginEligibility apiMarginEligibility, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$eligibility = apiMarginEligibility;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$eligibility, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(MarginEligibilityChecklistDataState marginEligibilityChecklistDataState, Continuation<? super MarginEligibilityChecklistDataState> continuation) {
                    return ((AnonymousClass1) create(marginEligibilityChecklistDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return MarginEligibilityChecklistDataState.copy$default((MarginEligibilityChecklistDataState) this.L$0, null, this.$eligibility, null, null, 13, null);
                }
            }

            /* compiled from: MarginEligibilityChecklistDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.common.margin.ui.eligibility.MarginEligibilityChecklistDuxo$onCreate$1$2$2", m3645f = "MarginEligibilityChecklistDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.common.margin.ui.eligibility.MarginEligibilityChecklistDuxo$onCreate$1$2$2, reason: invalid class name and collision with other inner class name */
            static final class C496822 extends ContinuationImpl7 implements Function2<MarginEligibilityChecklistDataState, Continuation<? super MarginEligibilityChecklistDataState>, Object> {

                /* renamed from: $e */
                final /* synthetic */ Exception f3989$e;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C496822(Exception exc, Continuation<? super C496822> continuation) {
                    super(2, continuation);
                    this.f3989$e = exc;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C496822 c496822 = new C496822(this.f3989$e, continuation);
                    c496822.L$0 = obj;
                    return c496822;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(MarginEligibilityChecklistDataState marginEligibilityChecklistDataState, Continuation<? super MarginEligibilityChecklistDataState> continuation) {
                    return ((C496822) create(marginEligibilityChecklistDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return MarginEligibilityChecklistDataState.copy$default((MarginEligibilityChecklistDataState) this.L$0, null, null, null, this.f3989$e, 7, null);
                }
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C112391(null), 3, null);
    }

    /* compiled from: MarginEligibilityChecklistDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistDuxo;", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistFragment$Args;", "<init>", "()V", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<MarginEligibilityChecklistDuxo, MarginEligibilityChecklistFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MarginEligibilityChecklistFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (MarginEligibilityChecklistFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MarginEligibilityChecklistFragment.Args getArgs(MarginEligibilityChecklistDuxo marginEligibilityChecklistDuxo) {
            return (MarginEligibilityChecklistFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, marginEligibilityChecklistDuxo);
        }
    }
}
