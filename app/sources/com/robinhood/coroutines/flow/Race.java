package com.robinhood.coroutines.flow;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.channels.Channel5;
import kotlinx.coroutines.channels.Channel8;
import kotlinx.coroutines.channels.Produce;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.selects.SelectImplementation;

/* compiled from: Race.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0000\u001aS\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00012\u001e\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0006\"\b\u0012\u0004\u0012\u0002H\u00020\u0001¢\u0006\u0002\u0010\u0007\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\b¨\u0006\t"}, m3636d2 = {"race", "Lkotlinx/coroutines/flow/Flow;", "T", "flow1", "flow2", "flows", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;[Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;", "", "lib-coroutines"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.coroutines.flow.RaceKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class Race {
    public static final <T> Flow<T> race(Flow<? extends T> flow1, Flow<? extends T> flow2, Flow<? extends T>... flows) {
        Intrinsics.checkNotNullParameter(flow1, "flow1");
        Intrinsics.checkNotNullParameter(flow2, "flow2");
        Intrinsics.checkNotNullParameter(flows, "flows");
        List listCreateListBuilder = CollectionsKt.createListBuilder(flows.length + 2);
        listCreateListBuilder.add(flow1);
        listCreateListBuilder.add(flow2);
        CollectionsKt.addAll(listCreateListBuilder, flows);
        return race(CollectionsKt.build(listCreateListBuilder));
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Race.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.coroutines.flow.RaceKt$race$2", m3645f = "Race.kt", m3646l = {43}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.coroutines.flow.RaceKt$race$2 */
    static final class C329762<T> extends ContinuationImpl7 implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Iterable<Flow<T>> $flows;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C329762(Iterable<? extends Flow<? extends T>> iterable, Continuation<? super C329762> continuation) {
            super(2, continuation);
            this.$flows = iterable;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C329762 c329762 = new C329762(this.$flows, continuation);
            c329762.L$0 = obj;
            return c329762;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
            return ((C329762) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: Race.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.coroutines.flow.RaceKt$race$2$1", m3645f = "Race.kt", m3646l = {62, 104, 85, 86}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.coroutines.flow.RaceKt$race$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ FlowCollector<T> $$this$flow;
            final /* synthetic */ Iterable<Flow<T>> $flows;
            int I$0;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Iterable<? extends Flow<? extends T>> iterable, FlowCollector<? super T> flowCollector, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$flows = iterable;
                this.$$this$flow = flowCollector;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$flows, this.$$this$flow, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
            
                if (kotlinx.coroutines.flow.FlowKt.emitAll(r1, r15, r14) == r0) goto L57;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:43:0x00f8  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x0112  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x0138  */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                List arrayList;
                List list;
                int iIntValue;
                Object holder;
                FlowCollector flowCollector;
                Channel8 channel8;
                Object obj2;
                Throwable thM28805exceptionOrNullimpl;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                int i2 = 0;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    Iterable<Flow<T>> iterable = this.$flows;
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                    Iterator<Flow<T>> it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Produce.produce$default(coroutineScope, null, 0, new Race3(it.next(), null), 3, null));
                    }
                    if (arrayList.isEmpty()) {
                        return Unit.INSTANCE;
                    }
                    Channel8 channel82 = (Channel8) CollectionsKt.singleOrNull(arrayList);
                    if (channel82 == null) {
                        SelectImplementation selectImplementation = new SelectImplementation(getContext());
                        int i3 = 0;
                        for (T t : arrayList) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            selectImplementation.invoke(((Channel8) t).getOnReceiveCatching(), new Race2(i3, null));
                            i3 = i4;
                        }
                        this.L$0 = arrayList;
                        this.label = 2;
                        obj = selectImplementation.doSelect(this);
                        if (obj != coroutine_suspended) {
                            list = arrayList;
                            Tuples2 tuples2 = (Tuples2) obj;
                            iIntValue = ((Number) tuples2.component1()).intValue();
                            holder = ((Channel5) tuples2.component2()).getHolder();
                            while (r8.hasNext()) {
                            }
                            FlowCollector<T> flowCollector2 = this.$$this$flow;
                            if (!(holder instanceof Channel5.Failed)) {
                            }
                        }
                    } else {
                        FlowCollector<T> flowCollector3 = this.$$this$flow;
                        this.label = 1;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i == 2) {
                    arrayList = (List) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    list = arrayList;
                    Tuples2 tuples22 = (Tuples2) obj;
                    iIntValue = ((Number) tuples22.component1()).intValue();
                    holder = ((Channel5) tuples22.component2()).getHolder();
                    for (T t2 : list) {
                        int i5 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        Channel8 channel83 = (Channel8) t2;
                        if (i2 != iIntValue) {
                            Channel8.DefaultImpls.cancel$default(channel83, null, 1, null);
                        }
                        i2 = i5;
                    }
                    FlowCollector<T> flowCollector22 = this.$$this$flow;
                    if (!(holder instanceof Channel5.Failed)) {
                        this.L$0 = list;
                        this.L$1 = holder;
                        this.L$2 = flowCollector22;
                        this.I$0 = iIntValue;
                        this.label = 3;
                        Object objEmit = flowCollector22.emit(holder, this);
                        flowCollector = flowCollector22;
                        if (objEmit != coroutine_suspended) {
                            channel8 = (Channel8) list.get(iIntValue);
                            this.L$0 = holder;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 4;
                            if (FlowKt.emitAll(flowCollector, channel8, this) != coroutine_suspended) {
                            }
                        }
                        return coroutine_suspended;
                    }
                } else {
                    if (i == 3) {
                        iIntValue = this.I$0;
                        FlowCollector flowCollector4 = (FlowCollector<T>) ((FlowCollector) this.L$2);
                        Object obj3 = this.L$1;
                        list = (List) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        holder = obj3;
                        flowCollector = flowCollector4;
                        channel8 = (Channel8) list.get(iIntValue);
                        this.L$0 = holder;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 4;
                        if (FlowKt.emitAll(flowCollector, channel8, this) != coroutine_suspended) {
                            obj2 = holder;
                            holder = obj2;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.L$0;
                    ResultKt.throwOnFailure(obj);
                    holder = obj2;
                }
                if ((holder instanceof Channel5.Failed) && (thM28805exceptionOrNullimpl = Channel5.m28805exceptionOrNullimpl(holder)) != null) {
                    throw thM28805exceptionOrNullimpl;
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$flows, (FlowCollector) this.L$0, null);
                this.label = 1;
                if (CoroutineScope2.coroutineScope(anonymousClass1, this) == coroutine_suspended) {
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

    public static final <T> Flow<T> race(Iterable<? extends Flow<? extends T>> flows) {
        Intrinsics.checkNotNullParameter(flows, "flows");
        return FlowKt.flow(new C329762(flows, null));
    }
}
