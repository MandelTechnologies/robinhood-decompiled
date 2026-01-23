package com.robinhood.android.engagement.cryptoEducationTrading.api;

import com.robinhood.api.annotation.BonfireRetrofit;
import com.robinhood.utils.retrofit.lazy.LazyRetrofit3;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.Retrofit;

/* compiled from: EducationRewardsModule.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0018\u0010\t\u001a\u00020\n2\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/engagement/cryptoEducationTrading/api/CryptoEducationTradingApiModule;", "", "<init>", "()V", "provideEducationRewardsConfirmationApi", "Lcom/robinhood/android/engagement/cryptoEducationTrading/api/EducationRewardsConfirmationApi;", "retrofit", "Ldagger/Lazy;", "Lretrofit2/Retrofit;", "provideCryptoEducationEligibilitySie", "Lcom/robinhood/android/engagement/cryptoEducationTrading/api/CryptoEducationTradingEligibilityApi;", "lib-crypto-education-trading_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.engagement.cryptoEducationTrading.api.CryptoEducationTradingApiModule, reason: use source file name */
/* loaded from: classes7.dex */
public final class EducationRewardsModule {
    public static final int $stable = 0;
    public static final EducationRewardsModule INSTANCE = new EducationRewardsModule();

    private EducationRewardsModule() {
    }

    public final EducationRewardsConfirmationApi provideEducationRewardsConfirmationApi(@BonfireRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (EducationRewardsConfirmationApi) LazyRetrofit3.create(retrofit, EducationRewardsConfirmationApi.class, "activation/education/rewards/");
    }

    public final CryptoEducationTradingEligibilityApi provideCryptoEducationEligibilitySie(@BonfireRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (CryptoEducationTradingEligibilityApi) LazyRetrofit3.create(retrofit, CryptoEducationTradingEligibilityApi.class, "activation/");
    }
}
