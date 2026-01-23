package com.robinhood.ceres.p284v1;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.i18n.Affiliate;
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

/* compiled from: FuturesActivity.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 62\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00016B³\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010-\u001a\u00020\u0002H\u0017J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0096\u0002J\b\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u00020\u0004H\u0016J²\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u0017R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001b¨\u00067"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesActivity;", "Lcom/squareup/wire/Message;", "", "activity_date", "", "affiliate", "Lcom/robinhood/rosetta/i18n/Affiliate;", "contract_id", "trans_code", "Lcom/robinhood/ceres/v1/FuturesActivityTransCode;", "quantity", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "Lcom/robinhood/rosetta/common/Money;", "commission", "exchange_fee", "nfa_fee", "amount", "running_balance", "contract_type", "Lcom/robinhood/ceres/v1/FuturesContractType;", "symbol", "symbol_description", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/i18n/Affiliate;Ljava/lang/String;Lcom/robinhood/ceres/v1/FuturesActivityTransCode;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/ceres/v1/FuturesContractType;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getActivity_date", "()Ljava/lang/String;", "getAffiliate", "()Lcom/robinhood/rosetta/i18n/Affiliate;", "getContract_id", "getTrans_code", "()Lcom/robinhood/ceres/v1/FuturesActivityTransCode;", "getQuantity", "getPrice", "()Lcom/robinhood/rosetta/common/Money;", "getCommission", "getExchange_fee", "getNfa_fee", "getAmount", "getRunning_balance", "getContract_type", "()Lcom/robinhood/ceres/v1/FuturesContractType;", "getSymbol", "getSymbol_description", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class FuturesActivity extends Message {

    @JvmField
    public static final ProtoAdapter<FuturesActivity> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "activityDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String activity_date;

    @WireField(adapter = "com.robinhood.rosetta.i18n.Affiliate#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Affiliate affiliate;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", schemaIndex = 9, tag = 10)
    private final Money amount;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", schemaIndex = 6, tag = 7)
    private final Money commission;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractId", schemaIndex = 2, tag = 3)
    private final String contract_id;

    @WireField(adapter = "com.robinhood.ceres.v1.FuturesContractType#ADAPTER", jsonName = "contractType", schemaIndex = 11, tag = 12)
    private final FuturesContractType contract_type;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "exchangeFee", schemaIndex = 7, tag = 8)
    private final Money exchange_fee;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "nfaFee", schemaIndex = 8, tag = 9)
    private final Money nfa_fee;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", schemaIndex = 5, tag = 6)
    private final Money price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    private final String quantity;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "runningBalance", schemaIndex = 10, tag = 11)
    private final Money running_balance;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 12, tag = 14)
    private final String symbol;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "symbolDescription", schemaIndex = 13, tag = 15)
    private final String symbol_description;

    @WireField(adapter = "com.robinhood.ceres.v1.FuturesActivityTransCode#ADAPTER", jsonName = "transCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final FuturesActivityTransCode trans_code;

    public FuturesActivity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20315newBuilder();
    }

    public final String getActivity_date() {
        return this.activity_date;
    }

    public /* synthetic */ FuturesActivity(String str, Affiliate affiliate, String str2, FuturesActivityTransCode futuresActivityTransCode, String str3, Money money, Money money2, Money money3, Money money4, Money money5, Money money6, FuturesContractType futuresContractType, String str4, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? Affiliate.AFFILIATE_UNSPECIFIED : affiliate, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? FuturesActivityTransCode.UNSPECIFIED : futuresActivityTransCode, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : money, (i & 64) != 0 ? null : money2, (i & 128) != 0 ? null : money3, (i & 256) != 0 ? null : money4, (i & 512) != 0 ? null : money5, (i & 1024) != 0 ? null : money6, (i & 2048) != 0 ? null : futuresContractType, (i & 4096) != 0 ? null : str4, (i & 8192) == 0 ? str5 : null, (i & 16384) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Affiliate getAffiliate() {
        return this.affiliate;
    }

    public final String getContract_id() {
        return this.contract_id;
    }

    public final FuturesActivityTransCode getTrans_code() {
        return this.trans_code;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public final Money getPrice() {
        return this.price;
    }

    public final Money getCommission() {
        return this.commission;
    }

    public final Money getExchange_fee() {
        return this.exchange_fee;
    }

    public final Money getNfa_fee() {
        return this.nfa_fee;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final Money getRunning_balance() {
        return this.running_balance;
    }

    public final FuturesContractType getContract_type() {
        return this.contract_type;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getSymbol_description() {
        return this.symbol_description;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesActivity(String activity_date, Affiliate affiliate, String str, FuturesActivityTransCode trans_code, String str2, Money money, Money money2, Money money3, Money money4, Money money5, Money money6, FuturesContractType futuresContractType, String str3, String str4, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(activity_date, "activity_date");
        Intrinsics.checkNotNullParameter(affiliate, "affiliate");
        Intrinsics.checkNotNullParameter(trans_code, "trans_code");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.activity_date = activity_date;
        this.affiliate = affiliate;
        this.contract_id = str;
        this.trans_code = trans_code;
        this.quantity = str2;
        this.price = money;
        this.commission = money2;
        this.exchange_fee = money3;
        this.nfa_fee = money4;
        this.amount = money5;
        this.running_balance = money6;
        this.contract_type = futuresContractType;
        this.symbol = str3;
        this.symbol_description = str4;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20315newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FuturesActivity)) {
            return false;
        }
        FuturesActivity futuresActivity = (FuturesActivity) other;
        return Intrinsics.areEqual(unknownFields(), futuresActivity.unknownFields()) && Intrinsics.areEqual(this.activity_date, futuresActivity.activity_date) && this.affiliate == futuresActivity.affiliate && Intrinsics.areEqual(this.contract_id, futuresActivity.contract_id) && this.trans_code == futuresActivity.trans_code && Intrinsics.areEqual(this.quantity, futuresActivity.quantity) && Intrinsics.areEqual(this.price, futuresActivity.price) && Intrinsics.areEqual(this.commission, futuresActivity.commission) && Intrinsics.areEqual(this.exchange_fee, futuresActivity.exchange_fee) && Intrinsics.areEqual(this.nfa_fee, futuresActivity.nfa_fee) && Intrinsics.areEqual(this.amount, futuresActivity.amount) && Intrinsics.areEqual(this.running_balance, futuresActivity.running_balance) && this.contract_type == futuresActivity.contract_type && Intrinsics.areEqual(this.symbol, futuresActivity.symbol) && Intrinsics.areEqual(this.symbol_description, futuresActivity.symbol_description);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.activity_date.hashCode()) * 37) + this.affiliate.hashCode()) * 37;
        String str = this.contract_id;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.trans_code.hashCode()) * 37;
        String str2 = this.quantity;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Money money = this.price;
        int iHashCode4 = (iHashCode3 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.commission;
        int iHashCode5 = (iHashCode4 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.exchange_fee;
        int iHashCode6 = (iHashCode5 + (money3 != null ? money3.hashCode() : 0)) * 37;
        Money money4 = this.nfa_fee;
        int iHashCode7 = (iHashCode6 + (money4 != null ? money4.hashCode() : 0)) * 37;
        Money money5 = this.amount;
        int iHashCode8 = (iHashCode7 + (money5 != null ? money5.hashCode() : 0)) * 37;
        Money money6 = this.running_balance;
        int iHashCode9 = (iHashCode8 + (money6 != null ? money6.hashCode() : 0)) * 37;
        FuturesContractType futuresContractType = this.contract_type;
        int iHashCode10 = (iHashCode9 + (futuresContractType != null ? futuresContractType.hashCode() : 0)) * 37;
        String str3 = this.symbol;
        int iHashCode11 = (iHashCode10 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.symbol_description;
        int iHashCode12 = iHashCode11 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode12;
        return iHashCode12;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("activity_date=" + Internal.sanitize(this.activity_date));
        arrayList.add("affiliate=" + this.affiliate);
        String str = this.contract_id;
        if (str != null) {
            arrayList.add("contract_id=" + Internal.sanitize(str));
        }
        arrayList.add("trans_code=" + this.trans_code);
        String str2 = this.quantity;
        if (str2 != null) {
            arrayList.add("quantity=" + Internal.sanitize(str2));
        }
        Money money = this.price;
        if (money != null) {
            arrayList.add("price=" + money);
        }
        Money money2 = this.commission;
        if (money2 != null) {
            arrayList.add("commission=" + money2);
        }
        Money money3 = this.exchange_fee;
        if (money3 != null) {
            arrayList.add("exchange_fee=" + money3);
        }
        Money money4 = this.nfa_fee;
        if (money4 != null) {
            arrayList.add("nfa_fee=" + money4);
        }
        Money money5 = this.amount;
        if (money5 != null) {
            arrayList.add("amount=" + money5);
        }
        Money money6 = this.running_balance;
        if (money6 != null) {
            arrayList.add("running_balance=" + money6);
        }
        FuturesContractType futuresContractType = this.contract_type;
        if (futuresContractType != null) {
            arrayList.add("contract_type=" + futuresContractType);
        }
        String str3 = this.symbol;
        if (str3 != null) {
            arrayList.add("symbol=" + Internal.sanitize(str3));
        }
        String str4 = this.symbol_description;
        if (str4 != null) {
            arrayList.add("symbol_description=" + Internal.sanitize(str4));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FuturesActivity{", "}", 0, null, null, 56, null);
    }

    public final FuturesActivity copy(String activity_date, Affiliate affiliate, String contract_id, FuturesActivityTransCode trans_code, String quantity, Money price, Money commission, Money exchange_fee, Money nfa_fee, Money amount, Money running_balance, FuturesContractType contract_type, String symbol, String symbol_description, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(activity_date, "activity_date");
        Intrinsics.checkNotNullParameter(affiliate, "affiliate");
        Intrinsics.checkNotNullParameter(trans_code, "trans_code");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FuturesActivity(activity_date, affiliate, contract_id, trans_code, quantity, price, commission, exchange_fee, nfa_fee, amount, running_balance, contract_type, symbol, symbol_description, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FuturesActivity.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FuturesActivity>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.FuturesActivity$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FuturesActivity value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getActivity_date(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getActivity_date());
                }
                if (value.getAffiliate() != Affiliate.AFFILIATE_UNSPECIFIED) {
                    size += Affiliate.ADAPTER.encodedSizeWithTag(2, value.getAffiliate());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(3, value.getContract_id());
                if (value.getTrans_code() != FuturesActivityTransCode.UNSPECIFIED) {
                    iEncodedSizeWithTag += FuturesActivityTransCode.ADAPTER.encodedSizeWithTag(4, value.getTrans_code());
                }
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(5, value.getQuantity());
                ProtoAdapter<Money> protoAdapter2 = Money.ADAPTER;
                return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(6, value.getPrice()) + protoAdapter2.encodedSizeWithTag(7, value.getCommission()) + protoAdapter2.encodedSizeWithTag(8, value.getExchange_fee()) + protoAdapter2.encodedSizeWithTag(9, value.getNfa_fee()) + protoAdapter2.encodedSizeWithTag(10, value.getAmount()) + protoAdapter2.encodedSizeWithTag(11, value.getRunning_balance()) + FuturesContractType.ADAPTER.encodedSizeWithTag(12, value.getContract_type()) + protoAdapter.encodedSizeWithTag(14, value.getSymbol()) + protoAdapter.encodedSizeWithTag(15, value.getSymbol_description());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FuturesActivity value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getActivity_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getActivity_date());
                }
                if (value.getAffiliate() != Affiliate.AFFILIATE_UNSPECIFIED) {
                    Affiliate.ADAPTER.encodeWithTag(writer, 2, (int) value.getAffiliate());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getContract_id());
                if (value.getTrans_code() != FuturesActivityTransCode.UNSPECIFIED) {
                    FuturesActivityTransCode.ADAPTER.encodeWithTag(writer, 4, (int) value.getTrans_code());
                }
                protoAdapter.encodeWithTag(writer, 5, (int) value.getQuantity());
                ProtoAdapter<Money> protoAdapter2 = Money.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 6, (int) value.getPrice());
                protoAdapter2.encodeWithTag(writer, 7, (int) value.getCommission());
                protoAdapter2.encodeWithTag(writer, 8, (int) value.getExchange_fee());
                protoAdapter2.encodeWithTag(writer, 9, (int) value.getNfa_fee());
                protoAdapter2.encodeWithTag(writer, 10, (int) value.getAmount());
                protoAdapter2.encodeWithTag(writer, 11, (int) value.getRunning_balance());
                FuturesContractType.ADAPTER.encodeWithTag(writer, 12, (int) value.getContract_type());
                protoAdapter.encodeWithTag(writer, 14, (int) value.getSymbol());
                protoAdapter.encodeWithTag(writer, 15, (int) value.getSymbol_description());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FuturesActivity value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 15, (int) value.getSymbol_description());
                protoAdapter.encodeWithTag(writer, 14, (int) value.getSymbol());
                FuturesContractType.ADAPTER.encodeWithTag(writer, 12, (int) value.getContract_type());
                ProtoAdapter<Money> protoAdapter2 = Money.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 11, (int) value.getRunning_balance());
                protoAdapter2.encodeWithTag(writer, 10, (int) value.getAmount());
                protoAdapter2.encodeWithTag(writer, 9, (int) value.getNfa_fee());
                protoAdapter2.encodeWithTag(writer, 8, (int) value.getExchange_fee());
                protoAdapter2.encodeWithTag(writer, 7, (int) value.getCommission());
                protoAdapter2.encodeWithTag(writer, 6, (int) value.getPrice());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getQuantity());
                if (value.getTrans_code() != FuturesActivityTransCode.UNSPECIFIED) {
                    FuturesActivityTransCode.ADAPTER.encodeWithTag(writer, 4, (int) value.getTrans_code());
                }
                protoAdapter.encodeWithTag(writer, 3, (int) value.getContract_id());
                if (value.getAffiliate() != Affiliate.AFFILIATE_UNSPECIFIED) {
                    Affiliate.ADAPTER.encodeWithTag(writer, 2, (int) value.getAffiliate());
                }
                if (Intrinsics.areEqual(value.getActivity_date(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getActivity_date());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FuturesActivity decode(ProtoReader reader) throws IOException {
                FuturesActivityTransCode futuresActivityTransCode;
                String str;
                String str2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                Affiliate affiliate = Affiliate.AFFILIATE_UNSPECIFIED;
                FuturesActivityTransCode futuresActivityTransCode2 = FuturesActivityTransCode.UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Affiliate affiliateDecode = affiliate;
                String strDecode = null;
                String strDecode2 = null;
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                Money moneyDecode3 = null;
                Money moneyDecode4 = null;
                Money moneyDecode5 = null;
                Money moneyDecode6 = null;
                FuturesContractType futuresContractTypeDecode = null;
                String strDecode3 = null;
                String strDecode4 = null;
                String strDecode5 = "";
                FuturesActivityTransCode futuresActivityTransCodeDecode = futuresActivityTransCode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                futuresActivityTransCode = futuresActivityTransCodeDecode;
                                str = strDecode5;
                                str2 = strDecode;
                                try {
                                    affiliateDecode = Affiliate.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                                futuresActivityTransCodeDecode = futuresActivityTransCode;
                                strDecode5 = str;
                                strDecode = str2;
                                break;
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                futuresActivityTransCode = futuresActivityTransCodeDecode;
                                str = strDecode5;
                                str2 = strDecode;
                                try {
                                    futuresActivityTransCodeDecode = FuturesActivityTransCode.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                                strDecode5 = str;
                                strDecode = str2;
                                break;
                            case 5:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 7:
                                moneyDecode2 = Money.ADAPTER.decode(reader);
                                break;
                            case 8:
                                moneyDecode3 = Money.ADAPTER.decode(reader);
                                break;
                            case 9:
                                moneyDecode4 = Money.ADAPTER.decode(reader);
                                break;
                            case 10:
                                moneyDecode5 = Money.ADAPTER.decode(reader);
                                break;
                            case 11:
                                moneyDecode6 = Money.ADAPTER.decode(reader);
                                break;
                            case 12:
                                try {
                                    futuresContractTypeDecode = FuturesContractType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    futuresActivityTransCode = futuresActivityTransCodeDecode;
                                    str = strDecode5;
                                    str2 = strDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                            case 13:
                            default:
                                reader.readUnknownField(iNextTag);
                                futuresActivityTransCode = futuresActivityTransCodeDecode;
                                str = strDecode5;
                                str2 = strDecode;
                                futuresActivityTransCodeDecode = futuresActivityTransCode;
                                strDecode5 = str;
                                strDecode = str2;
                                break;
                            case 14:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 15:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                        }
                    } else {
                        return new FuturesActivity(strDecode5, affiliateDecode, strDecode, futuresActivityTransCodeDecode, strDecode2, moneyDecode, moneyDecode2, moneyDecode3, moneyDecode4, moneyDecode5, moneyDecode6, futuresContractTypeDecode, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FuturesActivity redact(FuturesActivity value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money price = value.getPrice();
                Money moneyRedact = price != null ? Money.ADAPTER.redact(price) : null;
                Money commission = value.getCommission();
                Money moneyRedact2 = commission != null ? Money.ADAPTER.redact(commission) : null;
                Money exchange_fee = value.getExchange_fee();
                Money moneyRedact3 = exchange_fee != null ? Money.ADAPTER.redact(exchange_fee) : null;
                Money nfa_fee = value.getNfa_fee();
                Money moneyRedact4 = nfa_fee != null ? Money.ADAPTER.redact(nfa_fee) : null;
                Money amount = value.getAmount();
                Money moneyRedact5 = amount != null ? Money.ADAPTER.redact(amount) : null;
                Money running_balance = value.getRunning_balance();
                return value.copy((14367 & 1) != 0 ? value.activity_date : null, (14367 & 2) != 0 ? value.affiliate : null, (14367 & 4) != 0 ? value.contract_id : null, (14367 & 8) != 0 ? value.trans_code : null, (14367 & 16) != 0 ? value.quantity : null, (14367 & 32) != 0 ? value.price : moneyRedact, (14367 & 64) != 0 ? value.commission : moneyRedact2, (14367 & 128) != 0 ? value.exchange_fee : moneyRedact3, (14367 & 256) != 0 ? value.nfa_fee : moneyRedact4, (14367 & 512) != 0 ? value.amount : moneyRedact5, (14367 & 1024) != 0 ? value.running_balance : running_balance != null ? Money.ADAPTER.redact(running_balance) : null, (14367 & 2048) != 0 ? value.contract_type : null, (14367 & 4096) != 0 ? value.symbol : null, (14367 & 8192) != 0 ? value.symbol_description : null, (14367 & 16384) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
