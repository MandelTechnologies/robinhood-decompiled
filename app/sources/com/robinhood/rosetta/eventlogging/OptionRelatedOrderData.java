package com.robinhood.rosetta.eventlogging;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
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

/* compiled from: OptionRelatedOrderData.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionRelatedOrderData;", "Lcom/squareup/wire/Message;", "", "related_order_id", "", "relation_type", "Lcom/robinhood/rosetta/eventlogging/OptionOrderRelationType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/OptionOrderRelationType;Lokio/ByteString;)V", "getRelated_order_id", "()Ljava/lang/String;", "getRelation_type", "()Lcom/robinhood/rosetta/eventlogging/OptionOrderRelationType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class OptionRelatedOrderData extends Message {

    @JvmField
    public static final ProtoAdapter<OptionRelatedOrderData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "relatedOrderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String related_order_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.OptionOrderRelationType#ADAPTER", jsonName = "relationType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final OptionOrderRelationType relation_type;

    public OptionRelatedOrderData() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24435newBuilder();
    }

    public final String getRelated_order_id() {
        return this.related_order_id;
    }

    public /* synthetic */ OptionRelatedOrderData(String str, OptionOrderRelationType optionOrderRelationType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? OptionOrderRelationType.OPTION_ORDER_RELATION_TYPE_UNSPECIFIED : optionOrderRelationType, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final OptionOrderRelationType getRelation_type() {
        return this.relation_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionRelatedOrderData(String related_order_id, OptionOrderRelationType relation_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(related_order_id, "related_order_id");
        Intrinsics.checkNotNullParameter(relation_type, "relation_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.related_order_id = related_order_id;
        this.relation_type = relation_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24435newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OptionRelatedOrderData)) {
            return false;
        }
        OptionRelatedOrderData optionRelatedOrderData = (OptionRelatedOrderData) other;
        return Intrinsics.areEqual(unknownFields(), optionRelatedOrderData.unknownFields()) && Intrinsics.areEqual(this.related_order_id, optionRelatedOrderData.related_order_id) && this.relation_type == optionRelatedOrderData.relation_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.related_order_id.hashCode()) * 37) + this.relation_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("related_order_id=" + Internal.sanitize(this.related_order_id));
        arrayList.add("relation_type=" + this.relation_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "OptionRelatedOrderData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ OptionRelatedOrderData copy$default(OptionRelatedOrderData optionRelatedOrderData, String str, OptionOrderRelationType optionOrderRelationType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionRelatedOrderData.related_order_id;
        }
        if ((i & 2) != 0) {
            optionOrderRelationType = optionRelatedOrderData.relation_type;
        }
        if ((i & 4) != 0) {
            byteString = optionRelatedOrderData.unknownFields();
        }
        return optionRelatedOrderData.copy(str, optionOrderRelationType, byteString);
    }

    public final OptionRelatedOrderData copy(String related_order_id, OptionOrderRelationType relation_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(related_order_id, "related_order_id");
        Intrinsics.checkNotNullParameter(relation_type, "relation_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OptionRelatedOrderData(related_order_id, relation_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OptionRelatedOrderData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OptionRelatedOrderData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.OptionRelatedOrderData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OptionRelatedOrderData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getRelated_order_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getRelated_order_id());
                }
                return value.getRelation_type() != OptionOrderRelationType.OPTION_ORDER_RELATION_TYPE_UNSPECIFIED ? size + OptionOrderRelationType.ADAPTER.encodedSizeWithTag(2, value.getRelation_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OptionRelatedOrderData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getRelated_order_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRelated_order_id());
                }
                if (value.getRelation_type() != OptionOrderRelationType.OPTION_ORDER_RELATION_TYPE_UNSPECIFIED) {
                    OptionOrderRelationType.ADAPTER.encodeWithTag(writer, 2, (int) value.getRelation_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OptionRelatedOrderData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getRelation_type() != OptionOrderRelationType.OPTION_ORDER_RELATION_TYPE_UNSPECIFIED) {
                    OptionOrderRelationType.ADAPTER.encodeWithTag(writer, 2, (int) value.getRelation_type());
                }
                if (Intrinsics.areEqual(value.getRelated_order_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRelated_order_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public OptionRelatedOrderData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                OptionOrderRelationType optionOrderRelationTypeDecode = OptionOrderRelationType.OPTION_ORDER_RELATION_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new OptionRelatedOrderData(strDecode, optionOrderRelationTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            optionOrderRelationTypeDecode = OptionOrderRelationType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OptionRelatedOrderData redact(OptionRelatedOrderData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return OptionRelatedOrderData.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
