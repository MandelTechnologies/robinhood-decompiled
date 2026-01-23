package com.robinhood.ceres.p284v1;

import com.robinhood.rosetta.common.Money;
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
import rosetta.mainst.Side;

/* compiled from: FuturesExecution.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 42\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00014B©\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010+\u001a\u00020\u0002H\u0017J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0096\u0002J\b\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u00020\u0004H\u0016J¨\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u0016R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0018\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0016\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001a¨\u00065"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesExecution;", "Lcom/squareup/wire/Message;", "", "id", "", "contract_id", "price_per_contract", "quantity", "event_time", "realized_pnl", "Lcom/robinhood/rosetta/common/Money;", "realized_pnl_without_fees", "total_fee", "total_commission", "total_gold_savings", "account_id", "contract_type", "Lcom/robinhood/ceres/v1/FuturesContractType;", "side", "Lrosetta/mainst/Side;", "rhs_account_number", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Lcom/robinhood/ceres/v1/FuturesContractType;Lrosetta/mainst/Side;Ljava/lang/String;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getContract_id", "getPrice_per_contract", "getQuantity", "getEvent_time", "getRealized_pnl", "()Lcom/robinhood/rosetta/common/Money;", "getRealized_pnl_without_fees", "getTotal_fee", "getTotal_commission", "getTotal_gold_savings", "getAccount_id", "getContract_type", "()Lcom/robinhood/ceres/v1/FuturesContractType;", "getSide", "()Lrosetta/mainst/Side;", "getRhs_account_number", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class FuturesExecution extends Message {

    @JvmField
    public static final ProtoAdapter<FuturesExecution> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String account_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String contract_id;

    @WireField(adapter = "com.robinhood.ceres.v1.FuturesContractType#ADAPTER", jsonName = "contractType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final FuturesContractType contract_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "eventTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String event_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "pricePerContract", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String price_per_contract;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String quantity;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "realizedPnl", schemaIndex = 5, tag = 6)
    private final Money realized_pnl;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "realizedPnlWithoutFees", schemaIndex = 6, tag = 7)
    private final Money realized_pnl_without_fees;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rhsAccountNumber", schemaIndex = 13, tag = 14)
    private final String rhs_account_number;

    @WireField(adapter = "rosetta.mainst.Side#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final Side side;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "totalCommission", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final Money total_commission;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "totalFee", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final Money total_fee;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "totalGoldSavings", schemaIndex = 9, tag = 10)
    private final Money total_gold_savings;

    public FuturesExecution() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    public /* synthetic */ FuturesExecution(String str, String str2, String str3, String str4, String str5, Money money, Money money2, Money money3, Money money4, Money money5, String str6, FuturesContractType futuresContractType, Side side, String str7, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? null : money, (i & 64) != 0 ? null : money2, (i & 128) != 0 ? null : money3, (i & 256) != 0 ? null : money4, (i & 512) != 0 ? null : money5, (i & 1024) == 0 ? str6 : "", (i & 2048) != 0 ? FuturesContractType.FUTURES_CONTRACT_TYPE_UNSPECIFIED : futuresContractType, (i & 4096) != 0 ? Side.SIDE_UNSPECIFIED : side, (i & 8192) == 0 ? str7 : null, (i & 16384) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20320newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getContract_id() {
        return this.contract_id;
    }

    public final String getPrice_per_contract() {
        return this.price_per_contract;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public final String getEvent_time() {
        return this.event_time;
    }

    public final Money getRealized_pnl() {
        return this.realized_pnl;
    }

    public final Money getRealized_pnl_without_fees() {
        return this.realized_pnl_without_fees;
    }

    public final Money getTotal_fee() {
        return this.total_fee;
    }

    public final Money getTotal_commission() {
        return this.total_commission;
    }

    public final Money getTotal_gold_savings() {
        return this.total_gold_savings;
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public final FuturesContractType getContract_type() {
        return this.contract_type;
    }

    public final Side getSide() {
        return this.side;
    }

    public final String getRhs_account_number() {
        return this.rhs_account_number;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesExecution(String id, String contract_id, String price_per_contract, String quantity, String event_time, Money money, Money money2, Money money3, Money money4, Money money5, String account_id, FuturesContractType contract_type, Side side, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(price_per_contract, "price_per_contract");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(event_time, "event_time");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(contract_type, "contract_type");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.contract_id = contract_id;
        this.price_per_contract = price_per_contract;
        this.quantity = quantity;
        this.event_time = event_time;
        this.realized_pnl = money;
        this.realized_pnl_without_fees = money2;
        this.total_fee = money3;
        this.total_commission = money4;
        this.total_gold_savings = money5;
        this.account_id = account_id;
        this.contract_type = contract_type;
        this.side = side;
        this.rhs_account_number = str;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20320newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FuturesExecution)) {
            return false;
        }
        FuturesExecution futuresExecution = (FuturesExecution) other;
        return Intrinsics.areEqual(unknownFields(), futuresExecution.unknownFields()) && Intrinsics.areEqual(this.id, futuresExecution.id) && Intrinsics.areEqual(this.contract_id, futuresExecution.contract_id) && Intrinsics.areEqual(this.price_per_contract, futuresExecution.price_per_contract) && Intrinsics.areEqual(this.quantity, futuresExecution.quantity) && Intrinsics.areEqual(this.event_time, futuresExecution.event_time) && Intrinsics.areEqual(this.realized_pnl, futuresExecution.realized_pnl) && Intrinsics.areEqual(this.realized_pnl_without_fees, futuresExecution.realized_pnl_without_fees) && Intrinsics.areEqual(this.total_fee, futuresExecution.total_fee) && Intrinsics.areEqual(this.total_commission, futuresExecution.total_commission) && Intrinsics.areEqual(this.total_gold_savings, futuresExecution.total_gold_savings) && Intrinsics.areEqual(this.account_id, futuresExecution.account_id) && this.contract_type == futuresExecution.contract_type && this.side == futuresExecution.side && Intrinsics.areEqual(this.rhs_account_number, futuresExecution.rhs_account_number);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.contract_id.hashCode()) * 37) + this.price_per_contract.hashCode()) * 37) + this.quantity.hashCode()) * 37) + this.event_time.hashCode()) * 37;
        Money money = this.realized_pnl;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.realized_pnl_without_fees;
        int iHashCode3 = (iHashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.total_fee;
        int iHashCode4 = (iHashCode3 + (money3 != null ? money3.hashCode() : 0)) * 37;
        Money money4 = this.total_commission;
        int iHashCode5 = (iHashCode4 + (money4 != null ? money4.hashCode() : 0)) * 37;
        Money money5 = this.total_gold_savings;
        int iHashCode6 = (((((((iHashCode5 + (money5 != null ? money5.hashCode() : 0)) * 37) + this.account_id.hashCode()) * 37) + this.contract_type.hashCode()) * 37) + this.side.hashCode()) * 37;
        String str = this.rhs_account_number;
        int iHashCode7 = iHashCode6 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("contract_id=" + Internal.sanitize(this.contract_id));
        arrayList.add("price_per_contract=" + Internal.sanitize(this.price_per_contract));
        arrayList.add("quantity=" + Internal.sanitize(this.quantity));
        arrayList.add("event_time=" + Internal.sanitize(this.event_time));
        Money money = this.realized_pnl;
        if (money != null) {
            arrayList.add("realized_pnl=" + money);
        }
        Money money2 = this.realized_pnl_without_fees;
        if (money2 != null) {
            arrayList.add("realized_pnl_without_fees=" + money2);
        }
        Money money3 = this.total_fee;
        if (money3 != null) {
            arrayList.add("total_fee=" + money3);
        }
        Money money4 = this.total_commission;
        if (money4 != null) {
            arrayList.add("total_commission=" + money4);
        }
        Money money5 = this.total_gold_savings;
        if (money5 != null) {
            arrayList.add("total_gold_savings=" + money5);
        }
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        arrayList.add("contract_type=" + this.contract_type);
        arrayList.add("side=" + this.side);
        String str = this.rhs_account_number;
        if (str != null) {
            arrayList.add("rhs_account_number=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FuturesExecution{", "}", 0, null, null, 56, null);
    }

    public final FuturesExecution copy(String id, String contract_id, String price_per_contract, String quantity, String event_time, Money realized_pnl, Money realized_pnl_without_fees, Money total_fee, Money total_commission, Money total_gold_savings, String account_id, FuturesContractType contract_type, Side side, String rhs_account_number, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(price_per_contract, "price_per_contract");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(event_time, "event_time");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(contract_type, "contract_type");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FuturesExecution(id, contract_id, price_per_contract, quantity, event_time, realized_pnl, realized_pnl_without_fees, total_fee, total_commission, total_gold_savings, account_id, contract_type, side, rhs_account_number, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FuturesExecution.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FuturesExecution>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.FuturesExecution$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FuturesExecution value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getContract_id());
                }
                if (!Intrinsics.areEqual(value.getPrice_per_contract(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getPrice_per_contract());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getQuantity());
                }
                if (!Intrinsics.areEqual(value.getEvent_time(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getEvent_time());
                }
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(6, value.getRealized_pnl()) + protoAdapter.encodedSizeWithTag(7, value.getRealized_pnl_without_fees());
                if (value.getTotal_fee() != null) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(8, value.getTotal_fee());
                }
                if (value.getTotal_commission() != null) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(9, value.getTotal_commission());
                }
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(10, value.getTotal_gold_savings());
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    iEncodedSizeWithTag2 += ProtoAdapter.STRING.encodedSizeWithTag(11, value.getAccount_id());
                }
                if (value.getContract_type() != FuturesContractType.FUTURES_CONTRACT_TYPE_UNSPECIFIED) {
                    iEncodedSizeWithTag2 += FuturesContractType.ADAPTER.encodedSizeWithTag(12, value.getContract_type());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    iEncodedSizeWithTag2 += Side.ADAPTER.encodedSizeWithTag(13, value.getSide());
                }
                return iEncodedSizeWithTag2 + ProtoAdapter.STRING.encodedSizeWithTag(14, value.getRhs_account_number());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FuturesExecution value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getContract_id());
                }
                if (!Intrinsics.areEqual(value.getPrice_per_contract(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPrice_per_contract());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getQuantity());
                }
                if (!Intrinsics.areEqual(value.getEvent_time(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getEvent_time());
                }
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                protoAdapter.encodeWithTag(writer, 6, (int) value.getRealized_pnl());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getRealized_pnl_without_fees());
                if (value.getTotal_fee() != null) {
                    protoAdapter.encodeWithTag(writer, 8, (int) value.getTotal_fee());
                }
                if (value.getTotal_commission() != null) {
                    protoAdapter.encodeWithTag(writer, 9, (int) value.getTotal_commission());
                }
                protoAdapter.encodeWithTag(writer, 10, (int) value.getTotal_gold_savings());
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getAccount_id());
                }
                if (value.getContract_type() != FuturesContractType.FUTURES_CONTRACT_TYPE_UNSPECIFIED) {
                    FuturesContractType.ADAPTER.encodeWithTag(writer, 12, (int) value.getContract_type());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 13, (int) value.getSide());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getRhs_account_number());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FuturesExecution value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 14, (int) value.getRhs_account_number());
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 13, (int) value.getSide());
                }
                if (value.getContract_type() != FuturesContractType.FUTURES_CONTRACT_TYPE_UNSPECIFIED) {
                    FuturesContractType.ADAPTER.encodeWithTag(writer, 12, (int) value.getContract_type());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 11, (int) value.getAccount_id());
                }
                ProtoAdapter<Money> protoAdapter2 = Money.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 10, (int) value.getTotal_gold_savings());
                if (value.getTotal_commission() != null) {
                    protoAdapter2.encodeWithTag(writer, 9, (int) value.getTotal_commission());
                }
                if (value.getTotal_fee() != null) {
                    protoAdapter2.encodeWithTag(writer, 8, (int) value.getTotal_fee());
                }
                protoAdapter2.encodeWithTag(writer, 7, (int) value.getRealized_pnl_without_fees());
                protoAdapter2.encodeWithTag(writer, 6, (int) value.getRealized_pnl());
                if (!Intrinsics.areEqual(value.getEvent_time(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getEvent_time());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getQuantity());
                }
                if (!Intrinsics.areEqual(value.getPrice_per_contract(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getPrice_per_contract());
                }
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getContract_id());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FuturesExecution decode(ProtoReader reader) throws IOException {
                Side side;
                String str;
                String str2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                FuturesContractType futuresContractType = FuturesContractType.FUTURES_CONTRACT_TYPE_UNSPECIFIED;
                Side side2 = Side.SIDE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                FuturesContractType futuresContractTypeDecode = futuresContractType;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                Money moneyDecode3 = null;
                Money moneyDecode4 = null;
                Money moneyDecode5 = null;
                String strDecode6 = null;
                Side sideDecode = side2;
                String strDecode7 = strDecode5;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
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
                                moneyDecode = Money.ADAPTER.decode(reader);
                                continue;
                            case 7:
                                moneyDecode2 = Money.ADAPTER.decode(reader);
                                continue;
                            case 8:
                                moneyDecode3 = Money.ADAPTER.decode(reader);
                                continue;
                            case 9:
                                moneyDecode4 = Money.ADAPTER.decode(reader);
                                continue;
                            case 10:
                                moneyDecode5 = Money.ADAPTER.decode(reader);
                                continue;
                            case 11:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 12:
                                side = sideDecode;
                                str = strDecode7;
                                str2 = strDecode;
                                try {
                                    futuresContractTypeDecode = FuturesContractType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 13:
                                try {
                                    sideDecode = Side.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    side = sideDecode;
                                    str = strDecode7;
                                    str2 = strDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 14:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(iNextTag);
                                side = sideDecode;
                                str = strDecode7;
                                str2 = strDecode;
                                break;
                        }
                        sideDecode = side;
                        strDecode7 = str;
                        strDecode = str2;
                    } else {
                        return new FuturesExecution(strDecode7, strDecode, strDecode2, strDecode3, strDecode4, moneyDecode, moneyDecode2, moneyDecode3, moneyDecode4, moneyDecode5, strDecode5, futuresContractTypeDecode, sideDecode, strDecode6, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FuturesExecution redact(FuturesExecution value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money realized_pnl = value.getRealized_pnl();
                Money moneyRedact = realized_pnl != null ? Money.ADAPTER.redact(realized_pnl) : null;
                Money realized_pnl_without_fees = value.getRealized_pnl_without_fees();
                Money moneyRedact2 = realized_pnl_without_fees != null ? Money.ADAPTER.redact(realized_pnl_without_fees) : null;
                Money total_fee = value.getTotal_fee();
                Money moneyRedact3 = total_fee != null ? Money.ADAPTER.redact(total_fee) : null;
                Money total_commission = value.getTotal_commission();
                Money moneyRedact4 = total_commission != null ? Money.ADAPTER.redact(total_commission) : null;
                Money total_gold_savings = value.getTotal_gold_savings();
                return value.copy((15391 & 1) != 0 ? value.id : null, (15391 & 2) != 0 ? value.contract_id : null, (15391 & 4) != 0 ? value.price_per_contract : null, (15391 & 8) != 0 ? value.quantity : null, (15391 & 16) != 0 ? value.event_time : null, (15391 & 32) != 0 ? value.realized_pnl : moneyRedact, (15391 & 64) != 0 ? value.realized_pnl_without_fees : moneyRedact2, (15391 & 128) != 0 ? value.total_fee : moneyRedact3, (15391 & 256) != 0 ? value.total_commission : moneyRedact4, (15391 & 512) != 0 ? value.total_gold_savings : total_gold_savings != null ? Money.ADAPTER.redact(total_gold_savings) : null, (15391 & 1024) != 0 ? value.account_id : null, (15391 & 2048) != 0 ? value.contract_type : null, (15391 & 4096) != 0 ? value.side : null, (15391 & 8192) != 0 ? value.rhs_account_number : null, (15391 & 16384) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
