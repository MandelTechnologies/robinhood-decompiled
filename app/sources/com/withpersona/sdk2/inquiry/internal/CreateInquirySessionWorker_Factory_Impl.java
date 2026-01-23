package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.internal.CreateInquirySessionWorker;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;

/* loaded from: classes18.dex */
public final class CreateInquirySessionWorker_Factory_Impl implements CreateInquirySessionWorker.Factory {
    private final C50850CreateInquirySessionWorker_Factory delegateFactory;

    CreateInquirySessionWorker_Factory_Impl(C50850CreateInquirySessionWorker_Factory c50850CreateInquirySessionWorker_Factory) {
        this.delegateFactory = c50850CreateInquirySessionWorker_Factory;
    }

    @Override // com.withpersona.sdk2.inquiry.internal.CreateInquirySessionWorker.Factory
    public CreateInquirySessionWorker create(String str) {
        return this.delegateFactory.get(str);
    }

    public static Provider<CreateInquirySessionWorker.Factory> createFactoryProvider(C50850CreateInquirySessionWorker_Factory c50850CreateInquirySessionWorker_Factory) {
        return InstanceFactory.create(new CreateInquirySessionWorker_Factory_Impl(c50850CreateInquirySessionWorker_Factory));
    }
}
