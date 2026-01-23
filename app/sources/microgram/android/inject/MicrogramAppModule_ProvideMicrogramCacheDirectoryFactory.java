package microgram.android.inject;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Path;

/* compiled from: MicrogramAppModule_ProvideMicrogramCacheDirectoryFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lmicrogram/android/inject/MicrogramAppModule_ProvideMicrogramCacheDirectoryFactory;", "Ldagger/internal/Factory;", "Lokio/Path;", "Companion", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class MicrogramAppModule_ProvideMicrogramCacheDirectoryFactory implements Factory<Path> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    public static final Path provideMicrogramCacheDirectory(File file) {
        return INSTANCE.provideMicrogramCacheDirectory(file);
    }

    /* compiled from: MicrogramAppModule_ProvideMicrogramCacheDirectoryFactory.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lmicrogram/android/inject/MicrogramAppModule_ProvideMicrogramCacheDirectoryFactory$Companion;", "", "<init>", "()V", "Ljava/io/File;", "cacheDirectory", "Lokio/Path;", "provideMicrogramCacheDirectory", "(Ljava/io/File;)Lokio/Path;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Path provideMicrogramCacheDirectory(File cacheDirectory) {
            Intrinsics.checkNotNullParameter(cacheDirectory, "cacheDirectory");
            Object objCheckNotNull = Preconditions.checkNotNull(MicrogramAppModule.INSTANCE.provideMicrogramCacheDirectory(cacheDirectory), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (Path) objCheckNotNull;
        }
    }
}
