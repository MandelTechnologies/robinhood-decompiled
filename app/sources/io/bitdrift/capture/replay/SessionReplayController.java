package io.bitdrift.capture.replay;

import android.content.Context;
import com.singular.sdk.internal.Constants;
import io.bitdrift.capture.common.ErrorHandler;
import io.bitdrift.capture.common.IWindowManager;
import io.bitdrift.capture.common.MainThreadHandler;
import io.bitdrift.capture.replay.IInternalLogger;
import io.bitdrift.capture.replay.internal.DisplayManagers;
import io.bitdrift.capture.replay.internal.ReplayCaptureEngine;
import io.bitdrift.capture.replay.internal.ScreenshotCaptureEngine;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SessionReplayController.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cBE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u0018R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lio/bitdrift/capture/replay/SessionReplayController;", "", "errorHandler", "Lio/bitdrift/capture/common/ErrorHandler;", "replayLogger", "Lio/bitdrift/capture/replay/IReplayLogger;", "screenshotLogger", "Lio/bitdrift/capture/replay/IScreenshotLogger;", "sessionReplayConfiguration", "Lio/bitdrift/capture/replay/SessionReplayConfiguration;", "context", "Landroid/content/Context;", "mainThreadHandler", "Lio/bitdrift/capture/common/MainThreadHandler;", "executor", "Ljava/util/concurrent/ExecutorService;", "windowManager", "Lio/bitdrift/capture/common/IWindowManager;", "(Lio/bitdrift/capture/common/ErrorHandler;Lio/bitdrift/capture/replay/IReplayLogger;Lio/bitdrift/capture/replay/IScreenshotLogger;Lio/bitdrift/capture/replay/SessionReplayConfiguration;Landroid/content/Context;Lio/bitdrift/capture/common/MainThreadHandler;Ljava/util/concurrent/ExecutorService;Lio/bitdrift/capture/common/IWindowManager;)V", "replayCaptureEngine", "Lio/bitdrift/capture/replay/internal/ReplayCaptureEngine;", "screenshotCaptureEngine", "Lio/bitdrift/capture/replay/internal/ScreenshotCaptureEngine;", "captureScreen", "", "skipReplayComposeViews", "", "captureScreenshot", "L", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class SessionReplayController {
    private final ReplayCaptureEngine replayCaptureEngine;
    private final ScreenshotCaptureEngine screenshotCaptureEngine;

    public SessionReplayController(ErrorHandler errorHandler, IReplayLogger replayLogger, IScreenshotLogger screenshotLogger, SessionReplayConfiguration sessionReplayConfiguration, Context context, MainThreadHandler mainThreadHandler, ExecutorService executor, IWindowManager windowManager) {
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(replayLogger, "replayLogger");
        Intrinsics.checkNotNullParameter(screenshotLogger, "screenshotLogger");
        Intrinsics.checkNotNullParameter(sessionReplayConfiguration, "sessionReplayConfiguration");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mainThreadHandler, "mainThreadHandler");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(windowManager, "windowManager");
        C45498L.INSTANCE.setLogger$platform_jvm_replay_lib_kt(replayLogger);
        this.replayCaptureEngine = new ReplayCaptureEngine(sessionReplayConfiguration, errorHandler, replayLogger, mainThreadHandler, windowManager, new DisplayManagers(context), executor, null, null, null, null, null, 3968, null);
        this.screenshotCaptureEngine = new ScreenshotCaptureEngine(errorHandler, screenshotLogger, mainThreadHandler, windowManager, executor, null, 32, null);
    }

    public final void captureScreen(boolean skipReplayComposeViews) {
        this.replayCaptureEngine.captureScreen(skipReplayComposeViews);
    }

    public final void captureScreenshot() {
        this.screenshotCaptureEngine.captureScreenshot();
    }

    /* compiled from: SessionReplayController.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\bR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lio/bitdrift/capture/replay/SessionReplayController$L;", "", "<init>", "()V", "", "message", "", "d", "(Ljava/lang/String;)V", "", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "(Ljava/lang/Throwable;Ljava/lang/String;)V", "v", "Lio/bitdrift/capture/replay/IReplayLogger;", "logger", "Lio/bitdrift/capture/replay/IReplayLogger;", "getLogger$platform_jvm_replay_lib_kt", "()Lio/bitdrift/capture/replay/IReplayLogger;", "setLogger$platform_jvm_replay_lib_kt", "(Lio/bitdrift/capture/replay/IReplayLogger;)V", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: io.bitdrift.capture.replay.SessionReplayController$L */
    public static final class C45498L {
        private static IReplayLogger logger;
        public static final C45498L INSTANCE = new C45498L();
        public static final int $stable = 8;

        private C45498L() {
        }

        public final void setLogger$platform_jvm_replay_lib_kt(IReplayLogger iReplayLogger) {
            logger = iReplayLogger;
        }

        /* renamed from: v */
        public final void m3328v(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            IReplayLogger iReplayLogger = logger;
            if (iReplayLogger != null) {
                IInternalLogger.DefaultImpls.logVerboseInternal$default(iReplayLogger, message, null, 2, null);
            }
        }

        /* renamed from: d */
        public final void m3326d(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            IReplayLogger iReplayLogger = logger;
            if (iReplayLogger != null) {
                IInternalLogger.DefaultImpls.logDebugInternal$default(iReplayLogger, message, null, 2, null);
            }
        }

        /* renamed from: e */
        public final void m3327e(Throwable e, String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            IReplayLogger iReplayLogger = logger;
            if (iReplayLogger != null) {
                IInternalLogger.DefaultImpls.logErrorInternal$default(iReplayLogger, message, e, null, 4, null);
            }
        }
    }
}
