package com.robinhood.android.incentives.wonka.impression;

import android.content.SharedPreferences;
import com.robinhood.prefs.StringToLongMapPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.utils.moshi.LazyMoshi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WonkaModule.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/incentives/wonka/impression/WonkaModule;", "", "<init>", "()V", "provideAssetRetentionPromotionSeenMap", "Lcom/robinhood/prefs/StringToLongMapPreference;", "prefs", "Landroid/content/SharedPreferences;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "lib-wonka_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class WonkaModule {
    public static final WonkaModule INSTANCE = new WonkaModule();

    private WonkaModule() {
    }

    @AssetRetentionPromotionSeenPref
    public final StringToLongMapPreference provideAssetRetentionPromotionSeenMap(@UserPrefs SharedPreferences prefs, LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return new StringToLongMapPreference(prefs, "asset-retention-promotion-seen", null, moshi, 4, null);
    }
}
