package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata(m3635d1 = {"kotlinx/coroutines/ThreadPoolDispatcherKt__MultithreadedDispatchers_commonKt", "kotlinx/coroutines/ThreadPoolDispatcherKt__ThreadPoolDispatcherKt"}, m3637k = 4, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class ThreadPoolDispatcherKt {
    public static final Executors4 newFixedThreadPoolContext(int i, String str) {
        return ThreadPoolDispatcher.newFixedThreadPoolContext(i, str);
    }

    public static final Executors4 newSingleThreadContext(String str) {
        return ThreadPoolDispatcherKt__MultithreadedDispatchers_commonKt.newSingleThreadContext(str);
    }
}
