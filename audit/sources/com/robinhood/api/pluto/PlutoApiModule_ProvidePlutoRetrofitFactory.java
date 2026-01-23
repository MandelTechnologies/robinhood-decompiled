package com.robinhood.api.pluto;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.targetbackend.Endpoint;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;

/* compiled from: PlutoApiModule_ProvidePlutoRetrofitFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/api/pluto/PlutoApiModule_ProvidePlutoRetrofitFactory;", "Ldagger/internal/Factory;", "Lretrofit2/Retrofit;", "retrofit", "Ljavax/inject/Provider;", "endpoint", "Lcom/robinhood/targetbackend/Endpoint;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-api-pluto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class PlutoApiModule_ProvidePlutoRetrofitFactory implements Factory<Retrofit> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Endpoint> endpoint;
    private final Provider<Retrofit> retrofit;

    @JvmStatic
    public static final PlutoApiModule_ProvidePlutoRetrofitFactory create(Provider<Retrofit> provider, Provider<Endpoint> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final Retrofit providePlutoRetrofit(Retrofit retrofit, Endpoint endpoint) {
        return INSTANCE.providePlutoRetrofit(retrofit, endpoint);
    }

    public PlutoApiModule_ProvidePlutoRetrofitFactory(Provider<Retrofit> retrofit, Provider<Endpoint> endpoint) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        this.retrofit = retrofit;
        this.endpoint = endpoint;
    }

    @Override // javax.inject.Provider
    public Retrofit get() {
        Companion companion = INSTANCE;
        Retrofit retrofit = this.retrofit.get();
        Intrinsics.checkNotNullExpressionValue(retrofit, "get(...)");
        Endpoint endpoint = this.endpoint.get();
        Intrinsics.checkNotNullExpressionValue(endpoint, "get(...)");
        return companion.providePlutoRetrofit(retrofit, endpoint);
    }

    /* compiled from: PlutoApiModule_ProvidePlutoRetrofitFactory.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/api/pluto/PlutoApiModule_ProvidePlutoRetrofitFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/api/pluto/PlutoApiModule_ProvidePlutoRetrofitFactory;", "retrofit", "Ljavax/inject/Provider;", "Lretrofit2/Retrofit;", "endpoint", "Lcom/robinhood/targetbackend/Endpoint;", "providePlutoRetrofit", "lib-api-pluto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PlutoApiModule_ProvidePlutoRetrofitFactory create(Provider<Retrofit> retrofit, Provider<Endpoint> endpoint) {
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            Intrinsics.checkNotNullParameter(endpoint, "endpoint");
            return new PlutoApiModule_ProvidePlutoRetrofitFactory(retrofit, endpoint);
        }

        @JvmStatic
        public final Retrofit providePlutoRetrofit(Retrofit retrofit, Endpoint endpoint) {
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            Intrinsics.checkNotNullParameter(endpoint, "endpoint");
            Object objCheckNotNull = Preconditions.checkNotNull(PlutoApiModule.INSTANCE.providePlutoRetrofit(retrofit, endpoint), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (Retrofit) objCheckNotNull;
        }
    }
}
