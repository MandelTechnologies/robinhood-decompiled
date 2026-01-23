package com.squareup.wire;

import com.plaid.internal.EnumC7081g;
import java.io.IOException;
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
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.Channel5;

/* JADX INFO: Add missing generic type declarations: [E] */
/* compiled from: GrpcCalls.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "E", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.squareup.wire.GrpcCalls$toMessageSource$1$read$1", m3645f = "GrpcCalls.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.squareup.wire.GrpcCalls$toMessageSource$1$read$1, reason: use source file name */
/* loaded from: classes12.dex */
final class GrpcCalls6<E> extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super E>, Object> {
    final /* synthetic */ Channel<E> $this_toMessageSource;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GrpcCalls6(Channel<E> channel, Continuation<? super GrpcCalls6> continuation) {
        super(2, continuation);
        this.$this_toMessageSource = channel;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GrpcCalls6(this.$this_toMessageSource, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super E> continuation) {
        return ((GrpcCalls6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objMo28798receiveCatchingJP2dKIU;
        Throwable thM28805exceptionOrNullimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel<E> channel = this.$this_toMessageSource;
                this.label = 1;
                objMo28798receiveCatchingJP2dKIU = channel.mo28798receiveCatchingJP2dKIU(this);
                if (objMo28798receiveCatchingJP2dKIU == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo28798receiveCatchingJP2dKIU = ((Channel5) obj).getHolder();
            }
            if ((objMo28798receiveCatchingJP2dKIU instanceof Channel5.Closed) && (thM28805exceptionOrNullimpl = Channel5.m28805exceptionOrNullimpl(objMo28798receiveCatchingJP2dKIU)) != null) {
                throw thM28805exceptionOrNullimpl;
            }
            return Channel5.m28806getOrNullimpl(objMo28798receiveCatchingJP2dKIU);
        } catch (Exception e) {
            throw new IOException(e);
        }
    }
}
