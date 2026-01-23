package com.robinhood.android.common.recurring;

import android.content.SharedPreferences;
import com.robinhood.android.common.recurring.prefs.RecurringOrderUpsellTimestampsPref;
import com.robinhood.android.common.recurring.prefs.RecurringOrderUpsellTimestampsPref2;
import com.robinhood.android.common.recurring.prefs.RecurringOrderUpsellViewCountPref;
import com.robinhood.android.common.recurring.prefs.RecurringOrderUpsellViewCountPref2;
import com.robinhood.prefs.IntPreference;
import com.robinhood.prefs.LongSetPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FeatureLibRecurringModule.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u000b\u001a\u00020\t2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/FeatureLibRecurringModule;", "", "<init>", "()V", "provideEquityRecurringOrderUpsellTimestampsPref", "Lcom/robinhood/prefs/LongSetPreference;", "prefs", "Landroid/content/SharedPreferences;", "provideEquityRecurringOrderUpsellViewCountPref", "Lcom/robinhood/prefs/IntPreference;", "provideCryptoRecurringOrderUpsellTimestampsPref", "provideCryptoRecurringOrderUpsellViewCountPref", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class FeatureLibRecurringModule {
    public static final int $stable = 0;
    public static final FeatureLibRecurringModule INSTANCE = new FeatureLibRecurringModule();

    private FeatureLibRecurringModule() {
    }

    @RecurringOrderUpsellTimestampsPref2
    public final LongSetPreference provideEquityRecurringOrderUpsellTimestampsPref(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new LongSetPreference(prefs, "equityRecurringOrderUpsellTimestampsPref", null, 4, null);
    }

    @RecurringOrderUpsellViewCountPref2
    public final IntPreference provideEquityRecurringOrderUpsellViewCountPref(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new IntPreference(prefs, "equityRecurringOrderUpsellViewCountPref", 0, 4, null);
    }

    @RecurringOrderUpsellTimestampsPref
    public final LongSetPreference provideCryptoRecurringOrderUpsellTimestampsPref(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new LongSetPreference(prefs, "cryptoRecurringOrderUpsellTimestampsPref", null, 4, null);
    }

    @RecurringOrderUpsellViewCountPref
    public final IntPreference provideCryptoRecurringOrderUpsellViewCountPref(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new IntPreference(prefs, "cryptoRecurringOrderUpsellViewCountPref", 0, 4, null);
    }
}
