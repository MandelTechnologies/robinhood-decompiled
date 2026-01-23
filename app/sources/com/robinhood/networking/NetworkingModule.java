package com.robinhood.networking;

import com.robinhood.android.regiongate.RegionGateInterceptor;
import com.robinhood.networking.annotation.NetworkEventListenerFactory;
import com.robinhood.networking.util.OkHttpClients;
import com.robinhood.networking.util.RhDns;
import com.robinhood.utils.dagger.annotation.CacheDirectory;
import dagger.Lazy;
import io.bitdrift.capture.network.okhttp.CaptureOkHttpEventListenerFactory;
import java.io.File;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.ConnectionPool;
import okhttp3.Dispatcher;
import okhttp3.Dns;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import timber.log.Timber;

/* compiled from: NetworkingModule.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0016\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u001bH\u0007J\b\u0010\u001c\u001a\u00020\u001dH\u0007¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/networking/NetworkingModule;", "", "<init>", "()V", "provideOkHttpCache", "Lokhttp3/Cache;", "cacheDirectory", "Ljava/io/File;", "provideOkHttpDispatcher", "Lokhttp3/Dispatcher;", "provideOkHttpConnectionPool", "Lokhttp3/ConnectionPool;", "provideOkHttpDns", "Lokhttp3/Dns;", "provideLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "logLevel", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "provideGenericOkHttpClient", "Lokhttp3/OkHttpClient;", "factory", "Lcom/robinhood/networking/OkHttpClientFactory;", "regionGateInterceptor", "Lcom/robinhood/android/regiongate/RegionGateInterceptor;", "provideGenericOkHttpCallFactory", "Lokhttp3/Call$Factory;", "client", "Ldagger/Lazy;", "provideOkhttpEventListenerFactory", "Lokhttp3/EventListener$Factory;", "lib-networking_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes19.dex */
public final class NetworkingModule {
    public static final NetworkingModule INSTANCE = new NetworkingModule();

    private NetworkingModule() {
    }

    public final Cache provideOkHttpCache(@CacheDirectory File cacheDirectory) {
        Intrinsics.checkNotNullParameter(cacheDirectory, "cacheDirectory");
        return new Cache(new File(cacheDirectory, "http"), 5242880L);
    }

    public final Dispatcher provideOkHttpDispatcher() {
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.setMaxRequests(128);
        dispatcher.setMaxRequestsPerHost(20);
        return dispatcher;
    }

    public final ConnectionPool provideOkHttpConnectionPool() {
        return new ConnectionPool();
    }

    public final Dns provideOkHttpDns() {
        return RhDns.INSTANCE;
    }

    public final HttpLoggingInterceptor provideLoggingInterceptor(HttpLoggingInterceptor.Level logLevel) {
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() { // from class: com.robinhood.networking.NetworkingModule.provideLoggingInterceptor.1
            @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
            public final void log(String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                Timber.INSTANCE.tag("HttpLoggingInterceptor").mo3356i(message, new Object[0]);
            }
        });
        httpLoggingInterceptor.level(logLevel);
        return httpLoggingInterceptor;
    }

    public final OkHttpClient provideGenericOkHttpClient(OkHttpClientFactory factory, RegionGateInterceptor regionGateInterceptor) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(regionGateInterceptor, "regionGateInterceptor");
        return OkHttpClientFactory.newClient$default(factory, null, false, CollectionsKt.listOf(regionGateInterceptor), 3, null);
    }

    public final Call.Factory provideGenericOkHttpCallFactory(Lazy<OkHttpClient> client) {
        Intrinsics.checkNotNullParameter(client, "client");
        return OkHttpClients.asCallFactory(client);
    }

    @NetworkEventListenerFactory
    public final EventListener.Factory provideOkhttpEventListenerFactory() {
        return new CaptureOkHttpEventListenerFactory();
    }
}
