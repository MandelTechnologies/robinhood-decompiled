package okhttp3;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;
import okio.Source;
import okio.Timeout;

/* compiled from: MultipartReader.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0003\u0015\u0016\u0017J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\b\u0018\u00010\u0012R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m3636d2 = {"Lokhttp3/MultipartReader;", "Ljava/io/Closeable;", "", "maxResult", "currentPartBytesRemaining", "(J)J", "", "close", "()V", "Lokio/BufferedSource;", "source", "Lokio/BufferedSource;", "Lokio/ByteString;", "crlfDashDashBoundary", "Lokio/ByteString;", "", "closed", "Z", "Lokhttp3/MultipartReader$PartSource;", "currentPart", "Lokhttp3/MultipartReader$PartSource;", "Companion", "Part", "PartSource", "okhttp"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes25.dex */
public final class MultipartReader implements Closeable {
    private static final Options afterBoundaryOptions;
    private boolean closed;
    private final ByteString crlfDashDashBoundary;
    private PartSource currentPart;
    private final BufferedSource source;

    /* compiled from: MultipartReader.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m3636d2 = {"Lokhttp3/MultipartReader$Part;", "Ljava/io/Closeable;", "", "close", "()V", "Lokio/BufferedSource;", CarResultComposable2.BODY, "Lokio/BufferedSource;", "()Lokio/BufferedSource;", "okhttp"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class Part implements Closeable {
        private final BufferedSource body;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.body.close();
        }
    }

    /* compiled from: MultipartReader.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lokhttp3/MultipartReader$PartSource;", "Lokio/Source;", "", "close", "()V", "Lokio/Buffer;", "sink", "", "byteCount", "read", "(Lokio/Buffer;J)J", "Lokio/Timeout;", "timeout", "()Lokio/Timeout;", "Lokio/Timeout;", "okhttp"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    @SourceDebugExtension
    private final class PartSource implements Source {
        final /* synthetic */ MultipartReader this$0;
        private final Timeout timeout;

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (Intrinsics.areEqual(this.this$0.currentPart, this)) {
                this.this$0.currentPart = null;
            }
        }

        @Override // okio.Source
        public long read(Buffer sink, long byteCount) {
            long j;
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (byteCount >= 0) {
                if (Intrinsics.areEqual(this.this$0.currentPart, this)) {
                    Timeout timeout = this.this$0.source.getTimeout();
                    Timeout timeout2 = this.timeout;
                    MultipartReader multipartReader = this.this$0;
                    long timeoutNanos = timeout.getTimeoutNanos();
                    long jMinTimeout = Timeout.INSTANCE.minTimeout(timeout2.getTimeoutNanos(), timeout.getTimeoutNanos());
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    timeout.timeout(jMinTimeout, timeUnit);
                    if (timeout.getHasDeadline()) {
                        long jDeadlineNanoTime = timeout.deadlineNanoTime();
                        if (timeout2.getHasDeadline()) {
                            j = 0;
                            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                        } else {
                            j = 0;
                        }
                        try {
                            long jCurrentPartBytesRemaining = multipartReader.currentPartBytesRemaining(byteCount);
                            long j2 = jCurrentPartBytesRemaining == j ? -1L : multipartReader.source.read(sink, jCurrentPartBytesRemaining);
                            timeout.timeout(timeoutNanos, timeUnit);
                            if (timeout2.getHasDeadline()) {
                                timeout.deadlineNanoTime(jDeadlineNanoTime);
                            }
                            return j2;
                        } catch (Throwable th) {
                            timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                            if (timeout2.getHasDeadline()) {
                                timeout.deadlineNanoTime(jDeadlineNanoTime);
                            }
                            throw th;
                        }
                    }
                    if (timeout2.getHasDeadline()) {
                        timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                    }
                    try {
                        long jCurrentPartBytesRemaining2 = multipartReader.currentPartBytesRemaining(byteCount);
                        long j3 = jCurrentPartBytesRemaining2 == 0 ? -1L : multipartReader.source.read(sink, jCurrentPartBytesRemaining2);
                        timeout.timeout(timeoutNanos, timeUnit);
                        if (timeout2.getHasDeadline()) {
                            timeout.clearDeadline();
                        }
                        return j3;
                    } catch (Throwable th2) {
                        timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                        if (timeout2.getHasDeadline()) {
                            timeout.clearDeadline();
                        }
                        throw th2;
                    }
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }

        @Override // okio.Source
        /* renamed from: timeout, reason: from getter */
        public Timeout getTimeout() {
            return this.timeout;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long currentPartBytesRemaining(long maxResult) throws IOException {
        this.source.require(this.crlfDashDashBoundary.size());
        long jIndexOf = this.source.getBufferField().indexOf(this.crlfDashDashBoundary);
        if (jIndexOf == -1) {
            return Math.min(maxResult, (this.source.getBufferField().getSize() - this.crlfDashDashBoundary.size()) + 1);
        }
        return Math.min(maxResult, jIndexOf);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.currentPart = null;
        this.source.close();
    }

    static {
        Options.Companion companion = Options.INSTANCE;
        ByteString.Companion companion2 = ByteString.INSTANCE;
        afterBoundaryOptions = companion.m3855of(companion2.encodeUtf8("\r\n"), companion2.encodeUtf8("--"), companion2.encodeUtf8(PlaceholderUtils.XXShortPlaceholderText), companion2.encodeUtf8("\t"));
    }
}
