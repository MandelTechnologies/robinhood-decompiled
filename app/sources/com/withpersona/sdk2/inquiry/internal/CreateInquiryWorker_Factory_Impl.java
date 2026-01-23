package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.internal.CreateInquiryWorker;
import com.withpersona.sdk2.inquiry.internal.network.InquiryAttributes;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;

/* loaded from: classes18.dex */
public final class CreateInquiryWorker_Factory_Impl implements CreateInquiryWorker.Factory {
    private final C50851CreateInquiryWorker_Factory delegateFactory;

    CreateInquiryWorker_Factory_Impl(C50851CreateInquiryWorker_Factory c50851CreateInquiryWorker_Factory) {
        this.delegateFactory = c50851CreateInquiryWorker_Factory;
    }

    @Override // com.withpersona.sdk2.inquiry.internal.CreateInquiryWorker.Factory
    public CreateInquiryWorker create(InquiryAttributes inquiryAttributes) {
        return this.delegateFactory.get(inquiryAttributes);
    }

    public static Provider<CreateInquiryWorker.Factory> createFactoryProvider(C50851CreateInquiryWorker_Factory c50851CreateInquiryWorker_Factory) {
        return InstanceFactory.create(new CreateInquiryWorker_Factory_Impl(c50851CreateInquiryWorker_Factory));
    }
}
