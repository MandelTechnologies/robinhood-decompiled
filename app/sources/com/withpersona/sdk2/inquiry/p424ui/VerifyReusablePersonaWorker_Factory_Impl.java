package com.withpersona.sdk2.inquiry.p424ui;

import com.withpersona.sdk2.inquiry.p424ui.VerifyReusablePersonaWorker;
import com.withpersona.sdk2.inquiry.p424ui.network.ComponentParam;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;
import java.util.Map;

/* loaded from: classes18.dex */
public final class VerifyReusablePersonaWorker_Factory_Impl implements VerifyReusablePersonaWorker.Factory {
    private final C50865VerifyReusablePersonaWorker_Factory delegateFactory;

    VerifyReusablePersonaWorker_Factory_Impl(C50865VerifyReusablePersonaWorker_Factory c50865VerifyReusablePersonaWorker_Factory) {
        this.delegateFactory = c50865VerifyReusablePersonaWorker_Factory;
    }

    @Override // com.withpersona.sdk2.inquiry.ui.VerifyReusablePersonaWorker.Factory
    public VerifyReusablePersonaWorker create(String str, String str2, String str3, String str4, Map<String, ? extends ComponentParam> map) {
        return this.delegateFactory.get(str, str2, str3, str4, map);
    }

    public static Provider<VerifyReusablePersonaWorker.Factory> createFactoryProvider(C50865VerifyReusablePersonaWorker_Factory c50865VerifyReusablePersonaWorker_Factory) {
        return InstanceFactory.create(new VerifyReusablePersonaWorker_Factory_Impl(c50865VerifyReusablePersonaWorker_Factory));
    }
}
