package com.squareup.wire;

import com.plaid.internal.EnumC7081g;
import com.singular.sdk.internal.Constants;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import okio.ByteString;

/* compiled from: ProtoWriter.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0015\u0010\u0011\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u0012J\u000e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000eJ\u000e\u0010\u0014\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000eJ\u000e\u0010\u0017\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/squareup/wire/ProtoWriter;", "", "sink", "Lokio/BufferedSink;", "<init>", "(Lokio/BufferedSink;)V", "writeBytes", "", "value", "Lokio/ByteString;", "writeString", "", "writeTag", "fieldNumber", "", "fieldEncoding", "Lcom/squareup/wire/FieldEncoding;", "writeSignedVarint32", "writeSignedVarint32$wire_runtime", "writeVarint32", "writeVarint64", "", "writeFixed32", "writeFixed64", "Companion", "wire-runtime"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ProtoWriter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final BufferedSink sink;

    public ProtoWriter(BufferedSink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.sink = sink;
    }

    public final void writeBytes(ByteString value) throws IOException {
        Intrinsics.checkNotNullParameter(value, "value");
        this.sink.write(value);
    }

    public final void writeString(String value) throws IOException {
        Intrinsics.checkNotNullParameter(value, "value");
        this.sink.writeUtf8(value);
    }

    public final void writeTag(int fieldNumber, FieldEncoding fieldEncoding) throws IOException {
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        writeVarint32(INSTANCE.makeTag$wire_runtime(fieldNumber, fieldEncoding));
    }

    public final void writeSignedVarint32$wire_runtime(int value) throws IOException {
        if (value >= 0) {
            writeVarint32(value);
        } else {
            writeVarint64(value);
        }
    }

    public final void writeVarint32(int value) throws IOException {
        while ((value & (-128)) != 0) {
            this.sink.writeByte((value & EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE) | 128);
            value >>>= 7;
        }
        this.sink.writeByte(value);
    }

    public final void writeVarint64(long value) throws IOException {
        while (((-128) & value) != 0) {
            this.sink.writeByte((((int) value) & EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE) | 128);
            value >>>= 7;
        }
        this.sink.writeByte((int) value);
    }

    public final void writeFixed32(int value) throws IOException {
        this.sink.writeIntLe(value);
    }

    public final void writeFixed64(long value) throws IOException {
        this.sink.writeLongLe(value);
    }

    /* compiled from: ProtoWriter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tJ\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\fJ\u0015\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u000fJ\u0015\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0011J\u0015\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u0014J\u0015\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0017J\u0015\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0019J\u0015\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u001bJ\u0015\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u001d¨\u0006\u001e"}, m3636d2 = {"Lcom/squareup/wire/ProtoWriter$Companion;", "", "<init>", "()V", "makeTag", "", "fieldNumber", "fieldEncoding", "Lcom/squareup/wire/FieldEncoding;", "makeTag$wire_runtime", "tagSize", "tag", "tagSize$wire_runtime", "int32Size", "value", "int32Size$wire_runtime", "varint32Size", "varint32Size$wire_runtime", "varint64Size", "", "varint64Size$wire_runtime", "encodeZigZag32", Constants.RequestParamsKeys.APP_NAME_KEY, "encodeZigZag32$wire_runtime", "decodeZigZag32", "decodeZigZag32$wire_runtime", "encodeZigZag64", "encodeZigZag64$wire_runtime", "decodeZigZag64", "decodeZigZag64$wire_runtime", "wire-runtime"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int decodeZigZag32$wire_runtime(int n) {
            return (-(n & 1)) ^ (n >>> 1);
        }

        public final long decodeZigZag64$wire_runtime(long n) {
            return (-(n & 1)) ^ (n >>> 1);
        }

        public final int encodeZigZag32$wire_runtime(int n) {
            return (n >> 31) ^ (n << 1);
        }

        public final long encodeZigZag64$wire_runtime(long n) {
            return (n >> 63) ^ (n << 1);
        }

        public final int varint32Size$wire_runtime(int value) {
            if ((value & (-128)) == 0) {
                return 1;
            }
            if ((value & (-16384)) == 0) {
                return 2;
            }
            if (((-2097152) & value) == 0) {
                return 3;
            }
            return (value & (-268435456)) == 0 ? 4 : 5;
        }

        public final int varint64Size$wire_runtime(long value) {
            if (((-128) & value) == 0) {
                return 1;
            }
            if (((-16384) & value) == 0) {
                return 2;
            }
            if (((-2097152) & value) == 0) {
                return 3;
            }
            if (((-268435456) & value) == 0) {
                return 4;
            }
            if (((-34359738368L) & value) == 0) {
                return 5;
            }
            if (((-4398046511104L) & value) == 0) {
                return 6;
            }
            if (((-562949953421312L) & value) == 0) {
                return 7;
            }
            if (((-72057594037927936L) & value) == 0) {
                return 8;
            }
            return (value & Long.MIN_VALUE) == 0 ? 9 : 10;
        }

        private Companion() {
        }

        public final int makeTag$wire_runtime(int fieldNumber, FieldEncoding fieldEncoding) {
            Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
            return (fieldNumber << 3) | fieldEncoding.getValue();
        }

        public final int tagSize$wire_runtime(int tag) {
            return varint32Size$wire_runtime(makeTag$wire_runtime(tag, FieldEncoding.VARINT));
        }

        public final int int32Size$wire_runtime(int value) {
            if (value >= 0) {
                return varint32Size$wire_runtime(value);
            }
            return 10;
        }
    }
}
