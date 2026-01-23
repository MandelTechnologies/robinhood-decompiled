package okio;

import com.robinhood.utils.extensions.ResourceTypes;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NioFileSystemFileHandle.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\u000bH\u0014J(\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0014J(\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0014J\b\u0010\u0015\u001a\u00020\tH\u0014J\b\u0010\u0016\u001a\u00020\tH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lokio/NioFileSystemFileHandle;", "Lokio/FileHandle;", "readWrite", "", "fileChannel", "Ljava/nio/channels/FileChannel;", "<init>", "(ZLjava/nio/channels/FileChannel;)V", "protectedResize", "", "size", "", "protectedSize", "protectedRead", "", "fileOffset", ResourceTypes.ARRAY, "", "arrayOffset", "byteCount", "protectedWrite", "protectedFlush", "protectedClose", "okio"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class NioFileSystemFileHandle extends FileHandle {
    private final FileChannel fileChannel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NioFileSystemFileHandle(boolean z, FileChannel fileChannel) {
        super(z);
        Intrinsics.checkNotNullParameter(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }

    @Override // okio.FileHandle
    /* renamed from: protectedResize */
    protected synchronized void mo11315protectedResize(long size) throws Throwable {
        try {
            try {
                long size2 = size();
                long j = size - size2;
                if (j > 0) {
                    int i = (int) j;
                    mo11316protectedWrite(size2, new byte[i], 0, i);
                } else {
                    this.fileChannel.truncate(size);
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // okio.FileHandle
    protected synchronized long protectedSize() {
        return this.fileChannel.size();
    }

    @Override // okio.FileHandle
    protected synchronized int protectedRead(long fileOffset, byte[] array2, int arrayOffset, int byteCount) {
        Intrinsics.checkNotNullParameter(array2, "array");
        this.fileChannel.position(fileOffset);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(array2, arrayOffset, byteCount);
        int i = 0;
        while (true) {
            if (i >= byteCount) {
                break;
            }
            int i2 = this.fileChannel.read(byteBufferWrap);
            if (i2 != -1) {
                i += i2;
            } else if (i == 0) {
                return -1;
            }
        }
        return i;
    }

    @Override // okio.FileHandle
    /* renamed from: protectedWrite */
    protected synchronized void mo11316protectedWrite(long fileOffset, byte[] array2, int arrayOffset, int byteCount) {
        Intrinsics.checkNotNullParameter(array2, "array");
        this.fileChannel.position(fileOffset);
        this.fileChannel.write(ByteBuffer.wrap(array2, arrayOffset, byteCount));
    }

    @Override // okio.FileHandle
    /* renamed from: protectedFlush */
    protected synchronized void mo11314protectedFlush() {
        this.fileChannel.force(true);
    }

    @Override // okio.FileHandle
    protected synchronized void protectedClose() {
        this.fileChannel.close();
    }
}
