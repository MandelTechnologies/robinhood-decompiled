package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.internal.TransitionWorker;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;

/* loaded from: classes18.dex */
public final class TransitionWorker_Factory_Impl implements TransitionWorker.Factory {
    private final C50856TransitionWorker_Factory delegateFactory;

    TransitionWorker_Factory_Impl(C50856TransitionWorker_Factory c50856TransitionWorker_Factory) {
        this.delegateFactory = c50856TransitionWorker_Factory;
    }

    @Override // com.withpersona.sdk2.inquiry.internal.TransitionWorker.Factory
    public TransitionWorker create(String str, String str2, InquirySessionConfig inquirySessionConfig, TransitionWorker.TransitionData transitionData) {
        return this.delegateFactory.get(str, str2, inquirySessionConfig, transitionData);
    }

    public static Provider<TransitionWorker.Factory> createFactoryProvider(C50856TransitionWorker_Factory c50856TransitionWorker_Factory) {
        return InstanceFactory.create(new TransitionWorker_Factory_Impl(c50856TransitionWorker_Factory));
    }
}
