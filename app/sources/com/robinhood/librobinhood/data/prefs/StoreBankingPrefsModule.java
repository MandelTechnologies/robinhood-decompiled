package com.robinhood.librobinhood.data.prefs;

import android.content.SharedPreferences;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StoreBankingPrefsModule.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u0007H\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/prefs/StoreBankingPrefsModule;", "", "<init>", "()V", "provideHasQueuedDepositPref", "Lcom/robinhood/prefs/BooleanPreference;", "prefs", "Landroid/content/SharedPreferences;", "provideDefaultAchRelationship", "Lcom/robinhood/prefs/StringPreference;", "preferences", "lib-store-ach-relationship_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class StoreBankingPrefsModule {
    @HasQueuedDepositPref
    public final BooleanPreference provideHasQueuedDepositPref(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new BooleanPreference(prefs, "hasQueuedDeposit", false, null, 12, null);
    }

    @DefaultAchRelationship
    public final StringPreference provideDefaultAchRelationship(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "defaultAchRelationship", null, null, 12, null);
    }
}
