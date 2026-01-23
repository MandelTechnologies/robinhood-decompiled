package com.robinhood.websocket.utils;

import com.robinhood.websocket.api.WebsocketTopic;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: DataFlowManager.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "subscriptionCount", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.websocket.utils.DataFlowManager$getDataFlow$1$state$1$subscriptionJob$1", m3645f = "DataFlowManager.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.websocket.utils.DataFlowManager$getDataFlow$1$state$1$subscriptionJob$1, reason: use source file name */
/* loaded from: classes12.dex */
final class DataFlowManager3 extends ContinuationImpl7 implements Function2<Integer, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $dataSubscriptionTimeout;
    final /* synthetic */ SingleInstanceJob $pendingCancelJob;
    final /* synthetic */ DataFlowManager5<DataT> $subscriptionListener;
    final /* synthetic */ WebsocketTopic<T> $topic;
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ DataFlowManager<ResponseT, DataT> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DataFlowManager3(DataFlowManager5<DataT> dataFlowManager5, WebsocketTopic<? extends T> websocketTopic, SingleInstanceJob singleInstanceJob, DataFlowManager<ResponseT, DataT> dataFlowManager, long j, Continuation<? super DataFlowManager3> continuation) {
        super(2, continuation);
        this.$subscriptionListener = dataFlowManager5;
        this.$topic = websocketTopic;
        this.$pendingCancelJob = singleInstanceJob;
        this.this$0 = dataFlowManager;
        this.$dataSubscriptionTimeout = j;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DataFlowManager3 dataFlowManager3 = new DataFlowManager3(this.$subscriptionListener, this.$topic, this.$pendingCancelJob, this.this$0, this.$dataSubscriptionTimeout, continuation);
        dataFlowManager3.I$0 = ((Number) obj).intValue();
        return dataFlowManager3;
    }

    public final Object invoke(int i, Continuation<? super Unit> continuation) {
        return ((DataFlowManager3) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
        return invoke(num.intValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.I$0 > 0) {
            this.$subscriptionListener.onSubscribedChanged(this.$topic, true);
            this.$pendingCancelJob.setNewJob(null);
        } else {
            this.$pendingCancelJob.setNewJob(BuildersKt__Builders_commonKt.launch$default(((DataFlowManager) this.this$0).coroutineScope, null, null, new C420591(this.$dataSubscriptionTimeout, this.$subscriptionListener, this.$topic, this.this$0, null), 3, null));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: DataFlowManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.websocket.utils.DataFlowManager$getDataFlow$1$state$1$subscriptionJob$1$1", m3645f = "DataFlowManager.kt", m3646l = {51}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.websocket.utils.DataFlowManager$getDataFlow$1$state$1$subscriptionJob$1$1 */
    static final class C420591 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $dataSubscriptionTimeout;
        final /* synthetic */ DataFlowManager5<DataT> $subscriptionListener;
        final /* synthetic */ WebsocketTopic<T> $topic;
        int label;
        final /* synthetic */ DataFlowManager<ResponseT, DataT> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C420591(long j, DataFlowManager5<DataT> dataFlowManager5, WebsocketTopic<? extends T> websocketTopic, DataFlowManager<ResponseT, DataT> dataFlowManager, Continuation<? super C420591> continuation) {
            super(2, continuation);
            this.$dataSubscriptionTimeout = j;
            this.$subscriptionListener = dataFlowManager5;
            this.$topic = websocketTopic;
            this.this$0 = dataFlowManager;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C420591(this.$dataSubscriptionTimeout, this.$subscriptionListener, this.$topic, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C420591) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = this.$dataSubscriptionTimeout;
                this.label = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.$subscriptionListener.onSubscribedChanged(this.$topic, false);
            this.this$0.removeDataFlow(this.$topic);
            return Unit.INSTANCE;
        }
    }
}
