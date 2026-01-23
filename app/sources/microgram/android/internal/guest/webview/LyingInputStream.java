package microgram.android.internal.guest.webview;

import com.singular.sdk.internal.Constants;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: LyingInputStream.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u0010J\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\tJ\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/android/internal/guest/webview/LyingInputStream;", "Ljava/io/InputStream;", "delegate", "", "contentLength", "<init>", "(Ljava/io/InputStream;J)V", "", "available", "()I", "", "b", "off", "len", "read", "([BII)I", "([B)I", Constants.RequestParamsKeys.APP_NAME_KEY, "skip", "(J)J", "", "close", "()V", "Ljava/io/InputStream;", "J", "readCount", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
final class LyingInputStream extends InputStream {
    private final long contentLength;
    private final InputStream delegate;
    private long readCount;

    public LyingInputStream(InputStream delegate, long j) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
        this.contentLength = j;
    }

    @Override // java.io.InputStream
    public int available() {
        return RangesKt.coerceAtLeast((int) RangesKt.coerceAtMost(this.contentLength - this.readCount, 2147483647L), this.delegate.available());
    }

    @Override // java.io.InputStream
    public int read(byte[] b, int off, int len) throws IOException {
        Intrinsics.checkNotNullParameter(b, "b");
        int i = this.delegate.read(b, off, len);
        if (i != -1) {
            this.readCount += i;
        }
        return i;
    }

    @Override // java.io.InputStream
    public int read(byte[] b) throws IOException {
        Intrinsics.checkNotNullParameter(b, "b");
        int i = this.delegate.read(b);
        if (i != -1) {
            this.readCount += i;
        }
        return i;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i = this.delegate.read();
        if (i != -1) {
            this.readCount += i;
        }
        return i;
    }

    @Override // java.io.InputStream
    public long skip(long n) throws IOException {
        long jSkip = this.delegate.skip(n);
        this.readCount += jSkip;
        return jSkip;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }
}
