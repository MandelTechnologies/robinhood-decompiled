package microgram.android.internal.bundle;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import okio.FileSystem;

/* compiled from: PackageStore.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u000b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lmicrogram/android/internal/bundle/PackageStore;", "", "Lmicrogram/android/internal/bundle/PackageReference;", "reference", "Lokio/FileSystem;", "loadPackage", "(Lmicrogram/android/internal/bundle/PackageReference;)Lokio/FileSystem;", "Lkotlin/Function1;", "Lmicrogram/android/internal/bundle/PackageId;", "", "retain", "", "trim", "(Lkotlin/jvm/functions/Function1;)V", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface PackageStore {
    FileSystem loadPackage(PackageReference reference) throws IOException;

    void trim(Function1<? super PackageId, Boolean> retain) throws IOException;
}
