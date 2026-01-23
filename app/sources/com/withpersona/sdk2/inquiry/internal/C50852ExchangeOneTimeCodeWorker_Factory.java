package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper;
import dagger.internal.Provider;

/* renamed from: com.withpersona.sdk2.inquiry.internal.ExchangeOneTimeCodeWorker_Factory, reason: case insensitive filesystem */
/* loaded from: classes18.dex */
public final class C50852ExchangeOneTimeCodeWorker_Factory {
    private final Provider<InquiryApiHelper> inquiryApiHelperProvider;

    public C50852ExchangeOneTimeCodeWorker_Factory(Provider<InquiryApiHelper> provider) {
        this.inquiryApiHelperProvider = provider;
    }

    public ExchangeOneTimeCodeWorker get(String str) {
        return newInstance(str, this.inquiryApiHelperProvider.get());
    }

    public static C50852ExchangeOneTimeCodeWorker_Factory create(Provider<InquiryApiHelper> provider) {
        return new C50852ExchangeOneTimeCodeWorker_Factory(provider);
    }

    public static ExchangeOneTimeCodeWorker newInstance(String str, InquiryApiHelper inquiryApiHelper) {
        return new ExchangeOneTimeCodeWorker(str, inquiryApiHelper);
    }
}
