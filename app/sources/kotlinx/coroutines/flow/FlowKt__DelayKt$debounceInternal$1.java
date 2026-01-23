package kotlinx.coroutines.flow;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel8;
import kotlinx.coroutines.channels.Produce;
import kotlinx.coroutines.flow.internal.NullSurrogate;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.OnTimeout3;
import kotlinx.coroutines.selects.SelectImplementation;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Delay.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "downstream", "Lkotlinx/coroutines/flow/FlowCollector;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", m3645f = "Delay.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE, 415}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes14.dex */
final class FlowKt__DelayKt$debounceInternal$1<T> extends ContinuationImpl7 implements Function3<CoroutineScope, FlowCollector<? super T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow<T> $this_debounceInternal;
    final /* synthetic */ Function1<T, Long> $timeoutMillisSelector;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__DelayKt$debounceInternal$1(Function1<? super T, Long> function1, Flow<? extends T> flow, Continuation<? super FlowKt__DelayKt$debounceInternal$1> continuation) {
        super(3, continuation);
        this.$timeoutMillisSelector = function1;
        this.$this_debounceInternal = flow;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(CoroutineScope coroutineScope, FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
        FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$1 = new FlowKt__DelayKt$debounceInternal$1(this.$timeoutMillisSelector, this.$this_debounceInternal, continuation);
        flowKt__DelayKt$debounceInternal$1.L$0 = coroutineScope;
        flowKt__DelayKt$debounceInternal$1.L$1 = flowCollector;
        return flowKt__DelayKt$debounceInternal$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
    
        if (r7.emit(r15, r14) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e2, code lost:
    
        if (r7.doSelect(r14) != r0) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4 A[PHI: r1 r5 r6 r7
      0x00a4: PHI (r1v3 kotlin.jvm.internal.Ref$LongRef) = (r1v5 kotlin.jvm.internal.Ref$LongRef), (r1v7 kotlin.jvm.internal.Ref$LongRef), (r1v7 kotlin.jvm.internal.Ref$LongRef) binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r5v3 kotlin.jvm.internal.Ref$ObjectRef) = 
      (r5v5 kotlin.jvm.internal.Ref$ObjectRef)
      (r5v6 kotlin.jvm.internal.Ref$ObjectRef)
      (r5v6 kotlin.jvm.internal.Ref$ObjectRef)
     binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r6v2 kotlinx.coroutines.channels.ReceiveChannel) = 
      (r6v4 kotlinx.coroutines.channels.ReceiveChannel)
      (r6v5 kotlinx.coroutines.channels.ReceiveChannel)
      (r6v5 kotlinx.coroutines.channels.ReceiveChannel)
     binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r7v2 kotlinx.coroutines.flow.FlowCollector) = 
      (r7v4 kotlinx.coroutines.flow.FlowCollector)
      (r7v5 kotlinx.coroutines.flow.FlowCollector)
      (r7v5 kotlinx.coroutines.flow.FlowCollector)
     binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e2 -> B:7:0x001e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef objectRef;
        FlowCollector flowCollector;
        Channel8 channel8;
        Ref.LongRef longRef;
        Ref.ObjectRef objectRef2;
        Channel8 channel82;
        FlowCollector flowCollector2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            FlowCollector flowCollector3 = (FlowCollector) this.L$1;
            Channel8 channel8Produce$default = Produce.produce$default(coroutineScope, null, 0, new FlowKt__DelayKt$debounceInternal$1$values$1(this.$this_debounceInternal, null), 3, null);
            objectRef = new Ref.ObjectRef();
            flowCollector = flowCollector3;
            channel8 = channel8Produce$default;
            if (objectRef.element != NullSurrogate.DONE) {
            }
        } else if (i == 1) {
            longRef = (Ref.LongRef) this.L$3;
            objectRef = (Ref.ObjectRef) this.L$2;
            channel8 = (Channel8) this.L$1;
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            objectRef.element = null;
            Ref.LongRef longRef2 = longRef;
            objectRef2 = objectRef;
            channel82 = channel8;
            flowCollector2 = flowCollector;
            SelectImplementation selectImplementation = new SelectImplementation(getContext());
            if (objectRef2.element != null) {
            }
            selectImplementation.invoke(channel82.getOnReceiveCatching(), new FlowKt__DelayKt$debounceInternal$1$3$2(objectRef2, flowCollector2, null));
            this.L$0 = flowCollector2;
            this.L$1 = channel82;
            this.L$2 = objectRef2;
            this.L$3 = null;
            this.label = 2;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef2 = (Ref.ObjectRef) this.L$2;
            channel82 = (Channel8) this.L$1;
            flowCollector2 = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            flowCollector = flowCollector2;
            channel8 = channel82;
            objectRef = objectRef2;
            if (objectRef.element != NullSurrogate.DONE) {
                longRef = new Ref.LongRef();
                T t = objectRef.element;
                if (t != null) {
                    Function1<T, Long> function1 = this.$timeoutMillisSelector;
                    Symbol symbol = NullSurrogate.NULL;
                    if (t == symbol) {
                        t = null;
                    }
                    long jLongValue = function1.invoke(t).longValue();
                    longRef.element = jLongValue;
                    if (jLongValue < 0) {
                        throw new IllegalArgumentException("Debounce timeout should not be negative");
                    }
                    if (jLongValue != 0) {
                        Ref.LongRef longRef22 = longRef;
                        objectRef2 = objectRef;
                        channel82 = channel8;
                        flowCollector2 = flowCollector;
                        SelectImplementation selectImplementation2 = new SelectImplementation(getContext());
                        if (objectRef2.element != null) {
                            OnTimeout3.onTimeout(selectImplementation2, longRef22.element, new FlowKt__DelayKt$debounceInternal$1$3$1(flowCollector2, objectRef2, null));
                        }
                        selectImplementation2.invoke(channel82.getOnReceiveCatching(), new FlowKt__DelayKt$debounceInternal$1$3$2(objectRef2, flowCollector2, null));
                        this.L$0 = flowCollector2;
                        this.L$1 = channel82;
                        this.L$2 = objectRef2;
                        this.L$3 = null;
                        this.label = 2;
                    } else {
                        T t2 = objectRef.element;
                        if (t2 == symbol) {
                            t2 = null;
                        }
                        this.L$0 = flowCollector;
                        this.L$1 = channel8;
                        this.L$2 = objectRef;
                        this.L$3 = longRef;
                        this.label = 1;
                    }
                    return coroutine_suspended;
                }
                if (objectRef.element != NullSurrogate.DONE) {
                    return Unit.INSTANCE;
                }
            }
        }
    }
}
