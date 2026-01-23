package io.bitdrift.capture.threading;

import io.bitdrift.capture.common.IBackgroundThreadHandler;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CaptureDispatchers.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00102\u00020\u0001:\u0004\u000f\u0010\u0011\u0012B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0016\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\u0013\u0014\u0015¨\u0006\u0016"}, m3636d2 = {"Lio/bitdrift/capture/threading/CaptureDispatchers;", "Lio/bitdrift/capture/common/IBackgroundThreadHandler;", "threadName", "", "(Ljava/lang/String;)V", "_executorService", "Ljava/util/concurrent/ExecutorService;", "executorService", "getExecutorService", "()Ljava/util/concurrent/ExecutorService;", "buildExecutorService", "runAsync", "", "task", "Lkotlin/Function0;", "CommonBackground", "Companion", "Network", "SessionReplay", "Lio/bitdrift/capture/threading/CaptureDispatchers$CommonBackground;", "Lio/bitdrift/capture/threading/CaptureDispatchers$Network;", "Lio/bitdrift/capture/threading/CaptureDispatchers$SessionReplay;", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public abstract class CaptureDispatchers implements IBackgroundThreadHandler {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Set<CaptureDispatchers> initializedDispatchers = new LinkedHashSet();
    private ExecutorService _executorService;

    public /* synthetic */ CaptureDispatchers(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private CaptureDispatchers(String str) {
        ExecutorService executorServiceBuildExecutorService = buildExecutorService(str);
        INSTANCE.register(this);
        this._executorService = executorServiceBuildExecutorService;
    }

    /* renamed from: getExecutorService, reason: from getter */
    public final ExecutorService get_executorService() {
        return this._executorService;
    }

    @Override // io.bitdrift.capture.common.IBackgroundThreadHandler
    public void runAsync(final Function0<Unit> task) {
        Intrinsics.checkNotNullParameter(task, "task");
        get_executorService().execute(new Runnable(task) { // from class: io.bitdrift.capture.threading.CaptureDispatchers$sam$java_lang_Runnable$0
            private final /* synthetic */ Function0 function;

            {
                Intrinsics.checkNotNullParameter(task, "function");
                this.function = task;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.function.invoke();
            }
        });
    }

    /* compiled from: CaptureDispatchers.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, m3636d2 = {"Lio/bitdrift/capture/threading/CaptureDispatchers$CommonBackground;", "Lio/bitdrift/capture/threading/CaptureDispatchers;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class CommonBackground extends CaptureDispatchers {
        public static final CommonBackground INSTANCE = new CommonBackground();

        public boolean equals(Object other) {
            return this == other || (other instanceof CommonBackground);
        }

        public int hashCode() {
            return 923854073;
        }

        public String toString() {
            return "CommonBackground";
        }

        private CommonBackground() {
            super("background-thread-worker", null);
        }
    }

    /* compiled from: CaptureDispatchers.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, m3636d2 = {"Lio/bitdrift/capture/threading/CaptureDispatchers$Network;", "Lio/bitdrift/capture/threading/CaptureDispatchers;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Network extends CaptureDispatchers {
        public static final Network INSTANCE = new Network();

        public boolean equals(Object other) {
            return this == other || (other instanceof Network);
        }

        public int hashCode() {
            return 1489680046;
        }

        public String toString() {
            return "Network";
        }

        private Network() {
            super("network.okhttp", null);
        }
    }

    /* compiled from: CaptureDispatchers.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, m3636d2 = {"Lio/bitdrift/capture/threading/CaptureDispatchers$SessionReplay;", "Lio/bitdrift/capture/threading/CaptureDispatchers;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class SessionReplay extends CaptureDispatchers {
        public static final SessionReplay INSTANCE = new SessionReplay();

        public boolean equals(Object other) {
            return this == other || (other instanceof SessionReplay);
        }

        public int hashCode() {
            return 2106649245;
        }

        public String toString() {
            return "SessionReplay";
        }

        private SessionReplay() {
            super("session-replay", null);
        }
    }

    private final ExecutorService buildExecutorService(final String threadName) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: io.bitdrift.capture.threading.CaptureDispatchers.buildExecutorService.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "io.bitdrift.capture." + threadName);
            }
        });
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        return executorServiceNewSingleThreadExecutor;
    }

    /* compiled from: CaptureDispatchers.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lio/bitdrift/capture/threading/CaptureDispatchers$Companion;", "", "<init>", "()V", "Lio/bitdrift/capture/threading/CaptureDispatchers;", "dispatcher", "", "register", "(Lio/bitdrift/capture/threading/CaptureDispatchers;)V", "", "CAPTURE_EXECUTOR_SERVICE_NAME", "Ljava/lang/String;", "", "initializedDispatchers", "Ljava/util/Set;", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void register(CaptureDispatchers dispatcher) {
            CaptureDispatchers.initializedDispatchers.add(dispatcher);
        }
    }
}
