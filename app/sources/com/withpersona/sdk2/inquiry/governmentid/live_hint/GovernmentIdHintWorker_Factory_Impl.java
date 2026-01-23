package com.withpersona.sdk2.inquiry.governmentid.live_hint;

import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;

/* loaded from: classes18.dex */
public final class GovernmentIdHintWorker_Factory_Impl implements GovernmentIdHintWorker.Factory {
    private final C50848GovernmentIdHintWorker_Factory delegateFactory;

    GovernmentIdHintWorker_Factory_Impl(C50848GovernmentIdHintWorker_Factory c50848GovernmentIdHintWorker_Factory) {
        this.delegateFactory = c50848GovernmentIdHintWorker_Factory;
    }

    @Override // com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker.Factory
    public GovernmentIdHintWorker create(IdConfig.Side side) {
        return this.delegateFactory.get(side);
    }

    public static Provider<GovernmentIdHintWorker.Factory> createFactoryProvider(C50848GovernmentIdHintWorker_Factory c50848GovernmentIdHintWorker_Factory) {
        return InstanceFactory.create(new GovernmentIdHintWorker_Factory_Impl(c50848GovernmentIdHintWorker_Factory));
    }
}
