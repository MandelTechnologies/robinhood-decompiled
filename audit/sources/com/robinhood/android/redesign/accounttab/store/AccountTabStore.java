package com.robinhood.android.redesign.accounttab.store;

import com.robinhood.android.dashboard.store.HomeDashboardStore;
import com.robinhood.android.models.portfolio.PerformanceChartModel;
import com.robinhood.android.models.portfolio.api.PerformanceChartType;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore;
import com.robinhood.models.home.HomeAccountSwitcher;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.models.serverdriven.experimental.api.Line;
import com.robinhood.models.serverdriven.experimental.api.Money;
import com.robinhood.models.serverdriven.experimental.api.Point;
import com.robinhood.models.serverdriven.experimental.api.PriceChartData;
import com.robinhood.models.serverdriven.experimental.api.Segment;
import com.robinhood.shared.i18n.models.currency.DisplayCurrency;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.math.BigDecimal;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: AccountTabStore.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J4\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00122\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/redesign/accounttab/store/AccountTabStore;", "Lcom/robinhood/store/Store;", "performanceChartStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore;", "homeDashboardStore", "Lcom/robinhood/android/dashboard/store/HomeDashboardStore;", "bundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore;Lcom/robinhood/android/dashboard/store/HomeDashboardStore;Lcom/robinhood/store/StoreBundle;)V", "forceRefresh", "", "streamDefaultPerformanceChart", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/redesign/accounttab/store/AccountPerformance;", "accountNumber", "", "isPrivacyEnabled", "", "streamManagedPerformanceChart", "streamPerformanceChart", "chartType", "Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;", "includeAllHours", "streamPendingAccounts", "", "Lcom/robinhood/models/home/HomeAccountSwitcher$Account;", "lib-account-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class AccountTabStore extends Store {
    public static final int $stable = 8;
    private final HomeDashboardStore homeDashboardStore;
    private final PerformanceChartStore performanceChartStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountTabStore(PerformanceChartStore performanceChartStore, HomeDashboardStore homeDashboardStore, StoreBundle bundle) {
        super(bundle);
        Intrinsics.checkNotNullParameter(performanceChartStore, "performanceChartStore");
        Intrinsics.checkNotNullParameter(homeDashboardStore, "homeDashboardStore");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.performanceChartStore = performanceChartStore;
        this.homeDashboardStore = homeDashboardStore;
    }

    public final void forceRefresh() {
        this.homeDashboardStore.forceRefresh();
    }

    public final Flow<AccountPerformance> streamDefaultPerformanceChart(String accountNumber, boolean isPrivacyEnabled) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return streamPerformanceChart$default(this, accountNumber, null, false, isPrivacyEnabled, 6, null);
    }

    public final Flow<AccountPerformance> streamManagedPerformanceChart(String accountNumber, boolean isPrivacyEnabled) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return streamPerformanceChart$default(this, accountNumber, null, false, isPrivacyEnabled, 2, null);
    }

    static /* synthetic */ Flow streamPerformanceChart$default(AccountTabStore accountTabStore, String str, PerformanceChartType performanceChartType, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            performanceChartType = PerformanceChartType.HISTORICAL_PORTFOLIO;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return accountTabStore.streamPerformanceChart(str, performanceChartType, z, z2);
    }

    private final Flow<AccountPerformance> streamPerformanceChart(String accountNumber, final PerformanceChartType chartType, boolean includeAllHours, boolean isPrivacyEnabled) {
        final Flow<PerformanceChartModel> flowChartQuery = this.performanceChartStore.chartQuery(new PerformanceChartStore.PerformanceChartRequest(accountNumber, chartType.getServerValue(), null, null, false, null, Boolean.valueOf(includeAllHours), isPrivacyEnabled, DisplayCurrency.USD, 48, null));
        return FlowKt.distinctUntilChanged(new Flow<AccountPerformance>() { // from class: com.robinhood.android.redesign.accounttab.store.AccountTabStore$streamPerformanceChart$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.redesign.accounttab.store.AccountTabStore$streamPerformanceChart$$inlined$map$1$2 */
            public static final class C263692<T> implements FlowCollector {
                final /* synthetic */ PerformanceChartType $chartType$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.redesign.accounttab.store.AccountTabStore$streamPerformanceChart$$inlined$map$1$2", m3645f = "AccountTabStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.redesign.accounttab.store.AccountTabStore$streamPerformanceChart$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C263692.this.emit(null, this);
                    }
                }

                public C263692(FlowCollector flowCollector, PerformanceChartType performanceChartType) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$chartType$inlined = performanceChartType;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    BigDecimal amount;
                    BigDecimal decimalValue;
                    Point point;
                    T next;
                    CursorData cursor_data;
                    PriceChartData price_chart_data;
                    Money dollar_value;
                    List<Segment> segments;
                    Segment segment;
                    List<Point> points;
                    PriceChartData price_chart_data2;
                    Money dollar_value2;
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
                        PerformanceChartModel performanceChartModel = (PerformanceChartModel) obj;
                        CursorData defaultDisplay = performanceChartModel.getDefaultDisplay();
                        if (defaultDisplay == null || (price_chart_data2 = defaultDisplay.getPrice_chart_data()) == null || (dollar_value2 = price_chart_data2.getDollar_value()) == null || (amount = dollar_value2.getAmount()) == null) {
                            amount = BigDecimal.ZERO;
                        }
                        if (this.$chartType$inlined != PerformanceChartType.CRYPTO) {
                            com.robinhood.models.util.Money performanceBaseline = performanceChartModel.getPerformanceBaseline();
                            if (performanceBaseline == null || (decimalValue = performanceBaseline.getDecimalValue()) == null) {
                                decimalValue = amount;
                            }
                            Intrinsics.checkNotNull(decimalValue);
                        } else {
                            Iterator<T> it = performanceChartModel.getLines().iterator();
                            while (true) {
                                point = null;
                                if (!it.hasNext()) {
                                    next = (T) null;
                                    break;
                                }
                                next = it.next();
                                if (((Line) next).is_primary()) {
                                    break;
                                }
                            }
                            Line line = next;
                            if (line != null && (segments = line.getSegments()) != null && (segment = (Segment) CollectionsKt.firstOrNull((List) segments)) != null && (points = segment.getPoints()) != null) {
                                point = (Point) CollectionsKt.firstOrNull((List) points);
                            }
                            if (point == null || (cursor_data = point.getCursor_data()) == null || (price_chart_data = cursor_data.getPrice_chart_data()) == null || (dollar_value = price_chart_data.getDollar_value()) == null || (decimalValue = dollar_value.getAmount()) == null) {
                                decimalValue = amount;
                            }
                            Intrinsics.checkNotNull(decimalValue);
                        }
                        Direction pageDirection = performanceChartModel.getPageDirection();
                        Intrinsics.checkNotNull(amount);
                        AccountPerformance accountPerformance = new AccountPerformance(decimalValue, amount, pageDirection);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(accountPerformance, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super AccountPerformance> flowCollector, Continuation continuation) {
                Object objCollect = flowChartQuery.collect(new C263692(flowCollector, chartType), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }

    public final Flow<List<HomeAccountSwitcher.Account>> streamPendingAccounts() {
        final Flow<HomeAccountSwitcher> flowStreamAccountSwitcher = this.homeDashboardStore.streamAccountSwitcher();
        return FlowKt.onStart(new Flow<List<? extends HomeAccountSwitcher.Account>>() { // from class: com.robinhood.android.redesign.accounttab.store.AccountTabStore$streamPendingAccounts$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.redesign.accounttab.store.AccountTabStore$streamPendingAccounts$$inlined$map$1$2 */
            public static final class C263682<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.redesign.accounttab.store.AccountTabStore$streamPendingAccounts$$inlined$map$1$2", m3645f = "AccountTabStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.redesign.accounttab.store.AccountTabStore$streamPendingAccounts$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C263682.this.emit(null, this);
                    }
                }

                public C263682(FlowCollector flowCollector) {
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
                        List<HomeAccountSwitcher.Account> accounts2 = ((HomeAccountSwitcher) obj).getAccounts();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(accounts2, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super List<? extends HomeAccountSwitcher.Account>> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamAccountSwitcher.collect(new C263682(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new C263702(null));
    }

    /* compiled from: AccountTabStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/robinhood/models/home/HomeAccountSwitcher$Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.redesign.accounttab.store.AccountTabStore$streamPendingAccounts$2", m3645f = "AccountTabStore.kt", m3646l = {105}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.redesign.accounttab.store.AccountTabStore$streamPendingAccounts$2 */
    static final class C263702 extends ContinuationImpl7 implements Function2<FlowCollector<? super List<? extends HomeAccountSwitcher.Account>>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C263702(Continuation<? super C263702> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C263702 c263702 = new C263702(continuation);
            c263702.L$0 = obj;
            return c263702;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends HomeAccountSwitcher.Account>> flowCollector, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super List<HomeAccountSwitcher.Account>>) flowCollector, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super List<HomeAccountSwitcher.Account>> flowCollector, Continuation<? super Unit> continuation) {
            return ((C263702) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                List listEmptyList = CollectionsKt.emptyList();
                this.label = 1;
                if (flowCollector.emit(listEmptyList, this) == coroutine_suspended) {
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
