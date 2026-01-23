package com.robinhood.shared.trade.crypto.dagger;

import android.content.SharedPreferences;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.prefs.IntPreference;
import com.robinhood.prefs.LongPreference;
import com.robinhood.prefs.StringToLongMapPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.utils.moshi.LazyMoshi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FeatureTradeCryptoModule.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u001a\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0012\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\u0012\u001a\u00020\n2\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/dagger/FeatureTradeCryptoModule;", "", "<init>", "()V", "provideCryptoOrderInputModePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "preferences", "Landroid/content/SharedPreferences;", "provideHasSeenEuAdvancedOrdersTooltipPref", "Lcom/robinhood/prefs/BooleanPreference;", "provideHasSeenFeeUpsellBottomSheetPref", "provideFeeUnsupportedBannerDismissMillisPref", "Lcom/robinhood/prefs/StringToLongMapPreference;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "provideCryptoUsTaxLotsOrderTypeDisplayCountPref", "Lcom/robinhood/prefs/IntPreference;", "provideHasSeenTaxLotOrderTooltipPref", "provideFeeTierStatusLastTimeSeenMillisPref", "Lcom/robinhood/prefs/LongPreference;", "provideFeeTierNotificationPrimerLastTimeSeenMillisPref", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class FeatureTradeCryptoModule {
    public static final int $stable = 0;
    public static final FeatureTradeCryptoModule INSTANCE = new FeatureTradeCryptoModule();

    private FeatureTradeCryptoModule() {
    }

    public final EnumPreference<CryptoInputMode> provideCryptoOrderInputModePref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new EnumPreference<>(CryptoInputMode.class, preferences, "forexOrderInputMode", CryptoInputMode.QUOTE_CURRENCY, null, 16, null);
    }

    @HasSeenEuAdvancedOrdersTooltipPref
    public final BooleanPreference provideHasSeenEuAdvancedOrdersTooltipPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "hasSeenEuAdvancedOrdersTooltipPref", false, null, 8, null);
    }

    @CryptoFeePrefs2
    public final BooleanPreference provideHasSeenFeeUpsellBottomSheetPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "hasSeenFeeUpsellBottomSheetPref", false, null, 8, null);
    }

    @CryptoFeePrefs
    public final StringToLongMapPreference provideFeeUnsupportedBannerDismissMillisPref(@UserPrefs SharedPreferences preferences, LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return new StringToLongMapPreference(preferences, "FeeUnsupportedBannerDismissMillisPref", null, moshi, 4, null);
    }

    @CryptoUsTaxLotsOrderTypeDisplayCountPref
    public final IntPreference provideCryptoUsTaxLotsOrderTypeDisplayCountPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new IntPreference(preferences, "cryptoUsTaxLotsOrderTypeDisplayCountPref", 0);
    }

    @HasSeenTaxLotOrderTooltipPref
    public final BooleanPreference provideHasSeenTaxLotOrderTooltipPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "hasSeenCryptoTaxLotOrderTooltipPref", false, null, 8, null);
    }

    @FeeTierStatusLastTimeSeenMillisPref
    public final LongPreference provideFeeTierStatusLastTimeSeenMillisPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new LongPreference(preferences, "feeTierStatusLastTimeSeenMillisPref", 0L);
    }

    @FeeTierNotificationPrimerLastTimeSeenMillisPref
    public final LongPreference provideFeeTierNotificationPrimerLastTimeSeenMillisPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new LongPreference(preferences, "feeTierNotificationPrimerLastTimeSeenMillisPref", 0L);
    }
}
