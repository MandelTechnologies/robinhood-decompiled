package com.robinhood.librobinhood.data.prefs;

import android.content.SharedPreferences;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.LongPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StoreRhyModule.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u000b\u001a\u00020\u00052\b\b\u0001\u0010\f\u001a\u00020\u0007H\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/prefs/StoreRhyModule;", "", "<init>", "()V", "provideHasShownRhyMigrationSheetPref", "Lcom/robinhood/prefs/BooleanPreference;", "prefs", "Landroid/content/SharedPreferences;", "provideHasDismissedT60RhsNoaRedirectPref", "Lcom/robinhood/prefs/LongPreference;", "provideHasShownT30RhsNoaRedirectSheetPref", "provideHasVisitedCashCushionUpsellPref", "preferences", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class StoreRhyModule {
    public static final StoreRhyModule INSTANCE = new StoreRhyModule();

    private StoreRhyModule() {
    }

    @HasShownRhyMigrationSheetPref
    public final BooleanPreference provideHasShownRhyMigrationSheetPref(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new BooleanPreference(prefs, "hasShownRhyMigrationSheetPref", false, null, 8, null);
    }

    @HasDismissedT60RhsNoaRedirectPref
    public final LongPreference provideHasDismissedT60RhsNoaRedirectPref(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new LongPreference(prefs, "HasDismissedT60RhsNoaRedirectPrefLong", 0L, 4, null);
    }

    @HasShownT30RhsNoaRedirectSheetPref
    public final LongPreference provideHasShownT30RhsNoaRedirectSheetPref(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new LongPreference(prefs, "HasShownT30RhsNoaRedirectSheetPrefLong", 0L, 4, null);
    }

    @HasVisitedFlatCashbackUpsellPref
    public final BooleanPreference provideHasVisitedCashCushionUpsellPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "flatCashbackHasVisitedFlatCashbackUpsellPref", false, null, 8, null);
    }
}
