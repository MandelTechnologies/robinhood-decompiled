package com.robinhood.shared.cards.dagger;

import android.content.SharedPreferences;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.prefs.LongPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.DevicePrefs;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.shared.cards.CardHelper;
import com.robinhood.shared.cards.prefs.PromptedForReviewPref;
import com.robinhood.shared.cards.prefs.SingleCardLastDismissedPref;
import com.robinhood.shared.cards.prefs.TopCardRhIdPref;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LibCardsModule.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007J\u0012\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007J\u0012\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/cards/dagger/LibCardsModule;", "", "<init>", "()V", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "cardHelper", "Lcom/robinhood/shared/cards/CardHelper;", "provideTopCardRhIdPref", "Lcom/robinhood/prefs/StringPreference;", "preferences", "Landroid/content/SharedPreferences;", "providePromptedForReviewTimePref", "Lcom/robinhood/prefs/LongPreference;", "provideSingleCardLastDismissedTimePref", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class LibCardsModule {
    public static final int $stable = 0;
    public static final LibCardsModule INSTANCE = new LibCardsModule();

    public final CardManager cardManager(CardHelper cardHelper) {
        Intrinsics.checkNotNullParameter(cardHelper, "cardHelper");
        return cardHelper;
    }

    private LibCardsModule() {
    }

    @TopCardRhIdPref
    public final StringPreference provideTopCardRhIdPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "topCardRhId", null, null, 12, null);
    }

    @PromptedForReviewPref
    public final LongPreference providePromptedForReviewTimePref(@DevicePrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new LongPreference(preferences, "promptedForReviewTime", 0L);
    }

    @SingleCardLastDismissedPref
    public final LongPreference provideSingleCardLastDismissedTimePref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new LongPreference(preferences, "singleCardLastDismissedTime", 0L);
    }
}
