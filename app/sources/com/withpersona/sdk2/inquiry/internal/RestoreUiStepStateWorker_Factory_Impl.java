package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.internal.RestoreUiStepStateWorker;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;

/* loaded from: classes18.dex */
public final class RestoreUiStepStateWorker_Factory_Impl implements RestoreUiStepStateWorker.Factory {
    private final C50854RestoreUiStepStateWorker_Factory delegateFactory;

    RestoreUiStepStateWorker_Factory_Impl(C50854RestoreUiStepStateWorker_Factory c50854RestoreUiStepStateWorker_Factory) {
        this.delegateFactory = c50854RestoreUiStepStateWorker_Factory;
    }

    @Override // com.withpersona.sdk2.inquiry.internal.RestoreUiStepStateWorker.Factory
    public RestoreUiStepStateWorker create(String str, String str2, String str3) {
        return this.delegateFactory.get(str, str2, str3);
    }

    public static Provider<RestoreUiStepStateWorker.Factory> createFactoryProvider(C50854RestoreUiStepStateWorker_Factory c50854RestoreUiStepStateWorker_Factory) {
        return InstanceFactory.create(new RestoreUiStepStateWorker_Factory_Impl(c50854RestoreUiStepStateWorker_Factory));
    }
}
