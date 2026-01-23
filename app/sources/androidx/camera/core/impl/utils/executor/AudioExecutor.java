package androidx.camera.core.impl.utils.executor;

import android.os.Process;
import androidx.camera.core.impl.utils.executor.AudioExecutor;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class AudioExecutor implements Executor {
    private static volatile Executor sExecutor;
    private final ExecutorService mAudioService = Executors.newFixedThreadPool(2, new ThreadFactoryC08561());

    /* renamed from: androidx.camera.core.impl.utils.executor.AudioExecutor$1 */
    class ThreadFactoryC08561 implements ThreadFactory {
        private final AtomicInteger mThreadId = new AtomicInteger(0);

        ThreadFactoryC08561() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(final Runnable runnable) {
            Thread thread = new Thread(new Runnable() { // from class: androidx.camera.core.impl.utils.executor.AudioExecutor$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() throws SecurityException, IllegalArgumentException {
                    AudioExecutor.ThreadFactoryC08561.$r8$lambda$AucAKYZhzjyWXfQO0hPnYRmscFY(runnable);
                }
            });
            thread.setName(String.format(Locale.US, "CameraX-camerax_audio_%d", Integer.valueOf(this.mThreadId.getAndIncrement())));
            return thread;
        }

        public static /* synthetic */ void $r8$lambda$AucAKYZhzjyWXfQO0hPnYRmscFY(Runnable runnable) throws SecurityException, IllegalArgumentException {
            Process.setThreadPriority(-16);
            runnable.run();
        }
    }

    static Executor getInstance() {
        if (sExecutor != null) {
            return sExecutor;
        }
        synchronized (AudioExecutor.class) {
            try {
                if (sExecutor == null) {
                    sExecutor = new AudioExecutor();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sExecutor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.mAudioService.execute(runnable);
    }
}
