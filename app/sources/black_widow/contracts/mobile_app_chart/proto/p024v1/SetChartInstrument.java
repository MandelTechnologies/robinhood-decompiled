package black_widow.contracts.mobile_app_chart.proto.p024v1;

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

/* compiled from: SetChartInstrument.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J@\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrument;", "Lcom/squareup/wire/Message;", "", "equity_instrument", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EquityInstrument;", "crypto_currency_pair", "Lblack_widow/contracts/mobile_app_chart/proto/v1/CryptoCurrencyPair;", "futures_contract", "Lblack_widow/contracts/mobile_app_chart/proto/v1/FuturesContract;", "futures_product", "Lblack_widow/contracts/mobile_app_chart/proto/v1/FuturesProduct;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/EquityInstrument;Lblack_widow/contracts/mobile_app_chart/proto/v1/CryptoCurrencyPair;Lblack_widow/contracts/mobile_app_chart/proto/v1/FuturesContract;Lblack_widow/contracts/mobile_app_chart/proto/v1/FuturesProduct;Lokio/ByteString;)V", "getEquity_instrument", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/EquityInstrument;", "getCrypto_currency_pair", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/CryptoCurrencyPair;", "getFutures_contract", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/FuturesContract;", "getFutures_product", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/FuturesProduct;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class SetChartInstrument extends Message {

    @JvmField
    public static final ProtoAdapter<SetChartInstrument> ADAPTER;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.CryptoCurrencyPair#ADAPTER", jsonName = "cryptoCurrencyPair", oneofName = "instrument", schemaIndex = 1, tag = 4)
    private final CryptoCurrencyPair crypto_currency_pair;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.EquityInstrument#ADAPTER", jsonName = "equityInstrument", oneofName = "instrument", schemaIndex = 0, tag = 3)
    private final EquityInstrument equity_instrument;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.FuturesContract#ADAPTER", jsonName = "futuresContract", oneofName = "instrument", schemaIndex = 2, tag = 5)
    private final FuturesContract futures_contract;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.FuturesProduct#ADAPTER", jsonName = "futuresProduct", oneofName = "instrument", schemaIndex = 3, tag = 6)
    private final FuturesProduct futures_product;

    public SetChartInstrument() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8651newBuilder();
    }

    public final EquityInstrument getEquity_instrument() {
        return this.equity_instrument;
    }

    public final CryptoCurrencyPair getCrypto_currency_pair() {
        return this.crypto_currency_pair;
    }

    public final FuturesContract getFutures_contract() {
        return this.futures_contract;
    }

    public final FuturesProduct getFutures_product() {
        return this.futures_product;
    }

    public /* synthetic */ SetChartInstrument(EquityInstrument equityInstrument, CryptoCurrencyPair cryptoCurrencyPair, FuturesContract futuresContract, FuturesProduct futuresProduct, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : equityInstrument, (i & 2) != 0 ? null : cryptoCurrencyPair, (i & 4) != 0 ? null : futuresContract, (i & 8) != 0 ? null : futuresProduct, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetChartInstrument(EquityInstrument equityInstrument, CryptoCurrencyPair cryptoCurrencyPair, FuturesContract futuresContract, FuturesProduct futuresProduct, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.equity_instrument = equityInstrument;
        this.crypto_currency_pair = cryptoCurrencyPair;
        this.futures_contract = futuresContract;
        this.futures_product = futuresProduct;
        if (Internal.countNonNull(equityInstrument, cryptoCurrencyPair, futuresContract, futuresProduct, new Object[0]) > 1) {
            throw new IllegalArgumentException("At most one of equity_instrument, crypto_currency_pair, futures_contract, futures_product may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8651newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SetChartInstrument)) {
            return false;
        }
        SetChartInstrument setChartInstrument = (SetChartInstrument) other;
        return Intrinsics.areEqual(unknownFields(), setChartInstrument.unknownFields()) && Intrinsics.areEqual(this.equity_instrument, setChartInstrument.equity_instrument) && Intrinsics.areEqual(this.crypto_currency_pair, setChartInstrument.crypto_currency_pair) && Intrinsics.areEqual(this.futures_contract, setChartInstrument.futures_contract) && Intrinsics.areEqual(this.futures_product, setChartInstrument.futures_product);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        EquityInstrument equityInstrument = this.equity_instrument;
        int iHashCode2 = (iHashCode + (equityInstrument != null ? equityInstrument.hashCode() : 0)) * 37;
        CryptoCurrencyPair cryptoCurrencyPair = this.crypto_currency_pair;
        int iHashCode3 = (iHashCode2 + (cryptoCurrencyPair != null ? cryptoCurrencyPair.hashCode() : 0)) * 37;
        FuturesContract futuresContract = this.futures_contract;
        int iHashCode4 = (iHashCode3 + (futuresContract != null ? futuresContract.hashCode() : 0)) * 37;
        FuturesProduct futuresProduct = this.futures_product;
        int iHashCode5 = iHashCode4 + (futuresProduct != null ? futuresProduct.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        EquityInstrument equityInstrument = this.equity_instrument;
        if (equityInstrument != null) {
            arrayList.add("equity_instrument=" + equityInstrument);
        }
        CryptoCurrencyPair cryptoCurrencyPair = this.crypto_currency_pair;
        if (cryptoCurrencyPair != null) {
            arrayList.add("crypto_currency_pair=" + cryptoCurrencyPair);
        }
        FuturesContract futuresContract = this.futures_contract;
        if (futuresContract != null) {
            arrayList.add("futures_contract=" + futuresContract);
        }
        FuturesProduct futuresProduct = this.futures_product;
        if (futuresProduct != null) {
            arrayList.add("futures_product=" + futuresProduct);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetChartInstrument{", "}", 0, null, null, 56, null);
    }

    public final SetChartInstrument copy(EquityInstrument equity_instrument, CryptoCurrencyPair crypto_currency_pair, FuturesContract futures_contract, FuturesProduct futures_product, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SetChartInstrument(equity_instrument, crypto_currency_pair, futures_contract, futures_product, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SetChartInstrument.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SetChartInstrument>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.SetChartInstrument$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SetChartInstrument value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + EquityInstrument.ADAPTER.encodedSizeWithTag(3, value.getEquity_instrument()) + CryptoCurrencyPair.ADAPTER.encodedSizeWithTag(4, value.getCrypto_currency_pair()) + FuturesContract.ADAPTER.encodedSizeWithTag(5, value.getFutures_contract()) + FuturesProduct.ADAPTER.encodedSizeWithTag(6, value.getFutures_product());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SetChartInstrument value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                EquityInstrument.ADAPTER.encodeWithTag(writer, 3, (int) value.getEquity_instrument());
                CryptoCurrencyPair.ADAPTER.encodeWithTag(writer, 4, (int) value.getCrypto_currency_pair());
                FuturesContract.ADAPTER.encodeWithTag(writer, 5, (int) value.getFutures_contract());
                FuturesProduct.ADAPTER.encodeWithTag(writer, 6, (int) value.getFutures_product());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SetChartInstrument value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                FuturesProduct.ADAPTER.encodeWithTag(writer, 6, (int) value.getFutures_product());
                FuturesContract.ADAPTER.encodeWithTag(writer, 5, (int) value.getFutures_contract());
                CryptoCurrencyPair.ADAPTER.encodeWithTag(writer, 4, (int) value.getCrypto_currency_pair());
                EquityInstrument.ADAPTER.encodeWithTag(writer, 3, (int) value.getEquity_instrument());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SetChartInstrument redact(SetChartInstrument value) {
                Intrinsics.checkNotNullParameter(value, "value");
                EquityInstrument equity_instrument = value.getEquity_instrument();
                EquityInstrument equityInstrumentRedact = equity_instrument != null ? EquityInstrument.ADAPTER.redact(equity_instrument) : null;
                CryptoCurrencyPair crypto_currency_pair = value.getCrypto_currency_pair();
                CryptoCurrencyPair cryptoCurrencyPairRedact = crypto_currency_pair != null ? CryptoCurrencyPair.ADAPTER.redact(crypto_currency_pair) : null;
                FuturesContract futures_contract = value.getFutures_contract();
                FuturesContract futuresContractRedact = futures_contract != null ? FuturesContract.ADAPTER.redact(futures_contract) : null;
                FuturesProduct futures_product = value.getFutures_product();
                return value.copy(equityInstrumentRedact, cryptoCurrencyPairRedact, futuresContractRedact, futures_product != null ? FuturesProduct.ADAPTER.redact(futures_product) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SetChartInstrument decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                EquityInstrument equityInstrumentDecode = null;
                CryptoCurrencyPair cryptoCurrencyPairDecode = null;
                FuturesContract futuresContractDecode = null;
                FuturesProduct futuresProductDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SetChartInstrument(equityInstrumentDecode, cryptoCurrencyPairDecode, futuresContractDecode, futuresProductDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 3) {
                        equityInstrumentDecode = EquityInstrument.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        cryptoCurrencyPairDecode = CryptoCurrencyPair.ADAPTER.decode(reader);
                    } else if (iNextTag == 5) {
                        futuresContractDecode = FuturesContract.ADAPTER.decode(reader);
                    } else if (iNextTag == 6) {
                        futuresProductDecode = FuturesProduct.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
