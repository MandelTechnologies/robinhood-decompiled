package com.robinhood.librobinhood.data.store.alert;

import android.content.SharedPreferences;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.IntPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LibStoreAdvancedAlertModule.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/alert/LibStoreAdvancedAlertModule;", "", "<init>", "()V", "provideShownAdvancedAlertCdpCardCountPref", "Lcom/robinhood/prefs/IntPreference;", "prefs", "Landroid/content/SharedPreferences;", "provideShownIndicatorAlertChartTooltip", "Lcom/robinhood/prefs/BooleanPreference;", "lib-store-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class LibStoreAdvancedAlertModule {
    public static final LibStoreAdvancedAlertModule INSTANCE = new LibStoreAdvancedAlertModule();

    private LibStoreAdvancedAlertModule() {
    }

    @ShownAdvancedAlertCdpCardCountPref
    public final IntPreference provideShownAdvancedAlertCdpCardCountPref(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new IntPreference(prefs, "shownAdvancedAlertCdpCardCountPref", 0);
    }

    @ShownIndicatorAlertChartTooltipPref
    public final BooleanPreference provideShownIndicatorAlertChartTooltip(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new BooleanPreference(prefs, "shownIndicatorAlertChartTooltip", false, null, 8, null);
    }
}
