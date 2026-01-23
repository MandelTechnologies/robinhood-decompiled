package com.robinhood.websocket.utils;

import com.robinhood.websocket.utils.DataFlowManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlow2;

/* compiled from: DataFlowManager.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.websocket.utils.DataFlowManager$onMessageReceived$1$1$1$1", m3645f = "DataFlowManager.kt", m3646l = {93}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.websocket.utils.DataFlowManager$onMessageReceived$1$1$1$1, reason: use source file name */
/* loaded from: classes12.dex */
final class DataFlowManager4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DataT $msg;
    final /* synthetic */ DataFlowManager.TopicState<DataT> $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataFlowManager4(DataFlowManager.TopicState<DataT> topicState, DataT datat, Continuation<? super DataFlowManager4> continuation) {
        super(2, continuation);
        this.$state = topicState;
        this.$msg = datat;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DataFlowManager4(this.$state, this.$msg, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DataFlowManager4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SharedFlow2 dataFlow = this.$state.getDataFlow();
            DataT datat = this.$msg;
            this.label = 1;
            if (dataFlow.emit(datat, this) == coroutine_suspended) {
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
