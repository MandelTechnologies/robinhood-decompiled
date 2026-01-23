package io.ktor.utils.p478io;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Coroutines.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m3636d2 = {"Lio/ktor/utils/io/ChannelScope;", "", "Lio/ktor/utils/io/WriterScope;", "Lkotlinx/coroutines/CoroutineScope;", "delegate", "Lio/ktor/utils/io/ByteChannel;", "channel", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lio/ktor/utils/io/ByteChannel;)V", "Lio/ktor/utils/io/ByteChannel;", "getChannel", "()Lio/ktor/utils/io/ByteChannel;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "ktor-io"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.utils.io.ChannelScope, reason: use source file name */
/* loaded from: classes14.dex */
final class Coroutines2 implements CoroutineScope, Coroutines6 {
    private final /* synthetic */ CoroutineScope $$delegate_0;
    private final ByteChannelCtor channel;

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    public Coroutines2(CoroutineScope delegate, ByteChannelCtor channel) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.channel = channel;
        this.$$delegate_0 = delegate;
    }

    @Override // io.ktor.utils.p478io.Coroutines6
    public ByteChannelCtor getChannel() {
        return this.channel;
    }
}
