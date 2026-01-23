package com.robinhood.android.redesigninvesting.investingmonitor.p232ui.main;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.data.CuratedListEligibleItemsFetcher;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.models.p355ui.CuratedListEligible;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.Combine;
import kotlinx.coroutines.rx2.RxConvert;
import timber.log.Timber;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$streamCuratedLists$$inlined$flatMapLatest$1", m3645f = "InvestingMonitorDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class InvestingMonitorDuxo$streamCuratedLists$$inlined$flatMapLatest$1 extends ContinuationImpl7 implements Function3<FlowCollector<? super List<? extends Tuples2<? extends CuratedList, ? extends List<? extends CuratedListEligible>>>>, List<? extends CuratedList>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ InvestingMonitorDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingMonitorDuxo$streamCuratedLists$$inlined$flatMapLatest$1(Continuation continuation, InvestingMonitorDuxo investingMonitorDuxo) {
        super(3, continuation);
        this.this$0 = investingMonitorDuxo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super List<? extends Tuples2<? extends CuratedList, ? extends List<? extends CuratedListEligible>>>> flowCollector, List<? extends CuratedList> list, Continuation<? super Unit> continuation) {
        InvestingMonitorDuxo$streamCuratedLists$$inlined$flatMapLatest$1 investingMonitorDuxo$streamCuratedLists$$inlined$flatMapLatest$1 = new InvestingMonitorDuxo$streamCuratedLists$$inlined$flatMapLatest$1(continuation, this.this$0);
        investingMonitorDuxo$streamCuratedLists$$inlined$flatMapLatest$1.L$0 = flowCollector;
        investingMonitorDuxo$streamCuratedLists$$inlined$flatMapLatest$1.L$1 = list;
        return investingMonitorDuxo$streamCuratedLists$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Flow<Tuples2<? extends CuratedList, ? extends List<? extends CuratedListEligible>>> flowFlowOf;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            List list = (List) this.L$1;
            Timber.Companion companion = Timber.INSTANCE;
            List<CuratedList> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((CuratedList) it.next()).getDisplayName());
            }
            companion.mo3350d("Collected curatedLists: " + arrayList, new Object[0]);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (final CuratedList curatedList : list2) {
                if (curatedList.getItemCount() > 0) {
                    final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(CuratedListEligibleItemsFetcher.streamCuratedListEligibleItems$default(this.this$0.curatedListEligibleItemsFetcher, curatedList.getId(), null, false, 6, null)), Integer.MAX_VALUE, null, 2, null);
                    flowFlowOf = new Flow<Tuples2<? extends CuratedList, ? extends List<? extends CuratedListEligible>>>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$streamCuratedLists$lambda$8$lambda$6$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Tuples2<? extends CuratedList, ? extends List<? extends CuratedListEligible>>> flowCollector2, Continuation continuation) {
                            Object objCollect = flowBuffer$default.collect(new AnonymousClass2(flowCollector2, curatedList), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$streamCuratedLists$lambda$8$lambda$6$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ CuratedList $curatedList$inlined;
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$streamCuratedLists$lambda$8$lambda$6$$inlined$map$1$2", m3645f = "InvestingMonitorDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$streamCuratedLists$lambda$8$lambda$6$$inlined$map$1$2$1, reason: invalid class name */
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

                            public AnonymousClass2(FlowCollector flowCollector, CuratedList curatedList) {
                                this.$this_unsafeFlow = flowCollector;
                                this.$curatedList$inlined = curatedList;
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
                                    Tuples2 tuples2M3642to = Tuples4.m3642to(this.$curatedList$inlined, (List) obj);
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
                } else {
                    flowFlowOf = FlowKt.flowOf(Tuples4.m3642to(curatedList, CollectionsKt.emptyList()));
                }
                arrayList2.add(flowFlowOf);
            }
            final Flow[] flowArr = (Flow[]) CollectionsKt.toList(arrayList2).toArray(new Flow[0]);
            Flow<List<? extends Tuples2<? extends CuratedList, ? extends List<? extends CuratedListEligible>>>> flow = new Flow<List<? extends Tuples2<? extends CuratedList, ? extends List<? extends CuratedListEligible>>>>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$streamCuratedLists$lambda$8$$inlined$combine$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super List<? extends Tuples2<? extends CuratedList, ? extends List<? extends CuratedListEligible>>>> flowCollector2, Continuation continuation) {
                    final Flow[] flowArr2 = flowArr;
                    Object objCombineInternal = Combine.combineInternal(flowCollector2, flowArr2, new Function0<Tuples2<? extends CuratedList, ? extends List<? extends CuratedListEligible>>[]>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$streamCuratedLists$lambda$8$$inlined$combine$1.2
                        @Override // kotlin.jvm.functions.Function0
                        public final Tuples2<? extends CuratedList, ? extends List<? extends CuratedListEligible>>[] invoke() {
                            return new Tuples2[flowArr2.length];
                        }
                    }, new AnonymousClass3(null), continuation);
                    return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
                }

                /* compiled from: Zip.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
                @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$streamCuratedLists$lambda$8$$inlined$combine$1$3", m3645f = "InvestingMonitorDuxo.kt", m3646l = {288}, m3647m = "invokeSuspend")
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$streamCuratedLists$lambda$8$$inlined$combine$1$3, reason: invalid class name */
                public static final class AnonymousClass3 extends ContinuationImpl7 implements Function3<FlowCollector<? super List<? extends Tuples2<? extends CuratedList, ? extends List<? extends CuratedListEligible>>>>, Tuples2<? extends CuratedList, ? extends List<? extends CuratedListEligible>>[], Continuation<? super Unit>, Object> {
                    private /* synthetic */ Object L$0;
                    /* synthetic */ Object L$1;
                    int label;

                    public AnonymousClass3(Continuation continuation) {
                        super(3, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(FlowCollector<? super List<? extends Tuples2<? extends CuratedList, ? extends List<? extends CuratedListEligible>>>> flowCollector, Tuples2<? extends CuratedList, ? extends List<? extends CuratedListEligible>>[] tuples2Arr, Continuation<? super Unit> continuation) {
                        AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                        anonymousClass3.L$0 = flowCollector;
                        anonymousClass3.L$1 = tuples2Arr;
                        return anonymousClass3.invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            FlowCollector flowCollector = (FlowCollector) this.L$0;
                            List list = ArraysKt.toList((Tuples2[]) ((Object[]) this.L$1));
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
