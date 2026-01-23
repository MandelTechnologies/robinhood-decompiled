package okio;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.internal.ZipFiles2;

/* compiled from: ZlibOkio.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m3636d2 = {"openZip", "Lokio/FileSystem;", "zipPath", "Lokio/Path;", "okio"}, m3637k = 5, m3638mv = {2, 1, 0}, m3640xi = 48, m3641xs = "okio/Okio")
/* renamed from: okio.Okio__ZlibOkioKt, reason: use source file name */
/* loaded from: classes25.dex */
final /* synthetic */ class ZlibOkio {
    public static final FileSystem openZip(FileSystem fileSystem, Path zipPath) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        return ZipFiles2.openZip$default(zipPath, fileSystem, null, 4, null);
    }
}
