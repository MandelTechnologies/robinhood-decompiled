package io.bitdrift.capture;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import io.bitdrift.capture.error.IErrorReporter;
import io.bitdrift.capture.network.ICaptureNetwork;
import io.bitdrift.capture.providers.FieldProvider4;
import io.bitdrift.capture.providers.session.SessionStrategyConfiguration;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: CaptureJniLibrary.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0096 ¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001d\u001a\u00020\u001aH\u0086 ¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\"\u0010#J \u0010&\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020$H\u0086 ¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020!¢\u0006\u0004\b(\u0010\u0003J \u0010+\u001a\u00020!2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010*\u001a\u00020)H\u0086 ¢\u0006\u0004\b+\u0010,J\u0018\u0010-\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001aH\u0086 ¢\u0006\u0004\b-\u0010.J\u0018\u0010/\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001aH\u0086 ¢\u0006\u0004\b/\u0010.J8\u00105\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u00100\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u001a2\u0006\u00102\u001a\u00020\u001a2\u0006\u00104\u001a\u000203H\u0086 ¢\u0006\u0004\b5\u00106Jr\u0010A\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u00020\u00042\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020<0;2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020<0;2\b\u0010?\u001a\u0004\u0018\u00010\u00042\u0006\u0010@\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020$H\u0086 ¢\u0006\u0004\bA\u0010BJ4\u0010D\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001a2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020<0;2\u0006\u0010C\u001a\u000203H\u0086 ¢\u0006\u0004\bD\u0010EJ4\u0010F\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001a2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020<0;2\u0006\u0010C\u001a\u000203H\u0086 ¢\u0006\u0004\bF\u0010EJ4\u0010G\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001a2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020<0;2\u0006\u0010C\u001a\u000203H\u0086 ¢\u0006\u0004\bG\u0010EJ4\u0010H\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001a2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020<0;2\u0006\u0010C\u001a\u000203H\u0086 ¢\u0006\u0004\bH\u0010EJ(\u0010I\u001a\u00020$2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u00100\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u001aH\u0086 ¢\u0006\u0004\bI\u0010J¨\u0006K"}, m3636d2 = {"Lio/bitdrift/capture/CaptureJniLibrary;", "Lio/bitdrift/capture/IBridge;", "<init>", "()V", "", "sdkDirectory", "apiKey", "Lio/bitdrift/capture/providers/session/SessionStrategyConfiguration;", "sessionStrategy", "Lio/bitdrift/capture/IMetadataProvider;", "metadataProvider", "Lio/bitdrift/capture/IResourceUtilizationTarget;", "resourceUtilizationTarget", "Lio/bitdrift/capture/ISessionReplayTarget;", "sessionReplayTarget", "Lio/bitdrift/capture/IEventsListenerTarget;", "eventsListenerTarget", "applicationId", "applicationVersion", "model", "Lio/bitdrift/capture/network/ICaptureNetwork;", "network", "Lio/bitdrift/capture/IPreferences;", "preferences", "Lio/bitdrift/capture/error/IErrorReporter;", "errorReporter", "", "createLogger", "(Ljava/lang/String;Ljava/lang/String;Lio/bitdrift/capture/providers/session/SessionStrategyConfiguration;Lio/bitdrift/capture/IMetadataProvider;Lio/bitdrift/capture/IResourceUtilizationTarget;Lio/bitdrift/capture/ISessionReplayTarget;Lio/bitdrift/capture/IEventsListenerTarget;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/bitdrift/capture/network/ICaptureNetwork;Lio/bitdrift/capture/IPreferences;Lio/bitdrift/capture/error/IErrorReporter;)J", "loggerId", "getSessionId", "(J)Ljava/lang/String;", "message", "", "debugError", "(Ljava/lang/String;)V", "", "blocking", "flush", "(JZ)V", AnalyticsStrings.NOTIF_STACK_EVENT_LOAD, "Lio/bitdrift/capture/StackTraceProvider;", "stackTraceProvider", "reportError", "(Ljava/lang/String;Lio/bitdrift/capture/StackTraceProvider;)V", "startLogger", "(J)V", "startNewSession", "appVersion", "appVersionCode", "appInstallSizeBytes", "", "durationS", "writeAppUpdateLog", "(JLjava/lang/String;JJD)V", "", "logType", "logLevel", "log", "", "Lio/bitdrift/capture/providers/FieldValue;", "fields", "matchingFields", "overrideExpectedPreviousProcessSessionId", "overrideOccurredAtUnixMilliseconds", "writeLog", "(JIILjava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;JZ)V", "duration", "writeResourceUtilizationLog", "(JLjava/util/Map;D)V", "writeSDKStartLog", "writeSessionReplayScreenLog", "writeSessionReplayScreenshotLog", "shouldWriteAppUpdateLog", "(JLjava/lang/String;J)Z", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class CaptureJniLibrary implements IBridge {
    public static final CaptureJniLibrary INSTANCE = new CaptureJniLibrary();

    @Override // io.bitdrift.capture.IBridge
    public native long createLogger(String sdkDirectory, String apiKey, SessionStrategyConfiguration sessionStrategy, IMetadataProvider metadataProvider, IResourceUtilizationTarget resourceUtilizationTarget, ISessionReplayTarget sessionReplayTarget, IEventsListenerTarget eventsListenerTarget, String applicationId, String applicationVersion, String model, ICaptureNetwork network, IPreferences preferences, IErrorReporter errorReporter);

    public final native void debugError(String message);

    public final native void flush(long loggerId, boolean blocking);

    public final native String getSessionId(long loggerId);

    public final native void reportError(String message, CaptureJniLibrary2 stackTraceProvider);

    public final native boolean shouldWriteAppUpdateLog(long loggerId, String appVersion, long appVersionCode);

    public final native void startLogger(long loggerId);

    public final native void startNewSession(long loggerId);

    public final native void writeAppUpdateLog(long loggerId, String appVersion, long appVersionCode, long appInstallSizeBytes, double durationS);

    public final native void writeLog(long loggerId, int logType, int logLevel, String log, Map<String, ? extends FieldProvider4> fields, Map<String, ? extends FieldProvider4> matchingFields, String overrideExpectedPreviousProcessSessionId, long overrideOccurredAtUnixMilliseconds, boolean blocking);

    public final native void writeResourceUtilizationLog(long loggerId, Map<String, ? extends FieldProvider4> fields, double duration);

    public final native void writeSDKStartLog(long loggerId, Map<String, ? extends FieldProvider4> fields, double duration);

    public final native void writeSessionReplayScreenLog(long loggerId, Map<String, ? extends FieldProvider4> fields, double duration);

    public final native void writeSessionReplayScreenshotLog(long loggerId, Map<String, ? extends FieldProvider4> fields, double duration);

    private CaptureJniLibrary() {
    }

    public final void load() {
        System.loadLibrary("capture");
    }
}
