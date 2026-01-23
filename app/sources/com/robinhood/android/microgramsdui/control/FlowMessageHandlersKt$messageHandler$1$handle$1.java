package com.robinhood.android.microgramsdui.control;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.microgramsdui.control.FlowMessageHandlersKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FlowMessageHandlers.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
@DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.control.FlowMessageHandlersKt$messageHandler$1", m3645f = "FlowMessageHandlers.kt", m3646l = {16}, m3647m = "handle")
/* loaded from: classes8.dex */
public final class FlowMessageHandlersKt$messageHandler$1$handle$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FlowMessageHandlersKt.C218791 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowMessageHandlersKt$messageHandler$1$handle$1(FlowMessageHandlersKt.C218791 c218791, Continuation<? super FlowMessageHandlersKt$messageHandler$1$handle$1> continuation) {
        super(continuation);
        this.this$0 = c218791;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.handle(null, this);
    }
}
