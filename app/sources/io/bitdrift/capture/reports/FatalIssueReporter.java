package io.bitdrift.capture.reports;

import android.util.Log;
import io.bitdrift.capture.common.MainThreadHandler;
import io.bitdrift.capture.providers.FieldProvider3;
import io.bitdrift.capture.providers.FieldProvider4;
import io.bitdrift.capture.reports.FatalIssueMechanism;
import io.bitdrift.capture.reports.FatalIssueReporterState;
import io.bitdrift.capture.reports.exitinfo.ILatestAppExitInfoProvider;
import io.bitdrift.capture.reports.exitinfo.LatestAppExitInfoProvider;
import io.bitdrift.capture.reports.jvmcrash.CaptureUncaughtExceptionHandler;
import io.bitdrift.capture.reports.jvmcrash.ICaptureUncaughtExceptionHandler;
import io.bitdrift.capture.reports.jvmcrash.JvmCrashListener;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.DurationUnitJvm;

/* compiled from: FatalIssueReporter.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001(B%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR*\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b8\u0000@BX\u0081\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\rR\u0016\u0010&\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, m3636d2 = {"Lio/bitdrift/capture/reports/FatalIssueReporter;", "Lio/bitdrift/capture/reports/IFatalIssueReporter;", "Lio/bitdrift/capture/reports/jvmcrash/JvmCrashListener;", "Lio/bitdrift/capture/common/MainThreadHandler;", "mainThreadHandler", "Lio/bitdrift/capture/reports/exitinfo/ILatestAppExitInfoProvider;", "latestAppExitInfoProvider", "Lio/bitdrift/capture/reports/jvmcrash/ICaptureUncaughtExceptionHandler;", "captureUncaughtExceptionHandler", "<init>", "(Lio/bitdrift/capture/common/MainThreadHandler;Lio/bitdrift/capture/reports/exitinfo/ILatestAppExitInfoProvider;Lio/bitdrift/capture/reports/jvmcrash/ICaptureUncaughtExceptionHandler;)V", "Lio/bitdrift/capture/reports/FatalIssueReporterStatus;", "buildDefaultReporterStatus", "()Lio/bitdrift/capture/reports/FatalIssueReporterStatus;", "Lio/bitdrift/capture/reports/FatalIssueMechanism;", "getReportingMechanism", "()Lio/bitdrift/capture/reports/FatalIssueMechanism;", "", "", "Lio/bitdrift/capture/providers/FieldValue;", "getLogStatusFieldsMap", "()Ljava/util/Map;", "Ljava/lang/Thread;", "thread", "", "throwable", "", "onJvmCrash", "(Ljava/lang/Thread;Ljava/lang/Throwable;)V", "Lio/bitdrift/capture/common/MainThreadHandler;", "Lio/bitdrift/capture/reports/exitinfo/ILatestAppExitInfoProvider;", "Lio/bitdrift/capture/reports/jvmcrash/ICaptureUncaughtExceptionHandler;", "<set-?>", "fatalIssueReporterStatus", "Lio/bitdrift/capture/reports/FatalIssueReporterStatus;", "getFatalIssueReporterStatus$platform_jvm_capture_capture_logger_lib_kt", "getFatalIssueReporterStatus$platform_jvm_capture_capture_logger_lib_kt$annotations", "()V", "initializationCallerThread", "Ljava/lang/String;", "Companion", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class FatalIssueReporter implements IFatalIssueReporter, JvmCrashListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ICaptureUncaughtExceptionHandler captureUncaughtExceptionHandler;
    private FatalIssueReporterStatus fatalIssueReporterStatus;
    private String initializationCallerThread;
    private final ILatestAppExitInfoProvider latestAppExitInfoProvider;
    private final MainThreadHandler mainThreadHandler;

    public FatalIssueReporter(MainThreadHandler mainThreadHandler, ILatestAppExitInfoProvider latestAppExitInfoProvider, ICaptureUncaughtExceptionHandler captureUncaughtExceptionHandler) {
        Intrinsics.checkNotNullParameter(mainThreadHandler, "mainThreadHandler");
        Intrinsics.checkNotNullParameter(latestAppExitInfoProvider, "latestAppExitInfoProvider");
        Intrinsics.checkNotNullParameter(captureUncaughtExceptionHandler, "captureUncaughtExceptionHandler");
        this.mainThreadHandler = mainThreadHandler;
        this.latestAppExitInfoProvider = latestAppExitInfoProvider;
        this.captureUncaughtExceptionHandler = captureUncaughtExceptionHandler;
        this.fatalIssueReporterStatus = buildDefaultReporterStatus();
        this.initializationCallerThread = FatalIssueReporterState.NotInitialized.INSTANCE.getReadableType();
    }

    public /* synthetic */ FatalIssueReporter(MainThreadHandler mainThreadHandler, ILatestAppExitInfoProvider iLatestAppExitInfoProvider, ICaptureUncaughtExceptionHandler iCaptureUncaughtExceptionHandler, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new MainThreadHandler() : mainThreadHandler, (i & 2) != 0 ? LatestAppExitInfoProvider.INSTANCE : iLatestAppExitInfoProvider, (i & 4) != 0 ? CaptureUncaughtExceptionHandler.INSTANCE : iCaptureUncaughtExceptionHandler);
    }

    @Override // io.bitdrift.capture.reports.IFatalIssueReporter
    public FatalIssueMechanism getReportingMechanism() {
        return this.fatalIssueReporterStatus.getMechanism();
    }

    @Override // io.bitdrift.capture.reports.jvmcrash.JvmCrashListener
    public void onJvmCrash(Thread thread, Throwable throwable) {
        Intrinsics.checkNotNullParameter(thread, "thread");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        try {
            Result.Companion companion = Result.INSTANCE;
            Intrinsics.throwUninitializedPropertyAccessException("fatalIssueReporterProcessor");
            System.currentTimeMillis();
            Thread.getAllStackTraces();
            throw null;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(Result.m28550constructorimpl(ResultKt.createFailure(th)));
            if (thM28553exceptionOrNullimpl == null) {
                return;
            }
            Log.e("BitdriftCapture", "Error while initializing reporter for " + FatalIssueMechanism.BuiltIn.INSTANCE + ". " + thM28553exceptionOrNullimpl);
        }
    }

    @Override // io.bitdrift.capture.reports.IFatalIssueReporter
    public Map<String, FieldProvider4> getLogStatusFieldsMap() {
        return MapsKt.mapOf(Tuples4.m3642to("_fatal_reporter_init_thread", FieldProvider3.toFieldValue(this.initializationCallerThread)), Tuples4.m3642to("_fatal_issue_reporting_state", FieldProvider3.toFieldValue(this.fatalIssueReporterStatus.getState().getReadableType())), Tuples4.m3642to("_fatal_issue_reporting_duration_ms", FieldProvider3.toFieldValue(INSTANCE.getDuration(this.fatalIssueReporterStatus))));
    }

    private final FatalIssueReporterStatus buildDefaultReporterStatus() {
        return new FatalIssueReporterStatus(FatalIssueReporterState.NotInitialized.INSTANCE, null, FatalIssueMechanism.None.INSTANCE, 2, null);
    }

    /* compiled from: FatalIssueReporter.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\t¨\u0006\u000f"}, m3636d2 = {"Lio/bitdrift/capture/reports/FatalIssueReporter$Companion;", "", "<init>", "()V", "Lio/bitdrift/capture/reports/FatalIssueReporterStatus;", "", "getDuration", "(Lio/bitdrift/capture/reports/FatalIssueReporterStatus;)Ljava/lang/String;", "CONFIGURATION_FILE_PATH", "Ljava/lang/String;", "DESTINATION_FILE_PATH", "FATAL_ISSUE_REPORTING_DURATION_MILLI_KEY", "FATAL_ISSUE_REPORTING_INIT_THREAD_KEY", "FATAL_ISSUE_REPORTING_STATE_KEY", "LAST_MODIFIED_TIME_ATTRIBUTE", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getDuration(FatalIssueReporterStatus fatalIssueReporterStatus) {
            String string2;
            Intrinsics.checkNotNullParameter(fatalIssueReporterStatus, "<this>");
            Duration duration = fatalIssueReporterStatus.getDuration();
            return (duration == null || (string2 = Double.valueOf(Duration.m28758toDoubleimpl(duration.getRawValue(), DurationUnitJvm.MILLISECONDS)).toString()) == null) ? "n/a" : string2;
        }
    }
}
