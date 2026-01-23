package com.robinhood.android.asset;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import java.io.IOException;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.FileHandle;
import okio.FileSystem;
import okio.Path;
import okio.Sink;

/* compiled from: ReadOnly.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0016J\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0016¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/asset/ReadOnlyFileSystem;", "Lokio/FileSystem;", "<init>", "()V", "openReadWrite", "", "file", "Lokio/Path;", "mustCreate", "", "mustExist", "sink", "appendingSink", "createDirectory", "dir", "atomicMove", "source", "target", AnalyticsStrings.BUTTON_LIST_DELETE, "path", "createSymlink", "lib-assets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.asset.ReadOnlyFileSystem, reason: use source file name */
/* loaded from: classes7.dex */
public abstract class ReadOnly2 extends FileSystem {
    @Override // okio.FileSystem
    /* renamed from: appendingSink, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Sink mo11317appendingSink(Path path, boolean z) {
        return (Sink) appendingSink(path, z);
    }

    @Override // okio.FileSystem
    /* renamed from: openReadWrite, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ FileHandle mo11322openReadWrite(Path path, boolean z, boolean z2) {
        return (FileHandle) openReadWrite(path, z, z2);
    }

    @Override // okio.FileSystem
    /* renamed from: sink, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Sink mo11323sink(Path path, boolean z) {
        return (Sink) sink(path, z);
    }

    public Void openReadWrite(Path file, boolean mustCreate, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        ReadOnly3.throwReadOnly(this);
        throw new ExceptionsH();
    }

    public Void sink(Path file, boolean mustCreate) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        ReadOnly3.throwReadOnly(this);
        throw new ExceptionsH();
    }

    public Void appendingSink(Path file, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        ReadOnly3.throwReadOnly(this);
        throw new ExceptionsH();
    }

    @Override // okio.FileSystem
    /* renamed from: createDirectory, reason: merged with bridge method [inline-methods] */
    public Void mo11319createDirectory(Path dir, boolean mustCreate) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        ReadOnly3.throwReadOnly(this);
        throw new ExceptionsH();
    }

    @Override // okio.FileSystem
    /* renamed from: atomicMove, reason: merged with bridge method [inline-methods] */
    public Void mo11318atomicMove(Path source, Path target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        ReadOnly3.throwReadOnly(this);
        throw new ExceptionsH();
    }

    @Override // okio.FileSystem
    /* renamed from: delete, reason: merged with bridge method [inline-methods] */
    public Void mo11321delete(Path path, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        ReadOnly3.throwReadOnly(this);
        throw new ExceptionsH();
    }

    @Override // okio.FileSystem
    /* renamed from: createSymlink, reason: merged with bridge method [inline-methods] */
    public Void mo11320createSymlink(Path source, Path target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        ReadOnly3.throwReadOnly(this);
        throw new ExceptionsH();
    }
}
