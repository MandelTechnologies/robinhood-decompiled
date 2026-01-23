package com.robinhood.websocket.p410dx;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DxWebsocketSource.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.websocket.dx.DxWebsocketSource", m3645f = "DxWebsocketSource.kt", m3646l = {288, 78}, m3647m = "getToken$lib_websocket_dx_externalDebug")
/* renamed from: com.robinhood.websocket.dx.DxWebsocketSource$getToken$1, reason: use source file name */
/* loaded from: classes12.dex */
final class DxWebsocketSource3 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DxWebsocketSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DxWebsocketSource3(DxWebsocketSource dxWebsocketSource, Continuation<? super DxWebsocketSource3> continuation) {
        super(continuation);
        this.this$0 = dxWebsocketSource;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getToken$lib_websocket_dx_externalDebug(this);
    }
}
