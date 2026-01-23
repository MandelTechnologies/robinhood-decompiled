package com.robinhood.android.portfolio.privacy;

import android.content.SharedPreferences;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PortfolioPrivacyModule.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/portfolio/privacy/BigNumberPrivacyModule;", "", "<init>", "()V", "providePortfolioPrivacyPref", "Lcom/robinhood/prefs/BooleanPreference;", "preferences", "Landroid/content/SharedPreferences;", "providePortfolioPrivacyTooltipPref", "lib-privacy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.portfolio.privacy.BigNumberPrivacyModule, reason: use source file name */
/* loaded from: classes11.dex */
public final class PortfolioPrivacyModule {
    public static final int $stable = 0;
    public static final PortfolioPrivacyModule INSTANCE = new PortfolioPrivacyModule();

    private PortfolioPrivacyModule() {
    }

    @PortfolioPrivacyPref
    public final BooleanPreference providePortfolioPrivacyPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "portfolio_privacy", false, null, 12, null);
    }

    @PortfolioPrivacyTooltipPref
    public final BooleanPreference providePortfolioPrivacyTooltipPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "portfolio_privacy_tooltip", false, null, 12, null);
    }
}
