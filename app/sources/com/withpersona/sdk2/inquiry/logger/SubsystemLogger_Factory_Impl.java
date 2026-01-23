package com.withpersona.sdk2.inquiry.logger;

import com.withpersona.sdk2.inquiry.logger.Logger8;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;

/* loaded from: classes18.dex */
public final class SubsystemLogger_Factory_Impl implements Logger8.Factory {
    private final SubsystemLogger_Factory delegateFactory;

    SubsystemLogger_Factory_Impl(SubsystemLogger_Factory subsystemLogger_Factory) {
        this.delegateFactory = subsystemLogger_Factory;
    }

    @Override // com.withpersona.sdk2.inquiry.logger.Logger8.Factory
    public Logger8 create(String str) {
        return this.delegateFactory.get(str);
    }

    public static Provider<Logger8.Factory> createFactoryProvider(SubsystemLogger_Factory subsystemLogger_Factory) {
        return InstanceFactory.create(new SubsystemLogger_Factory_Impl(subsystemLogger_Factory));
    }
}
