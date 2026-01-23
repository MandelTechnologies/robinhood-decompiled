package md_server_proxy.service.p483v1;

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

/* compiled from: QuoteDetailData.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J4\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lmd_server_proxy/service/v1/QuoteDetailData;", "Lcom/squareup/wire/Message;", "", "spot_quote", "Lmd_server_proxy/service/v1/SpotQuote;", "perpetual_quote", "Lmd_server_proxy/service/v1/PerpetualQuote;", "tokenized_stock_quote", "Lmd_server_proxy/service/v1/TokenizedStockQuote;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmd_server_proxy/service/v1/SpotQuote;Lmd_server_proxy/service/v1/PerpetualQuote;Lmd_server_proxy/service/v1/TokenizedStockQuote;Lokio/ByteString;)V", "getSpot_quote", "()Lmd_server_proxy/service/v1/SpotQuote;", "getPerpetual_quote", "()Lmd_server_proxy/service/v1/PerpetualQuote;", "getTokenized_stock_quote", "()Lmd_server_proxy/service/v1/TokenizedStockQuote;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class QuoteDetailData extends Message {

    @JvmField
    public static final ProtoAdapter<QuoteDetailData> ADAPTER;

    @WireField(adapter = "md_server_proxy.service.v1.PerpetualQuote#ADAPTER", jsonName = "perpetualQuote", oneofName = "quote", schemaIndex = 1, tag = 2)
    private final PerpetualQuote perpetual_quote;

    @WireField(adapter = "md_server_proxy.service.v1.SpotQuote#ADAPTER", jsonName = "spotQuote", oneofName = "quote", schemaIndex = 0, tag = 1)
    private final SpotQuote spot_quote;

    @WireField(adapter = "md_server_proxy.service.v1.TokenizedStockQuote#ADAPTER", jsonName = "tokenizedStockQuote", oneofName = "quote", schemaIndex = 2, tag = 3)
    private final TokenizedStockQuote tokenized_stock_quote;

    public QuoteDetailData() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28924newBuilder();
    }

    public final SpotQuote getSpot_quote() {
        return this.spot_quote;
    }

    public final PerpetualQuote getPerpetual_quote() {
        return this.perpetual_quote;
    }

    public final TokenizedStockQuote getTokenized_stock_quote() {
        return this.tokenized_stock_quote;
    }

    public /* synthetic */ QuoteDetailData(SpotQuote spotQuote, PerpetualQuote perpetualQuote, TokenizedStockQuote tokenizedStockQuote, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : spotQuote, (i & 2) != 0 ? null : perpetualQuote, (i & 4) != 0 ? null : tokenizedStockQuote, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuoteDetailData(SpotQuote spotQuote, PerpetualQuote perpetualQuote, TokenizedStockQuote tokenizedStockQuote, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.spot_quote = spotQuote;
        this.perpetual_quote = perpetualQuote;
        this.tokenized_stock_quote = tokenizedStockQuote;
        if (Internal.countNonNull(spotQuote, perpetualQuote, tokenizedStockQuote) > 1) {
            throw new IllegalArgumentException("At most one of spot_quote, perpetual_quote, tokenized_stock_quote may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28924newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof QuoteDetailData)) {
            return false;
        }
        QuoteDetailData quoteDetailData = (QuoteDetailData) other;
        return Intrinsics.areEqual(unknownFields(), quoteDetailData.unknownFields()) && Intrinsics.areEqual(this.spot_quote, quoteDetailData.spot_quote) && Intrinsics.areEqual(this.perpetual_quote, quoteDetailData.perpetual_quote) && Intrinsics.areEqual(this.tokenized_stock_quote, quoteDetailData.tokenized_stock_quote);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        SpotQuote spotQuote = this.spot_quote;
        int iHashCode2 = (iHashCode + (spotQuote != null ? spotQuote.hashCode() : 0)) * 37;
        PerpetualQuote perpetualQuote = this.perpetual_quote;
        int iHashCode3 = (iHashCode2 + (perpetualQuote != null ? perpetualQuote.hashCode() : 0)) * 37;
        TokenizedStockQuote tokenizedStockQuote = this.tokenized_stock_quote;
        int iHashCode4 = iHashCode3 + (tokenizedStockQuote != null ? tokenizedStockQuote.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        SpotQuote spotQuote = this.spot_quote;
        if (spotQuote != null) {
            arrayList.add("spot_quote=" + spotQuote);
        }
        PerpetualQuote perpetualQuote = this.perpetual_quote;
        if (perpetualQuote != null) {
            arrayList.add("perpetual_quote=" + perpetualQuote);
        }
        TokenizedStockQuote tokenizedStockQuote = this.tokenized_stock_quote;
        if (tokenizedStockQuote != null) {
            arrayList.add("tokenized_stock_quote=" + tokenizedStockQuote);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "QuoteDetailData{", "}", 0, null, null, 56, null);
    }

    public final QuoteDetailData copy(SpotQuote spot_quote, PerpetualQuote perpetual_quote, TokenizedStockQuote tokenized_stock_quote, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new QuoteDetailData(spot_quote, perpetual_quote, tokenized_stock_quote, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(QuoteDetailData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<QuoteDetailData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: md_server_proxy.service.v1.QuoteDetailData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(QuoteDetailData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + SpotQuote.ADAPTER.encodedSizeWithTag(1, value.getSpot_quote()) + PerpetualQuote.ADAPTER.encodedSizeWithTag(2, value.getPerpetual_quote()) + TokenizedStockQuote.ADAPTER.encodedSizeWithTag(3, value.getTokenized_stock_quote());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, QuoteDetailData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                SpotQuote.ADAPTER.encodeWithTag(writer, 1, (int) value.getSpot_quote());
                PerpetualQuote.ADAPTER.encodeWithTag(writer, 2, (int) value.getPerpetual_quote());
                TokenizedStockQuote.ADAPTER.encodeWithTag(writer, 3, (int) value.getTokenized_stock_quote());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, QuoteDetailData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                TokenizedStockQuote.ADAPTER.encodeWithTag(writer, 3, (int) value.getTokenized_stock_quote());
                PerpetualQuote.ADAPTER.encodeWithTag(writer, 2, (int) value.getPerpetual_quote());
                SpotQuote.ADAPTER.encodeWithTag(writer, 1, (int) value.getSpot_quote());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public QuoteDetailData redact(QuoteDetailData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                SpotQuote spot_quote = value.getSpot_quote();
                SpotQuote spotQuoteRedact = spot_quote != null ? SpotQuote.ADAPTER.redact(spot_quote) : null;
                PerpetualQuote perpetual_quote = value.getPerpetual_quote();
                PerpetualQuote perpetualQuoteRedact = perpetual_quote != null ? PerpetualQuote.ADAPTER.redact(perpetual_quote) : null;
                TokenizedStockQuote tokenized_stock_quote = value.getTokenized_stock_quote();
                return value.copy(spotQuoteRedact, perpetualQuoteRedact, tokenized_stock_quote != null ? TokenizedStockQuote.ADAPTER.redact(tokenized_stock_quote) : null, ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public QuoteDetailData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                SpotQuote spotQuoteDecode = null;
                PerpetualQuote perpetualQuoteDecode = null;
                TokenizedStockQuote tokenizedStockQuoteDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new QuoteDetailData(spotQuoteDecode, perpetualQuoteDecode, tokenizedStockQuoteDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        spotQuoteDecode = SpotQuote.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        perpetualQuoteDecode = PerpetualQuote.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        tokenizedStockQuoteDecode = TokenizedStockQuote.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
