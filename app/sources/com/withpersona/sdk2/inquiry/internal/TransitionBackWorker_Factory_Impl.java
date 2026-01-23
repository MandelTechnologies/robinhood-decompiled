package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.internal.TransitionBackWorker;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;

/* loaded from: classes18.dex */
public final class TransitionBackWorker_Factory_Impl implements TransitionBackWorker.Factory {
    private final C50855TransitionBackWorker_Factory delegateFactory;

    TransitionBackWorker_Factory_Impl(C50855TransitionBackWorker_Factory c50855TransitionBackWorker_Factory) {
        this.delegateFactory = c50855TransitionBackWorker_Factory;
    }

    @Override // com.withpersona.sdk2.inquiry.internal.TransitionBackWorker.Factory
    public TransitionBackWorker create(String str, String str2, String str3, InquirySessionConfig inquirySessionConfig) {
        return this.delegateFactory.get(str, str2, str3, inquirySessionConfig);
    }

    public static Provider<TransitionBackWorker.Factory> createFactoryProvider(C50855TransitionBackWorker_Factory c50855TransitionBackWorker_Factory) {
        return InstanceFactory.create(new TransitionBackWorker_Factory_Impl(c50855TransitionBackWorker_Factory));
    }
}
