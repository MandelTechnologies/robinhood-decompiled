package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.internal.PollingWorker;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;

/* loaded from: classes18.dex */
public final class PollingWorker_Factory_Impl implements PollingWorker.Factory {
    private final C50853PollingWorker_Factory delegateFactory;

    PollingWorker_Factory_Impl(C50853PollingWorker_Factory c50853PollingWorker_Factory) {
        this.delegateFactory = c50853PollingWorker_Factory;
    }

    @Override // com.withpersona.sdk2.inquiry.internal.PollingWorker.Factory
    public PollingWorker create(String str, String str2, PollingMode pollingMode, InquirySessionConfig inquirySessionConfig) {
        return this.delegateFactory.get(str, str2, pollingMode, inquirySessionConfig);
    }

    public static Provider<PollingWorker.Factory> createFactoryProvider(C50853PollingWorker_Factory c50853PollingWorker_Factory) {
        return InstanceFactory.create(new PollingWorker_Factory_Impl(c50853PollingWorker_Factory));
    }
}
