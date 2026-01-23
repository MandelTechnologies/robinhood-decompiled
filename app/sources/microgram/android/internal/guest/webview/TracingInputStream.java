package microgram.android.internal.guest.webview;

import com.robinhood.android.tracing.RhTrace3;
import com.robinhood.android.tracing.RhTrace6;
import com.singular.sdk.internal.Constants;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TracingInputStream.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J \u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fH\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/android/internal/guest/webview/TracingInputStream;", "Ljava/io/InputStream;", "trace", "Lcom/robinhood/android/tracing/TrackTrace;", "delegate", "<init>", "(Lcom/robinhood/android/tracing/TrackTrace;Ljava/io/InputStream;)V", "openTrace", "Lcom/robinhood/android/tracing/SpanHandle;", "markSupported", "", "available", "", "read", "b", "", "off", "len", "skip", "", Constants.RequestParamsKeys.APP_NAME_KEY, "mark", "", "readlimit", "reset", "close", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
final class TracingInputStream extends InputStream {
    private final InputStream delegate;
    private final RhTrace3 openTrace;
    private final RhTrace6 trace;

    public TracingInputStream(RhTrace6 trace, InputStream delegate) {
        Intrinsics.checkNotNullParameter(trace, "trace");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.trace = trace;
        this.delegate = delegate;
        this.openTrace = trace.beginSpan("OPEN");
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.delegate.markSupported();
    }

    @Override // java.io.InputStream
    public int available() {
        RhTrace6 rhTrace6 = this.trace;
        RhTrace3 rhTrace3BeginSpan = !rhTrace6.isEnabled() ? null : rhTrace6.beginSpan("available()");
        try {
            return this.delegate.available();
        } finally {
            if (rhTrace3BeginSpan != null) {
                rhTrace3BeginSpan.end();
            }
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] b, int off, int len) {
        RhTrace3 rhTrace3BeginSpan;
        Intrinsics.checkNotNullParameter(b, "b");
        RhTrace6 rhTrace6 = this.trace;
        if (rhTrace6.isEnabled()) {
            rhTrace3BeginSpan = rhTrace6.beginSpan("read(b[" + b.length + "], " + off + ", " + len + ")");
        } else {
            rhTrace3BeginSpan = null;
        }
        try {
            return this.delegate.read(b, off, len);
        } finally {
            if (rhTrace3BeginSpan != null) {
                rhTrace3BeginSpan.end();
            }
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] b) {
        RhTrace3 rhTrace3BeginSpan;
        Intrinsics.checkNotNullParameter(b, "b");
        RhTrace6 rhTrace6 = this.trace;
        if (rhTrace6.isEnabled()) {
            rhTrace3BeginSpan = rhTrace6.beginSpan("read(b[" + b.length + "])");
        } else {
            rhTrace3BeginSpan = null;
        }
        try {
            return this.delegate.read(b);
        } finally {
            if (rhTrace3BeginSpan != null) {
                rhTrace3BeginSpan.end();
            }
        }
    }

    @Override // java.io.InputStream
    public int read() {
        RhTrace6 rhTrace6 = this.trace;
        RhTrace3 rhTrace3BeginSpan = !rhTrace6.isEnabled() ? null : rhTrace6.beginSpan("read()");
        try {
            return this.delegate.read();
        } finally {
            if (rhTrace3BeginSpan != null) {
                rhTrace3BeginSpan.end();
            }
        }
    }

    @Override // java.io.InputStream
    public long skip(long n) {
        RhTrace3 rhTrace3BeginSpan;
        RhTrace6 rhTrace6 = this.trace;
        if (rhTrace6.isEnabled()) {
            rhTrace3BeginSpan = rhTrace6.beginSpan("skip(" + n + ")");
        } else {
            rhTrace3BeginSpan = null;
        }
        try {
            return this.delegate.skip(n);
        } finally {
            if (rhTrace3BeginSpan != null) {
                rhTrace3BeginSpan.end();
            }
        }
    }

    @Override // java.io.InputStream
    public void mark(int readlimit) {
        RhTrace3 rhTrace3BeginSpan;
        RhTrace6 rhTrace6 = this.trace;
        if (rhTrace6.isEnabled()) {
            rhTrace3BeginSpan = rhTrace6.beginSpan("mark(" + readlimit + ")");
        } else {
            rhTrace3BeginSpan = null;
        }
        try {
            this.delegate.mark(readlimit);
            Unit unit = Unit.INSTANCE;
        } finally {
            if (rhTrace3BeginSpan != null) {
                rhTrace3BeginSpan.end();
            }
        }
    }

    @Override // java.io.InputStream
    public void reset() {
        RhTrace6 rhTrace6 = this.trace;
        RhTrace3 rhTrace3BeginSpan = !rhTrace6.isEnabled() ? null : rhTrace6.beginSpan("reset()");
        try {
            this.delegate.reset();
            Unit unit = Unit.INSTANCE;
        } finally {
            if (rhTrace3BeginSpan != null) {
                rhTrace3BeginSpan.end();
            }
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        RhTrace6 rhTrace6 = this.trace;
        RhTrace3 rhTrace3BeginSpan = !rhTrace6.isEnabled() ? null : rhTrace6.beginSpan("close()");
        try {
            this.delegate.close();
            RhTrace3 rhTrace3 = this.openTrace;
            if (rhTrace3 != null) {
                rhTrace3.end();
            }
            Unit unit = Unit.INSTANCE;
            if (rhTrace3BeginSpan != null) {
                rhTrace3BeginSpan.end();
            }
        } catch (Throwable th) {
            if (rhTrace3BeginSpan != null) {
                rhTrace3BeginSpan.end();
            }
            throw th;
        }
    }
}
