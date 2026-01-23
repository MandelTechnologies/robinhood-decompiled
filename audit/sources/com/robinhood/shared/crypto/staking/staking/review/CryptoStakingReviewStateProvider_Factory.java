package com.robinhood.shared.crypto.staking.staking.review;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* compiled from: CryptoStakingReviewStateProvider_Factory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewStateProvider_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewStateProvider;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "newInstance", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoStakingReviewStateProvider_Factory implements Factory<CryptoStakingReviewStateProvider> {
    public static final int $stable = 0;
    public static final CryptoStakingReviewStateProvider_Factory INSTANCE = new CryptoStakingReviewStateProvider_Factory();

    private CryptoStakingReviewStateProvider_Factory() {
    }

    @Override // javax.inject.Provider
    public CryptoStakingReviewStateProvider get() {
        return newInstance();
    }

    @JvmStatic
    public static final CryptoStakingReviewStateProvider_Factory create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final CryptoStakingReviewStateProvider newInstance() {
        return new CryptoStakingReviewStateProvider();
    }
}
