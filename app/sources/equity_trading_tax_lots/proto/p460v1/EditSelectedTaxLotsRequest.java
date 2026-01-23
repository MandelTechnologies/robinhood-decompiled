package equity_trading_tax_lots.proto.p460v1;

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

/* compiled from: EditSelectedTaxLotsRequest.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!BI\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0018\u001a\u00020\u0002H\u0017J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0007H\u0016JH\u0010 \u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\""}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/EditSelectedTaxLotsRequest;", "Lcom/squareup/wire/Message;", "", "tax_lots_selection", "", "Lequity_trading_tax_lots/proto/v1/TaxLotSelection;", "order_id", "", "instrument_id", "rhs_account_number", "action", "Lequity_trading_tax_lots/proto/v1/SelectionAction;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lequity_trading_tax_lots/proto/v1/SelectionAction;Lokio/ByteString;)V", "getOrder_id", "()Ljava/lang/String;", "getInstrument_id", "getRhs_account_number", "getAction", "()Lequity_trading_tax_lots/proto/v1/SelectionAction;", "getTax_lots_selection", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class EditSelectedTaxLotsRequest extends Message {

    @JvmField
    public static final ProtoAdapter<EditSelectedTaxLotsRequest> ADAPTER;

    @WireField(adapter = "equity_trading_tax_lots.proto.v1.SelectionAction#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final SelectionAction action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String instrument_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String order_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rhsAccountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String rhs_account_number;

    @WireField(adapter = "equity_trading_tax_lots.proto.v1.TaxLotSelection#ADAPTER", jsonName = "taxLotsSelection", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<TaxLotSelection> tax_lots_selection;

    public EditSelectedTaxLotsRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28031newBuilder();
    }

    public /* synthetic */ EditSelectedTaxLotsRequest(List list, String str, String str2, String str3, SelectionAction selectionAction, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? SelectionAction.SELECTION_ACTION_UNSPECIFIED : selectionAction, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getOrder_id() {
        return this.order_id;
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public final String getRhs_account_number() {
        return this.rhs_account_number;
    }

    public final SelectionAction getAction() {
        return this.action;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditSelectedTaxLotsRequest(List<TaxLotSelection> tax_lots_selection, String order_id, String instrument_id, String rhs_account_number, SelectionAction action, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(tax_lots_selection, "tax_lots_selection");
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.order_id = order_id;
        this.instrument_id = instrument_id;
        this.rhs_account_number = rhs_account_number;
        this.action = action;
        this.tax_lots_selection = Internal.immutableCopyOf("tax_lots_selection", tax_lots_selection);
    }

    public final List<TaxLotSelection> getTax_lots_selection() {
        return this.tax_lots_selection;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28031newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof EditSelectedTaxLotsRequest)) {
            return false;
        }
        EditSelectedTaxLotsRequest editSelectedTaxLotsRequest = (EditSelectedTaxLotsRequest) other;
        return Intrinsics.areEqual(unknownFields(), editSelectedTaxLotsRequest.unknownFields()) && Intrinsics.areEqual(this.tax_lots_selection, editSelectedTaxLotsRequest.tax_lots_selection) && Intrinsics.areEqual(this.order_id, editSelectedTaxLotsRequest.order_id) && Intrinsics.areEqual(this.instrument_id, editSelectedTaxLotsRequest.instrument_id) && Intrinsics.areEqual(this.rhs_account_number, editSelectedTaxLotsRequest.rhs_account_number) && this.action == editSelectedTaxLotsRequest.action;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.tax_lots_selection.hashCode()) * 37) + this.order_id.hashCode()) * 37) + this.instrument_id.hashCode()) * 37) + this.rhs_account_number.hashCode()) * 37) + this.action.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.tax_lots_selection.isEmpty()) {
            arrayList.add("tax_lots_selection=" + this.tax_lots_selection);
        }
        arrayList.add("order_id=" + Internal.sanitize(this.order_id));
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        arrayList.add("rhs_account_number=" + Internal.sanitize(this.rhs_account_number));
        arrayList.add("action=" + this.action);
        return CollectionsKt.joinToString$default(arrayList, ", ", "EditSelectedTaxLotsRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ EditSelectedTaxLotsRequest copy$default(EditSelectedTaxLotsRequest editSelectedTaxLotsRequest, List list, String str, String str2, String str3, SelectionAction selectionAction, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = editSelectedTaxLotsRequest.tax_lots_selection;
        }
        if ((i & 2) != 0) {
            str = editSelectedTaxLotsRequest.order_id;
        }
        if ((i & 4) != 0) {
            str2 = editSelectedTaxLotsRequest.instrument_id;
        }
        if ((i & 8) != 0) {
            str3 = editSelectedTaxLotsRequest.rhs_account_number;
        }
        if ((i & 16) != 0) {
            selectionAction = editSelectedTaxLotsRequest.action;
        }
        if ((i & 32) != 0) {
            byteString = editSelectedTaxLotsRequest.unknownFields();
        }
        SelectionAction selectionAction2 = selectionAction;
        ByteString byteString2 = byteString;
        return editSelectedTaxLotsRequest.copy(list, str, str2, str3, selectionAction2, byteString2);
    }

    public final EditSelectedTaxLotsRequest copy(List<TaxLotSelection> tax_lots_selection, String order_id, String instrument_id, String rhs_account_number, SelectionAction action, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(tax_lots_selection, "tax_lots_selection");
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new EditSelectedTaxLotsRequest(tax_lots_selection, order_id, instrument_id, rhs_account_number, action, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EditSelectedTaxLotsRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<EditSelectedTaxLotsRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: equity_trading_tax_lots.proto.v1.EditSelectedTaxLotsRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EditSelectedTaxLotsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + TaxLotSelection.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getTax_lots_selection());
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getOrder_id());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getRhs_account_number());
                }
                return value.getAction() != SelectionAction.SELECTION_ACTION_UNSPECIFIED ? size + SelectionAction.ADAPTER.encodedSizeWithTag(5, value.getAction()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, EditSelectedTaxLotsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                TaxLotSelection.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getTax_lots_selection());
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getOrder_id());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getRhs_account_number());
                }
                if (value.getAction() != SelectionAction.SELECTION_ACTION_UNSPECIFIED) {
                    SelectionAction.ADAPTER.encodeWithTag(writer, 5, (int) value.getAction());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EditSelectedTaxLotsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAction() != SelectionAction.SELECTION_ACTION_UNSPECIFIED) {
                    SelectionAction.ADAPTER.encodeWithTag(writer, 5, (int) value.getAction());
                }
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getRhs_account_number());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getOrder_id());
                }
                TaxLotSelection.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getTax_lots_selection());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public EditSelectedTaxLotsRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                SelectionAction selectionActionDecode = SelectionAction.SELECTION_ACTION_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                while (true) {
                    SelectionAction selectionAction = selectionActionDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new EditSelectedTaxLotsRequest(arrayList, strDecode, strDecode2, strDecode3, selectionAction, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            arrayList.add(TaxLotSelection.ADAPTER.decode(reader));
                        } else if (iNextTag == 2) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 4) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 5) {
                            try {
                                selectionActionDecode = SelectionAction.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EditSelectedTaxLotsRequest redact(EditSelectedTaxLotsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return EditSelectedTaxLotsRequest.copy$default(value, Internal.m26823redactElements(value.getTax_lots_selection(), TaxLotSelection.ADAPTER), null, null, null, null, ByteString.EMPTY, 30, null);
            }
        };
    }
}
