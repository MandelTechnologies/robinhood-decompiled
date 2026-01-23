package io.bitdrift.capture.timber;

import io.bitdrift.capture.Capture;
import io.bitdrift.capture.ILogger;
import io.bitdrift.capture.LogLevel;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import timber.log.Timber;

/* compiled from: CaptureTree.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J,\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\rH\u0002J\u001e\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u00162\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0017"}, m3636d2 = {"Lio/bitdrift/capture/timber/CaptureTree;", "Ltimber/log/Timber$Tree;", "internalLogger", "Lio/bitdrift/capture/ILogger;", "<init>", "(Lio/bitdrift/capture/ILogger;)V", "()V", "logger", "getLogger", "()Lio/bitdrift/capture/ILogger;", "log", "", "priority", "", "tag", "", "message", "t", "", "toCaptureLogLevel", "Lio/bitdrift/capture/LogLevel;", "extractFields", "", "capture-timber_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class CaptureTree extends Timber.Tree {
    private final ILogger internalLogger;

    /* JADX INFO: Access modifiers changed from: private */
    public static final String log$lambda$0(String message) {
        Intrinsics.checkNotNullParameter(message, "$message");
        return message;
    }

    public CaptureTree(ILogger iLogger) {
        this.internalLogger = iLogger;
    }

    public CaptureTree() {
        this(Capture.INSTANCE.logger());
    }

    private final ILogger getLogger() {
        ILogger iLogger = this.internalLogger;
        return iLogger == null ? Capture.INSTANCE.logger() : iLogger;
    }

    @Override // timber.log.Timber.Tree
    protected void log(int priority, String tag, final String message, Throwable t) {
        Intrinsics.checkNotNullParameter(message, "message");
        ILogger logger = getLogger();
        if (logger != null) {
            logger.log(toCaptureLogLevel(priority), extractFields(tag), t, new Function0() { // from class: io.bitdrift.capture.timber.CaptureTree$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CaptureTree.log$lambda$0(message);
                }
            });
        }
    }

    private final LogLevel toCaptureLogLevel(int priority) {
        if (priority == 2) {
            return LogLevel.TRACE;
        }
        if (priority == 3) {
            return LogLevel.DEBUG;
        }
        if (priority == 4) {
            return LogLevel.INFO;
        }
        if (priority == 5) {
            return LogLevel.WARNING;
        }
        if (priority == 6) {
            return LogLevel.ERROR;
        }
        return LogLevel.DEBUG;
    }

    private final Map<String, String> extractFields(String tag) {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("source", "Timber");
        if (tag != null) {
            mapCreateMapBuilder.put("tag", tag);
        }
        return MapsKt.build(mapCreateMapBuilder);
    }
}
