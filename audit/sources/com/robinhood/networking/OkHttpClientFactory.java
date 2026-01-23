package com.robinhood.networking;

import com.robinhood.networking.annotation.Apollo;
import com.robinhood.networking.annotation.FlipperOkhttp;
import com.robinhood.networking.annotation.MonitoringApplicationInterceptors;
import com.robinhood.networking.annotation.NetworkEventListenerFactory;
import com.robinhood.networking.annotation.NetworkFixtures;
import com.robinhood.networking.annotation.NetworkInterceptors;
import com.robinhood.networking.annotation.ReadOnlyTokenEnforcement;
import com.robinhood.networking.annotation.Uat;
import com.robinhood.networking.annotation.UiTestInterceptor;
import com.robinhood.networking.interceptor.CacheDeborkifier;
import com.robinhood.networking.interceptor.TimeoutOverrideInterceptor;
import com.robinhood.networking.util.OkHttpClients;
import dagger.Lazy;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Cache;
import okhttp3.CertificatePinner;
import okhttp3.ConnectionPool;
import okhttp3.ConnectionSpec;
import okhttp3.Dispatcher;
import okhttp3.Dns;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* compiled from: OkHttpClientFactory.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B¿\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0014\b\u0001\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f0\u0007\u0012\u0014\b\u0001\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f0\u0007\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ,\u0010\u001d\u001a\u00020\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010!\u001a\u00020\"2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/networking/OkHttpClientFactory;", "", "dns", "Lokhttp3/Dns;", "dispatcher", "Lokhttp3/Dispatcher;", "certificatePinner", "Ldagger/Lazy;", "Lokhttp3/CertificatePinner;", "connectionPool", "Lokhttp3/ConnectionPool;", "connectionSpecs", "", "Lokhttp3/ConnectionSpec;", "timeoutOverrideInterceptor", "Lcom/robinhood/networking/interceptor/TimeoutOverrideInterceptor;", "apolloHeaderInterceptor", "Lokhttp3/Interceptor;", "monitoringApplicationInterceptors", "networkInterceptors", "flipperOkhttpInterceptor", "networkFixturesInterceptor", "readOnlyTokenEnforcementInterceptor", "uatInterceptor", "apolloInterceptor", "eventListenerFactory", "Lokhttp3/EventListener$Factory;", "<init>", "(Lokhttp3/Dns;Lokhttp3/Dispatcher;Ldagger/Lazy;Lokhttp3/ConnectionPool;Ldagger/Lazy;Lcom/robinhood/networking/interceptor/TimeoutOverrideInterceptor;Lokhttp3/Interceptor;Ldagger/Lazy;Ldagger/Lazy;Lokhttp3/Interceptor;Lokhttp3/Interceptor;Lokhttp3/Interceptor;Lokhttp3/Interceptor;Lokhttp3/Interceptor;Lokhttp3/EventListener$Factory;)V", "newClient", "Lokhttp3/OkHttpClient;", "cache", "Lokhttp3/Cache;", "enableMonitoring", "", "terminalApplicationInterceptors", "lib-networking_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes19.dex */
public final class OkHttpClientFactory {
    private final Interceptor apolloHeaderInterceptor;
    private final Interceptor apolloInterceptor;
    private final Lazy<CertificatePinner> certificatePinner;
    private final ConnectionPool connectionPool;
    private final Lazy<List<ConnectionSpec>> connectionSpecs;
    private final Dispatcher dispatcher;
    private final Dns dns;
    private final EventListener.Factory eventListenerFactory;
    private final Interceptor flipperOkhttpInterceptor;
    private final Lazy<List<Interceptor>> monitoringApplicationInterceptors;
    private final Interceptor networkFixturesInterceptor;
    private final Lazy<List<Interceptor>> networkInterceptors;
    private final Interceptor readOnlyTokenEnforcementInterceptor;
    private final TimeoutOverrideInterceptor timeoutOverrideInterceptor;
    private final Interceptor uatInterceptor;

    public final OkHttpClient newClient(Cache cache2, boolean enableMonitoring, List<? extends Interceptor> terminalApplicationInterceptors) {
        Intrinsics.checkNotNullParameter(terminalApplicationInterceptors, "terminalApplicationInterceptors");
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectionPool(this.connectionPool);
        List<ConnectionSpec> list = this.connectionSpecs.get();
        Intrinsics.checkNotNullExpressionValue(list, "get(...)");
        builder.connectionSpecs(list);
        CertificatePinner certificatePinner = this.certificatePinner.get();
        Intrinsics.checkNotNullExpressionValue(certificatePinner, "get(...)");
        builder.certificatePinner(certificatePinner);
        builder.dns(this.dns);
        builder.dispatcher(this.dispatcher);
        builder.followRedirects(false);
        builder.eventListenerFactory(this.eventListenerFactory);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builder.readTimeout(60L, timeUnit);
        builder.writeTimeout(60L, timeUnit);
        builder.connectTimeout(60L, timeUnit);
        builder.addInterceptor(this.uatInterceptor);
        builder.addInterceptor(this.apolloInterceptor);
        builder.addInterceptor(this.readOnlyTokenEnforcementInterceptor);
        builder.addInterceptor(this.networkFixturesInterceptor);
        Interceptor interceptor = this.apolloHeaderInterceptor;
        if (interceptor != null) {
            builder.addInterceptor(interceptor);
        }
        if (enableMonitoring) {
            List<Interceptor> list2 = this.monitoringApplicationInterceptors.get();
            Intrinsics.checkNotNullExpressionValue(list2, "get(...)");
            OkHttpClients.addInterceptors(builder, list2);
        }
        builder.addInterceptor(this.timeoutOverrideInterceptor);
        OkHttpClients.addInterceptors(builder, terminalApplicationInterceptors);
        if (cache2 != null) {
            builder.cache(cache2);
            builder.addInterceptor(new CacheDeborkifier(cache2));
        }
        builder.addInterceptor(this.flipperOkhttpInterceptor);
        List<Interceptor> list3 = this.networkInterceptors.get();
        Intrinsics.checkNotNullExpressionValue(list3, "get(...)");
        OkHttpClients.addNetworkInterceptors(builder, list3);
        return builder.build();
    }

    public OkHttpClientFactory(Dns dns, Dispatcher dispatcher, Lazy<CertificatePinner> certificatePinner, ConnectionPool connectionPool, Lazy<List<ConnectionSpec>> connectionSpecs, TimeoutOverrideInterceptor timeoutOverrideInterceptor, @UiTestInterceptor Interceptor interceptor, @MonitoringApplicationInterceptors Lazy<List<Interceptor>> monitoringApplicationInterceptors, @NetworkInterceptors Lazy<List<Interceptor>> networkInterceptors, @FlipperOkhttp Interceptor flipperOkhttpInterceptor, @NetworkFixtures Interceptor networkFixturesInterceptor, @ReadOnlyTokenEnforcement Interceptor readOnlyTokenEnforcementInterceptor, @Uat Interceptor uatInterceptor, @Apollo Interceptor apolloInterceptor, @NetworkEventListenerFactory EventListener.Factory eventListenerFactory) {
        Intrinsics.checkNotNullParameter(dns, "dns");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(certificatePinner, "certificatePinner");
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(timeoutOverrideInterceptor, "timeoutOverrideInterceptor");
        Intrinsics.checkNotNullParameter(monitoringApplicationInterceptors, "monitoringApplicationInterceptors");
        Intrinsics.checkNotNullParameter(networkInterceptors, "networkInterceptors");
        Intrinsics.checkNotNullParameter(flipperOkhttpInterceptor, "flipperOkhttpInterceptor");
        Intrinsics.checkNotNullParameter(networkFixturesInterceptor, "networkFixturesInterceptor");
        Intrinsics.checkNotNullParameter(readOnlyTokenEnforcementInterceptor, "readOnlyTokenEnforcementInterceptor");
        Intrinsics.checkNotNullParameter(uatInterceptor, "uatInterceptor");
        Intrinsics.checkNotNullParameter(apolloInterceptor, "apolloInterceptor");
        Intrinsics.checkNotNullParameter(eventListenerFactory, "eventListenerFactory");
        this.dns = dns;
        this.dispatcher = dispatcher;
        this.certificatePinner = certificatePinner;
        this.connectionPool = connectionPool;
        this.connectionSpecs = connectionSpecs;
        this.timeoutOverrideInterceptor = timeoutOverrideInterceptor;
        this.apolloHeaderInterceptor = interceptor;
        this.monitoringApplicationInterceptors = monitoringApplicationInterceptors;
        this.networkInterceptors = networkInterceptors;
        this.flipperOkhttpInterceptor = flipperOkhttpInterceptor;
        this.networkFixturesInterceptor = networkFixturesInterceptor;
        this.readOnlyTokenEnforcementInterceptor = readOnlyTokenEnforcementInterceptor;
        this.uatInterceptor = uatInterceptor;
        this.apolloInterceptor = apolloInterceptor;
        this.eventListenerFactory = eventListenerFactory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OkHttpClient newClient$default(OkHttpClientFactory okHttpClientFactory, Cache cache2, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            cache2 = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        return okHttpClientFactory.newClient(cache2, z, list);
    }
}
