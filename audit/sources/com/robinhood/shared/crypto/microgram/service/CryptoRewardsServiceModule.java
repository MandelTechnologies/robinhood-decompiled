package com.robinhood.shared.crypto.microgram.service;

import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.CoroutineScope;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramCachedComponentManager;
import microgram.android.inject.MicrogramComponent;

/* compiled from: CryptoRewardsServiceModule.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/crypto/microgram/service/CryptoRewardsServiceModule;", "", "<init>", "()V", "bindService", "Lcom/robinhood/shared/crypto/microgram/service/CryptoRewardsCachedService;", "parentScope", "Lkotlinx/coroutines/CoroutineScope;", "componentFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "lib-crypto-microgram-service_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoRewardsServiceModule {
    public static final CryptoRewardsServiceModule INSTANCE = new CryptoRewardsServiceModule();

    private CryptoRewardsServiceModule() {
    }

    public final CryptoRewardsCachedService bindService(@RootCoroutineScope CoroutineScope parentScope, MicrogramComponent.Factory componentFactory) {
        Intrinsics.checkNotNullParameter(parentScope, "parentScope");
        Intrinsics.checkNotNullParameter(componentFactory, "componentFactory");
        RemoteMicrogramApplication remoteMicrogramApplication = new RemoteMicrogramApplication("app-rhc-upsells", null, 2, null);
        Duration.Companion companion = Duration.INSTANCE;
        return new CryptoRewardsCachedService2(new MicrogramCachedComponentManager(parentScope, Duration3.toDuration(10, DurationUnitJvm.SECONDS), componentFactory, remoteMicrogramApplication, null, 16, null));
    }
}
