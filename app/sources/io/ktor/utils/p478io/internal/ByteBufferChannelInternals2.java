package io.ktor.utils.p478io.internal;

import io.ktor.utils.p478io.ByteBufferChannel;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlinx.coroutines.Job;

/* compiled from: ByteBufferChannelInternals.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lio/ktor/utils/io/internal/JoiningState;", "", "", "complete", "()V", "Lio/ktor/utils/io/ByteBufferChannel;", "delegatedTo", "Lio/ktor/utils/io/ByteBufferChannel;", "getDelegatedTo", "()Lio/ktor/utils/io/ByteBufferChannel;", "", "delegateClose", "Z", "getDelegateClose", "()Z", "ktor-io"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.utils.io.internal.JoiningState, reason: use source file name */
/* loaded from: classes14.dex */
public final class ByteBufferChannelInternals2 {
    private static final /* synthetic */ AtomicReferenceFieldUpdater _closeWaitJob$FU = AtomicReferenceFieldUpdater.newUpdater(ByteBufferChannelInternals2.class, Object.class, "_closeWaitJob");
    private volatile /* synthetic */ Object _closeWaitJob;
    private volatile /* synthetic */ int closed;
    private final boolean delegateClose;
    private final ByteBufferChannel delegatedTo;

    public final boolean getDelegateClose() {
        return this.delegateClose;
    }

    public final ByteBufferChannel getDelegatedTo() {
        return this.delegatedTo;
    }

    public final void complete() {
        this.closed = 1;
        Job job = (Job) _closeWaitJob$FU.getAndSet(this, null);
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
    }
}
