package com.squareup.wire.internal;

import com.squareup.wire.MessageSource;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.internal.GrpcDecoder;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Buffer;
import okio.BufferedSource;
import okio.Okio;

/* compiled from: GrpcMessageSource.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B)\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\rJ\u000b\u0010\u000e\u001a\u00028\u0000¢\u0006\u0002\u0010\rJ\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/squareup/wire/internal/GrpcMessageSource;", "T", "", "Lcom/squareup/wire/MessageSource;", "source", "Lokio/BufferedSource;", "messageAdapter", "Lcom/squareup/wire/ProtoAdapter;", "grpcEncoding", "", "<init>", "(Lokio/BufferedSource;Lcom/squareup/wire/ProtoAdapter;Ljava/lang/String;)V", "read", "()Ljava/lang/Object;", "readExactlyOneAndClose", "close", "", "wire-grpc-client"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class GrpcMessageSource<T> implements MessageSource<T> {
    private final String grpcEncoding;
    private final ProtoAdapter<T> messageAdapter;
    private final BufferedSource source;

    public GrpcMessageSource(BufferedSource source, ProtoAdapter<T> messageAdapter, String str) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(messageAdapter, "messageAdapter");
        this.source = source;
        this.messageAdapter = messageAdapter;
        this.grpcEncoding = str;
    }

    public /* synthetic */ GrpcMessageSource(BufferedSource bufferedSource, ProtoAdapter protoAdapter, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bufferedSource, protoAdapter, (i & 4) != 0 ? null : str);
    }

    @Override // com.squareup.wire.MessageSource
    public T read() throws IOException {
        GrpcDecoder grpcDecoding;
        if (this.source.exhausted()) {
            return null;
        }
        byte b = this.source.readByte();
        if (b == 0) {
            grpcDecoding = GrpcDecoder.IdentityGrpcDecoder.INSTANCE;
        } else if (b == 1) {
            String str = this.grpcEncoding;
            if (str == null || (grpcDecoding = GrpcDecoder2.toGrpcDecoding(str)) == null) {
                throw new ProtocolException("message is encoded but message-encoding header was omitted");
            }
        } else {
            throw new ProtocolException("unexpected compressed-flag: " + ((int) b));
        }
        BufferedSource bufferedSourceBuffer = Okio.buffer(grpcDecoding.decode(new Buffer().write(this.source, this.source.readInt() & 4294967295L)));
        try {
            T tDecode = this.messageAdapter.decode(bufferedSourceBuffer);
            bufferedSourceBuffer.close();
            return tDecode;
        } catch (Throwable th) {
            try {
                bufferedSourceBuffer.close();
            } catch (Throwable th2) {
                ExceptionsKt.addSuppressed(th, th2);
            }
            throw th;
        }
    }

    public final T readExactlyOneAndClose() throws IOException {
        try {
            T t = read();
            if (t == null) {
                throw new ProtocolException("expected 1 message but got none");
            }
            if (read() == null) {
                close();
                return t;
            }
            throw new ProtocolException("expected 1 message but got multiple");
        } catch (Throwable th) {
            try {
                close();
            } catch (Throwable th2) {
                ExceptionsKt.addSuppressed(th, th2);
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.source.close();
    }
}
