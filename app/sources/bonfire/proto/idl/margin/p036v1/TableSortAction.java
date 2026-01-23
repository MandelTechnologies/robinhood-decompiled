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

/* compiled from: TableSortAction.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/TableSortAction;", "Lcom/squareup/wire/Message;", "", "sort_by", "", "sort_direction", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getSort_by", "()Ljava/lang/String;", "getSort_direction", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class TableSortAction extends Message {

    @JvmField
    public static final ProtoAdapter<TableSortAction> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sortBy", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String sort_by;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sortDirection", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String sort_direction;

    public TableSortAction() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ TableSortAction(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m9018newBuilder();
    }

    public final String getSort_by() {
        return this.sort_by;
    }

    public final String getSort_direction() {
        return this.sort_direction;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TableSortAction(String sort_by, String sort_direction, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(sort_by, "sort_by");
        Intrinsics.checkNotNullParameter(sort_direction, "sort_direction");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.sort_by = sort_by;
        this.sort_direction = sort_direction;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m9018newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TableSortAction)) {
            return false;
        }
        TableSortAction tableSortAction = (TableSortAction) other;
        return Intrinsics.areEqual(unknownFields(), tableSortAction.unknownFields()) && Intrinsics.areEqual(this.sort_by, tableSortAction.sort_by) && Intrinsics.areEqual(this.sort_direction, tableSortAction.sort_direction);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.sort_by.hashCode()) * 37) + this.sort_direction.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("sort_by=" + Internal.sanitize(this.sort_by));
        arrayList.add("sort_direction=" + Internal.sanitize(this.sort_direction));
        return CollectionsKt.joinToString$default(arrayList, ", ", "TableSortAction{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TableSortAction copy$default(TableSortAction tableSortAction, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tableSortAction.sort_by;
        }
        if ((i & 2) != 0) {
            str2 = tableSortAction.sort_direction;
        }
        if ((i & 4) != 0) {
            byteString = tableSortAction.unknownFields();
        }
        return tableSortAction.copy(str, str2, byteString);
    }

    public final TableSortAction copy(String sort_by, String sort_direction, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(sort_by, "sort_by");
        Intrinsics.checkNotNullParameter(sort_direction, "sort_direction");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TableSortAction(sort_by, sort_direction, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TableSortAction.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TableSortAction>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.margin.v1.TableSortAction$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TableSortAction value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getSort_by(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getSort_by());
                }
                return !Intrinsics.areEqual(value.getSort_direction(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSort_direction()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TableSortAction value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getSort_by(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSort_by());
                }
                if (!Intrinsics.areEqual(value.getSort_direction(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSort_direction());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TableSortAction value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getSort_direction(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSort_direction());
                }
                if (Intrinsics.areEqual(value.getSort_by(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSort_by());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TableSortAction redact(TableSortAction value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return TableSortAction.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TableSortAction decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new TableSortAction(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
