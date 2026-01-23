package kotlinx.coroutines.flow;

import com.plaid.internal.EnumC7081g;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.internal.FlowExceptions;
import kotlinx.coroutines.flow.internal.FlowExceptions_commonKt;
import kotlinx.coroutines.flow.internal.NullSurrogate;

/* compiled from: Reduce.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a \u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0003\u001aD\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@¢\u0006\u0004\b\u0004\u0010\n\u001a\"\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u000b\u0010\u0003\u001aF\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@¢\u0006\u0004\b\u000b\u0010\n\u001a\"\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\f\u0010\u0003¨\u0006\r"}, m3636d2 = {"T", "Lkotlinx/coroutines/flow/Flow;", "single", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "first", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "predicate", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "firstOrNull", "lastOrNull", "kotlinx-coroutines-core"}, m3637k = 5, m3638mv = {2, 1, 0}, m3640xi = 48, m3641xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension
/* renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt, reason: use source file name */
/* loaded from: classes23.dex */
final /* synthetic */ class Reduce2 {

    /* compiled from: Reduce.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m3645f = "Reduce.kt", m3646l = {EnumC7081g.f2780x600b66fe}, m3647m = "first")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1 */
    static final class C461021<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C461021(Continuation<? super C461021> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.first(null, this);
        }
    }

    /* compiled from: Reduce.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m3645f = "Reduce.kt", m3646l = {EnumC7081g.f2780x600b66fe}, m3647m = "first")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3 */
    static final class C461033<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C461033(Continuation<? super C461033> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.first(null, null, this);
        }
    }

    /* compiled from: Reduce.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m3645f = "Reduce.kt", m3646l = {EnumC7081g.f2780x600b66fe}, m3647m = "firstOrNull")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1 */
    static final class C461041<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C461041(Continuation<? super C461041> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.firstOrNull(null, this);
        }
    }

    /* compiled from: Reduce.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m3645f = "Reduce.kt", m3646l = {EnumC7081g.f2780x600b66fe}, m3647m = "firstOrNull")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3 */
    /* loaded from: classes14.dex */
    static final class C461053<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C461053(Continuation<? super C461053> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.firstOrNull(null, null, this);
        }
    }

    /* compiled from: Reduce.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m3645f = "Reduce.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE}, m3647m = "lastOrNull")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$1 */
    /* loaded from: classes14.dex */
    static final class C461061<T> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C461061(Continuation<? super C461061> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.lastOrNull(null, this);
        }
    }

    /* compiled from: Reduce.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m3645f = "Reduce.kt", m3646l = {53}, m3647m = "single")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$single$1 */
    /* loaded from: classes14.dex */
    static final class C461081<T> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C461081(Continuation<? super C461081> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.single(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object single(Flow<? extends T> flow, Continuation<? super T> continuation) {
        C461081 c461081;
        Ref.ObjectRef objectRef;
        if (continuation instanceof C461081) {
            c461081 = (C461081) continuation;
            int i = c461081.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c461081.label = i - Integer.MIN_VALUE;
            } else {
                c461081 = new C461081(continuation);
            }
        }
        Object obj = c461081.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c461081.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = (T) NullSurrogate.NULL;
            FlowCollector<? super Object> flowCollector = new FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt.single.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(T t, Continuation<? super Unit> continuation2) {
                    Ref.ObjectRef<Object> objectRef3 = objectRef2;
                    if (objectRef3.element != NullSurrogate.NULL) {
                        throw new IllegalArgumentException("Flow has more than one element");
                    }
                    objectRef3.element = t;
                    return Unit.INSTANCE;
                }
            };
            c461081.L$0 = objectRef2;
            c461081.label = 1;
            if (flow.collect(flowCollector, c461081) == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef = objectRef2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) c461081.L$0;
            ResultKt.throwOnFailure(obj);
        }
        T t = objectRef.element;
        if (t != NullSurrogate.NULL) {
            return t;
        }
        throw new NoSuchElementException("Flow is empty");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object first(Flow<? extends T> flow, Continuation<? super T> continuation) {
        C461021 c461021;
        Ref.ObjectRef objectRef;
        FlowExceptions e;
        FlowCollector<T> flowCollector;
        T t;
        if (continuation instanceof C461021) {
            c461021 = (C461021) continuation;
            int i = c461021.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c461021.label = i - Integer.MIN_VALUE;
            } else {
                c461021 = new C461021(continuation);
            }
        }
        Object obj = c461021.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c461021.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = (T) NullSurrogate.NULL;
            FlowCollector<T> flowCollector2 = new FlowCollector<T>() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public Object emit(T t2, Continuation<? super Unit> continuation2) {
                    objectRef2.element = t2;
                    throw new FlowExceptions(this);
                }
            };
            try {
                c461021.L$0 = objectRef2;
                c461021.L$1 = flowCollector2;
                c461021.label = 1;
                if (flow.collect(flowCollector2, c461021) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
            } catch (FlowExceptions e2) {
                objectRef = objectRef2;
                e = e2;
                flowCollector = flowCollector2;
                FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                JobKt.ensureActive(c461021.getContext());
                t = objectRef.element;
                if (t != NullSurrogate.NULL) {
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector = (FlowKt__ReduceKt$first$$inlined$collectWhile$1) c461021.L$1;
            objectRef = (Ref.ObjectRef) c461021.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (FlowExceptions e3) {
                e = e3;
                FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                JobKt.ensureActive(c461021.getContext());
                t = objectRef.element;
                if (t != NullSurrogate.NULL) {
                }
            }
        }
        t = objectRef.element;
        if (t != NullSurrogate.NULL) {
            return t;
        }
        throw new NoSuchElementException("Expected at least one element");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object first(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super T> continuation) {
        C461033 c461033;
        Ref.ObjectRef objectRef;
        FlowExceptions e;
        FlowCollector<? super Object> flowCollector;
        T t;
        if (continuation instanceof C461033) {
            c461033 = (C461033) continuation;
            int i = c461033.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c461033.label = i - Integer.MIN_VALUE;
            } else {
                c461033 = new C461033(continuation);
            }
        }
        Object obj = c461033.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c461033.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = (T) NullSurrogate.NULL;
            FlowCollector<? super Object> flowKt__ReduceKt$first$$inlined$collectWhile$2 = new FlowKt__ReduceKt$first$$inlined$collectWhile$2<>(function2, objectRef2);
            try {
                c461033.L$0 = objectRef2;
                c461033.L$1 = flowKt__ReduceKt$first$$inlined$collectWhile$2;
                c461033.label = 1;
                if (flow.collect(flowKt__ReduceKt$first$$inlined$collectWhile$2, c461033) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
            } catch (FlowExceptions e2) {
                objectRef = objectRef2;
                e = e2;
                flowCollector = flowKt__ReduceKt$first$$inlined$collectWhile$2;
                FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                JobKt.ensureActive(c461033.getContext());
                t = objectRef.element;
                if (t != NullSurrogate.NULL) {
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector = (FlowKt__ReduceKt$first$$inlined$collectWhile$2) c461033.L$1;
            objectRef = (Ref.ObjectRef) c461033.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (FlowExceptions e3) {
                e = e3;
                FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                JobKt.ensureActive(c461033.getContext());
                t = objectRef.element;
                if (t != NullSurrogate.NULL) {
                }
            }
        }
        t = objectRef.element;
        if (t != NullSurrogate.NULL) {
            return t;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object firstOrNull(Flow<? extends T> flow, Continuation<? super T> continuation) {
        C461041 c461041;
        Ref.ObjectRef objectRef;
        FlowExceptions e;
        FlowCollector<T> flowCollector;
        if (continuation instanceof C461041) {
            c461041 = (C461041) continuation;
            int i = c461041.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c461041.label = i - Integer.MIN_VALUE;
            } else {
                c461041 = new C461041(continuation);
            }
        }
        Object obj = c461041.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c461041.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            FlowCollector<T> flowCollector2 = new FlowCollector<T>() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public Object emit(T t, Continuation<? super Unit> continuation2) {
                    objectRef2.element = t;
                    throw new FlowExceptions(this);
                }
            };
            try {
                c461041.L$0 = objectRef2;
                c461041.L$1 = flowCollector2;
                c461041.label = 1;
                if (flow.collect(flowCollector2, c461041) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
            } catch (FlowExceptions e2) {
                objectRef = objectRef2;
                e = e2;
                flowCollector = flowCollector2;
                FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                JobKt.ensureActive(c461041.getContext());
                return objectRef.element;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector = (FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1) c461041.L$1;
            objectRef = (Ref.ObjectRef) c461041.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (FlowExceptions e3) {
                e = e3;
                FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                JobKt.ensureActive(c461041.getContext());
                return objectRef.element;
            }
        }
        return objectRef.element;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object firstOrNull(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super T> continuation) {
        C461053 c461053;
        Ref.ObjectRef objectRef;
        FlowExceptions e;
        FlowCollector<? super Object> flowCollector;
        if (continuation instanceof C461053) {
            c461053 = (C461053) continuation;
            int i = c461053.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c461053.label = i - Integer.MIN_VALUE;
            } else {
                c461053 = new C461053(continuation);
            }
        }
        Object obj = c461053.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c461053.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            FlowCollector<? super Object> flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 = new FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2<>(function2, objectRef2);
            try {
                c461053.L$0 = objectRef2;
                c461053.L$1 = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2;
                c461053.label = 1;
                if (flow.collect(flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2, c461053) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
            } catch (FlowExceptions e2) {
                objectRef = objectRef2;
                e = e2;
                flowCollector = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2;
                FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                JobKt.ensureActive(c461053.getContext());
                return objectRef.element;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector = (FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2) c461053.L$1;
            objectRef = (Ref.ObjectRef) c461053.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (FlowExceptions e3) {
                e = e3;
                FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                JobKt.ensureActive(c461053.getContext());
                return objectRef.element;
            }
        }
        return objectRef.element;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object lastOrNull(Flow<? extends T> flow, Continuation<? super T> continuation) {
        C461061 c461061;
        Ref.ObjectRef objectRef;
        if (continuation instanceof C461061) {
            c461061 = (C461061) continuation;
            int i = c461061.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c461061.label = i - Integer.MIN_VALUE;
            } else {
                c461061 = new C461061(continuation);
            }
        }
        Object obj = c461061.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c461061.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            FlowCollector<? super Object> flowCollector = new FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt.lastOrNull.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(T t, Continuation<? super Unit> continuation2) {
                    objectRef2.element = t;
                    return Unit.INSTANCE;
                }
            };
            c461061.L$0 = objectRef2;
            c461061.label = 1;
            if (flow.collect(flowCollector, c461061) == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef = objectRef2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) c461061.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return objectRef.element;
    }
}
