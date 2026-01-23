package microgram.android.service;

import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.JvmClassMapping;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import microgram.android.HostMessageDispatcher;
import microgram.android.extension.ServiceExtension;

/* compiled from: ManagedServiceExtension.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005*\b\u0012\u0004\u0012\u0002H\u00040\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H\u00040\bH\u0086\u0004\u001a6\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005*\b\u0012\u0004\u0012\u0002H\u00040\u00062\u0006\u0010\u000b\u001a\u0002H\u0004H\u0086\u0004¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"providedWith", "Lkotlin/Pair;", "", "Lmicrogram/android/extension/ServiceExtension$Factory;", "I", "", "Lkotlin/reflect/KClass;", "factory", "Lkotlin/Function1;", "Lmicrogram/android/service/ServiceLocator;", "providedBy", "implementation", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Lkotlin/Pair;", "lib-microgram_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.android.service.ManagedServiceExtensionKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class ManagedServiceExtension2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Object providedBy$lambda$0(Object obj, ServiceLocator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return obj;
    }

    public static final <I> Tuples2<String, ServiceExtension.Factory> providedWith(KClass<I> kClass, final Function1<? super ServiceLocator, ? extends I> factory) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Intrinsics.checkNotNullParameter(factory, "factory");
        final ManagedServiceMirror<I> managedServiceMirrorFrom = ManagedServiceMirror.INSTANCE.from(JvmClassMapping.getJavaClass(kClass));
        return Tuples4.m3642to(managedServiceMirrorFrom.getContractAnnotation().serviceName(), new ServiceExtension.Factory() { // from class: microgram.android.service.ManagedServiceExtensionKt.providedWith.1
            @Override // microgram.android.extension.ServiceExtension.Factory
            public final ServiceExtension createServiceExtension(CoroutineScope scope, HostMessageDispatcher dispatcher, ServiceLocator locator, Json json) {
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
                Intrinsics.checkNotNullParameter(locator, "locator");
                Intrinsics.checkNotNullParameter(json, "json");
                Object objInvoke = factory.invoke(locator);
                return new ManagedServiceExtension(scope, dispatcher, managedServiceMirrorFrom.getContractAnnotation(), managedServiceMirrorFrom.endpoints(objInvoke, json), json, objInvoke);
            }
        });
    }

    public static final <I> Tuples2<String, ServiceExtension.Factory> providedBy(KClass<I> kClass, final I implementation) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Intrinsics.checkNotNullParameter(implementation, "implementation");
        return providedWith(kClass, new Function1() { // from class: microgram.android.service.ManagedServiceExtensionKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ManagedServiceExtension2.providedBy$lambda$0(implementation, (ServiceLocator) obj);
            }
        });
    }
}
