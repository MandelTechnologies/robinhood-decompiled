package com.robinhood.android.chart.blackwidowadvancedchart;

import android.content.SharedPreferences;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BwChartPrefModule.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/BwChartPrefModule;", "", "<init>", "()V", "provideBwCachedChartUrlSharedPref", "Lcom/robinhood/prefs/StringPreference;", "prefs", "Landroid/content/SharedPreferences;", "provideBwCachedChartVersionSharedPref", "provideBwSpanIntervalCacheSharedPref", "provideBwHasVisitedChartSharedPref", "Lcom/robinhood/prefs/BooleanPreference;", "lib-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class BwChartPrefModule {
    public static final int $stable = 0;
    public static final BwChartPrefModule INSTANCE = new BwChartPrefModule();

    private BwChartPrefModule() {
    }

    @BwChartPrefModule2
    public final StringPreference provideBwCachedChartUrlSharedPref(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new StringPreference(prefs, "BwCachedChartUrlSharedPref", null, null, 8, null);
    }

    @BwChartPrefModule3
    public final StringPreference provideBwCachedChartVersionSharedPref(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new StringPreference(prefs, "BwCachedChartVersionSharedPref", null, null, 8, null);
    }

    @BwChartPrefModule5
    public final StringPreference provideBwSpanIntervalCacheSharedPref(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new StringPreference(prefs, "BwSpanIntervalCacheSharedPref", null, null, 8, null);
    }

    @BwChartPrefModule4
    public final BooleanPreference provideBwHasVisitedChartSharedPref(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new BooleanPreference(prefs, "BwHasVisitedChartSharedPref", false, null, 8, null);
    }
}
