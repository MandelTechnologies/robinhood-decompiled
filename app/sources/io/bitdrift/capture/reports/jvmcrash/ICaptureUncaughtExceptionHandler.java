package io.bitdrift.capture.reports.jvmcrash;

import java.lang.Thread;
import kotlin.Metadata;

/* compiled from: ICaptureUncaughtExceptionHandler.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lio/bitdrift/capture/reports/jvmcrash/ICaptureUncaughtExceptionHandler;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "Lio/bitdrift/capture/reports/jvmcrash/JvmCrashListener;", "jvmCrashListener", "", "install", "(Lio/bitdrift/capture/reports/jvmcrash/JvmCrashListener;)V", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface ICaptureUncaughtExceptionHandler extends Thread.UncaughtExceptionHandler {
    void install(JvmCrashListener jvmCrashListener);
}
