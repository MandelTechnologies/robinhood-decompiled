package com.robinhood.android.asset;

import com.robinhood.utils.extensions.ResourceTypes;
import java.io.IOException;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.FileHandle;

/* compiled from: ReadOnly.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0014J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007H\u0014J\b\u0010\u000f\u001a\u00020\u0005H\u0014¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/asset/ReadOnlyFileHandle;", "Lokio/FileHandle;", "<init>", "()V", "protectedWrite", "", "fileOffset", "", ResourceTypes.ARRAY, "", "arrayOffset", "", "byteCount", "protectedResize", "size", "protectedFlush", "lib-assets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.asset.ReadOnlyFileHandle, reason: use source file name */
/* loaded from: classes7.dex */
public abstract class ReadOnly extends FileHandle {
    public ReadOnly() {
        super(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // okio.FileHandle
    /* renamed from: protectedWrite, reason: merged with bridge method [inline-methods] */
    public Void mo11316protectedWrite(long fileOffset, byte[] array2, int arrayOffset, int byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(array2, "array");
        ReadOnly3.throwReadOnly(this);
        throw new ExceptionsH();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // okio.FileHandle
    /* renamed from: protectedResize, reason: merged with bridge method [inline-methods] */
    public Void mo11315protectedResize(long size) throws IOException {
        ReadOnly3.throwReadOnly(this);
        throw new ExceptionsH();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // okio.FileHandle
    /* renamed from: protectedFlush, reason: merged with bridge method [inline-methods] */
    public Void mo11314protectedFlush() throws IOException {
        ReadOnly3.throwReadOnly(this);
        throw new ExceptionsH();
    }
}
