package com.robinhood.shared.i18n.store.locale;

import android.content.SharedPreferences;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.DevicePrefs;
import com.robinhood.shared.i18n.locale.SupportedLocaleRepository;
import com.robinhood.utils.AppInitializedListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LocaleStoreModule.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/i18n/store/locale/LocaleStoreModule;", "", "<init>", "()V", "provideRemoteSupportedLocalePref", "Lcom/robinhood/prefs/StringPreference;", "preferences", "Landroid/content/SharedPreferences;", "provideSupportedLocaleRepository", "Lcom/robinhood/shared/i18n/locale/SupportedLocaleRepository;", "supportedLocaleStore", "Lcom/robinhood/shared/i18n/store/locale/SupportedLocaleStore;", "provideAppInitializer", "Lcom/robinhood/utils/AppInitializedListener;", "listener", "Lcom/robinhood/shared/i18n/store/locale/SupportedLocaleAppInitializedListener;", "lib-store-locale_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class LocaleStoreModule {
    public static final LocaleStoreModule INSTANCE = new LocaleStoreModule();

    public final AppInitializedListener provideAppInitializer(SupportedLocaleAppInitializedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        return listener;
    }

    public final SupportedLocaleRepository provideSupportedLocaleRepository(SupportedLocaleStore supportedLocaleStore) {
        Intrinsics.checkNotNullParameter(supportedLocaleStore, "supportedLocaleStore");
        return supportedLocaleStore;
    }

    private LocaleStoreModule() {
    }

    @RemoteSupportedLocalePref
    public final StringPreference provideRemoteSupportedLocalePref(@DevicePrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "remoteSupportedLocalePref", null, null, 12, null);
    }
}
