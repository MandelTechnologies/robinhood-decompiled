package com.robinhood.librobinhood.data.store.fee;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import crypto.fee_tier.proto.p434v1.CryptoFeeTierInfoManagedService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import microgram.android.HostMessageDispatcher;
import microgram.android.extension.ServiceExtension;

/* compiled from: CryptoFeeTierInfoManagedServiceImpl_Provisions_ProvideServiceExtensionFactory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierInfoManagedServiceImpl_Provisions_ProvideServiceExtensionFactory;", "Ldagger/internal/Factory;", "Lmicrogram/android/extension/ServiceExtension;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "messageDispatcher", "Lmicrogram/android/HostMessageDispatcher;", "json", "Lkotlinx/serialization/json/Json;", "service", "Lcrypto/fee_tier/proto/v1/CryptoFeeTierInfoManagedService;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.fee.CryptoFeeTierInfoManagedServiceImpl_Provisions_ProvideServiceExtensionFactory */
/* loaded from: classes13.dex */
public final class C34807x6c88098c implements Factory<ServiceExtension> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<CoroutineScope> coroutineScope;
    private final Provider<Json> json;
    private final Provider<HostMessageDispatcher> messageDispatcher;
    private final Provider<CryptoFeeTierInfoManagedService> service;

    @JvmStatic
    public static final C34807x6c88098c create(Provider<CoroutineScope> provider, Provider<HostMessageDispatcher> provider2, Provider<Json> provider3, Provider<CryptoFeeTierInfoManagedService> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final ServiceExtension provideServiceExtension(CoroutineScope coroutineScope, HostMessageDispatcher hostMessageDispatcher, Json json, CryptoFeeTierInfoManagedService cryptoFeeTierInfoManagedService) {
        return INSTANCE.provideServiceExtension(coroutineScope, hostMessageDispatcher, json, cryptoFeeTierInfoManagedService);
    }

    public C34807x6c88098c(Provider<CoroutineScope> coroutineScope, Provider<HostMessageDispatcher> messageDispatcher, Provider<Json> json, Provider<CryptoFeeTierInfoManagedService> service) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(service, "service");
        this.coroutineScope = coroutineScope;
        this.messageDispatcher = messageDispatcher;
        this.json = json;
        this.service = service;
    }

    @Override // javax.inject.Provider
    public ServiceExtension get() {
        Companion companion = INSTANCE;
        CoroutineScope coroutineScope = this.coroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        HostMessageDispatcher hostMessageDispatcher = this.messageDispatcher.get();
        Intrinsics.checkNotNullExpressionValue(hostMessageDispatcher, "get(...)");
        Json json = this.json.get();
        Intrinsics.checkNotNullExpressionValue(json, "get(...)");
        CryptoFeeTierInfoManagedService cryptoFeeTierInfoManagedService = this.service.get();
        Intrinsics.checkNotNullExpressionValue(cryptoFeeTierInfoManagedService, "get(...)");
        return companion.provideServiceExtension(coroutineScope, hostMessageDispatcher, json, cryptoFeeTierInfoManagedService);
    }

    /* compiled from: CryptoFeeTierInfoManagedServiceImpl_Provisions_ProvideServiceExtensionFactory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierInfoManagedServiceImpl_Provisions_ProvideServiceExtensionFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierInfoManagedServiceImpl_Provisions_ProvideServiceExtensionFactory;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "messageDispatcher", "Lmicrogram/android/HostMessageDispatcher;", "json", "Lkotlinx/serialization/json/Json;", "service", "Lcrypto/fee_tier/proto/v1/CryptoFeeTierInfoManagedService;", "provideServiceExtension", "Lmicrogram/android/extension/ServiceExtension;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.fee.CryptoFeeTierInfoManagedServiceImpl_Provisions_ProvideServiceExtensionFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C34807x6c88098c create(Provider<CoroutineScope> coroutineScope, Provider<HostMessageDispatcher> messageDispatcher, Provider<Json> json, Provider<CryptoFeeTierInfoManagedService> service) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(service, "service");
            return new C34807x6c88098c(coroutineScope, messageDispatcher, json, service);
        }

        @JvmStatic
        public final ServiceExtension provideServiceExtension(CoroutineScope coroutineScope, HostMessageDispatcher messageDispatcher, Json json, CryptoFeeTierInfoManagedService service) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(service, "service");
            Object objCheckNotNull = Preconditions.checkNotNull(CryptoFeeTierInfoManagedServiceImpl_Hammer2.INSTANCE.provideServiceExtension(coroutineScope, messageDispatcher, json, service), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (ServiceExtension) objCheckNotNull;
        }
    }
}
