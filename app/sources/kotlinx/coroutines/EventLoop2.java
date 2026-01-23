package kotlinx.coroutines;

import kotlin.Metadata;

/* compiled from: EventLoop.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lkotlinx/coroutines/BlockingEventLoop;", "Lkotlinx/coroutines/EventLoopImplBase;", "thread", "Ljava/lang/Thread;", "<init>", "(Ljava/lang/Thread;)V", "getThread", "()Ljava/lang/Thread;", "kotlinx-coroutines-core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: kotlinx.coroutines.BlockingEventLoop, reason: use source file name */
/* loaded from: classes23.dex */
public final class EventLoop2 extends EventLoopImplBase {
    private final Thread thread;

    @Override // kotlinx.coroutines.EventLoop3
    protected Thread getThread() {
        return this.thread;
    }

    public EventLoop2(Thread thread) {
        this.thread = thread;
    }
}
