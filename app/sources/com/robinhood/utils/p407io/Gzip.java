package com.robinhood.utils.p407io;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.GzipSink;
import okio.GzipSource;
import okio.Okio;

/* compiled from: Gzip.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0003"}, m3636d2 = {"compressWithGzip", "Lokio/ByteString;", "decompressWithGzip", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.io.GzipKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Gzip {
    public static final ByteString compressWithGzip(ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Buffer buffer = new Buffer();
        BufferedSink bufferedSinkBuffer = Okio.buffer(new GzipSink(buffer));
        try {
            bufferedSinkBuffer.write(byteString);
            Closeable.closeFinally(bufferedSinkBuffer, null);
            return buffer.readByteString();
        } finally {
        }
    }

    public static final ByteString decompressWithGzip(ByteString byteString) throws IOException {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Buffer buffer = new Buffer();
        buffer.write(byteString);
        BufferedSource bufferedSourceBuffer = Okio.buffer(new GzipSource(buffer));
        try {
            ByteString byteString2 = bufferedSourceBuffer.readByteString();
            Closeable.closeFinally(bufferedSourceBuffer, null);
            return byteString2;
        } finally {
        }
    }
}
