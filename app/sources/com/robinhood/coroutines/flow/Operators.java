package com.robinhood.coroutines.flow;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Timeout4;
import kotlinx.coroutines.Timeout6;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Operators.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aH\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0005\"\b\b\u0001\u0010\u0004*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0001\u001a1\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\t0\u0001\"\n\b\u0000\u0010\n\u0018\u0001*\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\u00010\u000bH\u0086\b\u001a*\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\t0\u0001\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00012\u0006\u0010\r\u001a\u00020\u000e\u001a>\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\t0\u0001\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u000e0\u0011\u001a:\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\n0\u0001\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\n0\u0001\u001a(\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\u00170\u0001\"\b\b\u0000\u0010\n*\u00020\u0005*\n\u0012\u0006\u0012\u0004\u0018\u0001H\n0\u0001\u001a\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\n0\u0001\"\u0004\b\u0000\u0010\n*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\u000b0\u0001\u001a$\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\n0\u0001\"\u0004\b\u0000\u0010\n*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\u000b0\u0001\u001a3\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\n0\u0001\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u0002H\n¢\u0006\u0004\b\u001e\u0010\u001f\u001aO\u0010 \u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010!\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u0002H\n2'\u0010\"\u001a#\b\u0001\u0012\u0004\u0012\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0%\u0012\u0006\u0012\u0004\u0018\u00010\u00050#¢\u0006\u0002\b&H\u0086@¢\u0006\u0004\b'\u0010(¨\u0006)"}, m3636d2 = {"combine", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Pair;", "T1", "T2", "", "flow1", "flow2", "combineLatestToList", "", "T", "", "chunked", "size", "", "maxWeightPerBatch", "weight", "Lkotlin/Function1;", "connectWhen", "other", "", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "toOptionals", "Lcom/robinhood/utils/Optional;", "mapFirstItem", "mapFirstItemOrNull", "timeoutWithDefault", "timeout", "Lkotlin/time/Duration;", "defaultValue", "timeoutWithDefault-8Mi8wO0", "(Lkotlinx/coroutines/flow/Flow;JLjava/lang/Object;)Lkotlinx/coroutines/flow/Flow;", "withTimeoutWithDefault", "duration", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "withTimeoutWithDefault-rnQQ1Ag", "(JLjava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-coroutines"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.coroutines.flow.OperatorsKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class Operators {

    /* JADX INFO: Add missing generic type declarations: [T1, T2] */
    /* compiled from: Operators.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u00022\u0006\u0010\u0006\u001a\u0002H\u0003H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "T1", "T2", "", "res1", "res2"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.coroutines.flow.OperatorsKt$combine$1", m3645f = "Operators.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.coroutines.flow.OperatorsKt$combine$1 */
    static final class C329741<T1, T2> extends ContinuationImpl7 implements Function3<T1, T2, Continuation<? super Tuples2<? extends T1, ? extends T2>>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        C329741(Continuation<? super C329741> continuation) {
            super(3, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((C329741<T1, T2>) obj, obj2, (Continuation<? super Tuples2<? extends C329741<T1, T2>, ? extends Object>>) obj3);
        }

        public final Object invoke(T1 t1, T2 t2, Continuation<? super Tuples2<? extends T1, ? extends T2>> continuation) {
            C329741 c329741 = new C329741(continuation);
            c329741.L$0 = t1;
            c329741.L$1 = t2;
            return c329741.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Tuples4.m3642to(this.L$0, this.L$1);
        }
    }

    public static final <T1, T2> Flow<Tuples2<T1, T2>> combine(Flow<? extends T1> flow1, Flow<? extends T2> flow2) {
        Intrinsics.checkNotNullParameter(flow1, "flow1");
        Intrinsics.checkNotNullParameter(flow2, "flow2");
        return FlowKt.combine(flow1, flow2, new C329741(null));
    }

    public static final <T> Flow<T> mapFirstItem(Flow<? extends Iterable<? extends T>> flow) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        return FlowKt.flow(new OperatorsKt$mapFirstItem$$inlined$transform$1(flow, null));
    }

    public static final <T> Flow<T> mapFirstItemOrNull(Flow<? extends Iterable<? extends T>> flow) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        return FlowKt.flow(new OperatorsKt$mapFirstItemOrNull$$inlined$transform$1(flow, null));
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Operators.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.coroutines.flow.OperatorsKt$chunked$2", m3645f = "Operators.kt", m3646l = {43, 51}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.coroutines.flow.OperatorsKt$chunked$2 */
    static final class C329722<T> extends ContinuationImpl7 implements Function2<FlowCollector<? super List<? extends T>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $size;
        final /* synthetic */ Flow<T> $this_chunked;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C329722(int i, Flow<? extends T> flow, Continuation<? super C329722> continuation) {
            super(2, continuation);
            this.$size = i;
            this.$this_chunked = flow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C329722 c329722 = new C329722(this.$size, this.$this_chunked, continuation);
            c329722.L$0 = obj;
            return c329722;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super List<? extends T>> flowCollector, Continuation<? super Unit> continuation) {
            return ((C329722) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
        
            if (r3.emit(r1, r7) == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            FlowCollector flowCollector;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                arrayList = new ArrayList(this.$size);
                Flow<T> flow = this.$this_chunked;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(arrayList, this.$size, flowCollector2);
                this.L$0 = flowCollector2;
                this.L$1 = arrayList;
                this.label = 1;
                if (flow.collect(anonymousClass1, this) != coroutine_suspended) {
                    flowCollector = flowCollector2;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            arrayList = (ArrayList) this.L$1;
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            if (!arrayList.isEmpty()) {
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
            }
            return Unit.INSTANCE;
        }

        /* compiled from: Operators.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.coroutines.flow.OperatorsKt$chunked$2$1, reason: invalid class name */
        static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ FlowCollector<List<? extends T>> $$this$flow;
            final /* synthetic */ ArrayList<T> $buffer;
            final /* synthetic */ int $size;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(ArrayList<T> arrayList, int i, FlowCollector<? super List<? extends T>> flowCollector) {
                this.$buffer = arrayList;
                this.$size = i;
                this.$$this$flow = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(T t, Continuation<? super Unit> continuation) {
                Operators2 operators2;
                if (continuation instanceof Operators2) {
                    operators2 = (Operators2) continuation;
                    int i = operators2.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        operators2.label = i - Integer.MIN_VALUE;
                    } else {
                        operators2 = new Operators2(this, continuation);
                    }
                }
                Object obj = operators2.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = operators2.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.$buffer.add(t);
                    if (this.$buffer.size() == this.$size) {
                        FlowCollector<List<? extends T>> flowCollector = this.$$this$flow;
                        List<? extends T> list = CollectionsKt.toList(this.$buffer);
                        operators2.label = 1;
                        if (flowCollector.emit(list, operators2) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$buffer.clear();
                return Unit.INSTANCE;
            }
        }
    }

    public static final <T> Flow<List<T>> chunked(Flow<? extends T> flow, int i) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        if (i <= 0) {
            throw new IllegalArgumentException(("Size must be > 0: " + i).toString());
        }
        return FlowKt.flow(new C329722(i, flow, null));
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Operators.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.coroutines.flow.OperatorsKt$chunked$4", m3645f = "Operators.kt", m3646l = {64, 76}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.coroutines.flow.OperatorsKt$chunked$4 */
    static final class C329734<T> extends ContinuationImpl7 implements Function2<FlowCollector<? super List<? extends T>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $maxWeightPerBatch;
        final /* synthetic */ Flow<T> $this_chunked;
        final /* synthetic */ Function1<T, Integer> $weight;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C329734(Flow<? extends T> flow, Function1<? super T, Integer> function1, int i, Continuation<? super C329734> continuation) {
            super(2, continuation);
            this.$this_chunked = flow;
            this.$weight = function1;
            this.$maxWeightPerBatch = i;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C329734 c329734 = new C329734(this.$this_chunked, this.$weight, this.$maxWeightPerBatch, continuation);
            c329734.L$0 = obj;
            return c329734;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super List<? extends T>> flowCollector, Continuation<? super Unit> continuation) {
            return ((C329734) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
        
            if (r3.emit(r1, r10) == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            ArrayList arrayList;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                ArrayList arrayList2 = new ArrayList();
                Ref.IntRef intRef = new Ref.IntRef();
                Flow<T> flow = this.$this_chunked;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$weight, intRef, this.$maxWeightPerBatch, flowCollector2, arrayList2);
                this.L$0 = flowCollector2;
                this.L$1 = arrayList2;
                this.label = 1;
                if (flow.collect(anonymousClass1, this) != coroutine_suspended) {
                    flowCollector = flowCollector2;
                    arrayList = arrayList2;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            arrayList = (ArrayList) this.L$1;
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            if (!arrayList.isEmpty()) {
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
            }
            return Unit.INSTANCE;
        }

        /* compiled from: Operators.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.coroutines.flow.OperatorsKt$chunked$4$1, reason: invalid class name */
        static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ FlowCollector<List<? extends T>> $$this$flow;
            final /* synthetic */ ArrayList<T> $buffer;
            final /* synthetic */ Ref.IntRef $bufferWeight;
            final /* synthetic */ int $maxWeightPerBatch;
            final /* synthetic */ Function1<T, Integer> $weight;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Function1<? super T, Integer> function1, Ref.IntRef intRef, int i, FlowCollector<? super List<? extends T>> flowCollector, ArrayList<T> arrayList) {
                this.$weight = function1;
                this.$bufferWeight = intRef;
                this.$maxWeightPerBatch = i;
                this.$$this$flow = flowCollector;
                this.$buffer = arrayList;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(T t, Continuation<? super Unit> continuation) {
                Operators3 operators3;
                int iIntValue;
                if (continuation instanceof Operators3) {
                    operators3 = (Operators3) continuation;
                    int i = operators3.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        operators3.label = i - Integer.MIN_VALUE;
                    } else {
                        operators3 = new Operators3(this, continuation);
                    }
                }
                Object obj = operators3.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = operators3.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    iIntValue = this.$weight.invoke(t).intValue();
                    if (this.$bufferWeight.element + iIntValue > this.$maxWeightPerBatch) {
                        FlowCollector<List<? extends T>> flowCollector = this.$$this$flow;
                        ArrayList<T> arrayList = this.$buffer;
                        operators3.L$0 = t;
                        operators3.I$0 = iIntValue;
                        operators3.label = 1;
                        if (flowCollector.emit(arrayList, operators3) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    this.$buffer.add(t);
                    this.$bufferWeight.element += iIntValue;
                    return Unit.INSTANCE;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i3 = operators3.I$0;
                Object obj2 = operators3.L$0;
                ResultKt.throwOnFailure(obj);
                iIntValue = i3;
                t = obj2;
                this.$buffer.clear();
                this.$bufferWeight.element = 0;
                this.$buffer.add(t);
                this.$bufferWeight.element += iIntValue;
                return Unit.INSTANCE;
            }
        }
    }

    public static final <T> Flow<List<T>> chunked(Flow<? extends T> flow, int i, Function1<? super T, Integer> weight) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(weight, "weight");
        if (i <= 0) {
            throw new IllegalArgumentException(("Size must be > 0: " + i).toString());
        }
        return FlowKt.flow(new C329734(flow, weight, i, null));
    }

    public static /* synthetic */ Flow connectWhen$default(Flow flow, Flow flow2, Flow flow3, int i, Object obj) {
        if ((i & 2) != 0) {
            flow3 = FlowKt.emptyFlow();
        }
        return connectWhen(flow, flow2, flow3);
    }

    public static final <T> Flow<T> connectWhen(Flow<? extends T> flow, Flow<Boolean> other, Flow<? extends T> flow2) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(flow2, "default");
        return FlowKt.transformLatest(FlowKt.distinctUntilChanged(other), new OperatorsKt$connectWhen$$inlined$flatMapLatest$1(null, flow, flow2));
    }

    public static final <T> Flow<Optional<T>> toOptionals(final Flow<? extends T> flow) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        return new Flow<Optional<? extends T>>() { // from class: com.robinhood.coroutines.flow.OperatorsKt$toOptionals$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.coroutines.flow.OperatorsKt$toOptionals$$inlined$map$1$2 */
            public static final class C329712<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.coroutines.flow.OperatorsKt$toOptionals$$inlined$map$1$2", m3645f = "Operators.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.coroutines.flow.OperatorsKt$toOptionals$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C329712.this.emit(null, this);
                    }
                }

                public C329712(FlowCollector flowCollector) {
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
                        Optional optionalAsOptional = Optional3.asOptional(obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(optionalAsOptional, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new C329712(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    /* renamed from: timeoutWithDefault-8Mi8wO0, reason: not valid java name */
    public static final <T> Flow<T> m22187timeoutWithDefault8Mi8wO0(Flow<? extends T> timeoutWithDefault, long j, T t) {
        Intrinsics.checkNotNullParameter(timeoutWithDefault, "$this$timeoutWithDefault");
        return FlowKt.m28818catch(FlowKt.m28821timeoutHG0u8IE(timeoutWithDefault, j), new Operators4(t, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: withTimeoutWithDefault-rnQQ1Ag, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object m22188withTimeoutWithDefaultrnQQ1Ag(long j, T t, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        Operators5 operators5;
        if (continuation instanceof Operators5) {
            operators5 = (Operators5) continuation;
            int i = operators5.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                operators5.label = i - Integer.MIN_VALUE;
            } else {
                operators5 = new Operators5(continuation);
            }
        }
        Object obj = operators5.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = operators5.label;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj2 = operators5.L$0;
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            operators5.L$0 = t;
            operators5.label = 1;
            Object objM28789withTimeoutKLykuaI = Timeout6.m28789withTimeoutKLykuaI(j, function2, operators5);
            return objM28789withTimeoutKLykuaI == coroutine_suspended ? coroutine_suspended : objM28789withTimeoutKLykuaI;
        } catch (Timeout4 unused) {
            return t;
        }
    }

    public static final /* synthetic */ <T> Flow<List<T>> combineLatestToList(Iterable<? extends Flow<? extends T>> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Flow[] flowArr = (Flow[]) CollectionsKt.toList(iterable).toArray(new Flow[0]);
        Intrinsics.needClassReification();
        return new OperatorsKt$combineLatestToList$$inlined$combine$1(flowArr);
    }
}
