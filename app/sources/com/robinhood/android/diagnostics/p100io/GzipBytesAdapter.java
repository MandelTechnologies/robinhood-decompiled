package com.robinhood.android.diagnostics.p100io;

import com.robinhood.utils.p407io.Gzip;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.Syntax;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: GzipBytesAdapter.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/diagnostics/io/GzipBytesAdapter;", "Lcom/squareup/wire/ProtoAdapter;", "Lokio/ByteString;", "delegate", "<init>", "(Lcom/squareup/wire/ProtoAdapter;)V", "encodedSize", "", "value", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "", "lib-diagnostics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class GzipBytesAdapter extends ProtoAdapter<ByteString> {
    private final ProtoAdapter<ByteString> delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GzipBytesAdapter(ProtoAdapter<ByteString> delegate) {
        super(FieldEncoding.LENGTH_DELIMITED, (KClass<?>) Reflection.getOrCreateKotlinClass(ByteString.class), (String) null, Syntax.PROTO_2, ByteString.EMPTY);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(ByteString value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return this.delegate.encodedSize(Gzip.compressWithGzip(value));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, ByteString value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        this.delegate.encode(writer, (ProtoWriter) Gzip.compressWithGzip(value));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public ByteString decode(ProtoReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return Gzip.decompressWithGzip(this.delegate.decode(reader));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public Void redact(ByteString value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new UnsupportedOperationException();
    }
}
