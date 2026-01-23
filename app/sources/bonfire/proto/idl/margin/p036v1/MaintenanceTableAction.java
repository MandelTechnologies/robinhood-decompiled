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
import rh_server_driven_ui.p531v1.GenericAction;

/* compiled from: MaintenanceTableAction.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J4\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/MaintenanceTableAction;", "Lcom/squareup/wire/Message;", "", "generic", "Lrh_server_driven_ui/v1/GenericAction;", "table_sort", "Lbonfire/proto/idl/margin/v1/TableSortAction;", "view_instrument", "Lbonfire/proto/idl/margin/v1/ViewInstrumentAction;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/GenericAction;Lbonfire/proto/idl/margin/v1/TableSortAction;Lbonfire/proto/idl/margin/v1/ViewInstrumentAction;Lokio/ByteString;)V", "getGeneric", "()Lrh_server_driven_ui/v1/GenericAction;", "getTable_sort", "()Lbonfire/proto/idl/margin/v1/TableSortAction;", "getView_instrument", "()Lbonfire/proto/idl/margin/v1/ViewInstrumentAction;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class MaintenanceTableAction extends Message {

    @JvmField
    public static final ProtoAdapter<MaintenanceTableAction> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.GenericAction#ADAPTER", oneofName = "concrete", schemaIndex = 0, tag = 1)
    private final GenericAction generic;

    @WireField(adapter = "bonfire.proto.idl.margin.v1.TableSortAction#ADAPTER", jsonName = "tableSort", oneofName = "concrete", schemaIndex = 1, tag = 2)
    private final TableSortAction table_sort;

    @WireField(adapter = "bonfire.proto.idl.margin.v1.ViewInstrumentAction#ADAPTER", jsonName = "viewInstrument", oneofName = "concrete", schemaIndex = 2, tag = 3)
    private final ViewInstrumentAction view_instrument;

    public MaintenanceTableAction() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m9008newBuilder();
    }

    public final GenericAction getGeneric() {
        return this.generic;
    }

    public final TableSortAction getTable_sort() {
        return this.table_sort;
    }

    public final ViewInstrumentAction getView_instrument() {
        return this.view_instrument;
    }

    public /* synthetic */ MaintenanceTableAction(GenericAction genericAction, TableSortAction tableSortAction, ViewInstrumentAction viewInstrumentAction, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : genericAction, (i & 2) != 0 ? null : tableSortAction, (i & 4) != 0 ? null : viewInstrumentAction, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaintenanceTableAction(GenericAction genericAction, TableSortAction tableSortAction, ViewInstrumentAction viewInstrumentAction, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.generic = genericAction;
        this.table_sort = tableSortAction;
        this.view_instrument = viewInstrumentAction;
        if (Internal.countNonNull(genericAction, tableSortAction, viewInstrumentAction) > 1) {
            throw new IllegalArgumentException("At most one of generic, table_sort, view_instrument may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m9008newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MaintenanceTableAction)) {
            return false;
        }
        MaintenanceTableAction maintenanceTableAction = (MaintenanceTableAction) other;
        return Intrinsics.areEqual(unknownFields(), maintenanceTableAction.unknownFields()) && Intrinsics.areEqual(this.generic, maintenanceTableAction.generic) && Intrinsics.areEqual(this.table_sort, maintenanceTableAction.table_sort) && Intrinsics.areEqual(this.view_instrument, maintenanceTableAction.view_instrument);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        GenericAction genericAction = this.generic;
        int iHashCode2 = (iHashCode + (genericAction != null ? genericAction.hashCode() : 0)) * 37;
        TableSortAction tableSortAction = this.table_sort;
        int iHashCode3 = (iHashCode2 + (tableSortAction != null ? tableSortAction.hashCode() : 0)) * 37;
        ViewInstrumentAction viewInstrumentAction = this.view_instrument;
        int iHashCode4 = iHashCode3 + (viewInstrumentAction != null ? viewInstrumentAction.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        GenericAction genericAction = this.generic;
        if (genericAction != null) {
            arrayList.add("generic=" + genericAction);
        }
        TableSortAction tableSortAction = this.table_sort;
        if (tableSortAction != null) {
            arrayList.add("table_sort=" + tableSortAction);
        }
        ViewInstrumentAction viewInstrumentAction = this.view_instrument;
        if (viewInstrumentAction != null) {
            arrayList.add("view_instrument=" + viewInstrumentAction);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MaintenanceTableAction{", "}", 0, null, null, 56, null);
    }

    public final MaintenanceTableAction copy(GenericAction generic, TableSortAction table_sort, ViewInstrumentAction view_instrument, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MaintenanceTableAction(generic, table_sort, view_instrument, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MaintenanceTableAction.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MaintenanceTableAction>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.margin.v1.MaintenanceTableAction$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MaintenanceTableAction value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + GenericAction.ADAPTER.encodedSizeWithTag(1, value.getGeneric()) + TableSortAction.ADAPTER.encodedSizeWithTag(2, value.getTable_sort()) + ViewInstrumentAction.ADAPTER.encodedSizeWithTag(3, value.getView_instrument());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MaintenanceTableAction value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                GenericAction.ADAPTER.encodeWithTag(writer, 1, (int) value.getGeneric());
                TableSortAction.ADAPTER.encodeWithTag(writer, 2, (int) value.getTable_sort());
                ViewInstrumentAction.ADAPTER.encodeWithTag(writer, 3, (int) value.getView_instrument());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MaintenanceTableAction value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ViewInstrumentAction.ADAPTER.encodeWithTag(writer, 3, (int) value.getView_instrument());
                TableSortAction.ADAPTER.encodeWithTag(writer, 2, (int) value.getTable_sort());
                GenericAction.ADAPTER.encodeWithTag(writer, 1, (int) value.getGeneric());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MaintenanceTableAction redact(MaintenanceTableAction value) {
                Intrinsics.checkNotNullParameter(value, "value");
                GenericAction generic = value.getGeneric();
                GenericAction genericActionRedact = generic != null ? GenericAction.ADAPTER.redact(generic) : null;
                TableSortAction table_sort = value.getTable_sort();
                TableSortAction tableSortActionRedact = table_sort != null ? TableSortAction.ADAPTER.redact(table_sort) : null;
                ViewInstrumentAction view_instrument = value.getView_instrument();
                return value.copy(genericActionRedact, tableSortActionRedact, view_instrument != null ? ViewInstrumentAction.ADAPTER.redact(view_instrument) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MaintenanceTableAction decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                GenericAction genericActionDecode = null;
                TableSortAction tableSortActionDecode = null;
                ViewInstrumentAction viewInstrumentActionDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new MaintenanceTableAction(genericActionDecode, tableSortActionDecode, viewInstrumentActionDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        genericActionDecode = GenericAction.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        tableSortActionDecode = TableSortAction.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        viewInstrumentActionDecode = ViewInstrumentAction.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
