package crypto_perpetuals.contract.p436v1;

import com.robinhood.android.compose.bidask.BidAskDetails3;
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
import p479j$.time.Instant;

/* compiled from: ContractDetails.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\u0018\u0000 =2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001=BÃ\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0003H\u0016¢\u0006\u0004\b%\u0010&JÉ\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010&R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b+\u0010&R\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b,\u0010&R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b-\u0010&R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b.\u0010&R\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b/\u0010&R\u001a\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b0\u0010&R\u001a\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b1\u0010&R\u001a\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b2\u0010&R\u001a\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b3\u0010&R\u001a\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b4\u0010&R\"\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00105\u001a\u0004\b6\u00107R\u001a\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010)\u001a\u0004\b8\u0010&R\u001a\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010)\u001a\u0004\b9\u0010&R\u001a\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010)\u001a\u0004\b:\u0010&R\u001a\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010)\u001a\u0004\b;\u0010&R\u001a\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010)\u001a\u0004\b<\u0010&¨\u0006>"}, m3636d2 = {"Lcrypto_perpetuals/contract/v1/ContractDetails;", "Lcom/squareup/wire/Message;", "", "", "contract_id", BidAskDetails3.BID_PRICE, BidAskDetails3.BID_SIZE, BidAskDetails3.ASK_PRICE, BidAskDetails3.ASK_SIZE, "last_traded_price", "price_change_24", "price_percentage_change_24", "mark_price", "index_price", "funding_rate", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "funding_time", "open_interest", "volume_24", "high_24", "low_24", "open_24", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)Lcrypto_perpetuals/contract/v1/ContractDetails;", "Ljava/lang/String;", "getContract_id", "getBid_price", "getBid_size", "getAsk_price", "getAsk_size", "getLast_traded_price", "getPrice_change_24", "getPrice_percentage_change_24", "getMark_price", "getIndex_price", "getFunding_rate", "Lj$/time/Instant;", "getFunding_time", "()Lj$/time/Instant;", "getOpen_interest", "getVolume_24", "getHigh_24", "getLow_24", "getOpen_24", "Companion", "crypto_perpetuals.contract.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ContractDetails extends Message {

    @JvmField
    public static final ProtoAdapter<ContractDetails> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "askPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String ask_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "askSize", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String ask_size;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bidPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String bid_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bidSize", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String bid_size;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String contract_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "fundingRate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String funding_rate;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "fundingTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final Instant funding_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "high24", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final String high_24;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "indexPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String index_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lastTradedPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String last_traded_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "low24", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final String low_24;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "markPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String mark_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "open24", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 17)
    private final String open_24;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "openInterest", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final String open_interest;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "priceChange24", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String price_change_24;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "pricePercentageChange24", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String price_percentage_change_24;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "volume24", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final String volume_24;

    public ContractDetails() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
    }

    public /* synthetic */ ContractDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Instant instant, String str12, String str13, String str14, String str15, String str16, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? null : instant, (i & 4096) != 0 ? "" : str12, (i & 8192) != 0 ? "" : str13, (i & 16384) != 0 ? "" : str14, (i & 32768) != 0 ? "" : str15, (i & 65536) == 0 ? str16 : "", (i & 131072) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27826newBuilder();
    }

    public final String getContract_id() {
        return this.contract_id;
    }

    public final String getBid_price() {
        return this.bid_price;
    }

    public final String getBid_size() {
        return this.bid_size;
    }

    public final String getAsk_price() {
        return this.ask_price;
    }

    public final String getAsk_size() {
        return this.ask_size;
    }

    public final String getLast_traded_price() {
        return this.last_traded_price;
    }

    public final String getPrice_change_24() {
        return this.price_change_24;
    }

    public final String getPrice_percentage_change_24() {
        return this.price_percentage_change_24;
    }

    public final String getMark_price() {
        return this.mark_price;
    }

    public final String getIndex_price() {
        return this.index_price;
    }

    public final String getFunding_rate() {
        return this.funding_rate;
    }

    public final Instant getFunding_time() {
        return this.funding_time;
    }

    public final String getOpen_interest() {
        return this.open_interest;
    }

    public final String getVolume_24() {
        return this.volume_24;
    }

    public final String getHigh_24() {
        return this.high_24;
    }

    public final String getLow_24() {
        return this.low_24;
    }

    public final String getOpen_24() {
        return this.open_24;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractDetails(String contract_id, String bid_price, String bid_size, String ask_price, String ask_size, String last_traded_price, String price_change_24, String price_percentage_change_24, String mark_price, String index_price, String funding_rate, Instant instant, String open_interest, String volume_24, String high_24, String low_24, String open_24, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(bid_price, "bid_price");
        Intrinsics.checkNotNullParameter(bid_size, "bid_size");
        Intrinsics.checkNotNullParameter(ask_price, "ask_price");
        Intrinsics.checkNotNullParameter(ask_size, "ask_size");
        Intrinsics.checkNotNullParameter(last_traded_price, "last_traded_price");
        Intrinsics.checkNotNullParameter(price_change_24, "price_change_24");
        Intrinsics.checkNotNullParameter(price_percentage_change_24, "price_percentage_change_24");
        Intrinsics.checkNotNullParameter(mark_price, "mark_price");
        Intrinsics.checkNotNullParameter(index_price, "index_price");
        Intrinsics.checkNotNullParameter(funding_rate, "funding_rate");
        Intrinsics.checkNotNullParameter(open_interest, "open_interest");
        Intrinsics.checkNotNullParameter(volume_24, "volume_24");
        Intrinsics.checkNotNullParameter(high_24, "high_24");
        Intrinsics.checkNotNullParameter(low_24, "low_24");
        Intrinsics.checkNotNullParameter(open_24, "open_24");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.contract_id = contract_id;
        this.bid_price = bid_price;
        this.bid_size = bid_size;
        this.ask_price = ask_price;
        this.ask_size = ask_size;
        this.last_traded_price = last_traded_price;
        this.price_change_24 = price_change_24;
        this.price_percentage_change_24 = price_percentage_change_24;
        this.mark_price = mark_price;
        this.index_price = index_price;
        this.funding_rate = funding_rate;
        this.funding_time = instant;
        this.open_interest = open_interest;
        this.volume_24 = volume_24;
        this.high_24 = high_24;
        this.low_24 = low_24;
        this.open_24 = open_24;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27826newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ContractDetails)) {
            return false;
        }
        ContractDetails contractDetails = (ContractDetails) other;
        return Intrinsics.areEqual(unknownFields(), contractDetails.unknownFields()) && Intrinsics.areEqual(this.contract_id, contractDetails.contract_id) && Intrinsics.areEqual(this.bid_price, contractDetails.bid_price) && Intrinsics.areEqual(this.bid_size, contractDetails.bid_size) && Intrinsics.areEqual(this.ask_price, contractDetails.ask_price) && Intrinsics.areEqual(this.ask_size, contractDetails.ask_size) && Intrinsics.areEqual(this.last_traded_price, contractDetails.last_traded_price) && Intrinsics.areEqual(this.price_change_24, contractDetails.price_change_24) && Intrinsics.areEqual(this.price_percentage_change_24, contractDetails.price_percentage_change_24) && Intrinsics.areEqual(this.mark_price, contractDetails.mark_price) && Intrinsics.areEqual(this.index_price, contractDetails.index_price) && Intrinsics.areEqual(this.funding_rate, contractDetails.funding_rate) && Intrinsics.areEqual(this.funding_time, contractDetails.funding_time) && Intrinsics.areEqual(this.open_interest, contractDetails.open_interest) && Intrinsics.areEqual(this.volume_24, contractDetails.volume_24) && Intrinsics.areEqual(this.high_24, contractDetails.high_24) && Intrinsics.areEqual(this.low_24, contractDetails.low_24) && Intrinsics.areEqual(this.open_24, contractDetails.open_24);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((((((((((unknownFields().hashCode() * 37) + this.contract_id.hashCode()) * 37) + this.bid_price.hashCode()) * 37) + this.bid_size.hashCode()) * 37) + this.ask_price.hashCode()) * 37) + this.ask_size.hashCode()) * 37) + this.last_traded_price.hashCode()) * 37) + this.price_change_24.hashCode()) * 37) + this.price_percentage_change_24.hashCode()) * 37) + this.mark_price.hashCode()) * 37) + this.index_price.hashCode()) * 37) + this.funding_rate.hashCode()) * 37;
        Instant instant = this.funding_time;
        int iHashCode2 = ((((((((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.open_interest.hashCode()) * 37) + this.volume_24.hashCode()) * 37) + this.high_24.hashCode()) * 37) + this.low_24.hashCode()) * 37) + this.open_24.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("contract_id=" + Internal.sanitize(this.contract_id));
        arrayList.add("bid_price=" + Internal.sanitize(this.bid_price));
        arrayList.add("bid_size=" + Internal.sanitize(this.bid_size));
        arrayList.add("ask_price=" + Internal.sanitize(this.ask_price));
        arrayList.add("ask_size=" + Internal.sanitize(this.ask_size));
        arrayList.add("last_traded_price=" + Internal.sanitize(this.last_traded_price));
        arrayList.add("price_change_24=" + Internal.sanitize(this.price_change_24));
        arrayList.add("price_percentage_change_24=" + Internal.sanitize(this.price_percentage_change_24));
        arrayList.add("mark_price=" + Internal.sanitize(this.mark_price));
        arrayList.add("index_price=" + Internal.sanitize(this.index_price));
        arrayList.add("funding_rate=" + Internal.sanitize(this.funding_rate));
        Instant instant = this.funding_time;
        if (instant != null) {
            arrayList.add("funding_time=" + instant);
        }
        arrayList.add("open_interest=" + Internal.sanitize(this.open_interest));
        arrayList.add("volume_24=" + Internal.sanitize(this.volume_24));
        arrayList.add("high_24=" + Internal.sanitize(this.high_24));
        arrayList.add("low_24=" + Internal.sanitize(this.low_24));
        arrayList.add("open_24=" + Internal.sanitize(this.open_24));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ContractDetails{", "}", 0, null, null, 56, null);
    }

    public final ContractDetails copy(String contract_id, String bid_price, String bid_size, String ask_price, String ask_size, String last_traded_price, String price_change_24, String price_percentage_change_24, String mark_price, String index_price, String funding_rate, Instant funding_time, String open_interest, String volume_24, String high_24, String low_24, String open_24, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(bid_price, "bid_price");
        Intrinsics.checkNotNullParameter(bid_size, "bid_size");
        Intrinsics.checkNotNullParameter(ask_price, "ask_price");
        Intrinsics.checkNotNullParameter(ask_size, "ask_size");
        Intrinsics.checkNotNullParameter(last_traded_price, "last_traded_price");
        Intrinsics.checkNotNullParameter(price_change_24, "price_change_24");
        Intrinsics.checkNotNullParameter(price_percentage_change_24, "price_percentage_change_24");
        Intrinsics.checkNotNullParameter(mark_price, "mark_price");
        Intrinsics.checkNotNullParameter(index_price, "index_price");
        Intrinsics.checkNotNullParameter(funding_rate, "funding_rate");
        Intrinsics.checkNotNullParameter(open_interest, "open_interest");
        Intrinsics.checkNotNullParameter(volume_24, "volume_24");
        Intrinsics.checkNotNullParameter(high_24, "high_24");
        Intrinsics.checkNotNullParameter(low_24, "low_24");
        Intrinsics.checkNotNullParameter(open_24, "open_24");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ContractDetails(contract_id, bid_price, bid_size, ask_price, ask_size, last_traded_price, price_change_24, price_percentage_change_24, mark_price, index_price, funding_rate, funding_time, open_interest, volume_24, high_24, low_24, open_24, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ContractDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ContractDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.contract.v1.ContractDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ContractDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getContract_id());
                }
                if (!Intrinsics.areEqual(value.getBid_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getBid_price());
                }
                if (!Intrinsics.areEqual(value.getBid_size(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getBid_size());
                }
                if (!Intrinsics.areEqual(value.getAsk_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getAsk_price());
                }
                if (!Intrinsics.areEqual(value.getAsk_size(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getAsk_size());
                }
                if (!Intrinsics.areEqual(value.getLast_traded_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getLast_traded_price());
                }
                if (!Intrinsics.areEqual(value.getPrice_change_24(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getPrice_change_24());
                }
                if (!Intrinsics.areEqual(value.getPrice_percentage_change_24(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getPrice_percentage_change_24());
                }
                if (!Intrinsics.areEqual(value.getMark_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getMark_price());
                }
                if (!Intrinsics.areEqual(value.getIndex_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getIndex_price());
                }
                if (!Intrinsics.areEqual(value.getFunding_rate(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(11, value.getFunding_rate());
                }
                if (value.getFunding_time() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(12, value.getFunding_time());
                }
                if (!Intrinsics.areEqual(value.getOpen_interest(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(13, value.getOpen_interest());
                }
                if (!Intrinsics.areEqual(value.getVolume_24(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(14, value.getVolume_24());
                }
                if (!Intrinsics.areEqual(value.getHigh_24(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(15, value.getHigh_24());
                }
                if (!Intrinsics.areEqual(value.getLow_24(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(16, value.getLow_24());
                }
                return !Intrinsics.areEqual(value.getOpen_24(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(17, value.getOpen_24()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ContractDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContract_id());
                }
                if (!Intrinsics.areEqual(value.getBid_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getBid_price());
                }
                if (!Intrinsics.areEqual(value.getBid_size(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getBid_size());
                }
                if (!Intrinsics.areEqual(value.getAsk_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAsk_price());
                }
                if (!Intrinsics.areEqual(value.getAsk_size(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getAsk_size());
                }
                if (!Intrinsics.areEqual(value.getLast_traded_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getLast_traded_price());
                }
                if (!Intrinsics.areEqual(value.getPrice_change_24(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getPrice_change_24());
                }
                if (!Intrinsics.areEqual(value.getPrice_percentage_change_24(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getPrice_percentage_change_24());
                }
                if (!Intrinsics.areEqual(value.getMark_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getMark_price());
                }
                if (!Intrinsics.areEqual(value.getIndex_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getIndex_price());
                }
                if (!Intrinsics.areEqual(value.getFunding_rate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getFunding_rate());
                }
                if (value.getFunding_time() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 12, (int) value.getFunding_time());
                }
                if (!Intrinsics.areEqual(value.getOpen_interest(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getOpen_interest());
                }
                if (!Intrinsics.areEqual(value.getVolume_24(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getVolume_24());
                }
                if (!Intrinsics.areEqual(value.getHigh_24(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 15, (int) value.getHigh_24());
                }
                if (!Intrinsics.areEqual(value.getLow_24(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 16, (int) value.getLow_24());
                }
                if (!Intrinsics.areEqual(value.getOpen_24(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 17, (int) value.getOpen_24());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ContractDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getOpen_24(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 17, (int) value.getOpen_24());
                }
                if (!Intrinsics.areEqual(value.getLow_24(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 16, (int) value.getLow_24());
                }
                if (!Intrinsics.areEqual(value.getHigh_24(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 15, (int) value.getHigh_24());
                }
                if (!Intrinsics.areEqual(value.getVolume_24(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getVolume_24());
                }
                if (!Intrinsics.areEqual(value.getOpen_interest(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getOpen_interest());
                }
                if (value.getFunding_time() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 12, (int) value.getFunding_time());
                }
                if (!Intrinsics.areEqual(value.getFunding_rate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getFunding_rate());
                }
                if (!Intrinsics.areEqual(value.getIndex_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getIndex_price());
                }
                if (!Intrinsics.areEqual(value.getMark_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getMark_price());
                }
                if (!Intrinsics.areEqual(value.getPrice_percentage_change_24(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getPrice_percentage_change_24());
                }
                if (!Intrinsics.areEqual(value.getPrice_change_24(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getPrice_change_24());
                }
                if (!Intrinsics.areEqual(value.getLast_traded_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getLast_traded_price());
                }
                if (!Intrinsics.areEqual(value.getAsk_size(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getAsk_size());
                }
                if (!Intrinsics.areEqual(value.getAsk_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAsk_price());
                }
                if (!Intrinsics.areEqual(value.getBid_size(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getBid_size());
                }
                if (!Intrinsics.areEqual(value.getBid_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getBid_price());
                }
                if (Intrinsics.areEqual(value.getContract_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContract_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ContractDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                String strDecode8 = strDecode7;
                String strDecode9 = strDecode8;
                String strDecode10 = strDecode9;
                String strDecode11 = strDecode10;
                String strDecode12 = strDecode11;
                String strDecode13 = strDecode12;
                String strDecode14 = strDecode13;
                String strDecode15 = strDecode14;
                Instant instantDecode = null;
                String strDecode16 = strDecode15;
                while (true) {
                    int iNextTag = reader.nextTag();
                    String str = strDecode16;
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode15 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode16 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 10:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 11:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 12:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 13:
                                strDecode10 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 14:
                                strDecode11 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 15:
                                strDecode12 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 16:
                                strDecode13 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 17:
                                strDecode14 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                        strDecode16 = str;
                    } else {
                        return new ContractDetails(strDecode15, str, strDecode, strDecode2, strDecode3, strDecode4, strDecode5, strDecode6, strDecode7, strDecode8, strDecode9, instantDecode, strDecode10, strDecode11, strDecode12, strDecode13, strDecode14, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ContractDetails redact(ContractDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant funding_time = value.getFunding_time();
                return value.copy((129023 & 1) != 0 ? value.contract_id : null, (129023 & 2) != 0 ? value.bid_price : null, (129023 & 4) != 0 ? value.bid_size : null, (129023 & 8) != 0 ? value.ask_price : null, (129023 & 16) != 0 ? value.ask_size : null, (129023 & 32) != 0 ? value.last_traded_price : null, (129023 & 64) != 0 ? value.price_change_24 : null, (129023 & 128) != 0 ? value.price_percentage_change_24 : null, (129023 & 256) != 0 ? value.mark_price : null, (129023 & 512) != 0 ? value.index_price : null, (129023 & 1024) != 0 ? value.funding_rate : null, (129023 & 2048) != 0 ? value.funding_time : funding_time != null ? ProtoAdapter.INSTANT.redact(funding_time) : null, (129023 & 4096) != 0 ? value.open_interest : null, (129023 & 8192) != 0 ? value.volume_24 : null, (129023 & 16384) != 0 ? value.high_24 : null, (129023 & 32768) != 0 ? value.low_24 : null, (129023 & 65536) != 0 ? value.open_24 : null, (129023 & 131072) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
