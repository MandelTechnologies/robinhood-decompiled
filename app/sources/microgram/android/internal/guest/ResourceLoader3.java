package microgram.android.internal.guest;

import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.internal.guest.webview.Paths2;
import okhttp3.MediaType;
import okio.BufferedSource;
import okio.FileMetadata;
import okio.FileSystem;
import okio.Okio;
import okio.Path;

/* compiled from: ResourceLoader.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0014\u0010\u0002\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0017R\u001c\u0010\u0002\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lmicrogram/android/internal/guest/FileSystemResourceLoader;", "Lmicrogram/android/internal/guest/ResourceLoader;", "fileSystemFuture", "Ljava/util/concurrent/Future;", "Lkotlin/Result;", "Lokio/FileSystem;", "basePath", "Lokio/Path;", "<init>", "(Ljava/util/concurrent/Future;Lokio/Path;)V", "fetch", "Lmicrogram/android/internal/guest/Resource;", "path", "", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.android.internal.guest.FileSystemResourceLoader, reason: use source file name */
/* loaded from: classes14.dex */
public final class ResourceLoader3 implements ResourceLoader {
    private final Path basePath;
    private final Future<? extends Result<FileSystem>> fileSystemFuture;

    /* JADX WARN: Multi-variable type inference failed */
    public ResourceLoader3(Future<? extends Result<? extends FileSystem>> fileSystemFuture, Path basePath) {
        Intrinsics.checkNotNullParameter(fileSystemFuture, "fileSystemFuture");
        Intrinsics.checkNotNullParameter(basePath, "basePath");
        this.fileSystemFuture = fileSystemFuture;
        this.basePath = basePath;
    }

    @Override // microgram.android.internal.guest.ResourceLoader
    public Resource fetch(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        Result<FileSystem> result = this.fileSystemFuture.get();
        Intrinsics.checkNotNullExpressionValue(result, "get(...)");
        Object value = result.getValue();
        ResultKt.throwOnFailure(value);
        FileSystem fileSystem = (FileSystem) value;
        Path path2 = this.basePath;
        Path.Companion companion = Path.INSTANCE;
        Path pathResolve$default = Path.resolve$default(path2, Path.Companion.get$default(companion, path, false, 1, (Object) null).relativeTo(Path.Companion.get$default(companion, "/", false, 1, (Object) null)), false, 2, (Object) null);
        FileMetadata fileMetadataMetadata = fileSystem.metadata(pathResolve$default);
        if (fileMetadataMetadata.getIsDirectory()) {
            pathResolve$default = pathResolve$default.resolve("index.html");
        }
        MediaType mediaTypeGuessMediaType = Paths2.guessMediaType(pathResolve$default);
        BufferedSource bufferedSourceBuffer = Okio.buffer(fileSystem.source(pathResolve$default));
        Long size = fileMetadataMetadata.getSize();
        return new Resource(mediaTypeGuessMediaType, bufferedSourceBuffer, size != null ? size.longValue() : 0L);
    }
}
