package com.robinhood.android.dagger;

import android.content.SharedPreferences;
import com.google.firebase.messaging.FirebaseMessaging;
import com.robinhood.android.data.prefs.GcmTokenPref;
import com.robinhood.android.data.prefs.PromptedPushPref;
import com.robinhood.android.data.prefs.RegisteredDeviceRhId;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LibSystemNotificationsModule.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/dagger/LibSystemNotificationsModule;", "", "<init>", "()V", "provideRegistrationIdPref", "Lcom/robinhood/prefs/StringPreference;", "preferences", "Landroid/content/SharedPreferences;", "provideRegisteredDeviceRhId", "providePromptedPushPref", "Lcom/robinhood/prefs/BooleanPreference;", "provideFirebaseMessaging", "Lcom/google/firebase/messaging/FirebaseMessaging;", "lib-system-notifications-base_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class LibSystemNotificationsModule {
    public static final LibSystemNotificationsModule INSTANCE = new LibSystemNotificationsModule();

    private LibSystemNotificationsModule() {
    }

    @GcmTokenPref
    public final StringPreference provideRegistrationIdPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "registrationId", null, null, 12, null);
    }

    @RegisteredDeviceRhId
    public final StringPreference provideRegisteredDeviceRhId(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "registeredDeviceRhId", null, null, 12, null);
    }

    @PromptedPushPref
    public final BooleanPreference providePromptedPushPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "promptedPush", false, null, 12, null);
    }

    public final FirebaseMessaging provideFirebaseMessaging() {
        FirebaseMessaging firebaseMessaging = FirebaseMessaging.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseMessaging, "getInstance(...)");
        return firebaseMessaging;
    }
}
