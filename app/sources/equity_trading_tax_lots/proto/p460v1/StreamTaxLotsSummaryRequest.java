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

/* compiled from: StreamTaxLotsSummaryRequest.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J:\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSummaryRequest;", "Lcom/squareup/wire/Message;", "", "rhs_account_number", "", "order_id", "instrument_id", "lot_status", "Lequity_trading_tax_lots/proto/v1/TaxLotStatus;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lequity_trading_tax_lots/proto/v1/TaxLotStatus;Lokio/ByteString;)V", "getRhs_account_number", "()Ljava/lang/String;", "getOrder_id", "getInstrument_id", "getLot_status", "()Lequity_trading_tax_lots/proto/v1/TaxLotStatus;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class StreamTaxLotsSummaryRequest extends Message {

    @JvmField
    public static final ProtoAdapter<StreamTaxLotsSummaryRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String instrument_id;

    @WireField(adapter = "equity_trading_tax_lots.proto.v1.TaxLotStatus#ADAPTER", jsonName = "lotStatus", schemaIndex = 3, tag = 4)
    private final TaxLotStatus lot_status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String order_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rhsAccountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String rhs_account_number;

    public StreamTaxLotsSummaryRequest() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ StreamTaxLotsSummaryRequest(String str, String str2, String str3, TaxLotStatus taxLotStatus, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : taxLotStatus, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28070newBuilder();
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

    public final TaxLotStatus getLot_status() {
        return this.lot_status;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamTaxLotsSummaryRequest(String rhs_account_number, String order_id, String instrument_id, TaxLotStatus taxLotStatus, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.rhs_account_number = rhs_account_number;
        this.order_id = order_id;
        this.instrument_id = instrument_id;
        this.lot_status = taxLotStatus;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28070newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamTaxLotsSummaryRequest)) {
            return false;
        }
        StreamTaxLotsSummaryRequest streamTaxLotsSummaryRequest = (StreamTaxLotsSummaryRequest) other;
        return Intrinsics.areEqual(unknownFields(), streamTaxLotsSummaryRequest.unknownFields()) && Intrinsics.areEqual(this.rhs_account_number, streamTaxLotsSummaryRequest.rhs_account_number) && Intrinsics.areEqual(this.order_id, streamTaxLotsSummaryRequest.order_id) && Intrinsics.areEqual(this.instrument_id, streamTaxLotsSummaryRequest.instrument_id) && this.lot_status == streamTaxLotsSummaryRequest.lot_status;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.rhs_account_number.hashCode()) * 37) + this.order_id.hashCode()) * 37) + this.instrument_id.hashCode()) * 37;
        TaxLotStatus taxLotStatus = this.lot_status;
        int iHashCode2 = iHashCode + (taxLotStatus != null ? taxLotStatus.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("rhs_account_number=" + Internal.sanitize(this.rhs_account_number));
        arrayList.add("order_id=" + Internal.sanitize(this.order_id));
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        TaxLotStatus taxLotStatus = this.lot_status;
        if (taxLotStatus != null) {
            arrayList.add("lot_status=" + taxLotStatus);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamTaxLotsSummaryRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ StreamTaxLotsSummaryRequest copy$default(StreamTaxLotsSummaryRequest streamTaxLotsSummaryRequest, String str, String str2, String str3, TaxLotStatus taxLotStatus, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = streamTaxLotsSummaryRequest.rhs_account_number;
        }
        if ((i & 2) != 0) {
            str2 = streamTaxLotsSummaryRequest.order_id;
        }
        if ((i & 4) != 0) {
            str3 = streamTaxLotsSummaryRequest.instrument_id;
        }
        if ((i & 8) != 0) {
            taxLotStatus = streamTaxLotsSummaryRequest.lot_status;
        }
        if ((i & 16) != 0) {
            byteString = streamTaxLotsSummaryRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str4 = str3;
        return streamTaxLotsSummaryRequest.copy(str, str2, str4, taxLotStatus, byteString2);
    }

    public final StreamTaxLotsSummaryRequest copy(String rhs_account_number, String order_id, String instrument_id, TaxLotStatus lot_status, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamTaxLotsSummaryRequest(rhs_account_number, order_id, instrument_id, lot_status, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamTaxLotsSummaryRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamTaxLotsSummaryRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: equity_trading_tax_lots.proto.v1.StreamTaxLotsSummaryRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamTaxLotsSummaryRequest value) {
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
                return size + TaxLotStatus.ADAPTER.encodedSizeWithTag(4, value.getLot_status());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamTaxLotsSummaryRequest value) throws IOException {
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
                TaxLotStatus.ADAPTER.encodeWithTag(writer, 4, (int) value.getLot_status());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamTaxLotsSummaryRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                TaxLotStatus.ADAPTER.encodeWithTag(writer, 4, (int) value.getLot_status());
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getOrder_id());
                }
                if (Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRhs_account_number());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamTaxLotsSummaryRequest redact(StreamTaxLotsSummaryRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return StreamTaxLotsSummaryRequest.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public StreamTaxLotsSummaryRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                TaxLotStatus taxLotStatusDecode = null;
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new StreamTaxLotsSummaryRequest(strDecode3, strDecode, strDecode2, taxLotStatusDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        try {
                            taxLotStatusDecode = TaxLotStatus.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
