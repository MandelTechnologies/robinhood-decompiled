package com.robinhood.librobinhood.data.store;

import android.content.SharedPreferences;
import com.robinhood.prefs.LongPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LibStoreTransferPrefsModule.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/LibStoreTransferPrefsModule;", "", "<init>", "()V", "provideSuggestedAmountsPref", "Lcom/robinhood/prefs/StringPreference;", "preferences", "Landroid/content/SharedPreferences;", "provideSuggestedAmountsLastUpdateAtPref", "Lcom/robinhood/prefs/LongPreference;", "lib-store-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class LibStoreTransferPrefsModule {
    public static final LibStoreTransferPrefsModule INSTANCE = new LibStoreTransferPrefsModule();

    private LibStoreTransferPrefsModule() {
    }

    @SuggestedAmountsPref
    public final StringPreference provideSuggestedAmountsPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "suggestedAmounts", null, null, 12, null);
    }

    @SuggestedAmountsLastUpdatedAtPref
    public final LongPreference provideSuggestedAmountsLastUpdateAtPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new LongPreference(preferences, "suggestedAmountPillsLastUpdatedAt", 0L, 4, null);
    }
}
