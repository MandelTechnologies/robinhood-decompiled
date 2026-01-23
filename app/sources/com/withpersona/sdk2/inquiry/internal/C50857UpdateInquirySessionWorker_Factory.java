package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import dagger.internal.Provider;

/* renamed from: com.withpersona.sdk2.inquiry.internal.UpdateInquirySessionWorker_Factory, reason: case insensitive filesystem */
/* loaded from: classes18.dex */
public final class C50857UpdateInquirySessionWorker_Factory {
    private final Provider<InquiryApiHelper> inquiryApiHelperProvider;

    public C50857UpdateInquirySessionWorker_Factory(Provider<InquiryApiHelper> provider) {
        this.inquiryApiHelperProvider = provider;
    }

    public UpdateInquirySessionWorker get(String str, String str2, InquirySessionConfig inquirySessionConfig) {
        return newInstance(str, str2, inquirySessionConfig, this.inquiryApiHelperProvider.get());
    }

    public static C50857UpdateInquirySessionWorker_Factory create(Provider<InquiryApiHelper> provider) {
        return new C50857UpdateInquirySessionWorker_Factory(provider);
    }

    public static UpdateInquirySessionWorker newInstance(String str, String str2, InquirySessionConfig inquirySessionConfig, InquiryApiHelper inquiryApiHelper) {
        return new UpdateInquirySessionWorker(str, str2, inquirySessionConfig, inquiryApiHelper);
    }
}
