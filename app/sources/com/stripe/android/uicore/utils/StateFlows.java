package com.stripe.android.uicore.utils;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: StateFlows.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B!\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0097@¢\u0006\u0002\u0010\u0013R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, m3636d2 = {"Lcom/stripe/android/uicore/utils/FlowToStateFlow;", "T", "Lkotlinx/coroutines/flow/StateFlow;", "flow", "Lkotlinx/coroutines/flow/Flow;", "produceValue", "Lkotlin/Function0;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function0;)V", "replayCache", "", "getReplayCache", "()Ljava/util/List;", "value", "getValue", "()Ljava/lang/Object;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stripe-ui-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
@SourceDebugExtension
/* renamed from: com.stripe.android.uicore.utils.FlowToStateFlow, reason: use source file name */
/* loaded from: classes26.dex */
public final class StateFlows<T> implements StateFlow<T> {
    private final Flow<T> flow;
    private final Function0<T> produceValue;

    /* compiled from: StateFlows.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.uicore.utils.FlowToStateFlow", m3645f = "StateFlows.kt", m3646l = {44}, m3647m = "collect")
    /* renamed from: com.stripe.android.uicore.utils.FlowToStateFlow$collect$1 */
    static final class C426391 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ StateFlows<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C426391(StateFlows<T> stateFlows, Continuation<? super C426391> continuation) {
            super(continuation);
            this.this$0 = stateFlows;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collect(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StateFlows(Flow<? extends T> flow, Function0<? extends T> produceValue) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(produceValue, "produceValue");
        this.flow = flow;
        this.produceValue = produceValue;
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public List<T> getReplayCache() {
        return CollectionsKt.listOf(getValue());
    }

    @Override // kotlinx.coroutines.flow.StateFlow
    public T getValue() {
        return this.produceValue.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object collect(FlowCollector<? super T> flowCollector, Continuation<?> continuation) {
        C426391 c426391;
        Job job;
        if (continuation instanceof C426391) {
            c426391 = (C426391) continuation;
            int i = c426391.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c426391.label = i - Integer.MIN_VALUE;
            } else {
                c426391 = new C426391(this, continuation);
            }
        }
        Object obj = c426391.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c426391.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Job job2 = (Job) c426391.getContext().get(Job.INSTANCE);
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(this.flow);
            c426391.L$0 = job2;
            c426391.label = 1;
            if (flowDistinctUntilChanged.collect(flowCollector, c426391) == coroutine_suspended) {
                return coroutine_suspended;
            }
            job = job2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            job = (Job) c426391.L$0;
            ResultKt.throwOnFailure(obj);
        }
        while (true) {
            if (job != null) {
                JobKt.ensureActive(job);
            }
        }
    }
}
