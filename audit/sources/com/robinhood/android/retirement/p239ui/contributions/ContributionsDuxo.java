package com.robinhood.android.retirement.p239ui.contributions;

import androidx.lifecycle.SavedStateHandle;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import com.robinhood.android.common.history.p082ui.HistoryFilter;
import com.robinhood.android.models.retirement.p194db.RetirementCombinedContributionViewModel;
import com.robinhood.android.models.retirement.p194db.RetirementMatchRate;
import com.robinhood.android.moria.p196db.QueryKt;
import com.robinhood.android.retirement.contracts.RetirementContributionHubFragmentKey;
import com.robinhood.android.retirement.dashboard.contribution.ContributionsSummaryCard;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.bonfire.retirement.ContributionStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementAccountSwitcherStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementMatchStore;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.mcduckling.HistoryStaticFilter;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.shared.store.history.HistoryStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: ContributionsDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0017B9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/contributions/ContributionsDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/retirement/ui/contributions/ContributionsDataState;", "Lcom/robinhood/android/retirement/ui/contributions/ContributionsViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "retirementAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementAccountSwitcherStore;", "retirementContributionStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/ContributionStore;", "matchStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementMatchStore;", "historyStore", "Lcom/robinhood/shared/store/history/HistoryStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementAccountSwitcherStore;Lcom/robinhood/librobinhood/data/store/bonfire/retirement/ContributionStore;Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementMatchStore;Lcom/robinhood/shared/store/history/HistoryStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class ContributionsDuxo extends BaseDuxo<ContributionsDataState, ContributionsViewState> implements HasSavedState {
    private final HistoryStore historyStore;
    private final RetirementMatchStore matchStore;
    private final RetirementAccountSwitcherStore retirementAccountSwitcherStore;
    private final ContributionStore retirementContributionStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContributionsDuxo(RetirementAccountSwitcherStore retirementAccountSwitcherStore, ContributionStore retirementContributionStore, RetirementMatchStore matchStore, HistoryStore historyStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new ContributionsDataState(ContributionsSummaryCard.INSTANCE.fromString(((RetirementContributionHubFragmentKey) INSTANCE.getArgs(savedStateHandle)).getPlacement()), null, null, null, null, 30, null), ContributionsDataState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(retirementAccountSwitcherStore, "retirementAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(retirementContributionStore, "retirementContributionStore");
        Intrinsics.checkNotNullParameter(matchStore, "matchStore");
        Intrinsics.checkNotNullParameter(historyStore, "historyStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.retirementAccountSwitcherStore = retirementAccountSwitcherStore;
        this.retirementContributionStore = retirementContributionStore;
        this.matchStore = matchStore;
        this.historyStore = historyStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        Observable<List<Account>> observableStreamAllRetirementAccounts = this.retirementAccountSwitcherStore.streamAllRetirementAccounts();
        Observable map = observableStreamAllRetirementAccounts.map(new Function() { // from class: com.robinhood.android.retirement.ui.contributions.ContributionsDuxo.onStart.1
            @Override // io.reactivex.functions.Function
            public final Set<HistoryStaticFilter.RhsAccountContext> apply(List<Account> p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return UtilKt.convertRetirementAccountsToRhsHistoryContexts(p0);
            }
        }).distinctUntilChanged().map(new Function() { // from class: com.robinhood.android.retirement.ui.contributions.ContributionsDuxo.onStart.2
            @Override // io.reactivex.functions.Function
            public final Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> apply(Set<HistoryStaticFilter.RhsAccountContext> accountContexts) {
                Intrinsics.checkNotNullParameter(accountContexts, "accountContexts");
                HistoryStore historyStore = ContributionsDuxo.this.historyStore;
                Observable observableJust = Observable.just(Optional2.INSTANCE);
                Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
                Observable observableJust2 = Observable.just(HistoryFilter.TRANSFERS.getTransactionTypes());
                Intrinsics.checkNotNullExpressionValue(observableJust2, "just(...)");
                return HistoryStore.buildPager$default(historyStore, observableJust, observableJust2, null, null, new HistoryStaticFilter(null, null, null, null, null, null, null, null, false, accountContexts, null, 1535, null), new PagingConfig(5, 0, false, 0, 0, 0, 62, null), 12, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.retirement.ui.contributions.ContributionsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContributionsDuxo.onStart$lambda$0(this.f$0, (Pager) obj);
            }
        });
        Observable observableDistinctUntilChanged = observableStreamAllRetirementAccounts.map(new Function() { // from class: com.robinhood.android.retirement.ui.contributions.ContributionsDuxo.onStart.4
            @Override // io.reactivex.functions.Function
            public final Optional<Account> apply(List<Account> accounts2) {
                Object next;
                Intrinsics.checkNotNullParameter(accounts2, "accounts");
                ContributionsDuxo contributionsDuxo = ContributionsDuxo.this;
                Iterator<T> it = accounts2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(((Account) next).getAccountNumber(), ((RetirementContributionHubFragmentKey) ContributionsDuxo.INSTANCE.getArgs((HasSavedState) contributionsDuxo)).getAccountNumber())) {
                        break;
                    }
                }
                return Optional3.asOptional(next);
            }
        }).distinctUntilChanged((Function<? super R, K>) new Function() { // from class: com.robinhood.android.retirement.ui.contributions.ContributionsDuxo.onStart.5
            @Override // io.reactivex.functions.Function
            public final String apply(Optional<Account> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                Account accountComponent1 = optional.component1();
                if (accountComponent1 != null) {
                    return accountComponent1.getAccountNumber();
                }
                return null;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.retirement.ui.contributions.ContributionsDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContributionsDuxo.onStart$lambda$1(this.f$0, (Optional) obj);
            }
        });
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C271937(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(ContributionsDuxo contributionsDuxo, Pager pager) {
        contributionsDuxo.applyMutation(new ContributionsDuxo2(pager, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(ContributionsDuxo contributionsDuxo, Optional optional) {
        contributionsDuxo.applyMutation(new ContributionsDuxo3((Account) optional.component1(), null));
        return Unit.INSTANCE;
    }

    /* compiled from: ContributionsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.retirement.ui.contributions.ContributionsDuxo$onStart$7", m3645f = "ContributionsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.retirement.ui.contributions.ContributionsDuxo$onStart$7 */
    static final class C271937 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C271937(Continuation<? super C271937> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C271937 c271937 = ContributionsDuxo.this.new C271937(continuation);
            c271937.L$0 = obj;
            return c271937;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C271937) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: ContributionsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.retirement.ui.contributions.ContributionsDuxo$onStart$7$1", m3645f = "ContributionsDuxo.kt", m3646l = {90}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.retirement.ui.contributions.ContributionsDuxo$onStart$7$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ContributionsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ContributionsDuxo contributionsDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = contributionsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<RetirementCombinedContributionViewModel> flowStreamCombinedContributionViewModel = this.this$0.retirementContributionStore.streamCombinedContributionViewModel(((RetirementContributionHubFragmentKey) ContributionsDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getAccountNumber());
                    C505121 c505121 = new C505121(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamCombinedContributionViewModel, c505121, this) == coroutine_suspended) {
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

            /* compiled from: ContributionsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "viewModel", "Lcom/robinhood/android/models/retirement/db/RetirementCombinedContributionViewModel;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.retirement.ui.contributions.ContributionsDuxo$onStart$7$1$1", m3645f = "ContributionsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.retirement.ui.contributions.ContributionsDuxo$onStart$7$1$1, reason: invalid class name and collision with other inner class name */
            static final class C505121 extends ContinuationImpl7 implements Function2<RetirementCombinedContributionViewModel, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ ContributionsDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C505121(ContributionsDuxo contributionsDuxo, Continuation<? super C505121> continuation) {
                    super(2, continuation);
                    this.this$0 = contributionsDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C505121 c505121 = new C505121(this.this$0, continuation);
                    c505121.L$0 = obj;
                    return c505121;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(RetirementCombinedContributionViewModel retirementCombinedContributionViewModel, Continuation<? super Unit> continuation) {
                    return ((C505121) create(retirementCombinedContributionViewModel, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: ContributionsDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/retirement/ui/contributions/ContributionsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.retirement.ui.contributions.ContributionsDuxo$onStart$7$1$1$1", m3645f = "ContributionsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.retirement.ui.contributions.ContributionsDuxo$onStart$7$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C505131 extends ContinuationImpl7 implements Function2<ContributionsDataState, Continuation<? super ContributionsDataState>, Object> {
                    final /* synthetic */ RetirementCombinedContributionViewModel $viewModel;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C505131(RetirementCombinedContributionViewModel retirementCombinedContributionViewModel, Continuation<? super C505131> continuation) {
                        super(2, continuation);
                        this.$viewModel = retirementCombinedContributionViewModel;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C505131 c505131 = new C505131(this.$viewModel, continuation);
                        c505131.L$0 = obj;
                        return c505131;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(ContributionsDataState contributionsDataState, Continuation<? super ContributionsDataState> continuation) {
                        return ((C505131) create(contributionsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ContributionsDataState.copy$default((ContributionsDataState) this.L$0, null, this.$viewModel, null, null, null, 29, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C505131((RetirementCombinedContributionViewModel) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(ContributionsDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(ContributionsDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: ContributionsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.retirement.ui.contributions.ContributionsDuxo$onStart$7$2", m3645f = "ContributionsDuxo.kt", m3646l = {100}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.retirement.ui.contributions.ContributionsDuxo$onStart$7$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ContributionsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ContributionsDuxo contributionsDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = contributionsDuxo;
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
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowAsFlow = QueryKt.asFlow(this.this$0.matchStore.getQueryNoPolling());
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowAsFlow, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: ContributionsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "retirementMatchRate", "Lcom/robinhood/android/models/retirement/db/RetirementMatchRate;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.retirement.ui.contributions.ContributionsDuxo$onStart$7$2$1", m3645f = "ContributionsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.retirement.ui.contributions.ContributionsDuxo$onStart$7$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<RetirementMatchRate, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ ContributionsDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ContributionsDuxo contributionsDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = contributionsDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(RetirementMatchRate retirementMatchRate, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(retirementMatchRate, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: ContributionsDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/retirement/ui/contributions/ContributionsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.retirement.ui.contributions.ContributionsDuxo$onStart$7$2$1$1", m3645f = "ContributionsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.retirement.ui.contributions.ContributionsDuxo$onStart$7$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C505141 extends ContinuationImpl7 implements Function2<ContributionsDataState, Continuation<? super ContributionsDataState>, Object> {
                    final /* synthetic */ RetirementMatchRate $retirementMatchRate;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C505141(RetirementMatchRate retirementMatchRate, Continuation<? super C505141> continuation) {
                        super(2, continuation);
                        this.$retirementMatchRate = retirementMatchRate;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C505141 c505141 = new C505141(this.$retirementMatchRate, continuation);
                        c505141.L$0 = obj;
                        return c505141;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(ContributionsDataState contributionsDataState, Continuation<? super ContributionsDataState> continuation) {
                        return ((C505141) create(contributionsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ContributionsDataState.copy$default((ContributionsDataState) this.L$0, null, null, null, this.$retirementMatchRate, null, 23, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C505141((RetirementMatchRate) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* compiled from: ContributionsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/contributions/ContributionsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/retirement/ui/contributions/ContributionsDuxo;", "Lcom/robinhood/android/retirement/contracts/RetirementContributionHubFragmentKey;", "<init>", "()V", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<ContributionsDuxo, RetirementContributionHubFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RetirementContributionHubFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (RetirementContributionHubFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RetirementContributionHubFragmentKey getArgs(ContributionsDuxo contributionsDuxo) {
            return (RetirementContributionHubFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, contributionsDuxo);
        }
    }
}
