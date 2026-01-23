package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.internal.ExchangeOneTimeCodeWorker;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;

/* loaded from: classes18.dex */
public final class ExchangeOneTimeCodeWorker_Factory_Impl implements ExchangeOneTimeCodeWorker.Factory {
    private final C50852ExchangeOneTimeCodeWorker_Factory delegateFactory;

    ExchangeOneTimeCodeWorker_Factory_Impl(C50852ExchangeOneTimeCodeWorker_Factory c50852ExchangeOneTimeCodeWorker_Factory) {
        this.delegateFactory = c50852ExchangeOneTimeCodeWorker_Factory;
    }

    @Override // com.withpersona.sdk2.inquiry.internal.ExchangeOneTimeCodeWorker.Factory
    public ExchangeOneTimeCodeWorker create(String str) {
        return this.delegateFactory.get(str);
    }

    public static Provider<ExchangeOneTimeCodeWorker.Factory> createFactoryProvider(C50852ExchangeOneTimeCodeWorker_Factory c50852ExchangeOneTimeCodeWorker_Factory) {
        return InstanceFactory.create(new ExchangeOneTimeCodeWorker_Factory_Impl(c50852ExchangeOneTimeCodeWorker_Factory));
    }
}
