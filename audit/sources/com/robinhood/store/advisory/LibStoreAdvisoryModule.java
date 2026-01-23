package com.robinhood.store.advisory;

import android.content.SharedPreferences;
import com.robinhood.prefs.StringToBooleanMapPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.utils.moshi.LazyMoshi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LibStoreAdvisoryModule.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u001a\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/store/advisory/LibAdvisoryDashboardModule;", "", "<init>", "()V", "provideHasDismissedRecsForRetirementStrategiesUpsellPref", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "prefs", "Landroid/content/SharedPreferences;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "provideHasDismissedStrategiesDepositsPromoPref", "lib-store-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.store.advisory.LibAdvisoryDashboardModule, reason: use source file name */
/* loaded from: classes12.dex */
public final class LibStoreAdvisoryModule {
    public static final LibStoreAdvisoryModule INSTANCE = new LibStoreAdvisoryModule();

    private LibStoreAdvisoryModule() {
    }

    @HasDismissedRecsForRetirementStrategiesUpsellPref
    public final StringToBooleanMapPreference provideHasDismissedRecsForRetirementStrategiesUpsellPref(@UserPrefs SharedPreferences prefs, LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return new StringToBooleanMapPreference(prefs, "hasDismissedRecsForRetirementStrategiesUpsellPref", null, moshi, null, 20, null);
    }

    @HasDismissedStrategiesDepositsPromoPref
    public final StringToBooleanMapPreference provideHasDismissedStrategiesDepositsPromoPref(@UserPrefs SharedPreferences prefs, LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return new StringToBooleanMapPreference(prefs, "hasDismissedStrategiesDepositsPromoPref", null, moshi, null, 20, null);
    }
}
