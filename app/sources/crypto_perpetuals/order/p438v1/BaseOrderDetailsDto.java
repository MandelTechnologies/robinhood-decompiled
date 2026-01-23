package crypto_perpetuals.order.p438v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.options.comboorders.detail.components.topbar.ComboOrderDetailTopbarComposable5;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.squareup.wire.ProtoAdapter;
import crypto_perpetuals.common.p435v1.MarginMode;
import crypto_perpetuals.common.p435v1.MarginModeDto;
import crypto_perpetuals.common.p435v1.Side;
import crypto_perpetuals.common.p435v1.SideDto;
import crypto_perpetuals.order.p438v1.OrderFeesDto;
import crypto_perpetuals.order.p438v1.OrderPriceDto;
import crypto_perpetuals.order.p438v1.OrderStatusDto;
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
import p479j$.time.Instant;

/* compiled from: BaseOrderDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b!\b\u0007\u0018\u0000 Q2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004RQSTB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bå\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\f\u0012\b\b\u0002\u0010\u0018\u001a\u00020\f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\f\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u001b\u001a\u00020\f\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001d\u0012\u0010\b\u0002\u0010\u001f\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001d\u0012\b\b\u0002\u0010!\u001a\u00020 \u0012\b\b\u0002\u0010\"\u001a\u00020 \u0012\b\b\u0002\u0010#\u001a\u00020 \u0012\u0010\b\u0002\u0010$\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001d¢\u0006\u0004\b\u0006\u0010%J\u000f\u0010&\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020 2\b\u0010+\u001a\u0004\u0018\u00010*H\u0096\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u001f\u00105\u001a\u0002042\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020.H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020.H\u0016¢\u0006\u0004\b7\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00108R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b9\u0010)R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0011\u0010\u0010\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b@\u0010)R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0011\u0010\u0014\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0011\u0010\u0017\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bG\u0010=R\u0011\u0010\u0018\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bH\u0010=R\u0011\u0010\u0019\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bI\u0010=R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bJ\u0010=R\u0011\u0010\u001b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bK\u0010=R\u0019\u0010\u001e\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001d8F¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0019\u0010\u001f\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001d8F¢\u0006\u0006\u001a\u0004\bN\u0010MR\u0011\u0010!\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010OR\u0011\u0010\"\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b\"\u0010OR\u0011\u0010#\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b#\u0010OR\u0019\u0010$\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001d8F¢\u0006\u0006\u001a\u0004\bP\u0010M¨\u0006U"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/BaseOrderDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcrypto_perpetuals/order/v1/BaseOrderDetails;", "Landroid/os/Parcelable;", "Lcrypto_perpetuals/order/v1/BaseOrderDetailsDto$Surrogate;", "surrogate", "<init>", "(Lcrypto_perpetuals/order/v1/BaseOrderDetailsDto$Surrogate;)V", "", "order_id", "Lcrypto_perpetuals/order/v1/OrderStatusDto;", ComboOrderDetailTopbarComposable5.ORDER_STATUS, "Lcom/robinhood/idl/IdlDecimal;", "leverage", "Lcrypto_perpetuals/common/v1/MarginModeDto;", "margin_mode", "contract_id", "Lcrypto_perpetuals/order/v1/OrderFeesDto;", "estimated_fees", "Lcrypto_perpetuals/common/v1/SideDto;", "order_side", "Lcrypto_perpetuals/order/v1/OrderPriceDto;", "estimated_order_price", "estimated_total_contract_quantity", "estimated_total_notional_amount", "executed_notional", "average_executed_price", "executed_quantity", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "updated_at", "", "is_liquidation_order", "is_close_position_order", "is_cancelable", "last_transaction_at", "(Ljava/lang/String;Lcrypto_perpetuals/order/v1/OrderStatusDto;Lcom/robinhood/idl/IdlDecimal;Lcrypto_perpetuals/common/v1/MarginModeDto;Ljava/lang/String;Lcrypto_perpetuals/order/v1/OrderFeesDto;Lcrypto_perpetuals/common/v1/SideDto;Lcrypto_perpetuals/order/v1/OrderPriceDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Lj$/time/Instant;ZZZLj$/time/Instant;)V", "toProto", "()Lcrypto_perpetuals/order/v1/BaseOrderDetails;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcrypto_perpetuals/order/v1/BaseOrderDetailsDto$Surrogate;", "getOrder_id", "getOrder_status", "()Lcrypto_perpetuals/order/v1/OrderStatusDto;", "getLeverage", "()Lcom/robinhood/idl/IdlDecimal;", "getMargin_mode", "()Lcrypto_perpetuals/common/v1/MarginModeDto;", "getContract_id", "getEstimated_fees", "()Lcrypto_perpetuals/order/v1/OrderFeesDto;", "getOrder_side", "()Lcrypto_perpetuals/common/v1/SideDto;", "getEstimated_order_price", "()Lcrypto_perpetuals/order/v1/OrderPriceDto;", "getEstimated_total_contract_quantity", "getEstimated_total_notional_amount", "getExecuted_notional", "getAverage_executed_price", "getExecuted_quantity", "getCreated_at", "()Lj$/time/Instant;", "getUpdated_at", "()Z", "getLast_transaction_at", "Companion", "Surrogate", "Serializer", "MultibindingModule", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class BaseOrderDetailsDto implements Dto3<BaseOrderDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<BaseOrderDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<BaseOrderDetailsDto, BaseOrderDetails>> binaryBase64Serializer$delegate;
    private static final BaseOrderDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ BaseOrderDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private BaseOrderDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getOrder_id() {
        return this.surrogate.getOrder_id();
    }

    public final OrderStatusDto getOrder_status() {
        return this.surrogate.getOrder_status();
    }

    public final IdlDecimal getLeverage() {
        return this.surrogate.getLeverage();
    }

    public final MarginModeDto getMargin_mode() {
        return this.surrogate.getMargin_mode();
    }

    public final String getContract_id() {
        return this.surrogate.getContract_id();
    }

    public final OrderFeesDto getEstimated_fees() {
        return this.surrogate.getEstimated_fees();
    }

    public final SideDto getOrder_side() {
        return this.surrogate.getOrder_side();
    }

    public final OrderPriceDto getEstimated_order_price() {
        return this.surrogate.getEstimated_order_price();
    }

    public final IdlDecimal getEstimated_total_contract_quantity() {
        return this.surrogate.getEstimated_total_contract_quantity();
    }

    public final IdlDecimal getEstimated_total_notional_amount() {
        return this.surrogate.getEstimated_total_notional_amount();
    }

    public final IdlDecimal getExecuted_notional() {
        return this.surrogate.getExecuted_notional();
    }

    public final IdlDecimal getAverage_executed_price() {
        return this.surrogate.getAverage_executed_price();
    }

    public final IdlDecimal getExecuted_quantity() {
        return this.surrogate.getExecuted_quantity();
    }

    public final Instant getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    public final Instant getUpdated_at() {
        return this.surrogate.getUpdated_at();
    }

    public final boolean is_liquidation_order() {
        return this.surrogate.getIs_liquidation_order();
    }

    public final boolean is_close_position_order() {
        return this.surrogate.getIs_close_position_order();
    }

    public final boolean is_cancelable() {
        return this.surrogate.getIs_cancelable();
    }

    public final Instant getLast_transaction_at() {
        return this.surrogate.getLast_transaction_at();
    }

    public /* synthetic */ BaseOrderDetailsDto(String str, OrderStatusDto orderStatusDto, IdlDecimal idlDecimal, MarginModeDto marginModeDto, String str2, OrderFeesDto orderFeesDto, SideDto sideDto, OrderPriceDto orderPriceDto, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, IdlDecimal idlDecimal6, Instant instant, Instant instant2, boolean z, boolean z2, boolean z3, Instant instant3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? OrderStatusDto.INSTANCE.getZeroValue() : orderStatusDto, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal, (i & 8) != 0 ? MarginModeDto.INSTANCE.getZeroValue() : marginModeDto, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? null : orderFeesDto, (i & 64) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i & 128) != 0 ? null : orderPriceDto, (i & 256) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 512) != 0 ? new IdlDecimal("") : idlDecimal3, (i & 1024) != 0 ? new IdlDecimal("") : idlDecimal4, (i & 2048) != 0 ? null : idlDecimal5, (i & 4096) != 0 ? new IdlDecimal("") : idlDecimal6, (i & 8192) != 0 ? null : instant, (i & 16384) != 0 ? null : instant2, (i & 32768) != 0 ? false : z, (i & 65536) != 0 ? false : z2, (i & 131072) == 0 ? z3 : false, (i & 262144) != 0 ? null : instant3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseOrderDetailsDto(String order_id, OrderStatusDto order_status, IdlDecimal leverage, MarginModeDto margin_mode, String contract_id, OrderFeesDto orderFeesDto, SideDto order_side, OrderPriceDto orderPriceDto, IdlDecimal estimated_total_contract_quantity, IdlDecimal estimated_total_notional_amount, IdlDecimal executed_notional, IdlDecimal idlDecimal, IdlDecimal executed_quantity, Instant instant, Instant instant2, boolean z, boolean z2, boolean z3, Instant instant3) {
        this(new Surrogate(order_id, order_status, leverage, margin_mode, contract_id, orderFeesDto, order_side, orderPriceDto, estimated_total_contract_quantity, estimated_total_notional_amount, executed_notional, idlDecimal, executed_quantity, instant, instant2, z, z2, z3, instant3));
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(order_status, "order_status");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(estimated_total_contract_quantity, "estimated_total_contract_quantity");
        Intrinsics.checkNotNullParameter(estimated_total_notional_amount, "estimated_total_notional_amount");
        Intrinsics.checkNotNullParameter(executed_notional, "executed_notional");
        Intrinsics.checkNotNullParameter(executed_quantity, "executed_quantity");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public BaseOrderDetails toProto() {
        String order_id = this.surrogate.getOrder_id();
        OrderStatus orderStatus = (OrderStatus) this.surrogate.getOrder_status().toProto();
        String stringValue = this.surrogate.getLeverage().getStringValue();
        MarginMode marginMode = (MarginMode) this.surrogate.getMargin_mode().toProto();
        String contract_id = this.surrogate.getContract_id();
        OrderFeesDto estimated_fees = this.surrogate.getEstimated_fees();
        OrderFees proto = estimated_fees != null ? estimated_fees.toProto() : null;
        Side side = (Side) this.surrogate.getOrder_side().toProto();
        OrderPriceDto estimated_order_price = this.surrogate.getEstimated_order_price();
        OrderPrice proto2 = estimated_order_price != null ? estimated_order_price.toProto() : null;
        String stringValue2 = this.surrogate.getEstimated_total_contract_quantity().getStringValue();
        String stringValue3 = this.surrogate.getEstimated_total_notional_amount().getStringValue();
        String stringValue4 = this.surrogate.getExecuted_notional().getStringValue();
        IdlDecimal average_executed_price = this.surrogate.getAverage_executed_price();
        return new BaseOrderDetails(order_id, orderStatus, stringValue, marginMode, contract_id, proto, side, proto2, stringValue2, stringValue3, stringValue4, average_executed_price != null ? average_executed_price.getStringValue() : null, this.surrogate.getExecuted_quantity().getStringValue(), this.surrogate.getCreated_at(), this.surrogate.getUpdated_at(), this.surrogate.getIs_liquidation_order(), this.surrogate.getIs_close_position_order(), this.surrogate.getIs_cancelable(), this.surrogate.getLast_transaction_at(), null, 524288, null);
    }

    public String toString() {
        return "[BaseOrderDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof BaseOrderDetailsDto) && Intrinsics.areEqual(((BaseOrderDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: BaseOrderDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\bB\b\u0083\b\u0018\u0000 o2\u00020\u0001:\u0002poB\u0097\u0003\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0017\b\u0002\u0010\n\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0017\b\u0002\u0010\u0014\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0017\b\u0002\u0010\u0015\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0017\b\u0002\u0010\u0016\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0019\b\u0002\u0010\u0017\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0017\b\u0002\u0010\u0018\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012.\b\u0002\u0010\u001c\u001a(\u0018\u00010\u0019j\u0013\u0018\u0001`\u001a¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u001b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u001b\u0012.\b\u0002\u0010\u001d\u001a(\u0018\u00010\u0019j\u0013\u0018\u0001`\u001a¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u001b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u001b\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u001e\u0012\b\b\u0002\u0010!\u001a\u00020\u001e\u0012.\b\u0002\u0010\"\u001a(\u0018\u00010\u0019j\u0013\u0018\u0001`\u001a¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u001b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u001b¢\u0006\u0004\b#\u0010$BÓ\u0001\b\u0010\u0012\u0006\u0010&\u001a\u00020%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b#\u0010)J'\u00102\u001a\u00020/2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b0\u00101J\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020%HÖ\u0001¢\u0006\u0004\b5\u00106J\u001a\u00108\u001a\u00020\u001e2\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b8\u00109R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010:\u0012\u0004\b<\u0010=\u001a\u0004\b;\u00104R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010>\u0012\u0004\bA\u0010=\u001a\u0004\b?\u0010@R/\u0010\n\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010B\u0012\u0004\bE\u0010=\u001a\u0004\bC\u0010DR \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010F\u0012\u0004\bI\u0010=\u001a\u0004\bG\u0010HR \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010:\u0012\u0004\bK\u0010=\u001a\u0004\bJ\u00104R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010L\u0012\u0004\bO\u0010=\u001a\u0004\bM\u0010NR \u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010P\u0012\u0004\bS\u0010=\u001a\u0004\bQ\u0010RR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010T\u0012\u0004\bW\u0010=\u001a\u0004\bU\u0010VR/\u0010\u0014\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010B\u0012\u0004\bY\u0010=\u001a\u0004\bX\u0010DR/\u0010\u0015\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010B\u0012\u0004\b[\u0010=\u001a\u0004\bZ\u0010DR/\u0010\u0016\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010B\u0012\u0004\b]\u0010=\u001a\u0004\b\\\u0010DR1\u0010\u0017\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010B\u0012\u0004\b_\u0010=\u001a\u0004\b^\u0010DR/\u0010\u0018\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010B\u0012\u0004\ba\u0010=\u001a\u0004\b`\u0010DRF\u0010\u001c\u001a(\u0018\u00010\u0019j\u0013\u0018\u0001`\u001a¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u001b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u001b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010b\u0012\u0004\be\u0010=\u001a\u0004\bc\u0010dRF\u0010\u001d\u001a(\u0018\u00010\u0019j\u0013\u0018\u0001`\u001a¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u001b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u001b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010b\u0012\u0004\bg\u0010=\u001a\u0004\bf\u0010dR \u0010\u001f\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010h\u0012\u0004\bj\u0010=\u001a\u0004\b\u001f\u0010iR \u0010 \u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010h\u0012\u0004\bk\u0010=\u001a\u0004\b \u0010iR \u0010!\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010h\u0012\u0004\bl\u0010=\u001a\u0004\b!\u0010iRF\u0010\"\u001a(\u0018\u00010\u0019j\u0013\u0018\u0001`\u001a¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u001b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u001b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010b\u0012\u0004\bn\u0010=\u001a\u0004\bm\u0010d¨\u0006q"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/BaseOrderDetailsDto$Surrogate;", "", "", "order_id", "Lcrypto_perpetuals/order/v1/OrderStatusDto;", ComboOrderDetailTopbarComposable5.ORDER_STATUS, "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "leverage", "Lcrypto_perpetuals/common/v1/MarginModeDto;", "margin_mode", "contract_id", "Lcrypto_perpetuals/order/v1/OrderFeesDto;", "estimated_fees", "Lcrypto_perpetuals/common/v1/SideDto;", "order_side", "Lcrypto_perpetuals/order/v1/OrderPriceDto;", "estimated_order_price", "estimated_total_contract_quantity", "estimated_total_notional_amount", "executed_notional", "average_executed_price", "executed_quantity", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "created_at", "updated_at", "", "is_liquidation_order", "is_close_position_order", "is_cancelable", "last_transaction_at", "<init>", "(Ljava/lang/String;Lcrypto_perpetuals/order/v1/OrderStatusDto;Lcom/robinhood/idl/IdlDecimal;Lcrypto_perpetuals/common/v1/MarginModeDto;Ljava/lang/String;Lcrypto_perpetuals/order/v1/OrderFeesDto;Lcrypto_perpetuals/common/v1/SideDto;Lcrypto_perpetuals/order/v1/OrderPriceDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Lj$/time/Instant;ZZZLj$/time/Instant;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcrypto_perpetuals/order/v1/OrderStatusDto;Lcom/robinhood/idl/IdlDecimal;Lcrypto_perpetuals/common/v1/MarginModeDto;Ljava/lang/String;Lcrypto_perpetuals/order/v1/OrderFeesDto;Lcrypto_perpetuals/common/v1/SideDto;Lcrypto_perpetuals/order/v1/OrderPriceDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Lj$/time/Instant;ZZZLj$/time/Instant;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_perpetuals_order_v1_externalRelease", "(Lcrypto_perpetuals/order/v1/BaseOrderDetailsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrder_id", "getOrder_id$annotations", "()V", "Lcrypto_perpetuals/order/v1/OrderStatusDto;", "getOrder_status", "()Lcrypto_perpetuals/order/v1/OrderStatusDto;", "getOrder_status$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getLeverage", "()Lcom/robinhood/idl/IdlDecimal;", "getLeverage$annotations", "Lcrypto_perpetuals/common/v1/MarginModeDto;", "getMargin_mode", "()Lcrypto_perpetuals/common/v1/MarginModeDto;", "getMargin_mode$annotations", "getContract_id", "getContract_id$annotations", "Lcrypto_perpetuals/order/v1/OrderFeesDto;", "getEstimated_fees", "()Lcrypto_perpetuals/order/v1/OrderFeesDto;", "getEstimated_fees$annotations", "Lcrypto_perpetuals/common/v1/SideDto;", "getOrder_side", "()Lcrypto_perpetuals/common/v1/SideDto;", "getOrder_side$annotations", "Lcrypto_perpetuals/order/v1/OrderPriceDto;", "getEstimated_order_price", "()Lcrypto_perpetuals/order/v1/OrderPriceDto;", "getEstimated_order_price$annotations", "getEstimated_total_contract_quantity", "getEstimated_total_contract_quantity$annotations", "getEstimated_total_notional_amount", "getEstimated_total_notional_amount$annotations", "getExecuted_notional", "getExecuted_notional$annotations", "getAverage_executed_price", "getAverage_executed_price$annotations", "getExecuted_quantity", "getExecuted_quantity$annotations", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "getCreated_at$annotations", "getUpdated_at", "getUpdated_at$annotations", "Z", "()Z", "is_liquidation_order$annotations", "is_close_position_order$annotations", "is_cancelable$annotations", "getLast_transaction_at", "getLast_transaction_at$annotations", "Companion", "$serializer", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final IdlDecimal average_executed_price;
        private final String contract_id;
        private final Instant created_at;
        private final OrderFeesDto estimated_fees;
        private final OrderPriceDto estimated_order_price;
        private final IdlDecimal estimated_total_contract_quantity;
        private final IdlDecimal estimated_total_notional_amount;
        private final IdlDecimal executed_notional;
        private final IdlDecimal executed_quantity;
        private final boolean is_cancelable;
        private final boolean is_close_position_order;
        private final boolean is_liquidation_order;
        private final Instant last_transaction_at;
        private final IdlDecimal leverage;
        private final MarginModeDto margin_mode;
        private final String order_id;
        private final SideDto order_side;
        private final OrderStatusDto order_status;
        private final Instant updated_at;

        public Surrogate() {
            this((String) null, (OrderStatusDto) null, (IdlDecimal) null, (MarginModeDto) null, (String) null, (OrderFeesDto) null, (SideDto) null, (OrderPriceDto) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (Instant) null, (Instant) null, false, false, false, (Instant) null, 524287, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.order_id, surrogate.order_id) && this.order_status == surrogate.order_status && Intrinsics.areEqual(this.leverage, surrogate.leverage) && this.margin_mode == surrogate.margin_mode && Intrinsics.areEqual(this.contract_id, surrogate.contract_id) && Intrinsics.areEqual(this.estimated_fees, surrogate.estimated_fees) && this.order_side == surrogate.order_side && Intrinsics.areEqual(this.estimated_order_price, surrogate.estimated_order_price) && Intrinsics.areEqual(this.estimated_total_contract_quantity, surrogate.estimated_total_contract_quantity) && Intrinsics.areEqual(this.estimated_total_notional_amount, surrogate.estimated_total_notional_amount) && Intrinsics.areEqual(this.executed_notional, surrogate.executed_notional) && Intrinsics.areEqual(this.average_executed_price, surrogate.average_executed_price) && Intrinsics.areEqual(this.executed_quantity, surrogate.executed_quantity) && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.updated_at, surrogate.updated_at) && this.is_liquidation_order == surrogate.is_liquidation_order && this.is_close_position_order == surrogate.is_close_position_order && this.is_cancelable == surrogate.is_cancelable && Intrinsics.areEqual(this.last_transaction_at, surrogate.last_transaction_at);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.order_id.hashCode() * 31) + this.order_status.hashCode()) * 31) + this.leverage.hashCode()) * 31) + this.margin_mode.hashCode()) * 31) + this.contract_id.hashCode()) * 31;
            OrderFeesDto orderFeesDto = this.estimated_fees;
            int iHashCode2 = (((iHashCode + (orderFeesDto == null ? 0 : orderFeesDto.hashCode())) * 31) + this.order_side.hashCode()) * 31;
            OrderPriceDto orderPriceDto = this.estimated_order_price;
            int iHashCode3 = (((((((iHashCode2 + (orderPriceDto == null ? 0 : orderPriceDto.hashCode())) * 31) + this.estimated_total_contract_quantity.hashCode()) * 31) + this.estimated_total_notional_amount.hashCode()) * 31) + this.executed_notional.hashCode()) * 31;
            IdlDecimal idlDecimal = this.average_executed_price;
            int iHashCode4 = (((iHashCode3 + (idlDecimal == null ? 0 : idlDecimal.hashCode())) * 31) + this.executed_quantity.hashCode()) * 31;
            Instant instant = this.created_at;
            int iHashCode5 = (iHashCode4 + (instant == null ? 0 : instant.hashCode())) * 31;
            Instant instant2 = this.updated_at;
            int iHashCode6 = (((((((iHashCode5 + (instant2 == null ? 0 : instant2.hashCode())) * 31) + Boolean.hashCode(this.is_liquidation_order)) * 31) + Boolean.hashCode(this.is_close_position_order)) * 31) + Boolean.hashCode(this.is_cancelable)) * 31;
            Instant instant3 = this.last_transaction_at;
            return iHashCode6 + (instant3 != null ? instant3.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(order_id=" + this.order_id + ", order_status=" + this.order_status + ", leverage=" + this.leverage + ", margin_mode=" + this.margin_mode + ", contract_id=" + this.contract_id + ", estimated_fees=" + this.estimated_fees + ", order_side=" + this.order_side + ", estimated_order_price=" + this.estimated_order_price + ", estimated_total_contract_quantity=" + this.estimated_total_contract_quantity + ", estimated_total_notional_amount=" + this.estimated_total_notional_amount + ", executed_notional=" + this.executed_notional + ", average_executed_price=" + this.average_executed_price + ", executed_quantity=" + this.executed_quantity + ", created_at=" + this.created_at + ", updated_at=" + this.updated_at + ", is_liquidation_order=" + this.is_liquidation_order + ", is_close_position_order=" + this.is_close_position_order + ", is_cancelable=" + this.is_cancelable + ", last_transaction_at=" + this.last_transaction_at + ")";
        }

        /* compiled from: BaseOrderDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/BaseOrderDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/order/v1/BaseOrderDetailsDto$Surrogate;", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return BaseOrderDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, OrderStatusDto orderStatusDto, IdlDecimal idlDecimal, MarginModeDto marginModeDto, String str2, OrderFeesDto orderFeesDto, SideDto sideDto, OrderPriceDto orderPriceDto, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, IdlDecimal idlDecimal6, Instant instant, Instant instant2, boolean z, boolean z2, boolean z3, Instant instant3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.order_id = "";
            } else {
                this.order_id = str;
            }
            if ((i & 2) == 0) {
                this.order_status = OrderStatusDto.INSTANCE.getZeroValue();
            } else {
                this.order_status = orderStatusDto;
            }
            if ((i & 4) == 0) {
                this.leverage = new IdlDecimal("");
            } else {
                this.leverage = idlDecimal;
            }
            if ((i & 8) == 0) {
                this.margin_mode = MarginModeDto.INSTANCE.getZeroValue();
            } else {
                this.margin_mode = marginModeDto;
            }
            if ((i & 16) == 0) {
                this.contract_id = "";
            } else {
                this.contract_id = str2;
            }
            if ((i & 32) == 0) {
                this.estimated_fees = null;
            } else {
                this.estimated_fees = orderFeesDto;
            }
            if ((i & 64) == 0) {
                this.order_side = SideDto.INSTANCE.getZeroValue();
            } else {
                this.order_side = sideDto;
            }
            if ((i & 128) == 0) {
                this.estimated_order_price = null;
            } else {
                this.estimated_order_price = orderPriceDto;
            }
            if ((i & 256) == 0) {
                this.estimated_total_contract_quantity = new IdlDecimal("");
            } else {
                this.estimated_total_contract_quantity = idlDecimal2;
            }
            if ((i & 512) == 0) {
                this.estimated_total_notional_amount = new IdlDecimal("");
            } else {
                this.estimated_total_notional_amount = idlDecimal3;
            }
            if ((i & 1024) == 0) {
                this.executed_notional = new IdlDecimal("");
            } else {
                this.executed_notional = idlDecimal4;
            }
            if ((i & 2048) == 0) {
                this.average_executed_price = null;
            } else {
                this.average_executed_price = idlDecimal5;
            }
            this.executed_quantity = (i & 4096) == 0 ? new IdlDecimal("") : idlDecimal6;
            if ((i & 8192) == 0) {
                this.created_at = null;
            } else {
                this.created_at = instant;
            }
            if ((i & 16384) == 0) {
                this.updated_at = null;
            } else {
                this.updated_at = instant2;
            }
            if ((32768 & i) == 0) {
                this.is_liquidation_order = false;
            } else {
                this.is_liquidation_order = z;
            }
            if ((65536 & i) == 0) {
                this.is_close_position_order = false;
            } else {
                this.is_close_position_order = z2;
            }
            if ((131072 & i) == 0) {
                this.is_cancelable = false;
            } else {
                this.is_cancelable = z3;
            }
            if ((i & 262144) == 0) {
                this.last_transaction_at = null;
            } else {
                this.last_transaction_at = instant3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$crypto_perpetuals_order_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.order_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.order_id);
            }
            if (self.order_status != OrderStatusDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, OrderStatusDto.Serializer.INSTANCE, self.order_status);
            }
            if (!Intrinsics.areEqual(self.leverage, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 2, IdlDecimalSerializer.INSTANCE, self.leverage);
            }
            if (self.margin_mode != MarginModeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, MarginModeDto.Serializer.INSTANCE, self.margin_mode);
            }
            if (!Intrinsics.areEqual(self.contract_id, "")) {
                output.encodeStringElement(serialDesc, 4, self.contract_id);
            }
            OrderFeesDto orderFeesDto = self.estimated_fees;
            if (orderFeesDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, OrderFeesDto.Serializer.INSTANCE, orderFeesDto);
            }
            if (self.order_side != SideDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, SideDto.Serializer.INSTANCE, self.order_side);
            }
            OrderPriceDto orderPriceDto = self.estimated_order_price;
            if (orderPriceDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, OrderPriceDto.Serializer.INSTANCE, orderPriceDto);
            }
            if (!Intrinsics.areEqual(self.estimated_total_contract_quantity, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 8, IdlDecimalSerializer.INSTANCE, self.estimated_total_contract_quantity);
            }
            if (!Intrinsics.areEqual(self.estimated_total_notional_amount, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 9, IdlDecimalSerializer.INSTANCE, self.estimated_total_notional_amount);
            }
            if (!Intrinsics.areEqual(self.executed_notional, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 10, IdlDecimalSerializer.INSTANCE, self.executed_notional);
            }
            IdlDecimal idlDecimal = self.average_executed_price;
            if (idlDecimal != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, IdlDecimalSerializer.INSTANCE, idlDecimal);
            }
            if (!Intrinsics.areEqual(self.executed_quantity, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 12, IdlDecimalSerializer.INSTANCE, self.executed_quantity);
            }
            Instant instant = self.created_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, WireInstantSerializer.INSTANCE, instant);
            }
            Instant instant2 = self.updated_at;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, WireInstantSerializer.INSTANCE, instant2);
            }
            boolean z = self.is_liquidation_order;
            if (z) {
                output.encodeBooleanElement(serialDesc, 15, z);
            }
            boolean z2 = self.is_close_position_order;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 16, z2);
            }
            boolean z3 = self.is_cancelable;
            if (z3) {
                output.encodeBooleanElement(serialDesc, 17, z3);
            }
            Instant instant3 = self.last_transaction_at;
            if (instant3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 18, WireInstantSerializer.INSTANCE, instant3);
            }
        }

        public Surrogate(String order_id, OrderStatusDto order_status, IdlDecimal leverage, MarginModeDto margin_mode, String contract_id, OrderFeesDto orderFeesDto, SideDto order_side, OrderPriceDto orderPriceDto, IdlDecimal estimated_total_contract_quantity, IdlDecimal estimated_total_notional_amount, IdlDecimal executed_notional, IdlDecimal idlDecimal, IdlDecimal executed_quantity, Instant instant, Instant instant2, boolean z, boolean z2, boolean z3, Instant instant3) {
            Intrinsics.checkNotNullParameter(order_id, "order_id");
            Intrinsics.checkNotNullParameter(order_status, "order_status");
            Intrinsics.checkNotNullParameter(leverage, "leverage");
            Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
            Intrinsics.checkNotNullParameter(order_side, "order_side");
            Intrinsics.checkNotNullParameter(estimated_total_contract_quantity, "estimated_total_contract_quantity");
            Intrinsics.checkNotNullParameter(estimated_total_notional_amount, "estimated_total_notional_amount");
            Intrinsics.checkNotNullParameter(executed_notional, "executed_notional");
            Intrinsics.checkNotNullParameter(executed_quantity, "executed_quantity");
            this.order_id = order_id;
            this.order_status = order_status;
            this.leverage = leverage;
            this.margin_mode = margin_mode;
            this.contract_id = contract_id;
            this.estimated_fees = orderFeesDto;
            this.order_side = order_side;
            this.estimated_order_price = orderPriceDto;
            this.estimated_total_contract_quantity = estimated_total_contract_quantity;
            this.estimated_total_notional_amount = estimated_total_notional_amount;
            this.executed_notional = executed_notional;
            this.average_executed_price = idlDecimal;
            this.executed_quantity = executed_quantity;
            this.created_at = instant;
            this.updated_at = instant2;
            this.is_liquidation_order = z;
            this.is_close_position_order = z2;
            this.is_cancelable = z3;
            this.last_transaction_at = instant3;
        }

        public /* synthetic */ Surrogate(String str, OrderStatusDto orderStatusDto, IdlDecimal idlDecimal, MarginModeDto marginModeDto, String str2, OrderFeesDto orderFeesDto, SideDto sideDto, OrderPriceDto orderPriceDto, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, IdlDecimal idlDecimal6, Instant instant, Instant instant2, boolean z, boolean z2, boolean z3, Instant instant3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? OrderStatusDto.INSTANCE.getZeroValue() : orderStatusDto, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal, (i & 8) != 0 ? MarginModeDto.INSTANCE.getZeroValue() : marginModeDto, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? null : orderFeesDto, (i & 64) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i & 128) != 0 ? null : orderPriceDto, (i & 256) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 512) != 0 ? new IdlDecimal("") : idlDecimal3, (i & 1024) != 0 ? new IdlDecimal("") : idlDecimal4, (i & 2048) != 0 ? null : idlDecimal5, (i & 4096) != 0 ? new IdlDecimal("") : idlDecimal6, (i & 8192) != 0 ? null : instant, (i & 16384) != 0 ? null : instant2, (i & 32768) != 0 ? false : z, (i & 65536) != 0 ? false : z2, (i & 131072) == 0 ? z3 : false, (i & 262144) != 0 ? null : instant3);
        }

        public final String getOrder_id() {
            return this.order_id;
        }

        public final OrderStatusDto getOrder_status() {
            return this.order_status;
        }

        public final IdlDecimal getLeverage() {
            return this.leverage;
        }

        public final MarginModeDto getMargin_mode() {
            return this.margin_mode;
        }

        public final String getContract_id() {
            return this.contract_id;
        }

        public final OrderFeesDto getEstimated_fees() {
            return this.estimated_fees;
        }

        public final SideDto getOrder_side() {
            return this.order_side;
        }

        public final OrderPriceDto getEstimated_order_price() {
            return this.estimated_order_price;
        }

        public final IdlDecimal getEstimated_total_contract_quantity() {
            return this.estimated_total_contract_quantity;
        }

        public final IdlDecimal getEstimated_total_notional_amount() {
            return this.estimated_total_notional_amount;
        }

        public final IdlDecimal getExecuted_notional() {
            return this.executed_notional;
        }

        public final IdlDecimal getAverage_executed_price() {
            return this.average_executed_price;
        }

        public final IdlDecimal getExecuted_quantity() {
            return this.executed_quantity;
        }

        public final Instant getCreated_at() {
            return this.created_at;
        }

        public final Instant getUpdated_at() {
            return this.updated_at;
        }

        /* renamed from: is_liquidation_order, reason: from getter */
        public final boolean getIs_liquidation_order() {
            return this.is_liquidation_order;
        }

        /* renamed from: is_close_position_order, reason: from getter */
        public final boolean getIs_close_position_order() {
            return this.is_close_position_order;
        }

        /* renamed from: is_cancelable, reason: from getter */
        public final boolean getIs_cancelable() {
            return this.is_cancelable;
        }

        public final Instant getLast_transaction_at() {
            return this.last_transaction_at;
        }
    }

    /* compiled from: BaseOrderDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/BaseOrderDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcrypto_perpetuals/order/v1/BaseOrderDetailsDto;", "Lcrypto_perpetuals/order/v1/BaseOrderDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcrypto_perpetuals/order/v1/BaseOrderDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<BaseOrderDetailsDto, BaseOrderDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BaseOrderDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BaseOrderDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BaseOrderDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) BaseOrderDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<BaseOrderDetails> getProtoAdapter() {
            return BaseOrderDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BaseOrderDetailsDto getZeroValue() {
            return BaseOrderDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BaseOrderDetailsDto fromProto(BaseOrderDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String order_id = proto.getOrder_id();
            OrderStatusDto orderStatusDtoFromProto = OrderStatusDto.INSTANCE.fromProto(proto.getOrder_status());
            IdlDecimal idlDecimal = new IdlDecimal(proto.getLeverage());
            MarginModeDto marginModeDtoFromProto = MarginModeDto.INSTANCE.fromProto(proto.getMargin_mode());
            String contract_id = proto.getContract_id();
            OrderFees estimated_fees = proto.getEstimated_fees();
            DefaultConstructorMarker defaultConstructorMarker = null;
            OrderFeesDto orderFeesDtoFromProto = estimated_fees != null ? OrderFeesDto.INSTANCE.fromProto(estimated_fees) : null;
            SideDto sideDtoFromProto = SideDto.INSTANCE.fromProto(proto.getOrder_side());
            OrderPrice estimated_order_price = proto.getEstimated_order_price();
            OrderPriceDto orderPriceDtoFromProto = estimated_order_price != null ? OrderPriceDto.INSTANCE.fromProto(estimated_order_price) : null;
            IdlDecimal idlDecimal2 = new IdlDecimal(proto.getEstimated_total_contract_quantity());
            IdlDecimal idlDecimal3 = new IdlDecimal(proto.getEstimated_total_notional_amount());
            IdlDecimal idlDecimal4 = new IdlDecimal(proto.getExecuted_notional());
            String average_executed_price = proto.getAverage_executed_price();
            return new BaseOrderDetailsDto(new Surrogate(order_id, orderStatusDtoFromProto, idlDecimal, marginModeDtoFromProto, contract_id, orderFeesDtoFromProto, sideDtoFromProto, orderPriceDtoFromProto, idlDecimal2, idlDecimal3, idlDecimal4, average_executed_price != null ? new IdlDecimal(average_executed_price) : null, new IdlDecimal(proto.getExecuted_quantity()), proto.getCreated_at(), proto.getUpdated_at(), proto.getIs_liquidation_order(), proto.getIs_close_position_order(), proto.getIs_cancelable(), proto.getLast_transaction_at()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: crypto_perpetuals.order.v1.BaseOrderDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseOrderDetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new BaseOrderDetailsDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, 524287, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: BaseOrderDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/BaseOrderDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/order/v1/BaseOrderDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcrypto_perpetuals/order/v1/BaseOrderDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes18.dex */
    public static final class Serializer implements KSerializer<BaseOrderDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/crypto_perpetuals.order.v1.BaseOrderDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, BaseOrderDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public BaseOrderDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new BaseOrderDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: BaseOrderDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/BaseOrderDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "crypto_perpetuals.order.v1.BaseOrderDetailsDto";
        }
    }
}
