package microgram.contracts.margin.margin_call.proto.p496v1;

import com.robinhood.android.instant.p160ui.InstantCashConstants;
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

/* compiled from: GetMaintenanceCallSummaryFromDataResponse.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fBI\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0007H\u0016JH\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, m3636d2 = {"Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallSummaryFromDataResponse;", "Lcom/squareup/wire/Message;", "", "trades", "", "Lmicrogram/contracts/margin/margin_call/proto/v1/Trade;", "total_credit_cost_header", "", "total_credit_cost_value", "call_credit_cost_value", InstantCashConstants.ACCOUNT_TYPE_KEY, "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getTotal_credit_cost_header", "()Ljava/lang/String;", "getTotal_credit_cost_value", "getCall_credit_cost_value", "getAccount_type", "getTrades", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.contracts.margin.margin_call.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class GetMaintenanceCallSummaryFromDataResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetMaintenanceCallSummaryFromDataResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String account_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "callCreditCostValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String call_credit_cost_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "totalCreditCostHeader", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String total_credit_cost_header;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "totalCreditCostValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String total_credit_cost_value;

    @WireField(adapter = "microgram.contracts.margin.margin_call.proto.v1.Trade#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<Trade> trades;

    public GetMaintenanceCallSummaryFromDataResponse() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29142newBuilder();
    }

    public /* synthetic */ GetMaintenanceCallSummaryFromDataResponse(List list, String str, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getTotal_credit_cost_header() {
        return this.total_credit_cost_header;
    }

    public final String getTotal_credit_cost_value() {
        return this.total_credit_cost_value;
    }

    public final String getCall_credit_cost_value() {
        return this.call_credit_cost_value;
    }

    public final String getAccount_type() {
        return this.account_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMaintenanceCallSummaryFromDataResponse(List<Trade> trades, String total_credit_cost_header, String total_credit_cost_value, String call_credit_cost_value, String account_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(trades, "trades");
        Intrinsics.checkNotNullParameter(total_credit_cost_header, "total_credit_cost_header");
        Intrinsics.checkNotNullParameter(total_credit_cost_value, "total_credit_cost_value");
        Intrinsics.checkNotNullParameter(call_credit_cost_value, "call_credit_cost_value");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.total_credit_cost_header = total_credit_cost_header;
        this.total_credit_cost_value = total_credit_cost_value;
        this.call_credit_cost_value = call_credit_cost_value;
        this.account_type = account_type;
        this.trades = Internal.immutableCopyOf("trades", trades);
    }

    public final List<Trade> getTrades() {
        return this.trades;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29142newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetMaintenanceCallSummaryFromDataResponse)) {
            return false;
        }
        GetMaintenanceCallSummaryFromDataResponse getMaintenanceCallSummaryFromDataResponse = (GetMaintenanceCallSummaryFromDataResponse) other;
        return Intrinsics.areEqual(unknownFields(), getMaintenanceCallSummaryFromDataResponse.unknownFields()) && Intrinsics.areEqual(this.trades, getMaintenanceCallSummaryFromDataResponse.trades) && Intrinsics.areEqual(this.total_credit_cost_header, getMaintenanceCallSummaryFromDataResponse.total_credit_cost_header) && Intrinsics.areEqual(this.total_credit_cost_value, getMaintenanceCallSummaryFromDataResponse.total_credit_cost_value) && Intrinsics.areEqual(this.call_credit_cost_value, getMaintenanceCallSummaryFromDataResponse.call_credit_cost_value) && Intrinsics.areEqual(this.account_type, getMaintenanceCallSummaryFromDataResponse.account_type);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.trades.hashCode()) * 37) + this.total_credit_cost_header.hashCode()) * 37) + this.total_credit_cost_value.hashCode()) * 37) + this.call_credit_cost_value.hashCode()) * 37) + this.account_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.trades.isEmpty()) {
            arrayList.add("trades=" + this.trades);
        }
        arrayList.add("total_credit_cost_header=" + Internal.sanitize(this.total_credit_cost_header));
        arrayList.add("total_credit_cost_value=" + Internal.sanitize(this.total_credit_cost_value));
        arrayList.add("call_credit_cost_value=" + Internal.sanitize(this.call_credit_cost_value));
        arrayList.add("account_type=" + Internal.sanitize(this.account_type));
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetMaintenanceCallSummaryFromDataResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetMaintenanceCallSummaryFromDataResponse copy$default(GetMaintenanceCallSummaryFromDataResponse getMaintenanceCallSummaryFromDataResponse, List list, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getMaintenanceCallSummaryFromDataResponse.trades;
        }
        if ((i & 2) != 0) {
            str = getMaintenanceCallSummaryFromDataResponse.total_credit_cost_header;
        }
        if ((i & 4) != 0) {
            str2 = getMaintenanceCallSummaryFromDataResponse.total_credit_cost_value;
        }
        if ((i & 8) != 0) {
            str3 = getMaintenanceCallSummaryFromDataResponse.call_credit_cost_value;
        }
        if ((i & 16) != 0) {
            str4 = getMaintenanceCallSummaryFromDataResponse.account_type;
        }
        if ((i & 32) != 0) {
            byteString = getMaintenanceCallSummaryFromDataResponse.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        return getMaintenanceCallSummaryFromDataResponse.copy(list, str, str2, str3, str5, byteString2);
    }

    public final GetMaintenanceCallSummaryFromDataResponse copy(List<Trade> trades, String total_credit_cost_header, String total_credit_cost_value, String call_credit_cost_value, String account_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(trades, "trades");
        Intrinsics.checkNotNullParameter(total_credit_cost_header, "total_credit_cost_header");
        Intrinsics.checkNotNullParameter(total_credit_cost_value, "total_credit_cost_value");
        Intrinsics.checkNotNullParameter(call_credit_cost_value, "call_credit_cost_value");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetMaintenanceCallSummaryFromDataResponse(trades, total_credit_cost_header, total_credit_cost_value, call_credit_cost_value, account_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetMaintenanceCallSummaryFromDataResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetMaintenanceCallSummaryFromDataResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.margin.margin_call.proto.v1.GetMaintenanceCallSummaryFromDataResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetMaintenanceCallSummaryFromDataResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + Trade.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getTrades());
                if (!Intrinsics.areEqual(value.getTotal_credit_cost_header(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTotal_credit_cost_header());
                }
                if (!Intrinsics.areEqual(value.getTotal_credit_cost_value(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getTotal_credit_cost_value());
                }
                if (!Intrinsics.areEqual(value.getCall_credit_cost_value(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getCall_credit_cost_value());
                }
                return !Intrinsics.areEqual(value.getAccount_type(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getAccount_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetMaintenanceCallSummaryFromDataResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                Trade.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getTrades());
                if (!Intrinsics.areEqual(value.getTotal_credit_cost_header(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTotal_credit_cost_header());
                }
                if (!Intrinsics.areEqual(value.getTotal_credit_cost_value(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTotal_credit_cost_value());
                }
                if (!Intrinsics.areEqual(value.getCall_credit_cost_value(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getCall_credit_cost_value());
                }
                if (!Intrinsics.areEqual(value.getAccount_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getAccount_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetMaintenanceCallSummaryFromDataResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getAccount_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getAccount_type());
                }
                if (!Intrinsics.areEqual(value.getCall_credit_cost_value(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getCall_credit_cost_value());
                }
                if (!Intrinsics.areEqual(value.getTotal_credit_cost_value(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTotal_credit_cost_value());
                }
                if (!Intrinsics.areEqual(value.getTotal_credit_cost_header(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTotal_credit_cost_header());
                }
                Trade.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getTrades());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetMaintenanceCallSummaryFromDataResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetMaintenanceCallSummaryFromDataResponse(arrayList, strDecode, strDecode2, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(Trade.ADAPTER.decode(reader));
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 5) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetMaintenanceCallSummaryFromDataResponse redact(GetMaintenanceCallSummaryFromDataResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetMaintenanceCallSummaryFromDataResponse.copy$default(value, Internal.m26823redactElements(value.getTrades(), Trade.ADAPTER), null, null, null, null, ByteString.EMPTY, 30, null);
            }
        };
    }
}
