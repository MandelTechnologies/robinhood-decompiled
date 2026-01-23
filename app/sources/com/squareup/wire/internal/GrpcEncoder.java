package com.squareup.wire.internal;

import com.robinhood.utils.http.ContentEncoding;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.BufferedSink;
import okio.GzipSink;
import okio.Okio;

/* compiled from: GrpcEncoder.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/squareup/wire/internal/GrpcEncoder;", "", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "encode", "Lokio/BufferedSink;", "sink", "IdentityGrpcEncoder", "GzipGrpcEncoder", "Lcom/squareup/wire/internal/GrpcEncoder$GzipGrpcEncoder;", "Lcom/squareup/wire/internal/GrpcEncoder$IdentityGrpcEncoder;", "wire-grpc-client"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class GrpcEncoder {
    private final String name;

    public /* synthetic */ GrpcEncoder(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public abstract BufferedSink encode(BufferedSink sink);

    private GrpcEncoder(String str) {
        this.name = str;
    }

    public final String getName() {
        return this.name;
    }

    /* compiled from: GrpcEncoder.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m3636d2 = {"Lcom/squareup/wire/internal/GrpcEncoder$IdentityGrpcEncoder;", "Lcom/squareup/wire/internal/GrpcEncoder;", "<init>", "()V", "encode", "Lokio/BufferedSink;", "sink", "wire-grpc-client"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class IdentityGrpcEncoder extends GrpcEncoder {
        public static final IdentityGrpcEncoder INSTANCE = new IdentityGrpcEncoder();

        @Override // com.squareup.wire.internal.GrpcEncoder
        public BufferedSink encode(BufferedSink sink) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            return sink;
        }

        private IdentityGrpcEncoder() {
            super(ContentEncoding.IDENTITY, null);
        }
    }

    /* compiled from: GrpcEncoder.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m3636d2 = {"Lcom/squareup/wire/internal/GrpcEncoder$GzipGrpcEncoder;", "Lcom/squareup/wire/internal/GrpcEncoder;", "<init>", "()V", "encode", "Lokio/BufferedSink;", "sink", "wire-grpc-client"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class GzipGrpcEncoder extends GrpcEncoder {
        public static final GzipGrpcEncoder INSTANCE = new GzipGrpcEncoder();

        private GzipGrpcEncoder() {
            super(ContentEncoding.GZIP, null);
        }

        @Override // com.squareup.wire.internal.GrpcEncoder
        public BufferedSink encode(BufferedSink sink) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            return Okio.buffer(new GzipSink(sink));
        }
    }
}
