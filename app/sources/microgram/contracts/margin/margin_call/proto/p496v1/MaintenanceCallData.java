package microgram.contracts.margin.margin_call.proto.p496v1;

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

/* compiled from: MaintenanceCallData.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001d\u0018\u0000 =2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001=B¯\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0003H\u0016¢\u0006\u0004\b$\u0010%Jµ\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00102\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010%R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b\u0006\u0010+R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b\u0007\u0010+R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b/\u0010.R\"\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b1\u00102R\"\u0010\u0012\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00100\u001a\u0004\b3\u00102R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010,\u001a\u0004\b4\u0010.R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010,\u001a\u0004\b5\u0010.R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00106\u001a\u0004\b7\u00108R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b:\u0010;R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\b<\u0010;¨\u0006>"}, m3636d2 = {"Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallData;", "Lcom/squareup/wire/Message;", "", "", "account_number", "", "is_resolved", "is_pending", "Lcom/robinhood/rosetta/common/Money;", "amount_remaining", "recommended_deposit_amount", "", "Lmicrogram/contracts/margin/margin_call/proto/v1/Trade;", "sells", "order_ids_to_cancel", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "regular_market_open_time", "regular_market_close_time", "amount_towards_call", "total_estimated_cash_flow", "Lmicrogram/contracts/margin/margin_call/proto/v1/CashFlowState;", "cash_flow_state", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;ZZLcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Ljava/util/List;Ljava/util/List;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lmicrogram/contracts/margin/margin_call/proto/v1/CashFlowState;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;ZZLcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Ljava/util/List;Ljava/util/List;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lmicrogram/contracts/margin/margin_call/proto/v1/CashFlowState;Lokio/ByteString;)Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallData;", "Ljava/lang/String;", "getAccount_number", "Z", "()Z", "Lcom/robinhood/rosetta/common/Money;", "getAmount_remaining", "()Lcom/robinhood/rosetta/common/Money;", "getRecommended_deposit_amount", "Lj$/time/Instant;", "getRegular_market_open_time", "()Lj$/time/Instant;", "getRegular_market_close_time", "getAmount_towards_call", "getTotal_estimated_cash_flow", "Lmicrogram/contracts/margin/margin_call/proto/v1/CashFlowState;", "getCash_flow_state", "()Lmicrogram/contracts/margin/margin_call/proto/v1/CashFlowState;", "Ljava/util/List;", "getSells", "()Ljava/util/List;", "getOrder_ids_to_cancel", "Companion", "microgram.contracts.margin.margin_call.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class MaintenanceCallData extends Message {

    @JvmField
    public static final ProtoAdapter<MaintenanceCallData> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_number;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "amountRemaining", schemaIndex = 3, tag = 4)
    private final Money amount_remaining;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "amountTowardsCall", schemaIndex = 9, tag = 10)
    private final Money amount_towards_call;

    @WireField(adapter = "microgram.contracts.margin.margin_call.proto.v1.CashFlowState#ADAPTER", jsonName = "cashFlowState", schemaIndex = 11, tag = 12)
    private final CashFlowState cash_flow_state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isPending", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean is_pending;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isResolved", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean is_resolved;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderIdsToCancel", label = WireField.Label.REPEATED, schemaIndex = 6, tag = 7)
    private final List<String> order_ids_to_cancel;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "recommendedDepositAmount", schemaIndex = 4, tag = 5)
    private final Money recommended_deposit_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "regularMarketCloseTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final Instant regular_market_close_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "regularMarketOpenTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final Instant regular_market_open_time;

    @WireField(adapter = "microgram.contracts.margin.margin_call.proto.v1.Trade#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 6)
    private final List<Trade> sells;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "totalEstimatedCashFlow", schemaIndex = 10, tag = 11)
    private final Money total_estimated_cash_flow;

    public MaintenanceCallData() {
        this(null, false, false, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29147newBuilder();
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public /* synthetic */ MaintenanceCallData(String str, boolean z, boolean z2, Money money, Money money2, List list, List list2, Instant instant, Instant instant2, Money money3, Money money4, CashFlowState cashFlowState, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) == 0 ? z2 : false, (i & 8) != 0 ? null : money, (i & 16) != 0 ? null : money2, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? CollectionsKt.emptyList() : list2, (i & 128) != 0 ? null : instant, (i & 256) != 0 ? null : instant2, (i & 512) != 0 ? null : money3, (i & 1024) != 0 ? null : money4, (i & 2048) == 0 ? cashFlowState : null, (i & 4096) != 0 ? ByteString.EMPTY : byteString);
    }

    /* renamed from: is_resolved, reason: from getter */
    public final boolean getIs_resolved() {
        return this.is_resolved;
    }

    /* renamed from: is_pending, reason: from getter */
    public final boolean getIs_pending() {
        return this.is_pending;
    }

    public final Money getAmount_remaining() {
        return this.amount_remaining;
    }

    public final Money getRecommended_deposit_amount() {
        return this.recommended_deposit_amount;
    }

    public final Instant getRegular_market_open_time() {
        return this.regular_market_open_time;
    }

    public final Instant getRegular_market_close_time() {
        return this.regular_market_close_time;
    }

    public final Money getAmount_towards_call() {
        return this.amount_towards_call;
    }

    public final Money getTotal_estimated_cash_flow() {
        return this.total_estimated_cash_flow;
    }

    public final CashFlowState getCash_flow_state() {
        return this.cash_flow_state;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaintenanceCallData(String account_number, boolean z, boolean z2, Money money, Money money2, List<Trade> sells, List<String> order_ids_to_cancel, Instant instant, Instant instant2, Money money3, Money money4, CashFlowState cashFlowState, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(sells, "sells");
        Intrinsics.checkNotNullParameter(order_ids_to_cancel, "order_ids_to_cancel");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_number = account_number;
        this.is_resolved = z;
        this.is_pending = z2;
        this.amount_remaining = money;
        this.recommended_deposit_amount = money2;
        this.regular_market_open_time = instant;
        this.regular_market_close_time = instant2;
        this.amount_towards_call = money3;
        this.total_estimated_cash_flow = money4;
        this.cash_flow_state = cashFlowState;
        this.sells = Internal.immutableCopyOf("sells", sells);
        this.order_ids_to_cancel = Internal.immutableCopyOf("order_ids_to_cancel", order_ids_to_cancel);
    }

    public final List<Trade> getSells() {
        return this.sells;
    }

    public final List<String> getOrder_ids_to_cancel() {
        return this.order_ids_to_cancel;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29147newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MaintenanceCallData)) {
            return false;
        }
        MaintenanceCallData maintenanceCallData = (MaintenanceCallData) other;
        return Intrinsics.areEqual(unknownFields(), maintenanceCallData.unknownFields()) && Intrinsics.areEqual(this.account_number, maintenanceCallData.account_number) && this.is_resolved == maintenanceCallData.is_resolved && this.is_pending == maintenanceCallData.is_pending && Intrinsics.areEqual(this.amount_remaining, maintenanceCallData.amount_remaining) && Intrinsics.areEqual(this.recommended_deposit_amount, maintenanceCallData.recommended_deposit_amount) && Intrinsics.areEqual(this.sells, maintenanceCallData.sells) && Intrinsics.areEqual(this.order_ids_to_cancel, maintenanceCallData.order_ids_to_cancel) && Intrinsics.areEqual(this.regular_market_open_time, maintenanceCallData.regular_market_open_time) && Intrinsics.areEqual(this.regular_market_close_time, maintenanceCallData.regular_market_close_time) && Intrinsics.areEqual(this.amount_towards_call, maintenanceCallData.amount_towards_call) && Intrinsics.areEqual(this.total_estimated_cash_flow, maintenanceCallData.total_estimated_cash_flow) && this.cash_flow_state == maintenanceCallData.cash_flow_state;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.account_number.hashCode()) * 37) + Boolean.hashCode(this.is_resolved)) * 37) + Boolean.hashCode(this.is_pending)) * 37;
        Money money = this.amount_remaining;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.recommended_deposit_amount;
        int iHashCode3 = (((((iHashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37) + this.sells.hashCode()) * 37) + this.order_ids_to_cancel.hashCode()) * 37;
        Instant instant = this.regular_market_open_time;
        int iHashCode4 = (iHashCode3 + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.regular_market_close_time;
        int iHashCode5 = (iHashCode4 + (instant2 != null ? instant2.hashCode() : 0)) * 37;
        Money money3 = this.amount_towards_call;
        int iHashCode6 = (iHashCode5 + (money3 != null ? money3.hashCode() : 0)) * 37;
        Money money4 = this.total_estimated_cash_flow;
        int iHashCode7 = (iHashCode6 + (money4 != null ? money4.hashCode() : 0)) * 37;
        CashFlowState cashFlowState = this.cash_flow_state;
        int iHashCode8 = iHashCode7 + (cashFlowState != null ? cashFlowState.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("is_resolved=" + this.is_resolved);
        arrayList.add("is_pending=" + this.is_pending);
        Money money = this.amount_remaining;
        if (money != null) {
            arrayList.add("amount_remaining=" + money);
        }
        Money money2 = this.recommended_deposit_amount;
        if (money2 != null) {
            arrayList.add("recommended_deposit_amount=" + money2);
        }
        if (!this.sells.isEmpty()) {
            arrayList.add("sells=" + this.sells);
        }
        if (!this.order_ids_to_cancel.isEmpty()) {
            arrayList.add("order_ids_to_cancel=" + Internal.sanitize(this.order_ids_to_cancel));
        }
        Instant instant = this.regular_market_open_time;
        if (instant != null) {
            arrayList.add("regular_market_open_time=" + instant);
        }
        Instant instant2 = this.regular_market_close_time;
        if (instant2 != null) {
            arrayList.add("regular_market_close_time=" + instant2);
        }
        Money money3 = this.amount_towards_call;
        if (money3 != null) {
            arrayList.add("amount_towards_call=" + money3);
        }
        Money money4 = this.total_estimated_cash_flow;
        if (money4 != null) {
            arrayList.add("total_estimated_cash_flow=" + money4);
        }
        CashFlowState cashFlowState = this.cash_flow_state;
        if (cashFlowState != null) {
            arrayList.add("cash_flow_state=" + cashFlowState);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MaintenanceCallData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ MaintenanceCallData copy$default(MaintenanceCallData maintenanceCallData, String str, boolean z, boolean z2, Money money, Money money2, List list, List list2, Instant instant, Instant instant2, Money money3, Money money4, CashFlowState cashFlowState, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = maintenanceCallData.account_number;
        }
        return maintenanceCallData.copy(str, (i & 2) != 0 ? maintenanceCallData.is_resolved : z, (i & 4) != 0 ? maintenanceCallData.is_pending : z2, (i & 8) != 0 ? maintenanceCallData.amount_remaining : money, (i & 16) != 0 ? maintenanceCallData.recommended_deposit_amount : money2, (i & 32) != 0 ? maintenanceCallData.sells : list, (i & 64) != 0 ? maintenanceCallData.order_ids_to_cancel : list2, (i & 128) != 0 ? maintenanceCallData.regular_market_open_time : instant, (i & 256) != 0 ? maintenanceCallData.regular_market_close_time : instant2, (i & 512) != 0 ? maintenanceCallData.amount_towards_call : money3, (i & 1024) != 0 ? maintenanceCallData.total_estimated_cash_flow : money4, (i & 2048) != 0 ? maintenanceCallData.cash_flow_state : cashFlowState, (i & 4096) != 0 ? maintenanceCallData.unknownFields() : byteString);
    }

    public final MaintenanceCallData copy(String account_number, boolean is_resolved, boolean is_pending, Money amount_remaining, Money recommended_deposit_amount, List<Trade> sells, List<String> order_ids_to_cancel, Instant regular_market_open_time, Instant regular_market_close_time, Money amount_towards_call, Money total_estimated_cash_flow, CashFlowState cash_flow_state, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(sells, "sells");
        Intrinsics.checkNotNullParameter(order_ids_to_cancel, "order_ids_to_cancel");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MaintenanceCallData(account_number, is_resolved, is_pending, amount_remaining, recommended_deposit_amount, sells, order_ids_to_cancel, regular_market_open_time, regular_market_close_time, amount_towards_call, total_estimated_cash_flow, cash_flow_state, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MaintenanceCallData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MaintenanceCallData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.margin.margin_call.proto.v1.MaintenanceCallData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MaintenanceCallData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_number());
                }
                if (value.getIs_resolved()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getIs_resolved()));
                }
                if (value.getIs_pending()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getIs_pending()));
                }
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(4, value.getAmount_remaining()) + protoAdapter.encodedSizeWithTag(5, value.getRecommended_deposit_amount()) + Trade.ADAPTER.asRepeated().encodedSizeWithTag(6, value.getSells()) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(7, value.getOrder_ids_to_cancel());
                if (value.getRegular_market_open_time() != null) {
                    iEncodedSizeWithTag += ProtoAdapter.INSTANT.encodedSizeWithTag(8, value.getRegular_market_open_time());
                }
                if (value.getRegular_market_close_time() != null) {
                    iEncodedSizeWithTag += ProtoAdapter.INSTANT.encodedSizeWithTag(9, value.getRegular_market_close_time());
                }
                return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(10, value.getAmount_towards_call()) + protoAdapter.encodedSizeWithTag(11, value.getTotal_estimated_cash_flow()) + CashFlowState.ADAPTER.encodedSizeWithTag(12, value.getCash_flow_state());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MaintenanceCallData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
                }
                if (value.getIs_resolved()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIs_resolved()));
                }
                if (value.getIs_pending()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIs_pending()));
                }
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getAmount_remaining());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getRecommended_deposit_amount());
                Trade.ADAPTER.asRepeated().encodeWithTag(writer, 6, (int) value.getSells());
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 7, (int) value.getOrder_ids_to_cancel());
                if (value.getRegular_market_open_time() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 8, (int) value.getRegular_market_open_time());
                }
                if (value.getRegular_market_close_time() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 9, (int) value.getRegular_market_close_time());
                }
                protoAdapter.encodeWithTag(writer, 10, (int) value.getAmount_towards_call());
                protoAdapter.encodeWithTag(writer, 11, (int) value.getTotal_estimated_cash_flow());
                CashFlowState.ADAPTER.encodeWithTag(writer, 12, (int) value.getCash_flow_state());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MaintenanceCallData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                CashFlowState.ADAPTER.encodeWithTag(writer, 12, (int) value.getCash_flow_state());
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                protoAdapter.encodeWithTag(writer, 11, (int) value.getTotal_estimated_cash_flow());
                protoAdapter.encodeWithTag(writer, 10, (int) value.getAmount_towards_call());
                if (value.getRegular_market_close_time() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 9, (int) value.getRegular_market_close_time());
                }
                if (value.getRegular_market_open_time() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 8, (int) value.getRegular_market_open_time());
                }
                ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.asRepeated().encodeWithTag(writer, 7, (int) value.getOrder_ids_to_cancel());
                Trade.ADAPTER.asRepeated().encodeWithTag(writer, 6, (int) value.getSells());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getRecommended_deposit_amount());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getAmount_remaining());
                if (value.getIs_pending()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIs_pending()));
                }
                if (value.getIs_resolved()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIs_resolved()));
                }
                if (Intrinsics.areEqual(value.getAccount_number(), "")) {
                    return;
                }
                protoAdapter2.encodeWithTag(writer, 1, (int) value.getAccount_number());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MaintenanceCallData decode(ProtoReader reader) throws IOException {
                boolean z;
                Money money;
                Money money2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                boolean zBooleanValue = false;
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                Money moneyDecode3 = null;
                Money moneyDecode4 = null;
                CashFlowState cashFlowStateDecode = null;
                boolean zBooleanValue2 = false;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 2:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                continue;
                            case 3:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                continue;
                            case 4:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                continue;
                            case 5:
                                moneyDecode2 = Money.ADAPTER.decode(reader);
                                continue;
                            case 6:
                                z = zBooleanValue2;
                                money = moneyDecode;
                                money2 = moneyDecode2;
                                arrayList.add(Trade.ADAPTER.decode(reader));
                                break;
                            case 7:
                                z = zBooleanValue2;
                                money = moneyDecode;
                                money2 = moneyDecode2;
                                arrayList2.add(ProtoAdapter.STRING.decode(reader));
                                break;
                            case 8:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            case 9:
                                instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            case 10:
                                moneyDecode3 = Money.ADAPTER.decode(reader);
                                continue;
                            case 11:
                                moneyDecode4 = Money.ADAPTER.decode(reader);
                                continue;
                            case 12:
                                try {
                                    cashFlowStateDecode = CashFlowState.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    z = zBooleanValue2;
                                    money = moneyDecode;
                                    money2 = moneyDecode2;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(iNextTag);
                                z = zBooleanValue2;
                                money = moneyDecode;
                                money2 = moneyDecode2;
                                break;
                        }
                        zBooleanValue2 = z;
                        moneyDecode = money;
                        moneyDecode2 = money2;
                    } else {
                        return new MaintenanceCallData(strDecode, zBooleanValue2, zBooleanValue, moneyDecode, moneyDecode2, arrayList, arrayList2, instantDecode, instantDecode2, moneyDecode3, moneyDecode4, cashFlowStateDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MaintenanceCallData redact(MaintenanceCallData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money amount_remaining = value.getAmount_remaining();
                Money moneyRedact = amount_remaining != null ? Money.ADAPTER.redact(amount_remaining) : null;
                Money recommended_deposit_amount = value.getRecommended_deposit_amount();
                Money moneyRedact2 = recommended_deposit_amount != null ? Money.ADAPTER.redact(recommended_deposit_amount) : null;
                List listM26823redactElements = Internal.m26823redactElements(value.getSells(), Trade.ADAPTER);
                Instant regular_market_open_time = value.getRegular_market_open_time();
                Instant instantRedact = regular_market_open_time != null ? ProtoAdapter.INSTANT.redact(regular_market_open_time) : null;
                Instant regular_market_close_time = value.getRegular_market_close_time();
                Instant instantRedact2 = regular_market_close_time != null ? ProtoAdapter.INSTANT.redact(regular_market_close_time) : null;
                Money amount_towards_call = value.getAmount_towards_call();
                Money moneyRedact3 = amount_towards_call != null ? Money.ADAPTER.redact(amount_towards_call) : null;
                Money total_estimated_cash_flow = value.getTotal_estimated_cash_flow();
                return MaintenanceCallData.copy$default(value, null, false, false, moneyRedact, moneyRedact2, listM26823redactElements, null, instantRedact, instantRedact2, moneyRedact3, total_estimated_cash_flow != null ? Money.ADAPTER.redact(total_estimated_cash_flow) : null, null, ByteString.EMPTY, 2119, null);
            }
        };
    }
}
