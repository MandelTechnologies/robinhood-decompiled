package microgram.android.internal.bundle;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.FileSystem;

/* compiled from: PackageInitializer.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m3636d2 = {"initializePackage", "", "Lmicrogram/android/internal/bundle/PackageInitializer;", "fileSystem", "Lokio/FileSystem;", "lib-microgram_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.android.internal.bundle.PackageInitializerKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class PackageInitializer3 {
    public static final void initializePackage(PackageInitializer packageInitializer, FileSystem fileSystem) throws IOException {
        Intrinsics.checkNotNullParameter(packageInitializer, "<this>");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        packageInitializer.initializePackage(PackagePaths2.readInfo(fileSystem));
    }
}
