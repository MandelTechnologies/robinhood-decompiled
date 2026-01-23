package microgram.android.inject;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.MicrogramSource;
import microgram.android.internal.guest.ResourceLoader;

/* compiled from: MicrogramRuntimeModule_ProvideResourceLoaderFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lmicrogram/android/inject/MicrogramRuntimeModule_ProvideResourceLoaderFactory;", "Ldagger/internal/Factory;", "Lmicrogram/android/internal/guest/ResourceLoader;", "Companion", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class MicrogramRuntimeModule_ProvideResourceLoaderFactory implements Factory<ResourceLoader> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    public static final ResourceLoader provideResourceLoader(ResourceLoader.Factory factory, MicrogramSource microgramSource) {
        return INSTANCE.provideResourceLoader(factory, microgramSource);
    }

    /* compiled from: MicrogramRuntimeModule_ProvideResourceLoaderFactory.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lmicrogram/android/inject/MicrogramRuntimeModule_ProvideResourceLoaderFactory$Companion;", "", "<init>", "()V", "Lmicrogram/android/internal/guest/ResourceLoader$Factory;", "factory", "Lmicrogram/android/MicrogramSource;", "source", "Lmicrogram/android/internal/guest/ResourceLoader;", "provideResourceLoader", "(Lmicrogram/android/internal/guest/ResourceLoader$Factory;Lmicrogram/android/MicrogramSource;)Lmicrogram/android/internal/guest/ResourceLoader;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ResourceLoader provideResourceLoader(ResourceLoader.Factory factory, MicrogramSource source) {
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(source, "source");
            Object objCheckNotNull = Preconditions.checkNotNull(MicrogramRuntimeModule.INSTANCE.provideResourceLoader(factory, source), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (ResourceLoader) objCheckNotNull;
        }
    }
}
