package com.robinhood.android.equitydetail.dagger;

import android.content.SharedPreferences;
import com.robinhood.android.equitydetail.p123ui.chartsettings.ShowAdvancedChartTooltipPref;
import com.robinhood.android.equitydetail.p123ui.chartsettings.ShownAdvancedChartDisclosureTooltipPref;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FeatureEquityDetailPreferencesModule.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/dagger/FeatureEquityDetailPreferencesModule;", "", "<init>", "()V", "provideAdvancedChartTooltipPref", "Lcom/robinhood/prefs/BooleanPreference;", "preferences", "Landroid/content/SharedPreferences;", "provideShownAdvancedChartDisclosureTooltipPref", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class FeatureEquityDetailPreferencesModule {
    public static final int $stable = 0;
    public static final FeatureEquityDetailPreferencesModule INSTANCE = new FeatureEquityDetailPreferencesModule();

    private FeatureEquityDetailPreferencesModule() {
    }

    @ShowAdvancedChartTooltipPref
    public final BooleanPreference provideAdvancedChartTooltipPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "advancedChartTooltip", false, null, 8, null);
    }

    @ShownAdvancedChartDisclosureTooltipPref
    public final BooleanPreference provideShownAdvancedChartDisclosureTooltipPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "advancedChartDisclosureTooltip", false, null, 8, null);
    }
}
