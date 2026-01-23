package io.bitdrift.capture.events;

import android.content.Context;
import io.bitdrift.capture.LoggerImpl;
import io.bitdrift.capture.attributes.ClientAttributes;
import io.bitdrift.capture.common.Runtime;
import io.bitdrift.capture.common.Runtime3;
import java.io.File;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.DurationUnitJvm;
import kotlin.time.TimeSource;
import kotlin.time.TimedValue;

/* compiled from: AppUpdateListenerLogger.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\b\u0010\u0014\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lio/bitdrift/capture/events/AppUpdateListenerLogger;", "Lio/bitdrift/capture/events/IEventListenerLogger;", "logger", "Lio/bitdrift/capture/LoggerImpl;", "clientAttributes", "Lio/bitdrift/capture/attributes/ClientAttributes;", "context", "Landroid/content/Context;", "runtime", "Lio/bitdrift/capture/common/Runtime;", "executor", "Ljava/util/concurrent/ExecutorService;", "(Lio/bitdrift/capture/LoggerImpl;Lio/bitdrift/capture/attributes/ClientAttributes;Landroid/content/Context;Lio/bitdrift/capture/common/Runtime;Ljava/util/concurrent/ExecutorService;)V", "maybeLogAppUpdate", "", "appVersion", "", "appVersionCode", "", "start", "stop", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class AppUpdateListenerLogger implements IEventListenerLogger {
    private final ClientAttributes clientAttributes;
    private final Context context;
    private final ExecutorService executor;
    private final LoggerImpl logger;
    private final Runtime runtime;

    @Override // io.bitdrift.capture.events.IEventListenerLogger
    public void stop() {
    }

    public AppUpdateListenerLogger(LoggerImpl logger, ClientAttributes clientAttributes, Context context, Runtime runtime, ExecutorService executor) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(clientAttributes, "clientAttributes");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(runtime, "runtime");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.logger = logger;
        this.clientAttributes = clientAttributes;
        this.context = context;
        this.runtime = runtime;
        this.executor = executor;
    }

    @Override // io.bitdrift.capture.events.IEventListenerLogger
    public void start() {
        this.executor.execute(new Runnable() { // from class: io.bitdrift.capture.events.AppUpdateListenerLogger.start.1
            @Override // java.lang.Runnable
            public final void run() {
                AppUpdateListenerLogger appUpdateListenerLogger = AppUpdateListenerLogger.this;
                appUpdateListenerLogger.maybeLogAppUpdate(appUpdateListenerLogger.clientAttributes.getAppVersion(), AppUpdateListenerLogger.this.clientAttributes.getAppVersionCode());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void maybeLogAppUpdate(String appVersion, long appVersionCode) {
        if (this.runtime.isEnabled(Runtime3.APP_UPDATE_EVENTS.INSTANCE) && this.logger.shouldLogAppUpdate$platform_jvm_capture_capture_logger_lib_kt(appVersion, appVersionCode)) {
            TimedValue timedValue = new TimedValue(Long.valueOf(new File(this.context.getApplicationInfo().sourceDir).length()), TimeSource.Monotonic.ValueTimeMark.m28775elapsedNowUwyO8pc(TimeSource.Monotonic.INSTANCE.m28773markNowz9LOYto()), null);
            this.logger.logAppUpdate$platform_jvm_capture_capture_logger_lib_kt(appVersion, appVersionCode, ((Number) timedValue.getValue()).longValue(), Duration.m28758toDoubleimpl(timedValue.getDuration(), DurationUnitJvm.SECONDS));
        }
    }
}
