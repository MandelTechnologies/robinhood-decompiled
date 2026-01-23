package com.robinhood.android.dashboard.lib.header.brokerage;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.dashboard.lib.header.brokerage.pill.NuxPillVisibilityExperiment;
import com.robinhood.android.dashboard.store.HomeDashboardStore;
import com.robinhood.android.home.contracts.HomeDashboardType;
import com.robinhood.android.lib.accountswitcher.AccountSwitcherBottomSheet5;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.home.HomeAccountSwitcher;
import com.robinhood.models.p320db.identi.sortinghat.SortingHatRecord;
import com.robinhood.store.AsyncResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: DashboardHeaderDuxo.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001dJ\u000e\u0010 \u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/header/brokerage/DashboardHeaderDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/dashboard/lib/header/brokerage/DashboardHeaderDataState;", "Lcom/robinhood/android/dashboard/lib/header/brokerage/DashboardHeaderViewState;", "homeDashboardStore", "Lcom/robinhood/android/dashboard/store/HomeDashboardStore;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "accountSwitcherTooltipManager", "Lcom/robinhood/android/dashboard/lib/header/brokerage/AccountSwitcherTooltipManager;", "accountSwitcherBadgeManager", "Lcom/robinhood/android/dashboard/lib/header/brokerage/AccountSwitcherBadgeManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/dashboard/store/HomeDashboardStore;Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;Lcom/robinhood/android/dashboard/lib/header/brokerage/AccountSwitcherTooltipManager;Lcom/robinhood/android/dashboard/lib/header/brokerage/AccountSwitcherBadgeManager;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "accountSwitcherStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/models/home/HomeAccountSwitcher;", "onStart", "", "onCreate", "consumeAccountSwitcherAction", "action", "Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherModalBottomSheetAction;", "markTooltipInteraction", "interactionPrefId", "", "markTooltipImpression", "impressionPrefId", "markBadgeInteraction", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class DashboardHeaderDuxo extends BaseDuxo<DashboardHeaderDataState, DashboardHeaderViewState> {
    public static final int $stable = 8;
    private final AccountSwitcherBadgeManager accountSwitcherBadgeManager;
    private final StateFlow2<HomeAccountSwitcher> accountSwitcherStateFlow;
    private final AccountSwitcherTooltipManager accountSwitcherTooltipManager;
    private final ExperimentsStore experimentsStore;
    private final HomeDashboardStore homeDashboardStore;
    private final BaseSortingHatStore sortingHatStore;

    /* compiled from: DashboardHeaderDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrokerageAccountType.values().length];
            try {
                iArr[BrokerageAccountType.INDIVIDUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardHeaderDuxo(HomeDashboardStore homeDashboardStore, BaseSortingHatStore sortingHatStore, AccountSwitcherTooltipManager accountSwitcherTooltipManager, AccountSwitcherBadgeManager accountSwitcherBadgeManager, ExperimentsStore experimentsStore, DuxoBundle duxoBundle) {
        super(new DashboardHeaderDataState(null, null, null, null, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null), DashboardHeaderDataState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(homeDashboardStore, "homeDashboardStore");
        Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
        Intrinsics.checkNotNullParameter(accountSwitcherTooltipManager, "accountSwitcherTooltipManager");
        Intrinsics.checkNotNullParameter(accountSwitcherBadgeManager, "accountSwitcherBadgeManager");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.homeDashboardStore = homeDashboardStore;
        this.sortingHatStore = sortingHatStore;
        this.accountSwitcherTooltipManager = accountSwitcherTooltipManager;
        this.accountSwitcherBadgeManager = accountSwitcherBadgeManager;
        this.experimentsStore = experimentsStore;
        this.accountSwitcherStateFlow = StateFlow4.MutableStateFlow(null);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        Flow<HomeDashboardType> flowStreamHomeDashboardType = this.homeDashboardStore.streamHomeDashboardType();
        LifecycleHost.DefaultImpls.bind$default(this, this.homeDashboardStore.streamHomeAccounts(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.dashboard.lib.header.brokerage.DashboardHeaderDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DashboardHeaderDuxo.onStart$lambda$0(this.f$0, (List) obj);
            }
        });
        getLifecycleScope().launchWhenStarted(new C137462(flowStreamHomeDashboardType, this, null));
        getLifecycleScope().launchWhenStarted(new C137473(null));
        getLifecycleScope().launchWhenStarted(new C137484(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(DashboardHeaderDuxo dashboardHeaderDuxo, List accounts2) {
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        dashboardHeaderDuxo.applyMutation(new DashboardHeaderDuxo2(accounts2, null));
        return Unit.INSTANCE;
    }

    /* compiled from: DashboardHeaderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.header.brokerage.DashboardHeaderDuxo$onStart$2", m3645f = "DashboardHeaderDuxo.kt", m3646l = {55}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.dashboard.lib.header.brokerage.DashboardHeaderDuxo$onStart$2 */
    static final class C137462 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<HomeDashboardType> $dashboardTypeStream;
        int label;
        final /* synthetic */ DashboardHeaderDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C137462(Flow<? extends HomeDashboardType> flow, DashboardHeaderDuxo dashboardHeaderDuxo, Continuation<? super C137462> continuation) {
            super(2, continuation);
            this.$dashboardTypeStream = flow;
            this.this$0 = dashboardHeaderDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C137462(this.$dashboardTypeStream, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C137462) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<HomeDashboardType> flow = this.$dashboardTypeStream;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: DashboardHeaderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "dashboardType", "Lcom/robinhood/android/home/contracts/HomeDashboardType;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.header.brokerage.DashboardHeaderDuxo$onStart$2$1", m3645f = "DashboardHeaderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.dashboard.lib.header.brokerage.DashboardHeaderDuxo$onStart$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<HomeDashboardType, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DashboardHeaderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(DashboardHeaderDuxo dashboardHeaderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = dashboardHeaderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(HomeDashboardType homeDashboardType, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(homeDashboardType, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: DashboardHeaderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/dashboard/lib/header/brokerage/DashboardHeaderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.header.brokerage.DashboardHeaderDuxo$onStart$2$1$1", m3645f = "DashboardHeaderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.dashboard.lib.header.brokerage.DashboardHeaderDuxo$onStart$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C498401 extends ContinuationImpl7 implements Function2<DashboardHeaderDataState, Continuation<? super DashboardHeaderDataState>, Object> {
                final /* synthetic */ HomeDashboardType $dashboardType;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C498401(HomeDashboardType homeDashboardType, Continuation<? super C498401> continuation) {
                    super(2, continuation);
                    this.$dashboardType = homeDashboardType;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C498401 c498401 = new C498401(this.$dashboardType, continuation);
                    c498401.L$0 = obj;
                    return c498401;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(DashboardHeaderDataState dashboardHeaderDataState, Continuation<? super DashboardHeaderDataState> continuation) {
                    return ((C498401) create(dashboardHeaderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return DashboardHeaderDataState.copy$default((DashboardHeaderDataState) this.L$0, this.$dashboardType, null, null, null, false, false, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C498401((HomeDashboardType) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: DashboardHeaderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.header.brokerage.DashboardHeaderDuxo$onStart$3", m3645f = "DashboardHeaderDuxo.kt", m3646l = {65}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.dashboard.lib.header.brokerage.DashboardHeaderDuxo$onStart$3 */
    static final class C137473 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C137473(Continuation<? super C137473> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DashboardHeaderDuxo.this.new C137473(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C137473) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<HomeAccountSwitcher> flowAsFlow = DashboardHeaderDuxo.this.homeDashboardStore.getHomeAccountSwitcherQuery().asFlow(Unit.INSTANCE);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(DashboardHeaderDuxo.this, null);
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

        /* compiled from: DashboardHeaderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "homeAccountSwitcher", "Lcom/robinhood/models/home/HomeAccountSwitcher;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.header.brokerage.DashboardHeaderDuxo$onStart$3$1", m3645f = "DashboardHeaderDuxo.kt", m3646l = {69}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.dashboard.lib.header.brokerage.DashboardHeaderDuxo$onStart$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<HomeAccountSwitcher, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DashboardHeaderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(DashboardHeaderDuxo dashboardHeaderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = dashboardHeaderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(HomeAccountSwitcher homeAccountSwitcher, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(homeAccountSwitcher, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: DashboardHeaderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/dashboard/lib/header/brokerage/DashboardHeaderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.header.brokerage.DashboardHeaderDuxo$onStart$3$1$1", m3645f = "DashboardHeaderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.dashboard.lib.header.brokerage.DashboardHeaderDuxo$onStart$3$1$1, reason: invalid class name and collision with other inner class name */
            static final class C498411 extends ContinuationImpl7 implements Function2<DashboardHeaderDataState, Continuation<? super DashboardHeaderDataState>, Object> {
                final /* synthetic */ HomeAccountSwitcher $homeAccountSwitcher;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C498411(HomeAccountSwitcher homeAccountSwitcher, Continuation<? super C498411> continuation) {
                    super(2, continuation);
                    this.$homeAccountSwitcher = homeAccountSwitcher;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C498411 c498411 = new C498411(this.$homeAccountSwitcher, continuation);
                    c498411.L$0 = obj;
                    return c498411;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(DashboardHeaderDataState dashboardHeaderDataState, Continuation<? super DashboardHeaderDataState> continuation) {
                    return ((C498411) create(dashboardHeaderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return DashboardHeaderDataState.copy$default((DashboardHeaderDataState) this.L$0, null, null, null, this.$homeAccountSwitcher, false, false, null, 119, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    HomeAccountSwitcher homeAccountSwitcher = (HomeAccountSwitcher) this.L$0;
                    this.this$0.applyMutation(new C498411(homeAccountSwitcher, null));
                    StateFlow2 stateFlow2 = this.this$0.accountSwitcherStateFlow;
                    this.label = 1;
                    if (stateFlow2.emit(homeAccountSwitcher, this) == coroutine_suspended) {
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
        }
    }

    /* compiled from: DashboardHeaderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.header.brokerage.DashboardHeaderDuxo$onStart$4", m3645f = "DashboardHeaderDuxo.kt", m3646l = {79}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.dashboard.lib.header.brokerage.DashboardHeaderDuxo$onStart$4 */
    static final class C137484 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C137484(Continuation<? super C137484> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DashboardHeaderDuxo.this.new C137484(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C137484) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowCoStreamVariant = DashboardHeaderDuxo.this.experimentsStore.coStreamVariant(NuxPillVisibilityExperiment.INSTANCE, NuxPillVisibilityExperiment.Variant.CONTROL, false);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(DashboardHeaderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowCoStreamVariant, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: DashboardHeaderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/dashboard/lib/header/brokerage/pill/NuxPillVisibilityExperiment$Variant;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.header.brokerage.DashboardHeaderDuxo$onStart$4$1", m3645f = "DashboardHeaderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.dashboard.lib.header.brokerage.DashboardHeaderDuxo$onStart$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<NuxPillVisibilityExperiment.Variant, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DashboardHeaderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(DashboardHeaderDuxo dashboardHeaderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = dashboardHeaderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(NuxPillVisibilityExperiment.Variant variant, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(variant, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: DashboardHeaderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/dashboard/lib/header/brokerage/DashboardHeaderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.header.brokerage.DashboardHeaderDuxo$onStart$4$1$1", m3645f = "DashboardHeaderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.dashboard.lib.header.brokerage.DashboardHeaderDuxo$onStart$4$1$1, reason: invalid class name and collision with other inner class name */
            static final class C498421 extends ContinuationImpl7 implements Function2<DashboardHeaderDataState, Continuation<? super DashboardHeaderDataState>, Object> {
                final /* synthetic */ NuxPillVisibilityExperiment.Variant $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C498421(NuxPillVisibilityExperiment.Variant variant, Continuation<? super C498421> continuation) {
                    super(2, continuation);
                    this.$it = variant;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C498421 c498421 = new C498421(this.$it, continuation);
                    c498421.L$0 = obj;
                    return c498421;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(DashboardHeaderDataState dashboardHeaderDataState, Continuation<? super DashboardHeaderDataState> continuation) {
                    return ((C498421) create(dashboardHeaderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return DashboardHeaderDataState.copy$default((DashboardHeaderDataState) this.L$0, null, null, null, null, false, false, this.$it, 63, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C498421((NuxPillVisibilityExperiment.Variant) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C137441(null));
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C137452(null));
    }

    /* compiled from: DashboardHeaderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.header.brokerage.DashboardHeaderDuxo$onCreate$1", m3645f = "DashboardHeaderDuxo.kt", m3646l = {98}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.dashboard.lib.header.brokerage.DashboardHeaderDuxo$onCreate$1 */
    static final class C137441 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C137441(Continuation<? super C137441> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DashboardHeaderDuxo.this.new C137441(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C137441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(DashboardHeaderDuxo.this.homeDashboardStore.streamHomeDashboardType()), new C13743x85593ffb(null, DashboardHeaderDuxo.this));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(DashboardHeaderDuxo.this, null);
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

        /* compiled from: DashboardHeaderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "sortingHatState", "Lcom/robinhood/store/AsyncResult;", "Lcom/robinhood/models/db/identi/sortinghat/SortingHatRecord;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.header.brokerage.DashboardHeaderDuxo$onCreate$1$2", m3645f = "DashboardHeaderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.dashboard.lib.header.brokerage.DashboardHeaderDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<AsyncResult<? extends SortingHatRecord>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DashboardHeaderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(DashboardHeaderDuxo dashboardHeaderDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = dashboardHeaderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(AsyncResult<SortingHatRecord> asyncResult, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(asyncResult, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(AsyncResult<? extends SortingHatRecord> asyncResult, Continuation<? super Unit> continuation) {
                return invoke2((AsyncResult<SortingHatRecord>) asyncResult, continuation);
            }

            /* compiled from: DashboardHeaderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/dashboard/lib/header/brokerage/DashboardHeaderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.header.brokerage.DashboardHeaderDuxo$onCreate$1$2$1", m3645f = "DashboardHeaderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.dashboard.lib.header.brokerage.DashboardHeaderDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DashboardHeaderDataState, Continuation<? super DashboardHeaderDataState>, Object> {
                final /* synthetic */ AsyncResult<SortingHatRecord> $sortingHatState;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AsyncResult<SortingHatRecord> asyncResult, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$sortingHatState = asyncResult;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$sortingHatState, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(DashboardHeaderDataState dashboardHeaderDataState, Continuation<? super DashboardHeaderDataState> continuation) {
                    return ((AnonymousClass1) create(dashboardHeaderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return DashboardHeaderDataState.copy$default((DashboardHeaderDataState) this.L$0, null, null, this.$sortingHatState, null, false, false, null, 123, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((AsyncResult) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: DashboardHeaderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.header.brokerage.DashboardHeaderDuxo$onCreate$2", m3645f = "DashboardHeaderDuxo.kt", m3646l = {107}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.dashboard.lib.header.brokerage.DashboardHeaderDuxo$onCreate$2 */
    static final class C137452 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C137452(Continuation<? super C137452> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DashboardHeaderDuxo.this.new C137452(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C137452) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow2 stateFlow2 = DashboardHeaderDuxo.this.accountSwitcherStateFlow;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(DashboardHeaderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow2, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: DashboardHeaderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "accountSwitcher", "Lcom/robinhood/models/home/HomeAccountSwitcher;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.header.brokerage.DashboardHeaderDuxo$onCreate$2$1", m3645f = "DashboardHeaderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.dashboard.lib.header.brokerage.DashboardHeaderDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<HomeAccountSwitcher, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DashboardHeaderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(DashboardHeaderDuxo dashboardHeaderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = dashboardHeaderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(HomeAccountSwitcher homeAccountSwitcher, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(homeAccountSwitcher, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                HomeAccountSwitcher.AccountSwitcherBadgeInfo badgeInfo;
                HomeAccountSwitcher.AccountSwitcherTooltipInfo tooltipInfo;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                HomeAccountSwitcher homeAccountSwitcher = (HomeAccountSwitcher) this.L$0;
                boolean zIsBadgeEligibleToBeShown = false;
                boolean zIsTooltipEligibleToBeShown = (homeAccountSwitcher == null || (tooltipInfo = homeAccountSwitcher.getTooltipInfo()) == null) ? false : this.this$0.accountSwitcherTooltipManager.isTooltipEligibleToBeShown(tooltipInfo.getImpressionsPrefId(), tooltipInfo.getInteractionPrefId(), tooltipInfo.getMaxNumberImpressions());
                if (homeAccountSwitcher != null && (badgeInfo = homeAccountSwitcher.getBadgeInfo()) != null) {
                    zIsBadgeEligibleToBeShown = this.this$0.accountSwitcherBadgeManager.isBadgeEligibleToBeShown(badgeInfo.getInteractionPrefId());
                }
                this.this$0.applyMutation(new C498391(zIsTooltipEligibleToBeShown, zIsBadgeEligibleToBeShown, null));
                return Unit.INSTANCE;
            }

            /* compiled from: DashboardHeaderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/dashboard/lib/header/brokerage/DashboardHeaderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.header.brokerage.DashboardHeaderDuxo$onCreate$2$1$1", m3645f = "DashboardHeaderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.dashboard.lib.header.brokerage.DashboardHeaderDuxo$onCreate$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C498391 extends ContinuationImpl7 implements Function2<DashboardHeaderDataState, Continuation<? super DashboardHeaderDataState>, Object> {
                final /* synthetic */ boolean $badgeEligibleToBeShown;
                final /* synthetic */ boolean $tooltipEligibleToBeShown;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C498391(boolean z, boolean z2, Continuation<? super C498391> continuation) {
                    super(2, continuation);
                    this.$tooltipEligibleToBeShown = z;
                    this.$badgeEligibleToBeShown = z2;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C498391 c498391 = new C498391(this.$tooltipEligibleToBeShown, this.$badgeEligibleToBeShown, continuation);
                    c498391.L$0 = obj;
                    return c498391;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(DashboardHeaderDataState dashboardHeaderDataState, Continuation<? super DashboardHeaderDataState> continuation) {
                    return ((C498391) create(dashboardHeaderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return DashboardHeaderDataState.copy$default((DashboardHeaderDataState) this.L$0, null, null, null, null, this.$tooltipEligibleToBeShown, this.$badgeEligibleToBeShown, null, 79, null);
                }
            }
        }
    }

    public final void consumeAccountSwitcherAction(AccountSwitcherBottomSheet5 action) {
        HomeDashboardType pendingApplication;
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof AccountSwitcherBottomSheet5.AccountSelected) {
            this.homeDashboardStore.setHomeDashboardType(new HomeDashboardType.Account(((AccountSwitcherBottomSheet5.AccountSelected) action).getAccountNumber()));
            return;
        }
        if (action instanceof AccountSwitcherBottomSheet5.AllAccountsSelected) {
            return;
        }
        if (action instanceof AccountSwitcherBottomSheet5.ApplicationSelected) {
            AccountSwitcherBottomSheet5.ApplicationSelected applicationSelected = (AccountSwitcherBottomSheet5.ApplicationSelected) action;
            if (WhenMappings.$EnumSwitchMapping$0[applicationSelected.getBrokerageAccountType().ordinal()] == 1) {
                pendingApplication = HomeDashboardType.Nux.INSTANCE;
            } else {
                pendingApplication = new HomeDashboardType.PendingApplication(applicationSelected.getApplicationId(), applicationSelected.getBrokerageAccountType());
            }
            this.homeDashboardStore.setHomeDashboardType(pendingApplication);
            return;
        }
        if (!(action instanceof AccountSwitcherBottomSheet5.Refresh)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void markTooltipInteraction(String interactionPrefId) {
        Intrinsics.checkNotNullParameter(interactionPrefId, "interactionPrefId");
        this.accountSwitcherTooltipManager.markTooltipInteraction(interactionPrefId);
    }

    public final void markTooltipImpression(String impressionPrefId) {
        Intrinsics.checkNotNullParameter(impressionPrefId, "impressionPrefId");
        this.accountSwitcherTooltipManager.markTooltipImpression(impressionPrefId);
    }

    public final void markBadgeInteraction(String interactionPrefId) {
        Intrinsics.checkNotNullParameter(interactionPrefId, "interactionPrefId");
        this.accountSwitcherBadgeManager.markBadgeInteraction(interactionPrefId);
    }
}
