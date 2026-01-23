package microgram.android.service;

import com.robinhood.hammer.android.internal.LifecycleCoroutineScope;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import microgram.android.HostMessageDispatcher;
import microgram.android.extension.ServiceExtension;
import microgram.android.service.protocol.Peer3;
import microgram.android.service.protocol.ProtocolMessageSubscriber2;
import microgram.annotation.ManagedServices2;
import microgram.generator.IdGenerator;
import microgram.service.bridge.PeerClientBridge;

/* compiled from: ServiceLocator.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001BL\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0016\u001a\u0002H\u0017\"\b\b\u0000\u0010\u0017*\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00170\u0014H\u0016¢\u0006\u0002\u0010\u0019J%\u0010\u001a\u001a\u0002H\u0017\"\b\b\u0000\u0010\u0017*\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00170\u0014H\u0016¢\u0006\u0002\u0010\u0019J\u0014\u0010\u001b\u001a\u00020\u00152\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0014\u0012\u0004\u0012\u00020\u00150\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lmicrogram/android/service/RealServiceLocator;", "Lmicrogram/android/service/ServiceLocator;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "json", "Lkotlinx/serialization/json/Json;", "uuidGenerator", "Lmicrogram/generator/IdGenerator;", "Ljava/util/UUID;", "messageDispatcher", "Lmicrogram/android/HostMessageDispatcher;", "extensions", "", "", "Lmicrogram/android/extension/ServiceExtension;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lkotlinx/serialization/json/Json;Lmicrogram/generator/IdGenerator;Lmicrogram/android/HostMessageDispatcher;Ljava/util/Map;)V", "services", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/Class;", "", "getClient", "T", "contractInterface", "(Ljava/lang/Class;)Ljava/lang/Object;", "getHostImplementation", "createAdapter", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.android.service.RealServiceLocator, reason: use source file name */
/* loaded from: classes14.dex */
public final class ServiceLocator2 implements ServiceLocator {
    private final CoroutineScope coroutineScope;
    private final Map<String, ServiceExtension> extensions;
    private final Json json;
    private final HostMessageDispatcher messageDispatcher;
    private final ConcurrentHashMap<Class<?>, Object> services;
    private final IdGenerator<UUID> uuidGenerator;

    public ServiceLocator2(@LifecycleCoroutineScope CoroutineScope coroutineScope, Json json, IdGenerator<UUID> uuidGenerator, HostMessageDispatcher messageDispatcher, Map<String, ServiceExtension> extensions) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        this.coroutineScope = coroutineScope;
        this.json = json;
        this.uuidGenerator = uuidGenerator;
        this.messageDispatcher = messageDispatcher;
        this.extensions = extensions;
        this.services = new ConcurrentHashMap<>();
    }

    @Override // microgram.android.service.ServiceLocator
    public <T> T getClient(Class<T> contractInterface) {
        Intrinsics.checkNotNullParameter(contractInterface, "contractInterface");
        T t = (T) this.services.computeIfAbsent(contractInterface, new Function() { // from class: microgram.android.service.RealServiceLocator.getClient.1
            @Override // java.util.function.Function
            public final Object apply(Class<?> p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ServiceLocator2.this.createAdapter(p0);
            }
        });
        Intrinsics.checkNotNull(t, "null cannot be cast to non-null type T of microgram.android.service.RealServiceLocator.getClient");
        return t;
    }

    @Override // microgram.android.service.ServiceLocator
    public <T> T getHostImplementation(Class<T> contractInterface) {
        Intrinsics.checkNotNullParameter(contractInterface, "contractInterface");
        T t = (T) ((ServiceExtension) MapsKt.getValue(this.extensions, ManagedServiceMirror.INSTANCE.from(contractInterface).getContractAnnotation().serviceName())).getService();
        Intrinsics.checkNotNull(t, "null cannot be cast to non-null type T of microgram.android.service.RealServiceLocator.getHostImplementation");
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object createAdapter(Class<?> contractInterface) {
        ManagedServiceMirror managedServiceMirrorFrom = ManagedServiceMirror.INSTANCE.from(contractInterface);
        PeerClientBridge peerClientBridge = new PeerClientBridge(Peer3.peer(this.messageDispatcher, ManagedServices2.getImplementationTargetName(managedServiceMirrorFrom.getContractAnnotation()), this.json), this.uuidGenerator);
        Object objCreateClient = managedServiceMirrorFrom.createClient(peerClientBridge, this.json);
        this.messageDispatcher.registerMessageHandler(ManagedServices2.getClientTargetName(managedServiceMirrorFrom.getContractAnnotation()), ProtocolMessageSubscriber2.createMessageHandler(peerClientBridge, this.json, this.coroutineScope));
        return objCreateClient;
    }
}
