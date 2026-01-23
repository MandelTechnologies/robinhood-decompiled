package com.robinhood.rosetta.mainst;

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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: Metadata.kt */
@kotlin.Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/Metadata;", "Lcom/squareup/wire/Message;", "", "cim_metadata", "Lcom/robinhood/rosetta/mainst/CimMetadata;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/mainst/CimMetadata;Lokio/ByteString;)V", "getCim_metadata", "()Lcom/robinhood/rosetta/mainst/CimMetadata;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class Metadata extends Message {

    @JvmField
    public static final ProtoAdapter<Metadata> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.mainst.CimMetadata#ADAPTER", jsonName = "cimMetadata", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final CimMetadata cim_metadata;

    /* JADX WARN: Multi-variable type inference failed */
    public Metadata() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24671newBuilder();
    }

    public final CimMetadata getCim_metadata() {
        return this.cim_metadata;
    }

    public /* synthetic */ Metadata(CimMetadata cimMetadata, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cimMetadata, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Metadata(CimMetadata cimMetadata, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.cim_metadata = cimMetadata;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24671newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Metadata)) {
            return false;
        }
        Metadata metadata = (Metadata) other;
        return Intrinsics.areEqual(unknownFields(), metadata.unknownFields()) && Intrinsics.areEqual(this.cim_metadata, metadata.cim_metadata);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        CimMetadata cimMetadata = this.cim_metadata;
        int iHashCode2 = iHashCode + (cimMetadata != null ? cimMetadata.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        CimMetadata cimMetadata = this.cim_metadata;
        if (cimMetadata != null) {
            arrayList.add("cim_metadata=" + cimMetadata);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Metadata{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Metadata copy$default(Metadata metadata, CimMetadata cimMetadata, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            cimMetadata = metadata.cim_metadata;
        }
        if ((i & 2) != 0) {
            byteString = metadata.unknownFields();
        }
        return metadata.copy(cimMetadata, byteString);
    }

    public final Metadata copy(CimMetadata cim_metadata, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Metadata(cim_metadata, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Metadata.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Metadata>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.mainst.Metadata$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Metadata value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getCim_metadata() != null ? size + CimMetadata.ADAPTER.encodedSizeWithTag(1, value.getCim_metadata()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Metadata value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getCim_metadata() != null) {
                    CimMetadata.ADAPTER.encodeWithTag(writer, 1, (int) value.getCim_metadata());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Metadata value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getCim_metadata() != null) {
                    CimMetadata.ADAPTER.encodeWithTag(writer, 1, (int) value.getCim_metadata());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Metadata redact(Metadata value) {
                Intrinsics.checkNotNullParameter(value, "value");
                CimMetadata cim_metadata = value.getCim_metadata();
                return value.copy(cim_metadata != null ? CimMetadata.ADAPTER.redact(cim_metadata) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Metadata decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                CimMetadata cimMetadataDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Metadata(cimMetadataDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        cimMetadataDecode = CimMetadata.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
