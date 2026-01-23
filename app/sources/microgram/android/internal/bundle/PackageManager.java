package microgram.android.internal.bundle;

import io.github.z4kn4fein.semver.Version;
import java.io.IOException;
import kotlin.Metadata;
import okio.FileSystem;

/* compiled from: PackageManager.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lmicrogram/android/internal/bundle/PackageManager;", "", "", "appId", "Lio/github/z4kn4fein/semver/Version;", "minMicrogramVersion", "Lokio/FileSystem;", "loadPackage", "(Ljava/lang/String;Lio/github/z4kn4fein/semver/Version;)Lokio/FileSystem;", "", "deleteStalePackages", "()V", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface PackageManager {
    void deleteStalePackages() throws IOException;

    FileSystem loadPackage(String appId, Version minMicrogramVersion) throws IOException;

    /* compiled from: PackageManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ FileSystem loadPackage$default(PackageManager packageManager, String str, Version version, int i, Object obj) throws IOException {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadPackage");
            }
            if ((i & 2) != 0) {
                version = null;
            }
            return packageManager.loadPackage(str, version);
        }
    }
}
