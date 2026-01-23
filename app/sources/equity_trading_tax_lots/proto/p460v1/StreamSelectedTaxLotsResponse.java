package equity_trading_tax_lots.proto.p460v1;

import com.robinhood.rosetta.common.Money;
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

/* compiled from: StreamSelectedTaxLotsResponse.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%Bc\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001c\u001a\u00020\u0002H\u0017J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u0007H\u0016Jb\u0010$\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006&"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/StreamSelectedTaxLotsResponse;", "Lcom/squareup/wire/Message;", "", "lots", "", "Lequity_trading_tax_lots/proto/v1/TaxLotSelection;", "order_id", "", "instrument_id", "rhs_account_number", "estimated_gain_loss", "Lcom/robinhood/rosetta/common/Money;", "estimated_credit", "display_value", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Lokio/ByteString;)V", "getOrder_id", "()Ljava/lang/String;", "getInstrument_id", "getRhs_account_number", "getEstimated_gain_loss", "()Lcom/robinhood/rosetta/common/Money;", "getEstimated_credit", "getDisplay_value", "getLots", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class StreamSelectedTaxLotsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<StreamSelectedTaxLotsResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "displayValue", schemaIndex = 6, tag = 7)
    private final String display_value;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "estimatedCredit", schemaIndex = 5, tag = 6)
    private final Money estimated_credit;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "estimatedGainLoss", schemaIndex = 4, tag = 5)
    private final Money estimated_gain_loss;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String instrument_id;

    @WireField(adapter = "equity_trading_tax_lots.proto.v1.TaxLotSelection#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<TaxLotSelection> lots;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String order_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rhsAccountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String rhs_account_number;

    public StreamSelectedTaxLotsResponse() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28057newBuilder();
    }

    public /* synthetic */ StreamSelectedTaxLotsResponse(List list, String str, String str2, String str3, Money money, Money money2, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : money, (i & 32) != 0 ? null : money2, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? ByteString.EMPTY : byteString);
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

    public final Money getEstimated_gain_loss() {
        return this.estimated_gain_loss;
    }

    public final Money getEstimated_credit() {
        return this.estimated_credit;
    }

    public final String getDisplay_value() {
        return this.display_value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamSelectedTaxLotsResponse(List<TaxLotSelection> lots, String order_id, String instrument_id, String rhs_account_number, Money money, Money money2, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(lots, "lots");
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.order_id = order_id;
        this.instrument_id = instrument_id;
        this.rhs_account_number = rhs_account_number;
        this.estimated_gain_loss = money;
        this.estimated_credit = money2;
        this.display_value = str;
        this.lots = Internal.immutableCopyOf("lots", lots);
    }

    public final List<TaxLotSelection> getLots() {
        return this.lots;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28057newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamSelectedTaxLotsResponse)) {
            return false;
        }
        StreamSelectedTaxLotsResponse streamSelectedTaxLotsResponse = (StreamSelectedTaxLotsResponse) other;
        return Intrinsics.areEqual(unknownFields(), streamSelectedTaxLotsResponse.unknownFields()) && Intrinsics.areEqual(this.lots, streamSelectedTaxLotsResponse.lots) && Intrinsics.areEqual(this.order_id, streamSelectedTaxLotsResponse.order_id) && Intrinsics.areEqual(this.instrument_id, streamSelectedTaxLotsResponse.instrument_id) && Intrinsics.areEqual(this.rhs_account_number, streamSelectedTaxLotsResponse.rhs_account_number) && Intrinsics.areEqual(this.estimated_gain_loss, streamSelectedTaxLotsResponse.estimated_gain_loss) && Intrinsics.areEqual(this.estimated_credit, streamSelectedTaxLotsResponse.estimated_credit) && Intrinsics.areEqual(this.display_value, streamSelectedTaxLotsResponse.display_value);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.lots.hashCode()) * 37) + this.order_id.hashCode()) * 37) + this.instrument_id.hashCode()) * 37) + this.rhs_account_number.hashCode()) * 37;
        Money money = this.estimated_gain_loss;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.estimated_credit;
        int iHashCode3 = (iHashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
        String str = this.display_value;
        int iHashCode4 = iHashCode3 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.lots.isEmpty()) {
            arrayList.add("lots=" + this.lots);
        }
        arrayList.add("order_id=" + Internal.sanitize(this.order_id));
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        arrayList.add("rhs_account_number=" + Internal.sanitize(this.rhs_account_number));
        Money money = this.estimated_gain_loss;
        if (money != null) {
            arrayList.add("estimated_gain_loss=" + money);
        }
        Money money2 = this.estimated_credit;
        if (money2 != null) {
            arrayList.add("estimated_credit=" + money2);
        }
        String str = this.display_value;
        if (str != null) {
            arrayList.add("display_value=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamSelectedTaxLotsResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ StreamSelectedTaxLotsResponse copy$default(StreamSelectedTaxLotsResponse streamSelectedTaxLotsResponse, List list, String str, String str2, String str3, Money money, Money money2, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = streamSelectedTaxLotsResponse.lots;
        }
        if ((i & 2) != 0) {
            str = streamSelectedTaxLotsResponse.order_id;
        }
        if ((i & 4) != 0) {
            str2 = streamSelectedTaxLotsResponse.instrument_id;
        }
        if ((i & 8) != 0) {
            str3 = streamSelectedTaxLotsResponse.rhs_account_number;
        }
        if ((i & 16) != 0) {
            money = streamSelectedTaxLotsResponse.estimated_gain_loss;
        }
        if ((i & 32) != 0) {
            money2 = streamSelectedTaxLotsResponse.estimated_credit;
        }
        if ((i & 64) != 0) {
            str4 = streamSelectedTaxLotsResponse.display_value;
        }
        if ((i & 128) != 0) {
            byteString = streamSelectedTaxLotsResponse.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        Money money3 = money;
        Money money4 = money2;
        return streamSelectedTaxLotsResponse.copy(list, str, str2, str3, money3, money4, str5, byteString2);
    }

    public final StreamSelectedTaxLotsResponse copy(List<TaxLotSelection> lots, String order_id, String instrument_id, String rhs_account_number, Money estimated_gain_loss, Money estimated_credit, String display_value, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(lots, "lots");
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamSelectedTaxLotsResponse(lots, order_id, instrument_id, rhs_account_number, estimated_gain_loss, estimated_credit, display_value, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamSelectedTaxLotsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamSelectedTaxLotsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: equity_trading_tax_lots.proto.v1.StreamSelectedTaxLotsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamSelectedTaxLotsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + TaxLotSelection.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getLots());
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getOrder_id());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getRhs_account_number());
                }
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                return size + protoAdapter.encodedSizeWithTag(5, value.getEstimated_gain_loss()) + protoAdapter.encodedSizeWithTag(6, value.getEstimated_credit()) + ProtoAdapter.STRING.encodedSizeWithTag(7, value.getDisplay_value());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamSelectedTaxLotsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                TaxLotSelection.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getLots());
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getOrder_id());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getRhs_account_number());
                }
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                protoAdapter.encodeWithTag(writer, 5, (int) value.getEstimated_gain_loss());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getEstimated_credit());
                ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getDisplay_value());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamSelectedTaxLotsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 7, (int) value.getDisplay_value());
                ProtoAdapter<Money> protoAdapter2 = Money.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 6, (int) value.getEstimated_credit());
                protoAdapter2.encodeWithTag(writer, 5, (int) value.getEstimated_gain_loss());
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getRhs_account_number());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getOrder_id());
                }
                TaxLotSelection.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getLots());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public StreamSelectedTaxLotsResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                String strDecode3 = null;
                String strDecode4 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                arrayList.add(TaxLotSelection.ADAPTER.decode(reader));
                                break;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 6:
                                moneyDecode2 = Money.ADAPTER.decode(reader);
                                break;
                            case 7:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new StreamSelectedTaxLotsResponse(arrayList, strDecode, strDecode4, strDecode2, moneyDecode, moneyDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamSelectedTaxLotsResponse redact(StreamSelectedTaxLotsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List listM26823redactElements = Internal.m26823redactElements(value.getLots(), TaxLotSelection.ADAPTER);
                Money estimated_gain_loss = value.getEstimated_gain_loss();
                Money moneyRedact = estimated_gain_loss != null ? Money.ADAPTER.redact(estimated_gain_loss) : null;
                Money estimated_credit = value.getEstimated_credit();
                return StreamSelectedTaxLotsResponse.copy$default(value, listM26823redactElements, null, null, null, moneyRedact, estimated_credit != null ? Money.ADAPTER.redact(estimated_credit) : null, null, ByteString.EMPTY, 78, null);
            }
        };
    }
}
