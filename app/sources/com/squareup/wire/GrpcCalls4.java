package com.squareup.wire;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.Channel8;
import kotlinx.coroutines.channels.Channel9;

/* compiled from: GrpcCalls.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.squareup.wire.GrpcCalls$GrpcStreamingCall$1$executeIn$job$1", m3645f = "GrpcCalls.kt", m3646l = {192}, m3647m = "invokeSuspend")
/* renamed from: com.squareup.wire.GrpcCalls$GrpcStreamingCall$1$executeIn$job$1, reason: use source file name */
/* loaded from: classes12.dex */
final class GrpcCalls4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function3<Channel8<? extends S>, Channel9<? super R>, Continuation<? super Unit>, Object> $function;
    int label;
    final /* synthetic */ GrpcCalls3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    GrpcCalls4(Function3<? super Channel8<? extends S>, ? super Channel9<? super R>, ? super Continuation<? super Unit>, ? extends Object> function3, GrpcCalls3 grpcCalls3, Continuation<? super GrpcCalls4> continuation) {
        super(2, continuation);
        this.$function = function3;
        this.this$0 = grpcCalls3;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GrpcCalls4(this.$function, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GrpcCalls4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Function3<Channel8<? extends S>, Channel9<? super R>, Continuation<? super Unit>, Object> function3 = this.$function;
                Channel channel = this.this$0.requestChannel;
                Channel channel2 = this.this$0.responseChannel;
                this.label = 1;
                if (function3.invoke(channel, channel2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e) {
            this.this$0.requestChannel.close(e);
            this.this$0.responseChannel.close(e);
        }
        return Unit.INSTANCE;
    }
}
