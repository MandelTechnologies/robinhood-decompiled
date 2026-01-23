package com.withpersona.sdk2.inquiry.logger;

import dagger.internal.Provider;

/* loaded from: classes18.dex */
public final class SubsystemLogger_Factory {
    private final Provider<Logger> loggerProvider;

    public SubsystemLogger_Factory(Provider<Logger> provider) {
        this.loggerProvider = provider;
    }

    public Logger8 get(String str) {
        return newInstance(this.loggerProvider.get(), str);
    }

    public static SubsystemLogger_Factory create(Provider<Logger> provider) {
        return new SubsystemLogger_Factory(provider);
    }

    public static Logger8 newInstance(Logger logger, String str) {
        return new Logger8(logger, str);
    }
}
