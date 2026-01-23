package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.models.portfolio.PerformanceChartModel;
import com.robinhood.android.models.portfolio.api.PerformanceChartType;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.models.serverdriven.experimental.api.PriceChartData;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.shared.i18n.models.currency.DisplayCurrency;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore$streamAccountMarketValuesAndDirection$$inlined$flatMapLatest$1", m3645f = "PerformanceChartStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore$streamAccountMarketValuesAndDirection$$inlined$flatMapLatest$1 */
/* loaded from: classes13.dex */
public final class C34672x71b39ffc extends ContinuationImpl7 implements Function3<FlowCollector<? super Tuples2<? extends Money, ? extends Direction>>, Map<String, ? extends PerformanceChartStore.PerformanceChartRequest>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $accountNumber$inlined;
    final /* synthetic */ PerformanceChartType $chartType$inlined;
    final /* synthetic */ DisplayCurrency $displayCurrency$inlined;
    final /* synthetic */ String $key$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ PerformanceChartStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34672x71b39ffc(Continuation continuation, String str, PerformanceChartStore performanceChartStore, String str2, DisplayCurrency displayCurrency, PerformanceChartType performanceChartType) {
        super(3, continuation);
        this.$key$inlined = str;
        this.this$0 = performanceChartStore;
        this.$accountNumber$inlined = str2;
        this.$displayCurrency$inlined = displayCurrency;
        this.$chartType$inlined = performanceChartType;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super Tuples2<? extends Money, ? extends Direction>> flowCollector, Map<String, ? extends PerformanceChartStore.PerformanceChartRequest> map, Continuation<? super Unit> continuation) {
        C34672x71b39ffc c34672x71b39ffc = new C34672x71b39ffc(continuation, this.$key$inlined, this.this$0, this.$accountNumber$inlined, this.$displayCurrency$inlined, this.$chartType$inlined);
        c34672x71b39ffc.L$0 = flowCollector;
        c34672x71b39ffc.L$1 = map;
        return c34672x71b39ffc.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Flow<Tuples2<? extends Money, ? extends Direction>> flowCombine;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            PerformanceChartStore.PerformanceChartRequest performanceChartRequest = (PerformanceChartStore.PerformanceChartRequest) ((Map) this.L$1).get(this.$key$inlined);
            if (performanceChartRequest == null) {
                Flow flowAsFlow = this.this$0.accountMarketValuesLiveQuery.asFlow(new PerformanceChartStore.AccountMarketValuesLiveRequest(this.$accountNumber$inlined, this.$displayCurrency$inlined));
                Map map = this.this$0.directionMap;
                Object objMutableStateFlow = map.get(this.$key$inlined);
                if (objMutableStateFlow == null) {
                    objMutableStateFlow = StateFlow4.MutableStateFlow(null);
                    map.put(this.$key$inlined, objMutableStateFlow);
                }
                flowCombine = FlowKt.combine(flowAsFlow, (Flow) objMutableStateFlow, new PerformanceChartStore8(this.$chartType$inlined, null));
            } else {
                final Flow flowAsFlow2 = this.this$0.internalChartQuery.asFlow(performanceChartRequest);
                final DisplayCurrency displayCurrency = this.$displayCurrency$inlined;
                flowCombine = new Flow<Tuples2<? extends Money, ? extends Direction>>() { // from class: com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore$streamAccountMarketValuesAndDirection$lambda$6$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Tuples2<? extends Money, ? extends Direction>> flowCollector2, Continuation continuation) {
                        Object objCollect = flowAsFlow2.collect(new AnonymousClass2(flowCollector2, displayCurrency), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore$streamAccountMarketValuesAndDirection$lambda$6$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ DisplayCurrency $displayCurrency$inlined;
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore$streamAccountMarketValuesAndDirection$lambda$6$$inlined$map$1$2", m3645f = "PerformanceChartStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore$streamAccountMarketValuesAndDirection$lambda$6$$inlined$map$1$2$1, reason: invalid class name */
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
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector, DisplayCurrency displayCurrency) {
                            this.$this_unsafeFlow = flowCollector;
                            this.$displayCurrency$inlined = displayCurrency;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            Money money;
                            PriceChartData price_chart_data;
                            com.robinhood.models.serverdriven.experimental.api.Money dollar_value;
                            BigDecimal amount;
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
                                if (defaultDisplay == null || (price_chart_data = defaultDisplay.getPrice_chart_data()) == null || (dollar_value = price_chart_data.getDollar_value()) == null || (amount = dollar_value.getAmount()) == null) {
                                    money = null;
                                } else {
                                    Currency currency = Currency.getInstance(this.$displayCurrency$inlined.getServerValue());
                                    Intrinsics.checkNotNullExpressionValue(currency, "getInstance(...)");
                                    money = Money3.toMoney(amount, currency);
                                }
                                Tuples2 tuples2M3642to = Tuples4.m3642to(money, performanceChartModel.getPageDirection());
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(tuples2M3642to, anonymousClass1) == coroutine_suspended) {
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
            }
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowCombine, this) == coroutine_suspended) {
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
