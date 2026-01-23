package com.robinhood.networking;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.networking.interceptor.TimeoutOverrideInterceptor;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import java.util.List;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.CertificatePinner;
import okhttp3.ConnectionPool;
import okhttp3.ConnectionSpec;
import okhttp3.Dispatcher;
import okhttp3.Dns;
import okhttp3.EventListener;
import okhttp3.Interceptor;

/* compiled from: OkHttpClientFactory_Factory.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u0081\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0011\u0010\b\u001a\r\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n0\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u0012\u0017\u0010\r\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\n0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0004\u0012\u0017\u0010\u0014\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00130\u000e¢\u0006\u0002\b\n0\u0004\u0012\u0017\u0010\u0015\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00130\u000e¢\u0006\u0002\b\n0\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u001f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\r\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\r\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\n0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0014\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00130\u000e¢\u0006\u0002\b\n0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0015\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00130\u000e¢\u0006\u0002\b\n0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/robinhood/networking/OkHttpClientFactory_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/networking/OkHttpClientFactory;", "dns", "Ljavax/inject/Provider;", "Lokhttp3/Dns;", "dispatcher", "Lokhttp3/Dispatcher;", "certificatePinner", "Lokhttp3/CertificatePinner;", "Lkotlin/jvm/JvmSuppressWildcards;", "connectionPool", "Lokhttp3/ConnectionPool;", "connectionSpecs", "", "Lokhttp3/ConnectionSpec;", "timeoutOverrideInterceptor", "Lcom/robinhood/networking/interceptor/TimeoutOverrideInterceptor;", "apolloHeaderInterceptor", "Lokhttp3/Interceptor;", "monitoringApplicationInterceptors", "networkInterceptors", "flipperOkhttpInterceptor", "networkFixturesInterceptor", "readOnlyTokenEnforcementInterceptor", "uatInterceptor", "apolloInterceptor", "eventListenerFactory", "Lokhttp3/EventListener$Factory;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-networking_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class OkHttpClientFactory_Factory implements Factory<OkHttpClientFactory> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Interceptor> apolloHeaderInterceptor;
    private final Provider<Interceptor> apolloInterceptor;
    private final Provider<CertificatePinner> certificatePinner;
    private final Provider<ConnectionPool> connectionPool;
    private final Provider<List<ConnectionSpec>> connectionSpecs;
    private final Provider<Dispatcher> dispatcher;
    private final Provider<Dns> dns;
    private final Provider<EventListener.Factory> eventListenerFactory;
    private final Provider<Interceptor> flipperOkhttpInterceptor;
    private final Provider<List<Interceptor>> monitoringApplicationInterceptors;
    private final Provider<Interceptor> networkFixturesInterceptor;
    private final Provider<List<Interceptor>> networkInterceptors;
    private final Provider<Interceptor> readOnlyTokenEnforcementInterceptor;
    private final Provider<TimeoutOverrideInterceptor> timeoutOverrideInterceptor;
    private final Provider<Interceptor> uatInterceptor;

    @JvmStatic
    public static final OkHttpClientFactory_Factory create(Provider<Dns> provider, Provider<Dispatcher> provider2, Provider<CertificatePinner> provider3, Provider<ConnectionPool> provider4, Provider<List<ConnectionSpec>> provider5, Provider<TimeoutOverrideInterceptor> provider6, Provider<Interceptor> provider7, Provider<List<Interceptor>> provider8, Provider<List<Interceptor>> provider9, Provider<Interceptor> provider10, Provider<Interceptor> provider11, Provider<Interceptor> provider12, Provider<Interceptor> provider13, Provider<Interceptor> provider14, Provider<EventListener.Factory> provider15) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15);
    }

    @JvmStatic
    public static final OkHttpClientFactory newInstance(Dns dns, Dispatcher dispatcher, Lazy<CertificatePinner> lazy, ConnectionPool connectionPool, Lazy<List<ConnectionSpec>> lazy2, TimeoutOverrideInterceptor timeoutOverrideInterceptor, Interceptor interceptor, Lazy<List<Interceptor>> lazy3, Lazy<List<Interceptor>> lazy4, Interceptor interceptor2, Interceptor interceptor3, Interceptor interceptor4, Interceptor interceptor5, Interceptor interceptor6, EventListener.Factory factory) {
        return INSTANCE.newInstance(dns, dispatcher, lazy, connectionPool, lazy2, timeoutOverrideInterceptor, interceptor, lazy3, lazy4, interceptor2, interceptor3, interceptor4, interceptor5, interceptor6, factory);
    }

    public OkHttpClientFactory_Factory(Provider<Dns> dns, Provider<Dispatcher> dispatcher, Provider<CertificatePinner> certificatePinner, Provider<ConnectionPool> connectionPool, Provider<List<ConnectionSpec>> connectionSpecs, Provider<TimeoutOverrideInterceptor> timeoutOverrideInterceptor, Provider<Interceptor> apolloHeaderInterceptor, Provider<List<Interceptor>> monitoringApplicationInterceptors, Provider<List<Interceptor>> networkInterceptors, Provider<Interceptor> flipperOkhttpInterceptor, Provider<Interceptor> networkFixturesInterceptor, Provider<Interceptor> readOnlyTokenEnforcementInterceptor, Provider<Interceptor> uatInterceptor, Provider<Interceptor> apolloInterceptor, Provider<EventListener.Factory> eventListenerFactory) {
        Intrinsics.checkNotNullParameter(dns, "dns");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(certificatePinner, "certificatePinner");
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(timeoutOverrideInterceptor, "timeoutOverrideInterceptor");
        Intrinsics.checkNotNullParameter(apolloHeaderInterceptor, "apolloHeaderInterceptor");
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
        this.apolloHeaderInterceptor = apolloHeaderInterceptor;
        this.monitoringApplicationInterceptors = monitoringApplicationInterceptors;
        this.networkInterceptors = networkInterceptors;
        this.flipperOkhttpInterceptor = flipperOkhttpInterceptor;
        this.networkFixturesInterceptor = networkFixturesInterceptor;
        this.readOnlyTokenEnforcementInterceptor = readOnlyTokenEnforcementInterceptor;
        this.uatInterceptor = uatInterceptor;
        this.apolloInterceptor = apolloInterceptor;
        this.eventListenerFactory = eventListenerFactory;
    }

    @Override // javax.inject.Provider
    public OkHttpClientFactory get() {
        Companion companion = INSTANCE;
        Dns dns = this.dns.get();
        Intrinsics.checkNotNullExpressionValue(dns, "get(...)");
        Dispatcher dispatcher = this.dispatcher.get();
        Intrinsics.checkNotNullExpressionValue(dispatcher, "get(...)");
        Lazy<CertificatePinner> lazy = DoubleCheck.lazy(this.certificatePinner);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        ConnectionPool connectionPool = this.connectionPool.get();
        Intrinsics.checkNotNullExpressionValue(connectionPool, "get(...)");
        Lazy<List<ConnectionSpec>> lazy2 = DoubleCheck.lazy(this.connectionSpecs);
        Intrinsics.checkNotNullExpressionValue(lazy2, "lazy(...)");
        TimeoutOverrideInterceptor timeoutOverrideInterceptor = this.timeoutOverrideInterceptor.get();
        Intrinsics.checkNotNullExpressionValue(timeoutOverrideInterceptor, "get(...)");
        Interceptor interceptor = this.apolloHeaderInterceptor.get();
        Lazy<List<Interceptor>> lazy3 = DoubleCheck.lazy(this.monitoringApplicationInterceptors);
        Intrinsics.checkNotNullExpressionValue(lazy3, "lazy(...)");
        Lazy<List<Interceptor>> lazy4 = DoubleCheck.lazy(this.networkInterceptors);
        Intrinsics.checkNotNullExpressionValue(lazy4, "lazy(...)");
        Interceptor interceptor2 = this.flipperOkhttpInterceptor.get();
        Intrinsics.checkNotNullExpressionValue(interceptor2, "get(...)");
        Interceptor interceptor3 = this.networkFixturesInterceptor.get();
        Intrinsics.checkNotNullExpressionValue(interceptor3, "get(...)");
        Interceptor interceptor4 = this.readOnlyTokenEnforcementInterceptor.get();
        Intrinsics.checkNotNullExpressionValue(interceptor4, "get(...)");
        Interceptor interceptor5 = this.uatInterceptor.get();
        Intrinsics.checkNotNullExpressionValue(interceptor5, "get(...)");
        Interceptor interceptor6 = this.apolloInterceptor.get();
        Intrinsics.checkNotNullExpressionValue(interceptor6, "get(...)");
        Interceptor interceptor7 = interceptor6;
        EventListener.Factory factory = this.eventListenerFactory.get();
        Intrinsics.checkNotNullExpressionValue(factory, "get(...)");
        return companion.newInstance(dns, dispatcher, lazy, connectionPool, lazy2, timeoutOverrideInterceptor, interceptor, lazy3, lazy4, interceptor2, interceptor3, interceptor4, interceptor5, interceptor7, factory);
    }

    /* compiled from: OkHttpClientFactory_Factory.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0082\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0011\u0010\u000b\u001a\r\u0012\t\u0012\u00070\f¢\u0006\u0002\b\r0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0017\u0010\u0010\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0002\b\r0\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00072\u0017\u0010\u0017\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00160\u0011¢\u0006\u0002\b\r0\u00072\u0017\u0010\u0018\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00160\u0011¢\u0006\u0002\b\r0\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0007H\u0007JÀ\u0001\u0010 \u001a\u00020!2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0011\u0010\u000b\u001a\r\u0012\t\u0012\u00070\f¢\u0006\u0002\b\r0\"2\u0006\u0010\u000e\u001a\u00020\u000f2\u0017\u0010\u0010\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0002\b\r0\"2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0017\u0010\u0017\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00160\u0011¢\u0006\u0002\b\r0\"2\u0017\u0010\u0018\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00160\u0011¢\u0006\u0002\b\r0\"2\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0007¨\u0006#"}, m3636d2 = {"Lcom/robinhood/networking/OkHttpClientFactory_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/networking/OkHttpClientFactory_Factory;", "dns", "Ljavax/inject/Provider;", "Lokhttp3/Dns;", "dispatcher", "Lokhttp3/Dispatcher;", "certificatePinner", "Lokhttp3/CertificatePinner;", "Lkotlin/jvm/JvmSuppressWildcards;", "connectionPool", "Lokhttp3/ConnectionPool;", "connectionSpecs", "", "Lokhttp3/ConnectionSpec;", "timeoutOverrideInterceptor", "Lcom/robinhood/networking/interceptor/TimeoutOverrideInterceptor;", "apolloHeaderInterceptor", "Lokhttp3/Interceptor;", "monitoringApplicationInterceptors", "networkInterceptors", "flipperOkhttpInterceptor", "networkFixturesInterceptor", "readOnlyTokenEnforcementInterceptor", "uatInterceptor", "apolloInterceptor", "eventListenerFactory", "Lokhttp3/EventListener$Factory;", "newInstance", "Lcom/robinhood/networking/OkHttpClientFactory;", "Ldagger/Lazy;", "lib-networking_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OkHttpClientFactory_Factory create(Provider<Dns> dns, Provider<Dispatcher> dispatcher, Provider<CertificatePinner> certificatePinner, Provider<ConnectionPool> connectionPool, Provider<List<ConnectionSpec>> connectionSpecs, Provider<TimeoutOverrideInterceptor> timeoutOverrideInterceptor, Provider<Interceptor> apolloHeaderInterceptor, Provider<List<Interceptor>> monitoringApplicationInterceptors, Provider<List<Interceptor>> networkInterceptors, Provider<Interceptor> flipperOkhttpInterceptor, Provider<Interceptor> networkFixturesInterceptor, Provider<Interceptor> readOnlyTokenEnforcementInterceptor, Provider<Interceptor> uatInterceptor, Provider<Interceptor> apolloInterceptor, Provider<EventListener.Factory> eventListenerFactory) {
            Intrinsics.checkNotNullParameter(dns, "dns");
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(certificatePinner, "certificatePinner");
            Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
            Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
            Intrinsics.checkNotNullParameter(timeoutOverrideInterceptor, "timeoutOverrideInterceptor");
            Intrinsics.checkNotNullParameter(apolloHeaderInterceptor, "apolloHeaderInterceptor");
            Intrinsics.checkNotNullParameter(monitoringApplicationInterceptors, "monitoringApplicationInterceptors");
            Intrinsics.checkNotNullParameter(networkInterceptors, "networkInterceptors");
            Intrinsics.checkNotNullParameter(flipperOkhttpInterceptor, "flipperOkhttpInterceptor");
            Intrinsics.checkNotNullParameter(networkFixturesInterceptor, "networkFixturesInterceptor");
            Intrinsics.checkNotNullParameter(readOnlyTokenEnforcementInterceptor, "readOnlyTokenEnforcementInterceptor");
            Intrinsics.checkNotNullParameter(uatInterceptor, "uatInterceptor");
            Intrinsics.checkNotNullParameter(apolloInterceptor, "apolloInterceptor");
            Intrinsics.checkNotNullParameter(eventListenerFactory, "eventListenerFactory");
            return new OkHttpClientFactory_Factory(dns, dispatcher, certificatePinner, connectionPool, connectionSpecs, timeoutOverrideInterceptor, apolloHeaderInterceptor, monitoringApplicationInterceptors, networkInterceptors, flipperOkhttpInterceptor, networkFixturesInterceptor, readOnlyTokenEnforcementInterceptor, uatInterceptor, apolloInterceptor, eventListenerFactory);
        }

        @JvmStatic
        public final OkHttpClientFactory newInstance(Dns dns, Dispatcher dispatcher, Lazy<CertificatePinner> certificatePinner, ConnectionPool connectionPool, Lazy<List<ConnectionSpec>> connectionSpecs, TimeoutOverrideInterceptor timeoutOverrideInterceptor, Interceptor apolloHeaderInterceptor, Lazy<List<Interceptor>> monitoringApplicationInterceptors, Lazy<List<Interceptor>> networkInterceptors, Interceptor flipperOkhttpInterceptor, Interceptor networkFixturesInterceptor, Interceptor readOnlyTokenEnforcementInterceptor, Interceptor uatInterceptor, Interceptor apolloInterceptor, EventListener.Factory eventListenerFactory) {
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
            return new OkHttpClientFactory(dns, dispatcher, certificatePinner, connectionPool, connectionSpecs, timeoutOverrideInterceptor, apolloHeaderInterceptor, monitoringApplicationInterceptors, networkInterceptors, flipperOkhttpInterceptor, networkFixturesInterceptor, readOnlyTokenEnforcementInterceptor, uatInterceptor, apolloInterceptor, eventListenerFactory);
        }
    }
}
