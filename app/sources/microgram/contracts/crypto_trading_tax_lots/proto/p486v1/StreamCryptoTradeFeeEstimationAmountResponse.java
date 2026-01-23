package microgram.contracts.crypto_trading_tax_lots.proto.p486v1;

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

/* compiled from: StreamCryptoTradeFeeEstimationAmountResponse.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J(\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamCryptoTradeFeeEstimationAmountResponse;", "Lcom/squareup/wire/Message;", "", "fee_ratio", "", "min_fee_quote_amount", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getFee_ratio", "()Ljava/lang/String;", "getMin_fee_quote_amount", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class StreamCryptoTradeFeeEstimationAmountResponse extends Message {

    @JvmField
    public static final ProtoAdapter<StreamCryptoTradeFeeEstimationAmountResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "feeRatio", schemaIndex = 0, tag = 1)
    private final String fee_ratio;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "minFeeQuoteAmount", schemaIndex = 1, tag = 2)
    private final String min_fee_quote_amount;

    public StreamCryptoTradeFeeEstimationAmountResponse() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28990newBuilder();
    }

    public final String getFee_ratio() {
        return this.fee_ratio;
    }

    public final String getMin_fee_quote_amount() {
        return this.min_fee_quote_amount;
    }

    public /* synthetic */ StreamCryptoTradeFeeEstimationAmountResponse(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamCryptoTradeFeeEstimationAmountResponse(String str, String str2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.fee_ratio = str;
        this.min_fee_quote_amount = str2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28990newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamCryptoTradeFeeEstimationAmountResponse)) {
            return false;
        }
        StreamCryptoTradeFeeEstimationAmountResponse streamCryptoTradeFeeEstimationAmountResponse = (StreamCryptoTradeFeeEstimationAmountResponse) other;
        return Intrinsics.areEqual(unknownFields(), streamCryptoTradeFeeEstimationAmountResponse.unknownFields()) && Intrinsics.areEqual(this.fee_ratio, streamCryptoTradeFeeEstimationAmountResponse.fee_ratio) && Intrinsics.areEqual(this.min_fee_quote_amount, streamCryptoTradeFeeEstimationAmountResponse.min_fee_quote_amount);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.fee_ratio;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.min_fee_quote_amount;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.fee_ratio;
        if (str != null) {
            arrayList.add("fee_ratio=" + Internal.sanitize(str));
        }
        String str2 = this.min_fee_quote_amount;
        if (str2 != null) {
            arrayList.add("min_fee_quote_amount=" + Internal.sanitize(str2));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamCryptoTradeFeeEstimationAmountResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ StreamCryptoTradeFeeEstimationAmountResponse copy$default(StreamCryptoTradeFeeEstimationAmountResponse streamCryptoTradeFeeEstimationAmountResponse, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = streamCryptoTradeFeeEstimationAmountResponse.fee_ratio;
        }
        if ((i & 2) != 0) {
            str2 = streamCryptoTradeFeeEstimationAmountResponse.min_fee_quote_amount;
        }
        if ((i & 4) != 0) {
            byteString = streamCryptoTradeFeeEstimationAmountResponse.unknownFields();
        }
        return streamCryptoTradeFeeEstimationAmountResponse.copy(str, str2, byteString);
    }

    public final StreamCryptoTradeFeeEstimationAmountResponse copy(String fee_ratio, String min_fee_quote_amount, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamCryptoTradeFeeEstimationAmountResponse(fee_ratio, min_fee_quote_amount, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamCryptoTradeFeeEstimationAmountResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamCryptoTradeFeeEstimationAmountResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamCryptoTradeFeeEstimationAmountResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamCryptoTradeFeeEstimationAmountResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(1, value.getFee_ratio()) + protoAdapter.encodedSizeWithTag(2, value.getMin_fee_quote_amount());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamCryptoTradeFeeEstimationAmountResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getFee_ratio());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getMin_fee_quote_amount());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamCryptoTradeFeeEstimationAmountResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getMin_fee_quote_amount());
                protoAdapter.encodeWithTag(writer, 1, (int) value.getFee_ratio());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamCryptoTradeFeeEstimationAmountResponse redact(StreamCryptoTradeFeeEstimationAmountResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return StreamCryptoTradeFeeEstimationAmountResponse.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamCryptoTradeFeeEstimationAmountResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                String strDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new StreamCryptoTradeFeeEstimationAmountResponse(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
