package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.ceres.p284v1.SelloutReasonDto;
import com.robinhood.ceres.p284v1.SelloutTypeDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;
import okio.ByteString;
import rosetta.mainst.OrderTrigger;
import rosetta.mainst.OrderTriggerDto;
import rosetta.mainst.OrderType;
import rosetta.mainst.OrderTypeDto;
import rosetta.mainst.TimeInForce;
import rosetta.mainst.TimeInForceDto;
import rosetta.order.Agent;
import rosetta.order.AgentDto;

/* compiled from: CreatePositionSelloutRequestDto.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 E2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004DEFGB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u009f\u0001\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0006\u0010\u001eJ\u009c\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0010J\b\u00106\u001a\u00020\u0002H\u0016J\b\u00107\u001a\u00020\tH\u0016J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;H\u0096\u0002J\b\u0010<\u001a\u00020=H\u0016J\u0018\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020=H\u0016J\b\u0010C\u001a\u00020=H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b#\u0010 R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b(\u0010'R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b)\u0010 R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010\u0015\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b,\u0010 R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b3\u0010'R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b4\u0010'¨\u0006H"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CreatePositionSelloutRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/CreatePositionSelloutRequest;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/CreatePositionSelloutRequestDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/CreatePositionSelloutRequestDto$Surrogate;)V", "account_id", "", "sellout_reason", "Lcom/robinhood/ceres/v1/SelloutReasonDto;", "contract_id", "sellout_type", "Lcom/robinhood/ceres/v1/SelloutTypeDto;", "quantity", "Lcom/robinhood/idl/IdlDecimal;", "total_balance", "notes", "sellout_agent", "Lrosetta/order/AgentDto;", "sellout_agent_alias", "order_type", "Lrosetta/mainst/OrderTypeDto;", "order_trigger", "Lrosetta/mainst/OrderTriggerDto;", "order_time_in_force", "Lrosetta/mainst/TimeInForceDto;", "stop_price", "limit_price", "(Ljava/lang/String;Lcom/robinhood/ceres/v1/SelloutReasonDto;Ljava/lang/String;Lcom/robinhood/ceres/v1/SelloutTypeDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lrosetta/order/AgentDto;Ljava/lang/String;Lrosetta/mainst/OrderTypeDto;Lrosetta/mainst/OrderTriggerDto;Lrosetta/mainst/TimeInForceDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "getAccount_id", "()Ljava/lang/String;", "getSellout_reason", "()Lcom/robinhood/ceres/v1/SelloutReasonDto;", "getContract_id", "getSellout_type", "()Lcom/robinhood/ceres/v1/SelloutTypeDto;", "getQuantity", "()Lcom/robinhood/idl/IdlDecimal;", "getTotal_balance", "getNotes", "getSellout_agent", "()Lrosetta/order/AgentDto;", "getSellout_agent_alias", "getOrder_type", "()Lrosetta/mainst/OrderTypeDto;", "getOrder_trigger", "()Lrosetta/mainst/OrderTriggerDto;", "getOrder_time_in_force", "()Lrosetta/mainst/TimeInForceDto;", "getStop_price", "getLimit_price", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class CreatePositionSelloutRequestDto implements Dto3<CreatePositionSelloutRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CreatePositionSelloutRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CreatePositionSelloutRequestDto, CreatePositionSelloutRequest>> binaryBase64Serializer$delegate;
    private static final CreatePositionSelloutRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CreatePositionSelloutRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CreatePositionSelloutRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getAccount_id() {
        return this.surrogate.getAccount_id();
    }

    public final SelloutReasonDto getSellout_reason() {
        return this.surrogate.getSellout_reason();
    }

    public final String getContract_id() {
        return this.surrogate.getContract_id();
    }

    public final SelloutTypeDto getSellout_type() {
        return this.surrogate.getSellout_type();
    }

    public final IdlDecimal getQuantity() {
        return this.surrogate.getQuantity();
    }

    public final IdlDecimal getTotal_balance() {
        return this.surrogate.getTotal_balance();
    }

    public final String getNotes() {
        return this.surrogate.getNotes();
    }

    public final AgentDto getSellout_agent() {
        return this.surrogate.getSellout_agent();
    }

    public final String getSellout_agent_alias() {
        return this.surrogate.getSellout_agent_alias();
    }

    public final OrderTypeDto getOrder_type() {
        return this.surrogate.getOrder_type();
    }

    public final OrderTriggerDto getOrder_trigger() {
        return this.surrogate.getOrder_trigger();
    }

    public final TimeInForceDto getOrder_time_in_force() {
        return this.surrogate.getOrder_time_in_force();
    }

    public final IdlDecimal getStop_price() {
        return this.surrogate.getStop_price();
    }

    public final IdlDecimal getLimit_price() {
        return this.surrogate.getLimit_price();
    }

    public /* synthetic */ CreatePositionSelloutRequestDto(String str, SelloutReasonDto selloutReasonDto, String str2, SelloutTypeDto selloutTypeDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, String str3, AgentDto agentDto, String str4, OrderTypeDto orderTypeDto, OrderTriggerDto orderTriggerDto, TimeInForceDto timeInForceDto, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? SelloutReasonDto.INSTANCE.getZeroValue() : selloutReasonDto, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? SelloutTypeDto.INSTANCE.getZeroValue() : selloutTypeDto, (i & 16) != 0 ? null : idlDecimal, (i & 32) != 0 ? null : idlDecimal2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? AgentDto.INSTANCE.getZeroValue() : agentDto, (i & 256) == 0 ? str4 : "", (i & 512) != 0 ? OrderTypeDto.INSTANCE.getZeroValue() : orderTypeDto, (i & 1024) != 0 ? OrderTriggerDto.INSTANCE.getZeroValue() : orderTriggerDto, (i & 2048) != 0 ? TimeInForceDto.INSTANCE.getZeroValue() : timeInForceDto, (i & 4096) != 0 ? null : idlDecimal3, (i & 8192) != 0 ? null : idlDecimal4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePositionSelloutRequestDto(String account_id, SelloutReasonDto sellout_reason, String contract_id, SelloutTypeDto sellout_type, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, String str, AgentDto sellout_agent, String sellout_agent_alias, OrderTypeDto order_type, OrderTriggerDto order_trigger, TimeInForceDto order_time_in_force, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4) {
        this(new Surrogate(account_id, sellout_reason, contract_id, sellout_type, idlDecimal, idlDecimal2, str, sellout_agent, sellout_agent_alias, order_type, order_trigger, order_time_in_force, idlDecimal3, idlDecimal4));
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(sellout_reason, "sellout_reason");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(sellout_type, "sellout_type");
        Intrinsics.checkNotNullParameter(sellout_agent, "sellout_agent");
        Intrinsics.checkNotNullParameter(sellout_agent_alias, "sellout_agent_alias");
        Intrinsics.checkNotNullParameter(order_type, "order_type");
        Intrinsics.checkNotNullParameter(order_trigger, "order_trigger");
        Intrinsics.checkNotNullParameter(order_time_in_force, "order_time_in_force");
    }

    public final CreatePositionSelloutRequestDto copy(String account_id, SelloutReasonDto sellout_reason, String contract_id, SelloutTypeDto sellout_type, IdlDecimal quantity, IdlDecimal total_balance, String notes, AgentDto sellout_agent, String sellout_agent_alias, OrderTypeDto order_type, OrderTriggerDto order_trigger, TimeInForceDto order_time_in_force, IdlDecimal stop_price, IdlDecimal limit_price) {
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(sellout_reason, "sellout_reason");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(sellout_type, "sellout_type");
        Intrinsics.checkNotNullParameter(sellout_agent, "sellout_agent");
        Intrinsics.checkNotNullParameter(sellout_agent_alias, "sellout_agent_alias");
        Intrinsics.checkNotNullParameter(order_type, "order_type");
        Intrinsics.checkNotNullParameter(order_trigger, "order_trigger");
        Intrinsics.checkNotNullParameter(order_time_in_force, "order_time_in_force");
        return new CreatePositionSelloutRequestDto(new Surrogate(account_id, sellout_reason, contract_id, sellout_type, quantity, total_balance, notes, sellout_agent, sellout_agent_alias, order_type, order_trigger, order_time_in_force, stop_price, limit_price));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CreatePositionSelloutRequest toProto() {
        String account_id = this.surrogate.getAccount_id();
        SelloutReason selloutReason = (SelloutReason) this.surrogate.getSellout_reason().toProto();
        String contract_id = this.surrogate.getContract_id();
        SelloutType selloutType = (SelloutType) this.surrogate.getSellout_type().toProto();
        IdlDecimal quantity = this.surrogate.getQuantity();
        String stringValue = quantity != null ? quantity.getStringValue() : null;
        IdlDecimal total_balance = this.surrogate.getTotal_balance();
        String stringValue2 = total_balance != null ? total_balance.getStringValue() : null;
        String notes = this.surrogate.getNotes();
        Agent agent = (Agent) this.surrogate.getSellout_agent().toProto();
        String sellout_agent_alias = this.surrogate.getSellout_agent_alias();
        OrderType orderType = (OrderType) this.surrogate.getOrder_type().toProto();
        OrderTrigger orderTrigger = (OrderTrigger) this.surrogate.getOrder_trigger().toProto();
        TimeInForce timeInForce = (TimeInForce) this.surrogate.getOrder_time_in_force().toProto();
        IdlDecimal stop_price = this.surrogate.getStop_price();
        String stringValue3 = stop_price != null ? stop_price.getStringValue() : null;
        IdlDecimal limit_price = this.surrogate.getLimit_price();
        ByteString byteString = null;
        return new CreatePositionSelloutRequest(account_id, selloutReason, contract_id, selloutType, stringValue, stringValue2, notes, agent, sellout_agent_alias, orderType, orderTrigger, timeInForce, stringValue3, limit_price != null ? limit_price.getStringValue() : null, byteString, 16384, null);
    }

    public String toString() {
        return "[CreatePositionSelloutRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CreatePositionSelloutRequestDto) && Intrinsics.areEqual(((CreatePositionSelloutRequestDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CreatePositionSelloutRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 d2\u00020\u0001:\u0002cdBÙ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0019\b\u0002\u0010\t\u001a\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\u0019\b\u0002\u0010\u000e\u001a\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\u0019\b\u0002\u0010\u0019\u001a\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\u0019\b\u0002\u0010\u001a\u001a\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r¢\u0006\u0004\b\u001b\u0010\u001cB§\u0001\b\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001b\u0010!J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0005HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\bHÆ\u0003J\u001a\u0010K\u001a\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003J\u001a\u0010L\u001a\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0011HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0014HÆ\u0003J\t\u0010Q\u001a\u00020\u0016HÆ\u0003J\t\u0010R\u001a\u00020\u0018HÆ\u0003J\u001a\u0010S\u001a\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003J\u001a\u0010T\u001a\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003JÛ\u0001\u0010U\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0019\b\u0002\u0010\t\u001a\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\u0019\b\u0002\u0010\u000e\u001a\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0019\b\u0002\u0010\u0019\u001a\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\u0019\b\u0002\u0010\u001a\u001a\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0001J\u0013\u0010V\u001a\u00020W2\b\u0010X\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Y\u001a\u00020\u001eHÖ\u0001J\t\u0010Z\u001a\u00020\u0003HÖ\u0001J%\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020\u00002\u0006\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020aH\u0001¢\u0006\u0002\bbR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010#\u001a\u0004\b'\u0010(R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010#\u001a\u0004\b*\u0010%R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010#\u001a\u0004\b,\u0010-R-\u0010\t\u001a\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010#\u001a\u0004\b/\u00100R-\u0010\u000e\u001a\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010#\u001a\u0004\b2\u00100R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u0010#\u001a\u0004\b4\u0010%R\u001c\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b5\u0010#\u001a\u0004\b6\u00107R\u001c\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b8\u0010#\u001a\u0004\b9\u0010%R\u001c\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u0010#\u001a\u0004\b;\u0010<R\u001c\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b=\u0010#\u001a\u0004\b>\u0010?R\u001c\u0010\u0017\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b@\u0010#\u001a\u0004\bA\u0010BR-\u0010\u0019\u001a\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bC\u0010#\u001a\u0004\bD\u00100R-\u0010\u001a\u001a\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bE\u0010#\u001a\u0004\bF\u00100¨\u0006e"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CreatePositionSelloutRequestDto$Surrogate;", "", "account_id", "", "sellout_reason", "Lcom/robinhood/ceres/v1/SelloutReasonDto;", "contract_id", "sellout_type", "Lcom/robinhood/ceres/v1/SelloutTypeDto;", "quantity", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "total_balance", "notes", "sellout_agent", "Lrosetta/order/AgentDto;", "sellout_agent_alias", "order_type", "Lrosetta/mainst/OrderTypeDto;", "order_trigger", "Lrosetta/mainst/OrderTriggerDto;", "order_time_in_force", "Lrosetta/mainst/TimeInForceDto;", "stop_price", "limit_price", "<init>", "(Ljava/lang/String;Lcom/robinhood/ceres/v1/SelloutReasonDto;Ljava/lang/String;Lcom/robinhood/ceres/v1/SelloutTypeDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lrosetta/order/AgentDto;Ljava/lang/String;Lrosetta/mainst/OrderTypeDto;Lrosetta/mainst/OrderTriggerDto;Lrosetta/mainst/TimeInForceDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/ceres/v1/SelloutReasonDto;Ljava/lang/String;Lcom/robinhood/ceres/v1/SelloutTypeDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lrosetta/order/AgentDto;Ljava/lang/String;Lrosetta/mainst/OrderTypeDto;Lrosetta/mainst/OrderTriggerDto;Lrosetta/mainst/TimeInForceDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAccount_id$annotations", "()V", "getAccount_id", "()Ljava/lang/String;", "getSellout_reason$annotations", "getSellout_reason", "()Lcom/robinhood/ceres/v1/SelloutReasonDto;", "getContract_id$annotations", "getContract_id", "getSellout_type$annotations", "getSellout_type", "()Lcom/robinhood/ceres/v1/SelloutTypeDto;", "getQuantity$annotations", "getQuantity", "()Lcom/robinhood/idl/IdlDecimal;", "getTotal_balance$annotations", "getTotal_balance", "getNotes$annotations", "getNotes", "getSellout_agent$annotations", "getSellout_agent", "()Lrosetta/order/AgentDto;", "getSellout_agent_alias$annotations", "getSellout_agent_alias", "getOrder_type$annotations", "getOrder_type", "()Lrosetta/mainst/OrderTypeDto;", "getOrder_trigger$annotations", "getOrder_trigger", "()Lrosetta/mainst/OrderTriggerDto;", "getOrder_time_in_force$annotations", "getOrder_time_in_force", "()Lrosetta/mainst/TimeInForceDto;", "getStop_price$annotations", "getStop_price", "getLimit_price$annotations", "getLimit_price", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_v1_externalRelease", "$serializer", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_id;
        private final String contract_id;
        private final IdlDecimal limit_price;
        private final String notes;
        private final TimeInForceDto order_time_in_force;
        private final OrderTriggerDto order_trigger;
        private final OrderTypeDto order_type;
        private final IdlDecimal quantity;
        private final AgentDto sellout_agent;
        private final String sellout_agent_alias;
        private final SelloutReasonDto sellout_reason;
        private final SelloutTypeDto sellout_type;
        private final IdlDecimal stop_price;
        private final IdlDecimal total_balance;

        public Surrogate() {
            this((String) null, (SelloutReasonDto) null, (String) null, (SelloutTypeDto) null, (IdlDecimal) null, (IdlDecimal) null, (String) null, (AgentDto) null, (String) null, (OrderTypeDto) null, (OrderTriggerDto) null, (TimeInForceDto) null, (IdlDecimal) null, (IdlDecimal) null, 16383, (DefaultConstructorMarker) null);
        }

        @SerialName("accountId")
        @JsonAnnotations2(names = {"account_id"})
        public static /* synthetic */ void getAccount_id$annotations() {
        }

        @SerialName("contractId")
        @JsonAnnotations2(names = {"contract_id"})
        public static /* synthetic */ void getContract_id$annotations() {
        }

        @SerialName("limitPrice")
        @JsonAnnotations2(names = {"limit_price"})
        public static /* synthetic */ void getLimit_price$annotations() {
        }

        @SerialName("notes")
        @JsonAnnotations2(names = {"notes"})
        public static /* synthetic */ void getNotes$annotations() {
        }

        @SerialName("orderTimeInForce")
        @JsonAnnotations2(names = {"order_time_in_force"})
        public static /* synthetic */ void getOrder_time_in_force$annotations() {
        }

        @SerialName("orderTrigger")
        @JsonAnnotations2(names = {"order_trigger"})
        public static /* synthetic */ void getOrder_trigger$annotations() {
        }

        @SerialName("orderType")
        @JsonAnnotations2(names = {"order_type"})
        public static /* synthetic */ void getOrder_type$annotations() {
        }

        @SerialName("quantity")
        @JsonAnnotations2(names = {"quantity"})
        public static /* synthetic */ void getQuantity$annotations() {
        }

        @SerialName("selloutAgent")
        @JsonAnnotations2(names = {"sellout_agent"})
        public static /* synthetic */ void getSellout_agent$annotations() {
        }

        @SerialName("selloutAgentAlias")
        @JsonAnnotations2(names = {"sellout_agent_alias"})
        public static /* synthetic */ void getSellout_agent_alias$annotations() {
        }

        @SerialName("selloutReason")
        @JsonAnnotations2(names = {"sellout_reason"})
        public static /* synthetic */ void getSellout_reason$annotations() {
        }

        @SerialName("selloutType")
        @JsonAnnotations2(names = {"sellout_type"})
        public static /* synthetic */ void getSellout_type$annotations() {
        }

        @SerialName("stopPrice")
        @JsonAnnotations2(names = {"stop_price"})
        public static /* synthetic */ void getStop_price$annotations() {
        }

        @SerialName("totalBalance")
        @JsonAnnotations2(names = {"total_balance"})
        public static /* synthetic */ void getTotal_balance$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccount_id() {
            return this.account_id;
        }

        /* renamed from: component10, reason: from getter */
        public final OrderTypeDto getOrder_type() {
            return this.order_type;
        }

        /* renamed from: component11, reason: from getter */
        public final OrderTriggerDto getOrder_trigger() {
            return this.order_trigger;
        }

        /* renamed from: component12, reason: from getter */
        public final TimeInForceDto getOrder_time_in_force() {
            return this.order_time_in_force;
        }

        /* renamed from: component13, reason: from getter */
        public final IdlDecimal getStop_price() {
            return this.stop_price;
        }

        /* renamed from: component14, reason: from getter */
        public final IdlDecimal getLimit_price() {
            return this.limit_price;
        }

        /* renamed from: component2, reason: from getter */
        public final SelloutReasonDto getSellout_reason() {
            return this.sellout_reason;
        }

        /* renamed from: component3, reason: from getter */
        public final String getContract_id() {
            return this.contract_id;
        }

        /* renamed from: component4, reason: from getter */
        public final SelloutTypeDto getSellout_type() {
            return this.sellout_type;
        }

        /* renamed from: component5, reason: from getter */
        public final IdlDecimal getQuantity() {
            return this.quantity;
        }

        /* renamed from: component6, reason: from getter */
        public final IdlDecimal getTotal_balance() {
            return this.total_balance;
        }

        /* renamed from: component7, reason: from getter */
        public final String getNotes() {
            return this.notes;
        }

        /* renamed from: component8, reason: from getter */
        public final AgentDto getSellout_agent() {
            return this.sellout_agent;
        }

        /* renamed from: component9, reason: from getter */
        public final String getSellout_agent_alias() {
            return this.sellout_agent_alias;
        }

        public final Surrogate copy(String account_id, SelloutReasonDto sellout_reason, String contract_id, SelloutTypeDto sellout_type, IdlDecimal quantity, IdlDecimal total_balance, String notes, AgentDto sellout_agent, String sellout_agent_alias, OrderTypeDto order_type, OrderTriggerDto order_trigger, TimeInForceDto order_time_in_force, IdlDecimal stop_price, IdlDecimal limit_price) {
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(sellout_reason, "sellout_reason");
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
            Intrinsics.checkNotNullParameter(sellout_type, "sellout_type");
            Intrinsics.checkNotNullParameter(sellout_agent, "sellout_agent");
            Intrinsics.checkNotNullParameter(sellout_agent_alias, "sellout_agent_alias");
            Intrinsics.checkNotNullParameter(order_type, "order_type");
            Intrinsics.checkNotNullParameter(order_trigger, "order_trigger");
            Intrinsics.checkNotNullParameter(order_time_in_force, "order_time_in_force");
            return new Surrogate(account_id, sellout_reason, contract_id, sellout_type, quantity, total_balance, notes, sellout_agent, sellout_agent_alias, order_type, order_trigger, order_time_in_force, stop_price, limit_price);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_id, surrogate.account_id) && this.sellout_reason == surrogate.sellout_reason && Intrinsics.areEqual(this.contract_id, surrogate.contract_id) && this.sellout_type == surrogate.sellout_type && Intrinsics.areEqual(this.quantity, surrogate.quantity) && Intrinsics.areEqual(this.total_balance, surrogate.total_balance) && Intrinsics.areEqual(this.notes, surrogate.notes) && this.sellout_agent == surrogate.sellout_agent && Intrinsics.areEqual(this.sellout_agent_alias, surrogate.sellout_agent_alias) && this.order_type == surrogate.order_type && this.order_trigger == surrogate.order_trigger && this.order_time_in_force == surrogate.order_time_in_force && Intrinsics.areEqual(this.stop_price, surrogate.stop_price) && Intrinsics.areEqual(this.limit_price, surrogate.limit_price);
        }

        public int hashCode() {
            int iHashCode = ((((((this.account_id.hashCode() * 31) + this.sellout_reason.hashCode()) * 31) + this.contract_id.hashCode()) * 31) + this.sellout_type.hashCode()) * 31;
            IdlDecimal idlDecimal = this.quantity;
            int iHashCode2 = (iHashCode + (idlDecimal == null ? 0 : idlDecimal.hashCode())) * 31;
            IdlDecimal idlDecimal2 = this.total_balance;
            int iHashCode3 = (iHashCode2 + (idlDecimal2 == null ? 0 : idlDecimal2.hashCode())) * 31;
            String str = this.notes;
            int iHashCode4 = (((((((((((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.sellout_agent.hashCode()) * 31) + this.sellout_agent_alias.hashCode()) * 31) + this.order_type.hashCode()) * 31) + this.order_trigger.hashCode()) * 31) + this.order_time_in_force.hashCode()) * 31;
            IdlDecimal idlDecimal3 = this.stop_price;
            int iHashCode5 = (iHashCode4 + (idlDecimal3 == null ? 0 : idlDecimal3.hashCode())) * 31;
            IdlDecimal idlDecimal4 = this.limit_price;
            return iHashCode5 + (idlDecimal4 != null ? idlDecimal4.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(account_id=" + this.account_id + ", sellout_reason=" + this.sellout_reason + ", contract_id=" + this.contract_id + ", sellout_type=" + this.sellout_type + ", quantity=" + this.quantity + ", total_balance=" + this.total_balance + ", notes=" + this.notes + ", sellout_agent=" + this.sellout_agent + ", sellout_agent_alias=" + this.sellout_agent_alias + ", order_type=" + this.order_type + ", order_trigger=" + this.order_trigger + ", order_time_in_force=" + this.order_time_in_force + ", stop_price=" + this.stop_price + ", limit_price=" + this.limit_price + ")";
        }

        /* compiled from: CreatePositionSelloutRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CreatePositionSelloutRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/CreatePositionSelloutRequestDto$Surrogate;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CreatePositionSelloutRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, SelloutReasonDto selloutReasonDto, String str2, SelloutTypeDto selloutTypeDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, String str3, AgentDto agentDto, String str4, OrderTypeDto orderTypeDto, OrderTriggerDto orderTriggerDto, TimeInForceDto timeInForceDto, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.account_id = "";
            } else {
                this.account_id = str;
            }
            if ((i & 2) == 0) {
                this.sellout_reason = SelloutReasonDto.INSTANCE.getZeroValue();
            } else {
                this.sellout_reason = selloutReasonDto;
            }
            if ((i & 4) == 0) {
                this.contract_id = "";
            } else {
                this.contract_id = str2;
            }
            if ((i & 8) == 0) {
                this.sellout_type = SelloutTypeDto.INSTANCE.getZeroValue();
            } else {
                this.sellout_type = selloutTypeDto;
            }
            if ((i & 16) == 0) {
                this.quantity = null;
            } else {
                this.quantity = idlDecimal;
            }
            if ((i & 32) == 0) {
                this.total_balance = null;
            } else {
                this.total_balance = idlDecimal2;
            }
            if ((i & 64) == 0) {
                this.notes = null;
            } else {
                this.notes = str3;
            }
            if ((i & 128) == 0) {
                this.sellout_agent = AgentDto.INSTANCE.getZeroValue();
            } else {
                this.sellout_agent = agentDto;
            }
            if ((i & 256) == 0) {
                this.sellout_agent_alias = "";
            } else {
                this.sellout_agent_alias = str4;
            }
            if ((i & 512) == 0) {
                this.order_type = OrderTypeDto.INSTANCE.getZeroValue();
            } else {
                this.order_type = orderTypeDto;
            }
            if ((i & 1024) == 0) {
                this.order_trigger = OrderTriggerDto.INSTANCE.getZeroValue();
            } else {
                this.order_trigger = orderTriggerDto;
            }
            if ((i & 2048) == 0) {
                this.order_time_in_force = TimeInForceDto.INSTANCE.getZeroValue();
            } else {
                this.order_time_in_force = timeInForceDto;
            }
            if ((i & 4096) == 0) {
                this.stop_price = null;
            } else {
                this.stop_price = idlDecimal3;
            }
            if ((i & 8192) == 0) {
                this.limit_price = null;
            } else {
                this.limit_price = idlDecimal4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.account_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.account_id);
            }
            if (self.sellout_reason != SelloutReasonDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, SelloutReasonDto.Serializer.INSTANCE, self.sellout_reason);
            }
            if (!Intrinsics.areEqual(self.contract_id, "")) {
                output.encodeStringElement(serialDesc, 2, self.contract_id);
            }
            if (self.sellout_type != SelloutTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, SelloutTypeDto.Serializer.INSTANCE, self.sellout_type);
            }
            IdlDecimal idlDecimal = self.quantity;
            if (idlDecimal != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, IdlDecimalSerializer.INSTANCE, idlDecimal);
            }
            IdlDecimal idlDecimal2 = self.total_balance;
            if (idlDecimal2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, IdlDecimalSerializer.INSTANCE, idlDecimal2);
            }
            String str = self.notes;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, str);
            }
            if (self.sellout_agent != AgentDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 7, AgentDto.Serializer.INSTANCE, self.sellout_agent);
            }
            if (!Intrinsics.areEqual(self.sellout_agent_alias, "")) {
                output.encodeStringElement(serialDesc, 8, self.sellout_agent_alias);
            }
            if (self.order_type != OrderTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 9, OrderTypeDto.Serializer.INSTANCE, self.order_type);
            }
            if (self.order_trigger != OrderTriggerDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 10, OrderTriggerDto.Serializer.INSTANCE, self.order_trigger);
            }
            if (self.order_time_in_force != TimeInForceDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 11, TimeInForceDto.Serializer.INSTANCE, self.order_time_in_force);
            }
            IdlDecimal idlDecimal3 = self.stop_price;
            if (idlDecimal3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, IdlDecimalSerializer.INSTANCE, idlDecimal3);
            }
            IdlDecimal idlDecimal4 = self.limit_price;
            if (idlDecimal4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, IdlDecimalSerializer.INSTANCE, idlDecimal4);
            }
        }

        public Surrogate(String account_id, SelloutReasonDto sellout_reason, String contract_id, SelloutTypeDto sellout_type, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, String str, AgentDto sellout_agent, String sellout_agent_alias, OrderTypeDto order_type, OrderTriggerDto order_trigger, TimeInForceDto order_time_in_force, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4) {
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(sellout_reason, "sellout_reason");
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
            Intrinsics.checkNotNullParameter(sellout_type, "sellout_type");
            Intrinsics.checkNotNullParameter(sellout_agent, "sellout_agent");
            Intrinsics.checkNotNullParameter(sellout_agent_alias, "sellout_agent_alias");
            Intrinsics.checkNotNullParameter(order_type, "order_type");
            Intrinsics.checkNotNullParameter(order_trigger, "order_trigger");
            Intrinsics.checkNotNullParameter(order_time_in_force, "order_time_in_force");
            this.account_id = account_id;
            this.sellout_reason = sellout_reason;
            this.contract_id = contract_id;
            this.sellout_type = sellout_type;
            this.quantity = idlDecimal;
            this.total_balance = idlDecimal2;
            this.notes = str;
            this.sellout_agent = sellout_agent;
            this.sellout_agent_alias = sellout_agent_alias;
            this.order_type = order_type;
            this.order_trigger = order_trigger;
            this.order_time_in_force = order_time_in_force;
            this.stop_price = idlDecimal3;
            this.limit_price = idlDecimal4;
        }

        public /* synthetic */ Surrogate(String str, SelloutReasonDto selloutReasonDto, String str2, SelloutTypeDto selloutTypeDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, String str3, AgentDto agentDto, String str4, OrderTypeDto orderTypeDto, OrderTriggerDto orderTriggerDto, TimeInForceDto timeInForceDto, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? SelloutReasonDto.INSTANCE.getZeroValue() : selloutReasonDto, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? SelloutTypeDto.INSTANCE.getZeroValue() : selloutTypeDto, (i & 16) != 0 ? null : idlDecimal, (i & 32) != 0 ? null : idlDecimal2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? AgentDto.INSTANCE.getZeroValue() : agentDto, (i & 256) == 0 ? str4 : "", (i & 512) != 0 ? OrderTypeDto.INSTANCE.getZeroValue() : orderTypeDto, (i & 1024) != 0 ? OrderTriggerDto.INSTANCE.getZeroValue() : orderTriggerDto, (i & 2048) != 0 ? TimeInForceDto.INSTANCE.getZeroValue() : timeInForceDto, (i & 4096) != 0 ? null : idlDecimal3, (i & 8192) != 0 ? null : idlDecimal4);
        }

        public final String getAccount_id() {
            return this.account_id;
        }

        public final SelloutReasonDto getSellout_reason() {
            return this.sellout_reason;
        }

        public final String getContract_id() {
            return this.contract_id;
        }

        public final SelloutTypeDto getSellout_type() {
            return this.sellout_type;
        }

        public final IdlDecimal getQuantity() {
            return this.quantity;
        }

        public final IdlDecimal getTotal_balance() {
            return this.total_balance;
        }

        public final String getNotes() {
            return this.notes;
        }

        public final AgentDto getSellout_agent() {
            return this.sellout_agent;
        }

        public final String getSellout_agent_alias() {
            return this.sellout_agent_alias;
        }

        public final OrderTypeDto getOrder_type() {
            return this.order_type;
        }

        public final OrderTriggerDto getOrder_trigger() {
            return this.order_trigger;
        }

        public final TimeInForceDto getOrder_time_in_force() {
            return this.order_time_in_force;
        }

        public final IdlDecimal getStop_price() {
            return this.stop_price;
        }

        public final IdlDecimal getLimit_price() {
            return this.limit_price;
        }
    }

    /* compiled from: CreatePositionSelloutRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CreatePositionSelloutRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/CreatePositionSelloutRequestDto;", "Lcom/robinhood/ceres/v1/CreatePositionSelloutRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/CreatePositionSelloutRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CreatePositionSelloutRequestDto, CreatePositionSelloutRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CreatePositionSelloutRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CreatePositionSelloutRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CreatePositionSelloutRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) CreatePositionSelloutRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CreatePositionSelloutRequest> getProtoAdapter() {
            return CreatePositionSelloutRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CreatePositionSelloutRequestDto getZeroValue() {
            return CreatePositionSelloutRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CreatePositionSelloutRequestDto fromProto(CreatePositionSelloutRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String account_id = proto.getAccount_id();
            SelloutReasonDto selloutReasonDtoFromProto = SelloutReasonDto.INSTANCE.fromProto(proto.getSellout_reason());
            String contract_id = proto.getContract_id();
            SelloutTypeDto selloutTypeDtoFromProto = SelloutTypeDto.INSTANCE.fromProto(proto.getSellout_type());
            String quantity = proto.getQuantity();
            DefaultConstructorMarker defaultConstructorMarker = null;
            IdlDecimal idlDecimal = quantity != null ? new IdlDecimal(quantity) : null;
            String total_balance = proto.getTotal_balance();
            IdlDecimal idlDecimal2 = total_balance != null ? new IdlDecimal(total_balance) : null;
            String notes = proto.getNotes();
            AgentDto agentDtoFromProto = AgentDto.INSTANCE.fromProto(proto.getSellout_agent());
            String sellout_agent_alias = proto.getSellout_agent_alias();
            OrderTypeDto orderTypeDtoFromProto = OrderTypeDto.INSTANCE.fromProto(proto.getOrder_type());
            OrderTriggerDto orderTriggerDtoFromProto = OrderTriggerDto.INSTANCE.fromProto(proto.getOrder_trigger());
            TimeInForceDto timeInForceDtoFromProto = TimeInForceDto.INSTANCE.fromProto(proto.getOrder_time_in_force());
            String stop_price = proto.getStop_price();
            IdlDecimal idlDecimal3 = stop_price != null ? new IdlDecimal(stop_price) : null;
            String limit_price = proto.getLimit_price();
            return new CreatePositionSelloutRequestDto(new Surrogate(account_id, selloutReasonDtoFromProto, contract_id, selloutTypeDtoFromProto, idlDecimal, idlDecimal2, notes, agentDtoFromProto, sellout_agent_alias, orderTypeDtoFromProto, orderTriggerDtoFromProto, timeInForceDtoFromProto, idlDecimal3, limit_price != null ? new IdlDecimal(limit_price) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.CreatePositionSelloutRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreatePositionSelloutRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CreatePositionSelloutRequestDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CreatePositionSelloutRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CreatePositionSelloutRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/CreatePositionSelloutRequestDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/CreatePositionSelloutRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CreatePositionSelloutRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.service.CreatePositionSelloutRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CreatePositionSelloutRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CreatePositionSelloutRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CreatePositionSelloutRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CreatePositionSelloutRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CreatePositionSelloutRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.CreatePositionSelloutRequestDto";
        }
    }
}
