package com.robinhood.android.store.matcha;

import android.content.SharedPreferences;
import com.robinhood.android.store.matcha.prefs.HasSeenBadgePref;
import com.robinhood.android.store.matcha.prefs.LastBadgeSeenTransactionCountPref;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.IntPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaStoreModule.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/store/matcha/MatchaStoreModule;", "", "<init>", "()V", "provideMatchaPromotionAcknowledgedPref", "Lcom/robinhood/prefs/BooleanPreference;", "prefs", "Landroid/content/SharedPreferences;", "provideMatchaHasSeenBadgePref", "provideMatchaLastBadgeSeenTransactionCountPref", "Lcom/robinhood/prefs/IntPreference;", "lib-store-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class MatchaStoreModule {
    public static final MatchaStoreModule INSTANCE = new MatchaStoreModule();

    private MatchaStoreModule() {
    }

    @MatchaPromotionAcknowledgedPref
    public final BooleanPreference provideMatchaPromotionAcknowledgedPref(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new BooleanPreference(prefs, "matchaPromotionAcknowledged", false, null, 8, null);
    }

    @HasSeenBadgePref
    public final BooleanPreference provideMatchaHasSeenBadgePref(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new BooleanPreference(prefs, "matchaHasSeenBadge", false, null, 8, null);
    }

    @LastBadgeSeenTransactionCountPref
    public final IntPreference provideMatchaLastBadgeSeenTransactionCountPref(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new IntPreference(prefs, "matchaLastBadgeSeenTransactionCount", 0);
    }
}
