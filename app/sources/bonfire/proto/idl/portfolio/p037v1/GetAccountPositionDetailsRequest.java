package bonfire.proto.idl.portfolio.p037v1;

import com.plaid.internal.EnumC7081g;
import com.robinhood.rosetta.common.Currency;
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

/* compiled from: GetAccountPositionDetailsRequest.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B_\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0004H\u0016J^\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006%"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsRequest;", "Lcom/squareup/wire/Message;", "", "account_number", "", "instrument_id", "display_type", "position_instrument_type", "instrument_type", "chart_type", "Lbonfire/proto/idl/portfolio/v1/PositionDetailChartType;", "display_currency", "Lcom/robinhood/rosetta/common/Currency;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/portfolio/v1/PositionDetailChartType;Lcom/robinhood/rosetta/common/Currency;Lokio/ByteString;)V", "getAccount_number", "()Ljava/lang/String;", "getInstrument_id", "getDisplay_type", "getPosition_instrument_type", "getInstrument_type", "getChart_type", "()Lbonfire/proto/idl/portfolio/v1/PositionDetailChartType;", "getDisplay_currency", "()Lcom/robinhood/rosetta/common/Currency;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class GetAccountPositionDetailsRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetAccountPositionDetailsRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_number;

    @WireField(adapter = "bonfire.proto.idl.portfolio.v1.PositionDetailChartType#ADAPTER", schemaIndex = 5, tag = 6)
    private final PositionDetailChartType chart_type;

    @WireField(adapter = "com.robinhood.rosetta.common.Currency#ADAPTER", schemaIndex = 6, tag = 7)
    private final Currency display_currency;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String display_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String instrument_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    private final String instrument_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    private final String position_instrument_type;

    public GetAccountPositionDetailsRequest() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public /* synthetic */ GetAccountPositionDetailsRequest(String str, String str2, String str3, String str4, String str5, PositionDetailChartType positionDetailChartType, Currency currency, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : positionDetailChartType, (i & 64) != 0 ? null : currency, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m9020newBuilder();
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public final String getDisplay_type() {
        return this.display_type;
    }

    public final String getPosition_instrument_type() {
        return this.position_instrument_type;
    }

    public final String getInstrument_type() {
        return this.instrument_type;
    }

    public final PositionDetailChartType getChart_type() {
        return this.chart_type;
    }

    public final Currency getDisplay_currency() {
        return this.display_currency;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAccountPositionDetailsRequest(String account_number, String instrument_id, String display_type, String str, String str2, PositionDetailChartType positionDetailChartType, Currency currency, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(display_type, "display_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_number = account_number;
        this.instrument_id = instrument_id;
        this.display_type = display_type;
        this.position_instrument_type = str;
        this.instrument_type = str2;
        this.chart_type = positionDetailChartType;
        this.display_currency = currency;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m9020newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetAccountPositionDetailsRequest)) {
            return false;
        }
        GetAccountPositionDetailsRequest getAccountPositionDetailsRequest = (GetAccountPositionDetailsRequest) other;
        return Intrinsics.areEqual(unknownFields(), getAccountPositionDetailsRequest.unknownFields()) && Intrinsics.areEqual(this.account_number, getAccountPositionDetailsRequest.account_number) && Intrinsics.areEqual(this.instrument_id, getAccountPositionDetailsRequest.instrument_id) && Intrinsics.areEqual(this.display_type, getAccountPositionDetailsRequest.display_type) && Intrinsics.areEqual(this.position_instrument_type, getAccountPositionDetailsRequest.position_instrument_type) && Intrinsics.areEqual(this.instrument_type, getAccountPositionDetailsRequest.instrument_type) && this.chart_type == getAccountPositionDetailsRequest.chart_type && this.display_currency == getAccountPositionDetailsRequest.display_currency;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.account_number.hashCode()) * 37) + this.instrument_id.hashCode()) * 37) + this.display_type.hashCode()) * 37;
        String str = this.position_instrument_type;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.instrument_type;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        PositionDetailChartType positionDetailChartType = this.chart_type;
        int iHashCode4 = (iHashCode3 + (positionDetailChartType != null ? positionDetailChartType.hashCode() : 0)) * 37;
        Currency currency = this.display_currency;
        int iHashCode5 = iHashCode4 + (currency != null ? currency.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        arrayList.add("display_type=" + Internal.sanitize(this.display_type));
        String str = this.position_instrument_type;
        if (str != null) {
            arrayList.add("position_instrument_type=" + Internal.sanitize(str));
        }
        String str2 = this.instrument_type;
        if (str2 != null) {
            arrayList.add("instrument_type=" + Internal.sanitize(str2));
        }
        PositionDetailChartType positionDetailChartType = this.chart_type;
        if (positionDetailChartType != null) {
            arrayList.add("chart_type=" + positionDetailChartType);
        }
        Currency currency = this.display_currency;
        if (currency != null) {
            arrayList.add("display_currency=" + currency);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAccountPositionDetailsRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetAccountPositionDetailsRequest copy$default(GetAccountPositionDetailsRequest getAccountPositionDetailsRequest, String str, String str2, String str3, String str4, String str5, PositionDetailChartType positionDetailChartType, Currency currency, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getAccountPositionDetailsRequest.account_number;
        }
        if ((i & 2) != 0) {
            str2 = getAccountPositionDetailsRequest.instrument_id;
        }
        if ((i & 4) != 0) {
            str3 = getAccountPositionDetailsRequest.display_type;
        }
        if ((i & 8) != 0) {
            str4 = getAccountPositionDetailsRequest.position_instrument_type;
        }
        if ((i & 16) != 0) {
            str5 = getAccountPositionDetailsRequest.instrument_type;
        }
        if ((i & 32) != 0) {
            positionDetailChartType = getAccountPositionDetailsRequest.chart_type;
        }
        if ((i & 64) != 0) {
            currency = getAccountPositionDetailsRequest.display_currency;
        }
        if ((i & 128) != 0) {
            byteString = getAccountPositionDetailsRequest.unknownFields();
        }
        Currency currency2 = currency;
        ByteString byteString2 = byteString;
        String str6 = str5;
        PositionDetailChartType positionDetailChartType2 = positionDetailChartType;
        return getAccountPositionDetailsRequest.copy(str, str2, str3, str4, str6, positionDetailChartType2, currency2, byteString2);
    }

    public final GetAccountPositionDetailsRequest copy(String account_number, String instrument_id, String display_type, String position_instrument_type, String instrument_type, PositionDetailChartType chart_type, Currency display_currency, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(display_type, "display_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetAccountPositionDetailsRequest(account_number, instrument_id, display_type, position_instrument_type, instrument_type, chart_type, display_currency, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetAccountPositionDetailsRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetAccountPositionDetailsRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.portfolio.v1.GetAccountPositionDetailsRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetAccountPositionDetailsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getDisplay_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getDisplay_type());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(4, value.getPosition_instrument_type()) + protoAdapter.encodedSizeWithTag(5, value.getInstrument_type()) + PositionDetailChartType.ADAPTER.encodedSizeWithTag(6, value.getChart_type()) + Currency.ADAPTER.encodedSizeWithTag(7, value.getDisplay_currency());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetAccountPositionDetailsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getDisplay_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDisplay_type());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getPosition_instrument_type());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getInstrument_type());
                PositionDetailChartType.ADAPTER.encodeWithTag(writer, 6, (int) value.getChart_type());
                Currency.ADAPTER.encodeWithTag(writer, 7, (int) value.getDisplay_currency());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetAccountPositionDetailsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Currency.ADAPTER.encodeWithTag(writer, 7, (int) value.getDisplay_currency());
                PositionDetailChartType.ADAPTER.encodeWithTag(writer, 6, (int) value.getChart_type());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 5, (int) value.getInstrument_type());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getPosition_instrument_type());
                if (!Intrinsics.areEqual(value.getDisplay_type(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getDisplay_type());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getInstrument_id());
                }
                if (Intrinsics.areEqual(value.getAccount_number(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getAccount_number());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetAccountPositionDetailsRequest redact(GetAccountPositionDetailsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetAccountPositionDetailsRequest.copy$default(value, null, null, null, null, null, null, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetAccountPositionDetailsRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = null;
                String strDecode4 = null;
                PositionDetailChartType positionDetailChartTypeDecode = null;
                Currency currencyDecode = null;
                String strDecode5 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                try {
                                    positionDetailChartTypeDecode = PositionDetailChartType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 7:
                                try {
                                    currencyDecode = Currency.ADAPTER.decode(reader);
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
                        return new GetAccountPositionDetailsRequest(strDecode5, strDecode, strDecode2, strDecode3, strDecode4, positionDetailChartTypeDecode, currencyDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
