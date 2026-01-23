package com.squareup.wire;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.OutputStream;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;

/* compiled from: Message.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 '*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0000*\u0014\b\u0001\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u00020\u0004:\u0002&'B\u001f\b\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u0016\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0017J\u000b\u0010\u0018\u001a\u00028\u0000¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0004J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u0006\u0010\u001e\u001a\u00020\"J\u0006\u0010#\u001a\u00020\bJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020%R\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068G¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000bR\u001c\u0010\u0007\u001a\u00020\b8WX\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u0007\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0012\u0010\u0015\u001a\u00020\u00108\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000¨\u0006("}, m3636d2 = {"Lcom/squareup/wire/Message;", "M", "B", "Lcom/squareup/wire/Message$Builder;", "Ljava/io/Serializable;", "adapter", "Lcom/squareup/wire/ProtoAdapter;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/wire/ProtoAdapter;Lokio/ByteString;)V", "()Lcom/squareup/wire/ProtoAdapter;", "unknownFields$annotations", "()V", "()Lokio/ByteString;", "cachedSerializedSize", "", "getCachedSerializedSize$wire_runtime", "()I", "setCachedSerializedSize$wire_runtime", "(I)V", "hashCode", "newBuilder", "()Lcom/squareup/wire/Message$Builder;", "withoutUnknownFields", "()Lcom/squareup/wire/Message;", "toString", "", "writeReplace", "", "encode", "", "sink", "Lokio/BufferedSink;", "", "encodeByteString", "stream", "Ljava/io/OutputStream;", "Builder", "Companion", "wire-runtime"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public abstract class Message<M extends Message<M, B>, B extends Builder<M, B>> implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;
    private final transient ProtoAdapter<M> adapter;
    private transient int cachedSerializedSize;

    @JvmField
    protected transient int hashCode;
    private final transient ByteString unknownFields;

    public static /* synthetic */ void unknownFields$annotations() {
    }

    public abstract B newBuilder();

    protected Message(ProtoAdapter<M> adapter, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.adapter = adapter;
        this.unknownFields = unknownFields;
    }

    @JvmName
    public final ProtoAdapter<M> adapter() {
        return this.adapter;
    }

    @JvmName
    public ByteString unknownFields() {
        ByteString byteString = this.unknownFields;
        return byteString == null ? ByteString.EMPTY : byteString;
    }

    /* renamed from: getCachedSerializedSize$wire_runtime, reason: from getter */
    public final int getCachedSerializedSize() {
        return this.cachedSerializedSize;
    }

    public final void setCachedSerializedSize$wire_runtime(int i) {
        this.cachedSerializedSize = i;
    }

    public final M withoutUnknownFields() {
        return (M) newBuilder().clearUnknownFields().build();
    }

    public String toString() {
        ProtoAdapter<M> protoAdapter = this.adapter;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type M of com.squareup.wire.Message");
        return protoAdapter.toString(this);
    }

    protected final Object writeReplace() throws ObjectStreamException {
        byte[] bArrEncode = encode();
        Class<?> cls = getClass();
        Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<M of com.squareup.wire.Message>");
        return new MessageSerializedForm(bArrEncode, cls);
    }

    public final void encode(BufferedSink sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        ProtoAdapter<M> protoAdapter = this.adapter;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type M of com.squareup.wire.Message");
        protoAdapter.encode(sink, (BufferedSink) this);
    }

    public final byte[] encode() {
        ProtoAdapter<M> protoAdapter = this.adapter;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type M of com.squareup.wire.Message");
        return protoAdapter.encode(this);
    }

    public final ByteString encodeByteString() {
        ProtoAdapter<M> protoAdapter = this.adapter;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type M of com.squareup.wire.Message");
        return protoAdapter.encodeByteString(this);
    }

    public final void encode(OutputStream stream) throws IOException {
        Intrinsics.checkNotNullParameter(stream, "stream");
        ProtoAdapter<M> protoAdapter = this.adapter;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type M of com.squareup.wire.Message");
        protoAdapter.encode(stream, (OutputStream) this);
    }

    /* compiled from: Message.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b&\u0018\u0000*\u0014\b\u0002\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0002*\u0014\b\u0003\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00002\u00020\u0004B\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\u0006\u0010\u001a\u001a\u00020\bJ,\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0004J\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0000J\u0006\u0010\"\u001a\u00020\bJ\r\u0010#\u001a\u00028\u0002H&¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020&H\u0002R\u001a\u0010\u0007\u001a\u00020\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006'"}, m3636d2 = {"Lcom/squareup/wire/Message$Builder;", "M", "Lcom/squareup/wire/Message;", "B", "", "<init>", "()V", "unknownFieldsByteString", "Lokio/ByteString;", "getUnknownFieldsByteString$wire_runtime", "()Lokio/ByteString;", "setUnknownFieldsByteString$wire_runtime", "(Lokio/ByteString;)V", "unknownFieldsBuffer", "Lokio/Buffer;", "getUnknownFieldsBuffer$wire_runtime", "()Lokio/Buffer;", "setUnknownFieldsBuffer$wire_runtime", "(Lokio/Buffer;)V", "unknownFieldsWriter", "Lcom/squareup/wire/ProtoWriter;", "getUnknownFieldsWriter$wire_runtime", "()Lcom/squareup/wire/ProtoWriter;", "setUnknownFieldsWriter$wire_runtime", "(Lcom/squareup/wire/ProtoWriter;)V", "addUnknownFields", "unknownFields", "addUnknownField", "tag", "", "fieldEncoding", "Lcom/squareup/wire/FieldEncoding;", "value", "clearUnknownFields", "buildUnknownFields", "build", "()Lcom/squareup/wire/Message;", "prepareForNewUnknownFields", "", "wire-runtime"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static abstract class Builder<M extends Message<M, B>, B extends Builder<M, B>> {
        private transient Buffer unknownFieldsBuffer;
        private transient ByteString unknownFieldsByteString = ByteString.EMPTY;
        private transient ProtoWriter unknownFieldsWriter;

        public abstract M build();

        protected Builder() {
        }

        /* renamed from: getUnknownFieldsByteString$wire_runtime, reason: from getter */
        public final ByteString getUnknownFieldsByteString() {
            return this.unknownFieldsByteString;
        }

        public final void setUnknownFieldsByteString$wire_runtime(ByteString byteString) {
            Intrinsics.checkNotNullParameter(byteString, "<set-?>");
            this.unknownFieldsByteString = byteString;
        }

        /* renamed from: getUnknownFieldsBuffer$wire_runtime, reason: from getter */
        public final Buffer getUnknownFieldsBuffer() {
            return this.unknownFieldsBuffer;
        }

        public final void setUnknownFieldsBuffer$wire_runtime(Buffer buffer) {
            this.unknownFieldsBuffer = buffer;
        }

        /* renamed from: getUnknownFieldsWriter$wire_runtime, reason: from getter */
        public final ProtoWriter getUnknownFieldsWriter() {
            return this.unknownFieldsWriter;
        }

        public final void setUnknownFieldsWriter$wire_runtime(ProtoWriter protoWriter) {
            this.unknownFieldsWriter = protoWriter;
        }

        public final Builder<M, B> addUnknownFields(ByteString unknownFields) throws IOException {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            if (unknownFields.size() > 0) {
                prepareForNewUnknownFields();
                ProtoWriter protoWriter = this.unknownFieldsWriter;
                Intrinsics.checkNotNull(protoWriter);
                protoWriter.writeBytes(unknownFields);
            }
            return this;
        }

        public final Builder<M, B> addUnknownField(int tag, FieldEncoding fieldEncoding, Object value) throws IOException {
            Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
            prepareForNewUnknownFields();
            ProtoAdapter<?> protoAdapterRawProtoAdapter = fieldEncoding.rawProtoAdapter();
            Intrinsics.checkNotNull(protoAdapterRawProtoAdapter, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
            ProtoWriter protoWriter = this.unknownFieldsWriter;
            Intrinsics.checkNotNull(protoWriter);
            protoAdapterRawProtoAdapter.encodeWithTag(protoWriter, tag, (int) value);
            return this;
        }

        public final Builder<M, B> clearUnknownFields() {
            this.unknownFieldsByteString = ByteString.EMPTY;
            Buffer buffer = this.unknownFieldsBuffer;
            if (buffer != null) {
                Intrinsics.checkNotNull(buffer);
                buffer.clear();
                this.unknownFieldsBuffer = null;
            }
            this.unknownFieldsWriter = null;
            return this;
        }

        public final ByteString buildUnknownFields() {
            Buffer buffer = this.unknownFieldsBuffer;
            if (buffer != null) {
                Intrinsics.checkNotNull(buffer);
                this.unknownFieldsByteString = buffer.readByteString();
                this.unknownFieldsBuffer = null;
                this.unknownFieldsWriter = null;
            }
            return this.unknownFieldsByteString;
        }

        private final void prepareForNewUnknownFields() throws IOException {
            if (this.unknownFieldsBuffer == null) {
                this.unknownFieldsBuffer = new Buffer();
                Buffer buffer = this.unknownFieldsBuffer;
                Intrinsics.checkNotNull(buffer);
                ProtoWriter protoWriter = new ProtoWriter(buffer);
                this.unknownFieldsWriter = protoWriter;
                Intrinsics.checkNotNull(protoWriter);
                protoWriter.writeBytes(this.unknownFieldsByteString);
                this.unknownFieldsByteString = ByteString.EMPTY;
            }
        }
    }

    /* compiled from: Message.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003¨\u0006\u0007"}, m3636d2 = {"Lcom/squareup/wire/Message$Companion;", "", "<init>", "()V", "serialVersionUID", "", "getSerialVersionUID$annotations", "wire-runtime"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static /* synthetic */ void getSerialVersionUID$annotations() {
        }

        private Companion() {
        }
    }
}
