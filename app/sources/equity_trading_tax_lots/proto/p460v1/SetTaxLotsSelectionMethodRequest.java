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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: SetTaxLotsSelectionMethodRequest.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JD\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u001f"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/SetTaxLotsSelectionMethodRequest;", "Lcom/squareup/wire/Message;", "", "rhs_account_number", "", "order_id", "instrument_id", "selection_strategy", "Lequity_trading_tax_lots/proto/v1/SelectionStrategy;", "quantity", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lequity_trading_tax_lots/proto/v1/SelectionStrategy;Ljava/lang/String;Lokio/ByteString;)V", "getRhs_account_number", "()Ljava/lang/String;", "getOrder_id", "getInstrument_id", "getSelection_strategy", "()Lequity_trading_tax_lots/proto/v1/SelectionStrategy;", "getQuantity", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class SetTaxLotsSelectionMethodRequest extends Message {

    @JvmField
    public static final ProtoAdapter<SetTaxLotsSelectionMethodRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String instrument_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String order_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 6)
    private final String quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rhsAccountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String rhs_account_number;

    @WireField(adapter = "equity_trading_tax_lots.proto.v1.SelectionStrategy#ADAPTER", jsonName = "selectionStrategy", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final SelectionStrategy selection_strategy;

    public SetTaxLotsSelectionMethodRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ SetTaxLotsSelectionMethodRequest(String str, String str2, String str3, SelectionStrategy selectionStrategy, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? SelectionStrategy.SELECTION_STRATEGY_UNSPECIFIED : selectionStrategy, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28053newBuilder();
    }

    public final String getRhs_account_number() {
        return this.rhs_account_number;
    }

    public final String getOrder_id() {
        return this.order_id;
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public final SelectionStrategy getSelection_strategy() {
        return this.selection_strategy;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetTaxLotsSelectionMethodRequest(String rhs_account_number, String order_id, String instrument_id, SelectionStrategy selection_strategy, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(selection_strategy, "selection_strategy");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.rhs_account_number = rhs_account_number;
        this.order_id = order_id;
        this.instrument_id = instrument_id;
        this.selection_strategy = selection_strategy;
        this.quantity = str;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28053newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SetTaxLotsSelectionMethodRequest)) {
            return false;
        }
        SetTaxLotsSelectionMethodRequest setTaxLotsSelectionMethodRequest = (SetTaxLotsSelectionMethodRequest) other;
        return Intrinsics.areEqual(unknownFields(), setTaxLotsSelectionMethodRequest.unknownFields()) && Intrinsics.areEqual(this.rhs_account_number, setTaxLotsSelectionMethodRequest.rhs_account_number) && Intrinsics.areEqual(this.order_id, setTaxLotsSelectionMethodRequest.order_id) && Intrinsics.areEqual(this.instrument_id, setTaxLotsSelectionMethodRequest.instrument_id) && this.selection_strategy == setTaxLotsSelectionMethodRequest.selection_strategy && Intrinsics.areEqual(this.quantity, setTaxLotsSelectionMethodRequest.quantity);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.rhs_account_number.hashCode()) * 37) + this.order_id.hashCode()) * 37) + this.instrument_id.hashCode()) * 37) + this.selection_strategy.hashCode()) * 37;
        String str = this.quantity;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("rhs_account_number=" + Internal.sanitize(this.rhs_account_number));
        arrayList.add("order_id=" + Internal.sanitize(this.order_id));
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        arrayList.add("selection_strategy=" + this.selection_strategy);
        String str = this.quantity;
        if (str != null) {
            arrayList.add("quantity=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetTaxLotsSelectionMethodRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SetTaxLotsSelectionMethodRequest copy$default(SetTaxLotsSelectionMethodRequest setTaxLotsSelectionMethodRequest, String str, String str2, String str3, SelectionStrategy selectionStrategy, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setTaxLotsSelectionMethodRequest.rhs_account_number;
        }
        if ((i & 2) != 0) {
            str2 = setTaxLotsSelectionMethodRequest.order_id;
        }
        if ((i & 4) != 0) {
            str3 = setTaxLotsSelectionMethodRequest.instrument_id;
        }
        if ((i & 8) != 0) {
            selectionStrategy = setTaxLotsSelectionMethodRequest.selection_strategy;
        }
        if ((i & 16) != 0) {
            str4 = setTaxLotsSelectionMethodRequest.quantity;
        }
        if ((i & 32) != 0) {
            byteString = setTaxLotsSelectionMethodRequest.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        return setTaxLotsSelectionMethodRequest.copy(str, str2, str3, selectionStrategy, str5, byteString2);
    }

    public final SetTaxLotsSelectionMethodRequest copy(String rhs_account_number, String order_id, String instrument_id, SelectionStrategy selection_strategy, String quantity, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(selection_strategy, "selection_strategy");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SetTaxLotsSelectionMethodRequest(rhs_account_number, order_id, instrument_id, selection_strategy, quantity, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SetTaxLotsSelectionMethodRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SetTaxLotsSelectionMethodRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: equity_trading_tax_lots.proto.v1.SetTaxLotsSelectionMethodRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SetTaxLotsSelectionMethodRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getRhs_account_number());
                }
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getOrder_id());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getInstrument_id());
                }
                if (value.getSelection_strategy() != SelectionStrategy.SELECTION_STRATEGY_UNSPECIFIED) {
                    size += SelectionStrategy.ADAPTER.encodedSizeWithTag(4, value.getSelection_strategy());
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getQuantity());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SetTaxLotsSelectionMethodRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRhs_account_number());
                }
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getOrder_id());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getInstrument_id());
                }
                if (value.getSelection_strategy() != SelectionStrategy.SELECTION_STRATEGY_UNSPECIFIED) {
                    SelectionStrategy.ADAPTER.encodeWithTag(writer, 4, (int) value.getSelection_strategy());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getQuantity());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SetTaxLotsSelectionMethodRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 6, (int) value.getQuantity());
                if (value.getSelection_strategy() != SelectionStrategy.SELECTION_STRATEGY_UNSPECIFIED) {
                    SelectionStrategy.ADAPTER.encodeWithTag(writer, 4, (int) value.getSelection_strategy());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getOrder_id());
                }
                if (Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getRhs_account_number());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SetTaxLotsSelectionMethodRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                SelectionStrategy selectionStrategy = SelectionStrategy.SELECTION_STRATEGY_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = null;
                SelectionStrategy selectionStrategyDecode = selectionStrategy;
                String strDecode4 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SetTaxLotsSelectionMethodRequest(strDecode4, strDecode, strDecode2, selectionStrategyDecode, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        try {
                            selectionStrategyDecode = SelectionStrategy.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 6) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SetTaxLotsSelectionMethodRequest redact(SetTaxLotsSelectionMethodRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return SetTaxLotsSelectionMethodRequest.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
            }
        };
    }
}
