package com.robinhood.android.dashboard.lib.chart;

import com.robinhood.android.home.contracts.HomeDashboardType;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.regiongate.McwCurrencySwitcherRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.p320db.Account;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: DashboardChartDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/chart/DashboardChartDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/dashboard/lib/chart/DashboardChartDataState;", "Lcom/robinhood/android/dashboard/lib/chart/DashboardChartViewState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "dashboardTypeFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/android/home/contracts/HomeDashboardType;", "onCreate", "", "bind", "dashboardType", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class DashboardChartDuxo extends BaseDuxo<DashboardChartDataState, DashboardChartViewState> {
    public static final int $stable = 8;
    private final AccountProvider accountProvider;
    private final StateFlow2<HomeDashboardType> dashboardTypeFlow;
    private final RegionGateProvider regionGateProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardChartDuxo(AccountProvider accountProvider, RegionGateProvider regionGateProvider, DuxoBundle duxoBundle) {
        super(new DashboardChartDataState(null, null, false, 7, null), DashboardChartDataState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.regionGateProvider = regionGateProvider;
        this.dashboardTypeFlow = StateFlow4.MutableStateFlow(null);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C137311(null));
    }

    /* compiled from: DashboardChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.chart.DashboardChartDuxo$onCreate$1", m3645f = "DashboardChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.dashboard.lib.chart.DashboardChartDuxo$onCreate$1 */
    static final class C137311 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C137311(Continuation<? super C137311> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C137311 c137311 = DashboardChartDuxo.this.new C137311(continuation);
            c137311.L$0 = obj;
            return c137311;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C137311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: DashboardChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.chart.DashboardChartDuxo$onCreate$1$1", m3645f = "DashboardChartDuxo.kt", m3646l = {41}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.dashboard.lib.chart.DashboardChartDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DashboardChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(DashboardChartDuxo dashboardChartDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = dashboardChartDuxo;
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
                    Flow flowStreamRegionGateStateFlow$default = RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(this.this$0.regionGateProvider, McwCurrencySwitcherRegionGate.INSTANCE, false, 2, null);
                    C498341 c498341 = new C498341(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamRegionGateStateFlow$default, c498341, this) == coroutine_suspended) {
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

            /* compiled from: DashboardChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isInMcwCurrencySwitcherRegionGate", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.chart.DashboardChartDuxo$onCreate$1$1$1", m3645f = "DashboardChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.dashboard.lib.chart.DashboardChartDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C498341 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ DashboardChartDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C498341(DashboardChartDuxo dashboardChartDuxo, Continuation<? super C498341> continuation) {
                    super(2, continuation);
                    this.this$0 = dashboardChartDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C498341 c498341 = new C498341(this.this$0, continuation);
                    c498341.Z$0 = ((Boolean) obj).booleanValue();
                    return c498341;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((C498341) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: DashboardChartDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/dashboard/lib/chart/DashboardChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.chart.DashboardChartDuxo$onCreate$1$1$1$1", m3645f = "DashboardChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.dashboard.lib.chart.DashboardChartDuxo$onCreate$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C498351 extends ContinuationImpl7 implements Function2<DashboardChartDataState, Continuation<? super DashboardChartDataState>, Object> {
                    final /* synthetic */ boolean $isInMcwCurrencySwitcherRegionGate;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C498351(boolean z, Continuation<? super C498351> continuation) {
                        super(2, continuation);
                        this.$isInMcwCurrencySwitcherRegionGate = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C498351 c498351 = new C498351(this.$isInMcwCurrencySwitcherRegionGate, continuation);
                        c498351.L$0 = obj;
                        return c498351;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(DashboardChartDataState dashboardChartDataState, Continuation<? super DashboardChartDataState> continuation) {
                        return ((C498351) create(dashboardChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return DashboardChartDataState.copy$default((DashboardChartDataState) this.L$0, null, null, this.$isInMcwCurrencySwitcherRegionGate, 3, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C498351(this.Z$0, null));
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
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(DashboardChartDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(DashboardChartDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: DashboardChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.chart.DashboardChartDuxo$onCreate$1$2", m3645f = "DashboardChartDuxo.kt", m3646l = {51}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.dashboard.lib.chart.DashboardChartDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DashboardChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(DashboardChartDuxo dashboardChartDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = dashboardChartDuxo;
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
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.filterNotNull(this.this$0.dashboardTypeFlow), new C13729xae2916(null, this.this$0.accountProvider));
                    C498362 c498362 = new C498362(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, c498362, this) == coroutine_suspended) {
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

            /* compiled from: DashboardChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "account", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.chart.DashboardChartDuxo$onCreate$1$2$2", m3645f = "DashboardChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.dashboard.lib.chart.DashboardChartDuxo$onCreate$1$2$2, reason: invalid class name and collision with other inner class name */
            static final class C498362 extends ContinuationImpl7 implements Function2<Account, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ DashboardChartDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C498362(DashboardChartDuxo dashboardChartDuxo, Continuation<? super C498362> continuation) {
                    super(2, continuation);
                    this.this$0 = dashboardChartDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C498362 c498362 = new C498362(this.this$0, continuation);
                    c498362.L$0 = obj;
                    return c498362;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Account account, Continuation<? super Unit> continuation) {
                    return ((C498362) create(account, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: DashboardChartDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/dashboard/lib/chart/DashboardChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.chart.DashboardChartDuxo$onCreate$1$2$2$1", m3645f = "DashboardChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.dashboard.lib.chart.DashboardChartDuxo$onCreate$1$2$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DashboardChartDataState, Continuation<? super DashboardChartDataState>, Object> {
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
                    public final Object invoke(DashboardChartDataState dashboardChartDataState, Continuation<? super DashboardChartDataState> continuation) {
                        return ((AnonymousClass1) create(dashboardChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        DashboardChartDataState dashboardChartDataState = (DashboardChartDataState) this.L$0;
                        Account account = this.$account;
                        return DashboardChartDataState.copy$default(dashboardChartDataState, null, account != null ? account.getBrokerageAccountType() : null, false, 5, null);
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
    }

    /* compiled from: DashboardChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/dashboard/lib/chart/DashboardChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.chart.DashboardChartDuxo$bind$2", m3645f = "DashboardChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.dashboard.lib.chart.DashboardChartDuxo$bind$2 */
    static final class C137302 extends ContinuationImpl7 implements Function2<DashboardChartDataState, Continuation<? super DashboardChartDataState>, Object> {
        final /* synthetic */ HomeDashboardType $dashboardType;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C137302(HomeDashboardType homeDashboardType, Continuation<? super C137302> continuation) {
            super(2, continuation);
            this.$dashboardType = homeDashboardType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C137302 c137302 = new C137302(this.$dashboardType, continuation);
            c137302.L$0 = obj;
            return c137302;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DashboardChartDataState dashboardChartDataState, Continuation<? super DashboardChartDataState> continuation) {
            return ((C137302) create(dashboardChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return DashboardChartDataState.copy$default((DashboardChartDataState) this.L$0, this.$dashboardType, null, false, 6, null);
        }
    }

    public final void bind(HomeDashboardType dashboardType) {
        Intrinsics.checkNotNullParameter(dashboardType, "dashboardType");
        StateFlow2<HomeDashboardType> stateFlow2 = this.dashboardTypeFlow;
        while (!stateFlow2.compareAndSet(stateFlow2.getValue(), dashboardType)) {
        }
        applyMutation(new C137302(dashboardType, null));
    }
}
