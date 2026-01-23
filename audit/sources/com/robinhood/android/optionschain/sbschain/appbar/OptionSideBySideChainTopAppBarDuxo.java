package com.robinhood.android.optionschain.sbschain.appbar;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.options.contracts.InternalOptionChainFragmentKey;
import com.robinhood.android.optionsexperiment.Experiments;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionAccountSwitcherStore;
import com.robinhood.librobinhood.data.store.OptionSideBySideChainStore;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: OptionSideBySideChainTopAppBarDuxo.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0019BA\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/appbar/OptionSideBySideChainTopAppBarDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/optionschain/sbschain/appbar/OptionSideBySideChainTopAppBarDataState;", "Lcom/robinhood/android/optionschain/sbschain/appbar/OptionSideBySideChainTopAppBarViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "optionAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;", "optionSideBySideChainStore", "Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/optionschain/sbschain/appbar/OptionSideBySideChainTopAppBarStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/optionschain/sbschain/appbar/OptionSideBySideChainTopAppBarStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionSideBySideChainTopAppBarDuxo extends BaseDuxo<OptionSideBySideChainTopAppBarDataState, OptionSideBySideChainTopAppBarViewState> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final ExperimentsStore experimentsStore;
    private final OptionAccountSwitcherStore optionAccountSwitcherStore;
    private final OptionSideBySideChainStore optionSideBySideChainStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OptionSideBySideChainTopAppBarDuxo(AccountProvider accountProvider, ExperimentsStore experimentsStore, OptionAccountSwitcherStore optionAccountSwitcherStore, OptionSideBySideChainStore optionSideBySideChainStore, SavedStateHandle savedStateHandle, OptionSideBySideChainTopAppBarStateProvider stateProvider, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(optionAccountSwitcherStore, "optionAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(optionSideBySideChainStore, "optionSideBySideChainStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Companion companion = INSTANCE;
        super(new OptionSideBySideChainTopAppBarDataState(null, ((InternalOptionChainFragmentKey) companion.getArgs(savedStateHandle)).getUiOptionChains(), false, false, false, ((InternalOptionChainFragmentKey) companion.getArgs(savedStateHandle)).getLaunchMode(), 29, null), stateProvider, duxoBundle);
        this.accountProvider = accountProvider;
        this.experimentsStore = experimentsStore;
        this.optionAccountSwitcherStore = optionAccountSwitcherStore;
        this.optionSideBySideChainStore = optionSideBySideChainStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        AccountProvider.DefaultImpls.refresh$default(this.accountProvider, false, 1, null);
        this.optionAccountSwitcherStore.setActiveAccountNumber(((InternalOptionChainFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getInitialAccountNumber());
        Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.optionAccountSwitcherStore.streamActiveAccountNumber()), Integer.MAX_VALUE, null, 2, null);
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C244501(flowBuffer$default, this, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C244512(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C244523(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C244534(null));
    }

    /* compiled from: OptionSideBySideChainTopAppBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBarDuxo$onCreate$1", m3645f = "OptionSideBySideChainTopAppBarDuxo.kt", m3646l = {57}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBarDuxo$onCreate$1 */
    static final class C244501 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<String> $accountNumberFlow;
        int label;
        final /* synthetic */ OptionSideBySideChainTopAppBarDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C244501(Flow<String> flow, OptionSideBySideChainTopAppBarDuxo optionSideBySideChainTopAppBarDuxo, Continuation<? super C244501> continuation) {
            super(2, continuation);
            this.$accountNumberFlow = flow;
            this.this$0 = optionSideBySideChainTopAppBarDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C244501(this.$accountNumberFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C244501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.transformLatest(this.$accountNumberFlow, new C24449x3a7c665a(null, this.this$0)));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: OptionSideBySideChainTopAppBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "account", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBarDuxo$onCreate$1$2", m3645f = "OptionSideBySideChainTopAppBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBarDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Account, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionSideBySideChainTopAppBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionSideBySideChainTopAppBarDuxo optionSideBySideChainTopAppBarDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionSideBySideChainTopAppBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Account account, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(account, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionSideBySideChainTopAppBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/appbar/OptionSideBySideChainTopAppBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBarDuxo$onCreate$1$2$1", m3645f = "OptionSideBySideChainTopAppBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBarDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionSideBySideChainTopAppBarDataState, Continuation<? super OptionSideBySideChainTopAppBarDataState>, Object> {
                final /* synthetic */ Account $account;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Account account, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$account = account;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$account, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionSideBySideChainTopAppBarDataState optionSideBySideChainTopAppBarDataState, Continuation<? super OptionSideBySideChainTopAppBarDataState> continuation) {
                    return ((AnonymousClass1) create(optionSideBySideChainTopAppBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionSideBySideChainTopAppBarDataState.copy$default((OptionSideBySideChainTopAppBarDataState) this.L$0, this.$account, null, false, false, false, null, 62, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((Account) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionSideBySideChainTopAppBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBarDuxo$onCreate$2", m3645f = "OptionSideBySideChainTopAppBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBarDuxo$onCreate$2 */
    static final class C244512 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C244512(Continuation<? super C244512> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionSideBySideChainTopAppBarDuxo.this.new C244512(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C244512) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OptionSideBySideChainTopAppBarDuxo optionSideBySideChainTopAppBarDuxo = OptionSideBySideChainTopAppBarDuxo.this;
            optionSideBySideChainTopAppBarDuxo.applyMutation(new AnonymousClass1(optionSideBySideChainTopAppBarDuxo, null));
            return Unit.INSTANCE;
        }

        /* compiled from: OptionSideBySideChainTopAppBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/appbar/OptionSideBySideChainTopAppBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBarDuxo$onCreate$2$1", m3645f = "OptionSideBySideChainTopAppBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBarDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionSideBySideChainTopAppBarDataState, Continuation<? super OptionSideBySideChainTopAppBarDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionSideBySideChainTopAppBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionSideBySideChainTopAppBarDuxo optionSideBySideChainTopAppBarDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionSideBySideChainTopAppBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionSideBySideChainTopAppBarDataState optionSideBySideChainTopAppBarDataState, Continuation<? super OptionSideBySideChainTopAppBarDataState> continuation) {
                return ((AnonymousClass1) create(optionSideBySideChainTopAppBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    return OptionSideBySideChainTopAppBarDataState.copy$default((OptionSideBySideChainTopAppBarDataState) this.L$0, null, null, this.this$0.optionSideBySideChainStore.getChainSettingsShown(), false, false, null, 59, null);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionSideBySideChainTopAppBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBarDuxo$onCreate$3", m3645f = "OptionSideBySideChainTopAppBarDuxo.kt", m3646l = {74}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBarDuxo$onCreate$3 */
    static final class C244523 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C244523(Continuation<? super C244523> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionSideBySideChainTopAppBarDuxo.this.new C244523(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C244523) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(OptionSideBySideChainTopAppBarDuxo.this.experimentsStore, new Experiment[]{Experiments.OptionsSbsBidAskSetting.INSTANCE}, false, null, 6, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionSideBySideChainTopAppBarDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: OptionSideBySideChainTopAppBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "inExp", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBarDuxo$onCreate$3$1", m3645f = "OptionSideBySideChainTopAppBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBarDuxo$onCreate$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ OptionSideBySideChainTopAppBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionSideBySideChainTopAppBarDuxo optionSideBySideChainTopAppBarDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionSideBySideChainTopAppBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionSideBySideChainTopAppBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/appbar/OptionSideBySideChainTopAppBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBarDuxo$onCreate$3$1$1", m3645f = "OptionSideBySideChainTopAppBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBarDuxo$onCreate$3$1$1, reason: invalid class name and collision with other inner class name */
            static final class C504061 extends ContinuationImpl7 implements Function2<OptionSideBySideChainTopAppBarDataState, Continuation<? super OptionSideBySideChainTopAppBarDataState>, Object> {
                final /* synthetic */ boolean $inExp;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C504061(boolean z, Continuation<? super C504061> continuation) {
                    super(2, continuation);
                    this.$inExp = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C504061 c504061 = new C504061(this.$inExp, continuation);
                    c504061.L$0 = obj;
                    return c504061;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionSideBySideChainTopAppBarDataState optionSideBySideChainTopAppBarDataState, Continuation<? super OptionSideBySideChainTopAppBarDataState> continuation) {
                    return ((C504061) create(optionSideBySideChainTopAppBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionSideBySideChainTopAppBarDataState.copy$default((OptionSideBySideChainTopAppBarDataState) this.L$0, null, null, false, false, this.$inExp, null, 47, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C504061(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionSideBySideChainTopAppBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBarDuxo$onCreate$4", m3645f = "OptionSideBySideChainTopAppBarDuxo.kt", m3646l = {83}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBarDuxo$onCreate$4 */
    static final class C244534 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C244534(Continuation<? super C244534> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionSideBySideChainTopAppBarDuxo.this.new C244534(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C244534) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowStreamBidAskPriceLabelSettingsShown = OptionSideBySideChainTopAppBarDuxo.this.optionSideBySideChainStore.streamBidAskPriceLabelSettingsShown();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionSideBySideChainTopAppBarDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamBidAskPriceLabelSettingsShown, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: OptionSideBySideChainTopAppBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "hasSeenBidAskLabelSettings", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBarDuxo$onCreate$4$1", m3645f = "OptionSideBySideChainTopAppBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBarDuxo$onCreate$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ OptionSideBySideChainTopAppBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionSideBySideChainTopAppBarDuxo optionSideBySideChainTopAppBarDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionSideBySideChainTopAppBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionSideBySideChainTopAppBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/appbar/OptionSideBySideChainTopAppBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBarDuxo$onCreate$4$1$1", m3645f = "OptionSideBySideChainTopAppBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBarDuxo$onCreate$4$1$1, reason: invalid class name and collision with other inner class name */
            static final class C504071 extends ContinuationImpl7 implements Function2<OptionSideBySideChainTopAppBarDataState, Continuation<? super OptionSideBySideChainTopAppBarDataState>, Object> {
                final /* synthetic */ boolean $hasSeenBidAskLabelSettings;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C504071(boolean z, Continuation<? super C504071> continuation) {
                    super(2, continuation);
                    this.$hasSeenBidAskLabelSettings = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C504071 c504071 = new C504071(this.$hasSeenBidAskLabelSettings, continuation);
                    c504071.L$0 = obj;
                    return c504071;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionSideBySideChainTopAppBarDataState optionSideBySideChainTopAppBarDataState, Continuation<? super OptionSideBySideChainTopAppBarDataState> continuation) {
                    return ((C504071) create(optionSideBySideChainTopAppBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionSideBySideChainTopAppBarDataState.copy$default((OptionSideBySideChainTopAppBarDataState) this.L$0, null, null, false, this.$hasSeenBidAskLabelSettings, false, null, 55, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C504071(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionSideBySideChainTopAppBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/appbar/OptionSideBySideChainTopAppBarDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/optionschain/sbschain/appbar/OptionSideBySideChainTopAppBarDuxo;", "Lcom/robinhood/android/options/contracts/InternalOptionChainFragmentKey;", "<init>", "()V", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<OptionSideBySideChainTopAppBarDuxo, InternalOptionChainFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InternalOptionChainFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (InternalOptionChainFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InternalOptionChainFragmentKey getArgs(OptionSideBySideChainTopAppBarDuxo optionSideBySideChainTopAppBarDuxo) {
            return (InternalOptionChainFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, optionSideBySideChainTopAppBarDuxo);
        }
    }
}
