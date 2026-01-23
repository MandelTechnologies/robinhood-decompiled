package com.robinhood.idl;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: IDLServiceOptions.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/idl/IDLServiceOptions;", "Lcom/squareup/wire/Message;", "", "backend", "Lcom/robinhood/idl/IDLServiceBackendOptions;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/idl/IDLServiceBackendOptions;Lokio/ByteString;)V", "getBackend", "()Lcom/robinhood/idl/IDLServiceBackendOptions;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "idl.api.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class IDLServiceOptions extends Message {

    @JvmField
    public static final ProtoAdapter<IDLServiceOptions> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.idl.IDLServiceBackendOptions#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final IDLServiceBackendOptions backend;

    /* JADX WARN: Multi-variable type inference failed */
    public IDLServiceOptions() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m22527newBuilder();
    }

    public final IDLServiceBackendOptions getBackend() {
        return this.backend;
    }

    public /* synthetic */ IDLServiceOptions(IDLServiceBackendOptions iDLServiceBackendOptions, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : iDLServiceBackendOptions, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDLServiceOptions(IDLServiceBackendOptions iDLServiceBackendOptions, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.backend = iDLServiceBackendOptions;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m22527newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof IDLServiceOptions)) {
            return false;
        }
        IDLServiceOptions iDLServiceOptions = (IDLServiceOptions) other;
        return Intrinsics.areEqual(unknownFields(), iDLServiceOptions.unknownFields()) && Intrinsics.areEqual(this.backend, iDLServiceOptions.backend);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        IDLServiceBackendOptions iDLServiceBackendOptions = this.backend;
        int iHashCode2 = iHashCode + (iDLServiceBackendOptions != null ? iDLServiceBackendOptions.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        IDLServiceBackendOptions iDLServiceBackendOptions = this.backend;
        if (iDLServiceBackendOptions != null) {
            arrayList.add("backend=" + iDLServiceBackendOptions);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "IDLServiceOptions{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ IDLServiceOptions copy$default(IDLServiceOptions iDLServiceOptions, IDLServiceBackendOptions iDLServiceBackendOptions, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            iDLServiceBackendOptions = iDLServiceOptions.backend;
        }
        if ((i & 2) != 0) {
            byteString = iDLServiceOptions.unknownFields();
        }
        return iDLServiceOptions.copy(iDLServiceBackendOptions, byteString);
    }

    public final IDLServiceOptions copy(IDLServiceBackendOptions backend, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new IDLServiceOptions(backend, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IDLServiceOptions.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<IDLServiceOptions>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.idl.IDLServiceOptions$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(IDLServiceOptions value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getBackend() != null ? size + IDLServiceBackendOptions.ADAPTER.encodedSizeWithTag(1, value.getBackend()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, IDLServiceOptions value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getBackend() != null) {
                    IDLServiceBackendOptions.ADAPTER.encodeWithTag(writer, 1, (int) value.getBackend());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, IDLServiceOptions value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getBackend() != null) {
                    IDLServiceBackendOptions.ADAPTER.encodeWithTag(writer, 1, (int) value.getBackend());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IDLServiceOptions redact(IDLServiceOptions value) {
                Intrinsics.checkNotNullParameter(value, "value");
                IDLServiceBackendOptions backend = value.getBackend();
                return value.copy(backend != null ? IDLServiceBackendOptions.ADAPTER.redact(backend) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public IDLServiceOptions decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                IDLServiceBackendOptions iDLServiceBackendOptionsDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new IDLServiceOptions(iDLServiceBackendOptionsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        iDLServiceBackendOptionsDecode = IDLServiceBackendOptions.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
