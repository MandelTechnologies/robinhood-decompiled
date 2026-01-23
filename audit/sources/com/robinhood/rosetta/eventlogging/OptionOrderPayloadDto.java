package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import rosetta.option.Direction;
import rosetta.option.DirectionDto;
import rosetta.option.OptionOrderFormSource;
import rosetta.option.OptionOrderFormSourceDto;
import rosetta.order.OrderType;
import rosetta.order.OrderTypeDto;
import rosetta.order.TimeInForce;
import rosetta.order.TimeInForceDto;
import rosetta.order.Trigger;
import rosetta.order.TriggerDto;

/* compiled from: OptionOrderPayloadDto.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 F2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004EFGHB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B©\u0001\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\t\u0012\b\b\u0002\u0010\u001d\u001a\u00020\t\u0012\b\b\u0002\u0010\u001e\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u001fJ¦\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\tJ\b\u00108\u001a\u00020\u0002H\u0016J\b\u00109\u001a\u00020\tH\u0016J\u0013\u0010:\u001a\u00020\u00182\b\u0010;\u001a\u0004\u0018\u00010<H\u0096\u0002J\b\u0010=\u001a\u00020>H\u0016J\u0018\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020>H\u0016J\b\u0010D\u001a\u00020>H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\"\u0010!R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b$\u0010!R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b%\u0010!R\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b&\u0010!R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u0010\u0019\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b1\u00100R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u0010\u001c\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b4\u0010!R\u0011\u0010\u001d\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b5\u0010!R\u0011\u0010\u001e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b6\u0010!¨\u0006I"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionOrderPayloadDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/OptionOrderPayload;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/OptionOrderPayloadDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/OptionOrderPayloadDto$Surrogate;)V", "ref_id", "", "account", "legs_str", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "stop_price", "quantity", "time_in_force", "Lrosetta/order/TimeInForceDto;", "trigger", "Lrosetta/order/TriggerDto;", "type", "Lrosetta/order/OrderTypeDto;", "direction", "Lrosetta/option/DirectionDto;", "override_day_trade_checks", "", "override_dtbp_checks", "form_source", "Lrosetta/option/OptionOrderFormSourceDto;", "client_bid_at_submission", "client_ask_at_submission", "trading_session", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/order/TimeInForceDto;Lrosetta/order/TriggerDto;Lrosetta/order/OrderTypeDto;Lrosetta/option/DirectionDto;ZZLrosetta/option/OptionOrderFormSourceDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRef_id", "()Ljava/lang/String;", "getAccount", "getLegs_str", "getPrice", "getStop_price", "getQuantity", "getTime_in_force", "()Lrosetta/order/TimeInForceDto;", "getTrigger", "()Lrosetta/order/TriggerDto;", "getType", "()Lrosetta/order/OrderTypeDto;", "getDirection", "()Lrosetta/option/DirectionDto;", "getOverride_day_trade_checks", "()Z", "getOverride_dtbp_checks", "getForm_source", "()Lrosetta/option/OptionOrderFormSourceDto;", "getClient_bid_at_submission", "getClient_ask_at_submission", "getTrading_session", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class OptionOrderPayloadDto implements Dto3<OptionOrderPayload>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<OptionOrderPayloadDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OptionOrderPayloadDto, OptionOrderPayload>> binaryBase64Serializer$delegate;
    private static final OptionOrderPayloadDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ OptionOrderPayloadDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OptionOrderPayloadDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getRef_id() {
        return this.surrogate.getRef_id();
    }

    public final String getAccount() {
        return this.surrogate.getAccount();
    }

    public final String getLegs_str() {
        return this.surrogate.getLegs_str();
    }

    public final String getPrice() {
        return this.surrogate.getPrice();
    }

    public final String getStop_price() {
        return this.surrogate.getStop_price();
    }

    public final String getQuantity() {
        return this.surrogate.getQuantity();
    }

    public final TimeInForceDto getTime_in_force() {
        return this.surrogate.getTime_in_force();
    }

    public final TriggerDto getTrigger() {
        return this.surrogate.getTrigger();
    }

    public final OrderTypeDto getType() {
        return this.surrogate.getType();
    }

    public final DirectionDto getDirection() {
        return this.surrogate.getDirection();
    }

    public final boolean getOverride_day_trade_checks() {
        return this.surrogate.getOverride_day_trade_checks();
    }

    public final boolean getOverride_dtbp_checks() {
        return this.surrogate.getOverride_dtbp_checks();
    }

    public final OptionOrderFormSourceDto getForm_source() {
        return this.surrogate.getForm_source();
    }

    public final String getClient_bid_at_submission() {
        return this.surrogate.getClient_bid_at_submission();
    }

    public final String getClient_ask_at_submission() {
        return this.surrogate.getClient_ask_at_submission();
    }

    public final String getTrading_session() {
        return this.surrogate.getTrading_session();
    }

    public /* synthetic */ OptionOrderPayloadDto(String str, String str2, String str3, String str4, String str5, String str6, TimeInForceDto timeInForceDto, TriggerDto triggerDto, OrderTypeDto orderTypeDto, DirectionDto directionDto, boolean z, boolean z2, OptionOrderFormSourceDto optionOrderFormSourceDto, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? TimeInForceDto.INSTANCE.getZeroValue() : timeInForceDto, (i & 128) != 0 ? TriggerDto.INSTANCE.getZeroValue() : triggerDto, (i & 256) != 0 ? OrderTypeDto.INSTANCE.getZeroValue() : orderTypeDto, (i & 512) != 0 ? DirectionDto.INSTANCE.getZeroValue() : directionDto, (i & 1024) != 0 ? false : z, (i & 2048) == 0 ? z2 : false, (i & 4096) != 0 ? OptionOrderFormSourceDto.INSTANCE.getZeroValue() : optionOrderFormSourceDto, (i & 8192) != 0 ? "" : str7, (i & 16384) != 0 ? "" : str8, (i & 32768) != 0 ? "" : str9);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OptionOrderPayloadDto(String ref_id, String account, String legs_str, String price, String stop_price, String quantity, TimeInForceDto time_in_force, TriggerDto trigger, OrderTypeDto type2, DirectionDto direction, boolean z, boolean z2, OptionOrderFormSourceDto form_source, String client_bid_at_submission, String client_ask_at_submission, String trading_session) {
        this(new Surrogate(ref_id, account, legs_str, price, stop_price, quantity, time_in_force, trigger, type2, direction, z, z2, form_source, client_bid_at_submission, client_ask_at_submission, trading_session));
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(legs_str, "legs_str");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(stop_price, "stop_price");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(form_source, "form_source");
        Intrinsics.checkNotNullParameter(client_bid_at_submission, "client_bid_at_submission");
        Intrinsics.checkNotNullParameter(client_ask_at_submission, "client_ask_at_submission");
        Intrinsics.checkNotNullParameter(trading_session, "trading_session");
    }

    public final OptionOrderPayloadDto copy(String ref_id, String account, String legs_str, String price, String stop_price, String quantity, TimeInForceDto time_in_force, TriggerDto trigger, OrderTypeDto type2, DirectionDto direction, boolean override_day_trade_checks, boolean override_dtbp_checks, OptionOrderFormSourceDto form_source, String client_bid_at_submission, String client_ask_at_submission, String trading_session) {
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(legs_str, "legs_str");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(stop_price, "stop_price");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(form_source, "form_source");
        Intrinsics.checkNotNullParameter(client_bid_at_submission, "client_bid_at_submission");
        Intrinsics.checkNotNullParameter(client_ask_at_submission, "client_ask_at_submission");
        Intrinsics.checkNotNullParameter(trading_session, "trading_session");
        return new OptionOrderPayloadDto(new Surrogate(ref_id, account, legs_str, price, stop_price, quantity, time_in_force, trigger, type2, direction, override_day_trade_checks, override_dtbp_checks, form_source, client_bid_at_submission, client_ask_at_submission, trading_session));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public OptionOrderPayload toProto() {
        return new OptionOrderPayload(this.surrogate.getRef_id(), this.surrogate.getAccount(), this.surrogate.getLegs_str(), this.surrogate.getPrice(), this.surrogate.getStop_price(), this.surrogate.getQuantity(), (TimeInForce) this.surrogate.getTime_in_force().toProto(), (Trigger) this.surrogate.getTrigger().toProto(), (OrderType) this.surrogate.getType().toProto(), (Direction) this.surrogate.getDirection().toProto(), this.surrogate.getOverride_day_trade_checks(), this.surrogate.getOverride_dtbp_checks(), (OptionOrderFormSource) this.surrogate.getForm_source().toProto(), this.surrogate.getClient_bid_at_submission(), this.surrogate.getClient_ask_at_submission(), this.surrogate.getTrading_session(), null, 65536, null);
    }

    public String toString() {
        return "[OptionOrderPayloadDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof OptionOrderPayloadDto) && Intrinsics.areEqual(((OptionOrderPayloadDto) other).surrogate, this.surrogate);
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
    /* compiled from: OptionOrderPayloadDto.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b?\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 f2\u00020\u0001:\u0002efB§\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u001aB·\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u0019\u0010\u001fJ\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\nHÆ\u0003J\t\u0010O\u001a\u00020\fHÆ\u0003J\t\u0010P\u001a\u00020\u000eHÆ\u0003J\t\u0010Q\u001a\u00020\u0010HÆ\u0003J\t\u0010R\u001a\u00020\u0012HÆ\u0003J\t\u0010S\u001a\u00020\u0012HÆ\u0003J\t\u0010T\u001a\u00020\u0015HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J©\u0001\u0010X\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0003HÆ\u0001J\u0013\u0010Y\u001a\u00020\u00122\b\u0010Z\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010[\u001a\u00020\u001cHÖ\u0001J\t\u0010\\\u001a\u00020\u0003HÖ\u0001J%\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020\u00002\u0006\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020cH\u0001¢\u0006\u0002\bdR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010!\u001a\u0004\b'\u0010#R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010!\u001a\u0004\b)\u0010#R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010!\u001a\u0004\b+\u0010#R\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010!\u001a\u0004\b-\u0010#R\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010!\u001a\u0004\b/\u00100R\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010!\u001a\u0004\b2\u00103R\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010!\u001a\u0004\b5\u00106R\u001c\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b7\u0010!\u001a\u0004\b8\u00109R\u001c\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u0010!\u001a\u0004\b;\u0010<R\u001c\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b=\u0010!\u001a\u0004\b>\u0010<R\u001c\u0010\u0014\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b?\u0010!\u001a\u0004\b@\u0010AR\u001c\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bB\u0010!\u001a\u0004\bC\u0010#R\u001c\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bD\u0010!\u001a\u0004\bE\u0010#R\u001c\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bF\u0010!\u001a\u0004\bG\u0010#¨\u0006g"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionOrderPayloadDto$Surrogate;", "", "ref_id", "", "account", "legs_str", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "stop_price", "quantity", "time_in_force", "Lrosetta/order/TimeInForceDto;", "trigger", "Lrosetta/order/TriggerDto;", "type", "Lrosetta/order/OrderTypeDto;", "direction", "Lrosetta/option/DirectionDto;", "override_day_trade_checks", "", "override_dtbp_checks", "form_source", "Lrosetta/option/OptionOrderFormSourceDto;", "client_bid_at_submission", "client_ask_at_submission", "trading_session", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/order/TimeInForceDto;Lrosetta/order/TriggerDto;Lrosetta/order/OrderTypeDto;Lrosetta/option/DirectionDto;ZZLrosetta/option/OptionOrderFormSourceDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/order/TimeInForceDto;Lrosetta/order/TriggerDto;Lrosetta/order/OrderTypeDto;Lrosetta/option/DirectionDto;ZZLrosetta/option/OptionOrderFormSourceDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getRef_id$annotations", "()V", "getRef_id", "()Ljava/lang/String;", "getAccount$annotations", "getAccount", "getLegs_str$annotations", "getLegs_str", "getPrice$annotations", "getPrice", "getStop_price$annotations", "getStop_price", "getQuantity$annotations", "getQuantity", "getTime_in_force$annotations", "getTime_in_force", "()Lrosetta/order/TimeInForceDto;", "getTrigger$annotations", "getTrigger", "()Lrosetta/order/TriggerDto;", "getType$annotations", "getType", "()Lrosetta/order/OrderTypeDto;", "getDirection$annotations", "getDirection", "()Lrosetta/option/DirectionDto;", "getOverride_day_trade_checks$annotations", "getOverride_day_trade_checks", "()Z", "getOverride_dtbp_checks$annotations", "getOverride_dtbp_checks", "getForm_source$annotations", "getForm_source", "()Lrosetta/option/OptionOrderFormSourceDto;", "getClient_bid_at_submission$annotations", "getClient_bid_at_submission", "getClient_ask_at_submission$annotations", "getClient_ask_at_submission", "getTrading_session$annotations", "getTrading_session", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account;
        private final String client_ask_at_submission;
        private final String client_bid_at_submission;
        private final DirectionDto direction;
        private final OptionOrderFormSourceDto form_source;
        private final String legs_str;
        private final boolean override_day_trade_checks;
        private final boolean override_dtbp_checks;
        private final String price;
        private final String quantity;
        private final String ref_id;
        private final String stop_price;
        private final TimeInForceDto time_in_force;
        private final String trading_session;
        private final TriggerDto trigger;
        private final OrderTypeDto type;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TimeInForceDto) null, (TriggerDto) null, (OrderTypeDto) null, (DirectionDto) null, false, false, (OptionOrderFormSourceDto) null, (String) null, (String) null, (String) null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, (DefaultConstructorMarker) null);
        }

        @SerialName("account")
        @JsonAnnotations2(names = {"account"})
        public static /* synthetic */ void getAccount$annotations() {
        }

        @SerialName("clientAskAtSubmission")
        @JsonAnnotations2(names = {"client_ask_at_submission"})
        public static /* synthetic */ void getClient_ask_at_submission$annotations() {
        }

        @SerialName("clientBidAtSubmission")
        @JsonAnnotations2(names = {"client_bid_at_submission"})
        public static /* synthetic */ void getClient_bid_at_submission$annotations() {
        }

        @SerialName("direction")
        @JsonAnnotations2(names = {"direction"})
        public static /* synthetic */ void getDirection$annotations() {
        }

        @SerialName("formSource")
        @JsonAnnotations2(names = {"form_source"})
        public static /* synthetic */ void getForm_source$annotations() {
        }

        @SerialName("legsStr")
        @JsonAnnotations2(names = {"legs_str"})
        public static /* synthetic */ void getLegs_str$annotations() {
        }

        @SerialName("overrideDayTradeChecks")
        @JsonAnnotations2(names = {"override_day_trade_checks"})
        public static /* synthetic */ void getOverride_day_trade_checks$annotations() {
        }

        @SerialName("overrideDtbpChecks")
        @JsonAnnotations2(names = {"override_dtbp_checks"})
        public static /* synthetic */ void getOverride_dtbp_checks$annotations() {
        }

        @SerialName(AnalyticsStrings.TAG_SORT_ORDER_PRICE)
        @JsonAnnotations2(names = {AnalyticsStrings.TAG_SORT_ORDER_PRICE})
        public static /* synthetic */ void getPrice$annotations() {
        }

        @SerialName("quantity")
        @JsonAnnotations2(names = {"quantity"})
        public static /* synthetic */ void getQuantity$annotations() {
        }

        @SerialName("refId")
        @JsonAnnotations2(names = {"ref_id"})
        public static /* synthetic */ void getRef_id$annotations() {
        }

        @SerialName("stopPrice")
        @JsonAnnotations2(names = {"stop_price"})
        public static /* synthetic */ void getStop_price$annotations() {
        }

        @SerialName("timeInForce")
        @JsonAnnotations2(names = {"time_in_force"})
        public static /* synthetic */ void getTime_in_force$annotations() {
        }

        @SerialName("tradingSession")
        @JsonAnnotations2(names = {"trading_session"})
        public static /* synthetic */ void getTrading_session$annotations() {
        }

        @SerialName("trigger")
        @JsonAnnotations2(names = {"trigger"})
        public static /* synthetic */ void getTrigger$annotations() {
        }

        @SerialName("type")
        @JsonAnnotations2(names = {"type"})
        public static /* synthetic */ void getType$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getRef_id() {
            return this.ref_id;
        }

        /* renamed from: component10, reason: from getter */
        public final DirectionDto getDirection() {
            return this.direction;
        }

        /* renamed from: component11, reason: from getter */
        public final boolean getOverride_day_trade_checks() {
            return this.override_day_trade_checks;
        }

        /* renamed from: component12, reason: from getter */
        public final boolean getOverride_dtbp_checks() {
            return this.override_dtbp_checks;
        }

        /* renamed from: component13, reason: from getter */
        public final OptionOrderFormSourceDto getForm_source() {
            return this.form_source;
        }

        /* renamed from: component14, reason: from getter */
        public final String getClient_bid_at_submission() {
            return this.client_bid_at_submission;
        }

        /* renamed from: component15, reason: from getter */
        public final String getClient_ask_at_submission() {
            return this.client_ask_at_submission;
        }

        /* renamed from: component16, reason: from getter */
        public final String getTrading_session() {
            return this.trading_session;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccount() {
            return this.account;
        }

        /* renamed from: component3, reason: from getter */
        public final String getLegs_str() {
            return this.legs_str;
        }

        /* renamed from: component4, reason: from getter */
        public final String getPrice() {
            return this.price;
        }

        /* renamed from: component5, reason: from getter */
        public final String getStop_price() {
            return this.stop_price;
        }

        /* renamed from: component6, reason: from getter */
        public final String getQuantity() {
            return this.quantity;
        }

        /* renamed from: component7, reason: from getter */
        public final TimeInForceDto getTime_in_force() {
            return this.time_in_force;
        }

        /* renamed from: component8, reason: from getter */
        public final TriggerDto getTrigger() {
            return this.trigger;
        }

        /* renamed from: component9, reason: from getter */
        public final OrderTypeDto getType() {
            return this.type;
        }

        public final Surrogate copy(String ref_id, String account, String legs_str, String price, String stop_price, String quantity, TimeInForceDto time_in_force, TriggerDto trigger, OrderTypeDto type2, DirectionDto direction, boolean override_day_trade_checks, boolean override_dtbp_checks, OptionOrderFormSourceDto form_source, String client_bid_at_submission, String client_ask_at_submission, String trading_session) {
            Intrinsics.checkNotNullParameter(ref_id, "ref_id");
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(legs_str, "legs_str");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(stop_price, "stop_price");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
            Intrinsics.checkNotNullParameter(trigger, "trigger");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(form_source, "form_source");
            Intrinsics.checkNotNullParameter(client_bid_at_submission, "client_bid_at_submission");
            Intrinsics.checkNotNullParameter(client_ask_at_submission, "client_ask_at_submission");
            Intrinsics.checkNotNullParameter(trading_session, "trading_session");
            return new Surrogate(ref_id, account, legs_str, price, stop_price, quantity, time_in_force, trigger, type2, direction, override_day_trade_checks, override_dtbp_checks, form_source, client_bid_at_submission, client_ask_at_submission, trading_session);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.ref_id, surrogate.ref_id) && Intrinsics.areEqual(this.account, surrogate.account) && Intrinsics.areEqual(this.legs_str, surrogate.legs_str) && Intrinsics.areEqual(this.price, surrogate.price) && Intrinsics.areEqual(this.stop_price, surrogate.stop_price) && Intrinsics.areEqual(this.quantity, surrogate.quantity) && this.time_in_force == surrogate.time_in_force && this.trigger == surrogate.trigger && this.type == surrogate.type && this.direction == surrogate.direction && this.override_day_trade_checks == surrogate.override_day_trade_checks && this.override_dtbp_checks == surrogate.override_dtbp_checks && this.form_source == surrogate.form_source && Intrinsics.areEqual(this.client_bid_at_submission, surrogate.client_bid_at_submission) && Intrinsics.areEqual(this.client_ask_at_submission, surrogate.client_ask_at_submission) && Intrinsics.areEqual(this.trading_session, surrogate.trading_session);
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((this.ref_id.hashCode() * 31) + this.account.hashCode()) * 31) + this.legs_str.hashCode()) * 31) + this.price.hashCode()) * 31) + this.stop_price.hashCode()) * 31) + this.quantity.hashCode()) * 31) + this.time_in_force.hashCode()) * 31) + this.trigger.hashCode()) * 31) + this.type.hashCode()) * 31) + this.direction.hashCode()) * 31) + java.lang.Boolean.hashCode(this.override_day_trade_checks)) * 31) + java.lang.Boolean.hashCode(this.override_dtbp_checks)) * 31) + this.form_source.hashCode()) * 31) + this.client_bid_at_submission.hashCode()) * 31) + this.client_ask_at_submission.hashCode()) * 31) + this.trading_session.hashCode();
        }

        public String toString() {
            return "Surrogate(ref_id=" + this.ref_id + ", account=" + this.account + ", legs_str=" + this.legs_str + ", price=" + this.price + ", stop_price=" + this.stop_price + ", quantity=" + this.quantity + ", time_in_force=" + this.time_in_force + ", trigger=" + this.trigger + ", type=" + this.type + ", direction=" + this.direction + ", override_day_trade_checks=" + this.override_day_trade_checks + ", override_dtbp_checks=" + this.override_dtbp_checks + ", form_source=" + this.form_source + ", client_bid_at_submission=" + this.client_bid_at_submission + ", client_ask_at_submission=" + this.client_ask_at_submission + ", trading_session=" + this.trading_session + ")";
        }

        /* compiled from: OptionOrderPayloadDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionOrderPayloadDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/OptionOrderPayloadDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return OptionOrderPayloadDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, String str5, String str6, TimeInForceDto timeInForceDto, TriggerDto triggerDto, OrderTypeDto orderTypeDto, DirectionDto directionDto, boolean z, boolean z2, OptionOrderFormSourceDto optionOrderFormSourceDto, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.ref_id = "";
            } else {
                this.ref_id = str;
            }
            if ((i & 2) == 0) {
                this.account = "";
            } else {
                this.account = str2;
            }
            if ((i & 4) == 0) {
                this.legs_str = "";
            } else {
                this.legs_str = str3;
            }
            if ((i & 8) == 0) {
                this.price = "";
            } else {
                this.price = str4;
            }
            if ((i & 16) == 0) {
                this.stop_price = "";
            } else {
                this.stop_price = str5;
            }
            if ((i & 32) == 0) {
                this.quantity = "";
            } else {
                this.quantity = str6;
            }
            if ((i & 64) == 0) {
                this.time_in_force = TimeInForceDto.INSTANCE.getZeroValue();
            } else {
                this.time_in_force = timeInForceDto;
            }
            if ((i & 128) == 0) {
                this.trigger = TriggerDto.INSTANCE.getZeroValue();
            } else {
                this.trigger = triggerDto;
            }
            if ((i & 256) == 0) {
                this.type = OrderTypeDto.INSTANCE.getZeroValue();
            } else {
                this.type = orderTypeDto;
            }
            if ((i & 512) == 0) {
                this.direction = DirectionDto.INSTANCE.getZeroValue();
            } else {
                this.direction = directionDto;
            }
            if ((i & 1024) == 0) {
                this.override_day_trade_checks = false;
            } else {
                this.override_day_trade_checks = z;
            }
            if ((i & 2048) == 0) {
                this.override_dtbp_checks = false;
            } else {
                this.override_dtbp_checks = z2;
            }
            this.form_source = (i & 4096) == 0 ? OptionOrderFormSourceDto.INSTANCE.getZeroValue() : optionOrderFormSourceDto;
            if ((i & 8192) == 0) {
                this.client_bid_at_submission = "";
            } else {
                this.client_bid_at_submission = str7;
            }
            if ((i & 16384) == 0) {
                this.client_ask_at_submission = "";
            } else {
                this.client_ask_at_submission = str8;
            }
            if ((i & 32768) == 0) {
                this.trading_session = "";
            } else {
                this.trading_session = str9;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.ref_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.ref_id);
            }
            if (!Intrinsics.areEqual(self.account, "")) {
                output.encodeStringElement(serialDesc, 1, self.account);
            }
            if (!Intrinsics.areEqual(self.legs_str, "")) {
                output.encodeStringElement(serialDesc, 2, self.legs_str);
            }
            if (!Intrinsics.areEqual(self.price, "")) {
                output.encodeStringElement(serialDesc, 3, self.price);
            }
            if (!Intrinsics.areEqual(self.stop_price, "")) {
                output.encodeStringElement(serialDesc, 4, self.stop_price);
            }
            if (!Intrinsics.areEqual(self.quantity, "")) {
                output.encodeStringElement(serialDesc, 5, self.quantity);
            }
            if (self.time_in_force != TimeInForceDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, TimeInForceDto.Serializer.INSTANCE, self.time_in_force);
            }
            if (self.trigger != TriggerDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 7, TriggerDto.Serializer.INSTANCE, self.trigger);
            }
            if (self.type != OrderTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 8, OrderTypeDto.Serializer.INSTANCE, self.type);
            }
            if (self.direction != DirectionDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 9, DirectionDto.Serializer.INSTANCE, self.direction);
            }
            boolean z = self.override_day_trade_checks;
            if (z) {
                output.encodeBooleanElement(serialDesc, 10, z);
            }
            boolean z2 = self.override_dtbp_checks;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 11, z2);
            }
            if (self.form_source != OptionOrderFormSourceDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 12, OptionOrderFormSourceDto.Serializer.INSTANCE, self.form_source);
            }
            if (!Intrinsics.areEqual(self.client_bid_at_submission, "")) {
                output.encodeStringElement(serialDesc, 13, self.client_bid_at_submission);
            }
            if (!Intrinsics.areEqual(self.client_ask_at_submission, "")) {
                output.encodeStringElement(serialDesc, 14, self.client_ask_at_submission);
            }
            if (Intrinsics.areEqual(self.trading_session, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 15, self.trading_session);
        }

        public Surrogate(String ref_id, String account, String legs_str, String price, String stop_price, String quantity, TimeInForceDto time_in_force, TriggerDto trigger, OrderTypeDto type2, DirectionDto direction, boolean z, boolean z2, OptionOrderFormSourceDto form_source, String client_bid_at_submission, String client_ask_at_submission, String trading_session) {
            Intrinsics.checkNotNullParameter(ref_id, "ref_id");
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(legs_str, "legs_str");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(stop_price, "stop_price");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
            Intrinsics.checkNotNullParameter(trigger, "trigger");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(form_source, "form_source");
            Intrinsics.checkNotNullParameter(client_bid_at_submission, "client_bid_at_submission");
            Intrinsics.checkNotNullParameter(client_ask_at_submission, "client_ask_at_submission");
            Intrinsics.checkNotNullParameter(trading_session, "trading_session");
            this.ref_id = ref_id;
            this.account = account;
            this.legs_str = legs_str;
            this.price = price;
            this.stop_price = stop_price;
            this.quantity = quantity;
            this.time_in_force = time_in_force;
            this.trigger = trigger;
            this.type = type2;
            this.direction = direction;
            this.override_day_trade_checks = z;
            this.override_dtbp_checks = z2;
            this.form_source = form_source;
            this.client_bid_at_submission = client_bid_at_submission;
            this.client_ask_at_submission = client_ask_at_submission;
            this.trading_session = trading_session;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, String str6, TimeInForceDto timeInForceDto, TriggerDto triggerDto, OrderTypeDto orderTypeDto, DirectionDto directionDto, boolean z, boolean z2, OptionOrderFormSourceDto optionOrderFormSourceDto, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? TimeInForceDto.INSTANCE.getZeroValue() : timeInForceDto, (i & 128) != 0 ? TriggerDto.INSTANCE.getZeroValue() : triggerDto, (i & 256) != 0 ? OrderTypeDto.INSTANCE.getZeroValue() : orderTypeDto, (i & 512) != 0 ? DirectionDto.INSTANCE.getZeroValue() : directionDto, (i & 1024) != 0 ? false : z, (i & 2048) == 0 ? z2 : false, (i & 4096) != 0 ? OptionOrderFormSourceDto.INSTANCE.getZeroValue() : optionOrderFormSourceDto, (i & 8192) != 0 ? "" : str7, (i & 16384) != 0 ? "" : str8, (i & 32768) != 0 ? "" : str9);
        }

        public final String getRef_id() {
            return this.ref_id;
        }

        public final String getAccount() {
            return this.account;
        }

        public final String getLegs_str() {
            return this.legs_str;
        }

        public final String getPrice() {
            return this.price;
        }

        public final String getStop_price() {
            return this.stop_price;
        }

        public final String getQuantity() {
            return this.quantity;
        }

        public final TimeInForceDto getTime_in_force() {
            return this.time_in_force;
        }

        public final TriggerDto getTrigger() {
            return this.trigger;
        }

        public final OrderTypeDto getType() {
            return this.type;
        }

        public final DirectionDto getDirection() {
            return this.direction;
        }

        public final boolean getOverride_day_trade_checks() {
            return this.override_day_trade_checks;
        }

        public final boolean getOverride_dtbp_checks() {
            return this.override_dtbp_checks;
        }

        public final OptionOrderFormSourceDto getForm_source() {
            return this.form_source;
        }

        public final String getClient_bid_at_submission() {
            return this.client_bid_at_submission;
        }

        public final String getClient_ask_at_submission() {
            return this.client_ask_at_submission;
        }

        public final String getTrading_session() {
            return this.trading_session;
        }
    }

    /* compiled from: OptionOrderPayloadDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionOrderPayloadDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/OptionOrderPayloadDto;", "Lcom/robinhood/rosetta/eventlogging/OptionOrderPayload;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/OptionOrderPayloadDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<OptionOrderPayloadDto, OptionOrderPayload> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OptionOrderPayloadDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OptionOrderPayloadDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OptionOrderPayloadDto> getBinaryBase64Serializer() {
            return (KSerializer) OptionOrderPayloadDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OptionOrderPayload> getProtoAdapter() {
            return OptionOrderPayload.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OptionOrderPayloadDto getZeroValue() {
            return OptionOrderPayloadDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OptionOrderPayloadDto fromProto(OptionOrderPayload proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new OptionOrderPayloadDto(new Surrogate(proto.getRef_id(), proto.getAccount(), proto.getLegs_str(), proto.getPrice(), proto.getStop_price(), proto.getQuantity(), TimeInForceDto.INSTANCE.fromProto(proto.getTime_in_force()), TriggerDto.INSTANCE.fromProto(proto.getTrigger()), OrderTypeDto.INSTANCE.fromProto(proto.getType()), DirectionDto.INSTANCE.fromProto(proto.getDirection()), proto.getOverride_day_trade_checks(), proto.getOverride_dtbp_checks(), OptionOrderFormSourceDto.INSTANCE.fromProto(proto.getForm_source()), proto.getClient_bid_at_submission(), proto.getClient_ask_at_submission(), proto.getTrading_session()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.OptionOrderPayloadDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionOrderPayloadDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new OptionOrderPayloadDto(null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: OptionOrderPayloadDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionOrderPayloadDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/OptionOrderPayloadDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/OptionOrderPayloadDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<OptionOrderPayloadDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.OptionOrderPayload", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OptionOrderPayloadDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public OptionOrderPayloadDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new OptionOrderPayloadDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: OptionOrderPayloadDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionOrderPayloadDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.OptionOrderPayloadDto";
        }
    }
}
