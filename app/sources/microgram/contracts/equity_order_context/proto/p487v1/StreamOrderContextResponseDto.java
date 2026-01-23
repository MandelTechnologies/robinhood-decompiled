package microgram.contracts.equity_order_context.proto.p487v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import microgram.contracts.equity_order_context.proto.p487v1.OrderSideDto;
import microgram.contracts.equity_order_context.proto.p487v1.OrderTriggerDto;
import microgram.contracts.equity_order_context.proto.p487v1.OrderTypeDto;
import microgram.contracts.equity_order_context.proto.p487v1.TrailingPegDto;

/* compiled from: StreamOrderContextResponseDto.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004.-/0B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bs\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0006\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\"H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\"H\u0016¢\u0006\u0004\b+\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,¨\u00061"}, m3636d2 = {"Lmicrogram/contracts/equity_order_context/proto/v1/StreamOrderContextResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/equity_order_context/proto/v1/StreamOrderContextResponse;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/equity_order_context/proto/v1/StreamOrderContextResponseDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/equity_order_context/proto/v1/StreamOrderContextResponseDto$Surrogate;)V", "", "ref_id", "rhs_account_number", "instrument_id", "Lmicrogram/contracts/equity_order_context/proto/v1/OrderTypeDto;", "order_type", "Lmicrogram/contracts/equity_order_context/proto/v1/OrderSideDto;", "order_side", "Lmicrogram/contracts/equity_order_context/proto/v1/OrderTriggerDto;", "order_trigger", "Lmicrogram/contracts/equity_order_context/proto/v1/TrailingPegDto;", "trailing_peg", "", "is_preset_percent_limit", "Lcom/robinhood/rosetta/common/MoneyDto;", "limit_price", "stop_price", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmicrogram/contracts/equity_order_context/proto/v1/OrderTypeDto;Lmicrogram/contracts/equity_order_context/proto/v1/OrderSideDto;Lmicrogram/contracts/equity_order_context/proto/v1/OrderTriggerDto;Lmicrogram/contracts/equity_order_context/proto/v1/TrailingPegDto;ZLcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;)V", "toProto", "()Lmicrogram/contracts/equity_order_context/proto/v1/StreamOrderContextResponse;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/equity_order_context/proto/v1/StreamOrderContextResponseDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "equity_order_context.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class StreamOrderContextResponseDto implements Dto3<StreamOrderContextResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<StreamOrderContextResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<StreamOrderContextResponseDto, StreamOrderContextResponse>> binaryBase64Serializer$delegate;
    private static final StreamOrderContextResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ StreamOrderContextResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private StreamOrderContextResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ StreamOrderContextResponseDto(String str, String str2, String str3, OrderTypeDto orderTypeDto, OrderSideDto orderSideDto, OrderTriggerDto orderTriggerDto, TrailingPegDto trailingPegDto, boolean z, MoneyDto moneyDto, MoneyDto moneyDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? OrderTypeDto.INSTANCE.getZeroValue() : orderTypeDto, (i & 16) != 0 ? OrderSideDto.INSTANCE.getZeroValue() : orderSideDto, (i & 32) != 0 ? OrderTriggerDto.INSTANCE.getZeroValue() : orderTriggerDto, (i & 64) != 0 ? null : trailingPegDto, (i & 128) != 0 ? false : z, (i & 256) != 0 ? null : moneyDto, (i & 512) != 0 ? null : moneyDto2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StreamOrderContextResponseDto(String ref_id, String rhs_account_number, String instrument_id, OrderTypeDto order_type, OrderSideDto order_side, OrderTriggerDto order_trigger, TrailingPegDto trailingPegDto, boolean z, MoneyDto moneyDto, MoneyDto moneyDto2) {
        this(new Surrogate(ref_id, rhs_account_number, instrument_id, order_type, order_side, order_trigger, trailingPegDto, z, moneyDto, moneyDto2));
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(order_type, "order_type");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(order_trigger, "order_trigger");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public StreamOrderContextResponse toProto() {
        String ref_id = this.surrogate.getRef_id();
        String rhs_account_number = this.surrogate.getRhs_account_number();
        String instrument_id = this.surrogate.getInstrument_id();
        OrderType orderType = (OrderType) this.surrogate.getOrder_type().toProto();
        OrderSide orderSide = (OrderSide) this.surrogate.getOrder_side().toProto();
        OrderTrigger orderTrigger = (OrderTrigger) this.surrogate.getOrder_trigger().toProto();
        TrailingPegDto trailing_peg = this.surrogate.getTrailing_peg();
        TrailingPeg proto = trailing_peg != null ? trailing_peg.toProto() : null;
        boolean is_preset_percent_limit = this.surrogate.getIs_preset_percent_limit();
        MoneyDto limit_price = this.surrogate.getLimit_price();
        Money proto2 = limit_price != null ? limit_price.toProto() : null;
        MoneyDto stop_price = this.surrogate.getStop_price();
        return new StreamOrderContextResponse(ref_id, rhs_account_number, instrument_id, orderType, orderSide, orderTrigger, proto, is_preset_percent_limit, proto2, stop_price != null ? stop_price.toProto() : null, null, 1024, null);
    }

    public String toString() {
        return "[StreamOrderContextResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof StreamOrderContextResponseDto) && Intrinsics.areEqual(((StreamOrderContextResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: StreamOrderContextResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b.\b\u0083\b\u0018\u0000 K2\u00020\u0001:\u0002LKBq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014B}\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010$R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010*\u0012\u0004\b/\u0010-\u001a\u0004\b.\u0010$R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010*\u0012\u0004\b1\u0010-\u001a\u0004\b0\u0010$R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00102\u0012\u0004\b5\u0010-\u001a\u0004\b3\u00104R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00106\u0012\u0004\b9\u0010-\u001a\u0004\b7\u00108R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010:\u0012\u0004\b=\u0010-\u001a\u0004\b;\u0010<R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010>\u0012\u0004\bA\u0010-\u001a\u0004\b?\u0010@R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010B\u0012\u0004\bD\u0010-\u001a\u0004\b\u000f\u0010CR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010E\u0012\u0004\bH\u0010-\u001a\u0004\bF\u0010GR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010E\u0012\u0004\bJ\u0010-\u001a\u0004\bI\u0010G¨\u0006M"}, m3636d2 = {"Lmicrogram/contracts/equity_order_context/proto/v1/StreamOrderContextResponseDto$Surrogate;", "", "", "ref_id", "rhs_account_number", "instrument_id", "Lmicrogram/contracts/equity_order_context/proto/v1/OrderTypeDto;", "order_type", "Lmicrogram/contracts/equity_order_context/proto/v1/OrderSideDto;", "order_side", "Lmicrogram/contracts/equity_order_context/proto/v1/OrderTriggerDto;", "order_trigger", "Lmicrogram/contracts/equity_order_context/proto/v1/TrailingPegDto;", "trailing_peg", "", "is_preset_percent_limit", "Lcom/robinhood/rosetta/common/MoneyDto;", "limit_price", "stop_price", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmicrogram/contracts/equity_order_context/proto/v1/OrderTypeDto;Lmicrogram/contracts/equity_order_context/proto/v1/OrderSideDto;Lmicrogram/contracts/equity_order_context/proto/v1/OrderTriggerDto;Lmicrogram/contracts/equity_order_context/proto/v1/TrailingPegDto;ZLcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmicrogram/contracts/equity_order_context/proto/v1/OrderTypeDto;Lmicrogram/contracts/equity_order_context/proto/v1/OrderSideDto;Lmicrogram/contracts/equity_order_context/proto/v1/OrderTriggerDto;Lmicrogram/contracts/equity_order_context/proto/v1/TrailingPegDto;ZLcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$equity_order_context_proto_v1_externalRelease", "(Lmicrogram/contracts/equity_order_context/proto/v1/StreamOrderContextResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRef_id", "getRef_id$annotations", "()V", "getRhs_account_number", "getRhs_account_number$annotations", "getInstrument_id", "getInstrument_id$annotations", "Lmicrogram/contracts/equity_order_context/proto/v1/OrderTypeDto;", "getOrder_type", "()Lmicrogram/contracts/equity_order_context/proto/v1/OrderTypeDto;", "getOrder_type$annotations", "Lmicrogram/contracts/equity_order_context/proto/v1/OrderSideDto;", "getOrder_side", "()Lmicrogram/contracts/equity_order_context/proto/v1/OrderSideDto;", "getOrder_side$annotations", "Lmicrogram/contracts/equity_order_context/proto/v1/OrderTriggerDto;", "getOrder_trigger", "()Lmicrogram/contracts/equity_order_context/proto/v1/OrderTriggerDto;", "getOrder_trigger$annotations", "Lmicrogram/contracts/equity_order_context/proto/v1/TrailingPegDto;", "getTrailing_peg", "()Lmicrogram/contracts/equity_order_context/proto/v1/TrailingPegDto;", "getTrailing_peg$annotations", "Z", "()Z", "is_preset_percent_limit$annotations", "Lcom/robinhood/rosetta/common/MoneyDto;", "getLimit_price", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getLimit_price$annotations", "getStop_price", "getStop_price$annotations", "Companion", "$serializer", "equity_order_context.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String instrument_id;
        private final boolean is_preset_percent_limit;
        private final MoneyDto limit_price;
        private final OrderSideDto order_side;
        private final OrderTriggerDto order_trigger;
        private final OrderTypeDto order_type;
        private final String ref_id;
        private final String rhs_account_number;
        private final MoneyDto stop_price;
        private final TrailingPegDto trailing_peg;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (OrderTypeDto) null, (OrderSideDto) null, (OrderTriggerDto) null, (TrailingPegDto) null, false, (MoneyDto) null, (MoneyDto) null, 1023, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.ref_id, surrogate.ref_id) && Intrinsics.areEqual(this.rhs_account_number, surrogate.rhs_account_number) && Intrinsics.areEqual(this.instrument_id, surrogate.instrument_id) && this.order_type == surrogate.order_type && this.order_side == surrogate.order_side && this.order_trigger == surrogate.order_trigger && Intrinsics.areEqual(this.trailing_peg, surrogate.trailing_peg) && this.is_preset_percent_limit == surrogate.is_preset_percent_limit && Intrinsics.areEqual(this.limit_price, surrogate.limit_price) && Intrinsics.areEqual(this.stop_price, surrogate.stop_price);
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.ref_id.hashCode() * 31) + this.rhs_account_number.hashCode()) * 31) + this.instrument_id.hashCode()) * 31) + this.order_type.hashCode()) * 31) + this.order_side.hashCode()) * 31) + this.order_trigger.hashCode()) * 31;
            TrailingPegDto trailingPegDto = this.trailing_peg;
            int iHashCode2 = (((iHashCode + (trailingPegDto == null ? 0 : trailingPegDto.hashCode())) * 31) + Boolean.hashCode(this.is_preset_percent_limit)) * 31;
            MoneyDto moneyDto = this.limit_price;
            int iHashCode3 = (iHashCode2 + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            MoneyDto moneyDto2 = this.stop_price;
            return iHashCode3 + (moneyDto2 != null ? moneyDto2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(ref_id=" + this.ref_id + ", rhs_account_number=" + this.rhs_account_number + ", instrument_id=" + this.instrument_id + ", order_type=" + this.order_type + ", order_side=" + this.order_side + ", order_trigger=" + this.order_trigger + ", trailing_peg=" + this.trailing_peg + ", is_preset_percent_limit=" + this.is_preset_percent_limit + ", limit_price=" + this.limit_price + ", stop_price=" + this.stop_price + ")";
        }

        /* compiled from: StreamOrderContextResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/equity_order_context/proto/v1/StreamOrderContextResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/equity_order_context/proto/v1/StreamOrderContextResponseDto$Surrogate;", "equity_order_context.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return StreamOrderContextResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, OrderTypeDto orderTypeDto, OrderSideDto orderSideDto, OrderTriggerDto orderTriggerDto, TrailingPegDto trailingPegDto, boolean z, MoneyDto moneyDto, MoneyDto moneyDto2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.ref_id = "";
            } else {
                this.ref_id = str;
            }
            if ((i & 2) == 0) {
                this.rhs_account_number = "";
            } else {
                this.rhs_account_number = str2;
            }
            if ((i & 4) == 0) {
                this.instrument_id = "";
            } else {
                this.instrument_id = str3;
            }
            if ((i & 8) == 0) {
                this.order_type = OrderTypeDto.INSTANCE.getZeroValue();
            } else {
                this.order_type = orderTypeDto;
            }
            if ((i & 16) == 0) {
                this.order_side = OrderSideDto.INSTANCE.getZeroValue();
            } else {
                this.order_side = orderSideDto;
            }
            if ((i & 32) == 0) {
                this.order_trigger = OrderTriggerDto.INSTANCE.getZeroValue();
            } else {
                this.order_trigger = orderTriggerDto;
            }
            if ((i & 64) == 0) {
                this.trailing_peg = null;
            } else {
                this.trailing_peg = trailingPegDto;
            }
            if ((i & 128) == 0) {
                this.is_preset_percent_limit = false;
            } else {
                this.is_preset_percent_limit = z;
            }
            if ((i & 256) == 0) {
                this.limit_price = null;
            } else {
                this.limit_price = moneyDto;
            }
            if ((i & 512) == 0) {
                this.stop_price = null;
            } else {
                this.stop_price = moneyDto2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$equity_order_context_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.ref_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.ref_id);
            }
            if (!Intrinsics.areEqual(self.rhs_account_number, "")) {
                output.encodeStringElement(serialDesc, 1, self.rhs_account_number);
            }
            if (!Intrinsics.areEqual(self.instrument_id, "")) {
                output.encodeStringElement(serialDesc, 2, self.instrument_id);
            }
            if (self.order_type != OrderTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, OrderTypeDto.Serializer.INSTANCE, self.order_type);
            }
            if (self.order_side != OrderSideDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, OrderSideDto.Serializer.INSTANCE, self.order_side);
            }
            if (self.order_trigger != OrderTriggerDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, OrderTriggerDto.Serializer.INSTANCE, self.order_trigger);
            }
            TrailingPegDto trailingPegDto = self.trailing_peg;
            if (trailingPegDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, TrailingPegDto.Serializer.INSTANCE, trailingPegDto);
            }
            boolean z = self.is_preset_percent_limit;
            if (z) {
                output.encodeBooleanElement(serialDesc, 7, z);
            }
            MoneyDto moneyDto = self.limit_price;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            MoneyDto moneyDto2 = self.stop_price;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
        }

        public Surrogate(String ref_id, String rhs_account_number, String instrument_id, OrderTypeDto order_type, OrderSideDto order_side, OrderTriggerDto order_trigger, TrailingPegDto trailingPegDto, boolean z, MoneyDto moneyDto, MoneyDto moneyDto2) {
            Intrinsics.checkNotNullParameter(ref_id, "ref_id");
            Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
            Intrinsics.checkNotNullParameter(order_type, "order_type");
            Intrinsics.checkNotNullParameter(order_side, "order_side");
            Intrinsics.checkNotNullParameter(order_trigger, "order_trigger");
            this.ref_id = ref_id;
            this.rhs_account_number = rhs_account_number;
            this.instrument_id = instrument_id;
            this.order_type = order_type;
            this.order_side = order_side;
            this.order_trigger = order_trigger;
            this.trailing_peg = trailingPegDto;
            this.is_preset_percent_limit = z;
            this.limit_price = moneyDto;
            this.stop_price = moneyDto2;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, OrderTypeDto orderTypeDto, OrderSideDto orderSideDto, OrderTriggerDto orderTriggerDto, TrailingPegDto trailingPegDto, boolean z, MoneyDto moneyDto, MoneyDto moneyDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? OrderTypeDto.INSTANCE.getZeroValue() : orderTypeDto, (i & 16) != 0 ? OrderSideDto.INSTANCE.getZeroValue() : orderSideDto, (i & 32) != 0 ? OrderTriggerDto.INSTANCE.getZeroValue() : orderTriggerDto, (i & 64) != 0 ? null : trailingPegDto, (i & 128) != 0 ? false : z, (i & 256) != 0 ? null : moneyDto, (i & 512) != 0 ? null : moneyDto2);
        }

        public final String getRef_id() {
            return this.ref_id;
        }

        public final String getRhs_account_number() {
            return this.rhs_account_number;
        }

        public final String getInstrument_id() {
            return this.instrument_id;
        }

        public final OrderTypeDto getOrder_type() {
            return this.order_type;
        }

        public final OrderSideDto getOrder_side() {
            return this.order_side;
        }

        public final OrderTriggerDto getOrder_trigger() {
            return this.order_trigger;
        }

        public final TrailingPegDto getTrailing_peg() {
            return this.trailing_peg;
        }

        /* renamed from: is_preset_percent_limit, reason: from getter */
        public final boolean getIs_preset_percent_limit() {
            return this.is_preset_percent_limit;
        }

        public final MoneyDto getLimit_price() {
            return this.limit_price;
        }

        public final MoneyDto getStop_price() {
            return this.stop_price;
        }
    }

    /* compiled from: StreamOrderContextResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/equity_order_context/proto/v1/StreamOrderContextResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/equity_order_context/proto/v1/StreamOrderContextResponseDto;", "Lmicrogram/contracts/equity_order_context/proto/v1/StreamOrderContextResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/equity_order_context/proto/v1/StreamOrderContextResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "equity_order_context.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<StreamOrderContextResponseDto, StreamOrderContextResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StreamOrderContextResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamOrderContextResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamOrderContextResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) StreamOrderContextResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<StreamOrderContextResponse> getProtoAdapter() {
            return StreamOrderContextResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamOrderContextResponseDto getZeroValue() {
            return StreamOrderContextResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamOrderContextResponseDto fromProto(StreamOrderContextResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String ref_id = proto.getRef_id();
            String rhs_account_number = proto.getRhs_account_number();
            String instrument_id = proto.getInstrument_id();
            OrderTypeDto orderTypeDtoFromProto = OrderTypeDto.INSTANCE.fromProto(proto.getOrder_type());
            OrderSideDto orderSideDtoFromProto = OrderSideDto.INSTANCE.fromProto(proto.getOrder_side());
            OrderTriggerDto orderTriggerDtoFromProto = OrderTriggerDto.INSTANCE.fromProto(proto.getOrder_trigger());
            TrailingPeg trailing_peg = proto.getTrailing_peg();
            DefaultConstructorMarker defaultConstructorMarker = null;
            TrailingPegDto trailingPegDtoFromProto = trailing_peg != null ? TrailingPegDto.INSTANCE.fromProto(trailing_peg) : null;
            boolean is_preset_percent_limit = proto.getIs_preset_percent_limit();
            Money limit_price = proto.getLimit_price();
            MoneyDto moneyDtoFromProto = limit_price != null ? MoneyDto.INSTANCE.fromProto(limit_price) : null;
            Money stop_price = proto.getStop_price();
            return new StreamOrderContextResponseDto(new Surrogate(ref_id, rhs_account_number, instrument_id, orderTypeDtoFromProto, orderSideDtoFromProto, orderTriggerDtoFromProto, trailingPegDtoFromProto, is_preset_percent_limit, moneyDtoFromProto, stop_price != null ? MoneyDto.INSTANCE.fromProto(stop_price) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.equity_order_context.proto.v1.StreamOrderContextResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StreamOrderContextResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new StreamOrderContextResponseDto(null, null, null, null, null, null, null, false, null, null, 1023, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: StreamOrderContextResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/equity_order_context/proto/v1/StreamOrderContextResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/equity_order_context/proto/v1/StreamOrderContextResponseDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/equity_order_context/proto/v1/StreamOrderContextResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "equity_order_context.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes14.dex */
    public static final class Serializer implements KSerializer<StreamOrderContextResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.equity_order_context.proto.v1.StreamOrderContextResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, StreamOrderContextResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public StreamOrderContextResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new StreamOrderContextResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: StreamOrderContextResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/equity_order_context/proto/v1/StreamOrderContextResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "equity_order_context.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "microgram.contracts.equity_order_context.proto.v1.StreamOrderContextResponseDto";
        }
    }
}
