package microgram.android.internal.bundle;

import io.github.z4kn4fein.semver.Version;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.FileSystem;

/* compiled from: PackageInterceptor.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\tJ#\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, m3636d2 = {"Lmicrogram/android/internal/bundle/PackageInterceptor;", "", "", "appId", "Lio/github/z4kn4fein/semver/Version;", "currentVersion", "Lokio/FileSystem;", "interceptPackageLoad", "(Ljava/lang/String;Lio/github/z4kn4fein/semver/Version;)Lokio/FileSystem;", "Noop", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface PackageInterceptor {
    FileSystem interceptPackageLoad(String appId, Version currentVersion);

    /* compiled from: PackageInterceptor.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lmicrogram/android/internal/bundle/PackageInterceptor$Noop;", "Lmicrogram/android/internal/bundle/PackageInterceptor;", "<init>", "()V", "", "appId", "Lio/github/z4kn4fein/semver/Version;", "currentVersion", "Lokio/FileSystem;", "interceptPackageLoad", "(Ljava/lang/String;Lio/github/z4kn4fein/semver/Version;)Lokio/FileSystem;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Noop implements PackageInterceptor {
        public static final Noop INSTANCE = new Noop();

        @Override // microgram.android.internal.bundle.PackageInterceptor
        public FileSystem interceptPackageLoad(String appId, Version currentVersion) {
            Intrinsics.checkNotNullParameter(appId, "appId");
            return null;
        }

        private Noop() {
        }
    }
}
