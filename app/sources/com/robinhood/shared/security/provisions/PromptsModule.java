package com.robinhood.shared.security.provisions;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.core.app.NotificationManagerCompat;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.security.prefs.ShowPromptsValuePropsPref;
import com.robinhood.utils.extensions.ContextSystemServices;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PromptsModule.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/security/provisions/PromptsModule;", "", "<init>", "()V", "provideNotificationManager", "Landroidx/core/app/NotificationManagerCompat;", "applicationContext", "Landroid/content/Context;", "provideShowPromptsValuePropsPref", "Lcom/robinhood/prefs/BooleanPreference;", "preferences", "Landroid/content/SharedPreferences;", "lib-security-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class PromptsModule {
    public static final PromptsModule INSTANCE = new PromptsModule();

    private PromptsModule() {
    }

    public final NotificationManagerCompat provideNotificationManager(Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        return ContextSystemServices.getNotificationManager(applicationContext);
    }

    @ShowPromptsValuePropsPref
    public final BooleanPreference provideShowPromptsValuePropsPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "showPromptsValuePropsPref", true, null, 8, null);
    }
}
