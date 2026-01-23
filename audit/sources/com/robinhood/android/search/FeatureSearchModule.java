package com.robinhood.android.search;

import android.content.SharedPreferences;
import com.robinhood.android.search.newsfeed.view.util.TimeProvider;
import com.robinhood.android.search.newsfeed.view.util.TimeProvider3;
import com.robinhood.android.search.prefs.CuratedListChipBadgeSeenPref;
import com.robinhood.prefs.StringToBooleanMapPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.utils.moshi.LazyMoshi;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FeatureSearchModule.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/search/FeatureSearchModule;", "", "<init>", "()V", "provideCuratedListChipBadgeSeenPref", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "prefs", "Landroid/content/SharedPreferences;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "provideTimeProvider", "Lcom/robinhood/android/search/newsfeed/view/util/TimeProvider;", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class FeatureSearchModule {
    public static final int $stable = 0;
    public static final FeatureSearchModule INSTANCE = new FeatureSearchModule();

    private FeatureSearchModule() {
    }

    @CuratedListChipBadgeSeenPref
    public final StringToBooleanMapPreference provideCuratedListChipBadgeSeenPref(@UserPrefs SharedPreferences prefs, LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return new StringToBooleanMapPreference(prefs, "curatedListChipBadgeSeenPref", MapsKt.emptyMap(), moshi, null, 16, null);
    }

    public final TimeProvider provideTimeProvider() {
        return TimeProvider3.INSTANCE;
    }
}
