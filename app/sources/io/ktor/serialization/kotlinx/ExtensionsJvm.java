package io.ktor.serialization.kotlinx;

import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExtensionsJvm.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"providers", "", "Lio/ktor/serialization/kotlinx/KotlinxSerializationExtensionProvider;", "getProviders", "()Ljava/util/List;", "ktor-serialization-kotlinx"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.serialization.kotlinx.ExtensionsJvmKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class ExtensionsJvm {
    private static final List<KotlinxSerializationExtensionProvider> providers;

    public static final List<KotlinxSerializationExtensionProvider> getProviders() {
        return providers;
    }

    static {
        ServiceLoader serviceLoaderLoad = ServiceLoader.load(KotlinxSerializationExtensionProvider.class, KotlinxSerializationExtensionProvider.class.getClassLoader());
        Intrinsics.checkNotNullExpressionValue(serviceLoaderLoad, "load(it, it.classLoader)");
        providers = CollectionsKt.toList(serviceLoaderLoad);
    }
}
