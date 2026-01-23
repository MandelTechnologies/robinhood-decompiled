package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper;
import dagger.internal.Provider;

/* renamed from: com.withpersona.sdk2.inquiry.internal.CreateInquirySessionWorker_Factory, reason: case insensitive filesystem */
/* loaded from: classes18.dex */
public final class C50850CreateInquirySessionWorker_Factory {
    private final Provider<InquiryApiHelper> inquiryApiHelperProvider;

    public C50850CreateInquirySessionWorker_Factory(Provider<InquiryApiHelper> provider) {
        this.inquiryApiHelperProvider = provider;
    }

    public CreateInquirySessionWorker get(String str) {
        return newInstance(str, this.inquiryApiHelperProvider.get());
    }

    public static C50850CreateInquirySessionWorker_Factory create(Provider<InquiryApiHelper> provider) {
        return new C50850CreateInquirySessionWorker_Factory(provider);
    }

    public static CreateInquirySessionWorker newInstance(String str, InquiryApiHelper inquiryApiHelper) {
        return new CreateInquirySessionWorker(str, inquiryApiHelper);
    }
}
