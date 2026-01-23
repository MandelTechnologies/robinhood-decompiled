package microgram.android.internal.bundle;

import io.github.z4kn4fein.semver.Version;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import microgram.android.internal.http.HttpCalls2;
import microgram.manifest.Release;
import microgram.manifest.VersionManifest;

/* compiled from: PackageManager.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0002\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002\u001a\u0014\u0010\n\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\tH\u0002¨\u0006\f"}, m3636d2 = {"fetchActiveBuildRevisions", "", "", "Lmicrogram/android/internal/bundle/ReleaseStore;", "appIdentifier", "isSupportedBy", "", "Lmicrogram/manifest/Release;", "appVersion", "Lio/github/z4kn4fein/semver/Version;", "isMicrogramVersionAtLeast", "minimumVersion", "lib-microgram_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: microgram.android.internal.bundle.PackageManagerKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class PackageManager2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Set<String> fetchActiveBuildRevisions(ReleaseStore releaseStore, String str) {
        try {
            VersionManifest versionManifestFetchVersionManifest = releaseStore.fetchVersionManifest(str);
            List<Release> alternatives = versionManifestFetchVersionManifest.getAlternatives();
            Set<String> setMutableSetOf = SetsKt.mutableSetOf(versionManifestFetchVersionManifest.getCurrent().getBuild());
            Iterator<T> it = alternatives.iterator();
            while (it.hasNext()) {
                setMutableSetOf.add(((Release) it.next()).getBuild());
            }
            return setMutableSetOf;
        } catch (HttpCalls2 unused) {
            return SetsKt.emptySet();
        } catch (IOException unused2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSupportedBy(Release release, Version version) {
        Version minAndroidAppVersion = release.getMinAndroidAppVersion();
        return minAndroidAppVersion == null || version.compareTo(minAndroidAppVersion) >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isMicrogramVersionAtLeast(Release release, Version version) {
        return release.getVersion().compareTo(version) >= 0;
    }
}
