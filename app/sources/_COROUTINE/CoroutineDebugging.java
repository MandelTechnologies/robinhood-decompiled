package _COROUTINE;

import kotlin.Metadata;

/* compiled from: CoroutineDebugging.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"L_COROUTINE/ArtificialStackFrames;", "", "<init>", "()V", "Ljava/lang/StackTraceElement;", "coroutineBoundary", "()Ljava/lang/StackTraceElement;", "kotlinx-coroutines-core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: _COROUTINE.ArtificialStackFrames, reason: use source file name */
/* loaded from: classes23.dex */
public final class CoroutineDebugging {
    public final StackTraceElement coroutineBoundary() {
        return CoroutineDebugging2.artificialFrame(new Exception(), CoroutineDebugging3.class.getSimpleName());
    }
}
