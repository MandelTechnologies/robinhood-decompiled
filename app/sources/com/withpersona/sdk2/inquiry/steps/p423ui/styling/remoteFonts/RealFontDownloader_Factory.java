package com.withpersona.sdk2.inquiry.steps.p423ui.styling.remoteFonts;

import android.app.Application;
import dagger.internal.Factory;
import dagger.internal.Provider;
import okhttp3.OkHttpClient;

/* loaded from: classes18.dex */
public final class RealFontDownloader_Factory implements Factory<RealFontDownloader> {
    private final Provider<Application> contextProvider;
    private final Provider<OkHttpClient> okHttpClientProvider;

    public RealFontDownloader_Factory(Provider<OkHttpClient> provider, Provider<Application> provider2) {
        this.okHttpClientProvider = provider;
        this.contextProvider = provider2;
    }

    @Override // javax.inject.Provider
    public RealFontDownloader get() {
        return newInstance(this.okHttpClientProvider.get(), this.contextProvider.get());
    }

    public static RealFontDownloader_Factory create(Provider<OkHttpClient> provider, Provider<Application> provider2) {
        return new RealFontDownloader_Factory(provider, provider2);
    }

    public static RealFontDownloader newInstance(OkHttpClient okHttpClient, Application application) {
        return new RealFontDownloader(okHttpClient, application);
    }
}
