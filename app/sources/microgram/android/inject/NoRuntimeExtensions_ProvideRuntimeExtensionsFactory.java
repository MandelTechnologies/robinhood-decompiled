package microgram.android.inject;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.extension.ServiceExtension;

/* compiled from: NoRuntimeExtensions_ProvideRuntimeExtensionsFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u00050\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ \u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, m3636d2 = {"Lmicrogram/android/inject/NoRuntimeExtensions_ProvideRuntimeExtensionsFactory;", "Ldagger/internal/Factory;", "", "", "Lmicrogram/android/extension/ServiceExtension$Factory;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "()V", "provideRuntimeExtensions", "()Ljava/util/Map;", "get", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class NoRuntimeExtensions_ProvideRuntimeExtensionsFactory implements Factory<Map<String, ServiceExtension.Factory>> {
    public static final NoRuntimeExtensions_ProvideRuntimeExtensionsFactory INSTANCE = new NoRuntimeExtensions_ProvideRuntimeExtensionsFactory();

    private NoRuntimeExtensions_ProvideRuntimeExtensionsFactory() {
    }

    @Override // javax.inject.Provider
    public Map<String, ServiceExtension.Factory> get() {
        return provideRuntimeExtensions();
    }

    @JvmStatic
    public static final Map<String, ServiceExtension.Factory> provideRuntimeExtensions() {
        Object objCheckNotNull = Preconditions.checkNotNull(CompileAndRuntime.INSTANCE.provideRuntimeExtensions(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (Map) objCheckNotNull;
    }
}
