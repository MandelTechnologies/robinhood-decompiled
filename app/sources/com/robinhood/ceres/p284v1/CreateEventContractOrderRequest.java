package com.robinhood.ceres.p284v1;

import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.mainst.ClientMarketdata;
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
import p479j$.time.Instant;
import rosetta.mainst.TimeInForce;

/* compiled from: CreateEventContractOrderRequest.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001d\u0018\u0000 <2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001<B\u008b\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010$J\u0091\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010$R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b)\u0010$R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b*\u0010$R\u001a\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b+\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b0\u00101R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b3\u00104R\"\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00105\u001a\u0004\b6\u00107R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010'\u001a\u0004\b8\u0010$R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010;¨\u0006="}, m3636d2 = {"Lcom/robinhood/ceres/v1/CreateEventContractOrderRequest;", "Lcom/squareup/wire/Message;", "", "", "account_id", "", "Lcom/robinhood/ceres/v1/FuturesOrderLegRequest;", "legs", "quantity", "limit_price", "ref_id", "Lcom/robinhood/rosetta/mainst/ClientMarketdata;", "client_marketdata", "Lrosetta/mainst/TimeInForce;", "time_in_force", "Lcom/robinhood/rosetta/common/Money;", "entered_notional_amount", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "gtd_expiration_time", "quote_id", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/ClientMarketdata;Lrosetta/mainst/TimeInForce;Lcom/robinhood/rosetta/common/Money;Lj$/time/Instant;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/ClientMarketdata;Lrosetta/mainst/TimeInForce;Lcom/robinhood/rosetta/common/Money;Lj$/time/Instant;Ljava/lang/String;Lokio/ByteString;)Lcom/robinhood/ceres/v1/CreateEventContractOrderRequest;", "Ljava/lang/String;", "getAccount_id", "getQuantity", "getLimit_price", "getRef_id", "Lcom/robinhood/rosetta/mainst/ClientMarketdata;", "getClient_marketdata", "()Lcom/robinhood/rosetta/mainst/ClientMarketdata;", "Lrosetta/mainst/TimeInForce;", "getTime_in_force", "()Lrosetta/mainst/TimeInForce;", "Lcom/robinhood/rosetta/common/Money;", "getEntered_notional_amount", "()Lcom/robinhood/rosetta/common/Money;", "Lj$/time/Instant;", "getGtd_expiration_time", "()Lj$/time/Instant;", "getQuote_id", "Ljava/util/List;", "getLegs", "()Ljava/util/List;", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class CreateEventContractOrderRequest extends Message {

    @JvmField
    public static final ProtoAdapter<CreateEventContractOrderRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.ClientMarketdata#ADAPTER", jsonName = "clientMarketdata", schemaIndex = 5, tag = 6)
    private final ClientMarketdata client_marketdata;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "enteredNotionalAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final Money entered_notional_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "gtdExpirationTime", schemaIndex = 8, tag = 9)
    private final Instant gtd_expiration_time;

    @WireField(adapter = "com.robinhood.ceres.v1.FuturesOrderLegRequest#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<FuturesOrderLegRequest> legs;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "limitPrice", schemaIndex = 3, tag = 4)
    private final String limit_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "quoteId", schemaIndex = 9, tag = 10)
    private final String quote_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "refId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String ref_id;

    @WireField(adapter = "rosetta.mainst.TimeInForce#ADAPTER", jsonName = "timeInForce", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final TimeInForce time_in_force;

    public CreateEventContractOrderRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public /* synthetic */ CreateEventContractOrderRequest(String str, List list, String str2, String str3, String str4, ClientMarketdata clientMarketdata, TimeInForce timeInForce, Money money, Instant instant, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? null : clientMarketdata, (i & 64) != 0 ? TimeInForce.TIME_IN_FORCE_UNSPECIFIED : timeInForce, (i & 128) != 0 ? null : money, (i & 256) != 0 ? null : instant, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20284newBuilder();
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public final String getLimit_price() {
        return this.limit_price;
    }

    public final String getRef_id() {
        return this.ref_id;
    }

    public final ClientMarketdata getClient_marketdata() {
        return this.client_marketdata;
    }

    public final TimeInForce getTime_in_force() {
        return this.time_in_force;
    }

    public final Money getEntered_notional_amount() {
        return this.entered_notional_amount;
    }

    public final Instant getGtd_expiration_time() {
        return this.gtd_expiration_time;
    }

    public final String getQuote_id() {
        return this.quote_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateEventContractOrderRequest(String account_id, List<FuturesOrderLegRequest> legs, String quantity, String str, String ref_id, ClientMarketdata clientMarketdata, TimeInForce time_in_force, Money money, Instant instant, String str2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(legs, "legs");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_id = account_id;
        this.quantity = quantity;
        this.limit_price = str;
        this.ref_id = ref_id;
        this.client_marketdata = clientMarketdata;
        this.time_in_force = time_in_force;
        this.entered_notional_amount = money;
        this.gtd_expiration_time = instant;
        this.quote_id = str2;
        this.legs = Internal.immutableCopyOf("legs", legs);
    }

    public final List<FuturesOrderLegRequest> getLegs() {
        return this.legs;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20284newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CreateEventContractOrderRequest)) {
            return false;
        }
        CreateEventContractOrderRequest createEventContractOrderRequest = (CreateEventContractOrderRequest) other;
        return Intrinsics.areEqual(unknownFields(), createEventContractOrderRequest.unknownFields()) && Intrinsics.areEqual(this.account_id, createEventContractOrderRequest.account_id) && Intrinsics.areEqual(this.legs, createEventContractOrderRequest.legs) && Intrinsics.areEqual(this.quantity, createEventContractOrderRequest.quantity) && Intrinsics.areEqual(this.limit_price, createEventContractOrderRequest.limit_price) && Intrinsics.areEqual(this.ref_id, createEventContractOrderRequest.ref_id) && Intrinsics.areEqual(this.client_marketdata, createEventContractOrderRequest.client_marketdata) && this.time_in_force == createEventContractOrderRequest.time_in_force && Intrinsics.areEqual(this.entered_notional_amount, createEventContractOrderRequest.entered_notional_amount) && Intrinsics.areEqual(this.gtd_expiration_time, createEventContractOrderRequest.gtd_expiration_time) && Intrinsics.areEqual(this.quote_id, createEventContractOrderRequest.quote_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.account_id.hashCode()) * 37) + this.legs.hashCode()) * 37) + this.quantity.hashCode()) * 37;
        String str = this.limit_price;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.ref_id.hashCode()) * 37;
        ClientMarketdata clientMarketdata = this.client_marketdata;
        int iHashCode3 = (((iHashCode2 + (clientMarketdata != null ? clientMarketdata.hashCode() : 0)) * 37) + this.time_in_force.hashCode()) * 37;
        Money money = this.entered_notional_amount;
        int iHashCode4 = (iHashCode3 + (money != null ? money.hashCode() : 0)) * 37;
        Instant instant = this.gtd_expiration_time;
        int iHashCode5 = (iHashCode4 + (instant != null ? instant.hashCode() : 0)) * 37;
        String str2 = this.quote_id;
        int iHashCode6 = iHashCode5 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        if (!this.legs.isEmpty()) {
            arrayList.add("legs=" + this.legs);
        }
        arrayList.add("quantity=" + Internal.sanitize(this.quantity));
        String str = this.limit_price;
        if (str != null) {
            arrayList.add("limit_price=" + Internal.sanitize(str));
        }
        arrayList.add("ref_id=" + Internal.sanitize(this.ref_id));
        ClientMarketdata clientMarketdata = this.client_marketdata;
        if (clientMarketdata != null) {
            arrayList.add("client_marketdata=" + clientMarketdata);
        }
        arrayList.add("time_in_force=" + this.time_in_force);
        Money money = this.entered_notional_amount;
        if (money != null) {
            arrayList.add("entered_notional_amount=" + money);
        }
        Instant instant = this.gtd_expiration_time;
        if (instant != null) {
            arrayList.add("gtd_expiration_time=" + instant);
        }
        String str2 = this.quote_id;
        if (str2 != null) {
            arrayList.add("quote_id=" + Internal.sanitize(str2));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateEventContractOrderRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CreateEventContractOrderRequest copy$default(CreateEventContractOrderRequest createEventContractOrderRequest, String str, List list, String str2, String str3, String str4, ClientMarketdata clientMarketdata, TimeInForce timeInForce, Money money, Instant instant, String str5, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createEventContractOrderRequest.account_id;
        }
        if ((i & 2) != 0) {
            list = createEventContractOrderRequest.legs;
        }
        if ((i & 4) != 0) {
            str2 = createEventContractOrderRequest.quantity;
        }
        if ((i & 8) != 0) {
            str3 = createEventContractOrderRequest.limit_price;
        }
        if ((i & 16) != 0) {
            str4 = createEventContractOrderRequest.ref_id;
        }
        if ((i & 32) != 0) {
            clientMarketdata = createEventContractOrderRequest.client_marketdata;
        }
        if ((i & 64) != 0) {
            timeInForce = createEventContractOrderRequest.time_in_force;
        }
        if ((i & 128) != 0) {
            money = createEventContractOrderRequest.entered_notional_amount;
        }
        if ((i & 256) != 0) {
            instant = createEventContractOrderRequest.gtd_expiration_time;
        }
        if ((i & 512) != 0) {
            str5 = createEventContractOrderRequest.quote_id;
        }
        if ((i & 1024) != 0) {
            byteString = createEventContractOrderRequest.unknownFields();
        }
        String str6 = str5;
        ByteString byteString2 = byteString;
        Money money2 = money;
        Instant instant2 = instant;
        ClientMarketdata clientMarketdata2 = clientMarketdata;
        TimeInForce timeInForce2 = timeInForce;
        String str7 = str4;
        String str8 = str2;
        return createEventContractOrderRequest.copy(str, list, str8, str3, str7, clientMarketdata2, timeInForce2, money2, instant2, str6, byteString2);
    }

    public final CreateEventContractOrderRequest copy(String account_id, List<FuturesOrderLegRequest> legs, String quantity, String limit_price, String ref_id, ClientMarketdata client_marketdata, TimeInForce time_in_force, Money entered_notional_amount, Instant gtd_expiration_time, String quote_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(legs, "legs");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CreateEventContractOrderRequest(account_id, legs, quantity, limit_price, ref_id, client_marketdata, time_in_force, entered_notional_amount, gtd_expiration_time, quote_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CreateEventContractOrderRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CreateEventContractOrderRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.CreateEventContractOrderRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CreateEventContractOrderRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_id());
                }
                int iEncodedSizeWithTag = size + FuturesOrderLegRequest.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getLegs());
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getQuantity());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, value.getLimit_price());
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    iEncodedSizeWithTag2 += protoAdapter.encodedSizeWithTag(5, value.getRef_id());
                }
                int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + ClientMarketdata.ADAPTER.encodedSizeWithTag(6, value.getClient_marketdata());
                if (value.getTime_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    iEncodedSizeWithTag3 += TimeInForce.ADAPTER.encodedSizeWithTag(7, value.getTime_in_force());
                }
                if (value.getEntered_notional_amount() != null) {
                    iEncodedSizeWithTag3 += Money.ADAPTER.encodedSizeWithTag(8, value.getEntered_notional_amount());
                }
                return iEncodedSizeWithTag3 + ProtoAdapter.INSTANT.encodedSizeWithTag(9, value.getGtd_expiration_time()) + protoAdapter.encodedSizeWithTag(10, value.getQuote_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CreateEventContractOrderRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_id());
                }
                FuturesOrderLegRequest.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getLegs());
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getQuantity());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getLimit_price());
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getRef_id());
                }
                ClientMarketdata.ADAPTER.encodeWithTag(writer, 6, (int) value.getClient_marketdata());
                if (value.getTime_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    TimeInForce.ADAPTER.encodeWithTag(writer, 7, (int) value.getTime_in_force());
                }
                if (value.getEntered_notional_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 8, (int) value.getEntered_notional_amount());
                }
                ProtoAdapter.INSTANT.encodeWithTag(writer, 9, (int) value.getGtd_expiration_time());
                protoAdapter.encodeWithTag(writer, 10, (int) value.getQuote_id());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CreateEventContractOrderRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 10, (int) value.getQuote_id());
                ProtoAdapter.INSTANT.encodeWithTag(writer, 9, (int) value.getGtd_expiration_time());
                if (value.getEntered_notional_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 8, (int) value.getEntered_notional_amount());
                }
                if (value.getTime_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    TimeInForce.ADAPTER.encodeWithTag(writer, 7, (int) value.getTime_in_force());
                }
                ClientMarketdata.ADAPTER.encodeWithTag(writer, 6, (int) value.getClient_marketdata());
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getRef_id());
                }
                protoAdapter.encodeWithTag(writer, 4, (int) value.getLimit_price());
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getQuantity());
                }
                FuturesOrderLegRequest.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getLegs());
                if (Intrinsics.areEqual(value.getAccount_id(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getAccount_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CreateEventContractOrderRequest decode(ProtoReader reader) throws IOException {
                String str;
                String str2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                TimeInForce timeInForce = TimeInForce.TIME_IN_FORCE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = null;
                ClientMarketdata clientMarketdataDecode = null;
                Money moneyDecode = null;
                Instant instantDecode = null;
                String strDecode4 = null;
                TimeInForce timeInForceDecode = timeInForce;
                String strDecode5 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 2:
                                str = strDecode5;
                                str2 = strDecode;
                                arrayList.add(FuturesOrderLegRequest.ADAPTER.decode(reader));
                                break;
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 5:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 6:
                                clientMarketdataDecode = ClientMarketdata.ADAPTER.decode(reader);
                                continue;
                            case 7:
                                try {
                                    timeInForceDecode = TimeInForce.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    str = strDecode5;
                                    str2 = strDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 8:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                continue;
                            case 9:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            case 10:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(iNextTag);
                                str = strDecode5;
                                str2 = strDecode;
                                break;
                        }
                        strDecode5 = str;
                        strDecode = str2;
                    } else {
                        return new CreateEventContractOrderRequest(strDecode5, arrayList, strDecode, strDecode3, strDecode2, clientMarketdataDecode, timeInForceDecode, moneyDecode, instantDecode, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CreateEventContractOrderRequest redact(CreateEventContractOrderRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List listM26823redactElements = Internal.m26823redactElements(value.getLegs(), FuturesOrderLegRequest.ADAPTER);
                ClientMarketdata client_marketdata = value.getClient_marketdata();
                ClientMarketdata clientMarketdataRedact = client_marketdata != null ? ClientMarketdata.ADAPTER.redact(client_marketdata) : null;
                Money entered_notional_amount = value.getEntered_notional_amount();
                Money moneyRedact = entered_notional_amount != null ? Money.ADAPTER.redact(entered_notional_amount) : null;
                Instant gtd_expiration_time = value.getGtd_expiration_time();
                return CreateEventContractOrderRequest.copy$default(value, null, listM26823redactElements, null, null, null, clientMarketdataRedact, null, moneyRedact, gtd_expiration_time != null ? ProtoAdapter.INSTANT.redact(gtd_expiration_time) : null, null, ByteString.EMPTY, 605, null);
            }
        };
    }
}
