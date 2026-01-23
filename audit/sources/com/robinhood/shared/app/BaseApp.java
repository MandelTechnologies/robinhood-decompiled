package com.robinhood.shared.app;

import android.app.ActivityManager;
import android.app.Application;
import android.app.job.JobScheduler;
import android.os.Build;
import android.util.DisplayMetrics;
import android.webkit.WebView;
import androidx.tracing.Trace;
import com.google.firebase.FirebaseApp;
import com.jakewharton.processphoenix.ProcessPhoenix;
import com.robinhood.Logger;
import com.robinhood.analytics.performance.ColdStartDetector;
import com.robinhood.android.sentry.InitializeSentry;
import com.robinhood.leakcanary.LeakDetector;
import com.robinhood.p370rx.android.RxSchedulerMonitor;
import com.robinhood.utils.android.BuildConfig;
import com.robinhood.utils.android.errorhandling.RhUncaughtExceptionHandler;
import com.robinhood.utils.android.errorhandling.RhUncaughtExceptionNotificationInterceptor;
import com.robinhood.utils.buildconfig.BuildFlavors;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.CrashReporters2;
import com.robinhood.utils.logging.CrashReporters4;
import com.robinhood.utils.logging.TimberLogger;
import java.lang.Thread;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import timber.log.Timber;

/* compiled from: BaseApp.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0017J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\f\u0010\u0007\u001a\u00020\u0005*\u00020\bH\u0002J\b\u0010\t\u001a\u00020\u0005H&¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/app/BaseApp;", "Landroid/app/Application;", "<init>", "()V", "onCreate", "", "initCrashReporting", "addDebugMetadata", "Lcom/robinhood/utils/logging/CrashReporter;", "rebuildObjectGraph", "lib-app_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public abstract class BaseApp extends Application {
    public abstract void rebuildObjectGraph();

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        if (LeakDetector.INSTANCE.initialize(this).isInAnalyzerProcess()) {
            FirebaseApp.initializeApp(this);
            initCrashReporting();
            return;
        }
        InitializeSentry.initializeSentry(this);
        ColdStartDetector.INSTANCE.onApplicationCreate(this);
        if (Build.VERSION.SDK_INT >= 26) {
            Timber.INSTANCE.mo3356i("Canceling existing jobs...", new Object[0]);
            Object systemService = getSystemService("jobscheduler");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
            JobScheduler jobScheduler = (JobScheduler) systemService;
            int[] iArr = {0, 1, 2, 100, 101, 102};
            for (int i = 0; i < 6; i++) {
                jobScheduler.cancel(iArr[i]);
            }
        }
        boolean z = BuildConfig.DEBUG;
        if ((z || Intrinsics.areEqual(BuildConfig.FLAVOR, "internal")) && ProcessPhoenix.isPhoenixProcess(this)) {
            return;
        }
        System.setProperty("kotlinx.coroutines.debug", "on");
        if (z) {
            Timber.INSTANCE.plant(new Timber.DebugTree());
            RxSchedulerMonitor.INSTANCE.init();
        }
        initCrashReporting();
        Logger.INSTANCE.init(TimberLogger.INSTANCE);
        rebuildObjectGraph();
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Intrinsics.checkNotNull(defaultUncaughtExceptionHandler);
        Thread.setDefaultUncaughtExceptionHandler(new RhUncaughtExceptionNotificationInterceptor(this, new RhUncaughtExceptionHandler(this, defaultUncaughtExceptionHandler)));
        if (BuildFlavors.INSTANCE.isDebugOrInternal()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
    }

    private final void initCrashReporting() {
        CrashReporter crashReporter;
        Trace.beginSection("App.initCrashReporting");
        try {
            if (BuildConfig.DEBUG) {
                crashReporter = CrashReporters2.INSTANCE;
            } else {
                crashReporter = CrashReporters4.INSTANCE;
            }
            CrashReporter.INSTANCE.init(crashReporter);
            addDebugMetadata(crashReporter);
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addDebugMetadata(CrashReporter crashReporter) {
        ActivityManager activityManager = ContextSystemServices.getActivityManager(this);
        crashReporter.addMetadata("ActivityManager.memoryClass", Integer.valueOf(activityManager.getMemoryClass()));
        crashReporter.addMetadata("ActivityManager.isLowRamDevice", Boolean.valueOf(activityManager.isLowRamDevice()));
        String BOARD = Build.BOARD;
        Intrinsics.checkNotNullExpressionValue(BOARD, "BOARD");
        crashReporter.addMetadata("Build.BOARD", BOARD);
        String BOOTLOADER = Build.BOOTLOADER;
        Intrinsics.checkNotNullExpressionValue(BOOTLOADER, "BOOTLOADER");
        crashReporter.addMetadata("Build.BOOTLOADER", BOOTLOADER);
        String BRAND = Build.BRAND;
        Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
        crashReporter.addMetadata("Build.BRAND", BRAND);
        String DEVICE = Build.DEVICE;
        Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
        crashReporter.addMetadata("Build.DEVICE", DEVICE);
        String DISPLAY = Build.DISPLAY;
        Intrinsics.checkNotNullExpressionValue(DISPLAY, "DISPLAY");
        crashReporter.addMetadata("Build.DISPLAY", DISPLAY);
        String HARDWARE = Build.HARDWARE;
        Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
        crashReporter.addMetadata("Build.HARDWARE", HARDWARE);
        String ID = Build.ID;
        Intrinsics.checkNotNullExpressionValue(ID, "ID");
        crashReporter.addMetadata("Build.ID", ID);
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        crashReporter.addMetadata("Build.MANUFACTURER", MANUFACTURER);
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        crashReporter.addMetadata("Build.MODEL", MODEL);
        String PRODUCT = Build.PRODUCT;
        Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
        crashReporter.addMetadata("Build.PRODUCT", PRODUCT);
        String TAGS = Build.TAGS;
        Intrinsics.checkNotNullExpressionValue(TAGS, "TAGS");
        crashReporter.addMetadata("Build.TAGS", TAGS);
        String TYPE = Build.TYPE;
        Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
        crashReporter.addMetadata("Build.TYPE", TYPE);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        crashReporter.addMetadata("MemoryInfo.totalMem", Long.valueOf(memoryInfo.totalMem));
        crashReporter.addMetadata("MemoryInfo.availMem", Long.valueOf(memoryInfo.availMem));
        crashReporter.addMetadata("MemoryInfo.threshold", Long.valueOf(memoryInfo.threshold));
        crashReporter.addMetadata("Runtime.maxMemory", Long.valueOf(Runtime.getRuntime().maxMemory()));
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        crashReporter.addMetadata("Configuration.metrics", displayMetrics);
        crashReporter.addMetadata("Configuration.fontScale", Float.valueOf(getResources().getConfiguration().fontScale));
        crashReporter.addMetadata("Configuration.densityDpi", Integer.valueOf(getResources().getConfiguration().densityDpi));
    }
}
