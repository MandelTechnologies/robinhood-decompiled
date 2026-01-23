package io.bitdrift.capture.events;

import android.content.Context;
import com.singular.sdk.internal.Constants;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import io.bitdrift.capture.ISessionReplayTarget;
import io.bitdrift.capture.LogLevel;
import io.bitdrift.capture.LogType;
import io.bitdrift.capture.LoggerImpl;
import io.bitdrift.capture.common.ErrorHandler;
import io.bitdrift.capture.common.IWindowManager;
import io.bitdrift.capture.common.MainThreadHandler;
import io.bitdrift.capture.common.Runtime;
import io.bitdrift.capture.common.Runtime3;
import io.bitdrift.capture.providers.FieldProvider3;
import io.bitdrift.capture.replay.IReplayLogger;
import io.bitdrift.capture.replay.IScreenshotLogger;
import io.bitdrift.capture.replay.ReplayCaptureMetrics;
import io.bitdrift.capture.replay.ScreenshotCaptureMetrics;
import io.bitdrift.capture.replay.SessionReplayConfiguration;
import io.bitdrift.capture.replay.SessionReplayController;
import io.bitdrift.capture.replay.internal.ReplayRect;
import io.bitdrift.capture.threading.CaptureDispatchers;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;

/* compiled from: SessionReplayTarget.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B9\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J-\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010 \u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0018H\u0016¢\u0006\u0004\b \u0010\u001bJ1\u0010)\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020!2\u0010\u0010&\u001a\f\u0012\u0004\u0012\u00020$0#j\u0002`%2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010-\u001a\u00020\u00122\u0006\u0010+\u001a\u00020!2\u0006\u0010(\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010/R$\u00101\u001a\u0004\u0018\u0001008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006:"}, m3636d2 = {"Lio/bitdrift/capture/events/SessionReplayTarget;", "Lio/bitdrift/capture/ISessionReplayTarget;", "Lio/bitdrift/capture/replay/IReplayLogger;", "Lio/bitdrift/capture/replay/IScreenshotLogger;", "Lio/bitdrift/capture/replay/SessionReplayConfiguration;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lio/bitdrift/capture/common/ErrorHandler;", "errorHandler", "Landroid/content/Context;", "context", "Lio/bitdrift/capture/LoggerImpl;", "logger", "Lio/bitdrift/capture/common/MainThreadHandler;", "mainThreadHandler", "Lio/bitdrift/capture/common/IWindowManager;", "windowManager", "<init>", "(Lio/bitdrift/capture/replay/SessionReplayConfiguration;Lio/bitdrift/capture/common/ErrorHandler;Landroid/content/Context;Lio/bitdrift/capture/LoggerImpl;Lio/bitdrift/capture/common/MainThreadHandler;Lio/bitdrift/capture/common/IWindowManager;)V", "", "captureScreen", "()V", "captureScreenshot", "", "message", "", "fields", "logDebugInternal", "(Ljava/lang/String;Ljava/util/Map;)V", "", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "logErrorInternal", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V", "logVerboseInternal", "", "encodedScreen", "", "Lio/bitdrift/capture/replay/internal/ReplayRect;", "Lio/bitdrift/capture/replay/internal/FilteredCapture;", "screen", "Lio/bitdrift/capture/replay/ReplayCaptureMetrics;", "metrics", "onScreenCaptured", "([BLjava/util/List;Lio/bitdrift/capture/replay/ReplayCaptureMetrics;)V", "compressedScreen", "Lio/bitdrift/capture/replay/ScreenshotCaptureMetrics;", "onScreenshotCaptured", "([BLio/bitdrift/capture/replay/ScreenshotCaptureMetrics;)V", "Lio/bitdrift/capture/LoggerImpl;", "Lio/bitdrift/capture/common/Runtime;", "runtime", "Lio/bitdrift/capture/common/Runtime;", "getRuntime$platform_jvm_capture_capture_logger_lib_kt", "()Lio/bitdrift/capture/common/Runtime;", "setRuntime$platform_jvm_capture_capture_logger_lib_kt", "(Lio/bitdrift/capture/common/Runtime;)V", "Lio/bitdrift/capture/replay/SessionReplayController;", "sessionReplayController", "Lio/bitdrift/capture/replay/SessionReplayController;", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class SessionReplayTarget implements ISessionReplayTarget, IReplayLogger, IScreenshotLogger {
    private final LoggerImpl logger;
    private Runtime runtime;
    private final SessionReplayController sessionReplayController;

    public SessionReplayTarget(SessionReplayConfiguration configuration, ErrorHandler errorHandler, Context context, LoggerImpl logger, MainThreadHandler mainThreadHandler, IWindowManager windowManager) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(mainThreadHandler, "mainThreadHandler");
        Intrinsics.checkNotNullParameter(windowManager, "windowManager");
        this.logger = logger;
        this.sessionReplayController = new SessionReplayController(errorHandler, this, this, configuration, context, mainThreadHandler, CaptureDispatchers.SessionReplay.INSTANCE.get_executorService(), windowManager);
    }

    public /* synthetic */ SessionReplayTarget(SessionReplayConfiguration sessionReplayConfiguration, ErrorHandler errorHandler, Context context, LoggerImpl loggerImpl, MainThreadHandler mainThreadHandler, IWindowManager iWindowManager, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sessionReplayConfiguration, errorHandler, context, loggerImpl, (i & 16) != 0 ? new MainThreadHandler() : mainThreadHandler, iWindowManager);
    }

    public final void setRuntime$platform_jvm_capture_capture_logger_lib_kt(Runtime runtime) {
        this.runtime = runtime;
    }

    @Override // io.bitdrift.capture.ISessionReplayTarget
    public void captureScreen() {
        this.sessionReplayController.captureScreen(!(this.runtime != null ? r0.isEnabled(Runtime3.SESSION_REPLAY_COMPOSE.INSTANCE) : Runtime3.SESSION_REPLAY_COMPOSE.INSTANCE.getDefaultValue()));
    }

    @Override // io.bitdrift.capture.replay.IReplayLogger
    public void onScreenCaptured(byte[] encodedScreen, List<ReplayRect> screen, ReplayCaptureMetrics metrics) {
        Intrinsics.checkNotNullParameter(encodedScreen, "encodedScreen");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("screen", FieldProvider3.toFieldValue(encodedScreen));
        mapCreateMapBuilder.putAll(FieldProvider3.toFields(metrics.toMap()));
        this.logger.m3295xd379d932(MapsKt.build(mapCreateMapBuilder), metrics.getParseDuration());
    }

    @Override // io.bitdrift.capture.ISessionReplayTarget
    public void captureScreenshot() {
        this.sessionReplayController.captureScreenshot();
    }

    @Override // io.bitdrift.capture.replay.IScreenshotLogger
    public void onScreenshotCaptured(byte[] compressedScreen, ScreenshotCaptureMetrics metrics) {
        Intrinsics.checkNotNullParameter(compressedScreen, "compressedScreen");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("screen_px", FieldProvider3.toFieldValue(compressedScreen));
        mapCreateMapBuilder.putAll(FieldProvider3.toFields(metrics.toMap()));
        this.logger.m3296x64009a78(MapsKt.build(mapCreateMapBuilder), Duration3.toDuration(metrics.getScreenshotTimeMs(), DurationUnitJvm.MILLISECONDS));
    }

    @Override // io.bitdrift.capture.replay.IInternalLogger
    public void logVerboseInternal(final String message, Map<String, String> fields) {
        Intrinsics.checkNotNullParameter(message, "message");
        LoggerImpl.logFields$default(this.logger, LogType.INTERNALSDK, LogLevel.TRACE, FieldProvider3.toFields(fields), null, null, false, new Function0<String>() { // from class: io.bitdrift.capture.events.SessionReplayTarget.logVerboseInternal.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return message;
            }
        }, 56, null);
    }

    @Override // io.bitdrift.capture.replay.IInternalLogger
    public void logDebugInternal(final String message, Map<String, String> fields) {
        Intrinsics.checkNotNullParameter(message, "message");
        LoggerImpl.logFields$default(this.logger, LogType.INTERNALSDK, LogLevel.DEBUG, FieldProvider3.toFields(fields), null, null, false, new Function0<String>() { // from class: io.bitdrift.capture.events.SessionReplayTarget.logDebugInternal.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return message;
            }
        }, 56, null);
    }

    @Override // io.bitdrift.capture.replay.IInternalLogger
    public void logErrorInternal(final String message, Throwable e, Map<String, String> fields) {
        Intrinsics.checkNotNullParameter(message, "message");
        LoggerImpl loggerImpl = this.logger;
        LoggerImpl.logFields$default(loggerImpl, LogType.INTERNALSDK, LogLevel.ERROR, loggerImpl.extractFields$platform_jvm_capture_capture_logger_lib_kt(fields, e), null, null, false, new Function0<String>() { // from class: io.bitdrift.capture.events.SessionReplayTarget.logErrorInternal.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return message;
            }
        }, 56, null);
    }
}
