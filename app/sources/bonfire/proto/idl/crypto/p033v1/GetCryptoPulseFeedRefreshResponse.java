package bonfire.proto.idl.crypto.p033v1;

import bonfire.proto.idl.copilot.p032v1.InstrumentDigestDetail;
import bonfire.proto.idl.copilot.p032v1.InstrumentDigestPreview;
import bonfire.proto.idl.crypto.p033v1.GetCryptoPulseFeedRefreshResponse;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.api.ErrorResponse;
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
import rh_server_driven_ui.p531v1.Button;

/* compiled from: GetCryptoPulseFeedRefreshResponse.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B!\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\u0002H\u0017J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse;", "Lcom/squareup/wire/Message;", "", "feed_items", "", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse$FeedItem;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lokio/ByteString;)V", "getFeed_items", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "FeedItem", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class GetCryptoPulseFeedRefreshResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetCryptoPulseFeedRefreshResponse> ADAPTER;

    @WireField(adapter = "bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedRefreshResponse$FeedItem#ADAPTER", jsonName = "feedItems", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<FeedItem> feed_items;

    /* JADX WARN: Multi-variable type inference failed */
    public GetCryptoPulseFeedRefreshResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8911newBuilder();
    }

    public /* synthetic */ GetCryptoPulseFeedRefreshResponse(List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCryptoPulseFeedRefreshResponse(List<FeedItem> feed_items, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(feed_items, "feed_items");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.feed_items = Internal.immutableCopyOf("feed_items", feed_items);
    }

    public final List<FeedItem> getFeed_items() {
        return this.feed_items;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8911newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetCryptoPulseFeedRefreshResponse)) {
            return false;
        }
        GetCryptoPulseFeedRefreshResponse getCryptoPulseFeedRefreshResponse = (GetCryptoPulseFeedRefreshResponse) other;
        return Intrinsics.areEqual(unknownFields(), getCryptoPulseFeedRefreshResponse.unknownFields()) && Intrinsics.areEqual(this.feed_items, getCryptoPulseFeedRefreshResponse.feed_items);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.feed_items.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.feed_items.isEmpty()) {
            arrayList.add("feed_items=" + this.feed_items);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCryptoPulseFeedRefreshResponse{", "}", 0, null, null, 56, null);
    }

    public final GetCryptoPulseFeedRefreshResponse copy(List<FeedItem> feed_items, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(feed_items, "feed_items");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetCryptoPulseFeedRefreshResponse(feed_items, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetCryptoPulseFeedRefreshResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetCryptoPulseFeedRefreshResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedRefreshResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetCryptoPulseFeedRefreshResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + GetCryptoPulseFeedRefreshResponse.FeedItem.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getFeed_items());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetCryptoPulseFeedRefreshResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                GetCryptoPulseFeedRefreshResponse.FeedItem.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getFeed_items());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetCryptoPulseFeedRefreshResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                GetCryptoPulseFeedRefreshResponse.FeedItem.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getFeed_items());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetCryptoPulseFeedRefreshResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetCryptoPulseFeedRefreshResponse(arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(GetCryptoPulseFeedRefreshResponse.FeedItem.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetCryptoPulseFeedRefreshResponse redact(GetCryptoPulseFeedRefreshResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.copy(Internal.m26823redactElements(value.getFeed_items(), GetCryptoPulseFeedRefreshResponse.FeedItem.ADAPTER), ByteString.EMPTY);
            }
        };
    }

    /* compiled from: GetCryptoPulseFeedRefreshResponse.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004()*+Bg\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u001f\u001a\u00020\u0002H\u0017J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0004H\u0016Jf\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014¨\u0006,"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse$FeedItem;", "Lcom/squareup/wire/Message;", "", "currency_pair_id", "", "header", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse$FeedItem$Header;", "trade_button_content", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse$FeedItem$TradeButtonContent;", "digest", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse$FeedItem$Digest;", "price_movement_ratio", "asset_currency_code", "formatted_quote", "quantity", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse$FeedItem$Header;Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse$FeedItem$TradeButtonContent;Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse$FeedItem$Digest;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getCurrency_pair_id", "()Ljava/lang/String;", "getHeader", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse$FeedItem$Header;", "getTrade_button_content", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse$FeedItem$TradeButtonContent;", "getDigest", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse$FeedItem$Digest;", "getPrice_movement_ratio", "getAsset_currency_code", "getFormatted_quote", "getQuantity", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "Header", "TradeButtonContent", "Digest", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class FeedItem extends Message {

        @JvmField
        public static final ProtoAdapter<FeedItem> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "assetCurrencyCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
        private final String asset_currency_code;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "currencyPairId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String currency_pair_id;

        @WireField(adapter = "bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedRefreshResponse$FeedItem$Digest#ADAPTER", schemaIndex = 3, tag = 4)
        private final Digest digest;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "formattedQuote", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
        private final String formatted_quote;

        @WireField(adapter = "bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedRefreshResponse$FeedItem$Header#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final Header header;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "priceMovementRatio", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
        private final String price_movement_ratio;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
        private final String quantity;

        @WireField(adapter = "bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedRefreshResponse$FeedItem$TradeButtonContent#ADAPTER", jsonName = "tradeButtonContent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final TradeButtonContent trade_button_content;

        public FeedItem() {
            this(null, null, null, null, null, null, null, null, null, 511, null);
        }

        public /* synthetic */ FeedItem(String str, Header header, TradeButtonContent tradeButtonContent, Digest digest, String str2, String str3, String str4, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : header, (i & 4) != 0 ? null : tradeButtonContent, (i & 8) != 0 ? null : digest, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? ByteString.EMPTY : byteString);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m8912newBuilder();
        }

        public final String getCurrency_pair_id() {
            return this.currency_pair_id;
        }

        public final Header getHeader() {
            return this.header;
        }

        public final TradeButtonContent getTrade_button_content() {
            return this.trade_button_content;
        }

        public final Digest getDigest() {
            return this.digest;
        }

        public final String getPrice_movement_ratio() {
            return this.price_movement_ratio;
        }

        public final String getAsset_currency_code() {
            return this.asset_currency_code;
        }

        public final String getFormatted_quote() {
            return this.formatted_quote;
        }

        public final String getQuantity() {
            return this.quantity;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FeedItem(String currency_pair_id, Header header, TradeButtonContent tradeButtonContent, Digest digest, String price_movement_ratio, String asset_currency_code, String formatted_quote, String quantity, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
            Intrinsics.checkNotNullParameter(price_movement_ratio, "price_movement_ratio");
            Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
            Intrinsics.checkNotNullParameter(formatted_quote, "formatted_quote");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.currency_pair_id = currency_pair_id;
            this.header = header;
            this.trade_button_content = tradeButtonContent;
            this.digest = digest;
            this.price_movement_ratio = price_movement_ratio;
            this.asset_currency_code = asset_currency_code;
            this.formatted_quote = formatted_quote;
            this.quantity = quantity;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m8912newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof FeedItem)) {
                return false;
            }
            FeedItem feedItem = (FeedItem) other;
            return Intrinsics.areEqual(unknownFields(), feedItem.unknownFields()) && Intrinsics.areEqual(this.currency_pair_id, feedItem.currency_pair_id) && Intrinsics.areEqual(this.header, feedItem.header) && Intrinsics.areEqual(this.trade_button_content, feedItem.trade_button_content) && Intrinsics.areEqual(this.digest, feedItem.digest) && Intrinsics.areEqual(this.price_movement_ratio, feedItem.price_movement_ratio) && Intrinsics.areEqual(this.asset_currency_code, feedItem.asset_currency_code) && Intrinsics.areEqual(this.formatted_quote, feedItem.formatted_quote) && Intrinsics.areEqual(this.quantity, feedItem.quantity);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = ((unknownFields().hashCode() * 37) + this.currency_pair_id.hashCode()) * 37;
            Header header = this.header;
            int iHashCode2 = (iHashCode + (header != null ? header.hashCode() : 0)) * 37;
            TradeButtonContent tradeButtonContent = this.trade_button_content;
            int iHashCode3 = (iHashCode2 + (tradeButtonContent != null ? tradeButtonContent.hashCode() : 0)) * 37;
            Digest digest = this.digest;
            int iHashCode4 = ((((((((iHashCode3 + (digest != null ? digest.hashCode() : 0)) * 37) + this.price_movement_ratio.hashCode()) * 37) + this.asset_currency_code.hashCode()) * 37) + this.formatted_quote.hashCode()) * 37) + this.quantity.hashCode();
            this.hashCode = iHashCode4;
            return iHashCode4;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("currency_pair_id=" + Internal.sanitize(this.currency_pair_id));
            Header header = this.header;
            if (header != null) {
                arrayList.add("header=" + header);
            }
            TradeButtonContent tradeButtonContent = this.trade_button_content;
            if (tradeButtonContent != null) {
                arrayList.add("trade_button_content=" + tradeButtonContent);
            }
            Digest digest = this.digest;
            if (digest != null) {
                arrayList.add("digest=" + digest);
            }
            arrayList.add("price_movement_ratio=" + Internal.sanitize(this.price_movement_ratio));
            arrayList.add("asset_currency_code=" + Internal.sanitize(this.asset_currency_code));
            arrayList.add("formatted_quote=" + Internal.sanitize(this.formatted_quote));
            arrayList.add("quantity=" + Internal.sanitize(this.quantity));
            return CollectionsKt.joinToString$default(arrayList, ", ", "FeedItem{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ FeedItem copy$default(FeedItem feedItem, String str, Header header, TradeButtonContent tradeButtonContent, Digest digest, String str2, String str3, String str4, String str5, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = feedItem.currency_pair_id;
            }
            if ((i & 2) != 0) {
                header = feedItem.header;
            }
            if ((i & 4) != 0) {
                tradeButtonContent = feedItem.trade_button_content;
            }
            if ((i & 8) != 0) {
                digest = feedItem.digest;
            }
            if ((i & 16) != 0) {
                str2 = feedItem.price_movement_ratio;
            }
            if ((i & 32) != 0) {
                str3 = feedItem.asset_currency_code;
            }
            if ((i & 64) != 0) {
                str4 = feedItem.formatted_quote;
            }
            if ((i & 128) != 0) {
                str5 = feedItem.quantity;
            }
            if ((i & 256) != 0) {
                byteString = feedItem.unknownFields();
            }
            String str6 = str5;
            ByteString byteString2 = byteString;
            String str7 = str3;
            String str8 = str4;
            String str9 = str2;
            TradeButtonContent tradeButtonContent2 = tradeButtonContent;
            return feedItem.copy(str, header, tradeButtonContent2, digest, str9, str7, str8, str6, byteString2);
        }

        public final FeedItem copy(String currency_pair_id, Header header, TradeButtonContent trade_button_content, Digest digest, String price_movement_ratio, String asset_currency_code, String formatted_quote, String quantity, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
            Intrinsics.checkNotNullParameter(price_movement_ratio, "price_movement_ratio");
            Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
            Intrinsics.checkNotNullParameter(formatted_quote, "formatted_quote");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new FeedItem(currency_pair_id, header, trade_button_content, digest, price_movement_ratio, asset_currency_code, formatted_quote, quantity, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FeedItem.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<FeedItem>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedRefreshResponse$FeedItem$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(GetCryptoPulseFeedRefreshResponse.FeedItem value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getCurrency_pair_id());
                    }
                    if (value.getHeader() != null) {
                        size += GetCryptoPulseFeedRefreshResponse.FeedItem.Header.ADAPTER.encodedSizeWithTag(2, value.getHeader());
                    }
                    if (value.getTrade_button_content() != null) {
                        size += GetCryptoPulseFeedRefreshResponse.FeedItem.TradeButtonContent.ADAPTER.encodedSizeWithTag(3, value.getTrade_button_content());
                    }
                    int iEncodedSizeWithTag = size + GetCryptoPulseFeedRefreshResponse.FeedItem.Digest.ADAPTER.encodedSizeWithTag(4, value.getDigest());
                    if (!Intrinsics.areEqual(value.getPrice_movement_ratio(), "")) {
                        iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getPrice_movement_ratio());
                    }
                    if (!Intrinsics.areEqual(value.getAsset_currency_code(), "")) {
                        iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getAsset_currency_code());
                    }
                    if (!Intrinsics.areEqual(value.getFormatted_quote(), "")) {
                        iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getFormatted_quote());
                    }
                    return !Intrinsics.areEqual(value.getQuantity(), "") ? iEncodedSizeWithTag + ProtoAdapter.STRING.encodedSizeWithTag(8, value.getQuantity()) : iEncodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, GetCryptoPulseFeedRefreshResponse.FeedItem value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCurrency_pair_id());
                    }
                    if (value.getHeader() != null) {
                        GetCryptoPulseFeedRefreshResponse.FeedItem.Header.ADAPTER.encodeWithTag(writer, 2, (int) value.getHeader());
                    }
                    if (value.getTrade_button_content() != null) {
                        GetCryptoPulseFeedRefreshResponse.FeedItem.TradeButtonContent.ADAPTER.encodeWithTag(writer, 3, (int) value.getTrade_button_content());
                    }
                    GetCryptoPulseFeedRefreshResponse.FeedItem.Digest.ADAPTER.encodeWithTag(writer, 4, (int) value.getDigest());
                    if (!Intrinsics.areEqual(value.getPrice_movement_ratio(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getPrice_movement_ratio());
                    }
                    if (!Intrinsics.areEqual(value.getAsset_currency_code(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getAsset_currency_code());
                    }
                    if (!Intrinsics.areEqual(value.getFormatted_quote(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getFormatted_quote());
                    }
                    if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getQuantity());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, GetCryptoPulseFeedRefreshResponse.FeedItem value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getQuantity());
                    }
                    if (!Intrinsics.areEqual(value.getFormatted_quote(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getFormatted_quote());
                    }
                    if (!Intrinsics.areEqual(value.getAsset_currency_code(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getAsset_currency_code());
                    }
                    if (!Intrinsics.areEqual(value.getPrice_movement_ratio(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getPrice_movement_ratio());
                    }
                    GetCryptoPulseFeedRefreshResponse.FeedItem.Digest.ADAPTER.encodeWithTag(writer, 4, (int) value.getDigest());
                    if (value.getTrade_button_content() != null) {
                        GetCryptoPulseFeedRefreshResponse.FeedItem.TradeButtonContent.ADAPTER.encodeWithTag(writer, 3, (int) value.getTrade_button_content());
                    }
                    if (value.getHeader() != null) {
                        GetCryptoPulseFeedRefreshResponse.FeedItem.Header.ADAPTER.encodeWithTag(writer, 2, (int) value.getHeader());
                    }
                    if (Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCurrency_pair_id());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public GetCryptoPulseFeedRefreshResponse.FeedItem redact(GetCryptoPulseFeedRefreshResponse.FeedItem value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    GetCryptoPulseFeedRefreshResponse.FeedItem.Header header = value.getHeader();
                    GetCryptoPulseFeedRefreshResponse.FeedItem.Header headerRedact = header != null ? GetCryptoPulseFeedRefreshResponse.FeedItem.Header.ADAPTER.redact(header) : null;
                    GetCryptoPulseFeedRefreshResponse.FeedItem.TradeButtonContent trade_button_content = value.getTrade_button_content();
                    GetCryptoPulseFeedRefreshResponse.FeedItem.TradeButtonContent tradeButtonContentRedact = trade_button_content != null ? GetCryptoPulseFeedRefreshResponse.FeedItem.TradeButtonContent.ADAPTER.redact(trade_button_content) : null;
                    GetCryptoPulseFeedRefreshResponse.FeedItem.Digest digest = value.getDigest();
                    return GetCryptoPulseFeedRefreshResponse.FeedItem.copy$default(value, null, headerRedact, tradeButtonContentRedact, digest != null ? GetCryptoPulseFeedRefreshResponse.FeedItem.Digest.ADAPTER.redact(digest) : null, null, null, null, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public GetCryptoPulseFeedRefreshResponse.FeedItem decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    String strDecode2 = "";
                    String strDecode3 = strDecode2;
                    String strDecode4 = strDecode3;
                    GetCryptoPulseFeedRefreshResponse.FeedItem.Header headerDecode = null;
                    GetCryptoPulseFeedRefreshResponse.FeedItem.TradeButtonContent tradeButtonContentDecode = null;
                    GetCryptoPulseFeedRefreshResponse.FeedItem.Digest digestDecode = null;
                    String strDecode5 = strDecode4;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    headerDecode = GetCryptoPulseFeedRefreshResponse.FeedItem.Header.ADAPTER.decode(reader);
                                    break;
                                case 3:
                                    tradeButtonContentDecode = GetCryptoPulseFeedRefreshResponse.FeedItem.TradeButtonContent.ADAPTER.decode(reader);
                                    break;
                                case 4:
                                    digestDecode = GetCryptoPulseFeedRefreshResponse.FeedItem.Digest.ADAPTER.decode(reader);
                                    break;
                                case 5:
                                    strDecode5 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 6:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 7:
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 8:
                                    strDecode4 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new GetCryptoPulseFeedRefreshResponse.FeedItem(strDecode, headerDecode, tradeButtonContentDecode, digestDecode, strDecode5, strDecode2, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            };
        }

        /* compiled from: GetCryptoPulseFeedRefreshResponse.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0019\u001a\u001bB)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse$FeedItem$Header;", "Lcom/squareup/wire/Message;", "", "position_details", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse$FeedItem$Header$PositionDetails;", "condensed", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse$FeedItem$Header$Condensed;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse$FeedItem$Header$PositionDetails;Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse$FeedItem$Header$Condensed;Lokio/ByteString;)V", "getPosition_details", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse$FeedItem$Header$PositionDetails;", "getCondensed", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse$FeedItem$Header$Condensed;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "Condensed", "PositionDetails", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Header extends Message {

            @JvmField
            public static final ProtoAdapter<Header> ADAPTER;

            @WireField(adapter = "bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedRefreshResponse$FeedItem$Header$Condensed#ADAPTER", oneofName = "type", schemaIndex = 1, tag = 2)
            private final Condensed condensed;

            @WireField(adapter = "bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedRefreshResponse$FeedItem$Header$PositionDetails#ADAPTER", jsonName = "positionDetails", oneofName = "type", schemaIndex = 0, tag = 1)
            private final PositionDetails position_details;

            public Header() {
                this(null, null, null, 7, null);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m8914newBuilder();
            }

            public final PositionDetails getPosition_details() {
                return this.position_details;
            }

            public final Condensed getCondensed() {
                return this.condensed;
            }

            public /* synthetic */ Header(PositionDetails positionDetails, Condensed condensed, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : positionDetails, (i & 2) != 0 ? null : condensed, (i & 4) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Header(PositionDetails positionDetails, Condensed condensed, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.position_details = positionDetails;
                this.condensed = condensed;
                if (Internal.countNonNull(positionDetails, condensed) > 1) {
                    throw new IllegalArgumentException("At most one of position_details, condensed may be non-null");
                }
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m8914newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Header)) {
                    return false;
                }
                Header header = (Header) other;
                return Intrinsics.areEqual(unknownFields(), header.unknownFields()) && Intrinsics.areEqual(this.position_details, header.position_details) && Intrinsics.areEqual(this.condensed, header.condensed);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = unknownFields().hashCode() * 37;
                PositionDetails positionDetails = this.position_details;
                int iHashCode2 = (iHashCode + (positionDetails != null ? positionDetails.hashCode() : 0)) * 37;
                Condensed condensed = this.condensed;
                int iHashCode3 = iHashCode2 + (condensed != null ? condensed.hashCode() : 0);
                this.hashCode = iHashCode3;
                return iHashCode3;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                PositionDetails positionDetails = this.position_details;
                if (positionDetails != null) {
                    arrayList.add("position_details=" + positionDetails);
                }
                Condensed condensed = this.condensed;
                if (condensed != null) {
                    arrayList.add("condensed=" + condensed);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Header{", "}", 0, null, null, 56, null);
            }

            public final Header copy(PositionDetails position_details, Condensed condensed, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new Header(position_details, condensed, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Header.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<Header>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedRefreshResponse$FeedItem$Header$Companion$ADAPTER$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.squareup.wire.ProtoAdapter
                    public GetCryptoPulseFeedRefreshResponse.FeedItem.Header decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        GetCryptoPulseFeedRefreshResponse.FeedItem.Header.PositionDetails positionDetailsDecode = null;
                        GetCryptoPulseFeedRefreshResponse.FeedItem.Header.Condensed condensedDecode = null;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new GetCryptoPulseFeedRefreshResponse.FeedItem.Header(positionDetailsDecode, condensedDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                positionDetailsDecode = GetCryptoPulseFeedRefreshResponse.FeedItem.Header.PositionDetails.ADAPTER.decode(reader);
                            } else if (iNextTag == 2) {
                                condensedDecode = GetCryptoPulseFeedRefreshResponse.FeedItem.Header.Condensed.ADAPTER.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(GetCryptoPulseFeedRefreshResponse.FeedItem.Header value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return value.unknownFields().size() + GetCryptoPulseFeedRefreshResponse.FeedItem.Header.PositionDetails.ADAPTER.encodedSizeWithTag(1, value.getPosition_details()) + GetCryptoPulseFeedRefreshResponse.FeedItem.Header.Condensed.ADAPTER.encodedSizeWithTag(2, value.getCondensed());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, GetCryptoPulseFeedRefreshResponse.FeedItem.Header value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        GetCryptoPulseFeedRefreshResponse.FeedItem.Header.PositionDetails.ADAPTER.encodeWithTag(writer, 1, (int) value.getPosition_details());
                        GetCryptoPulseFeedRefreshResponse.FeedItem.Header.Condensed.ADAPTER.encodeWithTag(writer, 2, (int) value.getCondensed());
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, GetCryptoPulseFeedRefreshResponse.FeedItem.Header value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        GetCryptoPulseFeedRefreshResponse.FeedItem.Header.Condensed.ADAPTER.encodeWithTag(writer, 2, (int) value.getCondensed());
                        GetCryptoPulseFeedRefreshResponse.FeedItem.Header.PositionDetails.ADAPTER.encodeWithTag(writer, 1, (int) value.getPosition_details());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public GetCryptoPulseFeedRefreshResponse.FeedItem.Header redact(GetCryptoPulseFeedRefreshResponse.FeedItem.Header value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        GetCryptoPulseFeedRefreshResponse.FeedItem.Header.PositionDetails position_details = value.getPosition_details();
                        GetCryptoPulseFeedRefreshResponse.FeedItem.Header.PositionDetails positionDetailsRedact = position_details != null ? GetCryptoPulseFeedRefreshResponse.FeedItem.Header.PositionDetails.ADAPTER.redact(position_details) : null;
                        GetCryptoPulseFeedRefreshResponse.FeedItem.Header.Condensed condensed = value.getCondensed();
                        return value.copy(positionDetailsRedact, condensed != null ? GetCryptoPulseFeedRefreshResponse.FeedItem.Header.Condensed.ADAPTER.redact(condensed) : null, ByteString.EMPTY);
                    }
                };
            }

            /* compiled from: GetCryptoPulseFeedRefreshResponse.kt */
            @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse$FeedItem$Header$Condensed;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Condensed extends Message {

                @JvmField
                public static final ProtoAdapter<Condensed> ADAPTER;

                /* JADX WARN: Multi-variable type inference failed */
                public Condensed() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                @Override // com.squareup.wire.Message
                public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                    return (Message.Builder) m8915newBuilder();
                }

                public /* synthetic */ Condensed(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? ByteString.EMPTY : byteString);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Condensed(ByteString unknownFields) {
                    super(ADAPTER, unknownFields);
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                }

                @Deprecated
                /* renamed from: newBuilder, reason: collision with other method in class */
                public /* synthetic */ Void m8915newBuilder() {
                    throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
                }

                public boolean equals(Object other) {
                    if (other == this) {
                        return true;
                    }
                    return (other instanceof Condensed) && Intrinsics.areEqual(unknownFields(), ((Condensed) other).unknownFields());
                }

                public int hashCode() {
                    return unknownFields().hashCode();
                }

                @Override // com.squareup.wire.Message
                public String toString() {
                    return "Condensed{}";
                }

                public final Condensed copy(ByteString unknownFields) {
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    return new Condensed(unknownFields);
                }

                static {
                    final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                    final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Condensed.class);
                    final Syntax syntax = Syntax.PROTO_3;
                    ADAPTER = new ProtoAdapter<Condensed>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedRefreshResponse$FeedItem$Header$Condensed$Companion$ADAPTER$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.squareup.wire.ProtoAdapter
                        public GetCryptoPulseFeedRefreshResponse.FeedItem.Header.Condensed decode(ProtoReader reader) throws IOException {
                            Intrinsics.checkNotNullParameter(reader, "reader");
                            long jBeginMessage = reader.beginMessage();
                            while (true) {
                                int iNextTag = reader.nextTag();
                                if (iNextTag != -1) {
                                    reader.readUnknownField(iNextTag);
                                } else {
                                    return new GetCryptoPulseFeedRefreshResponse.FeedItem.Header.Condensed(reader.endMessageAndGetUnknownFields(jBeginMessage));
                                }
                            }
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public int encodedSize(GetCryptoPulseFeedRefreshResponse.FeedItem.Header.Condensed value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            return value.unknownFields().size();
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ProtoWriter writer, GetCryptoPulseFeedRefreshResponse.FeedItem.Header.Condensed value) throws IOException {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ReverseProtoWriter writer, GetCryptoPulseFeedRefreshResponse.FeedItem.Header.Condensed value) {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public GetCryptoPulseFeedRefreshResponse.FeedItem.Header.Condensed redact(GetCryptoPulseFeedRefreshResponse.FeedItem.Header.Condensed value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            return value.copy(ByteString.EMPTY);
                        }
                    };
                }
            }

            /* compiled from: GetCryptoPulseFeedRefreshResponse.kt */
            @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse$FeedItem$Header$PositionDetails;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class PositionDetails extends Message {

                @JvmField
                public static final ProtoAdapter<PositionDetails> ADAPTER;

                /* JADX WARN: Multi-variable type inference failed */
                public PositionDetails() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                @Override // com.squareup.wire.Message
                public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                    return (Message.Builder) m8916newBuilder();
                }

                public /* synthetic */ PositionDetails(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? ByteString.EMPTY : byteString);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public PositionDetails(ByteString unknownFields) {
                    super(ADAPTER, unknownFields);
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                }

                @Deprecated
                /* renamed from: newBuilder, reason: collision with other method in class */
                public /* synthetic */ Void m8916newBuilder() {
                    throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
                }

                public boolean equals(Object other) {
                    if (other == this) {
                        return true;
                    }
                    return (other instanceof PositionDetails) && Intrinsics.areEqual(unknownFields(), ((PositionDetails) other).unknownFields());
                }

                public int hashCode() {
                    return unknownFields().hashCode();
                }

                @Override // com.squareup.wire.Message
                public String toString() {
                    return "PositionDetails{}";
                }

                public final PositionDetails copy(ByteString unknownFields) {
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    return new PositionDetails(unknownFields);
                }

                static {
                    final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                    final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PositionDetails.class);
                    final Syntax syntax = Syntax.PROTO_3;
                    ADAPTER = new ProtoAdapter<PositionDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedRefreshResponse$FeedItem$Header$PositionDetails$Companion$ADAPTER$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.squareup.wire.ProtoAdapter
                        public GetCryptoPulseFeedRefreshResponse.FeedItem.Header.PositionDetails decode(ProtoReader reader) throws IOException {
                            Intrinsics.checkNotNullParameter(reader, "reader");
                            long jBeginMessage = reader.beginMessage();
                            while (true) {
                                int iNextTag = reader.nextTag();
                                if (iNextTag != -1) {
                                    reader.readUnknownField(iNextTag);
                                } else {
                                    return new GetCryptoPulseFeedRefreshResponse.FeedItem.Header.PositionDetails(reader.endMessageAndGetUnknownFields(jBeginMessage));
                                }
                            }
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public int encodedSize(GetCryptoPulseFeedRefreshResponse.FeedItem.Header.PositionDetails value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            return value.unknownFields().size();
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ProtoWriter writer, GetCryptoPulseFeedRefreshResponse.FeedItem.Header.PositionDetails value) throws IOException {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ReverseProtoWriter writer, GetCryptoPulseFeedRefreshResponse.FeedItem.Header.PositionDetails value) {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public GetCryptoPulseFeedRefreshResponse.FeedItem.Header.PositionDetails redact(GetCryptoPulseFeedRefreshResponse.FeedItem.Header.PositionDetails value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            return value.copy(ByteString.EMPTY);
                        }
                    };
                }
            }
        }

        /* compiled from: GetCryptoPulseFeedRefreshResponse.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J4\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse$FeedItem$TradeButtonContent;", "Lcom/squareup/wire/Message;", "", "expand_button_text", "", "is_expand_button_enabled", "", "trade_buttons", "", "Lrh_server_driven_ui/v1/Button;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;ZLjava/util/List;Lokio/ByteString;)V", "getExpand_button_text", "()Ljava/lang/String;", "()Z", "getTrade_buttons", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class TradeButtonContent extends Message {

            @JvmField
            public static final ProtoAdapter<TradeButtonContent> ADAPTER;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "expandButtonText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final String expand_button_text;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isExpandButtonEnabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
            private final boolean is_expand_button_enabled;

            @WireField(adapter = "rh_server_driven_ui.v1.Button#ADAPTER", jsonName = "tradeButtons", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
            private final List<Button> trade_buttons;

            public TradeButtonContent() {
                this(null, false, null, null, 15, null);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m8917newBuilder();
            }

            public final String getExpand_button_text() {
                return this.expand_button_text;
            }

            public /* synthetic */ TradeButtonContent(String str, boolean z, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? ByteString.EMPTY : byteString);
            }

            /* renamed from: is_expand_button_enabled, reason: from getter */
            public final boolean getIs_expand_button_enabled() {
                return this.is_expand_button_enabled;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TradeButtonContent(String expand_button_text, boolean z, List<Button> trade_buttons, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(expand_button_text, "expand_button_text");
                Intrinsics.checkNotNullParameter(trade_buttons, "trade_buttons");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.expand_button_text = expand_button_text;
                this.is_expand_button_enabled = z;
                this.trade_buttons = Internal.immutableCopyOf("trade_buttons", trade_buttons);
            }

            public final List<Button> getTrade_buttons() {
                return this.trade_buttons;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m8917newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof TradeButtonContent)) {
                    return false;
                }
                TradeButtonContent tradeButtonContent = (TradeButtonContent) other;
                return Intrinsics.areEqual(unknownFields(), tradeButtonContent.unknownFields()) && Intrinsics.areEqual(this.expand_button_text, tradeButtonContent.expand_button_text) && this.is_expand_button_enabled == tradeButtonContent.is_expand_button_enabled && Intrinsics.areEqual(this.trade_buttons, tradeButtonContent.trade_buttons);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = (((((unknownFields().hashCode() * 37) + this.expand_button_text.hashCode()) * 37) + Boolean.hashCode(this.is_expand_button_enabled)) * 37) + this.trade_buttons.hashCode();
                this.hashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("expand_button_text=" + Internal.sanitize(this.expand_button_text));
                arrayList.add("is_expand_button_enabled=" + this.is_expand_button_enabled);
                if (!this.trade_buttons.isEmpty()) {
                    arrayList.add("trade_buttons=" + this.trade_buttons);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "TradeButtonContent{", "}", 0, null, null, 56, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ TradeButtonContent copy$default(TradeButtonContent tradeButtonContent, String str, boolean z, List list, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = tradeButtonContent.expand_button_text;
                }
                if ((i & 2) != 0) {
                    z = tradeButtonContent.is_expand_button_enabled;
                }
                if ((i & 4) != 0) {
                    list = tradeButtonContent.trade_buttons;
                }
                if ((i & 8) != 0) {
                    byteString = tradeButtonContent.unknownFields();
                }
                return tradeButtonContent.copy(str, z, list, byteString);
            }

            public final TradeButtonContent copy(String expand_button_text, boolean is_expand_button_enabled, List<Button> trade_buttons, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(expand_button_text, "expand_button_text");
                Intrinsics.checkNotNullParameter(trade_buttons, "trade_buttons");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new TradeButtonContent(expand_button_text, is_expand_button_enabled, trade_buttons, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TradeButtonContent.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<TradeButtonContent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedRefreshResponse$FeedItem$TradeButtonContent$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(GetCryptoPulseFeedRefreshResponse.FeedItem.TradeButtonContent value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        if (!Intrinsics.areEqual(value.getExpand_button_text(), "")) {
                            size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getExpand_button_text());
                        }
                        if (value.getIs_expand_button_enabled()) {
                            size += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getIs_expand_button_enabled()));
                        }
                        return size + Button.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getTrade_buttons());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, GetCryptoPulseFeedRefreshResponse.FeedItem.TradeButtonContent value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (!Intrinsics.areEqual(value.getExpand_button_text(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getExpand_button_text());
                        }
                        if (value.getIs_expand_button_enabled()) {
                            ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIs_expand_button_enabled()));
                        }
                        Button.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getTrade_buttons());
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, GetCryptoPulseFeedRefreshResponse.FeedItem.TradeButtonContent value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        Button.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getTrade_buttons());
                        if (value.getIs_expand_button_enabled()) {
                            ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIs_expand_button_enabled()));
                        }
                        if (Intrinsics.areEqual(value.getExpand_button_text(), "")) {
                            return;
                        }
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getExpand_button_text());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.squareup.wire.ProtoAdapter
                    public GetCryptoPulseFeedRefreshResponse.FeedItem.TradeButtonContent decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        ArrayList arrayList = new ArrayList();
                        long jBeginMessage = reader.beginMessage();
                        String strDecode = "";
                        boolean zBooleanValue = false;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new GetCryptoPulseFeedRefreshResponse.FeedItem.TradeButtonContent(strDecode, zBooleanValue, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 2) {
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            } else if (iNextTag == 3) {
                                arrayList.add(Button.ADAPTER.decode(reader));
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public GetCryptoPulseFeedRefreshResponse.FeedItem.TradeButtonContent redact(GetCryptoPulseFeedRefreshResponse.FeedItem.TradeButtonContent value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return GetCryptoPulseFeedRefreshResponse.FeedItem.TradeButtonContent.copy$default(value, null, false, Internal.m26823redactElements(value.getTrade_buttons(), Button.ADAPTER), ByteString.EMPTY, 3, null);
                    }
                };
            }
        }

        /* compiled from: GetCryptoPulseFeedRefreshResponse.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J2\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse$FeedItem$Digest;", "Lcom/squareup/wire/Message;", "", "digest_id", "", AnalyticsStrings.BUTTON_EARNINGS_PREVIEW, "Lbonfire/proto/idl/copilot/v1/InstrumentDigestPreview;", ErrorResponse.DETAIL, "Lbonfire/proto/idl/copilot/v1/InstrumentDigestDetail;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lbonfire/proto/idl/copilot/v1/InstrumentDigestPreview;Lbonfire/proto/idl/copilot/v1/InstrumentDigestDetail;Lokio/ByteString;)V", "getDigest_id", "()Ljava/lang/String;", "getPreview", "()Lbonfire/proto/idl/copilot/v1/InstrumentDigestPreview;", "getDetail", "()Lbonfire/proto/idl/copilot/v1/InstrumentDigestDetail;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Digest extends Message {

            @JvmField
            public static final ProtoAdapter<Digest> ADAPTER;

            @WireField(adapter = "bonfire.proto.idl.copilot.v1.InstrumentDigestDetail#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
            private final InstrumentDigestDetail detail;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "digestId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final String digest_id;

            @WireField(adapter = "bonfire.proto.idl.copilot.v1.InstrumentDigestPreview#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
            private final InstrumentDigestPreview preview;

            public Digest() {
                this(null, null, null, null, 15, null);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m8913newBuilder();
            }

            public final String getDigest_id() {
                return this.digest_id;
            }

            public /* synthetic */ Digest(String str, InstrumentDigestPreview instrumentDigestPreview, InstrumentDigestDetail instrumentDigestDetail, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : instrumentDigestPreview, (i & 4) != 0 ? null : instrumentDigestDetail, (i & 8) != 0 ? ByteString.EMPTY : byteString);
            }

            public final InstrumentDigestPreview getPreview() {
                return this.preview;
            }

            public final InstrumentDigestDetail getDetail() {
                return this.detail;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Digest(String digest_id, InstrumentDigestPreview instrumentDigestPreview, InstrumentDigestDetail instrumentDigestDetail, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(digest_id, "digest_id");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.digest_id = digest_id;
                this.preview = instrumentDigestPreview;
                this.detail = instrumentDigestDetail;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m8913newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Digest)) {
                    return false;
                }
                Digest digest = (Digest) other;
                return Intrinsics.areEqual(unknownFields(), digest.unknownFields()) && Intrinsics.areEqual(this.digest_id, digest.digest_id) && Intrinsics.areEqual(this.preview, digest.preview) && Intrinsics.areEqual(this.detail, digest.detail);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = ((unknownFields().hashCode() * 37) + this.digest_id.hashCode()) * 37;
                InstrumentDigestPreview instrumentDigestPreview = this.preview;
                int iHashCode2 = (iHashCode + (instrumentDigestPreview != null ? instrumentDigestPreview.hashCode() : 0)) * 37;
                InstrumentDigestDetail instrumentDigestDetail = this.detail;
                int iHashCode3 = iHashCode2 + (instrumentDigestDetail != null ? instrumentDigestDetail.hashCode() : 0);
                this.hashCode = iHashCode3;
                return iHashCode3;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("digest_id=" + Internal.sanitize(this.digest_id));
                InstrumentDigestPreview instrumentDigestPreview = this.preview;
                if (instrumentDigestPreview != null) {
                    arrayList.add("preview=" + instrumentDigestPreview);
                }
                InstrumentDigestDetail instrumentDigestDetail = this.detail;
                if (instrumentDigestDetail != null) {
                    arrayList.add("detail=" + instrumentDigestDetail);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Digest{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ Digest copy$default(Digest digest, String str, InstrumentDigestPreview instrumentDigestPreview, InstrumentDigestDetail instrumentDigestDetail, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = digest.digest_id;
                }
                if ((i & 2) != 0) {
                    instrumentDigestPreview = digest.preview;
                }
                if ((i & 4) != 0) {
                    instrumentDigestDetail = digest.detail;
                }
                if ((i & 8) != 0) {
                    byteString = digest.unknownFields();
                }
                return digest.copy(str, instrumentDigestPreview, instrumentDigestDetail, byteString);
            }

            public final Digest copy(String digest_id, InstrumentDigestPreview preview, InstrumentDigestDetail detail, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(digest_id, "digest_id");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new Digest(digest_id, preview, detail, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Digest.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<Digest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedRefreshResponse$FeedItem$Digest$Companion$ADAPTER$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.squareup.wire.ProtoAdapter
                    public GetCryptoPulseFeedRefreshResponse.FeedItem.Digest decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        String strDecode = "";
                        InstrumentDigestPreview instrumentDigestPreviewDecode = null;
                        InstrumentDigestDetail instrumentDigestDetailDecode = null;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new GetCryptoPulseFeedRefreshResponse.FeedItem.Digest(strDecode, instrumentDigestPreviewDecode, instrumentDigestDetailDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 2) {
                                instrumentDigestPreviewDecode = InstrumentDigestPreview.ADAPTER.decode(reader);
                            } else if (iNextTag == 3) {
                                instrumentDigestDetailDecode = InstrumentDigestDetail.ADAPTER.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(GetCryptoPulseFeedRefreshResponse.FeedItem.Digest value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        if (!Intrinsics.areEqual(value.getDigest_id(), "")) {
                            size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getDigest_id());
                        }
                        if (value.getPreview() != null) {
                            size += InstrumentDigestPreview.ADAPTER.encodedSizeWithTag(2, value.getPreview());
                        }
                        return value.getDetail() != null ? size + InstrumentDigestDetail.ADAPTER.encodedSizeWithTag(3, value.getDetail()) : size;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, GetCryptoPulseFeedRefreshResponse.FeedItem.Digest value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (!Intrinsics.areEqual(value.getDigest_id(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDigest_id());
                        }
                        if (value.getPreview() != null) {
                            InstrumentDigestPreview.ADAPTER.encodeWithTag(writer, 2, (int) value.getPreview());
                        }
                        if (value.getDetail() != null) {
                            InstrumentDigestDetail.ADAPTER.encodeWithTag(writer, 3, (int) value.getDetail());
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, GetCryptoPulseFeedRefreshResponse.FeedItem.Digest value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        if (value.getDetail() != null) {
                            InstrumentDigestDetail.ADAPTER.encodeWithTag(writer, 3, (int) value.getDetail());
                        }
                        if (value.getPreview() != null) {
                            InstrumentDigestPreview.ADAPTER.encodeWithTag(writer, 2, (int) value.getPreview());
                        }
                        if (Intrinsics.areEqual(value.getDigest_id(), "")) {
                            return;
                        }
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDigest_id());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public GetCryptoPulseFeedRefreshResponse.FeedItem.Digest redact(GetCryptoPulseFeedRefreshResponse.FeedItem.Digest value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        InstrumentDigestPreview preview = value.getPreview();
                        InstrumentDigestPreview instrumentDigestPreviewRedact = preview != null ? InstrumentDigestPreview.ADAPTER.redact(preview) : null;
                        InstrumentDigestDetail detail = value.getDetail();
                        return GetCryptoPulseFeedRefreshResponse.FeedItem.Digest.copy$default(value, null, instrumentDigestPreviewRedact, detail != null ? InstrumentDigestDetail.ADAPTER.redact(detail) : null, ByteString.EMPTY, 1, null);
                    }
                };
            }
        }
    }
}
