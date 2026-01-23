package com.robinhood.android.retirement.dashboard.contribution;

import com.robinhood.android.history.p153ui.MerchantRewardDetailComposable;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.models.retirement.p194db.RetirementCombinedSummaryCardViewModel;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.bonfire.retirement.ContributionStore;
import com.robinhood.models.advisory.p304db.onboarding.RecsForRetirementStrategiesUpsellViewModel;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.p320db.Account;
import com.robinhood.store.advisory.AdvisoryDashboardDepositsStore;
import com.robinhood.store.advisory.StrategiesUpsellStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.Share3;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: ContributionSummaryCardDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0012J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryCardDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryCardDataState;", "Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryCardViewState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "advisoryDashboardDepositsStore", "Lcom/robinhood/store/advisory/AdvisoryDashboardDepositsStore;", "retirementContributionStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/ContributionStore;", "strategiesUpsellStore", "Lcom/robinhood/store/advisory/StrategiesUpsellStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/store/advisory/AdvisoryDashboardDepositsStore;Lcom/robinhood/librobinhood/data/store/bonfire/retirement/ContributionStore;Lcom/robinhood/store/advisory/StrategiesUpsellStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "accountNumberStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "onStart", "", "dismissStrategiesUpsellBanner", "accountNumber", "setAccountNumber", "lib-retirement-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class ContributionSummaryCardDuxo extends BaseDuxo<ContributionSummaryCardDataState, ContributionSummaryCardViewState> {
    public static final int $stable = 8;
    private final StateFlow2<String> accountNumberStateFlow;
    private final AccountProvider accountProvider;
    private final AdvisoryDashboardDepositsStore advisoryDashboardDepositsStore;
    private final ContributionStore retirementContributionStore;
    private final StrategiesUpsellStore strategiesUpsellStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContributionSummaryCardDuxo(AccountProvider accountProvider, AdvisoryDashboardDepositsStore advisoryDashboardDepositsStore, ContributionStore retirementContributionStore, StrategiesUpsellStore strategiesUpsellStore, DuxoBundle duxoBundle) {
        super(new ContributionSummaryCardDataState(null, false, null, null, null, 31, null), ContributionSummaryCardDataState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(advisoryDashboardDepositsStore, "advisoryDashboardDepositsStore");
        Intrinsics.checkNotNullParameter(retirementContributionStore, "retirementContributionStore");
        Intrinsics.checkNotNullParameter(strategiesUpsellStore, "strategiesUpsellStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.advisoryDashboardDepositsStore = advisoryDashboardDepositsStore;
        this.retirementContributionStore = retirementContributionStore;
        this.strategiesUpsellStore = strategiesUpsellStore;
        this.accountNumberStateFlow = StateFlow4.MutableStateFlow(null);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C269911(null));
    }

    /* compiled from: ContributionSummaryCardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.retirement.dashboard.contribution.ContributionSummaryCardDuxo$onStart$1", m3645f = "ContributionSummaryCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.retirement.dashboard.contribution.ContributionSummaryCardDuxo$onStart$1 */
    static final class C269911 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C269911(Continuation<? super C269911> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C269911 c269911 = ContributionSummaryCardDuxo.this.new C269911(continuation);
            c269911.L$0 = obj;
            return c269911;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C269911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: ContributionSummaryCardDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.retirement.dashboard.contribution.ContributionSummaryCardDuxo$onStart$1$1", m3645f = "ContributionSummaryCardDuxo.kt", m3646l = {49}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.retirement.dashboard.contribution.ContributionSummaryCardDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ContributionSummaryCardDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ContributionSummaryCardDuxo contributionSummaryCardDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = contributionSummaryCardDuxo;
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
                    Flow<RetirementCombinedSummaryCardViewModel> flowAsFlow = this.this$0.retirementContributionStore.getCombinedSummaryCardViewModelQuery().asFlow(Unit.INSTANCE);
                    C505021 c505021 = new C505021(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowAsFlow, c505021, this) == coroutine_suspended) {
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

            /* compiled from: ContributionSummaryCardDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "viewModel", "Lcom/robinhood/android/models/retirement/db/RetirementCombinedSummaryCardViewModel;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.retirement.dashboard.contribution.ContributionSummaryCardDuxo$onStart$1$1$1", m3645f = "ContributionSummaryCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.retirement.dashboard.contribution.ContributionSummaryCardDuxo$onStart$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C505021 extends ContinuationImpl7 implements Function2<RetirementCombinedSummaryCardViewModel, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ ContributionSummaryCardDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C505021(ContributionSummaryCardDuxo contributionSummaryCardDuxo, Continuation<? super C505021> continuation) {
                    super(2, continuation);
                    this.this$0 = contributionSummaryCardDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C505021 c505021 = new C505021(this.this$0, continuation);
                    c505021.L$0 = obj;
                    return c505021;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(RetirementCombinedSummaryCardViewModel retirementCombinedSummaryCardViewModel, Continuation<? super Unit> continuation) {
                    return ((C505021) create(retirementCombinedSummaryCardViewModel, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: ContributionSummaryCardDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryCardDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.retirement.dashboard.contribution.ContributionSummaryCardDuxo$onStart$1$1$1$1", m3645f = "ContributionSummaryCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.retirement.dashboard.contribution.ContributionSummaryCardDuxo$onStart$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C505031 extends ContinuationImpl7 implements Function2<ContributionSummaryCardDataState, Continuation<? super ContributionSummaryCardDataState>, Object> {
                    final /* synthetic */ RetirementCombinedSummaryCardViewModel $viewModel;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C505031(RetirementCombinedSummaryCardViewModel retirementCombinedSummaryCardViewModel, Continuation<? super C505031> continuation) {
                        super(2, continuation);
                        this.$viewModel = retirementCombinedSummaryCardViewModel;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C505031 c505031 = new C505031(this.$viewModel, continuation);
                        c505031.L$0 = obj;
                        return c505031;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(ContributionSummaryCardDataState contributionSummaryCardDataState, Continuation<? super ContributionSummaryCardDataState> continuation) {
                        return ((C505031) create(contributionSummaryCardDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ContributionSummaryCardDataState.copy$default((ContributionSummaryCardDataState) this.L$0, this.$viewModel, false, null, null, null, 30, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C505031((RetirementCombinedSummaryCardViewModel) this.L$0, null));
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
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(ContributionSummaryCardDuxo.this, null), 3, null);
                SharedFlow sharedFlowShareIn$default = Share3.shareIn$default(FlowKt.transformLatest(FlowKt.filterNotNull(ContributionSummaryCardDuxo.this.accountNumberStateFlow), new C26990x5e79adc4(null, ContributionSummaryCardDuxo.this)), ContributionSummaryCardDuxo.this.getLifecycleScope(), SharingStarted.INSTANCE.getLazily(), 0, 4, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(sharedFlowShareIn$default, ContributionSummaryCardDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(sharedFlowShareIn$default, ContributionSummaryCardDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(sharedFlowShareIn$default, ContributionSummaryCardDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: ContributionSummaryCardDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.retirement.dashboard.contribution.ContributionSummaryCardDuxo$onStart$1$2", m3645f = "ContributionSummaryCardDuxo.kt", m3646l = {70}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.retirement.dashboard.contribution.ContributionSummaryCardDuxo$onStart$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<Account> $accountFlow;
            int label;
            final /* synthetic */ ContributionSummaryCardDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SharedFlow<Account> sharedFlow, ContributionSummaryCardDuxo contributionSummaryCardDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$accountFlow = sharedFlow;
                this.this$0 = contributionSummaryCardDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$accountFlow, this.this$0, continuation);
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
                    Flow flowDistinctUntilChangedBy = FlowKt.distinctUntilChangedBy(this.$accountFlow, new Function1() { // from class: com.robinhood.android.retirement.dashboard.contribution.ContributionSummaryCardDuxo$onStart$1$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return ((Account) obj2).getAccountNumber();
                        }
                    });
                    C505042 c505042 = new C505042(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChangedBy, c505042, this) == coroutine_suspended) {
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

            /* compiled from: ContributionSummaryCardDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "account", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.retirement.dashboard.contribution.ContributionSummaryCardDuxo$onStart$1$2$2", m3645f = "ContributionSummaryCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.retirement.dashboard.contribution.ContributionSummaryCardDuxo$onStart$1$2$2, reason: invalid class name and collision with other inner class name */
            static final class C505042 extends ContinuationImpl7 implements Function2<Account, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ ContributionSummaryCardDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C505042(ContributionSummaryCardDuxo contributionSummaryCardDuxo, Continuation<? super C505042> continuation) {
                    super(2, continuation);
                    this.this$0 = contributionSummaryCardDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C505042 c505042 = new C505042(this.this$0, continuation);
                    c505042.L$0 = obj;
                    return c505042;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Account account, Continuation<? super Unit> continuation) {
                    return ((C505042) create(account, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: ContributionSummaryCardDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryCardDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.retirement.dashboard.contribution.ContributionSummaryCardDuxo$onStart$1$2$2$1", m3645f = "ContributionSummaryCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.retirement.dashboard.contribution.ContributionSummaryCardDuxo$onStart$1$2$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ContributionSummaryCardDataState, Continuation<? super ContributionSummaryCardDataState>, Object> {
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
                    public final Object invoke(ContributionSummaryCardDataState contributionSummaryCardDataState, Continuation<? super ContributionSummaryCardDataState> continuation) {
                        return ((AnonymousClass1) create(contributionSummaryCardDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ContributionSummaryCardDataState.copy$default((ContributionSummaryCardDataState) this.L$0, null, this.$account.getManagementType() == ManagementType.MANAGED, null, this.$account.getAccountNumber(), null, 21, null);
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

        /* compiled from: ContributionSummaryCardDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.retirement.dashboard.contribution.ContributionSummaryCardDuxo$onStart$1$3", m3645f = "ContributionSummaryCardDuxo.kt", m3646l = {90}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.retirement.dashboard.contribution.ContributionSummaryCardDuxo$onStart$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<Account> $accountFlow;
            int label;
            final /* synthetic */ ContributionSummaryCardDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(SharedFlow<Account> sharedFlow, ContributionSummaryCardDuxo contributionSummaryCardDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$accountFlow = sharedFlow;
                this.this$0 = contributionSummaryCardDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$accountFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$accountFlow, new C26987xa43134d5(null, this.this$0));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
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

            /* compiled from: ContributionSummaryCardDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "goldValuePropsTitle", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.retirement.dashboard.contribution.ContributionSummaryCardDuxo$onStart$1$3$2", m3645f = "ContributionSummaryCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.retirement.dashboard.contribution.ContributionSummaryCardDuxo$onStart$1$3$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<String, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ ContributionSummaryCardDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(ContributionSummaryCardDuxo contributionSummaryCardDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = contributionSummaryCardDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(String str, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: ContributionSummaryCardDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryCardDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.retirement.dashboard.contribution.ContributionSummaryCardDuxo$onStart$1$3$2$1", m3645f = "ContributionSummaryCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.retirement.dashboard.contribution.ContributionSummaryCardDuxo$onStart$1$3$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ContributionSummaryCardDataState, Continuation<? super ContributionSummaryCardDataState>, Object> {
                    final /* synthetic */ String $goldValuePropsTitle;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$goldValuePropsTitle = str;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$goldValuePropsTitle, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(ContributionSummaryCardDataState contributionSummaryCardDataState, Continuation<? super ContributionSummaryCardDataState> continuation) {
                        return ((AnonymousClass1) create(contributionSummaryCardDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ContributionSummaryCardDataState.copy$default((ContributionSummaryCardDataState) this.L$0, null, false, this.$goldValuePropsTitle, null, null, 27, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((String) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: ContributionSummaryCardDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.retirement.dashboard.contribution.ContributionSummaryCardDuxo$onStart$1$4", m3645f = "ContributionSummaryCardDuxo.kt", m3646l = {106}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.retirement.dashboard.contribution.ContributionSummaryCardDuxo$onStart$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<Account> $accountFlow;
            int label;
            final /* synthetic */ ContributionSummaryCardDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(SharedFlow<Account> sharedFlow, ContributionSummaryCardDuxo contributionSummaryCardDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$accountFlow = sharedFlow;
                this.this$0 = contributionSummaryCardDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.$accountFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$accountFlow, new C26989xfb4f25b4(null, this.this$0));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
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

            /* compiled from: ContributionSummaryCardDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", MerchantRewardDetailComposable.BANNER_TEST_TAG, "Lcom/robinhood/models/advisory/db/onboarding/RecsForRetirementStrategiesUpsellViewModel$Banner;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.retirement.dashboard.contribution.ContributionSummaryCardDuxo$onStart$1$4$2", m3645f = "ContributionSummaryCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.retirement.dashboard.contribution.ContributionSummaryCardDuxo$onStart$1$4$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<RecsForRetirementStrategiesUpsellViewModel.Banner, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ ContributionSummaryCardDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(ContributionSummaryCardDuxo contributionSummaryCardDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = contributionSummaryCardDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(RecsForRetirementStrategiesUpsellViewModel.Banner banner, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(banner, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: ContributionSummaryCardDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryCardDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.retirement.dashboard.contribution.ContributionSummaryCardDuxo$onStart$1$4$2$1", m3645f = "ContributionSummaryCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.retirement.dashboard.contribution.ContributionSummaryCardDuxo$onStart$1$4$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ContributionSummaryCardDataState, Continuation<? super ContributionSummaryCardDataState>, Object> {
                    final /* synthetic */ RecsForRetirementStrategiesUpsellViewModel.Banner $banner;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(RecsForRetirementStrategiesUpsellViewModel.Banner banner, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$banner = banner;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$banner, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(ContributionSummaryCardDataState contributionSummaryCardDataState, Continuation<? super ContributionSummaryCardDataState> continuation) {
                        return ((AnonymousClass1) create(contributionSummaryCardDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ContributionSummaryCardDataState.copy$default((ContributionSummaryCardDataState) this.L$0, null, false, null, null, this.$banner, 15, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((RecsForRetirementStrategiesUpsellViewModel.Banner) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    public final void dismissStrategiesUpsellBanner(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.strategiesUpsellStore.dismissBanner(accountNumber);
    }

    public final void setAccountNumber(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.accountNumberStateFlow.setValue(accountNumber);
    }
}
