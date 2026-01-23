package com.robinhood.utils.coroutine;

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

/* compiled from: Flows.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\u001a*\u0010\u0000\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u0001H\u0003\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0001\u001a$\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"withPrevious", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Pair;", "T", "throttleLatest", "delayMillis", "", "lib-utils-coroutine"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.coroutine.FlowsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Flows3 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Flows.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0016\u0010\u0003\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00012\u0006\u0010\u0004\u001a\u0002H\u0002H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "T", "prev", "curr"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.utils.coroutine.FlowsKt$withPrevious$1", m3645f = "Flows.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.utils.coroutine.FlowsKt$withPrevious$1 */
    static final class C418741<T> extends ContinuationImpl7 implements Function3<Tuples2<? extends T, ? extends T>, T, Continuation<? super Tuples2<? extends T, ? extends T>>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        C418741(Continuation<? super C418741> continuation) {
            super(3, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((Tuples2<? extends Tuples2<? extends T, ? extends T>, ? extends Tuples2<? extends T, ? extends T>>) obj, (Tuples2<? extends T, ? extends T>) obj2, (Continuation<? super Tuples2<? extends Tuples2<? extends T, ? extends T>, ? extends Tuples2<? extends T, ? extends T>>>) obj3);
        }

        public final Object invoke(Tuples2<? extends T, ? extends T> tuples2, T t, Continuation<? super Tuples2<? extends T, ? extends T>> continuation) {
            C418741 c418741 = new C418741(continuation);
            c418741.L$0 = tuples2;
            c418741.L$1 = t;
            return c418741.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            return Tuples4.m3642to(tuples2.getSecond(), this.L$1);
        }
    }

    public static final <T> Flow<Tuples2<T, T>> withPrevious(Flow<? extends T> flow) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        final Flow flowScan = FlowKt.scan(flow, new Tuples2(null, null), new C418741(null));
        return new Flow<Tuples2<? extends T, ? extends T>>() { // from class: com.robinhood.utils.coroutine.FlowsKt$withPrevious$$inlined$mapNotNull$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.utils.coroutine.FlowsKt$withPrevious$$inlined$mapNotNull$1$2 */
            public static final class C418732<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.utils.coroutine.FlowsKt$withPrevious$$inlined$mapNotNull$1$2", m3645f = "Flows.kt", m3646l = {56}, m3647m = "emit")
                /* renamed from: com.robinhood.utils.coroutine.FlowsKt$withPrevious$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                        return C418732.this.emit(null, this);
                    }
                }

                public C418732(FlowCollector flowCollector) {
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
                        Tuples2 tuples2 = (Tuples2) obj;
                        Object objComponent1 = tuples2.component1();
                        Object objComponent2 = tuples2.component2();
                        Tuples2 tuples22 = objComponent2 != null ? new Tuples2(objComponent1, objComponent2) : null;
                        if (tuples22 != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(tuples22, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
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
                Object objCollect = flowScan.collect(new C418732(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public static final <T> Flow<T> throttleLatest(Flow<? extends T> flow, long j) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        return FlowKt.flow(new FlowsKt$throttleLatest$$inlined$transform$1(FlowKt.conflate(flow), null, j));
    }
}
