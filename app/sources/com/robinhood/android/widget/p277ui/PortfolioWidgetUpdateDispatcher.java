package com.robinhood.android.widget.p277ui;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import com.robinhood.android.util.login.UserLifecycleListener;
import com.robinhood.android.widget.util.PortfolioWidgetInfo;
import com.robinhood.android.widget.util.PortfolioWidgetInfoPref;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PortfolioWidgetUpdateDispatcher.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J \u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000eJ(\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\tH\u0002¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdateDispatcher;", "Lcom/robinhood/android/util/login/UserLifecycleListener;", "widgetInfoPref", "Lcom/robinhood/android/widget/util/PortfolioWidgetInfoPref;", "<init>", "(Lcom/robinhood/android/widget/util/PortfolioWidgetInfoPref;)V", "onUserStateChanged", "", "context", "Landroid/content/Context;", "newState", "Lcom/robinhood/android/util/login/UserLifecycleListener$State;", "scheduleUpdate", "force", "", "isImmediate", "dispatchUpdate", "initialDelayMs", "", "updatePeriodMs", "getShortestUpdatePeriod", "(Landroid/content/Context;)Ljava/lang/Long;", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class PortfolioWidgetUpdateDispatcher implements UserLifecycleListener {
    private final PortfolioWidgetInfoPref widgetInfoPref;

    public PortfolioWidgetUpdateDispatcher(PortfolioWidgetInfoPref widgetInfoPref) {
        Intrinsics.checkNotNullParameter(widgetInfoPref, "widgetInfoPref");
        this.widgetInfoPref = widgetInfoPref;
    }

    @Override // com.robinhood.android.util.login.UserLifecycleListener
    public void onUserStateChanged(Context context, UserLifecycleListener.State newState) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(newState, "newState");
        scheduleUpdate(context, true, true);
    }

    public static /* synthetic */ void scheduleUpdate$default(PortfolioWidgetUpdateDispatcher portfolioWidgetUpdateDispatcher, Context context, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = true;
        }
        portfolioWidgetUpdateDispatcher.scheduleUpdate(context, z, z2);
    }

    public final void scheduleUpdate(Context context, boolean force, boolean isImmediate) {
        long j;
        PortfolioWidgetUpdateDispatcher portfolioWidgetUpdateDispatcher;
        Context context2;
        boolean z;
        Intrinsics.checkNotNullParameter(context, "context");
        Long shortestUpdatePeriod = getShortestUpdatePeriod(context);
        if (shortestUpdatePeriod != null) {
            long jLongValue = shortestUpdatePeriod.longValue();
            if (isImmediate) {
                j = 0;
                context2 = context;
                z = force;
                portfolioWidgetUpdateDispatcher = this;
            } else {
                j = jLongValue;
                portfolioWidgetUpdateDispatcher = this;
                context2 = context;
                z = force;
            }
            portfolioWidgetUpdateDispatcher.dispatchUpdate(context2, z, j, jLongValue);
        }
    }

    private final void dispatchUpdate(Context context, boolean force, long initialDelayMs, long updatePeriodMs) {
        PortfolioWidgetUpdateWorker.INSTANCE.enqueueUnique(context, force, initialDelayMs, updatePeriodMs);
    }

    private final Long getShortestUpdatePeriod(Context context) {
        int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class<?>) PortfolioWidgetProvider.class));
        Intrinsics.checkNotNull(appWidgetIds);
        if (appWidgetIds.length == 0) {
            return null;
        }
        long value = Long.MAX_VALUE;
        for (int i : appWidgetIds) {
            PortfolioWidgetInfo portfolioWidgetInfo = this.widgetInfoPref.get(i);
            long value2 = portfolioWidgetInfo.getUpdatePeriod().getValue();
            if (value2 != 0 && value2 < value) {
                value = portfolioWidgetInfo.getUpdatePeriod().getValue();
            }
        }
        return Long.valueOf(value);
    }
}
