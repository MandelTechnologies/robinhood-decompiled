package com.robinhood.shared.crypto.transfer;

import android.content.SharedPreferences;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.LongPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.shared.crypto.transfer.send.address.saved.ScanTooltipSavedAddressesShownBeforePref;
import com.robinhood.shared.crypto.transfer.unified.HigherCryptoWithdrawalLimitLastShownPref;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: CryptoTransferPrefsModule.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/CryptoTransferPrefsModule;", "", "<init>", "()V", "providesHigherCryptoWithdrawalLimitLastShownPref", "Lcom/robinhood/prefs/LongPreference;", "preferences", "Landroid/content/SharedPreferences;", "providesScanTooltipSavedAddressesShownBeforePref", "Lcom/robinhood/prefs/BooleanPreference;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoTransferPrefsModule {
    public static final int $stable = 0;

    @HigherCryptoWithdrawalLimitLastShownPref
    public final LongPreference providesHigherCryptoWithdrawalLimitLastShownPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new LongPreference(preferences, "higherCryptoWithdrawalLimitLastShown", Instant.EPOCH.toEpochMilli());
    }

    @ScanTooltipSavedAddressesShownBeforePref
    public final BooleanPreference providesScanTooltipSavedAddressesShownBeforePref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "scanTooltipSavedAddressesShownBefore", false, null, 8, null);
    }
}
