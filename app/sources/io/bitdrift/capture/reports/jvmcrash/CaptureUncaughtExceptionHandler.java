package io.bitdrift.capture.reports.jvmcrash;

import java.lang.Thread;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CaptureUncaughtExceptionHandler.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR(\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0016\u0010\u0003\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m3636d2 = {"Lio/bitdrift/capture/reports/jvmcrash/CaptureUncaughtExceptionHandler;", "Lio/bitdrift/capture/reports/jvmcrash/ICaptureUncaughtExceptionHandler;", "<init>", "()V", "Lio/bitdrift/capture/reports/jvmcrash/JvmCrashListener;", "jvmCrashListener", "", "install", "(Lio/bitdrift/capture/reports/jvmcrash/JvmCrashListener;)V", "Ljava/lang/Thread;", "thread", "", "throwable", "uncaughtException", "(Ljava/lang/Thread;Ljava/lang/Throwable;)V", "", "crashing", "Z", "getCrashing", "()Z", "setCrashing", "(Z)V", "getCrashing$annotations", "installed", "Ljava/lang/Thread$UncaughtExceptionHandler;", "prevExceptionHandler", "Ljava/lang/Thread$UncaughtExceptionHandler;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "crashListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class CaptureUncaughtExceptionHandler implements ICaptureUncaughtExceptionHandler {
    public static final CaptureUncaughtExceptionHandler INSTANCE = new CaptureUncaughtExceptionHandler();
    private static final CopyOnWriteArrayList<JvmCrashListener> crashListeners = new CopyOnWriteArrayList<>();
    private static boolean crashing;
    private static boolean installed;
    private static Thread.UncaughtExceptionHandler prevExceptionHandler;

    private CaptureUncaughtExceptionHandler() {
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable throwable) {
        Intrinsics.checkNotNullParameter(thread, "thread");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (crashing) {
            return;
        }
        try {
            crashing = true;
            Iterator<T> it = crashListeners.iterator();
            while (it.hasNext()) {
                ((JvmCrashListener) it.next()).onJvmCrash(thread, throwable);
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = prevExceptionHandler;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, throwable);
            }
        } catch (Throwable unused) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = prevExceptionHandler;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, throwable);
            }
        }
    }

    @Override // io.bitdrift.capture.reports.jvmcrash.ICaptureUncaughtExceptionHandler
    public void install(JvmCrashListener jvmCrashListener) {
        Intrinsics.checkNotNullParameter(jvmCrashListener, "jvmCrashListener");
        crashListeners.add(jvmCrashListener);
        if (installed) {
            return;
        }
        prevExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
        installed = true;
    }
}
