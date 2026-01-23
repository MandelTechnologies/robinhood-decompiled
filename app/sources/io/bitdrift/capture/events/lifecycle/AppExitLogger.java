package io.bitdrift.capture.events.lifecycle;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import io.bitdrift.capture.LogLevel;
import io.bitdrift.capture.LogType;
import io.bitdrift.capture.LoggerImpl;
import io.bitdrift.capture.LoggerImpl2;
import io.bitdrift.capture.common.ErrorHandler;
import io.bitdrift.capture.common.IBackgroundThreadHandler;
import io.bitdrift.capture.common.Runtime;
import io.bitdrift.capture.common.Runtime3;
import io.bitdrift.capture.events.performance.IMemoryMetricsProvider;
import io.bitdrift.capture.providers.FieldProvider3;
import io.bitdrift.capture.providers.FieldProvider4;
import io.bitdrift.capture.reports.FatalIssueMechanism;
import io.bitdrift.capture.reports.exitinfo.ILatestAppExitInfoProvider;
import io.bitdrift.capture.reports.exitinfo.ILatestAppExitInfoProvider2;
import io.bitdrift.capture.reports.exitinfo.LatestAppExitInfoProvider;
import io.bitdrift.capture.reports.jvmcrash.CaptureUncaughtExceptionHandler;
import io.bitdrift.capture.reports.jvmcrash.ICaptureUncaughtExceptionHandler;
import io.bitdrift.capture.reports.jvmcrash.JvmCrashListener;
import io.bitdrift.capture.threading.CaptureDispatchers;
import io.bitdrift.capture.utils.BuildVersionChecker;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppExitLogger.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0000\u0018\u0000 D2\u00020\u0001:\u0001DB_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001d\u001a\u00020\u001c*\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u001c*\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u0013\u0010!\u001a\u00020 *\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J'\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020&0%j\u0002`'2\u0006\u0010$\u001a\u00020#H\u0003¢\u0006\u0004\b(\u0010)J/\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020&0%j\u0002`'2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020 H\u0002¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0%*\u00020#H\u0003¢\u0006\u0004\b/\u0010)J\u000f\u00101\u001a\u000200H\u0007¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000200H\u0001¢\u0006\u0004\b3\u00102J\u001f\u00105\u001a\u0002002\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020 H\u0016¢\u0006\u0004\b5\u00106J\u001b\u00108\u001a\u0002002\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\b8\u00109R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010;R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010<R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010=R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010>R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010?R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010@R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010AR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010BR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010C¨\u0006E"}, m3636d2 = {"Lio/bitdrift/capture/events/lifecycle/AppExitLogger;", "Lio/bitdrift/capture/reports/jvmcrash/JvmCrashListener;", "Lio/bitdrift/capture/LoggerImpl;", "logger", "Landroid/app/ActivityManager;", "activityManager", "Lio/bitdrift/capture/common/Runtime;", "runtime", "Lio/bitdrift/capture/common/ErrorHandler;", "errorHandler", "Lio/bitdrift/capture/utils/BuildVersionChecker;", "versionChecker", "Lio/bitdrift/capture/events/performance/IMemoryMetricsProvider;", "memoryMetricsProvider", "Lio/bitdrift/capture/common/IBackgroundThreadHandler;", "backgroundThreadHandler", "Lio/bitdrift/capture/reports/exitinfo/ILatestAppExitInfoProvider;", "latestAppExitInfoProvider", "Lio/bitdrift/capture/reports/jvmcrash/ICaptureUncaughtExceptionHandler;", "captureUncaughtExceptionHandler", "Lio/bitdrift/capture/reports/FatalIssueMechanism;", "fatalIssueMechanism", "<init>", "(Lio/bitdrift/capture/LoggerImpl;Landroid/app/ActivityManager;Lio/bitdrift/capture/common/Runtime;Lio/bitdrift/capture/common/ErrorHandler;Lio/bitdrift/capture/utils/BuildVersionChecker;Lio/bitdrift/capture/events/performance/IMemoryMetricsProvider;Lio/bitdrift/capture/common/IBackgroundThreadHandler;Lio/bitdrift/capture/reports/exitinfo/ILatestAppExitInfoProvider;Lio/bitdrift/capture/reports/jvmcrash/ICaptureUncaughtExceptionHandler;Lio/bitdrift/capture/reports/FatalIssueMechanism;)V", "", "Lio/bitdrift/capture/LogLevel;", "toLogLevel", "(I)Lio/bitdrift/capture/LogLevel;", "", "toImportanceText", "(I)Ljava/lang/String;", "toReasonText", "", "getRootCause", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Landroid/app/ApplicationExitInfo;", "applicationExitInfo", "", "Lio/bitdrift/capture/providers/FieldValue;", "Lio/bitdrift/capture/InternalFieldsMap;", "buildAppExitInternalFieldsMap", "(Landroid/app/ApplicationExitInfo;)Ljava/util/Map;", "Ljava/lang/Thread;", "thread", "throwable", "buildCrashAndMemoryFieldsMap", "(Ljava/lang/Thread;Ljava/lang/Throwable;)Ljava/util/Map;", "toMap", "", "installAppExitLogger", "()V", "logPreviousExitReasonIfAny$platform_jvm_capture_capture_logger_lib_kt", "logPreviousExitReasonIfAny", "onJvmCrash", "(Ljava/lang/Thread;Ljava/lang/Throwable;)V", "sessionId", "saveCurrentSessionId", "(Ljava/lang/String;)V", "Lio/bitdrift/capture/LoggerImpl;", "Landroid/app/ActivityManager;", "Lio/bitdrift/capture/common/Runtime;", "Lio/bitdrift/capture/common/ErrorHandler;", "Lio/bitdrift/capture/utils/BuildVersionChecker;", "Lio/bitdrift/capture/events/performance/IMemoryMetricsProvider;", "Lio/bitdrift/capture/common/IBackgroundThreadHandler;", "Lio/bitdrift/capture/reports/exitinfo/ILatestAppExitInfoProvider;", "Lio/bitdrift/capture/reports/jvmcrash/ICaptureUncaughtExceptionHandler;", "Lio/bitdrift/capture/reports/FatalIssueMechanism;", "Companion", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class AppExitLogger implements JvmCrashListener {
    private final ActivityManager activityManager;
    private final IBackgroundThreadHandler backgroundThreadHandler;
    private final ICaptureUncaughtExceptionHandler captureUncaughtExceptionHandler;
    private final ErrorHandler errorHandler;
    private final FatalIssueMechanism fatalIssueMechanism;
    private final ILatestAppExitInfoProvider latestAppExitInfoProvider;
    private final LoggerImpl logger;
    private final IMemoryMetricsProvider memoryMetricsProvider;
    private final Runtime runtime;
    private final BuildVersionChecker versionChecker;

    public AppExitLogger(LoggerImpl logger, ActivityManager activityManager, Runtime runtime, ErrorHandler errorHandler, BuildVersionChecker versionChecker, IMemoryMetricsProvider memoryMetricsProvider, IBackgroundThreadHandler backgroundThreadHandler, ILatestAppExitInfoProvider latestAppExitInfoProvider, ICaptureUncaughtExceptionHandler captureUncaughtExceptionHandler, FatalIssueMechanism fatalIssueMechanism) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(activityManager, "activityManager");
        Intrinsics.checkNotNullParameter(runtime, "runtime");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(versionChecker, "versionChecker");
        Intrinsics.checkNotNullParameter(memoryMetricsProvider, "memoryMetricsProvider");
        Intrinsics.checkNotNullParameter(backgroundThreadHandler, "backgroundThreadHandler");
        Intrinsics.checkNotNullParameter(latestAppExitInfoProvider, "latestAppExitInfoProvider");
        Intrinsics.checkNotNullParameter(captureUncaughtExceptionHandler, "captureUncaughtExceptionHandler");
        Intrinsics.checkNotNullParameter(fatalIssueMechanism, "fatalIssueMechanism");
        this.logger = logger;
        this.activityManager = activityManager;
        this.runtime = runtime;
        this.errorHandler = errorHandler;
        this.versionChecker = versionChecker;
        this.memoryMetricsProvider = memoryMetricsProvider;
        this.backgroundThreadHandler = backgroundThreadHandler;
        this.latestAppExitInfoProvider = latestAppExitInfoProvider;
        this.captureUncaughtExceptionHandler = captureUncaughtExceptionHandler;
        this.fatalIssueMechanism = fatalIssueMechanism;
    }

    public /* synthetic */ AppExitLogger(LoggerImpl loggerImpl, ActivityManager activityManager, Runtime runtime, ErrorHandler errorHandler, BuildVersionChecker buildVersionChecker, IMemoryMetricsProvider iMemoryMetricsProvider, IBackgroundThreadHandler iBackgroundThreadHandler, ILatestAppExitInfoProvider iLatestAppExitInfoProvider, ICaptureUncaughtExceptionHandler iCaptureUncaughtExceptionHandler, FatalIssueMechanism fatalIssueMechanism, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(loggerImpl, activityManager, runtime, errorHandler, (i & 16) != 0 ? new BuildVersionChecker() : buildVersionChecker, iMemoryMetricsProvider, (i & 64) != 0 ? CaptureDispatchers.CommonBackground.INSTANCE : iBackgroundThreadHandler, (i & 128) != 0 ? LatestAppExitInfoProvider.INSTANCE : iLatestAppExitInfoProvider, (i & 256) != 0 ? CaptureUncaughtExceptionHandler.INSTANCE : iCaptureUncaughtExceptionHandler, fatalIssueMechanism);
    }

    public final void installAppExitLogger() {
        if (this.runtime.isEnabled(Runtime3.APP_EXIT_EVENTS.INSTANCE)) {
            this.backgroundThreadHandler.runAsync(new Function0<Unit>() { // from class: io.bitdrift.capture.events.lifecycle.AppExitLogger.installAppExitLogger.1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    AppExitLogger.this.captureUncaughtExceptionHandler.install(AppExitLogger.this);
                    AppExitLogger.saveCurrentSessionId$default(AppExitLogger.this, null, 1, null);
                    AppExitLogger.this.m3301x60be1a8();
                }
            });
        }
    }

    public static /* synthetic */ void saveCurrentSessionId$default(AppExitLogger appExitLogger, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        appExitLogger.saveCurrentSessionId(str);
    }

    @TargetApi(30)
    public final void saveCurrentSessionId(String sessionId) {
        if (this.runtime.isEnabled(Runtime3.APP_EXIT_EVENTS.INSTANCE) && this.versionChecker.isAtLeast(30)) {
            if (sessionId == null) {
                sessionId = this.logger.getSessionId();
            }
            try {
                ActivityManager activityManager = this.activityManager;
                Charset UTF_8 = StandardCharsets.UTF_8;
                Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                byte[] bytes = sessionId.getBytes(UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                activityManager.setProcessStateSummary(bytes);
            } catch (Throwable th) {
                this.errorHandler.handleError("Failed to save session id in ActivityManager", th);
            }
        }
    }

    @TargetApi(30)
    /* renamed from: logPreviousExitReasonIfAny$platform_jvm_capture_capture_logger_lib_kt */
    public final void m3301x60be1a8() {
        String str;
        if (this.runtime.isEnabled(Runtime3.APP_EXIT_EVENTS.INSTANCE) && this.versionChecker.isAtLeast(30)) {
            ILatestAppExitInfoProvider2 iLatestAppExitInfoProvider2 = this.latestAppExitInfoProvider.get(this.activityManager);
            if (iLatestAppExitInfoProvider2 instanceof ILatestAppExitInfoProvider2.Empty) {
                ErrorHandler.DefaultImpls.handleError$default(this.errorHandler, "AppExitLogger: getHistoricalProcessExitReasons is an empty list", null, 2, null);
                return;
            }
            if (iLatestAppExitInfoProvider2 instanceof ILatestAppExitInfoProvider2.ProcessNameNotFound) {
                ErrorHandler.DefaultImpls.handleError$default(this.errorHandler, "AppExitLogger: The current Application process didn't find a match on getHistoricalProcessExitReasons", null, 2, null);
                return;
            }
            if (iLatestAppExitInfoProvider2 instanceof ILatestAppExitInfoProvider2.Error) {
                ILatestAppExitInfoProvider2.Error error = (ILatestAppExitInfoProvider2.Error) iLatestAppExitInfoProvider2;
                this.errorHandler.handleError(error.getMessage(), error.getThrowable());
                return;
            }
            if (iLatestAppExitInfoProvider2 instanceof ILatestAppExitInfoProvider2.Valid) {
                ApplicationExitInfo applicationExitInfo = ((ILatestAppExitInfoProvider2.Valid) iLatestAppExitInfoProvider2).getApplicationExitInfo();
                byte[] processStateSummary = applicationExitInfo.getProcessStateSummary();
                if (processStateSummary != null) {
                    Charset UTF_8 = StandardCharsets.UTF_8;
                    Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                    str = new String(processStateSummary, UTF_8);
                } else {
                    str = null;
                }
                if (str == null) {
                    ErrorHandler.DefaultImpls.handleError$default(this.errorHandler, "AppExitLogger: processStateSummary from " + applicationExitInfo.getProcessName() + " is null.", null, 2, null);
                    return;
                }
                LoggerImpl.logFields$default(this.logger, LogType.LIFECYCLE, toLogLevel(applicationExitInfo.getReason()), buildAppExitInternalFieldsMap(applicationExitInfo), null, new LoggerImpl2.SessionID(str, applicationExitInfo.getTimestamp()), false, new Function0<String>() { // from class: io.bitdrift.capture.events.lifecycle.AppExitLogger$logPreviousExitReasonIfAny$1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "AppExit";
                    }
                }, 40, null);
            }
        }
    }

    @Override // io.bitdrift.capture.reports.jvmcrash.JvmCrashListener
    public void onJvmCrash(Thread thread, Throwable throwable) {
        Intrinsics.checkNotNullParameter(thread, "thread");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (!this.runtime.isEnabled(Runtime3.APP_EXIT_EVENTS.INSTANCE) || Intrinsics.areEqual(this.fatalIssueMechanism, FatalIssueMechanism.BuiltIn.INSTANCE)) {
            return;
        }
        LoggerImpl.logFields$default(this.logger, LogType.LIFECYCLE, LogLevel.ERROR, buildCrashAndMemoryFieldsMap(thread, throwable), null, null, true, new Function0<String>() { // from class: io.bitdrift.capture.events.lifecycle.AppExitLogger.onJvmCrash.1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "AppExit";
            }
        }, 24, null);
        if (this.runtime.isEnabled(Runtime3.LOGGER_FLUSHING_ON_CRASH.INSTANCE)) {
            this.logger.flush$platform_jvm_capture_capture_logger_lib_kt(true);
        }
    }

    private final Throwable getRootCause(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
            Intrinsics.checkNotNull(th);
        }
        if (!(th instanceof InvocationTargetException)) {
            return th;
        }
        Throwable targetException = ((InvocationTargetException) th).getTargetException();
        Intrinsics.checkNotNullExpressionValue(targetException, "getTargetException(...)");
        return targetException;
    }

    private final Map<String, FieldProvider4> buildCrashAndMemoryFieldsMap(Thread thread, Throwable throwable) {
        Throwable rootCause = getRootCause(throwable);
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("_app_exit_source", "UncaughtExceptionHandler");
        mapCreateMapBuilder.put("_app_exit_reason", "Crash");
        mapCreateMapBuilder.put("_app_exit_info", rootCause.getClass().getName());
        String message = rootCause.getMessage();
        if (message == null) {
            message = "";
        }
        mapCreateMapBuilder.put("_app_exit_details", message);
        mapCreateMapBuilder.put("_app_exit_thread", thread.getName());
        mapCreateMapBuilder.putAll(this.memoryMetricsProvider.getMemoryAttributes());
        return FieldProvider3.toFields(MapsKt.build(mapCreateMapBuilder));
    }

    @TargetApi(30)
    private final Map<String, FieldProvider4> buildAppExitInternalFieldsMap(ApplicationExitInfo applicationExitInfo) {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.putAll(FieldProvider3.toFields(toMap(applicationExitInfo)));
        mapCreateMapBuilder.putAll(FieldProvider3.toFields(this.memoryMetricsProvider.getMemoryClass()));
        return MapsKt.build(mapCreateMapBuilder);
    }

    @TargetApi(30)
    private final Map<String, String> toMap(ApplicationExitInfo applicationExitInfo) {
        Tuples2 tuples2M3642to = Tuples4.m3642to("_app_exit_source", "ApplicationExitInfo");
        Tuples2 tuples2M3642to2 = Tuples4.m3642to("_app_exit_process_name", applicationExitInfo.getProcessName());
        Tuples2 tuples2M3642to3 = Tuples4.m3642to("_app_exit_reason", toReasonText(applicationExitInfo.getReason()));
        Tuples2 tuples2M3642to4 = Tuples4.m3642to("_app_exit_importance", toImportanceText(applicationExitInfo.getImportance()));
        Tuples2 tuples2M3642to5 = Tuples4.m3642to("_app_exit_status", String.valueOf(applicationExitInfo.getStatus()));
        Tuples2 tuples2M3642to6 = Tuples4.m3642to("_app_exit_pss", String.valueOf(applicationExitInfo.getPss()));
        Tuples2 tuples2M3642to7 = Tuples4.m3642to("_app_exit_rss", String.valueOf(applicationExitInfo.getRss()));
        String description = applicationExitInfo.getDescription();
        if (description == null) {
            description = "";
        }
        return MapsKt.mapOf(tuples2M3642to, tuples2M3642to2, tuples2M3642to3, tuples2M3642to4, tuples2M3642to5, tuples2M3642to6, tuples2M3642to7, Tuples4.m3642to("_app_exit_description", description));
    }

    private final String toReasonText(int i) {
        switch (i) {
            case 1:
                return "EXIT_SELF";
            case 2:
                return "SIGNALED";
            case 3:
                return "LOW_MEMORY";
            case 4:
                return "CRASH";
            case 5:
                return "CRASH_NATIVE";
            case 6:
                return "ANR";
            case 7:
                return "INITIALIZATION_FAILURE";
            case 8:
                return "PERMISSION_CHANGE";
            case 9:
                return "EXCESSIVE_RESOURCE_USAGE";
            case 10:
                return "USER_REQUESTED";
            case 11:
                return "USER_STOPPED";
            case 12:
                return "DEPENDENCY_DIED";
            case 13:
                return "OTHER";
            case 14:
                return "FREEZER";
            default:
                return "UNKNOWN";
        }
    }

    private final String toImportanceText(int i) {
        if (i == 100) {
            return "FOREGROUND";
        }
        if (i == 125) {
            return "FOREGROUND_SERVICE";
        }
        if (i == 200) {
            return "VISIBLE";
        }
        if (i == 230) {
            return "PERCEPTIBLE";
        }
        if (i == 300) {
            return "SERVICE";
        }
        if (i == 325) {
            return "TOP_SLEEPING";
        }
        if (i == 350) {
            return "CANT_SAVE_STATE";
        }
        if (i == 400) {
            return "CACHED";
        }
        if (i == 1000) {
            return "GONE";
        }
        return "UNKNOWN";
    }

    @TargetApi(30)
    private final LogLevel toLogLevel(int i) {
        if (CollectionsKt.listOf((Object[]) new Integer[]{4, 5, 6, 3}).contains(Integer.valueOf(i))) {
            return LogLevel.ERROR;
        }
        return LogLevel.INFO;
    }
}
