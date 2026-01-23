package microgram.android.internal.bundle;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import microgram.manifest.Release;
import okhttp3.HttpUrl;

/* compiled from: PackageModels.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m3636d2 = {"toPackageReference", "Lmicrogram/android/internal/bundle/PackageReference;", "Lmicrogram/manifest/Release;", "lib-microgram_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.android.internal.bundle.PackageModelsKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class PackageModels2 {
    public static final PackageReference toPackageReference(Release release) {
        Intrinsics.checkNotNullParameter(release, "<this>");
        PackageId packageId = new PackageId(release.getAppIdentifier(), release.getBuild());
        HttpUrl httpUrlResolve = release.getBaseUrl().newBuilder().addPathSegment("").build().resolve(release.getPackagePath());
        Intrinsics.checkNotNull(httpUrlResolve);
        return new PackageReference(packageId, httpUrlResolve, release.getSha256());
    }
}
