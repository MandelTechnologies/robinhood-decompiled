package com.robinhood.android.wallet.upsell;

import android.content.SharedPreferences;
import com.robinhood.prefs.LongPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WalletUpsellModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/wallet/upsell/WalletUpsellModule;", "", "<init>", "()V", "provideLastSeenWalletUpsellTimePref", "Lcom/robinhood/prefs/LongPreference;", "preferences", "Landroid/content/SharedPreferences;", "feature-wallet-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class WalletUpsellModule {
    public static final WalletUpsellModule INSTANCE = new WalletUpsellModule();

    private WalletUpsellModule() {
    }

    @LastSeenWalletUpsellTimePref
    public final LongPreference provideLastSeenWalletUpsellTimePref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new LongPreference(preferences, "lastSeenWalletUpsellTime", 0L, 4, null);
    }
}
