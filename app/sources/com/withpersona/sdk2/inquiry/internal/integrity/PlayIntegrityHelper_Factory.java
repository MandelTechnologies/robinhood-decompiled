package com.withpersona.sdk2.inquiry.internal.integrity;

import android.content.Context;
import com.withpersona.sdk2.inquiry.logger.Logger8;
import dagger.internal.Factory;
import dagger.internal.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes18.dex */
public final class PlayIntegrityHelper_Factory implements Factory<PlayIntegrityHelper> {
    private final Provider<Context> applicationContextProvider;
    private final Provider<CoroutineDispatcher> dispatcherProvider;
    private final Provider<Logger8.Factory> loggerFactoryProvider;
    private final Provider<StandardIntegrityManagerFactory> standardIntegrityManagerFactoryProvider;

    public PlayIntegrityHelper_Factory(Provider<Context> provider, Provider<Logger8.Factory> provider2, Provider<StandardIntegrityManagerFactory> provider3, Provider<CoroutineDispatcher> provider4) {
        this.applicationContextProvider = provider;
        this.loggerFactoryProvider = provider2;
        this.standardIntegrityManagerFactoryProvider = provider3;
        this.dispatcherProvider = provider4;
    }

    @Override // javax.inject.Provider
    public PlayIntegrityHelper get() {
        return newInstance(this.applicationContextProvider.get(), this.loggerFactoryProvider.get(), this.standardIntegrityManagerFactoryProvider.get(), this.dispatcherProvider.get());
    }

    public static PlayIntegrityHelper_Factory create(Provider<Context> provider, Provider<Logger8.Factory> provider2, Provider<StandardIntegrityManagerFactory> provider3, Provider<CoroutineDispatcher> provider4) {
        return new PlayIntegrityHelper_Factory(provider, provider2, provider3, provider4);
    }

    public static PlayIntegrityHelper newInstance(Context context, Logger8.Factory factory, StandardIntegrityManagerFactory standardIntegrityManagerFactory, CoroutineDispatcher coroutineDispatcher) {
        return new PlayIntegrityHelper(context, factory, standardIntegrityManagerFactory, coroutineDispatcher);
    }
}
