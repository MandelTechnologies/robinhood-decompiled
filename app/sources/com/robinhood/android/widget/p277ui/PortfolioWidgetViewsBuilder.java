package com.robinhood.android.widget.p277ui;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.widget.RemoteViews;
import com.robinhood.android.common.p088ui.daynight.NightModeManager;
import com.robinhood.android.common.p088ui.daynight.NightModeManager2;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.colorscheme.ColorSchemeManager;
import com.robinhood.android.home.contracts.WatchListIntentKey;
import com.robinhood.android.home.contracts.WatchListIntentKey2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.widget.C31480R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PortfolioWidgetViewsBuilder.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001b¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/PortfolioWidgetViewsBuilder;", "", "nightModeManager", "Lcom/robinhood/android/common/ui/daynight/NightModeManager;", "colorSchemeManager", "Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "<init>", "(Lcom/robinhood/android/common/ui/daynight/NightModeManager;Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;Lcom/robinhood/android/navigation/Navigator;)V", "buildDataViews", "Landroid/widget/RemoteViews;", "context", "Landroid/content/Context;", "widgetId", "", "widgetPortfolioData", "Lcom/robinhood/android/widget/ui/WidgetPortfolioData;", "refreshPendingIntent", "Landroid/app/PendingIntent;", "buildLoadingViews", "buildUnauthenticatedViews", "isDay", "", "()Z", "positiveColor", "getPositiveColor", "()I", "negativeColor", "getNegativeColor", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class PortfolioWidgetViewsBuilder {
    private final ColorSchemeManager colorSchemeManager;
    private final Navigator navigator;
    private final NightModeManager nightModeManager;

    /* compiled from: PortfolioWidgetViewsBuilder.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NightModeManager2.values().length];
            try {
                iArr[NightModeManager2.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NightModeManager2.NIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PortfolioWidgetViewsBuilder(NightModeManager nightModeManager, ColorSchemeManager colorSchemeManager, Navigator navigator) {
        Intrinsics.checkNotNullParameter(nightModeManager, "nightModeManager");
        Intrinsics.checkNotNullParameter(colorSchemeManager, "colorSchemeManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.nightModeManager = nightModeManager;
        this.colorSchemeManager = colorSchemeManager;
        this.navigator = navigator;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RemoteViews buildDataViews(Context context, int widgetId, WidgetPortfolioData widgetPortfolioData, PendingIntent refreshPendingIntent) {
        boolean z;
        int i;
        int negativeColor;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(refreshPendingIntent, "refreshPendingIntent");
        if (widgetPortfolioData != null) {
            z = widgetPortfolioData.isUp();
        }
        Icon iconCreateWithResource = Icon.createWithResource(context, C31480R.drawable.widget_rounded_top);
        ColorSchemeManager colorSchemeManager = this.colorSchemeManager;
        if (z) {
            if (isDay()) {
                i = C13997R.attr.colorSchemePositiveDefaultDay;
            } else {
                i = C13997R.attr.colorSchemePositiveDefaultNight;
            }
        } else if (isDay()) {
            i = C13997R.attr.colorSchemeNegativeDefaultDay;
        } else {
            i = C13997R.attr.colorSchemeNegativeDefaultNight;
        }
        iconCreateWithResource.setTint(colorSchemeManager.getColor(i));
        Intrinsics.checkNotNullExpressionValue(iconCreateWithResource, "apply(...)");
        if (z) {
            negativeColor = getPositiveColor();
        } else {
            negativeColor = getNegativeColor();
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), isDay() ? C31480R.layout.widget_portfolio_day : C31480R.layout.widget_portfolio_night);
        remoteViews.setTextViewText(C31480R.id.widget_primary_txt, widgetPortfolioData != null ? widgetPortfolioData.getPrimaryValue() : null);
        remoteViews.setTextViewText(C31480R.id.widget_secondary_txt, widgetPortfolioData != null ? widgetPortfolioData.getSecondaryValue() : null);
        remoteViews.setRemoteAdapter(C31480R.id.widget_listview, WatchlistRemoteViewsService.INSTANCE.getStartIntent(context, widgetId));
        remoteViews.setImageViewIcon(C31480R.id.widget_value_background, iconCreateWithResource);
        remoteViews.setInt(C31480R.id.widget_secondary_txt, "setBackgroundColor", negativeColor);
        Intent intentCreateIntent$default = Navigator.DefaultImpls.createIntent$default(this.navigator, context, new WatchListIntentKey(WatchListIntentKey2.WATCHLIST), null, false, 12, null);
        remoteViews.setPendingIntentTemplate(C31480R.id.widget_listview, PendingIntent.getActivity(context, 0, WatchlistViewsActivity.INSTANCE.getIntent(context), 201326592));
        remoteViews.setOnClickPendingIntent(C31480R.id.widget_root, PendingIntent.getActivity(context, 0, intentCreateIntent$default, 201326592));
        remoteViews.setOnClickPendingIntent(C31480R.id.widget_refresh_btn, refreshPendingIntent);
        remoteViews.setViewVisibility(C31480R.id.loading_view, 8);
        remoteViews.setViewVisibility(C31480R.id.widget_listview, 0);
        return remoteViews;
    }

    public final RemoteViews buildLoadingViews(Context context, PendingIntent refreshPendingIntent) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(refreshPendingIntent, "refreshPendingIntent");
        Icon iconCreateWithResource = Icon.createWithResource(context, C31480R.drawable.widget_rounded_top);
        ColorSchemeManager colorSchemeManager = this.colorSchemeManager;
        if (isDay()) {
            i = C13997R.attr.colorSchemePositiveDefaultDay;
        } else {
            i = C13997R.attr.colorSchemePositiveDefaultNight;
        }
        iconCreateWithResource.setTint(colorSchemeManager.getColor(i));
        Intrinsics.checkNotNullExpressionValue(iconCreateWithResource, "apply(...)");
        if (isDay()) {
            i2 = C31480R.layout.widget_portfolio_day;
        } else {
            i2 = C31480R.layout.widget_portfolio_night;
        }
        int positiveColor = getPositiveColor();
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), i2);
        remoteViews.setImageViewIcon(C31480R.id.widget_value_background, iconCreateWithResource);
        remoteViews.setInt(C31480R.id.widget_secondary_txt, "setBackgroundColor", positiveColor);
        remoteViews.setOnClickPendingIntent(C31480R.id.widget_refresh_btn, refreshPendingIntent);
        remoteViews.setViewVisibility(C31480R.id.widget_listview, 8);
        remoteViews.setViewVisibility(C31480R.id.loading_view, 0);
        return remoteViews;
    }

    public final RemoteViews buildUnauthenticatedViews(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), C31480R.layout.widget_error_unauthenticated);
        remoteViews.setOnClickPendingIntent(C31480R.id.widget_root, PendingIntent.getActivity(context, 0, Navigator.DefaultImpls.createIntent$default(this.navigator, context, new WatchListIntentKey(WatchListIntentKey2.WATCHLIST), null, false, 12, null), 201326592));
        return remoteViews;
    }

    private final boolean isDay() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.nightModeManager.getDayNightMode().ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int getPositiveColor() {
        int i;
        ColorSchemeManager colorSchemeManager = this.colorSchemeManager;
        if (isDay()) {
            i = C13997R.attr.colorSchemePositiveDefaultDay;
        } else {
            i = C13997R.attr.colorSchemePositiveDefaultNight;
        }
        return colorSchemeManager.getColor(i);
    }

    public final int getNegativeColor() {
        int i;
        ColorSchemeManager colorSchemeManager = this.colorSchemeManager;
        if (isDay()) {
            i = C13997R.attr.colorSchemeNegativeDefaultDay;
        } else {
            i = C13997R.attr.colorSchemeNegativeDefaultNight;
        }
        return colorSchemeManager.getColor(i);
    }
}
