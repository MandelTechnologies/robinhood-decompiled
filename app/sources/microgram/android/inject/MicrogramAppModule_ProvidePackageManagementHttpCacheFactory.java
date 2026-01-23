package microgram.android.inject;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Cache;
import okio.Path;

/* compiled from: MicrogramAppModule_ProvidePackageManagementHttpCacheFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lmicrogram/android/inject/MicrogramAppModule_ProvidePackageManagementHttpCacheFactory;", "Ldagger/internal/Factory;", "Lokhttp3/Cache;", "Companion", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class MicrogramAppModule_ProvidePackageManagementHttpCacheFactory implements Factory<Cache> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    public static final Cache providePackageManagementHttpCache(Path path) {
        return INSTANCE.providePackageManagementHttpCache(path);
    }

    /* compiled from: MicrogramAppModule_ProvidePackageManagementHttpCacheFactory.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lmicrogram/android/inject/MicrogramAppModule_ProvidePackageManagementHttpCacheFactory$Companion;", "", "<init>", "()V", "Lokio/Path;", "directory", "Lokhttp3/Cache;", "providePackageManagementHttpCache", "(Lokio/Path;)Lokhttp3/Cache;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Cache providePackageManagementHttpCache(Path directory) {
            Intrinsics.checkNotNullParameter(directory, "directory");
            Object objCheckNotNull = Preconditions.checkNotNull(MicrogramAppModule.INSTANCE.providePackageManagementHttpCache(directory), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (Cache) objCheckNotNull;
        }
    }
}
