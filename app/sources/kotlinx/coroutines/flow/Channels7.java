package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Channels.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", m3645f = "Channels.kt", m3646l = {32, 33}, m3647m = "emitAllImpl$FlowKt__ChannelsKt")
/* renamed from: kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1, reason: use source file name */
/* loaded from: classes23.dex */
final class Channels7<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    Channels7(Continuation<? super Channels7> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return Channels6.emitAllImpl$FlowKt__ChannelsKt(null, null, false, this);
    }
}
