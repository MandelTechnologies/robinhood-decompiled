package com.robinhood.prefs.dagger;

import android.content.SharedPreferences;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.prefs.SecureStringPreference;
import com.robinhood.vault.Vault;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LibPrefsModule_ProvideSecretCodePrefFactory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/prefs/dagger/LibPrefsModule_ProvideSecretCodePrefFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/prefs/SecureStringPreference;", "vault", "Ljavax/inject/Provider;", "Lcom/robinhood/vault/Vault;", "preferences", "Landroid/content/SharedPreferences;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-prefs_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class LibPrefsModule_ProvideSecretCodePrefFactory implements Factory<SecureStringPreference> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<SharedPreferences> preferences;
    private final Provider<Vault> vault;

    @JvmStatic
    public static final LibPrefsModule_ProvideSecretCodePrefFactory create(Provider<Vault> provider, Provider<SharedPreferences> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final SecureStringPreference provideSecretCodePref(Vault vault, SharedPreferences sharedPreferences) {
        return INSTANCE.provideSecretCodePref(vault, sharedPreferences);
    }

    public LibPrefsModule_ProvideSecretCodePrefFactory(Provider<Vault> vault, Provider<SharedPreferences> preferences) {
        Intrinsics.checkNotNullParameter(vault, "vault");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.vault = vault;
        this.preferences = preferences;
    }

    @Override // javax.inject.Provider
    public SecureStringPreference get() {
        Companion companion = INSTANCE;
        Vault vault = this.vault.get();
        Intrinsics.checkNotNullExpressionValue(vault, "get(...)");
        SharedPreferences sharedPreferences = this.preferences.get();
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "get(...)");
        return companion.provideSecretCodePref(vault, sharedPreferences);
    }

    /* compiled from: LibPrefsModule_ProvideSecretCodePrefFactory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/prefs/dagger/LibPrefsModule_ProvideSecretCodePrefFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/prefs/dagger/LibPrefsModule_ProvideSecretCodePrefFactory;", "vault", "Ljavax/inject/Provider;", "Lcom/robinhood/vault/Vault;", "preferences", "Landroid/content/SharedPreferences;", "provideSecretCodePref", "Lcom/robinhood/prefs/SecureStringPreference;", "lib-prefs_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final LibPrefsModule_ProvideSecretCodePrefFactory create(Provider<Vault> vault, Provider<SharedPreferences> preferences) {
            Intrinsics.checkNotNullParameter(vault, "vault");
            Intrinsics.checkNotNullParameter(preferences, "preferences");
            return new LibPrefsModule_ProvideSecretCodePrefFactory(vault, preferences);
        }

        @JvmStatic
        public final SecureStringPreference provideSecretCodePref(Vault vault, SharedPreferences preferences) {
            Intrinsics.checkNotNullParameter(vault, "vault");
            Intrinsics.checkNotNullParameter(preferences, "preferences");
            Object objCheckNotNull = Preconditions.checkNotNull(LibPrefsModule.INSTANCE.provideSecretCodePref(vault, preferences), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (SecureStringPreference) objCheckNotNull;
        }
    }
}
