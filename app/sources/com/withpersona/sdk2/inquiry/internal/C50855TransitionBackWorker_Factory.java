package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import dagger.internal.Provider;

/* renamed from: com.withpersona.sdk2.inquiry.internal.TransitionBackWorker_Factory, reason: case insensitive filesystem */
/* loaded from: classes18.dex */
public final class C50855TransitionBackWorker_Factory {
    private final Provider<InquiryApiHelper> inquiryApiHelperProvider;

    public C50855TransitionBackWorker_Factory(Provider<InquiryApiHelper> provider) {
        this.inquiryApiHelperProvider = provider;
    }

    public TransitionBackWorker get(String str, String str2, String str3, InquirySessionConfig inquirySessionConfig) {
        return newInstance(str, str2, str3, inquirySessionConfig, this.inquiryApiHelperProvider.get());
    }

    public static C50855TransitionBackWorker_Factory create(Provider<InquiryApiHelper> provider) {
        return new C50855TransitionBackWorker_Factory(provider);
    }

    public static TransitionBackWorker newInstance(String str, String str2, String str3, InquirySessionConfig inquirySessionConfig, InquiryApiHelper inquiryApiHelper) {
        return new TransitionBackWorker(str, str2, str3, inquirySessionConfig, inquiryApiHelper);
    }
}
