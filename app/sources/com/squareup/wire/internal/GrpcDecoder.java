package com.squareup.wire.internal;

import com.robinhood.utils.http.ContentEncoding;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.BufferedSource;
import okio.GzipSource;
import okio.Source;

/* compiled from: GrpcDecoder.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/squareup/wire/internal/GrpcDecoder;", "", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "decode", "Lokio/Source;", "source", "Lokio/BufferedSource;", "IdentityGrpcDecoder", "GzipGrpcDecoder", "Lcom/squareup/wire/internal/GrpcDecoder$GzipGrpcDecoder;", "Lcom/squareup/wire/internal/GrpcDecoder$IdentityGrpcDecoder;", "wire-grpc-client"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class GrpcDecoder {
    private final String name;

    public /* synthetic */ GrpcDecoder(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public abstract Source decode(BufferedSource source);

    private GrpcDecoder(String str) {
        this.name = str;
    }

    public final String getName() {
        return this.name;
    }

    /* compiled from: GrpcDecoder.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m3636d2 = {"Lcom/squareup/wire/internal/GrpcDecoder$IdentityGrpcDecoder;", "Lcom/squareup/wire/internal/GrpcDecoder;", "<init>", "()V", "decode", "Lokio/BufferedSource;", "source", "wire-grpc-client"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class IdentityGrpcDecoder extends GrpcDecoder {
        public static final IdentityGrpcDecoder INSTANCE = new IdentityGrpcDecoder();

        @Override // com.squareup.wire.internal.GrpcDecoder
        public BufferedSource decode(BufferedSource source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return source;
        }

        private IdentityGrpcDecoder() {
            super(ContentEncoding.IDENTITY, null);
        }
    }

    /* compiled from: GrpcDecoder.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/squareup/wire/internal/GrpcDecoder$GzipGrpcDecoder;", "Lcom/squareup/wire/internal/GrpcDecoder;", "<init>", "()V", "decode", "Lokio/Source;", "source", "Lokio/BufferedSource;", "wire-grpc-client"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class GzipGrpcDecoder extends GrpcDecoder {
        public static final GzipGrpcDecoder INSTANCE = new GzipGrpcDecoder();

        private GzipGrpcDecoder() {
            super(ContentEncoding.GZIP, null);
        }

        @Override // com.squareup.wire.internal.GrpcDecoder
        public Source decode(BufferedSource source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new GzipSource(source);
        }
    }
}
