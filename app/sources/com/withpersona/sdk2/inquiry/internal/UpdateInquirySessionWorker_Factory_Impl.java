package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.internal.UpdateInquirySessionWorker;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;

/* loaded from: classes18.dex */
public final class UpdateInquirySessionWorker_Factory_Impl implements UpdateInquirySessionWorker.Factory {
    private final C50857UpdateInquirySessionWorker_Factory delegateFactory;

    UpdateInquirySessionWorker_Factory_Impl(C50857UpdateInquirySessionWorker_Factory c50857UpdateInquirySessionWorker_Factory) {
        this.delegateFactory = c50857UpdateInquirySessionWorker_Factory;
    }

    @Override // com.withpersona.sdk2.inquiry.internal.UpdateInquirySessionWorker.Factory
    public UpdateInquirySessionWorker create(String str, String str2, InquirySessionConfig inquirySessionConfig) {
        return this.delegateFactory.get(str, str2, inquirySessionConfig);
    }

    public static Provider<UpdateInquirySessionWorker.Factory> createFactoryProvider(C50857UpdateInquirySessionWorker_Factory c50857UpdateInquirySessionWorker_Factory) {
        return InstanceFactory.create(new UpdateInquirySessionWorker_Factory_Impl(c50857UpdateInquirySessionWorker_Factory));
    }
}
