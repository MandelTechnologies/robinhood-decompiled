package com.robinhood.android.futures.assethome;

import android.content.SharedPreferences;
import com.robinhood.android.futures.assethome.educationtour.FuturesAssetHomeEducationTourFinishedPref;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesAssetHomeModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/futures/assethome/FuturesAssetHomeModule;", "", "<init>", "()V", "provideFuturesAssetHomeEducationTourFinishedPref", "Lcom/robinhood/prefs/BooleanPreference;", "preferences", "Landroid/content/SharedPreferences;", "feature-futures-asset-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class FuturesAssetHomeModule {
    public static final int $stable = 0;
    public static final FuturesAssetHomeModule INSTANCE = new FuturesAssetHomeModule();

    private FuturesAssetHomeModule() {
    }

    @FuturesAssetHomeEducationTourFinishedPref
    public final BooleanPreference provideFuturesAssetHomeEducationTourFinishedPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "futures_asset_home_education_tour_finished", false, null, 12, null);
    }
}
