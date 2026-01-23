package com.robinhood.android.asset;

import android.content.res.AssetFileDescriptor;
import com.robinhood.utils.extensions.ResourceTypes;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AssetFileSystem.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0014J\b\u0010\u0011\u001a\u00020\fH\u0014J\b\u0010\u0012\u001a\u00020\u0013H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/asset/AssetFileHandle;", "Lcom/robinhood/android/asset/ReadOnlyFileHandle;", "descriptor", "Landroid/content/res/AssetFileDescriptor;", "<init>", "(Landroid/content/res/AssetFileDescriptor;)V", "channel", "Ljava/nio/channels/FileChannel;", "kotlin.jvm.PlatformType", "protectedRead", "", "fileOffset", "", ResourceTypes.ARRAY, "", "arrayOffset", "byteCount", "protectedSize", "protectedClose", "", "lib-assets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.asset.AssetFileHandle, reason: use source file name */
/* loaded from: classes7.dex */
final class AssetFileSystem2 extends ReadOnly {
    private final FileChannel channel;
    private final AssetFileDescriptor descriptor;

    public AssetFileSystem2(AssetFileDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.descriptor = descriptor;
        this.channel = descriptor.createInputStream().getChannel();
    }

    @Override // okio.FileHandle
    protected int protectedRead(long fileOffset, byte[] array2, int arrayOffset, int byteCount) {
        Intrinsics.checkNotNullParameter(array2, "array");
        if (fileOffset == protectedSize()) {
            return -1;
        }
        return this.channel.read(ByteBuffer.wrap(array2, arrayOffset, byteCount), this.descriptor.getStartOffset() + fileOffset);
    }

    @Override // okio.FileHandle
    protected long protectedSize() {
        return this.descriptor.getLength();
    }

    @Override // okio.FileHandle
    protected void protectedClose() throws IOException {
        this.descriptor.close();
    }
}
