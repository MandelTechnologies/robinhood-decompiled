package com.robinhood.networking;

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
import okhttp3.Call;
import okhttp3.OkHttpClient;

/* compiled from: NetworkingModule_ProvideGenericOkHttpCallFactoryFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u001a\u0012\u0011\u0010\u0003\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0019\u0010\u0003\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/networking/NetworkingModule_ProvideGenericOkHttpCallFactoryFactory;", "Ldagger/internal/Factory;", "Lokhttp3/Call$Factory;", "client", "Ljavax/inject/Provider;", "Lokhttp3/OkHttpClient;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-networking_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class NetworkingModule_ProvideGenericOkHttpCallFactoryFactory implements Factory<Call.Factory> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<OkHttpClient> client;

    @JvmStatic
    public static final NetworkingModule_ProvideGenericOkHttpCallFactoryFactory create(Provider<OkHttpClient> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final Call.Factory provideGenericOkHttpCallFactory(Lazy<OkHttpClient> lazy) {
        return INSTANCE.provideGenericOkHttpCallFactory(lazy);
    }

    public NetworkingModule_ProvideGenericOkHttpCallFactoryFactory(Provider<OkHttpClient> client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
    }

    @Override // javax.inject.Provider
    public Call.Factory get() {
        Companion companion = INSTANCE;
        Lazy<OkHttpClient> lazy = DoubleCheck.lazy(this.client);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        return companion.provideGenericOkHttpCallFactory(lazy);
    }

    /* compiled from: NetworkingModule_ProvideGenericOkHttpCallFactoryFactory.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\u0007H\u0007J\u001b\u0010\n\u001a\u00020\u000b2\u0011\u0010\u0006\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\fH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/networking/NetworkingModule_ProvideGenericOkHttpCallFactoryFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/networking/NetworkingModule_ProvideGenericOkHttpCallFactoryFactory;", "client", "Ljavax/inject/Provider;", "Lokhttp3/OkHttpClient;", "Lkotlin/jvm/JvmSuppressWildcards;", "provideGenericOkHttpCallFactory", "Lokhttp3/Call$Factory;", "Ldagger/Lazy;", "lib-networking_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final NetworkingModule_ProvideGenericOkHttpCallFactoryFactory create(Provider<OkHttpClient> client) {
            Intrinsics.checkNotNullParameter(client, "client");
            return new NetworkingModule_ProvideGenericOkHttpCallFactoryFactory(client);
        }

        @JvmStatic
        public final Call.Factory provideGenericOkHttpCallFactory(Lazy<OkHttpClient> client) {
            Intrinsics.checkNotNullParameter(client, "client");
            Object objCheckNotNull = Preconditions.checkNotNull(NetworkingModule.INSTANCE.provideGenericOkHttpCallFactory(client), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (Call.Factory) objCheckNotNull;
        }
    }
}
