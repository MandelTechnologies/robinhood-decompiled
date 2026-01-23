package com.robinhood.android.api.supportchat;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.targetbackend.Endpoint;
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

/* compiled from: SupportChatApiModule_ProvidePathfinderRetrofitFactory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB6\u0012\u0011\u0010\u0003\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0019\u0010\u0003\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/api/supportchat/SupportChatApiModule_ProvidePathfinderRetrofitFactory;", "Ldagger/internal/Factory;", "Lretrofit2/Retrofit;", "okHttpClient", "Ljavax/inject/Provider;", "Lokhttp3/OkHttpClient;", "Lkotlin/jvm/JvmSuppressWildcards;", "retrofit", "endpoint", "Lcom/robinhood/targetbackend/Endpoint;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-api-supportchat_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class SupportChatApiModule_ProvidePathfinderRetrofitFactory implements Factory<Retrofit> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Endpoint> endpoint;
    private final Provider<OkHttpClient> okHttpClient;
    private final Provider<Retrofit> retrofit;

    @JvmStatic
    public static final SupportChatApiModule_ProvidePathfinderRetrofitFactory create(Provider<OkHttpClient> provider, Provider<Retrofit> provider2, Provider<Endpoint> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final Retrofit providePathfinderRetrofit(Lazy<OkHttpClient> lazy, Retrofit retrofit, Endpoint endpoint) {
        return INSTANCE.providePathfinderRetrofit(lazy, retrofit, endpoint);
    }

    public SupportChatApiModule_ProvidePathfinderRetrofitFactory(Provider<OkHttpClient> okHttpClient, Provider<Retrofit> retrofit, Provider<Endpoint> endpoint) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        this.okHttpClient = okHttpClient;
        this.retrofit = retrofit;
        this.endpoint = endpoint;
    }

    @Override // javax.inject.Provider
    public Retrofit get() {
        Companion companion = INSTANCE;
        Lazy<OkHttpClient> lazy = DoubleCheck.lazy(this.okHttpClient);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        Retrofit retrofit = this.retrofit.get();
        Intrinsics.checkNotNullExpressionValue(retrofit, "get(...)");
        Endpoint endpoint = this.endpoint.get();
        Intrinsics.checkNotNullExpressionValue(endpoint, "get(...)");
        return companion.providePathfinderRetrofit(lazy, retrofit, endpoint);
    }

    /* compiled from: SupportChatApiModule_ProvidePathfinderRetrofitFactory.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0007H\u0007J+\u0010\u000e\u001a\u00020\u000b2\u0011\u0010\u0006\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/api/supportchat/SupportChatApiModule_ProvidePathfinderRetrofitFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/api/supportchat/SupportChatApiModule_ProvidePathfinderRetrofitFactory;", "okHttpClient", "Ljavax/inject/Provider;", "Lokhttp3/OkHttpClient;", "Lkotlin/jvm/JvmSuppressWildcards;", "retrofit", "Lretrofit2/Retrofit;", "endpoint", "Lcom/robinhood/targetbackend/Endpoint;", "providePathfinderRetrofit", "Ldagger/Lazy;", "lib-api-supportchat_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SupportChatApiModule_ProvidePathfinderRetrofitFactory create(Provider<OkHttpClient> okHttpClient, Provider<Retrofit> retrofit, Provider<Endpoint> endpoint) {
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            Intrinsics.checkNotNullParameter(endpoint, "endpoint");
            return new SupportChatApiModule_ProvidePathfinderRetrofitFactory(okHttpClient, retrofit, endpoint);
        }

        @JvmStatic
        public final Retrofit providePathfinderRetrofit(Lazy<OkHttpClient> okHttpClient, Retrofit retrofit, Endpoint endpoint) {
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            Intrinsics.checkNotNullParameter(endpoint, "endpoint");
            Object objCheckNotNull = Preconditions.checkNotNull(SupportChatApiModule.INSTANCE.providePathfinderRetrofit(okHttpClient, retrofit, endpoint), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (Retrofit) objCheckNotNull;
        }
    }
}
