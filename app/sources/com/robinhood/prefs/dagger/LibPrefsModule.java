package com.robinhood.prefs.dagger;

import android.content.SharedPreferences;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.prefs.LockscreenTimeout;
import com.robinhood.prefs.LongPreference;
import com.robinhood.prefs.SecureStringPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.ActiveRetirementAccountNumberPref;
import com.robinhood.prefs.annotation.AddToGooglePayTappedPref;
import com.robinhood.prefs.annotation.AlertTypeDebugOverridePref;
import com.robinhood.prefs.annotation.DeviceIdPref;
import com.robinhood.prefs.annotation.DevicePrefs;
import com.robinhood.prefs.annotation.EducationLessonsFirstShownTimestampPref;
import com.robinhood.prefs.annotation.EducationToursEntryCountPref;
import com.robinhood.prefs.annotation.EducationToursEntryFirstShownTimestampPref;
import com.robinhood.prefs.annotation.EngagementTimeForAnalyticsPref;
import com.robinhood.prefs.annotation.FirebaseAppInstanceIdPref;
import com.robinhood.prefs.annotation.HasEverLoggedInPref;
import com.robinhood.prefs.annotation.HasSeenIpoNotificationBottomSheet;
import com.robinhood.prefs.annotation.HasSeenResumeApplicationPref;
import com.robinhood.prefs.annotation.HiddenEducationToursPref;
import com.robinhood.prefs.annotation.HyperExtendedPref;
import com.robinhood.prefs.annotation.LockscreenTimeoutPref;
import com.robinhood.prefs.annotation.MatchaOnboardingDataPref;
import com.robinhood.prefs.annotation.ReferredDataForAnalyticsPref;
import com.robinhood.prefs.annotation.ReferredDataOrganicPref;
import com.robinhood.prefs.annotation.SecretCodeLastUpdatedPref;
import com.robinhood.prefs.annotation.SecretCodePref;
import com.robinhood.prefs.annotation.ShowDropFromRecurringCreationSurvey;
import com.robinhood.prefs.annotation.ShowRhyFundingBottomSheetPref;
import com.robinhood.prefs.annotation.UserEmailPref;
import com.robinhood.prefs.annotation.UserLocalityPref;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.prefs.annotation.UserUuidPref;
import com.robinhood.prefs.annotation.UsernamePref;
import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
import com.robinhood.vault.Vault;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import rosetta.order.AlertType;

/* compiled from: LibPrefsModule.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u0013\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u0014\u001a\u00020\r2\b\b\u0001\u0010\u0015\u001a\u00020\u0007H\u0007J\u0012\u0010\u0016\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u0017\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u0018\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u0019\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u001d\u001a\u00020\r2\b\b\u0001\u0010\u0015\u001a\u00020\u0007H\u0007J\u0012\u0010\u001e\u001a\u00020\n2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u001f\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u001b2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\"\u001a\u00020\r2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010#\u001a\u00020\r2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010$\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010%\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010&\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010'\u001a\u00020\r2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010(\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010)\u001a\u00020\r2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010*\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006+"}, m3636d2 = {"Lcom/robinhood/prefs/dagger/LibPrefsModule;", "", "<init>", "()V", "provideDeviceIdPref", "Lcom/robinhood/prefs/StringPreference;", "preferences", "Landroid/content/SharedPreferences;", "provideReferredDataForAnalyticsPref", "provideEngagementTimeForAnalyticsPref", "Lcom/robinhood/prefs/LongPreference;", "prefs", "provideHasLoggedInPref", "Lcom/robinhood/prefs/BooleanPreference;", "provideHasSeenResumeApplicationPref", "provideSecretCodePref", "Lcom/robinhood/prefs/SecureStringPreference;", "vault", "Lcom/robinhood/vault/Vault;", "provideFirebaseAppInstanceIdPref", "provideShowDropFromRecurringCreationSurvey", SharedPreferencesModule.USER_PREFS_NAME, "provideUsernamePref", "provideUserEmailPref", "provideUserUuidPref", "provideUserLocalityPref", "provideLockscreenTimeoutPref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/prefs/LockscreenTimeout;", "provideHasSeenIpoNotificationsBottomSheet", "provideSecretCodeLastUpdatedPref", "provideHiddenEducationToursPref", "provideAlertTypeDebugOverridePref", "Lrosetta/order/AlertType;", "provideShowRhyFundingBottomSheetPref", "provideAddToGooglePayTappedPref", "provideEducationToursEntryCountPref", "provideEducationToursEntryFirstShownTimestampPref", "provideEducationLessonsFirstShownTimestampPref", "provideHyperExtendedPref", "provideActiveRetirementAccountIdPref", "provideReferredDataOrganicPref", "provideMatchaOnboardingDataPref", "lib-prefs_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class LibPrefsModule {
    public static final LibPrefsModule INSTANCE = new LibPrefsModule();

    private LibPrefsModule() {
    }

    @DeviceIdPref
    public final StringPreference provideDeviceIdPref(@DevicePrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID, null, null, 12, null);
    }

    @ReferredDataForAnalyticsPref
    public final StringPreference provideReferredDataForAnalyticsPref(@DevicePrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "referredDataForAnalytics", null, null, 12, null);
    }

    @EngagementTimeForAnalyticsPref
    public final LongPreference provideEngagementTimeForAnalyticsPref(@DevicePrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new LongPreference(prefs, "engagementTimeForAnalytics", 0L, 4, null);
    }

    @HasEverLoggedInPref
    public final BooleanPreference provideHasLoggedInPref(@DevicePrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "hasLoggedIn", false, null, 12, null);
    }

    @HasSeenResumeApplicationPref
    public final BooleanPreference provideHasSeenResumeApplicationPref(@DevicePrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "hasSeenResumeApplicationFixed", false, null, 12, null);
    }

    @SecretCodePref
    public final SecureStringPreference provideSecretCodePref(Vault vault, @DevicePrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(vault, "vault");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new SecureStringPreference(vault, preferences, "secretCode");
    }

    @FirebaseAppInstanceIdPref
    public final StringPreference provideFirebaseAppInstanceIdPref(@DevicePrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "firebaseAppInstanceId", null, null, 12, null);
    }

    @ShowDropFromRecurringCreationSurvey
    public final BooleanPreference provideShowDropFromRecurringCreationSurvey(@UserPrefs SharedPreferences userPrefs) {
        Intrinsics.checkNotNullParameter(userPrefs, "userPrefs");
        return new BooleanPreference(userPrefs, "showDropFromRecurringCreationSurvey", false, null, 12, null);
    }

    @UsernamePref
    public final StringPreference provideUsernamePref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "username", null, null, 12, null);
    }

    @UserEmailPref
    public final StringPreference provideUserEmailPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "userEmail", null, null, 12, null);
    }

    @UserUuidPref
    public final StringPreference provideUserUuidPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "userUuid", null, null, 12, null);
    }

    @UserLocalityPref
    public final StringPreference provideUserLocalityPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "userLocality", null, null, 12, null);
    }

    @LockscreenTimeoutPref
    public final EnumPreference<LockscreenTimeout> provideLockscreenTimeoutPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new EnumPreference<>(LockscreenTimeout.class, preferences, "lockscreenTimeout", LockscreenTimeout.FIVE_SECONDS, null, 16, null);
    }

    @HasSeenIpoNotificationBottomSheet
    public final BooleanPreference provideHasSeenIpoNotificationsBottomSheet(@UserPrefs SharedPreferences userPrefs) {
        Intrinsics.checkNotNullParameter(userPrefs, "userPrefs");
        return new BooleanPreference(userPrefs, "hasSeenIpoNotificationBottomSheet", false, null, 12, null);
    }

    @SecretCodeLastUpdatedPref
    public final LongPreference provideSecretCodeLastUpdatedPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new LongPreference(preferences, "secretCodeLastUpdated", 0L, 4, null);
    }

    @HiddenEducationToursPref
    public final StringPreference provideHiddenEducationToursPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "hiddenEducationTours", null, null, 12, null);
    }

    @AlertTypeDebugOverridePref
    public final EnumPreference<AlertType> provideAlertTypeDebugOverridePref(@DevicePrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new EnumPreference<>(AlertType.class, preferences, "alertTypePref", AlertType.UNDEFINED, null, 16, null);
    }

    @ShowRhyFundingBottomSheetPref
    public final BooleanPreference provideShowRhyFundingBottomSheetPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "showRhyFundingBottomSheetPref", false, null, 8, null);
    }

    @AddToGooglePayTappedPref
    public final BooleanPreference provideAddToGooglePayTappedPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "addToGooglePayTappedPref", false, null, 8, null);
    }

    @EducationToursEntryCountPref
    public final StringPreference provideEducationToursEntryCountPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "educationToursEntryCountPref", null, null, 12, null);
    }

    @EducationToursEntryFirstShownTimestampPref
    public final StringPreference provideEducationToursEntryFirstShownTimestampPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "educationToursEntryFirstShownTimestamp", null, null, 12, null);
    }

    @EducationLessonsFirstShownTimestampPref
    public final StringPreference provideEducationLessonsFirstShownTimestampPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "educationLessonsFirstShownTimestamp", null, null, 12, null);
    }

    @HyperExtendedPref
    public final BooleanPreference provideHyperExtendedPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "hyperExtended", false, null, 12, null);
    }

    @ActiveRetirementAccountNumberPref
    public final StringPreference provideActiveRetirementAccountIdPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "activeRetirementAccountId", null, null, 12, null);
    }

    @ReferredDataOrganicPref
    public final BooleanPreference provideReferredDataOrganicPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "referredDataOrganic", false, null, 8, null);
    }

    @MatchaOnboardingDataPref
    public final StringPreference provideMatchaOnboardingDataPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "matchaOnboardingData", null, null, 12, null);
    }
}
