package com.robinhood.analytics;

import android.annotation.TargetApi;
import android.app.Application;
import android.app.NotificationChannel;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Build;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.hammer.android.application.ApplicationComponentManagerHolder;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.work.PeriodicWorker;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PeriodicLoggingWorker.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0002\u0012\u0013B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0003R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/analytics/PeriodicLoggingWorker;", "Landroidx/work/Worker;", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "logNotificationChannels", "", "PeriodicLoggingWorkerEntryPoint", "Companion", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class PeriodicLoggingWorker extends Worker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public AnalyticsLogger analytics;

    /* compiled from: PeriodicLoggingWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/analytics/PeriodicLoggingWorker$PeriodicLoggingWorkerEntryPoint;", "", "inject", "", "obj", "Lcom/robinhood/analytics/PeriodicLoggingWorker;", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface PeriodicLoggingWorkerEntryPoint {
        void inject(PeriodicLoggingWorker obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeriodicLoggingWorker(Context context, WorkerParameters params) {
        ComponentCallbacks2 componentCallbacks2;
        super(context, params);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        if (context instanceof Application) {
            componentCallbacks2 = (Application) context;
        } else {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            componentCallbacks2 = (Application) applicationContext;
        }
        ((PeriodicLoggingWorkerEntryPoint) ((ApplicationComponentManagerHolder) componentCallbacks2).getComponentManager().get()).inject(this);
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        logNotificationChannels();
        ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
        Intrinsics.checkNotNullExpressionValue(resultSuccess, "success(...)");
        return resultSuccess;
    }

    @TargetApi(26)
    private final void logNotificationChannels() {
        String str;
        if (Build.VERSION.SDK_INT >= 26) {
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            List<NotificationChannel> notificationChannels = ContextSystemServices.getNotificationManager(applicationContext).getNotificationChannels();
            Intrinsics.checkNotNullExpressionValue(notificationChannels, "getNotificationChannels(...)");
            Iterator<T> it = notificationChannels.iterator();
            while (it.hasNext()) {
                NotificationChannel notificationChannelM1686m = PeriodicLoggingWorker$$ExternalSyntheticApiModelOutline0.m1686m(it.next());
                int importance = notificationChannelM1686m != null ? notificationChannelM1686m.getImportance() : -1000;
                if (importance == -1000) {
                    str = "unspecified";
                } else if (importance == 0) {
                    str = "off";
                } else if (importance == 1) {
                    str = "min";
                } else if (importance == 2) {
                    str = "low";
                } else if (importance == 3) {
                    str = AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT;
                } else if (importance == 4) {
                    str = "high";
                } else if (importance == 5) {
                    str = AnalyticsStrings.MAX_WELCOME_TAG;
                } else {
                    str = "unknown";
                }
                String str2 = str;
                AnalyticsLogger.DefaultImpls.logUserAction$default(getAnalytics(), "android_notification_settings_" + notificationChannelM1686m.getId(), str2, null, null, 12, null);
            }
        }
    }

    /* compiled from: PeriodicLoggingWorker.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/analytics/PeriodicLoggingWorker$Companion;", "Lcom/robinhood/work/PeriodicWorker;", "<init>", "()V", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion extends PeriodicWorker {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super("rh_periodic_logging_work_2", PeriodicLoggingWorker.class, 1L, TimeUnit.DAYS, null, null, "rh_periodic_logging_work", 48, null);
        }
    }
}
