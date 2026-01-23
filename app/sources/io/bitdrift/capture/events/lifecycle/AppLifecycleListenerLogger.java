package io.bitdrift.capture.events.lifecycle;

import android.app.ActivityManager;
import android.app.ApplicationStartInfo;
import android.content.Intent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.robinhood.android.investFlow.InvestFlowConstants;
import io.bitdrift.capture.LogLevel;
import io.bitdrift.capture.LogType;
import io.bitdrift.capture.LoggerImpl;
import io.bitdrift.capture.common.MainThreadHandler;
import io.bitdrift.capture.common.Runtime;
import io.bitdrift.capture.common.Runtime3;
import io.bitdrift.capture.events.IEventListenerLogger;
import io.bitdrift.capture.providers.FieldProvider3;
import io.bitdrift.capture.providers.FieldProvider4;
import io.bitdrift.capture.utils.BuildVersionChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AppLifecycleListenerLogger.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001$BA\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u0016\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0018H\u0003J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0014H\u0016J\b\u0010\u001d\u001a\u00020\u001aH\u0016J\b\u0010\u001e\u001a\u00020\u001aH\u0016J\f\u0010\u001f\u001a\u00020\u0015*\u00020 H\u0002J\f\u0010!\u001a\u00020\u0015*\u00020 H\u0002J\f\u0010\"\u001a\u00020\u0015*\u00020 H\u0002J\f\u0010#\u001a\u00020\u0015*\u00020 H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013j\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015`\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m3636d2 = {"Lio/bitdrift/capture/events/lifecycle/AppLifecycleListenerLogger;", "Lio/bitdrift/capture/events/IEventListenerLogger;", "Landroidx/lifecycle/LifecycleEventObserver;", "logger", "Lio/bitdrift/capture/LoggerImpl;", "processLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "activityManager", "Landroid/app/ActivityManager;", "runtime", "Lio/bitdrift/capture/common/Runtime;", "executor", "Ljava/util/concurrent/ExecutorService;", "mainThreadHandler", "Lio/bitdrift/capture/common/MainThreadHandler;", "versionChecker", "Lio/bitdrift/capture/utils/BuildVersionChecker;", "(Lio/bitdrift/capture/LoggerImpl;Landroidx/lifecycle/LifecycleOwner;Landroid/app/ActivityManager;Lio/bitdrift/capture/common/Runtime;Ljava/util/concurrent/ExecutorService;Lio/bitdrift/capture/common/MainThreadHandler;Lio/bitdrift/capture/utils/BuildVersionChecker;)V", "lifecycleEventNames", "Ljava/util/HashMap;", "Landroidx/lifecycle/Lifecycle$Event;", "", "Lkotlin/collections/HashMap;", "extractAppStartInfoFields", "", "onStateChanged", "", "source", "event", "start", "stop", "toLaunchModeText", "", "toStartReasonText", "toStartTypeText", "toStartupStateText", "StartupTimestamps", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class AppLifecycleListenerLogger implements IEventListenerLogger, LifecycleEventObserver {
    private final ActivityManager activityManager;
    private final ExecutorService executor;
    private final HashMap<Lifecycle.Event, String> lifecycleEventNames;
    private final LoggerImpl logger;
    private final MainThreadHandler mainThreadHandler;
    private final LifecycleOwner processLifecycleOwner;
    private final Runtime runtime;
    private final BuildVersionChecker versionChecker;

    public AppLifecycleListenerLogger(LoggerImpl logger, LifecycleOwner processLifecycleOwner, ActivityManager activityManager, Runtime runtime, ExecutorService executor, MainThreadHandler mainThreadHandler, BuildVersionChecker versionChecker) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(processLifecycleOwner, "processLifecycleOwner");
        Intrinsics.checkNotNullParameter(activityManager, "activityManager");
        Intrinsics.checkNotNullParameter(runtime, "runtime");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(mainThreadHandler, "mainThreadHandler");
        Intrinsics.checkNotNullParameter(versionChecker, "versionChecker");
        this.logger = logger;
        this.processLifecycleOwner = processLifecycleOwner;
        this.activityManager = activityManager;
        this.runtime = runtime;
        this.executor = executor;
        this.mainThreadHandler = mainThreadHandler;
        this.versionChecker = versionChecker;
        this.lifecycleEventNames = MapsKt.hashMapOf(Tuples4.m3642to(Lifecycle.Event.ON_CREATE, "AppCreate"), Tuples4.m3642to(Lifecycle.Event.ON_START, "AppStart"), Tuples4.m3642to(Lifecycle.Event.ON_RESUME, "AppResume"), Tuples4.m3642to(Lifecycle.Event.ON_PAUSE, "AppPause"), Tuples4.m3642to(Lifecycle.Event.ON_STOP, "AppStop"), Tuples4.m3642to(Lifecycle.Event.ON_DESTROY, "AppDestroy"), Tuples4.m3642to(Lifecycle.Event.ON_ANY, "AppAny"));
    }

    public /* synthetic */ AppLifecycleListenerLogger(LoggerImpl loggerImpl, LifecycleOwner lifecycleOwner, ActivityManager activityManager, Runtime runtime, ExecutorService executorService, MainThreadHandler mainThreadHandler, BuildVersionChecker buildVersionChecker, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(loggerImpl, lifecycleOwner, activityManager, runtime, executorService, (i & 32) != 0 ? new MainThreadHandler() : mainThreadHandler, (i & 64) != 0 ? new BuildVersionChecker() : buildVersionChecker);
    }

    @Override // io.bitdrift.capture.events.IEventListenerLogger
    public void start() {
        this.mainThreadHandler.run(new Function0<Unit>() { // from class: io.bitdrift.capture.events.lifecycle.AppLifecycleListenerLogger.start.1
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
                AppLifecycleListenerLogger.this.processLifecycleOwner.getLifecycle().addObserver(AppLifecycleListenerLogger.this);
            }
        });
    }

    @Override // io.bitdrift.capture.events.IEventListenerLogger
    public void stop() {
        this.mainThreadHandler.run(new Function0<Unit>() { // from class: io.bitdrift.capture.events.lifecycle.AppLifecycleListenerLogger.stop.1
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
                AppLifecycleListenerLogger.this.processLifecycleOwner.getLifecycle().removeObserver(AppLifecycleListenerLogger.this);
            }
        });
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner source, final Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        this.executor.execute(new Runnable() { // from class: io.bitdrift.capture.events.lifecycle.AppLifecycleListenerLogger.onStateChanged.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                Map mapM28550constructorimpl;
                if (AppLifecycleListenerLogger.this.runtime.isEnabled(Runtime3.APP_LIFECYCLE_EVENTS.INSTANCE)) {
                    if (event == Lifecycle.Event.ON_CREATE && AppLifecycleListenerLogger.this.versionChecker.isAtLeast(35)) {
                        AppLifecycleListenerLogger appLifecycleListenerLogger = AppLifecycleListenerLogger.this;
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            mapM28550constructorimpl = Result.m28550constructorimpl(appLifecycleListenerLogger.extractAppStartInfoFields());
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.INSTANCE;
                            mapM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                        }
                        mapEmptyMap = Result.m28553exceptionOrNullimpl(mapM28550constructorimpl) == null ? mapM28550constructorimpl : null;
                    }
                    if (mapEmptyMap == null) {
                        mapEmptyMap = MapsKt.emptyMap();
                    }
                    LoggerImpl loggerImpl = AppLifecycleListenerLogger.this.logger;
                    LogType logType = LogType.LIFECYCLE;
                    LogLevel logLevel = LogLevel.INFO;
                    Map<String, FieldProvider4> fields = FieldProvider3.toFields(mapEmptyMap);
                    final AppLifecycleListenerLogger appLifecycleListenerLogger2 = AppLifecycleListenerLogger.this;
                    final Lifecycle.Event event2 = event;
                    LoggerImpl.logFields$default(loggerImpl, logType, logLevel, fields, null, null, false, new Function0<String>() { // from class: io.bitdrift.capture.events.lifecycle.AppLifecycleListenerLogger.onStateChanged.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return String.valueOf(appLifecycleListenerLogger2.lifecycleEventNames.get(event2));
                        }
                    }, 56, null);
                    if (event == Lifecycle.Event.ON_STOP) {
                        AppLifecycleListenerLogger.this.logger.flush$platform_jvm_capture_capture_logger_lib_kt(false);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> extractAppStartInfoFields() {
        String action;
        List historicalProcessStartReasons = this.activityManager.getHistoricalProcessStartReasons(1);
        Intrinsics.checkNotNullExpressionValue(historicalProcessStartReasons, "getHistoricalProcessStartReasons(...)");
        ApplicationStartInfo applicationStartInfoM3307m = AppLifecycleListenerLogger$$ExternalSyntheticApiModelOutline1.m3307m(CollectionsKt.firstOrNull(historicalProcessStartReasons));
        if (applicationStartInfoM3307m == null) {
            return null;
        }
        StartupTimestamps.Companion companion = StartupTimestamps.INSTANCE;
        Map<Integer, Long> startupTimestamps = applicationStartInfoM3307m.getStartupTimestamps();
        Intrinsics.checkNotNullExpressionValue(startupTimestamps, "getStartupTimestamps(...)");
        StartupTimestamps startupTimestampsFromMap = companion.fromMap(startupTimestamps);
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("startup_type", toStartTypeText(applicationStartInfoM3307m.getStartType()));
        mapCreateMapBuilder.put("startup_state", toStartupStateText(applicationStartInfoM3307m.getStartupState()));
        mapCreateMapBuilder.put("startup_launch_mode", toLaunchModeText(applicationStartInfoM3307m.getLaunchMode()));
        mapCreateMapBuilder.put("startup_was_forced_stopped", String.valueOf(applicationStartInfoM3307m.wasForceStopped()));
        mapCreateMapBuilder.put("startup_reason", toStartReasonText(applicationStartInfoM3307m.getReason()));
        Intent intent = applicationStartInfoM3307m.getIntent();
        if (intent != null && (action = intent.getAction()) != null) {
            Intrinsics.checkNotNull(action);
        }
        if (applicationStartInfoM3307m.getStartupState() == 2 && startupTimestampsFromMap.getTimeToInitialDisplayMs() != -1) {
            mapCreateMapBuilder.put("startup_time_to_initial_display_ms", String.valueOf(startupTimestampsFromMap.getTimeToInitialDisplayMs()));
        }
        return MapsKt.build(mapCreateMapBuilder);
    }

    private final String toStartTypeText(int i) {
        if (i == 0) {
            return "UNSET";
        }
        if (i == 1) {
            return "COLD";
        }
        if (i == 2) {
            return "WARM";
        }
        if (i == 3) {
            return "HOT";
        }
        return "UNKNOWN";
    }

    private final String toStartupStateText(int i) {
        if (i == 0) {
            return "STARTED";
        }
        if (i == 1) {
            return "ERROR";
        }
        if (i == 2) {
            return "FIRST_FRAME_DRAWN";
        }
        return "UNKNOWN";
    }

    private final String toLaunchModeText(int i) {
        if (i == 0) {
            return "STANDARD";
        }
        if (i == 1) {
            return "SINGLE_TOP";
        }
        if (i == 2) {
            return "SINGLE_INSTANCE";
        }
        if (i == 3) {
            return "SINGLE_TASK";
        }
        if (i == 4) {
            return "SINGLE_INSTANCE_PER_TASK";
        }
        return "UNKNOWN";
    }

    private final String toStartReasonText(int i) {
        switch (i) {
            case 0:
                return "ALARM";
            case 1:
                return "BACKUP";
            case 2:
                return "BOOT_COMPLETE";
            case 3:
                return "BROADCAST";
            case 4:
                return "CONTENT_PROVIDER";
            case 5:
                return "JOB";
            case 6:
                return "LAUNCHER";
            case 7:
                return "LAUNCHER_RECENTS";
            case 8:
                return "OTHER";
            case 9:
                return "PUSH";
            case 10:
                return "SERVICE";
            case 11:
                return "START_ACTIVITY";
            default:
                return "UNKNOWN";
        }
    }

    /* compiled from: AppLifecycleListenerLogger.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0001*B\u008b\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b \u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b!\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b#\u0010\u001cR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b$\u0010\u001cR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b%\u0010\u001cR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b&\u0010\u001cR\u0011\u0010)\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006+"}, m3636d2 = {"Lio/bitdrift/capture/events/lifecycle/AppLifecycleListenerLogger$StartupTimestamps;", "", "", "applicationOnCreate", "bindApplication", "firstFrame", "fork", "fullyDrawn", "initialRenderThreadFrame", "launch", "reservedRangeDeveloper", "reservedRangeDeveloperStart", "reservedRangeSystem", "surfaceFlingerCompositionComplete", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getApplicationOnCreate", "()Ljava/lang/Long;", "getBindApplication", "getFirstFrame", "getFork", "getFullyDrawn", "getInitialRenderThreadFrame", "getLaunch", "getReservedRangeDeveloper", "getReservedRangeDeveloperStart", "getReservedRangeSystem", "getSurfaceFlingerCompositionComplete", "getTimeToInitialDisplayMs", "()J", "timeToInitialDisplayMs", "Companion", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class StartupTimestamps {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Long applicationOnCreate;
        private final Long bindApplication;
        private final Long firstFrame;
        private final Long fork;
        private final Long fullyDrawn;
        private final Long initialRenderThreadFrame;
        private final Long launch;
        private final Long reservedRangeDeveloper;
        private final Long reservedRangeDeveloperStart;
        private final Long reservedRangeSystem;
        private final Long surfaceFlingerCompositionComplete;

        public StartupTimestamps() {
            this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StartupTimestamps)) {
                return false;
            }
            StartupTimestamps startupTimestamps = (StartupTimestamps) other;
            return Intrinsics.areEqual(this.applicationOnCreate, startupTimestamps.applicationOnCreate) && Intrinsics.areEqual(this.bindApplication, startupTimestamps.bindApplication) && Intrinsics.areEqual(this.firstFrame, startupTimestamps.firstFrame) && Intrinsics.areEqual(this.fork, startupTimestamps.fork) && Intrinsics.areEqual(this.fullyDrawn, startupTimestamps.fullyDrawn) && Intrinsics.areEqual(this.initialRenderThreadFrame, startupTimestamps.initialRenderThreadFrame) && Intrinsics.areEqual(this.launch, startupTimestamps.launch) && Intrinsics.areEqual(this.reservedRangeDeveloper, startupTimestamps.reservedRangeDeveloper) && Intrinsics.areEqual(this.reservedRangeDeveloperStart, startupTimestamps.reservedRangeDeveloperStart) && Intrinsics.areEqual(this.reservedRangeSystem, startupTimestamps.reservedRangeSystem) && Intrinsics.areEqual(this.surfaceFlingerCompositionComplete, startupTimestamps.surfaceFlingerCompositionComplete);
        }

        public int hashCode() {
            Long l = this.applicationOnCreate;
            int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
            Long l2 = this.bindApplication;
            int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
            Long l3 = this.firstFrame;
            int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
            Long l4 = this.fork;
            int iHashCode4 = (iHashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
            Long l5 = this.fullyDrawn;
            int iHashCode5 = (iHashCode4 + (l5 == null ? 0 : l5.hashCode())) * 31;
            Long l6 = this.initialRenderThreadFrame;
            int iHashCode6 = (iHashCode5 + (l6 == null ? 0 : l6.hashCode())) * 31;
            Long l7 = this.launch;
            int iHashCode7 = (iHashCode6 + (l7 == null ? 0 : l7.hashCode())) * 31;
            Long l8 = this.reservedRangeDeveloper;
            int iHashCode8 = (iHashCode7 + (l8 == null ? 0 : l8.hashCode())) * 31;
            Long l9 = this.reservedRangeDeveloperStart;
            int iHashCode9 = (iHashCode8 + (l9 == null ? 0 : l9.hashCode())) * 31;
            Long l10 = this.reservedRangeSystem;
            int iHashCode10 = (iHashCode9 + (l10 == null ? 0 : l10.hashCode())) * 31;
            Long l11 = this.surfaceFlingerCompositionComplete;
            return iHashCode10 + (l11 != null ? l11.hashCode() : 0);
        }

        public String toString() {
            return "StartupTimestamps(applicationOnCreate=" + this.applicationOnCreate + ", bindApplication=" + this.bindApplication + ", firstFrame=" + this.firstFrame + ", fork=" + this.fork + ", fullyDrawn=" + this.fullyDrawn + ", initialRenderThreadFrame=" + this.initialRenderThreadFrame + ", launch=" + this.launch + ", reservedRangeDeveloper=" + this.reservedRangeDeveloper + ", reservedRangeDeveloperStart=" + this.reservedRangeDeveloperStart + ", reservedRangeSystem=" + this.reservedRangeSystem + ", surfaceFlingerCompositionComplete=" + this.surfaceFlingerCompositionComplete + ')';
        }

        public StartupTimestamps(Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, Long l11) {
            this.applicationOnCreate = l;
            this.bindApplication = l2;
            this.firstFrame = l3;
            this.fork = l4;
            this.fullyDrawn = l5;
            this.initialRenderThreadFrame = l6;
            this.launch = l7;
            this.reservedRangeDeveloper = l8;
            this.reservedRangeDeveloperStart = l9;
            this.reservedRangeSystem = l10;
            this.surfaceFlingerCompositionComplete = l11;
        }

        public /* synthetic */ StartupTimestamps(Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, Long l11, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : l3, (i & 8) != 0 ? null : l4, (i & 16) != 0 ? null : l5, (i & 32) != 0 ? null : l6, (i & 64) != 0 ? null : l7, (i & 128) != 0 ? null : l8, (i & 256) != 0 ? null : l9, (i & 512) != 0 ? null : l10, (i & 1024) != 0 ? null : l11);
        }

        /* compiled from: AppLifecycleListenerLogger.kt */
        @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¨\u0006\t"}, m3636d2 = {"Lio/bitdrift/capture/events/lifecycle/AppLifecycleListenerLogger$StartupTimestamps$Companion;", "", "()V", "fromMap", "Lio/bitdrift/capture/events/lifecycle/AppLifecycleListenerLogger$StartupTimestamps;", "timestampMap", "", "", "", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final StartupTimestamps fromMap(Map<Integer, Long> timestampMap) {
                Intrinsics.checkNotNullParameter(timestampMap, "timestampMap");
                return new StartupTimestamps(timestampMap.get(2), timestampMap.get(3), timestampMap.get(4), timestampMap.get(1), timestampMap.get(5), timestampMap.get(6), timestampMap.get(0), timestampMap.get(30), timestampMap.get(21), timestampMap.get(20), timestampMap.get(7));
            }
        }

        public final long getTimeToInitialDisplayMs() {
            Long l = this.firstFrame;
            if (l == null || this.launch == null) {
                return -1L;
            }
            return (l.longValue() - this.launch.longValue()) / InvestFlowConstants.MAX_ONE_TIME_AMOUNT;
        }
    }
}
