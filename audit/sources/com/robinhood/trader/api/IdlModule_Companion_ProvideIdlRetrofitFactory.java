package com.robinhood.trader.api;

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
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* compiled from: IdlModule_Companion_ProvideIdlRetrofitFactory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB(\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0011\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/trader/api/IdlModule_Companion_ProvideIdlRetrofitFactory;", "Ldagger/internal/Factory;", "Lretrofit2/Retrofit;", "retrofit", "Ljavax/inject/Provider;", "okHttpClient", "Lokhttp3/OkHttpClient;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class IdlModule_Companion_ProvideIdlRetrofitFactory implements Factory<Retrofit> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<OkHttpClient> okHttpClient;
    private final Provider<Retrofit> retrofit;

    @JvmStatic
    public static final IdlModule_Companion_ProvideIdlRetrofitFactory create(Provider<Retrofit> provider, Provider<OkHttpClient> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final Retrofit provideIdlRetrofit(Retrofit retrofit, Lazy<OkHttpClient> lazy) {
        return INSTANCE.provideIdlRetrofit(retrofit, lazy);
    }

    public IdlModule_Companion_ProvideIdlRetrofitFactory(Provider<Retrofit> retrofit, Provider<OkHttpClient> okHttpClient) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        this.retrofit = retrofit;
        this.okHttpClient = okHttpClient;
    }

    @Override // javax.inject.Provider
    public Retrofit get() {
        Companion companion = INSTANCE;
        Retrofit retrofit = this.retrofit.get();
        Intrinsics.checkNotNullExpressionValue(retrofit, "get(...)");
        Lazy<OkHttpClient> lazy = DoubleCheck.lazy(this.okHttpClient);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        return companion.provideIdlRetrofit(retrofit, lazy);
    }

    /* compiled from: IdlModule_Companion_ProvideIdlRetrofitFactory.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\u0007H\u0007J#\u0010\f\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\b2\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\rH\u0007¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/trader/api/IdlModule_Companion_ProvideIdlRetrofitFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/trader/api/IdlModule_Companion_ProvideIdlRetrofitFactory;", "retrofit", "Ljavax/inject/Provider;", "Lretrofit2/Retrofit;", "okHttpClient", "Lokhttp3/OkHttpClient;", "Lkotlin/jvm/JvmSuppressWildcards;", "provideIdlRetrofit", "Ldagger/Lazy;", "lib-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final IdlModule_Companion_ProvideIdlRetrofitFactory create(Provider<Retrofit> retrofit, Provider<OkHttpClient> okHttpClient) {
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            return new IdlModule_Companion_ProvideIdlRetrofitFactory(retrofit, okHttpClient);
        }

        @JvmStatic
        public final Retrofit provideIdlRetrofit(Retrofit retrofit, Lazy<OkHttpClient> okHttpClient) {
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            Object objCheckNotNull = Preconditions.checkNotNull(IdlModule.INSTANCE.provideIdlRetrofit(retrofit, okHttpClient), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (Retrofit) objCheckNotNull;
        }
    }
}
