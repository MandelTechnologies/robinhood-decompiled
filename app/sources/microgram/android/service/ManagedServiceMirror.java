package microgram.android.service;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMapping;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.json.Json;
import microgram.annotation.ManagedServices;
import microgram.service.bridge.ClientBridge;
import microgram.service.protocol.ServiceCallable;

/* compiled from: ManagedServiceMirror.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 (*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001(B\u0017\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&¨\u0006)"}, m3636d2 = {"Lmicrogram/android/service/ManagedServiceMirror;", "", "I", "Ljava/lang/Class;", "contractInterface", "<init>", "(Ljava/lang/Class;)V", "Lmicrogram/service/bridge/ClientBridge;", "bridge", "Lkotlinx/serialization/json/Json;", "json", "createClient", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)Ljava/lang/Object;", "instance", "", "", "Lmicrogram/service/protocol/ServiceCallable;", "endpoints", "(Ljava/lang/Object;Lkotlinx/serialization/json/Json;)Ljava/util/Map;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/Class;", "getContractInterface", "()Ljava/lang/Class;", "Lmicrogram/annotation/Contract;", "contractAnnotation", "Lmicrogram/annotation/Contract;", "getContractAnnotation", "()Lmicrogram/annotation/Contract;", "Ljava/lang/reflect/Method;", "createClientMethod", "Ljava/lang/reflect/Method;", "endpointsMethod", "Companion", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class ManagedServiceMirror<I> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: cache, reason: collision with root package name */
    private static final ConcurrentHashMap<Class<?>, ManagedServiceMirror<?>> f10777cache = new ConcurrentHashMap<>();
    private final ManagedServices contractAnnotation;
    private final Class<I> contractInterface;
    private final Method createClientMethod;
    private final Method endpointsMethod;

    public /* synthetic */ ManagedServiceMirror(Class cls, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls);
    }

    private ManagedServiceMirror(Class<I> cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        this.contractInterface = cls;
        if (!cls.isInterface()) {
            throw new IllegalArgumentException(("Not an interface: " + cls).toString());
        }
        Annotation annotation = cls.getAnnotation(ManagedServices.class);
        if (annotation != null) {
            this.contractAnnotation = (ManagedServices) annotation;
            String strSingleIdentifier = ManagedServiceMirror2.singleIdentifier(cls);
            try {
                Package r2 = cls.getPackage();
                Intrinsics.checkNotNull(r2);
                Class<?> cls2 = Class.forName(r2.getName() + "." + strSingleIdentifier + "_AdapterKt");
                try {
                    Method declaredMethod = cls2.getDeclaredMethod("createClient_" + strSingleIdentifier, KClass.class, ClientBridge.class, Json.class);
                    Intrinsics.checkNotNull(declaredMethod);
                    this.createClientMethod = declaredMethod;
                    try {
                        Method declaredMethod2 = cls2.getDeclaredMethod("endpoints", cls, Json.class);
                        Intrinsics.checkNotNull(declaredMethod2);
                        this.endpointsMethod = declaredMethod2;
                        return;
                    } catch (NoSuchMethodException e) {
                        throw new IllegalStateException("Couldn't find generated endpoints function for managed service", e);
                    }
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException("Couldn't find generated client factory function for managed service", e2);
                }
            } catch (ClassNotFoundException e3) {
                throw new IllegalStateException("Couldn't find generated class for managed service", e3);
            }
        }
        throw new IllegalArgumentException(("Managed service interface was not annotated with `Contract`: " + cls).toString());
    }

    public final ManagedServices getContractAnnotation() {
        return this.contractAnnotation;
    }

    public final I createClient(ClientBridge bridge, Json json) {
        Intrinsics.checkNotNullParameter(bridge, "bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        I i = (I) this.createClientMethod.invoke(null, JvmClassMapping.getKotlinClass(this.contractInterface), bridge, json);
        Intrinsics.checkNotNull(i, "null cannot be cast to non-null type I of microgram.android.service.ManagedServiceMirror");
        return i;
    }

    public final Map<String, ServiceCallable> endpoints(I instance, Json json) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(json, "json");
        Object objInvoke = this.endpointsMethod.invoke(null, instance, json);
        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, microgram.service.protocol.ServiceCallable>");
        return (Map) objInvoke;
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ManagedServiceMirror) && Intrinsics.areEqual(((ManagedServiceMirror) other).contractInterface, this.contractInterface);
        }
        return true;
    }

    public int hashCode() {
        return this.contractInterface.hashCode();
    }

    public String toString() {
        return "ManagedServiceMirror(contractInterface=" + this.contractInterface + ")";
    }

    /* compiled from: ManagedServiceMirror.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\t0\u0007\"\b\b\u0001\u0010\t*\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u0006R\"\u0010\u0004\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lmicrogram/android/service/ManagedServiceMirror$Companion;", "", "<init>", "()V", "cache", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/Class;", "Lmicrogram/android/service/ManagedServiceMirror;", "from", "I", "contractInterface", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <I> ManagedServiceMirror<I> from(Class<I> contractInterface) {
            Object objPutIfAbsent;
            Intrinsics.checkNotNullParameter(contractInterface, "contractInterface");
            ConcurrentHashMap concurrentHashMap = ManagedServiceMirror.f10777cache;
            Object managedServiceMirror = concurrentHashMap.get(contractInterface);
            if (managedServiceMirror == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(contractInterface, (managedServiceMirror = new ManagedServiceMirror(contractInterface, null)))) != null) {
                managedServiceMirror = objPutIfAbsent;
            }
            Intrinsics.checkNotNull(managedServiceMirror, "null cannot be cast to non-null type microgram.android.service.ManagedServiceMirror<I of microgram.android.service.ManagedServiceMirror.Companion.from>");
            return (ManagedServiceMirror) managedServiceMirror;
        }
    }
}
