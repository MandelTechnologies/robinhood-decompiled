package com.robinhood.android.diagnostics.p100io;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import okio.ByteString;

/* compiled from: ProtoStreamWriting.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/diagnostics/io/RealProtoStreamWriter;", "E", "", "Lcom/robinhood/android/diagnostics/io/ProtoStreamWriter;", "sink", "Lokio/BufferedSink;", "adapter", "Lcom/squareup/wire/ProtoAdapter;", "<init>", "(Lokio/BufferedSink;Lcom/squareup/wire/ProtoAdapter;)V", "writer", "Lcom/squareup/wire/ProtoWriter;", "write", "", "value", "(Ljava/lang/Object;)V", "flush", "close", "lib-diagnostics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.diagnostics.io.RealProtoStreamWriter, reason: use source file name */
/* loaded from: classes16.dex */
public final class ProtoStreamWriting5<E> implements ProtoStreamWriting2<E> {
    private final ProtoAdapter<? super E> adapter;
    private final BufferedSink sink;
    private final ProtoWriter writer;

    public ProtoStreamWriting5(BufferedSink sink, ProtoAdapter<? super E> adapter) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.sink = sink;
        this.adapter = adapter;
        this.writer = new ProtoWriter(sink);
    }

    @Override // com.robinhood.android.diagnostics.p100io.ProtoStreamWriting2
    public void write(E value) throws IOException {
        Intrinsics.checkNotNullParameter(value, "value");
        ByteString byteStringEncodeByteString = this.adapter.encodeByteString(value);
        ProtoWriter protoWriter = this.writer;
        protoWriter.writeTag(1, FieldEncoding.LENGTH_DELIMITED);
        protoWriter.writeVarint32(byteStringEncodeByteString.size());
        protoWriter.writeBytes(byteStringEncodeByteString);
    }

    @Override // com.robinhood.android.diagnostics.p100io.ProtoStreamWriting2
    public void flush() throws IOException {
        this.sink.flush();
    }

    @Override // java.lang.AutoCloseable
    public void close() throws IOException {
        this.sink.close();
    }
}
