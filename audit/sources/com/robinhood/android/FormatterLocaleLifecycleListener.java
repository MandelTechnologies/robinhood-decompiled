package com.robinhood.android;

import android.app.Application;
import com.robinhood.g11n.CurrencyFormatterLocale;
import com.robinhood.shared.i18n.locale.LocaleConfiguration;
import com.robinhood.utils.AppInitializedListener;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FormatterLocaleLifecycleListener.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/FormatterLocaleLifecycleListener;", "Lcom/robinhood/utils/AppInitializedListener;", "localeConfiguration", "Lcom/robinhood/shared/i18n/locale/LocaleConfiguration;", "<init>", "(Lcom/robinhood/shared/i18n/locale/LocaleConfiguration;)V", "onAppInitialized", "", "app", "Landroid/app/Application;", "app-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class FormatterLocaleLifecycleListener implements AppInitializedListener {
    private final LocaleConfiguration localeConfiguration;

    public FormatterLocaleLifecycleListener(LocaleConfiguration localeConfiguration) {
        Intrinsics.checkNotNullParameter(localeConfiguration, "localeConfiguration");
        this.localeConfiguration = localeConfiguration;
    }

    @Override // com.robinhood.utils.AppInitializedListener
    public void onAppInitialized(Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        CurrencyFormatterLocale.Companion companion = CurrencyFormatterLocale.INSTANCE;
        CurrencyFormatterLocale.C33329US c33329us = CurrencyFormatterLocale.C33329US.INSTANCE;
        companion.initialize(c33329us);
        CrashReporter.Companion companion2 = CrashReporter.INSTANCE;
        companion2.addMetadata("Locale.system", this.localeConfiguration.acceptLanguageHeader());
        companion2.addMetadata("Locale.formatter", c33329us);
    }
}
