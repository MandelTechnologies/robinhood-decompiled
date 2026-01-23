package io.bitdrift.capture.events.performance;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.metrics.performance.FrameData;
import androidx.metrics.performance.FrameData2;
import androidx.metrics.performance.JankStats;
import androidx.metrics.performance.PerformanceMetricsState;
import io.bitdrift.capture.ErrorHandler;
import io.bitdrift.capture.LogLevel;
import io.bitdrift.capture.LogType;
import io.bitdrift.capture.LoggerImpl;
import io.bitdrift.capture.common.ErrorHandler;
import io.bitdrift.capture.common.IBackgroundThreadHandler;
import io.bitdrift.capture.common.IWindowManager;
import io.bitdrift.capture.common.MainThreadHandler;
import io.bitdrift.capture.common.Runtime;
import io.bitdrift.capture.common.Runtime2;
import io.bitdrift.capture.common.Runtime3;
import io.bitdrift.capture.events.IEventListenerLogger;
import io.bitdrift.capture.providers.FieldProvider3;
import io.bitdrift.capture.providers.FieldProvider4;
import io.bitdrift.capture.threading.CaptureDispatchers;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: JankStatsMonitor.kt */
@Metadata(m3635d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 Y2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002YZBK\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u0018*\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u0013\u0010\u001d\u001a\u00020\u001c*\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!*\b\u0012\u0004\u0012\u00020 0\u001fH\u0003¢\u0006\u0004\b$\u0010%J\u0013\u0010'\u001a\u00020&*\u00020\u0017H\u0003¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020&2\u0006\u0010*\u001a\u00020)H\u0003¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020&H\u0002¢\u0006\u0004\b-\u0010.J!\u00103\u001a\u00020&2\u0006\u00100\u001a\u00020/2\b\u00102\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020&2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020&2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b7\u00106J\u0017\u00108\u001a\u00020&2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b8\u00106J\u001f\u0010:\u001a\u00020&2\u0006\u00100\u001a\u00020/2\u0006\u00109\u001a\u000201H\u0016¢\u0006\u0004\b:\u00104J\u0017\u0010;\u001a\u00020&2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b;\u00106J\u0017\u0010<\u001a\u00020&2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b<\u00106J\u0017\u0010>\u001a\u00020&2\u0006\u0010=\u001a\u00020\u0017H\u0016¢\u0006\u0004\b>\u0010(J\u001f\u0010B\u001a\u00020&2\u0006\u0010?\u001a\u00020\t2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020&H\u0016¢\u0006\u0004\bD\u0010.J\u000f\u0010E\u001a\u00020&H\u0016¢\u0006\u0004\bE\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010FR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010GR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010HR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010IR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010JR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010KR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010LR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010MR*\u0010O\u001a\u0004\u0018\u00010N8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bO\u0010P\u0012\u0004\bU\u0010.\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0018\u0010W\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010X¨\u0006["}, m3636d2 = {"Lio/bitdrift/capture/events/performance/JankStatsMonitor;", "Lio/bitdrift/capture/events/IEventListenerLogger;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/metrics/performance/JankStats$OnFrameListener;", "Landroid/app/Application;", "application", "Lio/bitdrift/capture/LoggerImpl;", "logger", "Landroidx/lifecycle/LifecycleOwner;", "processLifecycleOwner", "Lio/bitdrift/capture/common/Runtime;", "runtime", "Lio/bitdrift/capture/common/IWindowManager;", "windowManager", "Lio/bitdrift/capture/ErrorHandler;", "errorHandler", "Lio/bitdrift/capture/common/MainThreadHandler;", "mainThreadHandler", "Lio/bitdrift/capture/common/IBackgroundThreadHandler;", "backgroundThreadHandler", "<init>", "(Landroid/app/Application;Lio/bitdrift/capture/LoggerImpl;Landroidx/lifecycle/LifecycleOwner;Lio/bitdrift/capture/common/Runtime;Lio/bitdrift/capture/common/IWindowManager;Lio/bitdrift/capture/ErrorHandler;Lio/bitdrift/capture/common/MainThreadHandler;Lio/bitdrift/capture/common/IBackgroundThreadHandler;)V", "Landroidx/metrics/performance/FrameData;", "", "toDurationMillis", "(Landroidx/metrics/performance/FrameData;)J", "toDurationNano", "Lio/bitdrift/capture/events/performance/JankStatsMonitor$JankFrameType;", "toJankType", "(Landroidx/metrics/performance/FrameData;)Lio/bitdrift/capture/events/performance/JankStatsMonitor$JankFrameType;", "", "Landroidx/metrics/performance/StateInfo;", "", "", "Lio/bitdrift/capture/providers/FieldValue;", "toFields", "(Ljava/util/List;)Ljava/util/Map;", "", "sendJankFrameData", "(Landroidx/metrics/performance/FrameData;)V", "Landroid/view/Window;", "window", "setJankStatsForCurrentWindow", "(Landroid/view/Window;)V", "stopCollection", "()V", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityDestroyed", "(Landroid/app/Activity;)V", "onActivityPaused", "onActivityResumed", "outState", "onActivitySaveInstanceState", "onActivityStarted", "onActivityStopped", "volatileFrameData", "onFrame", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "start", "stop", "Landroid/app/Application;", "Lio/bitdrift/capture/LoggerImpl;", "Landroidx/lifecycle/LifecycleOwner;", "Lio/bitdrift/capture/common/Runtime;", "Lio/bitdrift/capture/common/IWindowManager;", "Lio/bitdrift/capture/ErrorHandler;", "Lio/bitdrift/capture/common/MainThreadHandler;", "Lio/bitdrift/capture/common/IBackgroundThreadHandler;", "Landroidx/metrics/performance/JankStats;", "jankStats", "Landroidx/metrics/performance/JankStats;", "getJankStats$platform_jvm_capture_capture_logger_lib_kt", "()Landroidx/metrics/performance/JankStats;", "setJankStats$platform_jvm_capture_capture_logger_lib_kt", "(Landroidx/metrics/performance/JankStats;)V", "getJankStats$platform_jvm_capture_capture_logger_lib_kt$annotations", "Landroidx/metrics/performance/PerformanceMetricsState$Holder;", "performanceMetricsStateHolder", "Landroidx/metrics/performance/PerformanceMetricsState$Holder;", "Companion", "JankFrameType", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class JankStatsMonitor implements IEventListenerLogger, Application.ActivityLifecycleCallbacks, LifecycleEventObserver, JankStats.OnFrameListener {
    private static final Companion Companion = new Companion(null);
    private final Application application;
    private final IBackgroundThreadHandler backgroundThreadHandler;
    private final ErrorHandler errorHandler;
    private JankStats jankStats;
    private final LoggerImpl logger;
    private final MainThreadHandler mainThreadHandler;
    private PerformanceMetricsState.Holder performanceMetricsStateHolder;
    private final LifecycleOwner processLifecycleOwner;
    private final Runtime runtime;
    private final IWindowManager windowManager;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public JankStatsMonitor(Application application, LoggerImpl logger, LifecycleOwner processLifecycleOwner, Runtime runtime, IWindowManager windowManager, ErrorHandler errorHandler, MainThreadHandler mainThreadHandler, IBackgroundThreadHandler backgroundThreadHandler) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(processLifecycleOwner, "processLifecycleOwner");
        Intrinsics.checkNotNullParameter(runtime, "runtime");
        Intrinsics.checkNotNullParameter(windowManager, "windowManager");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(mainThreadHandler, "mainThreadHandler");
        Intrinsics.checkNotNullParameter(backgroundThreadHandler, "backgroundThreadHandler");
        this.application = application;
        this.logger = logger;
        this.processLifecycleOwner = processLifecycleOwner;
        this.runtime = runtime;
        this.windowManager = windowManager;
        this.errorHandler = errorHandler;
        this.mainThreadHandler = mainThreadHandler;
        this.backgroundThreadHandler = backgroundThreadHandler;
    }

    public /* synthetic */ JankStatsMonitor(Application application, LoggerImpl loggerImpl, LifecycleOwner lifecycleOwner, Runtime runtime, IWindowManager iWindowManager, ErrorHandler errorHandler, MainThreadHandler mainThreadHandler, IBackgroundThreadHandler iBackgroundThreadHandler, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, loggerImpl, lifecycleOwner, runtime, iWindowManager, errorHandler, (i & 64) != 0 ? new MainThreadHandler() : mainThreadHandler, (i & 128) != 0 ? CaptureDispatchers.CommonBackground.INSTANCE : iBackgroundThreadHandler);
    }

    @Override // io.bitdrift.capture.events.IEventListenerLogger
    public void start() {
        this.mainThreadHandler.run(new Function0<Unit>() { // from class: io.bitdrift.capture.events.performance.JankStatsMonitor.start.1
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
                JankStatsMonitor.this.processLifecycleOwner.getLifecycle().addObserver(JankStatsMonitor.this);
                JankStatsMonitor.this.application.registerActivityLifecycleCallbacks(JankStatsMonitor.this);
            }
        });
    }

    @Override // io.bitdrift.capture.events.IEventListenerLogger
    public void stop() {
        stopCollection();
        this.mainThreadHandler.run(new Function0<Unit>() { // from class: io.bitdrift.capture.events.performance.JankStatsMonitor.stop.1
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
                JankStatsMonitor.this.processLifecycleOwner.getLifecycle().removeObserver(JankStatsMonitor.this);
                JankStatsMonitor.this.application.unregisterActivityLifecycleCallbacks(JankStatsMonitor.this);
            }
        });
    }

    @Override // androidx.metrics.performance.JankStats.OnFrameListener
    public void onFrame(FrameData volatileFrameData) {
        Intrinsics.checkNotNullParameter(volatileFrameData, "volatileFrameData");
        if (volatileFrameData.getIsJank()) {
            if (!this.runtime.isEnabled(Runtime3.DROPPED_EVENTS_MONITORING.INSTANCE)) {
                stopCollection();
                return;
            }
            long durationNano = toDurationNano(volatileFrameData);
            long durationMillis = toDurationMillis(volatileFrameData);
            if (durationNano >= 0 && durationMillis <= 100000000) {
                if (durationMillis < this.runtime.getConfigValue(Runtime2.MIN_JANK_FRAME_THRESHOLD_MS.INSTANCE)) {
                    return;
                }
                sendJankFrameData(volatileFrameData);
                return;
            }
            ErrorHandler.DefaultImpls.handleError$default(this.errorHandler, "Unexpected frame duration. durationInNano: " + durationNano + ". durationMillis: " + durationMillis, null, 2, null);
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        Window currentWindow;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != Lifecycle.Event.ON_CREATE || (currentWindow = this.windowManager.getCurrentWindow()) == null) {
            return;
        }
        setJankStatsForCurrentWindow(currentWindow);
        this.processLifecycleOwner.getLifecycle().removeObserver(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        setJankStatsForCurrentWindow(window);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        stopCollection();
    }

    private final void setJankStatsForCurrentWindow(Window window) {
        try {
            if (!this.runtime.isEnabled(Runtime3.DROPPED_EVENTS_MONITORING.INSTANCE)) {
                stopCollection();
                return;
            }
            this.jankStats = JankStats.INSTANCE.createAndTrack(window, this);
            PerformanceMetricsState.Companion companion = PerformanceMetricsState.INSTANCE;
            View rootView = window.getDecorView().getRootView();
            Intrinsics.checkNotNullExpressionValue(rootView, "getRootView(...)");
            this.performanceMetricsStateHolder = companion.getHolderForHierarchy(rootView);
            JankStats jankStats = this.jankStats;
            if (jankStats == null) {
                return;
            }
            jankStats.setJankHeuristicMultiplier(this.runtime.getConfigValue(Runtime2.JANK_FRAME_HEURISTICS_MULTIPLIER.INSTANCE));
        } catch (IllegalStateException e) {
            this.errorHandler.handleError("Couldn't create JankStats instance", e);
        }
    }

    private final void stopCollection() {
        PerformanceMetricsState state;
        JankStats jankStats = this.jankStats;
        if (jankStats != null) {
            jankStats.setTrackingEnabled(false);
        }
        PerformanceMetricsState.Holder holder = this.performanceMetricsStateHolder;
        if (holder != null && (state = holder.getState()) != null) {
            state.removeState("_screen_name");
        }
        this.jankStats = null;
        this.performanceMetricsStateHolder = null;
    }

    private final void sendJankFrameData(FrameData frameData) {
        JankFrameType jankType = toJankType(frameData);
        LoggerImpl loggerImpl = this.logger;
        LogType logType = LogType.f6570UX;
        LogLevel logLevel = jankType.getLogLevel();
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("_duration_ms", FieldProvider3.toFieldValue(String.valueOf(toDurationMillis(frameData))));
        mapCreateMapBuilder.put("_frame_issue_type", jankType.getFieldValue());
        mapCreateMapBuilder.putAll(toFields(frameData.getStates()));
        Unit unit = Unit.INSTANCE;
        LoggerImpl.logFields$default(loggerImpl, logType, logLevel, MapsKt.build(mapCreateMapBuilder), null, null, false, new Function0<String>() { // from class: io.bitdrift.capture.events.performance.JankStatsMonitor.sendJankFrameData.2
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "DroppedFrame";
            }
        }, 56, null);
    }

    private final Map<String, FieldProvider4> toFields(List<FrameData2> list) {
        List<FrameData2> list2 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
        for (FrameData2 frameData2 : list2) {
            Tuples2 tuples2M3642to = Tuples4.m3642to(frameData2.getKey(), FieldProvider3.toFieldValue(frameData2.getValue()));
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        return linkedHashMap;
    }

    private final JankFrameType toJankType(FrameData frameData) {
        long durationMillis = toDurationMillis(frameData);
        if (durationMillis < this.runtime.getConfigValue(Runtime2.FROZEN_FRAME_THRESHOLD_MS.INSTANCE)) {
            return JankFrameType.SLOW;
        }
        if (durationMillis < this.runtime.getConfigValue(Runtime2.ANR_FRAME_THRESHOLD_MS.INSTANCE)) {
            return JankFrameType.FROZEN;
        }
        return JankFrameType.ANR;
    }

    private final long toDurationMillis(FrameData frameData) {
        return TimeUnit.NANOSECONDS.toMillis(toDurationNano(frameData));
    }

    private final long toDurationNano(FrameData frameData) {
        return frameData instanceof androidx.metrics.performance.FrameData ? ((androidx.metrics.performance.FrameData) frameData).getFrameDurationTotalNanos() : frameData instanceof androidx.metrics.performance.FrameData ? ((androidx.metrics.performance.FrameData) frameData).getFrameDurationCpuNanos() : frameData.getFrameDurationUiNanos();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: JankStatsMonitor.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m3636d2 = {"Lio/bitdrift/capture/events/performance/JankStatsMonitor$JankFrameType;", "", "logLevel", "Lio/bitdrift/capture/LogLevel;", "fieldValue", "Lio/bitdrift/capture/providers/FieldValue;", "(Ljava/lang/String;ILio/bitdrift/capture/LogLevel;Lio/bitdrift/capture/providers/FieldValue;)V", "getFieldValue", "()Lio/bitdrift/capture/providers/FieldValue;", "getLogLevel", "()Lio/bitdrift/capture/LogLevel;", "SLOW", "FROZEN", "ANR", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class JankFrameType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ JankFrameType[] $VALUES;
        public static final JankFrameType ANR;
        public static final JankFrameType FROZEN;
        public static final JankFrameType SLOW = new JankFrameType("SLOW", 0, LogLevel.WARNING, FieldProvider3.toFieldValue("Slow"));
        private final FieldProvider4 fieldValue;
        private final LogLevel logLevel;

        private static final /* synthetic */ JankFrameType[] $values() {
            return new JankFrameType[]{SLOW, FROZEN, ANR};
        }

        public static EnumEntries<JankFrameType> getEntries() {
            return $ENTRIES;
        }

        public static JankFrameType valueOf(String str) {
            return (JankFrameType) Enum.valueOf(JankFrameType.class, str);
        }

        public static JankFrameType[] values() {
            return (JankFrameType[]) $VALUES.clone();
        }

        private JankFrameType(String str, int i, LogLevel logLevel, FieldProvider4 fieldProvider4) {
            this.logLevel = logLevel;
            this.fieldValue = fieldProvider4;
        }

        public final LogLevel getLogLevel() {
            return this.logLevel;
        }

        public final FieldProvider4 getFieldValue() {
            return this.fieldValue;
        }

        static {
            LogLevel logLevel = LogLevel.ERROR;
            FROZEN = new JankFrameType("FROZEN", 1, logLevel, FieldProvider3.toFieldValue("Frozen"));
            ANR = new JankFrameType("ANR", 2, logLevel, FieldProvider3.toFieldValue("ANR"));
            JankFrameType[] jankFrameTypeArr$values = $values();
            $VALUES = jankFrameTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(jankFrameTypeArr$values);
        }
    }

    /* compiled from: JankStatsMonitor.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lio/bitdrift/capture/events/performance/JankStatsMonitor$Companion;", "", "()V", "DROPPED_FRAME_MESSAGE_ID", "", "DROPPED_FRAME_TYPE_KEY", "ERROR_DURATION_THRESHOLD_MILLIS", "", "SCREEN_NAME_KEY", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
