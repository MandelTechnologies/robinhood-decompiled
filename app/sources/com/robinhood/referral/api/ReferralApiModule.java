package com.robinhood.referral.api;

import com.robinhood.api.annotation.BonfireRetrofit;
import com.robinhood.api.annotation.MidlandsRetrofit;
import com.robinhood.utils.retrofit.lazy.LazyRetrofit3;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.Retrofit;

/* compiled from: ReferralApiModule.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0018\u0010\t\u001a\u00020\n2\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/referral/api/ReferralApiModule;", "", "<init>", "()V", "provideContactsApi", "Lcom/robinhood/referral/api/ContactsApi;", "retrofit", "Ldagger/Lazy;", "Lretrofit2/Retrofit;", "provideFundAccountScreenApi", "Lcom/robinhood/referral/api/FundAccountScreenApi;", "provideRewardsApi", "Lcom/robinhood/referral/api/RewardsApi;", "lib-referral_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes19.dex */
public final class ReferralApiModule {
    public static final ReferralApiModule INSTANCE = new ReferralApiModule();

    private ReferralApiModule() {
    }

    public final FundAccountScreenApi provideFundAccountScreenApi(@BonfireRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (FundAccountScreenApi) LazyRetrofit3.create(retrofit, FundAccountScreenApi.class, "rewards/");
    }

    public final ContactsApi provideContactsApi(@MidlandsRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (ContactsApi) LazyRetrofit3.create(retrofit, ContactsApi.class);
    }

    public final RewardsApi provideRewardsApi(@BonfireRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (RewardsApi) LazyRetrofit3.create(retrofit, RewardsApi.class);
    }
}
