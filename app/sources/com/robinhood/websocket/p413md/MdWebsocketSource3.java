package com.robinhood.websocket.p413md;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.DelayKt;
import timber.log.Timber;

/* compiled from: MdWebsocketSource.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.websocket.md.MdWebsocketSource$scheduleNextServerKeepAliveCheck$1$1", m3645f = "MdWebsocketSource.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.websocket.md.MdWebsocketSource$scheduleNextServerKeepAliveCheck$1$1, reason: use source file name */
/* loaded from: classes12.dex */
final class MdWebsocketSource3 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ long $timeout;
    int label;
    final /* synthetic */ MdWebsocketSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MdWebsocketSource3(long j, MdWebsocketSource mdWebsocketSource, Continuation<? super MdWebsocketSource3> continuation) {
        super(1, continuation);
        this.$timeout = j;
        this.this$0 = mdWebsocketSource;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MdWebsocketSource3(this.$timeout, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((MdWebsocketSource3) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j = this.$timeout;
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
        Timber.INSTANCE.mo3362w("Didn't receive server keepalive within the specified timeout, reconnecting websocket", new Object[0]);
        this.this$0.resetWebsocketConnection();
        return Unit.INSTANCE;
    }
}
