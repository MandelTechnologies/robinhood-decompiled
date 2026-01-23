package microgram.android.inject;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import microgram.android.HostMessageDispatcher;
import microgram.android.extension.ServiceExtension;
import microgram.android.service.ServiceLocator;

/* compiled from: MicrogramRuntimeModule_ProvideServiceExtensionsFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00062\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/android/inject/MicrogramRuntimeModule_ProvideServiceExtensionsFactory;", "Ldagger/internal/Factory;", "", "", "Lmicrogram/android/extension/ServiceExtension;", "Lkotlin/jvm/JvmSuppressWildcards;", "Companion", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class MicrogramRuntimeModule_ProvideServiceExtensionsFactory implements Factory<Map<String, ServiceExtension>> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    public static final Map<String, ServiceExtension> provideServiceExtensions(CoroutineScope coroutineScope, HostMessageDispatcher hostMessageDispatcher, ServiceLocator serviceLocator, Json json, Map<String, Provider<ServiceExtension>> map, Map<String, ServiceExtension.Factory> map2) {
        return INSTANCE.provideServiceExtensions(coroutineScope, hostMessageDispatcher, serviceLocator, json, map, map2);
    }

    /* compiled from: MicrogramRuntimeModule_ProvideServiceExtensionsFactory.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u001d\u0010\u0011\u001a\u0019\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\f¢\u0006\u0002\b\u00102\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00120\f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lmicrogram/android/inject/MicrogramRuntimeModule_ProvideServiceExtensionsFactory$Companion;", "", "<init>", "()V", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lmicrogram/android/HostMessageDispatcher;", "messageDispatcher", "Lmicrogram/android/service/ServiceLocator;", "serviceLocator", "Lkotlinx/serialization/json/Json;", "json", "", "", "Ljavax/inject/Provider;", "Lmicrogram/android/extension/ServiceExtension;", "Lkotlin/jvm/JvmSuppressWildcards;", "compileTimeExtensions", "Lmicrogram/android/extension/ServiceExtension$Factory;", "runtimeExtensions", "provideServiceExtensions", "(Lkotlinx/coroutines/CoroutineScope;Lmicrogram/android/HostMessageDispatcher;Lmicrogram/android/service/ServiceLocator;Lkotlinx/serialization/json/Json;Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Map<String, ServiceExtension> provideServiceExtensions(CoroutineScope coroutineScope, HostMessageDispatcher messageDispatcher, ServiceLocator serviceLocator, Json json, Map<String, Provider<ServiceExtension>> compileTimeExtensions, Map<String, ServiceExtension.Factory> runtimeExtensions) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
            Intrinsics.checkNotNullParameter(serviceLocator, "serviceLocator");
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(compileTimeExtensions, "compileTimeExtensions");
            Intrinsics.checkNotNullParameter(runtimeExtensions, "runtimeExtensions");
            Object objCheckNotNull = Preconditions.checkNotNull(MicrogramRuntimeModule.INSTANCE.provideServiceExtensions(coroutineScope, messageDispatcher, serviceLocator, json, compileTimeExtensions, runtimeExtensions), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (Map) objCheckNotNull;
        }
    }
}
