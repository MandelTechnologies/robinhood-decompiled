package com.withpersona.sdk2.inquiry.p424ui;

import com.withpersona.sdk2.inquiry.p424ui.CreateReusablePersonaWorker;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;

/* loaded from: classes18.dex */
public final class CreateReusablePersonaWorker_Factory_Impl implements CreateReusablePersonaWorker.Factory {
    private final C50864CreateReusablePersonaWorker_Factory delegateFactory;

    CreateReusablePersonaWorker_Factory_Impl(C50864CreateReusablePersonaWorker_Factory c50864CreateReusablePersonaWorker_Factory) {
        this.delegateFactory = c50864CreateReusablePersonaWorker_Factory;
    }

    @Override // com.withpersona.sdk2.inquiry.ui.CreateReusablePersonaWorker.Factory
    public CreateReusablePersonaWorker create(String str, String str2, String str3, String str4) {
        return this.delegateFactory.get(str, str2, str3, str4);
    }

    public static Provider<CreateReusablePersonaWorker.Factory> createFactoryProvider(C50864CreateReusablePersonaWorker_Factory c50864CreateReusablePersonaWorker_Factory) {
        return InstanceFactory.create(new CreateReusablePersonaWorker_Factory_Impl(c50864CreateReusablePersonaWorker_Factory));
    }
}
