package com.withpersona.sdk2.inquiry.governmentid;

import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;

/* loaded from: classes18.dex */
public final class GovernmentIdAnalyzeWorker_Factory_Impl implements GovernmentIdAnalyzeWorker.Factory {
    private final C50847GovernmentIdAnalyzeWorker_Factory delegateFactory;

    GovernmentIdAnalyzeWorker_Factory_Impl(C50847GovernmentIdAnalyzeWorker_Factory c50847GovernmentIdAnalyzeWorker_Factory) {
        this.delegateFactory = c50847GovernmentIdAnalyzeWorker_Factory;
    }

    @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker.Factory
    public GovernmentIdAnalyzeWorker create(IdConfig.Side side, String str) {
        return this.delegateFactory.get(side, str);
    }

    public static Provider<GovernmentIdAnalyzeWorker.Factory> createFactoryProvider(C50847GovernmentIdAnalyzeWorker_Factory c50847GovernmentIdAnalyzeWorker_Factory) {
        return InstanceFactory.create(new GovernmentIdAnalyzeWorker_Factory_Impl(c50847GovernmentIdAnalyzeWorker_Factory));
    }
}
