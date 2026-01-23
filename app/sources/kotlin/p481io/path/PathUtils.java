package kotlin.p481io.path;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PathUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\b\u001a#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\"\u001e\u0010\n\u001a\u00020\u0001*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, m3636d2 = {"Ljava/nio/file/Path;", "", "glob", "", "listDirectoryEntries", "(Ljava/nio/file/Path;Ljava/lang/String;)Ljava/util/List;", "getName", "(Ljava/nio/file/Path;)Ljava/lang/String;", "getName$annotations", "(Ljava/nio/file/Path;)V", "name", "kotlin-stdlib-jdk7"}, m3637k = 5, m3638mv = {2, 1, 0}, m3640xi = 49, m3641xs = "kotlin/io/path/PathsKt")
@SourceDebugExtension
/* renamed from: kotlin.io.path.PathsKt__PathUtilsKt, reason: use source file name */
/* loaded from: classes14.dex */
public class PathUtils extends PathRecursiveFunctions2 {
    public static final String getName(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Path fileName = path.getFileName();
        String string2 = fileName != null ? fileName.toString() : null;
        return string2 == null ? "" : string2;
    }

    public static /* synthetic */ List listDirectoryEntries$default(Path path, String str, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            str = "*";
        }
        return listDirectoryEntries(path, str);
    }

    @SinceKotlin
    @WasExperimental
    public static final List<Path> listDirectoryEntries(Path path, String glob) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(glob, "glob");
        DirectoryStream directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, glob);
        try {
            DirectoryStream directoryStreamM3664m = PathsKt__PathUtilsKt$$ExternalSyntheticApiModelOutline2.m3664m(directoryStreamNewDirectoryStream);
            Intrinsics.checkNotNull(directoryStreamM3664m);
            List<Path> list = CollectionsKt.toList(directoryStreamM3664m);
            Closeable.closeFinally(directoryStreamNewDirectoryStream, null);
            return list;
        } finally {
        }
    }
}
