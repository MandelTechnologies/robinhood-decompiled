package com.robinhood.android.widget.p277ui;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.charts.models.p080db.PortfolioChartModel;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.widget.C31480R;
import com.robinhood.android.widget.util.PortfolioWidgetLastUpdatedPref;
import com.robinhood.librobinhood.data.store.bonfire.chart.ServerDrivenPortfolioChartStore;
import com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.models.serverdriven.experimental.api.DisplayText;
import com.robinhood.models.serverdriven.experimental.api.IconDisplayText;
import com.robinhood.models.serverdriven.experimental.api.SubDisplayText;
import com.robinhood.prefs.LongPreference;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.datetime.LocalDates;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.rx2.RxAwait3;
import p479j$.time.Instant;

/* compiled from: PortfolioWidgetUpdater.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0086@¢\u0006\u0002\u00100J:\u00101\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020-2\b\u00107\u001a\u0004\u0018\u0001082\u0006\u0010.\u001a\u00020/H\u0002J2\u00109\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010:\u001a\u0002032\u0006\u0010;\u001a\u00020<2\b\u00107\u001a\u0004\u0018\u0001082\u0006\u0010.\u001a\u00020/H\u0002J(\u0010=\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010:\u001a\u0002032\u0006\u0010;\u001a\u00020<2\u0006\u0010.\u001a\u00020/H\u0002J \u0010>\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010:\u001a\u0002032\u0006\u0010;\u001a\u00020<H\u0002J\u0018\u0010?\u001a\u0004\u0018\u0001082\u0006\u0010,\u001a\u00020-H\u0082@¢\u0006\u0002\u0010@J\b\u0010A\u001a\u00020-H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\"\u001a\u00020#8\u0000@\u0000X\u0081.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006B"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdater;", "", "<init>", "()V", "lastUpdatedPref", "Lcom/robinhood/prefs/LongPreference;", "getLastUpdatedPref", "()Lcom/robinhood/prefs/LongPreference;", "setLastUpdatedPref", "(Lcom/robinhood/prefs/LongPreference;)V", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "getUnifiedAccountStore", "()Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "setUnifiedAccountStore", "(Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;)V", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "getAuthManager", "()Lcom/robinhood/shared/security/auth/AuthManager;", "setAuthManager", "(Lcom/robinhood/shared/security/auth/AuthManager;)V", "serverDrivenPortfolioChartStore", "Lcom/robinhood/librobinhood/data/store/bonfire/chart/ServerDrivenPortfolioChartStore;", "getServerDrivenPortfolioChartStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/chart/ServerDrivenPortfolioChartStore;", "setServerDrivenPortfolioChartStore", "(Lcom/robinhood/librobinhood/data/store/bonfire/chart/ServerDrivenPortfolioChartStore;)V", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "getMarketHoursManager", "()Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "setMarketHoursManager", "(Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;)V", "viewsBuilder", "Lcom/robinhood/android/widget/ui/PortfolioWidgetViewsBuilder;", "getViewsBuilder$feature_widget_externalDebug", "()Lcom/robinhood/android/widget/ui/PortfolioWidgetViewsBuilder;", "setViewsBuilder$feature_widget_externalDebug", "(Lcom/robinhood/android/widget/ui/PortfolioWidgetViewsBuilder;)V", "handleUpdate", "", "context", "Landroid/content/Context;", "force", "", "refreshPendingIntent", "Landroid/app/PendingIntent;", "(Landroid/content/Context;ZLandroid/app/PendingIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAllWidgets", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "widgetIds", "", "isLoggedIn", "widgetPortfolioData", "Lcom/robinhood/android/widget/ui/WidgetPortfolioData;", "updateWidget", "manager", "widgetId", "", "updateWidgetLoading", "updateWidgetUnauthenticated", "getWidgetPortfolioData", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldUpdateBasedOnMarketHours", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class PortfolioWidgetUpdater {
    public AuthManager authManager;

    @PortfolioWidgetLastUpdatedPref
    public LongPreference lastUpdatedPref;
    public TraderMarketHoursManager marketHoursManager;
    public ServerDrivenPortfolioChartStore serverDrivenPortfolioChartStore;
    public UnifiedAccountStore unifiedAccountStore;
    public PortfolioWidgetViewsBuilder viewsBuilder;

    /* compiled from: PortfolioWidgetUpdater.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.widget.ui.PortfolioWidgetUpdater", m3645f = "PortfolioWidgetUpdater.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE, EnumC7081g.SDK_ASSET_ICON_ARROW_UP_VALUE}, m3647m = "getWidgetPortfolioData")
    /* renamed from: com.robinhood.android.widget.ui.PortfolioWidgetUpdater$getWidgetPortfolioData$1 */
    static final class C314831 extends ContinuationImpl {
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C314831(Continuation<? super C314831> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PortfolioWidgetUpdater.this.getWidgetPortfolioData(false, this);
        }
    }

    /* compiled from: PortfolioWidgetUpdater.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.widget.ui.PortfolioWidgetUpdater", m3645f = "PortfolioWidgetUpdater.kt", m3646l = {61}, m3647m = "handleUpdate")
    /* renamed from: com.robinhood.android.widget.ui.PortfolioWidgetUpdater$handleUpdate$1 */
    static final class C314861 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C314861(Continuation<? super C314861> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PortfolioWidgetUpdater.this.handleUpdate(null, false, null, this);
        }
    }

    public final LongPreference getLastUpdatedPref() {
        LongPreference longPreference = this.lastUpdatedPref;
        if (longPreference != null) {
            return longPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("lastUpdatedPref");
        return null;
    }

    public final void setLastUpdatedPref(LongPreference longPreference) {
        Intrinsics.checkNotNullParameter(longPreference, "<set-?>");
        this.lastUpdatedPref = longPreference;
    }

    public final UnifiedAccountStore getUnifiedAccountStore() {
        UnifiedAccountStore unifiedAccountStore = this.unifiedAccountStore;
        if (unifiedAccountStore != null) {
            return unifiedAccountStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("unifiedAccountStore");
        return null;
    }

    public final void setUnifiedAccountStore(UnifiedAccountStore unifiedAccountStore) {
        Intrinsics.checkNotNullParameter(unifiedAccountStore, "<set-?>");
        this.unifiedAccountStore = unifiedAccountStore;
    }

    public final AuthManager getAuthManager() {
        AuthManager authManager = this.authManager;
        if (authManager != null) {
            return authManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("authManager");
        return null;
    }

    public final void setAuthManager(AuthManager authManager) {
        Intrinsics.checkNotNullParameter(authManager, "<set-?>");
        this.authManager = authManager;
    }

    public final ServerDrivenPortfolioChartStore getServerDrivenPortfolioChartStore() {
        ServerDrivenPortfolioChartStore serverDrivenPortfolioChartStore = this.serverDrivenPortfolioChartStore;
        if (serverDrivenPortfolioChartStore != null) {
            return serverDrivenPortfolioChartStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("serverDrivenPortfolioChartStore");
        return null;
    }

    public final void setServerDrivenPortfolioChartStore(ServerDrivenPortfolioChartStore serverDrivenPortfolioChartStore) {
        Intrinsics.checkNotNullParameter(serverDrivenPortfolioChartStore, "<set-?>");
        this.serverDrivenPortfolioChartStore = serverDrivenPortfolioChartStore;
    }

    public final TraderMarketHoursManager getMarketHoursManager() {
        TraderMarketHoursManager traderMarketHoursManager = this.marketHoursManager;
        if (traderMarketHoursManager != null) {
            return traderMarketHoursManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("marketHoursManager");
        return null;
    }

    public final void setMarketHoursManager(TraderMarketHoursManager traderMarketHoursManager) {
        Intrinsics.checkNotNullParameter(traderMarketHoursManager, "<set-?>");
        this.marketHoursManager = traderMarketHoursManager;
    }

    public final PortfolioWidgetViewsBuilder getViewsBuilder$feature_widget_externalDebug() {
        PortfolioWidgetViewsBuilder portfolioWidgetViewsBuilder = this.viewsBuilder;
        if (portfolioWidgetViewsBuilder != null) {
            return portfolioWidgetViewsBuilder;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewsBuilder");
        return null;
    }

    public final void setViewsBuilder$feature_widget_externalDebug(PortfolioWidgetViewsBuilder portfolioWidgetViewsBuilder) {
        Intrinsics.checkNotNullParameter(portfolioWidgetViewsBuilder, "<set-?>");
        this.viewsBuilder = portfolioWidgetViewsBuilder;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleUpdate(Context context, boolean z, PendingIntent pendingIntent, Continuation<? super Unit> continuation) {
        C314861 c314861;
        PortfolioWidgetUpdater portfolioWidgetUpdater;
        Context context2;
        AppWidgetManager appWidgetManager;
        PendingIntent pendingIntent2;
        int[] iArr;
        int i;
        if (continuation instanceof C314861) {
            c314861 = (C314861) continuation;
            int i2 = c314861.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c314861.label = i2 - Integer.MIN_VALUE;
            } else {
                c314861 = new C314861(continuation);
            }
        }
        Object obj = c314861.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c314861.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            AppWidgetManager appWidgetManager2 = AppWidgetManager.getInstance(context);
            int[] appWidgetIds = appWidgetManager2.getAppWidgetIds(new ComponentName(context, (Class<?>) PortfolioWidgetProvider.class));
            boolean zShouldUpdateBasedOnMarketHours = shouldUpdateBasedOnMarketHours();
            boolean z2 = getAuthManager().isLoggedIn() && !getAuthManager().isLoggingOut();
            Intrinsics.checkNotNull(appWidgetIds);
            if (appWidgetIds.length == 0) {
                return Unit.INSTANCE;
            }
            if (!z && !zShouldUpdateBasedOnMarketHours) {
                return Unit.INSTANCE;
            }
            if (z2) {
                for (int i4 : appWidgetIds) {
                    Intrinsics.checkNotNull(appWidgetManager2);
                    updateWidgetLoading(context, appWidgetManager2, i4, pendingIntent);
                }
                Intrinsics.checkNotNull(appWidgetManager2);
                c314861.L$0 = pendingIntent;
                c314861.L$1 = this;
                c314861.L$2 = context;
                c314861.L$3 = appWidgetManager2;
                c314861.L$4 = appWidgetIds;
                c314861.I$0 = 1;
                c314861.label = 1;
                Object widgetPortfolioData = getWidgetPortfolioData(z, c314861);
                if (widgetPortfolioData == coroutine_suspended) {
                    return coroutine_suspended;
                }
                portfolioWidgetUpdater = this;
                context2 = context;
                appWidgetManager = appWidgetManager2;
                pendingIntent2 = pendingIntent;
                iArr = appWidgetIds;
                i = 1;
                obj = widgetPortfolioData;
            } else {
                Intrinsics.checkNotNull(appWidgetManager2);
                updateAllWidgets(context, appWidgetManager2, appWidgetIds, false, null, pendingIntent);
                return Unit.INSTANCE;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c314861.I$0;
            int[] iArr2 = (int[]) c314861.L$4;
            AppWidgetManager appWidgetManager3 = (AppWidgetManager) c314861.L$3;
            Context context3 = (Context) c314861.L$2;
            PortfolioWidgetUpdater portfolioWidgetUpdater2 = (PortfolioWidgetUpdater) c314861.L$1;
            PendingIntent pendingIntent3 = (PendingIntent) c314861.L$0;
            ResultKt.throwOnFailure(obj);
            iArr = iArr2;
            pendingIntent2 = pendingIntent3;
            appWidgetManager = appWidgetManager3;
            context2 = context3;
            portfolioWidgetUpdater = portfolioWidgetUpdater2;
        }
        portfolioWidgetUpdater.updateAllWidgets(context2, appWidgetManager, iArr, i != 0, (WidgetPortfolioData) obj, pendingIntent2);
        return Unit.INSTANCE;
    }

    private final void updateAllWidgets(Context context, AppWidgetManager appWidgetManager, int[] widgetIds, boolean isLoggedIn, WidgetPortfolioData widgetPortfolioData, PendingIntent refreshPendingIntent) {
        Context context2;
        AppWidgetManager appWidgetManager2;
        WidgetPortfolioData widgetPortfolioData2;
        PendingIntent pendingIntent;
        int length = widgetIds.length;
        int i = 0;
        while (i < length) {
            int i2 = widgetIds[i];
            if (isLoggedIn) {
                getLastUpdatedPref().set(System.currentTimeMillis());
                context2 = context;
                appWidgetManager2 = appWidgetManager;
                widgetPortfolioData2 = widgetPortfolioData;
                pendingIntent = refreshPendingIntent;
                updateWidget(context2, appWidgetManager2, i2, widgetPortfolioData2, pendingIntent);
            } else {
                context2 = context;
                appWidgetManager2 = appWidgetManager;
                widgetPortfolioData2 = widgetPortfolioData;
                pendingIntent = refreshPendingIntent;
                getLastUpdatedPref().delete();
                updateWidgetUnauthenticated(context2, appWidgetManager2, i2);
            }
            i++;
            context = context2;
            appWidgetManager = appWidgetManager2;
            widgetPortfolioData = widgetPortfolioData2;
            refreshPendingIntent = pendingIntent;
        }
    }

    private final void updateWidget(Context context, AppWidgetManager manager, int widgetId, WidgetPortfolioData widgetPortfolioData, PendingIntent refreshPendingIntent) {
        manager.updateAppWidget(widgetId, getViewsBuilder$feature_widget_externalDebug().buildDataViews(context, widgetId, widgetPortfolioData, refreshPendingIntent));
        manager.notifyAppWidgetViewDataChanged(widgetId, C31480R.id.widget_listview);
    }

    private final void updateWidgetLoading(Context context, AppWidgetManager manager, int widgetId, PendingIntent refreshPendingIntent) {
        manager.updateAppWidget(widgetId, getViewsBuilder$feature_widget_externalDebug().buildLoadingViews(context, refreshPendingIntent));
    }

    private final void updateWidgetUnauthenticated(Context context, AppWidgetManager manager, int widgetId) {
        manager.updateAppWidget(widgetId, getViewsBuilder$feature_widget_externalDebug().buildUnauthenticatedViews(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c0, code lost:
    
        if (r1 == r4) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getWidgetPortfolioData(boolean z, Continuation<? super WidgetPortfolioData> continuation) {
        C314831 c314831;
        PortfolioWidgetUpdater portfolioWidgetUpdater;
        boolean z2 = z;
        if (continuation instanceof C314831) {
            c314831 = (C314831) continuation;
            int i = c314831.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c314831.label = i - Integer.MIN_VALUE;
                portfolioWidgetUpdater = this;
            } else {
                portfolioWidgetUpdater = this;
                c314831 = portfolioWidgetUpdater.new C314831(continuation);
            }
        }
        Object objAwaitLast = c314831.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c314831.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwaitLast);
            portfolioWidgetUpdater.getUnifiedAccountStore().refresh(z2);
            Observable<UnifiedAccountV2> observableTake = portfolioWidgetUpdater.getUnifiedAccountStore().streamIndividualAccount().take(15L, TimeUnit.SECONDS).take(2L);
            Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
            c314831.Z$0 = z2;
            c314831.label = 1;
            objAwaitLast = RxAwait3.awaitLast(observableTake, c314831);
            if (objAwaitLast != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAwaitLast);
            return ((Optional) objAwaitLast).getOrNull();
        }
        z2 = c314831.Z$0;
        ResultKt.throwOnFailure(objAwaitLast);
        boolean z3 = z2;
        UnifiedAccountV2 unifiedAccountV2 = (UnifiedAccountV2) objAwaitLast;
        if (unifiedAccountV2 == null) {
            return null;
        }
        ServerDrivenPortfolioChartStore.refreshPortfolioChart$default(portfolioWidgetUpdater.getServerDrivenPortfolioChartStore(), unifiedAccountV2.getAccountNumber(), "day", true, false, z3, 8, null);
        Single singleOnErrorReturn = ServerDrivenPortfolioChartStore.getPortfolioChart$default(portfolioWidgetUpdater.getServerDrivenPortfolioChartStore(), unifiedAccountV2.getAccountNumber(), "day", true, false, 8, null).map(new Function() { // from class: com.robinhood.android.widget.ui.PortfolioWidgetUpdater.getWidgetPortfolioData.2
            @Override // io.reactivex.functions.Function
            public final Optional<WidgetPortfolioData> apply(PortfolioChartModel portfolioChartModel) {
                DisplayText primary_value;
                String value;
                SubDisplayText secondary_value;
                IconDisplayText main;
                String value2;
                Intrinsics.checkNotNullParameter(portfolioChartModel, "portfolioChartModel");
                CursorData defaultDisplay = portfolioChartModel.getDefaultDisplay();
                if (defaultDisplay == null || (primary_value = defaultDisplay.getPrimary_value()) == null || (value = primary_value.getValue()) == null) {
                    return Optional2.INSTANCE;
                }
                CursorData defaultDisplay2 = portfolioChartModel.getDefaultDisplay();
                if (defaultDisplay2 == null || (secondary_value = defaultDisplay2.getSecondary_value()) == null || (main = secondary_value.getMain()) == null || (value2 = main.getValue()) == null) {
                    return Optional2.INSTANCE;
                }
                boolean z4 = portfolioChartModel.getPageDirection() == Direction.f5855UP;
                return Optional3.asOptional(new WidgetPortfolioData(value, (z4 ? "+" : "-") + value2, z4));
            }
        }).timeout(15L, TimeUnit.SECONDS).onErrorReturn(new Function() { // from class: com.robinhood.android.widget.ui.PortfolioWidgetUpdater.getWidgetPortfolioData.3
            @Override // io.reactivex.functions.Function
            public final Optional<WidgetPortfolioData> apply(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional2.INSTANCE;
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleOnErrorReturn, "onErrorReturn(...)");
        c314831.label = 2;
        objAwaitLast = RxAwait3.await(singleOnErrorReturn, c314831);
    }

    private final boolean shouldUpdateBasedOnMarketHours() {
        Instant instantNow = Instant.now();
        Instant instantOfEpochMilli = Instant.ofEpochMilli(getLastUpdatedPref().get());
        MarketHours marketHoursBestGuessForDate = getMarketHoursManager().bestGuessForDate(LocalDates.currentDateInEst$default(null, 1, null));
        Intrinsics.checkNotNull(instantNow);
        if (!marketHoursBestGuessForDate.isOpenExtended(instantNow) && getLastUpdatedPref().isSet()) {
            Intrinsics.checkNotNull(instantOfEpochMilli);
            if (!marketHoursBestGuessForDate.isOpenExtended(instantOfEpochMilli)) {
                return false;
            }
        }
        return true;
    }
}
