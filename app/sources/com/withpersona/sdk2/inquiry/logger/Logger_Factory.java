package com.withpersona.sdk2.inquiry.logger;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes18.dex */
public final class Logger_Factory implements Factory<Logger> {
    private final Provider<Context> contextProvider;

    public Logger_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public Logger get() {
        return newInstance(this.contextProvider.get());
    }

    public static Logger_Factory create(Provider<Context> provider) {
        return new Logger_Factory(provider);
    }

    public static Logger newInstance(Context context) {
        return new Logger(context);
    }
}
