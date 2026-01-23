package com.robinhood.cbc.service.tax_lot.p283v1;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: OrderEarmarkRequest.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&BS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001d\u001a\u00020\u0002H\u0017J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0004H\u0016JR\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006'"}, m3636d2 = {"Lcom/robinhood/cbc/service/tax_lot/v1/OrderEarmarkRequest;", "Lcom/squareup/wire/Message;", "", "account_number", "", "order_id", "Lokio/ByteString;", "instrument_id", "disposal_method", "Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethod;", "selected_lots", "", "Lcom/robinhood/cbc/service/tax_lot/v1/TaxLotSelection;", "instrument_type", "Lcom/robinhood/cbc/service/tax_lot/v1/InstrumentType;", "unknownFields", "<init>", "(Ljava/lang/String;Lokio/ByteString;Lokio/ByteString;Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethod;Ljava/util/List;Lcom/robinhood/cbc/service/tax_lot/v1/InstrumentType;Lokio/ByteString;)V", "getAccount_number", "()Ljava/lang/String;", "getOrder_id", "()Lokio/ByteString;", "getInstrument_id", "getDisposal_method", "()Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethod;", "getInstrument_type", "()Lcom/robinhood/cbc/service/tax_lot/v1/InstrumentType;", "getSelected_lots", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "cbc.tax_lots_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class OrderEarmarkRequest extends Message {

    @JvmField
    public static final ProtoAdapter<OrderEarmarkRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_number;

    @WireField(adapter = "com.robinhood.cbc.service.tax_lot.v1.DisposalMethod#ADAPTER", jsonName = "disposalMethod", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 3)
    private final DisposalMethod disposal_method;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 5)
    private final ByteString instrument_id;

    @WireField(adapter = "com.robinhood.cbc.service.tax_lot.v1.InstrumentType#ADAPTER", jsonName = "instrumentType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final InstrumentType instrument_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "orderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ByteString order_id;

    @WireField(adapter = "com.robinhood.cbc.service.tax_lot.v1.TaxLotSelection#ADAPTER", jsonName = "selectedLots", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 4)
    private final List<TaxLotSelection> selected_lots;

    public OrderEarmarkRequest() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20235newBuilder();
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public /* synthetic */ OrderEarmarkRequest(String str, ByteString byteString, ByteString byteString2, DisposalMethod disposalMethod, List list, InstrumentType instrumentType, ByteString byteString3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.EMPTY : byteString, (i & 4) != 0 ? ByteString.EMPTY : byteString2, (i & 8) != 0 ? DisposalMethod.METHOD_UNSPECIFIED : disposalMethod, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? InstrumentType.TYPE_UNSPECIFIED : instrumentType, (i & 64) != 0 ? ByteString.EMPTY : byteString3);
    }

    public final ByteString getOrder_id() {
        return this.order_id;
    }

    public final ByteString getInstrument_id() {
        return this.instrument_id;
    }

    public final DisposalMethod getDisposal_method() {
        return this.disposal_method;
    }

    public final InstrumentType getInstrument_type() {
        return this.instrument_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderEarmarkRequest(String account_number, ByteString order_id, ByteString instrument_id, DisposalMethod disposal_method, List<TaxLotSelection> selected_lots, InstrumentType instrument_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(disposal_method, "disposal_method");
        Intrinsics.checkNotNullParameter(selected_lots, "selected_lots");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_number = account_number;
        this.order_id = order_id;
        this.instrument_id = instrument_id;
        this.disposal_method = disposal_method;
        this.instrument_type = instrument_type;
        this.selected_lots = Internal.immutableCopyOf("selected_lots", selected_lots);
    }

    public final List<TaxLotSelection> getSelected_lots() {
        return this.selected_lots;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20235newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OrderEarmarkRequest)) {
            return false;
        }
        OrderEarmarkRequest orderEarmarkRequest = (OrderEarmarkRequest) other;
        return Intrinsics.areEqual(unknownFields(), orderEarmarkRequest.unknownFields()) && Intrinsics.areEqual(this.account_number, orderEarmarkRequest.account_number) && Intrinsics.areEqual(this.order_id, orderEarmarkRequest.order_id) && Intrinsics.areEqual(this.instrument_id, orderEarmarkRequest.instrument_id) && this.disposal_method == orderEarmarkRequest.disposal_method && Intrinsics.areEqual(this.selected_lots, orderEarmarkRequest.selected_lots) && this.instrument_type == orderEarmarkRequest.instrument_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.account_number.hashCode()) * 37) + this.order_id.hashCode()) * 37) + this.instrument_id.hashCode()) * 37) + this.disposal_method.hashCode()) * 37) + this.selected_lots.hashCode()) * 37) + this.instrument_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("order_id=" + this.order_id);
        arrayList.add("instrument_id=" + this.instrument_id);
        arrayList.add("disposal_method=" + this.disposal_method);
        if (!this.selected_lots.isEmpty()) {
            arrayList.add("selected_lots=" + this.selected_lots);
        }
        arrayList.add("instrument_type=" + this.instrument_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "OrderEarmarkRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ OrderEarmarkRequest copy$default(OrderEarmarkRequest orderEarmarkRequest, String str, ByteString byteString, ByteString byteString2, DisposalMethod disposalMethod, List list, InstrumentType instrumentType, ByteString byteString3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderEarmarkRequest.account_number;
        }
        if ((i & 2) != 0) {
            byteString = orderEarmarkRequest.order_id;
        }
        if ((i & 4) != 0) {
            byteString2 = orderEarmarkRequest.instrument_id;
        }
        if ((i & 8) != 0) {
            disposalMethod = orderEarmarkRequest.disposal_method;
        }
        if ((i & 16) != 0) {
            list = orderEarmarkRequest.selected_lots;
        }
        if ((i & 32) != 0) {
            instrumentType = orderEarmarkRequest.instrument_type;
        }
        if ((i & 64) != 0) {
            byteString3 = orderEarmarkRequest.unknownFields();
        }
        InstrumentType instrumentType2 = instrumentType;
        ByteString byteString4 = byteString3;
        List list2 = list;
        ByteString byteString5 = byteString2;
        return orderEarmarkRequest.copy(str, byteString, byteString5, disposalMethod, list2, instrumentType2, byteString4);
    }

    public final OrderEarmarkRequest copy(String account_number, ByteString order_id, ByteString instrument_id, DisposalMethod disposal_method, List<TaxLotSelection> selected_lots, InstrumentType instrument_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(disposal_method, "disposal_method");
        Intrinsics.checkNotNullParameter(selected_lots, "selected_lots");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OrderEarmarkRequest(account_number, order_id, instrument_id, disposal_method, selected_lots, instrument_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderEarmarkRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OrderEarmarkRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.cbc.service.tax_lot.v1.OrderEarmarkRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OrderEarmarkRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_number());
                }
                ByteString order_id = value.getOrder_id();
                ByteString byteString = ByteString.EMPTY;
                if (!Intrinsics.areEqual(order_id, byteString)) {
                    size += ProtoAdapter.BYTES.encodedSizeWithTag(2, value.getOrder_id());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), byteString)) {
                    size += ProtoAdapter.BYTES.encodedSizeWithTag(5, value.getInstrument_id());
                }
                if (value.getDisposal_method() != DisposalMethod.METHOD_UNSPECIFIED) {
                    size += DisposalMethod.ADAPTER.encodedSizeWithTag(3, value.getDisposal_method());
                }
                int iEncodedSizeWithTag = size + TaxLotSelection.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getSelected_lots());
                return value.getInstrument_type() != InstrumentType.TYPE_UNSPECIFIED ? iEncodedSizeWithTag + InstrumentType.ADAPTER.encodedSizeWithTag(6, value.getInstrument_type()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OrderEarmarkRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
                }
                ByteString order_id = value.getOrder_id();
                ByteString byteString = ByteString.EMPTY;
                if (!Intrinsics.areEqual(order_id, byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 2, (int) value.getOrder_id());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 5, (int) value.getInstrument_id());
                }
                if (value.getDisposal_method() != DisposalMethod.METHOD_UNSPECIFIED) {
                    DisposalMethod.ADAPTER.encodeWithTag(writer, 3, (int) value.getDisposal_method());
                }
                TaxLotSelection.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getSelected_lots());
                if (value.getInstrument_type() != InstrumentType.TYPE_UNSPECIFIED) {
                    InstrumentType.ADAPTER.encodeWithTag(writer, 6, (int) value.getInstrument_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OrderEarmarkRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getInstrument_type() != InstrumentType.TYPE_UNSPECIFIED) {
                    InstrumentType.ADAPTER.encodeWithTag(writer, 6, (int) value.getInstrument_type());
                }
                TaxLotSelection.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getSelected_lots());
                if (value.getDisposal_method() != DisposalMethod.METHOD_UNSPECIFIED) {
                    DisposalMethod.ADAPTER.encodeWithTag(writer, 3, (int) value.getDisposal_method());
                }
                ByteString instrument_id = value.getInstrument_id();
                ByteString byteString = ByteString.EMPTY;
                if (!Intrinsics.areEqual(instrument_id, byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 5, (int) value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getOrder_id(), byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 2, (int) value.getOrder_id());
                }
                if (Intrinsics.areEqual(value.getAccount_number(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public OrderEarmarkRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ByteString byteString = ByteString.EMPTY;
                DisposalMethod disposalMethod = DisposalMethod.METHOD_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                InstrumentType instrumentType = InstrumentType.TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                InstrumentType instrumentTypeDecode = instrumentType;
                String strDecode = "";
                ByteString byteStringDecode = byteString;
                DisposalMethod disposalMethodDecode = disposalMethod;
                ByteString byteStringDecode2 = byteStringDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                byteStringDecode2 = ProtoAdapter.BYTES.decode(reader);
                                break;
                            case 3:
                                try {
                                    disposalMethodDecode = DisposalMethod.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 4:
                                arrayList.add(TaxLotSelection.ADAPTER.decode(reader));
                                break;
                            case 5:
                                byteStringDecode = ProtoAdapter.BYTES.decode(reader);
                                break;
                            case 6:
                                try {
                                    instrumentTypeDecode = InstrumentType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new OrderEarmarkRequest(strDecode, byteStringDecode2, byteStringDecode, disposalMethodDecode, arrayList, instrumentTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OrderEarmarkRequest redact(OrderEarmarkRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return OrderEarmarkRequest.copy$default(value, null, null, null, null, Internal.m26823redactElements(value.getSelected_lots(), TaxLotSelection.ADAPTER), null, ByteString.EMPTY, 47, null);
            }
        };
    }
}
