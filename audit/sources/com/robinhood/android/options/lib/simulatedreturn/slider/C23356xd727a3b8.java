package com.robinhood.android.options.lib.simulatedreturn.slider;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderLaunchMode;
import com.robinhood.models.p320db.OptionChain;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.Grouping;
import kotlin.collections.GroupingKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.Combine;
import p479j$.time.Instant;
import p479j$.time.LocalDate;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$3$invokeSuspend$$inlined$flatMapLatest$1", m3645f = "OptionsSimulatedReturnTimeSliderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$3$invokeSuspend$$inlined$flatMapLatest$1 */
/* loaded from: classes11.dex */
public final class C23356xd727a3b8 extends ContinuationImpl7 implements Function3<FlowCollector<? super Map<Long, ? extends Integer>>, OptionsSimulatedReturnSliderLaunchMode.Time.PortfolioRiskAnalyzer, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ OptionsSimulatedReturnTimeSliderDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23356xd727a3b8(Continuation continuation, OptionsSimulatedReturnTimeSliderDuxo optionsSimulatedReturnTimeSliderDuxo) {
        super(3, continuation);
        this.this$0 = optionsSimulatedReturnTimeSliderDuxo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super Map<Long, ? extends Integer>> flowCollector, OptionsSimulatedReturnSliderLaunchMode.Time.PortfolioRiskAnalyzer portfolioRiskAnalyzer, Continuation<? super Unit> continuation) {
        C23356xd727a3b8 c23356xd727a3b8 = new C23356xd727a3b8(continuation, this.this$0);
        c23356xd727a3b8.L$0 = flowCollector;
        c23356xd727a3b8.L$1 = portfolioRiskAnalyzer;
        return c23356xd727a3b8.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Map<OptionChain, List<LocalDate>> chainToExpirationDatesWithDuplicates = ((OptionsSimulatedReturnSliderLaunchMode.Time.PortfolioRiskAnalyzer) this.L$1).getChainToExpirationDatesWithDuplicates();
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(chainToExpirationDatesWithDuplicates.size()));
            Iterator<T> it = chainToExpirationDatesWithDuplicates.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                final List list = (List) entry.getValue();
                linkedHashMap.put(key, GroupingKt.eachCount(new Grouping<LocalDate, LocalDate>() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$3$invokeSuspend$lambda$7$lambda$2$$inlined$groupingBy$1
                    @Override // kotlin.collections.Grouping
                    public Iterator<LocalDate> sourceIterator() {
                        return list.iterator();
                    }

                    @Override // kotlin.collections.Grouping
                    public LocalDate keyOf(LocalDate element) {
                        return element;
                    }
                }));
            }
            List<Tuples2> list2 = MapsKt.toList(linkedHashMap);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (Tuples2 tuples2 : list2) {
                OptionChain optionChain = (OptionChain) tuples2.component1();
                final Map map = (Map) tuples2.component2();
                final Flow<Map<LocalDate, Instant>> flowStreamExpirationTimes = this.this$0.optionMarketHoursStore.streamExpirationTimes(optionChain, CollectionsKt.toList(map.keySet()));
                arrayList.add(new Flow<Map<Long, ? extends Integer>>() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$3$invokeSuspend$lambda$7$lambda$5$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$3$invokeSuspend$lambda$7$lambda$5$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ Map $expDateCount$inlined;
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$3$invokeSuspend$lambda$7$lambda$5$$inlined$map$1$2", m3645f = "OptionsSimulatedReturnTimeSliderDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$3$invokeSuspend$lambda$7$lambda$5$$inlined$map$1$2$1, reason: invalid class name */
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
                            this.$expDateCount$inlined = map;
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
                                List<Tuples2> list = MapsKt.toList((Map) obj);
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                for (Tuples2 tuples2 : list) {
                                    LocalDate localDate = (LocalDate) tuples2.component1();
                                    Long lBoxLong = boxing.boxLong(((Instant) tuples2.component2()).getEpochSecond());
                                    Integer num = (Integer) this.$expDateCount$inlined.get(localDate);
                                    arrayList.add(Tuples4.m3642to(lBoxLong, boxing.boxInt(num != null ? num.intValue() : 0)));
                                }
                                Map map = MapsKt.toMap(arrayList);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(map, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super Map<Long, ? extends Integer>> flowCollector2, Continuation continuation) {
                        Object objCollect = flowStreamExpirationTimes.collect(new AnonymousClass2(flowCollector2, map), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                });
            }
            final Flow[] flowArr = (Flow[]) CollectionsKt.toList(arrayList).toArray(new Flow[0]);
            final Flow<List<? extends Map<Long, ? extends Integer>>> flow = new Flow<List<? extends Map<Long, ? extends Integer>>>() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$3$invokeSuspend$lambda$7$$inlined$combineLatestToList$1

                /* compiled from: Zip.kt */
                @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\n¨\u0006\b"}, m3636d2 = {"<anonymous>", "", "R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2", "com/robinhood/coroutines/flow/OperatorsKt$combineLatestToList$$inlined$combine$1$3"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$3$invokeSuspend$lambda$7$$inlined$combineLatestToList$1$3", m3645f = "OptionsSimulatedReturnTimeSliderDuxo.kt", m3646l = {288}, m3647m = "invokeSuspend")
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$3$invokeSuspend$lambda$7$$inlined$combineLatestToList$1$3, reason: invalid class name */
                public static final class AnonymousClass3 extends ContinuationImpl7 implements Function3<FlowCollector<? super List<? extends Map<Long, ? extends Integer>>>, Map<Long, ? extends Integer>[], Continuation<? super Unit>, Object> {
                    private /* synthetic */ Object L$0;
                    /* synthetic */ Object L$1;
                    int label;

                    public AnonymousClass3(Continuation continuation) {
                        super(3, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(FlowCollector<? super List<? extends Map<Long, ? extends Integer>>> flowCollector, Map<Long, ? extends Integer>[] mapArr, Continuation<? super Unit> continuation) {
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
                            List list = ArraysKt.toList((Object[]) this.L$1);
                            this.label = 1;
                            if (flowCollector.emit(list, this) == coroutine_suspended) {
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

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super List<? extends Map<Long, ? extends Integer>>> flowCollector2, Continuation continuation) {
                    final Flow[] flowArr2 = flowArr;
                    Object objCombineInternal = Combine.combineInternal(flowCollector2, flowArr2, new Function0<Map<Long, ? extends Integer>[]>() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$3$invokeSuspend$lambda$7$$inlined$combineLatestToList$1.2
                        @Override // kotlin.jvm.functions.Function0
                        public final Map<Long, ? extends Integer>[] invoke() {
                            return new Map[flowArr2.length];
                        }
                    }, new AnonymousClass3(null), continuation);
                    return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
                }
            };
            Flow<Map<Long, ? extends Integer>> flow2 = new Flow<Map<Long, ? extends Integer>>() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$3$invokeSuspend$lambda$7$$inlined$map$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$3$invokeSuspend$lambda$7$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$3$invokeSuspend$lambda$7$$inlined$map$1$2", m3645f = "OptionsSimulatedReturnTimeSliderDuxo.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo$onCreate$3$invokeSuspend$lambda$7$$inlined$map$1$2$1, reason: invalid class name */
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

                    public AnonymousClass2(FlowCollector flowCollector) {
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
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            Iterator it = ((List) obj).iterator();
                            while (it.hasNext()) {
                                for (Map.Entry entry : ((Map) it.next()).entrySet()) {
                                    long jLongValue = ((Number) entry.getKey()).longValue();
                                    int iIntValue = ((Number) entry.getValue()).intValue();
                                    Long lBoxLong = boxing.boxLong(jLongValue);
                                    Integer num = (Integer) linkedHashMap.get(boxing.boxLong(jLongValue));
                                    linkedHashMap.put(lBoxLong, boxing.boxInt((num != null ? num.intValue() : 0) + iIntValue));
                                }
                            }
                            Map map = MapsKt.toMap(linkedHashMap);
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(map, anonymousClass1) == coroutine_suspended) {
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
                public Object collect(FlowCollector<? super Map<Long, ? extends Integer>> flowCollector2, Continuation continuation) {
                    Object objCollect = flow.collect(new AnonymousClass2(flowCollector2), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flow2, this) == coroutine_suspended) {
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
