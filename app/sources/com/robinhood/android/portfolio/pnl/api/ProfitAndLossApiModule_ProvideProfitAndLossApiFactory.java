package com.robinhood.android.portfolio.pnl.api;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;

/* compiled from: ProfitAndLossApiModule_ProvideProfitAndLossApiFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u001a\u0012\u0011\u0010\u0003\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0019\u0010\u0003\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/api/ProfitAndLossApiModule_ProvideProfitAndLossApiFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/portfolio/pnl/api/ProfitAndLossApi;", "retrofit", "Ljavax/inject/Provider;", "Lretrofit2/Retrofit;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ProfitAndLossApiModule_ProvideProfitAndLossApiFactory implements Factory<ProfitAndLossApi> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Retrofit> retrofit;

    @JvmStatic
    public static final ProfitAndLossApiModule_ProvideProfitAndLossApiFactory create(Provider<Retrofit> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final ProfitAndLossApi provideProfitAndLossApi(Lazy<Retrofit> lazy) {
        return INSTANCE.provideProfitAndLossApi(lazy);
    }

    public ProfitAndLossApiModule_ProvideProfitAndLossApiFactory(Provider<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    @Override // javax.inject.Provider
    public ProfitAndLossApi get() {
        Companion companion = INSTANCE;
        Lazy<Retrofit> lazy = DoubleCheck.lazy(this.retrofit);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        return companion.provideProfitAndLossApi(lazy);
    }

    /* compiled from: ProfitAndLossApiModule_ProvideProfitAndLossApiFactory.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\u0007H\u0007J\u001b\u0010\n\u001a\u00020\u000b2\u0011\u0010\u0006\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\fH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/api/ProfitAndLossApiModule_ProvideProfitAndLossApiFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/portfolio/pnl/api/ProfitAndLossApiModule_ProvideProfitAndLossApiFactory;", "retrofit", "Ljavax/inject/Provider;", "Lretrofit2/Retrofit;", "Lkotlin/jvm/JvmSuppressWildcards;", "provideProfitAndLossApi", "Lcom/robinhood/android/portfolio/pnl/api/ProfitAndLossApi;", "Ldagger/Lazy;", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ProfitAndLossApiModule_ProvideProfitAndLossApiFactory create(Provider<Retrofit> retrofit) {
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            return new ProfitAndLossApiModule_ProvideProfitAndLossApiFactory(retrofit);
        }

        @JvmStatic
        public final ProfitAndLossApi provideProfitAndLossApi(Lazy<Retrofit> retrofit) {
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            Object objCheckNotNull = Preconditions.checkNotNull(ProfitAndLossApiModule.INSTANCE.provideProfitAndLossApi(retrofit), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (ProfitAndLossApi) objCheckNotNull;
        }
    }
}
