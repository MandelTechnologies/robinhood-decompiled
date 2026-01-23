package com.robinhood.android.futures.charts;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.futures.charts.FuturesChartsClientServiceImp;
import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.futures.charts.contracts.models.FuturesQuote;
import com.robinhood.store.event.EventMarketdataStore;
import com.robinhood.store.futures.marketdata.MarketdataPollLocation;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
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

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.futures.charts.FuturesChartsClientServiceImp$streamEventContractLastTradePrices$$inlined$flatMapLatest$1", m3645f = "FuturesChartsClientServiceImp.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.charts.FuturesChartsClientServiceImp$streamEventContractLastTradePrices$$inlined$flatMapLatest$1 */
/* loaded from: classes3.dex */
public final class C17007x745950b5 extends ContinuationImpl7 implements Function3<FlowCollector<? super List<? extends FuturesQuote>>, Map<UUID, ? extends EventContract>, Continuation<? super Unit>, Object> {
    final /* synthetic */ List $contractIds$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ FuturesChartsClientServiceImp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17007x745950b5(Continuation continuation, FuturesChartsClientServiceImp futuresChartsClientServiceImp, List list) {
        super(3, continuation);
        this.this$0 = futuresChartsClientServiceImp;
        this.$contractIds$inlined = list;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super List<? extends FuturesQuote>> flowCollector, Map<UUID, ? extends EventContract> map, Continuation<? super Unit> continuation) {
        C17007x745950b5 c17007x745950b5 = new C17007x745950b5(continuation, this.this$0, this.$contractIds$inlined);
        c17007x745950b5.L$0 = flowCollector;
        c17007x745950b5.L$1 = map;
        return c17007x745950b5.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            final Map map = (Map) this.L$1;
            final Flow flowStreamQuotes$default = EventMarketdataStore.streamQuotes$default(this.this$0.eventMarketdataStore, this.$contractIds$inlined, MarketdataPollLocation.EDP, null, 4, null);
            final List list = this.$contractIds$inlined;
            Flow<List<? extends FuturesQuote>> flow = new Flow<List<? extends FuturesQuote>>() { // from class: com.robinhood.android.futures.charts.FuturesChartsClientServiceImp$streamEventContractLastTradePrices$lambda$16$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super List<? extends FuturesQuote>> flowCollector2, Continuation continuation) {
                    Object objCollect = flowStreamQuotes$default.collect(new AnonymousClass2(flowCollector2, list, map), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.futures.charts.FuturesChartsClientServiceImp$streamEventContractLastTradePrices$lambda$16$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ List $contractIds$inlined;
                    final /* synthetic */ Map $contractsMap$inlined;
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.futures.charts.FuturesChartsClientServiceImp$streamEventContractLastTradePrices$lambda$16$$inlined$map$1$2", m3645f = "FuturesChartsClientServiceImp.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.futures.charts.FuturesChartsClientServiceImp$streamEventContractLastTradePrices$lambda$16$$inlined$map$1$2$1, reason: invalid class name */
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

                    public AnonymousClass2(FlowCollector flowCollector, List list, Map map) {
                        this.$this_unsafeFlow = flowCollector;
                        this.$contractIds$inlined = list;
                        this.$contractsMap$inlined = map;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        EventQuote eventQuote;
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
                            Map map = (Map) obj;
                            List<UUID> list = this.$contractIds$inlined;
                            ArrayList arrayList = new ArrayList();
                            for (UUID uuid : list) {
                                EventContract eventContract = (EventContract) this.$contractsMap$inlined.get(uuid);
                                FuturesQuote futuresQuote = null;
                                if (eventContract != null && (eventQuote = (EventQuote) map.get(uuid)) != null) {
                                    int i3 = FuturesChartsClientServiceImp.WhenMappings.$EnumSwitchMapping$0[eventContract.getExchangeSource().ordinal()];
                                    if (i3 != 1 && i3 != 2 && i3 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    BigDecimal lastTradePrice = eventQuote.getLastTradePrice();
                                    if (lastTradePrice != null) {
                                        String string2 = uuid.toString();
                                        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                        futuresQuote = new FuturesQuote(string2, lastTradePrice.doubleValue());
                                    }
                                }
                                if (futuresQuote != null) {
                                    arrayList.add(futuresQuote);
                                }
                            }
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
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
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flow, this) == coroutine_suspended) {
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
