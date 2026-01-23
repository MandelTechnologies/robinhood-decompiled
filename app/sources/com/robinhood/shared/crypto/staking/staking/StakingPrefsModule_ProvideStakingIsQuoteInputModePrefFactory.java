package com.robinhood.shared.crypto.staking.staking;

import android.content.SharedPreferences;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.prefs.BooleanPreference;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StakingPrefsModule_ProvideStakingIsQuoteInputModePrefFactory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/StakingPrefsModule_ProvideStakingIsQuoteInputModePrefFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/prefs/BooleanPreference;", "module", "Lcom/robinhood/shared/crypto/staking/staking/StakingPrefsModule;", "preferences", "Ljavax/inject/Provider;", "Landroid/content/SharedPreferences;", "<init>", "(Lcom/robinhood/shared/crypto/staking/staking/StakingPrefsModule;Ljavax/inject/Provider;)V", "get", "Companion", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class StakingPrefsModule_ProvideStakingIsQuoteInputModePrefFactory implements Factory<BooleanPreference> {
    private final StakingPrefsModule module;
    private final Provider<SharedPreferences> preferences;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final StakingPrefsModule_ProvideStakingIsQuoteInputModePrefFactory create(StakingPrefsModule stakingPrefsModule, Provider<SharedPreferences> provider) {
        return INSTANCE.create(stakingPrefsModule, provider);
    }

    @JvmStatic
    public static final BooleanPreference provideStakingIsQuoteInputModePref(StakingPrefsModule stakingPrefsModule, SharedPreferences sharedPreferences) {
        return INSTANCE.provideStakingIsQuoteInputModePref(stakingPrefsModule, sharedPreferences);
    }

    public StakingPrefsModule_ProvideStakingIsQuoteInputModePrefFactory(StakingPrefsModule module, Provider<SharedPreferences> preferences) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.module = module;
        this.preferences = preferences;
    }

    @Override // javax.inject.Provider
    public BooleanPreference get() {
        Companion companion = INSTANCE;
        StakingPrefsModule stakingPrefsModule = this.module;
        SharedPreferences sharedPreferences = this.preferences.get();
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "get(...)");
        return companion.provideStakingIsQuoteInputModePref(stakingPrefsModule, sharedPreferences);
    }

    /* compiled from: StakingPrefsModule_ProvideStakingIsQuoteInputModePrefFactory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/StakingPrefsModule_ProvideStakingIsQuoteInputModePrefFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/crypto/staking/staking/StakingPrefsModule_ProvideStakingIsQuoteInputModePrefFactory;", "module", "Lcom/robinhood/shared/crypto/staking/staking/StakingPrefsModule;", "preferences", "Ljavax/inject/Provider;", "Landroid/content/SharedPreferences;", "provideStakingIsQuoteInputModePref", "Lcom/robinhood/prefs/BooleanPreference;", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final StakingPrefsModule_ProvideStakingIsQuoteInputModePrefFactory create(StakingPrefsModule module, Provider<SharedPreferences> preferences) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(preferences, "preferences");
            return new StakingPrefsModule_ProvideStakingIsQuoteInputModePrefFactory(module, preferences);
        }

        @JvmStatic
        public final BooleanPreference provideStakingIsQuoteInputModePref(StakingPrefsModule module, SharedPreferences preferences) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(preferences, "preferences");
            Object objCheckNotNull = Preconditions.checkNotNull(module.provideStakingIsQuoteInputModePref(preferences), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (BooleanPreference) objCheckNotNull;
        }
    }
}
