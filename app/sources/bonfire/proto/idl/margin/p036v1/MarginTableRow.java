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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: MarginTableRow.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016JP\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017¨\u0006#"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/MarginTableRow;", "Lcom/squareup/wire/Message;", "", "instrument_id", "", "instrument_symbol", "items", "", "Lbonfire/proto/idl/margin/v1/MarginTableItem;", "child_rows", "Lbonfire/proto/idl/margin/v1/MarginTableChildRow;", "on_click_action", "Lbonfire/proto/idl/margin/v1/MaintenanceTableAction;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lbonfire/proto/idl/margin/v1/MaintenanceTableAction;Lokio/ByteString;)V", "getInstrument_id", "()Ljava/lang/String;", "getInstrument_symbol", "getOn_click_action", "()Lbonfire/proto/idl/margin/v1/MaintenanceTableAction;", "getItems", "()Ljava/util/List;", "getChild_rows", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class MarginTableRow extends Message {

    @JvmField
    public static final ProtoAdapter<MarginTableRow> ADAPTER;

    @WireField(adapter = "bonfire.proto.idl.margin.v1.MarginTableChildRow#ADAPTER", jsonName = "childRows", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<MarginTableChildRow> child_rows;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String instrument_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentSymbol", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String instrument_symbol;

    @WireField(adapter = "bonfire.proto.idl.margin.v1.MarginTableItem#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<MarginTableItem> items;

    @WireField(adapter = "bonfire.proto.idl.margin.v1.MaintenanceTableAction#ADAPTER", jsonName = "onClickAction", schemaIndex = 4, tag = 5)
    private final MaintenanceTableAction on_click_action;

    public MarginTableRow() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ MarginTableRow(String str, String str2, List list, List list2, MaintenanceTableAction maintenanceTableAction, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? CollectionsKt.emptyList() : list2, (i & 16) != 0 ? null : maintenanceTableAction, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m9015newBuilder();
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public final String getInstrument_symbol() {
        return this.instrument_symbol;
    }

    public final MaintenanceTableAction getOn_click_action() {
        return this.on_click_action;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginTableRow(String instrument_id, String instrument_symbol, List<MarginTableItem> items, List<MarginTableChildRow> child_rows, MaintenanceTableAction maintenanceTableAction, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(instrument_symbol, "instrument_symbol");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(child_rows, "child_rows");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.instrument_id = instrument_id;
        this.instrument_symbol = instrument_symbol;
        this.on_click_action = maintenanceTableAction;
        this.items = Internal.immutableCopyOf("items", items);
        this.child_rows = Internal.immutableCopyOf("child_rows", child_rows);
    }

    public final List<MarginTableItem> getItems() {
        return this.items;
    }

    public final List<MarginTableChildRow> getChild_rows() {
        return this.child_rows;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m9015newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MarginTableRow)) {
            return false;
        }
        MarginTableRow marginTableRow = (MarginTableRow) other;
        return Intrinsics.areEqual(unknownFields(), marginTableRow.unknownFields()) && Intrinsics.areEqual(this.instrument_id, marginTableRow.instrument_id) && Intrinsics.areEqual(this.instrument_symbol, marginTableRow.instrument_symbol) && Intrinsics.areEqual(this.items, marginTableRow.items) && Intrinsics.areEqual(this.child_rows, marginTableRow.child_rows) && Intrinsics.areEqual(this.on_click_action, marginTableRow.on_click_action);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.instrument_id.hashCode()) * 37) + this.instrument_symbol.hashCode()) * 37) + this.items.hashCode()) * 37) + this.child_rows.hashCode()) * 37;
        MaintenanceTableAction maintenanceTableAction = this.on_click_action;
        int iHashCode2 = iHashCode + (maintenanceTableAction != null ? maintenanceTableAction.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        arrayList.add("instrument_symbol=" + Internal.sanitize(this.instrument_symbol));
        if (!this.items.isEmpty()) {
            arrayList.add("items=" + this.items);
        }
        if (!this.child_rows.isEmpty()) {
            arrayList.add("child_rows=" + this.child_rows);
        }
        MaintenanceTableAction maintenanceTableAction = this.on_click_action;
        if (maintenanceTableAction != null) {
            arrayList.add("on_click_action=" + maintenanceTableAction);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MarginTableRow{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ MarginTableRow copy$default(MarginTableRow marginTableRow, String str, String str2, List list, List list2, MaintenanceTableAction maintenanceTableAction, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marginTableRow.instrument_id;
        }
        if ((i & 2) != 0) {
            str2 = marginTableRow.instrument_symbol;
        }
        if ((i & 4) != 0) {
            list = marginTableRow.items;
        }
        if ((i & 8) != 0) {
            list2 = marginTableRow.child_rows;
        }
        if ((i & 16) != 0) {
            maintenanceTableAction = marginTableRow.on_click_action;
        }
        if ((i & 32) != 0) {
            byteString = marginTableRow.unknownFields();
        }
        MaintenanceTableAction maintenanceTableAction2 = maintenanceTableAction;
        ByteString byteString2 = byteString;
        return marginTableRow.copy(str, str2, list, list2, maintenanceTableAction2, byteString2);
    }

    public final MarginTableRow copy(String instrument_id, String instrument_symbol, List<MarginTableItem> items, List<MarginTableChildRow> child_rows, MaintenanceTableAction on_click_action, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(instrument_symbol, "instrument_symbol");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(child_rows, "child_rows");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MarginTableRow(instrument_id, instrument_symbol, items, child_rows, on_click_action, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MarginTableRow.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MarginTableRow>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.margin.v1.MarginTableRow$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MarginTableRow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getInstrument_symbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getInstrument_symbol());
                }
                return size + MarginTableItem.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getItems()) + MarginTableChildRow.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getChild_rows()) + MaintenanceTableAction.ADAPTER.encodedSizeWithTag(5, value.getOn_click_action());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MarginTableRow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getInstrument_symbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getInstrument_symbol());
                }
                MarginTableItem.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getItems());
                MarginTableChildRow.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getChild_rows());
                MaintenanceTableAction.ADAPTER.encodeWithTag(writer, 5, (int) value.getOn_click_action());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MarginTableRow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                MaintenanceTableAction.ADAPTER.encodeWithTag(writer, 5, (int) value.getOn_click_action());
                MarginTableChildRow.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getChild_rows());
                MarginTableItem.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getItems());
                if (!Intrinsics.areEqual(value.getInstrument_symbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getInstrument_symbol());
                }
                if (Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInstrument_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MarginTableRow decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                MaintenanceTableAction maintenanceTableActionDecode = null;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new MarginTableRow(strDecode, strDecode2, arrayList, arrayList2, maintenanceTableActionDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        arrayList.add(MarginTableItem.ADAPTER.decode(reader));
                    } else if (iNextTag == 4) {
                        arrayList2.add(MarginTableChildRow.ADAPTER.decode(reader));
                    } else if (iNextTag == 5) {
                        maintenanceTableActionDecode = MaintenanceTableAction.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MarginTableRow redact(MarginTableRow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List listM26823redactElements = Internal.m26823redactElements(value.getItems(), MarginTableItem.ADAPTER);
                List listM26823redactElements2 = Internal.m26823redactElements(value.getChild_rows(), MarginTableChildRow.ADAPTER);
                MaintenanceTableAction on_click_action = value.getOn_click_action();
                return MarginTableRow.copy$default(value, null, null, listM26823redactElements, listM26823redactElements2, on_click_action != null ? MaintenanceTableAction.ADAPTER.redact(on_click_action) : null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
