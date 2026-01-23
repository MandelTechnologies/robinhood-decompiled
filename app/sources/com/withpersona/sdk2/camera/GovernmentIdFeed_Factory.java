package com.withpersona.sdk2.camera;

import dagger.internal.Factory;
import dagger.internal.Provider;
import kotlin.Result;
import kotlinx.coroutines.flow.SharedFlow2;

/* loaded from: classes26.dex */
public final class GovernmentIdFeed_Factory implements Factory<GovernmentIdFeed> {
    private final Provider<SharedFlow2<Result<GovernmentIdFeed5>>> resultFlowProvider;

    public GovernmentIdFeed_Factory(Provider<SharedFlow2<Result<GovernmentIdFeed5>>> provider) {
        this.resultFlowProvider = provider;
    }

    @Override // javax.inject.Provider
    public GovernmentIdFeed get() {
        return newInstance(this.resultFlowProvider.get());
    }

    public static GovernmentIdFeed_Factory create(Provider<SharedFlow2<Result<GovernmentIdFeed5>>> provider) {
        return new GovernmentIdFeed_Factory(provider);
    }

    public static GovernmentIdFeed newInstance(SharedFlow2<Result<GovernmentIdFeed5>> sharedFlow2) {
        return new GovernmentIdFeed(sharedFlow2);
    }
}
