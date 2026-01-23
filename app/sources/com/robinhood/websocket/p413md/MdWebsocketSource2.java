package com.robinhood.websocket.p413md;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;

/* compiled from: MdWebsocketSource.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.websocket.md.MdWebsocketSource$configureKeepAlive$1", m3645f = "MdWebsocketSource.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.websocket.md.MdWebsocketSource$configureKeepAlive$1, reason: use source file name */
/* loaded from: classes12.dex */
final class MdWebsocketSource2 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ long $clientKeepAliveTimeoutInMs;
    int label;
    final /* synthetic */ MdWebsocketSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MdWebsocketSource2(long j, MdWebsocketSource mdWebsocketSource, Continuation<? super MdWebsocketSource2> continuation) {
        super(1, continuation);
        this.$clientKeepAliveTimeoutInMs = j;
        this.this$0 = mdWebsocketSource;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MdWebsocketSource2(this.$clientKeepAliveTimeoutInMs, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((MdWebsocketSource2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:12:0x0028). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.ResultKt.throwOnFailure(r8)
            goto L28
        Lf:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L17:
            kotlin.ResultKt.throwOnFailure(r8)
        L1a:
            long r3 = r7.$clientKeepAliveTimeoutInMs
            r8 = 2
            long r5 = (long) r8
            long r3 = r3 / r5
            r7.label = r2
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.delay(r3, r7)
            if (r8 != r0) goto L28
            return r0
        L28:
            com.robinhood.websocket.md.MdWebsocketSource r8 = r7.this$0
            com.robinhood.websocket.md.models.MdMessage r1 = com.robinhood.websocket.p413md.utils.MdMessages.getCreateKeepAliveMessage()
            com.robinhood.websocket.p413md.MdWebsocketSource.access$sendMessage(r8, r1)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.websocket.p413md.MdWebsocketSource2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
