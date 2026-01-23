package com.robinhood.android.authlock.p064di;

import android.content.SharedPreferences;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.prefs.StringPreference;
import com.robinhood.vault.Vault;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AuthLockPrefsModule_ProvideBiometricsChangedPrefFactory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/authlock/di/AuthLockPrefsModule_ProvideBiometricsChangedPrefFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/prefs/StringPreference;", "module", "Lcom/robinhood/android/authlock/di/AuthLockPrefsModule;", "vault", "Ljavax/inject/Provider;", "Lcom/robinhood/vault/Vault;", "preferences", "Landroid/content/SharedPreferences;", "<init>", "(Lcom/robinhood/android/authlock/di/AuthLockPrefsModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-auth-lock_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class AuthLockPrefsModule_ProvideBiometricsChangedPrefFactory implements Factory<StringPreference> {
    private final AuthLockPrefsModule module;
    private final Provider<SharedPreferences> preferences;
    private final Provider<Vault> vault;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final AuthLockPrefsModule_ProvideBiometricsChangedPrefFactory create(AuthLockPrefsModule authLockPrefsModule, Provider<Vault> provider, Provider<SharedPreferences> provider2) {
        return INSTANCE.create(authLockPrefsModule, provider, provider2);
    }

    @JvmStatic
    public static final StringPreference provideBiometricsChangedPref(AuthLockPrefsModule authLockPrefsModule, Vault vault, SharedPreferences sharedPreferences) {
        return INSTANCE.provideBiometricsChangedPref(authLockPrefsModule, vault, sharedPreferences);
    }

    public AuthLockPrefsModule_ProvideBiometricsChangedPrefFactory(AuthLockPrefsModule module, Provider<Vault> vault, Provider<SharedPreferences> preferences) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(vault, "vault");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.module = module;
        this.vault = vault;
        this.preferences = preferences;
    }

    @Override // javax.inject.Provider
    public StringPreference get() {
        Companion companion = INSTANCE;
        AuthLockPrefsModule authLockPrefsModule = this.module;
        Vault vault = this.vault.get();
        Intrinsics.checkNotNullExpressionValue(vault, "get(...)");
        SharedPreferences sharedPreferences = this.preferences.get();
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "get(...)");
        return companion.provideBiometricsChangedPref(authLockPrefsModule, vault, sharedPreferences);
    }

    /* compiled from: AuthLockPrefsModule_ProvideBiometricsChangedPrefFactory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tH\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/authlock/di/AuthLockPrefsModule_ProvideBiometricsChangedPrefFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/authlock/di/AuthLockPrefsModule_ProvideBiometricsChangedPrefFactory;", "module", "Lcom/robinhood/android/authlock/di/AuthLockPrefsModule;", "vault", "Ljavax/inject/Provider;", "Lcom/robinhood/vault/Vault;", "preferences", "Landroid/content/SharedPreferences;", "provideBiometricsChangedPref", "Lcom/robinhood/prefs/StringPreference;", "lib-auth-lock_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AuthLockPrefsModule_ProvideBiometricsChangedPrefFactory create(AuthLockPrefsModule module, Provider<Vault> vault, Provider<SharedPreferences> preferences) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(vault, "vault");
            Intrinsics.checkNotNullParameter(preferences, "preferences");
            return new AuthLockPrefsModule_ProvideBiometricsChangedPrefFactory(module, vault, preferences);
        }

        @JvmStatic
        public final StringPreference provideBiometricsChangedPref(AuthLockPrefsModule module, Vault vault, SharedPreferences preferences) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(vault, "vault");
            Intrinsics.checkNotNullParameter(preferences, "preferences");
            Object objCheckNotNull = Preconditions.checkNotNull(module.provideBiometricsChangedPref(vault, preferences), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (StringPreference) objCheckNotNull;
        }
    }
}
