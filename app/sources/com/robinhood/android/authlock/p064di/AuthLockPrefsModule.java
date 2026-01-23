package com.robinhood.android.authlock.p064di;

import android.content.SharedPreferences;
import com.robinhood.android.authlock.prefs.BiometricsAuthEnabledPref;
import com.robinhood.android.authlock.prefs.BiometricsChangedPref;
import com.robinhood.android.authlock.prefs.FailedPinAttemptsPref;
import com.robinhood.android.authlock.prefs.PinPref;
import com.robinhood.android.authlock.prefs.UserPinPref;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.IntPreference;
import com.robinhood.prefs.MoshiSecurePreference;
import com.robinhood.prefs.SecureStringPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.DevicePrefs;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.vault.Vault;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AuthLockPrefsModule.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007J\u0012\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007J\u0012\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007J\u001a\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/authlock/di/AuthLockPrefsModule;", "", "<init>", "()V", "provideUserPinPref", "Lcom/robinhood/prefs/MoshiSecurePreference;", "", "", "vault", "Lcom/robinhood/vault/Vault;", "preferences", "Landroid/content/SharedPreferences;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "providePinPref", "Lcom/robinhood/prefs/StringPreference;", "provideBiometricsAuthEnabledPref", "Lcom/robinhood/prefs/BooleanPreference;", "provideFailedAttemptsPref", "Lcom/robinhood/prefs/IntPreference;", "provideBiometricsChangedPref", "lib-auth-lock_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class AuthLockPrefsModule {
    public static final int $stable = 0;

    @UserPinPref
    public final MoshiSecurePreference<Map<String, String>> provideUserPinPref(Vault vault, @DevicePrefs SharedPreferences preferences, LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(vault, "vault");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Types types = Types.INSTANCE;
        return new MoshiSecurePreference<>(vault, preferences, "secure_pins", moshi.adapter(new TypeToken<Map<String, ? extends String>>() { // from class: com.robinhood.android.authlock.di.AuthLockPrefsModule$provideUserPinPref$$inlined$getAdapter$1
        }.getType()));
    }

    @PinPref
    public final StringPreference providePinPref(Vault vault, @UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(vault, "vault");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new SecureStringPreference(vault, preferences, "secure_pin");
    }

    @BiometricsAuthEnabledPref
    public final BooleanPreference provideBiometricsAuthEnabledPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "pref_enable_biometrics_auth", false, null, 8, null);
    }

    @FailedPinAttemptsPref
    public final IntPreference provideFailedAttemptsPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new IntPreference(preferences, "failedPinAttempts", 0, 4, null);
    }

    @BiometricsChangedPref
    public final StringPreference provideBiometricsChangedPref(Vault vault, @DevicePrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(vault, "vault");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new SecureStringPreference(vault, preferences, "device_security_config_update");
    }
}
