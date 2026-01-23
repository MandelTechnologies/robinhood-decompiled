package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper;
import com.withpersona.sdk2.inquiry.internal.network.InquiryAttributes;
import dagger.internal.Provider;

/* renamed from: com.withpersona.sdk2.inquiry.internal.CreateInquiryWorker_Factory, reason: case insensitive filesystem */
/* loaded from: classes18.dex */
public final class C50851CreateInquiryWorker_Factory {
    private final Provider<InquiryApiHelper> inquiryApiHelperProvider;

    public C50851CreateInquiryWorker_Factory(Provider<InquiryApiHelper> provider) {
        this.inquiryApiHelperProvider = provider;
    }

    public CreateInquiryWorker get(InquiryAttributes inquiryAttributes) {
        return newInstance(inquiryAttributes, this.inquiryApiHelperProvider.get());
    }

    public static C50851CreateInquiryWorker_Factory create(Provider<InquiryApiHelper> provider) {
        return new C50851CreateInquiryWorker_Factory(provider);
    }

    public static CreateInquiryWorker newInstance(InquiryAttributes inquiryAttributes, InquiryApiHelper inquiryApiHelper) {
        return new CreateInquiryWorker(inquiryAttributes, inquiryApiHelper);
    }
}
