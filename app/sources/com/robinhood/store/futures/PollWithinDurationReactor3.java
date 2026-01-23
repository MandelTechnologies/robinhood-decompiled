package com.robinhood.store.futures;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: PollWithinDurationReactor.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.futures.PollWithinDurationReactor$onSubscriptionAdded$1$1$1", m3645f = "PollWithinDurationReactor.kt", m3646l = {48}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.store.futures.PollWithinDurationReactor$onSubscriptionAdded$1$1$1, reason: use source file name */
/* loaded from: classes12.dex */
final class PollWithinDurationReactor3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PollWithinDurationReactor2<P> $params;
    int label;
    final /* synthetic */ PollWithinDurationReactor<P, T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PollWithinDurationReactor3(PollWithinDurationReactor<P, T> pollWithinDurationReactor, PollWithinDurationReactor2<P> pollWithinDurationReactor2, Continuation<? super PollWithinDurationReactor3> continuation) {
        super(2, continuation);
        this.this$0 = pollWithinDurationReactor;
        this.$params = pollWithinDurationReactor2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PollWithinDurationReactor3(this.this$0, this.$params, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PollWithinDurationReactor3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowTransformLatest = FlowKt.transformLatest(this.this$0.streamSmallestDuration$lib_store_futures_externalDebug(), new C41472x302bb413(null, this.this$0, this.$params));
            FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.store.futures.PollWithinDurationReactor$onSubscriptionAdded$1$1$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(T t, Continuation<? super Unit> continuation) {
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowTransformLatest.collect(flowCollector, this) == coroutine_suspended) {
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
