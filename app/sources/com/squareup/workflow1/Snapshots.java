package com.squareup.workflow1;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;

/* compiled from: Snapshot.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\f\u001a\u00020\b*\u00020\u0005¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lokio/BufferedSink;", "", "str", "writeUtf8WithLength", "(Lokio/BufferedSink;Ljava/lang/String;)Lokio/BufferedSink;", "Lokio/BufferedSource;", "readUtf8WithLength", "(Lokio/BufferedSource;)Ljava/lang/String;", "Lokio/ByteString;", "bytes", "writeByteStringWithLength", "(Lokio/BufferedSink;Lokio/ByteString;)Lokio/BufferedSink;", "readByteStringWithLength", "(Lokio/BufferedSource;)Lokio/ByteString;", "wf1-workflow-core"}, m3637k = 2, m3638mv = {1, 6, 0}, m3640xi = 48)
@JvmName
/* loaded from: classes12.dex */
public final class Snapshots {
    public static final BufferedSink writeUtf8WithLength(BufferedSink bufferedSink, String str) {
        Intrinsics.checkNotNullParameter(bufferedSink, "<this>");
        Intrinsics.checkNotNullParameter(str, "str");
        return writeByteStringWithLength(bufferedSink, ByteString.INSTANCE.encodeUtf8(str));
    }

    public static final String readUtf8WithLength(BufferedSource bufferedSource) {
        Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        return readByteStringWithLength(bufferedSource).utf8();
    }

    public static final BufferedSink writeByteStringWithLength(BufferedSink bufferedSink, ByteString bytes) throws IOException {
        Intrinsics.checkNotNullParameter(bufferedSink, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        bufferedSink.writeInt(bytes.size()).write(bytes);
        return bufferedSink;
    }

    public static final ByteString readByteStringWithLength(BufferedSource bufferedSource) {
        Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        return bufferedSource.readByteString(bufferedSource.readInt());
    }
}
