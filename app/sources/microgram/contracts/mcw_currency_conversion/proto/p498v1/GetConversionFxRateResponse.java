package microgram.contracts.mcw_currency_conversion.proto.p498v1;

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

/* compiled from: GetConversionFxRateResponse.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J0\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lmicrogram/contracts/mcw_currency_conversion/proto/v1/GetConversionFxRateResponse;", "Lcom/squareup/wire/Message;", "", "symbol_id", "", "symbol", "fx_rate", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/ConversionFxRate;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lmicrogram/contracts/mcw_currency_conversion/proto/v1/ConversionFxRate;Lokio/ByteString;)V", "getSymbol_id", "()Ljava/lang/String;", "getSymbol", "getFx_rate", "()Lmicrogram/contracts/mcw_currency_conversion/proto/v1/ConversionFxRate;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.contracts.mcw_currency_conversion.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class GetConversionFxRateResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetConversionFxRateResponse> ADAPTER;

    @WireField(adapter = "microgram.contracts.mcw_currency_conversion.proto.v1.ConversionFxRate#ADAPTER", jsonName = "fxRate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final ConversionFxRate fx_rate;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String symbol;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "symbolId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String symbol_id;

    public GetConversionFxRateResponse() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ GetConversionFxRateResponse(String str, String str2, ConversionFxRate conversionFxRate, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : conversionFxRate, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29167newBuilder();
    }

    public final String getSymbol_id() {
        return this.symbol_id;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final ConversionFxRate getFx_rate() {
        return this.fx_rate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetConversionFxRateResponse(String symbol_id, String symbol, ConversionFxRate conversionFxRate, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(symbol_id, "symbol_id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.symbol_id = symbol_id;
        this.symbol = symbol;
        this.fx_rate = conversionFxRate;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29167newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetConversionFxRateResponse)) {
            return false;
        }
        GetConversionFxRateResponse getConversionFxRateResponse = (GetConversionFxRateResponse) other;
        return Intrinsics.areEqual(unknownFields(), getConversionFxRateResponse.unknownFields()) && Intrinsics.areEqual(this.symbol_id, getConversionFxRateResponse.symbol_id) && Intrinsics.areEqual(this.symbol, getConversionFxRateResponse.symbol) && Intrinsics.areEqual(this.fx_rate, getConversionFxRateResponse.fx_rate);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.symbol_id.hashCode()) * 37) + this.symbol.hashCode()) * 37;
        ConversionFxRate conversionFxRate = this.fx_rate;
        int iHashCode2 = iHashCode + (conversionFxRate != null ? conversionFxRate.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("symbol_id=" + Internal.sanitize(this.symbol_id));
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        ConversionFxRate conversionFxRate = this.fx_rate;
        if (conversionFxRate != null) {
            arrayList.add("fx_rate=" + conversionFxRate);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetConversionFxRateResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetConversionFxRateResponse copy$default(GetConversionFxRateResponse getConversionFxRateResponse, String str, String str2, ConversionFxRate conversionFxRate, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getConversionFxRateResponse.symbol_id;
        }
        if ((i & 2) != 0) {
            str2 = getConversionFxRateResponse.symbol;
        }
        if ((i & 4) != 0) {
            conversionFxRate = getConversionFxRateResponse.fx_rate;
        }
        if ((i & 8) != 0) {
            byteString = getConversionFxRateResponse.unknownFields();
        }
        return getConversionFxRateResponse.copy(str, str2, conversionFxRate, byteString);
    }

    public final GetConversionFxRateResponse copy(String symbol_id, String symbol, ConversionFxRate fx_rate, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(symbol_id, "symbol_id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetConversionFxRateResponse(symbol_id, symbol, fx_rate, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetConversionFxRateResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetConversionFxRateResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.mcw_currency_conversion.proto.v1.GetConversionFxRateResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetConversionFxRateResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getSymbol_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getSymbol_id());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSymbol());
                }
                return value.getFx_rate() != null ? size + ConversionFxRate.ADAPTER.encodedSizeWithTag(3, value.getFx_rate()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetConversionFxRateResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getSymbol_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSymbol_id());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSymbol());
                }
                if (value.getFx_rate() != null) {
                    ConversionFxRate.ADAPTER.encodeWithTag(writer, 3, (int) value.getFx_rate());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetConversionFxRateResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getFx_rate() != null) {
                    ConversionFxRate.ADAPTER.encodeWithTag(writer, 3, (int) value.getFx_rate());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSymbol());
                }
                if (Intrinsics.areEqual(value.getSymbol_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSymbol_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetConversionFxRateResponse redact(GetConversionFxRateResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ConversionFxRate fx_rate = value.getFx_rate();
                return GetConversionFxRateResponse.copy$default(value, null, null, fx_rate != null ? ConversionFxRate.ADAPTER.redact(fx_rate) : null, ByteString.EMPTY, 3, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetConversionFxRateResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                ConversionFxRate conversionFxRateDecode = null;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetConversionFxRateResponse(strDecode, strDecode2, conversionFxRateDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        conversionFxRateDecode = ConversionFxRate.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
