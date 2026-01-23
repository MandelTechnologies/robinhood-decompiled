package com.robinhood.android.gold.hub;

import android.content.SharedPreferences;
import com.robinhood.android.gold.hub.data.pref.GoldHubCardCooldownCountPref;
import com.robinhood.android.gold.hub.data.pref.GoldHubCardsShownCountPref;
import com.robinhood.prefs.IntPreference;
import com.robinhood.prefs.StringToLongMapPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.utils.moshi.LazyMoshi;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldHubModule.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u001a\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/gold/hub/GoldHubModule;", "", "<init>", "()V", "provideGoldHubCardCooldownCountPref", "Lcom/robinhood/prefs/IntPreference;", "preferences", "Landroid/content/SharedPreferences;", "provideGoldHubCardsShownCountPref", "Lcom/robinhood/prefs/StringToLongMapPreference;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "feature-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldHubModule {
    public static final int $stable = 0;
    public static final GoldHubModule INSTANCE = new GoldHubModule();

    private GoldHubModule() {
    }

    @GoldHubCardCooldownCountPref
    public final IntPreference provideGoldHubCardCooldownCountPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new IntPreference(preferences, "goldHubCardCooldownCountPref", 0);
    }

    @GoldHubCardsShownCountPref
    public final StringToLongMapPreference provideGoldHubCardsShownCountPref(@UserPrefs SharedPreferences preferences, LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return new StringToLongMapPreference(preferences, "goldHubCardsShownCountPref", MapsKt.emptyMap(), moshi);
    }
}
