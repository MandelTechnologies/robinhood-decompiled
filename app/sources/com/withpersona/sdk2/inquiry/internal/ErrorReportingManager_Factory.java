package com.withpersona.sdk2.inquiry.internal;

import com.squareup.moshi.Moshi;
import com.withpersona.sdk2.inquiry.internal.network.InquiryService;
import com.withpersona.sdk2.inquiry.logger.Logger;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes18.dex */
public final class ErrorReportingManager_Factory implements Factory<ErrorReportingManager> {
    private final Provider<InquiryService> inquiryServiceProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<Moshi> moshiProvider;

    public ErrorReportingManager_Factory(Provider<InquiryService> provider, Provider<Moshi> provider2, Provider<Logger> provider3) {
        this.inquiryServiceProvider = provider;
        this.moshiProvider = provider2;
        this.loggerProvider = provider3;
    }

    @Override // javax.inject.Provider
    public ErrorReportingManager get() {
        return newInstance(this.inquiryServiceProvider.get(), this.moshiProvider.get(), this.loggerProvider.get());
    }

    public static ErrorReportingManager_Factory create(Provider<InquiryService> provider, Provider<Moshi> provider2, Provider<Logger> provider3) {
        return new ErrorReportingManager_Factory(provider, provider2, provider3);
    }

    public static ErrorReportingManager newInstance(InquiryService inquiryService, Moshi moshi, Logger logger) {
        return new ErrorReportingManager(inquiryService, moshi, logger);
    }
}
