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

/* compiled from: MarginTableChildRow.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB-\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J,\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/MarginTableChildRow;", "Lcom/squareup/wire/Message;", "", "items", "", "Lbonfire/proto/idl/margin/v1/MarginTableItem;", "on_click_action", "Lbonfire/proto/idl/margin/v1/MaintenanceTableAction;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lbonfire/proto/idl/margin/v1/MaintenanceTableAction;Lokio/ByteString;)V", "getOn_click_action", "()Lbonfire/proto/idl/margin/v1/MaintenanceTableAction;", "getItems", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class MarginTableChildRow extends Message {

    @JvmField
    public static final ProtoAdapter<MarginTableChildRow> ADAPTER;

    @WireField(adapter = "bonfire.proto.idl.margin.v1.MarginTableItem#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<MarginTableItem> items;

    @WireField(adapter = "bonfire.proto.idl.margin.v1.MaintenanceTableAction#ADAPTER", jsonName = "onClickAction", schemaIndex = 1, tag = 2)
    private final MaintenanceTableAction on_click_action;

    public MarginTableChildRow() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m9010newBuilder();
    }

    public /* synthetic */ MarginTableChildRow(List list, MaintenanceTableAction maintenanceTableAction, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : maintenanceTableAction, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final MaintenanceTableAction getOn_click_action() {
        return this.on_click_action;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginTableChildRow(List<MarginTableItem> items, MaintenanceTableAction maintenanceTableAction, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.on_click_action = maintenanceTableAction;
        this.items = Internal.immutableCopyOf("items", items);
    }

    public final List<MarginTableItem> getItems() {
        return this.items;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m9010newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MarginTableChildRow)) {
            return false;
        }
        MarginTableChildRow marginTableChildRow = (MarginTableChildRow) other;
        return Intrinsics.areEqual(unknownFields(), marginTableChildRow.unknownFields()) && Intrinsics.areEqual(this.items, marginTableChildRow.items) && Intrinsics.areEqual(this.on_click_action, marginTableChildRow.on_click_action);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.items.hashCode()) * 37;
        MaintenanceTableAction maintenanceTableAction = this.on_click_action;
        int iHashCode2 = iHashCode + (maintenanceTableAction != null ? maintenanceTableAction.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.items.isEmpty()) {
            arrayList.add("items=" + this.items);
        }
        MaintenanceTableAction maintenanceTableAction = this.on_click_action;
        if (maintenanceTableAction != null) {
            arrayList.add("on_click_action=" + maintenanceTableAction);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MarginTableChildRow{", "}", 0, null, null, 56, null);
    }

    public final MarginTableChildRow copy(List<MarginTableItem> items, MaintenanceTableAction on_click_action, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MarginTableChildRow(items, on_click_action, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MarginTableChildRow.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MarginTableChildRow>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.margin.v1.MarginTableChildRow$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MarginTableChildRow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + MarginTableItem.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getItems()) + MaintenanceTableAction.ADAPTER.encodedSizeWithTag(2, value.getOn_click_action());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MarginTableChildRow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                MarginTableItem.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getItems());
                MaintenanceTableAction.ADAPTER.encodeWithTag(writer, 2, (int) value.getOn_click_action());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MarginTableChildRow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                MaintenanceTableAction.ADAPTER.encodeWithTag(writer, 2, (int) value.getOn_click_action());
                MarginTableItem.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getItems());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MarginTableChildRow decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                MaintenanceTableAction maintenanceTableActionDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new MarginTableChildRow(arrayList, maintenanceTableActionDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(MarginTableItem.ADAPTER.decode(reader));
                    } else if (iNextTag == 2) {
                        maintenanceTableActionDecode = MaintenanceTableAction.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MarginTableChildRow redact(MarginTableChildRow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List<MarginTableItem> listM26823redactElements = Internal.m26823redactElements(value.getItems(), MarginTableItem.ADAPTER);
                MaintenanceTableAction on_click_action = value.getOn_click_action();
                return value.copy(listM26823redactElements, on_click_action != null ? MaintenanceTableAction.ADAPTER.redact(on_click_action) : null, ByteString.EMPTY);
            }
        };
    }
}
