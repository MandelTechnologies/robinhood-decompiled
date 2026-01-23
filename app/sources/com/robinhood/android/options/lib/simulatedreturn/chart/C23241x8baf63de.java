package com.robinhood.android.options.lib.simulatedreturn.chart;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.p320db.OptionChain;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.Combine;
import kotlinx.datetime.Instant;
import p479j$.time.LocalDate;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartDuxo$onCreate$9$invokeSuspend$$inlined$flatMapLatest$1", m3645f = "OptionsSimulatedReturnChartDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartDuxo$onCreate$9$invokeSuspend$$inlined$flatMapLatest$1 */
/* loaded from: classes11.dex */
public final class C23241x8baf63de extends ContinuationImpl7 implements Function3<FlowCollector<? super Map<UUID, ? extends Instant>>, List<? extends Tuples2<? extends OptionChain, ? extends Map<UUID, ? extends LocalDate>>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ OptionsSimulatedReturnChartDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23241x8baf63de(Continuation continuation, OptionsSimulatedReturnChartDuxo optionsSimulatedReturnChartDuxo) {
        super(3, continuation);
        this.this$0 = optionsSimulatedReturnChartDuxo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super Map<UUID, ? extends Instant>> flowCollector, List<? extends Tuples2<? extends OptionChain, ? extends Map<UUID, ? extends LocalDate>>> list, Continuation<? super Unit> continuation) {
        C23241x8baf63de c23241x8baf63de = new C23241x8baf63de(continuation, this.this$0);
        c23241x8baf63de.L$0 = flowCollector;
        c23241x8baf63de.L$1 = list;
        return c23241x8baf63de.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            List<Tuples2> list = (List) this.L$1;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (Tuples2 tuples2 : list) {
                OptionChain optionChain = (OptionChain) tuples2.component1();
                final Map map = (Map) tuples2.component2();
                final Flow<Map<LocalDate, p479j$.time.Instant>> flowStreamExpirationTimes = this.this$0.optionMarketHoursStore.streamExpirationTimes(optionChain, CollectionsKt.toList(map.values()));
                arrayList.add(new Flow<Map<UUID, ? extends Instant>>() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartDuxo$onCreate$9$invokeSuspend$lambda$6$lambda$3$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Map<UUID, ? extends Instant>> flowCollector2, Continuation continuation) {
                        Object objCollect = flowStreamExpirationTimes.collect(new AnonymousClass2(flowCollector2, map), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartDuxo$onCreate$9$invokeSuspend$lambda$6$lambda$3$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ Map $expirationDates$inlined;
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartDuxo$onCreate$9$invokeSuspend$lambda$6$lambda$3$$inlined$map$1$2", m3645f = "OptionsSimulatedReturnChartDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartDuxo$onCreate$9$invokeSuspend$lambda$6$lambda$3$$inlined$map$1$2$1, reason: invalid class name */
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

                        public AnonymousClass2(FlowCollector flowCollector, Map map) {
                            this.$this_unsafeFlow = flowCollector;
                            this.$expirationDates$inlined = map;
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
                                Map map = (Map) obj;
                                Map map2 = this.$expirationDates$inlined;
                                LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map2.size()));
                                for (Map.Entry entry : map2.entrySet()) {
                                    Object key = entry.getKey();
                                    p479j$.time.Instant instant = (p479j$.time.Instant) map.get(entry.getValue());
                                    Instant instant2 = null;
                                    if (instant != null) {
                                        Instant.Companion companion = Instant.INSTANCE;
                                        String string2 = instant.toString();
                                        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                        instant2 = Instant.Companion.parse$default(companion, string2, null, 2, null);
                                    }
                                    linkedHashMap.put(key, instant2);
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(linkedHashMap, anonymousClass1) == coroutine_suspended) {
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
            }
            final Flow[] flowArr = (Flow[]) CollectionsKt.toList(arrayList).toArray(new Flow[0]);
            Flow<Map<UUID, ? extends Instant>> flow = new Flow<Map<UUID, ? extends Instant>>() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartDuxo$onCreate$9$invokeSuspend$lambda$6$$inlined$combine$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Map<UUID, ? extends Instant>> flowCollector2, Continuation continuation) {
                    final Flow[] flowArr2 = flowArr;
                    Object objCombineInternal = Combine.combineInternal(flowCollector2, flowArr2, new Function0<Map<UUID, ? extends Instant>[]>() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartDuxo$onCreate$9$invokeSuspend$lambda$6$$inlined$combine$1.2
                        @Override // kotlin.jvm.functions.Function0
                        public final Map<UUID, ? extends Instant>[] invoke() {
                            return new Map[flowArr2.length];
                        }
                    }, new AnonymousClass3(null), continuation);
                    return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
                }

                /* compiled from: Zip.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
                @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartDuxo$onCreate$9$invokeSuspend$lambda$6$$inlined$combine$1$3", m3645f = "OptionsSimulatedReturnChartDuxo.kt", m3646l = {288}, m3647m = "invokeSuspend")
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartDuxo$onCreate$9$invokeSuspend$lambda$6$$inlined$combine$1$3, reason: invalid class name */
                public static final class AnonymousClass3 extends ContinuationImpl7 implements Function3<FlowCollector<? super Map<UUID, ? extends Instant>>, Map<UUID, ? extends Instant>[], Continuation<? super Unit>, Object> {
                    private /* synthetic */ Object L$0;
                    /* synthetic */ Object L$1;
                    int label;

                    public AnonymousClass3(Continuation continuation) {
                        super(3, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(FlowCollector<? super Map<UUID, ? extends Instant>> flowCollector, Map<UUID, ? extends Instant>[] mapArr, Continuation<? super Unit> continuation) {
                        AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                        anonymousClass3.L$0 = flowCollector;
                        anonymousClass3.L$1 = mapArr;
                        return anonymousClass3.invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            FlowCollector flowCollector = (FlowCollector) this.L$0;
                            Map[] mapArr = (Map[]) ((Object[]) this.L$1);
                            if (mapArr.length == 0) {
                                throw new UnsupportedOperationException("Empty array can't be reduced.");
                            }
                            Map mapPlus = mapArr[0];
                            int lastIndex = ArraysKt.getLastIndex(mapArr);
                            if (1 <= lastIndex) {
                                int i2 = 1;
                                while (true) {
                                    mapPlus = MapsKt.plus(mapPlus, mapArr[i2]);
                                    if (i2 == lastIndex) {
                                        break;
                                    }
                                    i2++;
                                }
                            }
                            this.label = 1;
                            if (flowCollector.emit(mapPlus, this) == coroutine_suspended) {
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
