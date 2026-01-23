package com.robinhood.android.advisory.dashboard.deposit;

import advisory.proto.p008v1.AdvisoryService;
import advisory.proto.p008v1.DepositsSummaryRowDto;
import advisory.proto.p008v1.GetDepositsSummaryRequestDto;
import advisory.proto.p008v1.GetDepositsSummaryResponseDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.instant.AdvisoryInstantExperiment;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.AutomaticDepositStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore;
import com.robinhood.models.advisory.p304db.ManagedAccountState;
import com.robinhood.models.advisory.p304db.card.StrategiesDashboardCard;
import com.robinhood.models.advisory.p304db.deposit.AdvisoryDepositGoldValueProps;
import com.robinhood.models.advisory.p304db.portfolio.ManagedPortfolioSummary;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.AutomaticDeposit;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.models.p355ui.bonfire.dashboardsection.UiGetDepositsSummaryRow2;
import com.robinhood.store.advisory.AdvisoryDashboardDepositsStore;
import com.robinhood.store.advisory.AdvisoryDepositPromoStore;
import com.robinhood.store.advisory.AdvisoryPortfolioBreakdownStore;
import com.robinhood.utils.datetime.LocalDates4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import p479j$.time.Instant;
import p479j$.time.LocalDate;

/* compiled from: DashboardDepositsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BQ\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u000e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/deposit/DashboardDepositsDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/advisory/dashboard/deposit/DashboardDepositsDataState;", "Lcom/robinhood/android/advisory/dashboard/deposit/DashboardDepositsViewState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "advisoryService", "Ladvisory/proto/v1/AdvisoryService;", "dashboardDepositsStore", "Lcom/robinhood/store/advisory/AdvisoryDashboardDepositsStore;", "automaticDepositStore", "Lcom/robinhood/librobinhood/data/store/AutomaticDepositStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "paymentTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;", "portfolioStore", "Lcom/robinhood/store/advisory/AdvisoryPortfolioBreakdownStore;", "depositPromoCardStore", "Lcom/robinhood/store/advisory/AdvisoryDepositPromoStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Ladvisory/proto/v1/AdvisoryService;Lcom/robinhood/store/advisory/AdvisoryDashboardDepositsStore;Lcom/robinhood/librobinhood/data/store/AutomaticDepositStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;Lcom/robinhood/store/advisory/AdvisoryPortfolioBreakdownStore;Lcom/robinhood/store/advisory/AdvisoryDepositPromoStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "accountNumberStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "onStart", "", "setAccountNumber", "accountNumber", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DashboardDepositsDuxo extends BaseDuxo<DashboardDepositsDataState, DashboardDepositsViewState> {
    public static final int $stable = 8;
    private final StateFlow2<String> accountNumberStateFlow;
    private final AccountProvider accountProvider;
    private final AdvisoryService advisoryService;
    private final AutomaticDepositStore automaticDepositStore;
    private final AdvisoryDashboardDepositsStore dashboardDepositsStore;
    private final AdvisoryDepositPromoStore depositPromoCardStore;
    private final ExperimentsStore experimentsStore;
    private final PaymentTransferStore paymentTransferStore;
    private final AdvisoryPortfolioBreakdownStore portfolioStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardDepositsDuxo(AccountProvider accountProvider, AdvisoryService advisoryService, AdvisoryDashboardDepositsStore dashboardDepositsStore, AutomaticDepositStore automaticDepositStore, ExperimentsStore experimentsStore, PaymentTransferStore paymentTransferStore, AdvisoryPortfolioBreakdownStore portfolioStore, AdvisoryDepositPromoStore depositPromoCardStore, DuxoBundle duxoBundle) {
        super(new DashboardDepositsDataState(null, null, null, null, null, null, false, null, null, 511, null), DashboardDepositsDataState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(advisoryService, "advisoryService");
        Intrinsics.checkNotNullParameter(dashboardDepositsStore, "dashboardDepositsStore");
        Intrinsics.checkNotNullParameter(automaticDepositStore, "automaticDepositStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(paymentTransferStore, "paymentTransferStore");
        Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
        Intrinsics.checkNotNullParameter(depositPromoCardStore, "depositPromoCardStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.advisoryService = advisoryService;
        this.dashboardDepositsStore = dashboardDepositsStore;
        this.automaticDepositStore = automaticDepositStore;
        this.experimentsStore = experimentsStore;
        this.paymentTransferStore = paymentTransferStore;
        this.portfolioStore = portfolioStore;
        this.depositPromoCardStore = depositPromoCardStore;
        this.accountNumberStateFlow = StateFlow4.MutableStateFlow(null);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        Flow flowFilterNotNull = FlowKt.filterNotNull(this.accountNumberStateFlow);
        final Flow flowDistinctUntilChangedBy = FlowKt.distinctUntilChangedBy(FlowKt.transformLatest(flowFilterNotNull, new DashboardDepositsDuxo$onStart$$inlined$flatMapLatest$1(null, this)), new Function1() { // from class: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DashboardDepositsDuxo.onStart$lambda$1((Account) obj);
            }
        });
        Flow<String> flow = new Flow<String>() { // from class: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$$inlined$map$1$2 */
            public static final class C86272<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$$inlined$map$1$2", m3645f = "DashboardDepositsDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C86272.this.emit(null, this);
                    }
                }

                public C86272(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        String accountNumberRhs = ((Account) obj).getAccountNumberRhs();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(accountNumberRhs, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                Object objCollect = flowDistinctUntilChangedBy.collect(new C86272(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        LocalDate localDateM3377of = LocalDate.m3377of(LocalDate.now().getYear(), 1, 1);
        Intrinsics.checkNotNull(localDateM3377of);
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C86371(flow, this, Instant.ofEpochMilli(LocalDates4.toEpochMillis$default(localDateM3377of, null, 1, null)), flowDistinctUntilChangedBy, flowFilterNotNull, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onStart$lambda$1(Account it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getAccountNumberRhs();
    }

    /* compiled from: DashboardDepositsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1", m3645f = "DashboardDepositsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1 */
    static final class C86371 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<String> $accountNumberFlow;
        final /* synthetic */ Flow<Account> $accountStream;
        final /* synthetic */ Flow<String> $rhsAccountNumberFlow;
        final /* synthetic */ Instant $startOfYearInstant;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DashboardDepositsDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C86371(Flow<String> flow, DashboardDepositsDuxo dashboardDepositsDuxo, Instant instant, Flow<Account> flow2, Flow<String> flow3, Continuation<? super C86371> continuation) {
            super(2, continuation);
            this.$rhsAccountNumberFlow = flow;
            this.this$0 = dashboardDepositsDuxo;
            this.$startOfYearInstant = instant;
            this.$accountStream = flow2;
            this.$accountNumberFlow = flow3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C86371 c86371 = new C86371(this.$rhsAccountNumberFlow, this.this$0, this.$startOfYearInstant, this.$accountStream, this.$accountNumberFlow, continuation);
            c86371.L$0 = obj;
            return c86371;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C86371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: DashboardDepositsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$1", m3645f = "DashboardDepositsDuxo.kt", m3646l = {84}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<String> $rhsAccountNumberFlow;
            final /* synthetic */ Instant $startOfYearInstant;
            int label;
            final /* synthetic */ DashboardDepositsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Flow<String> flow, DashboardDepositsDuxo dashboardDepositsDuxo, Instant instant, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$rhsAccountNumberFlow = flow;
                this.this$0 = dashboardDepositsDuxo;
                this.$startOfYearInstant = instant;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$rhsAccountNumberFlow, this.this$0, this.$startOfYearInstant, continuation);
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
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$rhsAccountNumberFlow, new C8628x8a856514(null, this.this$0, this.$startOfYearInstant));
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

            /* compiled from: DashboardDepositsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "lastDeposit", "Lcom/robinhood/models/db/bonfire/PaymentTransfer;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$1$2", m3645f = "DashboardDepositsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<PaymentTransfer, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ DashboardDepositsDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(DashboardDepositsDuxo dashboardDepositsDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = dashboardDepositsDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PaymentTransfer paymentTransfer, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(paymentTransfer, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: DashboardDepositsDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/dashboard/deposit/DashboardDepositsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$1$2$1", m3645f = "DashboardDepositsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$1$2$1, reason: invalid class name and collision with other inner class name */
                static final class C495391 extends ContinuationImpl7 implements Function2<DashboardDepositsDataState, Continuation<? super DashboardDepositsDataState>, Object> {
                    final /* synthetic */ PaymentTransfer $lastDeposit;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C495391(PaymentTransfer paymentTransfer, Continuation<? super C495391> continuation) {
                        super(2, continuation);
                        this.$lastDeposit = paymentTransfer;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C495391 c495391 = new C495391(this.$lastDeposit, continuation);
                        c495391.L$0 = obj;
                        return c495391;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(DashboardDepositsDataState dashboardDepositsDataState, Continuation<? super DashboardDepositsDataState> continuation) {
                        return ((C495391) create(dashboardDepositsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return DashboardDepositsDataState.copy$default((DashboardDepositsDataState) this.L$0, null, null, this.$lastDeposit, null, null, null, false, null, null, 507, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C495391((PaymentTransfer) this.L$0, null));
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
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.$rhsAccountNumberFlow, this.this$0, this.$startOfYearInstant, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.$rhsAccountNumberFlow, this.this$0, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(this.$accountStream, this.this$0, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(this.$accountNumberFlow, this.this$0, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(this.$accountNumberFlow, this.this$0, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass6(this.this$0, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass7(this.$rhsAccountNumberFlow, this.this$0, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass8(this.$accountNumberFlow, this.this$0, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: DashboardDepositsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$2", m3645f = "DashboardDepositsDuxo.kt", m3646l = {95}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<String> $rhsAccountNumberFlow;
            int label;
            final /* synthetic */ DashboardDepositsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Flow<String> flow, DashboardDepositsDuxo dashboardDepositsDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$rhsAccountNumberFlow = flow;
                this.this$0 = dashboardDepositsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$rhsAccountNumberFlow, this.this$0, continuation);
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
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.transformLatest(this.$rhsAccountNumberFlow, new C8629xe1a355f3(null, this.this$0.automaticDepositStore)));
                    C495402 c495402 = new C495402(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, c495402, this) == coroutine_suspended) {
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

            /* compiled from: DashboardDepositsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "nextDeposit", "Lcom/robinhood/models/db/AutomaticDeposit;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$2$2", m3645f = "DashboardDepositsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$2$2, reason: invalid class name and collision with other inner class name */
            static final class C495402 extends ContinuationImpl7 implements Function2<AutomaticDeposit, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ DashboardDepositsDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C495402(DashboardDepositsDuxo dashboardDepositsDuxo, Continuation<? super C495402> continuation) {
                    super(2, continuation);
                    this.this$0 = dashboardDepositsDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C495402 c495402 = new C495402(this.this$0, continuation);
                    c495402.L$0 = obj;
                    return c495402;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AutomaticDeposit automaticDeposit, Continuation<? super Unit> continuation) {
                    return ((C495402) create(automaticDeposit, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: DashboardDepositsDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/dashboard/deposit/DashboardDepositsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$2$2$1", m3645f = "DashboardDepositsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$2$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DashboardDepositsDataState, Continuation<? super DashboardDepositsDataState>, Object> {
                    final /* synthetic */ AutomaticDeposit $nextDeposit;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(AutomaticDeposit automaticDeposit, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$nextDeposit = automaticDeposit;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$nextDeposit, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(DashboardDepositsDataState dashboardDepositsDataState, Continuation<? super DashboardDepositsDataState> continuation) {
                        return ((AnonymousClass1) create(dashboardDepositsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return DashboardDepositsDataState.copy$default((DashboardDepositsDataState) this.L$0, null, null, null, this.$nextDeposit, null, null, false, null, null, 503, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((AutomaticDeposit) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: DashboardDepositsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$3", m3645f = "DashboardDepositsDuxo.kt", m3646l = {104}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Account> $accountStream;
            int label;
            final /* synthetic */ DashboardDepositsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(Flow<Account> flow, DashboardDepositsDuxo dashboardDepositsDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$accountStream = flow;
                this.this$0 = dashboardDepositsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$accountStream, this.this$0, continuation);
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
                    Flow<Account> flow = this.$accountStream;
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

            /* compiled from: DashboardDepositsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "account", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$3$1", m3645f = "DashboardDepositsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Account, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ DashboardDepositsDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(DashboardDepositsDuxo dashboardDepositsDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = dashboardDepositsDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Account account, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(account, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: DashboardDepositsDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/dashboard/deposit/DashboardDepositsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$3$1$1", m3645f = "DashboardDepositsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$3$1$1, reason: invalid class name and collision with other inner class name */
                static final class C495411 extends ContinuationImpl7 implements Function2<DashboardDepositsDataState, Continuation<? super DashboardDepositsDataState>, Object> {
                    final /* synthetic */ Account $account;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C495411(Account account, Continuation<? super C495411> continuation) {
                        super(2, continuation);
                        this.$account = account;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C495411 c495411 = new C495411(this.$account, continuation);
                        c495411.L$0 = obj;
                        return c495411;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(DashboardDepositsDataState dashboardDepositsDataState, Continuation<? super DashboardDepositsDataState> continuation) {
                        return ((C495411) create(dashboardDepositsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return DashboardDepositsDataState.copy$default((DashboardDepositsDataState) this.L$0, this.$account.getAccountNumberRhs(), this.$account.getBrokerageAccountType(), null, null, null, null, false, null, null, 508, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C495411((Account) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: DashboardDepositsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$4", m3645f = "DashboardDepositsDuxo.kt", m3646l = {118}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<String> $accountNumberFlow;
            int label;
            final /* synthetic */ DashboardDepositsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(Flow<String> flow, DashboardDepositsDuxo dashboardDepositsDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$accountNumberFlow = flow;
                this.this$0 = dashboardDepositsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.$accountNumberFlow, this.this$0, continuation);
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
                    final Flow flowTransformLatest = FlowKt.transformLatest(this.$accountNumberFlow, new C8630x8fdf37b1(null, this.this$0.dashboardDepositsStore));
                    Flow<String> flow = new Flow<String>() { // from class: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$4$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                            Object objCollect = flowTransformLatest.collect(new C86312(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$4$invokeSuspend$$inlined$map$1$2 */
                        public static final class C86312<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$4$invokeSuspend$$inlined$map$1$2", m3645f = "DashboardDepositsDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$4$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return C86312.this.emit(null, this);
                                }
                            }

                            public C86312(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    AdvisoryDepositGoldValueProps.Content content = ((AdvisoryDepositGoldValueProps) obj).getContent();
                                    String pillTitle = content != null ? content.getPillTitle() : null;
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(pillTitle, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    };
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, anonymousClass3, this) == coroutine_suspended) {
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

            /* compiled from: DashboardDepositsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "valuePropsPillTitle", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$4$3", m3645f = "DashboardDepositsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$4$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<String, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ DashboardDepositsDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(DashboardDepositsDuxo dashboardDepositsDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = dashboardDepositsDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(String str, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: DashboardDepositsDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/dashboard/deposit/DashboardDepositsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$4$3$1", m3645f = "DashboardDepositsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$4$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DashboardDepositsDataState, Continuation<? super DashboardDepositsDataState>, Object> {
                    final /* synthetic */ String $valuePropsPillTitle;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$valuePropsPillTitle = str;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$valuePropsPillTitle, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(DashboardDepositsDataState dashboardDepositsDataState, Continuation<? super DashboardDepositsDataState> continuation) {
                        return ((AnonymousClass1) create(dashboardDepositsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return DashboardDepositsDataState.copy$default((DashboardDepositsDataState) this.L$0, null, null, null, null, this.$valuePropsPillTitle, null, false, null, null, 495, null);
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

        /* compiled from: DashboardDepositsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$5", m3645f = "DashboardDepositsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<String> $accountNumberFlow;
            int label;
            final /* synthetic */ DashboardDepositsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(Flow<String> flow, DashboardDepositsDuxo dashboardDepositsDuxo, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.$accountNumberFlow = flow;
                this.this$0 = dashboardDepositsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.$accountNumberFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Flow flowTransformLatest = FlowKt.transformLatest(this.$accountNumberFlow, new C8632xe6fd2890(null, this.this$0.portfolioStore));
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<ManagedAccountState>() { // from class: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$5$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super ManagedAccountState> flowCollector, Continuation continuation) {
                            Object objCollect = flowTransformLatest.collect(new C86332(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$5$invokeSuspend$$inlined$map$1$2 */
                        public static final class C86332<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$5$invokeSuspend$$inlined$map$1$2", m3645f = "DashboardDepositsDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$5$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return C86332.this.emit(null, this);
                                }
                            }

                            public C86332(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    ManagedAccountState accountState = ((ManagedPortfolioSummary) obj).getAccountState();
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(accountState, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    });
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass3, this) == coroutine_suspended) {
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

            /* compiled from: DashboardDepositsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "accountState", "Lcom/robinhood/models/advisory/db/ManagedAccountState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$5$3", m3645f = "DashboardDepositsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$5$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<ManagedAccountState, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ DashboardDepositsDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(DashboardDepositsDuxo dashboardDepositsDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = dashboardDepositsDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ManagedAccountState managedAccountState, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(managedAccountState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: DashboardDepositsDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/dashboard/deposit/DashboardDepositsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$5$3$1", m3645f = "DashboardDepositsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$5$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DashboardDepositsDataState, Continuation<? super DashboardDepositsDataState>, Object> {
                    final /* synthetic */ ManagedAccountState $accountState;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(ManagedAccountState managedAccountState, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$accountState = managedAccountState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$accountState, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(DashboardDepositsDataState dashboardDepositsDataState, Continuation<? super DashboardDepositsDataState> continuation) {
                        return ((AnonymousClass1) create(dashboardDepositsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return DashboardDepositsDataState.copy$default((DashboardDepositsDataState) this.L$0, null, null, null, null, null, this.$accountState, false, null, null, 479, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((ManagedAccountState) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: DashboardDepositsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$6", m3645f = "DashboardDepositsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$6, reason: invalid class name */
        static final class AnonymousClass6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DashboardDepositsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(DashboardDepositsDuxo dashboardDepositsDuxo, Continuation<? super AnonymousClass6> continuation) {
                super(2, continuation);
                this.this$0 = dashboardDepositsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass6(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{AdvisoryInstantExperiment.INSTANCE}, false, null, 6, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
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

            /* compiled from: DashboardDepositsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isInAdvisoryInstantExperiment", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$6$1", m3645f = "DashboardDepositsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$6$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ DashboardDepositsDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(DashboardDepositsDuxo dashboardDepositsDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = dashboardDepositsDuxo;
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

                /* compiled from: DashboardDepositsDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/dashboard/deposit/DashboardDepositsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$6$1$1", m3645f = "DashboardDepositsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$6$1$1, reason: invalid class name and collision with other inner class name */
                static final class C495421 extends ContinuationImpl7 implements Function2<DashboardDepositsDataState, Continuation<? super DashboardDepositsDataState>, Object> {
                    final /* synthetic */ boolean $isInAdvisoryInstantExperiment;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C495421(boolean z, Continuation<? super C495421> continuation) {
                        super(2, continuation);
                        this.$isInAdvisoryInstantExperiment = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C495421 c495421 = new C495421(this.$isInAdvisoryInstantExperiment, continuation);
                        c495421.L$0 = obj;
                        return c495421;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(DashboardDepositsDataState dashboardDepositsDataState, Continuation<? super DashboardDepositsDataState> continuation) {
                        return ((C495421) create(dashboardDepositsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return DashboardDepositsDataState.copy$default((DashboardDepositsDataState) this.L$0, null, null, null, null, null, null, this.$isInAdvisoryInstantExperiment, null, null, 447, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C495421(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: DashboardDepositsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$7", m3645f = "DashboardDepositsDuxo.kt", m3646l = {156}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$7, reason: invalid class name */
        static final class AnonymousClass7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<String> $rhsAccountNumberFlow;
            int label;
            final /* synthetic */ DashboardDepositsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass7(Flow<String> flow, DashboardDepositsDuxo dashboardDepositsDuxo, Continuation<? super AnonymousClass7> continuation) {
                super(2, continuation);
                this.$rhsAccountNumberFlow = flow;
                this.this$0 = dashboardDepositsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass7(this.$rhsAccountNumberFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Flow<String> flow = this.$rhsAccountNumberFlow;
                    final DashboardDepositsDuxo dashboardDepositsDuxo = this.this$0;
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<GetDepositsSummaryResponseDto>() { // from class: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$7$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super GetDepositsSummaryResponseDto> flowCollector, Continuation continuation) {
                            Object objCollect = flow.collect(new C86342(flowCollector, dashboardDepositsDuxo), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$7$invokeSuspend$$inlined$map$1$2 */
                        public static final class C86342<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;
                            final /* synthetic */ DashboardDepositsDuxo this$0;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$7$invokeSuspend$$inlined$map$1$2", m3645f = "DashboardDepositsDuxo.kt", m3646l = {51, 50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$7$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return C86342.this.emit(null, this);
                                }
                            }

                            public C86342(FlowCollector flowCollector, DashboardDepositsDuxo dashboardDepositsDuxo) {
                                this.$this_unsafeFlow = flowCollector;
                                this.this$0 = dashboardDepositsDuxo;
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
                            
                                if (r8.emit(r9, r0) == r1) goto L22;
                             */
                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                FlowCollector flowCollector;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector2 = this.$this_unsafeFlow;
                                    AdvisoryService advisoryService = this.this$0.advisoryService;
                                    GetDepositsSummaryRequestDto getDepositsSummaryRequestDto = new GetDepositsSummaryRequestDto((String) obj);
                                    anonymousClass1.L$0 = flowCollector2;
                                    anonymousClass1.label = 1;
                                    Object objGetDepositsSummary = advisoryService.GetDepositsSummary(getDepositsSummaryRequestDto, anonymousClass1);
                                    if (objGetDepositsSummary != coroutine_suspended) {
                                        obj2 = objGetDepositsSummary;
                                        flowCollector = flowCollector2;
                                    }
                                    return coroutine_suspended;
                                }
                                if (i2 != 1) {
                                    if (i2 != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                    return Unit.INSTANCE;
                                }
                                FlowCollector flowCollector3 = (FlowCollector) anonymousClass1.L$0;
                                ResultKt.throwOnFailure(obj2);
                                flowCollector = flowCollector3;
                                anonymousClass1.L$0 = null;
                                anonymousClass1.label = 2;
                            }
                        }
                    });
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

            /* compiled from: DashboardDepositsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "depositSummary", "Ladvisory/proto/v1/GetDepositsSummaryResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$7$2", m3645f = "DashboardDepositsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$7$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<GetDepositsSummaryResponseDto, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ DashboardDepositsDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(DashboardDepositsDuxo dashboardDepositsDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = dashboardDepositsDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(GetDepositsSummaryResponseDto getDepositsSummaryResponseDto, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(getDepositsSummaryResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: DashboardDepositsDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/dashboard/deposit/DashboardDepositsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$7$2$1", m3645f = "DashboardDepositsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$7$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DashboardDepositsDataState, Continuation<? super DashboardDepositsDataState>, Object> {
                    final /* synthetic */ GetDepositsSummaryResponseDto $depositSummary;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(GetDepositsSummaryResponseDto getDepositsSummaryResponseDto, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$depositSummary = getDepositsSummaryResponseDto;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$depositSummary, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(DashboardDepositsDataState dashboardDepositsDataState, Continuation<? super DashboardDepositsDataState> continuation) {
                        return ((AnonymousClass1) create(dashboardDepositsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        DashboardDepositsDataState dashboardDepositsDataState = (DashboardDepositsDataState) this.L$0;
                        List<DepositsSummaryRowDto> rows = this.$depositSummary.getRows();
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(rows, 10));
                        Iterator<T> it = rows.iterator();
                        while (it.hasNext()) {
                            arrayList.add(UiGetDepositsSummaryRow2.toUiModel((DepositsSummaryRowDto) it.next()));
                        }
                        return DashboardDepositsDataState.copy$default(dashboardDepositsDataState, null, null, null, null, null, null, false, extensions2.toPersistentList(arrayList), null, 383, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((GetDepositsSummaryResponseDto) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: DashboardDepositsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$8", m3645f = "DashboardDepositsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$8, reason: invalid class name */
        static final class AnonymousClass8 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<String> $accountNumberFlow;
            int label;
            final /* synthetic */ DashboardDepositsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass8(Flow<String> flow, DashboardDepositsDuxo dashboardDepositsDuxo, Continuation<? super AnonymousClass8> continuation) {
                super(2, continuation);
                this.$accountNumberFlow = flow;
                this.this$0 = dashboardDepositsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass8(this.$accountNumberFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Flow flowTransformLatest = FlowKt.transformLatest(this.$accountNumberFlow, new C8635xec56fb2d(null, this.this$0.depositPromoCardStore));
                    Flow<StrategiesDashboardCard.Alignment> flow = new Flow<StrategiesDashboardCard.Alignment>() { // from class: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$8$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super StrategiesDashboardCard.Alignment> flowCollector, Continuation continuation) {
                            Object objCollect = flowTransformLatest.collect(new C86362(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$8$invokeSuspend$$inlined$map$1$2 */
                        public static final class C86362<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$8$invokeSuspend$$inlined$map$1$2", m3645f = "DashboardDepositsDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$8$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return C86362.this.emit(null, this);
                                }
                            }

                            public C86362(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                StrategiesDashboardCard.Alignment alignment;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    StrategiesDashboardCard strategiesDashboardCard = (StrategiesDashboardCard) obj;
                                    if (strategiesDashboardCard == null || (alignment = strategiesDashboardCard.getAlignment()) == null) {
                                        alignment = StrategiesDashboardCard.Alignment.BELOW_DEPOSIT;
                                    }
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(alignment, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    };
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, anonymousClass3, this) == coroutine_suspended) {
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

            /* compiled from: DashboardDepositsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "cardLocation", "Lcom/robinhood/models/advisory/db/card/StrategiesDashboardCard$Alignment;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$8$3", m3645f = "DashboardDepositsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$8$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<StrategiesDashboardCard.Alignment, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ DashboardDepositsDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(DashboardDepositsDuxo dashboardDepositsDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = dashboardDepositsDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(StrategiesDashboardCard.Alignment alignment, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(alignment, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: DashboardDepositsDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/dashboard/deposit/DashboardDepositsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$8$3$1", m3645f = "DashboardDepositsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsDuxo$onStart$1$8$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DashboardDepositsDataState, Continuation<? super DashboardDepositsDataState>, Object> {
                    final /* synthetic */ StrategiesDashboardCard.Alignment $cardLocation;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(StrategiesDashboardCard.Alignment alignment, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$cardLocation = alignment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$cardLocation, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(DashboardDepositsDataState dashboardDepositsDataState, Continuation<? super DashboardDepositsDataState> continuation) {
                        return ((AnonymousClass1) create(dashboardDepositsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return DashboardDepositsDataState.copy$default((DashboardDepositsDataState) this.L$0, null, null, null, null, null, null, false, null, this.$cardLocation, 255, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((StrategiesDashboardCard.Alignment) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    public final void setAccountNumber(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.accountNumberStateFlow.setValue(accountNumber);
    }
}
