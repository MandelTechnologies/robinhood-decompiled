package com.robinhood.websocket.utils;

import com.plaid.internal.EnumC7081g;
import com.robinhood.websocket.utils.DataFlowManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: DataFlowManager.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00028\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.websocket.utils.DataFlowManager$getDataFlow$1$1", m3645f = "DataFlowManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE, EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.websocket.utils.DataFlowManager$getDataFlow$1$1, reason: use source file name */
/* loaded from: classes12.dex */
final class DataFlowManager2<T> extends ContinuationImpl7 implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ DataFlowManager<ResponseT, DataT>.CachedValue<DataT> $cachedValue;
    final /* synthetic */ DataFlowManager.TopicState<DataT> $state;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataFlowManager2(DataFlowManager<ResponseT, DataT>.CachedValue<DataT> cachedValue, DataFlowManager.TopicState<DataT> topicState, Continuation<? super DataFlowManager2> continuation) {
        super(2, continuation);
        this.$cachedValue = cachedValue;
        this.$state = topicState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DataFlowManager2 dataFlowManager2 = new DataFlowManager2(this.$cachedValue, this.$state, continuation);
        dataFlowManager2.L$0 = obj;
        return dataFlowManager2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
        return ((DataFlowManager2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r1, r5, r4) == r0) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector2 = (FlowCollector) this.L$0;
            Object data = this.$cachedValue.getData();
            this.L$0 = flowCollector2;
            this.label = 1;
            Object objEmit = flowCollector2.emit(data, this);
            flowCollector = flowCollector2;
            if (objEmit != coroutine_suspended) {
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
        FlowCollector flowCollector3 = (FlowCollector) this.L$0;
        ResultKt.throwOnFailure(obj);
        flowCollector = flowCollector3;
        SharedFlow2 dataFlow = this.$state.getDataFlow();
        Intrinsics.checkNotNull(dataFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of com.robinhood.websocket.utils.DataFlowManager.getDataFlow>");
        this.L$0 = null;
        this.label = 2;
    }
}
