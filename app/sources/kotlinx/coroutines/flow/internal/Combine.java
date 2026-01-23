package kotlinx.coroutines.flow.internal;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.Channel4;
import kotlinx.coroutines.channels.Channel5;
import kotlinx.coroutines.channels.Channel9;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: Combine.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u008d\u0001\u0010\u0003\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00050\u00072\u0014\u0010\b\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00060\n0\t2\u0016\u0010\u000b\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u0001H\u0006\u0018\u00010\t0\f29\u0010\r\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000e¢\u0006\u0002\b\u0010H\u0081@¢\u0006\u0002\u0010\u0011\u001ak\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00050\n\"\u0004\b\u0000\u0010\u0013\"\u0004\b\u0001\u0010\u0014\"\u0004\b\u0002\u0010\u00052\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00130\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00140\n2(\u0010\r\u001a$\b\u0001\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000eH\u0000¢\u0006\u0002\u0010\u0017*\u001c\b\u0002\u0010\u0000\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0018"}, m3636d2 = {"Update", "Lkotlin/collections/IndexedValue;", "", "combineInternal", "", "R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "flows", "", "Lkotlinx/coroutines/flow/Flow;", "arrayFactory", "Lkotlin/Function0;", "transform", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/flow/FlowCollector;[Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "zipImpl", "T1", "T2", "flow", "flow2", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: kotlinx.coroutines.flow.internal.CombineKt, reason: use source file name */
/* loaded from: classes23.dex */
public final class Combine {

    /* compiled from: Combine.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", m3645f = "Combine.kt", m3646l = {51, 73, 76}, m3647m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2 */
    static final class C461292 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<T[]> $arrayFactory;
        final /* synthetic */ Flow<T>[] $flows;
        final /* synthetic */ FlowCollector<R> $this_combineInternal;
        final /* synthetic */ Function3<FlowCollector<? super R>, T[], Continuation<? super Unit>, Object> $transform;
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C461292(Flow<? extends T>[] flowArr, Function0<T[]> function0, Function3<? super FlowCollector<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3, FlowCollector<? super R> flowCollector, Continuation<? super C461292> continuation) {
            super(2, continuation);
            this.$flows = flowArr;
            this.$arrayFactory = function0;
            this.$transform = function3;
            this.$this_combineInternal = flowCollector;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C461292 c461292 = new C461292(this.$flows, this.$arrayFactory, this.$transform, this.$this_combineInternal, continuation);
            c461292.L$0 = obj;
            return c461292;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C461292) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x0106, code lost:
        
            if (r10.invoke(r11, r9, r21) == r1) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0126, code lost:
        
            if (r11.invoke(r12, r10, r21) == r1) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0129, code lost:
        
            if (r6 != 0) goto L44;
         */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00c1 A[LOOP:0: B:28:0x00c1->B:47:?, LOOP_START, PHI: r6 r10
          0x00c1: PHI (r6v4 int) = (r6v3 int), (r6v5 int) binds: [B:25:0x00bc, B:47:?] A[DONT_GENERATE, DONT_INLINE]
          0x00c1: PHI (r10v5 kotlin.collections.IndexedValue) = (r10v4 kotlin.collections.IndexedValue), (r10v12 kotlin.collections.IndexedValue) binds: [B:25:0x00bc, B:47:?] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00e8  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0106 -> B:44:0x0129). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0126 -> B:44:0x0129). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int length;
            int i;
            byte[] bArr;
            Object[] objArr;
            Channel channel;
            Object objMo28798receiveCatchingJP2dKIU;
            Object[] objArr2;
            byte[] bArr2;
            int i2;
            int i3;
            IndexedValue indexedValue;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                length = this.$flows.length;
                if (length == 0) {
                    return Unit.INSTANCE;
                }
                Object[] objArr3 = new Object[length];
                ArraysKt.fill$default(objArr3, NullSurrogate.UNINITIALIZED, 0, 0, 6, (Object) null);
                Channel channelChannel$default = Channel4.Channel$default(length, null, null, 6, null);
                AtomicInteger atomicInteger = new AtomicInteger(length);
                i = 0;
                int i5 = 0;
                while (i5 < length) {
                    AtomicInteger atomicInteger2 = atomicInteger;
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.$flows, i5, atomicInteger2, channelChannel$default, null), 3, null);
                    i5++;
                    atomicInteger = atomicInteger2;
                }
                bArr = new byte[length];
                objArr = objArr3;
                channel = channelChannel$default;
                byte b = (byte) (i + 1);
                this.L$0 = objArr;
                this.L$1 = channel;
                this.L$2 = bArr;
                this.I$0 = length;
                this.I$1 = b;
                this.label = 1;
                objMo28798receiveCatchingJP2dKIU = channel.mo28798receiveCatchingJP2dKIU(this);
                if (objMo28798receiveCatchingJP2dKIU != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i4 != 1) {
                if (i4 != 2 && i4 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i3 = this.I$1;
                i2 = this.I$0;
                bArr2 = (byte[]) this.L$2;
                channel = (Channel) this.L$1;
                objArr2 = (Object[]) this.L$0;
                ResultKt.throwOnFailure(obj);
                i = i3;
                length = i2;
                bArr = bArr2;
                objArr = objArr2;
                byte b2 = (byte) (i + 1);
                this.L$0 = objArr;
                this.L$1 = channel;
                this.L$2 = bArr;
                this.I$0 = length;
                this.I$1 = b2;
                this.label = 1;
                objMo28798receiveCatchingJP2dKIU = channel.mo28798receiveCatchingJP2dKIU(this);
                if (objMo28798receiveCatchingJP2dKIU != coroutine_suspended) {
                    byte[] bArr3 = bArr;
                    i2 = length;
                    i3 = b2;
                    objArr2 = objArr;
                    bArr2 = bArr3;
                    indexedValue = (IndexedValue) Channel5.m28806getOrNullimpl(objMo28798receiveCatchingJP2dKIU);
                    if (indexedValue != null) {
                        return Unit.INSTANCE;
                    }
                    while (true) {
                        int index = indexedValue.getIndex();
                        Object obj2 = objArr2[index];
                        objArr2[index] = indexedValue.getValue();
                        if (obj2 == NullSurrogate.UNINITIALIZED) {
                            i2--;
                        }
                        if (bArr2[index] != i3) {
                            bArr2[index] = (byte) i3;
                            indexedValue = (IndexedValue) Channel5.m28806getOrNullimpl(channel.mo28799tryReceivePtdJZtk());
                            if (indexedValue == null) {
                                if (i2 == 0) {
                                }
                            }
                        } else if (i2 == 0) {
                            Object[] objArr4 = (Object[]) this.$arrayFactory.invoke();
                            if (objArr4 == null) {
                                Function3<FlowCollector<? super R>, T[], Continuation<? super Unit>, Object> function3 = this.$transform;
                                Object obj3 = this.$this_combineInternal;
                                this.L$0 = objArr2;
                                this.L$1 = channel;
                                this.L$2 = bArr2;
                                this.I$0 = i2;
                                this.I$1 = i3;
                                this.label = 2;
                            } else {
                                ArraysKt.copyInto$default(objArr2, objArr4, 0, 0, 0, 14, (Object) null);
                                Function3<FlowCollector<? super R>, T[], Continuation<? super Unit>, Object> function32 = this.$transform;
                                Object obj4 = this.$this_combineInternal;
                                this.L$0 = objArr2;
                                this.L$1 = channel;
                                this.L$2 = bArr2;
                                this.I$0 = i2;
                                this.I$1 = i3;
                                this.label = 3;
                            }
                        }
                        byte b22 = (byte) (i + 1);
                        this.L$0 = objArr;
                        this.L$1 = channel;
                        this.L$2 = bArr;
                        this.I$0 = length;
                        this.I$1 = b22;
                        this.label = 1;
                        objMo28798receiveCatchingJP2dKIU = channel.mo28798receiveCatchingJP2dKIU(this);
                        if (objMo28798receiveCatchingJP2dKIU != coroutine_suspended) {
                        }
                    }
                }
                return coroutine_suspended;
            }
            i3 = this.I$1;
            i2 = this.I$0;
            bArr2 = (byte[]) this.L$2;
            channel = (Channel) this.L$1;
            objArr2 = (Object[]) this.L$0;
            ResultKt.throwOnFailure(obj);
            objMo28798receiveCatchingJP2dKIU = ((Channel5) obj).getHolder();
            indexedValue = (IndexedValue) Channel5.m28806getOrNullimpl(objMo28798receiveCatchingJP2dKIU);
            if (indexedValue != null) {
            }
        }

        /* compiled from: Combine.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", m3645f = "Combine.kt", m3646l = {28}, m3647m = "invokeSuspend")
        /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<T>[] $flows;

            /* renamed from: $i */
            final /* synthetic */ int f7045$i;
            final /* synthetic */ AtomicInteger $nonClosed;
            final /* synthetic */ Channel<IndexedValue<Object>> $resultChannel;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Flow<? extends T>[] flowArr, int i, AtomicInteger atomicInteger, Channel<IndexedValue<Object>> channel, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$flows = flowArr;
                this.f7045$i = i;
                this.$nonClosed = atomicInteger;
                this.$resultChannel = channel;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$flows, this.f7045$i, this.$nonClosed, this.$resultChannel, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                AtomicInteger atomicInteger;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Flow[] flowArr = this.$flows;
                        int i2 = this.f7045$i;
                        Flow flow = flowArr[i2];
                        C508311 c508311 = new C508311(this.$resultChannel, i2);
                        this.label = 1;
                        if (flow.collect(c508311, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        Channel9.DefaultImpls.close$default(this.$resultChannel, null, 1, null);
                    }
                    return Unit.INSTANCE;
                } finally {
                    if (this.$nonClosed.decrementAndGet() == 0) {
                        Channel9.DefaultImpls.close$default(this.$resultChannel, null, 1, null);
                    }
                }
            }

            /* compiled from: Combine.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C508311<T> implements FlowCollector {

                /* renamed from: $i */
                final /* synthetic */ int f7046$i;
                final /* synthetic */ Channel<IndexedValue<Object>> $resultChannel;

                C508311(Channel<IndexedValue<Object>> channel, int i) {
                    this.$resultChannel = channel;
                    this.f7046$i = i;
                }

                /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
                
                    if (kotlinx.coroutines.Yield.yield(r0) == r1) goto L21;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(T t, Continuation<? super Unit> continuation) {
                    Combine2 combine2;
                    if (continuation instanceof Combine2) {
                        combine2 = (Combine2) continuation;
                        int i = combine2.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            combine2.label = i - Integer.MIN_VALUE;
                        } else {
                            combine2 = new Combine2(this, continuation);
                        }
                    }
                    Object obj = combine2.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = combine2.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        Channel<IndexedValue<Object>> channel = this.$resultChannel;
                        IndexedValue<Object> indexedValue = new IndexedValue<>(this.f7046$i, t);
                        combine2.label = 1;
                        if (channel.send(indexedValue, combine2) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    combine2.label = 2;
                }
            }
        }
    }

    @PublishedApi
    public static final <R, T> Object combineInternal(FlowCollector<? super R> flowCollector, Flow<? extends T>[] flowArr, Function0<T[]> function0, Function3<? super FlowCollector<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super Unit> continuation) {
        Object objFlowScope = FlowCoroutine2.flowScope(new C461292(flowArr, function0, function3, flowCollector, null), continuation);
        return objFlowScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objFlowScope : Unit.INSTANCE;
    }

    public static final <T1, T2, R> Flow<R> zipImpl(final Flow<? extends T1> flow, final Flow<? extends T2> flow2, final Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
        return new Flow<R>() { // from class: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super R> flowCollector, Continuation<? super Unit> continuation) {
                Object objCoroutineScope = CoroutineScope2.coroutineScope(new Combine3(flow2, flow, flowCollector, function3, null), continuation);
                return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
            }
        };
    }
}
