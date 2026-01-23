package com.robinhood.android.authlock.p064di;

import android.content.SharedPreferences;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.prefs.MoshiSecurePreference;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.vault.Vault;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AuthLockPrefsModule_ProvideUserPinPrefFactory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00122\u001f\u0012\u001b\u0012\u0019\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u0002¢\u0006\u0002\b\u00050\u0001:\u0001\u0012B9\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u0019\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u0002¢\u0006\u0002\b\u0005H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/authlock/di/AuthLockPrefsModule_ProvideUserPinPrefFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/prefs/MoshiSecurePreference;", "", "", "Lkotlin/jvm/JvmSuppressWildcards;", "module", "Lcom/robinhood/android/authlock/di/AuthLockPrefsModule;", "vault", "Ljavax/inject/Provider;", "Lcom/robinhood/vault/Vault;", "preferences", "Landroid/content/SharedPreferences;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "<init>", "(Lcom/robinhood/android/authlock/di/AuthLockPrefsModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-auth-lock_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class AuthLockPrefsModule_ProvideUserPinPrefFactory implements Factory<MoshiSecurePreference<Map<String, String>>> {
    private final AuthLockPrefsModule module;
    private final Provider<LazyMoshi> moshi;
    private final Provider<SharedPreferences> preferences;
    private final Provider<Vault> vault;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final AuthLockPrefsModule_ProvideUserPinPrefFactory create(AuthLockPrefsModule authLockPrefsModule, Provider<Vault> provider, Provider<SharedPreferences> provider2, Provider<LazyMoshi> provider3) {
        return INSTANCE.create(authLockPrefsModule, provider, provider2, provider3);
    }

    @JvmStatic
    public static final MoshiSecurePreference<Map<String, String>> provideUserPinPref(AuthLockPrefsModule authLockPrefsModule, Vault vault, SharedPreferences sharedPreferences, LazyMoshi lazyMoshi) {
        return INSTANCE.provideUserPinPref(authLockPrefsModule, vault, sharedPreferences, lazyMoshi);
    }

    public AuthLockPrefsModule_ProvideUserPinPrefFactory(AuthLockPrefsModule module, Provider<Vault> vault, Provider<SharedPreferences> preferences, Provider<LazyMoshi> moshi) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(vault, "vault");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.module = module;
        this.vault = vault;
        this.preferences = preferences;
        this.moshi = moshi;
    }

    @Override // javax.inject.Provider
    public MoshiSecurePreference<Map<String, String>> get() {
        Companion companion = INSTANCE;
        AuthLockPrefsModule authLockPrefsModule = this.module;
        Vault vault = this.vault.get();
        Intrinsics.checkNotNullExpressionValue(vault, "get(...)");
        SharedPreferences sharedPreferences = this.preferences.get();
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "get(...)");
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        return companion.provideUserPinPref(authLockPrefsModule, vault, sharedPreferences, lazyMoshi);
    }

    /* compiled from: AuthLockPrefsModule_ProvideUserPinPrefFactory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\tH\u0007J?\u0010\u000f\u001a\u0019\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00110\u0010¢\u0006\u0002\b\u00132\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/authlock/di/AuthLockPrefsModule_ProvideUserPinPrefFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/authlock/di/AuthLockPrefsModule_ProvideUserPinPrefFactory;", "module", "Lcom/robinhood/android/authlock/di/AuthLockPrefsModule;", "vault", "Ljavax/inject/Provider;", "Lcom/robinhood/vault/Vault;", "preferences", "Landroid/content/SharedPreferences;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "provideUserPinPref", "Lcom/robinhood/prefs/MoshiSecurePreference;", "", "", "Lkotlin/jvm/JvmSuppressWildcards;", "lib-auth-lock_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AuthLockPrefsModule_ProvideUserPinPrefFactory create(AuthLockPrefsModule module, Provider<Vault> vault, Provider<SharedPreferences> preferences, Provider<LazyMoshi> moshi) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(vault, "vault");
            Intrinsics.checkNotNullParameter(preferences, "preferences");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            return new AuthLockPrefsModule_ProvideUserPinPrefFactory(module, vault, preferences, moshi);
        }

        @JvmStatic
        public final MoshiSecurePreference<Map<String, String>> provideUserPinPref(AuthLockPrefsModule module, Vault vault, SharedPreferences preferences, LazyMoshi moshi) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(vault, "vault");
            Intrinsics.checkNotNullParameter(preferences, "preferences");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Object objCheckNotNull = Preconditions.checkNotNull(module.provideUserPinPref(vault, preferences, moshi), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (MoshiSecurePreference) objCheckNotNull;
        }
    }
}
