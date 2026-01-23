package microgram.android.extension;

import java.util.Iterator;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import microgram.android.HostMessageDispatcher;
import microgram.android.extension.ServiceExtension;
import microgram.android.service.ServiceLocator;

/* compiled from: BuildServiceExtensionMap.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001ab\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r0\u00012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u0001H\u0000¨\u0006\u0010"}, m3636d2 = {"buildServiceExtensionMap", "", "", "Lmicrogram/android/extension/ServiceExtension;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "messageDispatcher", "Lmicrogram/android/HostMessageDispatcher;", "serviceLocator", "Lmicrogram/android/service/ServiceLocator;", "json", "Lkotlinx/serialization/json/Json;", "compileTimeExtensions", "Ljavax/inject/Provider;", "runtimeExtensions", "Lmicrogram/android/extension/ServiceExtension$Factory;", "lib-microgram_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: microgram.android.extension.BuildServiceExtensionMapKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class BuildServiceExtensionMap {
    public static final Map<String, ServiceExtension> buildServiceExtensionMap(CoroutineScope coroutineScope, HostMessageDispatcher messageDispatcher, ServiceLocator serviceLocator, Json json, Map<String, ? extends Provider<ServiceExtension>> compileTimeExtensions, Map<String, ? extends ServiceExtension.Factory> runtimeExtensions) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
        Intrinsics.checkNotNullParameter(serviceLocator, "serviceLocator");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(compileTimeExtensions, "compileTimeExtensions");
        Intrinsics.checkNotNullParameter(runtimeExtensions, "runtimeExtensions");
        Map mapCreateMapBuilder = MapsKt.createMapBuilder(compileTimeExtensions.size() + runtimeExtensions.size());
        Iterator<T> it = compileTimeExtensions.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            mapCreateMapBuilder.put(entry.getKey(), ServiceExtension.INSTANCE.wrapping(new BuildServiceExtensionMap2((Provider) entry.getValue())));
        }
        Iterator<T> it2 = runtimeExtensions.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            mapCreateMapBuilder.put(entry2.getKey(), ((ServiceExtension.Factory) entry2.getValue()).createServiceExtension(coroutineScope, messageDispatcher, serviceLocator, json));
        }
        return MapsKt.build(mapCreateMapBuilder);
    }
}
