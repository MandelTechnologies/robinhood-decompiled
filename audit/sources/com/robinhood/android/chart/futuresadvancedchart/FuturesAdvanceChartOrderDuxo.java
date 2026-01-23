package com.robinhood.android.chart.futuresadvancedchart;

import black_widow.contracts.mobile_app_chart.proto.p024v1.FuturesContractDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetChartInstrumentDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderDuxo;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.GenericAdvanceChartOrderAction;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.LaunchActivity;
import com.robinhood.android.chart.blackwidowadvancedchart.models.BwTradeSide;
import com.robinhood.android.futures.contracts.FuturesOnboardingActivityKey;
import com.robinhood.android.futures.contracts.FuturesTradeActivityKey;
import com.robinhood.android.models.futures.api.ApiFuturesBuyingPower;
import com.robinhood.android.models.futures.api.account.FuturesAccountType;
import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.android.models.futures.p189db.FuturesCostBasis;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.AccountStore;
import com.robinhood.models.p320db.Account;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.trading.orderstate.InstrumentOrderState;
import com.robinhood.shared.trading.orderstate.InstrumentOrderState4;
import com.robinhood.shared.trading.orderstate.Quantity;
import com.robinhood.store.futures.FuturesAccountStore;
import com.robinhood.store.futures.RhdCostBasisStore;
import com.robinhood.store.futures.arsenal.FuturesContractStore;
import com.robinhood.utils.extensions.Uuids;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: FuturesAdvanceChartOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BA\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 H\u0016J&\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0019H\u0096@¢\u0006\u0002\u0010'J&\u0010(\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0019H\u0096@¢\u0006\u0002\u0010'J\u0010\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020+H\u0016J\u0018\u0010,\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020-H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/chart/futuresadvancedchart/FuturesAdvanceChartOrderDuxo;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/AdvanceChartOrderDuxo;", "Lcom/robinhood/android/chart/futuresadvancedchart/FuturesAdvanceChartOrderDataState;", "Lcom/robinhood/android/chart/futuresadvancedchart/FuturesAdvanceChartOrderViewState;", "accountStore", "Lcom/robinhood/librobinhood/data/store/AccountStore;", "futuresAccountStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "futuresContractStore", "Lcom/robinhood/store/futures/arsenal/FuturesContractStore;", "rhdCostBasisStore", "Lcom/robinhood/store/futures/RhdCostBasisStore;", "bwWebViewManager", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "futuresAdvanceChartOrderStateProvider", "Lcom/robinhood/android/chart/futuresadvancedchart/FuturesAdvanceChartOrderStateProvider;", "<init>", "(Lcom/robinhood/librobinhood/data/store/AccountStore;Lcom/robinhood/store/futures/FuturesAccountStore;Lcom/robinhood/store/futures/arsenal/FuturesContractStore;Lcom/robinhood/store/futures/RhdCostBasisStore;Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/chart/futuresadvancedchart/FuturesAdvanceChartOrderStateProvider;)V", "bind", "Lkotlinx/coroutines/Job;", "accountNumber", "", "instrumentId", "Ljava/util/UUID;", "onTradeAmountUpdated", "", "amount", "Lcom/robinhood/shared/trading/orderstate/InstrumentTradeAmount;", "handleGenericAdvanceChartOrderAction", "action", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/GenericAdvanceChartOrderAction;", "onTrade", "tradeSide", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/BwTradeSide;", "orderState", "Lcom/robinhood/shared/trading/orderstate/InstrumentOrderState;", "refId", "(Lcom/robinhood/android/chart/blackwidowadvancedchart/models/BwTradeSide;Lcom/robinhood/shared/trading/orderstate/InstrumentOrderState;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onConfirmed", "onAutoSendToggled", "enabled", "", "handleFuturesOrder", "Lcom/robinhood/android/chart/futuresadvancedchart/FuturesOrderState;", "lib-futures-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class FuturesAdvanceChartOrderDuxo extends AdvanceChartOrderDuxo<FuturesAdvanceChartOrderDataState, FuturesAdvanceChartOrderViewState> {
    private final AccountStore accountStore;
    private final BwWebViewManager bwWebViewManager;
    private final FuturesAccountStore futuresAccountStore;
    private final FuturesContractStore futuresContractStore;
    private final RhdCostBasisStore rhdCostBasisStore;

    /* compiled from: FuturesAdvanceChartOrderDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BwTradeSide.values().length];
            try {
                iArr[BwTradeSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BwTradeSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FuturesAdvanceChartOrderDuxo(AccountStore accountStore, FuturesAccountStore futuresAccountStore, FuturesContractStore futuresContractStore, RhdCostBasisStore rhdCostBasisStore, BwWebViewManager bwWebViewManager, DuxoBundle duxoBundle, FuturesAdvanceChartOrderStateProvider futuresAdvanceChartOrderStateProvider) {
        Intrinsics.checkNotNullParameter(accountStore, "accountStore");
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        Intrinsics.checkNotNullParameter(futuresContractStore, "futuresContractStore");
        Intrinsics.checkNotNullParameter(rhdCostBasisStore, "rhdCostBasisStore");
        Intrinsics.checkNotNullParameter(bwWebViewManager, "bwWebViewManager");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(futuresAdvanceChartOrderStateProvider, "futuresAdvanceChartOrderStateProvider");
        BigDecimal ONE = BigDecimal.ONE;
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        super(new FuturesAdvanceChartOrderDataState(null, null, null, null, new Quantity(ONE), null, false, null, null, 495, null), futuresAdvanceChartOrderStateProvider, duxoBundle);
        this.accountStore = accountStore;
        this.futuresAccountStore = futuresAccountStore;
        this.futuresContractStore = futuresContractStore;
        this.rhdCostBasisStore = rhdCostBasisStore;
        this.bwWebViewManager = bwWebViewManager;
    }

    /* compiled from: FuturesAdvanceChartOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$bind$1", m3645f = "FuturesAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$bind$1 */
    static final class C109581 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ UUID $instrumentId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C109581(String str, UUID uuid, Continuation<? super C109581> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
            this.$instrumentId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C109581 c109581 = FuturesAdvanceChartOrderDuxo.this.new C109581(this.$accountNumber, this.$instrumentId, continuation);
            c109581.L$0 = obj;
            return c109581;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C109581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: FuturesAdvanceChartOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/futuresadvancedchart/FuturesAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$bind$1$1", m3645f = "FuturesAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$bind$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesAdvanceChartOrderDataState, Continuation<? super FuturesAdvanceChartOrderDataState>, Object> {
            final /* synthetic */ UUID $instrumentId;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(UUID uuid, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$instrumentId = uuid;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$instrumentId, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FuturesAdvanceChartOrderDataState futuresAdvanceChartOrderDataState, Continuation<? super FuturesAdvanceChartOrderDataState> continuation) {
                return ((AnonymousClass1) create(futuresAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return FuturesAdvanceChartOrderDataState.copy$default((FuturesAdvanceChartOrderDataState) this.L$0, this.$instrumentId, null, null, null, null, null, false, null, null, 510, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                FuturesAdvanceChartOrderDuxo.this.applyMutation(new AnonymousClass1(this.$instrumentId, null));
                String str = this.$accountNumber;
                if (str != null) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(FuturesAdvanceChartOrderDuxo.this, str, null), 3, null);
                }
                SharedFlow sharedFlowShareIn = FlowKt.shareIn(FuturesAdvanceChartOrderDuxo.this.futuresContractStore.streamFuturesContract(this.$instrumentId), coroutineScope, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), 1);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(sharedFlowShareIn, FuturesAdvanceChartOrderDuxo.this, this.$instrumentId, this.$accountNumber, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(sharedFlowShareIn, FuturesAdvanceChartOrderDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(FuturesAdvanceChartOrderDuxo.this, this.$accountNumber, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass6(FuturesAdvanceChartOrderDuxo.this, this.$instrumentId, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass7(FuturesAdvanceChartOrderDuxo.this, this.$accountNumber, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: FuturesAdvanceChartOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$bind$1$2", m3645f = "FuturesAdvanceChartOrderDuxo.kt", m3646l = {60}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$bind$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $accountNumber;
            int label;
            final /* synthetic */ FuturesAdvanceChartOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(FuturesAdvanceChartOrderDuxo futuresAdvanceChartOrderDuxo, String str, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = futuresAdvanceChartOrderDuxo;
                this.$accountNumber = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$accountNumber, continuation);
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
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.accountStore.streamAccount(this.$accountNumber)), Integer.MAX_VALUE, null, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: FuturesAdvanceChartOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$bind$1$2$1", m3645f = "FuturesAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$bind$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Account, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesAdvanceChartOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FuturesAdvanceChartOrderDuxo futuresAdvanceChartOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresAdvanceChartOrderDuxo;
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

                /* compiled from: FuturesAdvanceChartOrderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/futuresadvancedchart/FuturesAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$bind$1$2$1$1", m3645f = "FuturesAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$bind$1$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C496761 extends ContinuationImpl7 implements Function2<FuturesAdvanceChartOrderDataState, Continuation<? super FuturesAdvanceChartOrderDataState>, Object> {
                    final /* synthetic */ Account $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C496761(Account account, Continuation<? super C496761> continuation) {
                        super(2, continuation);
                        this.$it = account;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C496761 c496761 = new C496761(this.$it, continuation);
                        c496761.L$0 = obj;
                        return c496761;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesAdvanceChartOrderDataState futuresAdvanceChartOrderDataState, Continuation<? super FuturesAdvanceChartOrderDataState> continuation) {
                        return ((C496761) create(futuresAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return FuturesAdvanceChartOrderDataState.copy$default((FuturesAdvanceChartOrderDataState) this.L$0, null, this.$it, null, null, null, null, false, null, null, 509, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C496761((Account) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: FuturesAdvanceChartOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$bind$1$3", m3645f = "FuturesAdvanceChartOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$bind$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $accountNumber;
            final /* synthetic */ SharedFlow<FuturesContract> $futuresContractFlow;
            final /* synthetic */ UUID $instrumentId;
            int label;
            final /* synthetic */ FuturesAdvanceChartOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(SharedFlow<FuturesContract> sharedFlow, FuturesAdvanceChartOrderDuxo futuresAdvanceChartOrderDuxo, UUID uuid, String str, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$futuresContractFlow = sharedFlow;
                this.this$0 = futuresAdvanceChartOrderDuxo;
                this.$instrumentId = uuid;
                this.$accountNumber = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$futuresContractFlow, this.this$0, this.$instrumentId, this.$accountNumber, continuation);
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
                    SharedFlow<FuturesContract> sharedFlow = this.$futuresContractFlow;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$instrumentId, this.$accountNumber, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: FuturesAdvanceChartOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "futuresContract", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$bind$1$3$1", m3645f = "FuturesAdvanceChartOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$bind$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesContract, Continuation<? super Unit>, Object> {
                final /* synthetic */ String $accountNumber;
                final /* synthetic */ UUID $instrumentId;
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesAdvanceChartOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FuturesAdvanceChartOrderDuxo futuresAdvanceChartOrderDuxo, UUID uuid, String str, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresAdvanceChartOrderDuxo;
                    this.$instrumentId = uuid;
                    this.$accountNumber = str;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$instrumentId, this.$accountNumber, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FuturesContract futuresContract, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(futuresContract, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        FuturesContract futuresContract = (FuturesContract) this.L$0;
                        BwWebViewManager bwWebViewManager = this.this$0.bwWebViewManager;
                        String string2 = this.$instrumentId.toString();
                        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                        SetChartInstrumentDto.InstrumentDto.FuturesContract futuresContract2 = new SetChartInstrumentDto.InstrumentDto.FuturesContract(new FuturesContractDto(string2, futuresContract.getStreamingSymbol()));
                        String str = this.$accountNumber;
                        this.label = 1;
                        if (bwWebViewManager.setChartInstrument(futuresContract2, str, this) == coroutine_suspended) {
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

        /* compiled from: FuturesAdvanceChartOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$bind$1$4", m3645f = "FuturesAdvanceChartOrderDuxo.kt", m3646l = {86}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$bind$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<FuturesContract> $futuresContractFlow;
            int label;
            final /* synthetic */ FuturesAdvanceChartOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(SharedFlow<FuturesContract> sharedFlow, FuturesAdvanceChartOrderDuxo futuresAdvanceChartOrderDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$futuresContractFlow = sharedFlow;
                this.this$0 = futuresAdvanceChartOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.$futuresContractFlow, this.this$0, continuation);
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
                    SharedFlow<FuturesContract> sharedFlow = this.$futuresContractFlow;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: FuturesAdvanceChartOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "futuresContract", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$bind$1$4$1", m3645f = "FuturesAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$bind$1$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesContract, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesAdvanceChartOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FuturesAdvanceChartOrderDuxo futuresAdvanceChartOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresAdvanceChartOrderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FuturesContract futuresContract, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(futuresContract, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesAdvanceChartOrderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/futuresadvancedchart/FuturesAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$bind$1$4$1$1", m3645f = "FuturesAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$bind$1$4$1$1, reason: invalid class name and collision with other inner class name */
                static final class C496771 extends ContinuationImpl7 implements Function2<FuturesAdvanceChartOrderDataState, Continuation<? super FuturesAdvanceChartOrderDataState>, Object> {
                    final /* synthetic */ FuturesContract $futuresContract;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C496771(FuturesContract futuresContract, Continuation<? super C496771> continuation) {
                        super(2, continuation);
                        this.$futuresContract = futuresContract;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C496771 c496771 = new C496771(this.$futuresContract, continuation);
                        c496771.L$0 = obj;
                        return c496771;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesAdvanceChartOrderDataState futuresAdvanceChartOrderDataState, Continuation<? super FuturesAdvanceChartOrderDataState> continuation) {
                        return ((C496771) create(futuresAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return FuturesAdvanceChartOrderDataState.copy$default((FuturesAdvanceChartOrderDataState) this.L$0, null, null, null, new FuturesInstrument(this.$futuresContract), null, null, false, null, null, 503, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C496771((FuturesContract) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: FuturesAdvanceChartOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$bind$1$5", m3645f = "FuturesAdvanceChartOrderDuxo.kt", m3646l = {95}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$bind$1$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $accountNumber;
            int label;
            final /* synthetic */ FuturesAdvanceChartOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(FuturesAdvanceChartOrderDuxo futuresAdvanceChartOrderDuxo, String str, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = futuresAdvanceChartOrderDuxo;
                this.$accountNumber = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.this$0, this.$accountNumber, continuation);
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
                    Flow<FuturesAccount> flowStreamFuturesAccount = this.this$0.futuresAccountStore.streamFuturesAccount(this.$accountNumber);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamFuturesAccount, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: FuturesAdvanceChartOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "futuresAccount", "Lcom/robinhood/android/models/futures/db/FuturesAccount;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$bind$1$5$1", m3645f = "FuturesAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$bind$1$5$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesAccount, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesAdvanceChartOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FuturesAdvanceChartOrderDuxo futuresAdvanceChartOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresAdvanceChartOrderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FuturesAccount futuresAccount, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(futuresAccount, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesAdvanceChartOrderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/futuresadvancedchart/FuturesAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$bind$1$5$1$1", m3645f = "FuturesAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$bind$1$5$1$1, reason: invalid class name and collision with other inner class name */
                static final class C496781 extends ContinuationImpl7 implements Function2<FuturesAdvanceChartOrderDataState, Continuation<? super FuturesAdvanceChartOrderDataState>, Object> {
                    final /* synthetic */ FuturesAccount $futuresAccount;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C496781(FuturesAccount futuresAccount, Continuation<? super C496781> continuation) {
                        super(2, continuation);
                        this.$futuresAccount = futuresAccount;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C496781 c496781 = new C496781(this.$futuresAccount, continuation);
                        c496781.L$0 = obj;
                        return c496781;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesAdvanceChartOrderDataState futuresAdvanceChartOrderDataState, Continuation<? super FuturesAdvanceChartOrderDataState> continuation) {
                        return ((C496781) create(futuresAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return FuturesAdvanceChartOrderDataState.copy$default((FuturesAdvanceChartOrderDataState) this.L$0, null, null, null, null, null, null, false, this.$futuresAccount, null, 383, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C496781((FuturesAccount) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: FuturesAdvanceChartOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$bind$1$6", m3645f = "FuturesAdvanceChartOrderDuxo.kt", m3646l = {104}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$bind$1$6, reason: invalid class name */
        static final class AnonymousClass6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ UUID $instrumentId;
            int label;
            final /* synthetic */ FuturesAdvanceChartOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(FuturesAdvanceChartOrderDuxo futuresAdvanceChartOrderDuxo, UUID uuid, Continuation<? super AnonymousClass6> continuation) {
                super(2, continuation);
                this.this$0 = futuresAdvanceChartOrderDuxo;
                this.$instrumentId = uuid;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass6(this.this$0, this.$instrumentId, continuation);
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
                    Flow flowStreamCostBasis$default = RhdCostBasisStore.streamCostBasis$default(this.this$0.rhdCostBasisStore, this.$instrumentId, FuturesAccountType.FUTURES, null, 4, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamCostBasis$default, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: FuturesAdvanceChartOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "costBasis", "Lcom/robinhood/android/models/futures/db/FuturesCostBasis;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$bind$1$6$1", m3645f = "FuturesAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$bind$1$6$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesCostBasis, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesAdvanceChartOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FuturesAdvanceChartOrderDuxo futuresAdvanceChartOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresAdvanceChartOrderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FuturesCostBasis futuresCostBasis, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(futuresCostBasis, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesAdvanceChartOrderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/futuresadvancedchart/FuturesAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$bind$1$6$1$1", m3645f = "FuturesAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$bind$1$6$1$1, reason: invalid class name and collision with other inner class name */
                static final class C496791 extends ContinuationImpl7 implements Function2<FuturesAdvanceChartOrderDataState, Continuation<? super FuturesAdvanceChartOrderDataState>, Object> {
                    final /* synthetic */ FuturesCostBasis $costBasis;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C496791(FuturesCostBasis futuresCostBasis, Continuation<? super C496791> continuation) {
                        super(2, continuation);
                        this.$costBasis = futuresCostBasis;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C496791 c496791 = new C496791(this.$costBasis, continuation);
                        c496791.L$0 = obj;
                        return c496791;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesAdvanceChartOrderDataState futuresAdvanceChartOrderDataState, Continuation<? super FuturesAdvanceChartOrderDataState> continuation) {
                        return ((C496791) create(futuresAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return FuturesAdvanceChartOrderDataState.copy$default((FuturesAdvanceChartOrderDataState) this.L$0, null, null, null, null, null, new FuturesChartPosition(this.$costBasis), false, null, null, 479, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C496791((FuturesCostBasis) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: FuturesAdvanceChartOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$bind$1$7", m3645f = "FuturesAdvanceChartOrderDuxo.kt", m3646l = {113}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$bind$1$7, reason: invalid class name */
        static final class AnonymousClass7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $accountNumber;
            int label;
            final /* synthetic */ FuturesAdvanceChartOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass7(FuturesAdvanceChartOrderDuxo futuresAdvanceChartOrderDuxo, String str, Continuation<? super AnonymousClass7> continuation) {
                super(2, continuation);
                this.this$0 = futuresAdvanceChartOrderDuxo;
                this.$accountNumber = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass7(this.this$0, this.$accountNumber, continuation);
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
                    Flow<ApiFuturesBuyingPower> flowStreamBuyingPower = this.this$0.futuresAccountStore.streamBuyingPower(this.$accountNumber);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamBuyingPower, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: FuturesAdvanceChartOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "futuresBuyingPower", "Lcom/robinhood/android/models/futures/api/ApiFuturesBuyingPower;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$bind$1$7$1", m3645f = "FuturesAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$bind$1$7$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ApiFuturesBuyingPower, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesAdvanceChartOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FuturesAdvanceChartOrderDuxo futuresAdvanceChartOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresAdvanceChartOrderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ApiFuturesBuyingPower apiFuturesBuyingPower, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(apiFuturesBuyingPower, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesAdvanceChartOrderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/futuresadvancedchart/FuturesAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$bind$1$7$1$1", m3645f = "FuturesAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$bind$1$7$1$1, reason: invalid class name and collision with other inner class name */
                static final class C496801 extends ContinuationImpl7 implements Function2<FuturesAdvanceChartOrderDataState, Continuation<? super FuturesAdvanceChartOrderDataState>, Object> {
                    final /* synthetic */ ApiFuturesBuyingPower $futuresBuyingPower;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C496801(ApiFuturesBuyingPower apiFuturesBuyingPower, Continuation<? super C496801> continuation) {
                        super(2, continuation);
                        this.$futuresBuyingPower = apiFuturesBuyingPower;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C496801 c496801 = new C496801(this.$futuresBuyingPower, continuation);
                        c496801.L$0 = obj;
                        return c496801;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesAdvanceChartOrderDataState futuresAdvanceChartOrderDataState, Continuation<? super FuturesAdvanceChartOrderDataState> continuation) {
                        return ((C496801) create(futuresAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return FuturesAdvanceChartOrderDataState.copy$default((FuturesAdvanceChartOrderDataState) this.L$0, null, null, new FuturesInstrumentBuyingPower(this.$futuresBuyingPower), null, null, null, false, null, null, 507, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C496801((ApiFuturesBuyingPower) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderDuxo4
    public Job bind(String accountNumber, UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C109581(accountNumber, instrumentId, null), 3, null);
    }

    /* compiled from: FuturesAdvanceChartOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/futuresadvancedchart/FuturesAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$onTradeAmountUpdated$1", m3645f = "FuturesAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$onTradeAmountUpdated$1 */
    static final class C109601 extends ContinuationImpl7 implements Function2<FuturesAdvanceChartOrderDataState, Continuation<? super FuturesAdvanceChartOrderDataState>, Object> {
        final /* synthetic */ InstrumentOrderState4 $amount;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C109601(InstrumentOrderState4 instrumentOrderState4, Continuation<? super C109601> continuation) {
            super(2, continuation);
            this.$amount = instrumentOrderState4;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C109601 c109601 = new C109601(this.$amount, continuation);
            c109601.L$0 = obj;
            return c109601;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesAdvanceChartOrderDataState futuresAdvanceChartOrderDataState, Continuation<? super FuturesAdvanceChartOrderDataState> continuation) {
            return ((C109601) create(futuresAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FuturesAdvanceChartOrderDataState.copy$default((FuturesAdvanceChartOrderDataState) this.L$0, null, null, null, null, this.$amount, null, false, null, null, 495, null);
        }
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderDuxo4
    public void onTradeAmountUpdated(InstrumentOrderState4 amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        applyMutation(new C109601(amount, null));
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderDuxo4
    public void handleGenericAdvanceChartOrderAction(GenericAdvanceChartOrderAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalArgumentException("FuturesAdvanceChartOrderDuxo: received and unhandled action " + Reflection.getOrCreateKotlinClass(action.getClass()).getSimpleName()), false, null, 4, null);
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderDuxo4
    public Object onTrade(BwTradeSide bwTradeSide, InstrumentOrderState instrumentOrderState, UUID uuid, Continuation<? super Unit> continuation) {
        if (instrumentOrderState instanceof FuturesOrderState) {
            handleFuturesOrder(bwTradeSide, (FuturesOrderState) instrumentOrderState);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderDuxo4
    public Object onConfirmed(BwTradeSide bwTradeSide, InstrumentOrderState instrumentOrderState, UUID uuid, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    /* compiled from: FuturesAdvanceChartOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/futuresadvancedchart/FuturesAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$onAutoSendToggled$1", m3645f = "FuturesAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo$onAutoSendToggled$1 */
    static final class C109591 extends ContinuationImpl7 implements Function2<FuturesAdvanceChartOrderDataState, Continuation<? super FuturesAdvanceChartOrderDataState>, Object> {
        final /* synthetic */ boolean $enabled;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C109591(boolean z, Continuation<? super C109591> continuation) {
            super(2, continuation);
            this.$enabled = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C109591 c109591 = new C109591(this.$enabled, continuation);
            c109591.L$0 = obj;
            return c109591;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesAdvanceChartOrderDataState futuresAdvanceChartOrderDataState, Continuation<? super FuturesAdvanceChartOrderDataState> continuation) {
            return ((C109591) create(futuresAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FuturesAdvanceChartOrderDataState.copy$default((FuturesAdvanceChartOrderDataState) this.L$0, null, null, null, null, null, null, this.$enabled, null, null, 447, null);
        }
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderDuxo4
    public void onAutoSendToggled(boolean enabled) {
        applyMutation(new C109591(enabled, null));
    }

    private final void handleFuturesOrder(BwTradeSide tradeSide, FuturesOrderState orderState) {
        FuturesOrderSide futuresOrderSide;
        IntentKey futuresTradeActivityKey;
        int i = WhenMappings.$EnumSwitchMapping$0[tradeSide.ordinal()];
        if (i == 1) {
            futuresOrderSide = FuturesOrderSide.BUY;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            futuresOrderSide = FuturesOrderSide.SELL;
        }
        FuturesOrderSide futuresOrderSide2 = futuresOrderSide;
        if (orderState.getRouteToOnboarding()) {
            futuresTradeActivityKey = new FuturesOnboardingActivityKey("futures-advanced-chart", false, new FuturesOnboardingActivityKey.PostOnboardingNavigation.RouteToFuturesOrderForm(orderState.getOrderInstrument().getId(), futuresOrderSide2, Integer.valueOf(BigDecimals7.toIntRounded(orderState.getOrderTradeAmount().getAmount())), true), 2, null);
        } else {
            futuresTradeActivityKey = new FuturesTradeActivityKey(new FuturesTradeActivityKey.TradeData.OrderForm(orderState.getOrderInstrument().getId(), new Screen(Screen.Name.MOBILE_ADVANCED_CHARTS, null, Uuids.safeToString(orderState.getOrderInstrument().getId()), null, 10, null), futuresOrderSide2, Integer.valueOf(BigDecimals7.toIntRounded(orderState.getOrderTradeAmount().getAmount())), true));
        }
        submit(new LaunchActivity(futuresTradeActivityKey));
    }
}
