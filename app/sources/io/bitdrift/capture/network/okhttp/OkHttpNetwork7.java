package io.bitdrift.capture.network.okhttp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;
import okio.Okio;
import okio.Pipe;

/* compiled from: OkHttpNetwork.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lio/bitdrift/capture/network/okhttp/PipeDuplexRequestBody;", "Lokhttp3/RequestBody;", "contentType", "Lokhttp3/MediaType;", "pipeMaxBufferSize", "", "(Lokhttp3/MediaType;J)V", "pipe", "Lokio/Pipe;", "createSink", "Lokio/BufferedSink;", "isDuplex", "", "writeTo", "", "sink", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: io.bitdrift.capture.network.okhttp.PipeDuplexRequestBody, reason: use source file name */
/* loaded from: classes14.dex */
public final class OkHttpNetwork7 extends RequestBody {
    private final MediaType contentType;
    private final Pipe pipe;

    @Override // okhttp3.RequestBody
    public boolean isDuplex() {
        return true;
    }

    public OkHttpNetwork7(MediaType mediaType, long j) {
        this.contentType = mediaType;
        this.pipe = new Pipe(j);
    }

    public final BufferedSink createSink() {
        return Okio.buffer(this.pipe.getSink());
    }

    @Override // okhttp3.RequestBody
    /* renamed from: contentType, reason: from getter */
    public MediaType getContentType() {
        return this.contentType;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(BufferedSink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            this.pipe.fold(sink);
        } catch (Throwable unused) {
        }
    }
}
