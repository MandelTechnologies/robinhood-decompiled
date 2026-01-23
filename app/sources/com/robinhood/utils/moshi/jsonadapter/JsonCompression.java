package com.robinhood.utils.moshi.jsonadapter;

import com.squareup.moshi.JsonAdapter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.GzipSink;
import okio.GzipSource;
import okio.Okio;

/* compiled from: JsonCompression.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u0001H\u0002¢\u0006\u0002\u0010\u0005\u001a%\u0010\u0006\u001a\u0004\u0018\u0001H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"toCompressedJson", "", "T", "Lcom/squareup/moshi/JsonAdapter;", "value", "(Lcom/squareup/moshi/JsonAdapter;Ljava/lang/Object;)[B", "fromCompressedJson", "bytes", "(Lcom/squareup/moshi/JsonAdapter;[B)Ljava/lang/Object;", "lib-serialization-utils_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.moshi.jsonadapter.JsonCompressionKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class JsonCompression {
    public static final <T> byte[] toCompressedJson(JsonAdapter<T> jsonAdapter, T t) {
        Intrinsics.checkNotNullParameter(jsonAdapter, "<this>");
        Buffer buffer = new Buffer();
        BufferedSink bufferedSinkBuffer = Okio.buffer(new GzipSink(buffer));
        try {
            jsonAdapter.toJson(bufferedSinkBuffer, (BufferedSink) t);
            Unit unit = Unit.INSTANCE;
            Closeable.closeFinally(bufferedSinkBuffer, null);
            return buffer.readByteArray();
        } finally {
        }
    }

    public static final <T> T fromCompressedJson(JsonAdapter<T> jsonAdapter, byte[] bytes) {
        Intrinsics.checkNotNullParameter(jsonAdapter, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Buffer buffer = new Buffer();
        buffer.write(bytes);
        BufferedSource bufferedSourceBuffer = Okio.buffer(new GzipSource(buffer));
        try {
            T tFromJson = jsonAdapter.fromJson(bufferedSourceBuffer);
            Closeable.closeFinally(bufferedSourceBuffer, null);
            return tFromJson;
        } finally {
        }
    }
}
