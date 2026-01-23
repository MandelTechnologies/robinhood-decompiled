package com.robinhood.android.asset;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import com.plaid.internal.EnumC7081g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.FileHandle;
import okio.FileMetadata;
import okio.Okio;
import okio.Path;
import okio.Source;

/* compiled from: AssetFileSystem.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001a\u001bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0007H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0007H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\b\u001a\u00020\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0016\u001a\u00020\u0017*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/asset/AssetFileSystem;", "Lcom/robinhood/android/asset/ReadOnlyFileSystem;", "assetManager", "Landroid/content/res/AssetManager;", "<init>", "(Landroid/content/res/AssetManager;)V", "canonicalize", "Lokio/Path;", "path", "list", "", "dir", "listOrNull", "metadataOrNull", "Lokio/FileMetadata;", "openReadOnly", "Lokio/FileHandle;", "file", "source", "Lokio/Source;", "getEntry", "Lcom/robinhood/android/asset/AssetFileSystem$Entry;", "assetManagerPath", "", "getAssetManagerPath", "(Lokio/Path;)Ljava/lang/String;", "Entry", "Companion", "lib-assets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
final class AssetFileSystem extends ReadOnly2 {
    private static final Path ROOT = Path.Companion.get$default(Path.INSTANCE, "/", false, 1, (Object) null);
    private final AssetManager assetManager;

    public AssetFileSystem(AssetManager assetManager) {
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        this.assetManager = assetManager;
    }

    @Override // okio.FileSystem
    public Path canonicalize(Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return ROOT.resolve(path, true);
    }

    @Override // okio.FileSystem
    public List<Path> list(Path dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        List<Path> listListOrNull = listOrNull(dir);
        if (listListOrNull != null) {
            return listListOrNull;
        }
        throw new FileNotFoundException("Not a directory: " + dir);
    }

    @Override // okio.FileSystem
    public List<Path> listOrNull(Path dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        Entry entry = getEntry(dir);
        if (entry instanceof Entry.Directory) {
            return ((Entry.Directory) entry).getChildren();
        }
        if ((entry instanceof Entry.File) || entry == null) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // okio.FileSystem
    public FileMetadata metadataOrNull(Path path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        Entry entry = getEntry(path);
        if (entry instanceof Entry.Directory) {
            return new FileMetadata(false, true, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        }
        if (!(entry instanceof Entry.File)) {
            if (entry == null) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        return new FileMetadata(true, false, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
    }

    @Override // okio.FileSystem
    public FileHandle openReadOnly(Path file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        AssetFileDescriptor assetFileDescriptorOpenFd = this.assetManager.openFd(getAssetManagerPath(file));
        Intrinsics.checkNotNullExpressionValue(assetFileDescriptorOpenFd, "openFd(...)");
        try {
            return new AssetFileSystem2(assetFileDescriptorOpenFd);
        } catch (Throwable th) {
            assetFileDescriptorOpenFd.close();
            throw th;
        }
    }

    @Override // okio.FileSystem
    public Source source(Path file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        InputStream inputStreamOpen = this.assetManager.open(getAssetManagerPath(file));
        Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
        return Okio.source(inputStreamOpen);
    }

    private final Entry getEntry(Path path) throws IOException {
        Path pathCanonicalize = canonicalize(path);
        Path pathParent = pathCanonicalize.parent();
        if (pathParent != null) {
            String[] list = this.assetManager.list(getAssetManagerPath(pathParent));
            if (list == null) {
                list = new String[0];
            }
            if (!ArraysKt.contains(list, pathCanonicalize.name())) {
                return null;
            }
        }
        String[] list2 = this.assetManager.list(getAssetManagerPath(pathCanonicalize));
        if (list2 == null) {
            list2 = new String[0];
        }
        ArrayList arrayList = new ArrayList(list2.length);
        for (String str : list2) {
            Intrinsics.checkNotNull(str);
            arrayList.add(canonicalize(Path.resolve$default(pathCanonicalize, str, false, 2, (Object) null)));
        }
        if (pathParent != null && arrayList.isEmpty()) {
            return new Entry.File(pathCanonicalize);
        }
        return new Entry.Directory(pathCanonicalize, arrayList);
    }

    private final String getAssetManagerPath(Path path) {
        Path pathCanonicalize = canonicalize(path);
        Path path2 = ROOT;
        return Intrinsics.areEqual(pathCanonicalize, path2) ? "" : pathCanonicalize.relativeTo(path2).toString();
    }

    /* compiled from: AssetFileSystem.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/asset/AssetFileSystem$Entry;", "", "<init>", "()V", "path", "Lokio/Path;", "getPath", "()Lokio/Path;", "File", "Directory", "Lcom/robinhood/android/asset/AssetFileSystem$Entry$Directory;", "Lcom/robinhood/android/asset/AssetFileSystem$Entry$File;", "lib-assets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static abstract class Entry {
        public /* synthetic */ Entry(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract Path getPath();

        private Entry() {
        }

        /* compiled from: AssetFileSystem.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/asset/AssetFileSystem$Entry$File;", "Lcom/robinhood/android/asset/AssetFileSystem$Entry;", "path", "Lokio/Path;", "<init>", "(Lokio/Path;)V", "getPath", "()Lokio/Path;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-assets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class File extends Entry {
            private final Path path;

            public static /* synthetic */ File copy$default(File file, Path path, int i, Object obj) {
                if ((i & 1) != 0) {
                    path = file.path;
                }
                return file.copy(path);
            }

            /* renamed from: component1, reason: from getter */
            public final Path getPath() {
                return this.path;
            }

            public final File copy(Path path) {
                Intrinsics.checkNotNullParameter(path, "path");
                return new File(path);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof File) && Intrinsics.areEqual(this.path, ((File) other).path);
            }

            public int hashCode() {
                return this.path.hashCode();
            }

            public String toString() {
                return "File(path=" + this.path + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public File(Path path) {
                super(null);
                Intrinsics.checkNotNullParameter(path, "path");
                this.path = path;
            }

            @Override // com.robinhood.android.asset.AssetFileSystem.Entry
            public Path getPath() {
                return this.path;
            }
        }

        /* compiled from: AssetFileSystem.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/asset/AssetFileSystem$Entry$Directory;", "Lcom/robinhood/android/asset/AssetFileSystem$Entry;", "path", "Lokio/Path;", "children", "", "<init>", "(Lokio/Path;Ljava/util/List;)V", "getPath", "()Lokio/Path;", "getChildren", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-assets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Directory extends Entry {
            private final List<Path> children;
            private final Path path;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Directory copy$default(Directory directory, Path path, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    path = directory.path;
                }
                if ((i & 2) != 0) {
                    list = directory.children;
                }
                return directory.copy(path, list);
            }

            /* renamed from: component1, reason: from getter */
            public final Path getPath() {
                return this.path;
            }

            public final List<Path> component2() {
                return this.children;
            }

            public final Directory copy(Path path, List<Path> children) {
                Intrinsics.checkNotNullParameter(path, "path");
                Intrinsics.checkNotNullParameter(children, "children");
                return new Directory(path, children);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Directory)) {
                    return false;
                }
                Directory directory = (Directory) other;
                return Intrinsics.areEqual(this.path, directory.path) && Intrinsics.areEqual(this.children, directory.children);
            }

            public int hashCode() {
                return (this.path.hashCode() * 31) + this.children.hashCode();
            }

            public String toString() {
                return "Directory(path=" + this.path + ", children=" + this.children + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Directory(Path path, List<Path> children) {
                super(null);
                Intrinsics.checkNotNullParameter(path, "path");
                Intrinsics.checkNotNullParameter(children, "children");
                this.path = path;
                this.children = children;
            }

            public final List<Path> getChildren() {
                return this.children;
            }

            @Override // com.robinhood.android.asset.AssetFileSystem.Entry
            public Path getPath() {
                return this.path;
            }
        }
    }
}
