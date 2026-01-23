package com.withpersona.sdk2.inquiry.internal.network;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes18.dex */
public final class InquiryModule_Companion_UserAgentFactory implements Factory<String> {

    private static final class InstanceHolder {
        static final InquiryModule_Companion_UserAgentFactory INSTANCE = new InquiryModule_Companion_UserAgentFactory();
    }

    @Override // javax.inject.Provider
    public String get() {
        return userAgent();
    }

    public static InquiryModule_Companion_UserAgentFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String userAgent() {
        return (String) Preconditions.checkNotNullFromProvides(InquiryModule.INSTANCE.userAgent());
    }
}
