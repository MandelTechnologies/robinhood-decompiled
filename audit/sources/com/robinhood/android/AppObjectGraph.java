package com.robinhood.android;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.tracing.Trace;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.analytics.SessionManager;
import com.robinhood.analytics.performance.startup.StartupPerformanceLogger;
import com.robinhood.android.common.notification.NotificationManager;
import com.robinhood.android.common.util.RhShortcutManager;
import com.robinhood.android.util.login.UserLifecycleListener;
import com.robinhood.hammer.android.application.ApplicationComponentManagerHolder;
import com.robinhood.leakcanary.LeakDetector;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.referral.BranchAttributionManager;
import com.robinhood.referral.branch.BranchManager;
import com.robinhood.shared.security.authmanager.RealAuthManager;
import com.robinhood.utils.AppInitializedListener;
import com.robinhood.utils.RhProcessLifecycleOwner;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.lifecycle.ActivityLifecycleListener;
import com.robinhood.work.PeriodicWorker;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import timber.log.Timber;

/* compiled from: AppObjectGraph.kt */
@Metadata(m3635d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u00012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0007J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010(\u001a\u00020)H\u0002J\u0018\u0010-\u001a\u00020'2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082.¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\f8\u0002@\u0002X\u0083.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.¢\u0006\u0002\n\u0000R\u0019\u0010\u001d\u001a\r\u0012\t\u0012\u00070\u001e¢\u0006\u0002\b\u001f0\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082.¢\u0006\u0002\n\u0000¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/AppObjectGraph;", "Lcom/robinhood/android/util/login/UserLifecycleListener;", "<init>", "()V", "MESSAGE_REBUILD", "", "rootCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "activityLifecycleCallbacks", "", "Lcom/robinhood/utils/lifecycle/ActivityLifecycleListener;", "authManager", "Lcom/robinhood/shared/security/authmanager/RealAuthManager;", "branchManager", "Lcom/robinhood/referral/branch/BranchManager;", "referredManager", "Lcom/robinhood/referral/BranchAttributionManager;", "notificationManager", "Lcom/robinhood/android/common/notification/NotificationManager;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "appInitializedListeners", "Lcom/robinhood/utils/AppInitializedListener;", "sessionManager", "Lcom/robinhood/analytics/SessionManager;", "periodicWorkers", "Lcom/robinhood/work/PeriodicWorker;", "Lkotlin/jvm/JvmSuppressWildcards;", "startupPerformanceLogger", "Lcom/robinhood/analytics/performance/startup/StartupPerformanceLogger;", "rhProcessLifecycleOwner", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "rhShortcutManager", "Lcom/robinhood/android/common/util/RhShortcutManager;", "rebuildObjectGraph", "", "application", "Landroid/app/Application;", "tearDownObjectGraph", "", "", "onUserStateChanged", "context", "Landroid/content/Context;", "newState", "Lcom/robinhood/android/util/login/UserLifecycleListener$State;", "AppEntryPoint", "app-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class AppObjectGraph implements UserLifecycleListener {
    public static final AppObjectGraph INSTANCE = new AppObjectGraph();
    private static final String MESSAGE_REBUILD = "the object graph is being rebuilt";
    private static Set<? extends ActivityLifecycleListener> activityLifecycleCallbacks;
    private static AnalyticsLogger analytics;
    private static Set<? extends AppInitializedListener> appInitializedListeners;

    @SuppressLint({"StaticFieldLeak"})
    private static RealAuthManager authManager;
    private static BranchManager branchManager;
    private static EventLogger eventLogger;
    private static ExperimentsStore experimentsStore;
    private static NotificationManager notificationManager;
    private static Set<PeriodicWorker> periodicWorkers;
    private static BranchAttributionManager referredManager;
    private static RhProcessLifecycleOwner rhProcessLifecycleOwner;
    private static RhShortcutManager rhShortcutManager;
    private static CoroutineScope rootCoroutineScope;
    private static SessionManager sessionManager;
    private static StartupPerformanceLogger startupPerformanceLogger;

    /* compiled from: AppObjectGraph.kt */
    @Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\u0013\u0010\u0004\u001a\r\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u00070\u0005H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0015H&J\u0013\u0010\u0016\u001a\r\u0012\t\u0012\u00070\u0017¢\u0006\u0002\b\u00070\u0005H&J\b\u0010\u0018\u001a\u00020\u0019H&J\u0013\u0010\u001a\u001a\r\u0012\t\u0012\u00070\u001b¢\u0006\u0002\b\u00070\u0005H&J\b\u0010\u001c\u001a\u00020\u001dH&J\b\u0010\u001e\u001a\u00020\u001fH&J\b\u0010 \u001a\u00020!H&¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/AppObjectGraph$AppEntryPoint;", "", "rootCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "activityLifecycleCallbacks", "", "Lcom/robinhood/utils/lifecycle/ActivityLifecycleListener;", "Lkotlin/jvm/JvmSuppressWildcards;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "authManager", "Lcom/robinhood/shared/security/authmanager/RealAuthManager;", "branchManager", "Lcom/robinhood/referral/branch/BranchManager;", "referredManager", "Lcom/robinhood/referral/BranchAttributionManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "notificationManager", "Lcom/robinhood/android/common/notification/NotificationManager;", "appInitializedListeners", "Lcom/robinhood/utils/AppInitializedListener;", "sessionManager", "Lcom/robinhood/analytics/SessionManager;", "periodicWorkers", "Lcom/robinhood/work/PeriodicWorker;", "startupPerformanceLogger", "Lcom/robinhood/analytics/performance/startup/StartupPerformanceLogger;", "rhProcessLifecycleOwner", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "rhShortcutManager", "Lcom/robinhood/android/common/util/RhShortcutManager;", "app-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface AppEntryPoint {
        Set<ActivityLifecycleListener> activityLifecycleCallbacks();

        AnalyticsLogger analytics();

        Set<AppInitializedListener> appInitializedListeners();

        RealAuthManager authManager();

        BranchManager branchManager();

        EventLogger eventLogger();

        ExperimentsStore experimentsStore();

        NotificationManager notificationManager();

        Set<PeriodicWorker> periodicWorkers();

        BranchAttributionManager referredManager();

        RhProcessLifecycleOwner rhProcessLifecycleOwner();

        RhShortcutManager rhShortcutManager();

        @RootCoroutineScope
        CoroutineScope rootCoroutineScope();

        SessionManager sessionManager();

        StartupPerformanceLogger startupPerformanceLogger();
    }

    private AppObjectGraph() {
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    public final void rebuildObjectGraph(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        Trace.beginSection("AppObjectGraph.rebuildObjectGraph");
        try {
            Timber.INSTANCE.mo3356i("rebuildObjectGraph() called", new Object[0]);
            Trace.beginSection("rebuildObjectGraph.tearDownObjectGraph");
            try {
                List listTearDownObjectGraph = INSTANCE.tearDownObjectGraph(application);
                Trace.endSection();
                AppEntryPoint appEntryPoint = (AppEntryPoint) ((ApplicationComponentManagerHolder) application).getComponentManager().get();
                Trace.beginSection("rebuildObjectGraph.rootCoroutineScope");
                try {
                    CoroutineScope coroutineScopeRootCoroutineScope = appEntryPoint.rootCoroutineScope();
                    Trace.endSection();
                    rootCoroutineScope = coroutineScopeRootCoroutineScope;
                    Trace.beginSection("rebuildObjectGraph.activityLifecycleCallbacks");
                    try {
                        Set<ActivityLifecycleListener> setActivityLifecycleCallbacks = appEntryPoint.activityLifecycleCallbacks();
                        Trace.endSection();
                        activityLifecycleCallbacks = setActivityLifecycleCallbacks;
                        Trace.beginSection("rebuildObjectGraph.authManager");
                        try {
                            RealAuthManager realAuthManagerAuthManager = appEntryPoint.authManager();
                            Trace.endSection();
                            authManager = realAuthManagerAuthManager;
                            Trace.beginSection("rebuildObjectGraph.branchManager");
                            try {
                                BranchManager branchManager2 = appEntryPoint.branchManager();
                                Trace.endSection();
                                branchManager = branchManager2;
                                Trace.beginSection("rebuildObjectGraph.referredManager");
                                try {
                                    BranchAttributionManager branchAttributionManagerReferredManager = appEntryPoint.referredManager();
                                    Trace.endSection();
                                    referredManager = branchAttributionManagerReferredManager;
                                    Trace.beginSection("rebuildObjectGraph.notificationManager");
                                    try {
                                        NotificationManager notificationManager2 = appEntryPoint.notificationManager();
                                        Trace.endSection();
                                        notificationManager = notificationManager2;
                                        Trace.beginSection("rebuildObjectGraph.analytics");
                                        try {
                                            AnalyticsLogger analyticsLoggerAnalytics = appEntryPoint.analytics();
                                            Trace.endSection();
                                            analytics = analyticsLoggerAnalytics;
                                            Trace.beginSection("rebuildObjectGraph.eventLogger");
                                            try {
                                                EventLogger eventLogger2 = appEntryPoint.eventLogger();
                                                Trace.endSection();
                                                eventLogger = eventLogger2;
                                                Trace.beginSection("rebuildObjectGraph.experimentsStore");
                                                try {
                                                    ExperimentsStore experimentsStore2 = appEntryPoint.experimentsStore();
                                                    Trace.endSection();
                                                    experimentsStore = experimentsStore2;
                                                    Trace.beginSection("rebuildObjectGraph.appInitializedListeners");
                                                    try {
                                                        Set<AppInitializedListener> setAppInitializedListeners = appEntryPoint.appInitializedListeners();
                                                        Trace.endSection();
                                                        appInitializedListeners = setAppInitializedListeners;
                                                        Trace.beginSection("rebuildObjectGraph.sessionManager");
                                                        try {
                                                            SessionManager sessionManager2 = appEntryPoint.sessionManager();
                                                            Trace.endSection();
                                                            sessionManager = sessionManager2;
                                                            Trace.beginSection("rebuildObjectGraph.periodicWorkers");
                                                            try {
                                                                Set<PeriodicWorker> setPeriodicWorkers = appEntryPoint.periodicWorkers();
                                                                Trace.endSection();
                                                                periodicWorkers = setPeriodicWorkers;
                                                                Trace.beginSection("rebuildObjectGraph.startupPerformanceLogger");
                                                                try {
                                                                    StartupPerformanceLogger startupPerformanceLogger2 = appEntryPoint.startupPerformanceLogger();
                                                                    Trace.endSection();
                                                                    startupPerformanceLogger = startupPerformanceLogger2;
                                                                    Trace.beginSection("rebuildObjectGraph.rhProcessLifecycleOwner");
                                                                    try {
                                                                        RhProcessLifecycleOwner rhProcessLifecycleOwner2 = appEntryPoint.rhProcessLifecycleOwner();
                                                                        Trace.endSection();
                                                                        rhProcessLifecycleOwner = rhProcessLifecycleOwner2;
                                                                        Trace.beginSection("rebuildObjectGraph.rhShortcutManager");
                                                                        try {
                                                                            RhShortcutManager rhShortcutManager2 = appEntryPoint.rhShortcutManager();
                                                                            Trace.endSection();
                                                                            rhShortcutManager = rhShortcutManager2;
                                                                            ProcessLifecycleOwner.Companion companion = ProcessLifecycleOwner.INSTANCE;
                                                                            Lifecycle lifecycle = companion.get().getLifecycle();
                                                                            RhProcessLifecycleOwner rhProcessLifecycleOwner3 = rhProcessLifecycleOwner;
                                                                            RhShortcutManager rhShortcutManager3 = null;
                                                                            if (rhProcessLifecycleOwner3 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("rhProcessLifecycleOwner");
                                                                                rhProcessLifecycleOwner3 = null;
                                                                            }
                                                                            lifecycle.addObserver(rhProcessLifecycleOwner3);
                                                                            RhProcessLifecycleOwner rhProcessLifecycleOwner4 = rhProcessLifecycleOwner;
                                                                            if (rhProcessLifecycleOwner4 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("rhProcessLifecycleOwner");
                                                                                rhProcessLifecycleOwner4 = null;
                                                                            }
                                                                            SessionManager sessionManager3 = sessionManager;
                                                                            if (sessionManager3 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
                                                                                sessionManager3 = null;
                                                                            }
                                                                            rhProcessLifecycleOwner4.register(sessionManager3);
                                                                            Lifecycle lifecycle2 = companion.get().getLifecycle();
                                                                            StartupPerformanceLogger startupPerformanceLogger3 = startupPerformanceLogger;
                                                                            if (startupPerformanceLogger3 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("startupPerformanceLogger");
                                                                                startupPerformanceLogger3 = null;
                                                                            }
                                                                            lifecycle2.addObserver(startupPerformanceLogger3);
                                                                            StartupPerformanceLogger startupPerformanceLogger4 = startupPerformanceLogger;
                                                                            if (startupPerformanceLogger4 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("startupPerformanceLogger");
                                                                                startupPerformanceLogger4 = null;
                                                                            }
                                                                            application.registerActivityLifecycleCallbacks(startupPerformanceLogger4);
                                                                            Set set = activityLifecycleCallbacks;
                                                                            if (set == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("activityLifecycleCallbacks");
                                                                                set = null;
                                                                            }
                                                                            Iterator it = set.iterator();
                                                                            while (it.hasNext()) {
                                                                                application.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) it.next());
                                                                            }
                                                                            Set<AppInitializedListener> set2 = appInitializedListeners;
                                                                            if (set2 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("appInitializedListeners");
                                                                                set2 = null;
                                                                            }
                                                                            for (AppInitializedListener appInitializedListener : set2) {
                                                                                Trace.beginSection(appInitializedListener.getClass().getSimpleName() + ".onAppInitialized");
                                                                                try {
                                                                                    appInitializedListener.onAppInitialized(application);
                                                                                    Unit unit = Unit.INSTANCE;
                                                                                    Trace.endSection();
                                                                                } finally {
                                                                                }
                                                                            }
                                                                            Set set3 = periodicWorkers;
                                                                            if (set3 == null) {
                                                                                Intrinsics.throwUninitializedPropertyAccessException("periodicWorkers");
                                                                                set3 = null;
                                                                            }
                                                                            Iterator it2 = set3.iterator();
                                                                            while (it2.hasNext()) {
                                                                                ((PeriodicWorker) it2.next()).schedule(application);
                                                                            }
                                                                            Trace.beginSection("rebuildObjectGraph.initializeComponents");
                                                                            try {
                                                                                BranchManager branchManager3 = branchManager;
                                                                                if (branchManager3 == null) {
                                                                                    Intrinsics.throwUninitializedPropertyAccessException("branchManager");
                                                                                    branchManager3 = null;
                                                                                }
                                                                                branchManager3.appInit(application);
                                                                                RealAuthManager realAuthManager = authManager;
                                                                                if (realAuthManager == null) {
                                                                                    Intrinsics.throwUninitializedPropertyAccessException("authManager");
                                                                                    realAuthManager = null;
                                                                                }
                                                                                realAuthManager.onAppCreated();
                                                                                BranchAttributionManager branchAttributionManager = referredManager;
                                                                                if (branchAttributionManager == null) {
                                                                                    Intrinsics.throwUninitializedPropertyAccessException("referredManager");
                                                                                    branchAttributionManager = null;
                                                                                }
                                                                                branchAttributionManager.resetReferredAnalytics();
                                                                                ExperimentsStore experimentsStore3 = experimentsStore;
                                                                                if (experimentsStore3 == null) {
                                                                                    Intrinsics.throwUninitializedPropertyAccessException("experimentsStore");
                                                                                    experimentsStore3 = null;
                                                                                }
                                                                                experimentsStore3.onAppCreated();
                                                                                NotificationManager notificationManager3 = notificationManager;
                                                                                if (notificationManager3 == null) {
                                                                                    Intrinsics.throwUninitializedPropertyAccessException("notificationManager");
                                                                                    notificationManager3 = null;
                                                                                }
                                                                                notificationManager3.initNotificationChannels(application);
                                                                                RhShortcutManager rhShortcutManager4 = rhShortcutManager;
                                                                                if (rhShortcutManager4 == null) {
                                                                                    Intrinsics.throwUninitializedPropertyAccessException("rhShortcutManager");
                                                                                } else {
                                                                                    rhShortcutManager3 = rhShortcutManager4;
                                                                                }
                                                                                rhShortcutManager3.initialize();
                                                                                Unit unit2 = Unit.INSTANCE;
                                                                                Trace.endSection();
                                                                                Iterator it3 = listTearDownObjectGraph.iterator();
                                                                                while (it3.hasNext()) {
                                                                                    LeakDetector.INSTANCE.expectWeaklyReachable(it3.next(), MESSAGE_REBUILD);
                                                                                }
                                                                                Unit unit3 = Unit.INSTANCE;
                                                                            } catch (Throwable th) {
                                                                                throw th;
                                                                            }
                                                                        } finally {
                                                                        }
                                                                    } finally {
                                                                    }
                                                                } finally {
                                                                }
                                                            } finally {
                                                            }
                                                        } finally {
                                                        }
                                                    } finally {
                                                    }
                                                } finally {
                                                }
                                            } finally {
                                            }
                                        } finally {
                                        }
                                    } finally {
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final List<Object> tearDownObjectGraph(Application application) {
        CoroutineScope coroutineScope;
        RealAuthManager realAuthManager;
        BranchManager branchManager2;
        BranchAttributionManager branchAttributionManager;
        ExperimentsStore experimentsStore2;
        NotificationManager notificationManager2;
        AnalyticsLogger analyticsLogger;
        Timber.INSTANCE.mo3356i("tearDownObjectGraph()", new Object[0]);
        if (activityLifecycleCallbacks == null) {
            return CollectionsKt.emptyList();
        }
        Intrinsics.checkNotNull(application, "null cannot be cast to non-null type com.robinhood.hammer.android.application.ApplicationComponentManagerHolder<*>");
        ((ApplicationComponentManagerHolder) application).resetComponent();
        CoroutineScope coroutineScope2 = rootCoroutineScope;
        Set<? extends AppInitializedListener> set = null;
        if (coroutineScope2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootCoroutineScope");
            coroutineScope2 = null;
        }
        CoroutineScope2.cancel$default(coroutineScope2, MESSAGE_REBUILD, null, 2, null);
        Set<? extends ActivityLifecycleListener> set2 = activityLifecycleCallbacks;
        if (set2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityLifecycleCallbacks");
            set2 = null;
        }
        Iterator<T> it = set2.iterator();
        while (it.hasNext()) {
            application.unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) it.next());
        }
        Set<PeriodicWorker> set3 = periodicWorkers;
        if (set3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("periodicWorkers");
            set3 = null;
        }
        Iterator<T> it2 = set3.iterator();
        while (it2.hasNext()) {
            ((PeriodicWorker) it2.next()).cancel(application);
        }
        ProcessLifecycleOwner.Companion companion = ProcessLifecycleOwner.INSTANCE;
        Lifecycle lifecycle = companion.get().getLifecycle();
        StartupPerformanceLogger startupPerformanceLogger2 = startupPerformanceLogger;
        if (startupPerformanceLogger2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("startupPerformanceLogger");
            startupPerformanceLogger2 = null;
        }
        lifecycle.removeObserver(startupPerformanceLogger2);
        StartupPerformanceLogger startupPerformanceLogger3 = startupPerformanceLogger;
        if (startupPerformanceLogger3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("startupPerformanceLogger");
            startupPerformanceLogger3 = null;
        }
        application.unregisterActivityLifecycleCallbacks(startupPerformanceLogger3);
        RhProcessLifecycleOwner rhProcessLifecycleOwner2 = rhProcessLifecycleOwner;
        if (rhProcessLifecycleOwner2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rhProcessLifecycleOwner");
            rhProcessLifecycleOwner2 = null;
        }
        rhProcessLifecycleOwner2.unregisterAll();
        Lifecycle lifecycle2 = companion.get().getLifecycle();
        RhProcessLifecycleOwner rhProcessLifecycleOwner3 = rhProcessLifecycleOwner;
        if (rhProcessLifecycleOwner3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rhProcessLifecycleOwner");
            rhProcessLifecycleOwner3 = null;
        }
        lifecycle2.removeObserver(rhProcessLifecycleOwner3);
        CoroutineScope coroutineScope3 = rootCoroutineScope;
        if (coroutineScope3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootCoroutineScope");
            coroutineScope = null;
        } else {
            coroutineScope = coroutineScope3;
        }
        RealAuthManager realAuthManager2 = authManager;
        if (realAuthManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("authManager");
            realAuthManager = null;
        } else {
            realAuthManager = realAuthManager2;
        }
        BranchManager branchManager3 = branchManager;
        if (branchManager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("branchManager");
            branchManager2 = null;
        } else {
            branchManager2 = branchManager3;
        }
        BranchAttributionManager branchAttributionManager2 = referredManager;
        if (branchAttributionManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("referredManager");
            branchAttributionManager = null;
        } else {
            branchAttributionManager = branchAttributionManager2;
        }
        ExperimentsStore experimentsStore3 = experimentsStore;
        if (experimentsStore3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("experimentsStore");
            experimentsStore2 = null;
        } else {
            experimentsStore2 = experimentsStore3;
        }
        NotificationManager notificationManager3 = notificationManager;
        if (notificationManager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("notificationManager");
            notificationManager2 = null;
        } else {
            notificationManager2 = notificationManager3;
        }
        AnalyticsLogger analyticsLogger2 = analytics;
        if (analyticsLogger2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("analytics");
            analyticsLogger = null;
        } else {
            analyticsLogger = analyticsLogger2;
        }
        List listListOf = CollectionsKt.listOf(coroutineScope, realAuthManager, branchManager2, branchAttributionManager, experimentsStore2, notificationManager2, analyticsLogger);
        Set<? extends ActivityLifecycleListener> set4 = activityLifecycleCallbacks;
        if (set4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityLifecycleCallbacks");
            set4 = null;
        }
        List listPlus = CollectionsKt.plus((Collection) listListOf, (Iterable) set4);
        Set<? extends AppInitializedListener> set5 = appInitializedListeners;
        if (set5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appInitializedListeners");
        } else {
            set = set5;
        }
        return CollectionsKt.plus((Collection) listPlus, (Iterable) set);
    }

    @Override // com.robinhood.android.util.login.UserLifecycleListener
    public void onUserStateChanged(Context context, UserLifecycleListener.State newState) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(newState, "newState");
        if (newState == UserLifecycleListener.State.LOGGED_OUT) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            rebuildObjectGraph((Application) applicationContext);
        }
    }
}
