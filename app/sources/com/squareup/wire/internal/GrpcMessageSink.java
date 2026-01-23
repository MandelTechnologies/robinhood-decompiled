package com.squareup.wire.internal;

import com.robinhood.utils.http.ContentEncoding;
import com.squareup.wire.MessageSink;
import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Buffer;
import okio.BufferedSink;

/* compiled from: GrpcMessageSink.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B7\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0013H\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/squareup/wire/internal/GrpcMessageSink;", "T", "", "Lcom/squareup/wire/MessageSink;", "sink", "Lokio/BufferedSink;", "minMessageToCompress", "", "messageAdapter", "Lcom/squareup/wire/ProtoAdapter;", "callForCancel", "Lcom/squareup/wire/internal/Call;", "grpcEncoding", "", "<init>", "(Lokio/BufferedSink;JLcom/squareup/wire/ProtoAdapter;Lcom/squareup/wire/internal/Call;Ljava/lang/String;)V", "closed", "", "write", "", "message", "(Ljava/lang/Object;)V", "cancel", "close", "wire-grpc-client"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class GrpcMessageSink<T> implements MessageSink<T> {
    private final platform callForCancel;
    private boolean closed;
    private final String grpcEncoding;
    private final ProtoAdapter<T> messageAdapter;
    private final long minMessageToCompress;
    private final BufferedSink sink;

    public GrpcMessageSink(BufferedSink sink, long j, ProtoAdapter<T> messageAdapter, platform platformVar, String grpcEncoding) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(messageAdapter, "messageAdapter");
        Intrinsics.checkNotNullParameter(grpcEncoding, "grpcEncoding");
        this.sink = sink;
        this.minMessageToCompress = j;
        this.messageAdapter = messageAdapter;
        this.callForCancel = platformVar;
        this.grpcEncoding = grpcEncoding;
    }

    @Override // com.squareup.wire.MessageSink
    public void write(T message) throws IOException {
        Intrinsics.checkNotNullParameter(message, "message");
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        Buffer buffer = new Buffer();
        this.messageAdapter.encode((BufferedSink) buffer, (Buffer) message);
        if (Intrinsics.areEqual(this.grpcEncoding, ContentEncoding.IDENTITY) || buffer.getSize() < this.minMessageToCompress) {
            this.sink.writeByte(0);
            this.sink.writeInt((int) buffer.getSize());
            this.sink.writeAll(buffer);
        } else {
            Buffer buffer2 = new Buffer();
            BufferedSink bufferedSinkEncode = GrpcEncoder2.toGrpcEncoder(this.grpcEncoding).encode(buffer2);
            try {
                bufferedSinkEncode.writeAll(buffer);
                bufferedSinkEncode.close();
                this.sink.writeByte(1);
                this.sink.writeInt((int) buffer2.getSize());
                this.sink.writeAll(buffer2);
            } catch (Throwable th) {
                try {
                    bufferedSinkEncode.close();
                } catch (Throwable th2) {
                    ExceptionsKt.addSuppressed(th, th2);
                }
                throw th;
            }
        }
        this.sink.flush();
    }

    @Override // com.squareup.wire.MessageSink
    public void cancel() {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        platform platformVar = this.callForCancel;
        if (platformVar != null) {
            platformVar.cancel();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.sink.close();
    }
}
