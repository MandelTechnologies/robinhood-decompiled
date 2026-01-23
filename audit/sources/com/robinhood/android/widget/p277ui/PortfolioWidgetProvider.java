package com.robinhood.android.widget.p277ui;

import android.app.Application;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.widget.C31480R;
import com.robinhood.android.widget.util.PortfolioWidgetInfo;
import com.robinhood.android.widget.util.PortfolioWidgetInfoPref;
import com.robinhood.hammer.android.application.ApplicationComponentManagerHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PortfolioWidgetProvider.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J \u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J(\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010!\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/PortfolioWidgetProvider;", "Landroid/appwidget/AppWidgetProvider;", "<init>", "()V", "updateDispatcher", "Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdateDispatcher;", "getUpdateDispatcher", "()Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdateDispatcher;", "setUpdateDispatcher", "(Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdateDispatcher;)V", "widgetInfoPref", "Lcom/robinhood/android/widget/util/PortfolioWidgetInfoPref;", "getWidgetInfoPref", "()Lcom/robinhood/android/widget/util/PortfolioWidgetInfoPref;", "setWidgetInfoPref", "(Lcom/robinhood/android/widget/util/PortfolioWidgetInfoPref;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "inject", "onUpdate", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "appWidgetIds", "", "onAppWidgetOptionsChanged", "appWidgetId", "", "newOptions", "Landroid/os/Bundle;", "onDeleted", "EntryPoint", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class PortfolioWidgetProvider extends AppWidgetProvider {
    public PortfolioWidgetUpdateDispatcher updateDispatcher;
    public PortfolioWidgetInfoPref widgetInfoPref;

    /* compiled from: PortfolioWidgetProvider.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/PortfolioWidgetProvider$EntryPoint;", "", "portfolioWidgetUpdateDispatcher", "Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdateDispatcher;", "portfolioWidgetInfoPref", "Lcom/robinhood/android/widget/util/PortfolioWidgetInfoPref;", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes20.dex */
    public interface EntryPoint {
        PortfolioWidgetInfoPref portfolioWidgetInfoPref();

        PortfolioWidgetUpdateDispatcher portfolioWidgetUpdateDispatcher();
    }

    public final PortfolioWidgetUpdateDispatcher getUpdateDispatcher() {
        PortfolioWidgetUpdateDispatcher portfolioWidgetUpdateDispatcher = this.updateDispatcher;
        if (portfolioWidgetUpdateDispatcher != null) {
            return portfolioWidgetUpdateDispatcher;
        }
        Intrinsics.throwUninitializedPropertyAccessException("updateDispatcher");
        return null;
    }

    public final void setUpdateDispatcher(PortfolioWidgetUpdateDispatcher portfolioWidgetUpdateDispatcher) {
        Intrinsics.checkNotNullParameter(portfolioWidgetUpdateDispatcher, "<set-?>");
        this.updateDispatcher = portfolioWidgetUpdateDispatcher;
    }

    public final PortfolioWidgetInfoPref getWidgetInfoPref() {
        PortfolioWidgetInfoPref portfolioWidgetInfoPref = this.widgetInfoPref;
        if (portfolioWidgetInfoPref != null) {
            return portfolioWidgetInfoPref;
        }
        Intrinsics.throwUninitializedPropertyAccessException("widgetInfoPref");
        return null;
    }

    public final void setWidgetInfoPref(PortfolioWidgetInfoPref portfolioWidgetInfoPref) {
        Intrinsics.checkNotNullParameter(portfolioWidgetInfoPref, "<set-?>");
        this.widgetInfoPref = portfolioWidgetInfoPref;
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        inject(context);
        super.onReceive(context, intent);
    }

    private final void inject(Context context) {
        ComponentCallbacks2 componentCallbacks2;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        if (applicationContext instanceof Application) {
            componentCallbacks2 = (Application) applicationContext;
        } else {
            Context applicationContext2 = applicationContext.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext2, "null cannot be cast to non-null type android.app.Application");
            componentCallbacks2 = (Application) applicationContext2;
        }
        EntryPoint entryPoint = (EntryPoint) ((ApplicationComponentManagerHolder) componentCallbacks2).getComponentManager().get();
        setUpdateDispatcher(entryPoint.portfolioWidgetUpdateDispatcher());
        setWidgetInfoPref(entryPoint.portfolioWidgetInfoPref());
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
        Intrinsics.checkNotNullParameter(appWidgetIds, "appWidgetIds");
        super.onUpdate(context, appWidgetManager, appWidgetIds);
        getUpdateDispatcher().scheduleUpdate(context, true, true);
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int appWidgetId, Bundle newOptions) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
        Intrinsics.checkNotNullParameter(newOptions, "newOptions");
        super.onAppWidgetOptionsChanged(context, appWidgetManager, appWidgetId, newOptions);
        getWidgetInfoPref().set(appWidgetId, PortfolioWidgetInfo.copy$default(getWidgetInfoPref().get(appWidgetId), null, null, null, null, null, null, null, newOptions.getInt("appWidgetMinWidth"), newOptions.getInt("appWidgetMinHeight"), newOptions.getInt("appWidgetMaxWidth"), newOptions.getInt("appWidgetMaxHeight"), EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null));
        appWidgetManager.notifyAppWidgetViewDataChanged(appWidgetId, C31480R.id.widget_listview);
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDeleted(Context context, int[] appWidgetIds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appWidgetIds, "appWidgetIds");
        super.onDeleted(context, appWidgetIds);
        PortfolioWidgetInfoPref widgetInfoPref = getWidgetInfoPref();
        for (int i : appWidgetIds) {
            widgetInfoPref.delete(i);
        }
        getUpdateDispatcher().scheduleUpdate(context, false, true);
    }
}
