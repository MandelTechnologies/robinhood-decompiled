package com.robinhood.arsenal.proto.p281v1.idl;

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
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* compiled from: FuturesContract.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 42\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00014B±\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010+\u001a\u00020\u0002H\u0017J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0096\u0002J\b\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u00020\u0004H\u0016J°\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u0016R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001a¨\u00065"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/FuturesContract;", "Lcom/squareup/wire/Message;", "", "id", "", "product_id", "symbol", "display_symbol", "description", "multiplier", "expiration_mmy", "expiration", "customer_last_close_date", "tradability", "Lcom/robinhood/arsenal/proto/v1/idl/FuturesTradability;", "state", "Lcom/robinhood/arsenal/proto/v1/idl/FuturesState;", "isin", "settlement_start_time", "first_trade_date", "settlement_date", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/FuturesTradability;Lcom/robinhood/arsenal/proto/v1/idl/FuturesState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getProduct_id", "getSymbol", "getDisplay_symbol", "getDescription", "getMultiplier", "getExpiration_mmy", "getExpiration", "getCustomer_last_close_date", "getTradability", "()Lcom/robinhood/arsenal/proto/v1/idl/FuturesTradability;", "getState", "()Lcom/robinhood/arsenal/proto/v1/idl/FuturesState;", "getIsin", "getSettlement_start_time", "getFirst_trade_date", "getSettlement_date", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class FuturesContract extends Message {

    @JvmField
    public static final ProtoAdapter<FuturesContract> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "customerLastCloseDate", schemaIndex = 8, tag = 9)
    private final String customer_last_close_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "displaySymbol", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String display_symbol;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String expiration;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "expirationMmy", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String expiration_mmy;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "firstTradeDate", schemaIndex = 13, tag = 15)
    private final String first_trade_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 11, tag = 12)
    private final String isin;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String multiplier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "productId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String product_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "settlementDate", schemaIndex = 14, tag = 16)
    private final String settlement_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "settlementStartTime", schemaIndex = 12, tag = 14)
    private final String settlement_start_time;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.FuturesState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final FuturesState state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String symbol;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.FuturesTradability#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final FuturesTradability tradability;

    public FuturesContract() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);
    }

    public /* synthetic */ FuturesContract(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, FuturesTradability futuresTradability, FuturesState futuresState, String str10, String str11, String str12, String str13, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) == 0 ? str8 : "", (i & 256) != 0 ? null : str9, (i & 512) != 0 ? FuturesTradability.FUTURES_TRADABILITY_UNSPECIFIED : futuresTradability, (i & 1024) != 0 ? FuturesState.FUTURES_STATE_UNSPECIFIED : futuresState, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? null : str11, (i & 8192) != 0 ? null : str12, (i & 16384) != 0 ? null : str13, (i & 32768) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20147newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getProduct_id() {
        return this.product_id;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getDisplay_symbol() {
        return this.display_symbol;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getMultiplier() {
        return this.multiplier;
    }

    public final String getExpiration_mmy() {
        return this.expiration_mmy;
    }

    public final String getExpiration() {
        return this.expiration;
    }

    public final String getCustomer_last_close_date() {
        return this.customer_last_close_date;
    }

    public final FuturesTradability getTradability() {
        return this.tradability;
    }

    public final FuturesState getState() {
        return this.state;
    }

    public final String getIsin() {
        return this.isin;
    }

    public final String getSettlement_start_time() {
        return this.settlement_start_time;
    }

    public final String getFirst_trade_date() {
        return this.first_trade_date;
    }

    public final String getSettlement_date() {
        return this.settlement_date;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesContract(String id, String product_id, String symbol, String display_symbol, String description, String multiplier, String expiration_mmy, String expiration, String str, FuturesTradability tradability, FuturesState state, String str2, String str3, String str4, String str5, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(product_id, "product_id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(display_symbol, "display_symbol");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(multiplier, "multiplier");
        Intrinsics.checkNotNullParameter(expiration_mmy, "expiration_mmy");
        Intrinsics.checkNotNullParameter(expiration, "expiration");
        Intrinsics.checkNotNullParameter(tradability, "tradability");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.product_id = product_id;
        this.symbol = symbol;
        this.display_symbol = display_symbol;
        this.description = description;
        this.multiplier = multiplier;
        this.expiration_mmy = expiration_mmy;
        this.expiration = expiration;
        this.customer_last_close_date = str;
        this.tradability = tradability;
        this.state = state;
        this.isin = str2;
        this.settlement_start_time = str3;
        this.first_trade_date = str4;
        this.settlement_date = str5;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20147newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FuturesContract)) {
            return false;
        }
        FuturesContract futuresContract = (FuturesContract) other;
        return Intrinsics.areEqual(unknownFields(), futuresContract.unknownFields()) && Intrinsics.areEqual(this.id, futuresContract.id) && Intrinsics.areEqual(this.product_id, futuresContract.product_id) && Intrinsics.areEqual(this.symbol, futuresContract.symbol) && Intrinsics.areEqual(this.display_symbol, futuresContract.display_symbol) && Intrinsics.areEqual(this.description, futuresContract.description) && Intrinsics.areEqual(this.multiplier, futuresContract.multiplier) && Intrinsics.areEqual(this.expiration_mmy, futuresContract.expiration_mmy) && Intrinsics.areEqual(this.expiration, futuresContract.expiration) && Intrinsics.areEqual(this.customer_last_close_date, futuresContract.customer_last_close_date) && this.tradability == futuresContract.tradability && this.state == futuresContract.state && Intrinsics.areEqual(this.isin, futuresContract.isin) && Intrinsics.areEqual(this.settlement_start_time, futuresContract.settlement_start_time) && Intrinsics.areEqual(this.first_trade_date, futuresContract.first_trade_date) && Intrinsics.areEqual(this.settlement_date, futuresContract.settlement_date);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.product_id.hashCode()) * 37) + this.symbol.hashCode()) * 37) + this.display_symbol.hashCode()) * 37) + this.description.hashCode()) * 37) + this.multiplier.hashCode()) * 37) + this.expiration_mmy.hashCode()) * 37) + this.expiration.hashCode()) * 37;
        String str = this.customer_last_close_date;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.tradability.hashCode()) * 37) + this.state.hashCode()) * 37;
        String str2 = this.isin;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.settlement_start_time;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.first_trade_date;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.settlement_date;
        int iHashCode6 = iHashCode5 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("product_id=" + Internal.sanitize(this.product_id));
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        arrayList.add("display_symbol=" + Internal.sanitize(this.display_symbol));
        arrayList.add("description=" + Internal.sanitize(this.description));
        arrayList.add("multiplier=" + Internal.sanitize(this.multiplier));
        arrayList.add("expiration_mmy=" + Internal.sanitize(this.expiration_mmy));
        arrayList.add("expiration=" + Internal.sanitize(this.expiration));
        String str = this.customer_last_close_date;
        if (str != null) {
            arrayList.add("customer_last_close_date=" + Internal.sanitize(str));
        }
        arrayList.add("tradability=" + this.tradability);
        arrayList.add("state=" + this.state);
        String str2 = this.isin;
        if (str2 != null) {
            arrayList.add("isin=" + Internal.sanitize(str2));
        }
        String str3 = this.settlement_start_time;
        if (str3 != null) {
            arrayList.add("settlement_start_time=" + Internal.sanitize(str3));
        }
        String str4 = this.first_trade_date;
        if (str4 != null) {
            arrayList.add("first_trade_date=" + Internal.sanitize(str4));
        }
        String str5 = this.settlement_date;
        if (str5 != null) {
            arrayList.add("settlement_date=" + Internal.sanitize(str5));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FuturesContract{", "}", 0, null, null, 56, null);
    }

    public final FuturesContract copy(String id, String product_id, String symbol, String display_symbol, String description, String multiplier, String expiration_mmy, String expiration, String customer_last_close_date, FuturesTradability tradability, FuturesState state, String isin, String settlement_start_time, String first_trade_date, String settlement_date, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(product_id, "product_id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(display_symbol, "display_symbol");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(multiplier, "multiplier");
        Intrinsics.checkNotNullParameter(expiration_mmy, "expiration_mmy");
        Intrinsics.checkNotNullParameter(expiration, "expiration");
        Intrinsics.checkNotNullParameter(tradability, "tradability");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FuturesContract(id, product_id, symbol, display_symbol, description, multiplier, expiration_mmy, expiration, customer_last_close_date, tradability, state, isin, settlement_start_time, first_trade_date, settlement_date, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FuturesContract.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FuturesContract>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.arsenal.proto.v1.idl.FuturesContract$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FuturesContract value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getProduct_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getProduct_id());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getDisplay_symbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getDisplay_symbol());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getMultiplier(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getMultiplier());
                }
                if (!Intrinsics.areEqual(value.getExpiration_mmy(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getExpiration_mmy());
                }
                if (!Intrinsics.areEqual(value.getExpiration(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getExpiration());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(9, value.getCustomer_last_close_date());
                if (value.getTradability() != FuturesTradability.FUTURES_TRADABILITY_UNSPECIFIED) {
                    iEncodedSizeWithTag += FuturesTradability.ADAPTER.encodedSizeWithTag(10, value.getTradability());
                }
                if (value.getState() != FuturesState.FUTURES_STATE_UNSPECIFIED) {
                    iEncodedSizeWithTag += FuturesState.ADAPTER.encodedSizeWithTag(11, value.getState());
                }
                return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(12, value.getIsin()) + protoAdapter.encodedSizeWithTag(14, value.getSettlement_start_time()) + protoAdapter.encodedSizeWithTag(15, value.getFirst_trade_date()) + protoAdapter.encodedSizeWithTag(16, value.getSettlement_date());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FuturesContract value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getProduct_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getProduct_id());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getDisplay_symbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDisplay_symbol());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getMultiplier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getMultiplier());
                }
                if (!Intrinsics.areEqual(value.getExpiration_mmy(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getExpiration_mmy());
                }
                if (!Intrinsics.areEqual(value.getExpiration(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getExpiration());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 9, (int) value.getCustomer_last_close_date());
                if (value.getTradability() != FuturesTradability.FUTURES_TRADABILITY_UNSPECIFIED) {
                    FuturesTradability.ADAPTER.encodeWithTag(writer, 10, (int) value.getTradability());
                }
                if (value.getState() != FuturesState.FUTURES_STATE_UNSPECIFIED) {
                    FuturesState.ADAPTER.encodeWithTag(writer, 11, (int) value.getState());
                }
                protoAdapter.encodeWithTag(writer, 12, (int) value.getIsin());
                protoAdapter.encodeWithTag(writer, 14, (int) value.getSettlement_start_time());
                protoAdapter.encodeWithTag(writer, 15, (int) value.getFirst_trade_date());
                protoAdapter.encodeWithTag(writer, 16, (int) value.getSettlement_date());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FuturesContract value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 16, (int) value.getSettlement_date());
                protoAdapter.encodeWithTag(writer, 15, (int) value.getFirst_trade_date());
                protoAdapter.encodeWithTag(writer, 14, (int) value.getSettlement_start_time());
                protoAdapter.encodeWithTag(writer, 12, (int) value.getIsin());
                if (value.getState() != FuturesState.FUTURES_STATE_UNSPECIFIED) {
                    FuturesState.ADAPTER.encodeWithTag(writer, 11, (int) value.getState());
                }
                if (value.getTradability() != FuturesTradability.FUTURES_TRADABILITY_UNSPECIFIED) {
                    FuturesTradability.ADAPTER.encodeWithTag(writer, 10, (int) value.getTradability());
                }
                protoAdapter.encodeWithTag(writer, 9, (int) value.getCustomer_last_close_date());
                if (!Intrinsics.areEqual(value.getExpiration(), "")) {
                    protoAdapter.encodeWithTag(writer, 8, (int) value.getExpiration());
                }
                if (!Intrinsics.areEqual(value.getExpiration_mmy(), "")) {
                    protoAdapter.encodeWithTag(writer, 7, (int) value.getExpiration_mmy());
                }
                if (!Intrinsics.areEqual(value.getMultiplier(), "")) {
                    protoAdapter.encodeWithTag(writer, 6, (int) value.getMultiplier());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getDisplay_symbol(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getDisplay_symbol());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getProduct_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getProduct_id());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FuturesContract decode(ProtoReader reader) throws IOException {
                FuturesState futuresState;
                String str;
                String str2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                FuturesTradability futuresTradability = FuturesTradability.FUTURES_TRADABILITY_UNSPECIFIED;
                FuturesState futuresState2 = FuturesState.FUTURES_STATE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                FuturesTradability futuresTradabilityDecode = futuresTradability;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                String strDecode8 = null;
                String strDecode9 = null;
                String strDecode10 = null;
                String strDecode11 = null;
                String strDecode12 = null;
                FuturesState futuresStateDecode = futuresState2;
                String strDecode13 = strDecode7;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode13 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 5:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 6:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 7:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 8:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 9:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 10:
                                futuresState = futuresStateDecode;
                                str = strDecode13;
                                str2 = strDecode;
                                try {
                                    futuresTradabilityDecode = FuturesTradability.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 11:
                                try {
                                    futuresStateDecode = FuturesState.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    futuresState = futuresStateDecode;
                                    str = strDecode13;
                                    str2 = strDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 12:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 13:
                            default:
                                reader.readUnknownField(iNextTag);
                                futuresState = futuresStateDecode;
                                str = strDecode13;
                                str2 = strDecode;
                                break;
                            case 14:
                                strDecode10 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 15:
                                strDecode11 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 16:
                                strDecode12 = ProtoAdapter.STRING.decode(reader);
                                continue;
                        }
                        futuresStateDecode = futuresState;
                        strDecode13 = str;
                        strDecode = str2;
                    } else {
                        return new FuturesContract(strDecode13, strDecode, strDecode2, strDecode3, strDecode4, strDecode5, strDecode6, strDecode7, strDecode8, futuresTradabilityDecode, futuresStateDecode, strDecode9, strDecode10, strDecode11, strDecode12, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FuturesContract redact(FuturesContract value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.copy((32767 & 1) != 0 ? value.id : null, (32767 & 2) != 0 ? value.product_id : null, (32767 & 4) != 0 ? value.symbol : null, (32767 & 8) != 0 ? value.display_symbol : null, (32767 & 16) != 0 ? value.description : null, (32767 & 32) != 0 ? value.multiplier : null, (32767 & 64) != 0 ? value.expiration_mmy : null, (32767 & 128) != 0 ? value.expiration : null, (32767 & 256) != 0 ? value.customer_last_close_date : null, (32767 & 512) != 0 ? value.tradability : null, (32767 & 1024) != 0 ? value.state : null, (32767 & 2048) != 0 ? value.isin : null, (32767 & 4096) != 0 ? value.settlement_start_time : null, (32767 & 8192) != 0 ? value.first_trade_date : null, (32767 & 16384) != 0 ? value.settlement_date : null, (32767 & 32768) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
