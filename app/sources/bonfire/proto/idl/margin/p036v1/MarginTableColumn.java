package bonfire.proto.idl.margin.p036v1;

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
import rh_server_driven_ui.p531v1.TableColumnAlignment;

/* compiled from: MarginTableColumn.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0014\u001a\u00020\u0002H\u0017J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u0006H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J5\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u001cR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/MarginTableColumn;", "Lcom/squareup/wire/Message;", "", "id", "", "width", "", "alignment", "Lrh_server_driven_ui/v1/TableColumnAlignment;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lrh_server_driven_ui/v1/TableColumnAlignment;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAlignment", "()Lrh_server_driven_ui/v1/TableColumnAlignment;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Lrh_server_driven_ui/v1/TableColumnAlignment;Lokio/ByteString;)Lbonfire/proto/idl/margin/v1/MarginTableColumn;", "Companion", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class MarginTableColumn extends Message {

    @JvmField
    public static final ProtoAdapter<MarginTableColumn> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.TableColumnAlignment#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final TableColumnAlignment alignment;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 1, tag = 2)
    private final Integer width;

    public MarginTableColumn() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m9012newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public /* synthetic */ MarginTableColumn(String str, Integer num, TableColumnAlignment tableColumnAlignment, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? TableColumnAlignment.LEFT_UNSPECIFIED : tableColumnAlignment, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Integer getWidth() {
        return this.width;
    }

    public final TableColumnAlignment getAlignment() {
        return this.alignment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginTableColumn(String id, Integer num, TableColumnAlignment alignment, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.width = num;
        this.alignment = alignment;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m9012newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MarginTableColumn)) {
            return false;
        }
        MarginTableColumn marginTableColumn = (MarginTableColumn) other;
        return Intrinsics.areEqual(unknownFields(), marginTableColumn.unknownFields()) && Intrinsics.areEqual(this.id, marginTableColumn.id) && Intrinsics.areEqual(this.width, marginTableColumn.width) && this.alignment == marginTableColumn.alignment;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37;
        Integer num = this.width;
        int iHashCode2 = ((iHashCode + (num != null ? num.hashCode() : 0)) * 37) + this.alignment.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        Integer num = this.width;
        if (num != null) {
            arrayList.add("width=" + num);
        }
        arrayList.add("alignment=" + this.alignment);
        return CollectionsKt.joinToString$default(arrayList, ", ", "MarginTableColumn{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ MarginTableColumn copy$default(MarginTableColumn marginTableColumn, String str, Integer num, TableColumnAlignment tableColumnAlignment, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marginTableColumn.id;
        }
        if ((i & 2) != 0) {
            num = marginTableColumn.width;
        }
        if ((i & 4) != 0) {
            tableColumnAlignment = marginTableColumn.alignment;
        }
        if ((i & 8) != 0) {
            byteString = marginTableColumn.unknownFields();
        }
        return marginTableColumn.copy(str, num, tableColumnAlignment, byteString);
    }

    public final MarginTableColumn copy(String id, Integer width, TableColumnAlignment alignment, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MarginTableColumn(id, width, alignment, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MarginTableColumn.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MarginTableColumn>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.margin.v1.MarginTableColumn$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MarginTableColumn value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                int iEncodedSizeWithTag = size + ProtoAdapter.INT32.encodedSizeWithTag(2, value.getWidth());
                return value.getAlignment() != TableColumnAlignment.LEFT_UNSPECIFIED ? iEncodedSizeWithTag + TableColumnAlignment.ADAPTER.encodedSizeWithTag(3, value.getAlignment()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MarginTableColumn value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) value.getWidth());
                if (value.getAlignment() != TableColumnAlignment.LEFT_UNSPECIFIED) {
                    TableColumnAlignment.ADAPTER.encodeWithTag(writer, 3, (int) value.getAlignment());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MarginTableColumn value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAlignment() != TableColumnAlignment.LEFT_UNSPECIFIED) {
                    TableColumnAlignment.ADAPTER.encodeWithTag(writer, 3, (int) value.getAlignment());
                }
                ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) value.getWidth());
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MarginTableColumn decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                TableColumnAlignment tableColumnAlignmentDecode = TableColumnAlignment.LEFT_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Integer numDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new MarginTableColumn(strDecode, numDecode, tableColumnAlignmentDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        numDecode = ProtoAdapter.INT32.decode(reader);
                    } else if (iNextTag == 3) {
                        try {
                            tableColumnAlignmentDecode = TableColumnAlignment.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MarginTableColumn redact(MarginTableColumn value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return MarginTableColumn.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }
}
